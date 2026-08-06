package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.combinations.level.experts.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i extends CMh55RymNfS implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final qf0 YXi2hvwn7WL;
    public final String A1EKNP6CxJ;
    public final pf0 AEn1Rrio;
    public final rf0 DmJncFq5;
    public long E7jCp8Ls;
    public rf0 EXrPz3p7hFb;
    public e01 HFYAaqMd6;
    public boolean M3K9sHhK;
    public final f4 MZhzXH72;
    public SyyZR548qbcW Mjvvu5DE;
    public final pf0 TpUsjqg3bxO;
    public final ArrayList VeqTn1PQw7;
    public int WIEu4Ya2g8;
    public Integer WRKkgoJXwDn;
    public int WdrkLMV3xh;
    public List XnEVoBF0td1l;
    public final rf0 Y6hRI1cF8;
    public final pf0 YZjbz8VdP5;
    public SyyZR548qbcW YmKjaVtbfp5Z;
    public final c5 arNh8D4Z5gB;
    public final y41 cilMamHF;
    public final uFEq9NpZ dqB83aoLBB;
    public final String eUH21U3apd;
    public final c encWxUiV2;
    public int iwATDS1i01k;
    public final rf0 jivtDDk9H;
    public e k8h8IjolWQ;
    public final y41 lv06NcmrQ;
    public boolean mE4lRynR;
    public final sf0 ozMwhSAI;
    public final n8 pog2g9KITJA;
    public final AccessibilityManager rQPn8YBR;
    public boolean rezfBrjOrqK;
    public final d uFEq9NpZ;
    public final h z19UFEN2I;
    public int mOu10nynGul = Integer.MIN_VALUE;
    public final h JFJ3QoxA = new h(this, 0);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        qf0 qf0Var = r20.GWasM1elztuh;
        qf0 qf0Var2 = new qf0(32);
        int i = qf0Var2.Yi7zF1RB1;
        if (i < 0) {
            o4.uFEq9NpZ("");
            return;
        }
        int i2 = i + 32;
        int[] iArr2 = qf0Var2.GWasM1elztuh;
        if (iArr2.length < i2) {
            qf0Var2.GWasM1elztuh = Arrays.copyOf(iArr2, Math.max(i2, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = qf0Var2.GWasM1elztuh;
        int i3 = qf0Var2.Yi7zF1RB1;
        if (i != i3) {
            d5.MjxSquD6Av(iArr3, iArr3, i2, i, i3);
        }
        d5.c4eaifQP(iArr, iArr3, i, 0, 12);
        qf0Var2.Yi7zF1RB1 += 32;
        YXi2hvwn7WL = qf0Var2;
    }

    public i(c cVar) {
        this.encWxUiV2 = cVar;
        Object systemService = cVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.rQPn8YBR = (AccessibilityManager) systemService;
        this.E7jCp8Ls = 100L;
        new Handler(Looper.getMainLooper());
        this.uFEq9NpZ = new d(this);
        this.iwATDS1i01k = Integer.MIN_VALUE;
        this.WIEu4Ya2g8 = Integer.MIN_VALUE;
        this.jivtDDk9H = new rf0();
        this.Y6hRI1cF8 = new rf0();
        this.cilMamHF = new y41();
        this.lv06NcmrQ = new y41();
        this.WdrkLMV3xh = -1;
        this.arNh8D4Z5gB = new c5();
        int i = 1;
        this.pog2g9KITJA = fb1.Yi7zF1RB1(1, null, 6);
        this.M3K9sHhK = true;
        rf0 rf0Var = t20.GWasM1elztuh;
        rf0Var.getClass();
        this.EXrPz3p7hFb = rf0Var;
        this.ozMwhSAI = new sf0();
        this.AEn1Rrio = new pf0();
        this.YZjbz8VdP5 = new pf0();
        this.eUH21U3apd = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.A1EKNP6CxJ = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.MZhzXH72 = new f4(17);
        this.DmJncFq5 = new rf0();
        this.HFYAaqMd6 = new e01(cVar.getSemanticsOwner().GWasM1elztuh(), rf0Var);
        int i2 = p20.GWasM1elztuh;
        this.TpUsjqg3bxO = new pf0();
        cVar.addOnAttachStateChangeListener(this);
        this.dqB83aoLBB = new uFEq9NpZ(i, this);
        this.VeqTn1PQw7 = new ArrayList();
        this.z19UFEN2I = new h(this, i);
    }

    public static float[] AEn1Rrio(z50 z50Var) {
        if (!(z50Var instanceof bn0)) {
            return null;
        }
        sv0 sv0Var = ((bn0) z50Var).Yi7zF1RB1;
        long j = sv0Var.encWxUiV2;
        long j2 = sv0Var.AvO7iQsrTN;
        long j3 = sv0Var.EljAMC1QTz;
        long j4 = sv0Var.OOA6hdeuvCS;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static String E7jCp8Ls(d01 d01Var) {
        u3 u3Var;
        if (d01Var != null) {
            zz0 zz0Var = d01Var.xqGvceK5x;
            hg0 hg0Var = zz0Var.OOA6hdeuvCS;
            k01 k01Var = h01.GWasM1elztuh;
            if (hg0Var.X1lG3V04pd(k01Var)) {
                return xa0.GWasM1elztuh((List) zz0Var.X1lG3V04pd(k01Var), ",", null, 62);
            }
            k01 k01Var2 = h01.AEn1Rrio;
            if (hg0Var.X1lG3V04pd(k01Var2)) {
                Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(k01Var2);
                if (AvO7iQsrTN == null) {
                    AvO7iQsrTN = null;
                }
                u3 u3Var2 = (u3) AvO7iQsrTN;
                if (u3Var2 != null) {
                    return u3Var2.EljAMC1QTz;
                }
            } else {
                Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(h01.M3K9sHhK);
                if (AvO7iQsrTN2 == null) {
                    AvO7iQsrTN2 = null;
                }
                List list = (List) AvO7iQsrTN2;
                if (list != null && (u3Var = (u3) rb.YTyqgZhdF(list)) != null) {
                    return u3Var.EljAMC1QTz;
                }
            }
        }
        return null;
    }

    public static Rect EXrPz3p7hFb(z50 z50Var, float f, float f2) {
        if (!(z50Var instanceof an0) && !(z50Var instanceof bn0)) {
            return null;
        }
        kt0 YmKjaVtbfp5Z = z50Var.YmKjaVtbfp5Z();
        return new Rect((int) (YmKjaVtbfp5Z.GWasM1elztuh + f), (int) (YmKjaVtbfp5Z.Yi7zF1RB1 + f2), (int) (YmKjaVtbfp5Z.X1lG3V04pd + f), (int) (YmKjaVtbfp5Z.xqGvceK5x + f2));
    }

    public static final boolean Mjvvu5DE(sx0 sx0Var) {
        wu wuVar = sx0Var.GWasM1elztuh;
        if (((Number) wuVar.GWasM1elztuh()).floatValue() < ((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue()) {
            return true;
        }
        ((Number) wuVar.GWasM1elztuh()).floatValue();
        return false;
    }

    public static final boolean WIEu4Ya2g8(sx0 sx0Var, float f) {
        wu wuVar = sx0Var.GWasM1elztuh;
        if (f >= 0.0f || ((Number) wuVar.GWasM1elztuh()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) wuVar.GWasM1elztuh()).floatValue() < ((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue();
        }
        return true;
    }

    public static Region YZjbz8VdP5(z50 z50Var, float f, float f2) {
        if (!(z50Var instanceof zm0)) {
            return null;
        }
        zm0 zm0Var = (zm0) z50Var;
        kt0 xqGvceK5x = zm0Var.YmKjaVtbfp5Z().xqGvceK5x(f, f2);
        Region region = new Region(new Rect((int) (xqGvceK5x.GWasM1elztuh + 0.0f), (int) (xqGvceK5x.Yi7zF1RB1 + 0.0f), (int) (xqGvceK5x.X1lG3V04pd + 0.0f), (int) (xqGvceK5x.xqGvceK5x + 0.0f)));
        Region region2 = new Region();
        h1 h1Var = zm0Var.Yi7zF1RB1;
        if (!(h1Var instanceof h1)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = h1Var.GWasM1elztuh;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static final boolean YmKjaVtbfp5Z(sx0 sx0Var) {
        wu wuVar = sx0Var.GWasM1elztuh;
        if (((Number) wuVar.GWasM1elztuh()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) wuVar.GWasM1elztuh()).floatValue();
        ((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue();
        return false;
    }

    public static CharSequence eUH21U3apd(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static /* synthetic */ void lv06NcmrQ(i iVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        iVar.cilMamHF(i, i2, num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1EKNP6CxJ() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        sf0 sf0Var = new sf0();
        sf0 sf0Var2 = this.ozMwhSAI;
        int[] iArr = sf0Var2.Yi7zF1RB1;
        long[] jArr3 = sf0Var2.GWasM1elztuh;
        int length = jArr3.length - 2;
        rf0 rf0Var = this.DmJncFq5;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            f01 f01Var = (f01) rQPn8YBR().Yi7zF1RB1(i8);
                            d01 d01Var = f01Var != null ? f01Var.GWasM1elztuh : null;
                            if (d01Var != null) {
                                if (d01Var.xqGvceK5x.OOA6hdeuvCS.X1lG3V04pd(h01.xqGvceK5x)) {
                                }
                            }
                            sf0Var.GWasM1elztuh(i8);
                            e01 e01Var = (e01) rf0Var.Yi7zF1RB1(i8);
                            if (e01Var != null) {
                                Object AvO7iQsrTN = e01Var.GWasM1elztuh.OOA6hdeuvCS.AvO7iQsrTN(h01.xqGvceK5x);
                                r23 = AvO7iQsrTN != 0 ? AvO7iQsrTN : null;
                            }
                            WdrkLMV3xh(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = sf0Var.Yi7zF1RB1;
        long[] jArr4 = sf0Var.GWasM1elztuh;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = sf0Var2.X1lG3V04pd;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = sf0Var2.GWasM1elztuh;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (sf0Var2.Yi7zF1RB1[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                sf0Var2.EljAMC1QTz(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        rf0Var.X1lG3V04pd();
        s20 rQPn8YBR = rQPn8YBR();
        int[] iArr3 = rQPn8YBR.Yi7zF1RB1;
        Object[] objArr = rQPn8YBR.X1lG3V04pd;
        long[] jArr6 = rQPn8YBR.GWasM1elztuh;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            d01 d01Var2 = ((f01) objArr[i26]).GWasM1elztuh;
                            zz0 zz0Var = d01Var2.xqGvceK5x;
                            k01 k01Var = h01.xqGvceK5x;
                            if (zz0Var.OOA6hdeuvCS.X1lG3V04pd(k01Var) && sf0Var2.GWasM1elztuh(i27)) {
                                WdrkLMV3xh(i27, 16, (String) d01Var2.xqGvceK5x.X1lG3V04pd(k01Var));
                            }
                            rf0Var.encWxUiV2(i27, new e01(d01Var2, rQPn8YBR()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.HFYAaqMd6 = new e01(this.encWxUiV2.getSemanticsOwner().GWasM1elztuh(), rQPn8YBR());
    }

    public final AccessibilityEvent AvO7iQsrTN(int i, int i2) {
        f01 f01Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        c cVar = this.encWxUiV2;
        obtain.setPackageName(cVar.getContext().getPackageName());
        obtain.setSource(cVar, i);
        if (uFEq9NpZ() && (f01Var = (f01) rQPn8YBR().Yi7zF1RB1(i)) != null) {
            d01 d01Var = f01Var.GWasM1elztuh;
            obtain.setPassword(d01Var.xqGvceK5x.OOA6hdeuvCS.X1lG3V04pd(h01.MZhzXH72));
            Object AvO7iQsrTN = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(h01.iwATDS1i01k);
            if (AvO7iQsrTN == null) {
                AvO7iQsrTN = null;
            }
            boolean rQPn8YBR = o30.rQPn8YBR(AvO7iQsrTN, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                qugwajBSa59j.EljAMC1QTz(obtain, rQPn8YBR);
            }
        }
        return obtain;
    }

    public final void EljAMC1QTz() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (uFEq9NpZ()) {
                jivtDDk9H(this.encWxUiV2.getSemanticsOwner().GWasM1elztuh(), this.HFYAaqMd6);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                arNh8D4Z5gB(rQPn8YBR());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    A1EKNP6CxJ();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.CMh55RymNfS
    public final d GWasM1elztuh(View view) {
        return this.uFEq9NpZ;
    }

    public final int JFJ3QoxA(d01 d01Var) {
        zz0 zz0Var = d01Var.xqGvceK5x;
        if (!zz0Var.OOA6hdeuvCS.X1lG3V04pd(h01.GWasM1elztuh)) {
            k01 k01Var = h01.YZjbz8VdP5;
            if (zz0Var.OOA6hdeuvCS.X1lG3V04pd(k01Var)) {
                return (int) (((r81) zz0Var.X1lG3V04pd(k01Var)).GWasM1elztuh >> 32);
            }
        }
        return this.WdrkLMV3xh;
    }

    public final void M3K9sHhK(g60 g60Var) {
        if (g60Var.eUH21U3apd() && !this.encWxUiV2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(g60Var)) {
            int i = g60Var.EljAMC1QTz;
            sx0 sx0Var = (sx0) this.jivtDDk9H.Yi7zF1RB1(i);
            sx0 sx0Var2 = (sx0) this.Y6hRI1cF8.Yi7zF1RB1(i);
            if (sx0Var == null && sx0Var2 == null) {
                return;
            }
            AccessibilityEvent AvO7iQsrTN = AvO7iQsrTN(i, 4096);
            if (sx0Var != null) {
                AvO7iQsrTN.setScrollX((int) ((Number) sx0Var.GWasM1elztuh.GWasM1elztuh()).floatValue());
                AvO7iQsrTN.setMaxScrollX((int) ((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue());
            }
            if (sx0Var2 != null) {
                AvO7iQsrTN.setScrollY((int) ((Number) sx0Var2.GWasM1elztuh.GWasM1elztuh()).floatValue());
                AvO7iQsrTN.setMaxScrollY((int) ((Number) sx0Var2.Yi7zF1RB1.GWasM1elztuh()).floatValue());
            }
            Y6hRI1cF8(AvO7iQsrTN);
        }
    }

    public final boolean OOA6hdeuvCS(boolean z, int i, long j) {
        k01 k01Var;
        int i2;
        if (o30.rQPn8YBR(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            s20 rQPn8YBR = rQPn8YBR();
            if (!uk0.Yi7zF1RB1(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    k01Var = h01.lv06NcmrQ;
                } else {
                    if (z) {
                        o4.xqGvceK5x();
                        return false;
                    }
                    k01Var = h01.cilMamHF;
                }
                Object[] objArr = rQPn8YBR.X1lG3V04pd;
                long[] jArr = rQPn8YBR.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    f01 f01Var = (f01) objArr[(i3 << 3) + i6];
                                    y20 y20Var = f01Var.Yi7zF1RB1;
                                    float f = y20Var.GWasM1elztuh;
                                    i2 = i4;
                                    float f2 = y20Var.Yi7zF1RB1;
                                    float f3 = y20Var.X1lG3V04pd;
                                    float f4 = y20Var.xqGvceK5x;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object AvO7iQsrTN = f01Var.GWasM1elztuh.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(k01Var);
                                        if (AvO7iQsrTN == null) {
                                            AvO7iQsrTN = null;
                                        }
                                        sx0 sx0Var = (sx0) AvO7iQsrTN;
                                        if (sx0Var != null) {
                                            wu wuVar = sx0Var.GWasM1elztuh;
                                            if (i < 0) {
                                                if (((Number) wuVar.GWasM1elztuh()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) wuVar.GWasM1elztuh()).floatValue() >= ((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void WRKkgoJXwDn(int i) {
        e eVar = this.k8h8IjolWQ;
        if (eVar != null) {
            d01 d01Var = eVar.GWasM1elztuh;
            if (i != d01Var.EljAMC1QTz) {
                return;
            }
            if (SystemClock.uptimeMillis() - eVar.EljAMC1QTz <= 1000) {
                AccessibilityEvent AvO7iQsrTN = AvO7iQsrTN(mE4lRynR(d01Var.EljAMC1QTz), 131072);
                AvO7iQsrTN.setFromIndex(eVar.xqGvceK5x);
                AvO7iQsrTN.setToIndex(eVar.OOA6hdeuvCS);
                AvO7iQsrTN.setAction(eVar.Yi7zF1RB1);
                AvO7iQsrTN.setMovementGranularity(eVar.X1lG3V04pd);
                AvO7iQsrTN.getText().add(E7jCp8Ls(d01Var));
                Y6hRI1cF8(AvO7iQsrTN);
            }
        }
        this.k8h8IjolWQ = null;
    }

    public final void WdrkLMV3xh(int i, int i2, String str) {
        AccessibilityEvent AvO7iQsrTN = AvO7iQsrTN(mE4lRynR(i), 32);
        AvO7iQsrTN.setContentChangeTypes(i2);
        if (str != null) {
            AvO7iQsrTN.getText().add(str);
        }
        Y6hRI1cF8(AvO7iQsrTN);
    }

    public final Rect X1lG3V04pd(f01 f01Var) {
        y20 y20Var = f01Var.Yi7zF1RB1;
        return ozMwhSAI(y20Var.GWasM1elztuh, y20Var.Yi7zF1RB1, y20Var.X1lG3V04pd, y20Var.xqGvceK5x);
    }

    public final kt0 XnEVoBF0td1l(d01 d01Var, Rect rect, z11 z11Var) {
        g gVar = new g(z11Var);
        g60 g60Var = d01Var.X1lG3V04pd;
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
                            ((b01) he0Var2).Uxq83abb04(gVar);
                            if (gVar.OOA6hdeuvCS) {
                                xkVar = he0Var2;
                                break loop0;
                            }
                        } else if ((he0Var2.AvO7iQsrTN & 8) != 0 && (he0Var2 instanceof yk)) {
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
        xk xkVar2 = (b01) xkVar;
        if (xkVar2 == null || !((he0) xkVar2).OOA6hdeuvCS.Mjvvu5DE) {
            return o50.OOA6hdeuvCS(g60Var.A1EKNP6CxJ.xqGvceK5x, false);
        }
        bk0 YZjbz8VdP5 = vc0.YZjbz8VdP5(xkVar2);
        kt0 eUH21U3apd = o50.iwATDS1i01k(YZjbz8VdP5).eUH21U3apd(YZjbz8VdP5, false);
        Rect ozMwhSAI = ozMwhSAI(eUH21U3apd.GWasM1elztuh, eUH21U3apd.Yi7zF1RB1, eUH21U3apd.X1lG3V04pd, eUH21U3apd.xqGvceK5x);
        float f = ozMwhSAI.left - rect.left;
        float f2 = ozMwhSAI.top - rect.top;
        return new kt0(f, f2, ozMwhSAI.width() + f, ozMwhSAI.height() + f2);
    }

    public final boolean Y6hRI1cF8(AccessibilityEvent accessibilityEvent) {
        if (!uFEq9NpZ()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.mE4lRynR = true;
        }
        try {
            return ((Boolean) this.JFJ3QoxA.mOu10nynGul(accessibilityEvent)).booleanValue();
        } finally {
            this.mE4lRynR = false;
        }
    }

    public final void Yi7zF1RB1(int i, SyyZR548qbcW syyZR548qbcW, String str, Bundle bundle) {
        d01 d01Var;
        int i2;
        float mOu10nynGul;
        float f;
        int i3;
        c cVar;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = syyZR548qbcW.GWasM1elztuh;
        f01 f01Var = (f01) rQPn8YBR().Yi7zF1RB1(i);
        if (f01Var == null || (d01Var = f01Var.GWasM1elztuh) == null) {
            return;
        }
        g60 g60Var = d01Var.X1lG3V04pd;
        zz0 zz0Var = d01Var.xqGvceK5x;
        hg0 hg0Var = zz0Var.OOA6hdeuvCS;
        String E7jCp8Ls = E7jCp8Ls(d01Var);
        if (o30.rQPn8YBR(str, this.eUH21U3apd)) {
            int xqGvceK5x = this.AEn1Rrio.xqGvceK5x(i);
            if (xqGvceK5x != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, xqGvceK5x);
                return;
            }
            return;
        }
        if (o30.rQPn8YBR(str, this.A1EKNP6CxJ)) {
            int xqGvceK5x2 = this.YZjbz8VdP5.xqGvceK5x(i);
            if (xqGvceK5x2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, xqGvceK5x2);
                return;
            }
            return;
        }
        boolean X1lG3V04pd = hg0Var.X1lG3V04pd(yz0.GWasM1elztuh);
        c cVar2 = this.encWxUiV2;
        boolean z = false;
        if (!X1lG3V04pd || bundle == null || !o30.rQPn8YBR(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            k01 k01Var = h01.arNh8D4Z5gB;
            if (hg0Var.X1lG3V04pd(k01Var) && bundle != null && o30.rQPn8YBR(str, "androidx.compose.ui.semantics.testTag")) {
                Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(k01Var);
                String str2 = (String) (AvO7iQsrTN == null ? null : AvO7iQsrTN);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (o30.rQPn8YBR(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, d01Var.EljAMC1QTz);
                return;
            }
            if (o30.rQPn8YBR(str, "androidx.compose.ui.semantics.shapeType")) {
                Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(h01.dqB83aoLBB);
                z11 z11Var = (z11) (AvO7iQsrTN2 == null ? null : AvO7iQsrTN2);
                if (z11Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    kt0 XnEVoBF0td1l = XnEVoBF0td1l(d01Var, rect, z11Var);
                    float f2 = XnEVoBF0td1l.Yi7zF1RB1;
                    float f3 = XnEVoBF0td1l.GWasM1elztuh;
                    z50 GWasM1elztuh = z11Var.GWasM1elztuh(XnEVoBF0td1l.Yi7zF1RB1(), g60Var.k8h8IjolWQ, cVar2.getDensity());
                    if (GWasM1elztuh instanceof an0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", EXrPz3p7hFb(GWasM1elztuh, f3, f2));
                        return;
                    } else if (GWasM1elztuh instanceof bn0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", EXrPz3p7hFb(GWasM1elztuh, f3, f2));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", AEn1Rrio(GWasM1elztuh));
                        return;
                    } else if (!(GWasM1elztuh instanceof zm0)) {
                        o4.xqGvceK5x();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", YZjbz8VdP5(GWasM1elztuh, f3, f2));
                        return;
                    }
                }
                return;
            }
            if (o30.rQPn8YBR(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(h01.dqB83aoLBB);
                z11 z11Var2 = (z11) (AvO7iQsrTN3 == null ? null : AvO7iQsrTN3);
                if (z11Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    kt0 XnEVoBF0td1l2 = XnEVoBF0td1l(d01Var, rect2, z11Var2);
                    Rect EXrPz3p7hFb = EXrPz3p7hFb(z11Var2.GWasM1elztuh(XnEVoBF0td1l2.Yi7zF1RB1(), g60Var.k8h8IjolWQ, cVar2.getDensity()), XnEVoBF0td1l2.GWasM1elztuh, XnEVoBF0td1l2.Yi7zF1RB1);
                    if (EXrPz3p7hFb != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", EXrPz3p7hFb);
                        return;
                    }
                    return;
                }
                return;
            }
            if (o30.rQPn8YBR(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object AvO7iQsrTN4 = hg0Var.AvO7iQsrTN(h01.dqB83aoLBB);
                z11 z11Var3 = (z11) (AvO7iQsrTN4 == null ? null : AvO7iQsrTN4);
                if (z11Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] AEn1Rrio = AEn1Rrio(z11Var3.GWasM1elztuh(XnEVoBF0td1l(d01Var, rect3, z11Var3).Yi7zF1RB1(), g60Var.k8h8IjolWQ, cVar2.getDensity()));
                    if (AEn1Rrio != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", AEn1Rrio);
                        return;
                    }
                    return;
                }
                return;
            }
            if (o30.rQPn8YBR(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object AvO7iQsrTN5 = hg0Var.AvO7iQsrTN(h01.dqB83aoLBB);
                z11 z11Var4 = (z11) (AvO7iQsrTN5 == null ? null : AvO7iQsrTN5);
                if (z11Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    kt0 XnEVoBF0td1l3 = XnEVoBF0td1l(d01Var, rect4, z11Var4);
                    Region YZjbz8VdP5 = YZjbz8VdP5(z11Var4.GWasM1elztuh(XnEVoBF0td1l3.Yi7zF1RB1(), g60Var.k8h8IjolWQ, cVar2.getDensity()), XnEVoBF0td1l3.GWasM1elztuh, XnEVoBF0td1l3.Yi7zF1RB1);
                    if (YZjbz8VdP5 != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", YZjbz8VdP5);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (E7jCp8Ls != null ? E7jCp8Ls.length() : Integer.MAX_VALUE)) {
                m81 WdrkLMV3xh = b70.WdrkLMV3xh(zz0Var);
                if (WdrkLMV3xh == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (i6 < i5) {
                    int i7 = i4 + i6;
                    if (i7 >= WdrkLMV3xh.GWasM1elztuh.GWasM1elztuh.EljAMC1QTz.length()) {
                        arrayList.add(z);
                        i2 = i4;
                        i3 = i5;
                        cVar = cVar2;
                    } else {
                        hf0 hf0Var = WdrkLMV3xh.Yi7zF1RB1;
                        u3 u3Var = (u3) ((v5) hf0Var.X1lG3V04pd).GWasM1elztuh;
                        if (i7 < 0 || i7 >= u3Var.EljAMC1QTz.length()) {
                            StringBuilder rQPn8YBR = mr0.rQPn8YBR("offset(", i7, ") is out of bounds [0, ");
                            rQPn8YBR.append(u3Var.EljAMC1QTz.length());
                            rQPn8YBR.append(')');
                            u10.GWasM1elztuh(rQPn8YBR.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) hf0Var.OOA6hdeuvCS;
                        un0 un0Var = (un0) arrayList2.get(l60.XnEVoBF0td1l(i7, arrayList2));
                        c1 c1Var = un0Var.GWasM1elztuh;
                        int GWasM1elztuh2 = un0Var.GWasM1elztuh(i7);
                        CharSequence charSequence = c1Var.OOA6hdeuvCS;
                        if (GWasM1elztuh2 < 0 || GWasM1elztuh2 >= charSequence.length()) {
                            StringBuilder rQPn8YBR2 = mr0.rQPn8YBR("offset(", GWasM1elztuh2, ") is out of bounds [0,");
                            rQPn8YBR2.append(charSequence.length());
                            rQPn8YBR2.append(')');
                            u10.GWasM1elztuh(rQPn8YBR2.toString());
                        }
                        k81 k81Var = c1Var.xqGvceK5x;
                        int EljAMC1QTz = k81Var.EljAMC1QTz(GWasM1elztuh2);
                        float AvO7iQsrTN6 = k81Var.AvO7iQsrTN(EljAMC1QTz);
                        float xqGvceK5x3 = k81Var.xqGvceK5x(EljAMC1QTz);
                        Layout layout = k81Var.OOA6hdeuvCS;
                        i2 = i4;
                        boolean z2 = layout.getParagraphDirection(EljAMC1QTz) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(GWasM1elztuh2);
                        if (z2 && !isRtlCharAt) {
                            f = k81Var.encWxUiV2(GWasM1elztuh2, false);
                            mOu10nynGul = k81Var.encWxUiV2(GWasM1elztuh2 + 1, true);
                        } else if (z2 && isRtlCharAt) {
                            float mOu10nynGul2 = k81Var.mOu10nynGul(GWasM1elztuh2, false);
                            f = k81Var.mOu10nynGul(GWasM1elztuh2 + 1, true);
                            mOu10nynGul = mOu10nynGul2;
                        } else if (isRtlCharAt) {
                            float encWxUiV2 = k81Var.encWxUiV2(GWasM1elztuh2, false);
                            f = k81Var.encWxUiV2(GWasM1elztuh2 + 1, true);
                            mOu10nynGul = encWxUiV2;
                        } else {
                            float mOu10nynGul3 = k81Var.mOu10nynGul(GWasM1elztuh2, false);
                            mOu10nynGul = k81Var.mOu10nynGul(GWasM1elztuh2 + 1, true);
                            f = mOu10nynGul3;
                        }
                        RectF rectF2 = new RectF(f, AvO7iQsrTN6, mOu10nynGul, xqGvceK5x3);
                        float f4 = rectF2.left;
                        float f5 = rectF2.top;
                        float f6 = rectF2.right;
                        float f7 = rectF2.bottom;
                        i3 = i5;
                        long floatToRawIntBits = (Float.floatToRawIntBits(un0Var.EljAMC1QTz) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        cVar = cVar2;
                        int i8 = (int) (floatToRawIntBits >> 32);
                        int i9 = (int) (floatToRawIntBits & 4294967295L);
                        kt0 kt0Var = new kt0(Float.intBitsToFloat(i8) + f4, Float.intBitsToFloat(i9) + f5, Float.intBitsToFloat(i8) + f6, Float.intBitsToFloat(i9) + f7);
                        bk0 xqGvceK5x4 = d01Var.xqGvceK5x();
                        long j = 0;
                        if (xqGvceK5x4 != null) {
                            if (!xqGvceK5x4.iK7aQfvhG().Mjvvu5DE) {
                                xqGvceK5x4 = null;
                            }
                            if (xqGvceK5x4 != null) {
                                j = xqGvceK5x4.pjimB8cb(0L);
                            }
                        }
                        kt0 OOA6hdeuvCS = kt0Var.OOA6hdeuvCS(j);
                        kt0 AvO7iQsrTN7 = d01Var.AvO7iQsrTN();
                        if ((((((OOA6hdeuvCS.GWasM1elztuh > AvO7iQsrTN7.X1lG3V04pd ? 1 : (OOA6hdeuvCS.GWasM1elztuh == AvO7iQsrTN7.X1lG3V04pd ? 0 : -1)) < 0) & ((AvO7iQsrTN7.GWasM1elztuh > OOA6hdeuvCS.X1lG3V04pd ? 1 : (AvO7iQsrTN7.GWasM1elztuh == OOA6hdeuvCS.X1lG3V04pd ? 0 : -1)) < 0)) & ((OOA6hdeuvCS.Yi7zF1RB1 > AvO7iQsrTN7.xqGvceK5x ? 1 : (OOA6hdeuvCS.Yi7zF1RB1 == AvO7iQsrTN7.xqGvceK5x ? 0 : -1)) < 0)) & ((AvO7iQsrTN7.Yi7zF1RB1 > OOA6hdeuvCS.xqGvceK5x ? 1 : (AvO7iQsrTN7.Yi7zF1RB1 == OOA6hdeuvCS.xqGvceK5x ? 0 : -1)) < 0) ? OOA6hdeuvCS.X1lG3V04pd(AvO7iQsrTN7) : null) != null) {
                            long jivtDDk9H = cVar.jivtDDk9H((Float.floatToRawIntBits(r0.GWasM1elztuh) << 32) | (Float.floatToRawIntBits(r0.Yi7zF1RB1) & 4294967295L));
                            long jivtDDk9H2 = cVar.jivtDDk9H((Float.floatToRawIntBits(r0.xqGvceK5x) & 4294967295L) | (Float.floatToRawIntBits(r0.X1lG3V04pd) << 32));
                            int i10 = (int) (jivtDDk9H >> 32);
                            int i11 = (int) (jivtDDk9H2 >> 32);
                            int i12 = (int) (jivtDDk9H & 4294967295L);
                            int i13 = (int) (jivtDDk9H2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    cVar2 = cVar;
                    z = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void arNh8D4Z5gB(defpackage.s20 r57) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.arNh8D4Z5gB(s20):void");
    }

    public final boolean cilMamHF(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !uFEq9NpZ()) {
            return false;
        }
        AccessibilityEvent AvO7iQsrTN = AvO7iQsrTN(i, i2);
        if (num != null) {
            AvO7iQsrTN.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            AvO7iQsrTN.setContentDescription(xa0.GWasM1elztuh(list, ",", null, 62));
        }
        return Y6hRI1cF8(AvO7iQsrTN);
    }

    public final AccessibilityEvent encWxUiV2(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent AvO7iQsrTN = AvO7iQsrTN(i, 8192);
        if (num != null) {
            AvO7iQsrTN.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            AvO7iQsrTN.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            AvO7iQsrTN.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            AvO7iQsrTN.getText().add(charSequence);
        }
        return AvO7iQsrTN;
    }

    public final void iwATDS1i01k(g60 g60Var) {
        if (this.arNh8D4Z5gB.add(g60Var)) {
            this.pog2g9KITJA.mE4lRynR(kc1.GWasM1elztuh);
        }
    }

    public final void jivtDDk9H(d01 d01Var, e01 e01Var) {
        int[] iArr = a30.GWasM1elztuh;
        sf0 sf0Var = new sf0();
        List JFJ3QoxA = d01.JFJ3QoxA(4, d01Var);
        g60 g60Var = d01Var.X1lG3V04pd;
        int size = JFJ3QoxA.size();
        for (int i = 0; i < size; i++) {
            d01 d01Var2 = (d01) JFJ3QoxA.get(i);
            s20 rQPn8YBR = rQPn8YBR();
            int i2 = d01Var2.EljAMC1QTz;
            if (rQPn8YBR.GWasM1elztuh(i2)) {
                if (!e01Var.Yi7zF1RB1.Yi7zF1RB1(i2)) {
                    iwATDS1i01k(g60Var);
                    return;
                }
                sf0Var.GWasM1elztuh(i2);
            }
        }
        sf0 sf0Var2 = e01Var.Yi7zF1RB1;
        int[] iArr2 = sf0Var2.Yi7zF1RB1;
        long[] jArr = sf0Var2.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !sf0Var.Yi7zF1RB1(iArr2[(i3 << 3) + i5])) {
                            iwATDS1i01k(g60Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List JFJ3QoxA2 = d01.JFJ3QoxA(4, d01Var);
        int size2 = JFJ3QoxA2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            d01 d01Var3 = (d01) JFJ3QoxA2.get(i6);
            e01 e01Var2 = (e01) this.DmJncFq5.Yi7zF1RB1(d01Var3.EljAMC1QTz);
            if (e01Var2 != null && rQPn8YBR().GWasM1elztuh(d01Var3.EljAMC1QTz)) {
                jivtDDk9H(d01Var3, e01Var2);
            }
        }
    }

    public final boolean k8h8IjolWQ(d01 d01Var, int i, int i2, boolean z) {
        String E7jCp8Ls;
        zz0 zz0Var = d01Var.xqGvceK5x;
        int i3 = d01Var.EljAMC1QTz;
        k01 k01Var = yz0.JFJ3QoxA;
        if (zz0Var.OOA6hdeuvCS.X1lG3V04pd(k01Var) && n30.encWxUiV2(d01Var)) {
            mv mvVar = (mv) ((VeqTn1PQw7) d01Var.xqGvceK5x.X1lG3V04pd(k01Var)).Yi7zF1RB1;
            if (mvVar != null) {
                return ((Boolean) mvVar.X1lG3V04pd(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.WdrkLMV3xh) && (E7jCp8Ls = E7jCp8Ls(d01Var)) != null) {
            if (i < 0 || i != i2 || i2 > E7jCp8Ls.length()) {
                i = -1;
            }
            this.WdrkLMV3xh = i;
            boolean z2 = E7jCp8Ls.length() > 0;
            Y6hRI1cF8(encWxUiV2(mE4lRynR(i3), z2 ? Integer.valueOf(this.WdrkLMV3xh) : null, z2 ? Integer.valueOf(this.WdrkLMV3xh) : null, z2 ? Integer.valueOf(E7jCp8Ls.length()) : null, E7jCp8Ls));
            WRKkgoJXwDn(i3);
            return true;
        }
        return false;
    }

    public final int mE4lRynR(int i) {
        if (i == this.encWxUiV2.getSemanticsOwner().GWasM1elztuh().EljAMC1QTz) {
            return -1;
        }
        return i;
    }

    public final int mOu10nynGul(d01 d01Var) {
        zz0 zz0Var = d01Var.xqGvceK5x;
        if (!zz0Var.OOA6hdeuvCS.X1lG3V04pd(h01.GWasM1elztuh)) {
            k01 k01Var = h01.YZjbz8VdP5;
            if (zz0Var.OOA6hdeuvCS.X1lG3V04pd(k01Var)) {
                return (int) (((r81) zz0Var.X1lG3V04pd(k01Var)).GWasM1elztuh & 4294967295L);
            }
        }
        return this.WdrkLMV3xh;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.XnEVoBF0td1l = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.XnEVoBF0td1l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.rQPn8YBR;
        if (accessibilityManager.isEnabled()) {
            this.XnEVoBF0td1l = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.encWxUiV2.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.dqB83aoLBB);
        AccessibilityManager accessibilityManager = this.rQPn8YBR;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final Rect ozMwhSAI(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        c cVar = this.encWxUiV2;
        long jivtDDk9H = cVar.jivtDDk9H((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long jivtDDk9H2 = cVar.jivtDDk9H((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jivtDDk9H >> 32);
        int i2 = (int) (jivtDDk9H2 >> 32);
        int i3 = (int) (jivtDDk9H & 4294967295L);
        int i4 = (int) (jivtDDk9H2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    public final void pog2g9KITJA(g60 g60Var, sf0 sf0Var) {
        zz0 WdrkLMV3xh;
        if (g60Var.eUH21U3apd() && !this.encWxUiV2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(g60Var)) {
            g60 g60Var2 = null;
            if (!g60Var.A1EKNP6CxJ.xqGvceK5x(8)) {
                g60Var = g60Var.cilMamHF();
                while (true) {
                    if (g60Var == null) {
                        g60Var = null;
                        break;
                    } else if (g60Var.A1EKNP6CxJ.xqGvceK5x(8)) {
                        break;
                    } else {
                        g60Var = g60Var.cilMamHF();
                    }
                }
            }
            if (g60Var == null || (WdrkLMV3xh = g60Var.WdrkLMV3xh()) == null) {
                return;
            }
            if (!WdrkLMV3xh.AvO7iQsrTN) {
                g60 cilMamHF = g60Var.cilMamHF();
                while (true) {
                    if (cilMamHF != null) {
                        zz0 WdrkLMV3xh2 = cilMamHF.WdrkLMV3xh();
                        if (WdrkLMV3xh2 != null && WdrkLMV3xh2.AvO7iQsrTN) {
                            g60Var2 = cilMamHF;
                            break;
                        }
                        cilMamHF = cilMamHF.cilMamHF();
                    } else {
                        break;
                    }
                }
                if (g60Var2 != null) {
                    g60Var = g60Var2;
                }
            }
            int i = g60Var.EljAMC1QTz;
            if (sf0Var.GWasM1elztuh(i)) {
                lv06NcmrQ(this, mE4lRynR(i), 2048, 1, 8);
            }
        }
    }

    public final s20 rQPn8YBR() {
        if (this.M3K9sHhK) {
            this.M3K9sHhK = false;
            c cVar = this.encWxUiV2;
            this.EXrPz3p7hFb = o30.WdrkLMV3xh(cVar.getSemanticsOwner(), XdwzlWIkSDqF.encWxUiV2);
            if (uFEq9NpZ()) {
                rf0 rf0Var = this.EXrPz3p7hFb;
                Resources resources = cVar.getContext().getResources();
                pf0 pf0Var = this.AEn1Rrio;
                pf0Var.GWasM1elztuh();
                pf0 pf0Var2 = this.YZjbz8VdP5;
                pf0Var2.GWasM1elztuh();
                f01 f01Var = (f01) rf0Var.Yi7zF1RB1(-1);
                d01 d01Var = f01Var != null ? f01Var.GWasM1elztuh : null;
                d01Var.getClass();
                ArrayList Yi7zF1RB1 = n01.Yi7zF1RB1(d01Var, new NWXxPwoOUSX9(3, rf0Var), new NWXxPwoOUSX9(4, resources), fb1.HFYAaqMd6(d01Var));
                int i = 1;
                int size = Yi7zF1RB1.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((d01) Yi7zF1RB1.get(i - 1)).EljAMC1QTz;
                        int i3 = ((d01) Yi7zF1RB1.get(i)).EljAMC1QTz;
                        pf0Var.EljAMC1QTz(i2, i3);
                        pf0Var2.EljAMC1QTz(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.EXrPz3p7hFb;
    }

    public final boolean uFEq9NpZ() {
        AccessibilityManager accessibilityManager = this.rQPn8YBR;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.XnEVoBF0td1l;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.XnEVoBF0td1l = list;
        }
        return !list.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        if (defpackage.o30.mE4lRynR(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:54:0x0046, B:56:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:14:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xqGvceK5x(wg wgVar) {
        f fVar;
        int i;
        c5 c5Var;
        c5 c5Var2;
        sf0 sf0Var;
        m8 m8Var;
        sf0 sf0Var2;
        m8 m8Var2;
        int i2;
        long j;
        Object Yi7zF1RB1;
        try {
            if (wgVar instanceof f) {
                fVar = (f) wgVar;
                int i3 = fVar.E7jCp8Ls;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.E7jCp8Ls = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.JFJ3QoxA;
                    i = fVar.E7jCp8Ls;
                    c5Var = this.arNh8D4Z5gB;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        sf0Var = new sf0();
                        n8 n8Var = this.pog2g9KITJA;
                        n8Var.getClass();
                        m8Var = new m8(n8Var);
                        fVar.encWxUiV2 = sf0Var;
                        fVar.mOu10nynGul = m8Var;
                        fVar.E7jCp8Ls = 1;
                        Yi7zF1RB1 = m8Var.Yi7zF1RB1(fVar);
                        if (Yi7zF1RB1 != qhVar) {
                        }
                    } else if (i == 1) {
                        m8Var2 = fVar.mOu10nynGul;
                        sf0Var2 = fVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m8Var2 = fVar.mOu10nynGul;
                        sf0Var2 = fVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        char c = 2;
                        c5Var2 = c5Var;
                        sf0Var = sf0Var2;
                        c5Var = c5Var2;
                        m8Var = m8Var2;
                        fVar.encWxUiV2 = sf0Var;
                        fVar.mOu10nynGul = m8Var;
                        fVar.E7jCp8Ls = 1;
                        Yi7zF1RB1 = m8Var.Yi7zF1RB1(fVar);
                        if (Yi7zF1RB1 != qhVar) {
                            return qhVar;
                        }
                        m8 m8Var3 = m8Var;
                        sf0Var2 = sf0Var;
                        obj = Yi7zF1RB1;
                        m8Var2 = m8Var3;
                        if (((Boolean) obj).booleanValue()) {
                            c5Var.clear();
                            return kc1.GWasM1elztuh;
                        }
                        m8Var2.X1lG3V04pd();
                        if (uFEq9NpZ()) {
                            int i4 = c5Var.AvO7iQsrTN;
                            for (int i5 = 0; i5 < i4; i5++) {
                                g60 g60Var = (g60) c5Var.EljAMC1QTz[i5];
                                pog2g9KITJA(g60Var, sf0Var2);
                                M3K9sHhK(g60Var);
                            }
                            sf0Var2.xqGvceK5x = 0;
                            long[] jArr = sf0Var2.GWasM1elztuh;
                            if (jArr != kx0.GWasM1elztuh) {
                                try {
                                    d5.ES6ysExf(jArr, -9187201950435737472L);
                                    long[] jArr2 = sf0Var2.GWasM1elztuh;
                                    i2 = sf0Var2.X1lG3V04pd;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    c5Var2.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                c5Var2 = c5Var;
                            } else {
                                c5Var2 = c5Var;
                            }
                            sf0Var2.OOA6hdeuvCS = kx0.GWasM1elztuh(sf0Var2.X1lG3V04pd) - sf0Var2.xqGvceK5x;
                            Handler handler = this.encWxUiV2.getHandler();
                            if (!this.rezfBrjOrqK && handler != null) {
                                this.rezfBrjOrqK = true;
                                handler.post(this.dqB83aoLBB);
                            }
                        } else {
                            c5Var2 = c5Var;
                        }
                        c5Var2.clear();
                        this.jivtDDk9H.X1lG3V04pd();
                        this.Y6hRI1cF8.X1lG3V04pd();
                        long j2 = this.E7jCp8Ls;
                        fVar.encWxUiV2 = sf0Var2;
                        fVar.mOu10nynGul = m8Var2;
                        c = 2;
                        fVar.E7jCp8Ls = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            c5Var2 = c5Var;
        }
        fVar = new f(this, wgVar);
        Object obj2 = fVar.JFJ3QoxA;
        i = fVar.E7jCp8Ls;
        c5Var = this.arNh8D4Z5gB;
        qh qhVar2 = qh.OOA6hdeuvCS;
    }
}
