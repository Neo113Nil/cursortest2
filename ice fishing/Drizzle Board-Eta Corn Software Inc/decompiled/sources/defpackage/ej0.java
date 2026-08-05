package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import com.kolosta.rejin.jilosa.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ej0 {
    public static final /* synthetic */ int OnDfzHZD = 0;
    public static final lf P7K7Inc8;
    public static final f0 Qr9iLBAD;
    public static final lf b2ZJblxo;
    public static f0 jb9XjC4I;
    public static final float[][] qoPGr6Ce = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] NCTxEWno = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] MdtA4re8 = {95.047f, 100.0f, 108.883f};
    public static final float[][] wxUZMvaN = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final sc VgvYg0wo = new sc(0);
    public static final byte[] eVhOlqcC = {112, 114, 111, 0};
    public static final byte[] k3x7lurq = {112, 114, 109, 0};
    public static final Object ow5vqvCr = new Object();

    static {
        int i = 1;
        P7K7Inc8 = new lf("REMOVED_TASK", i);
        b2ZJblxo = new lf("CLOSED_EMPTY", i);
        Object obj = null;
        Qr9iLBAD = new f0(obj, obj, obj, 10);
    }

    public static int DK9slbsy(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = MdtA4re8;
        return g6.qoPGr6Ce(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static final ub Ey6iv0m0(l9 l9Var) {
        j9 OnDfzHZD2 = l9Var.OnDfzHZD(re.MdtA4re8);
        ub ubVar = OnDfzHZD2 instanceof ub ? (ub) OnDfzHZD2 : null;
        return ubVar == null ? va.qoPGr6Ce : ubVar;
    }

    public static void FXJmAAN1(mcXgUFR8 mcxgufr8, float f) {
        z30 z30Var = (z30) mcxgufr8.MdtA4re8;
        r3 r3Var = (r3) mcxgufr8.wxUZMvaN;
        boolean useCompatPadding = r3Var.getUseCompatPadding();
        boolean preventCornerOverlap = r3Var.getPreventCornerOverlap();
        if (f != z30Var.VgvYg0wo || z30Var.P7K7Inc8 != useCompatPadding || z30Var.b2ZJblxo != preventCornerOverlap) {
            z30Var.VgvYg0wo = f;
            z30Var.P7K7Inc8 = useCompatPadding;
            z30Var.b2ZJblxo = preventCornerOverlap;
            z30Var.NCTxEWno(null);
            z30Var.invalidateSelf();
        }
        if (!r3Var.getUseCompatPadding()) {
            mcxgufr8.aZz0PFXp(0, 0, 0, 0);
            return;
        }
        z30 z30Var2 = (z30) mcxgufr8.MdtA4re8;
        float f2 = z30Var2.VgvYg0wo;
        float f3 = z30Var2.qoPGr6Ce;
        int ceil = (int) Math.ceil(a40.qoPGr6Ce(f2, f3, r3Var.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(a40.NCTxEWno(f2, f3, r3Var.getPreventCornerOverlap()));
        mcxgufr8.aZz0PFXp(ceil, ceil2, ceil, ceil2);
    }

    public static final qo FySoLYna(bk bkVar) {
        bkVar.MdtA4re8();
        xo xoVar = bkVar.P7K7Inc8;
        xoVar.getClass();
        AtomicReference atomicReference = (AtomicReference) xoVar.qoPGr6Ce.MdtA4re8;
        while (true) {
            qo qoVar = (qo) atomicReference.get();
            if (qoVar != null) {
                return qoVar;
            }
            na0 na0Var = new na0(null);
            hb hbVar = ed.qoPGr6Ce;
            qo qoVar2 = new qo(xoVar, fn.WYNAV5pd(na0Var, qq.qoPGr6Ce.P7K7Inc8));
            while (!atomicReference.compareAndSet(null, qoVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            hb hbVar2 = ed.qoPGr6Ce;
            fn.Ey6iv0m0(qoVar2, qq.qoPGr6Ce.P7K7Inc8, new ea(qoVar2, (g9) null), 2);
            return qoVar2;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean HdOGZAzC(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, hc[] hcVarArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = ra.jb9XjC4I;
        byte[] bArr3 = ra.Qr9iLBAD;
        byte[] bArr4 = ra.VgvYg0wo;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = ra.P7K7Inc8;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] k3x7lurq2 = k3x7lurq(hcVarArr, bArr5);
                le0.ZyZthT5G(byteArrayOutputStream, hcVarArr.length, 1);
                le0.ZyZthT5G(byteArrayOutputStream, k3x7lurq2.length, 4);
                byte[] k3x7lurq3 = le0.k3x7lurq(k3x7lurq2);
                le0.ZyZthT5G(byteArrayOutputStream, k3x7lurq3.length, 4);
                byteArrayOutputStream.write(k3x7lurq3);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                le0.ZyZthT5G(byteArrayOutputStream, hcVarArr.length, 1);
                for (hc hcVar : hcVarArr) {
                    int size = hcVar.jb9XjC4I.size() * 4;
                    String KlHjfFWx = KlHjfFWx(hcVar.qoPGr6Ce, hcVar.NCTxEWno, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    le0.bvfAo0eO(byteArrayOutputStream, KlHjfFWx.getBytes(charset).length);
                    le0.bvfAo0eO(byteArrayOutputStream, hcVar.Qr9iLBAD.length);
                    le0.ZyZthT5G(byteArrayOutputStream, size, 4);
                    le0.ZyZthT5G(byteArrayOutputStream, hcVar.MdtA4re8, 4);
                    byteArrayOutputStream.write(KlHjfFWx.getBytes(charset));
                    Iterator it = hcVar.jb9XjC4I.keySet().iterator();
                    while (it.hasNext()) {
                        le0.bvfAo0eO(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        le0.bvfAo0eO(byteArrayOutputStream, 0);
                    }
                    for (int i3 : hcVar.Qr9iLBAD) {
                        le0.bvfAo0eO(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = ra.b2ZJblxo;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] k3x7lurq4 = k3x7lurq(hcVarArr, bArr6);
                le0.ZyZthT5G(byteArrayOutputStream, hcVarArr.length, 1);
                le0.ZyZthT5G(byteArrayOutputStream, k3x7lurq4.length, 4);
                byte[] k3x7lurq5 = le0.k3x7lurq(k3x7lurq4);
                le0.ZyZthT5G(byteArrayOutputStream, k3x7lurq5.length, 4);
                byteArrayOutputStream.write(k3x7lurq5);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            le0.bvfAo0eO(byteArrayOutputStream, hcVarArr.length);
            for (hc hcVar2 : hcVarArr) {
                String str = hcVar2.qoPGr6Ce;
                TreeMap treeMap = hcVar2.jb9XjC4I;
                String KlHjfFWx2 = KlHjfFWx(str, hcVar2.NCTxEWno, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                le0.bvfAo0eO(byteArrayOutputStream, KlHjfFWx2.getBytes(charset2).length);
                le0.bvfAo0eO(byteArrayOutputStream, treeMap.size());
                le0.bvfAo0eO(byteArrayOutputStream, hcVar2.Qr9iLBAD.length);
                le0.ZyZthT5G(byteArrayOutputStream, hcVar2.MdtA4re8, 4);
                byteArrayOutputStream.write(KlHjfFWx2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    le0.bvfAo0eO(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : hcVar2.Qr9iLBAD) {
                    le0.bvfAo0eO(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            le0.bvfAo0eO(byteArrayOutputStream2, hcVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (hc hcVar3 : hcVarArr) {
                le0.ZyZthT5G(byteArrayOutputStream2, hcVar3.MdtA4re8, 4);
                le0.ZyZthT5G(byteArrayOutputStream2, hcVar3.wxUZMvaN, 4);
                le0.ZyZthT5G(byteArrayOutputStream2, hcVar3.b2ZJblxo, 4);
                String KlHjfFWx3 = KlHjfFWx(hcVar3.qoPGr6Ce, hcVar3.NCTxEWno, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = KlHjfFWx3.getBytes(charset3).length;
                le0.bvfAo0eO(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(KlHjfFWx3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            cj0 cj0Var = new cj0(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(cj0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < hcVarArr.length) {
                try {
                    hc hcVar4 = hcVarArr[i7];
                    le0.bvfAo0eO(byteArrayOutputStream3, i7);
                    le0.bvfAo0eO(byteArrayOutputStream3, hcVar4.VgvYg0wo);
                    i8 = i8 + 4 + (hcVar4.VgvYg0wo * i5);
                    int[] iArr = hcVar4.Qr9iLBAD;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        le0.bvfAo0eO(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            cj0 cj0Var2 = new cj0(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(cj0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < hcVarArr.length; i13++) {
                try {
                    hc hcVar5 = hcVarArr[i13];
                    Iterator it3 = hcVar5.jb9XjC4I.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        KRabZ4CU(byteArrayOutputStream4, i14, hcVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            gmkaJpmS(byteArrayOutputStream4, hcVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            le0.bvfAo0eO(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            le0.ZyZthT5G(byteArrayOutputStream3, length4, 4);
                            le0.bvfAo0eO(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            cj0 cj0Var3 = new cj0(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(cj0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            le0.ZyZthT5G(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                cj0 cj0Var4 = (cj0) arrayList.get(i16);
                int i17 = cj0Var4.qoPGr6Ce;
                byte[] bArr7 = cj0Var4.NCTxEWno;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                le0.ZyZthT5G(byteArrayOutputStream, j, 4);
                le0.ZyZthT5G(byteArrayOutputStream, size2, 4);
                if (cj0Var4.MdtA4re8) {
                    long length5 = bArr7.length;
                    byte[] k3x7lurq6 = le0.k3x7lurq(bArr7);
                    arrayList2.add(k3x7lurq6);
                    le0.ZyZthT5G(byteArrayOutputStream, k3x7lurq6.length, 4);
                    le0.ZyZthT5G(byteArrayOutputStream, length5, 4);
                    length = k3x7lurq6.length;
                } else {
                    arrayList2.add(bArr7);
                    le0.ZyZthT5G(byteArrayOutputStream, bArr7.length, 4);
                    le0.ZyZthT5G(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static float I5GHvsYW(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return le.NCTxEWno(edgeEffect);
        }
        return 0.0f;
    }

    public static void KRabZ4CU(ByteArrayOutputStream byteArrayOutputStream, int i, hc hcVar) {
        int i2 = hcVar.b2ZJblxo;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : hcVar.jb9XjC4I.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static String KlHjfFWx(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ra.Qr9iLBAD;
        byte[] bArr3 = ra.jb9XjC4I;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static int Mq3SeTnW(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final long N8VPGzVC(long j) {
        long qoPGr6Ce2;
        re reVar = ge.NCTxEWno;
        boolean z = j > 0;
        if (!z) {
            if (z) {
                throw new d7();
            }
            return 0L;
        }
        ie ieVar = ie.NANOSECONDS;
        long FXJmAAN1 = le0.FXJmAAN1(999999L, ieVar);
        int i = ((int) j) & 1;
        if (i != (((int) FXJmAAN1) & 1)) {
            qoPGr6Ce2 = i == 1 ? ge.qoPGr6Ce(j >> 1, FXJmAAN1 >> 1) : ge.qoPGr6Ce(FXJmAAN1 >> 1, j >> 1);
        } else if (i == 0) {
            long j2 = (j >> 1) + (FXJmAAN1 >> 1);
            if (-4611686018426999999L > j2 || j2 >= 4611686018427000000L) {
                qoPGr6Ce2 = le0.ygLcUYwZ(j2 / 1000000);
            } else {
                qoPGr6Ce2 = j2 << 1;
                int i2 = he.qoPGr6Ce;
            }
        } else {
            long NCTxEWno2 = le0.NCTxEWno(j >> 1, FXJmAAN1 >> 1);
            if (NCTxEWno2 == 9223372036854759646L) {
                m1.sjUBp5pO("Summing infinite durations of different signs yields an undefined result.");
                return 0L;
            }
            if (NCTxEWno2 == 4611686018427387903L || NCTxEWno2 == -4611686018427387903L) {
                qoPGr6Ce2 = le0.ygLcUYwZ(NCTxEWno2);
            } else if (-4611686018426L > NCTxEWno2 || NCTxEWno2 >= 4611686018427L) {
                qoPGr6Ce2 = le0.ygLcUYwZ(w30.eVhOlqcC(NCTxEWno2));
            } else {
                qoPGr6Ce2 = (NCTxEWno2 * 1000000) << 1;
                int i3 = he.qoPGr6Ce;
            }
        }
        int i4 = ((int) qoPGr6Ce2) & 1;
        if (i4 == 1 && qoPGr6Ce2 != ge.MdtA4re8 && qoPGr6Ce2 != ge.wxUZMvaN) {
            return qoPGr6Ce2 >> 1;
        }
        if (qoPGr6Ce2 == ge.MdtA4re8) {
            return Long.MAX_VALUE;
        }
        if (qoPGr6Ce2 == ge.wxUZMvaN) {
            return Long.MIN_VALUE;
        }
        long j3 = qoPGr6Ce2 >> 1;
        if (i4 != 0) {
            ieVar = ie.MILLISECONDS;
        }
        return TimeUnit.MILLISECONDS.convert(j3, ieVar.NCTxEWno);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean NCTxEWno(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static final Object OnDfzHZD(long j, h9 h9Var) {
        if (j > 0) {
            m3 m3Var = new m3(1, w30.SgZGMMPL(h9Var));
            m3Var.I5GHvsYW();
            if (j < Long.MAX_VALUE) {
                Ey6iv0m0(m3Var.P7K7Inc8).P7K7Inc8(j, m3Var);
            }
            Object Ey6iv0m0 = m3Var.Ey6iv0m0();
            if (Ey6iv0m0 == u9.NCTxEWno) {
                return Ey6iv0m0;
            }
        }
        return xe0.qoPGr6Ce;
    }

    public static final uu OxcuoDLp(View view) {
        view.getClass();
        int i = 1;
        vg vgVar = new vg(new xb(new nb0(l60.RXQxj5Oe(view, new tKaxLBvG(18)), new tKaxLBvG(19), i), new tKaxLBvG(28), i));
        uu uuVar = (uu) (!vgVar.hasNext() ? null : vgVar.next());
        if (uuVar != null) {
            return uuVar;
        }
        m1.ygLcUYwZ(view, " does not have a NavController set", "View ");
        return null;
    }

    public static void P7K7Inc8(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String Qr9iLBAD(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class RXQxj5Oe(p5 p5Var) {
        Class cls = p5Var.qoPGr6Ce;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static void SgZGMMPL(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float TrssYQ34() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static float U0LaHZX7(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void VgvYg0wo(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            m1.sjUBp5pO(q70.wxUZMvaN(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static int[] VhgXwMj9(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) le0.eIA6dogk(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static hc[] Xkz7p5xa(ByteArrayInputStream byteArrayInputStream, int i, hc[] hcVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new hc[0];
        }
        if (i != hcVarArr.length) {
            m1.Ey6iv0m0("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int eIA6dogk = (int) le0.eIA6dogk(byteArrayInputStream, 2);
            iArr[i2] = (int) le0.eIA6dogk(byteArrayInputStream, 2);
            strArr[i2] = new String(le0.SgZGMMPL(byteArrayInputStream, eIA6dogk), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            hc hcVar = hcVarArr[i3];
            if (!hcVar.NCTxEWno.equals(strArr[i3])) {
                m1.Ey6iv0m0("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            hcVar.VgvYg0wo = i4;
            hcVar.Qr9iLBAD = VhgXwMj9(byteArrayInputStream, i4);
        }
        return hcVarArr;
    }

    public static void ZyZthT5G(ByteArrayOutputStream byteArrayOutputStream, hc hcVar) {
        gmkaJpmS(byteArrayOutputStream, hcVar);
        int i = hcVar.b2ZJblxo;
        int[] iArr = hcVar.Qr9iLBAD;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            le0.bvfAo0eO(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : hcVar.jb9XjC4I.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static hc[] aZz0PFXp(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, hc[] hcVarArr) {
        byte[] bArr3 = ra.eVhOlqcC;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ra.k3x7lurq)) {
                m1.Ey6iv0m0("Unsupported meta version");
                return null;
            }
            int eIA6dogk = (int) le0.eIA6dogk(fileInputStream, 2);
            byte[] ytu5o6f4 = le0.ytu5o6f4(fileInputStream, (int) le0.eIA6dogk(fileInputStream, 4), (int) le0.eIA6dogk(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                m1.Ey6iv0m0("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ytu5o6f4);
            try {
                hc[] fVMzMhyS = fVMzMhyS(byteArrayInputStream, bArr2, eIA6dogk, hcVarArr);
                byteArrayInputStream.close();
                return fVMzMhyS;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ra.VgvYg0wo, bArr2)) {
            m1.Ey6iv0m0("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            m1.Ey6iv0m0("Unsupported meta version");
            return null;
        }
        int eIA6dogk2 = (int) le0.eIA6dogk(fileInputStream, 1);
        byte[] ytu5o6f42 = le0.ytu5o6f4(fileInputStream, (int) le0.eIA6dogk(fileInputStream, 4), (int) le0.eIA6dogk(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            m1.Ey6iv0m0("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(ytu5o6f42);
        try {
            hc[] Xkz7p5xa = Xkz7p5xa(byteArrayInputStream2, eIA6dogk2, hcVarArr);
            byteArrayInputStream2.close();
            return Xkz7p5xa;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void amk52bBQ(a80 a80Var) {
        int i = a80Var.VgvYg0wo;
        int[] iArr = a80Var.MdtA4re8;
        Object[] objArr = a80Var.wxUZMvaN;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != ow5vqvCr) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        a80Var.NCTxEWno = false;
        a80Var.VgvYg0wo = i2;
    }

    public static float b2ZJblxo(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static void bvfAo0eO(ByteArrayOutputStream byteArrayOutputStream, hc hcVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        le0.bvfAo0eO(byteArrayOutputStream, str.getBytes(charset).length);
        le0.bvfAo0eO(byteArrayOutputStream, hcVar.VgvYg0wo);
        le0.ZyZthT5G(byteArrayOutputStream, hcVar.P7K7Inc8, 4);
        le0.ZyZthT5G(byteArrayOutputStream, hcVar.MdtA4re8, 4);
        le0.ZyZthT5G(byteArrayOutputStream, hcVar.b2ZJblxo, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final Object eVhOlqcC(a80 a80Var, int i) {
        Object obj;
        a80Var.getClass();
        int P7K7Inc82 = le0.P7K7Inc8(a80Var.VgvYg0wo, i, a80Var.MdtA4re8);
        if (P7K7Inc82 < 0 || (obj = a80Var.wxUZMvaN[P7K7Inc82]) == ow5vqvCr) {
            return null;
        }
        return obj;
    }

    public static void euDDoUNr(uu uuVar) {
        uuVar.getClass();
        gu guVar = uuVar.NCTxEWno;
        pu P7K7Inc82 = guVar.P7K7Inc8();
        if (P7K7Inc82 == null || P7K7Inc82.MdtA4re8.qoPGr6Ce != R.id.fragment_pair_shelf) {
            uuVar.MdtA4re8(R.id.fragment_pair_shelf, null, new xu(true, true, guVar.b2ZJblxo().Qr9iLBAD.qoPGr6Ce, false, true, -1, -1, -1, -1));
        }
    }

    public static hc[] fVMzMhyS(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, hc[] hcVarArr) {
        hc hcVar;
        if (byteArrayInputStream.available() == 0) {
            return new hc[0];
        }
        if (i != hcVarArr.length) {
            m1.Ey6iv0m0("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            le0.eIA6dogk(byteArrayInputStream, 2);
            String str = new String(le0.SgZGMMPL(byteArrayInputStream, (int) le0.eIA6dogk(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long eIA6dogk = le0.eIA6dogk(byteArrayInputStream, 4);
            int eIA6dogk2 = (int) le0.eIA6dogk(byteArrayInputStream, 2);
            if (hcVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < hcVarArr.length; i3++) {
                    if (hcVarArr[i3].NCTxEWno.equals(substring)) {
                        hcVar = hcVarArr[i3];
                        break;
                    }
                }
            }
            hcVar = null;
            if (hcVar == null) {
                m1.Ey6iv0m0("Missing profile key: ".concat(str));
                return null;
            }
            hcVar.wxUZMvaN = eIA6dogk;
            int[] VhgXwMj9 = VhgXwMj9(byteArrayInputStream, eIA6dogk2);
            if (Arrays.equals(bArr, ra.jb9XjC4I)) {
                hcVar.VgvYg0wo = eIA6dogk2;
                hcVar.Qr9iLBAD = VhgXwMj9;
            }
        }
        return hcVarArr;
    }

    public static final void gjV1z5T1(l9 l9Var, Throwable th) {
        try {
            ELBHWJgD eLBHWJgD = (ELBHWJgD) l9Var.OnDfzHZD(re.wxUZMvaN);
            if (eLBHWJgD != null) {
                eLBHWJgD.RXQxj5Oe(th);
            } else {
                le0.gjV1z5T1(l9Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                w30.wxUZMvaN(runtimeException, th);
                th = runtimeException;
            }
            le0.gjV1z5T1(l9Var, th);
        }
    }

    public static void gmkaJpmS(ByteArrayOutputStream byteArrayOutputStream, hc hcVar) {
        int i = 0;
        for (Map.Entry entry : hcVar.jb9XjC4I.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                le0.bvfAo0eO(byteArrayOutputStream, intValue - i);
                le0.bvfAo0eO(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static hc[] hzgxAD8d(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, ra.P7K7Inc8)) {
            m1.Ey6iv0m0("Unsupported version");
            return null;
        }
        int eIA6dogk = (int) le0.eIA6dogk(fileInputStream, 1);
        byte[] ytu5o6f4 = le0.ytu5o6f4(fileInputStream, (int) le0.eIA6dogk(fileInputStream, 4), (int) le0.eIA6dogk(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            m1.Ey6iv0m0("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ytu5o6f4);
        try {
            hc[] zCflySGU = zCflySGU(byteArrayInputStream, str, eIA6dogk);
            byteArrayInputStream.close();
            return zCflySGU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int i7xS8jrb(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static final int jb9XjC4I(h40 h40Var, String str) {
        h40Var.getClass();
        int columnCount = h40Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(h40Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = h40Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(h40Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = h40Var.getColumnCount();
            String concat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = h40Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static byte[] k3x7lurq(hc[] hcVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (hc hcVar : hcVarArr) {
            i2 += ((((hcVar.b2ZJblxo * 2) + 7) & (-8)) / 8) + (hcVar.VgvYg0wo * 2) + KlHjfFWx(hcVar.qoPGr6Ce, hcVar.NCTxEWno, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + hcVar.P7K7Inc8;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, ra.b2ZJblxo)) {
            int length = hcVarArr.length;
            while (i < length) {
                hc hcVar2 = hcVarArr[i];
                bvfAo0eO(byteArrayOutputStream, hcVar2, KlHjfFWx(hcVar2.qoPGr6Ce, hcVar2.NCTxEWno, bArr));
                ZyZthT5G(byteArrayOutputStream, hcVar2);
                i++;
            }
        } else {
            for (hc hcVar3 : hcVarArr) {
                bvfAo0eO(byteArrayOutputStream, hcVar3, KlHjfFWx(hcVar3.qoPGr6Ce, hcVar3.NCTxEWno, bArr));
            }
            int length2 = hcVarArr.length;
            while (i < length2) {
                ZyZthT5G(byteArrayOutputStream, hcVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1.OnDfzHZD(r11, r0) == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0051, B:20:0x0066, B:22:0x006e, B:24:0x0074, B:26:0x007a, B:28:0x008b, B:30:0x0093, B:31:0x009a, B:32:0x009c, B:33:0x009d, B:34:0x00a4, B:42:0x0046, B:44:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lDXGDhIF(yg ygVar, j4 j4Var, boolean z, h9 h9Var) {
        bh bhVar;
        int i;
        w2 it;
        w2 w2Var;
        yg ygVar2;
        Object NCTxEWno2;
        try {
            if (h9Var instanceof bh) {
                bhVar = (bh) h9Var;
                int i2 = bhVar.eVhOlqcC;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bhVar.eVhOlqcC = i2 - Integer.MIN_VALUE;
                    Object obj = bhVar.jb9XjC4I;
                    i = bhVar.eVhOlqcC;
                    u9 u9Var = u9.NCTxEWno;
                    if (i != 0) {
                        fn.SgZGMMPL(obj);
                        it = j4Var.iterator();
                        bhVar.VgvYg0wo = ygVar;
                        bhVar.P7K7Inc8 = j4Var;
                        bhVar.b2ZJblxo = it;
                        bhVar.Qr9iLBAD = z;
                        bhVar.eVhOlqcC = 1;
                        NCTxEWno2 = it.NCTxEWno(bhVar);
                        if (NCTxEWno2 != u9Var) {
                        }
                    } else if (i == 1) {
                        z = bhVar.Qr9iLBAD;
                        w2Var = bhVar.b2ZJblxo;
                        j4Var = bhVar.P7K7Inc8;
                        ygVar2 = bhVar.VgvYg0wo;
                        fn.SgZGMMPL(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = bhVar.Qr9iLBAD;
                        w2Var = bhVar.b2ZJblxo;
                        j4Var = bhVar.P7K7Inc8;
                        ygVar2 = bhVar.VgvYg0wo;
                        fn.SgZGMMPL(obj);
                        it = w2Var;
                        ygVar = ygVar2;
                        bhVar.VgvYg0wo = ygVar;
                        bhVar.P7K7Inc8 = j4Var;
                        bhVar.b2ZJblxo = it;
                        bhVar.Qr9iLBAD = z;
                        bhVar.eVhOlqcC = 1;
                        NCTxEWno2 = it.NCTxEWno(bhVar);
                        if (NCTxEWno2 != u9Var) {
                            return u9Var;
                        }
                        ygVar2 = ygVar;
                        w2Var = it;
                        obj = NCTxEWno2;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z) {
                                j4Var.b2ZJblxo(null);
                            }
                            return xe0.qoPGr6Ce;
                        }
                        Object obj2 = w2Var.NCTxEWno;
                        lf lfVar = b3.sjUBp5pO;
                        if (obj2 == lfVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        w2Var.NCTxEWno = lfVar;
                        if (obj2 == b3.ow5vqvCr) {
                            Throwable OnDfzHZD2 = w2Var.wxUZMvaN.OnDfzHZD();
                            if (OnDfzHZD2 == null) {
                                OnDfzHZD2 = new u5("Channel was closed");
                            }
                            int i3 = k90.qoPGr6Ce;
                            throw OnDfzHZD2;
                        }
                        bhVar.VgvYg0wo = ygVar2;
                        bhVar.P7K7Inc8 = j4Var;
                        bhVar.b2ZJblxo = w2Var;
                        bhVar.Qr9iLBAD = z;
                        bhVar.eVhOlqcC = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    j4Var.b2ZJblxo(cancellationException);
                }
                throw th2;
            }
        }
        bhVar = new bh(h9Var);
        Object obj3 = bhVar.jb9XjC4I;
        i = bhVar.eVhOlqcC;
        u9 u9Var2 = u9.NCTxEWno;
    }

    public static boolean lwWCatUu(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String nSmgoSB5(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static float pRiPUEwG(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return le.MdtA4re8(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = i7xS8jrb(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean qoPGr6Ce(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean NCTxEWno2 = NCTxEWno(i, rect, rect2);
        if (!NCTxEWno(i, rect, rect3) && NCTxEWno2) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final uu sjUBp5pO(li liVar) {
        o7 o7Var;
        Window window;
        liVar.getClass();
        for (li liVar2 = liVar; liVar2 != null; liVar2 = liVar2.FySoLYna) {
            if (liVar2 instanceof NavHostFragment) {
                return ((NavHostFragment) liVar2).zCflySGU();
            }
            li liVar3 = liVar2.ow5vqvCr().gjV1z5T1;
            if (liVar3 instanceof NavHostFragment) {
                return ((NavHostFragment) liVar3).zCflySGU();
            }
        }
        View view = liVar.ytu5o6f4;
        if (view != null) {
            return OxcuoDLp(view);
        }
        nc ncVar = liVar instanceof nc ? (nc) liVar : null;
        View decorView = (ncVar == null || (o7Var = ncVar.QT4Tf9Dt) == null || (window = o7Var.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return OxcuoDLp(decorView);
        }
        m1.ygLcUYwZ(liVar, " does not have a NavController set", "Fragment ");
        return null;
    }

    public static boolean ygLcUYwZ(File file) {
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
            z = ygLcUYwZ(file2) && z;
        }
        return z;
    }

    public static hc[] zCflySGU(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new hc[0];
        }
        hc[] hcVarArr = new hc[i];
        for (int i3 = 0; i3 < i; i3++) {
            int eIA6dogk = (int) le0.eIA6dogk(byteArrayInputStream, 2);
            int eIA6dogk2 = (int) le0.eIA6dogk(byteArrayInputStream, 2);
            hcVarArr[i3] = new hc(str, new String(le0.SgZGMMPL(byteArrayInputStream, eIA6dogk), StandardCharsets.UTF_8), le0.eIA6dogk(byteArrayInputStream, 4), eIA6dogk2, (int) le0.eIA6dogk(byteArrayInputStream, 4), (int) le0.eIA6dogk(byteArrayInputStream, 4), new int[eIA6dogk2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            hc hcVar = hcVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = hcVar.P7K7Inc8;
            int i6 = hcVar.b2ZJblxo;
            TreeMap treeMap = hcVar.jb9XjC4I;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) le0.eIA6dogk(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int eIA6dogk3 = (int) le0.eIA6dogk(byteArrayInputStream, 2);
                while (eIA6dogk3 > 0) {
                    le0.eIA6dogk(byteArrayInputStream, 2);
                    int eIA6dogk4 = (int) le0.eIA6dogk(byteArrayInputStream, 1);
                    if (eIA6dogk4 != 6 && eIA6dogk4 != 7) {
                        while (eIA6dogk4 > 0) {
                            le0.eIA6dogk(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int eIA6dogk5 = (int) le0.eIA6dogk(byteArrayInputStream, 1); eIA6dogk5 > 0; eIA6dogk5--) {
                                le0.eIA6dogk(byteArrayInputStream, 2);
                            }
                            eIA6dogk4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    eIA6dogk3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                m1.Ey6iv0m0("Read too much data during profile line parse");
                return null;
            }
            hcVar.Qr9iLBAD = VhgXwMj9(byteArrayInputStream, hcVar.VgvYg0wo);
            BitSet valueOf = BitSet.valueOf(le0.SgZGMMPL(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return hcVarArr;
    }

    public abstract void MdtA4re8(h40 h40Var, Object obj);

    public void WYNAV5pd(f40 f40Var, Object obj) {
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0(ow5vqvCr());
        try {
            MdtA4re8(Ey6iv0m0, obj);
            Ey6iv0m0.amk52bBQ();
            le0.eVhOlqcC(Ey6iv0m0, null);
        } finally {
        }
    }

    public abstract void eIA6dogk(Typeface typeface);

    public abstract String ow5vqvCr();

    public void wxUZMvaN(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: h30
            @Override // java.lang.Runnable
            public final void run() {
                ej0.this.ytu5o6f4(i);
            }
        });
    }

    public abstract void ytu5o6f4(int i);
}
