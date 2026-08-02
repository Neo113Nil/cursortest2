package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Cr f25465a = new Cr(4);

    /* renamed from: b, reason: collision with root package name */
    public final Cr f25466b = new Cr(9);

    /* renamed from: c, reason: collision with root package name */
    public final Cr f25467c = new Cr(11);

    /* renamed from: d, reason: collision with root package name */
    public final Cr f25468d = new Cr();

    /* renamed from: e, reason: collision with root package name */
    public final G1 f25469e;

    /* renamed from: f, reason: collision with root package name */
    public FQ f25470f;

    /* renamed from: g, reason: collision with root package name */
    public int f25471g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25472h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public int f25473j;

    /* renamed from: k, reason: collision with root package name */
    public int f25474k;

    /* renamed from: l, reason: collision with root package name */
    public int f25475l;

    /* renamed from: m, reason: collision with root package name */
    public long f25476m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25477n;

    /* renamed from: o, reason: collision with root package name */
    public E1 f25478o;

    /* renamed from: p, reason: collision with root package name */
    public I1 f25479p;

    static {
        int i = AbstractC2659Kg.f26727M;
    }

    public F1() {
        G1 g12 = new G1(new O0());
        g12.f25694v = com.anythink.basead.exoplayer.b.f7168b;
        g12.f25695w = new long[0];
        g12.f25696x = new long[0];
        this.f25469e = g12;
        this.f25471g = 1;
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
        boolean z6;
        boolean z9;
        int i;
        boolean z10;
        this.f25470f.getClass();
        while (true) {
            int i4 = this.f25471g;
            int i6 = 8;
            if (i4 == 1) {
                Cr cr = this.f25466b;
                if (!((K0) r02).A(cr.f24997a, 0, 9, true)) {
                    return -1;
                }
                cr.E(0);
                cr.G(4);
                int K7 = cr.K();
                int i9 = K7 & 4;
                int i10 = K7 & 1;
                if (i9 != 0 && this.f25478o == null) {
                    this.f25478o = new E1(this.f25470f.C(8, 1));
                }
                if (i10 != 0 && this.f25479p == null) {
                    this.f25479p = new I1(this.f25470f.C(9, 2));
                }
                this.f25470f.B();
                this.f25473j = cr.b() - 5;
                this.f25471g = 2;
            } else if (i4 == 2) {
                ((K0) r02).a(this.f25473j, false);
                this.f25473j = 0;
                this.f25471g = 3;
            } else if (i4 == 3) {
                Cr cr2 = this.f25467c;
                if (!((K0) r02).A(cr2.f24997a, 0, 11, true)) {
                    return -1;
                }
                cr2.E(0);
                this.f25474k = cr2.K();
                this.f25475l = cr2.O();
                this.f25476m = cr2.O();
                this.f25476m = ((cr2.K() << 24) | this.f25476m) * 1000;
                cr2.G(3);
                this.f25471g = 4;
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                boolean z11 = this.f25472h;
                G1 g12 = this.f25469e;
                long j9 = z11 ? this.i + this.f25476m : g12.f25694v == com.anythink.basead.exoplayer.b.f7168b ? 0L : this.f25476m;
                int i11 = this.f25474k;
                if (i11 != 8) {
                    i6 = i11;
                } else if (this.f25478o != null) {
                    if (!this.f25477n) {
                        this.f25470f.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
                        this.f25477n = true;
                    }
                    E1 e12 = this.f25478o;
                    Cr g9 = g((K0) r02);
                    if (e12.f25285v) {
                        g9.G(1);
                    } else {
                        int K8 = g9.K();
                        int i12 = K8 >> 4;
                        e12.f25287x = i12;
                        InterfaceC3566m1 interfaceC3566m1 = (InterfaceC3566m1) e12.f27380n;
                        if (i12 == 2) {
                            int i13 = E1.f25284y[(K8 >> 2) & 3];
                            C3322hP c3322hP = new C3322hP();
                            c3322hP.d("video/x-flv");
                            c3322hP.e(com.anythink.basead.exoplayer.k.o.f9248t);
                            c3322hP.f31538G = 1;
                            c3322hP.f31540I = i13;
                            interfaceC3566m1.e(new DP(c3322hP));
                            e12.f25286w = true;
                        } else if (i12 == 7 || i12 == 8) {
                            C3322hP c3322hP2 = new C3322hP();
                            c3322hP2.d("video/x-flv");
                            c3322hP2.e(i12 == 7 ? com.anythink.basead.exoplayer.k.o.f9252x : com.anythink.basead.exoplayer.k.o.f9253y);
                            c3322hP2.f31538G = 1;
                            c3322hP2.f31540I = 8000;
                            interfaceC3566m1.e(new DP(c3322hP2));
                            e12.f25286w = true;
                        } else if (i12 != 10) {
                            throw new H1(D.x.k(i12, "Audio format not supported: ", new StringBuilder(String.valueOf(i12).length() + 28)));
                        }
                        e12.f25285v = true;
                    }
                    int i14 = e12.f25287x;
                    InterfaceC3566m1 interfaceC3566m12 = (InterfaceC3566m1) e12.f27380n;
                    if (i14 == 2) {
                        int B3 = g9.B();
                        interfaceC3566m12.a(B3, g9);
                        interfaceC3566m12.c(j9, 1, B3, 0, null);
                    } else {
                        int K9 = g9.K();
                        z10 = false;
                        if (K9 == 0 && !e12.f25286w) {
                            int B9 = g9.B();
                            byte[] bArr = new byte[B9];
                            g9.H(bArr, 0, B9);
                            C3944t2 p9 = AbstractC2659Kg.p(new C4256yr(bArr, B9), false);
                            C3322hP c3322hP3 = new C3322hP();
                            c3322hP3.d("video/x-flv");
                            c3322hP3.e(com.anythink.basead.exoplayer.k.o.f9246r);
                            c3322hP3.f31554j = (String) p9.f34979v;
                            c3322hP3.f31538G = p9.f34978u;
                            c3322hP3.f31540I = p9.f34977n;
                            c3322hP3.f31561q = Collections.singletonList(bArr);
                            interfaceC3566m12.e(new DP(c3322hP3));
                            e12.f25286w = true;
                        } else if (e12.f25287x != 10 || K9 == 1) {
                            int B10 = g9.B();
                            interfaceC3566m12.a(B10, g9);
                            interfaceC3566m12.c(j9, 1, B10, 0, null);
                        }
                        z6 = true;
                        z9 = z10;
                        j6 = -9223372036854775807L;
                        if (!this.f25472h && z9) {
                            this.f25472h = true;
                            this.i = g12.f25694v != j6 ? -this.f25476m : 0L;
                        }
                        this.f25473j = 4;
                        this.f25471g = 2;
                        if (z6) {
                            return 0;
                        }
                    }
                    z10 = true;
                    z6 = true;
                    z9 = z10;
                    j6 = -9223372036854775807L;
                    if (!this.f25472h) {
                        this.f25472h = true;
                        this.i = g12.f25694v != j6 ? -this.f25476m : 0L;
                    }
                    this.f25473j = 4;
                    this.f25471g = 2;
                    if (z6) {
                    }
                }
                if (i6 != 9) {
                    j6 = -9223372036854775807L;
                    if (i6 == 18 && !this.f25477n) {
                        Cr g10 = g((K0) r02);
                        g12.getClass();
                        g12.getClass();
                        if (g10.K() == 2 && "onMetaData".equals(G1.R1(g10)) && g10.B() != 0 && g10.K() == 8) {
                            HashMap T12 = G1.T1(g10);
                            Object obj = T12.get("duration");
                            if (obj instanceof Double) {
                                double doubleValue = ((Double) obj).doubleValue();
                                if (doubleValue > 0.0d) {
                                    g12.f25694v = (long) (doubleValue * 1000000.0d);
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
                                    g12.f25695w = new long[size];
                                    g12.f25696x = new long[size];
                                    for (int i15 = 0; i15 < size; i15++) {
                                        Object obj5 = list.get(i15);
                                        Object obj6 = list2.get(i15);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            g12.f25695w = new long[0];
                                            g12.f25696x = new long[0];
                                            break;
                                        }
                                        g12.f25695w[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        g12.f25696x[i15] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j10 = g12.f25694v;
                        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                            this.f25470f.D(new C2976b1(j10, g12.f25696x, g12.f25695w));
                            this.f25477n = true;
                        }
                        z6 = true;
                        z9 = false;
                        if (!this.f25472h) {
                        }
                        this.f25473j = 4;
                        this.f25471g = 2;
                        if (z6) {
                        }
                    }
                    ((K0) r02).a(this.f25475l, false);
                    z9 = false;
                    z6 = false;
                    if (!this.f25472h) {
                    }
                    this.f25473j = 4;
                    this.f25471g = 2;
                    if (z6) {
                    }
                } else if (this.f25479p != null) {
                    if (!this.f25477n) {
                        this.f25470f.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
                        this.f25477n = true;
                    }
                    I1 i16 = this.f25479p;
                    Cr g11 = g((K0) r02);
                    i16.getClass();
                    int K10 = g11.K();
                    int i17 = K10 >> 4;
                    int i18 = K10 & 15;
                    if (i18 != 7) {
                        throw new H1(D.x.k(i18, "Video format not supported: ", new StringBuilder(String.valueOf(i18).length() + 28)));
                    }
                    i16.f26170A = i17;
                    if (i17 != 5) {
                        int K11 = g11.K();
                        g11.v(3);
                        byte[] bArr2 = g11.f24997a;
                        int i19 = g11.f24998b;
                        int i20 = i19 + 1;
                        g11.f24998b = i20;
                        int i21 = bArr2[i19] & 255;
                        int i22 = i19 + 2;
                        g11.f24998b = i22;
                        int i23 = bArr2[i20] & 255;
                        g11.f24998b = i19 + 3;
                        long j11 = (bArr2[i22] & 255) | ((i21 << 24) >> 8) | (i23 << 8);
                        boolean z12 = true;
                        InterfaceC3566m1 interfaceC3566m13 = (InterfaceC3566m1) i16.f27380n;
                        if (K11 == 0) {
                            if (!i16.f26174y) {
                                byte[] bArr3 = new byte[g11.B()];
                                Cr cr3 = new Cr(bArr3);
                                g11.H(bArr3, 0, g11.B());
                                D0 a9 = D0.a(cr3);
                                i16.f26173x = a9.f25036b;
                                C3322hP c3322hP4 = new C3322hP();
                                c3322hP4.d("video/x-flv");
                                c3322hP4.e(com.anythink.basead.exoplayer.k.o.f9237h);
                                c3322hP4.f31554j = a9.f25045l;
                                c3322hP4.f31565u = a9.f25037c;
                                c3322hP4.f31566v = a9.f25038d;
                                c3322hP4.f31533B = a9.f25044k;
                                c3322hP4.f31561q = a9.f25035a;
                                interfaceC3566m13.e(new DP(c3322hP4));
                                i16.f26174y = true;
                            }
                        } else if (K11 == 1 && i16.f26174y) {
                            int i24 = i16.f26170A == 1 ? 1 : 0;
                            j6 = -9223372036854775807L;
                            if (i16.f26175z) {
                                i = i24;
                            } else {
                                if (i24 != 0) {
                                    i = 1;
                                }
                                z12 = false;
                                if (z12) {
                                    z9 = true;
                                    z6 = true;
                                    if (!this.f25472h) {
                                    }
                                    this.f25473j = 4;
                                    this.f25471g = 2;
                                    if (z6) {
                                    }
                                }
                            }
                            Cr cr4 = i16.f26172w;
                            byte[] bArr4 = cr4.f24997a;
                            bArr4[0] = 0;
                            bArr4[1] = 0;
                            bArr4[2] = 0;
                            int i25 = 4 - i16.f26173x;
                            int i26 = 0;
                            while (g11.B() > 0) {
                                g11.H(cr4.f24997a, i25, i16.f26173x);
                                cr4.E(0);
                                int h3 = cr4.h();
                                Cr cr5 = i16.f26171v;
                                cr5.E(0);
                                interfaceC3566m13.a(4, cr5);
                                interfaceC3566m13.a(h3, g11);
                                i26 = i26 + 4 + h3;
                            }
                            ((InterfaceC3566m1) i16.f27380n).c((j11 * 1000) + j9, i, i26, 0, null);
                            i16.f26175z = true;
                            if (z12) {
                            }
                        }
                        j6 = -9223372036854775807L;
                        z12 = false;
                        if (z12) {
                        }
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    z9 = false;
                    z6 = true;
                    if (!this.f25472h) {
                    }
                    this.f25473j = 4;
                    this.f25471g = 2;
                    if (z6) {
                    }
                } else {
                    j6 = -9223372036854775807L;
                    ((K0) r02).a(this.f25475l, false);
                    z9 = false;
                    z6 = false;
                    if (!this.f25472h) {
                    }
                    this.f25473j = 4;
                    this.f25471g = 2;
                    if (z6) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f25470f = (FQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0) {
            this.f25471g = 1;
            this.f25472h = false;
        } else {
            this.f25471g = 3;
        }
        this.f25473j = 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        Cr cr = this.f25465a;
        K0 k02 = (K0) r02;
        k02.E(cr.f24997a, 0, 3, false);
        cr.E(0);
        if (cr.O() == 4607062) {
            k02.E(cr.f24997a, 0, 2, false);
            cr.E(0);
            if ((cr.L() & 250) == 0) {
                k02.E(cr.f24997a, 0, 4, false);
                cr.E(0);
                int b9 = cr.b();
                k02.f26573y = 0;
                k02.d(b9, false);
                k02.E(cr.f24997a, 0, 4, false);
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
        int i = this.f25475l;
        Cr cr = this.f25468d;
        byte[] bArr = cr.f24997a;
        if (i > bArr.length) {
            int length = bArr.length;
            cr.z(0, new byte[Math.max(length + length, i)]);
        } else {
            cr.E(0);
        }
        cr.C(this.f25475l);
        k02.A(cr.f24997a, 0, this.f25475l, false);
        return cr;
    }
}
