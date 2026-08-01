package com.anythink.basead.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.basead.d.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public abstract class BaseShakeView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected ImageView f9905a;

    /* renamed from: b, reason: collision with root package name */
    protected ImageView f9906b;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f9907c;

    /* renamed from: d, reason: collision with root package name */
    protected int f9908d;

    /* renamed from: e, reason: collision with root package name */
    protected String f9909e;

    /* renamed from: f, reason: collision with root package name */
    protected String f9910f;

    /* renamed from: g, reason: collision with root package name */
    protected String f9911g;

    /* renamed from: h, reason: collision with root package name */
    protected String f9912h;
    protected Bitmap i;

    /* renamed from: j, reason: collision with root package name */
    protected int f9913j;

    /* renamed from: k, reason: collision with root package name */
    protected a f9914k;

    /* renamed from: l, reason: collision with root package name */
    private int f9915l;

    /* renamed from: m, reason: collision with root package name */
    private i f9916m;

    /* renamed from: com.anythink.basead.ui.BaseShakeView$10, reason: invalid class name */
    public class AnonymousClass10 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass10() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f9905a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$11, reason: invalid class name */
    public class AnonymousClass11 extends AnimatorListenerAdapter {
        public AnonymousClass11() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.a(BaseShakeView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$12, reason: invalid class name */
    public class AnonymousClass12 implements Interpolator {
        public AnonymousClass12() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            if (BaseShakeView.this.f9915l % 3 == 2) {
                return 0.0f;
            }
            return f3;
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$13, reason: invalid class name */
    public class AnonymousClass13 implements Runnable {
        public AnonymousClass13() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseShakeView.this.f9905a.setPivotX((int) (BaseShakeView.this.f9905a.getWidth() * 0.5d));
            BaseShakeView.this.f9905a.setPivotY((int) (BaseShakeView.this.f9905a.getHeight() * 0.5d));
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$14, reason: invalid class name */
    public class AnonymousClass14 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass14() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f9905a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$2, reason: invalid class name */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.a(BaseShakeView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$3, reason: invalid class name */
    public class AnonymousClass3 implements Interpolator {
        public AnonymousClass3() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            if ((BaseShakeView.this.f9915l / 2) % 3 == 0) {
                return 0.0f;
            }
            return f3;
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageView = BaseShakeView.this.f9905a;
            if (imageView == null || imageView.getWidth() <= 0 || BaseShakeView.this.f9905a.getHeight() <= 0) {
                return;
            }
            BaseShakeView.this.f9905a.setPivotX((int) (BaseShakeView.this.f9905a.getWidth() * 0.8d));
            BaseShakeView.this.f9905a.setPivotY((int) (BaseShakeView.this.f9905a.getHeight() * 0.8d));
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$7, reason: invalid class name */
    public class AnonymousClass7 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass7() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f9905a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$8, reason: invalid class name */
    public class AnonymousClass8 extends AnimatorListenerAdapter {
        public AnonymousClass8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.a(BaseShakeView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$9, reason: invalid class name */
    public class AnonymousClass9 implements Interpolator {
        public AnonymousClass9() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            if (BaseShakeView.this.f9915l % 3 == 2) {
                return 0.0f;
            }
            return f3;
        }
    }

    public interface a {
        boolean a();
    }

    public BaseShakeView(Context context) {
        super(context);
        this.f9915l = 0;
        this.f9916m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                a aVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (aVar = BaseShakeView.this.f9914k) != null) {
                    return aVar.a();
                }
                return false;
            }
        };
        a();
    }

    public static /* synthetic */ int a(BaseShakeView baseShakeView) {
        int i = baseShakeView.f9915l;
        baseShakeView.f9915l = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseShakeView baseShakeView = BaseShakeView.this;
                ImageView imageView = baseShakeView.f9905a;
                if (imageView != null) {
                    Bitmap bitmap = baseShakeView.i;
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setImageResource(q.a(baseShakeView.getContext(), "myoffer_shake_icon", k.f19632c));
                    }
                }
                BaseShakeView baseShakeView2 = BaseShakeView.this;
                ImageView imageView2 = baseShakeView2.f9906b;
                if (imageView2 != null) {
                    Bitmap bitmap2 = baseShakeView2.i;
                    if (bitmap2 != null) {
                        imageView2.setImageBitmap(bitmap2);
                    } else {
                        imageView2.setImageResource(q.a(baseShakeView2.getContext(), "myoffer_shake_icon", k.f19632c));
                    }
                }
            }
        });
    }

    public abstract void a();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startShakeIconAnimation();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f9907c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        if (z3) {
            b();
        } else {
            c();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            b();
        } else {
            c();
        }
    }

    public void setOnShakeListener(a aVar, y yVar) {
        this.f9916m.a(yVar);
        this.f9914k = aVar;
    }

    public void setShakeSetting(y yVar, int i) {
        if (yVar != null) {
            this.f9908d = yVar.e();
            this.f9909e = yVar.f();
            this.f9910f = yVar.g();
            this.f9911g = yVar.h();
            this.f9912h = yVar.i();
            this.f9913j = i;
            if (TextUtils.isEmpty(this.f9909e)) {
                d();
            } else {
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6;
                        try {
                            i6 = Math.min(BaseShakeView.this.getResources().getDisplayMetrics().widthPixels, BaseShakeView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                        } catch (Throwable unused) {
                            i6 = 0;
                        }
                        BaseShakeView baseShakeView = BaseShakeView.this;
                        baseShakeView.i = com.anythink.core.common.res.b.a(baseShakeView.getContext()).b(new e(3, BaseShakeView.this.f9909e), i6, i6);
                        BaseShakeView.this.d();
                    }
                }, 2);
            }
        }
    }

    public void startShakeIconAnimation() {
        ValueAnimator ofFloat;
        if (this.f9905a != null) {
            ValueAnimator valueAnimator = this.f9907c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i = this.f9908d;
            if (i == 1) {
                ofFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AnonymousClass10());
                ofFloat.addListener(new AnonymousClass11());
                ofFloat.setInterpolator(new AnonymousClass12());
                this.f9905a.post(new AnonymousClass13());
            } else if (i != 2) {
                ofFloat = ValueAnimator.ofFloat(-10.0f, 10.0f);
                ofFloat.setDuration(150L);
                ofFloat.setRepeatMode(2);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AnonymousClass14());
                ofFloat.addListener(new AnonymousClass2());
                ofFloat.setInterpolator(new AnonymousClass3());
                this.f9905a.post(new AnonymousClass4());
            } else {
                int a9 = q.a(getContext(), 8.0f);
                float f3 = a9;
                float f9 = -a9;
                ofFloat = ValueAnimator.ofFloat(0.0f, f3, f9, f3, f9, a9 / 2, r8 / 2, a9 / 4, r8 / 4, 0.0f);
                ofFloat.setDuration(1000L);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AnonymousClass7());
                ofFloat.addListener(new AnonymousClass8());
                ofFloat.setInterpolator(new AnonymousClass9());
            }
            this.f9907c = ofFloat;
            ofFloat.start();
        }
    }

    private ValueAnimator a(int i) {
        if (i == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new AnonymousClass10());
            ofFloat.addListener(new AnonymousClass11());
            ofFloat.setInterpolator(new AnonymousClass12());
            this.f9905a.post(new AnonymousClass13());
            return ofFloat;
        }
        if (i != 2) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-10.0f, 10.0f);
            ofFloat2.setDuration(150L);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new AnonymousClass14());
            ofFloat2.addListener(new AnonymousClass2());
            ofFloat2.setInterpolator(new AnonymousClass3());
            this.f9905a.post(new AnonymousClass4());
            return ofFloat2;
        }
        int a9 = q.a(getContext(), 8.0f);
        float f3 = a9;
        float f9 = -a9;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, f3, f9, f3, f9, a9 / 2, r7 / 2, a9 / 4, r7 / 4, 0.0f);
        ofFloat3.setDuration(1000L);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.addUpdateListener(new AnonymousClass7());
        ofFloat3.addListener(new AnonymousClass8());
        ofFloat3.setInterpolator(new AnonymousClass9());
        return ofFloat3;
    }

    public void b() {
        com.anythink.core.express.c.a.a().a(this.f9916m);
    }

    public void c() {
        com.anythink.core.express.c.a.a().b(this.f9916m);
    }

    public BaseShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9915l = 0;
        this.f9916m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                a aVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (aVar = BaseShakeView.this.f9914k) != null) {
                    return aVar.a();
                }
                return false;
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9915l = 0;
        this.f9916m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                a aVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (aVar = BaseShakeView.this.f9914k) != null) {
                    return aVar.a();
                }
                return false;
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
        this.f9915l = 0;
        this.f9916m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                a aVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (aVar = BaseShakeView.this.f9914k) != null) {
                    return aVar.a();
                }
                return false;
            }
        };
        a();
    }
}
