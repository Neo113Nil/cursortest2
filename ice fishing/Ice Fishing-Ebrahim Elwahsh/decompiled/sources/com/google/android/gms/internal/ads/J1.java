package com.google.android.gms.internal.ads;

import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class J1 implements O0 {

    /* renamed from: b, reason: collision with root package name */
    public PQ f25680b;

    /* renamed from: c, reason: collision with root package name */
    public int f25681c;

    /* renamed from: d, reason: collision with root package name */
    public int f25682d;

    /* renamed from: e, reason: collision with root package name */
    public int f25683e;

    /* renamed from: g, reason: collision with root package name */
    public N1 f25685g;

    /* renamed from: h, reason: collision with root package name */
    public J0 f25686h;
    public C3288h1 i;

    /* renamed from: j, reason: collision with root package name */
    public S2 f25687j;

    /* renamed from: a, reason: collision with root package name */
    public final Lr f25679a = new Lr(2);

    /* renamed from: f, reason: collision with root package name */
    public long f25684f = -1;

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f25680b = (PQ) q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        String m8;
        J0 j02 = (J0) p02;
        Lr lr = this.f25679a;
        lr.y(2);
        j02.I(lr.f26233a, 0, 2, false);
        if (lr.L() == 65496) {
            while (true) {
                lr.y(2);
                j02.I(lr.f26233a, 0, 2, false);
                int L8 = lr.L();
                this.f25682d = L8;
                if (L8 == 65498) {
                    break;
                }
                lr.y(2);
                j02.I(lr.f26233a, 0, 2, false);
                int L9 = lr.L() - 2;
                if (L9 < 0) {
                    break;
                }
                if (this.f25682d != 65505) {
                    j02.d(L9, false);
                } else {
                    lr.y(L9);
                    j02.I(lr.f26233a, 0, L9, false);
                    if (Objects.equals(lr.m(), "http://ns.adobe.com/xap/1.0/") && (m8 = lr.m()) != null) {
                        String[] strArr = AbstractC3035cL.f29689n;
                        for (int i = 0; i < 4; i++) {
                            if (m8.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        if (j9 == 0) {
            this.f25681c = 0;
            this.f25687j = null;
        } else if (this.f25681c == 5) {
            S2 s22 = this.f25687j;
            s22.getClass();
            s22.c(j9, j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x018f, code lost:
    
        if (r2 == r15) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0222  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        String m8;
        long j9;
        C3288h1 c3288h1;
        C3675oC c3675oC;
        int i;
        int i4;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        XmlPullParser newPullParser;
        long j15;
        C3675oC c3675oC2;
        long j16;
        char c4 = 65535;
        int i9 = this.f25681c;
        Lr lr = this.f25679a;
        long j17 = -1;
        if (i9 == 0) {
            lr.y(2);
            ((J0) p02).E(lr.f26233a, 0, 2, false);
            int L8 = lr.L();
            this.f25682d = L8;
            if (L8 == 65498) {
                if (this.f25684f != -1) {
                    this.f25681c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((L8 < 65488 || L8 > 65497) && L8 != 65281) {
                this.f25681c = 1;
            }
            return 0;
        }
        if (i9 == 1) {
            J0 j02 = (J0) p02;
            lr.y(2);
            j02.I(lr.f26233a, 0, 2, false);
            this.f25683e = lr.L() - 2;
            j02.b(2, false);
            this.f25681c = 2;
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
                if (this.i == null || p02 != this.f25686h) {
                    J0 j03 = (J0) p02;
                    this.f25686h = j03;
                    this.i = new C3288h1(j03, this.f25684f);
                }
                S2 s22 = this.f25687j;
                s22.getClass();
                int e6 = s22.e(this.i, s02);
                if (e6 == 1) {
                    s02.f27467n += this.f25684f;
                }
                return e6;
            }
            long j18 = ((J0) p02).f25675w;
            long j19 = this.f25684f;
            if (j18 != j19) {
                s02.f27467n = j19;
                return 1;
            }
            J0 j04 = (J0) p02;
            if (!j04.I(lr.f26233a, 0, 1, true)) {
                g();
                return 0;
            }
            j04.f25677y = 0;
            if (this.f25687j == null) {
                this.f25687j = new S2(InterfaceC3720p3.m0, 8);
            }
            C3288h1 c3288h12 = new C3288h1(j04, this.f25684f);
            this.i = c3288h12;
            if (!this.f25687j.b(c3288h12)) {
                g();
                return 0;
            }
            S2 s23 = this.f25687j;
            long j20 = this.f25684f;
            PQ pq = this.f25680b;
            pq.getClass();
            s23.a(new C3288h1(j20, pq, 1));
            N1 n1 = this.f25685g;
            n1.getClass();
            PQ pq2 = this.f25680b;
            pq2.getClass();
            InterfaceC3448k1 x3 = pq2.x(1024, 4);
            C4065vP c4065vP = new C4065vP();
            c4065vP.d("image/jpeg");
            c4065vP.f34782k = new R3(n1);
            x3.e(new TP(c4065vP));
            this.f25681c = 5;
            return 0;
        }
        if (this.f25682d == 65505) {
            Lr lr2 = new Lr(this.f25683e);
            ((J0) p02).E(lr2.f26233a, 0, this.f25683e, false);
            if (this.f25685g == null && "http://ns.adobe.com/xap/1.0/".equals(lr2.m()) && (m8 = lr2.m()) != null) {
                long j21 = ((J0) p02).f25674v;
                N1 n12 = null;
                if (j21 != -1) {
                    try {
                        newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        newPullParser.setInput(new StringReader(m8));
                        newPullParser.next();
                    } catch (W4 | NumberFormatException | XmlPullParserException unused) {
                    }
                    try {
                    } catch (W4 | NumberFormatException | XmlPullParserException unused2) {
                        AbstractC3217fl.I("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c3288h1 = null;
                        if (c3288h1 != null) {
                        }
                        this.f25685g = n12;
                        if (n12 != null) {
                        }
                        this.f25681c = 0;
                        return 0;
                    }
                    if (!AbstractC3194fG.r(newPullParser, "x:xmpmeta")) {
                        throw W4.a(null, "Couldn't find xmp metadata");
                    }
                    SB sb = UB.f27942u;
                    C3675oC c3675oC3 = C3675oC.f33115x;
                    long j22 = com.anythink.basead.exoplayer.b.f6539b;
                    loop0: while (true) {
                        newPullParser.next();
                        char c9 = c4;
                        try {
                            if (AbstractC3194fG.r(newPullParser, "rdf:Description")) {
                                String[] strArr = AbstractC3035cL.f29689n;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 4) {
                                        j9 = j17;
                                        break loop0;
                                    }
                                    j9 = j17;
                                    String t9 = AbstractC3194fG.t(newPullParser, strArr[i10]);
                                    if (t9 == null) {
                                        i10++;
                                        j17 = j9;
                                    } else {
                                        if (Integer.parseInt(t9) != 1) {
                                            break;
                                        }
                                        String[] strArr2 = AbstractC3035cL.f29690u;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= 4) {
                                                break;
                                            }
                                            String t10 = AbstractC3194fG.t(newPullParser, strArr2[i11]);
                                            if (t10 != null) {
                                                j15 = Long.parseLong(t10);
                                            } else {
                                                i11++;
                                            }
                                        }
                                        j15 = com.anythink.basead.exoplayer.b.f6539b;
                                        String[] strArr3 = AbstractC3035cL.f29691v;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= 2) {
                                                c3675oC2 = C3675oC.f33115x;
                                                break;
                                            }
                                            String t11 = AbstractC3194fG.t(newPullParser, strArr3[i12]);
                                            if (t11 != null) {
                                                c3675oC2 = UB.k(new K1("image/jpeg", 0L, 0L), new K1(com.anythink.basead.exoplayer.k.o.f8605e, Long.parseLong(t11), 0L));
                                                break;
                                            }
                                            i12++;
                                        }
                                        j16 = j15;
                                        c3675oC3 = c3675oC2;
                                    }
                                }
                            } else {
                                if (AbstractC3194fG.r(newPullParser, "Container:Directory")) {
                                    c3675oC3 = AbstractC3035cL.x(newPullParser, "Container", "Item");
                                } else if (AbstractC3194fG.r(newPullParser, "GContainer:Directory")) {
                                    c3675oC3 = AbstractC3035cL.x(newPullParser, "GContainer", "GContainerItem");
                                }
                                j16 = j22;
                                j9 = j17;
                            }
                            long j23 = j16;
                            if (!AbstractC3194fG.j(newPullParser, "x:xmpmeta")) {
                                long j24 = j9;
                                j22 = j23;
                                j17 = j24;
                                c4 = c9;
                            } else if (!c3675oC3.isEmpty()) {
                                c3288h1 = new C3288h1(j23, c3675oC3, 2);
                            }
                        } catch (W4 | NumberFormatException | XmlPullParserException unused3) {
                            j9 = j17;
                            AbstractC3217fl.I("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                            c3288h1 = null;
                            if (c3288h1 != null) {
                                j10 = j9;
                                j11 = j10;
                                j12 = j11;
                                j13 = j12;
                                while (i4 >= 0) {
                                }
                                if (j12 != j9) {
                                    n12 = new N1(j10, j11, c3288h1.f31133u, j12, j13);
                                }
                            }
                            this.f25685g = n12;
                            if (n12 != null) {
                            }
                            this.f25681c = 0;
                            return 0;
                        }
                    }
                    c3288h1 = null;
                    if (c3288h1 != null && (i = (c3675oC = (C3675oC) c3288h1.f31134v).f33117w) >= 2) {
                        j10 = j9;
                        j11 = j10;
                        j12 = j11;
                        j13 = j12;
                        for (i4 = i - 1; i4 >= 0; i4--) {
                            K1 k12 = (K1) c3675oC.get(i4);
                            String str = k12.f25864a;
                            boolean z8 = str.equals(com.anythink.basead.exoplayer.k.o.f8605e) || str.equals("video/quicktime");
                            if (i4 == 0) {
                                j21 -= k12.f25866c;
                                j14 = 0;
                            } else {
                                j14 = j21 - k12.f25865b;
                            }
                            long j25 = j14;
                            long j26 = j21;
                            j21 = j25;
                            if (z8 && j21 != j26) {
                                j13 = j26 - j21;
                                j12 = j21;
                            }
                            if (i4 == 0) {
                                j11 = j26;
                            }
                            if (i4 == 0) {
                                j10 = j21;
                            }
                        }
                        if (j12 != j9 && j13 != j9 && j10 != j9 && j11 != j9) {
                            n12 = new N1(j10, j11, c3288h1.f31133u, j12, j13);
                        }
                    }
                }
                this.f25685g = n12;
                if (n12 != null) {
                    this.f25684f = n12.f26415d;
                }
            }
        } else {
            ((J0) p02).b(this.f25683e, false);
        }
        this.f25681c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final void g() {
        PQ pq = this.f25680b;
        pq.getClass();
        pq.v();
        this.f25680b.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
        this.f25681c = 6;
    }
}
