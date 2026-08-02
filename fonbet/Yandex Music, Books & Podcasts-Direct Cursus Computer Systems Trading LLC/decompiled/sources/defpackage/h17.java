package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class h17 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j17 b;

    public /* synthetic */ h17(j17 j17Var, int i) {
        this.a = i;
        this.b = j17Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        j17 j17Var = this.b;
        switch (i) {
            case 0:
                mmo mmoVar = j17Var.a;
                DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) mmoVar.c;
                ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                if (layoutParams == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    break;
                } else {
                    layoutParams.width = ((k17) mmoVar.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_dk_card_number_input_collapsed_width);
                    dKCardNumberInput.setLayoutParams(layoutParams);
                    ((DKCardNumberInput) mmoVar.c).setState(l17.b);
                    break;
                }
            default:
                ImageView imageView = j17Var.h;
                mmo mmoVar2 = j17Var.a;
                DKCardNumberInput dKCardNumberInput2 = (DKCardNumberInput) mmoVar2.c;
                ViewGroup.LayoutParams layoutParams2 = dKCardNumberInput2.getLayoutParams();
                if (layoutParams2 == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    break;
                } else {
                    layoutParams2.width = -1;
                    dKCardNumberInput2.setLayoutParams(layoutParams2);
                    imageView.setVisibility(((DKCardNumberInput) mmoVar2.c).getCardNumber().length() > 0 ? 0 : 8);
                    j17Var.g.setVisibility(imageView.getVisibility() != 0 ? 0 : 8);
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
