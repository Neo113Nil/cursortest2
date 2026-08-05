package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ iv NCTxEWno;
    public final /* synthetic */ float qoPGr6Ce;

    public gv(iv ivVar, float f) {
        this.NCTxEWno = ivVar;
        this.qoPGr6Ce = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.NCTxEWno.wxUZMvaN(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.qoPGr6Ce);
    }
}
