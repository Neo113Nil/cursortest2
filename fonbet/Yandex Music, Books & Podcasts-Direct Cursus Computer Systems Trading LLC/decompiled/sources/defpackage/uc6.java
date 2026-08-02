package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class uc6 {
    public static final j6e a = j6e.s("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0772 A[LOOP:1: B:27:0x076c->B:29:0x0772, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tc6 a(m7f m7fVar, ayg aygVar) {
        String str;
        char c;
        tc6 jl4Var;
        tc6 kupVar;
        tc6 mupVar;
        tc6 godVar;
        int i;
        int i2;
        char c2;
        m7fVar.b();
        int i3 = 2;
        while (true) {
            if (!m7fVar.hasNext()) {
                str = null;
                break;
            }
            int D = m7fVar.D(a);
            if (D == 0) {
                str = m7fVar.f0();
                break;
            }
            if (D != 1) {
                m7fVar.H();
                m7fVar.w();
            } else {
                i3 = m7fVar.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 3;
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                j6e j6eVar = kl4.a;
                boolean z3 = i3 == 3;
                boolean z4 = false;
                String str2 = null;
                ok0 ok0Var = null;
                gk0 gk0Var = null;
                while (m7fVar.hasNext()) {
                    int D2 = m7fVar.D(kl4.a);
                    if (D2 == 0) {
                        str2 = m7fVar.f0();
                    } else if (D2 == 1) {
                        ok0Var = jk0.b(m7fVar, aygVar);
                    } else if (D2 == 2) {
                        gk0Var = vnj.M(m7fVar, aygVar);
                    } else if (D2 == 3) {
                        z4 = m7fVar.nextBoolean();
                    } else if (D2 != 4) {
                        m7fVar.H();
                        m7fVar.w();
                    } else {
                        z3 = m7fVar.nextInt() == 3;
                    }
                }
                jl4Var = new jl4(str2, ok0Var, gk0Var, z3, z4);
                kupVar = jl4Var;
                while (m7fVar.hasNext()) {
                    m7fVar.w();
                }
                m7fVar.o();
                return kupVar;
            case 1:
                j6e j6eVar2 = lup.a;
                int i6 = 1;
                boolean z5 = false;
                boolean z6 = false;
                gk0 gk0Var2 = null;
                String str3 = null;
                gk0 gk0Var3 = null;
                while (m7fVar.hasNext()) {
                    int D3 = m7fVar.D(lup.a);
                    if (D3 == 0) {
                        str3 = m7fVar.f0();
                    } else if (D3 == 1) {
                        gk0Var3 = vnj.I(m7fVar, aygVar);
                    } else if (D3 == 2) {
                        gk0Var2 = vnj.L(m7fVar, aygVar);
                    } else if (D3 == 3) {
                        z5 = m7fVar.nextBoolean();
                    } else if (D3 == 4) {
                        i6 = m7fVar.nextInt();
                    } else if (D3 != 5) {
                        m7fVar.H();
                        m7fVar.w();
                    } else {
                        z6 = m7fVar.nextBoolean();
                    }
                }
                if (gk0Var2 == null) {
                    gk0Var2 = new gk0(Collections.singletonList(new acf(100)), 2);
                }
                kupVar = new kup(str3, z5, i6 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, gk0Var3, gk0Var2, z6);
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 2:
                j6e j6eVar3 = eod.a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i7 = 0;
                boolean z7 = false;
                gk0 gk0Var4 = null;
                String str4 = null;
                gk0 gk0Var5 = null;
                gk0 gk0Var6 = null;
                gk0 gk0Var7 = null;
                while (m7fVar.hasNext()) {
                    switch (m7fVar.D(eod.a)) {
                        case 0:
                            str4 = m7fVar.f0();
                            break;
                        case 1:
                            m7fVar.b();
                            int i8 = -1;
                            while (m7fVar.hasNext()) {
                                int D4 = m7fVar.D(eod.b);
                                if (D4 == 0) {
                                    i8 = m7fVar.nextInt();
                                } else if (D4 != 1) {
                                    m7fVar.H();
                                    m7fVar.w();
                                } else {
                                    gk0Var5 = vnj.K(m7fVar, aygVar, i8);
                                }
                            }
                            m7fVar.o();
                            break;
                        case 2:
                            gk0Var4 = vnj.L(m7fVar, aygVar);
                            break;
                        case 3:
                            if (m7fVar.nextInt() != 1) {
                                i7 = 2;
                                break;
                            } else {
                                i7 = 1;
                                break;
                            }
                        case 4:
                            gk0Var6 = vnj.M(m7fVar, aygVar);
                            break;
                        case 5:
                            gk0Var7 = vnj.M(m7fVar, aygVar);
                            break;
                        case 6:
                            fillType = m7fVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z7 = m7fVar.nextBoolean();
                            break;
                        default:
                            m7fVar.H();
                            m7fVar.w();
                            break;
                    }
                }
                if (gk0Var4 == null) {
                    gk0Var4 = new gk0(Collections.singletonList(new acf(100)), 2);
                }
                kupVar = new cod(str4, i7, fillType, gk0Var5, gk0Var4, gk0Var6, gk0Var7, z7);
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 3:
                j6e j6eVar4 = nup.a;
                ArrayList arrayList = new ArrayList();
                String str5 = null;
                while (m7fVar.hasNext()) {
                    int D5 = m7fVar.D(nup.a);
                    if (D5 == 0) {
                        str5 = m7fVar.f0();
                    } else if (D5 == 1) {
                        z = m7fVar.nextBoolean();
                    } else if (D5 != 2) {
                        m7fVar.w();
                    } else {
                        m7fVar.a();
                        while (m7fVar.hasNext()) {
                            tc6 a2 = a(m7fVar, aygVar);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        m7fVar.g();
                    }
                }
                mupVar = new mup(str5, arrayList, z);
                kupVar = mupVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 4:
                j6e j6eVar5 = iod.a;
                ArrayList arrayList2 = new ArrayList();
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z8 = false;
                gk0 gk0Var8 = null;
                String str6 = null;
                gk0 gk0Var9 = null;
                gk0 gk0Var10 = null;
                gk0 gk0Var11 = null;
                hk0 hk0Var = null;
                hk0 hk0Var2 = null;
                float f = 0.0f;
                while (m7fVar.hasNext()) {
                    switch (m7fVar.D(iod.a)) {
                        case 0:
                            str6 = m7fVar.f0();
                            break;
                        case 1:
                            m7fVar.b();
                            int i12 = -1;
                            while (m7fVar.hasNext()) {
                                int D6 = m7fVar.D(iod.b);
                                if (D6 == 0) {
                                    i12 = m7fVar.nextInt();
                                } else if (D6 != 1) {
                                    m7fVar.H();
                                    m7fVar.w();
                                } else {
                                    gk0Var9 = vnj.K(m7fVar, aygVar, i12);
                                }
                            }
                            m7fVar.o();
                            break;
                        case 2:
                            gk0Var8 = vnj.L(m7fVar, aygVar);
                            break;
                        case 3:
                            if (m7fVar.nextInt() != 1) {
                                i9 = 2;
                                break;
                            } else {
                                i9 = 1;
                                break;
                            }
                        case 4:
                            gk0Var10 = vnj.M(m7fVar, aygVar);
                            break;
                        case 5:
                            gk0Var11 = vnj.M(m7fVar, aygVar);
                            break;
                        case 6:
                            hk0Var = vnj.J(m7fVar, aygVar, true);
                            break;
                        case 7:
                            i10 = ouj.E(3)[m7fVar.nextInt() - 1];
                            break;
                        case 8:
                            i11 = ouj.E(3)[m7fVar.nextInt() - 1];
                            break;
                        case 9:
                            f = (float) m7fVar.nextDouble();
                            break;
                        case 10:
                            z8 = m7fVar.nextBoolean();
                            break;
                        case 11:
                            m7fVar.a();
                            while (m7fVar.hasNext()) {
                                m7fVar.b();
                                String str7 = null;
                                hk0 hk0Var3 = null;
                                while (m7fVar.hasNext()) {
                                    int D7 = m7fVar.D(iod.c);
                                    if (D7 == 0) {
                                        str7 = m7fVar.f0();
                                    } else if (D7 != 1) {
                                        m7fVar.H();
                                        m7fVar.w();
                                    } else {
                                        hk0Var3 = vnj.J(m7fVar, aygVar, true);
                                    }
                                }
                                m7fVar.o();
                                if (str7.equals("o")) {
                                    hk0Var2 = hk0Var3;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    aygVar.o = true;
                                    arrayList2.add(hk0Var3);
                                }
                            }
                            m7fVar.g();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add((hk0) arrayList2.get(0));
                                break;
                            }
                            break;
                        default:
                            m7fVar.H();
                            m7fVar.w();
                            break;
                    }
                }
                if (gk0Var8 == null) {
                    gk0Var8 = new gk0(Collections.singletonList(new acf(100)), 2);
                }
                godVar = new god(str6, i9, gk0Var9, gk0Var8, gk0Var10, gk0Var11, hk0Var, i10, i11, f, arrayList2, hk0Var2, z8);
                kupVar = godVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 5:
                j6e j6eVar6 = wyh.a;
                boolean z9 = false;
                String str8 = null;
                while (m7fVar.hasNext()) {
                    int D8 = m7fVar.D(wyh.a);
                    if (D8 == 0) {
                        str8 = m7fVar.f0();
                    } else if (D8 == 1) {
                        int nextInt = m7fVar.nextInt();
                        if (nextInt != 1) {
                            if (nextInt == 2) {
                                i4 = 2;
                            } else if (nextInt == 3) {
                                i4 = 3;
                            } else if (nextInt == 4) {
                                i4 = 4;
                            } else if (nextInt == 5) {
                                i4 = 5;
                            }
                        }
                        i4 = 1;
                    } else if (D8 != 2) {
                        m7fVar.H();
                        m7fVar.w();
                    } else {
                        z9 = m7fVar.nextBoolean();
                    }
                }
                uyh uyhVar = new uyh(str8, i4, z9);
                aygVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                kupVar = uyhVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 6:
                j6e j6eVar7 = lon.a;
                boolean z10 = false;
                String str9 = null;
                ok0 ok0Var2 = null;
                gk0 gk0Var12 = null;
                hk0 hk0Var4 = null;
                while (m7fVar.hasNext()) {
                    int D9 = m7fVar.D(lon.a);
                    if (D9 == 0) {
                        str9 = m7fVar.f0();
                    } else if (D9 == 1) {
                        ok0Var2 = jk0.b(m7fVar, aygVar);
                    } else if (D9 == 2) {
                        gk0Var12 = vnj.M(m7fVar, aygVar);
                    } else if (D9 == 3) {
                        hk0Var4 = vnj.J(m7fVar, aygVar, true);
                    } else if (D9 != 4) {
                        m7fVar.w();
                    } else {
                        z10 = m7fVar.nextBoolean();
                    }
                }
                godVar = new kon(str9, ok0Var2, gk0Var12, hk0Var4, z10);
                kupVar = godVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 7:
                j6e j6eVar8 = ygo.a;
                String str10 = null;
                hk0 hk0Var5 = null;
                while (m7fVar.hasNext()) {
                    int D10 = m7fVar.D(ygo.a);
                    if (D10 == 0) {
                        str10 = m7fVar.f0();
                    } else if (D10 == 1) {
                        hk0Var5 = vnj.J(m7fVar, aygVar, true);
                    } else if (D10 != 2) {
                        m7fVar.w();
                    } else {
                        z2 = m7fVar.nextBoolean();
                    }
                }
                if (!z2) {
                    kupVar = new wgo(str10, hk0Var5);
                    while (m7fVar.hasNext()) {
                    }
                    m7fVar.o();
                    return kupVar;
                }
                kupVar = null;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case '\b':
                j6e j6eVar9 = uyn.a;
                boolean z11 = false;
                String str11 = null;
                hk0 hk0Var6 = null;
                hk0 hk0Var7 = null;
                mk0 mk0Var = null;
                while (m7fVar.hasNext()) {
                    int D11 = m7fVar.D(uyn.a);
                    if (D11 == 0) {
                        str11 = m7fVar.f0();
                    } else if (D11 == 1) {
                        hk0Var6 = vnj.J(m7fVar, aygVar, false);
                    } else if (D11 == 2) {
                        hk0Var7 = vnj.J(m7fVar, aygVar, false);
                    } else if (D11 == 3) {
                        mk0Var = nk0.c(m7fVar, aygVar);
                    } else if (D11 != 4) {
                        m7fVar.w();
                    } else {
                        z11 = m7fVar.nextBoolean();
                    }
                }
                godVar = new kon(str11, hk0Var6, hk0Var7, mk0Var, z11);
                kupVar = godVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case '\t':
                j6e j6eVar10 = zup.a;
                int i13 = 0;
                boolean z12 = false;
                gk0 gk0Var13 = null;
                String str12 = null;
                while (m7fVar.hasNext()) {
                    int D12 = m7fVar.D(zup.a);
                    if (D12 == 0) {
                        str12 = m7fVar.f0();
                    } else if (D12 == 1) {
                        i13 = m7fVar.nextInt();
                    } else if (D12 == 2) {
                        gk0Var13 = new gk0(dcf.a(m7fVar, aygVar, rvt.c(), iup.a, false), 5);
                    } else if (D12 != 3) {
                        m7fVar.w();
                    } else {
                        z12 = m7fVar.nextBoolean();
                    }
                }
                mupVar = new yup(str12, i13, gk0Var13, z12);
                kupVar = mupVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case '\n':
                j6e j6eVar11 = ngm.a;
                boolean z13 = i3 == 3;
                int i14 = 0;
                boolean z14 = false;
                String str13 = null;
                hk0 hk0Var8 = null;
                ok0 ok0Var3 = null;
                hk0 hk0Var9 = null;
                hk0 hk0Var10 = null;
                hk0 hk0Var11 = null;
                hk0 hk0Var12 = null;
                hk0 hk0Var13 = null;
                while (m7fVar.hasNext()) {
                    switch (m7fVar.D(ngm.a)) {
                        case 0:
                            str13 = m7fVar.f0();
                            break;
                        case 1:
                            int nextInt2 = m7fVar.nextInt();
                            int[] E = ouj.E(2);
                            int length = E.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    i14 = 0;
                                    break;
                                } else {
                                    int i16 = E[i15];
                                    if (i16 == 1) {
                                        i = 1;
                                    } else {
                                        if (i16 != 2) {
                                            throw null;
                                        }
                                        i = 2;
                                    }
                                    if (i == nextInt2) {
                                        i14 = i16;
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        case 2:
                            hk0Var8 = vnj.J(m7fVar, aygVar, false);
                            break;
                        case 3:
                            ok0Var3 = jk0.b(m7fVar, aygVar);
                            break;
                        case 4:
                            hk0Var9 = vnj.J(m7fVar, aygVar, false);
                            break;
                        case 5:
                            hk0Var11 = vnj.J(m7fVar, aygVar, true);
                            break;
                        case 6:
                            hk0Var13 = vnj.J(m7fVar, aygVar, false);
                            break;
                        case 7:
                            hk0Var10 = vnj.J(m7fVar, aygVar, true);
                            break;
                        case 8:
                            hk0Var12 = vnj.J(m7fVar, aygVar, false);
                            break;
                        case 9:
                            z14 = m7fVar.nextBoolean();
                            break;
                        case 10:
                            if (m7fVar.nextInt() != 3) {
                                z13 = false;
                                break;
                            } else {
                                z13 = true;
                                break;
                            }
                        default:
                            m7fVar.H();
                            m7fVar.w();
                            break;
                    }
                }
                godVar = new mgm(str13, i14, hk0Var8, ok0Var3, hk0Var9, hk0Var10, hk0Var11, hk0Var12, hk0Var13, z14, z13);
                kupVar = godVar;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case 11:
                j6e j6eVar12 = bvp.a;
                ArrayList arrayList3 = new ArrayList();
                int i17 = 0;
                int i18 = 0;
                boolean z15 = false;
                gk0 gk0Var14 = null;
                String str14 = null;
                hk0 hk0Var14 = null;
                gk0 gk0Var15 = null;
                hk0 hk0Var15 = null;
                float f2 = 0.0f;
                while (m7fVar.hasNext()) {
                    switch (m7fVar.D(bvp.a)) {
                        case 0:
                            str14 = m7fVar.f0();
                            continue;
                        case 1:
                            gk0Var15 = vnj.I(m7fVar, aygVar);
                            continue;
                        case 2:
                            hk0Var15 = vnj.J(m7fVar, aygVar, true);
                            continue;
                        case 3:
                            gk0Var14 = vnj.L(m7fVar, aygVar);
                            continue;
                        case 4:
                            i17 = ouj.E(i5)[m7fVar.nextInt() - 1];
                            continue;
                        case 5:
                            i18 = ouj.E(i5)[m7fVar.nextInt() - 1];
                            continue;
                        case 6:
                            i2 = i5;
                            f2 = (float) m7fVar.nextDouble();
                            break;
                        case 7:
                            z15 = m7fVar.nextBoolean();
                            continue;
                        case 8:
                            m7fVar.a();
                            while (m7fVar.hasNext()) {
                                m7fVar.b();
                                hk0 hk0Var16 = null;
                                String str15 = null;
                                while (m7fVar.hasNext()) {
                                    int i19 = i5;
                                    int D13 = m7fVar.D(bvp.b);
                                    if (D13 == 0) {
                                        str15 = m7fVar.f0();
                                    } else if (D13 != 1) {
                                        m7fVar.H();
                                        m7fVar.w();
                                    } else {
                                        hk0Var16 = vnj.J(m7fVar, aygVar, true);
                                    }
                                    i5 = i19;
                                }
                                int i20 = i5;
                                m7fVar.o();
                                str15.getClass();
                                switch (str15.hashCode()) {
                                    case 100:
                                        if (str15.equals("d")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 103:
                                        if (str15.equals("g")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 111:
                                        if (str15.equals("o")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                    case 1:
                                        aygVar.o = true;
                                        arrayList3.add(hk0Var16);
                                        break;
                                    case 2:
                                        hk0Var14 = hk0Var16;
                                        break;
                                }
                                i5 = i20;
                            }
                            i2 = i5;
                            m7fVar.g();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((hk0) arrayList3.get(0));
                                break;
                            }
                            break;
                        default:
                            m7fVar.w();
                            continue;
                    }
                    i5 = i2;
                }
                if (gk0Var14 == null) {
                    gk0Var14 = new gk0(Collections.singletonList(new acf(100)), 2);
                }
                kupVar = new avp(str14, hk0Var14, arrayList3, gk0Var15, gk0Var14, hk0Var15, i17 == 0 ? 1 : i17, i18 == 0 ? 1 : i18, f2, z15);
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case '\f':
                j6e j6eVar13 = evp.a;
                int i21 = 0;
                boolean z16 = false;
                String str16 = null;
                hk0 hk0Var17 = null;
                hk0 hk0Var18 = null;
                hk0 hk0Var19 = null;
                while (m7fVar.hasNext()) {
                    int D14 = m7fVar.D(evp.a);
                    if (D14 == 0) {
                        hk0Var17 = vnj.J(m7fVar, aygVar, false);
                    } else if (D14 == 1) {
                        hk0Var18 = vnj.J(m7fVar, aygVar, false);
                    } else if (D14 == 2) {
                        hk0Var19 = vnj.J(m7fVar, aygVar, false);
                    } else if (D14 == 3) {
                        str16 = m7fVar.f0();
                    } else if (D14 == 4) {
                        int nextInt3 = m7fVar.nextInt();
                        if (nextInt3 == 1) {
                            i21 = 1;
                        } else {
                            if (nextInt3 != 2) {
                                xq0.x(k5r.i(nextInt3, "Unknown trim path type "));
                                return null;
                            }
                            i21 = 2;
                        }
                    } else if (D14 != 5) {
                        m7fVar.w();
                    } else {
                        z16 = m7fVar.nextBoolean();
                    }
                }
                jl4Var = new dvp(str16, i21, hk0Var17, hk0Var18, hk0Var19, z16);
                kupVar = jl4Var;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            case '\r':
                kupVar = nk0.c(m7fVar, aygVar);
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
            default:
                psg.b("Unknown shape type ".concat(str));
                kupVar = null;
                while (m7fVar.hasNext()) {
                }
                m7fVar.o();
                return kupVar;
        }
    }
}
