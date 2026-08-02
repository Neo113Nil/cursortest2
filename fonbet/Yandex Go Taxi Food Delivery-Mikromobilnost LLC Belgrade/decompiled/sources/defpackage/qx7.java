package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.widget.timeline.TimelineBar;

/* loaded from: classes14.dex */
public final /* synthetic */ class qx7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qx7(a431 a431Var, int i) {
        this.a = 2;
        this.c = a431Var;
        this.b = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CancelReasonsV1View.ReasonsAdapter.bindView$lambda$0(i2, (ListItemCheckComponent) obj, valueAnimator);
                break;
            case 1:
                TimelineBar.startSpaceAnimation$lambda$0(i2, (TimelineBar) obj, valueAnimator);
                break;
            default:
                a431 a431Var = (a431) obj;
                int G = a431Var.G();
                View view = a431Var.a;
                if (G >= i2) {
                    if (a431Var.G() <= i2) {
                        view.setTranslationX(0.0f);
                        break;
                    } else {
                        view.setTranslationX((((Float) valueAnimator.getAnimatedValue()).floatValue() * tje.u(10, view.getContext())) + view.getTranslationX());
                        break;
                    }
                } else {
                    view.setTranslationX(view.getTranslationX() - (((Float) valueAnimator.getAnimatedValue()).floatValue() * tje.u(10, view.getContext())));
                    break;
                }
        }
    }

    public /* synthetic */ qx7(int i, int i2, View view) {
        this.a = i2;
        this.b = i;
        this.c = view;
    }
}
