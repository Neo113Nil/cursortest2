package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.ht, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3320ht implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30962a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f30963b;

    public /* synthetic */ C3320ht(C3243gN c3243gN, int i) {
        this.f30962a = i;
        this.f30963b = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f30962a) {
            case 0:
                return new C3266gt((C3751pu) this.f30963b.f());
            case 1:
                return new Jt((C3751pu) this.f30963b.f());
            case 2:
                return new C3213fu((C3441k7) this.f30963b.f());
            case 3:
                return new C2491Bl((C3697ou) this.f30963b.f(), AbstractC3413jg.f31275h);
            case 4:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f30963b.f()));
                AbstractC3341iD.j(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            case 5:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f30963b.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new Gu(scheduledExecutorService, c3360ig);
            case 6:
                return new Vu((Wu) this.f30963b.f());
            case 7:
                return new Vu((Wu) this.f30963b.f());
            case 8:
                return new C4129wv((C2800Tp) this.f30963b.f());
            case 9:
                return new Xy((C3983uA) this.f30963b.f());
            case 10:
                return new File(new File((File) this.f30963b.f(), "drgd"), "pmtd.d");
            case 11:
                return new File(new File((File) this.f30963b.f(), "drgd"), "pcbc.d");
            case 12:
                return new File(new File((File) this.f30963b.f(), "drgd"), "pcam.jar.d");
            case 13:
                return new File(new File((File) this.f30963b.f(), "drgd"), "pmtd");
            case 14:
                return new File(new File(new File((File) this.f30963b.f(), "drgd"), "v"), "pcopt");
            case 15:
                return new File(new File((File) this.f30963b.f(), "drgd"), "pcbc");
            case 16:
                return new File(new File((File) this.f30963b.f(), "drgd"), "pcam.jar.tmp");
            case 17:
                return new File(new File(new File((File) this.f30963b.f(), "drgd"), "v"), "pcam.jar");
            case 18:
                return new File(new File((File) this.f30963b.f(), "ocs"), "pmtd");
            case 19:
                return new File(new File((File) this.f30963b.f(), "ocs"), "pcbc");
            case 20:
                return new File(new File((File) this.f30963b.f(), "ocs"), "pcam.jar");
            default:
                return new C3768qA();
        }
    }
}
