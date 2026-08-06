package defpackage;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class fb1 {
    public static final float AEn1Rrio;
    public static final ec E7jCp8Ls;
    public static final float EXrPz3p7hFb;
    public static final float M3K9sHhK;
    public static final ec Mjvvu5DE;
    public static final ec WIEu4Ya2g8;
    public static final ec WRKkgoJXwDn;
    public static final float WdrkLMV3xh;
    public static final float XnEVoBF0td1l;
    public static final ec Y6hRI1cF8;
    public static final ec YZjbz8VdP5;
    public static final float YmKjaVtbfp5Z;
    public static final float arNh8D4Z5gB;
    public static final b21 cilMamHF;
    public static final x51 eUH21U3apd;
    public static final float iwATDS1i01k;
    public static final ec jivtDDk9H;
    public static final b21 k8h8IjolWQ;
    public static final float lv06NcmrQ;
    public static final float mE4lRynR;
    public static final ec ozMwhSAI;
    public static final float pog2g9KITJA;
    public static final ec uFEq9NpZ;
    public static final Object[] GWasM1elztuh = new Object[0];
    public static final int[] Yi7zF1RB1 = new int[0];
    public static final long[] X1lG3V04pd = new long[0];
    public static final Object[] xqGvceK5x = new Object[0];
    public static final StackTraceElement[] OOA6hdeuvCS = new StackTraceElement[0];
    public static final vt EljAMC1QTz = new vt(25);
    public static final vt AvO7iQsrTN = new vt(26);
    public static final vt encWxUiV2 = new vt(27);
    public static final long[] mOu10nynGul = new long[0];
    public static final ec JFJ3QoxA = ec.iwATDS1i01k;
    public static final float rQPn8YBR = 1.0f;

    static {
        ec ecVar = ec.JFJ3QoxA;
        E7jCp8Ls = ecVar;
        XnEVoBF0td1l = 0.38f;
        uFEq9NpZ = ecVar;
        iwATDS1i01k = 0.12f;
        WIEu4Ya2g8 = ecVar;
        YmKjaVtbfp5Z = 0.38f;
        ec ecVar2 = ec.YmKjaVtbfp5Z;
        Mjvvu5DE = ecVar2;
        mE4lRynR = 0.38f;
        jivtDDk9H = ecVar2;
        Y6hRI1cF8 = ecVar;
        b21 b21Var = b21.AvO7iQsrTN;
        cilMamHF = b21Var;
        lv06NcmrQ = 28.0f;
        WdrkLMV3xh = 24.0f;
        WRKkgoJXwDn = ec.mOu10nynGul;
        arNh8D4Z5gB = 40.0f;
        pog2g9KITJA = 32.0f;
        M3K9sHhK = 2.0f;
        k8h8IjolWQ = b21Var;
        EXrPz3p7hFb = 52.0f;
        ozMwhSAI = ec.E7jCp8Ls;
        AEn1Rrio = 16.0f;
        YZjbz8VdP5 = ecVar2;
        eUH21U3apd = new x51(11);
    }

    public static final boolean A1EKNP6CxJ(int i, int i2, long j) {
        int JFJ3QoxA2 = eg.JFJ3QoxA(j);
        if (i > eg.encWxUiV2(j) || JFJ3QoxA2 > i) {
            return false;
        }
        return i2 <= eg.AvO7iQsrTN(j) && eg.mOu10nynGul(j) <= i2;
    }

    public static final boolean AEn1Rrio(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final void AvO7iQsrTN(List list, Collection collection, qx qxVar, int i) {
        qxVar.Uxq83abb04(1537894851);
        int i2 = 4;
        if ((((qxVar.encWxUiV2(list) ? 4 : 2) | i | (qxVar.encWxUiV2(collection) ? 32 : 16)) & 19) == 18 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
        } else {
            boolean booleanValue = ((Boolean) qxVar.JFJ3QoxA(m20.GWasM1elztuh)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                fh0 fh0Var = (fh0) it.next();
                w90 w90Var = fh0Var.E7jCp8Ls.JFJ3QoxA;
                boolean AvO7iQsrTN2 = qxVar.AvO7iQsrTN(booleanValue) | qxVar.encWxUiV2(list) | qxVar.encWxUiV2(fh0Var);
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                if (AvO7iQsrTN2 || HFYAaqMd6 == ue.GWasM1elztuh) {
                    HFYAaqMd6 = new sl(fh0Var, list, booleanValue);
                    qxVar.dcDmLGVhzWm(HFYAaqMd6);
                }
                ki1.EljAMC1QTz(w90Var, (hv) HFYAaqMd6, qxVar);
            }
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new t7(i, i2, list, collection);
        }
    }

    public static long CMh55RymNfS(InputStream inputStream, int i) {
        byte[] z19UFEN2I = z19UFEN2I(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (z19UFEN2I[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final ie0 DmJncFq5(ie0 ie0Var, l80 l80Var, b80 b80Var, xm0 xm0Var, boolean z) {
        return ie0Var.X1lG3V04pd(new c80(l80Var, b80Var, xm0Var, z));
    }

    public static ie0 E7jCp8Ls(ie0 ie0Var) {
        return ie0Var.X1lG3V04pd(new e5());
    }

    public static void EDwNPVYuViP0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        NyNgffpi(byteArrayOutputStream, i, 2);
    }

    public static final Object ES6ysExf(gh ghVar, lv lvVar, vg vgVar) {
        gh OOA6hdeuvCS2 = vgVar.OOA6hdeuvCS();
        gh mOu10nynGul2 = !((Boolean) ghVar.WIEu4Ya2g8(new pd(17), Boolean.FALSE)).booleanValue() ? OOA6hdeuvCS2.mOu10nynGul(ghVar) : o30.lv06NcmrQ(OOA6hdeuvCS2, ghVar, false);
        ki1.pog2g9KITJA(mOu10nynGul2);
        if (mOu10nynGul2 == OOA6hdeuvCS2) {
            qx0 qx0Var = new qx0(vgVar, mOu10nynGul2);
            return z50.k8h8IjolWQ(qx0Var, qx0Var, lvVar);
        }
        b9xEq24R1 b9xeq24r1 = b9xEq24R1.arNh8D4Z5gB;
        if (o30.rQPn8YBR(mOu10nynGul2.E7jCp8Ls(b9xeq24r1), OOA6hdeuvCS2.E7jCp8Ls(b9xeq24r1))) {
            hc1 hc1Var = new hc1(vgVar, mOu10nynGul2);
            gh ghVar2 = hc1Var.mOu10nynGul;
            Object M3K9sHhK2 = p.M3K9sHhK(ghVar2, null);
            try {
                return z50.k8h8IjolWQ(hc1Var, hc1Var, lvVar);
            } finally {
                p.jivtDDk9H(ghVar2, M3K9sHhK2);
            }
        }
        jm jmVar = new jm(vgVar, mOu10nynGul2);
        try {
            o30.TpUsjqg3bxO(rj0.M3K9sHhK(rj0.mE4lRynR(jmVar, jmVar, lvVar)), kc1.GWasM1elztuh);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = jm.rQPn8YBR;
            do {
                int i = atomicIntegerFieldUpdater.get(jmVar);
                if (i != 0) {
                    if (i != 2) {
                        o4.jivtDDk9H("Already suspended");
                        return null;
                    }
                    Object pog2g9KITJA2 = p.pog2g9KITJA(jmVar.TpUsjqg3bxO());
                    if (pog2g9KITJA2 instanceof uc) {
                        throw ((uc) pog2g9KITJA2).GWasM1elztuh;
                    }
                    return pog2g9KITJA2;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(jmVar, 0, 1));
            return qh.OOA6hdeuvCS;
        } catch (Throwable th) {
            jmVar.AvO7iQsrTN(new su0(th));
            throw th;
        }
    }

    public static int EXrPz3p7hFb(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final void EljAMC1QTz(ie0 ie0Var, wu wuVar, boolean z, z11 z11Var, b00 b00Var, jd jdVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(-1134296466);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(wuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.AvO7iQsrTN(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.EljAMC1QTz(z11Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qxVar.EljAMC1QTz(b00Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= qxVar.EljAMC1QTz(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= qxVar.encWxUiV2(jdVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (qxVar.dqB83aoLBB(i3 & 1, (599187 & i3) != 599186)) {
            qxVar.MjxSquD6Av(977045485);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new tf0();
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            tf0 tf0Var = (tf0) HFYAaqMd6;
            qxVar.WIEu4Ya2g8(false);
            qz qzVar = g30.GWasM1elztuh;
            ie0 X1lG3V04pd2 = ie0Var.X1lG3V04pd(ce0.GWasM1elztuh);
            float f = ki1.XnEVoBF0td1l;
            long xqGvceK5x2 = o30.xqGvceK5x(ki1.uFEq9NpZ + f + f, 40.0f);
            tr trVar = v21.GWasM1elztuh;
            ie0 X1lG3V04pd3 = rj0.YmKjaVtbfp5Z(p.EljAMC1QTz(n30.WIEu4Ya2g8(v21.X1lG3V04pd(X1lG3V04pd2, Float.intBitsToFloat((int) (xqGvceK5x2 >> 32)), Float.intBitsToFloat((int) (xqGvceK5x2 & 4294967295L))), z11Var), z ? b00Var.GWasM1elztuh : b00Var.X1lG3V04pd, z11Var), tf0Var, lv0.GWasM1elztuh(0.0f, 7), z, new ov0(0), wuVar, 8).X1lG3V04pd(new ta(new bCsSzSHkbaQ(13)));
            bd0 xqGvceK5x3 = n7.xqGvceK5x(b9xEq24R1.JFJ3QoxA, false);
            int M3K9sHhK2 = M3K9sHhK(qxVar);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, X1lG3V04pd3);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, xqGvceK5x3);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
            r2 r2Var = ne.EljAMC1QTz;
            if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK2))) {
                mr0.XnEVoBF0td1l(M3K9sHhK2, qxVar, M3K9sHhK2, r2Var);
            }
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            vc0.X1lG3V04pd(kg.GWasM1elztuh.GWasM1elztuh(new yb(z ? b00Var.Yi7zF1RB1 : b00Var.xqGvceK5x)), jdVar, qxVar, ((i3 >> 15) & 112) | 8);
            qxVar.WIEu4Ya2g8(true);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new c00(ie0Var, wuVar, z, z11Var, b00Var, jdVar, i);
        }
    }

    public static final Object[] Fm8W7vP7q(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = GWasM1elztuh;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GWasM1elztuh(final String str, final ie0 ie0Var, final y81 y81Var, final int i, final boolean z, final int i2, final int i3, qx qxVar, final int i4) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        qxVar.Uxq83abb04(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (qxVar.EljAMC1QTz(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= qxVar.EljAMC1QTz(ie0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= qxVar.EljAMC1QTz(y81Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= qxVar.encWxUiV2(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 = i;
            i5 |= qxVar.xqGvceK5x(i6) ? 16384 : 8192;
        } else {
            i6 = i;
        }
        if ((196608 & i4) == 0) {
            z2 = z;
            i5 |= qxVar.AvO7iQsrTN(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i4) == 0) {
            i5 |= qxVar.xqGvceK5x(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= qxVar.xqGvceK5x(i3) ? 8388608 : 4194304;
        }
        int i7 = i5 | 100663296;
        if ((805306368 & i4) == 0) {
            i7 |= (1073741824 & i4) == 0 ? qxVar.EljAMC1QTz(null) : qxVar.encWxUiV2(null) ? 536870912 : 268435456;
        }
        if (qxVar.dqB83aoLBB(i7 & 1, (306783379 & i7) != 306783378)) {
            if (i3 <= 0 || i2 <= 0) {
                w10.GWasM1elztuh("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero");
            }
            if (i3 > i2) {
                w10.GWasM1elztuh("minLines " + i3 + " must be less than or equal to maxLines " + i2);
            }
            if (qxVar.JFJ3QoxA(xz0.GWasM1elztuh) != null) {
                o4.YmKjaVtbfp5Z();
                return;
            }
            qxVar.MjxSquD6Av(356914239);
            qxVar.WIEu4Ya2g8(false);
            yt ytVar = (yt) qxVar.JFJ3QoxA(kf.rQPn8YBR);
            Executor executor = (Executor) qxVar.JFJ3QoxA(m6.GWasM1elztuh);
            if (executor != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    if (m6.Yi7zF1RB1 == null) {
                        m6.Yi7zF1RB1 = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = m6.Yi7zF1RB1;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        qxVar.MjxSquD6Av(1254298614);
                        try {
                            z3 = false;
                            z4 = true;
                            try {
                                executor.execute(new l6(y81Var, (p50) qxVar.JFJ3QoxA(kf.uFEq9NpZ), str, (el) qxVar.JFJ3QoxA(kf.encWxUiV2), ytVar, 0));
                            } catch (RejectedExecutionException unused) {
                            }
                        } catch (RejectedExecutionException unused2) {
                            z4 = true;
                            z3 = false;
                        }
                        qxVar.WIEu4Ya2g8(z3);
                        qxVar.MjxSquD6Av(357875859);
                        qxVar.WIEu4Ya2g8(z3);
                        boolean z5 = z4;
                        ie0 X1lG3V04pd2 = ie0Var.X1lG3V04pd(new u81(str, y81Var, ytVar, i6, z2, i2, i3));
                        e0 e0Var = e0.xqGvceK5x;
                        int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
                        ie0 MZhzXH72 = n30.MZhzXH72(qxVar, X1lG3V04pd2);
                        cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
                        oe.X1lG3V04pd.getClass();
                        hf hfVar = ne.Yi7zF1RB1;
                        qxVar.c4eaifQP();
                        if (qxVar.CMh55RymNfS) {
                            qxVar.K0ReC6MK();
                        } else {
                            qxVar.rQPn8YBR(hfVar);
                        }
                        l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, e0Var);
                        l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
                        l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
                        l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
                        l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
                        qxVar.WIEu4Ya2g8(z5);
                    }
                }
                z4 = true;
                z3 = false;
            } else {
                z3 = false;
                z4 = true;
            }
            qxVar.MjxSquD6Av(1255914055);
            qxVar.WIEu4Ya2g8(z3);
            qxVar.MjxSquD6Av(357875859);
            qxVar.WIEu4Ya2g8(z3);
            boolean z52 = z4;
            ie0 X1lG3V04pd22 = ie0Var.X1lG3V04pd(new u81(str, y81Var, ytVar, i6, z2, i2, i3));
            e0 e0Var2 = e0.xqGvceK5x;
            int hashCode2 = Long.hashCode(qxVar.qugwajBSa59j);
            ie0 MZhzXH722 = n30.MZhzXH72(qxVar, X1lG3V04pd22);
            cp0 E7jCp8Ls22 = qxVar.E7jCp8Ls();
            oe.X1lG3V04pd.getClass();
            hf hfVar2 = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, e0Var2);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls22);
            l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH722);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode2));
            qxVar.WIEu4Ya2g8(z52);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new lv() { // from class: k6
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fb1.GWasM1elztuh(str, ie0Var, y81Var, i, z, i2, i3, (qx) obj, n4.lv06NcmrQ(i4 | 1));
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static List HFYAaqMd6(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static c51 J3Xc8BaqpN8(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new c51(f, f2, obj);
    }

    public static ArrayList JFJ3QoxA(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new u4(objArr));
    }

    public static db1 JFXS9W1rB5s4(int i, int i2, oo ooVar) {
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            ooVar = po.GWasM1elztuh;
        }
        return new db1(i, i3, ooVar);
    }

    public static final int M3K9sHhK(qx qxVar) {
        qxVar.getClass();
        return Long.hashCode(qxVar.qugwajBSa59j);
    }

    public static void MItybXapHX(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        o30.dqB83aoLBB(classCastException, fb1.class.getName());
        throw classCastException;
    }

    public static f51 MZhzXH72(ph phVar, gh ghVar, lv lvVar, int i) {
        if ((i & 1) != 0) {
            ghVar = vp.OOA6hdeuvCS;
        }
        sh shVar = (i & 2) != 0 ? sh.OOA6hdeuvCS : sh.encWxUiV2;
        gh lv06NcmrQ2 = o30.lv06NcmrQ(phVar.EljAMC1QTz(), ghVar, true);
        pk pkVar = mm.GWasM1elztuh;
        if (lv06NcmrQ2 != pkVar && lv06NcmrQ2.E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB) == null) {
            lv06NcmrQ2 = lv06NcmrQ2.mOu10nynGul(pkVar);
        }
        f51 y80Var = shVar == sh.EljAMC1QTz ? new y80(lv06NcmrQ2, lvVar) : new f51(lv06NcmrQ2, true);
        y80Var.rASgSCrgZkT7(shVar, y80Var, lvVar);
        return y80Var;
    }

    public static byte[] Mjvvu5DE(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static void MjxSquD6Av() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void NyNgffpi(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void OOA6hdeuvCS(wu wuVar, ie0 ie0Var, boolean z, b00 b00Var, z11 z11Var, jd jdVar, qx qxVar, int i, int i2) {
        boolean z2;
        int i3;
        ie0 ie0Var2;
        b00 b00Var2;
        z11 z11Var2;
        boolean z3;
        int i4;
        b00 b00Var3;
        z11 GWasM1elztuh2;
        ie0 ie0Var3;
        int i5;
        boolean z4;
        b00 b00Var4;
        qx qxVar2 = qxVar;
        qxVar2.Uxq83abb04(1413012038);
        int i6 = i | (qxVar2.encWxUiV2(wuVar) ? 4 : 2);
        int i7 = i6 | 48;
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i6 | 432;
            z2 = z;
        } else {
            z2 = z;
            i3 = i7 | (qxVar2.AvO7iQsrTN(z2) ? 256 : 128);
        }
        int i9 = i3 | 91136;
        if (qxVar2.dqB83aoLBB(i9 & 1, (599187 & i9) != 599186)) {
            qxVar2.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar2.WRKkgoJXwDn()) {
                boolean z5 = i8 == 0 ? z2 : true;
                long j = ((yb) qxVar2.JFJ3QoxA(kg.GWasM1elztuh)).GWasM1elztuh;
                dc dcVar = (dc) qxVar2.JFJ3QoxA(fc.GWasM1elztuh);
                b00 b00Var5 = dcVar.Uxq83abb04;
                if (b00Var5 == null) {
                    long j2 = yb.EljAMC1QTz;
                    b00 b00Var6 = new b00(j2, j, j2, yb.Yi7zF1RB1(0.38f, j));
                    dcVar.Uxq83abb04 = b00Var6;
                    b00Var5 = b00Var6;
                }
                long j3 = b00Var5.Yi7zF1RB1;
                if (yb.X1lG3V04pd(j3, j)) {
                    b00Var3 = b00Var5;
                    i4 = -465921;
                } else {
                    long Yi7zF1RB12 = yb.Yi7zF1RB1(0.38f, j);
                    long j4 = b00Var5.GWasM1elztuh;
                    i4 = -465921;
                    long j5 = b00Var5.X1lG3V04pd;
                    if (j == 16) {
                        j = j3;
                    }
                    if (Yi7zF1RB12 == 16) {
                        Yi7zF1RB12 = b00Var5.xqGvceK5x;
                    }
                    b00Var3 = new b00(j4, j, j5, Yi7zF1RB12);
                }
                qxVar2 = qxVar;
                GWasM1elztuh2 = e21.GWasM1elztuh(ki1.E7jCp8Ls, qxVar2);
                ie0Var3 = fe0.GWasM1elztuh;
                i5 = i9 & i4;
                z4 = z5;
                b00Var4 = b00Var3;
            } else {
                qxVar2.YXi2hvwn7WL();
                b00Var4 = b00Var;
                GWasM1elztuh2 = z11Var;
                i5 = i9 & (-465921);
                z4 = z2;
                ie0Var3 = ie0Var;
            }
            qxVar2.YmKjaVtbfp5Z();
            EljAMC1QTz(ie0Var3, wuVar, z4, GWasM1elztuh2, b00Var4, jdVar, qxVar2, 1769472 | (i5 & 896) | ((i5 << 3) & 112) | 6);
            z11Var2 = GWasM1elztuh2;
            b00Var2 = b00Var4;
            ie0Var2 = ie0Var3;
            z3 = z4;
        } else {
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
            b00Var2 = b00Var;
            z11Var2 = z11Var;
            z3 = z2;
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new c00(wuVar, ie0Var2, z3, b00Var2, z11Var2, jdVar, i, i2);
        }
    }

    public static ArrayList TpUsjqg3bxO(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new u4(objArr));
    }

    public static final BlendMode Uxq83abb04(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final long VeqTn1PQw7(y00 y00Var, xm0 xm0Var, x00 x00Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (xm0Var == null) {
            return y00Var.X1lG3V04pd;
        }
        int i = x00Var.GWasM1elztuh;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (y00Var.X1lG3V04pd >> 32));
        } else {
            if (i != 2) {
                return y00Var.X1lG3V04pd;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (y00Var.X1lG3V04pd & 4294967295L));
        }
        if (xm0Var == xm0.EljAMC1QTz) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static ta0 WIEu4Ya2g8(ta0 ta0Var) {
        ta0Var.AvO7iQsrTN();
        ta0Var.AvO7iQsrTN = true;
        return ta0Var.EljAMC1QTz > 0 ? ta0Var : ta0.encWxUiV2;
    }

    public static long WRKkgoJXwDn(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    fg.JFJ3QoxA(i6);
                    throw new vc();
                }
                i5 = 8190;
            }
        }
        return fg.GWasM1elztuh(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static long WdrkLMV3xh(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    fg.JFJ3QoxA(i6);
                    throw new vc();
                }
                i5 = 8190;
            }
        }
        return fg.GWasM1elztuh(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
    }

    public static final ug X1lG3V04pd(gh ghVar) {
        if (ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7) == null) {
            ghVar = ghVar.mOu10nynGul(new h40(null));
        }
        return new ug(ghVar);
    }

    public static void XnEVoBF0td1l(int i, Object obj) {
        if (obj == null || eUH21U3apd(i, obj)) {
            return;
        }
        MItybXapHX(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final ie0 Y6hRI1cF8(ie0 ie0Var, hv hvVar) {
        return ie0Var.X1lG3V04pd(new bo(hvVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] YXi2hvwn7WL(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final boolean YZjbz8VdP5(ph phVar) {
        f40 f40Var = (f40) phVar.EljAMC1QTz().E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var != null) {
            return f40Var.Yi7zF1RB1();
        }
        return true;
    }

    public static n8 Yi7zF1RB1(int i, l8 l8Var, int i2) {
        int i3 = i2 & 2;
        l8 l8Var2 = l8.OOA6hdeuvCS;
        if (i3 != 0) {
            l8Var = l8Var2;
        }
        if (i == -2) {
            if (l8Var != l8Var2) {
                return new yf(1, l8Var);
            }
            z9.Yi7zF1RB1.getClass();
            return new n8(y9.Yi7zF1RB1);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? l8Var == l8Var2 ? new n8(i) : new yf(i, l8Var) : new n8(Integer.MAX_VALUE) : l8Var == l8Var2 ? new n8(0) : new yf(1, l8Var);
        }
        if (l8Var == l8Var2) {
            return new yf(1, l8.EljAMC1QTz);
        }
        o4.mE4lRynR("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final boolean YmKjaVtbfp5Z(y00 y00Var) {
        return !y00Var.encWxUiV2 && y00Var.xqGvceK5x;
    }

    public static final String ZCWXqiC0(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final String arNh8D4Z5gB() {
        byte[] bArr = new byte[16];
        mz0.GWasM1elztuh.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long mE4lRynR2 = q70.mE4lRynR(bArr, 0);
        long mE4lRynR3 = q70.mE4lRynR(bArr, 8);
        return ((mE4lRynR2 == 0 && mE4lRynR3 == 0) ? hd1.AvO7iQsrTN : new hd1(mE4lRynR2, mE4lRynR3)).toString();
    }

    public static final Object[] c4eaifQP(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.E7jCp8Ls(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cilMamHF(ms msVar, z9 z9Var, boolean z, vg vgVar) {
        ps psVar;
        int i;
        m8 it;
        m8 m8Var;
        ms msVar2;
        Object Yi7zF1RB12;
        try {
            if (vgVar instanceof ps) {
                psVar = (ps) vgVar;
                int i2 = psVar.XnEVoBF0td1l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    psVar.XnEVoBF0td1l = i2 - Integer.MIN_VALUE;
                    Object obj = psVar.E7jCp8Ls;
                    i = psVar.XnEVoBF0td1l;
                    CancellationException cancellationException = null;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        if (msVar instanceof k91) {
                            throw ((k91) msVar).OOA6hdeuvCS;
                        }
                        it = z9Var.iterator();
                        psVar.encWxUiV2 = msVar;
                        psVar.mOu10nynGul = z9Var;
                        psVar.JFJ3QoxA = it;
                        psVar.rQPn8YBR = z;
                        psVar.XnEVoBF0td1l = 1;
                        Yi7zF1RB12 = it.Yi7zF1RB1(psVar);
                        if (Yi7zF1RB12 != qhVar) {
                        }
                    } else if (i == 1) {
                        z = psVar.rQPn8YBR;
                        m8Var = psVar.JFJ3QoxA;
                        z9Var = psVar.mOu10nynGul;
                        msVar2 = psVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = psVar.rQPn8YBR;
                        m8Var = psVar.JFJ3QoxA;
                        z9Var = psVar.mOu10nynGul;
                        msVar2 = psVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        it = m8Var;
                        msVar = msVar2;
                        psVar.encWxUiV2 = msVar;
                        psVar.mOu10nynGul = z9Var;
                        psVar.JFJ3QoxA = it;
                        psVar.rQPn8YBR = z;
                        psVar.XnEVoBF0td1l = 1;
                        Yi7zF1RB12 = it.Yi7zF1RB1(psVar);
                        if (Yi7zF1RB12 != qhVar) {
                            return qhVar;
                        }
                        msVar2 = msVar;
                        m8Var = it;
                        obj = Yi7zF1RB12;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                z9Var.GWasM1elztuh(null);
                            }
                            return kc1.GWasM1elztuh;
                        }
                        Object X1lG3V04pd2 = m8Var.X1lG3V04pd();
                        psVar.encWxUiV2 = msVar2;
                        psVar.mOu10nynGul = z9Var;
                        psVar.JFJ3QoxA = m8Var;
                        psVar.rQPn8YBR = z;
                        psVar.XnEVoBF0td1l = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        psVar = new ps(vgVar);
        Object obj2 = psVar.E7jCp8Ls;
        i = psVar.XnEVoBF0td1l;
        CancellationException cancellationException2 = null;
        qh qhVar2 = qh.OOA6hdeuvCS;
    }

    public static final long dqB83aoLBB(y00 y00Var, xm0 xm0Var, x00 x00Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = y00Var.AvO7iQsrTN;
        if (xm0Var != null) {
            int i = x00Var.GWasM1elztuh;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (xm0Var == xm0.EljAMC1QTz) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & 4294967295L);
        }
        long xqGvceK5x2 = uk0.xqGvceK5x(VeqTn1PQw7(y00Var, xm0Var, x00Var), j2);
        if (z || !y00Var.mOu10nynGul) {
            return xqGvceK5x2;
        }
        return 0L;
    }

    public static boolean eUH21U3apd(int i, Object obj) {
        if (obj instanceof tv) {
            if ((obj instanceof uv ? ((uv) obj).Yi7zF1RB1() : obj instanceof wu ? 0 : obj instanceof hv ? 1 : obj instanceof lv ? 2 : obj instanceof mv ? 3 : obj instanceof nv ? 4 : obj instanceof ov ? 5 : obj instanceof pv ? 6 : obj instanceof qv ? 7 : obj instanceof rv ? 8 : obj instanceof sv ? 9 : obj instanceof xu ? 10 : obj instanceof yu ? 11 : obj instanceof av ? 13 : obj instanceof bv ? 14 : obj instanceof cv ? 15 : obj instanceof dv ? 16 : obj instanceof ev ? 17 : obj instanceof fv ? 18 : obj instanceof gv ? 19 : obj instanceof iv ? 20 : obj instanceof jv ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final void encWxUiV2(ha1 ha1Var, y00 y00Var, xm0 xm0Var, x00 x00Var, qu quVar, long j) {
        float intBitsToFloat;
        ag0 ag0Var = (ag0) quVar.Yi7zF1RB1;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (y00Var.X1lG3V04pd >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (y00Var.X1lG3V04pd & 4294967295L));
        if (YmKjaVtbfp5Z(y00Var)) {
            quVar.GWasM1elztuh = 0;
            ag0Var.xqGvceK5x();
        }
        if (!mOu10nynGul(y00Var) && !YmKjaVtbfp5Z(y00Var)) {
            if (ag0Var.Yi7zF1RB1 == 3) {
                int i = quVar.GWasM1elztuh;
                quVar.GWasM1elztuh = i + 1;
                ag0Var.uFEq9NpZ(i, y00Var);
            } else {
                ag0Var.GWasM1elztuh(y00Var);
            }
            if (quVar.GWasM1elztuh == 3) {
                quVar.GWasM1elztuh = 0;
            }
            Object[] objArr = ag0Var.GWasM1elztuh;
            int i2 = ag0Var.Yi7zF1RB1;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((y00) objArr[i3]).X1lG3V04pd >> 32));
            }
            int i4 = ag0Var.Yi7zF1RB1;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = ag0Var.GWasM1elztuh;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((y00) objArr2[i5]).X1lG3V04pd & 4294967295L));
            }
            intBitsToFloat3 = f2 / ag0Var.Yi7zF1RB1;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (xm0Var != null) {
            int i6 = x00Var.GWasM1elztuh;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = xm0Var == xm0.EljAMC1QTz ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((uk) ha1Var.EljAMC1QTz).GWasM1elztuh(y00Var.Yi7zF1RB1, uk0.OOA6hdeuvCS(floatToRawIntBits, j));
    }

    public static final int iwATDS1i01k(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final pw0 jivtDDk9H(xh xhVar) {
        pw0 pw0Var;
        xhVar.getClass();
        yw0 yw0Var = (yw0) xhVar.GWasM1elztuh(EljAMC1QTz);
        Bundle bundle = null;
        if (yw0Var == null) {
            o4.mE4lRynR("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        ff1 ff1Var = (ff1) xhVar.GWasM1elztuh(AvO7iQsrTN);
        if (ff1Var == null) {
            o4.mE4lRynR("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) xhVar.GWasM1elztuh(encWxUiV2);
        String str = (String) xhVar.GWasM1elztuh(eUH21U3apd);
        if (str == null) {
            o4.mE4lRynR("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        ww0 WIEu4Ya2g82 = yw0Var.X1lG3V04pd().WIEu4Ya2g8("androidx.lifecycle.internal.SavedStateHandlesProvider");
        tw0 tw0Var = WIEu4Ya2g82 instanceof tw0 ? (tw0) WIEu4Ya2g82 : null;
        if (tw0Var == null) {
            o4.jivtDDk9H("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = ozMwhSAI(ff1Var).Yi7zF1RB1;
        pw0 pw0Var2 = (pw0) linkedHashMap.get(str);
        if (pw0Var2 != null) {
            return pw0Var2;
        }
        tw0Var.Yi7zF1RB1();
        Bundle bundle3 = tw0Var.X1lG3V04pd;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                tw0Var.X1lG3V04pd = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            pw0Var = new pw0();
        } else {
            ClassLoader classLoader = pw0.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            ic0 ic0Var = new ic0(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                ic0Var.put(str2, bundle2.get(str2));
            }
            pw0Var = new pw0(rc0.k8h8IjolWQ(ic0Var));
        }
        linkedHashMap.put(str, pw0Var);
        return pw0Var;
    }

    public static x20 k8h8IjolWQ(Collection collection) {
        collection.getClass();
        return new x20(0, collection.size() - 1, 1);
    }

    public static final void lv06NcmrQ(yw0 yw0Var) {
        m90 m90Var = yw0Var.AvO7iQsrTN().encWxUiV2;
        if (m90Var != m90.EljAMC1QTz && m90Var != m90.AvO7iQsrTN) {
            o4.JFJ3QoxA("Failed to enable `SavedStateHandle` for `", yw0Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", m90Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (yw0Var.X1lG3V04pd().WIEu4Ya2g8("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            tw0 tw0Var = new tw0(yw0Var.X1lG3V04pd(), (ff1) yw0Var);
            yw0Var.X1lG3V04pd().jivtDDk9H("androidx.lifecycle.internal.SavedStateHandlesProvider", tw0Var);
            yw0Var.AvO7iQsrTN().GWasM1elztuh(new jt0(3, tw0Var));
        }
    }

    public static final Object mE4lRynR(lv lvVar, vg vgVar) {
        qx0 qx0Var = new qx0(vgVar, vgVar.OOA6hdeuvCS());
        return z50.k8h8IjolWQ(qx0Var, qx0Var, lvVar);
    }

    public static final boolean mOu10nynGul(y00 y00Var) {
        return y00Var.encWxUiV2 && !y00Var.xqGvceK5x;
    }

    public static final PorterDuff.Mode mqNvfisv7(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final uw0 ozMwhSAI(ff1 ff1Var) {
        sw0 sw0Var = new sw0();
        xh xqGvceK5x2 = ff1Var instanceof hz ? ((hz) ff1Var).xqGvceK5x() : vh.Yi7zF1RB1;
        xqGvceK5x2.getClass();
        return (uw0) new rx0(ff1Var.OOA6hdeuvCS(), sw0Var, xqGvceK5x2).YmKjaVtbfp5Z(st0.GWasM1elztuh(uw0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final int pog2g9KITJA(ou ouVar, int i) {
        boolean z = o30.uFEq9NpZ(ouVar.OOA6hdeuvCS, ou.EljAMC1QTz.OOA6hdeuvCS) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final ox qugwajBSa59j(qx qxVar) {
        qx qxVar2;
        qxVar.J3Xc8BaqpN8(206, we.OOA6hdeuvCS);
        if (qxVar.CMh55RymNfS) {
            c31.arNh8D4Z5gB(qxVar.A1EKNP6CxJ);
        }
        Object EXrPz3p7hFb2 = qxVar.EXrPz3p7hFb();
        vx vxVar = EXrPz3p7hFb2 instanceof vx ? (vx) EXrPz3p7hFb2 : null;
        if (vxVar == null) {
            qxVar2 = qxVar;
            vxVar = new xu0(new nx(new ox(qxVar2, qxVar.qugwajBSa59j, qxVar.YmKjaVtbfp5Z, qxVar.k8h8IjolWQ, qxVar.encWxUiV2.WdrkLMV3xh)), -1);
            qxVar2.Qd9Q8OZgvOo4(vxVar);
        } else {
            qxVar2 = qxVar;
        }
        bu0 bu0Var = vxVar.GWasM1elztuh;
        bu0Var.getClass();
        ox oxVar = ((nx) bu0Var).OOA6hdeuvCS;
        oxVar.EljAMC1QTz.setValue(qxVar2.E7jCp8Ls());
        qxVar2.WIEu4Ya2g8(false);
        return oxVar;
    }

    public static Map rQPn8YBR(Object obj) {
        if ((obj instanceof q40) && !(obj instanceof r40)) {
            MItybXapHX(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            o30.dqB83aoLBB(e, fb1.class.getName());
            throw e;
        }
    }

    public static List rezfBrjOrqK(Object... objArr) {
        if (objArr.length <= 0) {
            return xp.OOA6hdeuvCS;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static final int uFEq9NpZ(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void xqGvceK5x(am amVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(294589392);
        int i2 = 2;
        int i3 = 3;
        if ((((qxVar.encWxUiV2(amVar) ? 4 : 2) | i) & 3) == 2 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
        } else {
            jw0 cilMamHF2 = q70.cilMamHF(qxVar);
            mg0 mOu10nynGul2 = z50.mOu10nynGul(amVar.Yi7zF1RB1().OOA6hdeuvCS, qxVar);
            List list = (List) mOu10nynGul2.getValue();
            boolean booleanValue = ((Boolean) qxVar.JFJ3QoxA(m20.GWasM1elztuh)).booleanValue();
            boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(list);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            Object obj = ue.GWasM1elztuh;
            Object obj2 = HFYAaqMd6;
            if (EljAMC1QTz2 || HFYAaqMd6 == obj) {
                p41 p41Var = new p41();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    fh0 fh0Var = (fh0) obj3;
                    if (booleanValue || fh0Var.E7jCp8Ls.JFJ3QoxA.encWxUiV2.compareTo(m90.encWxUiV2) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                p41Var.addAll(arrayList);
                qxVar.dcDmLGVhzWm(p41Var);
                obj2 = p41Var;
            }
            p41 p41Var2 = (p41) obj2;
            AvO7iQsrTN(p41Var2, (List) mOu10nynGul2.getValue(), qxVar, 0);
            mg0 mOu10nynGul3 = z50.mOu10nynGul(amVar.Yi7zF1RB1().EljAMC1QTz, qxVar);
            Object HFYAaqMd62 = qxVar.HFYAaqMd6();
            if (HFYAaqMd62 == obj) {
                HFYAaqMd62 = new p41();
                qxVar.dcDmLGVhzWm(HFYAaqMd62);
            }
            p41 p41Var3 = (p41) HFYAaqMd62;
            qxVar.MjxSquD6Av(-367418626);
            ListIterator listIterator = p41Var2.listIterator();
            while (true) {
                lz lzVar = (lz) listIterator;
                if (!lzVar.hasNext()) {
                    break;
                }
                fh0 fh0Var2 = (fh0) lzVar.next();
                xh0 xh0Var = fh0Var2.EljAMC1QTz;
                xh0Var.getClass();
                zl zlVar = (zl) xh0Var;
                boolean encWxUiV22 = qxVar.encWxUiV2(amVar) | qxVar.encWxUiV2(fh0Var2);
                Object HFYAaqMd63 = qxVar.HFYAaqMd6();
                if (encWxUiV22 || HFYAaqMd63 == obj) {
                    HFYAaqMd63 = new h2(i3, amVar, fh0Var2);
                    qxVar.dcDmLGVhzWm(HFYAaqMd63);
                }
                rj0.X1lG3V04pd((wu) HFYAaqMd63, zlVar.JFJ3QoxA, rj0.YZjbz8VdP5(1129586364, new ul(fh0Var2, amVar, cilMamHF2, p41Var3, zlVar), qxVar), qxVar, 384);
            }
            qxVar.WIEu4Ya2g8(false);
            Set set = (Set) mOu10nynGul3.getValue();
            boolean EljAMC1QTz3 = qxVar.EljAMC1QTz(mOu10nynGul3) | qxVar.encWxUiV2(amVar);
            Object HFYAaqMd64 = qxVar.HFYAaqMd6();
            if (EljAMC1QTz3 || HFYAaqMd64 == obj) {
                HFYAaqMd64 = new vl(mOu10nynGul3, amVar, p41Var3, null);
                qxVar.dcDmLGVhzWm(HFYAaqMd64);
            }
            ki1.mOu10nynGul(set, p41Var3, (lv) HFYAaqMd64, qxVar);
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new k4(i, i2, amVar);
        }
    }

    public static byte[] z19UFEN2I(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                o4.jivtDDk9H(mr0.AvO7iQsrTN("Not enough bytes to read: ", i));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }
}
