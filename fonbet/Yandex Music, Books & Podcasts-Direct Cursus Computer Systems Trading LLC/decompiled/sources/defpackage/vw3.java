package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class vw3 {
    public final cr a;
    public jw3 b;
    public final CardNumberInput c;
    public final ExpirationDateInput d;
    public final CvnInput e;
    public s30 f;
    public Function1 g;
    public Function1 h;
    public ww3 i;
    public final long j;
    public boolean k;

    public vw3(cr crVar, zx3 zx3Var, boolean z) {
        crVar.getClass();
        this.a = crVar;
        this.b = jw3.a;
        CardNumberInput cardNumberInput = (CardNumberInput) crVar.c;
        this.c = cardNumberInput;
        ExpirationDateInput expirationDateInput = (ExpirationDateInput) crVar.h;
        this.d = expirationDateInput;
        CvnInput cvnInput = (CvnInput) crVar.f;
        this.e = cvnInput;
        ImageView imageView = (ImageView) crVar.e;
        this.j = ((xw3) crVar.b).getResources().getInteger(R.integer.paymentsdk_prebuilt_card_number_animation_duration);
        cardNumberInput.setEnableDebranding(z);
        cardNumberInput.setValidator(zx3Var.a);
        int i = 0;
        cardNumberInput.setOnFinish(new rw3(this, i));
        int i2 = 1;
        cardNumberInput.setOnCardTypeChangedListener(new rw3(this, i2));
        cardNumberInput.setOnFocus(new ha0(22, cardNumberInput, this));
        cardNumberInput.setCallback(new sw3(this, i));
        cardNumberInput.setOnKeyboardAction(new sw3(this, i2));
        expirationDateInput.setValidator(zx3Var.b);
        int i3 = 2;
        expirationDateInput.setCallback(new rw3(this, i3));
        expirationDateInput.setOnKeyboardAction(new sw3(this, i3));
        cvnInput.setValidator(zx3Var.c);
        cvnInput.setCallback(new sw3(this, 3));
        imageView.setVisibility(8);
        imageView.setOnClickListener(new pw3(this));
    }

    public static final void a(vw3 vw3Var) {
        vw3Var.e((vw3Var.c.n && vw3Var.d.a() && vw3Var.e.c() == null) ? jw3.d : jw3.c);
        vw3Var.b();
    }

    public final void b() {
        boolean hasError = this.e.getHasError();
        boolean hasError2 = this.d.getHasError();
        boolean hasError3 = this.c.getHasError();
        jw3 jw3Var = this.b;
        Integer num = null;
        if (jw3Var == jw3.a || jw3Var == jw3.b) {
            Integer valueOf = Integer.valueOf(R.string.paymentsdk_prebuilt_wrong_card_number_try_again_message);
            if (hasError3) {
                num = valueOf;
            }
        } else if (hasError && hasError2) {
            num = Integer.valueOf(R.string.paymentsdk_prebuilt_wrong_date_and_code_try_again_message);
        } else if (hasError) {
            num = Integer.valueOf(R.string.paymentsdk_prebuilt_wrong_code_try_again_message);
        } else if (hasError2) {
            num = Integer.valueOf(R.string.paymentsdk_prebuilt_wrong_date_try_again_message);
        }
        cr crVar = this.a;
        if (num == null) {
            ((TextView) crVar.g).setVisibility(8);
            return;
        }
        xw3 xw3Var = (xw3) crVar.b;
        TextView textView = (TextView) crVar.g;
        String string = xw3Var.getContext().getResources().getString(num.intValue());
        string.getClass();
        ww3 ww3Var = this.i;
        if (ww3Var != null) {
            ww3Var.invoke(new ine(string));
        }
        textView.setText(string);
        textView.setVisibility(0);
    }

    public final void c() {
        if (this.b == jw3.b) {
            if (this.d.a()) {
                CvnInput cvnInput = this.e;
                if (cvnInput.c() == null) {
                    e(jw3.d);
                    cvnInput.a();
                    return;
                }
            }
            e(jw3.c);
            b();
        }
    }

    public final void d(boolean z) {
        cr crVar = this.a;
        ((ExpirationDateInput) crVar.h).setVisibility(z ? 0 : 8);
        ((CvnInput) crVar.f).setVisibility(z ? 0 : 8);
        ((Space) crVar.i).setVisibility(z ? 0 : 8);
        ((Space) crVar.d).setVisibility(z ? 0 : 8);
    }

    public final void e(jw3 jw3Var) {
        jw3 jw3Var2 = this.b;
        if (jw3Var == jw3Var2) {
            return;
        }
        final int i = 1;
        final int i2 = 0;
        boolean z = jw3Var == jw3.c || jw3Var == jw3.d;
        boolean z2 = jw3Var2 == jw3.a || jw3Var2 == jw3.b;
        long j = this.j;
        cr crVar = this.a;
        if (z && z2) {
            d(true);
            ValueAnimator ofInt = ValueAnimator.ofInt(((CardNumberInput) crVar.c).getWidth(), ((xw3) crVar.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_card_number_input_collapsed_width));
            ofInt.setDuration(j);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qw3
                public final /* synthetic */ vw3 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            valueAnimator.getClass();
                            CardNumberInput cardNumberInput = (CardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams = cardNumberInput.getLayoutParams();
                            if (layoutParams == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                layoutParams.width = ((Integer) animatedValue).intValue();
                                cardNumberInput.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            valueAnimator.getClass();
                            CardNumberInput cardNumberInput2 = (CardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams2 = cardNumberInput2.getLayoutParams();
                            if (layoutParams2 == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                cardNumberInput2.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt.start();
            ofInt.addListener(new tw3(this, i2));
            ((EditText) this.c.a.c).clearFocus();
            ExpirationDateInput expirationDateInput = this.d;
            if (expirationDateInput.a()) {
                this.e.a();
            } else {
                expirationDateInput.requestFocus();
                qgg.d0((EditText) expirationDateInput.a.b);
            }
        } else if (!z && !z2) {
            d(false);
            TextView textView = (TextView) crVar.g;
            CardNumberInput cardNumberInput = (CardNumberInput) crVar.c;
            textView.setVisibility(8);
            cardNumberInput.setState(fx3.a);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(cardNumberInput.getWidth(), ((xw3) crVar.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_card_number_input_expanded_width));
            ofInt2.setDuration(j);
            ofInt2.setInterpolator(new DecelerateInterpolator());
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qw3
                public final /* synthetic */ vw3 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            valueAnimator.getClass();
                            CardNumberInput cardNumberInput2 = (CardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams = cardNumberInput2.getLayoutParams();
                            if (layoutParams == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                layoutParams.width = ((Integer) animatedValue).intValue();
                                cardNumberInput2.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            valueAnimator.getClass();
                            CardNumberInput cardNumberInput22 = (CardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams2 = cardNumberInput22.getLayoutParams();
                            if (layoutParams2 == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                cardNumberInput22.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt2.start();
            ofInt2.addListener(new tw3(this, i));
        }
        s30 s30Var = this.f;
        if (s30Var != null) {
            s30Var.invoke(this.b, jw3Var);
        }
        this.b = jw3Var;
    }
}
