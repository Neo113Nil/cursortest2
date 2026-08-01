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
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* loaded from: classes.dex */
public class SimpleGuideToClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f10281a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f10282b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10283c;

    /* renamed from: d, reason: collision with root package name */
    float f10284d;

    /* renamed from: e, reason: collision with root package name */
    float f10285e;

    /* renamed from: f, reason: collision with root package name */
    float f10286f;

    /* renamed from: g, reason: collision with root package name */
    float f10287g;

    /* renamed from: h, reason: collision with root package name */
    float f10288h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    final int f10289j;

    /* renamed from: k, reason: collision with root package name */
    final int f10290k;

    /* renamed from: l, reason: collision with root package name */
    final float f10291l;

    /* renamed from: m, reason: collision with root package name */
    ValueAnimator f10292m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f10293n;

    /* renamed from: o, reason: collision with root package name */
    ScaleAnimation f10294o;

    public SimpleGuideToClickView(Context context) {
        super(context);
        this.f10289j = 1000;
        this.f10290k = 200;
        this.f10291l = 0.71428573f;
    }

    private void a() {
        if (this.f10283c != null) {
            startAnim(this.f10292m, this.f10281a, 0L);
            startAnim(this.f10293n, this.f10282b, 800L);
            this.f10283c.startAnimation(this.f10294o);
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10292m;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10292m.removeAllUpdateListeners();
            this.f10292m.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10293n;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10293n.removeAllUpdateListeners();
            this.f10293n.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10294o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void init(int i, int i6, int i9, int i10, int i11) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(i, this);
        this.f10284d = 0.8f;
        this.f10285e = 0.05f;
        this.f10286f = i6;
        this.f10287g = i10;
        this.f10288h = i9;
        this.i = i11;
        this.f10281a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f10282b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f10292m = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10293n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10283c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f10294o = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f10294o.setRepeatCount(-1);
        this.f10294o.setDuration(333L);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10283c != null) {
            startAnim(this.f10292m, this.f10281a, 0L);
            startAnim(this.f10293n, this.f10282b, 800L);
            this.f10283c.startAnimation(this.f10294o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10292m;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10292m.removeAllUpdateListeners();
            this.f10292m.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10293n;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10293n.removeAllUpdateListeners();
            this.f10293n.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10294o;
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
                    float f3;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    SimpleGuideToClickView simpleGuideToClickView = SimpleGuideToClickView.this;
                    float f10 = simpleGuideToClickView.f10288h;
                    float a9 = AbstractC4404f.a(simpleGuideToClickView.i, f10, f9, f10);
                    float a10 = AbstractC4404f.a(simpleGuideToClickView.f10287g, f10, f9, simpleGuideToClickView.f10286f);
                    double d2 = f9;
                    if (d2 < 0.2d) {
                        f3 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (simpleGuideToClickView.f10285e - r3)) + simpleGuideToClickView.f10284d);
                    } else {
                        f3 = (float) (((((d2 - 0.2d) * 1.0d) / 0.8d) * (simpleGuideToClickView.f10285e - r15)) + simpleGuideToClickView.f10284d);
                    }
                    try {
                        if (simpleGuideToClickView.getVisibility() == 0) {
                            waveAnimImageView.setWaveAnimParams(new WaveAnimImageView.a(a9, a10, f3));
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
        this.f10289j = 1000;
        this.f10290k = 200;
        this.f10291l = 0.71428573f;
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10289j = 1000;
        this.f10290k = 200;
        this.f10291l = 0.71428573f;
    }
}
