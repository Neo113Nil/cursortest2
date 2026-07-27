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
import com.google.android.gms.internal.ads.CL;

/* loaded from: classes.dex */
public class SimpleGuideToClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f10438a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f10439b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10440c;

    /* renamed from: d, reason: collision with root package name */
    float f10441d;

    /* renamed from: e, reason: collision with root package name */
    float f10442e;

    /* renamed from: f, reason: collision with root package name */
    float f10443f;

    /* renamed from: g, reason: collision with root package name */
    float f10444g;

    /* renamed from: h, reason: collision with root package name */
    float f10445h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    final int f10446j;

    /* renamed from: k, reason: collision with root package name */
    final int f10447k;

    /* renamed from: l, reason: collision with root package name */
    final float f10448l;

    /* renamed from: m, reason: collision with root package name */
    ValueAnimator f10449m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f10450n;

    /* renamed from: o, reason: collision with root package name */
    ScaleAnimation f10451o;

    public SimpleGuideToClickView(Context context) {
        super(context);
        this.f10446j = 1000;
        this.f10447k = 200;
        this.f10448l = 0.71428573f;
    }

    private void a() {
        if (this.f10440c != null) {
            startAnim(this.f10449m, this.f10438a, 0L);
            startAnim(this.f10450n, this.f10439b, 800L);
            this.f10440c.startAnimation(this.f10451o);
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10449m;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10449m.removeAllUpdateListeners();
            this.f10449m.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10450n;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10450n.removeAllUpdateListeners();
            this.f10450n.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10451o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void init(int i, int i4, int i9, int i10, int i11) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(i, this);
        this.f10441d = 0.8f;
        this.f10442e = 0.05f;
        this.f10443f = i4;
        this.f10444g = i10;
        this.f10445h = i9;
        this.i = i11;
        this.f10438a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f10439b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f10449m = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10450n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10440c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f10451o = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f10451o.setRepeatCount(-1);
        this.f10451o.setDuration(333L);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10440c != null) {
            startAnim(this.f10449m, this.f10438a, 0L);
            startAnim(this.f10450n, this.f10439b, 800L);
            this.f10440c.startAnimation(this.f10451o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10449m;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10449m.removeAllUpdateListeners();
            this.f10449m.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10450n;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10450n.removeAllUpdateListeners();
            this.f10450n.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10451o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j9) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SimpleGuideToClickView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f6;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    SimpleGuideToClickView simpleGuideToClickView = SimpleGuideToClickView.this;
                    float f10 = simpleGuideToClickView.f10445h;
                    float a9 = CL.a(simpleGuideToClickView.i, f10, f9, f10);
                    float a10 = CL.a(simpleGuideToClickView.f10444g, f10, f9, simpleGuideToClickView.f10443f);
                    double d2 = f9;
                    if (d2 < 0.2d) {
                        f6 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (simpleGuideToClickView.f10442e - r3)) + simpleGuideToClickView.f10441d);
                    } else {
                        f6 = (float) (((((d2 - 0.2d) * 1.0d) / 0.8d) * (simpleGuideToClickView.f10442e - r15)) + simpleGuideToClickView.f10441d);
                    }
                    try {
                        if (simpleGuideToClickView.getVisibility() == 0) {
                            waveAnimImageView.setWaveAnimParams(new WaveAnimImageView.a(a9, a10, f6));
                            if (waveAnimImageView.getVisibility() != 0) {
                                waveAnimImageView.setVisibility(0);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            valueAnimator.setStartDelay(j9);
            valueAnimator.start();
        }
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10446j = 1000;
        this.f10447k = 200;
        this.f10448l = 0.71428573f;
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10446j = 1000;
        this.f10447k = 200;
        this.f10448l = 0.71428573f;
    }
}
