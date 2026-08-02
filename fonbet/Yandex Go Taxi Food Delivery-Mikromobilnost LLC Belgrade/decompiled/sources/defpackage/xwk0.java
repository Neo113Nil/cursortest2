package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import flex.animation.generic.internal.ExtensionsKt$createOnEndAnimatorListener$1;
import flex.animation.player.interpolator.InterpolationType;

/* loaded from: classes4.dex */
public final class xwk0 implements xh2 {
    public final myu0 a;
    public final iuw b;
    public ObjectAnimator c;

    public xwk0(myu0 myu0Var) {
        iuw iuwVar = new iuw();
        this.a = myu0Var;
        this.b = iuwVar;
    }

    @Override // defpackage.xh2
    public final /* bridge */ /* synthetic */ void a(tg2 tg2Var, ryh ryhVar, o530 o530Var) {
        b((wwk0) tg2Var, ryhVar);
    }

    public final void b(wwk0 wwk0Var, ryh ryhVar) {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        kyu0 a = this.a.a();
        View r = ryhVar.r();
        Property property = View.ROTATION;
        axk0 axk0Var = wwk0Var.e;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r, (Property<View, Float>) property, axk0Var.a, axk0Var.b);
        ofFloat.setDuration(wwk0Var.b);
        ofFloat.setStartDelay(wwk0Var.c);
        InterpolationType interpolationType = wwk0Var.d;
        this.b.getClass();
        ofFloat.setInterpolator(iuw.a(interpolationType));
        ofFloat.addListener(new ExtensionsKt$createOnEndAnimatorListener$1(new hu1(a, 1)));
        ofFloat.start();
        this.c = ofFloat;
    }
}
