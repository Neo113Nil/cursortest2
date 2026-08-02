package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r2.C4906k;

/* loaded from: classes2.dex */
public final class Bs implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24744a;

    public /* synthetic */ Bs(int i) {
        this.f24744a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        RD wd;
        switch (this.f24744a) {
            case 0:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3772ps(c3383ig, 2);
            case 1:
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C3772ps(c3383ig2, 5);
            case 2:
                return new C2968au();
            case 3:
                return new Zt();
            case 4:
                C3396iu c3396iu = new C3396iu();
                try {
                    AbstractC4172xE.a();
                } catch (GeneralSecurityException e9) {
                    w2.z.k("Failed to Configure Aead. ".concat(e9.toString()));
                    C4906k.f40186C.f40196h.d("CryptoUtils.registerAead", e9);
                }
                return c3396iu;
            case 5:
                return new C3450ju();
            case 6:
                return V2.a.f3393a;
            case 7:
                C3774pu c3774pu = new C3774pu();
                c3774pu.f33946a = null;
                return c3774pu;
            case 8:
                return new C4313zu();
            case 9:
                C3383ig c3383ig3 = AbstractC3436jg.f32060f;
                AbstractC3364iD.j(c3383ig3);
                return c3383ig3;
            case 10:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Pt());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (unconfigurableExecutorService instanceof RD) {
                    wd = (RD) unconfigurableExecutorService;
                } else {
                    wd = unconfigurableExecutorService instanceof ScheduledExecutorService ? new WD((ScheduledExecutorService) unconfigurableExecutorService) : new C3383ig(unconfigurableExecutorService);
                }
                AbstractC3364iD.j(wd);
                return wd;
            case 11:
                WD wd2 = AbstractC3436jg.f32059e;
                AbstractC3364iD.j(wd2);
                return wd2;
            case 12:
                C3383ig c3383ig4 = AbstractC3436jg.f32060f;
                AbstractC3364iD.j(c3383ig4);
                return c3383ig4;
            case 13:
                return new ThreadFactoryC2624If();
            case 14:
                return new Vx();
            case 15:
                return new C4047uy();
            case 16:
                return new C3187ez();
            case 17:
                return new Ty();
            case 18:
                return new Bw();
            case 19:
                return new Xz();
            default:
                return new C3737pA();
        }
    }
}
