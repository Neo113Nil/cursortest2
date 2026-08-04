package com.gamericefishpro.space.bb;

import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements com.gamericefishpro.space.nb.a {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // com.gamericefishpro.space.nb.a
    public final Object get() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                q qVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new com.gamericefishpro.space.cb.g(Executors.newFixedThreadPool(4, new com.gamericefishpro.space.cb.a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                q qVar2 = ExecutorsRegistrar.a;
                return new com.gamericefishpro.space.cb.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new com.gamericefishpro.space.cb.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                q qVar3 = ExecutorsRegistrar.a;
                return new com.gamericefishpro.space.cb.g(Executors.newCachedThreadPool(new com.gamericefishpro.space.cb.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                q qVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new com.gamericefishpro.space.cb.a("Firebase Scheduler", 0, null));
            default:
                com.gamericefishpro.space.tb.u uVar = FirebaseMessaging.k;
                return null;
        }
    }
}
