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
    private static final String f20808a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: b, reason: collision with root package name */
    private String f20809b;

    /* renamed from: c, reason: collision with root package name */
    private String f20810c;

    /* renamed from: d, reason: collision with root package name */
    private String f20811d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20812e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20813f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20814g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20815h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private String f20816j;

    /* renamed from: k, reason: collision with root package name */
    private int f20817k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f20818l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f20819m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f20820n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f20821o;

    /* renamed from: p, reason: collision with root package name */
    private final Paint f20822p;

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1, reason: invalid class name */
    public class AnonymousClass1 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f20823a;

        public AnonymousClass1(ScaleAnimation scaleAnimation) {
            this.f20823a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f20819m.setVisibility(4);
            MBSplashClickView.this.f20819m.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f20819m.startAnimation(AnonymousClass1.this.f20823a);
                }
            }, 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f20819m.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f20826a;

        public AnonymousClass2(ScaleAnimation scaleAnimation) {
            this.f20826a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.f20819m.startAnimation(this.f20826a);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3, reason: invalid class name */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.f20818l.setVisibility(4);
            MBSplashClickView.this.f20818l.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f20818l.startAnimation(animation);
                }
            }, com.anythink.basead.exoplayer.i.a.f7883f);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f20818l.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f20809b = "";
        this.f20810c = "";
        this.f20811d = "";
        this.f20812e = "anythink_splash_btn_arrow_right";
        this.f20813f = "anythink_splash_btn_circle";
        this.f20814g = "anythink_splash_btn_finger";
        this.f20815h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20820n = new RectF();
        this.f20821o = new Paint();
        this.f20822p = new Paint();
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
        this.f20819m.setVisibility(4);
        this.f20818l.startAnimation(scaleAnimation);
        this.f20819m.postDelayed(new AnonymousClass2(scaleAnimation2), 500L);
    }

    private void d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnonymousClass3());
        this.f20818l.startAnimation(translateAnimation);
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f20818l.startAnimation(scaleAnimation);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f20820n, this.f20822p, 31);
        canvas.drawRoundRect(this.f20820n, 200.0f, 200.0f, this.f20822p);
        canvas.saveLayer(this.f20820n, this.f20821o, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        this.f20816j = str;
        if (TextUtils.equals(str, this.f20809b)) {
            this.f20817k = 2;
        } else if (TextUtils.equals(str, this.f20811d)) {
            this.f20817k = 3;
        } else if (TextUtils.equals(str, this.f20810c)) {
            this.f20817k = 1;
        } else {
            if (TextUtils.isEmpty(this.f20816j)) {
                this.f20816j = this.f20809b;
            }
            this.f20817k = 2;
        }
        int i6 = this.f20817k;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i6 == 2) {
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
        textView.setText(this.f20816j);
        this.f20818l = new ImageView(getContext());
        int i9 = this.f20817k;
        if (i9 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.f19632c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i9 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.f19632c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.f19632c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i9 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.f19632c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.f20819m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.f20819m.setLayoutParams(layoutParams4);
            this.f20819m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.f19632c));
            addView(this.f20819m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.f20818l.setLayoutParams(layoutParams);
        this.f20818l.setImageResource(i);
        addView(textView);
        addView(this.f20818l);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f20817k;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f20818l.startAnimation(scaleAnimation);
            return;
        }
        if (i == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnonymousClass3());
            this.f20818l.startAnimation(translateAnimation);
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
            this.f20819m.setVisibility(4);
            this.f20818l.startAnimation(scaleAnimation2);
            this.f20819m.postDelayed(new AnonymousClass2(scaleAnimation3), 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        this.f20820n.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f20821o.setAntiAlias(true);
        this.f20821o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f20822p.setAntiAlias(true);
        this.f20822p.setColor(-1);
        this.f20809b = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_view", k.f19636g));
        this.f20810c = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_open", k.f19636g));
        this.f20811d = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_inst", k.f19636g));
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        String str = this.f20816j;
        if (TextUtils.equals(str, this.f20809b)) {
            this.f20817k = 2;
        } else if (TextUtils.equals(str, this.f20811d)) {
            this.f20817k = 3;
        } else if (TextUtils.equals(str, this.f20810c)) {
            this.f20817k = 1;
        } else {
            if (TextUtils.isEmpty(this.f20816j)) {
                this.f20816j = this.f20809b;
            }
            this.f20817k = 2;
        }
        int i6 = this.f20817k;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i6 == 2) {
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
        textView.setText(this.f20816j);
        this.f20818l = new ImageView(getContext());
        int i9 = this.f20817k;
        if (i9 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.f19632c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i9 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.f19632c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.f19632c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i9 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.f19632c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.f20819m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.f20819m.setLayoutParams(layoutParams4);
            this.f20819m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.f19632c));
            addView(this.f20819m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.f20818l.setLayoutParams(layoutParams);
        this.f20818l.setImageResource(i);
        addView(textView);
        addView(this.f20818l);
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
        this.f20809b = "";
        this.f20810c = "";
        this.f20811d = "";
        this.f20812e = "anythink_splash_btn_arrow_right";
        this.f20813f = "anythink_splash_btn_circle";
        this.f20814g = "anythink_splash_btn_finger";
        this.f20815h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20820n = new RectF();
        this.f20821o = new Paint();
        this.f20822p = new Paint();
        a();
    }

    private boolean a(String str) {
        if (TextUtils.equals(str, this.f20809b)) {
            this.f20817k = 2;
            return true;
        }
        if (TextUtils.equals(str, this.f20811d)) {
            this.f20817k = 3;
            return true;
        }
        if (!TextUtils.equals(str, this.f20810c)) {
            return false;
        }
        this.f20817k = 1;
        return true;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20809b = "";
        this.f20810c = "";
        this.f20811d = "";
        this.f20812e = "anythink_splash_btn_arrow_right";
        this.f20813f = "anythink_splash_btn_circle";
        this.f20814g = "anythink_splash_btn_finger";
        this.f20815h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20820n = new RectF();
        this.f20821o = new Paint();
        this.f20822p = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i6) {
        super(context, attributeSet, i, i6);
        this.f20809b = "";
        this.f20810c = "";
        this.f20811d = "";
        this.f20812e = "anythink_splash_btn_arrow_right";
        this.f20813f = "anythink_splash_btn_circle";
        this.f20814g = "anythink_splash_btn_finger";
        this.f20815h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f20820n = new RectF();
        this.f20821o = new Paint();
        this.f20822p = new Paint();
    }
}
