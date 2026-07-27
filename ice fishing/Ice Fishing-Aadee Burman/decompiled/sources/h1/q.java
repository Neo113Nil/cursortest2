package h1;

import C2.N;
import android.graphics.Color;
import android.view.animation.Interpolator;
import d1.C4443a;
import d1.C4444b;
import f1.C4501d;
import i1.C4580b;
import j1.AbstractC4599c;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4629a;
import q5.C4927a;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37990a = S0.l.F("nm", com.anythink.expressad.foundation.g.g.a.b.aW, "refId", "ty", "parent", "sw", com.anythink.expressad.foundation.d.e.f18674u, com.anythink.expressad.f.a.b.bI, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", com.anythink.expressad.foundation.g.g.a.b.bb, com.anythink.core.common.w.f16912a, "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    public static final S0.l f37991b = S0.l.F("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final S0.l f37992c = S0.l.F("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v64, types: [int[]] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v66 */
    public static C4501d a(C4580b c4580b, X0.i iVar) {
        boolean z3;
        boolean z6;
        int i;
        int i6;
        boolean z9;
        C4444b c4444b;
        C4444b c4444b2;
        C4444b c4444b3;
        ?? r52;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c4580b.j();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        boolean z10 = false;
        boolean z11 = true;
        long j6 = 0;
        long j9 = -1;
        float f3 = 1.0f;
        String str = "UNSET";
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        boolean z12 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        int i13 = 1;
        int i14 = 1;
        String str2 = null;
        d1.e eVar = null;
        F1.a aVar = null;
        N n9 = null;
        C4443a c4443a = null;
        S0.e eVar2 = null;
        C4444b c4444b4 = null;
        float f13 = 0.0f;
        String str3 = null;
        while (c4580b.D()) {
            switch (c4580b.K(f37990a)) {
                case 0:
                    z6 = z11;
                    str = c4580b.H();
                    z11 = z6;
                    break;
                case 1:
                    z6 = z11;
                    j6 = c4580b.G();
                    z11 = z6;
                    break;
                case 2:
                    z6 = z11;
                    str2 = c4580b.H();
                    z11 = z6;
                    break;
                case 3:
                    z6 = z11;
                    z3 = z10;
                    int G7 = c4580b.G();
                    i10 = 7;
                    if (G7 < 6) {
                        i10 = AbstractC5049e.e(7)[G7];
                    }
                    z10 = z3;
                    z11 = z6;
                    break;
                case 4:
                    z6 = z11;
                    j9 = c4580b.G();
                    z11 = z6;
                    break;
                case 5:
                    z6 = z11;
                    i9 = (int) (j1.j.c() * c4580b.G());
                    z11 = z6;
                    break;
                case 6:
                    z6 = z11;
                    i11 = (int) (j1.j.c() * c4580b.G());
                    z11 = z6;
                    break;
                case 7:
                    z6 = z11;
                    i12 = Color.parseColor(c4580b.H());
                    z11 = z6;
                    break;
                case 8:
                    z6 = z11;
                    eVar = AbstractC4560c.c(c4580b, iVar);
                    z11 = z6;
                    break;
                case 9:
                    z3 = z10;
                    int G8 = c4580b.G();
                    if (G8 < AbstractC5049e.e(6).length) {
                        i13 = AbstractC5049e.e(6)[G8];
                        int d2 = AbstractC5049e.d(i13);
                        if (d2 == 3) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (d2 == 4) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        z6 = true;
                        iVar.f3627p++;
                        z10 = z3;
                        z11 = z6;
                        break;
                    } else {
                        iVar.a("Unsupported matte type: " + G8);
                        z10 = z3;
                        z11 = true;
                        break;
                    }
                case 10:
                    int i15 = 2;
                    c4580b.b();
                    while (c4580b.D()) {
                        c4580b.j();
                        C4443a c4443a2 = null;
                        C4443a c4443a3 = null;
                        boolean z14 = false;
                        int i16 = 0;
                        while (c4580b.D()) {
                            String c02 = c4580b.c0();
                            c02.getClass();
                            switch (c02.hashCode()) {
                                case 111:
                                    if (c02.equals(C4927a.PUSH_MINIFIED_BUTTONS_LIST)) {
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
                                        i = i15;
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
                                    c4443a3 = com.bumptech.glide.f.s(c4580b, iVar);
                                    break;
                                case 1:
                                    c4443a2 = new C4443a(p.a(c4580b, iVar, j1.j.c(), x.f38002n, false), 5);
                                    break;
                                case 2:
                                    z14 = c4580b.E();
                                    break;
                                case 3:
                                    String H8 = c4580b.H();
                                    H8.getClass();
                                    switch (H8.hashCode()) {
                                        case 97:
                                            if (H8.equals("a")) {
                                                i6 = 0;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 105:
                                            if (H8.equals("i")) {
                                                i6 = 1;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 110:
                                            if (H8.equals("n")) {
                                                i6 = i15;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        case 115:
                                            if (H8.equals(com.anythink.core.common.s.f16249a)) {
                                                i6 = 3;
                                                break;
                                            }
                                            i6 = -1;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    switch (i6) {
                                        case 0:
                                            i16 = 1;
                                            break;
                                        case 1:
                                            iVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i16 = 3;
                                            break;
                                        case 2:
                                            i16 = 4;
                                            break;
                                        case 3:
                                            i16 = i15;
                                            break;
                                        default:
                                            AbstractC4599c.b("Unknown mask mode " + c02 + ". Defaulting to Add.");
                                            i16 = 1;
                                            break;
                                    }
                                    break;
                                default:
                                    c4580b.W();
                                    break;
                            }
                            i15 = 2;
                        }
                        c4580b.B();
                        arrayList.add(new e1.f(i16, c4443a2, c4443a3, z14));
                        i15 = 2;
                    }
                    z3 = false;
                    iVar.f3627p += arrayList.size();
                    c4580b.z();
                    z10 = z3;
                    z11 = true;
                    break;
                case 11:
                    c4580b.b();
                    while (c4580b.D()) {
                        e1.b a9 = g.a(c4580b, iVar);
                        if (a9 != null) {
                            arrayList2.add(a9);
                        }
                    }
                    c4580b.z();
                    z3 = false;
                    z10 = z3;
                    z11 = true;
                    break;
                case 12:
                    boolean z15 = z10;
                    c4580b.j();
                    while (c4580b.D()) {
                        int K7 = c4580b.K(f37991b);
                        if (K7 == 0) {
                            c4443a = new C4443a(p.a(c4580b, iVar, j1.j.c(), h.f37967n, z15 ? 1 : 0), 6);
                            z11 = true;
                            z15 = false;
                        } else if (K7 != z11) {
                            c4580b.V();
                            c4580b.W();
                        } else {
                            c4580b.b();
                            if (c4580b.D()) {
                                S0.l lVar = AbstractC4559b.f37951a;
                                c4580b.j();
                                N n10 = null;
                                L2.n nVar = null;
                                while (c4580b.D()) {
                                    int K8 = c4580b.K(AbstractC4559b.f37951a);
                                    if (K8 == 0) {
                                        c4580b.j();
                                        C4443a c4443a4 = null;
                                        C4443a c4443a5 = null;
                                        C4443a c4443a6 = null;
                                        int i17 = z15 ? 1 : 0;
                                        while (c4580b.D()) {
                                            int K9 = c4580b.K(AbstractC4559b.f37952b);
                                            if (K9 == 0) {
                                                c4443a4 = com.bumptech.glide.f.s(c4580b, iVar);
                                            } else if (K9 == z11) {
                                                c4443a5 = com.bumptech.glide.f.s(c4580b, iVar);
                                            } else if (K9 == 2) {
                                                c4443a6 = com.bumptech.glide.f.s(c4580b, iVar);
                                            } else if (K9 != 3) {
                                                c4580b.V();
                                                c4580b.W();
                                            } else {
                                                int G9 = c4580b.G();
                                                if (G9 != 1 && G9 != 2) {
                                                    iVar.a("Unsupported text range units: " + G9);
                                                } else if (G9 == 1) {
                                                    i17 = 1;
                                                }
                                                i17 = 2;
                                            }
                                            z11 = true;
                                        }
                                        c4580b.B();
                                        if (c4443a4 == null && c4443a5 != null) {
                                            c4443a4 = new C4443a(Collections.singletonList(new C4629a(Integer.valueOf(z15 ? 1 : 0))), 2);
                                        }
                                        L2.n nVar2 = new L2.n();
                                        nVar2.f1660b = c4443a4;
                                        nVar2.f1661c = c4443a5;
                                        nVar2.f1662d = c4443a6;
                                        nVar2.f1659a = i17;
                                        nVar = nVar2;
                                        z11 = true;
                                    } else if (K8 != z11) {
                                        c4580b.V();
                                        c4580b.W();
                                    } else {
                                        c4580b.j();
                                        C4443a c4443a7 = null;
                                        C4443a c4443a8 = null;
                                        C4444b c4444b5 = null;
                                        C4444b c4444b6 = null;
                                        C4443a c4443a9 = null;
                                        while (c4580b.D()) {
                                            int K10 = c4580b.K(AbstractC4559b.f37953c);
                                            if (K10 == 0) {
                                                c4443a7 = com.bumptech.glide.f.p(c4580b, iVar);
                                            } else if (K10 == z11) {
                                                c4443a8 = com.bumptech.glide.f.p(c4580b, iVar);
                                            } else if (K10 == 2) {
                                                c4444b5 = com.bumptech.glide.f.q(c4580b, iVar, z11);
                                            } else if (K10 == 3) {
                                                c4444b6 = com.bumptech.glide.f.q(c4580b, iVar, z11);
                                            } else if (K10 != 4) {
                                                c4580b.V();
                                                c4580b.W();
                                            } else {
                                                c4443a9 = com.bumptech.glide.f.s(c4580b, iVar);
                                            }
                                        }
                                        c4580b.B();
                                        n10 = new N(c4443a7, c4443a8, c4444b5, c4444b6, c4443a9, 5);
                                    }
                                }
                                c4580b.B();
                                eVar2 = new S0.e(28, n10, nVar);
                            }
                            while (c4580b.D()) {
                                c4580b.W();
                            }
                            c4580b.z();
                            z11 = true;
                        }
                    }
                    c4580b.B();
                    z10 = false;
                    z11 = true;
                    break;
                case 13:
                    c4580b.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (c4580b.D()) {
                        c4580b.j();
                        while (c4580b.D()) {
                            int K11 = c4580b.K(f37992c);
                            if (K11 == 0) {
                                int G10 = c4580b.G();
                                if (G10 == 29) {
                                    S0.l lVar2 = AbstractC4561d.f37956a;
                                    aVar = null;
                                    while (c4580b.D()) {
                                        if (c4580b.K(AbstractC4561d.f37956a) != 0) {
                                            c4580b.V();
                                            c4580b.W();
                                        } else {
                                            c4580b.b();
                                            while (c4580b.D()) {
                                                c4580b.j();
                                                boolean z16 = z10;
                                                F1.a aVar2 = null;
                                                while (c4580b.D()) {
                                                    int K12 = c4580b.K(AbstractC4561d.f37957b);
                                                    if (K12 == 0) {
                                                        z16 = c4580b.G() == 0 ? z11 : z10;
                                                    } else if (K12 != z11) {
                                                        c4580b.V();
                                                        c4580b.W();
                                                    } else if (z16) {
                                                        aVar2 = new F1.a(17, com.bumptech.glide.f.q(c4580b, iVar, z11));
                                                    } else {
                                                        c4580b.W();
                                                    }
                                                }
                                                c4580b.B();
                                                if (aVar2 != null) {
                                                    aVar = aVar2;
                                                }
                                            }
                                            c4580b.z();
                                        }
                                    }
                                } else if (G10 == 25) {
                                    i iVar2 = new i();
                                    while (c4580b.D()) {
                                        if (c4580b.K(i.f37969f) != 0) {
                                            c4580b.V();
                                            c4580b.W();
                                        } else {
                                            c4580b.b();
                                            while (c4580b.D()) {
                                                c4580b.j();
                                                String str4 = "";
                                                while (c4580b.D()) {
                                                    int K13 = c4580b.K(i.f37970g);
                                                    if (K13 == 0) {
                                                        str4 = c4580b.H();
                                                    } else if (K13 == z11) {
                                                        str4.getClass();
                                                        switch (str4.hashCode()) {
                                                            case 353103893:
                                                                if (str4.equals("Distance")) {
                                                                    r52 = z10;
                                                                    break;
                                                                }
                                                                r52 = -1;
                                                                break;
                                                            case 397447147:
                                                                if (str4.equals("Opacity")) {
                                                                    r52 = z11;
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
                                                                iVar2.f37974d = com.bumptech.glide.f.q(c4580b, iVar, z11);
                                                                break;
                                                            case 1:
                                                                iVar2.f37972b = com.bumptech.glide.f.q(c4580b, iVar, z10);
                                                                break;
                                                            case 2:
                                                                iVar2.f37973c = com.bumptech.glide.f.q(c4580b, iVar, z10);
                                                                break;
                                                            case 3:
                                                                iVar2.f37971a = com.bumptech.glide.f.p(c4580b, iVar);
                                                                break;
                                                            case 4:
                                                                iVar2.f37975e = com.bumptech.glide.f.q(c4580b, iVar, z11);
                                                                break;
                                                            default:
                                                                c4580b.W();
                                                                break;
                                                        }
                                                    } else {
                                                        c4580b.V();
                                                        c4580b.W();
                                                    }
                                                }
                                                c4580b.B();
                                            }
                                            c4580b.z();
                                        }
                                    }
                                    C4443a c4443a10 = iVar2.f37971a;
                                    if (c4443a10 == null || (c4444b = iVar2.f37972b) == null || (c4444b2 = iVar2.f37973c) == null) {
                                        z9 = z10;
                                    } else {
                                        z9 = z10;
                                        C4444b c4444b7 = iVar2.f37974d;
                                        if (c4444b7 != null && (c4444b3 = iVar2.f37975e) != null) {
                                            n9 = new N(c4443a10, c4444b, c4444b2, c4444b7, c4444b3, 7);
                                            z10 = z9;
                                        }
                                    }
                                    n9 = null;
                                    z10 = z9;
                                }
                            } else if (K11 != z11) {
                                c4580b.V();
                                c4580b.W();
                            } else {
                                arrayList3.add(c4580b.H());
                            }
                            z9 = z10;
                            z10 = z9;
                        }
                        c4580b.B();
                    }
                    c4580b.z();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f3 = (float) c4580b.F();
                    break;
                case 15:
                    f13 = (float) c4580b.F();
                    break;
                case 16:
                    f11 = (float) (c4580b.F() * j1.j.c());
                    break;
                case 17:
                    f12 = (float) (c4580b.F() * j1.j.c());
                    break;
                case 18:
                    f9 = (float) c4580b.F();
                    break;
                case 19:
                    f10 = (float) c4580b.F();
                    break;
                case 20:
                    c4444b4 = com.bumptech.glide.f.q(c4580b, iVar, z10);
                    break;
                case 21:
                    str3 = c4580b.H();
                    break;
                case 22:
                    z13 = c4580b.E();
                    break;
                case 23:
                    if (c4580b.G() != z11) {
                        z12 = z10;
                        break;
                    } else {
                        z12 = z11;
                        break;
                    }
                case 24:
                    int G11 = c4580b.G();
                    if (G11 < AbstractC5049e.e(18).length) {
                        i14 = AbstractC5049e.e(18)[G11];
                        break;
                    } else {
                        iVar.a("Unsupported Blend Mode: " + G11);
                        i14 = z11;
                        break;
                    }
                default:
                    c4580b.V();
                    c4580b.W();
                    z3 = z10;
                    z10 = z3;
                    z11 = true;
                    break;
            }
        }
        c4580b.B();
        ArrayList arrayList4 = new ArrayList();
        if (f9 > 0.0f) {
            arrayList4.add(new C4629a(iVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f9)));
        }
        if (f10 <= 0.0f) {
            f10 = iVar.f3624m;
        }
        arrayList4.add(new C4629a(iVar, valueOf2, valueOf2, (Interpolator) null, f9, Float.valueOf(f10)));
        arrayList4.add(new C4629a(iVar, valueOf, valueOf, (Interpolator) null, f10, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || com.anythink.expressad.f.a.b.da.equals(str3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        boolean z17 = z12;
        if (z17) {
            if (eVar == null) {
                eVar = new d1.e();
            }
            d1.e eVar3 = eVar;
            eVar3.f37036m = z17;
            eVar = eVar3;
        }
        return new C4501d(arrayList2, iVar, str, j6, i10, j9, str2, arrayList, eVar, i9, i11, i12, f3, f13, f11, f12, c4443a, eVar2, arrayList4, i13, c4444b4, z13, aVar, n9, i14);
    }
}
