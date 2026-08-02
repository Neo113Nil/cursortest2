package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import flex.animation.generic.internal.ExtensionsKt$createOnEndAnimatorListener$1;
import flex.animation.player.interpolator.InterpolationType;

/* loaded from: classes4.dex */
public final class vy01 implements xh2 {
    public final myu0 a;
    public final iuw b;
    public ObjectAnimator c;
    public ObjectAnimator d;

    public vy01(myu0 myu0Var) {
        iuw iuwVar = new iuw();
        this.a = myu0Var;
        this.b = iuwVar;
    }

    @Override // defpackage.xh2
    public final /* bridge */ /* synthetic */ void a(tg2 tg2Var, ryh ryhVar, o530 o530Var) {
        b((uy01) tg2Var, ryhVar);
    }

    public final void b(uy01 uy01Var, ryh ryhVar) {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.d;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        myu0 myu0Var = this.a;
        kyu0 a = myu0Var.a();
        View r = ryhVar.r();
        Property property = View.TRANSLATION_X;
        yy01 yy01Var = uy01Var.e;
        InterpolationType interpolationType = uy01Var.d;
        long j = uy01Var.c;
        long j2 = uy01Var.b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r, (Property<View, Float>) property, yy01Var.a.a, yy01Var.b.a);
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j);
        this.b.getClass();
        ofFloat.setInterpolator(iuw.a(interpolationType));
        ofFloat.addListener(new ExtensionsKt$createOnEndAnimatorListener$1(new hu1(a, 4)));
        ofFloat.start();
        this.c = ofFloat;
        kyu0 a2 = myu0Var.a();
        View r2 = ryhVar.r();
        Property property2 = View.TRANSLATION_Y;
        yy01 yy01Var2 = uy01Var.e;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r2, (Property<View, Float>) property2, yy01Var2.a.b, yy01Var2.b.b);
        ofFloat2.setDuration(j2);
        ofFloat2.setStartDelay(j);
        ofFloat2.setInterpolator(iuw.a(interpolationType));
        ofFloat2.addListener(new ExtensionsKt$createOnEndAnimatorListener$1(new hu1(a2, 5)));
        ofFloat2.start();
        this.d = ofFloat2;
    }
}
