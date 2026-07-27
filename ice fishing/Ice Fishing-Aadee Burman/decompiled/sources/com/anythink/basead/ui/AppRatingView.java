package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AppRatingView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Context f9662a;

    /* renamed from: b, reason: collision with root package name */
    private List<StarLevelView> f9663b;

    /* renamed from: c, reason: collision with root package name */
    private int f9664c;

    /* renamed from: d, reason: collision with root package name */
    private int f9665d;

    public AppRatingView(Context context) {
        this(context, null, 0);
    }

    public static int dip2px(Context context, float f3) {
        return (int) ((f3 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i) {
        for (int i6 = 0; i6 < this.f9663b.size(); i6++) {
            StarLevelView starLevelView = this.f9663b.get(i6);
            if (i6 < i) {
                starLevelView.setState(true);
            } else {
                starLevelView.setState(false);
            }
        }
    }

    public void setStarMargin(int i) {
        this.f9665d = i;
    }

    public void setStarNum(int i) {
        if (this.f9663b == null) {
            this.f9663b = new ArrayList();
        }
        this.f9663b.clear();
        removeAllViews();
        setOrientation(0);
        for (int i6 = 0; i6 < i; i6++) {
            StarLevelView starLevelView = new StarLevelView(getContext());
            int i9 = this.f9664c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i9);
            if (i6 != i - 1) {
                layoutParams.setMargins(0, 0, dip2px(getContext(), this.f9665d), 0);
            }
            starLevelView.setLayoutParams(layoutParams);
            addView(starLevelView);
            this.f9663b.add(starLevelView);
        }
    }

    public void setStarSizeInDp(int i) {
        this.f9664c = dip2px(this.f9662a, i);
    }

    public AppRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9662a = context;
        setStarSizeInDp(17);
        setStarMargin(8);
    }
}
