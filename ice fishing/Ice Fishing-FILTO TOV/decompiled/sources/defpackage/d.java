package defpackage;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.combinations.level.experts.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class d implements f9, op, r61, p9, um0, bx0 {
    public Object AvO7iQsrTN;
    public Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public d(int i) {
        this.OOA6hdeuvCS = i;
        switch (i) {
            case 4:
                this.EljAMC1QTz = new ae1(0);
                this.AvO7iQsrTN = new ae1(0);
                break;
            case 9:
                break;
            case 11:
                this.EljAMC1QTz = new hg0();
                this.AvO7iQsrTN = new hg0();
                break;
            case 12:
                this.EljAMC1QTz = new rg0(new g60[16]);
                break;
            case 16:
                this.EljAMC1QTz = new LinkedHashMap();
                this.AvO7iQsrTN = new LinkedHashMap();
                break;
            case 21:
                this.EljAMC1QTz = new x51(5);
                this.AvO7iQsrTN = new bc0(16);
                break;
            case 22:
                this.EljAMC1QTz = new rg0(new Reference[16]);
                this.AvO7iQsrTN = new ReferenceQueue();
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.EljAMC1QTz = new rASgSCrgZkT7(this);
                    break;
                } else {
                    this.EljAMC1QTz = new JB4pnjMK(this);
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [he0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void uFEq9NpZ(g60 g60Var) {
        if (g60Var.z19UFEN2I > 0) {
            if (g60Var.MZhzXH72.xqGvceK5x == c60.mOu10nynGul && !g60Var.WIEu4Ya2g8() && !g60Var.YmKjaVtbfp5Z() && !g60Var.YXi2hvwn7WL && g60Var.A1EKNP6CxJ()) {
                he0 he0Var = g60Var.A1EKNP6CxJ.EljAMC1QTz;
                if ((he0Var.encWxUiV2 & 256) != 0) {
                    while (he0Var != null) {
                        if ((he0Var.AvO7iQsrTN & 256) != 0) {
                            yk ykVar = he0Var;
                            ?? r5 = 0;
                            while (ykVar != 0) {
                                if (ykVar instanceof gy) {
                                    gy gyVar = (gy) ykVar;
                                    gyVar.iwATDS1i01k(vc0.AEn1Rrio(gyVar, 256));
                                } else if ((ykVar.AvO7iQsrTN & 256) != 0 && (ykVar instanceof yk)) {
                                    he0 he0Var2 = ykVar.jivtDDk9H;
                                    int i = 0;
                                    ykVar = ykVar;
                                    r5 = r5;
                                    while (he0Var2 != null) {
                                        if ((he0Var2.AvO7iQsrTN & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                ykVar = he0Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new rg0(new he0[16]);
                                                }
                                                if (ykVar != 0) {
                                                    r5.Yi7zF1RB1(ykVar);
                                                    ykVar = 0;
                                                }
                                                r5.Yi7zF1RB1(he0Var2);
                                            }
                                        }
                                        he0Var2 = he0Var2.JFJ3QoxA;
                                        ykVar = ykVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ykVar = vc0.E7jCp8Ls(r5);
                            }
                        }
                        if ((he0Var.encWxUiV2 & 256) == 0) {
                            break;
                        } else {
                            he0Var = he0Var.JFJ3QoxA;
                        }
                    }
                }
            }
            g60Var.VeqTn1PQw7 = false;
            rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
            Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
            int i2 = arNh8D4Z5gB.AvO7iQsrTN;
            for (int i3 = 0; i3 < i2; i3++) {
                uFEq9NpZ((g60) objArr[i3]);
            }
        }
    }

    @Override // defpackage.op
    public boolean AvO7iQsrTN(CharSequence charSequence, int i, int i2, qb1 qb1Var) {
        if ((qb1Var.X1lG3V04pd & 4) > 0) {
            return true;
        }
        if (((pc1) this.EljAMC1QTz) == null) {
            this.EljAMC1QTz = new pc1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((k61) this.AvO7iQsrTN).getClass();
        ((pc1) this.EljAMC1QTz).setSpan(new rb1(qb1Var), i, i2, 33);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:396:0x0884, code lost:
    
        if (r3 == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        if (defpackage.d01.JFJ3QoxA(4, r7).isEmpty() != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0866 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0996 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0a21 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0c44  */
    /* JADX WARN: Type inference failed for: r2v24, types: [xp] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r46v1 */
    /* JADX WARN: Type inference failed for: r46v2, types: [SyyZR548qbcW, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r46v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SyyZR548qbcW E7jCp8Ls(int i) {
        Bundle bundle;
        AccessibilityManager accessibilityManager;
        y41 y41Var;
        pf0 pf0Var;
        i iVar;
        c cVar;
        d01 d01Var;
        hg0 hg0Var;
        Resources resources;
        g60 g60Var;
        ov0 ov0Var;
        zz0 zz0Var;
        SyyZR548qbcW syyZR548qbcW;
        SpannableString spannableString;
        ov0 ov0Var2;
        int i2;
        SyyZR548qbcW syyZR548qbcW2;
        int i3;
        i iVar2;
        boolean z;
        d01 d01Var2;
        kt0 XnEVoBF0td1l;
        boolean z2;
        VeqTn1PQw7 veqTn1PQw7;
        VeqTn1PQw7 veqTn1PQw72;
        VeqTn1PQw7 veqTn1PQw73;
        String E7jCp8Ls;
        ks0 ks0Var;
        sx0 sx0Var;
        sx0 sx0Var2;
        int i4;
        int xqGvceK5x;
        c cVar2;
        int xqGvceK5x2;
        String str;
        SyyZR548qbcW syyZR548qbcW3;
        Object AvO7iQsrTN;
        Object AvO7iQsrTN2;
        g60 g60Var2;
        List list;
        g60 cilMamHF;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i5;
        boolean z5;
        d01 d01Var3;
        int i6;
        Float valueOf = Float.valueOf(0.0f);
        i iVar3 = (i) this.AvO7iQsrTN;
        AccessibilityManager accessibilityManager2 = iVar3.rQPn8YBR;
        c cVar3 = iVar3.encWxUiV2;
        if (cVar3.getComposeViewContext().X1lG3V04pd.AvO7iQsrTN().encWxUiV2 == m90.OOA6hdeuvCS) {
            if (!accessibilityManager2.isEnabled()) {
                syyZR548qbcW3 = new SyyZR548qbcW(AccessibilityNodeInfo.obtain());
                i3 = i;
                iVar2 = iVar3;
                if (iVar2.mE4lRynR) {
                    if (i3 == iVar2.iwATDS1i01k) {
                        iVar2.YmKjaVtbfp5Z = syyZR548qbcW3;
                    }
                    if (i3 == iVar2.WIEu4Ya2g8) {
                        iVar2.Mjvvu5DE = syyZR548qbcW3;
                    }
                }
                return syyZR548qbcW3;
            }
            syyZR548qbcW3 = null;
            i3 = i;
            iVar2 = iVar3;
            if (iVar2.mE4lRynR) {
            }
            return syyZR548qbcW3;
        }
        f01 f01Var = (f01) iVar3.rQPn8YBR().Yi7zF1RB1(i);
        if (f01Var == null) {
            if (!accessibilityManager2.isEnabled()) {
                syyZR548qbcW3 = new SyyZR548qbcW(AccessibilityNodeInfo.obtain());
                i3 = i;
                iVar2 = iVar3;
                if (iVar2.mE4lRynR) {
                }
                return syyZR548qbcW3;
            }
            syyZR548qbcW3 = null;
            i3 = i;
            iVar2 = iVar3;
            if (iVar2.mE4lRynR) {
            }
            return syyZR548qbcW3;
        }
        d01 d01Var4 = f01Var.GWasM1elztuh;
        zz0 rQPn8YBR = d01Var4.rQPn8YBR();
        g60 g60Var3 = d01Var4.X1lG3V04pd;
        Object AvO7iQsrTN3 = rQPn8YBR.OOA6hdeuvCS.AvO7iQsrTN(h01.iwATDS1i01k);
        if (AvO7iQsrTN3 == null) {
            AvO7iQsrTN3 = null;
        }
        boolean rQPn8YBR2 = o30.rQPn8YBR(AvO7iQsrTN3, Boolean.TRUE);
        if (rQPn8YBR2) {
            if (!(Build.VERSION.SDK_INT >= 34 ? qugwajBSa59j.OOA6hdeuvCS(accessibilityManager2) : true)) {
                i3 = i;
                iVar2 = iVar3;
                syyZR548qbcW3 = null;
                if (iVar2.mE4lRynR) {
                }
                return syyZR548qbcW3;
            }
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        SyyZR548qbcW syyZR548qbcW4 = new SyyZR548qbcW(obtain);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            qugwajBSa59j.AvO7iQsrTN(obtain, rQPn8YBR2);
            bundle = 0;
        } else {
            bundle = 0;
            syyZR548qbcW4.EljAMC1QTz(64, rQPn8YBR2);
        }
        if (i == -1) {
            Object parentForAccessibility = cVar3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : bundle;
            syyZR548qbcW4.Yi7zF1RB1 = -1;
            obtain.setParent(view);
        } else {
            d01 E7jCp8Ls2 = d01Var4.E7jCp8Ls();
            Integer valueOf2 = E7jCp8Ls2 != null ? Integer.valueOf(E7jCp8Ls2.EljAMC1QTz) : bundle;
            if (valueOf2 == null) {
                t10.X1lG3V04pd("semanticsNode " + i + " has null parent");
                throw new vc();
            }
            int intValue = valueOf2.intValue();
            if (intValue == cVar3.getSemanticsOwner().GWasM1elztuh().EljAMC1QTz) {
                intValue = -1;
            }
            syyZR548qbcW4.Yi7zF1RB1 = intValue;
            obtain.setParent(cVar3, intValue);
        }
        syyZR548qbcW4.X1lG3V04pd = i;
        obtain.setSource(cVar3, i);
        obtain.setBoundsInScreen(iVar3.X1lG3V04pd(f01Var));
        pf0 pf0Var2 = iVar3.TpUsjqg3bxO;
        y41 y41Var2 = iVar3.lv06NcmrQ;
        Resources resources2 = cVar3.getContext().getResources();
        syyZR548qbcW4.AvO7iQsrTN("android.view.View");
        zz0 zz0Var2 = d01Var4.xqGvceK5x;
        hg0 hg0Var2 = zz0Var2.OOA6hdeuvCS;
        if (hg0Var2.X1lG3V04pd(h01.AEn1Rrio)) {
            syyZR548qbcW4.AvO7iQsrTN("android.widget.EditText");
        }
        if (hg0Var2.X1lG3V04pd(h01.M3K9sHhK)) {
            syyZR548qbcW4.AvO7iQsrTN("android.widget.TextView");
        }
        Object AvO7iQsrTN4 = hg0Var2.AvO7iQsrTN(h01.WRKkgoJXwDn);
        if (AvO7iQsrTN4 == null) {
            AvO7iQsrTN4 = bundle;
        }
        ov0 ov0Var3 = (ov0) AvO7iQsrTN4;
        if (ov0Var3 != null) {
            int i8 = ov0Var3.GWasM1elztuh;
            if (d01Var4.iwATDS1i01k()) {
                accessibilityManager = accessibilityManager2;
                i6 = 4;
                y41Var = y41Var2;
            } else {
                accessibilityManager = accessibilityManager2;
                i6 = 4;
                y41Var = y41Var2;
            }
            if (i8 == i6) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
            } else if (i8 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
            } else {
                String rezfBrjOrqK = b70.rezfBrjOrqK(i8);
                if (i8 != 5 || d01Var4.YmKjaVtbfp5Z() || zz0Var2.AvO7iQsrTN) {
                    syyZR548qbcW4.AvO7iQsrTN(rezfBrjOrqK);
                }
            }
        } else {
            accessibilityManager = accessibilityManager2;
            y41Var = y41Var2;
        }
        obtain.setPackageName(cVar3.getContext().getPackageName());
        obtain.setImportantForAccessibility(o30.EXrPz3p7hFb(d01Var4));
        boolean OOA6hdeuvCS = i7 >= 34 ? qugwajBSa59j.OOA6hdeuvCS(accessibilityManager) : true;
        List JFJ3QoxA = d01.JFJ3QoxA(4, d01Var4);
        int size = JFJ3QoxA.size();
        boolean z6 = OOA6hdeuvCS;
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = size;
            d01 d01Var5 = (d01) JFJ3QoxA.get(i10);
            List list2 = JFJ3QoxA;
            s20 rQPn8YBR3 = iVar3.rQPn8YBR();
            int i12 = i10;
            int i13 = d01Var5.EljAMC1QTz;
            if (rQPn8YBR3.GWasM1elztuh(i13)) {
                if (cVar3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(d01Var5.X1lG3V04pd) != null) {
                    o4.YmKjaVtbfp5Z();
                    return bundle;
                }
                if (i13 != -1) {
                    f01 f01Var2 = (f01) iVar3.rQPn8YBR().Yi7zF1RB1(i13);
                    if (f01Var2 == null || (d01Var3 = f01Var2.GWasM1elztuh) == null) {
                        z5 = false;
                    } else {
                        Object AvO7iQsrTN5 = d01Var3.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.iwATDS1i01k);
                        if (AvO7iQsrTN5 == null) {
                            AvO7iQsrTN5 = bundle;
                        }
                        z5 = o30.rQPn8YBR(AvO7iQsrTN5, Boolean.TRUE);
                    }
                    if (z6 || !z5) {
                        obtain.addChild(cVar3, i13);
                    }
                    pf0Var2.EljAMC1QTz(i13, i9);
                    i9++;
                }
            }
            i10 = i12 + 1;
            JFJ3QoxA = list2;
            size = i11;
        }
        int i14 = iVar3.iwATDS1i01k;
        AccessibilityNodeInfo accessibilityNodeInfo = syyZR548qbcW4.GWasM1elztuh;
        if (i == i14) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
            syyZR548qbcW4.GWasM1elztuh(EDwNPVYuViP0.xqGvceK5x);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            syyZR548qbcW4.GWasM1elztuh(EDwNPVYuViP0.X1lG3V04pd);
        }
        u3 EXrPz3p7hFb = n30.EXrPz3p7hFb(d01Var4);
        if (EXrPz3p7hFb != null) {
            cVar3.getFontFamilyResolver();
            el density = cVar3.getDensity();
            f4 f4Var = iVar3.MZhzXH72;
            cVar = cVar3;
            String str2 = EXrPz3p7hFb.EljAMC1QTz;
            g60Var = g60Var3;
            List list3 = EXrPz3p7hFb.OOA6hdeuvCS;
            SpannableString spannableString2 = new SpannableString(str2);
            ArrayList arrayList3 = EXrPz3p7hFb.AvO7iQsrTN;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                iVar = iVar3;
                int i15 = 0;
                while (i15 < size2) {
                    ArrayList arrayList4 = arrayList3;
                    t3 t3Var = (t3) arrayList3.get(i15);
                    int i16 = i15;
                    w41 w41Var = (w41) t3Var.GWasM1elztuh;
                    int i17 = size2;
                    int i18 = t3Var.Yi7zF1RB1;
                    int i19 = t3Var.X1lG3V04pd;
                    pf0 pf0Var3 = pf0Var2;
                    long xqGvceK5x3 = w41Var.GWasM1elztuh.xqGvceK5x();
                    ov0 ov0Var4 = ov0Var3;
                    zz0 zz0Var3 = zz0Var2;
                    long j = w41Var.Yi7zF1RB1;
                    ou ouVar = w41Var.X1lG3V04pd;
                    mu muVar = w41Var.xqGvceK5x;
                    e81 e81Var = w41Var.JFJ3QoxA;
                    SyyZR548qbcW syyZR548qbcW5 = syyZR548qbcW4;
                    gb0 gb0Var = w41Var.rQPn8YBR;
                    d01 d01Var6 = d01Var4;
                    hg0 hg0Var3 = hg0Var2;
                    long j2 = w41Var.E7jCp8Ls;
                    a81 a81Var = w41Var.XnEVoBF0td1l;
                    d81 d81Var = w41Var.GWasM1elztuh;
                    Resources resources3 = resources2;
                    if (!yb.X1lG3V04pd(xqGvceK5x3, d81Var.xqGvceK5x())) {
                        d81Var = xqGvceK5x3 != 16 ? new kc(xqGvceK5x3) : k61.AvO7iQsrTN;
                    }
                    d70.DmJncFq5(spannableString2, d81Var.xqGvceK5x(), i18, i19);
                    SpannableString spannableString3 = spannableString2;
                    d70.HFYAaqMd6(spannableString3, j, density, i18, i19);
                    if (ouVar == null && muVar == null) {
                        i5 = 33;
                    } else {
                        i5 = 33;
                        spannableString3.setSpan(new StyleSpan(fb1.pog2g9KITJA(ouVar == null ? ou.AvO7iQsrTN : ouVar, muVar != null ? muVar.GWasM1elztuh : 0)), i18, i19, 33);
                    }
                    if (a81Var != null) {
                        int i20 = a81Var.GWasM1elztuh;
                        if ((i20 | 1) == i20) {
                            spannableString3.setSpan(new UnderlineSpan(), i18, i19, i5);
                        }
                        if ((i20 | 2) == i20) {
                            spannableString3.setSpan(new StrikethroughSpan(), i18, i19, i5);
                        }
                    }
                    if (e81Var != null) {
                        spannableString3.setSpan(new ScaleXSpan(e81Var.GWasM1elztuh), i18, i19, i5);
                    }
                    d70.rezfBrjOrqK(spannableString3, gb0Var, i18, i19);
                    if (j2 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(ki1.HFYAaqMd6(j2)), i18, i19, i5);
                    }
                    i15 = i16 + 1;
                    spannableString2 = spannableString3;
                    arrayList3 = arrayList4;
                    size2 = i17;
                    pf0Var2 = pf0Var3;
                    zz0Var2 = zz0Var3;
                    ov0Var3 = ov0Var4;
                    syyZR548qbcW4 = syyZR548qbcW5;
                    d01Var4 = d01Var6;
                    hg0Var2 = hg0Var3;
                    resources2 = resources3;
                }
            } else {
                iVar = iVar3;
            }
            pf0Var = pf0Var2;
            d01Var = d01Var4;
            hg0Var = hg0Var2;
            resources = resources2;
            ov0Var = ov0Var3;
            zz0Var = zz0Var2;
            syyZR548qbcW = syyZR548qbcW4;
            SpannableString spannableString4 = spannableString2;
            int length = str2.length();
            ?? r2 = xp.OOA6hdeuvCS;
            if (list3 != null) {
                arrayList = new ArrayList(list3.size());
                int size3 = list3.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    Object obj = list3.get(i21);
                    t3 t3Var2 = (t3) obj;
                    if ((t3Var2.GWasM1elztuh instanceof be1) && v3.GWasM1elztuh(0, length, t3Var2.Yi7zF1RB1, t3Var2.X1lG3V04pd)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = r2;
            }
            int size4 = arrayList.size();
            for (int i22 = 0; i22 < size4; i22++) {
                t3 t3Var3 = (t3) arrayList.get(i22);
                be1 be1Var = (be1) t3Var3.GWasM1elztuh;
                int i23 = t3Var3.Yi7zF1RB1;
                int i24 = t3Var3.X1lG3V04pd;
                if (!(be1Var instanceof be1)) {
                    o4.xqGvceK5x();
                    return bundle;
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(be1Var.GWasM1elztuh).build(), i23, i24, 33);
            }
            int length2 = str2.length();
            if (list3 != null) {
                arrayList2 = new ArrayList(list3.size());
                int size5 = list3.size();
                for (int i25 = 0; i25 < size5; i25++) {
                    Object obj2 = list3.get(i25);
                    t3 t3Var4 = (t3) obj2;
                    if ((t3Var4.GWasM1elztuh instanceof dd1) && v3.GWasM1elztuh(0, length2, t3Var4.Yi7zF1RB1, t3Var4.X1lG3V04pd)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = r2;
            }
            int size6 = arrayList2.size();
            for (int i26 = 0; i26 < size6; i26++) {
                t3 t3Var5 = (t3) arrayList2.get(i26);
                dd1 dd1Var = (dd1) t3Var5.GWasM1elztuh;
                int i27 = t3Var5.Yi7zF1RB1;
                int i28 = t3Var5.X1lG3V04pd;
                WeakHashMap weakHashMap = (WeakHashMap) f4Var.Yi7zF1RB1;
                Object obj3 = weakHashMap.get(dd1Var);
                if (obj3 == null) {
                    obj3 = new URLSpan(dd1Var.GWasM1elztuh);
                    weakHashMap.put(dd1Var, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i27, i28, 33);
            }
            int length3 = str2.length();
            if (list3 != null) {
                r2 = new ArrayList(list3.size());
                int size7 = list3.size();
                for (int i29 = 0; i29 < size7; i29++) {
                    Object obj4 = list3.get(i29);
                    t3 t3Var6 = (t3) obj4;
                    if ((t3Var6.GWasM1elztuh instanceof qa0) && v3.GWasM1elztuh(0, length3, t3Var6.Yi7zF1RB1, t3Var6.X1lG3V04pd)) {
                        r2.add(obj4);
                    }
                }
            }
            int size8 = r2.size();
            for (int i30 = 0; i30 < size8; i30++) {
                t3 t3Var7 = (t3) r2.get(i30);
                int i31 = t3Var7.Yi7zF1RB1;
                Object obj5 = t3Var7.GWasM1elztuh;
                int i32 = t3Var7.X1lG3V04pd;
                if (i31 != i32) {
                    qa0 qa0Var = (qa0) obj5;
                    if (qa0Var instanceof pa0) {
                        obj5.getClass();
                        pa0 pa0Var = (pa0) obj5;
                        t3 t3Var8 = new t3(i31, i32, pa0Var);
                        WeakHashMap weakHashMap2 = (WeakHashMap) f4Var.X1lG3V04pd;
                        Object obj6 = weakHashMap2.get(t3Var8);
                        if (obj6 == null) {
                            obj6 = new URLSpan(pa0Var.GWasM1elztuh);
                            weakHashMap2.put(t3Var8, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i31, i32, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) f4Var.xqGvceK5x;
                        Object obj7 = weakHashMap3.get(t3Var7);
                        if (obj7 == null) {
                            obj7 = new ud(qa0Var);
                            weakHashMap3.put(t3Var7, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i31, i32, 33);
                    }
                }
            }
            spannableString = (SpannableString) i.eUH21U3apd(spannableString4);
        } else {
            pf0Var = pf0Var2;
            iVar = iVar3;
            cVar = cVar3;
            d01Var = d01Var4;
            hg0Var = hg0Var2;
            resources = resources2;
            g60Var = g60Var3;
            ov0Var = ov0Var3;
            zz0Var = zz0Var2;
            syyZR548qbcW = syyZR548qbcW4;
            spannableString = bundle;
        }
        accessibilityNodeInfo.setText(spannableString);
        k01 k01Var = h01.DmJncFq5;
        hg0 hg0Var4 = hg0Var;
        if (hg0Var4.X1lG3V04pd(k01Var)) {
            obtain.setContentInvalid(true);
            Object AvO7iQsrTN6 = hg0Var4.AvO7iQsrTN(k01Var);
            if (AvO7iQsrTN6 == null) {
                AvO7iQsrTN6 = bundle;
            }
            obtain.setError((CharSequence) AvO7iQsrTN6);
        }
        d01 d01Var7 = d01Var;
        Resources resources4 = resources;
        String k8h8IjolWQ = n30.k8h8IjolWQ(d01Var7, resources4);
        if (Build.VERSION.SDK_INT >= 30) {
            dcDmLGVhzWm.AvO7iQsrTN(accessibilityNodeInfo, k8h8IjolWQ);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", k8h8IjolWQ);
        }
        obtain.setCheckable(n30.M3K9sHhK(d01Var7));
        Object AvO7iQsrTN7 = hg0Var4.AvO7iQsrTN(h01.A1EKNP6CxJ);
        if (AvO7iQsrTN7 == null) {
            AvO7iQsrTN7 = bundle;
        }
        w91 w91Var = (w91) AvO7iQsrTN7;
        if (w91Var != null) {
            if (w91Var == w91.OOA6hdeuvCS) {
                accessibilityNodeInfo.setChecked(true);
            } else if (w91Var == w91.EljAMC1QTz) {
                accessibilityNodeInfo.setChecked(false);
            }
        }
        Object AvO7iQsrTN8 = hg0Var4.AvO7iQsrTN(h01.eUH21U3apd);
        if (AvO7iQsrTN8 == null) {
            AvO7iQsrTN8 = bundle;
        }
        Boolean bool = (Boolean) AvO7iQsrTN8;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (ov0Var == null) {
                ov0Var2 = ov0Var;
                i2 = 4;
            } else {
                ov0Var2 = ov0Var;
                i2 = 4;
                if (ov0Var2.GWasM1elztuh == 4) {
                    obtain.setSelected(booleanValue);
                }
            }
            accessibilityNodeInfo.setChecked(booleanValue);
        } else {
            ov0Var2 = ov0Var;
            i2 = 4;
        }
        zz0 zz0Var4 = zz0Var;
        if (!zz0Var4.AvO7iQsrTN || d01.JFJ3QoxA(i2, d01Var7).isEmpty()) {
            Object AvO7iQsrTN9 = hg0Var4.AvO7iQsrTN(h01.GWasM1elztuh);
            if (AvO7iQsrTN9 == null) {
                AvO7iQsrTN9 = bundle;
            }
            List list4 = (List) AvO7iQsrTN9;
            obtain.setContentDescription(list4 != null ? (String) rb.YTyqgZhdF(list4) : bundle);
        }
        Object AvO7iQsrTN10 = hg0Var4.AvO7iQsrTN(h01.arNh8D4Z5gB);
        if (AvO7iQsrTN10 == null) {
            AvO7iQsrTN10 = bundle;
        }
        String str3 = (String) AvO7iQsrTN10;
        if (str3 != null) {
            d01 d01Var8 = d01Var7;
            while (true) {
                if (d01Var8 == null) {
                    z4 = false;
                    break;
                }
                zz0 zz0Var5 = d01Var8.xqGvceK5x;
                k01 k01Var2 = i01.GWasM1elztuh;
                if (zz0Var5.OOA6hdeuvCS.X1lG3V04pd(k01Var2)) {
                    z4 = ((Boolean) zz0Var5.X1lG3V04pd(k01Var2)).booleanValue();
                    break;
                }
                d01Var8 = d01Var8.E7jCp8Ls();
            }
            if (z4) {
                obtain.setViewIdResourceName(str3);
            }
        }
        Object AvO7iQsrTN11 = hg0Var4.AvO7iQsrTN(h01.encWxUiV2);
        if (AvO7iQsrTN11 == null) {
            AvO7iQsrTN11 = bundle;
        }
        if (((kc1) AvO7iQsrTN11) != null) {
            if (Build.VERSION.SDK_INT < 28) {
                syyZR548qbcW2 = syyZR548qbcW;
                syyZR548qbcW2.EljAMC1QTz(2, true);
                if (((kc1) n4.rQPn8YBR(zz0Var4, h01.mOu10nynGul)) != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        obtain.setTextEntryKey(true);
                    } else {
                        syyZR548qbcW2.EljAMC1QTz(8, true);
                    }
                }
                i3 = i;
                if (i3 != -1) {
                    int xqGvceK5x4 = pf0Var.xqGvceK5x(d01Var7.EljAMC1QTz);
                    if (xqGvceK5x4 != -1) {
                        obtain.setDrawingOrder(xqGvceK5x4);
                    } else {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                obtain.setPassword(hg0Var4.X1lG3V04pd(h01.MZhzXH72));
                Object rQPn8YBR4 = n4.rQPn8YBR(zz0Var4, h01.rezfBrjOrqK);
                Boolean bool2 = Boolean.TRUE;
                obtain.setEditable(o30.rQPn8YBR(rQPn8YBR4, bool2));
                Integer num = (Integer) n4.rQPn8YBR(zz0Var4, h01.TpUsjqg3bxO);
                obtain.setMaxTextLength(num == null ? num.intValue() : -1);
                obtain.setEnabled(n30.encWxUiV2(d01Var7));
                k01 k01Var3 = h01.E7jCp8Ls;
                obtain.setFocusable(hg0Var4.X1lG3V04pd(k01Var3));
                if (obtain.isFocusable()) {
                    iVar2 = iVar;
                } else {
                    obtain.setFocused(((Boolean) zz0Var4.X1lG3V04pd(k01Var3)).booleanValue());
                    if (!obtain.isFocused()) {
                        iVar2 = iVar;
                        z = true;
                        accessibilityNodeInfo.addAction(1);
                        accessibilityNodeInfo.setVisibleToUser(o30.k8h8IjolWQ(d01Var7) ^ z);
                        if (d01Var7.iwATDS1i01k()) {
                            d01Var2 = d01Var7.E7jCp8Ls();
                            d01Var2.getClass();
                        } else {
                            d01Var2 = d01Var7;
                        }
                        XnEVoBF0td1l = d01Var2.XnEVoBF0td1l();
                        if ((XnEVoBF0td1l.GWasM1elztuh >= XnEVoBF0td1l.X1lG3V04pd) || (XnEVoBF0td1l.Yi7zF1RB1 >= XnEVoBF0td1l.xqGvceK5x)) {
                            z2 = false;
                            accessibilityNodeInfo.setVisibleToUser(false);
                        } else {
                            z2 = false;
                        }
                        if (((ya0) n4.rQPn8YBR(zz0Var4, h01.rQPn8YBR)) != null) {
                            obtain.setLiveRegion(1);
                        }
                        accessibilityNodeInfo.setClickable(z2);
                        veqTn1PQw7 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.Yi7zF1RB1);
                        if (veqTn1PQw7 != null) {
                            boolean rQPn8YBR5 = o30.rQPn8YBR(n4.rQPn8YBR(zz0Var4, h01.eUH21U3apd), bool2);
                            boolean z7 = (ov0Var2 != null && ov0Var2.GWasM1elztuh == 4) || (ov0Var2 != null && ov0Var2.GWasM1elztuh == 3);
                            accessibilityNodeInfo.setClickable(!z7 || (z7 && !rQPn8YBR5));
                            if (n30.encWxUiV2(d01Var7) && obtain.isClickable()) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw7.GWasM1elztuh, 16));
                            }
                        }
                        accessibilityNodeInfo.setLongClickable(false);
                        veqTn1PQw72 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.X1lG3V04pd);
                        if (veqTn1PQw72 != null) {
                            accessibilityNodeInfo.setLongClickable(true);
                            if (n30.encWxUiV2(d01Var7)) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw72.GWasM1elztuh, 32));
                            }
                        }
                        veqTn1PQw73 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.WIEu4Ya2g8);
                        if (veqTn1PQw73 != null) {
                            syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw73.GWasM1elztuh, 16384));
                        }
                        if (n30.encWxUiV2(d01Var7)) {
                            VeqTn1PQw7 veqTn1PQw74 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.rQPn8YBR);
                            if (veqTn1PQw74 != null) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw74.GWasM1elztuh, 2097152));
                            }
                            VeqTn1PQw7 veqTn1PQw75 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.iwATDS1i01k);
                            if (veqTn1PQw75 != null) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw75.GWasM1elztuh, android.R.id.accessibilityActionImeEnter));
                            }
                            VeqTn1PQw7 veqTn1PQw76 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.YmKjaVtbfp5Z);
                            if (veqTn1PQw76 != null) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw76.GWasM1elztuh, 65536));
                            }
                            VeqTn1PQw7 veqTn1PQw77 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.Mjvvu5DE);
                            if (veqTn1PQw77 != null && obtain.isFocused()) {
                                gY3jNtCS0 clipboardManager = cVar.getClipboardManager();
                                ClipboardManager clipboardManager2 = clipboardManager.Yi7zF1RB1;
                                if (clipboardManager2 == null) {
                                    Object systemService = clipboardManager.GWasM1elztuh.getSystemService("clipboard");
                                    systemService.getClass();
                                    clipboardManager2 = (ClipboardManager) systemService;
                                    clipboardManager.Yi7zF1RB1 = clipboardManager2;
                                }
                                ClipDescription primaryClipDescription = clipboardManager2.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw77.GWasM1elztuh, 32768));
                                }
                            }
                        }
                        E7jCp8Ls = i.E7jCp8Ls(d01Var7);
                        if (E7jCp8Ls != null && E7jCp8Ls.length() != 0) {
                            obtain.setTextSelection(iVar2.JFJ3QoxA(d01Var7), iVar2.mOu10nynGul(d01Var7));
                            VeqTn1PQw7 veqTn1PQw78 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.JFJ3QoxA);
                            syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw78 == null ? veqTn1PQw78.GWasM1elztuh : bundle, 131072));
                            accessibilityNodeInfo.addAction(256);
                            accessibilityNodeInfo.addAction(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            list = (List) n4.rQPn8YBR(zz0Var4, h01.GWasM1elztuh);
                            if ((list != null || list.isEmpty()) && hg0Var4.X1lG3V04pd(yz0.GWasM1elztuh) && (!hg0Var4.X1lG3V04pd(h01.AEn1Rrio) || o30.rQPn8YBR(n4.rQPn8YBR(zz0Var4, k01Var3), bool2))) {
                                cilMamHF = g60Var.cilMamHF();
                                while (true) {
                                    if (cilMamHF == null) {
                                        cilMamHF = bundle;
                                        break;
                                    }
                                    zz0 WdrkLMV3xh = cilMamHF.WdrkLMV3xh();
                                    if (WdrkLMV3xh != null && WdrkLMV3xh.AvO7iQsrTN) {
                                        if (WdrkLMV3xh.OOA6hdeuvCS.X1lG3V04pd(h01.AEn1Rrio)) {
                                            break;
                                        }
                                    }
                                    cilMamHF = cilMamHF.cilMamHF();
                                }
                                if (cilMamHF != null) {
                                    zz0 WdrkLMV3xh2 = cilMamHF.WdrkLMV3xh();
                                    if (WdrkLMV3xh2 != null) {
                                        Object AvO7iQsrTN12 = WdrkLMV3xh2.OOA6hdeuvCS.AvO7iQsrTN(h01.E7jCp8Ls);
                                        if (AvO7iQsrTN12 == null) {
                                            AvO7iQsrTN12 = bundle;
                                        }
                                        z3 = o30.rQPn8YBR(AvO7iQsrTN12, Boolean.TRUE);
                                    } else {
                                        z3 = false;
                                    }
                                }
                                accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 20);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add("androidx.compose.ui.semantics.id");
                            CharSequence OOA6hdeuvCS2 = syyZR548qbcW2.OOA6hdeuvCS();
                            if (OOA6hdeuvCS2 != null && OOA6hdeuvCS2.length() != 0 && hg0Var4.X1lG3V04pd(yz0.GWasM1elztuh)) {
                                arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (hg0Var4.X1lG3V04pd(h01.arNh8D4Z5gB)) {
                                arrayList5.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (hg0Var4.X1lG3V04pd(h01.dqB83aoLBB)) {
                                arrayList5.add("androidx.compose.ui.semantics.shapeType");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList5.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList5.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo.setAvailableExtraData(arrayList5);
                            }
                        }
                        ks0Var = (ks0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.X1lG3V04pd);
                        if (ks0Var != null) {
                            zz0 uFEq9NpZ = d01Var7.uFEq9NpZ();
                            k01 k01Var4 = yz0.mOu10nynGul;
                            if (uFEq9NpZ.OOA6hdeuvCS.X1lG3V04pd(k01Var4)) {
                                syyZR548qbcW2.AvO7iQsrTN("android.widget.SeekBar");
                            } else {
                                syyZR548qbcW2.AvO7iQsrTN("android.widget.ProgressBar");
                            }
                            ks0 ks0Var2 = ks0.Yi7zF1RB1;
                            if (ks0Var != ks0.Yi7zF1RB1) {
                                accessibilityNodeInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new iriv6doqetn(AccessibilityNodeInfo.RangeInfo.obtain(1, valueOf.floatValue(), valueOf.floatValue(), 0.0f)).GWasM1elztuh);
                            }
                            if (d01Var7.uFEq9NpZ().OOA6hdeuvCS.X1lG3V04pd(k01Var4) && n30.encWxUiV2(d01Var7)) {
                                float floatValue = valueOf.floatValue();
                                float floatValue2 = valueOf.floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (0.0f < floatValue) {
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.OOA6hdeuvCS);
                                }
                                float floatValue3 = valueOf.floatValue();
                                float floatValue4 = valueOf.floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (0.0f > floatValue3) {
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.EljAMC1QTz);
                                }
                            }
                        }
                        p.X1lG3V04pd(syyZR548qbcW2, d01Var7);
                        rj0.eUH21U3apd(syyZR548qbcW2, d01Var7);
                        rj0.A1EKNP6CxJ(syyZR548qbcW2, d01Var7);
                        sx0Var = (sx0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.cilMamHF);
                        VeqTn1PQw7 veqTn1PQw79 = (VeqTn1PQw7) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), yz0.xqGvceK5x);
                        if (sx0Var != null && veqTn1PQw79 != null) {
                            AvO7iQsrTN2 = d01Var7.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.EljAMC1QTz);
                            if (AvO7iQsrTN2 == null) {
                                AvO7iQsrTN2 = bundle;
                            }
                            if (AvO7iQsrTN2 == null) {
                                Object AvO7iQsrTN13 = d01Var7.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.OOA6hdeuvCS);
                                if (AvO7iQsrTN13 == null) {
                                    AvO7iQsrTN13 = bundle;
                                }
                                if (AvO7iQsrTN13 == null) {
                                    syyZR548qbcW2.AvO7iQsrTN("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (n30.encWxUiV2(d01Var7)) {
                                boolean Mjvvu5DE = i.Mjvvu5DE(sx0Var);
                                p50 p50Var = p50.EljAMC1QTz;
                                if (Mjvvu5DE) {
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.OOA6hdeuvCS);
                                    g60Var2 = g60Var;
                                    syyZR548qbcW2.GWasM1elztuh(g60Var2.k8h8IjolWQ == p50Var ? EDwNPVYuViP0.encWxUiV2 : EDwNPVYuViP0.JFJ3QoxA);
                                } else {
                                    g60Var2 = g60Var;
                                }
                                if (i.YmKjaVtbfp5Z(sx0Var)) {
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.EljAMC1QTz);
                                    syyZR548qbcW2.GWasM1elztuh(g60Var2.k8h8IjolWQ == p50Var ? EDwNPVYuViP0.JFJ3QoxA : EDwNPVYuViP0.encWxUiV2);
                                }
                            }
                        }
                        sx0Var2 = (sx0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.lv06NcmrQ);
                        if (sx0Var2 != null && veqTn1PQw79 != null) {
                            AvO7iQsrTN = d01Var7.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.EljAMC1QTz);
                            if (AvO7iQsrTN == null) {
                                AvO7iQsrTN = bundle;
                            }
                            if (AvO7iQsrTN == null) {
                                Object AvO7iQsrTN14 = d01Var7.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.OOA6hdeuvCS);
                                if (AvO7iQsrTN14 == null) {
                                    AvO7iQsrTN14 = bundle;
                                }
                                if (AvO7iQsrTN14 == null) {
                                    syyZR548qbcW2.AvO7iQsrTN("android.widget.ScrollView");
                                }
                            }
                            if (((Number) sx0Var2.Yi7zF1RB1.GWasM1elztuh()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (n30.encWxUiV2(d01Var7)) {
                                if (i.Mjvvu5DE(sx0Var2)) {
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.OOA6hdeuvCS);
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.mOu10nynGul);
                                }
                                if (i.YmKjaVtbfp5Z(sx0Var2)) {
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.EljAMC1QTz);
                                    syyZR548qbcW2.GWasM1elztuh(EDwNPVYuViP0.AvO7iQsrTN);
                                }
                            }
                        }
                        i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 29) {
                            qj.encWxUiV2(syyZR548qbcW2, d01Var7);
                        }
                        CharSequence charSequence = (CharSequence) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.xqGvceK5x);
                        if (i4 >= 28) {
                            accessibilityNodeInfo.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (n30.encWxUiV2(d01Var7)) {
                            VeqTn1PQw7 veqTn1PQw710 = (VeqTn1PQw7) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), yz0.mE4lRynR);
                            if (veqTn1PQw710 != null) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw710.GWasM1elztuh, 262144));
                            }
                            VeqTn1PQw7 veqTn1PQw711 = (VeqTn1PQw7) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), yz0.jivtDDk9H);
                            if (veqTn1PQw711 != null) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw711.GWasM1elztuh, 524288));
                            }
                            VeqTn1PQw7 veqTn1PQw712 = (VeqTn1PQw7) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), yz0.Y6hRI1cF8);
                            if (veqTn1PQw712 != null) {
                                syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw712.GWasM1elztuh, 1048576));
                            }
                            zz0 uFEq9NpZ2 = d01Var7.uFEq9NpZ();
                            k01 k01Var5 = yz0.lv06NcmrQ;
                            if (uFEq9NpZ2.OOA6hdeuvCS.X1lG3V04pd(k01Var5)) {
                                List list5 = (List) d01Var7.uFEq9NpZ().X1lG3V04pd(k01Var5);
                                int size9 = list5.size();
                                qf0 qf0Var = i.YXi2hvwn7WL;
                                if (size9 >= qf0Var.Yi7zF1RB1) {
                                    throw new IllegalStateException("Can't have more than " + qf0Var.Yi7zF1RB1 + " custom actions for one widget");
                                }
                                y41 y41Var3 = new y41();
                                zf0 GWasM1elztuh = pk0.GWasM1elztuh();
                                y41 y41Var4 = y41Var;
                                if (y41Var4.OOA6hdeuvCS) {
                                    o30.encWxUiV2(y41Var4);
                                }
                                if (fb1.uFEq9NpZ(y41Var4.EljAMC1QTz, y41Var4.encWxUiV2, i3) >= 0) {
                                    zf0 zf0Var = (zf0) y41Var4.Yi7zF1RB1(i3);
                                    int[] iArr = qf0Var.GWasM1elztuh;
                                    int i33 = qf0Var.Yi7zF1RB1;
                                    int[] iArr2 = new int[16];
                                    int i34 = 0;
                                    int i35 = 0;
                                    while (i34 < i33) {
                                        int i36 = iArr[i34];
                                        int i37 = i33;
                                        int i38 = i35 + 1;
                                        zf0 zf0Var2 = zf0Var;
                                        if (iArr2.length < i38) {
                                            iArr2 = Arrays.copyOf(iArr2, Math.max(i38, (iArr2.length * 3) / 2));
                                        }
                                        iArr2[i35] = i36;
                                        i34++;
                                        i35 = i38;
                                        i33 = i37;
                                        zf0Var = zf0Var2;
                                    }
                                    zf0 zf0Var3 = zf0Var;
                                    ArrayList arrayList6 = new ArrayList();
                                    if (list5.size() > 0) {
                                        mr0.WIEu4Ya2g8(list5.get(0));
                                        zf0Var3.getClass();
                                        throw bundle;
                                    }
                                    if (arrayList6.size() > 0) {
                                        mr0.WIEu4Ya2g8(arrayList6.get(0));
                                        if (i35 <= 0) {
                                            o4.uFEq9NpZ("Index must be between 0 and size");
                                            return bundle;
                                        }
                                        int i39 = iArr2[0];
                                        throw bundle;
                                    }
                                } else if (list5.size() > 0) {
                                    mr0.WIEu4Ya2g8(list5.get(0));
                                    qf0Var.Yi7zF1RB1(0);
                                    throw bundle;
                                }
                                iVar2.cilMamHF.xqGvceK5x(i3, y41Var3);
                                y41Var4.xqGvceK5x(i3, GWasM1elztuh);
                            }
                        }
                        boolean JFJ3QoxA2 = n30.JFJ3QoxA(d01Var7, resources4);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo.setScreenReaderFocusable(JFJ3QoxA2);
                        } else {
                            syyZR548qbcW2.EljAMC1QTz(1, JFJ3QoxA2);
                        }
                        xqGvceK5x = iVar2.AEn1Rrio.xqGvceK5x(i3);
                        if (xqGvceK5x != -1) {
                            b70.A1EKNP6CxJ(cVar.getAndroidViewsHandler$ui(), xqGvceK5x);
                            cVar2 = cVar;
                            accessibilityNodeInfo.setTraversalBefore(cVar2, xqGvceK5x);
                            iVar2.Yi7zF1RB1(i3, syyZR548qbcW2, iVar2.eUH21U3apd, bundle);
                        } else {
                            cVar2 = cVar;
                        }
                        xqGvceK5x2 = iVar2.YZjbz8VdP5.xqGvceK5x(i3);
                        if (xqGvceK5x2 != -1) {
                            b70.A1EKNP6CxJ(cVar2.getAndroidViewsHandler$ui(), xqGvceK5x2);
                        }
                        str = (String) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), i01.Yi7zF1RB1);
                        if (str != null) {
                            syyZR548qbcW2.AvO7iQsrTN(str);
                        }
                        syyZR548qbcW3 = syyZR548qbcW2;
                        if (iVar2.mE4lRynR) {
                        }
                        return syyZR548qbcW3;
                    }
                    accessibilityNodeInfo.addAction(2);
                    iVar2 = iVar;
                    iVar2.WIEu4Ya2g8 = i3;
                }
                z = true;
                accessibilityNodeInfo.setVisibleToUser(o30.k8h8IjolWQ(d01Var7) ^ z);
                if (d01Var7.iwATDS1i01k()) {
                }
                XnEVoBF0td1l = d01Var2.XnEVoBF0td1l();
                if ((XnEVoBF0td1l.GWasM1elztuh >= XnEVoBF0td1l.X1lG3V04pd) | (XnEVoBF0td1l.Yi7zF1RB1 >= XnEVoBF0td1l.xqGvceK5x)) {
                }
                if (((ya0) n4.rQPn8YBR(zz0Var4, h01.rQPn8YBR)) != null) {
                }
                accessibilityNodeInfo.setClickable(z2);
                veqTn1PQw7 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.Yi7zF1RB1);
                if (veqTn1PQw7 != null) {
                }
                accessibilityNodeInfo.setLongClickable(false);
                veqTn1PQw72 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.X1lG3V04pd);
                if (veqTn1PQw72 != null) {
                }
                veqTn1PQw73 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.WIEu4Ya2g8);
                if (veqTn1PQw73 != null) {
                }
                if (n30.encWxUiV2(d01Var7)) {
                }
                E7jCp8Ls = i.E7jCp8Ls(d01Var7);
                if (E7jCp8Ls != null) {
                    obtain.setTextSelection(iVar2.JFJ3QoxA(d01Var7), iVar2.mOu10nynGul(d01Var7));
                    VeqTn1PQw7 veqTn1PQw782 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.JFJ3QoxA);
                    syyZR548qbcW2.GWasM1elztuh(new EDwNPVYuViP0(veqTn1PQw782 == null ? veqTn1PQw782.GWasM1elztuh : bundle, 131072));
                    accessibilityNodeInfo.addAction(256);
                    accessibilityNodeInfo.addAction(512);
                    accessibilityNodeInfo.setMovementGranularities(11);
                    list = (List) n4.rQPn8YBR(zz0Var4, h01.GWasM1elztuh);
                    if (list != null) {
                    }
                    cilMamHF = g60Var.cilMamHF();
                    while (true) {
                        if (cilMamHF == null) {
                        }
                        cilMamHF = cilMamHF.cilMamHF();
                    }
                    if (cilMamHF != null) {
                    }
                    accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 20);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                }
                ks0Var = (ks0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.X1lG3V04pd);
                if (ks0Var != null) {
                }
                p.X1lG3V04pd(syyZR548qbcW2, d01Var7);
                rj0.eUH21U3apd(syyZR548qbcW2, d01Var7);
                rj0.A1EKNP6CxJ(syyZR548qbcW2, d01Var7);
                sx0Var = (sx0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.cilMamHF);
                VeqTn1PQw7 veqTn1PQw792 = (VeqTn1PQw7) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), yz0.xqGvceK5x);
                if (sx0Var != null) {
                    AvO7iQsrTN2 = d01Var7.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.EljAMC1QTz);
                    if (AvO7iQsrTN2 == null) {
                    }
                    if (AvO7iQsrTN2 == null) {
                    }
                    if (((Number) sx0Var.Yi7zF1RB1.GWasM1elztuh()).floatValue() > 0.0f) {
                    }
                    if (n30.encWxUiV2(d01Var7)) {
                    }
                }
                sx0Var2 = (sx0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.lv06NcmrQ);
                if (sx0Var2 != null) {
                    AvO7iQsrTN = d01Var7.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.EljAMC1QTz);
                    if (AvO7iQsrTN == null) {
                    }
                    if (AvO7iQsrTN == null) {
                    }
                    if (((Number) sx0Var2.Yi7zF1RB1.GWasM1elztuh()).floatValue() > 0.0f) {
                    }
                    if (n30.encWxUiV2(d01Var7)) {
                    }
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                CharSequence charSequence2 = (CharSequence) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.xqGvceK5x);
                if (i4 >= 28) {
                }
                if (n30.encWxUiV2(d01Var7)) {
                }
                boolean JFJ3QoxA22 = n30.JFJ3QoxA(d01Var7, resources4);
                if (Build.VERSION.SDK_INT >= 28) {
                }
                xqGvceK5x = iVar2.AEn1Rrio.xqGvceK5x(i3);
                if (xqGvceK5x != -1) {
                }
                xqGvceK5x2 = iVar2.YZjbz8VdP5.xqGvceK5x(i3);
                if (xqGvceK5x2 != -1) {
                }
                str = (String) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), i01.Yi7zF1RB1);
                if (str != null) {
                }
                syyZR548qbcW3 = syyZR548qbcW2;
                if (iVar2.mE4lRynR) {
                }
                return syyZR548qbcW3;
            }
            accessibilityNodeInfo.setHeading(true);
        }
        syyZR548qbcW2 = syyZR548qbcW;
        if (((kc1) n4.rQPn8YBR(zz0Var4, h01.mOu10nynGul)) != null) {
        }
        i3 = i;
        if (i3 != -1) {
        }
        obtain.setPassword(hg0Var4.X1lG3V04pd(h01.MZhzXH72));
        Object rQPn8YBR42 = n4.rQPn8YBR(zz0Var4, h01.rezfBrjOrqK);
        Boolean bool22 = Boolean.TRUE;
        obtain.setEditable(o30.rQPn8YBR(rQPn8YBR42, bool22));
        Integer num2 = (Integer) n4.rQPn8YBR(zz0Var4, h01.TpUsjqg3bxO);
        obtain.setMaxTextLength(num2 == null ? num2.intValue() : -1);
        obtain.setEnabled(n30.encWxUiV2(d01Var7));
        k01 k01Var32 = h01.E7jCp8Ls;
        obtain.setFocusable(hg0Var4.X1lG3V04pd(k01Var32));
        if (obtain.isFocusable()) {
        }
        z = true;
        accessibilityNodeInfo.setVisibleToUser(o30.k8h8IjolWQ(d01Var7) ^ z);
        if (d01Var7.iwATDS1i01k()) {
        }
        XnEVoBF0td1l = d01Var2.XnEVoBF0td1l();
        if ((XnEVoBF0td1l.GWasM1elztuh >= XnEVoBF0td1l.X1lG3V04pd) | (XnEVoBF0td1l.Yi7zF1RB1 >= XnEVoBF0td1l.xqGvceK5x)) {
        }
        if (((ya0) n4.rQPn8YBR(zz0Var4, h01.rQPn8YBR)) != null) {
        }
        accessibilityNodeInfo.setClickable(z2);
        veqTn1PQw7 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.Yi7zF1RB1);
        if (veqTn1PQw7 != null) {
        }
        accessibilityNodeInfo.setLongClickable(false);
        veqTn1PQw72 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.X1lG3V04pd);
        if (veqTn1PQw72 != null) {
        }
        veqTn1PQw73 = (VeqTn1PQw7) n4.rQPn8YBR(zz0Var4, yz0.WIEu4Ya2g8);
        if (veqTn1PQw73 != null) {
        }
        if (n30.encWxUiV2(d01Var7)) {
        }
        E7jCp8Ls = i.E7jCp8Ls(d01Var7);
        if (E7jCp8Ls != null) {
        }
        if (Build.VERSION.SDK_INT >= 26) {
        }
        ks0Var = (ks0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.X1lG3V04pd);
        if (ks0Var != null) {
        }
        p.X1lG3V04pd(syyZR548qbcW2, d01Var7);
        rj0.eUH21U3apd(syyZR548qbcW2, d01Var7);
        rj0.A1EKNP6CxJ(syyZR548qbcW2, d01Var7);
        sx0Var = (sx0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.cilMamHF);
        VeqTn1PQw7 veqTn1PQw7922 = (VeqTn1PQw7) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), yz0.xqGvceK5x);
        if (sx0Var != null) {
        }
        sx0Var2 = (sx0) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.lv06NcmrQ);
        if (sx0Var2 != null) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        CharSequence charSequence22 = (CharSequence) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), h01.xqGvceK5x);
        if (i4 >= 28) {
        }
        if (n30.encWxUiV2(d01Var7)) {
        }
        boolean JFJ3QoxA222 = n30.JFJ3QoxA(d01Var7, resources4);
        if (Build.VERSION.SDK_INT >= 28) {
        }
        xqGvceK5x = iVar2.AEn1Rrio.xqGvceK5x(i3);
        if (xqGvceK5x != -1) {
        }
        xqGvceK5x2 = iVar2.YZjbz8VdP5.xqGvceK5x(i3);
        if (xqGvceK5x2 != -1) {
        }
        str = (String) n4.rQPn8YBR(d01Var7.uFEq9NpZ(), i01.Yi7zF1RB1);
        if (str != null) {
        }
        syyZR548qbcW3 = syyZR548qbcW2;
        if (iVar2.mE4lRynR) {
        }
        return syyZR548qbcW3;
    }

    @Override // defpackage.um0
    public boolean EljAMC1QTz() {
        return ((um0) this.EljAMC1QTz).EljAMC1QTz();
    }

    @Override // defpackage.op
    public Object GWasM1elztuh() {
        return (pc1) this.EljAMC1QTz;
    }

    public boolean JFJ3QoxA(long j) {
        Object obj;
        List list = (List) ((d) this.AvO7iQsrTN).EljAMC1QTz;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (q70.XnEVoBF0td1l(((mq0) obj).GWasM1elztuh, j)) {
                break;
            }
            i++;
        }
        mq0 mq0Var = (mq0) obj;
        if (mq0Var != null) {
            return mq0Var.encWxUiV2;
        }
        return false;
    }

    public void Mjvvu5DE(Bundle bundle) {
        xw0 xw0Var = (xw0) this.EljAMC1QTz;
        yw0 yw0Var = xw0Var.GWasM1elztuh;
        if (!xw0Var.OOA6hdeuvCS) {
            xw0Var.GWasM1elztuh();
        }
        if (yw0Var.AvO7iQsrTN().encWxUiV2.compareTo(m90.encWxUiV2) >= 0) {
            o4.Mjvvu5DE(yw0Var.AvO7iQsrTN().encWxUiV2, "performRestore cannot be called when owner is ");
            return;
        }
        if (xw0Var.AvO7iQsrTN) {
            o4.jivtDDk9H("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                z50.cilMamHF("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        xw0Var.EljAMC1QTz = bundle2;
        xw0Var.AvO7iQsrTN = true;
    }

    @Override // defpackage.r61
    public void OOA6hdeuvCS(q61 q61Var) {
        zf0 zf0Var = (zf0) this.AvO7iQsrTN;
        zf0Var.GWasM1elztuh();
        bg0 bg0Var = (bg0) q61Var.EljAMC1QTz;
        Object[] objArr = bg0Var.Yi7zF1RB1;
        long[] jArr = bg0Var.X1lG3V04pd;
        int i = bg0Var.OOA6hdeuvCS;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object Yi7zF1RB1 = ((o70) this.EljAMC1QTz).Yi7zF1RB1(obj);
            int xqGvceK5x = zf0Var.xqGvceK5x(Yi7zF1RB1);
            int i3 = xqGvceK5x >= 0 ? zf0Var.X1lG3V04pd[xqGvceK5x] : 0;
            if (i3 == 7) {
                q61Var.remove(obj);
            } else {
                zf0Var.AvO7iQsrTN(i3 + 1, Yi7zF1RB1);
            }
            i = i2;
        }
    }

    public ww0 WIEu4Ya2g8(String str) {
        ww0 ww0Var;
        xw0 xw0Var = (xw0) this.EljAMC1QTz;
        synchronized (xw0Var.X1lG3V04pd) {
            Iterator it = xw0Var.xqGvceK5x.entrySet().iterator();
            do {
                ww0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                ww0 ww0Var2 = (ww0) entry.getValue();
                if (o30.rQPn8YBR(str2, str)) {
                    ww0Var = ww0Var2;
                }
            } while (ww0Var == null);
        }
        return ww0Var;
    }

    @Override // defpackage.um0
    public List X1lG3V04pd(Integer num) {
        List X1lG3V04pd = ((um0) this.EljAMC1QTz).X1lG3V04pd(null);
        c31 c31Var = (c31) this.AvO7iQsrTN;
        int i = c31Var.cilMamHF;
        return i < 0 ? X1lG3V04pd : rb.hOpoc9RpANL(ki1.mE4lRynR(c31Var, num, i, Integer.valueOf(c31Var.ozMwhSAI(c31Var.Yi7zF1RB1, i))), X1lG3V04pd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void XnEVoBF0td1l() {
        Object[] objArr;
        rg0 rg0Var = (rg0) this.EljAMC1QTz;
        Arrays.sort(rg0Var.OOA6hdeuvCS, 0, rg0Var.AvO7iQsrTN, st.xqGvceK5x);
        int i = rg0Var.AvO7iQsrTN;
        g60[] g60VarArr = (g60[]) this.AvO7iQsrTN;
        if (g60VarArr != null) {
            int length = g60VarArr.length;
            objArr = g60VarArr;
        }
        objArr = new g60[Math.max(16, i)];
        this.AvO7iQsrTN = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = rg0Var.OOA6hdeuvCS[i2];
        }
        rg0Var.AvO7iQsrTN();
        while (true) {
            i--;
            if (-1 >= i) {
                this.AvO7iQsrTN = objArr;
                return;
            }
            g60 g60Var = objArr[i];
            g60Var.getClass();
            if (g60Var.VeqTn1PQw7) {
                uFEq9NpZ(g60Var);
            }
            objArr[i] = 0;
        }
    }

    public void Y6hRI1cF8() {
        if (!((xw0) this.EljAMC1QTz).encWxUiV2) {
            o4.jivtDDk9H("Can not perform this action after onSaveInstanceState");
            return;
        }
        it0 it0Var = (it0) this.AvO7iQsrTN;
        if (it0Var == null) {
            it0Var = new it0(this);
        }
        this.AvO7iQsrTN = it0Var;
        try {
            d90.class.getDeclaredConstructor(null);
            it0 it0Var2 = (it0) this.AvO7iQsrTN;
            if (it0Var2 != null) {
                it0Var2.GWasM1elztuh.add(d90.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + d90.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // defpackage.f9
    public void Yi7zF1RB1(View view, float[] fArr) {
        z50.M3K9sHhK(fArr);
        cilMamHF(view, fArr);
    }

    public AutofillId YmKjaVtbfp5Z(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession xqGvceK5x = v9x4KbmAO.xqGvceK5x(this.EljAMC1QTz);
        iriv6doqetn XnEVoBF0td1l = w60.XnEVoBF0td1l((View) this.AvO7iQsrTN);
        Objects.requireNonNull(XnEVoBF0td1l);
        return a4.X1lG3V04pd(xqGvceK5x, n5.GWasM1elztuh(XnEVoBF0td1l.GWasM1elztuh), j);
    }

    @Override // defpackage.p9
    public void cancel() {
        if (((i5) this.AvO7iQsrTN).compareAndSet(1, 1)) {
            return;
        }
        ((t5) this.EljAMC1QTz).GWasM1elztuh();
    }

    public void cilMamHF(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.EljAMC1QTz;
        Object parent = view.getParent();
        if (parent instanceof View) {
            cilMamHF((View) parent, fArr);
            z50.M3K9sHhK(fArr2);
            z50.EXrPz3p7hFb(fArr2, -view.getScrollX(), -view.getScrollY());
            p.mE4lRynR(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            z50.M3K9sHhK(fArr2);
            z50.EXrPz3p7hFb(fArr2, left, top);
            p.mE4lRynR(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.AvO7iQsrTN;
            view.getLocationInWindow(iArr);
            z50.M3K9sHhK(fArr2);
            z50.EXrPz3p7hFb(fArr2, -view.getScrollX(), -view.getScrollY());
            p.mE4lRynR(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            z50.M3K9sHhK(fArr2);
            z50.EXrPz3p7hFb(fArr2, f, f2);
            p.mE4lRynR(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        p.lv06NcmrQ(fArr2, matrix);
        p.mE4lRynR(fArr, fArr2);
    }

    @Override // defpackage.r61
    public boolean encWxUiV2(Object obj, Object obj2) {
        o70 o70Var = (o70) this.EljAMC1QTz;
        return o30.rQPn8YBR(o70Var.Yi7zF1RB1(obj), o70Var.Yi7zF1RB1(obj2));
    }

    public bd0 iwATDS1i01k() {
        return (bd0) ((fo0) this.AvO7iQsrTN).getValue();
    }

    public void jivtDDk9H(String str, ww0 ww0Var) {
        ww0Var.getClass();
        xw0 xw0Var = (xw0) this.EljAMC1QTz;
        synchronized (xw0Var.X1lG3V04pd) {
            if (xw0Var.xqGvceK5x.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            xw0Var.xqGvceK5x.put(str, ww0Var);
        }
    }

    public void mE4lRynR(Bundle bundle) {
        xw0 xw0Var = (xw0) this.EljAMC1QTz;
        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        Bundle bundle2 = xw0Var.EljAMC1QTz;
        if (bundle2 != null) {
            jivtDDk9H.putAll(bundle2);
        }
        synchronized (xw0Var.X1lG3V04pd) {
            for (Map.Entry entry : xw0Var.xqGvceK5x.entrySet()) {
                String str = (String) entry.getKey();
                Bundle GWasM1elztuh = ((ww0) entry.getValue()).GWasM1elztuh();
                str.getClass();
                jivtDDk9H.putBundle(str, GWasM1elztuh);
            }
        }
        if (jivtDDk9H.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", jivtDDk9H);
    }

    @Override // defpackage.bx0
    public Object mOu10nynGul(hw0 hw0Var, Object obj) {
        return ((lv) this.EljAMC1QTz).EljAMC1QTz(hw0Var, obj);
    }

    public Bundle rQPn8YBR(String str) {
        Bundle bundle;
        xw0 xw0Var = (xw0) this.EljAMC1QTz;
        if (!xw0Var.AvO7iQsrTN) {
            o4.jivtDDk9H("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = xw0Var.EljAMC1QTz;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                z50.cilMamHF(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            xw0Var.EljAMC1QTz = null;
        }
        return bundle;
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 23:
                return "Bounds{lower=" + ((e20) this.EljAMC1QTz) + " upper=" + ((e20) this.AvO7iQsrTN) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.bx0
    public Object xqGvceK5x(Object obj) {
        return ((hv) this.AvO7iQsrTN).mOu10nynGul(obj);
    }

    public d(xw0 xw0Var, int i) {
        this.OOA6hdeuvCS = i;
        switch (i) {
            case 18:
                this.EljAMC1QTz = xw0Var;
                this.AvO7iQsrTN = new d(xw0Var, 17);
                break;
            default:
                this.EljAMC1QTz = xw0Var;
                break;
        }
    }

    public d(g60 g60Var, bd0 bd0Var) {
        this.OOA6hdeuvCS = 7;
        this.EljAMC1QTz = g60Var;
        this.AvO7iQsrTN = z50.WRKkgoJXwDn(bd0Var);
    }

    public d(v5 v5Var) {
        this.OOA6hdeuvCS = 3;
        this.EljAMC1QTz = v5Var;
        this.AvO7iQsrTN = new ArrayList();
    }

    public d(t5 t5Var) {
        this.OOA6hdeuvCS = 13;
        this.EljAMC1QTz = t5Var;
        this.AvO7iQsrTN = new i5(0);
    }

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }

    public d(o70 o70Var) {
        this.OOA6hdeuvCS = 8;
        this.EljAMC1QTz = o70Var;
        zf0 zf0Var = pk0.GWasM1elztuh;
        this.AvO7iQsrTN = new zf0();
    }

    public d(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.OOA6hdeuvCS = 23;
        lowerBound = bounds.getLowerBound();
        this.EljAMC1QTz = e20.X1lG3V04pd(lowerBound);
        upperBound = bounds.getUpperBound();
        this.AvO7iQsrTN = e20.X1lG3V04pd(upperBound);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(i iVar) {
        this(0);
        this.OOA6hdeuvCS = 0;
        this.AvO7iQsrTN = iVar;
    }

    public d(float[] fArr) {
        this.OOA6hdeuvCS = 1;
        this.EljAMC1QTz = fArr;
        this.AvO7iQsrTN = new int[2];
    }
}
