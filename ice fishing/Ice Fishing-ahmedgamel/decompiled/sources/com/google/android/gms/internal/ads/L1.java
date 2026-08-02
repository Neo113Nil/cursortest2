package com.google.android.gms.internal.ads;

import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class L1 implements Q0 {

    /* renamed from: b, reason: collision with root package name */
    public FQ f26810b;

    /* renamed from: c, reason: collision with root package name */
    public int f26811c;

    /* renamed from: d, reason: collision with root package name */
    public int f26812d;

    /* renamed from: e, reason: collision with root package name */
    public int f26813e;

    /* renamed from: g, reason: collision with root package name */
    public P1 f26815g;

    /* renamed from: h, reason: collision with root package name */
    public K0 f26816h;
    public C3404j1 i;

    /* renamed from: j, reason: collision with root package name */
    public U2 f26817j;

    /* renamed from: a, reason: collision with root package name */
    public final Cr f26809a = new Cr(2);

    /* renamed from: f, reason: collision with root package name */
    public long f26814f = -1;

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
        String m9;
        long j6;
        C3404j1 c3404j1;
        C3523lC c3523lC;
        int i;
        int i4;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        XmlPullParser newPullParser;
        long j14;
        C3523lC c3523lC2;
        long j15;
        char c9 = 65535;
        int i6 = this.f26811c;
        Cr cr = this.f26809a;
        long j16 = -1;
        if (i6 == 0) {
            cr.y(2);
            ((K0) r02).A(cr.f24997a, 0, 2, false);
            int L2 = cr.L();
            this.f26812d = L2;
            if (L2 == 65498) {
                if (this.f26814f != -1) {
                    this.f26811c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((L2 < 65488 || L2 > 65497) && L2 != 65281) {
                this.f26811c = 1;
            }
            return 0;
        }
        if (i6 == 1) {
            K0 k02 = (K0) r02;
            cr.y(2);
            k02.E(cr.f24997a, 0, 2, false);
            this.f26813e = cr.L() - 2;
            k02.a(2, false);
            this.f26811c = 2;
            return 0;
        }
        if (i6 != 2) {
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || r02 != this.f26816h) {
                    K0 k03 = (K0) r02;
                    this.f26816h = k03;
                    this.i = new C3404j1(k03, this.f26814f);
                }
                U2 u22 = this.f26817j;
                u22.getClass();
                int a9 = u22.a(this.i, u02);
                if (a9 == 1) {
                    u02.f28641n += this.f26814f;
                }
                return a9;
            }
            long j17 = ((K0) r02).f26571w;
            long j18 = this.f26814f;
            if (j17 != j18) {
                u02.f28641n = j18;
                return 1;
            }
            K0 k04 = (K0) r02;
            if (!k04.E(cr.f24997a, 0, 1, true)) {
                g();
                return 0;
            }
            k04.f26573y = 0;
            if (this.f26817j == null) {
                this.f26817j = new U2(InterfaceC3837r3.f34276h0, 8);
            }
            C3404j1 c3404j12 = new C3404j1(k04, this.f26814f);
            this.i = c3404j12;
            if (!this.f26817j.d(c3404j12)) {
                g();
                return 0;
            }
            U2 u23 = this.f26817j;
            long j19 = this.f26814f;
            FQ fq = this.f26810b;
            fq.getClass();
            u23.b(new C3404j1(j19, fq, 1));
            P1 p1 = this.f26815g;
            p1.getClass();
            FQ fq2 = this.f26810b;
            fq2.getClass();
            InterfaceC3566m1 C8 = fq2.C(1024, 4);
            C3322hP c3322hP = new C3322hP();
            c3322hP.d("image/jpeg");
            c3322hP.f31555k = new O3(p1);
            C8.e(new DP(c3322hP));
            this.f26811c = 5;
            return 0;
        }
        if (this.f26812d == 65505) {
            Cr cr2 = new Cr(this.f26813e);
            ((K0) r02).A(cr2.f24997a, 0, this.f26813e, false);
            if (this.f26815g == null && "http://ns.adobe.com/xap/1.0/".equals(cr2.m()) && (m9 = cr2.m()) != null) {
                long j20 = ((K0) r02).f26570v;
                P1 p12 = null;
                if (j20 != -1) {
                    try {
                        newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        newPullParser.setInput(new StringReader(m9));
                        newPullParser.next();
                    } catch (U4 | NumberFormatException | XmlPullParserException unused) {
                    }
                    try {
                    } catch (U4 | NumberFormatException | XmlPullParserException unused2) {
                        AbstractC2991bG.y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c3404j1 = null;
                        if (c3404j1 != null) {
                        }
                        this.f26815g = p12;
                        if (p12 != null) {
                        }
                        this.f26811c = 0;
                        return 0;
                    }
                    if (!AbstractC2659Kg.s(newPullParser, "x:xmpmeta")) {
                        throw U4.a(null, "Couldn't find xmp metadata");
                    }
                    PB pb = RB.f27933u;
                    C3523lC c3523lC3 = C3523lC.f32525x;
                    long j21 = com.anythink.basead.exoplayer.b.f7168b;
                    loop0: while (true) {
                        newPullParser.next();
                        char c10 = c9;
                        try {
                            if (AbstractC2659Kg.s(newPullParser, "rdf:Description")) {
                                String[] strArr = AbstractC2792Sd.f28296v;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= 4) {
                                        j6 = j16;
                                        break loop0;
                                    }
                                    j6 = j16;
                                    String v9 = AbstractC2659Kg.v(newPullParser, strArr[i9]);
                                    if (v9 == null) {
                                        i9++;
                                        j16 = j6;
                                    } else {
                                        if (Integer.parseInt(v9) != 1) {
                                            break;
                                        }
                                        String[] strArr2 = AbstractC2792Sd.f28297w;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= 4) {
                                                break;
                                            }
                                            String v10 = AbstractC2659Kg.v(newPullParser, strArr2[i10]);
                                            if (v10 != null) {
                                                j14 = Long.parseLong(v10);
                                            } else {
                                                i10++;
                                            }
                                        }
                                        j14 = com.anythink.basead.exoplayer.b.f7168b;
                                        String[] strArr3 = AbstractC2792Sd.f28298x;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= 2) {
                                                c3523lC2 = C3523lC.f32525x;
                                                break;
                                            }
                                            String v11 = AbstractC2659Kg.v(newPullParser, strArr3[i11]);
                                            if (v11 != null) {
                                                c3523lC2 = RB.k(new M1("image/jpeg", 0L, 0L), new M1(com.anythink.basead.exoplayer.k.o.f9234e, Long.parseLong(v11), 0L));
                                                break;
                                            }
                                            i11++;
                                        }
                                        j15 = j14;
                                        c3523lC3 = c3523lC2;
                                    }
                                }
                            } else {
                                if (AbstractC2659Kg.s(newPullParser, "Container:Directory")) {
                                    c3523lC3 = AbstractC2792Sd.s(newPullParser, "Container", "Item");
                                } else if (AbstractC2659Kg.s(newPullParser, "GContainer:Directory")) {
                                    c3523lC3 = AbstractC2792Sd.s(newPullParser, "GContainer", "GContainerItem");
                                }
                                j15 = j21;
                                j6 = j16;
                            }
                            long j22 = j15;
                            if (!AbstractC2659Kg.l(newPullParser, "x:xmpmeta")) {
                                long j23 = j6;
                                j21 = j22;
                                j16 = j23;
                                c9 = c10;
                            } else if (!c3523lC3.isEmpty()) {
                                c3404j1 = new C3404j1(j22, c3523lC3, 2);
                            }
                        } catch (U4 | NumberFormatException | XmlPullParserException unused3) {
                            j6 = j16;
                            AbstractC2991bG.y("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            c3404j1 = null;
                            if (c3404j1 != null) {
                                j9 = j6;
                                j10 = j9;
                                j11 = j10;
                                j12 = j11;
                                while (i4 >= 0) {
                                }
                                if (j11 != j6) {
                                    p12 = new P1(j9, j10, c3404j1.f31943u, j11, j12);
                                }
                            }
                            this.f26815g = p12;
                            if (p12 != null) {
                            }
                            this.f26811c = 0;
                            return 0;
                        }
                    }
                    c3404j1 = null;
                    if (c3404j1 != null && (i = (c3523lC = (C3523lC) c3404j1.f31944v).f32527w) >= 2) {
                        j9 = j6;
                        j10 = j9;
                        j11 = j10;
                        j12 = j11;
                        for (i4 = i - 1; i4 >= 0; i4--) {
                            M1 m12 = (M1) c3523lC.get(i4);
                            String str = m12.f26998a;
                            boolean z6 = str.equals(com.anythink.basead.exoplayer.k.o.f9234e) || str.equals("video/quicktime");
                            if (i4 == 0) {
                                j20 -= m12.f27000c;
                                j13 = 0;
                            } else {
                                j13 = j20 - m12.f26999b;
                            }
                            long j24 = j13;
                            long j25 = j20;
                            j20 = j24;
                            if (z6 && j20 != j25) {
                                j12 = j25 - j20;
                                j11 = j20;
                            }
                            if (i4 == 0) {
                                j10 = j25;
                            }
                            if (i4 == 0) {
                                j9 = j20;
                            }
                        }
                        if (j11 != j6 && j12 != j6 && j9 != j6 && j10 != j6) {
                            p12 = new P1(j9, j10, c3404j1.f31943u, j11, j12);
                        }
                    }
                }
                this.f26815g = p12;
                if (p12 != null) {
                    this.f26814f = p12.f27497d;
                }
            }
        } else {
            ((K0) r02).a(this.f26813e, false);
        }
        this.f26811c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        this.f26810b = (FQ) s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        if (j6 == 0) {
            this.f26811c = 0;
            this.f26817j = null;
        } else if (this.f26811c == 5) {
            U2 u22 = this.f26817j;
            u22.getClass();
            u22.c(j6, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        String m9;
        K0 k02 = (K0) r02;
        Cr cr = this.f26809a;
        cr.y(2);
        k02.E(cr.f24997a, 0, 2, false);
        if (cr.L() == 65496) {
            while (true) {
                cr.y(2);
                k02.E(cr.f24997a, 0, 2, false);
                int L2 = cr.L();
                this.f26812d = L2;
                if (L2 == 65498) {
                    break;
                }
                cr.y(2);
                k02.E(cr.f24997a, 0, 2, false);
                int L6 = cr.L() - 2;
                if (L6 < 0) {
                    break;
                }
                if (this.f26812d != 65505) {
                    k02.d(L6, false);
                } else {
                    cr.y(L6);
                    k02.E(cr.f24997a, 0, L6, false);
                    if (Objects.equals(cr.m(), "http://ns.adobe.com/xap/1.0/") && (m9 = cr.m()) != null) {
                        String[] strArr = AbstractC2792Sd.f28296v;
                        for (int i = 0; i < 4; i++) {
                            if (m9.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
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
        FQ fq = this.f26810b;
        fq.getClass();
        fq.B();
        this.f26810b.D(new V0(com.anythink.basead.exoplayer.b.f7168b, 0L));
        this.f26811c = 6;
    }
}
