package H3;

import D.RunnableC0282a;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import l3.AbstractC4661a;

/* renamed from: H3.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0312e extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1111e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1112f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1113g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1114h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0308a f1115j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0309b f1116k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1117l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1118m;

    public C0312e(r rVar) {
        super(rVar);
        this.f1115j = new ViewOnClickListenerC0308a(0, this);
        this.f1116k = new ViewOnFocusChangeListenerC0309b(this, 0);
        this.f1111e = t8.g.D(rVar.getContext(), C5275R.attr.motionDurationShort3, 100);
        this.f1112f = t8.g.D(rVar.getContext(), C5275R.attr.motionDurationShort3, 150);
        this.f1113g = t8.g.E(rVar.getContext(), C5275R.attr.motionEasingLinearInterpolator, AbstractC4661a.f38903a);
        this.f1114h = t8.g.E(rVar.getContext(), C5275R.attr.motionEasingEmphasizedInterpolator, AbstractC4661a.f38906d);
    }

    @Override // H3.s
    public final void a() {
        if (this.f1172b.f1158I != null) {
            return;
        }
        t(u());
    }

    @Override // H3.s
    public final int c() {
        return C5275R.string.clear_text_end_icon_content_description;
    }

    @Override // H3.s
    public final int d() {
        return C5275R.drawable.mtrl_ic_cancel;
    }

    @Override // H3.s
    public final View.OnFocusChangeListener e() {
        return this.f1116k;
    }

    @Override // H3.s
    public final View.OnClickListener f() {
        return this.f1115j;
    }

    @Override // H3.s
    public final View.OnFocusChangeListener g() {
        return this.f1116k;
    }

    @Override // H3.s
    public final void m(EditText editText) {
        this.i = editText;
        this.f1171a.setEndIconVisible(u());
    }

    @Override // H3.s
    public final void p(boolean z3) {
        if (this.f1172b.f1158I == null) {
            return;
        }
        t(z3);
    }

    @Override // H3.s
    public final void r() {
        final int i = 1;
        final int i6 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1114h);
        ofFloat.setDuration(this.f1112f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: H3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0312e f1108u;

            {
                this.f1108u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0312e c0312e = this.f1108u;
                        c0312e.getClass();
                        c0312e.f1174d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0312e c0312e2 = this.f1108u;
                        c0312e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0312e2.f1174d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1113g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i9 = this.f1111e;
        ofFloat2.setDuration(i9);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: H3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0312e f1108u;

            {
                this.f1108u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        C0312e c0312e = this.f1108u;
                        c0312e.getClass();
                        c0312e.f1174d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0312e c0312e2 = this.f1108u;
                        c0312e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0312e2.f1174d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1117l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1117l.addListener(new C0311d(this, i6));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i9);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: H3.c

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C0312e f1108u;

            {
                this.f1108u = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        C0312e c0312e = this.f1108u;
                        c0312e.getClass();
                        c0312e.f1174d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0312e c0312e2 = this.f1108u;
                        c0312e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0312e2.f1174d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1118m = ofFloat3;
        ofFloat3.addListener(new C0311d(this, i));
    }

    @Override // H3.s
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new RunnableC0282a(2, this));
        }
    }

    public final void t(boolean z3) {
        boolean z6 = this.f1172b.d() == z3;
        if (z3 && !this.f1117l.isRunning()) {
            this.f1118m.cancel();
            this.f1117l.start();
            if (z6) {
                this.f1117l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f1117l.cancel();
        this.f1118m.start();
        if (z6) {
            this.f1118m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1174d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
