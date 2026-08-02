package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class tw3 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vw3 b;

    public /* synthetic */ tw3(vw3 vw3Var, int i) {
        this.a = i;
        this.b = vw3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        vw3 vw3Var = this.b;
        switch (i) {
            case 0:
                cr crVar = vw3Var.a;
                CardNumberInput cardNumberInput = (CardNumberInput) crVar.c;
                ViewGroup.LayoutParams layoutParams = cardNumberInput.getLayoutParams();
                if (layoutParams == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    break;
                } else {
                    layoutParams.width = ((xw3) crVar.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_card_number_input_collapsed_width);
                    cardNumberInput.setLayoutParams(layoutParams);
                    ((CardNumberInput) crVar.c).setState(fx3.b);
                    break;
                }
            default:
                cr crVar2 = vw3Var.a;
                CardNumberInput cardNumberInput2 = (CardNumberInput) crVar2.c;
                ViewGroup.LayoutParams layoutParams2 = cardNumberInput2.getLayoutParams();
                if (layoutParams2 == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    break;
                } else {
                    layoutParams2.width = ((xw3) crVar2.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_card_number_input_expanded_width);
                    cardNumberInput2.setLayoutParams(layoutParams2);
                    break;
                }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
