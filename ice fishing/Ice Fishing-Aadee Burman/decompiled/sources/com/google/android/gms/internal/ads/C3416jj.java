package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3416jj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31303a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f31304b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f31305c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f31306d;

    public /* synthetic */ C3416jj(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, int i) {
        this.f31303a = i;
        this.f31304b = c3243gN;
        this.f31305c = c3243gN2;
        this.f31306d = c3243gN3;
    }

    public C2875Yk a() {
        return new C2875Yk((ScheduledExecutorService) this.f31304b.f(), (T2.a) this.f31305c.f(), (C3153eo) this.f31306d.f());
    }

    public Or b() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or(c3360ig, this.f31304b.f(), this.f31305c.f(), this.f31306d.f(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f31303a) {
            case 0:
                return a();
            case 1:
                return new C3481ku(14, (C3427ju) this.f31304b.f(), (C2731Pn) this.f31305c.f(), (C3153eo) this.f31306d.f());
            case 2:
                return b();
            case 3:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                C3749ps c3749ps = new C3749ps(c3360ig, 2);
                C3695os c3695os = (C3695os) this.f31304b.f();
                List list = (List) this.f31305c.f();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f31306d.f();
                if (list.contains("24")) {
                    return new Qr(c3695os, ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Fd)).intValue(), scheduledExecutorService);
                }
                return new Qr(c3749ps, ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Fd)).intValue(), scheduledExecutorService);
            case 4:
                return new Qt((Mt) this.f31304b.f(), (Jt) this.f31305c.f(), (Zt) this.f31306d.f());
            case 5:
                return new Iz((File) this.f31304b.f(), (Bw) this.f31305c.f(), (C3983uA) this.f31306d.f());
            case 6:
                File file = (File) this.f31304b.f();
                C4294zy c4294zy = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA = (C3983uA) this.f31306d.f();
                Ky G7 = Ky.G();
                final int i = 0;
                UA ua = new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i) {
                            case 0:
                                c3983uA.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA.d(20308, th);
                                return Ky.G();
                        }
                    }
                };
                c4294zy.getClass();
                return new C4240yy(file, c4294zy.f35481a, new C4019ut(4, G7), ua);
            case 7:
                File file2 = (File) this.f31304b.f();
                C4294zy c4294zy2 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA2 = (C3983uA) this.f31306d.f();
                final int i6 = 2;
                return c4294zy2.a(file2, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i6) {
                            case 0:
                                c3983uA2.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA2.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA2.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA2.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA2.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA2.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA2.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA2.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA2.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 8:
                File file3 = (File) this.f31304b.f();
                C4294zy c4294zy3 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA3 = (C3983uA) this.f31306d.f();
                final int i9 = 4;
                return c4294zy3.a(file3, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i9) {
                            case 0:
                                c3983uA3.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA3.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA3.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA3.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA3.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA3.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA3.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA3.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA3.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 9:
                File file4 = (File) this.f31304b.f();
                C4294zy c4294zy4 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA4 = (C3983uA) this.f31306d.f();
                Ky G8 = Ky.G();
                final int i10 = 5;
                UA ua2 = new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                c3983uA4.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA4.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA4.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA4.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA4.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA4.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA4.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA4.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA4.d(20308, th);
                                return Ky.G();
                        }
                    }
                };
                c4294zy4.getClass();
                return new C4240yy(file4, c4294zy4.f35481a, new C4019ut(4, G8), ua2);
            case 10:
                File file5 = (File) this.f31304b.f();
                C4294zy c4294zy5 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA5 = (C3983uA) this.f31306d.f();
                final int i11 = 1;
                return c4294zy5.a(file5, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                c3983uA5.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA5.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA5.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA5.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA5.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA5.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA5.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA5.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA5.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 11:
                File file6 = (File) this.f31304b.f();
                C4294zy c4294zy6 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA6 = (C3983uA) this.f31306d.f();
                final int i12 = 3;
                return c4294zy6.a(file6, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                c3983uA6.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA6.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA6.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA6.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA6.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA6.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA6.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA6.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA6.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            case 12:
                File file7 = (File) this.f31304b.f();
                C4294zy c4294zy7 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA7 = (C3983uA) this.f31306d.f();
                Ky G9 = Ky.G();
                final int i13 = 8;
                UA ua3 = new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                c3983uA7.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA7.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA7.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA7.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA7.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA7.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA7.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA7.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA7.d(20308, th);
                                return Ky.G();
                        }
                    }
                };
                c4294zy7.getClass();
                return new C4240yy(file7, c4294zy7.f35481a, new C4019ut(4, G9), ua3);
            case 13:
                File file8 = (File) this.f31304b.f();
                C4294zy c4294zy8 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA8 = (C3983uA) this.f31306d.f();
                final int i14 = 6;
                return c4294zy8.a(file8, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                c3983uA8.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA8.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA8.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA8.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA8.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA8.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA8.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA8.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA8.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
            default:
                File file9 = (File) this.f31304b.f();
                C4294zy c4294zy9 = (C4294zy) this.f31305c.f();
                final C3983uA c3983uA9 = (C3983uA) this.f31306d.f();
                final int i15 = 7;
                return c4294zy9.a(file9, new byte[0], new UA() { // from class: com.google.android.gms.internal.ads.cA
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i15) {
                            case 0:
                                c3983uA9.d(15308, th);
                                return Ky.G();
                            case 1:
                                c3983uA9.d(15310, th);
                                return new byte[0];
                            case 2:
                                c3983uA9.d(15310, th);
                                return new byte[0];
                            case 3:
                                c3983uA9.d(15309, th);
                                return new byte[0];
                            case 4:
                                c3983uA9.d(15309, th);
                                return new byte[0];
                            case 5:
                                c3983uA9.d(15308, th);
                                return Ky.G();
                            case 6:
                                c3983uA9.d(20310, th);
                                return new byte[0];
                            case 7:
                                c3983uA9.d(20309, th);
                                return new byte[0];
                            default:
                                c3983uA9.d(20308, th);
                                return Ky.G();
                        }
                    }
                });
        }
    }
}
