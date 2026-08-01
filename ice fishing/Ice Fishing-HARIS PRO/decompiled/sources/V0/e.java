package V0;

import a.AbstractC0078a;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.lumenpath.harispro.hrnavigator.R;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public final class e extends q {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1269f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1270g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1271h;
    public EditText i;
    public final ViewOnClickListenerC0050a j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0051b f1272k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1273l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1274m;

    public e(p pVar) {
        super(pVar);
        this.j = new ViewOnClickListenerC0050a(0, this);
        this.f1272k = new ViewOnFocusChangeListenerC0051b(this, 0);
        this.e = AbstractC0078a.W(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f1269f = AbstractC0078a.W(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f1270g = AbstractC0078a.X(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0360a.f4480a);
        this.f1271h = AbstractC0078a.X(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0360a.f4483d);
    }

    @Override // V0.q
    public final void a() {
        if (this.f1319b.f1311p != null) {
            return;
        }
        t(u());
    }

    @Override // V0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // V0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // V0.q
    public final View.OnFocusChangeListener e() {
        return this.f1272k;
    }

    @Override // V0.q
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // V0.q
    public final View.OnFocusChangeListener g() {
        return this.f1272k;
    }

    @Override // V0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f1318a.setEndIconVisible(u());
    }

    @Override // V0.q
    public final void p(boolean z2) {
        if (this.f1319b.f1311p == null) {
            return;
        }
        t(z2);
    }

    @Override // V0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1271h);
        ofFloat.setDuration(this.f1269f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: V0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1266b;

            {
                this.f1266b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        e eVar = this.f1266b;
                        eVar.getClass();
                        eVar.f1321d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f1266b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f1321d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.f2111C0, 1.0f);
        TimeInterpolator timeInterpolator = this.f1270g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: V0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1266b;

            {
                this.f1266b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f1266b;
                        eVar.getClass();
                        eVar.f1321d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f1266b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f1321d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1273l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1273l.addListener(new d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.f2111C0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: V0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f1266b;

            {
                this.f1266b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f1266b;
                        eVar.getClass();
                        eVar.f1321d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f1266b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f1321d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1274m = ofFloat3;
        ofFloat3.addListener(new d(this, i));
    }

    @Override // V0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new D.a(5, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1319b.d() == z2;
        if (z2 && !this.f1273l.isRunning()) {
            this.f1274m.cancel();
            this.f1273l.start();
            if (z3) {
                this.f1273l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1273l.cancel();
        this.f1274m.start();
        if (z3) {
            this.f1274m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.f1321d.hasFocus()) && this.i.getText().length() > 0;
    }
}
