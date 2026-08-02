package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.TransitionDrawable;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import ru.yandex.taxi.design.button.OrderButtonComponent;

/* loaded from: classes6.dex */
public final class ri70 extends dv31 {
    public final OrderButtonComponent k;
    public final ArgbEvaluatorCompat l;
    public final TransitionDrawable m;
    public final RippleDrawable n;
    public int o;
    public int p;
    public int q;

    public ri70(OrderButtonComponent orderButtonComponent) {
        super(orderButtonComponent, bj70.d);
        this.k = orderButtonComponent;
        this.l = ArgbEvaluatorCompat.getInstance();
        TransitionDrawable transitionDrawable = new TransitionDrawable(new ColorDrawable[]{new ColorDrawable(0), new ColorDrawable(0)});
        this.m = transitionDrawable;
        ColorStateList valueOf = ColorStateList.valueOf(orderButtonComponent.getContext().getColor(mqg0.black_alpha10));
        transitionDrawable.setCrossFadeEnabled(true);
        this.n = new RippleDrawable(valueOf, transitionDrawable, null);
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
        this.o = this.q;
        this.p = s8o.m(((bj70) obj2).b, this.k.getContext());
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        Drawable colorDrawable;
        pi70 pi70Var = ((bj70) obj2).a;
        if (pi70Var instanceof ni70) {
            colorDrawable = ((ni70) pi70Var).a;
        } else {
            if (!(pi70Var instanceof oi70)) {
                w511.b();
                return;
            }
            colorDrawable = new ColorDrawable(s8o.m(((oi70) pi70Var).a, this.k.getContext()));
        }
        boolean z = this.f;
        TransitionDrawable transitionDrawable = this.m;
        if (z) {
            transitionDrawable.setDrawable(0, transitionDrawable.getDrawable(1));
            transitionDrawable.setDrawable(1, colorDrawable);
            transitionDrawable.startTransition((int) this.h);
        } else {
            transitionDrawable.setDrawable(0, colorDrawable);
            transitionDrawable.setDrawable(1, colorDrawable);
            transitionDrawable.resetTransition();
        }
    }

    @Override // defpackage.dv31
    public final void f(float f) {
        int i = this.q;
        int intValue = this.l.evaluate(f, Integer.valueOf(this.o), Integer.valueOf(this.p)).intValue();
        this.q = intValue;
        if (i != intValue) {
            OrderButtonComponent orderButtonComponent = this.k;
            orderButtonComponent.setTitleTextColor(intValue);
            orderButtonComponent.setSubtitleTextColor(this.q);
        }
    }
}
