package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3225ft implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30897a;

    public /* synthetic */ C3225ft(int i) {
        this.f30897a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        SD xd;
        switch (this.f30897a) {
            case 0:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3923ss(c3157eg, 5);
            case 1:
                return new C3116du();
            case 2:
                return new C3008bu();
            case 3:
                C3440ju c3440ju = new C3440ju();
                try {
                    AbstractC4216yE.a();
                } catch (GeneralSecurityException e6) {
                    t2.C.k("Failed to Configure Aead. ".concat(e6.toString()));
                    p2.j.f39798C.f39808h.d("CryptoUtils.registerAead", e6);
                }
                return c3440ju;
            case 4:
                return new C3494ku();
            case 5:
                return S2.a.f2963a;
            case 6:
                C3818qu c3818qu = new C3818qu();
                c3818qu.f33909a = null;
                return c3818qu;
            case 7:
                return new Bu();
            case 8:
                C3157eg c3157eg2 = AbstractC3212fg.f30743f;
                AbstractC3137eE.h(c3157eg2);
                return c3157eg2;
            case 9:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3062cu());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (unconfigurableExecutorService instanceof SD) {
                    xd = (SD) unconfigurableExecutorService;
                } else {
                    xd = unconfigurableExecutorService instanceof ScheduledExecutorService ? new XD((ScheduledExecutorService) unconfigurableExecutorService) : new C3157eg(unconfigurableExecutorService);
                }
                AbstractC3137eE.h(xd);
                return xd;
            case 10:
                XD xd2 = AbstractC3212fg.f30742e;
                AbstractC3137eE.h(xd2);
                return xd2;
            case 11:
                C3157eg c3157eg3 = AbstractC3212fg.f30743f;
                AbstractC3137eE.h(c3157eg3);
                return c3157eg3;
            case 12:
                return new ThreadFactoryC2552Ff();
            case 13:
                return new Wx();
            case 14:
                return new C4145wy();
            case 15:
                return new C3339hz();
            case 16:
                return new Wy();
            case 17:
                return new Cw();
            case 18:
                return new C2915aA();
            default:
                return new C3888sA();
        }
    }
}
