package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ bc(ya0 ya0Var, View view) {
        this.qoPGr6Ce = 2;
        this.NCTxEWno = ya0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                ec ecVar = (ec) obj;
                ecVar.OxcuoDLp.wxUZMvaN = ecVar.RXQxj5Oe.getInterpolation(ecVar.I5GHvsYW.getAnimatedFraction());
                break;
            case 1:
                lr lrVar = (lr) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lrVar.k3x7lurq.setAlpha((int) (255.0f * floatValue));
                lrVar.WYNAV5pd = floatValue;
                break;
            default:
                ((View) ((zh0) ((ya0) obj).MdtA4re8).wxUZMvaN.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ bc(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }
}
