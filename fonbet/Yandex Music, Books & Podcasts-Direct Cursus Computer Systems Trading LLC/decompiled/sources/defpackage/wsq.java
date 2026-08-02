package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class wsq extends niu {
    public static final DecelerateInterpolator K = new DecelerateInterpolator();
    public static final AccelerateInterpolator L = new AccelerateInterpolator();
    public static final bsq X = new bsq();
    public final esq J = X;

    public wsq() {
        this.x = new e88(8);
    }

    @Override // defpackage.niu
    public final ObjectAnimator X(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) b9tVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return gut.v(view, b9tVar2, iArr[0], iArr[1], this.J.b(viewGroup, view), this.J.a(viewGroup, view), translationX, translationY, K, this);
    }

    @Override // defpackage.niu
    public final ObjectAnimator Z(ViewGroup viewGroup, View view, b9t b9tVar, b9t b9tVar2) {
        if (b9tVar == null) {
            return null;
        }
        int[] iArr = (int[]) b9tVar.a.get("android:slide:screenPosition");
        return gut.v(view, b9tVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.J.b(viewGroup, view), this.J.a(viewGroup, view), L, this);
    }

    @Override // defpackage.niu, defpackage.b8t
    public final void g(b9t b9tVar) {
        niu.U(b9tVar);
        int[] iArr = new int[2];
        b9tVar.b.getLocationOnScreen(iArr);
        b9tVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.b8t
    public final void j(b9t b9tVar) {
        niu.U(b9tVar);
        int[] iArr = new int[2];
        b9tVar.b.getLocationOnScreen(iArr);
        b9tVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.b8t
    public final boolean y() {
        return true;
    }
}
