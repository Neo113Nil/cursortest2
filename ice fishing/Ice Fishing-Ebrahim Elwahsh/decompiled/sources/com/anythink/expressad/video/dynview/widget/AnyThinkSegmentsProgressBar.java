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
    private final String f21559a;

    /* renamed from: b, reason: collision with root package name */
    private int f21560b;

    /* renamed from: c, reason: collision with root package name */
    private int f21561c;

    /* renamed from: d, reason: collision with root package name */
    private int f21562d;

    /* renamed from: e, reason: collision with root package name */
    private int f21563e;

    /* renamed from: f, reason: collision with root package name */
    private int f21564f;

    /* renamed from: g, reason: collision with root package name */
    private int f21565g;

    /* renamed from: h, reason: collision with root package name */
    private int f21566h;
    private List<ProgressBar> i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f21567j;

    /* renamed from: k, reason: collision with root package name */
    private String f21568k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21569l;

    public AnyThinkSegmentsProgressBar(Context context) {
        super(context);
        this.f21559a = "AnyThinkSegmentsProgressBar";
        this.f21561c = 1;
        this.f21562d = 20;
        this.f21563e = 10;
        this.f21564f = 1;
        this.f21565g = -1711276033;
        this.f21566h = -1;
        this.i = new ArrayList();
        this.f21569l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            if (this.f21561c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f21568k)) {
                    this.f21568k = getContext().getString(k.a(getContext(), "anythink_cm_segment_process_bar_hint_text", k.f19794g));
                }
            }
            if (this.f21561c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f21568k)) {
                    this.f21568k = getContext().getString(k.a(getContext(), "anythink_cm_segment_process_bar_hint_text_lite", k.f19794g));
                }
            }
            this.i.clear();
            removeAllViews();
            setBackgroundDrawable(c());
            TextView textView = new TextView(getContext());
            this.f21567j = textView;
            textView.setTextColor(-1);
            this.f21567j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f21567j.setLayoutParams(layoutParams);
            if (this.f21561c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f21567j;
                int i = this.f21562d;
                textView2.setPadding(i / 2, 15, i / 2, 5);
            }
            if (this.f21561c == 2) {
                this.f21567j.setGravity(16);
                TextView textView3 = this.f21567j;
                int i4 = this.f21562d;
                textView3.setPadding(i4 / 2, 0, i4 / 2, 0);
            }
            try {
                int a9 = k.a(getContext(), "anythink_reward_video_icon", k.f19790c);
                if (a9 != 0 && (drawable = getContext().getResources().getDrawable(a9)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f21567j.setCompoundDrawables(drawable, null, null, null);
                    this.f21567j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            this.f21567j.setText(a(this.f21564f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i9 = 0; i9 < this.f21560b; i9++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i10 = this.f21562d;
                layoutParams3.leftMargin = i10 / 2;
                layoutParams3.rightMargin = i10 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.i.add(progressBar);
            }
            int i11 = this.f21561c;
            if (i11 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f21567j);
                addView(linearLayout);
            } else {
                if (i11 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f21567j);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f21563e);
        gradientDrawable.setColor(this.f21565g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f21563e);
        gradientDrawable2.setColor(this.f21566h);
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
        this.f21560b = i;
        this.f21561c = i4;
        a();
    }

    public void setIndicatorText(String str) {
        this.f21568k = str;
    }

    public void setProgress(int i, int i4) {
        try {
            if (this.i.size() == 0) {
                return;
            }
            if (i4 < this.i.size()) {
                this.i.get(i4).setProgress(i);
            }
            int i9 = i4 + 1;
            if (i9 > this.f21564f) {
                this.f21564f = i9;
                TextView textView = this.f21567j;
                if (textView != null) {
                    textView.setText(a(i9));
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void init(int i, int i4, int i9, int i10) {
        this.f21560b = i;
        this.f21561c = i4;
        this.f21566h = i9;
        this.f21565g = i10;
        a();
    }

    public void init(int i, int i4, int i9, int i10, int i11, int i12) {
        this.f21560b = i;
        this.f21561c = i4;
        this.f21566h = i9;
        this.f21565g = i10;
        this.f21562d = i11;
        this.f21563e = i12;
        a();
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21559a = "AnyThinkSegmentsProgressBar";
        this.f21561c = 1;
        this.f21562d = 20;
        this.f21563e = 10;
        this.f21564f = 1;
        this.f21565g = -1711276033;
        this.f21566h = -1;
        this.i = new ArrayList();
        this.f21569l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21559a = "AnyThinkSegmentsProgressBar";
        this.f21561c = 1;
        this.f21562d = 20;
        this.f21563e = 10;
        this.f21564f = 1;
        this.f21565g = -1711276033;
        this.f21566h = -1;
        this.i = new ArrayList();
        this.f21569l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f21559a = "AnyThinkSegmentsProgressBar";
        this.f21561c = 1;
        this.f21562d = 20;
        this.f21563e = 10;
        this.f21564f = 1;
        this.f21565g = -1711276033;
        this.f21566h = -1;
        this.i = new ArrayList();
        this.f21569l = false;
    }

    private StringBuilder a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f21568k, Integer.valueOf(i), Integer.valueOf(this.f21560b)));
            return sb;
        } catch (Throwable th) {
            sb.append(this.f21560b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            th.getMessage();
            return sb;
        }
    }
}
