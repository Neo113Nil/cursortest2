package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes.dex */
public class AnythinkBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private static final String f22201a = "MBridgeAnimationClickView";

    /* renamed from: b, reason: collision with root package name */
    private AnyThinkImageView f22202b;

    /* renamed from: c, reason: collision with root package name */
    private AnyThinkImageView f22203c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f22204d;

    /* renamed from: e, reason: collision with root package name */
    private String f22205e;

    /* renamed from: f, reason: collision with root package name */
    private String f22206f;

    /* renamed from: g, reason: collision with root package name */
    private String f22207g;

    /* renamed from: h, reason: collision with root package name */
    private int f22208h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f22209j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f22210k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f22211l;

    /* renamed from: m, reason: collision with root package name */
    private Animation f22212m;

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$3, reason: invalid class name */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            if (AnythinkBaitClickView.this.f22203c != null) {
                AnythinkBaitClickView.this.f22203c.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            if (AnythinkBaitClickView.this.f22203c != null) {
                AnythinkBaitClickView.this.f22203c.setVisibility(0);
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$4, reason: invalid class name */
    public class AnonymousClass4 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f22218a;

        public AnonymousClass4(AnimationSet animationSet) {
            this.f22218a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.4.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f22202b != null) {
                        AnythinkBaitClickView.this.f22202b.startAnimation(AnythinkBaitClickView.this.f22209j);
                    }
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f22203c != null) {
                        AnythinkBaitClickView.this.f22203c.startAnimation(AnonymousClass4.this.f22218a);
                    }
                }
            }, 550L);
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$5, reason: invalid class name */
    public class AnonymousClass5 implements Animation.AnimationListener {
        public AnonymousClass5() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f22202b != null) {
                        AnythinkBaitClickView.this.f22202b.startAnimation(AnythinkBaitClickView.this.f22209j);
                    }
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public AnythinkBaitClickView(Context context) {
        super(context);
        this.f22205e = "";
        this.f22206f = "";
        this.f22207g = "Click now for details";
        this.f22208h = 1;
        this.i = 1342177280;
    }

    private void d() {
        AnyThinkImageView anyThinkImageView = this.f22203c;
        if (anyThinkImageView != null) {
            anyThinkImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f22209j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f22209j.setRepeatCount(1);
        this.f22209j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f22210k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f22210k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f22211l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f22211l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f22210k);
        animationSet.addAnimation(this.f22211l);
        this.f22210k.setAnimationListener(new AnonymousClass3());
        this.f22209j.setAnimationListener(new AnonymousClass4(animationSet));
        AnyThinkImageView anyThinkImageView2 = this.f22202b;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(this.f22209j);
        }
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f22209j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f22209j.setRepeatCount(1);
        this.f22209j.setAnimationListener(new AnonymousClass5());
        AnyThinkImageView anyThinkImageView = this.f22202b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f22209j);
        }
    }

    private void f() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f22212m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f22212m.setRepeatMode(2);
        this.f22212m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f22210k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f22210k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f22211l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f22211l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f22210k);
        animationSet.addAnimation(this.f22211l);
        AnyThinkImageView anyThinkImageView = this.f22202b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f22212m);
        }
        AnyThinkImageView anyThinkImageView2 = this.f22203c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i) {
        this.f22208h = i;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f22209j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f22210k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f22211l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f22212m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i = this.f22208h;
        if (i == 2) {
            this.f22203c.setVisibility(4);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f22209j = scaleAnimation;
            scaleAnimation.setDuration(500L);
            this.f22209j.setRepeatCount(-1);
            this.f22209j.setRepeatMode(2);
            AnyThinkImageView anyThinkImageView = this.f22202b;
            if (anyThinkImageView != null) {
                anyThinkImageView.startAnimation(this.f22209j);
                return;
            }
            return;
        }
        if (i == 3) {
            AnyThinkImageView anyThinkImageView2 = this.f22203c;
            if (anyThinkImageView2 != null) {
                anyThinkImageView2.setVisibility(4);
            }
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f22209j = scaleAnimation2;
            scaleAnimation2.setDuration(500L);
            this.f22209j.setRepeatCount(1);
            this.f22209j.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f22210k = scaleAnimation3;
            scaleAnimation3.setDuration(1000L);
            this.f22210k.setRepeatCount(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            this.f22211l = alphaAnimation;
            alphaAnimation.setDuration(1000L);
            this.f22211l.setRepeatCount(0);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(this.f22210k);
            animationSet.addAnimation(this.f22211l);
            this.f22210k.setAnimationListener(new AnonymousClass3());
            this.f22209j.setAnimationListener(new AnonymousClass4(animationSet));
            AnyThinkImageView anyThinkImageView3 = this.f22202b;
            if (anyThinkImageView3 != null) {
                anyThinkImageView3.startAnimation(this.f22209j);
                return;
            }
            return;
        }
        if (i == 4) {
            this.f22203c.setVisibility(4);
            ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.f22209j = scaleAnimation4;
            scaleAnimation4.setDuration(200L);
            this.f22209j.setRepeatCount(1);
            this.f22209j.setAnimationListener(new AnonymousClass5());
            AnyThinkImageView anyThinkImageView4 = this.f22202b;
            if (anyThinkImageView4 != null) {
                anyThinkImageView4.startAnimation(this.f22209j);
                return;
            }
            return;
        }
        if (i != 5) {
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f22209j = scaleAnimation5;
            scaleAnimation5.setDuration(200L);
            this.f22209j.setRepeatCount(-1);
            this.f22209j.setRepeatMode(2);
            AnyThinkImageView anyThinkImageView5 = this.f22202b;
            if (anyThinkImageView5 != null) {
                anyThinkImageView5.startAnimation(this.f22209j);
            }
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
            this.f22210k = scaleAnimation6;
            scaleAnimation6.setDuration(400L);
            this.f22210k.setRepeatCount(-1);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.3f);
            this.f22211l = alphaAnimation2;
            alphaAnimation2.setDuration(400L);
            this.f22211l.setRepeatCount(-1);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(this.f22210k);
            animationSet2.addAnimation(this.f22211l);
            AnyThinkImageView anyThinkImageView6 = this.f22203c;
            if (anyThinkImageView6 != null) {
                anyThinkImageView6.startAnimation(animationSet2);
                return;
            }
            return;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f22212m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f22212m.setRepeatMode(2);
        this.f22212m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f22210k = scaleAnimation7;
        scaleAnimation7.setDuration(600L);
        this.f22210k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
        this.f22211l = alphaAnimation3;
        alphaAnimation3.setDuration(600L);
        this.f22211l.setRepeatCount(-1);
        AnimationSet animationSet3 = new AnimationSet(true);
        animationSet3.addAnimation(this.f22210k);
        animationSet3.addAnimation(this.f22211l);
        AnyThinkImageView anyThinkImageView7 = this.f22202b;
        if (anyThinkImageView7 != null) {
            anyThinkImageView7.startAnimation(this.f22212m);
        }
        AnyThinkImageView anyThinkImageView8 = this.f22203c;
        if (anyThinkImageView8 != null) {
            anyThinkImageView8.startAnimation(animationSet3);
        }
    }

    private void a() {
        try {
            this.f22207g = getContext().getString(k.a(getContext(), "anythink_cm_click_for_detail", k.f20423g));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f22209j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f22209j.setRepeatCount(-1);
        this.f22209j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.f22202b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f22209j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f22210k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f22210k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f22211l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f22211l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f22210k);
        animationSet.addAnimation(this.f22211l);
        AnyThinkImageView anyThinkImageView2 = this.f22203c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f22209j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f22209j.setRepeatCount(-1);
        this.f22209j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.f22202b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f22209j);
        }
    }

    public void init(int i, int i4) {
        this.i = i;
        this.f22208h = i4;
        init();
    }

    public void init(int i, int i4, String str, String str2, String str3) {
        this.i = i;
        this.f22208h = i4;
        this.f22205e = str;
        this.f22206f = str2;
        this.f22207g = str3;
        init();
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22205e = "";
        this.f22206f = "";
        this.f22207g = "Click now for details";
        this.f22208h = 1;
        this.i = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.i);
            try {
                this.f22207g = getContext().getString(k.a(getContext(), "anythink_cm_click_for_detail", k.f20423g));
            } catch (Throwable th) {
                th.getMessage();
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int b9 = v.b(getContext(), 55.0f);
            int b10 = v.b(getContext(), 33.0f);
            this.f22203c = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b9, b9);
            layoutParams.setMargins(b10, b10, 0, 0);
            this.f22203c.setLayoutParams(layoutParams);
            final int a9 = k.a(getContext(), "anythink_icon_click_circle", k.f20419c);
            if (TextUtils.isEmpty(this.f22206f)) {
                this.f22203c.setImageResource(a9);
            } else {
                b.a(t.b().g()).a(this.f22205e, new c() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.1
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        AnythinkBaitClickView.this.f22203c.setImageBitmap(bitmap);
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                        AnythinkBaitClickView.this.f22203c.setImageResource(a9);
                    }
                });
            }
            int b11 = v.b(getContext(), 108.0f);
            int b12 = v.b(getContext(), 35.0f);
            int b13 = v.b(getContext(), 43.0f);
            this.f22202b = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b11, b11);
            layoutParams2.setMargins(b12, b13, 0, 0);
            this.f22202b.setLayoutParams(layoutParams2);
            final int a10 = k.a(getContext(), "anythink_icon_click_hand", k.f20419c);
            if (TextUtils.isEmpty(this.f22205e)) {
                this.f22202b.setImageResource(a10);
            } else {
                b.a(t.b().g()).a(this.f22205e, new c() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.2
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        AnythinkBaitClickView.this.f22202b.setImageBitmap(bitmap);
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                        AnythinkBaitClickView.this.f22202b.setImageResource(a10);
                    }
                });
            }
            relativeLayout.addView(this.f22203c);
            relativeLayout.addView(this.f22202b);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f22204d = new TextView(getContext());
            this.f22204d.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f22204d.setText(this.f22207g);
            this.f22204d.setTextColor(-1);
            this.f22204d.setGravity(14);
            linearLayout.addView(this.f22204d);
            addView(linearLayout);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22205e = "";
        this.f22206f = "";
        this.f22207g = "Click now for details";
        this.f22208h = 1;
        this.i = 1342177280;
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f22205e = "";
        this.f22206f = "";
        this.f22207g = "Click now for details";
        this.f22208h = 1;
        this.i = 1342177280;
    }
}
