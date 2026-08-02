package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.ht, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3343ht implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31736a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f31737b;

    public /* synthetic */ C3343ht(C3266gN c3266gN, int i) {
        this.f31736a = i;
        this.f31737b = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f31736a) {
            case 0:
                return new C3289gt((C3774pu) this.f31737b.f());
            case 1:
                return new Jt((C3774pu) this.f31737b.f());
            case 2:
                return new C3236fu((C3464k7) this.f31737b.f());
            case 3:
                return new C2528Cl((C3720ou) this.f31737b.f(), AbstractC3436jg.f32062h);
            case 4:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f31737b.f()));
                AbstractC3364iD.j(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            case 5:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f31737b.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new Gu(scheduledExecutorService, c3383ig);
            case 6:
                return new Vu((Wu) this.f31737b.f());
            case 7:
                return new Vu((Wu) this.f31737b.f());
            case 8:
                return new C4152wv((C2821Tp) this.f31737b.f());
            case 9:
                return new Xy((C4006uA) this.f31737b.f());
            case 10:
                return new File(new File((File) this.f31737b.f(), "drgd"), "pmtd.d");
            case 11:
                return new File(new File((File) this.f31737b.f(), "drgd"), "pcbc.d");
            case 12:
                return new File(new File((File) this.f31737b.f(), "drgd"), "pcam.jar.d");
            case 13:
                return new File(new File((File) this.f31737b.f(), "drgd"), "pmtd");
            case 14:
                return new File(new File(new File((File) this.f31737b.f(), "drgd"), "v"), "pcopt");
            case 15:
                return new File(new File((File) this.f31737b.f(), "drgd"), "pcbc");
            case 16:
                return new File(new File((File) this.f31737b.f(), "drgd"), "pcam.jar.tmp");
            case 17:
                return new File(new File(new File((File) this.f31737b.f(), "drgd"), "v"), "pcam.jar");
            case 18:
                return new File(new File((File) this.f31737b.f(), "ocs"), "pmtd");
            case 19:
                return new File(new File((File) this.f31737b.f(), "ocs"), "pcbc");
            case 20:
                return new File(new File((File) this.f31737b.f(), "ocs"), "pcam.jar");
            default:
                return new C3791qA();
        }
    }
}
