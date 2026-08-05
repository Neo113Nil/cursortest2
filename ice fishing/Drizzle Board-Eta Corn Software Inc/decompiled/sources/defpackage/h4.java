package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h4 extends rd0 {
    public static final String[] i7xS8jrb = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final d4 Mq3SeTnW = new d4(PointF.class, "topLeft", 0);
    public static final d4 euDDoUNr = new d4(PointF.class, "bottomRight", 1);
    public static final d4 SgZGMMPL = new d4(PointF.class, "bottomRight", 2);
    public static final d4 ytu5o6f4 = new d4(PointF.class, "topLeft", 3);
    public static final d4 eIA6dogk = new d4(PointF.class, "position", 4);

    public static void VhgXwMj9(zd0 zd0Var) {
        View view = zd0Var.NCTxEWno;
        HashMap hashMap = zd0Var.qoPGr6Ce;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.rd0
    public final String[] amk52bBQ() {
        return i7xS8jrb;
    }

    @Override // defpackage.rd0
    public final void b2ZJblxo(zd0 zd0Var) {
        VhgXwMj9(zd0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rd0
    public final Animator k3x7lurq(ViewGroup viewGroup, zd0 zd0Var, zd0 zd0Var2) {
        int i;
        h4 h4Var;
        ObjectAnimator qoPGr6Ce;
        if (zd0Var == null) {
            return null;
        }
        HashMap hashMap = zd0Var.qoPGr6Ce;
        if (zd0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = zd0Var2.qoPGr6Ce;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = zd0Var2.NCTxEWno;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        eh0.qoPGr6Ce(view, i2, i4, i6, i8);
        if (i14 != 2) {
            h4Var = this;
            if (i2 == i3 && i4 == i5) {
                h4Var.gjV1z5T1.getClass();
                qoPGr6Ce = lw.qoPGr6Ce(view, SgZGMMPL, k00.NCTxEWno(i6, i8, i7, i9));
            } else {
                h4Var.gjV1z5T1.getClass();
                qoPGr6Ce = lw.qoPGr6Ce(view, ytu5o6f4, k00.NCTxEWno(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            h4Var = this;
            h4Var.gjV1z5T1.getClass();
            qoPGr6Ce = lw.qoPGr6Ce(view, eIA6dogk, k00.NCTxEWno(i2, i4, i3, i5));
        } else {
            h4Var = this;
            g4 g4Var = new g4(view);
            h4Var.gjV1z5T1.getClass();
            ObjectAnimator qoPGr6Ce2 = lw.qoPGr6Ce(g4Var, Mq3SeTnW, k00.NCTxEWno(i2, i4, i3, i5));
            h4Var.gjV1z5T1.getClass();
            ObjectAnimator qoPGr6Ce3 = lw.qoPGr6Ce(g4Var, euDDoUNr, k00.NCTxEWno(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(qoPGr6Ce2, qoPGr6Ce3);
            animatorSet.addListener(new e4(g4Var));
            qoPGr6Ce = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            e50.lDXGDhIF(viewGroup4, true);
            h4Var.sjUBp5pO().qoPGr6Ce(new f4(viewGroup4));
        }
        return qoPGr6Ce;
    }

    @Override // defpackage.rd0
    public final void wxUZMvaN(zd0 zd0Var) {
        VhgXwMj9(zd0Var);
    }
}
