package J3;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.internal.CheckableImageButton;
import n3.AbstractC4770a;

/* renamed from: J3.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0321e extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1467e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1468f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1469g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1470h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0317a f1471j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0318b f1472k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1473l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1474m;

    public C0321e(r rVar) {
        super(rVar);
        this.f1471j = new ViewOnClickListenerC0317a(0, this);
        this.f1472k = new ViewOnFocusChangeListenerC0318b(this, 0);
        this.f1467e = N3.C.R(rVar.getContext(), C5248R.attr.motionDurationShort3, 100);
        this.f1468f = N3.C.R(rVar.getContext(), C5248R.attr.motionDurationShort3, 150);
        this.f1469g = N3.C.S(rVar.getContext(), C5248R.attr.motionEasingLinearInterpolator, AbstractC4770a.f39641a);
        this.f1470h = N3.C.S(rVar.getContext(), C5248R.attr.motionEasingEmphasizedInterpolator, AbstractC4770a.f39644d);
    }

    @Override // J3.s
    public final void a() {
        if (this.f1528b.f1514I != null) {
            return;
        }
        t(u());
    }

    @Override // J3.s
    public final int c() {
        return C5248R.string.clear_text_end_icon_content_description;
    }

    @Override // J3.s
    public final int d() {
        return C5248R.drawable.mtrl_ic_cancel;
    }

    @Override // J3.s
    public final View.OnFocusChangeListener e() {
        return this.f1472k;
    }

    @Override // J3.s
    public final View.OnClickListener f() {
        return this.f1471j;
    }

    @Override // J3.s
    public final View.OnFocusChangeListener g() {
        return this.f1472k;
    }

    @Override // J3.s
    public final void m(EditText editText) {
        this.i = editText;
        this.f1527a.setEndIconVisible(u());
    }

    @Override // J3.s
    public final void p(boolean z6) {
        if (this.f1528b.f1514I == null) {
            return;
        }
        t(z6);
    }

    @Override // J3.s
    public final void r() {
        final int i = 1;
        final int i4 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1470h);
        ofFloat.setDuration(this.f1468f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: J3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0321e f1464u;

            {
                this.f1464u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0321e c0321e = this.f1464u;
                        c0321e.getClass();
                        c0321e.f1530d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0321e c0321e2 = this.f1464u;
                        c0321e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0321e2.f1530d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1469g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i6 = this.f1467e;
        ofFloat2.setDuration(i6);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: J3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0321e f1464u;

            {
                this.f1464u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C0321e c0321e = this.f1464u;
                        c0321e.getClass();
                        c0321e.f1530d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0321e c0321e2 = this.f1464u;
                        c0321e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0321e2.f1530d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1473l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1473l.addListener(new C0320d(this, i4));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i6);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: J3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0321e f1464u;

            {
                this.f1464u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C0321e c0321e = this.f1464u;
                        c0321e.getClass();
                        c0321e.f1530d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0321e c0321e2 = this.f1464u;
                        c0321e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0321e2.f1530d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1474m = ofFloat3;
        ofFloat3.addListener(new C0320d(this, i));
    }

    @Override // J3.s
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new A3.p(4, this));
        }
    }

    public final void t(boolean z6) {
        boolean z9 = this.f1528b.d() == z6;
        if (z6 && !this.f1473l.isRunning()) {
            this.f1474m.cancel();
            this.f1473l.start();
            if (z9) {
                this.f1473l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f1473l.cancel();
        this.f1474m.start();
        if (z9) {
            this.f1474m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1530d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
