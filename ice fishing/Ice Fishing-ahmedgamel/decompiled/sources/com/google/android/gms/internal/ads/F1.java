package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Cr f24709a = new Cr(4);

    /* renamed from: b, reason: collision with root package name */
    public final Cr f24710b = new Cr(9);

    /* renamed from: c, reason: collision with root package name */
    public final Cr f24711c = new Cr(11);

    /* renamed from: d, reason: collision with root package name */
    public final Cr f24712d = new Cr();

    /* renamed from: e, reason: collision with root package name */
    public final G1 f24713e;

    /* renamed from: f, reason: collision with root package name */
    public CQ f24714f;

    /* renamed from: g, reason: collision with root package name */
    public int f24715g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24716h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f24717j;

    /* renamed from: k, reason: collision with root package name */
    public int f24718k;

    /* renamed from: l, reason: collision with root package name */
    public int f24719l;

    /* renamed from: m, reason: collision with root package name */
    public long f24720m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24721n;

    /* renamed from: o, reason: collision with root package name */
    public E1 f24722o;

    /* renamed from: p, reason: collision with root package name */
    public I1 f24723p;

    static {
        int i = AbstractC2639Kg.f25949M;
    }

    public F1() {
        G1 g12 = new G1(new O0());
        g12.f24904v = com.anythink.basead.exoplayer.b.f6382b;
        g12.f24905w = new long[0];
        g12.f24906x = new long[0];
        this.f24713e = g12;
        this.f24715g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0007 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        long j6;
        boolean z3;
        boolean z6;
        int i;
        boolean z9;
        this.f24714f.getClass();
        while (true) {
            int i6 = this.f24715g;
            int i9 = 8;
            if (i6 == 1) {
                Cr cr = this.f24710b;
                if (!((K0) r02).z(cr.f24252a, 0, 9, true)) {
                    return -1;
                }
                cr.E(0);
                cr.G(4);
                int K7 = cr.K();
                int i10 = K7 & 4;
                int i11 = K7 & 1;
                if (i10 != 0 && this.f24722o == null) {
                    this.f24722o = new E1(this.f24714f.C(8, 1));
                }
                if (i11 != 0 && this.f24723p == null) {
                    this.f24723p = new I1(this.f24714f.C(9, 2));
                }
                this.f24714f.B();
                this.f24717j = cr.b() - 5;
                this.f24715g = 2;
            } else if (i6 == 2) {
                ((K0) r02).a(this.f24717j, false);
                this.f24717j = 0;
                this.f24715g = 3;
            } else if (i6 == 3) {
                Cr cr2 = this.f24711c;
                if (!((K0) r02).z(cr2.f24252a, 0, 11, true)) {
                    return -1;
                }
                cr2.E(0);
                this.f24718k = cr2.K();
                this.f24719l = cr2.O();
                this.f24720m = cr2.O();
                this.f24720m = ((cr2.K() << 24) | this.f24720m) * 1000;
                cr2.G(3);
                this.f24715g = 4;
            } else {
                if (i6 != 4) {
                    throw new IllegalStateException();
                }
                boolean z10 = this.f24716h;
                G1 g12 = this.f24713e;
                long j9 = z10 ? this.i + this.f24720m : g12.f24904v == com.anythink.basead.exoplayer.b.f6382b ? 0L : this.f24720m;
                int i12 = this.f24718k;
                if (i12 != 8) {
                    i9 = i12;
                } else if (this.f24722o != null) {
                    if (!this.f24721n) {
                        this.f24714f.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
                        this.f24721n = true;
                    }
                    E1 e12 = this.f24722o;
                    Cr g4 = g((K0) r02);
                    if (e12.f24524v) {
                        g4.G(1);
                    } else {
                        int K8 = g4.K();
                        int i13 = K8 >> 4;
                        e12.f24526x = i13;
                        InterfaceC3543m1 interfaceC3543m1 = (InterfaceC3543m1) e12.f26598n;
                        if (i13 == 2) {
                            int i14 = E1.f24523y[(K8 >> 2) & 3];
                            C3299hP c3299hP = new C3299hP();
                            c3299hP.d("video/x-flv");
                            c3299hP.e(com.anythink.basead.exoplayer.k.o.f8462t);
                            c3299hP.f30772G = 1;
                            c3299hP.f30774I = i14;
                            interfaceC3543m1.e(new DP(c3299hP));
                            e12.f24525w = true;
                        } else if (i13 == 7 || i13 == 8) {
                            C3299hP c3299hP2 = new C3299hP();
                            c3299hP2.d("video/x-flv");
                            c3299hP2.e(i13 == 7 ? com.anythink.basead.exoplayer.k.o.f8466x : com.anythink.basead.exoplayer.k.o.f8467y);
                            c3299hP2.f30772G = 1;
                            c3299hP2.f30774I = 8000;
                            interfaceC3543m1.e(new DP(c3299hP2));
                            e12.f24525w = true;
                        } else if (i13 != 10) {
                            throw new H1(D.y.m(i13, "Audio format not supported: ", new StringBuilder(String.valueOf(i13).length() + 28)));
                        }
                        e12.f24524v = true;
                    }
                    int i15 = e12.f24526x;
                    InterfaceC3543m1 interfaceC3543m12 = (InterfaceC3543m1) e12.f26598n;
                    if (i15 == 2) {
                        int B9 = g4.B();
                        interfaceC3543m12.a(B9, g4);
                        interfaceC3543m12.c(j9, 1, B9, 0, null);
                    } else {
                        int K9 = g4.K();
                        z9 = false;
                        if (K9 == 0 && !e12.f24525w) {
                            int B10 = g4.B();
                            byte[] bArr = new byte[B10];
                            g4.H(bArr, 0, B10);
                            C3921t2 p9 = AbstractC2639Kg.p(new C4233yr(bArr, B10), false);
                            C3299hP c3299hP3 = new C3299hP();
                            c3299hP3.d("video/x-flv");
                            c3299hP3.e(com.anythink.basead.exoplayer.k.o.f8460r);
                            c3299hP3.f30788j = (String) p9.f34193v;
                            c3299hP3.f30772G = p9.f34192u;
                            c3299hP3.f30774I = p9.f34191n;
                            c3299hP3.f30795q = Collections.singletonList(bArr);
                            interfaceC3543m12.e(new DP(c3299hP3));
                            e12.f24525w = true;
                        } else if (e12.f24526x != 10 || K9 == 1) {
                            int B11 = g4.B();
                            interfaceC3543m12.a(B11, g4);
                            interfaceC3543m12.c(j9, 1, B11, 0, null);
                        }
                        z3 = true;
                        z6 = z9;
                        j6 = -9223372036854775807L;
                        if (!this.f24716h && z6) {
                            this.f24716h = true;
                            this.i = g12.f24904v != j6 ? -this.f24720m : 0L;
                        }
                        this.f24717j = 4;
                        this.f24715g = 2;
                        if (z3) {
                            return 0;
                        }
                    }
                    z9 = true;
                    z3 = true;
                    z6 = z9;
                    j6 = -9223372036854775807L;
                    if (!this.f24716h) {
                        this.f24716h = true;
                        this.i = g12.f24904v != j6 ? -this.f24720m : 0L;
                    }
                    this.f24717j = 4;
                    this.f24715g = 2;
                    if (z3) {
                    }
                }
                if (i9 != 9) {
                    j6 = -9223372036854775807L;
                    if (i9 == 18 && !this.f24721n) {
                        Cr g9 = g((K0) r02);
                        g12.getClass();
                        g12.getClass();
                        if (g9.K() == 2 && "onMetaData".equals(G1.Q1(g9)) && g9.B() != 0 && g9.K() == 8) {
                            HashMap T12 = G1.T1(g9);
                            Object obj = T12.get("duration");
                            if (obj instanceof Double) {
                                double doubleValue = ((Double) obj).doubleValue();
                                if (doubleValue > 0.0d) {
                                    g12.f24904v = (long) (doubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = T12.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    g12.f24905w = new long[size];
                                    g12.f24906x = new long[size];
                                    for (int i16 = 0; i16 < size; i16++) {
                                        Object obj5 = list.get(i16);
                                        Object obj6 = list2.get(i16);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            g12.f24905w = new long[0];
                                            g12.f24906x = new long[0];
                                            break;
                                        }
                                        g12.f24905w[i16] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        g12.f24906x[i16] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j10 = g12.f24904v;
                        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                            this.f24714f.D(new C2953b1(j10, g12.f24906x, g12.f24905w));
                            this.f24721n = true;
                        }
                        z3 = true;
                        z6 = false;
                        if (!this.f24716h) {
                        }
                        this.f24717j = 4;
                        this.f24715g = 2;
                        if (z3) {
                        }
                    }
                    ((K0) r02).a(this.f24719l, false);
                    z6 = false;
                    z3 = false;
                    if (!this.f24716h) {
                    }
                    this.f24717j = 4;
                    this.f24715g = 2;
                    if (z3) {
                    }
                } else if (this.f24723p != null) {
                    if (!this.f24721n) {
                        this.f24714f.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
                        this.f24721n = true;
                    }
                    I1 i17 = this.f24723p;
                    Cr g10 = g((K0) r02);
                    i17.getClass();
                    int K10 = g10.K();
                    int i18 = K10 >> 4;
                    int i19 = K10 & 15;
                    if (i19 != 7) {
                        throw new H1(D.y.m(i19, "Video format not supported: ", new StringBuilder(String.valueOf(i19).length() + 28)));
                    }
                    i17.f25427A = i18;
                    if (i18 != 5) {
                        int K11 = g10.K();
                        g10.v(3);
                        byte[] bArr2 = g10.f24252a;
                        int i20 = g10.f24253b;
                        int i21 = i20 + 1;
                        g10.f24253b = i21;
                        int i22 = bArr2[i20] & 255;
                        int i23 = i20 + 2;
                        g10.f24253b = i23;
                        int i24 = bArr2[i21] & 255;
                        g10.f24253b = i20 + 3;
                        long j11 = (bArr2[i23] & 255) | ((i22 << 24) >> 8) | (i24 << 8);
                        boolean z11 = true;
                        InterfaceC3543m1 interfaceC3543m13 = (InterfaceC3543m1) i17.f26598n;
                        if (K11 == 0) {
                            if (!i17.f25431y) {
                                byte[] bArr3 = new byte[g10.B()];
                                Cr cr3 = new Cr(bArr3);
                                g10.H(bArr3, 0, g10.B());
                                D0 a9 = D0.a(cr3);
                                i17.f25430x = a9.f24291b;
                                C3299hP c3299hP4 = new C3299hP();
                                c3299hP4.d("video/x-flv");
                                c3299hP4.e(com.anythink.basead.exoplayer.k.o.f8451h);
                                c3299hP4.f30788j = a9.f24300l;
                                c3299hP4.f30799u = a9.f24292c;
                                c3299hP4.f30800v = a9.f24293d;
                                c3299hP4.f30767B = a9.f24299k;
                                c3299hP4.f30795q = a9.f24290a;
                                interfaceC3543m13.e(new DP(c3299hP4));
                                i17.f25431y = true;
                            }
                        } else if (K11 == 1 && i17.f25431y) {
                            int i25 = i17.f25427A == 1 ? 1 : 0;
                            j6 = -9223372036854775807L;
                            if (i17.f25432z) {
                                i = i25;
                            } else {
                                if (i25 != 0) {
                                    i = 1;
                                }
                                z11 = false;
                                if (z11) {
                                    z6 = true;
                                    z3 = true;
                                    if (!this.f24716h) {
                                    }
                                    this.f24717j = 4;
                                    this.f24715g = 2;
                                    if (z3) {
                                    }
                                }
                            }
                            Cr cr4 = i17.f25429w;
                            byte[] bArr4 = cr4.f24252a;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[2] = 0;
                            int i26 = 4 - i17.f25430x;
                            int i27 = 0;
                            while (g10.B() > 0) {
                                g10.H(cr4.f24252a, i26, i17.f25430x);
                                cr4.E(0);
                                int h9 = cr4.h();
                                Cr cr5 = i17.f25428v;
                                cr5.E(0);
                                interfaceC3543m13.a(4, cr5);
                                interfaceC3543m13.a(h9, g10);
                                i27 = i27 + 4 + h9;
                            }
                            ((InterfaceC3543m1) i17.f26598n).c((j11 * 1000) + j9, i, i27, 0, null);
                            i17.f25432z = true;
                            if (z11) {
                            }
                        }
                        j6 = -9223372036854775807L;
                        z11 = false;
                        if (z11) {
                        }
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    z6 = false;
                    z3 = true;
                    if (!this.f24716h) {
                    }
                    this.f24717j = 4;
                    this.f24715g = 2;
                    if (z3) {
                    }
                } else {
                    j6 = -9223372036854775807L;
                    ((K0) r02).a(this.f24719l, false);
                    z6 = false;
                    z3 = false;
                    if (!this.f24716h) {
                    }
                    this.f24717j = 4;
                    this.f24715g = 2;
                    if (z3) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f24714f = (CQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0) {
            this.f24715g = 1;
            this.f24716h = false;
        } else {
            this.f24715g = 3;
        }
        this.f24717j = 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        Cr cr = this.f24709a;
        K0 k02 = (K0) r02;
        k02.A(cr.f24252a, 0, 3, false);
        cr.E(0);
        if (cr.O() == 4607062) {
            k02.A(cr.f24252a, 0, 2, false);
            cr.E(0);
            if ((cr.L() & 250) == 0) {
                k02.A(cr.f24252a, 0, 4, false);
                cr.E(0);
                int b9 = cr.b();
                k02.f25821y = 0;
                k02.c(b9, false);
                k02.A(cr.f24252a, 0, 4, false);
                cr.E(0);
                if (cr.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final Cr g(K0 k02) {
        int i = this.f24719l;
        Cr cr = this.f24712d;
        byte[] bArr = cr.f24252a;
        if (i > bArr.length) {
            int length = bArr.length;
            cr.z(0, new byte[Math.max(length + length, i)]);
        } else {
            cr.E(0);
        }
        cr.C(this.f24719l);
        k02.z(cr.f24252a, 0, this.f24719l, false);
        return cr;
    }
}
