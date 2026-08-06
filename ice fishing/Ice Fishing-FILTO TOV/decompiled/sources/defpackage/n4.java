package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.LocaleList;
import com.combinations.level.experts.core.domain.model.ConduitKt;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n4 {
    public static volatile n4 X1lG3V04pd;
    public static i00 Yi7zF1RB1;
    public final Object GWasM1elztuh;

    public n4(int i) {
        switch (i) {
            case 1:
                this.GWasM1elztuh = new Object();
                Executors.newFixedThreadPool(4, new sk());
                break;
            default:
                this.GWasM1elztuh = new n4(1);
                break;
        }
    }

    public static void AvO7iQsrTN(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final i00 E7jCp8Ls() {
        i00 i00Var = Yi7zF1RB1;
        if (i00Var != null) {
            return i00Var;
        }
        h00 h00Var = new h00("Filled.Star", false, 96);
        int i = pd1.GWasM1elztuh;
        t41 t41Var = new t41(yb.Yi7zF1RB1);
        j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(18);
        j6iin2o8eou.XnEVoBF0td1l(12.0f, 17.27f);
        j6iin2o8eou.rQPn8YBR(18.18f, 21.0f);
        j6iin2o8eou.E7jCp8Ls(-1.64f, -7.03f);
        j6iin2o8eou.rQPn8YBR(22.0f, 9.24f);
        j6iin2o8eou.E7jCp8Ls(-7.19f, -0.61f);
        j6iin2o8eou.rQPn8YBR(12.0f, 2.0f);
        j6iin2o8eou.rQPn8YBR(9.19f, 8.63f);
        j6iin2o8eou.rQPn8YBR(2.0f, 9.24f);
        j6iin2o8eou.E7jCp8Ls(5.46f, 4.73f);
        j6iin2o8eou.rQPn8YBR(5.82f, 21.0f);
        j6iin2o8eou.Yi7zF1RB1();
        h00.GWasM1elztuh(h00Var, (ArrayList) j6iin2o8eou.EljAMC1QTz, t41Var);
        i00 Yi7zF1RB12 = h00Var.Yi7zF1RB1();
        Yi7zF1RB1 = Yi7zF1RB12;
        return Yi7zF1RB12;
    }

    public static final boolean EljAMC1QTz(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final void GWasM1elztuh(final Object obj, final int i, final w70 w70Var, final jd jdVar, qx qxVar, final int i2) {
        int i3;
        qxVar.Uxq83abb04(872548579);
        if ((i2 & 6) == 0) {
            i3 = (qxVar.encWxUiV2(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qxVar.xqGvceK5x(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qxVar.encWxUiV2(w70Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qxVar.encWxUiV2(jdVar) ? 2048 : 1024;
        }
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 1171) != 1170)) {
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(obj) | qxVar.EljAMC1QTz(w70Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj2 = ue.GWasM1elztuh;
            if (EljAMC1QTz || HFYAaqMd6 == obj2) {
                HFYAaqMd6 = new u70(obj, w70Var);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            u70 u70Var = (u70) HFYAaqMd6;
            u70Var.X1lG3V04pd = i;
            fo0 fo0Var = u70Var.AvO7iQsrTN;
            ps0 ps0Var = sp0.GWasM1elztuh;
            u70 u70Var2 = (u70) qxVar.JFJ3QoxA(ps0Var);
            y31 Mjvvu5DE = d70.Mjvvu5DE();
            hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
            y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
            try {
                if (u70Var2 != ((u70) fo0Var.getValue())) {
                    fo0Var.setValue(u70Var2);
                    if (u70Var.xqGvceK5x > 0) {
                        u70 u70Var3 = u70Var.OOA6hdeuvCS;
                        if (u70Var3 != null) {
                            u70Var3.Yi7zF1RB1();
                        }
                        if (u70Var2 != null) {
                            u70Var2.GWasM1elztuh();
                        } else {
                            u70Var2 = null;
                        }
                        u70Var.OOA6hdeuvCS = u70Var2;
                    }
                }
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(u70Var);
                Object HFYAaqMd62 = qxVar.HFYAaqMd6();
                if (EljAMC1QTz2 || HFYAaqMd62 == obj2) {
                    HFYAaqMd62 = new E7jCp8Ls(7, u70Var);
                    qxVar.dcDmLGVhzWm(HFYAaqMd62);
                }
                ki1.EljAMC1QTz(u70Var, (hv) HFYAaqMd62, qxVar);
                vc0.X1lG3V04pd(ps0Var.GWasM1elztuh(u70Var), jdVar, qxVar, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                throw th;
            }
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new lv() { // from class: v70
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    n4.GWasM1elztuh(obj, i, w70Var, jdVar, (qx) obj3, n4.lv06NcmrQ(i2 | 1));
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static gb0 JFJ3QoxA() {
        f4 f4Var = zp0.GWasM1elztuh;
        f4Var.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((x51) f4Var.xqGvceK5x)) {
            try {
                gb0 gb0Var = (gb0) f4Var.X1lG3V04pd;
                if (gb0Var != null && localeList == ((LocaleList) f4Var.Yi7zF1RB1)) {
                    return gb0Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new fb0(localeList.get(i)));
                }
                gb0 gb0Var2 = new gb0(arrayList);
                f4Var.Yi7zF1RB1 = localeList;
                f4Var.X1lG3V04pd = gb0Var2;
                return gb0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void Mjvvu5DE(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final void OOA6hdeuvCS(String str, String str2, qx qxVar, int i) {
        String str3 = str;
        qx qxVar2 = qxVar;
        qxVar2.Uxq83abb04(1000207714);
        int i2 = i | (qxVar2.EljAMC1QTz(str3) ? 4 : 2) | (qxVar2.EljAMC1QTz(str2) ? 32 : 16);
        if (qxVar2.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            nc GWasM1elztuh = lc.GWasM1elztuh(rj0.Yi7zF1RB1, b9xEq24R1.Mjvvu5DE, qxVar2, 48);
            int hashCode = Long.hashCode(qxVar2.qugwajBSa59j);
            cp0 E7jCp8Ls = qxVar2.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar2, fe0.GWasM1elztuh);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar2.c4eaifQP();
            if (qxVar2.CMh55RymNfS) {
                qxVar2.rQPn8YBR(hfVar);
            } else {
                qxVar2.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar2, GWasM1elztuh);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar2, E7jCp8Ls);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar2, Integer.valueOf(hashCode));
            l60.WdrkLMV3xh(qxVar2, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar2, MZhzXH72);
            v51 v51Var = xb1.GWasM1elztuh;
            j81.Yi7zF1RB1(str2, null, ac.XnEVoBF0td1l, 0L, 0L, null, 0L, 0, false, 0, 0, ((vb1) qxVar2.JFJ3QoxA(v51Var)).AvO7iQsrTN, qxVar, ((i2 >> 3) & 14) | 384, 131066);
            str3 = str;
            j81.Yi7zF1RB1(str3, null, ac.uFEq9NpZ, 0L, 0L, null, 0L, 0, false, 0, 0, ((vb1) qxVar.JFJ3QoxA(v51Var)).uFEq9NpZ, qxVar, (i2 & 14) | 384, 131066);
            qxVar2 = qxVar;
            qxVar2.WIEu4Ya2g8(true);
        } else {
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(i, 17, str3, str2);
        }
    }

    public static int WIEu4Ya2g8(int i, int i2, int i3, int i4) {
        Side side = Side.INSTANCE;
        int dx = side.dx(i4) + (i3 % i);
        int dy = side.dy(i4) + (i3 / i);
        if (dx < 0 || dy < 0 || dx >= i || dy >= i2) {
            return -1;
        }
        return (dy * i) + dx;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WdrkLMV3xh(long j, lv lvVar, wg wgVar) {
        s91 s91Var;
        int i;
        rt0 rt0Var;
        if (wgVar instanceof s91) {
            s91Var = (s91) wgVar;
            int i2 = s91Var.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s91Var.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                Object obj = s91Var.mOu10nynGul;
                i = s91Var.JFJ3QoxA;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    if (j > 0) {
                        rt0 rt0Var2 = new rt0();
                        try {
                            s91Var.encWxUiV2 = rt0Var2;
                            s91Var.JFJ3QoxA = 1;
                            r91 r91Var = new r91(j, s91Var);
                            rt0Var2.OOA6hdeuvCS = r91Var;
                            Object mE4lRynR = mE4lRynR(r91Var, lvVar);
                            qh qhVar = qh.OOA6hdeuvCS;
                            return mE4lRynR == qhVar ? qhVar : mE4lRynR;
                        } catch (q91 e) {
                            e = e;
                            rt0Var = rt0Var2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rt0Var = s91Var.encWxUiV2;
                try {
                    o50.A1EKNP6CxJ(obj);
                    return obj;
                } catch (q91 e2) {
                    e = e2;
                }
                if (e.OOA6hdeuvCS != rt0Var.OOA6hdeuvCS) {
                    throw e;
                }
                return null;
            }
        }
        s91Var = new s91(wgVar);
        Object obj2 = s91Var.mOu10nynGul;
        i = s91Var.JFJ3QoxA;
        if (i != 0) {
        }
        if (e.OOA6hdeuvCS != rt0Var.OOA6hdeuvCS) {
        }
        return null;
    }

    public static final long X1lG3V04pd(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void XnEVoBF0td1l(w50 w50Var) {
        vc0.eUH21U3apd(w50Var).ozMwhSAI();
    }

    public static final double Y6hRI1cF8(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final sv0 Yi7zF1RB1(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new sv0(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static boolean[] YmKjaVtbfp5Z(int i, int i2, List list, int i3) {
        int WIEu4Ya2g8;
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        if (i3 >= 0 && i3 < list.size()) {
            v4 v4Var = new v4();
            zArr[i3] = true;
            v4Var.addLast(Integer.valueOf(i3));
            while (!v4Var.isEmpty()) {
                int intValue = ((Number) v4Var.removeLast()).intValue();
                int intValue2 = ((Number) list.get(intValue)).intValue();
                for (int i4 : Side.INSTANCE.getEntries()) {
                    if (ConduitKt.hasSide(intValue2, i4) && (WIEu4Ya2g8 = WIEu4Ya2g8(i, i2, intValue, i4)) >= 0 && !zArr[WIEu4Ya2g8] && ConduitKt.hasSide(((Number) list.get(WIEu4Ya2g8)).intValue(), Side.INSTANCE.opposite(i4))) {
                        zArr[WIEu4Ya2g8] = true;
                        v4Var.addLast(Integer.valueOf(WIEu4Ya2g8));
                    }
                }
            }
        }
        return zArr;
    }

    public static final void cilMamHF() {
        throw new UnsupportedOperationException();
    }

    public static final hi0 encWxUiV2(Context context) {
        context.getClass();
        hi0 hi0Var = new hi0(context);
        ph0 ph0Var = hi0Var.Yi7zF1RB1;
        fj0 fj0Var = ph0Var.mE4lRynR;
        fj0Var.GWasM1elztuh(new xd(fj0Var));
        fj0 fj0Var2 = ph0Var.mE4lRynR;
        fj0Var2.GWasM1elztuh(new zd());
        fj0Var2.GWasM1elztuh(new am());
        return hi0Var;
    }

    public static final boolean iwATDS1i01k(sv0 sv0Var) {
        long j = sv0Var.OOA6hdeuvCS;
        return (j >>> 32) == (4294967295L & j) && j == sv0Var.EljAMC1QTz && j == sv0Var.AvO7iQsrTN && j == sv0Var.encWxUiV2;
    }

    public static final long jivtDDk9H(kt0 kt0Var) {
        float f = kt0Var.X1lG3V04pd - kt0Var.GWasM1elztuh;
        float f2 = kt0Var.xqGvceK5x - kt0Var.Yi7zF1RB1;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final int lv06NcmrQ(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final Object mE4lRynR(r91 r91Var, lv lvVar) {
        Object ucVar;
        Object J3Xc8BaqpN8;
        ki1.YZjbz8VdP5(r91Var, true, new xm(o30.M3K9sHhK(r91Var.JFJ3QoxA.OOA6hdeuvCS()).X1lG3V04pd(r91Var.rQPn8YBR, r91Var, r91Var.mOu10nynGul)));
        try {
            if (lvVar instanceof h6) {
                fb1.XnEVoBF0td1l(2, lvVar);
                ucVar = lvVar.EljAMC1QTz(r91Var, r91Var);
            } else {
                ucVar = rj0.TpUsjqg3bxO(lvVar, r91Var, r91Var);
            }
        } catch (Throwable th) {
            ucVar = new uc(th, false);
        }
        qh qhVar = qh.OOA6hdeuvCS;
        if (ucVar == qhVar || (J3Xc8BaqpN8 = r91Var.J3Xc8BaqpN8(ucVar)) == p.EljAMC1QTz) {
            return qhVar;
        }
        if (J3Xc8BaqpN8 instanceof uc) {
            Throwable th2 = ((uc) J3Xc8BaqpN8).GWasM1elztuh;
            if (!(th2 instanceof q91)) {
                throw th2;
            }
            if (((q91) th2).OOA6hdeuvCS != r91Var) {
                throw th2;
            }
            if (ucVar instanceof uc) {
                throw ((uc) ucVar).GWasM1elztuh;
            }
        } else {
            ucVar = p.pog2g9KITJA(J3Xc8BaqpN8);
        }
        return ucVar;
    }

    public static final long mOu10nynGul(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final Object rQPn8YBR(zz0 zz0Var, k01 k01Var) {
        Object AvO7iQsrTN = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(k01Var);
        if (AvO7iQsrTN == null) {
            return null;
        }
        return AvO7iQsrTN;
    }

    public static final boolean uFEq9NpZ(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final void xqGvceK5x(pf1 pf1Var, int i, xy0 xy0Var, wu wuVar, wu wuVar2, wu wuVar3, qx qxVar, int i2) {
        pf1Var.getClass();
        wuVar.getClass();
        wuVar2.getClass();
        wuVar3.getClass();
        qxVar.Uxq83abb04(1173760668);
        int i3 = i2 | (qxVar.EljAMC1QTz(pf1Var) ? 4 : 2) | (qxVar.xqGvceK5x(i) ? 32 : 16) | (qxVar.EljAMC1QTz(xy0Var) ? 256 : 128) | (qxVar.encWxUiV2(wuVar) ? 2048 : 1024) | (qxVar.encWxUiV2(wuVar2) ? 16384 : 8192) | (qxVar.encWxUiV2(wuVar3) ? 131072 : 65536);
        if (qxVar.dqB83aoLBB(i3 & 1, (74899 & i3) != 74898)) {
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new mw0(8);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            rj0.X1lG3V04pd((wu) HFYAaqMd6, new bm(false, false, false), rj0.YZjbz8VdP5(628091251, new of1(xy0Var, pf1Var, i, wuVar, wuVar2, wuVar3, 0), qxVar), qxVar, 438);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new of1(pf1Var, i, xy0Var, wuVar, wuVar2, wuVar3, i2);
        }
    }
}
