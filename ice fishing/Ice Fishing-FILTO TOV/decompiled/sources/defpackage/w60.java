package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.combinations.level.experts.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class w60 {
    public static final d01 AvO7iQsrTN(g60 g60Var, boolean z) {
        he0 he0Var = g60Var.A1EKNP6CxJ.EljAMC1QTz;
        xk xkVar = null;
        if ((he0Var.encWxUiV2 & 8) != 0) {
            loop0: while (true) {
                if (he0Var == null) {
                    break;
                }
                if ((he0Var.AvO7iQsrTN & 8) != 0) {
                    he0 he0Var2 = he0Var;
                    rg0 rg0Var = null;
                    while (he0Var2 != null) {
                        if (he0Var2 instanceof b01) {
                            xkVar = he0Var2;
                            break loop0;
                        }
                        if ((he0Var2.AvO7iQsrTN & 8) != 0 && (he0Var2 instanceof yk)) {
                            int i = 0;
                            for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                if ((he0Var3.AvO7iQsrTN & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        he0Var2 = he0Var3;
                                    } else {
                                        if (rg0Var == null) {
                                            rg0Var = new rg0(new he0[16]);
                                        }
                                        if (he0Var2 != null) {
                                            rg0Var.Yi7zF1RB1(he0Var2);
                                            he0Var2 = null;
                                        }
                                        rg0Var.Yi7zF1RB1(he0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        he0Var2 = vc0.E7jCp8Ls(rg0Var);
                    }
                }
                if ((he0Var.encWxUiV2 & 8) == 0) {
                    break;
                }
                he0Var = he0Var.JFJ3QoxA;
            }
        }
        xkVar.getClass();
        he0 he0Var4 = ((he0) ((b01) xkVar)).OOA6hdeuvCS;
        zz0 WdrkLMV3xh = g60Var.WdrkLMV3xh();
        if (WdrkLMV3xh == null) {
            WdrkLMV3xh = new zz0();
        }
        return new d01(he0Var4, z, g60Var, WdrkLMV3xh);
    }

    public static final va1 E7jCp8Ls(yk ykVar, Object obj) {
        xj0 xj0Var;
        if (!ykVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
        }
        he0 he0Var = ykVar.OOA6hdeuvCS.mOu10nynGul;
        g60 eUH21U3apd = vc0.eUH21U3apd(ykVar);
        while (eUH21U3apd != null) {
            if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 262144) != 0) {
                while (he0Var != null) {
                    if ((he0Var.AvO7iQsrTN & 262144) != 0) {
                        he0 he0Var2 = he0Var;
                        rg0 rg0Var = null;
                        while (he0Var2 != null) {
                            if (he0Var2 instanceof va1) {
                                va1 va1Var = (va1) he0Var2;
                                if (obj.equals(va1Var.E7jCp8Ls())) {
                                    return va1Var;
                                }
                            }
                            if ((he0Var2.AvO7iQsrTN & 262144) != 0 && (he0Var2 instanceof yk)) {
                                int i = 0;
                                for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                    if ((he0Var3.AvO7iQsrTN & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            he0Var2 = he0Var3;
                                        } else {
                                            if (rg0Var == null) {
                                                rg0Var = new rg0(new he0[16]);
                                            }
                                            if (he0Var2 != null) {
                                                rg0Var.Yi7zF1RB1(he0Var2);
                                                he0Var2 = null;
                                            }
                                            rg0Var.Yi7zF1RB1(he0Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            he0Var2 = vc0.E7jCp8Ls(rg0Var);
                        }
                    }
                    he0Var = he0Var.mOu10nynGul;
                }
            }
            eUH21U3apd = eUH21U3apd.cilMamHF();
            he0Var = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
        }
        return null;
    }

    public static final kt0 EljAMC1QTz(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new kt0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void GWasM1elztuh(m31 m31Var, ie0 ie0Var, qx qxVar, int i) {
        Object obj = rd.GWasM1elztuh;
        qxVar.Uxq83abb04(-977568115);
        int i2 = (i & 6) == 0 ? (qxVar.EljAMC1QTz(m31Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(ie0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.encWxUiV2(obj) ? 256 : 128;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            String Y6hRI1cF8 = d70.Y6hRI1cF8(R.string.m3c_snackbar_pane_title, qxVar);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj2 = HFYAaqMd6;
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                fr frVar = new fr();
                frVar.GWasM1elztuh = new Object();
                frVar.Yi7zF1RB1 = new ArrayList();
                qxVar.dcDmLGVhzWm(frVar);
                obj2 = frVar;
            }
            fr frVar2 = (fr) obj2;
            Object obj3 = frVar2.GWasM1elztuh;
            ArrayList arrayList = frVar2.Yi7zF1RB1;
            if (o30.rQPn8YBR(m31Var, obj3)) {
                qxVar.MjxSquD6Av(1443908949);
                qxVar.WIEu4Ya2g8(false);
            } else {
                qxVar.MjxSquD6Av(1154891761);
                frVar2.GWasM1elztuh = m31Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((m31) ((er) arrayList.get(i3)).GWasM1elztuh);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(m31Var)) {
                    arrayList3.add(m31Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj4 = arrayList3.get(i4);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    m31 m31Var2 = (m31) arrayList4.get(i5);
                    arrayList.add(new er(m31Var2, rj0.YZjbz8VdP5(-1952400805, new i31(m31Var2, m31Var, frVar2, Y6hRI1cF8), qxVar)));
                }
                qxVar.WIEu4Ya2g8(false);
            }
            bd0 xqGvceK5x = n7.xqGvceK5x(b9xEq24R1.EljAMC1QTz, false);
            int M3K9sHhK = fb1.M3K9sHhK(qxVar);
            cp0 E7jCp8Ls = qxVar.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, ie0Var);
            oe.X1lG3V04pd.getClass();
            wu wuVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(wuVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, xqGvceK5x);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls);
            r2 r2Var = ne.EljAMC1QTz;
            if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK))) {
                mr0.XnEVoBF0td1l(M3K9sHhK, qxVar, M3K9sHhK, r2Var);
            }
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            at0 WdrkLMV3xh = qxVar.WdrkLMV3xh();
            if (WdrkLMV3xh == null) {
                o4.jivtDDk9H("no recompose scope found");
                return;
            }
            WdrkLMV3xh.Yi7zF1RB1 |= 1;
            frVar2.X1lG3V04pd = WdrkLMV3xh;
            qxVar.MjxSquD6Av(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                er erVar = (er) arrayList.get(i6);
                m31 m31Var3 = (m31) erVar.GWasM1elztuh;
                jd jdVar = erVar.Yi7zF1RB1;
                qxVar.CMh55RymNfS(1325010085, 0, m31Var3, null);
                jdVar.X1lG3V04pd(rj0.YZjbz8VdP5(-1893791890, new j31(m31Var3, 0), qxVar), qxVar, 6);
                qxVar.WIEu4Ya2g8(false);
            }
            qxVar.WIEu4Ya2g8(false);
            qxVar.WIEu4Ya2g8(true);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new w9(m31Var, ie0Var, i);
        }
    }

    public static final Object JFJ3QoxA(gi giVar, lv lvVar, wg wgVar) {
        return giVar.GWasM1elztuh(new ar0(lvVar, null, 1), wgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, va1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [hv] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [he0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void M3K9sHhK(va1 va1Var, hv hvVar) {
        if (!((he0) va1Var).OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitSubtreeIf called on an unattached node");
        }
        rg0 rg0Var = new rg0(new he0[16]);
        he0 he0Var = ((he0) va1Var).OOA6hdeuvCS;
        he0 he0Var2 = he0Var.JFJ3QoxA;
        if (he0Var2 == null) {
            vc0.mOu10nynGul(rg0Var, he0Var);
        } else {
            rg0Var.Yi7zF1RB1(he0Var2);
        }
        while (true) {
            int i = rg0Var.AvO7iQsrTN;
            if (i == 0) {
                return;
            }
            he0 he0Var3 = (he0) rg0Var.rQPn8YBR(i - 1);
            if ((he0Var3.encWxUiV2 & 262144) != 0) {
                for (he0 he0Var4 = he0Var3; he0Var4 != null && he0Var4.Mjvvu5DE; he0Var4 = he0Var4.JFJ3QoxA) {
                    if ((he0Var4.AvO7iQsrTN & 262144) != 0) {
                        yk ykVar = he0Var4;
                        ?? r7 = 0;
                        while (ykVar != 0) {
                            if (ykVar instanceof va1) {
                                va1 va1Var2 = (va1) ykVar;
                                ua1 ua1Var = (o30.rQPn8YBR(va1Var.E7jCp8Ls(), va1Var2.E7jCp8Ls()) && va1Var.getClass() == va1Var2.getClass()) ? (ua1) hvVar.mOu10nynGul(va1Var2) : ua1.OOA6hdeuvCS;
                                if (ua1Var == ua1.AvO7iQsrTN) {
                                    return;
                                }
                                if (ua1Var == ua1.EljAMC1QTz) {
                                    break;
                                }
                            } else if ((ykVar.AvO7iQsrTN & 262144) != 0 && (ykVar instanceof yk)) {
                                he0 he0Var5 = ykVar.jivtDDk9H;
                                int i2 = 0;
                                ykVar = ykVar;
                                r7 = r7;
                                while (he0Var5 != null) {
                                    if ((he0Var5.AvO7iQsrTN & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            ykVar = he0Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new rg0(new he0[16]);
                                            }
                                            if (ykVar != 0) {
                                                r7.Yi7zF1RB1(ykVar);
                                                ykVar = 0;
                                            }
                                            r7.Yi7zF1RB1(he0Var5);
                                        }
                                    }
                                    he0Var5 = he0Var5.JFJ3QoxA;
                                    ykVar = ykVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            ykVar = vc0.E7jCp8Ls(r7);
                        }
                    }
                }
            }
            vc0.mOu10nynGul(rg0Var, he0Var3);
        }
    }

    public static c1 OOA6hdeuvCS(String str, y81 y81Var, long j, hl hlVar, yt ytVar, int i) {
        xp xpVar = xp.OOA6hdeuvCS;
        return new c1(new f1(str, y81Var, xpVar, xpVar, ytVar, hlVar), i, 1, j);
    }

    public static int WIEu4Ya2g8(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        o4.mE4lRynR(mr0.AvO7iQsrTN("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final long WRKkgoJXwDn(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final String WdrkLMV3xh(int i, Object[] objArr, qx qxVar) {
        return ((Resources) qxVar.JFJ3QoxA(r.X1lG3V04pd)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void X1lG3V04pd(qd0 qd0Var, hv hvVar, qx qxVar, int i) {
        qx qxVar2;
        qxVar.Uxq83abb04(-533146003);
        int i2 = (qxVar.EljAMC1QTz(qd0Var) ? 4 : 2) | i | (qxVar.encWxUiV2(hvVar) ? 32 : 16);
        int i3 = 1;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            qxVar2 = qxVar;
            ki1.iwATDS1i01k(ac.EljAMC1QTz, null, rj0.YZjbz8VdP5(390126029, new xz(i3, qd0Var, hvVar), qxVar), qxVar2, 390);
        } else {
            qxVar2 = qxVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(i, 12, qd0Var, hvVar);
        }
    }

    public static iriv6doqetn XnEVoBF0td1l(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new iriv6doqetn(y3.Yi7zF1RB1(view));
        }
        return null;
    }

    public static final si0 Y6hRI1cF8(hv hvVar) {
        ti0 ti0Var = new ti0();
        hvVar.mOu10nynGul(ti0Var);
        boolean z = ti0Var.Yi7zF1RB1;
        String str = ti0Var.xqGvceK5x;
        ri0 ri0Var = ti0Var.GWasM1elztuh;
        if (str != null) {
            boolean z2 = ti0Var.OOA6hdeuvCS;
            boolean z3 = ti0Var.EljAMC1QTz;
            ri0Var.Yi7zF1RB1 = str;
            ri0Var.GWasM1elztuh = -1;
            ri0Var.X1lG3V04pd = z2;
            ri0Var.xqGvceK5x = z3;
        } else {
            int i = ti0Var.X1lG3V04pd;
            boolean z4 = ti0Var.OOA6hdeuvCS;
            boolean z5 = ti0Var.EljAMC1QTz;
            ri0Var.GWasM1elztuh = i;
            ri0Var.Yi7zF1RB1 = null;
            ri0Var.X1lG3V04pd = z4;
            ri0Var.xqGvceK5x = z5;
        }
        String str2 = ri0Var.Yi7zF1RB1;
        if (str2 == null) {
            return new si0(z, false, ri0Var.GWasM1elztuh, ri0Var.X1lG3V04pd, ri0Var.xqGvceK5x, ri0Var.OOA6hdeuvCS, ri0Var.EljAMC1QTz);
        }
        boolean z6 = ri0Var.X1lG3V04pd;
        boolean z7 = ri0Var.xqGvceK5x;
        int i2 = ri0Var.OOA6hdeuvCS;
        int i3 = ri0Var.EljAMC1QTz;
        int i4 = xh0.mOu10nynGul;
        si0 si0Var = new si0(z, false, "android-app://androidx.navigation/".concat(str2).hashCode(), z6, z7, i2, i3);
        si0Var.encWxUiV2 = str2;
        return si0Var;
    }

    public static final void Yi7zF1RB1(jd jdVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(-709502251);
        int i2 = 1;
        if (qxVar.dqB83aoLBB(i & 1, (i & 3) != 2)) {
            v51 v51Var = nw0.GWasM1elztuh;
            kw0 kw0Var = (kw0) qxVar.JFJ3QoxA(v51Var);
            jw0 cilMamHF = q70.cilMamHF(qxVar);
            Object[] objArr = {kw0Var};
            d dVar = new d(19, new pd(20), new X1lG3V04pd(12, kw0Var, cilMamHF));
            boolean encWxUiV2 = qxVar.encWxUiV2(kw0Var) | qxVar.encWxUiV2(cilMamHF);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new h2(5, kw0Var, cilMamHF);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            x80 x80Var = (x80) d70.AEn1Rrio(objArr, dVar, (wu) HFYAaqMd6, qxVar, 0);
            vc0.X1lG3V04pd(v51Var.GWasM1elztuh(x80Var), rj0.YZjbz8VdP5(-412824043, new t7(10, jdVar, x80Var), qxVar), qxVar, 56);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new OGdJP42E(jdVar, i, i2);
        }
    }

    public static boolean YmKjaVtbfp5Z(byte b) {
        return b > -65;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [hv] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [he0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void arNh8D4Z5gB(he0 he0Var, Object obj, hv hvVar) {
        xj0 xj0Var;
        if (!he0Var.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
        }
        he0 he0Var2 = he0Var.OOA6hdeuvCS.mOu10nynGul;
        g60 eUH21U3apd = vc0.eUH21U3apd(he0Var);
        while (eUH21U3apd != null) {
            if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 262144) != 0) {
                while (he0Var2 != null) {
                    if ((he0Var2.AvO7iQsrTN & 262144) != 0) {
                        yk ykVar = he0Var2;
                        ?? r4 = 0;
                        while (ykVar != 0) {
                            if (ykVar instanceof va1) {
                                va1 va1Var = (va1) ykVar;
                                if (!(obj.equals(va1Var.E7jCp8Ls()) ? ((Boolean) hvVar.mOu10nynGul(va1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((ykVar.AvO7iQsrTN & 262144) != 0 && (ykVar instanceof yk)) {
                                he0 he0Var3 = ykVar.jivtDDk9H;
                                int i = 0;
                                ykVar = ykVar;
                                r4 = r4;
                                while (he0Var3 != null) {
                                    if ((he0Var3.AvO7iQsrTN & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            ykVar = he0Var3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new rg0(new he0[16]);
                                            }
                                            if (ykVar != 0) {
                                                r4.Yi7zF1RB1(ykVar);
                                                ykVar = 0;
                                            }
                                            r4.Yi7zF1RB1(he0Var3);
                                        }
                                    }
                                    he0Var3 = he0Var3.JFJ3QoxA;
                                    ykVar = ykVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            ykVar = vc0.E7jCp8Ls(r4);
                        }
                    }
                    he0Var2 = he0Var2.mOu10nynGul;
                }
            }
            eUH21U3apd = eUH21U3apd.cilMamHF();
            he0Var2 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void cilMamHF(he0 he0Var, wu wuVar) {
        tk0 tk0Var = he0Var.rQPn8YBR;
        if (tk0Var == null) {
            tk0Var = new tk0((sk0) he0Var);
            he0Var.rQPn8YBR = tk0Var;
        }
        in0 snapshotObserver = ((c) vc0.A1EKNP6CxJ(he0Var)).getSnapshotObserver();
        snapshotObserver.GWasM1elztuh.X1lG3V04pd(tk0Var, XdwzlWIkSDqF.pog2g9KITJA, wuVar);
    }

    public static final void encWxUiV2(p31 p31Var, ie0 ie0Var, mv mvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(-1077081618);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(p31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (qxVar.EljAMC1QTz(ie0Var) ? 32 : 16) | 384;
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 147) != 146)) {
            mvVar = rd.GWasM1elztuh;
            m31 m31Var = (m31) p31Var.Yi7zF1RB1.getValue();
            Fm8W7vP7q fm8W7vP7q = (Fm8W7vP7q) qxVar.JFJ3QoxA(kf.GWasM1elztuh);
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(m31Var) | qxVar.encWxUiV2(fm8W7vP7q);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new xqGvceK5x(m31Var, fm8W7vP7q, null, 24);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            ki1.encWxUiV2((lv) HFYAaqMd6, qxVar, m31Var);
            GWasM1elztuh((m31) p31Var.Yi7zF1RB1.getValue(), ie0Var, qxVar, i3 & 1008);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(p31Var, ie0Var, mvVar, i);
        }
    }

    public static final float iwATDS1i01k(xv0 xv0Var) {
        if (xv0Var != null) {
            return xv0Var.GWasM1elztuh;
        }
        return 0.0f;
    }

    public static final long jivtDDk9H(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : yb.Yi7zF1RB1(yb.xqGvceK5x(j) * f, j);
    }

    public static final String lv06NcmrQ(int i, qx qxVar) {
        return ((Resources) qxVar.JFJ3QoxA(r.X1lG3V04pd)).getString(i);
    }

    public static final ArrayList mE4lRynR(Map map, hv hvVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            eh0 eh0Var = (eh0) entry.getValue();
            Boolean bool = eh0Var != null ? Boolean.FALSE : null;
            bool.getClass();
            if (!bool.booleanValue() && !eh0Var.Yi7zF1RB1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) hvVar.mOu10nynGul((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [hv] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [he0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void pog2g9KITJA(he0 he0Var, String str, hv hvVar) {
        if (!he0Var.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitSubtreeIf called on an unattached node");
        }
        rg0 rg0Var = new rg0(new he0[16]);
        he0 he0Var2 = he0Var.OOA6hdeuvCS;
        he0 he0Var3 = he0Var2.JFJ3QoxA;
        if (he0Var3 == null) {
            vc0.mOu10nynGul(rg0Var, he0Var2);
        } else {
            rg0Var.Yi7zF1RB1(he0Var3);
        }
        while (true) {
            int i = rg0Var.AvO7iQsrTN;
            if (i == 0) {
                return;
            }
            he0 he0Var4 = (he0) rg0Var.rQPn8YBR(i - 1);
            if ((he0Var4.encWxUiV2 & 262144) != 0) {
                for (he0 he0Var5 = he0Var4; he0Var5 != null && he0Var5.Mjvvu5DE; he0Var5 = he0Var5.JFJ3QoxA) {
                    if ((he0Var5.AvO7iQsrTN & 262144) != 0) {
                        yk ykVar = he0Var5;
                        ?? r6 = 0;
                        while (ykVar != 0) {
                            if (ykVar instanceof va1) {
                                va1 va1Var = (va1) ykVar;
                                ua1 ua1Var = str.equals(va1Var.E7jCp8Ls()) ? (ua1) hvVar.mOu10nynGul(va1Var) : ua1.OOA6hdeuvCS;
                                if (ua1Var == ua1.AvO7iQsrTN) {
                                    return;
                                }
                                if (ua1Var == ua1.EljAMC1QTz) {
                                    break;
                                }
                            } else if ((ykVar.AvO7iQsrTN & 262144) != 0 && (ykVar instanceof yk)) {
                                he0 he0Var6 = ykVar.jivtDDk9H;
                                int i2 = 0;
                                ykVar = ykVar;
                                r6 = r6;
                                while (he0Var6 != null) {
                                    if ((he0Var6.AvO7iQsrTN & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            ykVar = he0Var6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new rg0(new he0[16]);
                                            }
                                            if (ykVar != 0) {
                                                r6.Yi7zF1RB1(ykVar);
                                                ykVar = 0;
                                            }
                                            r6.Yi7zF1RB1(he0Var6);
                                        }
                                    }
                                    he0Var6 = he0Var6.JFJ3QoxA;
                                    ykVar = ykVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            ykVar = vc0.E7jCp8Ls(r6);
                        }
                    }
                }
            }
            vc0.mOu10nynGul(rg0Var, he0Var4);
        }
    }

    public static final long rQPn8YBR(long j, boolean z, int i, float f) {
        int encWxUiV2 = ((z || i == 2 || i == 4 || i == 5) && eg.xqGvceK5x(j)) ? eg.encWxUiV2(j) : Integer.MAX_VALUE;
        if (eg.JFJ3QoxA(j) != encWxUiV2) {
            encWxUiV2 = o50.encWxUiV2(l60.mOu10nynGul(f), eg.JFJ3QoxA(j), encWxUiV2);
        }
        return fb1.WRKkgoJXwDn(0, encWxUiV2, 0, eg.AvO7iQsrTN(j));
    }

    public static final xv0 uFEq9NpZ(wc0 wc0Var) {
        Object encWxUiV2 = wc0Var.encWxUiV2();
        if (encWxUiV2 instanceof xv0) {
            return (xv0) encWxUiV2;
        }
        return null;
    }

    public static final void xqGvceK5x(final hv hvVar, final wu wuVar, final wu wuVar2, final wu wuVar3, rd0 rd0Var, qx qxVar, final int i) {
        final rd0 rd0Var2;
        rd0 rd0Var3;
        int i2;
        rd0 rd0Var4;
        hvVar.getClass();
        wuVar.getClass();
        wuVar2.getClass();
        wuVar3.getClass();
        qxVar.Uxq83abb04(2127656433);
        int i3 = i | (qxVar.encWxUiV2(hvVar) ? 4 : 2) | (qxVar.encWxUiV2(wuVar) ? 32 : 16) | (qxVar.encWxUiV2(wuVar2) ? 256 : 128) | (qxVar.encWxUiV2(wuVar3) ? 2048 : 1024) | 8192;
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 9363) != 9362)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                ff1 GWasM1elztuh = eb0.GWasM1elztuh(qxVar);
                if (GWasM1elztuh == null) {
                    o4.jivtDDk9H("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    rd0Var3 = (rd0) ki1.DmJncFq5(st0.GWasM1elztuh(rd0.class), GWasM1elztuh.OOA6hdeuvCS(), ki1.WRKkgoJXwDn(GWasM1elztuh), b50.GWasM1elztuh(qxVar));
                    i2 = i3 & (-57345);
                }
            } else {
                qxVar.YXi2hvwn7WL();
                i2 = i3 & (-57345);
                rd0Var3 = rd0Var;
            }
            qxVar.YmKjaVtbfp5Z();
            mg0 Mjvvu5DE = vc0.Mjvvu5DE(rd0Var3.X1lG3V04pd, qxVar);
            aa aaVar = rd0Var3.OOA6hdeuvCS;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (z || HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = new dk(hvVar, wuVar, wuVar2, wuVar3, 3);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            vc0.Yi7zF1RB1(aaVar, (hv) HFYAaqMd6, qxVar, 0);
            qd0 qd0Var = (qd0) Mjvvu5DE.getValue();
            boolean encWxUiV2 = qxVar.encWxUiV2(rd0Var3);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd62 == k61Var) {
                rd0Var4 = rd0Var3;
                OOA6hdeuvCS oOA6hdeuvCS = new OOA6hdeuvCS(1, rd0Var4, rd0.class, "onIntent", "onIntent(Lcom/combinations/level/experts/core/mvi/UiIntent;)V", 0, 0, 3);
                qxVar.dcDmLGVhzWm(oOA6hdeuvCS);
                HFYAaqMd62 = oOA6hdeuvCS;
            } else {
                rd0Var4 = rd0Var3;
            }
            X1lG3V04pd(qd0Var, (hv) ((vv) HFYAaqMd62), qxVar, 0);
            rd0Var2 = rd0Var4;
        } else {
            qxVar.YXi2hvwn7WL();
            rd0Var2 = rd0Var;
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new lv(wuVar, wuVar2, wuVar3, rd0Var2, i) { // from class: pd0
                public final /* synthetic */ wu AvO7iQsrTN;
                public final /* synthetic */ wu EljAMC1QTz;
                public final /* synthetic */ wu encWxUiV2;
                public final /* synthetic */ rd0 mOu10nynGul;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(1);
                    w60.xqGvceK5x(hv.this, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public void Mjvvu5DE(g90 g90Var, String str) {
        if (g90.mOu10nynGul.compareTo(g90Var) <= 0) {
            mOu10nynGul(g90Var, str);
        }
    }

    public abstract void mOu10nynGul(g90 g90Var, String str);
}
