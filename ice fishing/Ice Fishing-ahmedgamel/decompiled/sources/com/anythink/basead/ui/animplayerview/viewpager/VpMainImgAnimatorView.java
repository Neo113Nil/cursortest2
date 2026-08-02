package com.anythink.basead.ui.animplayerview.viewpager;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.c;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public class VpMainImgAnimatorView extends RelativeLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11369a = "VpMainImgView";

    /* renamed from: b, reason: collision with root package name */
    private static final int f11370b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static final int f11371c = 1500;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11372d = 500;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11373e = 8;

    /* renamed from: f, reason: collision with root package name */
    private WrapRoundImageView f11374f;

    /* renamed from: g, reason: collision with root package name */
    private WrapRoundImageView f11375g;

    /* renamed from: h, reason: collision with root package name */
    private CircleIndicatorView f11376h;
    private CircleIndicatorView i;

    /* renamed from: j, reason: collision with root package name */
    private int f11377j;

    /* renamed from: k, reason: collision with root package name */
    private float f11378k;

    /* renamed from: l, reason: collision with root package name */
    private float f11379l;

    /* renamed from: m, reason: collision with root package name */
    private final Handler f11380m;

    /* renamed from: n, reason: collision with root package name */
    private ObjectAnimator f11381n;

    /* renamed from: o, reason: collision with root package name */
    private ObjectAnimator f11382o;

    /* renamed from: p, reason: collision with root package name */
    private AnimatorSet f11383p;

    /* renamed from: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VpMainImgAnimatorView.this.d();
        }
    }

    public class a implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        private final View f11388b;

        public a(View view) {
            this.f11388b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f11388b;
            if (view == null || view.getTranslationX() >= 0.0f) {
                return;
            }
            this.f11388b.setTranslationX(VpMainImgAnimatorView.this.f11379l);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public VpMainImgAnimatorView(Context context) {
        this(context, null);
    }

    private void a() {
        this.f11376h = new CircleIndicatorView(getContext());
        this.i = new CircleIndicatorView(getContext());
        int a9 = q.a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a9, a9);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a9, a9);
        layoutParams2.leftMargin = q.a(getContext(), 4.0f);
        linearLayout.addView(this.f11376h, layoutParams);
        linearLayout.addView(this.i, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(12);
        layoutParams3.addRule(14);
        layoutParams3.bottomMargin = q.a(getContext(), 3.0f);
        addView(linearLayout, layoutParams3);
        b();
    }

    @Override // com.anythink.basead.ui.animplayerview.c
    public void addMainView(Bitmap bitmap, WrapRoundImageView... wrapRoundImageViewArr) {
        if (wrapRoundImageViewArr == null || bitmap == null || wrapRoundImageViewArr.length < 2) {
            return;
        }
        removeAllViews();
        this.f11374f = wrapRoundImageViewArr[0];
        this.f11375g = wrapRoundImageViewArr[1];
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams2.addRule(13);
        this.f11374f.setLayoutParams(layoutParams);
        this.f11375g.setLayoutParams(layoutParams2);
        addView(this.f11374f);
        addView(this.f11375g);
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        int i4 = getContext().getResources().getDisplayMetrics().heightPixels;
        this.f11374f.setBitmapAndResize(bitmap, i, i4);
        this.f11375g.setBitmapAndResize(bitmap, i, i4);
        ViewGroup.LayoutParams layoutParams3 = this.f11374f.getLayoutParams();
        this.f11377j = layoutParams3.width;
        int i6 = layoutParams3.height;
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        layoutParams4.width = this.f11377j;
        layoutParams4.height = i6;
        setLayoutParams(layoutParams4);
        float translationX = this.f11374f.getTranslationX();
        this.f11378k = translationX;
        float f2 = translationX + this.f11377j;
        this.f11379l = f2;
        this.f11375g.setTranslationX(f2);
        this.f11376h = new CircleIndicatorView(getContext());
        this.i = new CircleIndicatorView(getContext());
        int a9 = q.a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(a9, a9);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(a9, a9);
        layoutParams6.leftMargin = q.a(getContext(), 4.0f);
        linearLayout.addView(this.f11376h, layoutParams5);
        linearLayout.addView(this.i, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(12);
        layoutParams7.addRule(14);
        layoutParams7.bottomMargin = q.a(getContext(), 3.0f);
        addView(linearLayout, layoutParams7);
        b();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        AnimatorSet animatorSet = this.f11383p;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.c
    public void release() {
        stop();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        AnimatorSet animatorSet = this.f11383p;
        if (animatorSet != null) {
            animatorSet.resume();
            return;
        }
        Handler handler = this.f11380m;
        if (handler != null) {
            handler.removeMessages(100);
            this.f11380m.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f11383p != null) {
            resume();
            return;
        }
        Handler handler = this.f11380m;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        Handler handler = this.f11380m;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f11381n;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f11381n = null;
        }
        ObjectAnimator objectAnimator2 = this.f11382o;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f11382o = null;
        }
        AnimatorSet animatorSet = this.f11383p;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f11383p.cancel();
            this.f11383p = null;
        }
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        WrapRoundImageView wrapRoundImageView;
        if (this.f11376h == null || this.i == null || (wrapRoundImageView = this.f11374f) == null) {
            return;
        }
        if (wrapRoundImageView.getTranslationX() == this.f11378k) {
            this.f11376h.setSelectStatus(true);
            this.i.setSelectStatus(false);
        } else {
            this.f11376h.setSelectStatus(false);
            this.i.setSelectStatus(true);
        }
    }

    private void c() {
        WrapRoundImageView wrapRoundImageView = this.f11374f;
        if (wrapRoundImageView == null || this.f11375g == null) {
            return;
        }
        if (this.f11377j == 0) {
            wrapRoundImageView.post(new AnonymousClass2());
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        float[] a9 = a(this.f11374f);
        float[] a10 = a(this.f11375g);
        this.f11381n = a(this.f11381n, this.f11374f, a9[0], a9[1]);
        this.f11382o = a(this.f11382o, this.f11375g, a10[0], a10[1]);
        if (this.f11383p == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11383p = animatorSet;
            animatorSet.playTogether(this.f11381n, this.f11382o);
            this.f11383p.setDuration(500L);
            this.f11383p.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11383p.addListener(new Animator.AnimatorListener() { // from class: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView.3
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    VpMainImgAnimatorView.this.b();
                    if (VpMainImgAnimatorView.this.f11380m != null) {
                        VpMainImgAnimatorView.this.f11380m.removeMessages(100);
                        VpMainImgAnimatorView.this.f11380m.sendEmptyMessageDelayed(100, 1500L);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
        this.f11383p.start();
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11380m = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 100) {
                    VpMainImgAnimatorView.a(VpMainImgAnimatorView.this);
                }
            }
        };
    }

    private float[] a(View view) {
        float translationX = view.getTranslationX();
        float f2 = this.f11378k;
        if (translationX != f2) {
            f2 = this.f11379l;
        }
        float translationX2 = view.getTranslationX();
        float f9 = this.f11378k;
        if (translationX2 == f9) {
            f9 = -this.f11379l;
        }
        return new float[]{f2, f9};
    }

    private ObjectAnimator a(ObjectAnimator objectAnimator, View view, float f2, float f9) {
        if (objectAnimator == null) {
            objectAnimator = new ObjectAnimator();
            objectAnimator.setPropertyName("translationX");
            objectAnimator.addListener(new a(view));
        }
        objectAnimator.setTarget(view);
        objectAnimator.setFloatValues(f2, f9);
        return objectAnimator;
    }

    public static /* synthetic */ void a(VpMainImgAnimatorView vpMainImgAnimatorView) {
        WrapRoundImageView wrapRoundImageView = vpMainImgAnimatorView.f11374f;
        if (wrapRoundImageView == null || vpMainImgAnimatorView.f11375g == null) {
            return;
        }
        if (vpMainImgAnimatorView.f11377j == 0) {
            wrapRoundImageView.post(vpMainImgAnimatorView.new AnonymousClass2());
        } else {
            vpMainImgAnimatorView.d();
        }
    }
}
