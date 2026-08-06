package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.combinations.level.experts.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class z50 {
    public static i00 GWasM1elztuh;

    public static final void AvO7iQsrTN(int i, int i2) {
        if (i < 0 || i > i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        }
    }

    public static final void E7jCp8Ls(yy yyVar, od1 od1Var) {
        ArrayList arrayList = od1Var.EljAMC1QTz;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qd1 qd1Var = (qd1) arrayList.get(i);
            if (qd1Var instanceof sd1) {
                io0 io0Var = new io0();
                sd1 sd1Var = (sd1) qd1Var;
                io0Var.X1lG3V04pd = sd1Var.OOA6hdeuvCS;
                io0Var.OOA6hdeuvCS = true;
                io0Var.X1lG3V04pd();
                io0Var.encWxUiV2.GWasM1elztuh.setFillType(Path.FillType.WINDING);
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.Yi7zF1RB1 = sd1Var.EljAMC1QTz;
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.X1lG3V04pd();
                io0Var.EljAMC1QTz = true;
                io0Var.X1lG3V04pd();
                io0Var.xqGvceK5x = 1.0f;
                io0Var.EljAMC1QTz = true;
                io0Var.X1lG3V04pd();
                io0Var.EljAMC1QTz = true;
                io0Var.X1lG3V04pd();
                yyVar.OOA6hdeuvCS(i, io0Var);
            } else if (qd1Var instanceof od1) {
                yy yyVar2 = new yy();
                od1 od1Var2 = (od1) qd1Var;
                yyVar2.rQPn8YBR = "";
                yyVar2.X1lG3V04pd();
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.E7jCp8Ls = 1.0f;
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.XnEVoBF0td1l = 1.0f;
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.uFEq9NpZ = true;
                yyVar2.X1lG3V04pd();
                yyVar2.EljAMC1QTz = od1Var2.OOA6hdeuvCS;
                yyVar2.AvO7iQsrTN = true;
                yyVar2.X1lG3V04pd();
                E7jCp8Ls(yyVar2, od1Var2);
                yyVar.OOA6hdeuvCS(i, yyVar2);
            }
        }
    }

    public static void EXrPz3p7hFb(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static final void EljAMC1QTz(int i, int i2) {
        if (i < 0 || i >= i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
        }
    }

    public static final void GWasM1elztuh(wu wuVar, ie0 ie0Var, z70 z70Var, o80 o80Var, qx qxVar, int i) {
        o80 o80Var2;
        z70 z70Var2;
        ie0 ie0Var2;
        qxVar.Uxq83abb04(1055276397);
        int i2 = (qxVar.encWxUiV2(wuVar) ? 4 : 2) | i | (qxVar.EljAMC1QTz(ie0Var) ? 32 : 16) | (qxVar.EljAMC1QTz(z70Var) ? 256 : 128) | (qxVar.EljAMC1QTz(o80Var) ? 2048 : 1024);
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 1171) != 1170)) {
            o80Var2 = o80Var;
            ww wwVar = new ww(z70Var, ie0Var, o80Var2, pog2g9KITJA(wuVar, qxVar), 1);
            z70Var2 = z70Var;
            ie0Var2 = ie0Var;
            w60.Yi7zF1RB1(rj0.YZjbz8VdP5(-933153643, wwVar, qxVar), qxVar, 6);
        } else {
            o80Var2 = o80Var;
            z70Var2 = z70Var;
            ie0Var2 = ie0Var;
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new uf(wuVar, ie0Var2, z70Var2, o80Var2, i);
        }
    }

    public static void JFJ3QoxA(ci0 ci0Var, String str, List list, jd jdVar, int i) {
        if ((i & 2) != 0) {
            list = xp.OOA6hdeuvCS;
        }
        fj0 fj0Var = ci0Var.EljAMC1QTz;
        fj0Var.getClass();
        ae aeVar = new ae((zd) fj0Var.Yi7zF1RB1(Mjvvu5DE(zd.class)), str, jdVar);
        for (dh0 dh0Var : list) {
            dh0Var.getClass();
            aeVar.X1lG3V04pd.put("level", dh0Var.GWasM1elztuh);
        }
        ci0Var.encWxUiV2.add(aeVar.GWasM1elztuh());
    }

    public static final void M3K9sHhK(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static String Mjvvu5DE(Class cls) {
        LinkedHashMap linkedHashMap = fj0.Yi7zF1RB1;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            dj0 dj0Var = (dj0) cls.getAnnotation(dj0.class);
            str = dj0Var != null ? dj0Var.value() : null;
            if (str == null || str.length() <= 0) {
                o4.OOA6hdeuvCS("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OOA6hdeuvCS(defpackage.g71 r5, defpackage.hq0 r6, defpackage.h6 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.s71
            if (r0 == 0) goto L13
            r0 = r7
            s71 r0 = (defpackage.s71) r0
            int r1 = r0.rQPn8YBR
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.rQPn8YBR = r1
            goto L18
        L13:
            s71 r0 = new s71
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.JFJ3QoxA
            int r1 = r0.rQPn8YBR
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            hq0 r5 = r0.mOu10nynGul
            g71 r6 = r0.encWxUiV2
            defpackage.o50.A1EKNP6CxJ(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o4.jivtDDk9H(r5)
            r5 = 0
            return r5
        L33:
            defpackage.o50.A1EKNP6CxJ(r7)
        L36:
            r0.encWxUiV2 = r5
            r0.mOu10nynGul = r6
            r0.rQPn8YBR = r2
            java.lang.Object r7 = r5.GWasM1elztuh(r6, r0)
            qh r1 = defpackage.qh.OOA6hdeuvCS
            if (r7 != r1) goto L45
            return r1
        L45:
            gq0 r7 = (defpackage.gq0) r7
            r1 = 0
            boolean r3 = mE4lRynR(r7, r1)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.GWasM1elztuh
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z50.OOA6hdeuvCS(g71, hq0, h6):java.lang.Object");
    }

    public static final ff1 WIEu4Ya2g8(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            ff1 ff1Var = tag instanceof ff1 ? (ff1) tag : null;
            if (ff1Var != null) {
                return ff1Var;
            }
            Object mE4lRynR = d70.mE4lRynR(view);
            view = mE4lRynR instanceof View ? (View) mE4lRynR : null;
        }
        return null;
    }

    public static fo0 WRKkgoJXwDn(Object obj) {
        return new fo0(obj, k61.EljAMC1QTz);
    }

    public static final void WdrkLMV3xh(float[] fArr, gg0 gg0Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = gg0Var.GWasM1elztuh;
        float f11 = gg0Var.Yi7zF1RB1;
        float f12 = gg0Var.X1lG3V04pd;
        float f13 = gg0Var.xqGvceK5x;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        gg0Var.GWasM1elztuh = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        gg0Var.Yi7zF1RB1 = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        gg0Var.X1lG3V04pd = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        gg0Var.xqGvceK5x = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    public static void X1lG3V04pd(c31 c31Var, List list, df dfVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int X1lG3V04pd = c31Var.X1lG3V04pd((lx) list.get(i));
            int TpUsjqg3bxO = c31Var.TpUsjqg3bxO(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(X1lG3V04pd));
            Object obj = TpUsjqg3bxO < c31Var.AvO7iQsrTN(c31Var.Yi7zF1RB1, c31Var.Mjvvu5DE(X1lG3V04pd + 1)) ? c31Var.X1lG3V04pd[c31Var.encWxUiV2(TpUsjqg3bxO)] : ue.GWasM1elztuh;
            at0 at0Var = obj instanceof at0 ? (at0) obj : null;
            if (at0Var != null) {
                at0Var.GWasM1elztuh = dfVar;
            }
        }
    }

    public static final long XnEVoBF0td1l() {
        return Thread.currentThread().getId();
    }

    public static final boolean Y6hRI1cF8(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final int Yi7zF1RB1(ub0 ub0Var, iK7aQfvhG ik7aqfvhg) {
        ub0 WkXHDbKiD = ub0Var.WkXHDbKiD();
        if (WkXHDbKiD == null) {
            t10.Yi7zF1RB1("Child of " + ub0Var + " cannot be null when calculating alignment line");
        }
        if (ub0Var.gHe2tSmr6w().GWasM1elztuh().containsKey(ik7aqfvhg)) {
            Integer num = (Integer) ub0Var.gHe2tSmr6w().GWasM1elztuh().get(ik7aqfvhg);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int mqNvfisv7 = WkXHDbKiD.mqNvfisv7(ik7aqfvhg);
            if (mqNvfisv7 != Integer.MIN_VALUE) {
                WkXHDbKiD.uFEq9NpZ = true;
                ub0Var.iwATDS1i01k = true;
                ub0Var.gqMuANyCes();
                WkXHDbKiD.uFEq9NpZ = false;
                ub0Var.iwATDS1i01k = false;
                return mqNvfisv7 + ((int) (ik7aqfvhg instanceof qz ? WkXHDbKiD.kbVzROOfKK() & 4294967295L : WkXHDbKiD.kbVzROOfKK() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void arNh8D4Z5gB(ViewStructure viewStructure, g60 g60Var, AutofillId autofillId, String str, mt0 mt0Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        w91 w91Var;
        u3 u3Var;
        p0 p0Var;
        ov0 ov0Var;
        x xVar;
        boolean z2;
        sg sgVar;
        Boolean bool;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        String[] XnEVoBF0td1l;
        String rezfBrjOrqK;
        String[] XnEVoBF0td1l2;
        String[] XnEVoBF0td1l3;
        AutofillValue forText;
        hg0 hg0Var;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        hg0 hg0Var2;
        w91 w91Var2;
        u3 u3Var2;
        p0 p0Var2;
        ov0 ov0Var2;
        k01 k01Var = h01.GWasM1elztuh;
        k01 k01Var2 = yz0.GWasM1elztuh;
        zz0 WdrkLMV3xh = g60Var.WdrkLMV3xh();
        int i4 = 8;
        if (WdrkLMV3xh == null || (hg0Var2 = WdrkLMV3xh.OOA6hdeuvCS) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            w91Var = null;
            u3Var = null;
            p0Var = null;
            ov0Var = null;
            xVar = null;
            z2 = false;
            sgVar = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr3 = hg0Var2.Yi7zF1RB1;
            j = 128;
            Object[] objArr4 = hg0Var2.X1lG3V04pd;
            long[] jArr3 = hg0Var2.GWasM1elztuh;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                xVar = null;
                j2 = 255;
                z2 = false;
                w91Var2 = null;
                u3Var2 = null;
                p0Var2 = null;
                sgVar = null;
                bool = null;
                ov0Var2 = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                k01 k01Var3 = (k01) obj;
                                if (o30.rQPn8YBR(k01Var3, h01.mE4lRynR)) {
                                    obj2.getClass();
                                    xVar = (x) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.GWasM1elztuh)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) rb.YTyqgZhdF((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (o30.rQPn8YBR(k01Var3, h01.Mjvvu5DE)) {
                                    obj2.getClass();
                                    sgVar = (sg) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.jivtDDk9H)) {
                                    obj2.getClass();
                                    p0Var2 = (p0) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.AEn1Rrio)) {
                                    obj2.getClass();
                                    u3Var2 = (u3) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.E7jCp8Ls)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (o30.rQPn8YBR(k01Var3, h01.TpUsjqg3bxO)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.MZhzXH72)) {
                                    z3 = true;
                                } else if (o30.rQPn8YBR(k01Var3, h01.iwATDS1i01k)) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (o30.rQPn8YBR(k01Var3, h01.WRKkgoJXwDn)) {
                                    obj2.getClass();
                                    ov0Var2 = (ov0) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.eUH21U3apd)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, h01.A1EKNP6CxJ)) {
                                    obj2.getClass();
                                    w91Var2 = (w91) obj2;
                                } else if (o30.rQPn8YBR(k01Var3, yz0.Yi7zF1RB1)) {
                                    viewStructure.setClickable(true);
                                } else if (o30.rQPn8YBR(k01Var3, yz0.X1lG3V04pd)) {
                                    viewStructure.setLongClickable(true);
                                } else if (o30.rQPn8YBR(k01Var3, yz0.cilMamHF)) {
                                    viewStructure.setFocusable(true);
                                } else if (o30.rQPn8YBR(k01Var3, yz0.rQPn8YBR)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                xVar = null;
                z2 = false;
                w91Var2 = null;
                u3Var2 = null;
                p0Var2 = null;
                sgVar = null;
                bool = null;
                ov0Var2 = null;
                z3 = false;
                num = null;
            }
            w91Var = w91Var2;
            u3Var = u3Var2;
            p0Var = p0Var2;
            ov0Var = ov0Var2;
        }
        zz0 WdrkLMV3xh2 = g60Var.WdrkLMV3xh();
        if (WdrkLMV3xh2 != null && WdrkLMV3xh2.AvO7iQsrTN && !WdrkLMV3xh2.encWxUiV2) {
            WdrkLMV3xh2 = WdrkLMV3xh2.Yi7zF1RB1();
            ag0 ag0Var = new ag0(((og0) g60Var.uFEq9NpZ()).OOA6hdeuvCS.AvO7iQsrTN);
            ag0Var.X1lG3V04pd(g60Var.uFEq9NpZ());
            while (ag0Var.mOu10nynGul()) {
                g60 g60Var2 = (g60) ag0Var.rQPn8YBR(ag0Var.Yi7zF1RB1 - 1);
                zz0 WdrkLMV3xh3 = g60Var2.WdrkLMV3xh();
                if (WdrkLMV3xh3 != null && !WdrkLMV3xh3.AvO7iQsrTN) {
                    WdrkLMV3xh2.OOA6hdeuvCS(WdrkLMV3xh3);
                    if (!WdrkLMV3xh3.encWxUiV2) {
                        ag0Var.X1lG3V04pd(g60Var2.uFEq9NpZ());
                    }
                }
            }
        }
        if (WdrkLMV3xh2 == null || (hg0Var = WdrkLMV3xh2.OOA6hdeuvCS) == null) {
            i2 = 1;
        } else {
            Object[] objArr5 = hg0Var.Yi7zF1RB1;
            Object[] objArr6 = hg0Var.X1lG3V04pd;
            long[] jArr4 = hg0Var.GWasM1elztuh;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                k01 k01Var4 = (k01) obj3;
                                objArr2 = objArr5;
                                if (o30.rQPn8YBR(k01Var4, h01.JFJ3QoxA)) {
                                    viewStructure.setEnabled(false);
                                } else if (o30.rQPn8YBR(k01Var4, h01.M3K9sHhK)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(g60Var.EljAMC1QTz);
                if (g60Var.cilMamHF() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = xVar == null ? Integer.valueOf(xVar.GWasM1elztuh) : z2 ? Integer.valueOf(i2) : w91Var != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (u3Var != null) {
                    String str2 = u3Var.EljAMC1QTz;
                    if (str2.length() >= 5000) {
                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? b61.mqNvfisv7(str2, 4999) : b61.mqNvfisv7(str2, 5000);
                    }
                    forText = AutofillValue.forText(str2);
                    viewStructure.setAutofillValue(forText);
                }
                if (p0Var != null) {
                    viewStructure.setAutofillValue(p0Var.GWasM1elztuh);
                }
                if (sgVar != null && (XnEVoBF0td1l3 = p.XnEVoBF0td1l(sgVar)) != null) {
                    viewStructure.setAutofillHints(XnEVoBF0td1l3);
                }
                mt0Var.Yi7zF1RB1.AvO7iQsrTN(g60Var.EljAMC1QTz, new sq0(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (w91Var == null) {
                    viewStructure.setCheckable(i2);
                    viewStructure.setChecked(w91Var == w91.OOA6hdeuvCS);
                } else if (bool != null && (ov0Var == null || ov0Var.GWasM1elztuh != 4)) {
                    z4 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                    sg.GWasM1elztuh.getClass();
                    XnEVoBF0td1l = p.XnEVoBF0td1l(rg.Yi7zF1RB1);
                    XnEVoBF0td1l.getClass();
                    if (XnEVoBF0td1l.length == 0) {
                        o4.AvO7iQsrTN("Array is empty.");
                        return;
                    }
                    boolean z5 = (z3 || ((sgVar == null || (XnEVoBF0td1l2 = p.XnEVoBF0td1l(sgVar)) == null || d5.dcDmLGVhzWm(XnEVoBF0td1l2, XnEVoBF0td1l[0]) < 0) ? false : z4)) ? z4 : false;
                    viewStructure.setDataIsSensitive((z5 || z) ? z4 : false);
                    viewStructure.setVisibility(g60Var.A1EKNP6CxJ.xqGvceK5x.o6lobyFa() ? 4 : 0);
                    if (list != null) {
                        int size = list.size();
                        String str3 = "";
                        for (int i15 = 0; i15 < size; i15++) {
                            str3 = str3 + ((u3) list.get(i15)).EljAMC1QTz + '\n';
                        }
                        viewStructure.setText(str3);
                        viewStructure.setClassName("android.widget.TextView");
                    }
                    if (((og0) g60Var.uFEq9NpZ()).isEmpty() && ov0Var != null && (rezfBrjOrqK = b70.rezfBrjOrqK(ov0Var.GWasM1elztuh)) != null) {
                        viewStructure.setClassName(rezfBrjOrqK);
                    }
                    if (z2) {
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (z5) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z4 = true;
                sg.GWasM1elztuh.getClass();
                XnEVoBF0td1l = p.XnEVoBF0td1l(rg.Yi7zF1RB1);
                XnEVoBF0td1l.getClass();
                if (XnEVoBF0td1l.length == 0) {
                }
            }
        }
        list = null;
        Integer valueOf22 = Integer.valueOf(g60Var.EljAMC1QTz);
        if (g60Var.cilMamHF() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (xVar == null) {
        }
        if (valueOf != null) {
        }
        if (u3Var != null) {
        }
        if (p0Var != null) {
        }
        if (sgVar != null) {
            viewStructure.setAutofillHints(XnEVoBF0td1l3);
        }
        mt0Var.Yi7zF1RB1.AvO7iQsrTN(g60Var.EljAMC1QTz, new sq0(viewStructure));
        if (bool != null) {
        }
        if (w91Var == null) {
        }
        z4 = true;
        sg.GWasM1elztuh.getClass();
        XnEVoBF0td1l = p.XnEVoBF0td1l(rg.Yi7zF1RB1);
        XnEVoBF0td1l.getClass();
        if (XnEVoBF0td1l.length == 0) {
        }
    }

    public static final void cilMamHF(String str) {
        str.getClass();
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    public static final void encWxUiV2(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            o4.mE4lRynR(mr0.mOu10nynGul("fromIndex: ", i, " > toIndex: ", i2));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final ml iwATDS1i01k(wu wuVar) {
        f4 f4Var = l41.GWasM1elztuh;
        return new ml(wuVar, null);
    }

    public static final boolean jivtDDk9H(float f, float f2, h1 h1Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        h1 GWasM1elztuh2 = j1.GWasM1elztuh();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            j1.Yi7zF1RB1("Invalid rectangle, make sure no value is NaN");
        }
        if (GWasM1elztuh2.Yi7zF1RB1 == null) {
            GWasM1elztuh2.Yi7zF1RB1 = new RectF();
        }
        RectF rectF = GWasM1elztuh2.Yi7zF1RB1;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = GWasM1elztuh2.GWasM1elztuh;
        RectF rectF2 = GWasM1elztuh2.Yi7zF1RB1;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        h1 GWasM1elztuh3 = j1.GWasM1elztuh();
        GWasM1elztuh3.xqGvceK5x(h1Var, GWasM1elztuh2, 1);
        boolean isEmpty = GWasM1elztuh3.GWasM1elztuh.isEmpty();
        GWasM1elztuh3.OOA6hdeuvCS();
        GWasM1elztuh2.OOA6hdeuvCS();
        return !isEmpty;
    }

    public static final Object k8h8IjolWQ(qx0 qx0Var, qx0 qx0Var2, lv lvVar) {
        Object ucVar;
        Object J3Xc8BaqpN8;
        try {
            fb1.XnEVoBF0td1l(2, lvVar);
            ucVar = lvVar.EljAMC1QTz(qx0Var2, qx0Var);
        } catch (Throwable th) {
            ucVar = new uc(th, false);
        }
        qh qhVar = qh.OOA6hdeuvCS;
        if (ucVar == qhVar || (J3Xc8BaqpN8 = qx0Var.J3Xc8BaqpN8(ucVar)) == p.EljAMC1QTz) {
            return qhVar;
        }
        if (J3Xc8BaqpN8 instanceof uc) {
            throw ((uc) J3Xc8BaqpN8).GWasM1elztuh;
        }
        return p.pog2g9KITJA(J3Xc8BaqpN8);
    }

    public static final long lv06NcmrQ(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return (Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static boolean mE4lRynR(gq0 gq0Var, boolean z) {
        List list = gq0Var.GWasM1elztuh;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            kq0 kq0Var = (kq0) list.get(i);
            if (!z) {
                z2 = d70.JFJ3QoxA(kq0Var);
            } else if (kq0Var.Yi7zF1RB1() || kq0Var.encWxUiV2 || !kq0Var.xqGvceK5x) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }

    public static final mg0 mOu10nynGul(n51 n51Var, qx qxVar) {
        Object value = n51Var.getValue();
        Object obj = vp.OOA6hdeuvCS;
        boolean encWxUiV2 = qxVar.encWxUiV2(obj) | qxVar.encWxUiV2(n51Var);
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        vg vgVar = null;
        Object obj2 = ue.GWasM1elztuh;
        if (encWxUiV2 || HFYAaqMd6 == obj2) {
            HFYAaqMd6 = new EljAMC1QTz(obj, n51Var, vgVar, 16);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        lv lvVar = (lv) HFYAaqMd6;
        Object HFYAaqMd62 = qxVar.HFYAaqMd6();
        if (HFYAaqMd62 == obj2) {
            HFYAaqMd62 = WRKkgoJXwDn(value);
            qxVar.dcDmLGVhzWm(HFYAaqMd62);
        }
        mg0 mg0Var = (mg0) HFYAaqMd62;
        boolean encWxUiV22 = qxVar.encWxUiV2(lvVar);
        Object HFYAaqMd63 = qxVar.HFYAaqMd6();
        if (encWxUiV22 || HFYAaqMd63 == obj2) {
            HFYAaqMd63 = new m41(lvVar, mg0Var, vgVar, 1);
            qxVar.dcDmLGVhzWm(HFYAaqMd63);
        }
        ki1.mOu10nynGul(n51Var, obj, (lv) HFYAaqMd63, qxVar);
        return mg0Var;
    }

    public static final c51 ozMwhSAI(xe0 xe0Var, qx qxVar) {
        we0 we0Var = (we0) qxVar.JFJ3QoxA(uc0.GWasM1elztuh);
        int ordinal = xe0Var.ordinal();
        if (ordinal == 0) {
            we0Var.getClass();
            c51 c51Var = we0.Yi7zF1RB1;
            c51Var.getClass();
            return c51Var;
        }
        if (ordinal == 1) {
            we0Var.getClass();
            c51 c51Var2 = we0.X1lG3V04pd;
            c51Var2.getClass();
            return c51Var2;
        }
        if (ordinal == 2) {
            we0Var.getClass();
            c51 c51Var3 = we0.xqGvceK5x;
            c51Var3.getClass();
            return c51Var3;
        }
        if (ordinal == 3) {
            we0Var.getClass();
            c51 c51Var4 = we0.OOA6hdeuvCS;
            c51Var4.getClass();
            return c51Var4;
        }
        if (ordinal == 4) {
            we0Var.getClass();
            c51 c51Var5 = we0.EljAMC1QTz;
            c51Var5.getClass();
            return c51Var5;
        }
        if (ordinal != 5) {
            o4.xqGvceK5x();
            return null;
        }
        we0Var.getClass();
        c51 c51Var6 = we0.AvO7iQsrTN;
        c51Var6.getClass();
        return c51Var6;
    }

    public static final mg0 pog2g9KITJA(Object obj, qx qxVar) {
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = WRKkgoJXwDn(obj);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        mg0 mg0Var = (mg0) HFYAaqMd6;
        mg0Var.setValue(obj);
        return mg0Var;
    }

    public static float[] rQPn8YBR() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final rg0 uFEq9NpZ() {
        f4 f4Var = l41.Yi7zF1RB1;
        rg0 rg0Var = (rg0) f4Var.OOA6hdeuvCS();
        if (rg0Var != null) {
            return rg0Var;
        }
        rg0 rg0Var2 = new rg0(new px[0]);
        f4Var.WIEu4Ya2g8(rg0Var2);
        return rg0Var2;
    }

    public static float xqGvceK5x(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public abstract kt0 YmKjaVtbfp5Z();
}
