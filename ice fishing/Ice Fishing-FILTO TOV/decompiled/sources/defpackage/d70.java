package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewParent;
import com.combinations.level.experts.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class d70 {
    public static void A1EKNP6CxJ(y31 y31Var, y31 y31Var2, hv hvVar) {
        if (y31Var != y31Var2) {
            y31Var2.getClass();
            y31.YmKjaVtbfp5Z(y31Var);
            y31Var2.X1lG3V04pd();
        } else if (y31Var instanceof sa1) {
            ((sa1) y31Var).Mjvvu5DE = hvVar;
        } else if (y31Var instanceof ta1) {
            ((ta1) y31Var).encWxUiV2 = hvVar;
        } else {
            o4.EljAMC1QTz(y31Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final Object AEn1Rrio(Object[] objArr, bx0 bx0Var, wu wuVar, qx qxVar, int i) {
        return YZjbz8VdP5(Arrays.copyOf(objArr, objArr.length), bx0Var, wuVar, qxVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final float AvO7iQsrTN(tp0 tp0Var, boolean z, sz[] szVarArr, float f) {
        float f2 = Float.NaN;
        for (sz szVar : szVarArr) {
            float X1lG3V04pd = tp0Var.X1lG3V04pd(szVar);
            if (!Float.isNaN(f2)) {
                int i = z != (X1lG3V04pd > f2) ? i + 1 : 0;
            }
            f2 = X1lG3V04pd;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final void DmJncFq5(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(ki1.HFYAaqMd6(j)), i, i2, 33);
        }
    }

    public static void E7jCp8Ls(n8 n8Var) {
        n8Var.AvO7iQsrTN(null, false);
    }

    public static final long EXrPz3p7hFb(kq0 kq0Var, boolean z) {
        long xqGvceK5x = uk0.xqGvceK5x(kq0Var.X1lG3V04pd, kq0Var.AvO7iQsrTN);
        if (z || !kq0Var.Yi7zF1RB1()) {
            return xqGvceK5x;
        }
        return 0L;
    }

    public static final long EljAMC1QTz(int i, int i2) {
        if (i < 0 || i2 < 0) {
            u10.GWasM1elztuh("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = r81.X1lG3V04pd;
        return j;
    }

    public static final void GWasM1elztuh(t90 t90Var, hv hvVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(1220373486);
        int i2 = i | 16 | (qxVar.encWxUiV2(hvVar) ? 256 : 128);
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                t90Var = (t90) qxVar.JFJ3QoxA(za0.GWasM1elztuh);
            } else {
                qxVar.YXi2hvwn7WL();
            }
            int i3 = i2 & (-113);
            qxVar.YmKjaVtbfp5Z();
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(kc1.GWasM1elztuh) | qxVar.EljAMC1QTz(t90Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new x90(t90Var.AvO7iQsrTN());
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            Yi7zF1RB1(t90Var, (x90) HFYAaqMd6, hvVar, qxVar, i3 & 896);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(i, 11, t90Var, hvVar);
        }
    }

    public static final void HFYAaqMd6(Spannable spannable, long j, el elVar, int i, int i2) {
        long Yi7zF1RB1 = a91.Yi7zF1RB1(j);
        if (b91.GWasM1elztuh(Yi7zF1RB1, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(vc0.MZhzXH72(elVar.MItybXapHX(j)), false), i, i2, 33);
        } else if (b91.GWasM1elztuh(Yi7zF1RB1, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(a91.X1lG3V04pd(j)), i, i2, 33);
        }
    }

    public static final boolean JFJ3QoxA(kq0 kq0Var) {
        return !kq0Var.encWxUiV2 && kq0Var.xqGvceK5x;
    }

    public static y31 M3K9sHhK(y31 y31Var) {
        if (y31Var instanceof sa1) {
            sa1 sa1Var = (sa1) y31Var;
            if (sa1Var.jivtDDk9H == z50.XnEVoBF0td1l()) {
                sa1Var.Mjvvu5DE = null;
                return y31Var;
            }
        }
        if (y31Var instanceof ta1) {
            ta1 ta1Var = (ta1) y31Var;
            if (ta1Var.mOu10nynGul == z50.XnEVoBF0td1l()) {
                ta1Var.encWxUiV2 = null;
                return y31Var;
            }
        }
        y31 AvO7iQsrTN = e41.AvO7iQsrTN(y31Var, null, false);
        AvO7iQsrTN.JFJ3QoxA();
        return AvO7iQsrTN;
    }

    public static final boolean MZhzXH72(int i, n2 n2Var, rt rtVar, kt0 kt0Var) {
        rt uFEq9NpZ;
        rg0 rg0Var = new rg0(new rt[16]);
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitChildren called on an unattached node");
        }
        rg0 rg0Var2 = new rg0(new he0[16]);
        he0 he0Var = rtVar.OOA6hdeuvCS;
        he0 he0Var2 = he0Var.JFJ3QoxA;
        if (he0Var2 == null) {
            vc0.mOu10nynGul(rg0Var2, he0Var);
        } else {
            rg0Var2.Yi7zF1RB1(he0Var2);
        }
        while (true) {
            int i2 = rg0Var2.AvO7iQsrTN;
            if (i2 == 0) {
                break;
            }
            he0 he0Var3 = (he0) rg0Var2.rQPn8YBR(i2 - 1);
            if ((he0Var3.encWxUiV2 & 1024) == 0) {
                vc0.mOu10nynGul(rg0Var2, he0Var3);
            } else {
                while (true) {
                    if (he0Var3 == null) {
                        break;
                    }
                    if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                        rg0 rg0Var3 = null;
                        while (he0Var3 != null) {
                            if (he0Var3 instanceof rt) {
                                rt rtVar2 = (rt) he0Var3;
                                if (rtVar2.Mjvvu5DE) {
                                    rg0Var.Yi7zF1RB1(rtVar2);
                                }
                            } else if ((he0Var3.AvO7iQsrTN & 1024) != 0 && (he0Var3 instanceof yk)) {
                                int i3 = 0;
                                for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                    if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            he0Var3 = he0Var4;
                                        } else {
                                            if (rg0Var3 == null) {
                                                rg0Var3 = new rg0(new he0[16]);
                                            }
                                            if (he0Var3 != null) {
                                                rg0Var3.Yi7zF1RB1(he0Var3);
                                                he0Var3 = null;
                                            }
                                            rg0Var3.Yi7zF1RB1(he0Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            he0Var3 = vc0.E7jCp8Ls(rg0Var3);
                        }
                    } else {
                        he0Var3 = he0Var3.JFJ3QoxA;
                    }
                }
            }
        }
        while (rg0Var.AvO7iQsrTN != 0 && (uFEq9NpZ = uFEq9NpZ(rg0Var, kt0Var, i)) != null) {
            if (uFEq9NpZ.XmVeRDAr().GWasM1elztuh) {
                return ((Boolean) n2Var.mOu10nynGul(uFEq9NpZ)).booleanValue();
            }
            if (WIEu4Ya2g8(i, n2Var, uFEq9NpZ, kt0Var)) {
                return true;
            }
            rg0Var.JFJ3QoxA(uFEq9NpZ);
        }
        return false;
    }

    public static y31 Mjvvu5DE() {
        return (y31) e41.Yi7zF1RB1.OOA6hdeuvCS();
    }

    public static final void OOA6hdeuvCS(final boolean z, final lv lvVar, qx qxVar, final int i) {
        qxVar.Uxq83abb04(1818896922);
        int i2 = (qxVar.AvO7iQsrTN(z) ? 4 : 2) | i | (qxVar.encWxUiV2(lvVar) ? 32 : 16);
        if ((i2 & 19) == 18 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
        } else {
            l60.OOA6hdeuvCS(z, lvVar, qxVar, i2 & 126);
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new lv(z, lvVar, i) { // from class: jh0
                public final /* synthetic */ lv EljAMC1QTz;
                public final /* synthetic */ boolean OOA6hdeuvCS;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(1);
                    d70.OOA6hdeuvCS(this.OOA6hdeuvCS, this.EljAMC1QTz, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final l20 TpUsjqg3bxO(e20 e20Var) {
        return new l20(e20Var.GWasM1elztuh, e20Var.Yi7zF1RB1, e20Var.X1lG3V04pd, e20Var.xqGvceK5x);
    }

    public static final void VeqTn1PQw7(d01 d01Var, int i, tx0 tx0Var) {
        d01 d01Var2;
        rg0 rg0Var = new rg0(new d01[16]);
        List mOu10nynGul = d01Var.mOu10nynGul(false, false);
        while (true) {
            rg0Var.xqGvceK5x(rg0Var.AvO7iQsrTN, mOu10nynGul);
            while (true) {
                int i2 = rg0Var.AvO7iQsrTN;
                if (i2 == 0) {
                    return;
                }
                d01Var2 = (d01) rg0Var.rQPn8YBR(i2 - 1);
                boolean k8h8IjolWQ = o30.k8h8IjolWQ(d01Var2);
                zz0 zz0Var = d01Var2.xqGvceK5x;
                hg0 hg0Var = zz0Var.OOA6hdeuvCS;
                if (!k8h8IjolWQ && !hg0Var.X1lG3V04pd(h01.JFJ3QoxA)) {
                    bk0 xqGvceK5x = d01Var2.xqGvceK5x();
                    if (xqGvceK5x == null) {
                        throw mr0.EljAMC1QTz("Expected semantics node to have a coordinator.");
                    }
                    y20 J3Xc8BaqpN8 = n30.J3Xc8BaqpN8(o50.OOA6hdeuvCS(xqGvceK5x, true));
                    if (J3Xc8BaqpN8.GWasM1elztuh < J3Xc8BaqpN8.X1lG3V04pd && J3Xc8BaqpN8.Yi7zF1RB1 < J3Xc8BaqpN8.xqGvceK5x) {
                        Object AvO7iQsrTN = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(yz0.OOA6hdeuvCS);
                        if (AvO7iQsrTN == null) {
                            AvO7iQsrTN = null;
                        }
                        lv lvVar = (lv) AvO7iQsrTN;
                        Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(h01.lv06NcmrQ);
                        sx0 sx0Var = (sx0) (AvO7iQsrTN2 != null ? AvO7iQsrTN2 : null);
                        if (lvVar != null && sx0Var != null && ((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue() > 0.0f) {
                            int i3 = 1 + i;
                            tx0Var.mOu10nynGul(new vx0(d01Var2, i3, J3Xc8BaqpN8, xqGvceK5x));
                            VeqTn1PQw7(d01Var2, i3, tx0Var);
                        }
                    }
                }
            }
            mOu10nynGul = d01Var2.mOu10nynGul(false, false);
        }
    }

    public static final boolean WIEu4Ya2g8(int i, n2 n2Var, rt rtVar, kt0 kt0Var) {
        if (MZhzXH72(i, n2Var, rtVar, kt0Var)) {
            return true;
        }
        Boolean bool = (Boolean) p.cilMamHF(rtVar, i, new kl0(((nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner()).EljAMC1QTz(), rtVar, kt0Var, i, n2Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long WRKkgoJXwDn(int i, kt0 kt0Var, kt0 kt0Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = kt0Var.GWasM1elztuh;
            f2 = kt0Var2.X1lG3V04pd;
        } else if (i == 4) {
            f = kt0Var2.GWasM1elztuh;
            f2 = kt0Var.X1lG3V04pd;
        } else if (i == 5) {
            f = kt0Var.Yi7zF1RB1;
            f2 = kt0Var2.xqGvceK5x;
        } else {
            if (i != 6) {
                o4.jivtDDk9H("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = kt0Var2.Yi7zF1RB1;
            f2 = kt0Var.xqGvceK5x;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = kt0Var.Yi7zF1RB1;
            f3 = ((kt0Var.xqGvceK5x - f7) / 2.0f) + f7;
            f4 = kt0Var2.Yi7zF1RB1;
            f5 = kt0Var2.xqGvceK5x;
        } else {
            if (i != 5 && i != 6) {
                o4.jivtDDk9H("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = kt0Var.GWasM1elztuh;
            f3 = ((kt0Var.X1lG3V04pd - f8) / 2.0f) + f8;
            f4 = kt0Var2.GWasM1elztuh;
            f5 = kt0Var2.X1lG3V04pd;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean WdrkLMV3xh(int i, kt0 kt0Var, kt0 kt0Var2) {
        if (i == 3) {
            float f = kt0Var2.X1lG3V04pd;
            float f2 = kt0Var2.GWasM1elztuh;
            float f3 = kt0Var.X1lG3V04pd;
            return (f > f3 || f2 >= f3) && f2 > kt0Var.GWasM1elztuh;
        }
        if (i == 4) {
            float f4 = kt0Var2.GWasM1elztuh;
            float f5 = kt0Var2.X1lG3V04pd;
            float f6 = kt0Var.GWasM1elztuh;
            return (f4 < f6 || f5 <= f6) && f5 < kt0Var.X1lG3V04pd;
        }
        if (i == 5) {
            float f7 = kt0Var2.xqGvceK5x;
            float f8 = kt0Var2.Yi7zF1RB1;
            float f9 = kt0Var.xqGvceK5x;
            return (f7 > f9 || f8 >= f9) && f8 > kt0Var.Yi7zF1RB1;
        }
        if (i != 6) {
            o4.jivtDDk9H("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = kt0Var2.Yi7zF1RB1;
        float f11 = kt0Var2.xqGvceK5x;
        float f12 = kt0Var.Yi7zF1RB1;
        return (f10 < f12 || f11 <= f12) && f11 < kt0Var.xqGvceK5x;
    }

    public static final void X1lG3V04pd(Boolean bool, Object obj, t90 t90Var, hv hvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(696924721);
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.encWxUiV2(hvVar) ? 2048 : 1024;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 1171) != 1170)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                t90Var = (t90) qxVar.JFJ3QoxA(za0.GWasM1elztuh);
            } else {
                qxVar.YXi2hvwn7WL();
            }
            int i3 = i2 & (-897);
            qxVar.YmKjaVtbfp5Z();
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(bool) | qxVar.EljAMC1QTz(obj) | qxVar.EljAMC1QTz(t90Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new ba0(t90Var.AvO7iQsrTN());
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            xqGvceK5x(t90Var, (ba0) HFYAaqMd6, hvVar, qxVar, (i3 >> 3) & 896);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        t90 t90Var2 = t90Var;
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new Hc2GqxcqBiX(bool, obj, t90Var2, hvVar, i, 2);
        }
    }

    public static final void XnEVoBF0td1l(rt rtVar, rg0 rg0Var) {
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitChildren called on an unattached node");
        }
        rg0 rg0Var2 = new rg0(new he0[16]);
        he0 he0Var = rtVar.OOA6hdeuvCS;
        he0 he0Var2 = he0Var.JFJ3QoxA;
        if (he0Var2 == null) {
            vc0.mOu10nynGul(rg0Var2, he0Var);
        } else {
            rg0Var2.Yi7zF1RB1(he0Var2);
        }
        while (true) {
            int i = rg0Var2.AvO7iQsrTN;
            if (i == 0) {
                return;
            }
            he0 he0Var3 = (he0) rg0Var2.rQPn8YBR(i - 1);
            if ((he0Var3.encWxUiV2 & 1024) == 0) {
                vc0.mOu10nynGul(rg0Var2, he0Var3);
            } else {
                while (true) {
                    if (he0Var3 == null) {
                        break;
                    }
                    if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                        rg0 rg0Var3 = null;
                        while (he0Var3 != null) {
                            if (he0Var3 instanceof rt) {
                                rt rtVar2 = (rt) he0Var3;
                                if (rtVar2.Mjvvu5DE && !vc0.eUH21U3apd(rtVar2).YXi2hvwn7WL) {
                                    if (rtVar2.XmVeRDAr().GWasM1elztuh) {
                                        rg0Var.Yi7zF1RB1(rtVar2);
                                    } else {
                                        XnEVoBF0td1l(rtVar2, rg0Var);
                                    }
                                }
                            } else if ((he0Var3.AvO7iQsrTN & 1024) != 0 && (he0Var3 instanceof yk)) {
                                int i2 = 0;
                                for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                    if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            he0Var3 = he0Var4;
                                        } else {
                                            if (rg0Var3 == null) {
                                                rg0Var3 = new rg0(new he0[16]);
                                            }
                                            if (he0Var3 != null) {
                                                rg0Var3.Yi7zF1RB1(he0Var3);
                                                he0Var3 = null;
                                            }
                                            rg0Var3.Yi7zF1RB1(he0Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            he0Var3 = vc0.E7jCp8Ls(rg0Var3);
                        }
                    } else {
                        he0Var3 = he0Var3.JFJ3QoxA;
                    }
                }
            }
        }
    }

    public static final String Y6hRI1cF8(int i, qx qxVar) {
        qxVar.JFJ3QoxA(r.GWasM1elztuh);
        return ((Context) qxVar.JFJ3QoxA(r.Yi7zF1RB1)).getResources().getString(i);
    }

    public static final Object YZjbz8VdP5(Object[] objArr, bx0 bx0Var, wu wuVar, qx qxVar, int i, int i2) {
        Object[] objArr2;
        bx0 bx0Var2;
        final Object obj;
        Object EljAMC1QTz;
        long j = qxVar.qugwajBSa59j;
        ki1.Y6hRI1cF8(36);
        final String l = Long.toString(j, 36);
        l.getClass();
        bx0Var.getClass();
        final kw0 kw0Var = (kw0) qxVar.JFJ3QoxA(nw0.GWasM1elztuh);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        Object obj2 = ue.GWasM1elztuh;
        if (HFYAaqMd6 == obj2) {
            Object xqGvceK5x = (kw0Var == null || (EljAMC1QTz = kw0Var.EljAMC1QTz(l)) == null) ? null : bx0Var.xqGvceK5x(EljAMC1QTz);
            if (xqGvceK5x == null) {
                xqGvceK5x = wuVar.GWasM1elztuh();
            }
            objArr2 = objArr;
            bx0Var2 = bx0Var;
            Object hw0Var = new hw0(bx0Var2, kw0Var, l, xqGvceK5x, objArr2);
            qxVar.dcDmLGVhzWm(hw0Var);
            HFYAaqMd6 = hw0Var;
        } else {
            objArr2 = objArr;
            bx0Var2 = bx0Var;
        }
        final hw0 hw0Var2 = (hw0) HFYAaqMd6;
        Object obj3 = Arrays.equals(objArr2, hw0Var2.mOu10nynGul) ? hw0Var2.encWxUiV2 : null;
        if (obj3 == null) {
            obj3 = wuVar.GWasM1elztuh();
        }
        boolean encWxUiV2 = qxVar.encWxUiV2(hw0Var2) | ((((i & 112) ^ 48) > 32 && qxVar.encWxUiV2(bx0Var2)) || (i & 48) == 32) | qxVar.encWxUiV2(kw0Var) | qxVar.EljAMC1QTz(l) | qxVar.encWxUiV2(obj3) | qxVar.encWxUiV2(objArr2);
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (encWxUiV2 || HFYAaqMd62 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final bx0 bx0Var3 = bx0Var2;
            Object obj4 = new wu() { // from class: cu0
                @Override // defpackage.wu
                public final Object GWasM1elztuh() {
                    boolean z;
                    hw0 hw0Var3 = hw0.this;
                    kw0 kw0Var2 = hw0Var3.EljAMC1QTz;
                    kw0 kw0Var3 = kw0Var;
                    boolean z2 = true;
                    if (kw0Var2 != kw0Var3) {
                        hw0Var3.EljAMC1QTz = kw0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = hw0Var3.AvO7iQsrTN;
                    String str2 = l;
                    if (o30.rQPn8YBR(str, str2)) {
                        z2 = z;
                    } else {
                        hw0Var3.AvO7iQsrTN = str2;
                    }
                    hw0Var3.OOA6hdeuvCS = bx0Var3;
                    hw0Var3.encWxUiV2 = obj;
                    hw0Var3.mOu10nynGul = objArr3;
                    f4 f4Var = hw0Var3.JFJ3QoxA;
                    if (f4Var != null && z2) {
                        f4Var.Y6hRI1cF8();
                        hw0Var3.JFJ3QoxA = null;
                        hw0Var3.GWasM1elztuh();
                    }
                    return kc1.GWasM1elztuh;
                }
            };
            qxVar.dcDmLGVhzWm(obj4);
            HFYAaqMd62 = obj4;
        } else {
            obj = obj3;
        }
        ki1.rQPn8YBR((wu) HFYAaqMd62, qxVar);
        return obj;
    }

    public static final void Yi7zF1RB1(t90 t90Var, x90 x90Var, hv hvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(912823238);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(t90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(x90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.encWxUiV2(hvVar) ? 256 : 128;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            boolean encWxUiV2 = qxVar.encWxUiV2(x90Var) | ((i2 & 896) == 256) | qxVar.encWxUiV2(t90Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new d2(t90Var, x90Var, hvVar, i3);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            ki1.AvO7iQsrTN(t90Var, x90Var, (hv) HFYAaqMd6, qxVar);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(t90Var, x90Var, hvVar, i, 4);
        }
    }

    public static final String YmKjaVtbfp5Z(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static z60 arNh8D4Z5gB(a90 a90Var, wu wuVar) {
        k61 k61Var = k61.encWxUiV2;
        int ordinal = a90Var.ordinal();
        if (ordinal == 0) {
            return new m71(wuVar);
        }
        if (ordinal == 1) {
            gw0 gw0Var = new gw0();
            gw0Var.OOA6hdeuvCS = wuVar;
            gw0Var.EljAMC1QTz = k61Var;
            return gw0Var;
        }
        if (ordinal != 2) {
            o4.xqGvceK5x();
            return null;
        }
        rc1 rc1Var = new rc1();
        rc1Var.OOA6hdeuvCS = wuVar;
        rc1Var.EljAMC1QTz = k61Var;
        return rc1Var;
    }

    public static final int cilMamHF(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Boolean dqB83aoLBB(int i, n2 n2Var, rt rtVar, kt0 kt0Var) {
        int ordinal = rtVar.bfDgRvRIg().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                rt cilMamHF = qj.cilMamHF(rtVar);
                if (cilMamHF == null) {
                    o4.jivtDDk9H("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = cilMamHF.bfDgRvRIg().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean dqB83aoLBB = dqB83aoLBB(i, n2Var, cilMamHF, kt0Var);
                        if (!o30.rQPn8YBR(dqB83aoLBB, Boolean.FALSE)) {
                            return dqB83aoLBB;
                        }
                        if (kt0Var == null) {
                            if (cilMamHF.bfDgRvRIg() != qt.EljAMC1QTz) {
                                o4.jivtDDk9H("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            rt Mjvvu5DE = qj.Mjvvu5DE(cilMamHF);
                            if (Mjvvu5DE == null) {
                                o4.jivtDDk9H("ActiveParent must have a focusedChild");
                                return null;
                            }
                            kt0Var = qj.Y6hRI1cF8(Mjvvu5DE);
                        }
                        return Boolean.valueOf(WIEu4Ya2g8(i, n2Var, rtVar, kt0Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            o4.xqGvceK5x();
                            return null;
                        }
                        o4.jivtDDk9H("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (kt0Var == null) {
                    kt0Var = qj.Y6hRI1cF8(cilMamHF);
                }
                return Boolean.valueOf(WIEu4Ya2g8(i, n2Var, rtVar, kt0Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return rtVar.XmVeRDAr().GWasM1elztuh ? (Boolean) n2Var.mOu10nynGul(rtVar) : kt0Var == null ? Boolean.valueOf(iwATDS1i01k(rtVar, i, n2Var)) : Boolean.valueOf(MZhzXH72(i, n2Var, rtVar, kt0Var));
                }
                o4.xqGvceK5x();
                return null;
            }
        }
        return Boolean.valueOf(iwATDS1i01k(rtVar, i, n2Var));
    }

    public static final float eUH21U3apd(long j, float f, el elVar) {
        float X1lG3V04pd;
        long Yi7zF1RB1 = a91.Yi7zF1RB1(j);
        if (b91.GWasM1elztuh(Yi7zF1RB1, 4294967296L)) {
            if (elVar.mOu10nynGul() <= 1.05d) {
                return elVar.MItybXapHX(j);
            }
            X1lG3V04pd = a91.X1lG3V04pd(j) / a91.X1lG3V04pd(elVar.NyNgffpi(f));
        } else {
            if (!b91.GWasM1elztuh(Yi7zF1RB1, 8589934592L)) {
                return Float.NaN;
            }
            X1lG3V04pd = a91.X1lG3V04pd(j);
        }
        return X1lG3V04pd * f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.X1lG3V04pd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.o4.jivtDDk9H("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.GWasM1elztuh - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.xqGvceK5x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.Yi7zF1RB1 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.o4.jivtDDk9H("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean encWxUiV2(kt0 kt0Var, kt0 kt0Var2, kt0 kt0Var3, int i) {
        boolean mOu10nynGul = mOu10nynGul(i, kt0Var3, kt0Var);
        float f = kt0Var3.Yi7zF1RB1;
        float f2 = kt0Var3.xqGvceK5x;
        float f3 = kt0Var3.GWasM1elztuh;
        float f4 = kt0Var3.X1lG3V04pd;
        float f5 = kt0Var.xqGvceK5x;
        float f6 = kt0Var.Yi7zF1RB1;
        float f7 = kt0Var.X1lG3V04pd;
        float f8 = kt0Var.GWasM1elztuh;
        if (!mOu10nynGul && mOu10nynGul(i, kt0Var2, kt0Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            o4.jivtDDk9H("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean iwATDS1i01k(rt rtVar, int i, hv hvVar) {
        kt0 kt0Var;
        rg0 rg0Var = new rg0(new rt[16]);
        XnEVoBF0td1l(rtVar, rg0Var);
        int i2 = rg0Var.AvO7iQsrTN;
        if (i2 <= 1) {
            rt rtVar2 = (rt) (i2 == 0 ? null : rg0Var.OOA6hdeuvCS[0]);
            if (rtVar2 != null) {
                return ((Boolean) hvVar.mOu10nynGul(rtVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                kt0 Y6hRI1cF8 = qj.Y6hRI1cF8(rtVar);
                float f = Y6hRI1cF8.GWasM1elztuh;
                float f2 = Y6hRI1cF8.Yi7zF1RB1;
                kt0Var = new kt0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    o4.jivtDDk9H("This function should only be used for 2-D focus search");
                    return false;
                }
                kt0 Y6hRI1cF82 = qj.Y6hRI1cF8(rtVar);
                float f3 = Y6hRI1cF82.X1lG3V04pd;
                float f4 = Y6hRI1cF82.xqGvceK5x;
                kt0Var = new kt0(f3, f4, f3, f4);
            }
            rt uFEq9NpZ = uFEq9NpZ(rg0Var, kt0Var, i);
            if (uFEq9NpZ != null) {
                return ((Boolean) hvVar.mOu10nynGul(uFEq9NpZ)).booleanValue();
            }
        }
        return false;
    }

    public static final wb0 jivtDDk9H(wb0 wb0Var) {
        g60 g60Var = wb0Var.mE4lRynR.mE4lRynR;
        while (true) {
            g60 cilMamHF = g60Var.cilMamHF();
            g60 g60Var2 = null;
            if ((cilMamHF != null ? cilMamHF.E7jCp8Ls : null) == null) {
                wb0 P4U4zqyW7wx = g60Var.A1EKNP6CxJ.xqGvceK5x.P4U4zqyW7wx();
                P4U4zqyW7wx.getClass();
                return P4U4zqyW7wx;
            }
            g60 cilMamHF2 = g60Var.cilMamHF();
            if (cilMamHF2 != null) {
                g60Var2 = cilMamHF2.E7jCp8Ls;
            }
            g60Var2.getClass();
            g60 cilMamHF3 = g60Var.cilMamHF();
            cilMamHF3.getClass();
            g60Var = cilMamHF3.E7jCp8Ls;
            g60Var.getClass();
        }
    }

    public static Object k8h8IjolWQ(d5idzIhj55b d5idzihj55b, wu wuVar) {
        y31 sa1Var;
        y31 y31Var = (y31) e41.Yi7zF1RB1.OOA6hdeuvCS();
        if (y31Var instanceof sa1) {
            sa1 sa1Var2 = (sa1) y31Var;
            if (sa1Var2.jivtDDk9H == z50.XnEVoBF0td1l()) {
                hv hvVar = sa1Var2.Mjvvu5DE;
                hv hvVar2 = sa1Var2.mE4lRynR;
                try {
                    ((sa1) y31Var).Mjvvu5DE = e41.rQPn8YBR(d5idzihj55b, hvVar, true);
                    ((sa1) y31Var).mE4lRynR = hvVar2;
                    return wuVar.GWasM1elztuh();
                } finally {
                    sa1Var2.Mjvvu5DE = hvVar;
                    sa1Var2.mE4lRynR = hvVar2;
                }
            }
        }
        if (y31Var == null || (y31Var instanceof lg0)) {
            sa1Var = new sa1(y31Var instanceof lg0 ? (lg0) y31Var : null, d5idzihj55b, null, true, false);
        } else {
            sa1Var = y31Var.Y6hRI1cF8(d5idzihj55b);
        }
        try {
            y31 JFJ3QoxA = sa1Var.JFJ3QoxA();
            try {
                Object GWasM1elztuh = wuVar.GWasM1elztuh();
                y31.YmKjaVtbfp5Z(JFJ3QoxA);
                sa1Var.X1lG3V04pd();
                return GWasM1elztuh;
            } catch (Throwable th) {
                y31.YmKjaVtbfp5Z(JFJ3QoxA);
                throw th;
            }
        } catch (Throwable th2) {
            sa1Var.X1lG3V04pd();
            throw th2;
        }
    }

    public static final boolean lv06NcmrQ(kt0 kt0Var, kt0 kt0Var2, kt0 kt0Var3, int i) {
        if (!WdrkLMV3xh(i, kt0Var, kt0Var3)) {
            return false;
        }
        if (WdrkLMV3xh(i, kt0Var2, kt0Var3) && !encWxUiV2(kt0Var3, kt0Var, kt0Var2, i)) {
            return !encWxUiV2(kt0Var3, kt0Var2, kt0Var, i) && WRKkgoJXwDn(i, kt0Var3, kt0Var) < WRKkgoJXwDn(i, kt0Var3, kt0Var2);
        }
        return true;
    }

    public static final ViewParent mE4lRynR(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final boolean mOu10nynGul(int i, kt0 kt0Var, kt0 kt0Var2) {
        if (i == 3 || i == 4) {
            return kt0Var.xqGvceK5x > kt0Var2.Yi7zF1RB1 && kt0Var.Yi7zF1RB1 < kt0Var2.xqGvceK5x;
        }
        if (i == 5 || i == 6) {
            return kt0Var.X1lG3V04pd > kt0Var2.GWasM1elztuh && kt0Var.GWasM1elztuh < kt0Var2.X1lG3V04pd;
        }
        o4.jivtDDk9H("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void ozMwhSAI(c31 c31Var, m4 m4Var, int i) {
        while (true) {
            int i2 = c31Var.cilMamHF;
            if (i > i2 && i < c31Var.Y6hRI1cF8) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c31Var.rezfBrjOrqK();
            if (c31Var.WRKkgoJXwDn(c31Var.cilMamHF)) {
                m4Var.YmKjaVtbfp5Z();
            }
            c31Var.JFJ3QoxA();
        }
    }

    public static m71 pog2g9KITJA(wu wuVar) {
        wuVar.getClass();
        return new m71(wuVar);
    }

    public static final boolean rQPn8YBR(kq0 kq0Var) {
        return kq0Var.encWxUiV2 && !kq0Var.xqGvceK5x;
    }

    public static final void rezfBrjOrqK(Spannable spannable, gb0 gb0Var, int i, int i2) {
        if (gb0Var != null) {
            ArrayList arrayList = new ArrayList(sb.dcDmLGVhzWm(gb0Var, 10));
            Iterator it = gb0Var.OOA6hdeuvCS.iterator();
            while (it.hasNext()) {
                arrayList.add(((fb0) it.next()).GWasM1elztuh);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final rt uFEq9NpZ(rg0 rg0Var, kt0 kt0Var, int i) {
        kt0 xqGvceK5x;
        rt rtVar = null;
        if (i == 3) {
            xqGvceK5x = kt0Var.xqGvceK5x((kt0Var.X1lG3V04pd - kt0Var.GWasM1elztuh) + 1.0f, 0.0f);
        } else if (i == 4) {
            xqGvceK5x = kt0Var.xqGvceK5x(-((kt0Var.X1lG3V04pd - kt0Var.GWasM1elztuh) + 1.0f), 0.0f);
        } else if (i == 5) {
            xqGvceK5x = kt0Var.xqGvceK5x(0.0f, (kt0Var.xqGvceK5x - kt0Var.Yi7zF1RB1) + 1.0f);
        } else {
            if (i != 6) {
                o4.jivtDDk9H("This function should only be used for 2-D focus search");
                return null;
            }
            xqGvceK5x = kt0Var.xqGvceK5x(0.0f, -((kt0Var.xqGvceK5x - kt0Var.Yi7zF1RB1) + 1.0f));
        }
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i2 = rg0Var.AvO7iQsrTN;
        for (int i3 = 0; i3 < i2; i3++) {
            rt rtVar2 = (rt) objArr[i3];
            if (qj.YZjbz8VdP5(rtVar2)) {
                kt0 Y6hRI1cF8 = qj.Y6hRI1cF8(rtVar2);
                if (lv06NcmrQ(Y6hRI1cF8, xqGvceK5x, kt0Var, i)) {
                    rtVar = rtVar2;
                    xqGvceK5x = Y6hRI1cF8;
                }
            }
        }
        return rtVar;
    }

    public static final void xqGvceK5x(t90 t90Var, ba0 ba0Var, hv hvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(228371534);
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(t90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(ba0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.encWxUiV2(hvVar) ? 256 : 128;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            boolean encWxUiV2 = qxVar.encWxUiV2(ba0Var) | ((i2 & 896) == 256) | qxVar.encWxUiV2(t90Var);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new d2(t90Var, ba0Var, hvVar, 5);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            ki1.AvO7iQsrTN(t90Var, ba0Var, (hv) HFYAaqMd6, qxVar);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(t90Var, ba0Var, hvVar, i, 5);
        }
    }
}
