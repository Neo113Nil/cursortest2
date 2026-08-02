package com.bugsnag.android;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Process;
import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.bugsnag.android.internal.ImmutableConfig;
import com.squareup.cash.storage.RealStorage$temp$1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class BugsnagExitInfoPlugin implements Plugin {
    public List applicationExitInfo = EmptyList.INSTANCE;
    public final ExitInfoPluginConfiguration configuration;
    public InternalHooks internalHooks;

    public final class SessionProcessStateSummaryCallback implements OnSessionCallback {
        public final Client client;

        /* renamed from: $r8$lambda$QPUy4-RVrcc3KS2boevCGyjIyBs, reason: not valid java name */
        public static void m1906$r8$lambda$QPUy4RVrcc3KS2boevCGyjIyBs(ActivityManager activityManager, Session session) {
            try {
                byte[] bytes = session.id.getBytes(Charsets.UTF_8);
                bytes.getClass();
                activityManager.setProcessStateSummary(bytes);
            } catch (Exception unused) {
            }
        }

        public SessionProcessStateSummaryCallback(Client client) {
            this.client = client;
        }
    }

    public BugsnagExitInfoPlugin(ExitInfoPluginConfiguration exitInfoPluginConfiguration) {
        this.configuration = new ExitInfoPluginConfiguration(exitInfoPluginConfiguration.listOpenFds, exitInfoPluginConfiguration.includeLogcat, exitInfoPluginConfiguration.reportUnmatchedANR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.bugsnag.android.TraceEventEnhancer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$synthesizeNewEventsIfRequired(BugsnagExitInfoPlugin bugsnagExitInfoPlugin, ComponentRegistry.Builder builder, TraceEventEnhancer traceEventEnhancer) {
        RealStorage$temp$1 realStorage$temp$1;
        Throwable th;
        Event event;
        Object obj;
        Thread thread;
        InternalHooks internalHooks = bugsnagExitInfoPlugin.internalHooks;
        if (internalHooks == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalHooks");
            throw null;
        }
        RealStorage$temp$1 realStorage$temp$12 = new RealStorage$temp$1(1, internalHooks, InternalHooks.class, "createEmptyANR", "createEmptyANR(J)Lcom/bugsnag/android/Event;", 0, 5);
        boolean z = bugsnagExitInfoPlugin.configuration.reportUnmatchedANR;
        Iterator it = bugsnagExitInfoPlugin.applicationExitInfo.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m = a$$ExternalSyntheticBUOutline0.m(it.next());
            ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState = (ExitInfoPluginStore$PersistentState) builder.lazyFetcherFactories;
            if (exitInfoPluginStore$PersistentState != null) {
                long j = exitInfoPluginStore$PersistentState.timestamp;
                ExitInfoKey exitInfoKey = new ExitInfoKey(m);
                if (!((ExitInfoPluginStore$PersistentState) builder.lazyDecoderFactories).processedExitInfoKeys.contains(exitInfoKey)) {
                    builder.addExitInfoKey(exitInfoKey);
                    ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState2 = (ExitInfoPluginStore$PersistentState) builder.lazyFetcherFactories;
                    if (exitInfoPluginStore$PersistentState2 != null && m.getPid() == exitInfoPluginStore$PersistentState2.pid && m.getTimestamp() > j && m.getReason() == 6) {
                        if (z && (event = (Event) realStorage$temp$12.invoke(Long.valueOf(m.getTimestamp()))) != null) {
                            EventInternal eventInternal = event.impl;
                            event.addMetadata("exitInfo", "Description", m.getDescription());
                            event.addMetadata("exitInfo", "Importance", CodeDescriptionsKt.importanceDescriptionOf(m));
                            long pss = m.getPss();
                            th = null;
                            if (pss > 0) {
                                event.addMetadata("exitInfo", "Proportional Set Size (PSS)", pss + " kB");
                            }
                            long rss = m.getRss();
                            if (rss > 0) {
                                event.addMetadata("exitInfo", "Resident Set Size (RSS)", rss + " kB");
                            }
                            traceEventEnhancer.invoke(event, m);
                            String processName = m.getProcessName();
                            List list = eventInternal.threads;
                            List list2 = list;
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    realStorage$temp$1 = realStorage$temp$12;
                                    obj = null;
                                    break;
                                } else {
                                    obj = it2.next();
                                    realStorage$temp$1 = realStorage$temp$12;
                                    if (Intrinsics.areEqual(((Thread) obj).impl.name, "main")) {
                                        break;
                                    } else {
                                        realStorage$temp$12 = realStorage$temp$1;
                                    }
                                }
                            }
                            Thread thread2 = (Thread) obj;
                            if (thread2 == null) {
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        thread = 0;
                                        break;
                                    } else {
                                        thread = it3.next();
                                        if (Intrinsics.areEqual(((Thread) thread).impl.name, processName)) {
                                            break;
                                        }
                                    }
                                }
                                thread2 = thread;
                                if (thread2 == null) {
                                    thread2 = (Thread) CollectionsKt.firstOrNull(list);
                                }
                            }
                            ErrorInternal errorInternal = new ErrorInternal("ANR", m.getDescription(), new Stacktrace(new ArrayList()), ErrorType.ANDROID);
                            eventInternal.errors.add(new Error(errorInternal, eventInternal.logger));
                            if (thread2 != null) {
                                errorInternal.stacktrace.addAll(thread2.impl.stacktrace);
                            }
                            if (event != null) {
                                builder.addExitInfoKey(new ExitInfoKey(m));
                                InternalHooks internalHooks2 = bugsnagExitInfoPlugin.internalHooks;
                                if (internalHooks2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("internalHooks");
                                    throw th;
                                }
                                internalHooks2.client.deliveryDelegate.deliver(event);
                            }
                            realStorage$temp$12 = realStorage$temp$1;
                        }
                    }
                }
                realStorage$temp$1 = realStorage$temp$12;
                event = null;
                th = null;
                if (event != null) {
                }
                realStorage$temp$12 = realStorage$temp$1;
            }
            realStorage$temp$1 = realStorage$temp$12;
            th = null;
            event = null;
            if (event != null) {
            }
            realStorage$temp$12 = realStorage$temp$1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // com.bugsnag.android.Plugin
    public final void load(Client client) {
        ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState;
        ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState2;
        String readText;
        Integer intOrNull;
        ActivityManager activityManager;
        ActivityManager activityManager2;
        ?? arrayList;
        Logger logger = client.logger;
        this.internalHooks = new InternalHooks(client);
        SessionProcessStateSummaryCallback sessionProcessStateSummaryCallback = new SessionProcessStateSummaryCallback(client);
        CallbackState callbackState = client.callbackState;
        if (callbackState.onSessionTasks.add(sessionProcessStateSummaryCallback)) {
            callbackState.internalMetrics.notifyAddCallback("onSession");
        }
        Context context = client.appContext;
        ExitInfoPluginConfiguration exitInfoPluginConfiguration = this.configuration;
        TraceEventEnhancer traceEventEnhancer = new TraceEventEnhancer(logger, exitInfoPluginConfiguration.listOpenFds, exitInfoPluginConfiguration.includeLogcat);
        ImmutableConfig immutableConfig = client.immutableConfig;
        TraceEventEnhancer traceEventEnhancer2 = new TraceEventEnhancer(logger, immutableConfig.projectPackages);
        File file = new File((File) immutableConfig.persistenceDirectory.getValue(), "bugsnag-exit-reasons");
        Logger logger2 = immutableConfig.logger;
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
        builder.interceptors = file;
        builder.mappers = logger2;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        builder.keyers = reentrantReadWriteLock;
        builder.lazyDecoderFactories = new ExitInfoPluginStore$PersistentState(Process.myPid(), System.currentTimeMillis(), new HashSet());
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            exitInfoPluginStore$PersistentState = ComponentRegistry.Builder.parsePersistentState(new JSONObject(FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8)));
        } catch (Throwable unused) {
            exitInfoPluginStore$PersistentState = null;
        }
        try {
            builder.lazyFetcherFactories = exitInfoPluginStore$PersistentState;
            if (exitInfoPluginStore$PersistentState == null) {
                try {
                    readText = FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8);
                } catch (Throwable unused2) {
                }
                if (readText.length() != 0 && (intOrNull = StringsKt.toIntOrNull(readText)) != null) {
                    exitInfoPluginStore$PersistentState2 = new ExitInfoPluginStore$PersistentState(intOrNull.intValue(), System.currentTimeMillis(), EmptySet.INSTANCE);
                    builder.lazyFetcherFactories = exitInfoPluginStore$PersistentState2;
                }
                exitInfoPluginStore$PersistentState2 = null;
                builder.lazyFetcherFactories = exitInfoPluginStore$PersistentState2;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState3 = (ExitInfoPluginStore$PersistentState) builder.lazyFetcherFactories;
            builder.lazyDecoderFactories = new ExitInfoPluginStore$PersistentState(Process.myPid(), Math.max(currentTimeMillis, exitInfoPluginStore$PersistentState3 != null ? exitInfoPluginStore$PersistentState3.getNewestTimestamp() : 0L), EmptySet.INSTANCE);
            readLock.unlock();
            if (((ExitInfoPluginStore$PersistentState) builder.lazyFetcherFactories) == null) {
                try {
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    activityManager = (ActivityManager) systemService;
                } catch (Exception unused3) {
                    activityManager = null;
                }
                if (activityManager != null) {
                    List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 100);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(historicalProcessExitReasons, 10));
                    Iterator it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new ExitInfoKey(a$$ExternalSyntheticBUOutline0.m(it.next())));
                    }
                    ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState4 = (ExitInfoPluginStore$PersistentState) builder.lazyDecoderFactories;
                    builder.lazyDecoderFactories = new ExitInfoPluginStore$PersistentState(exitInfoPluginStore$PersistentState4.pid, exitInfoPluginStore$PersistentState4.timestamp, SetsKt___SetsKt.plus(exitInfoPluginStore$PersistentState4.processedExitInfoKeys, (Iterable) arrayList2));
                    builder.persist();
                }
            }
            ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState5 = (ExitInfoPluginStore$PersistentState) builder.lazyFetcherFactories;
            if (exitInfoPluginStore$PersistentState5 != null) {
                try {
                    Object systemService2 = context.getSystemService("activity");
                    systemService2.getClass();
                    activityManager2 = (ActivityManager) systemService2;
                } catch (Exception unused4) {
                    activityManager2 = null;
                }
                List<ApplicationExitInfo> historicalProcessExitReasons2 = activityManager2 != null ? activityManager2.getHistoricalProcessExitReasons(context.getPackageName(), 0, 100) : null;
                if (historicalProcessExitReasons2 == null) {
                    historicalProcessExitReasons2 = EmptyList.INSTANCE;
                }
                arrayList = new ArrayList();
                for (Object obj : historicalProcessExitReasons2) {
                    ApplicationExitInfo m = a$$ExternalSyntheticBUOutline0.m(obj);
                    if (m.getTimestamp() > exitInfoPluginStore$PersistentState5.timestamp && !exitInfoPluginStore$PersistentState5.processedExitInfoKeys.contains(new ExitInfoKey(m))) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = EmptyList.INSTANCE;
            }
            List list = arrayList;
            this.applicationExitInfo = list;
            ApplicationExitInfoMatcher applicationExitInfoMatcher = new ApplicationExitInfoMatcher(list, (ExitInfoPluginStore$PersistentState) builder.lazyFetcherFactories);
            callbackState.onSendTasks.add(0, new ExitInfoCallback(list, traceEventEnhancer, traceEventEnhancer2, builder, applicationExitInfoMatcher));
            callbackState.internalMetrics.notifyAddCallback("onSendError");
            if (Intrinsics.areEqual(Application.getProcessName(), context.getPackageName())) {
                InternalHooks internalHooks = this.internalHooks;
                if (internalHooks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalHooks");
                    throw null;
                }
                ((EventStore) internalHooks.client.eventStore.get()).onDiscardEventCallback = new SimpleActor.AnonymousClass1(9, applicationExitInfoMatcher, builder);
                InternalHooks internalHooks2 = this.internalHooks;
                if (internalHooks2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalHooks");
                    throw null;
                }
                ((EventStore) internalHooks2.client.eventStore.get()).onEventStoreEmptyCallback = new BugsnagExitInfoPlugin$configureEventSynthesizer$2(0, this, builder, traceEventEnhancer2);
            }
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // com.bugsnag.android.Plugin
    public final void unload() {
    }
}
