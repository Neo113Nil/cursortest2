package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import flex.animation.generic.internal.ExtensionsKt$createOnEndAnimatorListener$1;
import flex.animation.player.interpolator.InterpolationType;

/* loaded from: classes4.dex */
public final class vkm0 implements xh2 {
    public final myu0 a;
    public final iuw b;
    public ObjectAnimator c;
    public ObjectAnimator d;

    public vkm0(myu0 myu0Var) {
        iuw iuwVar = new iuw();
        this.a = myu0Var;
        this.b = iuwVar;
    }

    @Override // defpackage.xh2
    public final /* bridge */ /* synthetic */ void a(tg2 tg2Var, ryh ryhVar, o530 o530Var) {
        b((ukm0) tg2Var, ryhVar);
    }

    public final void b(ukm0 ukm0Var, ryh ryhVar) {
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
        Property property = View.SCALE_X;
        ykm0 ykm0Var = ukm0Var.e;
        InterpolationType interpolationType = ukm0Var.d;
        long j = ukm0Var.c;
        long j2 = ukm0Var.b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r, (Property<View, Float>) property, ykm0Var.a.a, ykm0Var.b.a);
        ofFloat.setDuration(j2);
        ofFloat.setStartDelay(j);
        this.b.getClass();
        ofFloat.setInterpolator(iuw.a(interpolationType));
        ofFloat.addListener(new ExtensionsKt$createOnEndAnimatorListener$1(new hu1(a, 2)));
        ofFloat.start();
        this.c = ofFloat;
        kyu0 a2 = myu0Var.a();
        View r2 = ryhVar.r();
        Property property2 = View.SCALE_Y;
        ykm0 ykm0Var2 = ukm0Var.e;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r2, (Property<View, Float>) property2, ykm0Var2.a.b, ykm0Var2.b.b);
        ofFloat2.setDuration(j2);
        ofFloat2.setStartDelay(j);
        ofFloat2.setInterpolator(iuw.a(interpolationType));
        ofFloat2.addListener(new ExtensionsKt$createOnEndAnimatorListener$1(new hu1(a2, 3)));
        ofFloat2.start();
        this.d = ofFloat2;
    }
}
