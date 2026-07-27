package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes.dex */
public class MBSplashClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20966a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: b, reason: collision with root package name */
    private String f20967b;

    /* renamed from: c, reason: collision with root package name */
    private String f20968c;

    /* renamed from: d, reason: collision with root package name */
    private String f20969d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20970e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20971f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20972g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20973h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private String f20974j;

    /* renamed from: k, reason: collision with root package name */
    private int f20975k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f20976l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f20977m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f20978n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f20979o;

    /* renamed from: p, reason: collision with root package name */
    private final Paint f20980p;

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1, reason: invalid class name */
    public class AnonymousClass1 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f20981a;

        public AnonymousClass1(ScaleAnimation scaleAnimation) {
            this.f20981a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f20977m.setVisibility(4);
            MBSplashClickView.this.f20977m.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f20977m.startAnimation(AnonymousClass1.this.f20981a);
                }
            }, 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f20977m.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f20984a;

        public AnonymousClass2(ScaleAnimation scaleAnimation) {
            this.f20984a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.f20977m.startAnimation(this.f20984a);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3, reason: invalid class name */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.f20976l.setVisibility(4);
            MBSplashClickView.this.f20976l.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f20976l.startAnimation(animation);
                }
            }, com.anythink.basead.exoplayer.i.a.f8040f);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f20976l.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f20967b = "";
        this.f20968c = "";
        this.f20969d = "";
        this.f20970e = "anythink_splash_btn_arrow_right";
        this.f20971f = "anythink_splash_btn_circle";
        this.f20972g = "anythink_splash_btn_finger";
        this.f20973h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20978n = new RectF();
        this.f20979o = new Paint();
        this.f20980p = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new AnonymousClass1(scaleAnimation2));
        this.f20977m.setVisibility(4);
        this.f20976l.startAnimation(scaleAnimation);
        this.f20977m.postDelayed(new AnonymousClass2(scaleAnimation2), 500L);
    }

    private void d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnonymousClass3());
        this.f20976l.startAnimation(translateAnimation);
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f20976l.startAnimation(scaleAnimation);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f20978n, this.f20980p, 31);
        canvas.drawRoundRect(this.f20978n, 200.0f, 200.0f, this.f20980p);
        canvas.saveLayer(this.f20978n, this.f20979o, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        this.f20974j = str;
        if (TextUtils.equals(str, this.f20967b)) {
            this.f20975k = 2;
        } else if (TextUtils.equals(str, this.f20969d)) {
            this.f20975k = 3;
        } else if (TextUtils.equals(str, this.f20968c)) {
            this.f20975k = 1;
        } else {
            if (TextUtils.isEmpty(this.f20974j)) {
                this.f20974j = this.f20967b;
            }
            this.f20975k = 2;
        }
        int i4 = this.f20975k;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i4 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f20974j);
        this.f20976l = new ImageView(getContext());
        int i9 = this.f20975k;
        if (i9 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.f19790c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i9 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.f19790c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.f19790c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i9 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.f19790c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.f20977m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.f20977m.setLayoutParams(layoutParams4);
            this.f20977m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.f19790c));
            addView(this.f20977m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.f20976l.setLayoutParams(layoutParams);
        this.f20976l.setImageResource(i);
        addView(textView);
        addView(this.f20976l);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f20975k;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f20976l.startAnimation(scaleAnimation);
            return;
        }
        if (i == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnonymousClass3());
            this.f20976l.startAnimation(translateAnimation);
            return;
        }
        if (i == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(400L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(200L);
            scaleAnimation3.setAnimationListener(new AnonymousClass1(scaleAnimation3));
            this.f20977m.setVisibility(4);
            this.f20976l.startAnimation(scaleAnimation2);
            this.f20977m.postDelayed(new AnonymousClass2(scaleAnimation3), 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        this.f20978n.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f20979o.setAntiAlias(true);
        this.f20979o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f20980p.setAntiAlias(true);
        this.f20980p.setColor(-1);
        this.f20967b = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_view", k.f19794g));
        this.f20968c = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_open", k.f19794g));
        this.f20969d = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_inst", k.f19794g));
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        String str = this.f20974j;
        if (TextUtils.equals(str, this.f20967b)) {
            this.f20975k = 2;
        } else if (TextUtils.equals(str, this.f20969d)) {
            this.f20975k = 3;
        } else if (TextUtils.equals(str, this.f20968c)) {
            this.f20975k = 1;
        } else {
            if (TextUtils.isEmpty(this.f20974j)) {
                this.f20974j = this.f20967b;
            }
            this.f20975k = 2;
        }
        int i4 = this.f20975k;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i4 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f20974j);
        this.f20976l = new ImageView(getContext());
        int i9 = this.f20975k;
        if (i9 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.f19790c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i9 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.f19790c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.f19790c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i9 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.f19790c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.f20977m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.f20977m.setLayoutParams(layoutParams4);
            this.f20977m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.f19790c));
            addView(this.f20977m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.f20976l.setLayoutParams(layoutParams);
        this.f20976l.setImageResource(i);
        addView(textView);
        addView(this.f20976l);
        invalidate();
    }

    private void a(int i) {
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20967b = "";
        this.f20968c = "";
        this.f20969d = "";
        this.f20970e = "anythink_splash_btn_arrow_right";
        this.f20971f = "anythink_splash_btn_circle";
        this.f20972g = "anythink_splash_btn_finger";
        this.f20973h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20978n = new RectF();
        this.f20979o = new Paint();
        this.f20980p = new Paint();
        a();
    }

    private boolean a(String str) {
        if (TextUtils.equals(str, this.f20967b)) {
            this.f20975k = 2;
            return true;
        }
        if (TextUtils.equals(str, this.f20969d)) {
            this.f20975k = 3;
            return true;
        }
        if (!TextUtils.equals(str, this.f20968c)) {
            return false;
        }
        this.f20975k = 1;
        return true;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20967b = "";
        this.f20968c = "";
        this.f20969d = "";
        this.f20970e = "anythink_splash_btn_arrow_right";
        this.f20971f = "anythink_splash_btn_circle";
        this.f20972g = "anythink_splash_btn_finger";
        this.f20973h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20978n = new RectF();
        this.f20979o = new Paint();
        this.f20980p = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f20967b = "";
        this.f20968c = "";
        this.f20969d = "";
        this.f20970e = "anythink_splash_btn_arrow_right";
        this.f20971f = "anythink_splash_btn_circle";
        this.f20972g = "anythink_splash_btn_finger";
        this.f20973h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20978n = new RectF();
        this.f20979o = new Paint();
        this.f20980p = new Paint();
    }
}
