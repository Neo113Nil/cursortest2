package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.WaveAnimImageView;
import com.anythink.core.common.v.q;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public class SimpleGuideToClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f11067a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f11068b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f11069c;

    /* renamed from: d, reason: collision with root package name */
    float f11070d;

    /* renamed from: e, reason: collision with root package name */
    float f11071e;

    /* renamed from: f, reason: collision with root package name */
    float f11072f;

    /* renamed from: g, reason: collision with root package name */
    float f11073g;

    /* renamed from: h, reason: collision with root package name */
    float f11074h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    final int f11075j;

    /* renamed from: k, reason: collision with root package name */
    final int f11076k;

    /* renamed from: l, reason: collision with root package name */
    final float f11077l;

    /* renamed from: m, reason: collision with root package name */
    ValueAnimator f11078m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f11079n;

    /* renamed from: o, reason: collision with root package name */
    ScaleAnimation f11080o;

    public SimpleGuideToClickView(Context context) {
        super(context);
        this.f11075j = 1000;
        this.f11076k = 200;
        this.f11077l = 0.71428573f;
    }

    private void a() {
        if (this.f11069c != null) {
            startAnim(this.f11078m, this.f11067a, 0L);
            startAnim(this.f11079n, this.f11068b, 800L);
            this.f11069c.startAnimation(this.f11080o);
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f11078m;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f11078m.removeAllUpdateListeners();
            this.f11078m.cancel();
        }
        ValueAnimator valueAnimator2 = this.f11079n;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f11079n.removeAllUpdateListeners();
            this.f11079n.cancel();
        }
        ScaleAnimation scaleAnimation = this.f11080o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void init(int i, int i4, int i6, int i9, int i10) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(i, this);
        this.f11070d = 0.8f;
        this.f11071e = 0.05f;
        this.f11072f = i4;
        this.f11073g = i9;
        this.f11074h = i6;
        this.i = i10;
        this.f11067a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f11068b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f11078m = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11079n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11069c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f11080o = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f11080o.setRepeatCount(-1);
        this.f11080o.setDuration(333L);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11069c != null) {
            startAnim(this.f11078m, this.f11067a, 0L);
            startAnim(this.f11079n, this.f11068b, 800L);
            this.f11069c.startAnimation(this.f11080o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f11078m;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f11078m.removeAllUpdateListeners();
            this.f11078m.cancel();
        }
        ValueAnimator valueAnimator2 = this.f11079n;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f11079n.removeAllUpdateListeners();
            this.f11079n.cancel();
        }
        ScaleAnimation scaleAnimation = this.f11080o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j6) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SimpleGuideToClickView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f2;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    SimpleGuideToClickView simpleGuideToClickView = SimpleGuideToClickView.this;
                    float f10 = simpleGuideToClickView.f11074h;
                    float a9 = Wv.a(simpleGuideToClickView.i, f10, f9, f10);
                    float a10 = Wv.a(simpleGuideToClickView.f11073g, f10, f9, simpleGuideToClickView.f11072f);
                    double d9 = f9;
                    if (d9 < 0.2d) {
                        f2 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (simpleGuideToClickView.f11071e - r3)) + simpleGuideToClickView.f11070d);
                    } else {
                        f2 = (float) (((((d9 - 0.2d) * 1.0d) / 0.8d) * (simpleGuideToClickView.f11071e - r15)) + simpleGuideToClickView.f11070d);
                    }
                    try {
                        if (simpleGuideToClickView.getVisibility() == 0) {
                            waveAnimImageView.setWaveAnimParams(new WaveAnimImageView.a(a9, a10, f2));
                            if (waveAnimImageView.getVisibility() != 0) {
                                waveAnimImageView.setVisibility(0);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            valueAnimator.setStartDelay(j6);
            valueAnimator.start();
        }
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11075j = 1000;
        this.f11076k = 200;
        this.f11077l = 0.71428573f;
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11075j = 1000;
        this.f11076k = 200;
        this.f11077l = 0.71428573f;
    }
}
