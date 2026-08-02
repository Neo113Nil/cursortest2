package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3439jj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32090a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f32091b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f32092c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f32093d;

    public /* synthetic */ C3439jj(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, int i) {
        this.f32090a = i;
        this.f32091b = c3266gN;
        this.f32092c = c3266gN2;
        this.f32093d = c3266gN3;
    }

    public C2898Yk a() {
        return new C2898Yk((ScheduledExecutorService) this.f32091b.f(), (V2.a) this.f32092c.f(), (C3230fo) this.f32093d.f());
    }

    public Or b() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or(c3383ig, this.f32091b.f(), this.f32092c.f(), this.f32093d.f(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f32090a) {
            case 0:
                return a();
            case 1:
                return new C3504ku(14, (C3450ju) this.f32091b.f(), (C2768Qn) this.f32092c.f(), (C3230fo) this.f32093d.f());
            case 2:
                return b();
            case 3:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                C3772ps c3772ps = new C3772ps(c3383ig, 2);
                C3718os c3718os = (C3718os) this.f32091b.f();
                List list = (List) this.f32092c.f();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f32093d.f();
                if (list.contains("24")) {
                    return new Qr(c3718os, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Fd)).intValue(), scheduledExecutorService);
                }
                return new Qr(c3772ps, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Fd)).intValue(), scheduledExecutorService);
            case 4:
                return new Qt((Mt) this.f32091b.f(), (Jt) this.f32092c.f(), (Zt) this.f32093d.f());
            case 5:
                return new Iz((File) this.f32091b.f(), (Bw) this.f32092c.f(), (C4006uA) this.f32093d.f());
            case 6:
                File file = (File) this.f32091b.f();
                C4317zy c4317zy = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA = (C4006uA) this.f32093d.f();
                Ky G2 = Ky.G();
                final int i = 0;
                UA ua = new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i) {
                            case 0:
                                c4006uA.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA.d(20308, th);
                                return Ky.G();
                        }
                    }
                };
                c4317zy.getClass();
                return new C4263yy(file, c4317zy.f36250a, new C4042ut(4, G2), ua);
            case 7:
                File file2 = (File) this.f32091b.f();
                C4317zy c4317zy2 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA2 = (C4006uA) this.f32093d.f();
                final int i4 = 2;
                return c4317zy2.a(file2, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i4) {
                            case 0:
                                c4006uA2.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA2.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA2.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA2.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA2.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA2.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA2.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA2.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA2.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 8:
                File file3 = (File) this.f32091b.f();
                C4317zy c4317zy3 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA3 = (C4006uA) this.f32093d.f();
                final int i6 = 4;
                return c4317zy3.a(file3, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i6) {
                            case 0:
                                c4006uA3.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA3.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA3.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA3.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA3.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA3.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA3.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA3.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA3.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 9:
                File file4 = (File) this.f32091b.f();
                C4317zy c4317zy4 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA4 = (C4006uA) this.f32093d.f();
                Ky G7 = Ky.G();
                final int i9 = 5;
                UA ua2 = new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i9) {
                            case 0:
                                c4006uA4.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA4.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA4.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA4.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA4.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA4.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA4.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA4.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA4.d(20308, th);
                                return Ky.G();
                        }
                    }
                };
                c4317zy4.getClass();
                return new C4263yy(file4, c4317zy4.f36250a, new C4042ut(4, G7), ua2);
            case 10:
                File file5 = (File) this.f32091b.f();
                C4317zy c4317zy5 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA5 = (C4006uA) this.f32093d.f();
                final int i10 = 1;
                return c4317zy5.a(file5, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                c4006uA5.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA5.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA5.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA5.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA5.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA5.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA5.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA5.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA5.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 11:
                File file6 = (File) this.f32091b.f();
                C4317zy c4317zy6 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA6 = (C4006uA) this.f32093d.f();
                final int i11 = 3;
                return c4317zy6.a(file6, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                c4006uA6.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA6.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA6.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA6.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA6.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA6.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA6.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA6.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA6.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 12:
                File file7 = (File) this.f32091b.f();
                C4317zy c4317zy7 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA7 = (C4006uA) this.f32093d.f();
                Ky G8 = Ky.G();
                final int i12 = 8;
                UA ua3 = new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                c4006uA7.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA7.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA7.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA7.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA7.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA7.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA7.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA7.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA7.d(20308, th);
                                return Ky.G();
                        }
                    }
                };
                c4317zy7.getClass();
                return new C4263yy(file7, c4317zy7.f36250a, new C4042ut(4, G8), ua3);
            case 13:
                File file8 = (File) this.f32091b.f();
                C4317zy c4317zy8 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA8 = (C4006uA) this.f32093d.f();
                final int i13 = 6;
                return c4317zy8.a(file8, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                c4006uA8.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA8.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA8.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA8.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA8.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA8.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA8.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA8.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA8.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            default:
                File file9 = (File) this.f32091b.f();
                C4317zy c4317zy9 = (C4317zy) this.f32092c.f();
                final C4006uA c4006uA9 = (C4006uA) this.f32093d.f();
                final int i14 = 7;
                return c4317zy9.a(file9, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                c4006uA9.d(15308, th);
                                return Ky.G();
                            case 1:
                                c4006uA9.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4006uA9.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4006uA9.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4006uA9.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4006uA9.d(15308, th);
                                return Ky.G();
                            case 6:
                                c4006uA9.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4006uA9.d(20309, th);
                                return new byte[0];
                            default:
                                c4006uA9.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
        }
    }
}
