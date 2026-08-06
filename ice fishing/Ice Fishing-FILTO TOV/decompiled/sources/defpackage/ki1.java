package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.Layout;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ki1 {
    public static final jd GWasM1elztuh = new jd(1671175332, false, new pd(5));
    public static final jd Yi7zF1RB1 = new jd(-1614884723, false, new pd(6));
    public static final tm X1lG3V04pd = new tm();
    public static final nf1 xqGvceK5x = new nf1(0.31006f, 0.31616f);
    public static final nf1 OOA6hdeuvCS = new nf1(0.34567f, 0.3585f);
    public static final nf1 EljAMC1QTz = new nf1(0.32168f, 0.33767f);
    public static final nf1 AvO7iQsrTN = new nf1(0.31271f, 0.32902f);
    public static final float[] encWxUiV2 = {0.964212f, 1.0f, 0.825188f};
    public static final Object mOu10nynGul = new Object();
    public static final StackTraceElement[] JFJ3QoxA = new StackTraceElement[0];
    public static final d rQPn8YBR = new d(19, new pd(24), new oh0(12));
    public static final b21 E7jCp8Ls = b21.AvO7iQsrTN;
    public static final float XnEVoBF0td1l = 8.0f;
    public static final float uFEq9NpZ = 24.0f;
    public static final ec iwATDS1i01k = ec.rQPn8YBR;
    public static final float WIEu4Ya2g8 = 0.38f;
    public static final yr YmKjaVtbfp5Z = new yr();

    public static boolean A1EKNP6CxJ(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final int AEn1Rrio(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final void AvO7iQsrTN(Object obj, Object obj2, hv hvVar, qx qxVar) {
        boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(obj) | qxVar.EljAMC1QTz(obj2);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (EljAMC1QTz2 || HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new rm(hvVar);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
    }

    public static final we1 DmJncFq5(va vaVar, ef1 ef1Var, xh xhVar, px0 px0Var) {
        ef1Var.getClass();
        xhVar.getClass();
        rx0 rx0Var = new rx0(ef1Var, new f50(vaVar, px0Var), xhVar);
        vaVar.GWasM1elztuh();
        String GWasM1elztuh2 = vaVar.GWasM1elztuh();
        if (GWasM1elztuh2 != null) {
            return rx0Var.YmKjaVtbfp5Z(vaVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(GWasM1elztuh2));
        }
        o4.mE4lRynR("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E7jCp8Ls(final int i, ie0 ie0Var, float f, int i2, long j, qx qxVar, final int i3) {
        float f2;
        final ie0 ie0Var2;
        final int i4;
        final long j2;
        i00 i00Var;
        qxVar.Uxq83abb04(962831493);
        int i5 = i3 | (qxVar.xqGvceK5x(i) ? 4 : 2) | 27696;
        boolean z = false;
        Object[] objArr = 0;
        boolean z2 = true;
        if (qxVar.dqB83aoLBB(i5 & 1, (i5 & 9363) != 9362)) {
            long j3 = ac.mOu10nynGul;
            zv0 GWasM1elztuh2 = yv0.GWasM1elztuh(new s4(2.0f, new o4(objArr == true ? 1 : 0)), b9xEq24R1.iwATDS1i01k, qxVar, 6);
            int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            fe0 fe0Var = fe0.GWasM1elztuh;
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, fe0Var);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, GWasM1elztuh2);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
            l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            qxVar.MjxSquD6Av(-32035501);
            int i6 = 0;
            while (i6 < 3) {
                boolean z3 = i6 < i ? z2 : z;
                if (z3) {
                    i00Var = n4.E7jCp8Ls();
                } else {
                    i00Var = z50.GWasM1elztuh;
                    if (i00Var == null) {
                        h00 h00Var = new h00("Outlined.Star", z, 96);
                        int i7 = pd1.GWasM1elztuh;
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
                        j6iin2o8eou.rQPn8YBR(12.0f, 17.27f);
                        j6iin2o8eou.Yi7zF1RB1();
                        h00.GWasM1elztuh(h00Var, (ArrayList) j6iin2o8eou.EljAMC1QTz, t41Var);
                        i00Var = h00Var.Yi7zF1RB1();
                        z50.GWasM1elztuh = i00Var;
                    }
                }
                e00.GWasM1elztuh(i00Var, null, v21.Yi7zF1RB1(fe0Var, f), z3 ? j3 : yb.Yi7zF1RB1(0.5f, ac.uFEq9NpZ), qxVar, 48, 0);
                i6++;
                z = false;
                z2 = true;
            }
            boolean z4 = z;
            f2 = f;
            qxVar.WIEu4Ya2g8(z4);
            qxVar.WIEu4Ya2g8(true);
            i4 = 3;
            j2 = j3;
            ie0Var2 = fe0Var;
        } else {
            f2 = f;
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
            i4 = i2;
            j2 = j;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            final float f3 = f2;
            Mjvvu5DE.xqGvceK5x = new lv(i, ie0Var2, f3, i4, j2, i3) { // from class: xg
                public final /* synthetic */ float AvO7iQsrTN;
                public final /* synthetic */ ie0 EljAMC1QTz;
                public final /* synthetic */ int OOA6hdeuvCS;
                public final /* synthetic */ int encWxUiV2;
                public final /* synthetic */ long mOu10nynGul;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(385);
                    ki1.E7jCp8Ls(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static boolean EXrPz3p7hFb() {
        try {
            if (c.R46bVSe7ra == null) {
                c.R46bVSe7ra = Class.forName("android.os.SystemProperties");
            }
            if (c.P4U4zqyW7wx == null) {
                Class cls = c.R46bVSe7ra;
                c.P4U4zqyW7wx = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = c.P4U4zqyW7wx;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return o30.rQPn8YBR(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void EljAMC1QTz(Object obj, hv hvVar, qx qxVar) {
        boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(obj);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (EljAMC1QTz2 || HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new rm(hvVar);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
    }

    public static m3 GWasM1elztuh(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new m3(vc0.mOu10nynGul, Float.valueOf(0.0f), new n3(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final int HFYAaqMd6(long j) {
        float[] fArr = jc.GWasM1elztuh;
        return (int) (yb.GWasM1elztuh(j, jc.OOA6hdeuvCS) >>> 32);
    }

    public static final void JFJ3QoxA(final long j, ie0 ie0Var, qx qxVar, final int i) {
        final ie0 ie0Var2;
        qxVar.Uxq83abb04(-224953887);
        int i2 = ((i & 6) == 0 ? (qxVar.OOA6hdeuvCS(j) ? 4 : 2) | i : i) | 48;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj = ue.GWasM1elztuh;
            if (HFYAaqMd6 == obj) {
                ji1 ji1Var = new ji1(20260716, 0);
                ArrayList arrayList = new ArrayList(70);
                for (int i3 = 0; i3 < 70; i3++) {
                    arrayList.add(new g51(ji1Var.Yi7zF1RB1(), ji1Var.Yi7zF1RB1() * 0.82f, (ji1Var.Yi7zF1RB1() * 1.7f) + 0.6f, ji1Var.Yi7zF1RB1() * 6.283f, ji1Var.Yi7zF1RB1() > 0.85f ? j : yb.X1lG3V04pd));
                }
                qxVar.dcDmLGVhzWm(arrayList);
                HFYAaqMd6 = arrayList;
            }
            final List list = (List) HFYAaqMd6;
            final k10 Mjvvu5DE = Mjvvu5DE(MZhzXH72("backdrop", qxVar), 0.0f, 6.283f, new j10(fb1.JFXS9W1rB5s4(9000, 2, po.Yi7zF1RB1), iu0.OOA6hdeuvCS), "twinkle", qxVar);
            tr trVar = v21.Yi7zF1RB1;
            boolean encWxUiV22 = qxVar.encWxUiV2(list) | qxVar.EljAMC1QTz(Mjvvu5DE) | ((i2 & 14) == 4);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd62 == obj) {
                HFYAaqMd62 = new hv() { // from class: c6
                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj2) {
                        ho hoVar = (ho) obj2;
                        hoVar.getClass();
                        Float valueOf = Float.valueOf(0.0f);
                        long j2 = ac.GWasM1elztuh;
                        rn0[] rn0VarArr = (rn0[]) Arrays.copyOf(new rn0[]{new rn0(valueOf, new yb(j2)), new rn0(Float.valueOf(0.55f), new yb(ac.Yi7zF1RB1)), new rn0(Float.valueOf(1.0f), new yb(j2))}, 3);
                        char c = ' ';
                        long j3 = 4294967295L;
                        long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L);
                        ArrayList arrayList2 = new ArrayList(rn0VarArr.length);
                        for (rn0 rn0Var : rn0VarArr) {
                            arrayList2.add(new yb(((yb) rn0Var.EljAMC1QTz).GWasM1elztuh));
                        }
                        ArrayList arrayList3 = new ArrayList(rn0VarArr.length);
                        for (rn0 rn0Var2 : rn0VarArr) {
                            arrayList3.add(Float.valueOf(((Number) rn0Var2.OOA6hdeuvCS).floatValue()));
                        }
                        ho.WIEu4Ya2g8(hoVar, new ma0(arrayList2, arrayList3, floatToRawIntBits, floatToRawIntBits2), 0L, 0L, 0.0f, null, 126);
                        for (g51 g51Var : list) {
                            float abs = (Math.abs((float) Math.sin(((Number) Mjvvu5DE.getValue()).floatValue() + g51Var.xqGvceK5x)) * 0.65f) + 0.35f;
                            long j4 = g51Var.OOA6hdeuvCS;
                            float Yi7zF1RB12 = hoVar.Yi7zF1RB1() * g51Var.X1lG3V04pd;
                            float intBitsToFloat = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> c)) * g51Var.GWasM1elztuh;
                            char c2 = c;
                            long j5 = j3;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & j5)) * g51Var.Yi7zF1RB1;
                            ho.JB4pnjMK(hoVar, j4, Yi7zF1RB12, (Float.floatToRawIntBits(intBitsToFloat) << c2) | (Float.floatToRawIntBits(intBitsToFloat2) & j5), abs * 0.75f, null, 112);
                            c = c2;
                            j3 = j5;
                        }
                        char c3 = c;
                        long j6 = j3;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> c3)) * 0.78f;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & j6)) * 0.12f;
                        long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat3) << c3) | (Float.floatToRawIntBits(intBitsToFloat4) & j6);
                        float Yi7zF1RB13 = 0.075f * t21.Yi7zF1RB1(hoVar.xqGvceK5x());
                        long j7 = j;
                        yb ybVar = new yb(yb.Yi7zF1RB1(0.22f, j7));
                        long j8 = yb.EljAMC1QTz;
                        float f = 3.2f * Yi7zF1RB13;
                        hoVar.WdrkLMV3xh(new ss0(fb1.rezfBrjOrqK(ybVar, new yb(j8)), floatToRawIntBits3, f), f, floatToRawIntBits3);
                        ho.JB4pnjMK(hoVar, yb.Yi7zF1RB1(0.3f, j7), Yi7zF1RB13, floatToRawIntBits3, 0.0f, null, 120);
                        long j9 = ac.GWasM1elztuh;
                        ho.JB4pnjMK(hoVar, yb.Yi7zF1RB1(0.55f, j9), 0.82f * Yi7zF1RB13, uk0.GWasM1elztuh(floatToRawIntBits3, Float.intBitsToFloat((int) (floatToRawIntBits3 >> c3)) - (Yi7zF1RB13 * 0.3f), 2), 0.0f, null, 120);
                        float intBitsToFloat5 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & j6)) - (Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & j6)) * 0.34f);
                        hoVar.qugwajBSa59j(k61.rQPn8YBR(fb1.rezfBrjOrqK(new yb(yb.Yi7zF1RB1(0.2f, j7)), new yb(j9)), intBitsToFloat5, Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & j6)), 8), (Float.floatToRawIntBits((-Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> c3))) * 0.45f) << c3) | (Float.floatToRawIntBits(intBitsToFloat5) & j6), (Float.floatToRawIntBits(r1 * 2.4f) & j6) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> c3)) * 1.9f) << c3));
                        hoVar.qugwajBSa59j(k61.rQPn8YBR(fb1.rezfBrjOrqK(new yb(yb.Yi7zF1RB1(0.45f, j7)), new yb(j8)), intBitsToFloat5 - 6.0f, intBitsToFloat5 + 26.0f, 8), (Float.floatToRawIntBits((-Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> c3))) * 0.45f) << c3) | (Float.floatToRawIntBits(r2) & j6), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> c3)) * 1.9f) << c3) | (Float.floatToRawIntBits(32.0f) & j6));
                        return kc1.GWasM1elztuh;
                    }
                };
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            o30.Yi7zF1RB1(trVar, (hv) HFYAaqMd62, qxVar, 0);
            ie0Var2 = fe0.GWasM1elztuh;
        } else {
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new lv() { // from class: d6
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(i | 1);
                    ki1.JFJ3QoxA(j, ie0Var2, (qx) obj2, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final pq M3K9sHhK(Enum[] enumArr) {
        enumArr.getClass();
        return new pq(enumArr);
    }

    public static final m10 MZhzXH72(String str, qx qxVar) {
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new m10();
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        m10 m10Var = (m10) HFYAaqMd6;
        m10Var.GWasM1elztuh(0, qxVar);
        return m10Var;
    }

    public static final k10 Mjvvu5DE(m10 m10Var, float f, float f2, final j10 j10Var, String str, qx qxVar) {
        final Float valueOf = Float.valueOf(f);
        final Float valueOf2 = Float.valueOf(f2);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        k61 k61Var = ue.GWasM1elztuh;
        if (HFYAaqMd6 == k61Var) {
            HFYAaqMd6 = new k10(m10Var, valueOf, valueOf2, j10Var);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        final k10 k10Var = (k10) HFYAaqMd6;
        boolean encWxUiV22 = qxVar.encWxUiV2(j10Var);
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (encWxUiV22 || HFYAaqMd62 == k61Var) {
            HFYAaqMd62 = new wu() { // from class: n10
                @Override // defpackage.wu
                public final Object GWasM1elztuh() {
                    k10 k10Var2 = k10Var;
                    Float f3 = k10Var2.OOA6hdeuvCS;
                    Float f4 = valueOf;
                    boolean equals = f4.equals(f3);
                    Float f5 = valueOf2;
                    if (!equals || !f5.equals(k10Var2.EljAMC1QTz)) {
                        k10Var2.OOA6hdeuvCS = f4;
                        k10Var2.EljAMC1QTz = f5;
                        k10Var2.encWxUiV2 = new t71(j10Var, vc0.mOu10nynGul, f4, f5, null);
                        k10Var2.E7jCp8Ls.Yi7zF1RB1.setValue(Boolean.TRUE);
                        k10Var2.mOu10nynGul = false;
                        k10Var2.JFJ3QoxA = true;
                    }
                    return kc1.GWasM1elztuh;
                }
            };
            qxVar.dcDmLGVhzWm(HFYAaqMd62);
        }
        rQPn8YBR((wu) HFYAaqMd62, qxVar);
        boolean encWxUiV23 = qxVar.encWxUiV2(m10Var);
        Object HFYAaqMd63 = qxVar.HFYAaqMd6();
        if (encWxUiV23 || HFYAaqMd63 == k61Var) {
            HFYAaqMd63 = new X1lG3V04pd(10, m10Var, k10Var);
            qxVar.dcDmLGVhzWm(HFYAaqMd63);
        }
        EljAMC1QTz(k10Var, (hv) HFYAaqMd63, qxVar);
        return k10Var;
    }

    public static long OOA6hdeuvCS(int i, int i2, int i3) {
        return X1lG3V04pd(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long TpUsjqg3bxO(long j) {
        return n4.X1lG3V04pd(Float.isNaN(yd1.Yi7zF1RB1(j)) ? 0.0f : yd1.Yi7zF1RB1(j), Float.isNaN(yd1.X1lG3V04pd(j)) ? 0.0f : yd1.X1lG3V04pd(j));
    }

    public static final Exception VeqTn1PQw7(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i = obtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            p.xqGvceK5x(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new em(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final float WIEu4Ya2g8(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final xh WRKkgoJXwDn(ff1 ff1Var) {
        return ff1Var instanceof hz ? ((hz) ff1Var).xqGvceK5x() : vh.Yi7zF1RB1;
    }

    public static final ph WdrkLMV3xh(qx qxVar) {
        return new eu0(qxVar.YXi2hvwn7WL);
    }

    public static final long X1lG3V04pd(int i) {
        long j = i << 32;
        int i2 = yb.encWxUiV2;
        return j;
    }

    public static final void XnEVoBF0td1l(final String str, final String str2, ie0 ie0Var, final long j, qx qxVar, int i) {
        ie0 ie0Var2;
        str.getClass();
        str2.getClass();
        qxVar.Uxq83abb04(-1130660547);
        int i2 = (qxVar.EljAMC1QTz(str) ? 4 : 2) | i | (qxVar.EljAMC1QTz(str2) ? 32 : 16) | 384;
        if ((i & 3072) == 0) {
            i2 |= qxVar.OOA6hdeuvCS(j) ? 2048 : 1024;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 1171) != 1170)) {
            uv0 GWasM1elztuh2 = vv0.GWasM1elztuh(12.0f);
            long Yi7zF1RB12 = yb.Yi7zF1RB1(0.7f, ac.xqGvceK5x);
            f7 f7Var = new f7(new t41(yb.Yi7zF1RB1(0.35f, ac.GWasM1elztuh)));
            jd YZjbz8VdP5 = rj0.YZjbz8VdP5(-1794580520, new lv() { // from class: ah
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    qx qxVar2 = (qx) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (qxVar2.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                        fe0 fe0Var = fe0.GWasM1elztuh;
                        ie0 A1EKNP6CxJ = o30.A1EKNP6CxJ(fe0Var, 14.0f, 8.0f);
                        bd0 xqGvceK5x2 = n7.xqGvceK5x(b9xEq24R1.JFJ3QoxA, false);
                        int hashCode = Long.hashCode(qxVar2.qugwajBSa59j);
                        cp0 E7jCp8Ls2 = qxVar2.E7jCp8Ls();
                        ie0 MZhzXH72 = n30.MZhzXH72(qxVar2, A1EKNP6CxJ);
                        oe.X1lG3V04pd.getClass();
                        hf hfVar = ne.Yi7zF1RB1;
                        qxVar2.c4eaifQP();
                        if (qxVar2.CMh55RymNfS) {
                            qxVar2.rQPn8YBR(hfVar);
                        } else {
                            qxVar2.K0ReC6MK();
                        }
                        r2 r2Var = ne.OOA6hdeuvCS;
                        l60.WRKkgoJXwDn(r2Var, qxVar2, xqGvceK5x2);
                        r2 r2Var2 = ne.xqGvceK5x;
                        l60.WRKkgoJXwDn(r2Var2, qxVar2, E7jCp8Ls2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        r2 r2Var3 = ne.EljAMC1QTz;
                        l60.WRKkgoJXwDn(r2Var3, qxVar2, valueOf);
                        XdwzlWIkSDqF xdwzlWIkSDqF = ne.AvO7iQsrTN;
                        l60.WdrkLMV3xh(qxVar2, xdwzlWIkSDqF);
                        r2 r2Var4 = ne.X1lG3V04pd;
                        l60.WRKkgoJXwDn(r2Var4, qxVar2, MZhzXH72);
                        zv0 GWasM1elztuh3 = yv0.GWasM1elztuh(new s4(6.0f, new o4(0)), b9xEq24R1.WIEu4Ya2g8, qxVar2, 54);
                        int hashCode2 = Long.hashCode(qxVar2.qugwajBSa59j);
                        cp0 E7jCp8Ls3 = qxVar2.E7jCp8Ls();
                        ie0 MZhzXH722 = n30.MZhzXH72(qxVar2, fe0Var);
                        qxVar2.c4eaifQP();
                        if (qxVar2.CMh55RymNfS) {
                            qxVar2.rQPn8YBR(hfVar);
                        } else {
                            qxVar2.K0ReC6MK();
                        }
                        l60.WRKkgoJXwDn(r2Var, qxVar2, GWasM1elztuh3);
                        l60.WRKkgoJXwDn(r2Var2, qxVar2, E7jCp8Ls3);
                        l60.WRKkgoJXwDn(r2Var3, qxVar2, Integer.valueOf(hashCode2));
                        l60.WdrkLMV3xh(qxVar2, xdwzlWIkSDqF);
                        l60.WRKkgoJXwDn(r2Var4, qxVar2, MZhzXH722);
                        v51 v51Var = xb1.GWasM1elztuh;
                        j81.Yi7zF1RB1(str, null, ac.uFEq9NpZ, 0L, 0L, null, 0L, 0, false, 0, 0, ((vb1) qxVar2.JFJ3QoxA(v51Var)).uFEq9NpZ, qxVar2, 384, 131066);
                        j81.Yi7zF1RB1(str2, null, j, 0L, 0L, null, 0L, 0, false, 0, 0, ((vb1) qxVar2.JFJ3QoxA(v51Var)).encWxUiV2, qxVar2, 0, 131066);
                        qxVar2.WIEu4Ya2g8(true);
                        qxVar2.WIEu4Ya2g8(true);
                    } else {
                        qxVar2.YXi2hvwn7WL();
                    }
                    return kc1.GWasM1elztuh;
                }
            }, qxVar);
            fe0 fe0Var = fe0.GWasM1elztuh;
            y61.GWasM1elztuh(fe0Var, GWasM1elztuh2, Yi7zF1RB12, 0L, 0.0f, f7Var, YZjbz8VdP5, qxVar, 14156166, 56);
            ie0Var2 = fe0Var;
        } else {
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new bh(str, str2, ie0Var2, j, i);
        }
    }

    public static void Y6hRI1cF8(int i) {
        if (2 > i || i >= 37) {
            StringBuilder rQPn8YBR2 = mr0.rQPn8YBR("radix ", i, " was not in valid range ");
            rQPn8YBR2.append(new x20(2, 36, 1));
            throw new IllegalArgumentException(rQPn8YBR2.toString());
        }
    }

    public static final um YZjbz8VdP5(f40 f40Var, boolean z, i40 i40Var) {
        if (f40Var instanceof m40) {
            return ((m40) f40Var).YXi2hvwn7WL(z, i40Var);
        }
        return f40Var.lv06NcmrQ(i40Var.Mjvvu5DE(), z, new OOA6hdeuvCS(1, i40Var, i40.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long Yi7zF1RB1(float f, float f2, float f3, float f4, gc gcVar) {
        int i;
        int i2;
        int i3;
        float Yi7zF1RB12;
        float GWasM1elztuh2;
        int i4;
        int i5;
        int i6;
        int i7;
        float Yi7zF1RB13;
        float GWasM1elztuh3;
        int i8;
        int i9;
        int i10;
        if (gcVar.X1lG3V04pd()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = yb.encWxUiV2;
            return j;
        }
        if (((int) (gcVar.Yi7zF1RB1 >> 32)) != 3) {
            s10.GWasM1elztuh("Color only works with ColorSpaces with 3 components");
        }
        int i15 = gcVar.X1lG3V04pd;
        if (i15 == -1) {
            s10.GWasM1elztuh("Unknown color space, please use a color space in ColorSpaces");
        }
        float Yi7zF1RB14 = gcVar.Yi7zF1RB1(0);
        float GWasM1elztuh4 = gcVar.GWasM1elztuh(0);
        if (f >= Yi7zF1RB14) {
            Yi7zF1RB14 = f;
        }
        if (Yi7zF1RB14 <= GWasM1elztuh4) {
            GWasM1elztuh4 = Yi7zF1RB14;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(GWasM1elztuh4);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    Yi7zF1RB12 = gcVar.Yi7zF1RB1(1);
                    GWasM1elztuh2 = gcVar.GWasM1elztuh(1);
                    if (f2 >= Yi7zF1RB12) {
                        Yi7zF1RB12 = f2;
                    }
                    if (Yi7zF1RB12 <= GWasM1elztuh2) {
                        GWasM1elztuh2 = Yi7zF1RB12;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(GWasM1elztuh2);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                Yi7zF1RB13 = gcVar.Yi7zF1RB1(2);
                                GWasM1elztuh3 = gcVar.GWasM1elztuh(2);
                                if (f3 >= Yi7zF1RB13) {
                                    Yi7zF1RB13 = f3;
                                }
                                if (Yi7zF1RB13 <= GWasM1elztuh3) {
                                    GWasM1elztuh3 = Yi7zF1RB13;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(GWasM1elztuh3);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i27 = yb.encWxUiV2;
                                            return j2;
                                        }
                                        i9 = i26;
                                        r7 = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (r7 << 10);
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i272 = yb.encWxUiV2;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    Yi7zF1RB13 = gcVar.Yi7zF1RB1(2);
                    GWasM1elztuh3 = gcVar.GWasM1elztuh(2);
                    if (f3 >= Yi7zF1RB13) {
                    }
                    if (Yi7zF1RB13 <= GWasM1elztuh3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(GWasM1elztuh3);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (r7 << 10);
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2722 = yb.encWxUiV2;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s3 = (short) i3;
        Yi7zF1RB12 = gcVar.Yi7zF1RB1(1);
        GWasM1elztuh2 = gcVar.GWasM1elztuh(1);
        if (f2 >= Yi7zF1RB12) {
        }
        if (Yi7zF1RB12 <= GWasM1elztuh2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(GWasM1elztuh2);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        Yi7zF1RB13 = gcVar.Yi7zF1RB1(2);
        GWasM1elztuh3 = gcVar.GWasM1elztuh(2);
        if (f3 >= Yi7zF1RB13) {
        }
        if (Yi7zF1RB13 <= GWasM1elztuh3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(GWasM1elztuh3);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (r7 << 10);
        if (f4 >= 0.0f) {
        }
        long j2222 = (i15 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i27222 = yb.encWxUiV2;
        return j2222;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object YmKjaVtbfp5Z(k91 k91Var, mv mvVar, Throwable th, wg wgVar) {
        qs qsVar;
        int i;
        try {
            if (wgVar instanceof qs) {
                qsVar = (qs) wgVar;
                int i2 = qsVar.JFJ3QoxA;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qsVar.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                    Object obj = qsVar.mOu10nynGul;
                    i = qsVar.JFJ3QoxA;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        qsVar.encWxUiV2 = th;
                        qsVar.JFJ3QoxA = 1;
                        Object X1lG3V04pd2 = mvVar.X1lG3V04pd(k91Var, th, qsVar);
                        Object obj2 = qh.OOA6hdeuvCS;
                        if (X1lG3V04pd2 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = qsVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                    }
                    return kc1.GWasM1elztuh;
                }
            }
            if (i != 0) {
            }
            return kc1.GWasM1elztuh;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                p.xqGvceK5x(th2, th);
            }
            throw th2;
        }
        qsVar = new qs(wgVar);
        Object obj3 = qsVar.mOu10nynGul;
        i = qsVar.JFJ3QoxA;
    }

    public static boolean arNh8D4Z5gB(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = arNh8D4Z5gB(file2) && z;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long cilMamHF(long j, long j2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long GWasM1elztuh2 = yb.GWasM1elztuh(j, yb.EljAMC1QTz(j2));
        float xqGvceK5x2 = yb.xqGvceK5x(j2);
        float xqGvceK5x3 = yb.xqGvceK5x(GWasM1elztuh2);
        float f = 1.0f - xqGvceK5x3;
        float f2 = (xqGvceK5x2 * f) + xqGvceK5x3;
        float encWxUiV22 = f2 == 0.0f ? 0.0f : (((yb.encWxUiV2(j2) * xqGvceK5x2) * f) + (yb.encWxUiV2(GWasM1elztuh2) * xqGvceK5x3)) / f2;
        float AvO7iQsrTN2 = f2 == 0.0f ? 0.0f : (((yb.AvO7iQsrTN(j2) * xqGvceK5x2) * f) + (yb.AvO7iQsrTN(GWasM1elztuh2) * xqGvceK5x3)) / f2;
        float OOA6hdeuvCS2 = f2 == 0.0f ? 0.0f : (((yb.OOA6hdeuvCS(j2) * xqGvceK5x2) * f) + (yb.OOA6hdeuvCS(GWasM1elztuh2) * xqGvceK5x3)) / f2;
        if (yb.EljAMC1QTz(j2).X1lG3V04pd()) {
            return (((int) ((OOA6hdeuvCS2 * 255.0f) + 0.5f)) | (((((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((encWxUiV22 * 255.0f) + 0.5f)) << 16)) | (((int) ((AvO7iQsrTN2 * 255.0f) + 0.5f)) << 8))) << 32;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(encWxUiV22);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i15 = i12 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i15) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(AvO7iQsrTN2);
                    int i16 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i17 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i17 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i18 = i17 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i18) + 1) | (i16 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(OOA6hdeuvCS2);
                                int i19 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i20 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i13 = 31;
                                    i14 = i20 == 0 ? 0 : 512;
                                } else {
                                    int i21 = i8 - 112;
                                    if (i21 < 31) {
                                        if (i21 > 0) {
                                            i14 = i20 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i21 << 10) | i14) + 1) | (i19 << 15);
                                                return ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.X1lG3V04pd & 63);
                                            }
                                            i13 = i21;
                                        } else if (i21 >= -10) {
                                            int i22 = (i20 | 8388608) >> (1 - i21);
                                            if ((i22 & 4096) != 0) {
                                                i22 += 8192;
                                            }
                                            i13 = 0;
                                            i14 = i22 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                                i9 = (i19 << 15) | (i13 << 10) | i14;
                                return ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.X1lG3V04pd & 63);
                            }
                            i6 = i18;
                        } else if (i5 >= -10) {
                            int i23 = (i17 | 8388608) >> (1 - i5);
                            if ((i23 & 4096) != 0) {
                                i23 += 8192;
                            }
                            i6 = i23 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i16 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(OOA6hdeuvCS2);
                    int i192 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i202 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i192 << 15) | (i13 << 10) | i14;
                    return ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.X1lG3V04pd & 63);
                }
                i2 = i15;
            } else if (i >= -10) {
                int i24 = (i12 | 8388608) >> (1 - i);
                if ((i24 & 4096) != 0) {
                    i24 += 8192;
                }
                i2 = i24 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(AvO7iQsrTN2);
        int i162 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i172 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i162 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(OOA6hdeuvCS2);
        int i1922 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2022 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i1922 << 15) | (i13 << 10) | i14;
        return ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.X1lG3V04pd & 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [le, ws0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList dqB83aoLBB(y21 y21Var, int i, Integer num) {
        ?? ws0Var = new ws0(y21Var);
        int YmKjaVtbfp5Z2 = y21Var.YmKjaVtbfp5Z(i);
        lx GWasM1elztuh2 = y21Var.GWasM1elztuh(i);
        while (i >= 0) {
            ws0Var.AvO7iQsrTN(y21Var.mOu10nynGul(i), y21Var.rQPn8YBR(i) ? y21Var.WIEu4Ya2g8(y21Var.Yi7zF1RB1, i) : ue.GWasM1elztuh, y21Var.GWasM1elztuh.AvO7iQsrTN(i), num);
            if (YmKjaVtbfp5Z2 >= 0) {
                lx lxVar = GWasM1elztuh2;
                GWasM1elztuh2 = y21Var.GWasM1elztuh(YmKjaVtbfp5Z2);
                i = YmKjaVtbfp5Z2;
                YmKjaVtbfp5Z2 = y21Var.YmKjaVtbfp5Z(YmKjaVtbfp5Z2);
                num = lxVar;
            } else {
                i = YmKjaVtbfp5Z2;
                num = GWasM1elztuh2;
            }
        }
        return (ArrayList) ws0Var.GWasM1elztuh;
    }

    public static final boolean eUH21U3apd(gh ghVar) {
        f40 f40Var = (f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var != null) {
            return f40Var.Yi7zF1RB1();
        }
        return true;
    }

    public static final void encWxUiV2(lv lvVar, qx qxVar, Object obj) {
        gh ghVar = qxVar.YXi2hvwn7WL;
        boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(obj);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (EljAMC1QTz2 || HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new j50(ghVar, lvVar);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
    }

    public static final void iwATDS1i01k(long j, ie0 ie0Var, jd jdVar, qx qxVar, int i) {
        int i2;
        jd jdVar2;
        ie0 ie0Var2;
        bh1 bh1Var;
        qxVar.Uxq83abb04(-460248331);
        if ((i & 6) == 0) {
            i2 = i | (qxVar.OOA6hdeuvCS(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 147) != 146)) {
            fe0 fe0Var = fe0.GWasM1elztuh;
            tr trVar = v21.Yi7zF1RB1;
            r6 r6Var = b9xEq24R1.EljAMC1QTz;
            bd0 xqGvceK5x2 = n7.xqGvceK5x(r6Var, false);
            int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, trVar);
            oe.X1lG3V04pd.getClass();
            wu wuVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(wuVar);
            } else {
                qxVar.K0ReC6MK();
            }
            r2 r2Var = ne.OOA6hdeuvCS;
            l60.WRKkgoJXwDn(r2Var, qxVar, xqGvceK5x2);
            r2 r2Var2 = ne.xqGvceK5x;
            l60.WRKkgoJXwDn(r2Var2, qxVar, E7jCp8Ls2);
            Integer valueOf = Integer.valueOf(hashCode);
            r2 r2Var3 = ne.EljAMC1QTz;
            l60.WRKkgoJXwDn(r2Var3, qxVar, valueOf);
            XdwzlWIkSDqF xdwzlWIkSDqF = ne.AvO7iQsrTN;
            l60.WdrkLMV3xh(qxVar, xdwzlWIkSDqF);
            r2 r2Var4 = ne.X1lG3V04pd;
            l60.WRKkgoJXwDn(r2Var4, qxVar, MZhzXH72);
            s7 s7Var = s7.GWasM1elztuh;
            JFJ3QoxA(j, null, qxVar, i3 & 14);
            WeakHashMap weakHashMap = bh1.lv06NcmrQ;
            View view = (View) qxVar.JFJ3QoxA(r.EljAMC1QTz);
            WeakHashMap weakHashMap2 = bh1.lv06NcmrQ;
            synchronized (weakHashMap2) {
                try {
                    Object obj = weakHashMap2.get(view);
                    if (obj == null) {
                        bh1 bh1Var2 = new bh1(view);
                        weakHashMap2.put(view, bh1Var2);
                        obj = bh1Var2;
                    }
                    bh1Var = (bh1) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean encWxUiV22 = qxVar.encWxUiV2(bh1Var) | qxVar.encWxUiV2(view);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new zc1(1, bh1Var, view);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            EljAMC1QTz(bh1Var, (hv) HFYAaqMd6, qxVar);
            ie0 k8h8IjolWQ = p.k8h8IjolWQ(trVar, bh1Var.E7jCp8Ls);
            bd0 xqGvceK5x3 = n7.xqGvceK5x(r6Var, false);
            int hashCode2 = Long.hashCode(qxVar.qugwajBSa59j);
            cp0 E7jCp8Ls3 = qxVar.E7jCp8Ls();
            ie0 MZhzXH722 = n30.MZhzXH72(qxVar, k8h8IjolWQ);
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(wuVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(r2Var, qxVar, xqGvceK5x3);
            l60.WRKkgoJXwDn(r2Var2, qxVar, E7jCp8Ls3);
            l60.WRKkgoJXwDn(r2Var3, qxVar, Integer.valueOf(hashCode2));
            l60.WdrkLMV3xh(qxVar, xdwzlWIkSDqF);
            l60.WRKkgoJXwDn(r2Var4, qxVar, MZhzXH722);
            jdVar2 = jdVar;
            jdVar2.X1lG3V04pd(s7Var, qxVar, 54);
            qxVar.WIEu4Ya2g8(true);
            qxVar.WIEu4Ya2g8(true);
            ie0Var2 = fe0Var;
        } else {
            jdVar2 = jdVar;
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new b6(j, ie0Var2, jdVar2, i, 0);
        }
    }

    public static final Bundle jivtDDk9H(rn0... rn0VarArr) {
        Bundle bundle = new Bundle(rn0VarArr.length);
        for (rn0 rn0Var : rn0VarArr) {
            String str = (String) rn0Var.OOA6hdeuvCS;
            Object obj = rn0Var.EljAMC1QTz;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final Integer k8h8IjolWQ(y21 y21Var, ye yeVar, int i, int i2) {
        Integer k8h8IjolWQ;
        int[] iArr = y21Var.Yi7zF1RB1;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (y21Var.JFJ3QoxA(i) && y21Var.mOu10nynGul(i) == 206 && o30.rQPn8YBR(y21Var.WIEu4Ya2g8(iArr, i), we.OOA6hdeuvCS)) {
                Object encWxUiV22 = y21Var.encWxUiV2(i, 0);
                vx vxVar = encWxUiV22 instanceof vx ? (vx) encWxUiV22 : null;
                Object obj = vxVar != null ? vxVar.GWasM1elztuh : null;
                nx nxVar = obj instanceof nx ? (nx) obj : null;
                if (nxVar != null && nxVar.OOA6hdeuvCS == yeVar) {
                    return Integer.valueOf(i);
                }
            }
            if (y21Var.xqGvceK5x(i) && (k8h8IjolWQ = k8h8IjolWQ(y21Var, yeVar, i + 1, i3)) != null) {
                return Integer.valueOf(k8h8IjolWQ.intValue());
            }
            i = i3;
        }
    }

    public static m3 lv06NcmrQ(m3 m3Var, float f) {
        float f2 = ((n3) m3Var.AvO7iQsrTN).GWasM1elztuh;
        return new m3(m3Var.OOA6hdeuvCS, Float.valueOf(f), new n3(f2), m3Var.encWxUiV2, m3Var.mOu10nynGul, m3Var.JFJ3QoxA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [le, ws0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [lx] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List mE4lRynR(c31 c31Var, Integer num, int i, Integer num2) {
        int i2;
        int mE4lRynR;
        ag0 ag0Var;
        if (c31Var.lv06NcmrQ || c31Var.WIEu4Ya2g8() == 0) {
            return xp.OOA6hdeuvCS;
        }
        ?? ws0Var = new ws0(c31Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = c31Var.cilMamHF;
            if (i2 < 0) {
                i2 = c31Var.ozMwhSAI(c31Var.Yi7zF1RB1, i);
            }
        }
        if (num == 0) {
            int TpUsjqg3bxO = c31Var.mOu10nynGul - c31Var.TpUsjqg3bxO(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(i));
            rf0 rf0Var = c31Var.mE4lRynR;
            num = Integer.valueOf(TpUsjqg3bxO + ((rf0Var == null || (ag0Var = (ag0) rf0Var.Yi7zF1RB1(i)) == null) ? 0 : ag0Var.Yi7zF1RB1));
        }
        int Mjvvu5DE = c31Var.Mjvvu5DE(i) * 5;
        int[] iArr = c31Var.Yi7zF1RB1;
        if (Mjvvu5DE < iArr.length) {
            mE4lRynR = c31Var.mE4lRynR(i);
        } else {
            int ozMwhSAI = i2 >= 0 ? c31Var.ozMwhSAI(iArr, i2) : i2;
            mE4lRynR = c31Var.mE4lRynR(i2);
            int i3 = i2;
            i2 = ozMwhSAI;
            i = i3;
        }
        while (i >= 0) {
            ws0Var.AvO7iQsrTN(mE4lRynR, (c31Var.Yi7zF1RB1[(c31Var.Mjvvu5DE(i) * 5) + 1] & 536870912) != 0 ? c31Var.jivtDDk9H(i) : ue.GWasM1elztuh, c31Var.dqB83aoLBB(i), num);
            num = c31Var.Yi7zF1RB1(i);
            if (i2 >= 0) {
                int ozMwhSAI2 = c31Var.ozMwhSAI(c31Var.Yi7zF1RB1, i2);
                mE4lRynR = c31Var.mE4lRynR(i2);
                int i4 = i2;
                i2 = ozMwhSAI2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return (ArrayList) ws0Var.GWasM1elztuh;
    }

    public static final void mOu10nynGul(Object obj, Object obj2, lv lvVar, qx qxVar) {
        gh ghVar = qxVar.YXi2hvwn7WL;
        boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(obj) | qxVar.EljAMC1QTz(obj2);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (EljAMC1QTz2 || HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new j50(ghVar, lvVar);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
    }

    public static final f40 ozMwhSAI(gh ghVar) {
        f40 f40Var = (f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var != null) {
            return f40Var;
        }
        o4.EljAMC1QTz(ghVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final void pog2g9KITJA(gh ghVar) {
        f40 f40Var = (f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var != null && !f40Var.Yi7zF1RB1()) {
            throw f40Var.iwATDS1i01k();
        }
    }

    public static final void rQPn8YBR(wu wuVar, qx qxVar) {
        vm0 vm0Var = qxVar.rezfBrjOrqK.Yi7zF1RB1.Mjvvu5DE;
        vm0Var.TpUsjqg3bxO(lm0.X1lG3V04pd);
        q70.WRKkgoJXwDn(vm0Var, 0, wuVar);
    }

    public static final Bitmap.Config rezfBrjOrqK(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void uFEq9NpZ(final String str, final wu wuVar, ie0 ie0Var, final long j, boolean z, boolean z2, float f, qx qxVar, final int i, final int i2) {
        ie0 ie0Var2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        final ie0 ie0Var3;
        final boolean z5;
        final boolean z6;
        final float f2;
        at0 Mjvvu5DE;
        ie0 ie0Var4;
        float f3;
        str.getClass();
        wuVar.getClass();
        qxVar.Uxq83abb04(64475378);
        int i7 = (qxVar.EljAMC1QTz(str) ? 4 : 2) | i | (qxVar.encWxUiV2(wuVar) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | 384;
            ie0Var2 = ie0Var;
        } else {
            ie0Var2 = ie0Var;
            i3 = i7 | (qxVar.EljAMC1QTz(ie0Var2) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i3 |= qxVar.OOA6hdeuvCS(j) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z3 = z;
            i3 |= qxVar.AvO7iQsrTN(z3) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i5 = i3 | 196608;
                z4 = z2;
            } else {
                z4 = z2;
                i5 = i3 | (qxVar.AvO7iQsrTN(z4) ? 131072 : 65536);
            }
            i6 = i5 | 1572864;
            if (qxVar.dqB83aoLBB(i6 & 1, (599187 & i6) == 599186)) {
                qxVar.YXi2hvwn7WL();
                ie0Var3 = ie0Var2;
                z5 = z3;
                z6 = z4;
                f2 = f;
            } else {
                qxVar.qugwajBSa59j();
                if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                    ie0Var4 = i8 != 0 ? fe0.GWasM1elztuh : ie0Var2;
                    if (i9 != 0) {
                        z3 = true;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    f3 = 56.0f;
                } else {
                    qxVar.YXi2hvwn7WL();
                    f3 = f;
                    ie0Var4 = ie0Var2;
                }
                final boolean z7 = z3;
                qxVar.YmKjaVtbfp5Z();
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                k61 k61Var = ue.GWasM1elztuh;
                if (HFYAaqMd6 == k61Var) {
                    HFYAaqMd6 = new tf0();
                    qxVar.dcDmLGVhzWm(HFYAaqMd6);
                }
                tf0 tf0Var = (tf0) HFYAaqMd6;
                Object HFYAaqMd62 = qxVar.HFYAaqMd6();
                if (HFYAaqMd62 == k61Var) {
                    HFYAaqMd62 = z50.WRKkgoJXwDn(Boolean.FALSE);
                    qxVar.dcDmLGVhzWm(HFYAaqMd62);
                }
                mg0 mg0Var = (mg0) HFYAaqMd62;
                Object HFYAaqMd63 = qxVar.HFYAaqMd6();
                vg vgVar = null;
                if (HFYAaqMd63 == k61Var) {
                    HFYAaqMd63 = new xqGvceK5x(tf0Var, mg0Var, vgVar, 19);
                    qxVar.dcDmLGVhzWm(HFYAaqMd63);
                }
                encWxUiV2((lv) HFYAaqMd63, qxVar, tf0Var);
                m51 GWasM1elztuh2 = k2.GWasM1elztuh((((Boolean) mg0Var.getValue()).booleanValue() && z4) ? 0.96f : 1.0f, null, "buttonScale", qxVar, 22);
                ie0 GWasM1elztuh3 = v21.GWasM1elztuh(ie0Var4.X1lG3V04pd(v21.GWasM1elztuh), Float.NaN, f3);
                float floatValue = ((Number) GWasM1elztuh2.getValue()).floatValue();
                if (floatValue != 1.0f || floatValue != 1.0f) {
                    GWasM1elztuh3 = vc0.WRKkgoJXwDn(GWasM1elztuh3, floatValue, floatValue, 0.0f, null, 524284);
                }
                ie0 ie0Var5 = ie0Var4;
                boolean z8 = z4;
                y61.Yi7zF1RB1(wuVar, vc0.XnEVoBF0td1l(GWasM1elztuh3, z4 ? 1.0f : 0.4f), z8, vv0.GWasM1elztuh(16.0f), yb.EljAMC1QTz, 0L, 0.0f, tf0Var, rj0.YZjbz8VdP5(1392255037, new lv() { // from class: yg
                    @Override // defpackage.lv
                    public final Object EljAMC1QTz(Object obj, Object obj2) {
                        qx qxVar2 = (qx) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (qxVar2.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                            boolean z9 = z7;
                            long j2 = j;
                            ie0 A1EKNP6CxJ = o30.A1EKNP6CxJ(p.OOA6hdeuvCS(fe0.GWasM1elztuh, z9 ? new ma0(fb1.rezfBrjOrqK(new yb(j2), new yb(yb.Yi7zF1RB1(0.72f, j2))), null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)) : new t41(yb.Yi7zF1RB1(0.85f, ac.xqGvceK5x)), vv0.GWasM1elztuh(16.0f), 4).X1lG3V04pd(new e7(1.0f, new t41(z9 ? yb.EljAMC1QTz : yb.Yi7zF1RB1(0.55f, j2)), vv0.GWasM1elztuh(16.0f))), 20.0f, 16.0f);
                            bd0 xqGvceK5x2 = n7.xqGvceK5x(b9xEq24R1.JFJ3QoxA, false);
                            int hashCode = Long.hashCode(qxVar2.qugwajBSa59j);
                            cp0 E7jCp8Ls2 = qxVar2.E7jCp8Ls();
                            ie0 MZhzXH72 = n30.MZhzXH72(qxVar2, A1EKNP6CxJ);
                            oe.X1lG3V04pd.getClass();
                            hf hfVar = ne.Yi7zF1RB1;
                            qxVar2.c4eaifQP();
                            if (qxVar2.CMh55RymNfS) {
                                qxVar2.rQPn8YBR(hfVar);
                            } else {
                                qxVar2.K0ReC6MK();
                            }
                            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar2, xqGvceK5x2);
                            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar2, E7jCp8Ls2);
                            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar2, Integer.valueOf(hashCode));
                            l60.WdrkLMV3xh(qxVar2, ne.AvO7iQsrTN);
                            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar2, MZhzXH72);
                            j81.Yi7zF1RB1(str, null, z9 ? ac.GWasM1elztuh : ac.XnEVoBF0td1l, 0L, 0L, new x71(3), 0L, 0, false, 0, 0, ((vb1) qxVar2.JFJ3QoxA(xb1.GWasM1elztuh)).XnEVoBF0td1l, qxVar2, 0, 130042);
                            qxVar2.WIEu4Ya2g8(true);
                        } else {
                            qxVar2.YXi2hvwn7WL();
                        }
                        return kc1.GWasM1elztuh;
                    }
                }, qxVar), qxVar, ((i6 >> 3) & 14) | 805330944 | ((i6 >> 9) & 896), 480);
                z5 = z7;
                z6 = z8;
                f2 = f3;
                ie0Var3 = ie0Var5;
            }
            Mjvvu5DE = qxVar.Mjvvu5DE();
            if (Mjvvu5DE == null) {
                Mjvvu5DE.xqGvceK5x = new lv() { // from class: zg
                    @Override // defpackage.lv
                    public final Object EljAMC1QTz(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ki1.uFEq9NpZ(str, wuVar, ie0Var3, j, z5, z6, f2, (qx) obj, n4.lv06NcmrQ(i | 1), i2);
                        return kc1.GWasM1elztuh;
                    }
                };
                return;
            }
            return;
        }
        z3 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i6 = i5 | 1572864;
        if (qxVar.dqB83aoLBB(i6 & 1, (599187 & i6) == 599186)) {
        }
        Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE == null) {
        }
    }

    public static final long xqGvceK5x(long j) {
        long j2 = j << 32;
        int i = yb.encWxUiV2;
        return j2;
    }
}
