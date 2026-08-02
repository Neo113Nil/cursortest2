package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.Provider;
import com.google.android.gms.internal.measurement.zzly;
import com.google.android.gms.internal.measurement.zzvu;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.android.gms.internal.measurement.zzws;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class DeliveryDelegate extends BaseObservable {
    public final BackgroundTaskService backgroundTaskService;
    public final CallbackState callbackState;
    public final Provider eventStore;
    public final ImmutableConfig immutableConfig;
    public final Logger logger;
    public final Notifier notifier;

    public DeliveryDelegate(Logger logger, EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$2, ImmutableConfig immutableConfig, CallbackState callbackState, Notifier notifier, BackgroundTaskService backgroundTaskService) {
        this.logger = logger;
        this.eventStore = eventStorageModule$special$$inlined$provider$2;
        this.immutableConfig = immutableConfig;
        this.callbackState = callbackState;
        this.notifier = notifier;
        this.backgroundTaskService = backgroundTaskService;
    }

    public final void cacheEvent(Event event, boolean z) {
        Provider provider = this.eventStore;
        ((EventStore) provider.get()).write(event);
        if (z) {
            ((EventStore) provider.get()).flushAsync();
        }
    }

    public final void deliver(Event event) {
        DeliveryStrategy deliveryStrategy;
        Logger logger = this.logger;
        logger.d("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        EventInternal eventInternal = event.impl;
        Session session = eventInternal.session;
        if (session != null) {
            if (eventInternal.severityReason.unhandled) {
                session.unhandledCount.incrementAndGet();
                eventInternal.session = Session.copySession(session);
                updateState(StateEvent.PauseSession.INSTANCE$2);
            } else {
                session.handledCount.incrementAndGet();
                eventInternal.session = Session.copySession(session);
                updateState(StateEvent.PauseSession.INSTANCE$1);
            }
        }
        eventInternal.getClass();
        SeverityReason severityReason = eventInternal.severityReason;
        BackgroundTaskService.SafeFuture safeFuture = null;
        int i = 0;
        if (severityReason.originalUnhandled) {
            boolean equals = "unhandledPromiseRejection".equals(severityReason.severityReasonType);
            ArrayList arrayList = eventInternal.errors;
            deliveryStrategy = ("ANR".equals(!arrayList.isEmpty() ? ((Error) arrayList.get(0)).impl.errorClass : null) || equals) ? DeliveryStrategy.STORE_AND_FLUSH : DeliveryStrategy.STORE_ONLY;
        } else {
            deliveryStrategy = DeliveryStrategy.SEND_IMMEDIATELY;
        }
        int ordinal = deliveryStrategy.ordinal();
        if (ordinal == 0) {
            cacheEvent(event, false);
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                cacheEvent(event, true);
                return;
            }
            this.callbackState.runOnSendTasks(event, logger);
            try {
                this.backgroundTaskService.submitTask(TaskType.ERROR_REQUEST, new AnonymousClass1(this, new EventPayload(eventInternal.apiKey, event, null, this.notifier, this.immutableConfig), event));
                return;
            } catch (RejectedExecutionException unused) {
                cacheEvent(event, false);
                logger.w("Exceeded max queue count, saving to disk to send later");
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() + 3000;
        EventStore eventStore = (EventStore) this.eventStore.get();
        String write = eventStore.write(event);
        if (write != null) {
            try {
                safeFuture = eventStore.bgTaskService.submitTask(TaskType.ERROR_REQUEST, new EventStore$$ExternalSyntheticLambda1(i, eventStore, write));
            } catch (RejectedExecutionException unused2) {
                eventStore.logger.w("Failed to flush all on-disk errors, retaining unsent errors for later.");
            }
        }
        long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
        if (safeFuture == null || currentTimeMillis2 <= 0) {
            return;
        }
        try {
            safeFuture.get(currentTimeMillis2, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            logger.w("failed to immediately deliver event", e);
        }
        if (safeFuture.delegate.isDone()) {
            return;
        }
        safeFuture.cancel(true);
    }

    /* renamed from: com.bugsnag.android.DeliveryDelegate$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ Object this$0;
        public final /* synthetic */ Object val$finalEvent;
        public final /* synthetic */ Object val$finalEventPayload;

        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, zzws zzwsVar, zzly zzlyVar) {
            this.val$finalEventPayload = ref$ObjectRef;
            this.val$finalEvent = zzwsVar;
            this.this$0 = zzlyVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            Object obj2 = this.val$finalEvent;
            Object obj3 = this.val$finalEventPayload;
            switch (i) {
                case 0:
                    DeliveryDelegate deliveryDelegate = (DeliveryDelegate) obj;
                    EventPayload eventPayload = (EventPayload) obj3;
                    Event event = (Event) obj2;
                    Logger logger = deliveryDelegate.logger;
                    logger.d("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
                    ImmutableConfig immutableConfig = deliveryDelegate.immutableConfig;
                    int ordinal = immutableConfig.delivery.deliver(eventPayload, immutableConfig.getErrorApiDeliveryParams(eventPayload)).ordinal();
                    if (ordinal == 0) {
                        logger.i("Sent 1 new event to Bugsnag");
                        return;
                    }
                    if (ordinal == 1) {
                        logger.w("Could not send event(s) to Bugsnag, saving to disk to send later");
                        deliveryDelegate.cacheEvent(event, false);
                        return;
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        logger.w("Problem sending event to Bugsnag");
                        return;
                    }
                default:
                    if (((Ref$ObjectRef) obj3).element != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                    zzly zzlyVar = (zzly) obj;
                    zzwq zzd = zzvy.zzd();
                    zzws zzc = zzvy.zzc(zzd, (zzws) obj2);
                    try {
                        zzlyVar.run();
                        return;
                    } catch (Throwable th) {
                        try {
                            zzvu.zza(th);
                            throw th;
                        } finally {
                            zzvy.zzc(zzd, zzc);
                        }
                    }
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 1:
                    zzly zzlyVar = (zzly) this.this$0;
                    StringBuilder sb = new StringBuilder(zzlyVar.toString().length() + 14);
                    sb.append("propagating=[");
                    sb.append(zzlyVar);
                    sb.append("]");
                    return sb.toString();
                default:
                    return super.toString();
            }
        }

        public AnonymousClass1(DeliveryDelegate deliveryDelegate, EventPayload eventPayload, Event event) {
            this.this$0 = deliveryDelegate;
            this.val$finalEventPayload = eventPayload;
            this.val$finalEvent = event;
        }
    }
}
