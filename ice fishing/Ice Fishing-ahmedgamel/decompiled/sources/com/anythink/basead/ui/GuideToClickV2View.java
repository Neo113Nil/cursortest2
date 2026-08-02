package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.WaveAnimImageView;
import com.anythink.core.common.v.q;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public class GuideToClickV2View extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f10832a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f10833b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10834c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10835d;

    /* renamed from: e, reason: collision with root package name */
    float f10836e;

    /* renamed from: f, reason: collision with root package name */
    float f10837f;

    /* renamed from: g, reason: collision with root package name */
    float f10838g;

    /* renamed from: h, reason: collision with root package name */
    float f10839h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    float f10840j;

    /* renamed from: k, reason: collision with root package name */
    final int f10841k;

    /* renamed from: l, reason: collision with root package name */
    final int f10842l;

    /* renamed from: m, reason: collision with root package name */
    final float f10843m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f10844n;

    /* renamed from: o, reason: collision with root package name */
    ValueAnimator f10845o;

    /* renamed from: p, reason: collision with root package name */
    ScaleAnimation f10846p;

    public GuideToClickV2View(Context context) {
        super(context);
        this.f10841k = 1000;
        this.f10842l = 200;
        this.f10843m = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(q.a(context, "myoffer_guide_to_click_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.f10836e = 0.8f;
        this.f10837f = 0.05f;
        this.f10838g = q.a(context, 4.0f);
        this.f10839h = q.a(context, 8.0f);
        this.i = q.a(context, 2.0f);
        this.f10840j = q.a(context, 30.0f);
        this.f10832a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f10833b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f10844n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10845o = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10834c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f10846p = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f10846p.setRepeatCount(-1);
        this.f10846p.setDuration(333L);
        this.f10835d = (TextView) findViewById(q.a(context, "myoffer_guide_to_click_hint", "id"));
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10844n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10844n.removeAllUpdateListeners();
            this.f10844n.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10845o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10845o.removeAllUpdateListeners();
            this.f10845o.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10846p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void hideBackground() {
        setBackgroundColor(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnim(this.f10844n, this.f10832a, 0L);
        startAnim(this.f10845o, this.f10833b, 800L);
        this.f10834c.startAnimation(this.f10846p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10844n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10844n.removeAllUpdateListeners();
            this.f10844n.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10845o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10845o.removeAllUpdateListeners();
            this.f10845o.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10846p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void setFingerImageResource(Bitmap bitmap) {
        ImageView imageView = this.f10834c;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void setFingerViewType(int i) {
        int a9 = q.a(getContext(), 84.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10832a.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10833b.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f10834c.getLayoutParams();
        this.f10835d.getLayoutParams();
        if (i != 2) {
            if (i == 4 || i == 5 || i == 6) {
                int i4 = (int) (a9 * 0.5d);
                this.f10838g = q.a(getContext(), 2.0f);
                this.f10839h = q.a(getContext(), 4.0f);
                this.f10840j = q.a(getContext(), 8.0f);
                layoutParams.width = i4;
                layoutParams.height = i4;
                this.f10832a.setLayoutParams(layoutParams);
                layoutParams2.width = i4;
                layoutParams2.height = i4;
                this.f10833b.setLayoutParams(layoutParams2);
                layoutParams3.width = i4 / 3;
                layoutParams3.height = (int) ((i4 / 3.0d) * 1.1d);
                int i6 = i4 / 2;
                layoutParams3.setMargins(i6, i6, 0, 0);
                this.f10834c.setLayoutParams(layoutParams3);
                this.f10835d.setVisibility(8);
                return;
            }
            return;
        }
        int i9 = (int) (a9 * 0.7d);
        this.f10838g = q.a(getContext(), 4.0f);
        this.f10839h = q.a(getContext(), 4.0f);
        this.f10840j = q.a(getContext(), 14.0f);
        layoutParams.width = i9;
        layoutParams.height = i9;
        this.f10832a.setLayoutParams(layoutParams);
        layoutParams2.width = i9;
        layoutParams2.height = i9;
        this.f10833b.setLayoutParams(layoutParams2);
        int i10 = i9 / 2;
        layoutParams3.width = i10;
        layoutParams3.height = (int) ((i9 / 2.0d) * 1.1d);
        layoutParams3.setMargins((int) (i10 * 0.9d), i10, 0, 0);
        this.f10834c.setLayoutParams(layoutParams3);
        this.f10835d.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f10835d.getLayoutParams();
        layoutParams4.topMargin = q.a(getContext(), 6.0f);
        this.f10835d.setLayoutParams(layoutParams4);
        this.f10835d.setTextSize(1, 14.0f);
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j6) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.GuideToClickV2View.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f2;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    GuideToClickV2View guideToClickV2View = GuideToClickV2View.this;
                    float f10 = guideToClickV2View.i;
                    float a9 = Wv.a(guideToClickV2View.f10840j, f10, f9, f10);
                    float a10 = Wv.a(guideToClickV2View.f10839h, f10, f9, guideToClickV2View.f10838g);
                    double d9 = f9;
                    if (d9 < 0.2d) {
                        f2 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (guideToClickV2View.f10837f - r3)) + guideToClickV2View.f10836e);
                    } else {
                        f2 = (float) (((((d9 - 0.2d) * 1.0d) / 0.8d) * (guideToClickV2View.f10837f - r15)) + guideToClickV2View.f10836e);
                    }
                    try {
                        if (guideToClickV2View.getVisibility() == 0) {
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

    public GuideToClickV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10841k = 1000;
        this.f10842l = 200;
        this.f10843m = 0.71428573f;
        a(context);
    }

    public GuideToClickV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10841k = 1000;
        this.f10842l = 200;
        this.f10843m = 0.71428573f;
        a(context);
    }

    private void a() {
        startAnim(this.f10844n, this.f10832a, 0L);
        startAnim(this.f10845o, this.f10833b, 800L);
        this.f10834c.startAnimation(this.f10846p);
    }
}
