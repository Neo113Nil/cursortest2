package com.bugsnag.android;

import android.app.ActivityManager;
import androidx.room.Room;
import com.bugsnag.android.BugsnagExitInfoPlugin;
import com.bugsnag.android.Client;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.DateUtils;
import com.bugsnag.android.internal.ForegroundDetector;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.Provider;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final class SessionTracker extends BaseObservable {
    public final BackgroundTaskService backgroundTaskService;
    public final CallbackState callbackState;
    public final Client client;
    public final ImmutableConfig configuration;
    public final Logger logger;
    public final Provider sessionStore;
    public final ArrayDeque foregroundActivities = new ArrayDeque();
    public volatile Session currentSession = null;
    public boolean shouldSuppressFirstAutoSession = true;
    public final long timeoutMs = 30000;

    public SessionTracker(ImmutableConfig immutableConfig, CallbackState callbackState, Client client, StorageModule$special$$inlined$provider$1 storageModule$special$$inlined$provider$1, Logger logger, BackgroundTaskService backgroundTaskService) {
        this.configuration = immutableConfig;
        this.callbackState = callbackState;
        this.client = client;
        this.sessionStore = storageModule$special$$inlined$provider$1;
        this.backgroundTaskService = backgroundTaskService;
        this.logger = logger;
    }

    public final DeliveryStatus deliverSessionPayload(Session session) {
        ImmutableConfig immutableConfig = this.configuration;
        String str = immutableConfig.endpoints.sessions;
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("Bugsnag-Payload-Version", "1.0"), new Pair("Bugsnag-Api-Key", session.apiKey), new Pair("Content-Type", "application/json"), new Pair("Bugsnag-Sent-At", DateUtils.toIso8601(new Date())));
        DeliveryParams deliveryParams = immutableConfig.delivery;
        deliveryParams.getClass();
        DeliveryStatus deliver = deliveryParams.deliver(str, Room.serialize(session), Bugsnag.getIntegrityToken(session), mapOf);
        ((Logger) deliveryParams.headers).i("Session API request finished with status " + deliver);
        return deliver;
    }

    public final void flushAsync() {
        try {
            this.backgroundTaskService.submitTask(TaskType.SESSION_REQUEST, new Client.AnonymousClass3(this, 3));
        } catch (RejectedExecutionException e) {
            this.logger.w("Failed to flush session reports", e);
        }
    }

    public final String getContextActivity() {
        String str;
        synchronized (this.foregroundActivities) {
            str = (String) this.foregroundActivities.peekLast();
        }
        return str;
    }

    public final void notifySessionStartObserver(Session session) {
        updateState(new StateEvent.StartSession(session.id, session.handledCount.intValue(), session.unhandledCount.intValue(), DateUtils.toIso8601(session.startedAt)));
    }

    public final void onForegroundStatus(long j, boolean z) {
        if (z && j - ForegroundDetector.lastExitedForegroundMs >= this.timeoutMs && this.configuration.autoTrackSessions) {
            startNewSession(new Date(), ((UserState) this.client.userState.get()).user, true);
        }
        updateState(new StateEvent.UpdateInForeground(z, getContextActivity()));
    }

    public final boolean shouldDiscardSession(boolean z) {
        ImmutableConfig immutableConfig = this.client.immutableConfig;
        if (!z) {
            immutableConfig.getClass();
        } else if (!immutableConfig.autoTrackSessions) {
            return true;
        }
        Session session = this.currentSession;
        if (z && session != null && !session.autoCaptured && this.shouldSuppressFirstAutoSession) {
            this.shouldSuppressFirstAutoSession = false;
            return true;
        }
        if (z) {
            this.shouldSuppressFirstAutoSession = false;
        }
        return false;
    }

    public final Session startNewSession(Date date, User user, boolean z) {
        ActivityManager activityManager;
        if (!shouldDiscardSession(z)) {
            final Session session = new Session(UUID.randomUUID().toString(), date, user, z, this.client.notifier, this.logger, this.configuration.apiKey);
            this.logger.d("SessionTracker#trackSessionIfNeeded() - session captured by Client");
            Client client = this.client;
            AppDataCollector appDataCollector = client.appDataCollector;
            ImmutableConfig immutableConfig = appDataCollector.config;
            session.f942app = new App(appDataCollector.binaryArch, appDataCollector.packageName, appDataCollector.releaseStage, appDataCollector.versionName, null, immutableConfig.buildUuid, immutableConfig.appType, immutableConfig.versionCode);
            session.device = client.deviceDataCollector.generateDevice();
            CallbackState callbackState = this.callbackState;
            Logger logger = this.logger;
            CopyOnWriteArrayList copyOnWriteArrayList = callbackState.onSessionTasks;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    try {
                        Client client2 = ((BugsnagExitInfoPlugin.SessionProcessStateSummaryCallback) ((OnSessionCallback) it.next())).client;
                        try {
                            Object systemService = client2.appContext.getSystemService("activity");
                            systemService.getClass();
                            activityManager = (ActivityManager) systemService;
                        } catch (Exception unused) {
                            activityManager = null;
                        }
                        if (activityManager != null) {
                            client2.bgTaskService.submitTask(TaskType.DEFAULT, new MainActivity$$ExternalSyntheticLambda8(7, activityManager, session));
                        }
                    } catch (Throwable th) {
                        logger.w("OnSessionCallback threw an Exception", th);
                    }
                }
            }
            if (session.tracked.compareAndSet(false, true)) {
                this.currentSession = session;
                notifySessionStartObserver(session);
                try {
                    this.backgroundTaskService.submitTask(TaskType.SESSION_REQUEST, new Runnable() { // from class: com.bugsnag.android.SessionTracker.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Session session2 = session;
                            SessionTracker sessionTracker = SessionTracker.this;
                            Logger logger2 = sessionTracker.logger;
                            try {
                                logger2.d("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
                                int ordinal = sessionTracker.deliverSessionPayload(session2).ordinal();
                                if (ordinal == 0) {
                                    logger2.d("Sent 1 new session to Bugsnag");
                                    return;
                                }
                                if (ordinal == 1) {
                                    logger2.w("Storing session payload for future delivery");
                                    ((SessionStore) sessionTracker.sessionStore.get()).write(session2);
                                } else {
                                    if (ordinal != 2) {
                                        return;
                                    }
                                    logger2.w("Dropping invalid session tracking payload");
                                }
                            } catch (Exception e) {
                                logger2.w("Session tracking payload failed", e);
                            }
                        }
                    });
                } catch (RejectedExecutionException unused2) {
                    ((SessionStore) this.sessionStore.get()).write(session);
                }
                flushAsync();
                return session;
            }
        }
        return null;
    }

    public final void updateContext(String str, boolean z) {
        ArrayDeque arrayDeque = this.foregroundActivities;
        if (z) {
            synchronized (arrayDeque) {
                this.foregroundActivities.add(str);
            }
        } else {
            synchronized (arrayDeque) {
                this.foregroundActivities.removeLastOccurrence(str);
            }
        }
        ContextState contextState = this.client.contextState;
        String contextActivity = getContextActivity();
        if (contextState.automaticContext != "__BUGSNAG_MANUAL_CONTEXT__") {
            contextState.automaticContext = contextActivity;
            contextState.emitObservableEvent();
        }
    }
}
