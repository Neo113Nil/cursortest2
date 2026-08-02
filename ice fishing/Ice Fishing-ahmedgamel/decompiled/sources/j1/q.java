package j1;

import E2.M;
import android.graphics.Color;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.WP;
import f1.C4515a;
import f1.C4516b;
import h1.C4566d;
import i1.C4586c;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4639a;
import k1.C4641c;
import l1.AbstractC4668c;
import m1.C4739a;
import q5.C4876a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38459a = C4639a.d("nm", com.anythink.expressad.foundation.g.g.a.b.aW, "refId", "ty", "parent", "sw", com.anythink.expressad.foundation.d.e.f19461u, com.anythink.expressad.f.a.b.bI, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", com.anythink.expressad.foundation.g.g.a.b.bb, com.anythink.core.common.w.f17699a, "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    public static final C4639a f38460b = C4639a.d("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final C4639a f38461c = C4639a.d("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v64, types: [int[]] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v65 */
    public static C4566d a(C4641c c4641c, Z0.i iVar) {
        boolean z6;
        boolean z9;
        int i;
        int i4;
        boolean z10;
        C4516b c4516b;
        C4516b c4516b2;
        C4516b c4516b3;
        ?? r52;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c4641c.j();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        boolean z11 = false;
        boolean z12 = true;
        long j6 = 0;
        long j9 = -1;
        float f2 = 1.0f;
        String str = "UNSET";
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i6 = 0;
        int i9 = 0;
        boolean z13 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z14 = false;
        int i12 = 1;
        int i13 = 1;
        String str2 = null;
        f1.d dVar = null;
        C4586c c4586c = null;
        M m9 = null;
        C4515a c4515a = null;
        WP wp = null;
        C4516b c4516b4 = null;
        float f13 = 0.0f;
        String str3 = null;
        while (c4641c.D()) {
            switch (c4641c.K(f38459a)) {
                case 0:
                    z9 = z12;
                    str = c4641c.H();
                    z12 = z9;
                    break;
                case 1:
                    z9 = z12;
                    j6 = c4641c.G();
                    z12 = z9;
                    break;
                case 2:
                    z9 = z12;
                    str2 = c4641c.H();
                    z12 = z9;
                    break;
                case 3:
                    z9 = z12;
                    z6 = z11;
                    int G2 = c4641c.G();
                    i9 = 7;
                    if (G2 < 6) {
                        i9 = AbstractC5050e.e(7)[G2];
                    }
                    z11 = z6;
                    z12 = z9;
                    break;
                case 4:
                    z9 = z12;
                    j9 = c4641c.G();
                    z12 = z9;
                    break;
                case 5:
                    z9 = z12;
                    i6 = (int) (l1.i.c() * c4641c.G());
                    z12 = z9;
                    break;
                case 6:
                    z9 = z12;
                    i10 = (int) (l1.i.c() * c4641c.G());
                    z12 = z9;
                    break;
                case 7:
                    z9 = z12;
                    i11 = Color.parseColor(c4641c.H());
                    z12 = z9;
                    break;
                case 8:
                    z9 = z12;
                    dVar = AbstractC4608c.c(c4641c, iVar);
                    z12 = z9;
                    break;
                case 9:
                    z6 = z11;
                    int G7 = c4641c.G();
                    if (G7 < AbstractC5050e.e(6).length) {
                        i12 = AbstractC5050e.e(6)[G7];
                        int d9 = AbstractC5050e.d(i12);
                        if (d9 == 3) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (d9 == 4) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        z9 = true;
                        iVar.f3979p++;
                        z11 = z6;
                        z12 = z9;
                        break;
                    } else {
                        iVar.a("Unsupported matte type: " + G7);
                        z11 = z6;
                        z12 = true;
                        break;
                    }
                case 10:
                    int i14 = 2;
                    c4641c.b();
                    while (c4641c.D()) {
                        c4641c.j();
                        C4515a c4515a2 = null;
                        C4515a c4515a3 = null;
                        boolean z15 = false;
                        int i15 = 0;
                        while (c4641c.D()) {
                            String c02 = c4641c.c0();
                            c02.getClass();
                            switch (c02.hashCode()) {
                                case 111:
                                    if (c02.equals(C4876a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                        i = 0;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3588:
                                    if (c02.equals("pt")) {
                                        i = 1;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 104433:
                                    if (c02.equals("inv")) {
                                        i = i14;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3357091:
                                    if (c02.equals("mode")) {
                                        i = 3;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            switch (i) {
                                case 0:
                                    c4515a3 = Q3.b.p(c4641c, iVar);
                                    break;
                                case 1:
                                    c4515a2 = new C4515a(p.a(c4641c, iVar, l1.i.c(), x.f38471n, false), 5);
                                    break;
                                case 2:
                                    z15 = c4641c.E();
                                    break;
                                case 3:
                                    String H8 = c4641c.H();
                                    H8.getClass();
                                    switch (H8.hashCode()) {
                                        case 97:
                                            if (H8.equals("a")) {
                                                i4 = 0;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 105:
                                            if (H8.equals("i")) {
                                                i4 = 1;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 110:
                                            if (H8.equals("n")) {
                                                i4 = i14;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        case 115:
                                            if (H8.equals(com.anythink.core.common.s.f17036a)) {
                                                i4 = 3;
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        default:
                                            i4 = -1;
                                            break;
                                    }
                                    switch (i4) {
                                        case 0:
                                            i15 = 1;
                                            break;
                                        case 1:
                                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i15 = 3;
                                            break;
                                        case 2:
                                            i15 = 4;
                                            break;
                                        case 3:
                                            i15 = i14;
                                            break;
                                        default:
                                            AbstractC4668c.b("Unknown mask mode " + c02 + ". Defaulting to Add.");
                                            i15 = 1;
                                            break;
                                    }
                                    break;
                                default:
                                    c4641c.W();
                                    break;
                            }
                            i14 = 2;
                        }
                        c4641c.B();
                        arrayList.add(new g1.f(i15, c4515a2, c4515a3, z15));
                        i14 = 2;
                    }
                    z6 = false;
                    iVar.f3979p += arrayList.size();
                    c4641c.z();
                    z11 = z6;
                    z12 = true;
                    break;
                case 11:
                    c4641c.b();
                    while (c4641c.D()) {
                        g1.b a9 = g.a(c4641c, iVar);
                        if (a9 != null) {
                            arrayList2.add(a9);
                        }
                    }
                    c4641c.z();
                    z6 = false;
                    z11 = z6;
                    z12 = true;
                    break;
                case 12:
                    boolean z16 = z11;
                    c4641c.j();
                    while (c4641c.D()) {
                        int K7 = c4641c.K(f38460b);
                        if (K7 == 0) {
                            c4515a = new C4515a(p.a(c4641c, iVar, l1.i.c(), h.f38436n, z16 ? 1 : 0), 6);
                            z12 = true;
                            z16 = false;
                        } else if (K7 != z12) {
                            c4641c.V();
                            c4641c.W();
                        } else {
                            c4641c.b();
                            if (c4641c.D()) {
                                C4639a c4639a = AbstractC4607b.f38420a;
                                c4641c.j();
                                M m10 = null;
                                N2.o oVar = null;
                                while (c4641c.D()) {
                                    int K8 = c4641c.K(AbstractC4607b.f38420a);
                                    if (K8 == 0) {
                                        c4641c.j();
                                        C4515a c4515a4 = null;
                                        C4515a c4515a5 = null;
                                        C4515a c4515a6 = null;
                                        int i16 = z16 ? 1 : 0;
                                        while (c4641c.D()) {
                                            int K9 = c4641c.K(AbstractC4607b.f38421b);
                                            if (K9 == 0) {
                                                c4515a4 = Q3.b.p(c4641c, iVar);
                                            } else if (K9 == z12) {
                                                c4515a5 = Q3.b.p(c4641c, iVar);
                                            } else if (K9 == 2) {
                                                c4515a6 = Q3.b.p(c4641c, iVar);
                                            } else if (K9 != 3) {
                                                c4641c.V();
                                                c4641c.W();
                                            } else {
                                                int G8 = c4641c.G();
                                                if (G8 != 1 && G8 != 2) {
                                                    iVar.a("Unsupported text range units: " + G8);
                                                } else if (G8 == 1) {
                                                    i16 = 1;
                                                }
                                                i16 = 2;
                                            }
                                            z12 = true;
                                        }
                                        c4641c.B();
                                        if (c4515a4 == null && c4515a5 != null) {
                                            c4515a4 = new C4515a(Collections.singletonList(new C4739a(Integer.valueOf(z16 ? 1 : 0))), 2);
                                        }
                                        N2.o oVar2 = new N2.o();
                                        oVar2.f1950b = c4515a4;
                                        oVar2.f1951c = c4515a5;
                                        oVar2.f1952d = c4515a6;
                                        oVar2.f1949a = i16;
                                        oVar = oVar2;
                                        z12 = true;
                                    } else if (K8 != z12) {
                                        c4641c.V();
                                        c4641c.W();
                                    } else {
                                        c4641c.j();
                                        C4515a c4515a7 = null;
                                        C4515a c4515a8 = null;
                                        C4516b c4516b5 = null;
                                        C4516b c4516b6 = null;
                                        C4515a c4515a9 = null;
                                        while (c4641c.D()) {
                                            int K10 = c4641c.K(AbstractC4607b.f38422c);
                                            if (K10 == 0) {
                                                c4515a7 = Q3.b.m(c4641c, iVar);
                                            } else if (K10 == z12) {
                                                c4515a8 = Q3.b.m(c4641c, iVar);
                                            } else if (K10 == 2) {
                                                c4516b5 = Q3.b.n(c4641c, iVar, z12);
                                            } else if (K10 == 3) {
                                                c4516b6 = Q3.b.n(c4641c, iVar, z12);
                                            } else if (K10 != 4) {
                                                c4641c.V();
                                                c4641c.W();
                                            } else {
                                                c4515a9 = Q3.b.p(c4641c, iVar);
                                            }
                                        }
                                        c4641c.B();
                                        m10 = new M(c4515a7, c4515a8, c4516b5, c4516b6, c4515a9, 5);
                                    }
                                }
                                c4641c.B();
                                wp = new WP(m10, oVar);
                            }
                            while (c4641c.D()) {
                                c4641c.W();
                            }
                            c4641c.z();
                            z12 = true;
                        }
                    }
                    c4641c.B();
                    z11 = false;
                    z12 = true;
                    break;
                case 13:
                    c4641c.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (c4641c.D()) {
                        c4641c.j();
                        while (c4641c.D()) {
                            int K11 = c4641c.K(f38461c);
                            if (K11 == 0) {
                                int G9 = c4641c.G();
                                if (G9 == 29) {
                                    C4639a c4639a2 = AbstractC4609d.f38425a;
                                    c4586c = null;
                                    while (c4641c.D()) {
                                        if (c4641c.K(AbstractC4609d.f38425a) != 0) {
                                            c4641c.V();
                                            c4641c.W();
                                        } else {
                                            c4641c.b();
                                            while (c4641c.D()) {
                                                c4641c.j();
                                                boolean z17 = z11;
                                                C4586c c4586c2 = null;
                                                while (c4641c.D()) {
                                                    int K12 = c4641c.K(AbstractC4609d.f38426b);
                                                    if (K12 == 0) {
                                                        z17 = c4641c.G() == 0 ? z12 : z11;
                                                    } else if (K12 != z12) {
                                                        c4641c.V();
                                                        c4641c.W();
                                                    } else if (z17) {
                                                        c4586c2 = new C4586c(21, Q3.b.n(c4641c, iVar, z12));
                                                    } else {
                                                        c4641c.W();
                                                    }
                                                }
                                                c4641c.B();
                                                if (c4586c2 != null) {
                                                    c4586c = c4586c2;
                                                }
                                            }
                                            c4641c.z();
                                        }
                                    }
                                } else if (G9 == 25) {
                                    i iVar2 = new i();
                                    while (c4641c.D()) {
                                        if (c4641c.K(i.f38438f) != 0) {
                                            c4641c.V();
                                            c4641c.W();
                                        } else {
                                            c4641c.b();
                                            while (c4641c.D()) {
                                                c4641c.j();
                                                String str4 = "";
                                                while (c4641c.D()) {
                                                    int K13 = c4641c.K(i.f38439g);
                                                    if (K13 == 0) {
                                                        str4 = c4641c.H();
                                                    } else if (K13 == z12) {
                                                        str4.getClass();
                                                        switch (str4.hashCode()) {
                                                            case 353103893:
                                                                if (str4.equals("Distance")) {
                                                                    r52 = z11;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 397447147:
                                                                if (str4.equals("Opacity")) {
                                                                    r52 = z12;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 1041377119:
                                                                if (str4.equals("Direction")) {
                                                                    r52 = 2;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 1379387491:
                                                                if (str4.equals("Shadow Color")) {
                                                                    r52 = 3;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 1383710113:
                                                                if (str4.equals("Softness")) {
                                                                    r52 = 4;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            default:
                                                                r52 = -1;
                                                                break;
                                                        }
                                                        switch (r52) {
                                                            case 0:
                                                                iVar2.f38443d = Q3.b.n(c4641c, iVar, z12);
                                                                break;
                                                            case 1:
                                                                iVar2.f38441b = Q3.b.n(c4641c, iVar, z11);
                                                                break;
                                                            case 2:
                                                                iVar2.f38442c = Q3.b.n(c4641c, iVar, z11);
                                                                break;
                                                            case 3:
                                                                iVar2.f38440a = Q3.b.m(c4641c, iVar);
                                                                break;
                                                            case 4:
                                                                iVar2.f38444e = Q3.b.n(c4641c, iVar, z12);
                                                                break;
                                                            default:
                                                                c4641c.W();
                                                                break;
                                                        }
                                                    } else {
                                                        c4641c.V();
                                                        c4641c.W();
                                                    }
                                                }
                                                c4641c.B();
                                            }
                                            c4641c.z();
                                        }
                                    }
                                    C4515a c4515a10 = iVar2.f38440a;
                                    if (c4515a10 == null || (c4516b = iVar2.f38441b) == null || (c4516b2 = iVar2.f38442c) == null) {
                                        z10 = z11;
                                    } else {
                                        z10 = z11;
                                        C4516b c4516b7 = iVar2.f38443d;
                                        if (c4516b7 != null && (c4516b3 = iVar2.f38444e) != null) {
                                            m9 = new M(c4515a10, c4516b, c4516b2, c4516b7, c4516b3, 8);
                                            z11 = z10;
                                        }
                                    }
                                    m9 = null;
                                    z11 = z10;
                                }
                            } else if (K11 != z12) {
                                c4641c.V();
                                c4641c.W();
                            } else {
                                arrayList3.add(c4641c.H());
                            }
                            z10 = z11;
                            z11 = z10;
                        }
                        c4641c.B();
                    }
                    c4641c.z();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f2 = (float) c4641c.F();
                    break;
                case 15:
                    f13 = (float) c4641c.F();
                    break;
                case 16:
                    f11 = (float) (c4641c.F() * l1.i.c());
                    break;
                case 17:
                    f12 = (float) (c4641c.F() * l1.i.c());
                    break;
                case 18:
                    f9 = (float) c4641c.F();
                    break;
                case 19:
                    f10 = (float) c4641c.F();
                    break;
                case 20:
                    c4516b4 = Q3.b.n(c4641c, iVar, z11);
                    break;
                case 21:
                    str3 = c4641c.H();
                    break;
                case 22:
                    z14 = c4641c.E();
                    break;
                case 23:
                    if (c4641c.G() != z12) {
                        z13 = z11;
                        break;
                    } else {
                        z13 = z12;
                        break;
                    }
                case 24:
                    int G10 = c4641c.G();
                    if (G10 < AbstractC5050e.e(18).length) {
                        i13 = AbstractC5050e.e(18)[G10];
                        break;
                    } else {
                        iVar.a("Unsupported Blend Mode: " + G10);
                        i13 = z12;
                        break;
                    }
                default:
                    c4641c.V();
                    c4641c.W();
                    z6 = z11;
                    z11 = z6;
                    z12 = true;
                    break;
            }
        }
        c4641c.B();
        ArrayList arrayList4 = new ArrayList();
        if (f9 > 0.0f) {
            arrayList4.add(new C4739a(iVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f9)));
        }
        if (f10 <= 0.0f) {
            f10 = iVar.f3976m;
        }
        arrayList4.add(new C4739a(iVar, valueOf2, valueOf2, (Interpolator) null, f9, Float.valueOf(f10)));
        arrayList4.add(new C4739a(iVar, valueOf, valueOf, (Interpolator) null, f10, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || com.anythink.expressad.f.a.b.da.equals(str3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        boolean z18 = z13;
        if (z18) {
            if (dVar == null) {
                dVar = new f1.d();
            }
            f1.d dVar2 = dVar;
            dVar2.f37438m = z18;
            dVar = dVar2;
        }
        return new C4566d(arrayList2, iVar, str, j6, i9, j9, str2, arrayList, dVar, i6, i10, i11, f2, f13, f11, f12, c4515a, wp, arrayList4, i12, c4516b4, z14, c4586c, m9, i13);
    }
}
