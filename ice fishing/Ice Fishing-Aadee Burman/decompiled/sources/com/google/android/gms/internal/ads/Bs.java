package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class Bs implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23981a;

    public /* synthetic */ Bs(int i) {
        this.f23981a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        RD wd;
        switch (this.f23981a) {
            case 0:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3749ps(c3360ig, 2);
            case 1:
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C3749ps(c3360ig2, 5);
            case 2:
                return new C2945au();
            case 3:
                return new Zt();
            case 4:
                C3373iu c3373iu = new C3373iu();
                try {
                    AbstractC4149xE.a();
                } catch (GeneralSecurityException e9) {
                    u2.z.k("Failed to Configure Aead. ".concat(e9.toString()));
                    C4835j.f39730C.f39740h.d("CryptoUtils.registerAead", e9);
                }
                return c3373iu;
            case 5:
                return new C3427ju();
            case 6:
                return T2.a.f3077a;
            case 7:
                C3751pu c3751pu = new C3751pu();
                c3751pu.f33160a = null;
                return c3751pu;
            case 8:
                return new C4290zu();
            case 9:
                C3360ig c3360ig3 = AbstractC3413jg.f31273f;
                AbstractC3341iD.j(c3360ig3);
                return c3360ig3;
            case 10:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Pt());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (unconfigurableExecutorService instanceof RD) {
                    wd = (RD) unconfigurableExecutorService;
                } else {
                    wd = unconfigurableExecutorService instanceof ScheduledExecutorService ? new WD((ScheduledExecutorService) unconfigurableExecutorService) : new C3360ig(unconfigurableExecutorService);
                }
                AbstractC3341iD.j(wd);
                return wd;
            case 11:
                WD wd2 = AbstractC3413jg.f31272e;
                AbstractC3341iD.j(wd2);
                return wd2;
            case 12:
                C3360ig c3360ig4 = AbstractC3413jg.f31273f;
                AbstractC3341iD.j(c3360ig4);
                return c3360ig4;
            case 13:
                return new ThreadFactoryC2604If();
            case 14:
                return new Vx();
            case 15:
                return new C4024uy();
            case 16:
                return new C3164ez();
            case 17:
                return new Ty();
            case 18:
                return new Bw();
            case 19:
                return new Xz();
            default:
                return new C3714pA();
        }
    }
}
