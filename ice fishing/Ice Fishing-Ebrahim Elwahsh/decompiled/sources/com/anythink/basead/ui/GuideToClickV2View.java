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
import com.google.android.gms.internal.ads.CL;

/* loaded from: classes.dex */
public class GuideToClickV2View extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f10203a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f10204b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10205c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10206d;

    /* renamed from: e, reason: collision with root package name */
    float f10207e;

    /* renamed from: f, reason: collision with root package name */
    float f10208f;

    /* renamed from: g, reason: collision with root package name */
    float f10209g;

    /* renamed from: h, reason: collision with root package name */
    float f10210h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    float f10211j;

    /* renamed from: k, reason: collision with root package name */
    final int f10212k;

    /* renamed from: l, reason: collision with root package name */
    final int f10213l;

    /* renamed from: m, reason: collision with root package name */
    final float f10214m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f10215n;

    /* renamed from: o, reason: collision with root package name */
    ValueAnimator f10216o;

    /* renamed from: p, reason: collision with root package name */
    ScaleAnimation f10217p;

    public GuideToClickV2View(Context context) {
        super(context);
        this.f10212k = 1000;
        this.f10213l = 200;
        this.f10214m = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(q.a(context, "myoffer_guide_to_click_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.f10207e = 0.8f;
        this.f10208f = 0.05f;
        this.f10209g = q.a(context, 4.0f);
        this.f10210h = q.a(context, 8.0f);
        this.i = q.a(context, 2.0f);
        this.f10211j = q.a(context, 30.0f);
        this.f10203a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f10204b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f10215n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10216o = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10205c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f10217p = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f10217p.setRepeatCount(-1);
        this.f10217p.setDuration(333L);
        this.f10206d = (TextView) findViewById(q.a(context, "myoffer_guide_to_click_hint", "id"));
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10215n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10215n.removeAllUpdateListeners();
            this.f10215n.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10216o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10216o.removeAllUpdateListeners();
            this.f10216o.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10217p;
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
        startAnim(this.f10215n, this.f10203a, 0L);
        startAnim(this.f10216o, this.f10204b, 800L);
        this.f10205c.startAnimation(this.f10217p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10215n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f10215n.removeAllUpdateListeners();
            this.f10215n.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10216o;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f10216o.removeAllUpdateListeners();
            this.f10216o.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10217p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void setFingerImageResource(Bitmap bitmap) {
        ImageView imageView = this.f10205c;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void setFingerViewType(int i) {
        int a9 = q.a(getContext(), 84.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10203a.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10204b.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f10205c.getLayoutParams();
        this.f10206d.getLayoutParams();
        if (i != 2) {
            if (i == 4 || i == 5 || i == 6) {
                int i4 = (int) (a9 * 0.5d);
                this.f10209g = q.a(getContext(), 2.0f);
                this.f10210h = q.a(getContext(), 4.0f);
                this.f10211j = q.a(getContext(), 8.0f);
                layoutParams.width = i4;
                layoutParams.height = i4;
                this.f10203a.setLayoutParams(layoutParams);
                layoutParams2.width = i4;
                layoutParams2.height = i4;
                this.f10204b.setLayoutParams(layoutParams2);
                layoutParams3.width = i4 / 3;
                layoutParams3.height = (int) ((i4 / 3.0d) * 1.1d);
                int i9 = i4 / 2;
                layoutParams3.setMargins(i9, i9, 0, 0);
                this.f10205c.setLayoutParams(layoutParams3);
                this.f10206d.setVisibility(8);
                return;
            }
            return;
        }
        int i10 = (int) (a9 * 0.7d);
        this.f10209g = q.a(getContext(), 4.0f);
        this.f10210h = q.a(getContext(), 4.0f);
        this.f10211j = q.a(getContext(), 14.0f);
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f10203a.setLayoutParams(layoutParams);
        layoutParams2.width = i10;
        layoutParams2.height = i10;
        this.f10204b.setLayoutParams(layoutParams2);
        int i11 = i10 / 2;
        layoutParams3.width = i11;
        layoutParams3.height = (int) ((i10 / 2.0d) * 1.1d);
        layoutParams3.setMargins((int) (i11 * 0.9d), i11, 0, 0);
        this.f10205c.setLayoutParams(layoutParams3);
        this.f10206d.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f10206d.getLayoutParams();
        layoutParams4.topMargin = q.a(getContext(), 6.0f);
        this.f10206d.setLayoutParams(layoutParams4);
        this.f10206d.setTextSize(1, 14.0f);
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j9) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.GuideToClickV2View.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f6;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    GuideToClickV2View guideToClickV2View = GuideToClickV2View.this;
                    float f10 = guideToClickV2View.i;
                    float a9 = CL.a(guideToClickV2View.f10211j, f10, f9, f10);
                    float a10 = CL.a(guideToClickV2View.f10210h, f10, f9, guideToClickV2View.f10209g);
                    double d2 = f9;
                    if (d2 < 0.2d) {
                        f6 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (guideToClickV2View.f10208f - r3)) + guideToClickV2View.f10207e);
                    } else {
                        f6 = (float) (((((d2 - 0.2d) * 1.0d) / 0.8d) * (guideToClickV2View.f10208f - r15)) + guideToClickV2View.f10207e);
                    }
                    try {
                        if (guideToClickV2View.getVisibility() == 0) {
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

    public GuideToClickV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10212k = 1000;
        this.f10213l = 200;
        this.f10214m = 0.71428573f;
        a(context);
    }

    public GuideToClickV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10212k = 1000;
        this.f10213l = 200;
        this.f10214m = 0.71428573f;
        a(context);
    }

    private void a() {
        startAnim(this.f10215n, this.f10203a, 0L);
        startAnim(this.f10216o, this.f10204b, 800L);
        this.f10205c.startAnimation(this.f10217p);
    }
}
