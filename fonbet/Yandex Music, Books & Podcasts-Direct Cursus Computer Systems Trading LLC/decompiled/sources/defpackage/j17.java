package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Space;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class j17 {
    public final mmo a;
    public final boolean b;
    public jw3 c;
    public final DKCardNumberInput d;
    public final DKExpirationDateInput e;
    public final DKCvnInput f;
    public final ImageView g;
    public final ImageView h;
    public final long i;
    public s30 j;
    public Function1 k;
    public Function1 l;
    public Function1 m;
    public ww3 n;
    public boolean o;

    public j17(mmo mmoVar, zx3 zx3Var, boolean z, boolean z2) {
        mmoVar.getClass();
        this.a = mmoVar;
        this.b = z2;
        this.c = jw3.a;
        DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) mmoVar.c;
        this.d = dKCardNumberInput;
        DKExpirationDateInput dKExpirationDateInput = (DKExpirationDateInput) mmoVar.f;
        this.e = dKExpirationDateInput;
        DKCvnInput dKCvnInput = (DKCvnInput) mmoVar.e;
        this.f = dKCvnInput;
        ImageView scannerImageView = dKCardNumberInput.getScannerImageView();
        this.g = scannerImageView;
        ImageView clearInputView = dKCardNumberInput.getClearInputView();
        this.h = clearInputView;
        this.i = ((k17) mmoVar.b).getResources().getInteger(R.integer.paymentsdk_prebuilt_card_number_animation_duration);
        dKCardNumberInput.setEnableDebranding(z);
        dKCardNumberInput.setValidator(zx3Var.a);
        final int i = 0;
        dKCardNumberInput.setOnFinish(new f17(this, i));
        final int i2 = 1;
        dKCardNumberInput.setOnEmpty(new f17(this, i2));
        int i3 = 2;
        dKCardNumberInput.setOnCardTypeChangedListener(new f17(this, i3));
        dKCardNumberInput.setOnFocus(new qs6(4, dKCardNumberInput, this));
        dKCardNumberInput.setCallback(new g17(this, i));
        dKCardNumberInput.setOnKeyboardAction(new g17(this, i2));
        dKExpirationDateInput.setValidator(zx3Var.b);
        int i4 = 3;
        dKExpirationDateInput.setCallback(new f17(this, i4));
        dKExpirationDateInput.setOnKeyboardAction(new g17(this, i3));
        dKCvnInput.setValidator(zx3Var.c);
        dKCvnInput.setNoCvvMirEnabled(z2);
        dKCvnInput.setCallback(new g17(this, i4));
        dKCvnInput.setOnKeyboardAction(new g17(this, 4));
        clearInputView.setVisibility(dKCardNumberInput.getCardNumber().length() > 0 ? 0 : 8);
        clearInputView.setOnClickListener(new View.OnClickListener(this) { // from class: d17
            public final /* synthetic */ j17 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i;
                j17 j17Var = this.b;
                switch (i5) {
                    case 0:
                        DKCardNumberInput dKCardNumberInput2 = j17Var.d;
                        dKCardNumberInput2.getClass();
                        dKCardNumberInput2.setState(l17.a);
                        dKCardNumberInput2.m = null;
                        rdk rdkVar = dKCardNumberInput2.a;
                        ((EditText) rdkVar.g).setText((CharSequence) null);
                        dKCardNumberInput2.o = false;
                        dKCardNumberInput2.requestFocus();
                        vwb.W((EditText) rdkVar.g);
                        break;
                    default:
                        ww3 ww3Var = j17Var.n;
                        if (ww3Var != null) {
                            kl3 kl3Var = kl3.SCANNER_BUTTON;
                            ww3Var.invoke(new gne());
                            break;
                        }
                        break;
                }
            }
        });
        scannerImageView.setVisibility(8);
        scannerImageView.setOnClickListener(new View.OnClickListener(this) { // from class: d17
            public final /* synthetic */ j17 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                j17 j17Var = this.b;
                switch (i5) {
                    case 0:
                        DKCardNumberInput dKCardNumberInput2 = j17Var.d;
                        dKCardNumberInput2.getClass();
                        dKCardNumberInput2.setState(l17.a);
                        dKCardNumberInput2.m = null;
                        rdk rdkVar = dKCardNumberInput2.a;
                        ((EditText) rdkVar.g).setText((CharSequence) null);
                        dKCardNumberInput2.o = false;
                        dKCardNumberInput2.requestFocus();
                        vwb.W((EditText) rdkVar.g);
                        break;
                    default:
                        ww3 ww3Var = j17Var.n;
                        if (ww3Var != null) {
                            kl3 kl3Var = kl3.SCANNER_BUTTON;
                            ww3Var.invoke(new gne());
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static final void a(j17 j17Var) {
        j17Var.f((j17Var.d.o && j17Var.e.a() && j17Var.f.c() == null) ? jw3.d : jw3.c);
        j17Var.c();
    }

    public final g3j b() {
        DKCardNumberInput dKCardNumberInput = this.d;
        if (!dKCardNumberInput.o) {
            return null;
        }
        DKExpirationDateInput dKExpirationDateInput = this.e;
        if (!dKExpirationDateInput.a()) {
            return null;
        }
        DKCvnInput dKCvnInput = this.f;
        if (dKCvnInput.c() == null) {
            return new g3j(dKCardNumberInput.getCardNumber(), dKExpirationDateInput.getExpirationMonth(), dKExpirationDateInput.getExpirationYear(), dKCvnInput.getCvn(), this.o, cm2.UnknownBank);
        }
        return null;
    }

    public final void c() {
        boolean hasError = this.f.getHasError();
        boolean hasError2 = this.e.getHasError();
        boolean hasError3 = this.d.getHasError();
        jw3 jw3Var = this.c;
        ene eneVar = ((jw3Var == jw3.a || jw3Var == jw3.b) && hasError3) ? ene.f : (hasError && hasError2) ? ene.e : hasError ? ene.c : hasError2 ? ene.d : ene.b;
        Function1 function1 = this.k;
        if (function1 != null) {
            function1.invoke(eneVar);
        }
    }

    public final void d() {
        if (this.c != jw3.b) {
            k17 k17Var = (k17) this.a.b;
            Object systemService = k17Var.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(k17Var.getWindowToken(), 0);
                return;
            }
            return;
        }
        if (this.e.a()) {
            DKCvnInput dKCvnInput = this.f;
            if (dKCvnInput.c() == null) {
                f(jw3.d);
                dKCvnInput.a();
                return;
            }
        }
        f(jw3.c);
        c();
    }

    public final void e(boolean z) {
        ArrayList arrayList = vx3.f;
        boolean z2 = gos.n(gos.o(this.d.getCardNumber()).a, this.b).d == 0;
        mmo mmoVar = this.a;
        ((DKExpirationDateInput) mmoVar.f).setVisibility(z ? 0 : 8);
        ((DKCvnInput) mmoVar.e).setVisibility((!z || z2) ? 8 : 0);
        ((Space) mmoVar.g).setVisibility(z ? 0 : 8);
        ((Space) mmoVar.d).setVisibility(z ? 0 : 8);
    }

    public final void f(jw3 jw3Var) {
        jw3 jw3Var2 = this.c;
        if (jw3Var == jw3Var2) {
            return;
        }
        final int i = 1;
        final int i2 = 0;
        boolean z = jw3Var == jw3.c || jw3Var == jw3.d;
        boolean z2 = jw3Var2 == jw3.a || jw3Var2 == jw3.b;
        long j = this.i;
        mmo mmoVar = this.a;
        if (z && z2) {
            e(true);
            this.h.setVisibility(8);
            ValueAnimator ofInt = ValueAnimator.ofInt(((DKCardNumberInput) mmoVar.c).getWidth(), ((k17) mmoVar.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_dk_card_number_input_collapsed_width));
            ofInt.setDuration(j);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e17
                public final /* synthetic */ j17 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            valueAnimator.getClass();
                            DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                            if (layoutParams == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                layoutParams.width = ((Integer) animatedValue).intValue();
                                dKCardNumberInput.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            valueAnimator.getClass();
                            DKCardNumberInput dKCardNumberInput2 = (DKCardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams2 = dKCardNumberInput2.getLayoutParams();
                            if (layoutParams2 == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                dKCardNumberInput2.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt.start();
            ofInt.addListener(new h17(this, i2));
            ((EditText) this.d.a.g).clearFocus();
            DKExpirationDateInput dKExpirationDateInput = this.e;
            if (dKExpirationDateInput.a()) {
                this.f.a();
            } else {
                dKExpirationDateInput.requestFocus();
                vwb.W(dKExpirationDateInput.a.b);
            }
        } else if (!z && !z2) {
            e(false);
            ((DKCardNumberInput) mmoVar.c).setState(l17.a);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(((DKCardNumberInput) mmoVar.c).getWidth(), ((k17) mmoVar.b).getResources().getDimensionPixelSize(R.dimen.paymentsdk_prebuilt_dk_card_number_input_expanded_width));
            ofInt2.setDuration(j);
            ofInt2.setInterpolator(new DecelerateInterpolator());
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e17
                public final /* synthetic */ j17 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i) {
                        case 0:
                            valueAnimator.getClass();
                            DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams = dKCardNumberInput.getLayoutParams();
                            if (layoutParams == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                layoutParams.width = ((Integer) animatedValue).intValue();
                                dKCardNumberInput.setLayoutParams(layoutParams);
                                break;
                            }
                        default:
                            valueAnimator.getClass();
                            DKCardNumberInput dKCardNumberInput2 = (DKCardNumberInput) this.b.a.c;
                            ViewGroup.LayoutParams layoutParams2 = dKCardNumberInput2.getLayoutParams();
                            if (layoutParams2 == null) {
                                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                break;
                            } else {
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                dKCardNumberInput2.setLayoutParams(layoutParams2);
                                break;
                            }
                    }
                }
            });
            ofInt2.start();
            ofInt2.addListener(new h17(this, i));
        }
        s30 s30Var = this.j;
        if (s30Var != null) {
            s30Var.invoke(this.c, jw3Var);
        }
        this.c = jw3Var;
    }
}
