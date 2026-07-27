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
    private static final String f10583a = "VpMainImgView";

    /* renamed from: b, reason: collision with root package name */
    private static final int f10584b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static final int f10585c = 1500;

    /* renamed from: d, reason: collision with root package name */
    private static final int f10586d = 500;

    /* renamed from: e, reason: collision with root package name */
    private static final int f10587e = 8;

    /* renamed from: f, reason: collision with root package name */
    private WrapRoundImageView f10588f;

    /* renamed from: g, reason: collision with root package name */
    private WrapRoundImageView f10589g;

    /* renamed from: h, reason: collision with root package name */
    private CircleIndicatorView f10590h;
    private CircleIndicatorView i;

    /* renamed from: j, reason: collision with root package name */
    private int f10591j;

    /* renamed from: k, reason: collision with root package name */
    private float f10592k;

    /* renamed from: l, reason: collision with root package name */
    private float f10593l;

    /* renamed from: m, reason: collision with root package name */
    private final Handler f10594m;

    /* renamed from: n, reason: collision with root package name */
    private ObjectAnimator f10595n;

    /* renamed from: o, reason: collision with root package name */
    private ObjectAnimator f10596o;

    /* renamed from: p, reason: collision with root package name */
    private AnimatorSet f10597p;

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
        private final View f10602b;

        public a(View view) {
            this.f10602b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f10602b;
            if (view == null || view.getTranslationX() >= 0.0f) {
                return;
            }
            this.f10602b.setTranslationX(VpMainImgAnimatorView.this.f10593l);
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
        this.f10590h = new CircleIndicatorView(getContext());
        this.i = new CircleIndicatorView(getContext());
        int a9 = q.a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a9, a9);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a9, a9);
        layoutParams2.leftMargin = q.a(getContext(), 4.0f);
        linearLayout.addView(this.f10590h, layoutParams);
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
        this.f10588f = wrapRoundImageViewArr[0];
        this.f10589g = wrapRoundImageViewArr[1];
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams2.addRule(13);
        this.f10588f.setLayoutParams(layoutParams);
        this.f10589g.setLayoutParams(layoutParams2);
        addView(this.f10588f);
        addView(this.f10589g);
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        int i6 = getContext().getResources().getDisplayMetrics().heightPixels;
        this.f10588f.setBitmapAndResize(bitmap, i, i6);
        this.f10589g.setBitmapAndResize(bitmap, i, i6);
        ViewGroup.LayoutParams layoutParams3 = this.f10588f.getLayoutParams();
        this.f10591j = layoutParams3.width;
        int i9 = layoutParams3.height;
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        layoutParams4.width = this.f10591j;
        layoutParams4.height = i9;
        setLayoutParams(layoutParams4);
        float translationX = this.f10588f.getTranslationX();
        this.f10592k = translationX;
        float f3 = translationX + this.f10591j;
        this.f10593l = f3;
        this.f10589g.setTranslationX(f3);
        this.f10590h = new CircleIndicatorView(getContext());
        this.i = new CircleIndicatorView(getContext());
        int a9 = q.a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(a9, a9);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(a9, a9);
        layoutParams6.leftMargin = q.a(getContext(), 4.0f);
        linearLayout.addView(this.f10590h, layoutParams5);
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
        AnimatorSet animatorSet = this.f10597p;
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
        AnimatorSet animatorSet = this.f10597p;
        if (animatorSet != null) {
            animatorSet.resume();
            return;
        }
        Handler handler = this.f10594m;
        if (handler != null) {
            handler.removeMessages(100);
            this.f10594m.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f10597p != null) {
            resume();
            return;
        }
        Handler handler = this.f10594m;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        Handler handler = this.f10594m;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.f10595n;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f10595n = null;
        }
        ObjectAnimator objectAnimator2 = this.f10596o;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f10596o = null;
        }
        AnimatorSet animatorSet = this.f10597p;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f10597p.cancel();
            this.f10597p = null;
        }
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        WrapRoundImageView wrapRoundImageView;
        if (this.f10590h == null || this.i == null || (wrapRoundImageView = this.f10588f) == null) {
            return;
        }
        if (wrapRoundImageView.getTranslationX() == this.f10592k) {
            this.f10590h.setSelectStatus(true);
            this.i.setSelectStatus(false);
        } else {
            this.f10590h.setSelectStatus(false);
            this.i.setSelectStatus(true);
        }
    }

    private void c() {
        WrapRoundImageView wrapRoundImageView = this.f10588f;
        if (wrapRoundImageView == null || this.f10589g == null) {
            return;
        }
        if (this.f10591j == 0) {
            wrapRoundImageView.post(new AnonymousClass2());
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        float[] a9 = a(this.f10588f);
        float[] a10 = a(this.f10589g);
        this.f10595n = a(this.f10595n, this.f10588f, a9[0], a9[1]);
        this.f10596o = a(this.f10596o, this.f10589g, a10[0], a10[1]);
        if (this.f10597p == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10597p = animatorSet;
            animatorSet.playTogether(this.f10595n, this.f10596o);
            this.f10597p.setDuration(500L);
            this.f10597p.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10597p.addListener(new Animator.AnimatorListener() { // from class: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView.3
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    VpMainImgAnimatorView.this.b();
                    if (VpMainImgAnimatorView.this.f10594m != null) {
                        VpMainImgAnimatorView.this.f10594m.removeMessages(100);
                        VpMainImgAnimatorView.this.f10594m.sendEmptyMessageDelayed(100, 1500L);
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
        this.f10597p.start();
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10594m = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView.1
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
        float f3 = this.f10592k;
        if (translationX != f3) {
            f3 = this.f10593l;
        }
        float translationX2 = view.getTranslationX();
        float f9 = this.f10592k;
        if (translationX2 == f9) {
            f9 = -this.f10593l;
        }
        return new float[]{f3, f9};
    }

    private ObjectAnimator a(ObjectAnimator objectAnimator, View view, float f3, float f9) {
        if (objectAnimator == null) {
            objectAnimator = new ObjectAnimator();
            objectAnimator.setPropertyName("translationX");
            objectAnimator.addListener(new a(view));
        }
        objectAnimator.setTarget(view);
        objectAnimator.setFloatValues(f3, f9);
        return objectAnimator;
    }

    public static /* synthetic */ void a(VpMainImgAnimatorView vpMainImgAnimatorView) {
        WrapRoundImageView wrapRoundImageView = vpMainImgAnimatorView.f10588f;
        if (wrapRoundImageView == null || vpMainImgAnimatorView.f10589g == null) {
            return;
        }
        if (vpMainImgAnimatorView.f10591j == 0) {
            wrapRoundImageView.post(vpMainImgAnimatorView.new AnonymousClass2());
        } else {
            vpMainImgAnimatorView.d();
        }
    }
}
