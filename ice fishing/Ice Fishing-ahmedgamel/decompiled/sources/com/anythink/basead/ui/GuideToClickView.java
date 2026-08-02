package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.ui.WaveAnimImageView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public class GuideToClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f10849a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f10850b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f10851c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10852d;

    /* renamed from: e, reason: collision with root package name */
    float f10853e;

    /* renamed from: f, reason: collision with root package name */
    float f10854f;

    /* renamed from: g, reason: collision with root package name */
    float f10855g;

    /* renamed from: h, reason: collision with root package name */
    float f10856h;
    float i;

    /* renamed from: j, reason: collision with root package name */
    float f10857j;

    /* renamed from: k, reason: collision with root package name */
    final int f10858k;

    /* renamed from: l, reason: collision with root package name */
    final int f10859l;

    /* renamed from: m, reason: collision with root package name */
    final float f10860m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f10861n;

    /* renamed from: o, reason: collision with root package name */
    ValueAnimator f10862o;

    /* renamed from: p, reason: collision with root package name */
    ScaleAnimation f10863p;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10867a = 501;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10868b = 502;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10869c = 503;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10870d = 504;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10871e = 505;

        /* renamed from: f, reason: collision with root package name */
        public static final int f10872f = 506;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10873g = 507;
    }

    public GuideToClickView(Context context) {
        super(context);
        this.f10858k = 1000;
        this.f10859l = 200;
        this.f10860m = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(q.a(context, "myoffer_guide_to_click", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.f10853e = 0.8f;
        this.f10854f = 0.05f;
        this.f10855g = q.a(context, 4.0f);
        this.f10856h = q.a(context, 18.0f);
        this.i = q.a(context, 2.0f);
        this.f10857j = q.a(context, 40.0f);
        this.f10849a = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image", "id"));
        this.f10850b = (WaveAnimImageView) findViewById(q.a(context, "myoffer_wave_anim_image2", "id"));
        this.f10861n = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10862o = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10851c = (ImageView) findViewById(q.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.f10863p = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.f10863p.setRepeatCount(-1);
        this.f10863p.setDuration(333L);
        this.f10852d = (TextView) findViewById(q.a(context, "myoffer_guide_to_click_hint", "id"));
        String a9 = g.a().a(b.d.i);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.GuideToClickView.1
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                ImageView imageView = GuideToClickView.this.f10851c;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
            }
        });
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10861n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10862o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10863p;
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
        startAnim(this.f10861n, this.f10849a, 0L);
        startAnim(this.f10862o, this.f10850b, 800L);
        this.f10851c.startAnimation(this.f10863p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f10861n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10862o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ScaleAnimation scaleAnimation = this.f10863p;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void setFingerImageResource(Bitmap bitmap) {
        ImageView imageView = this.f10851c;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void setFingerViewMode(int i) {
        int a9;
        int a10;
        hideBackground();
        q.a(getContext(), 200.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10849a.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10850b.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f10851c.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f10852d.getLayoutParams();
        switch (i) {
            case 501:
            case 507:
                layoutParams.addRule(14);
                layoutParams.addRule(13, 0);
                this.f10849a.setLayoutParams(layoutParams);
                layoutParams2.addRule(14);
                layoutParams2.addRule(13, 0);
                this.f10850b.setLayoutParams(layoutParams2);
                break;
            case 502:
            case a.f10869c /* 503 */:
                if (i == 502) {
                    a9 = q.a(getContext(), 100.0f);
                    this.f10852d.setTextSize(1, 14.0f);
                    this.f10856h = q.a(getContext(), 12.0f);
                    this.f10857j = q.a(getContext(), 30.0f);
                } else {
                    a9 = q.a(getContext(), 160.0f);
                    this.f10852d.setTextSize(1, 16.0f);
                }
                layoutParams.width = a9;
                layoutParams.height = a9;
                layoutParams.addRule(14);
                layoutParams.addRule(13, 0);
                layoutParams2.width = a9;
                layoutParams2.height = a9;
                layoutParams2.addRule(14);
                layoutParams2.addRule(13, 0);
                int i4 = a9 / 2;
                layoutParams3.width = i4;
                layoutParams3.height = (int) ((a9 / 2.0d) * 1.1d);
                layoutParams3.setMargins(i4, i4, 0, 0);
                break;
            case 504:
            case 505:
            case a.f10872f /* 506 */:
                if (i == 505 || i == 504) {
                    a10 = q.a(getContext(), 50.0f);
                    this.f10856h = q.a(getContext(), 6.0f);
                    this.f10857j = q.a(getContext(), 18.0f);
                } else {
                    a10 = q.a(getContext(), 120.0f);
                    this.f10856h = q.a(getContext(), 8.0f);
                    this.f10857j = q.a(getContext(), 24.0f);
                }
                layoutParams.width = a10;
                layoutParams.height = a10;
                layoutParams.addRule(15);
                layoutParams.addRule(13, 0);
                this.f10849a.setLayoutParams(layoutParams);
                layoutParams2.width = a10;
                layoutParams2.height = a10;
                layoutParams2.addRule(15);
                layoutParams2.addRule(13, 0);
                this.f10850b.setLayoutParams(layoutParams2);
                int i6 = a10 / 2;
                layoutParams3.width = i6;
                layoutParams3.height = (int) ((a10 / 2.0d) * 1.1d);
                layoutParams3.setMargins(i6, i6, 0, 0);
                this.f10851c.setLayoutParams(layoutParams3);
                layoutParams4.addRule(14, 0);
                layoutParams4.addRule(3, 0);
                layoutParams4.addRule(15);
                layoutParams4.addRule(1, this.f10849a.getId());
                layoutParams4.setMargins(q.a(getContext(), 6.0f), 0, q.a(getContext(), 10.0f), 0);
                this.f10852d.setLayoutParams(layoutParams4);
                this.f10852d.setTextSize(1, 12.0f);
                break;
        }
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j6) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.GuideToClickView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f2;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f9 = floatValue / 0.71428573f;
                    GuideToClickView guideToClickView = GuideToClickView.this;
                    float f10 = guideToClickView.i;
                    float a9 = Wv.a(guideToClickView.f10857j, f10, f9, f10);
                    float a10 = Wv.a(guideToClickView.f10856h, f10, f9, guideToClickView.f10855g);
                    double d9 = f9;
                    if (d9 < 0.2d) {
                        f2 = (float) (((1.0d - ((f9 * 1.0f) / 0.2d)) * (guideToClickView.f10854f - r3)) + guideToClickView.f10853e);
                    } else {
                        f2 = (float) (((((d9 - 0.2d) * 1.0d) / 0.8d) * (guideToClickView.f10854f - r15)) + guideToClickView.f10853e);
                    }
                    try {
                        if (guideToClickView.getVisibility() == 0) {
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

    public GuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10858k = 1000;
        this.f10859l = 200;
        this.f10860m = 0.71428573f;
        a(context);
    }

    public GuideToClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10858k = 1000;
        this.f10859l = 200;
        this.f10860m = 0.71428573f;
        a(context);
    }

    private void a() {
        startAnim(this.f10861n, this.f10849a, 0L);
        startAnim(this.f10862o, this.f10850b, 800L);
        this.f10851c.startAnimation(this.f10863p);
    }
}
