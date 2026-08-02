package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.xv1;
import defpackage.zy11;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class xv1 extends lys {
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int S;
    public final tls T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv1(oqw0 oqw0Var, tls tlsVar) {
        super(oqw0Var);
        this.S = 1;
        this.T = tlsVar;
        b.q(oqw0Var.e, true);
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                xel0 xel0Var = (xel0) obj;
                zv1 zv1Var = (zv1) ((zo31) obj2);
                cv1 cv1Var = xel0Var.a;
                b6l0 b6l0Var = cv1Var.d;
                String str = cv1Var.a;
                boolean z = cv1Var.b;
                RobotoTextView robotoTextView = zv1Var.c;
                RobotoTextView robotoTextView2 = zv1Var.c;
                GoConstraintLayout goConstraintLayout = zv1Var.a;
                robotoTextView.setText(b6l0Var.b);
                RobotoTextView robotoTextView3 = zv1Var.b;
                robotoTextView3.setText(b6l0Var.a);
                boolean z2 = xel0Var.a.c;
                GoImageView goImageView = zv1Var.d;
                if (z2) {
                    goImageView.setVisibility(0);
                    goImageView.setImageResource(v2h0.ic_green_route);
                } else {
                    goImageView.setVisibility(8);
                }
                if (z) {
                    goConstraintLayout.setBackgroundAttr(xng0.controlMinor);
                    robotoTextView2.setTextTypeface(3);
                    robotoTextView2.setTextColor(new bdc(xng0.textOnControlMinor));
                    robotoTextView3.setTextTypeface(3);
                    robotoTextView3.setTextColor(new bdc(xng0.textOnControlMinor));
                } else {
                    goConstraintLayout.setBackgroundResource(dzg0.bg_transparent_ripple);
                    robotoTextView2.setTextTypeface(0);
                    robotoTextView2.setTextColor(new bdc(xng0.textMinor));
                    robotoTextView3.setTextTypeface(0);
                    robotoTextView3.setTextColor(new bdc(xng0.textMinor));
                }
                c.z(new j0(24, this, str), goConstraintLayout);
                break;
            case 1:
                final cau cauVar = (cau) obj;
                oqw0 oqw0Var = (oqw0) ((zo31) obj2);
                AppCompatImageView appCompatImageView = oqw0Var.d;
                RobotoTextView robotoTextView4 = oqw0Var.b;
                RobotoTextView robotoTextView5 = oqw0Var.c;
                Drawable drawable = cauVar.a;
                String str2 = cauVar.b;
                CharSequence charSequence = cauVar.e;
                appCompatImageView.setVisibility(drawable != null ? 0 : 8);
                appCompatImageView.setImageDrawable(cauVar.a);
                oqw0Var.e.setText(seb1.c(cauVar.d));
                robotoTextView4.setText(charSequence);
                robotoTextView4.setVisibility(!evu0.J(charSequence) ? 0 : 8);
                robotoTextView5.setVisibility((str2.length() <= 0 || cauVar.c.length() <= 0 || appCompatImageView.getVisibility() != 0) ? 8 : 0);
                robotoTextView5.setText(seb1.c(str2));
                c.z(new sls() { // from class: ru.yandex.taxi.surge.dialog.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        ((SurgeInfoModalView$createAdapter$1) xv1.this.T).invoke(cauVar.c);
                        return zy11.a;
                    }
                }, robotoTextView5);
                break;
            case 2:
                final vau0 vau0Var = (vau0) obj;
                yau0 yau0Var = (yau0) ((zo31) obj2);
                yau0Var.b.setButtonBackground(vau0Var.c);
                ButtonComponent buttonComponent = yau0Var.b;
                buttonComponent.setButtonTitleColor(vau0Var.b);
                buttonComponent.setText(vau0Var.a);
                buttonComponent.setDebounceClickListener(new Runnable() { // from class: ru.yandex.taxi.communications.stepsinstructions.modal.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((StepsInstructionsModalView$stepsAdapter$1) xv1.this.T).invoke(vau0Var.d);
                    }
                });
                boolean z3 = vau0Var.e;
                float f = z3 ? 18.5f : 4.0f;
                int i2 = z3 ? 0 : 16;
                ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    View view = this.a;
                    marginLayoutParams.setMargins(c.h(8, view), tje.v(view.getContext(), f), tje.u(8, view.getContext()), tje.u(i2, view.getContext()));
                    buttonComponent.setLayoutParams(marginLayoutParams);
                    buttonComponent.setAccent(vau0Var.f);
                    break;
                }
            default:
                final qbu0 qbu0Var = (qbu0) obj;
                SliderButtonView sliderButtonView = ((mbu0) ((zo31) obj2)).b;
                CharSequence charSequence2 = qbu0Var.a;
                j37 j37Var = qbu0Var.d;
                sliderButtonView.setTitleIdle(charSequence2);
                CharSequence charSequence3 = qbu0Var.b;
                if (charSequence3 != null) {
                    sliderButtonView.setSubtitleIdle(charSequence3);
                }
                sliderButtonView.setTrackBackgroundColor(s8o.m(j37Var.a, sliderButtonView.getContext()));
                sliderButtonView.setTextColor(j37Var.b);
                sliderButtonView.setSlideFinishedListener(new eps0() { // from class: ru.yandex.taxi.communications.stepsinstructions.modal.b
                    @Override // defpackage.eps0
                    public final void p(int i3, long j) {
                        ((StepsInstructionsModalView$stepsAdapter$1) xv1.this.T).invoke(qbu0Var.c);
                    }
                });
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv1(zo31 zo31Var, tls tlsVar, int i) {
        super(zo31Var);
        this.S = i;
        this.T = tlsVar;
    }
}
