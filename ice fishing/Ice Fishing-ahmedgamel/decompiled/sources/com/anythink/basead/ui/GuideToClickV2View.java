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
import com.icefishing.icefishingbigwin.AbstractC4404f;

/* loaded from: classes.dex */
public class GuideToClickV2View extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f10046a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f10047b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10048c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10049d;

    /* renamed from: e, reason: collision with root package name */
    float f10050e;

    /* renamed from: f, reason: collision with root package name */
    float f10051f;

    /* renamed from: g, reason: collision with root package name */
    float f10052g;

    /* renamed from: h, reason: collision with root package name */
    float f10053h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    float f10054j;

    /* renamed from: k, reason: collision with root package name */
    final int f10055k;

    /* renamed from: l, reason: collision with root package name */
    final int f10056l;

    /* renamed from: m, reason: collision with root package name */
    final float f10057m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f10058n;

    /* renamed from: o, reason: collision with root package name */
    ValueAnimator f10059o;

    /* renamed from: p, reason: collision with root package name */
    ScaleAnimation f10060p;

    public GuideToClickV2View(Context context) {
        super(context);
        this.f10055k = 1000;
        this.f10056l = 200;
        this.f10057m = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(q.a(context, "myoffer_guide_to_click_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.f10050e = 0.8f;
        this.f10051f = 0.05f;
        this.f10052g = q.a(context, 4.0f);
        this.f10053h = q.a(context, 8.0f);
        this.i = q.a(context, 2.0f);
        this.f10054j = q.a(context, 30.0f);
        this.f10046a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f10047b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f10058n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10059o = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10048c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f10060p = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f10060p.setRepeatCount(-1);
        this.f10060p.setDuration(333L);
        this.f10049d = (TextView) findViewById(q.a(context, "myoffer_guide_to_click_hint", "id"));
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10058n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10058n.removeAllUpdateListeners();
            this.f10058n.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10059o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10059o.removeAllUpdateListeners();
            this.f10059o.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10060p;
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
        startAnim(this.f10058n, this.f10046a, 0L);
        startAnim(this.f10059o, this.f10047b, 800L);
        this.f10048c.startAnimation(this.f10060p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10058n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10058n.removeAllUpdateListeners();
            this.f10058n.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10059o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10059o.removeAllUpdateListeners();
            this.f10059o.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10060p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void setFingerImageResource(Bitmap bitmap) {
        ImageView imageView = this.f10048c;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void setFingerViewType(int i) {
        int a9 = q.a(getContext(), 84.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10046a.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10047b.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f10048c.getLayoutParams();
        this.f10049d.getLayoutParams();
        if (i != 2) {
            if (i == 4 || i == 5 || i == 6) {
                int i6 = (int) (a9 * 0.5d);
                this.f10052g = q.a(getContext(), 2.0f);
                this.f10053h = q.a(getContext(), 4.0f);
                this.f10054j = q.a(getContext(), 8.0f);
                layoutParams.width = i6;
                layoutParams.height = i6;
                this.f10046a.setLayoutParams(layoutParams);
                layoutParams2.width = i6;
                layoutParams2.height = i6;
                this.f10047b.setLayoutParams(layoutParams2);
                layoutParams3.width = i6 / 3;
                layoutParams3.height = (int) ((i6 / 3.0d) * 1.1d);
                int i9 = i6 / 2;
                layoutParams3.setMargins(i9, i9, 0, 0);
                this.f10048c.setLayoutParams(layoutParams3);
                this.f10049d.setVisibility(8);
                return;
            }
            return;
        }
        int i10 = (int) (a9 * 0.7d);
        this.f10052g = q.a(getContext(), 4.0f);
        this.f10053h = q.a(getContext(), 4.0f);
        this.f10054j = q.a(getContext(), 14.0f);
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f10046a.setLayoutParams(layoutParams);
        layoutParams2.width = i10;
        layoutParams2.height = i10;
        this.f10047b.setLayoutParams(layoutParams2);
        int i11 = i10 / 2;
        layoutParams3.width = i11;
        layoutParams3.height = (int) ((i10 / 2.0d) * 1.1d);
        layoutParams3.setMargins((int) (i11 * 0.9d), i11, 0, 0);
        this.f10048c.setLayoutParams(layoutParams3);
        this.f10049d.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f10049d.getLayoutParams();
        layoutParams4.topMargin = q.a(getContext(), 6.0f);
        this.f10049d.setLayoutParams(layoutParams4);
        this.f10049d.setTextSize(1, 14.0f);
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
                    float f3;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    GuideToClickV2View guideToClickV2View = GuideToClickV2View.this;
                    float f10 = guideToClickV2View.i;
                    float a9 = AbstractC4404f.a(guideToClickV2View.f10054j, f10, f9, f10);
                    float a10 = AbstractC4404f.a(guideToClickV2View.f10053h, f10, f9, guideToClickV2View.f10052g);
                    double d2 = f9;
                    if (d2 < 0.2d) {
                        f3 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (guideToClickV2View.f10051f - r3)) + guideToClickV2View.f10050e);
                    } else {
                        f3 = (float) (((((d2 - 0.2d) * 1.0d) / 0.8d) * (guideToClickV2View.f10051f - r15)) + guideToClickV2View.f10050e);
                    }
                    try {
                        if (guideToClickV2View.getVisibility() == 0) {
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

    public GuideToClickV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10055k = 1000;
        this.f10056l = 200;
        this.f10057m = 0.71428573f;
        a(context);
    }

    public GuideToClickV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10055k = 1000;
        this.f10056l = 200;
        this.f10057m = 0.71428573f;
        a(context);
    }

    private void a() {
        startAnim(this.f10058n, this.f10046a, 0L);
        startAnim(this.f10059o, this.f10047b, 800L);
        this.f10048c.startAnimation(this.f10060p);
    }
}
