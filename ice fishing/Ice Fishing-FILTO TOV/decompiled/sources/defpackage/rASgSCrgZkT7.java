package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class rASgSCrgZkT7 extends AccessibilityNodeProvider {
    public final d GWasM1elztuh;

    public rASgSCrgZkT7(d dVar) {
        this.GWasM1elztuh = dVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        SyyZR548qbcW E7jCp8Ls = this.GWasM1elztuh.E7jCp8Ls(i);
        if (E7jCp8Ls == null) {
            return null;
        }
        return E7jCp8Ls.GWasM1elztuh;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.GWasM1elztuh.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        SyyZR548qbcW E7jCp8Ls;
        d dVar = this.GWasM1elztuh;
        i iVar = (i) dVar.AvO7iQsrTN;
        if (i == 1) {
            int i2 = iVar.WIEu4Ya2g8;
            if (i2 != Integer.MIN_VALUE) {
                E7jCp8Ls = dVar.E7jCp8Ls(i2);
            }
            E7jCp8Ls = null;
        } else if (i == 2) {
            E7jCp8Ls = dVar.E7jCp8Ls(iVar.iwATDS1i01k);
        } else {
            o4.mE4lRynR(mr0.AvO7iQsrTN("Unknown focus type: ", i));
            E7jCp8Ls = null;
        }
        if (E7jCp8Ls == null) {
            return null;
        }
        return E7jCp8Ls.GWasM1elztuh;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.qugwajBSa59j.OOA6hdeuvCS(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01bc, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x073e, code lost:
    
        if (r0 != 16) goto L496;
     */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        boolean z;
        d01 d01Var;
        boolean z2;
        int i3;
        J3Xc8BaqpN8 j3Xc8BaqpN8;
        int i4;
        int i5;
        m81 WdrkLMV3xh;
        wu wuVar;
        wu wuVar2;
        wu wuVar3;
        wu wuVar4;
        wu wuVar5;
        wu wuVar6;
        wu wuVar7;
        wu wuVar8;
        wu wuVar9;
        hv hvVar;
        VeqTn1PQw7 veqTn1PQw7;
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        hv hvVar2;
        wu wuVar10;
        long j2;
        VeqTn1PQw7 veqTn1PQw72;
        wu wuVar11;
        float intBitsToFloat;
        VeqTn1PQw7 veqTn1PQw73;
        wu wuVar12;
        hv hvVar3;
        wu wuVar13;
        wu wuVar14;
        wu wuVar15;
        wu wuVar16;
        i iVar = (i) this.GWasM1elztuh.AvO7iQsrTN;
        AccessibilityManager accessibilityManager = iVar.rQPn8YBR;
        Float valueOf = Float.valueOf(0.0f);
        c cVar = iVar.encWxUiV2;
        f01 f01Var = (f01) iVar.rQPn8YBR().Yi7zF1RB1(i);
        if (f01Var != null && (d01Var = f01Var.GWasM1elztuh) != null) {
            g60 g60Var = d01Var.X1lG3V04pd;
            int i6 = d01Var.EljAMC1QTz;
            zz0 zz0Var = d01Var.xqGvceK5x;
            hg0 hg0Var = zz0Var.OOA6hdeuvCS;
            Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(h01.iwATDS1i01k);
            if (AvO7iQsrTN == null) {
                AvO7iQsrTN = null;
            }
            Boolean bool = Boolean.TRUE;
            int i7 = 1;
            if (o30.rQPn8YBR(AvO7iQsrTN, bool)) {
            }
            if (i2 == 64) {
                z2 = true;
                z = false;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = iVar.iwATDS1i01k) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        i.lv06NcmrQ(iVar, i3, 65536, null, 12);
                    }
                    iVar.iwATDS1i01k = i;
                    cVar.invalidate();
                    i.lv06NcmrQ(iVar, i, 32768, null, 12);
                    return z2;
                }
                return z;
            }
            if (i2 == 128) {
                z2 = true;
                z = false;
                if (iVar.iwATDS1i01k == i) {
                    iVar.iwATDS1i01k = Integer.MIN_VALUE;
                    iVar.YmKjaVtbfp5Z = null;
                    cVar.invalidate();
                    i.lv06NcmrQ(iVar, i, 65536, null, 12);
                }
                return z;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z4 = i2 == 256;
                    Integer num = iVar.WRKkgoJXwDn;
                    if (num == null || i6 != num.intValue()) {
                        iVar.WdrkLMV3xh = -1;
                        iVar.WRKkgoJXwDn = Integer.valueOf(i6);
                    }
                    String E7jCp8Ls = i.E7jCp8Ls(d01Var);
                    if (E7jCp8Ls != null && E7jCp8Ls.length() != 0) {
                        String E7jCp8Ls2 = i.E7jCp8Ls(d01Var);
                        if (E7jCp8Ls2 != null && E7jCp8Ls2.length() != 0) {
                            if (i8 == 1) {
                                Locale locale = cVar.getContext().getResources().getConfiguration().locale;
                                if (MItybXapHX.OOA6hdeuvCS == null) {
                                    MItybXapHX mItybXapHX = new MItybXapHX(0);
                                    mItybXapHX.xqGvceK5x = BreakIterator.getCharacterInstance(locale);
                                    MItybXapHX.OOA6hdeuvCS = mItybXapHX;
                                }
                                MItybXapHX mItybXapHX2 = MItybXapHX.OOA6hdeuvCS;
                                mItybXapHX2.getClass();
                                mItybXapHX2.EljAMC1QTz(E7jCp8Ls2);
                                j3Xc8BaqpN8 = mItybXapHX2;
                            } else if (i8 != 2) {
                                if (i8 != 4) {
                                    if (i8 == 8) {
                                        if (Uxq83abb04.X1lG3V04pd == null) {
                                            Uxq83abb04.X1lG3V04pd = new Uxq83abb04();
                                        }
                                        Uxq83abb04 uxq83abb04 = Uxq83abb04.X1lG3V04pd;
                                        uxq83abb04.getClass();
                                        uxq83abb04.GWasM1elztuh = E7jCp8Ls2;
                                        j3Xc8BaqpN8 = uxq83abb04;
                                    }
                                }
                                if (hg0Var.X1lG3V04pd(yz0.GWasM1elztuh) && (WdrkLMV3xh = b70.WdrkLMV3xh(zz0Var)) != null) {
                                    if (i8 == 4) {
                                        if (MItybXapHX.AvO7iQsrTN == null) {
                                            MItybXapHX.AvO7iQsrTN = new MItybXapHX(2);
                                        }
                                        MItybXapHX mItybXapHX3 = MItybXapHX.AvO7iQsrTN;
                                        mItybXapHX3.getClass();
                                        mItybXapHX3.GWasM1elztuh = E7jCp8Ls2;
                                        mItybXapHX3.xqGvceK5x = WdrkLMV3xh;
                                        j3Xc8BaqpN8 = mItybXapHX3;
                                    } else {
                                        if (MjxSquD6Av.OOA6hdeuvCS == null) {
                                            MjxSquD6Av mjxSquD6Av = new MjxSquD6Av();
                                            new Rect();
                                            MjxSquD6Av.OOA6hdeuvCS = mjxSquD6Av;
                                        }
                                        MjxSquD6Av mjxSquD6Av2 = MjxSquD6Av.OOA6hdeuvCS;
                                        mjxSquD6Av2.getClass();
                                        mjxSquD6Av2.GWasM1elztuh = E7jCp8Ls2;
                                        mjxSquD6Av2.X1lG3V04pd = WdrkLMV3xh;
                                        mjxSquD6Av2.xqGvceK5x = d01Var;
                                        j3Xc8BaqpN8 = mjxSquD6Av2;
                                    }
                                }
                            } else {
                                Locale locale2 = cVar.getContext().getResources().getConfiguration().locale;
                                if (MItybXapHX.EljAMC1QTz == null) {
                                    MItybXapHX mItybXapHX4 = new MItybXapHX(i7);
                                    mItybXapHX4.xqGvceK5x = BreakIterator.getWordInstance(locale2);
                                    MItybXapHX.EljAMC1QTz = mItybXapHX4;
                                }
                                MItybXapHX mItybXapHX5 = MItybXapHX.EljAMC1QTz;
                                mItybXapHX5.getClass();
                                mItybXapHX5.EljAMC1QTz(E7jCp8Ls2);
                                j3Xc8BaqpN8 = mItybXapHX5;
                            }
                            if (j3Xc8BaqpN8 != null) {
                                int mOu10nynGul = iVar.mOu10nynGul(d01Var);
                                if (mOu10nynGul == -1) {
                                    mOu10nynGul = z4 ? 0 : E7jCp8Ls.length();
                                }
                                int[] GWasM1elztuh = z4 ? j3Xc8BaqpN8.GWasM1elztuh(mOu10nynGul) : j3Xc8BaqpN8.xqGvceK5x(mOu10nynGul);
                                if (GWasM1elztuh != null) {
                                    int i9 = GWasM1elztuh[0];
                                    int i10 = GWasM1elztuh[1];
                                    if (z3 && !hg0Var.X1lG3V04pd(h01.GWasM1elztuh) && hg0Var.X1lG3V04pd(h01.AEn1Rrio)) {
                                        i4 = iVar.JFJ3QoxA(d01Var);
                                        if (i4 == -1) {
                                            i4 = z4 ? i9 : i10;
                                        }
                                        i5 = z4 ? i10 : i9;
                                    } else {
                                        i4 = z4 ? i10 : i9;
                                        i5 = i4;
                                    }
                                    int i11 = z4 ? 256 : 512;
                                    z2 = true;
                                    iVar.k8h8IjolWQ = new e(d01Var, i11, i8, i9, i10, SystemClock.uptimeMillis());
                                    iVar.k8h8IjolWQ(d01Var, i4, i5, true);
                                }
                            }
                        }
                        j3Xc8BaqpN8 = null;
                        if (j3Xc8BaqpN8 != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(yz0.WIEu4Ya2g8);
                VeqTn1PQw7 veqTn1PQw74 = (VeqTn1PQw7) (AvO7iQsrTN2 == null ? null : AvO7iQsrTN2);
                if (veqTn1PQw74 != null && (wuVar = (wu) veqTn1PQw74.Yi7zF1RB1) != null) {
                    return ((Boolean) wuVar.GWasM1elztuh()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean k8h8IjolWQ = iVar.k8h8IjolWQ(d01Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (k8h8IjolWQ) {
                        i.lv06NcmrQ(iVar, iVar.mE4lRynR(i6), 0, null, 12);
                    }
                    return k8h8IjolWQ;
                }
                if (n30.encWxUiV2(d01Var)) {
                    if (i2 == 1) {
                        if (cVar.isInTouchMode()) {
                            cVar.requestFocusFromTouch();
                        }
                        Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(yz0.cilMamHF);
                        VeqTn1PQw7 veqTn1PQw75 = (VeqTn1PQw7) (AvO7iQsrTN3 == null ? null : AvO7iQsrTN3);
                        if (veqTn1PQw75 != null && (wuVar2 = (wu) veqTn1PQw75.Yi7zF1RB1) != null) {
                            return ((Boolean) wuVar2.GWasM1elztuh()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        p50 p50Var = p50.EljAMC1QTz;
                        switch (i2) {
                            case 16:
                                Object AvO7iQsrTN4 = hg0Var.AvO7iQsrTN(yz0.Yi7zF1RB1);
                                if (AvO7iQsrTN4 == null) {
                                    AvO7iQsrTN4 = null;
                                }
                                VeqTn1PQw7 veqTn1PQw76 = (VeqTn1PQw7) AvO7iQsrTN4;
                                Boolean bool2 = (veqTn1PQw76 == null || (wuVar3 = (wu) veqTn1PQw76.Yi7zF1RB1) == null) ? null : (Boolean) wuVar3.GWasM1elztuh();
                                i.lv06NcmrQ(iVar, i, 1, null, 12);
                                if (bool2 != null) {
                                    return bool2.booleanValue();
                                }
                                break;
                            case 32:
                                Object AvO7iQsrTN5 = hg0Var.AvO7iQsrTN(yz0.X1lG3V04pd);
                                VeqTn1PQw7 veqTn1PQw77 = (VeqTn1PQw7) (AvO7iQsrTN5 == null ? null : AvO7iQsrTN5);
                                if (veqTn1PQw77 != null && (wuVar4 = (wu) veqTn1PQw77.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar4.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z5 = i2 == 4096;
                                boolean z6 = i2 == 8192;
                                boolean z7 = i2 == 16908345;
                                boolean z8 = i2 == 16908347;
                                boolean z9 = i2 == 16908344;
                                boolean z10 = i2 == 16908346;
                                boolean z11 = z7 || z8 || z5 || z6;
                                if (!z9 && !z10 && !z5 && !z6) {
                                    i7 = 0;
                                }
                                if (z5 || z6) {
                                    Object AvO7iQsrTN6 = hg0Var.AvO7iQsrTN(h01.X1lG3V04pd);
                                    if (AvO7iQsrTN6 == null) {
                                        AvO7iQsrTN6 = null;
                                    }
                                    ks0 ks0Var = (ks0) AvO7iQsrTN6;
                                    Object AvO7iQsrTN7 = hg0Var.AvO7iQsrTN(yz0.mOu10nynGul);
                                    if (AvO7iQsrTN7 == null) {
                                        AvO7iQsrTN7 = null;
                                    }
                                    VeqTn1PQw7 veqTn1PQw78 = (VeqTn1PQw7) AvO7iQsrTN7;
                                    if (ks0Var != null && veqTn1PQw78 != null) {
                                        float f5 = z6 ? -0.0f : 0.0f;
                                        hv hvVar4 = (hv) veqTn1PQw78.Yi7zF1RB1;
                                        if (hvVar4 != null) {
                                            return ((Boolean) hvVar4.mOu10nynGul(Float.valueOf(0.0f + f5))).booleanValue();
                                        }
                                    }
                                }
                                long Yi7zF1RB1 = o50.xqGvceK5x(g60Var.A1EKNP6CxJ.X1lG3V04pd).Yi7zF1RB1();
                                ArrayList arrayList = new ArrayList();
                                Object AvO7iQsrTN8 = hg0Var.AvO7iQsrTN(yz0.M3K9sHhK);
                                if (AvO7iQsrTN8 == null) {
                                    AvO7iQsrTN8 = null;
                                }
                                VeqTn1PQw7 veqTn1PQw79 = (VeqTn1PQw7) AvO7iQsrTN8;
                                Float f6 = (veqTn1PQw79 == null || (hvVar3 = (hv) veqTn1PQw79.Yi7zF1RB1) == null || !((Boolean) hvVar3.mOu10nynGul(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object AvO7iQsrTN9 = hg0Var.AvO7iQsrTN(yz0.xqGvceK5x);
                                if (AvO7iQsrTN9 == null) {
                                    AvO7iQsrTN9 = null;
                                }
                                VeqTn1PQw7 veqTn1PQw710 = (VeqTn1PQw7) AvO7iQsrTN9;
                                if (veqTn1PQw710 != null) {
                                    tv tvVar = veqTn1PQw710.Yi7zF1RB1;
                                    Object AvO7iQsrTN10 = hg0Var.AvO7iQsrTN(h01.cilMamHF);
                                    if (AvO7iQsrTN10 == null) {
                                        AvO7iQsrTN10 = null;
                                    }
                                    sx0 sx0Var = (sx0) AvO7iQsrTN10;
                                    if (sx0Var == null || !z11) {
                                        j2 = Yi7zF1RB1;
                                    } else {
                                        if (f6 != null) {
                                            intBitsToFloat = f6.floatValue();
                                            j2 = Yi7zF1RB1;
                                        } else {
                                            j2 = Yi7zF1RB1;
                                            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                                        }
                                        if (z7 || z6) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (g60Var.k8h8IjolWQ == p50Var && (z7 || z8)) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (i.WIEu4Ya2g8(sx0Var, intBitsToFloat)) {
                                            k01 k01Var = yz0.WRKkgoJXwDn;
                                            if (hg0Var.X1lG3V04pd(k01Var) || hg0Var.X1lG3V04pd(yz0.pog2g9KITJA)) {
                                                if (intBitsToFloat > 0.0f) {
                                                    Object AvO7iQsrTN11 = hg0Var.AvO7iQsrTN(yz0.pog2g9KITJA);
                                                    veqTn1PQw73 = (VeqTn1PQw7) (AvO7iQsrTN11 == null ? null : AvO7iQsrTN11);
                                                } else {
                                                    Object AvO7iQsrTN12 = hg0Var.AvO7iQsrTN(k01Var);
                                                    veqTn1PQw73 = (VeqTn1PQw7) (AvO7iQsrTN12 == null ? null : AvO7iQsrTN12);
                                                }
                                                if (veqTn1PQw73 != null && (wuVar12 = (wu) veqTn1PQw73.Yi7zF1RB1) != null) {
                                                    return ((Boolean) wuVar12.GWasM1elztuh()).booleanValue();
                                                }
                                            } else {
                                                lv lvVar = (lv) tvVar;
                                                if (lvVar != null) {
                                                    return ((Boolean) lvVar.EljAMC1QTz(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object AvO7iQsrTN13 = hg0Var.AvO7iQsrTN(h01.lv06NcmrQ);
                                    if (AvO7iQsrTN13 == null) {
                                        AvO7iQsrTN13 = null;
                                    }
                                    sx0 sx0Var2 = (sx0) AvO7iQsrTN13;
                                    if (sx0Var2 != null && i7 != 0) {
                                        float floatValue = f6 != null ? f6.floatValue() : Float.intBitsToFloat((int) (j2 & 4294967295L));
                                        if (z9 || z6) {
                                            floatValue = -floatValue;
                                        }
                                        if (i.WIEu4Ya2g8(sx0Var2, floatValue)) {
                                            k01 k01Var2 = yz0.WdrkLMV3xh;
                                            if (hg0Var.X1lG3V04pd(k01Var2) || hg0Var.X1lG3V04pd(yz0.arNh8D4Z5gB)) {
                                                if (floatValue > 0.0f) {
                                                    Object AvO7iQsrTN14 = hg0Var.AvO7iQsrTN(yz0.arNh8D4Z5gB);
                                                    veqTn1PQw72 = (VeqTn1PQw7) (AvO7iQsrTN14 == null ? null : AvO7iQsrTN14);
                                                } else {
                                                    Object AvO7iQsrTN15 = hg0Var.AvO7iQsrTN(k01Var2);
                                                    veqTn1PQw72 = (VeqTn1PQw7) (AvO7iQsrTN15 == null ? null : AvO7iQsrTN15);
                                                }
                                                if (veqTn1PQw72 != null && (wuVar11 = (wu) veqTn1PQw72.Yi7zF1RB1) != null) {
                                                    return ((Boolean) wuVar11.GWasM1elztuh()).booleanValue();
                                                }
                                            } else {
                                                lv lvVar2 = (lv) tvVar;
                                                if (lvVar2 != null) {
                                                    return ((Boolean) lvVar2.EljAMC1QTz(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object AvO7iQsrTN16 = hg0Var.AvO7iQsrTN(yz0.Mjvvu5DE);
                                VeqTn1PQw7 veqTn1PQw711 = (VeqTn1PQw7) (AvO7iQsrTN16 == null ? null : AvO7iQsrTN16);
                                if (veqTn1PQw711 != null && (wuVar5 = (wu) veqTn1PQw711.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar5.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object AvO7iQsrTN17 = hg0Var.AvO7iQsrTN(yz0.YmKjaVtbfp5Z);
                                VeqTn1PQw7 veqTn1PQw712 = (VeqTn1PQw7) (AvO7iQsrTN17 == null ? null : AvO7iQsrTN17);
                                if (veqTn1PQw712 != null && (wuVar6 = (wu) veqTn1PQw712.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar6.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object AvO7iQsrTN18 = hg0Var.AvO7iQsrTN(yz0.mE4lRynR);
                                VeqTn1PQw7 veqTn1PQw713 = (VeqTn1PQw7) (AvO7iQsrTN18 == null ? null : AvO7iQsrTN18);
                                if (veqTn1PQw713 != null && (wuVar7 = (wu) veqTn1PQw713.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar7.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object AvO7iQsrTN19 = hg0Var.AvO7iQsrTN(yz0.jivtDDk9H);
                                VeqTn1PQw7 veqTn1PQw714 = (VeqTn1PQw7) (AvO7iQsrTN19 == null ? null : AvO7iQsrTN19);
                                if (veqTn1PQw714 != null && (wuVar8 = (wu) veqTn1PQw714.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar8.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object AvO7iQsrTN20 = hg0Var.AvO7iQsrTN(yz0.Y6hRI1cF8);
                                VeqTn1PQw7 veqTn1PQw715 = (VeqTn1PQw7) (AvO7iQsrTN20 == null ? null : AvO7iQsrTN20);
                                if (veqTn1PQw715 != null && (wuVar9 = (wu) veqTn1PQw715.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar9.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object AvO7iQsrTN21 = hg0Var.AvO7iQsrTN(yz0.rQPn8YBR);
                                VeqTn1PQw7 veqTn1PQw716 = (VeqTn1PQw7) (AvO7iQsrTN21 == null ? null : AvO7iQsrTN21);
                                if (veqTn1PQw716 != null && (hvVar = (hv) veqTn1PQw716.Yi7zF1RB1) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) hvVar.mOu10nynGul(new u3(string))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                d01 E7jCp8Ls3 = d01Var.E7jCp8Ls();
                                if (E7jCp8Ls3 != null) {
                                    Object AvO7iQsrTN22 = E7jCp8Ls3.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.xqGvceK5x);
                                    if (AvO7iQsrTN22 == null) {
                                        AvO7iQsrTN22 = null;
                                    }
                                    veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN22;
                                    while (veqTn1PQw7 == null && E7jCp8Ls3 != null) {
                                        E7jCp8Ls3 = E7jCp8Ls3.E7jCp8Ls();
                                        if (E7jCp8Ls3 != null) {
                                            Object AvO7iQsrTN23 = E7jCp8Ls3.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.xqGvceK5x);
                                            if (AvO7iQsrTN23 == null) {
                                                AvO7iQsrTN23 = null;
                                            }
                                            veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN23;
                                        }
                                    }
                                    if (E7jCp8Ls3 == null) {
                                        kt0 AvO7iQsrTN24 = d01Var.AvO7iQsrTN();
                                        return cVar.requestRectangleOnScreen(new Rect((int) Math.floor(AvO7iQsrTN24.GWasM1elztuh), (int) Math.floor(AvO7iQsrTN24.Yi7zF1RB1), vc0.MZhzXH72((float) Math.ceil(AvO7iQsrTN24.X1lG3V04pd)), vc0.MZhzXH72((float) Math.ceil(AvO7iQsrTN24.xqGvceK5x))));
                                    }
                                    long j3 = 0;
                                    long j4 = 0;
                                    boolean z12 = false;
                                    while (E7jCp8Ls3 != null) {
                                        g60 g60Var2 = E7jCp8Ls3.X1lG3V04pd;
                                        hg0 hg0Var2 = E7jCp8Ls3.xqGvceK5x.OOA6hdeuvCS;
                                        Object AvO7iQsrTN25 = hg0Var2.AvO7iQsrTN(yz0.xqGvceK5x);
                                        if (AvO7iQsrTN25 == null) {
                                            AvO7iQsrTN25 = null;
                                        }
                                        VeqTn1PQw7 veqTn1PQw717 = (VeqTn1PQw7) AvO7iQsrTN25;
                                        if (veqTn1PQw717 != null) {
                                            kt0 xqGvceK5x = o50.xqGvceK5x(g60Var2.A1EKNP6CxJ.X1lG3V04pd);
                                            n50 JFJ3QoxA = g60Var2.A1EKNP6CxJ.X1lG3V04pd.JFJ3QoxA();
                                            kt0 OOA6hdeuvCS = xqGvceK5x.OOA6hdeuvCS(JFJ3QoxA != null ? ((bk0) JFJ3QoxA).pjimB8cb(j3) : j3);
                                            bk0 xqGvceK5x2 = d01Var.xqGvceK5x();
                                            if (xqGvceK5x2 != null) {
                                                if (!xqGvceK5x2.iK7aQfvhG().Mjvvu5DE) {
                                                    xqGvceK5x2 = null;
                                                }
                                                if (xqGvceK5x2 != null) {
                                                    j = xqGvceK5x2.pjimB8cb(j3);
                                                    long OOA6hdeuvCS2 = uk0.OOA6hdeuvCS(j, j4);
                                                    bk0 xqGvceK5x3 = d01Var.xqGvceK5x();
                                                    kt0 EljAMC1QTz = w60.EljAMC1QTz(OOA6hdeuvCS2, o30.CMh55RymNfS(xqGvceK5x3 == null ? xqGvceK5x3.AvO7iQsrTN : 0L));
                                                    f = EljAMC1QTz.GWasM1elztuh - OOA6hdeuvCS.GWasM1elztuh;
                                                    f2 = EljAMC1QTz.X1lG3V04pd - OOA6hdeuvCS.X1lG3V04pd;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = EljAMC1QTz.Yi7zF1RB1 - OOA6hdeuvCS.Yi7zF1RB1;
                                                    f4 = EljAMC1QTz.xqGvceK5x - OOA6hdeuvCS.xqGvceK5x;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                    if (uk0.Yi7zF1RB1(floatToRawIntBits, 0L)) {
                                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                        Object AvO7iQsrTN26 = hg0Var2.AvO7iQsrTN(h01.cilMamHF);
                                                        if (AvO7iQsrTN26 == null) {
                                                            AvO7iQsrTN26 = null;
                                                        }
                                                        if (g60Var.k8h8IjolWQ == p50Var) {
                                                            intBitsToFloat2 = -intBitsToFloat2;
                                                        }
                                                        Object AvO7iQsrTN27 = hg0Var2.AvO7iQsrTN(h01.lv06NcmrQ);
                                                        if (AvO7iQsrTN27 == null) {
                                                            AvO7iQsrTN27 = null;
                                                        }
                                                        floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                                    } else {
                                                        floatToRawIntBits2 = floatToRawIntBits;
                                                    }
                                                    lv lvVar3 = (lv) veqTn1PQw717.Yi7zF1RB1;
                                                    z12 = (lvVar3 == null && ((Boolean) lvVar3.EljAMC1QTz(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z12;
                                                    j4 = uk0.xqGvceK5x(j4, floatToRawIntBits);
                                                }
                                            }
                                            j = j3;
                                            long OOA6hdeuvCS22 = uk0.OOA6hdeuvCS(j, j4);
                                            bk0 xqGvceK5x32 = d01Var.xqGvceK5x();
                                            kt0 EljAMC1QTz2 = w60.EljAMC1QTz(OOA6hdeuvCS22, o30.CMh55RymNfS(xqGvceK5x32 == null ? xqGvceK5x32.AvO7iQsrTN : 0L));
                                            f = EljAMC1QTz2.GWasM1elztuh - OOA6hdeuvCS.GWasM1elztuh;
                                            f2 = EljAMC1QTz2.X1lG3V04pd - OOA6hdeuvCS.X1lG3V04pd;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                            }
                                            f3 = EljAMC1QTz2.Yi7zF1RB1 - OOA6hdeuvCS.Yi7zF1RB1;
                                            f4 = EljAMC1QTz2.xqGvceK5x - OOA6hdeuvCS.xqGvceK5x;
                                            if (Math.signum(f3) == Math.signum(f4)) {
                                            }
                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                            if (uk0.Yi7zF1RB1(floatToRawIntBits, 0L)) {
                                            }
                                            lv lvVar32 = (lv) veqTn1PQw717.Yi7zF1RB1;
                                            if (lvVar32 == null) {
                                            }
                                            j4 = uk0.xqGvceK5x(j4, floatToRawIntBits);
                                        }
                                        E7jCp8Ls3 = E7jCp8Ls3.E7jCp8Ls();
                                        j3 = 0;
                                    }
                                    return z12;
                                }
                                veqTn1PQw7 = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object AvO7iQsrTN28 = hg0Var.AvO7iQsrTN(yz0.mOu10nynGul);
                                    VeqTn1PQw7 veqTn1PQw718 = (VeqTn1PQw7) (AvO7iQsrTN28 == null ? null : AvO7iQsrTN28);
                                    if (veqTn1PQw718 != null && (hvVar2 = (hv) veqTn1PQw718.Yi7zF1RB1) != null) {
                                        return ((Boolean) hvVar2.mOu10nynGul(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object AvO7iQsrTN29 = hg0Var.AvO7iQsrTN(yz0.iwATDS1i01k);
                                VeqTn1PQw7 veqTn1PQw719 = (VeqTn1PQw7) (AvO7iQsrTN29 == null ? null : AvO7iQsrTN29);
                                if (veqTn1PQw719 != null && (wuVar10 = (wu) veqTn1PQw719.Yi7zF1RB1) != null) {
                                    return ((Boolean) wuVar10.GWasM1elztuh()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionPageUp:
                                                Object AvO7iQsrTN30 = hg0Var.AvO7iQsrTN(yz0.WdrkLMV3xh);
                                                VeqTn1PQw7 veqTn1PQw720 = (VeqTn1PQw7) (AvO7iQsrTN30 == null ? null : AvO7iQsrTN30);
                                                if (veqTn1PQw720 != null && (wuVar13 = (wu) veqTn1PQw720.Yi7zF1RB1) != null) {
                                                    return ((Boolean) wuVar13.GWasM1elztuh()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object AvO7iQsrTN31 = hg0Var.AvO7iQsrTN(yz0.arNh8D4Z5gB);
                                                VeqTn1PQw7 veqTn1PQw721 = (VeqTn1PQw7) (AvO7iQsrTN31 == null ? null : AvO7iQsrTN31);
                                                if (veqTn1PQw721 != null && (wuVar14 = (wu) veqTn1PQw721.Yi7zF1RB1) != null) {
                                                    return ((Boolean) wuVar14.GWasM1elztuh()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object AvO7iQsrTN32 = hg0Var.AvO7iQsrTN(yz0.WRKkgoJXwDn);
                                                VeqTn1PQw7 veqTn1PQw722 = (VeqTn1PQw7) (AvO7iQsrTN32 == null ? null : AvO7iQsrTN32);
                                                if (veqTn1PQw722 != null && (wuVar15 = (wu) veqTn1PQw722.Yi7zF1RB1) != null) {
                                                    return ((Boolean) wuVar15.GWasM1elztuh()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object AvO7iQsrTN33 = hg0Var.AvO7iQsrTN(yz0.pog2g9KITJA);
                                                VeqTn1PQw7 veqTn1PQw723 = (VeqTn1PQw7) (AvO7iQsrTN33 == null ? null : AvO7iQsrTN33);
                                                if (veqTn1PQw723 != null && (wuVar16 = (wu) veqTn1PQw723.Yi7zF1RB1) != null) {
                                                    return ((Boolean) wuVar16.GWasM1elztuh()).booleanValue();
                                                }
                                                break;
                                            default:
                                                y41 y41Var = (y41) iVar.cilMamHF.Yi7zF1RB1(i);
                                                if (y41Var != null && ((CharSequence) y41Var.Yi7zF1RB1(i2)) != null) {
                                                    Object AvO7iQsrTN34 = hg0Var.AvO7iQsrTN(yz0.lv06NcmrQ);
                                                    List list = (List) (AvO7iQsrTN34 == null ? null : AvO7iQsrTN34);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        o4.YmKjaVtbfp5Z();
                                                        return false;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object AvO7iQsrTN35 = hg0Var.AvO7iQsrTN(h01.E7jCp8Ls);
                        if (AvO7iQsrTN35 == null) {
                            AvO7iQsrTN35 = null;
                        }
                        if (o30.rQPn8YBR(AvO7iQsrTN35, bool)) {
                            ((nt) cVar.getFocusOwner()).Yi7zF1RB1(8, false, true);
                            return true;
                        }
                    }
                }
            }
            return z2;
        }
        z = false;
        return z;
    }
}
