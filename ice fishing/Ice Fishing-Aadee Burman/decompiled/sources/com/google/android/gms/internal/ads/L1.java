package com.google.android.gms.internal.ads;

import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class L1 implements Q0 {

    /* renamed from: b, reason: collision with root package name */
    public CQ f26010b;

    /* renamed from: c, reason: collision with root package name */
    public int f26011c;

    /* renamed from: d, reason: collision with root package name */
    public int f26012d;

    /* renamed from: e, reason: collision with root package name */
    public int f26013e;

    /* renamed from: g, reason: collision with root package name */
    public P1 f26015g;

    /* renamed from: h, reason: collision with root package name */
    public K0 f26016h;
    public C3381j1 i;

    /* renamed from: j, reason: collision with root package name */
    public U2 f26017j;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f26009a = new Cr(2);

    /* renamed from: f, reason: collision with root package name */
    public long f26014f = -1;

    /* JADX WARN: Code restructure failed: missing block: B:130:0x018f, code lost:
    
        if (r2 == r15) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0222  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        String m4;
        long j6;
        C3381j1 c3381j1;
        C3500lC c3500lC;
        int i;
        int i6;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        XmlPullParser newPullParser;
        long j14;
        C3500lC c3500lC2;
        long j15;
        char c9 = 65535;
        int i9 = this.f26011c;
        Cr cr = this.f26009a;
        long j16 = -1;
        if (i9 == 0) {
            cr.y(2);
            ((K0) r02).z(cr.f24252a, 0, 2, false);
            int L6 = cr.L();
            this.f26012d = L6;
            if (L6 == 65498) {
                if (this.f26014f != -1) {
                    this.f26011c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((L6 < 65488 || L6 > 65497) && L6 != 65281) {
                this.f26011c = 1;
            }
            return 0;
        }
        if (i9 == 1) {
            K0 k02 = (K0) r02;
            cr.y(2);
            k02.A(cr.f24252a, 0, 2, false);
            this.f26013e = cr.L() - 2;
            k02.a(2, false);
            this.f26011c = 2;
            return 0;
        }
        if (i9 != 2) {
            if (i9 != 4) {
                if (i9 != 5) {
                    if (i9 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || r02 != this.f26016h) {
                    K0 k03 = (K0) r02;
                    this.f26016h = k03;
                    this.i = new C3381j1(k03, this.f26014f);
                }
                U2 u22 = this.f26017j;
                u22.getClass();
                int a9 = u22.a(this.i, u02);
                if (a9 == 1) {
                    u02.f27844n += this.f26014f;
                }
                return a9;
            }
            long j17 = ((K0) r02).f25819w;
            long j18 = this.f26014f;
            if (j17 != j18) {
                u02.f27844n = j18;
                return 1;
            }
            K0 k04 = (K0) r02;
            if (!k04.A(cr.f24252a, 0, 1, true)) {
                g();
                return 0;
            }
            k04.f25821y = 0;
            if (this.f26017j == null) {
                this.f26017j = new U2(InterfaceC3814r3.m0, 8);
            }
            C3381j1 c3381j12 = new C3381j1(k04, this.f26014f);
            this.i = c3381j12;
            if (!this.f26017j.d(c3381j12)) {
                g();
                return 0;
            }
            U2 u23 = this.f26017j;
            long j19 = this.f26014f;
            CQ cq = this.f26010b;
            cq.getClass();
            u23.b(new C3381j1(j19, cq, 1));
            P1 p1 = this.f26015g;
            p1.getClass();
            CQ cq2 = this.f26010b;
            cq2.getClass();
            InterfaceC3543m1 C8 = cq2.C(1024, 4);
            C3299hP c3299hP = new C3299hP();
            c3299hP.d("image/jpeg");
            c3299hP.f30789k = new O3(p1);
            C8.e(new DP(c3299hP));
            this.f26011c = 5;
            return 0;
        }
        if (this.f26012d == 65505) {
            Cr cr2 = new Cr(this.f26013e);
            ((K0) r02).z(cr2.f24252a, 0, this.f26013e, false);
            if (this.f26015g == null && "http://ns.adobe.com/xap/1.0/".equals(cr2.m()) && (m4 = cr2.m()) != null) {
                long j20 = ((K0) r02).f25818v;
                P1 p12 = null;
                if (j20 != -1) {
                    try {
                        newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        newPullParser.setInput(new StringReader(m4));
                        newPullParser.next();
                    } catch (U4 | NumberFormatException | XmlPullParserException unused) {
                    }
                    try {
                    } catch (U4 | NumberFormatException | XmlPullParserException unused2) {
                        AbstractC2968bG.y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c3381j1 = null;
                        if (c3381j1 != null) {
                        }
                        this.f26015g = p12;
                        if (p12 != null) {
                        }
                        this.f26011c = 0;
                        return 0;
                    }
                    if (!AbstractC2639Kg.s(newPullParser, "x:xmpmeta")) {
                        throw U4.a(null, "Couldn't find xmp metadata");
                    }
                    PB pb = RB.f27177u;
                    C3500lC c3500lC3 = C3500lC.f31745x;
                    long j21 = com.anythink.basead.exoplayer.b.f6382b;
                    loop0: while (true) {
                        newPullParser.next();
                        char c10 = c9;
                        try {
                            if (AbstractC2639Kg.s(newPullParser, "rdf:Description")) {
                                String[] strArr = AbstractC2772Sd.f27504v;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 4) {
                                        j6 = j16;
                                        break loop0;
                                    }
                                    j6 = j16;
                                    String v9 = AbstractC2639Kg.v(newPullParser, strArr[i10]);
                                    if (v9 == null) {
                                        i10++;
                                        j16 = j6;
                                    } else {
                                        if (Integer.parseInt(v9) != 1) {
                                            break;
                                        }
                                        String[] strArr2 = AbstractC2772Sd.f27505w;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= 4) {
                                                break;
                                            }
                                            String v10 = AbstractC2639Kg.v(newPullParser, strArr2[i11]);
                                            if (v10 != null) {
                                                j14 = Long.parseLong(v10);
                                            } else {
                                                i11++;
                                            }
                                        }
                                        j14 = com.anythink.basead.exoplayer.b.f6382b;
                                        String[] strArr3 = AbstractC2772Sd.f27506x;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= 2) {
                                                c3500lC2 = C3500lC.f31745x;
                                                break;
                                            }
                                            String v11 = AbstractC2639Kg.v(newPullParser, strArr3[i12]);
                                            if (v11 != null) {
                                                c3500lC2 = RB.k(new M1("image/jpeg", 0L, 0L), new M1(com.anythink.basead.exoplayer.k.o.f8448e, Long.parseLong(v11), 0L));
                                                break;
                                            }
                                            i12++;
                                        }
                                        j15 = j14;
                                        c3500lC3 = c3500lC2;
                                    }
                                }
                            } else {
                                if (AbstractC2639Kg.s(newPullParser, "Container:Directory")) {
                                    c3500lC3 = AbstractC2772Sd.s(newPullParser, "Container", "Item");
                                } else if (AbstractC2639Kg.s(newPullParser, "GContainer:Directory")) {
                                    c3500lC3 = AbstractC2772Sd.s(newPullParser, "GContainer", "GContainerItem");
                                }
                                j15 = j21;
                                j6 = j16;
                            }
                            long j22 = j15;
                            if (!AbstractC2639Kg.l(newPullParser, "x:xmpmeta")) {
                                long j23 = j6;
                                j21 = j22;
                                j16 = j23;
                                c9 = c10;
                            } else if (!c3500lC3.isEmpty()) {
                                c3381j1 = new C3381j1(j22, c3500lC3, 2);
                            }
                        } catch (U4 | NumberFormatException | XmlPullParserException unused3) {
                            j6 = j16;
                            AbstractC2968bG.y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            c3381j1 = null;
                            if (c3381j1 != null) {
                                j9 = j6;
                                j10 = j9;
                                j11 = j10;
                                j12 = j11;
                                while (i6 >= 0) {
                                }
                                if (j11 != j6) {
                                    p12 = new P1(j9, j10, c3381j1.f31156u, j11, j12);
                                }
                            }
                            this.f26015g = p12;
                            if (p12 != null) {
                            }
                            this.f26011c = 0;
                            return 0;
                        }
                    }
                    c3381j1 = null;
                    if (c3381j1 != null && (i = (c3500lC = (C3500lC) c3381j1.f31157v).f31747w) >= 2) {
                        j9 = j6;
                        j10 = j9;
                        j11 = j10;
                        j12 = j11;
                        for (i6 = i - 1; i6 >= 0; i6--) {
                            M1 m12 = (M1) c3500lC.get(i6);
                            String str = m12.f26207a;
                            boolean z3 = str.equals(com.anythink.basead.exoplayer.k.o.f8448e) || str.equals("video/quicktime");
                            if (i6 == 0) {
                                j20 -= m12.f26209c;
                                j13 = 0;
                            } else {
                                j13 = j20 - m12.f26208b;
                            }
                            long j24 = j13;
                            long j25 = j20;
                            j20 = j24;
                            if (z3 && j20 != j25) {
                                j12 = j25 - j20;
                                j11 = j20;
                            }
                            if (i6 == 0) {
                                j10 = j25;
                            }
                            if (i6 == 0) {
                                j9 = j20;
                            }
                        }
                        if (j11 != j6 && j12 != j6 && j9 != j6 && j10 != j6) {
                            p12 = new P1(j9, j10, c3381j1.f31156u, j11, j12);
                        }
                    }
                }
                this.f26015g = p12;
                if (p12 != null) {
                    this.f26014f = p12.f26714d;
                }
            }
        } else {
            ((K0) r02).a(this.f26013e, false);
        }
        this.f26011c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f26010b = (CQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0) {
            this.f26011c = 0;
            this.f26017j = null;
        } else if (this.f26011c == 5) {
            U2 u22 = this.f26017j;
            u22.getClass();
            u22.c(j6, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        String m4;
        K0 k02 = (K0) r02;
        Cr cr = this.f26009a;
        cr.y(2);
        k02.A(cr.f24252a, 0, 2, false);
        if (cr.L() == 65496) {
            while (true) {
                cr.y(2);
                k02.A(cr.f24252a, 0, 2, false);
                int L6 = cr.L();
                this.f26012d = L6;
                if (L6 == 65498) {
                    break;
                }
                cr.y(2);
                k02.A(cr.f24252a, 0, 2, false);
                int L8 = cr.L() - 2;
                if (L8 < 0) {
                    break;
                }
                if (this.f26012d != 65505) {
                    k02.c(L8, false);
                } else {
                    cr.y(L8);
                    k02.A(cr.f24252a, 0, L8, false);
                    if (Objects.equals(cr.m(), "http://ns.adobe.com/xap/1.0/") && (m4 = cr.m()) != null) {
                        String[] strArr = AbstractC2772Sd.f27504v;
                        for (int i = 0; i < 4; i++) {
                            if (m4.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final void g() {
        CQ cq = this.f26010b;
        cq.getClass();
        cq.B();
        this.f26010b.D(new V0(com.anythink.basead.exoplayer.b.f6382b, 0L));
        this.f26011c = 6;
    }
}
