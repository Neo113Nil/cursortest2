package F3;

import D.RunnableC0281a;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.icefishing.icefishingliveapp.C5284R;
import j3.AbstractC4596a;

/* renamed from: F3.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0311e extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1024e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1025f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1026g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1027h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0307a f1028j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0308b f1029k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1030l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1031m;

    public C0311e(r rVar) {
        super(rVar);
        this.f1028j = new ViewOnClickListenerC0307a(0, this);
        this.f1029k = new ViewOnFocusChangeListenerC0308b(this, 0);
        this.f1024e = K3.b.y(rVar.getContext(), C5284R.attr.motionDurationShort3, 100);
        this.f1025f = K3.b.y(rVar.getContext(), C5284R.attr.motionDurationShort3, 150);
        this.f1026g = K3.b.z(rVar.getContext(), C5284R.attr.motionEasingLinearInterpolator, AbstractC4596a.f38541a);
        this.f1027h = K3.b.z(rVar.getContext(), C5284R.attr.motionEasingEmphasizedInterpolator, AbstractC4596a.f38544d);
    }

    @Override // F3.s
    public final void a() {
        if (this.f1085b.f1071I != null) {
            return;
        }
        t(u());
    }

    @Override // F3.s
    public final int c() {
        return C5284R.string.clear_text_end_icon_content_description;
    }

    @Override // F3.s
    public final int d() {
        return C5284R.drawable.mtrl_ic_cancel;
    }

    @Override // F3.s
    public final View.OnFocusChangeListener e() {
        return this.f1029k;
    }

    @Override // F3.s
    public final View.OnClickListener f() {
        return this.f1028j;
    }

    @Override // F3.s
    public final View.OnFocusChangeListener g() {
        return this.f1029k;
    }

    @Override // F3.s
    public final void m(EditText editText) {
        this.i = editText;
        this.f1084a.setEndIconVisible(u());
    }

    @Override // F3.s
    public final void p(boolean z8) {
        if (this.f1085b.f1071I == null) {
            return;
        }
        t(z8);
    }

    @Override // F3.s
    public final void r() {
        final int i = 1;
        final int i4 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1027h);
        ofFloat.setDuration(this.f1025f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: F3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0311e f1021u;

            {
                this.f1021u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0311e c0311e = this.f1021u;
                        c0311e.getClass();
                        c0311e.f1087d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0311e c0311e2 = this.f1021u;
                        c0311e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0311e2.f1087d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1026g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i9 = this.f1024e;
        ofFloat2.setDuration(i9);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: F3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0311e f1021u;

            {
                this.f1021u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C0311e c0311e = this.f1021u;
                        c0311e.getClass();
                        c0311e.f1087d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0311e c0311e2 = this.f1021u;
                        c0311e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0311e2.f1087d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1030l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1030l.addListener(new C0310d(this, i4));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i9);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: F3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0311e f1021u;

            {
                this.f1021u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C0311e c0311e = this.f1021u;
                        c0311e.getClass();
                        c0311e.f1087d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0311e c0311e2 = this.f1021u;
                        c0311e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0311e2.f1087d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1031m = ofFloat3;
        ofFloat3.addListener(new C0310d(this, i));
    }

    @Override // F3.s
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new RunnableC0281a(2, this));
        }
    }

    public final void t(boolean z8) {
        boolean z9 = this.f1085b.d() == z8;
        if (z8 && !this.f1030l.isRunning()) {
            this.f1031m.cancel();
            this.f1030l.start();
            if (z9) {
                this.f1030l.end();
                return;
            }
            return;
        }
        if (z8) {
            return;
        }
        this.f1030l.cancel();
        this.f1031m.start();
        if (z9) {
            this.f1031m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1087d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
