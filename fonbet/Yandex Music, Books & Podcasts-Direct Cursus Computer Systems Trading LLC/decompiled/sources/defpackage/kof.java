package defpackage;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class kof {
    public static final j6e a = j6e.s("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final j6e b = j6e.s("d", "a");
    public static final j6e c = j6e.s("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0060. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static iof a(m7f m7fVar, ayg aygVar) {
        String str;
        boolean z;
        mk0 mk0Var;
        Float f;
        String str2;
        boolean z2;
        long j;
        char c2;
        char c3;
        Float f2;
        Float f3;
        String str3;
        long j2;
        boolean z3;
        long j3;
        gk0 gk0Var;
        hk0 hk0Var;
        hk0 hk0Var2;
        hk0 hk0Var3;
        hk0 hk0Var4;
        char c4;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m7fVar.b();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        long j4 = -1;
        mk0 mk0Var2 = null;
        int i = 0;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z4 = false;
        ozw ozwVar = null;
        gs4 gs4Var = null;
        int i5 = 1;
        int i6 = 1;
        gk0 gk0Var2 = null;
        pt0 pt0Var = null;
        hk0 hk0Var5 = null;
        float f9 = 1.0f;
        long j5 = 0;
        String str5 = null;
        String str6 = "UNSET";
        while (true) {
            boolean z5 = false;
            while (m7fVar.hasNext()) {
                switch (m7fVar.D(a)) {
                    case 0:
                        str6 = m7fVar.f0();
                    case 1:
                        f2 = valueOf;
                        j5 = m7fVar.nextInt();
                        valueOf = f2;
                    case 2:
                        str4 = m7fVar.f0();
                    case 3:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        int nextInt = m7fVar.nextInt();
                        i = 7;
                        if (nextInt < 6) {
                            i = ouj.E(7)[nextInt];
                        }
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 4:
                        f2 = valueOf;
                        j4 = m7fVar.nextInt();
                        valueOf = f2;
                    case 5:
                        f3 = valueOf;
                        str3 = str5;
                        i2 = (int) (rvt.c() * m7fVar.nextInt());
                        valueOf = f3;
                        str5 = str3;
                    case 6:
                        f3 = valueOf;
                        str3 = str5;
                        i3 = (int) (rvt.c() * m7fVar.nextInt());
                        valueOf = f3;
                        str5 = str3;
                    case 7:
                        f2 = valueOf;
                        i4 = Color.parseColor(m7fVar.f0());
                        valueOf = f2;
                    case 8:
                        mk0Var2 = nk0.c(m7fVar, aygVar);
                    case 9:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        int nextInt2 = m7fVar.nextInt();
                        if (nextInt2 >= ouj.E(6).length) {
                            aygVar.a("Unsupported matte type: " + nextInt2);
                        } else {
                            i5 = ouj.E(6)[nextInt2];
                            int D = ouj.D(i5);
                            if (D == 3) {
                                aygVar.a("Unsupported matte type: Luma");
                            } else if (D == 4) {
                                aygVar.a("Unsupported matte type: Luma Inverted");
                            }
                            aygVar.p++;
                        }
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 10:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        m7fVar.a();
                        while (m7fVar.hasNext()) {
                            m7fVar.b();
                            boolean z6 = false;
                            gk0 gk0Var3 = null;
                            int i7 = 0;
                            gk0 gk0Var4 = null;
                            while (m7fVar.hasNext()) {
                                String L = m7fVar.L();
                                L.getClass();
                                switch (L.hashCode()) {
                                    case 111:
                                        if (L.equals("o")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3588:
                                        if (L.equals("pt")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 104433:
                                        if (L.equals("inv")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3357091:
                                        if (L.equals("mode")) {
                                            c2 = 3;
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
                                        gk0Var4 = vnj.L(m7fVar, aygVar);
                                        break;
                                    case 1:
                                        gk0Var3 = new gk0(dcf.a(m7fVar, aygVar, rvt.c(), iup.a, false), 5);
                                        break;
                                    case 2:
                                        z6 = m7fVar.nextBoolean();
                                        break;
                                    case 3:
                                        String f0 = m7fVar.f0();
                                        f0.getClass();
                                        switch (f0.hashCode()) {
                                            case 97:
                                                if (f0.equals("a")) {
                                                    c3 = 0;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 105:
                                                if (f0.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                                                    c3 = 1;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 110:
                                                if (f0.equals("n")) {
                                                    c3 = 2;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            case 115:
                                                if (f0.equals("s")) {
                                                    c3 = 3;
                                                    break;
                                                }
                                                c3 = 65535;
                                                break;
                                            default:
                                                c3 = 65535;
                                                break;
                                        }
                                        switch (c3) {
                                            case 0:
                                                i7 = 1;
                                                break;
                                            case 1:
                                                aygVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                i7 = 3;
                                                break;
                                            case 2:
                                                i7 = 4;
                                                break;
                                            case 3:
                                                i7 = 2;
                                                break;
                                            default:
                                                psg.b("Unknown mask mode " + L + ". Defaulting to Add.");
                                                i7 = 1;
                                                break;
                                        }
                                        break;
                                    default:
                                        m7fVar.w();
                                        break;
                                }
                            }
                            m7fVar.o();
                            arrayList.add(new qbh(i7, gk0Var3, gk0Var4, z6));
                        }
                        aygVar.p += arrayList.size();
                        m7fVar.g();
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 11:
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        m7fVar.a();
                        while (m7fVar.hasNext()) {
                            tc6 a2 = uc6.a(m7fVar, aygVar);
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        }
                        m7fVar.g();
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                    case 12:
                        f3 = valueOf;
                        str3 = str5;
                        m7fVar.b();
                        while (m7fVar.hasNext()) {
                            int D2 = m7fVar.D(b);
                            if (D2 == 0) {
                                j2 = j4;
                                gk0Var2 = new gk0(dcf.a(m7fVar, aygVar, rvt.c(), d3a.a, false), 6);
                            } else if (D2 != 1) {
                                m7fVar.H();
                                m7fVar.w();
                            } else {
                                m7fVar.a();
                                if (m7fVar.hasNext()) {
                                    j6e j6eVar = lk0.a;
                                    m7fVar.b();
                                    dn9 dn9Var = null;
                                    anx anxVar = null;
                                    while (m7fVar.hasNext()) {
                                        int D3 = m7fVar.D(lk0.a);
                                        if (D3 != 0) {
                                            boolean z7 = true;
                                            if (D3 != 1) {
                                                m7fVar.H();
                                                m7fVar.w();
                                            } else {
                                                m7fVar.b();
                                                gk0 gk0Var5 = null;
                                                gk0 gk0Var6 = null;
                                                hk0 hk0Var6 = null;
                                                hk0 hk0Var7 = null;
                                                gk0 gk0Var7 = null;
                                                while (m7fVar.hasNext()) {
                                                    int D4 = m7fVar.D(lk0.c);
                                                    if (D4 == 0) {
                                                        gk0Var5 = vnj.I(m7fVar, aygVar);
                                                    } else if (D4 == z7) {
                                                        gk0Var6 = vnj.I(m7fVar, aygVar);
                                                    } else if (D4 == 2) {
                                                        hk0Var6 = vnj.J(m7fVar, aygVar, z7);
                                                    } else if (D4 == 3) {
                                                        hk0Var7 = vnj.J(m7fVar, aygVar, z7);
                                                    } else if (D4 != 4) {
                                                        m7fVar.H();
                                                        m7fVar.w();
                                                    } else {
                                                        gk0Var7 = vnj.L(m7fVar, aygVar);
                                                    }
                                                    z7 = true;
                                                }
                                                m7fVar.o();
                                                dn9Var = new dn9(gk0Var5, gk0Var6, hk0Var6, hk0Var7, gk0Var7, 3);
                                            }
                                        } else {
                                            m7fVar.b();
                                            int i8 = 0;
                                            gk0 gk0Var8 = null;
                                            gk0 gk0Var9 = null;
                                            gk0 gk0Var10 = null;
                                            while (m7fVar.hasNext()) {
                                                gk0 gk0Var11 = gk0Var8;
                                                int D5 = m7fVar.D(lk0.b);
                                                if (D5 != 0) {
                                                    boolean z8 = z5;
                                                    if (D5 == 1) {
                                                        gk0Var9 = vnj.L(m7fVar, aygVar);
                                                    } else if (D5 == 2) {
                                                        gk0Var10 = vnj.L(m7fVar, aygVar);
                                                    } else if (D5 != 3) {
                                                        m7fVar.H();
                                                        m7fVar.w();
                                                    } else {
                                                        int nextInt3 = m7fVar.nextInt();
                                                        if (nextInt3 == 1 || nextInt3 == 2) {
                                                            i8 = nextInt3 == 1 ? 1 : 2;
                                                        } else {
                                                            aygVar.a("Unsupported text range units: " + nextInt3);
                                                            gk0Var8 = gk0Var11;
                                                            z5 = z8;
                                                            i8 = 2;
                                                        }
                                                    }
                                                    gk0Var8 = gk0Var11;
                                                    z5 = z8;
                                                } else {
                                                    gk0Var8 = vnj.L(m7fVar, aygVar);
                                                }
                                            }
                                            gk0 gk0Var12 = gk0Var8;
                                            boolean z9 = z5;
                                            m7fVar.o();
                                            if (gk0Var12 != null || gk0Var9 == null) {
                                                j3 = j4;
                                                gk0Var = gk0Var12;
                                            } else {
                                                j3 = j4;
                                                gk0Var = new gk0(Collections.singletonList(new acf(0)), 2);
                                            }
                                            anx anxVar2 = new anx();
                                            anxVar2.b = gk0Var;
                                            anxVar2.c = gk0Var9;
                                            anxVar2.d = gk0Var10;
                                            anxVar2.a = i8;
                                            anxVar = anxVar2;
                                            z5 = z9;
                                            j4 = j3;
                                        }
                                    }
                                    z3 = z5;
                                    j2 = j4;
                                    m7fVar.o();
                                    pt0Var = new pt0(dn9Var, anxVar);
                                } else {
                                    z3 = z5;
                                    j2 = j4;
                                }
                                while (m7fVar.hasNext()) {
                                    m7fVar.w();
                                }
                                m7fVar.g();
                                z5 = z3;
                            }
                            j4 = j2;
                        }
                        m7fVar.o();
                        valueOf = f3;
                        str5 = str3;
                        break;
                    case 13:
                        f3 = valueOf;
                        str3 = str5;
                        m7fVar.a();
                        ArrayList arrayList3 = new ArrayList();
                        while (m7fVar.hasNext()) {
                            m7fVar.b();
                            while (m7fVar.hasNext()) {
                                int D6 = m7fVar.D(c);
                                if (D6 == 0) {
                                    int nextInt4 = m7fVar.nextInt();
                                    if (nextInt4 == 29) {
                                        j6e j6eVar2 = b83.a;
                                        ozwVar = null;
                                        while (m7fVar.hasNext()) {
                                            if (m7fVar.D(b83.a) != 0) {
                                                m7fVar.H();
                                                m7fVar.w();
                                            } else {
                                                m7fVar.a();
                                                while (m7fVar.hasNext()) {
                                                    m7fVar.b();
                                                    boolean z10 = false;
                                                    ozw ozwVar2 = null;
                                                    while (m7fVar.hasNext()) {
                                                        int D7 = m7fVar.D(b83.b);
                                                        if (D7 == 0) {
                                                            z10 = m7fVar.nextInt() == 0;
                                                        } else if (D7 != 1) {
                                                            m7fVar.H();
                                                            m7fVar.w();
                                                        } else if (z10) {
                                                            ozwVar2 = new ozw(11, vnj.J(m7fVar, aygVar, true));
                                                        } else {
                                                            m7fVar.w();
                                                        }
                                                    }
                                                    m7fVar.o();
                                                    if (ozwVar2 != null) {
                                                        ozwVar = ozwVar2;
                                                    }
                                                }
                                                m7fVar.g();
                                            }
                                        }
                                    } else if (nextInt4 == 25) {
                                        rra rraVar = new rra();
                                        while (m7fVar.hasNext()) {
                                            if (m7fVar.D(rra.f) != 0) {
                                                m7fVar.H();
                                                m7fVar.w();
                                            } else {
                                                m7fVar.a();
                                                while (m7fVar.hasNext()) {
                                                    m7fVar.b();
                                                    String str7 = "";
                                                    while (m7fVar.hasNext()) {
                                                        int D8 = m7fVar.D(rra.g);
                                                        if (D8 == 0) {
                                                            str7 = m7fVar.f0();
                                                        } else if (D8 == 1) {
                                                            str7.getClass();
                                                            switch (str7.hashCode()) {
                                                                case 353103893:
                                                                    if (str7.equals("Distance")) {
                                                                        c4 = 0;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 397447147:
                                                                    if (str7.equals("Opacity")) {
                                                                        c4 = 1;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 1041377119:
                                                                    if (str7.equals("Direction")) {
                                                                        c4 = 2;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 1379387491:
                                                                    if (str7.equals("Shadow Color")) {
                                                                        c4 = 3;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                case 1383710113:
                                                                    if (str7.equals("Softness")) {
                                                                        c4 = 4;
                                                                        break;
                                                                    }
                                                                    c4 = 65535;
                                                                    break;
                                                                default:
                                                                    c4 = 65535;
                                                                    break;
                                                            }
                                                            switch (c4) {
                                                                case 0:
                                                                    rraVar.d = vnj.J(m7fVar, aygVar, true);
                                                                    break;
                                                                case 1:
                                                                    rraVar.b = vnj.J(m7fVar, aygVar, false);
                                                                    break;
                                                                case 2:
                                                                    rraVar.c = vnj.J(m7fVar, aygVar, false);
                                                                    break;
                                                                case 3:
                                                                    rraVar.a = vnj.I(m7fVar, aygVar);
                                                                    break;
                                                                case 4:
                                                                    rraVar.e = vnj.J(m7fVar, aygVar, true);
                                                                    break;
                                                                default:
                                                                    m7fVar.w();
                                                                    break;
                                                            }
                                                        } else {
                                                            m7fVar.H();
                                                            m7fVar.w();
                                                        }
                                                    }
                                                    m7fVar.o();
                                                }
                                                m7fVar.g();
                                            }
                                        }
                                        gk0 gk0Var13 = rraVar.a;
                                        gs4Var = (gk0Var13 == null || (hk0Var = rraVar.b) == null || (hk0Var2 = rraVar.c) == null || (hk0Var3 = rraVar.d) == null || (hk0Var4 = rraVar.e) == null) ? null : new gs4(gk0Var13, hk0Var, hk0Var2, hk0Var3, hk0Var4);
                                    }
                                } else if (D6 != 1) {
                                    m7fVar.H();
                                    m7fVar.w();
                                } else {
                                    arrayList3.add(m7fVar.f0());
                                }
                            }
                            m7fVar.o();
                        }
                        m7fVar.g();
                        aygVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                        valueOf = f3;
                        str5 = str3;
                        break;
                    case 14:
                        f3 = valueOf;
                        str3 = str5;
                        f9 = (float) m7fVar.nextDouble();
                        valueOf = f3;
                        str5 = str3;
                    case 15:
                        f3 = valueOf;
                        str3 = str5;
                        f8 = (float) m7fVar.nextDouble();
                        valueOf = f3;
                        str5 = str3;
                    case 16:
                        f3 = valueOf;
                        str3 = str5;
                        f6 = (float) (m7fVar.nextDouble() * rvt.c());
                        valueOf = f3;
                        str5 = str3;
                    case 17:
                        f3 = valueOf;
                        str3 = str5;
                        f7 = (float) (m7fVar.nextDouble() * rvt.c());
                        valueOf = f3;
                        str5 = str3;
                    case 18:
                        f4 = (float) m7fVar.nextDouble();
                    case 19:
                        f5 = (float) m7fVar.nextDouble();
                    case 20:
                        hk0Var5 = vnj.J(m7fVar, aygVar, false);
                    case 21:
                        str5 = m7fVar.f0();
                    case 22:
                        z4 = m7fVar.nextBoolean();
                    case 23:
                        if (m7fVar.nextInt() == 1) {
                            z5 = true;
                        }
                        break;
                    case 24:
                        int nextInt5 = m7fVar.nextInt();
                        if (nextInt5 >= ouj.E(18).length) {
                            aygVar.a("Unsupported Blend Mode: " + nextInt5);
                            i6 = 1;
                        } else {
                            i6 = ouj.E(18)[nextInt5];
                        }
                    default:
                        m7fVar.H();
                        m7fVar.w();
                        f = valueOf;
                        str2 = str5;
                        z2 = z5;
                        j = j4;
                        valueOf = f;
                        str5 = str2;
                        z5 = z2;
                        j4 = j;
                }
                while (m7fVar.hasNext()) {
                }
            }
            Float f10 = valueOf;
            String str8 = str5;
            boolean z11 = z5;
            long j6 = j4;
            m7fVar.o();
            ArrayList arrayList4 = new ArrayList();
            if (f4 > 0.0f) {
                str = str8;
                z = z11;
                arrayList4.add(new acf(aygVar, f10, f10, (Interpolator) null, 0.0f, Float.valueOf(f4)));
            } else {
                str = str8;
                z = z11;
            }
            if (f5 <= 0.0f) {
                f5 = aygVar.m;
            }
            arrayList4.add(new acf(aygVar, valueOf2, valueOf2, (Interpolator) null, f4, Float.valueOf(f5)));
            arrayList4.add(new acf(aygVar, f10, f10, (Interpolator) null, f5, Float.valueOf(Float.MAX_VALUE)));
            if (str6.endsWith(".ai") || "ai".equals(str)) {
                aygVar.a("Convert your Illustrator layers to shape layers.");
            }
            if (z) {
                if (mk0Var2 == null) {
                    mk0Var2 = new mk0();
                }
                mk0 mk0Var3 = mk0Var2;
                mk0Var3.m = z;
                mk0Var = mk0Var3;
            } else {
                mk0Var = mk0Var2;
            }
            return new iof(arrayList2, aygVar, str6, j5, i, j6, str4, arrayList, mk0Var, i2, i3, i4, f9, f8, f6, f7, gk0Var2, pt0Var, arrayList4, i5, hk0Var5, z4, ozwVar, gs4Var, i6);
        }
    }
}
