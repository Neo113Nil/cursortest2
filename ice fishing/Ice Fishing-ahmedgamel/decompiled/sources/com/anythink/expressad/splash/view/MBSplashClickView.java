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
    private static final String f21595a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: b, reason: collision with root package name */
    private String f21596b;

    /* renamed from: c, reason: collision with root package name */
    private String f21597c;

    /* renamed from: d, reason: collision with root package name */
    private String f21598d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21599e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21600f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21601g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21602h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private String f21603j;

    /* renamed from: k, reason: collision with root package name */
    private int f21604k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f21605l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f21606m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f21607n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f21608o;

    /* renamed from: p, reason: collision with root package name */
    private final Paint f21609p;

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1, reason: invalid class name */
    public class AnonymousClass1 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f21610a;

        public AnonymousClass1(ScaleAnimation scaleAnimation) {
            this.f21610a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f21606m.setVisibility(4);
            MBSplashClickView.this.f21606m.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f21606m.startAnimation(AnonymousClass1.this.f21610a);
                }
            }, 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f21606m.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f21613a;

        public AnonymousClass2(ScaleAnimation scaleAnimation) {
            this.f21613a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.f21606m.startAnimation(this.f21613a);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3, reason: invalid class name */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.f21605l.setVisibility(4);
            MBSplashClickView.this.f21605l.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f21605l.startAnimation(animation);
                }
            }, com.anythink.basead.exoplayer.i.a.f8669f);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f21605l.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f21596b = "";
        this.f21597c = "";
        this.f21598d = "";
        this.f21599e = "anythink_splash_btn_arrow_right";
        this.f21600f = "anythink_splash_btn_circle";
        this.f21601g = "anythink_splash_btn_finger";
        this.f21602h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f21607n = new RectF();
        this.f21608o = new Paint();
        this.f21609p = new Paint();
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
        this.f21606m.setVisibility(4);
        this.f21605l.startAnimation(scaleAnimation);
        this.f21606m.postDelayed(new AnonymousClass2(scaleAnimation2), 500L);
    }

    private void d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnonymousClass3());
        this.f21605l.startAnimation(translateAnimation);
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f21605l.startAnimation(scaleAnimation);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f21607n, this.f21609p, 31);
        canvas.drawRoundRect(this.f21607n, 200.0f, 200.0f, this.f21609p);
        canvas.saveLayer(this.f21607n, this.f21608o, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        this.f21603j = str;
        if (TextUtils.equals(str, this.f21596b)) {
            this.f21604k = 2;
        } else if (TextUtils.equals(str, this.f21598d)) {
            this.f21604k = 3;
        } else if (TextUtils.equals(str, this.f21597c)) {
            this.f21604k = 1;
        } else {
            if (TextUtils.isEmpty(this.f21603j)) {
                this.f21603j = this.f21596b;
            }
            this.f21604k = 2;
        }
        int i4 = this.f21604k;
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
        textView.setText(this.f21603j);
        this.f21605l = new ImageView(getContext());
        int i6 = this.f21604k;
        if (i6 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.f20419c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i6 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.f20419c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.f20419c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i6 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.f20419c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.f21606m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.f21606m.setLayoutParams(layoutParams4);
            this.f21606m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.f20419c));
            addView(this.f21606m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.f21605l.setLayoutParams(layoutParams);
        this.f21605l.setImageResource(i);
        addView(textView);
        addView(this.f21605l);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f21604k;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f21605l.startAnimation(scaleAnimation);
            return;
        }
        if (i == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnonymousClass3());
            this.f21605l.startAnimation(translateAnimation);
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
            this.f21606m.setVisibility(4);
            this.f21605l.startAnimation(scaleAnimation2);
            this.f21606m.postDelayed(new AnonymousClass2(scaleAnimation3), 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        this.f21607n.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f21608o.setAntiAlias(true);
        this.f21608o.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f21609p.setAntiAlias(true);
        this.f21609p.setColor(-1);
        this.f21596b = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_view", k.f20423g));
        this.f21597c = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_open", k.f20423g));
        this.f21598d = getContext().getString(k.a(getContext(), "anythink_cm_shake_view_click_default_inst", k.f20423g));
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int i;
        String str = this.f21603j;
        if (TextUtils.equals(str, this.f21596b)) {
            this.f21604k = 2;
        } else if (TextUtils.equals(str, this.f21598d)) {
            this.f21604k = 3;
        } else if (TextUtils.equals(str, this.f21597c)) {
            this.f21604k = 1;
        } else {
            if (TextUtils.isEmpty(this.f21603j)) {
                this.f21603j = this.f21596b;
            }
            this.f21604k = 2;
        }
        int i4 = this.f21604k;
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
        textView.setText(this.f21603j);
        this.f21605l = new ImageView(getContext());
        int i6 = this.f21604k;
        if (i6 == 2) {
            i = k.a(getContext(), "anythink_splash_btn_go", k.f20419c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 35.0f), v.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.b(getContext(), 10.0f);
        } else if (i6 == 1) {
            i = k.a(getContext(), "anythink_splash_btn_light", k.f20419c);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.b(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "anythink_splash_btn_arrow_right", k.f20419c));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i6 == 3) {
            i = k.a(getContext(), "anythink_splash_btn_finger", k.f20419c);
            layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 25.0f), v.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.b(getContext(), 50.0f);
            layoutParams.topMargin = v.b(getContext(), 18.0f);
            this.f21606m = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.b(getContext(), 30.0f), v.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.b(getContext(), 50.0f);
            layoutParams4.topMargin = v.b(getContext(), 5.0f);
            this.f21606m.setLayoutParams(layoutParams4);
            this.f21606m.setImageResource(k.a(getContext(), "anythink_splash_btn_circle", k.f20419c));
            addView(this.f21606m);
        } else {
            layoutParams = null;
            i = 0;
        }
        this.f21605l.setLayoutParams(layoutParams);
        this.f21605l.setImageResource(i);
        addView(textView);
        addView(this.f21605l);
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
        this.f21596b = "";
        this.f21597c = "";
        this.f21598d = "";
        this.f21599e = "anythink_splash_btn_arrow_right";
        this.f21600f = "anythink_splash_btn_circle";
        this.f21601g = "anythink_splash_btn_finger";
        this.f21602h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f21607n = new RectF();
        this.f21608o = new Paint();
        this.f21609p = new Paint();
        a();
    }

    private boolean a(String str) {
        if (TextUtils.equals(str, this.f21596b)) {
            this.f21604k = 2;
            return true;
        }
        if (TextUtils.equals(str, this.f21598d)) {
            this.f21604k = 3;
            return true;
        }
        if (!TextUtils.equals(str, this.f21597c)) {
            return false;
        }
        this.f21604k = 1;
        return true;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21596b = "";
        this.f21597c = "";
        this.f21598d = "";
        this.f21599e = "anythink_splash_btn_arrow_right";
        this.f21600f = "anythink_splash_btn_circle";
        this.f21601g = "anythink_splash_btn_finger";
        this.f21602h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f21607n = new RectF();
        this.f21608o = new Paint();
        this.f21609p = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f21596b = "";
        this.f21597c = "";
        this.f21598d = "";
        this.f21599e = "anythink_splash_btn_arrow_right";
        this.f21600f = "anythink_splash_btn_circle";
        this.f21601g = "anythink_splash_btn_finger";
        this.f21602h = "anythink_splash_btn_go";
        this.i = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f21607n = new RectF();
        this.f21608o = new Paint();
        this.f21609p = new Paint();
    }
}
