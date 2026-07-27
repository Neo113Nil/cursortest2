package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class Kt implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26059a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f26060b;

    public /* synthetic */ Kt(C4009uN c4009uN, int i) {
        this.f26059a = i;
        this.f26060b = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f26059a) {
            case 0:
                return new Jt((C3818qu) this.f26060b.d());
            case 1:
                return new C3280gu((C3348i7) this.f26060b.d());
            case 2:
                return new C2473Al((C3764pu) this.f26060b.d(), AbstractC3212fg.f30745h);
            case 3:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f26060b.d()));
                AbstractC3137eE.h(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            case 4:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f26060b.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new Iu(scheduledExecutorService, c3157eg);
            case 5:
                return new Yu((Zu) this.f26060b.d());
            case 6:
                return new Yu((Zu) this.f26060b.d());
            case 7:
                return new C4250yv((C2834Vp) this.f26060b.d());
            case 8:
                return new Zy((C4158xA) this.f26060b.d());
            case 9:
                return new File(new File((File) this.f26060b.d(), "drgd"), "pmtd.d");
            case 10:
                return new File(new File((File) this.f26060b.d(), "drgd"), "pcbc.d");
            case 11:
                return new File(new File((File) this.f26060b.d(), "drgd"), "pcam.jar.d");
            case 12:
                return new File(new File((File) this.f26060b.d(), "drgd"), "pmtd");
            case 13:
                return new File(new File(new File((File) this.f26060b.d(), "drgd"), "v"), "pcopt");
            case 14:
                return new File(new File((File) this.f26060b.d(), "drgd"), "pcbc");
            case 15:
                return new File(new File((File) this.f26060b.d(), "drgd"), "pcam.jar.tmp");
            case 16:
                return new File(new File(new File((File) this.f26060b.d(), "drgd"), "v"), "pcam.jar");
            case 17:
                return new File(new File((File) this.f26060b.d(), "ocs"), "pmtd");
            case 18:
                return new File(new File((File) this.f26060b.d(), "ocs"), "pcbc");
            case 19:
                return new File(new File((File) this.f26060b.d(), "ocs"), "pcam.jar");
            default:
                return new C3942tA();
        }
    }
}
