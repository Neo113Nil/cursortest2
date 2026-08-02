package com.anythink.expressad.video.dynview.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnyThinkSegmentsProgressBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f22188a;

    /* renamed from: b, reason: collision with root package name */
    private int f22189b;

    /* renamed from: c, reason: collision with root package name */
    private int f22190c;

    /* renamed from: d, reason: collision with root package name */
    private int f22191d;

    /* renamed from: e, reason: collision with root package name */
    private int f22192e;

    /* renamed from: f, reason: collision with root package name */
    private int f22193f;

    /* renamed from: g, reason: collision with root package name */
    private int f22194g;

    /* renamed from: h, reason: collision with root package name */
    private int f22195h;
    private List<ProgressBar> i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f22196j;

    /* renamed from: k, reason: collision with root package name */
    private String f22197k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22198l;

    public AnyThinkSegmentsProgressBar(Context context) {
        super(context);
        this.f22188a = "AnyThinkSegmentsProgressBar";
        this.f22190c = 1;
        this.f22191d = 20;
        this.f22192e = 10;
        this.f22193f = 1;
        this.f22194g = -1711276033;
        this.f22195h = -1;
        this.i = new ArrayList();
        this.f22198l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            if (this.f22190c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f22197k)) {
                    this.f22197k = getContext().getString(k.a(getContext(), "anythink_cm_segment_process_bar_hint_text", k.f20423g));
                }
            }
            if (this.f22190c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f22197k)) {
                    this.f22197k = getContext().getString(k.a(getContext(), "anythink_cm_segment_process_bar_hint_text_lite", k.f20423g));
                }
            }
            this.i.clear();
            removeAllViews();
            setBackgroundDrawable(c());
            TextView textView = new TextView(getContext());
            this.f22196j = textView;
            textView.setTextColor(-1);
            this.f22196j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f22196j.setLayoutParams(layoutParams);
            if (this.f22190c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f22196j;
                int i = this.f22191d;
                textView2.setPadding(i / 2, 15, i / 2, 5);
            }
            if (this.f22190c == 2) {
                this.f22196j.setGravity(16);
                TextView textView3 = this.f22196j;
                int i4 = this.f22191d;
                textView3.setPadding(i4 / 2, 0, i4 / 2, 0);
            }
            try {
                int a9 = k.a(getContext(), "anythink_reward_video_icon", k.f20419c);
                if (a9 != 0 && (drawable = getContext().getResources().getDrawable(a9)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f22196j.setCompoundDrawables(drawable, null, null, null);
                    this.f22196j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            this.f22196j.setText(a(this.f22193f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i6 = 0; i6 < this.f22189b; i6++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i9 = this.f22191d;
                layoutParams3.leftMargin = i9 / 2;
                layoutParams3.rightMargin = i9 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.i.add(progressBar);
            }
            int i10 = this.f22190c;
            if (i10 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f22196j);
                addView(linearLayout);
            } else {
                if (i10 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f22196j);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f22192e);
        gradientDrawable.setColor(this.f22194g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f22192e);
        gradientDrawable2.setColor(this.f22195h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    private static GradientDrawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setDither(true);
        try {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{0, 1291845632});
        } catch (Throwable unused) {
        }
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                AnyThinkSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i, int i4) {
        this.f22189b = i;
        this.f22190c = i4;
        a();
    }

    public void setIndicatorText(String str) {
        this.f22197k = str;
    }

    public void setProgress(int i, int i4) {
        try {
            if (this.i.size() == 0) {
                return;
            }
            if (i4 < this.i.size()) {
                this.i.get(i4).setProgress(i);
            }
            int i6 = i4 + 1;
            if (i6 > this.f22193f) {
                this.f22193f = i6;
                TextView textView = this.f22196j;
                if (textView != null) {
                    textView.setText(a(i6));
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void init(int i, int i4, int i6, int i9) {
        this.f22189b = i;
        this.f22190c = i4;
        this.f22195h = i6;
        this.f22194g = i9;
        a();
    }

    public void init(int i, int i4, int i6, int i9, int i10, int i11) {
        this.f22189b = i;
        this.f22190c = i4;
        this.f22195h = i6;
        this.f22194g = i9;
        this.f22191d = i10;
        this.f22192e = i11;
        a();
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22188a = "AnyThinkSegmentsProgressBar";
        this.f22190c = 1;
        this.f22191d = 20;
        this.f22192e = 10;
        this.f22193f = 1;
        this.f22194g = -1711276033;
        this.f22195h = -1;
        this.i = new ArrayList();
        this.f22198l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22188a = "AnyThinkSegmentsProgressBar";
        this.f22190c = 1;
        this.f22191d = 20;
        this.f22192e = 10;
        this.f22193f = 1;
        this.f22194g = -1711276033;
        this.f22195h = -1;
        this.i = new ArrayList();
        this.f22198l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f22188a = "AnyThinkSegmentsProgressBar";
        this.f22190c = 1;
        this.f22191d = 20;
        this.f22192e = 10;
        this.f22193f = 1;
        this.f22194g = -1711276033;
        this.f22195h = -1;
        this.i = new ArrayList();
        this.f22198l = false;
    }

    private StringBuilder a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f22197k, Integer.valueOf(i), Integer.valueOf(this.f22189b)));
            return sb;
        } catch (Throwable th) {
            sb.append(this.f22189b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            th.getMessage();
            return sb;
        }
    }
}
