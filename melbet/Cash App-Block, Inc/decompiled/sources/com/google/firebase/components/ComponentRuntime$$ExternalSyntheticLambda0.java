package com.google.firebase.components;

import android.os.StrictMode;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.concurrent.CustomThreadFactory;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentRuntime$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComponentRuntime$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        TransportFactory lambda$static$0;
        switch (this.$r8$classId) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                Lazy lazy = ExecutorsRegistrar.BG_EXECUTOR;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(4, new CustomThreadFactory("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.SCHEDULER.get());
            case 3:
                Lazy lazy2 = ExecutorsRegistrar.BG_EXECUTOR;
                return new DelegatingScheduledExecutorService(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new CustomThreadFactory("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.SCHEDULER.get());
            case 4:
                Lazy lazy3 = ExecutorsRegistrar.BG_EXECUTOR;
                return new DelegatingScheduledExecutorService(Executors.newCachedThreadPool(new CustomThreadFactory("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.SCHEDULER.get());
            case 5:
                Lazy lazy4 = ExecutorsRegistrar.BG_EXECUTOR;
                return Executors.newSingleThreadScheduledExecutor(new CustomThreadFactory("Firebase Scheduler", 0, null));
            default:
                lambda$static$0 = FirebaseMessaging.lambda$static$0();
                return lambda$static$0;
        }
    }
}
