package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AppRatingView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Context f9819a;

    /* renamed from: b, reason: collision with root package name */
    private List<StarLevelView> f9820b;

    /* renamed from: c, reason: collision with root package name */
    private int f9821c;

    /* renamed from: d, reason: collision with root package name */
    private int f9822d;

    public AppRatingView(Context context) {
        this(context, null, 0);
    }

    public static int dip2px(Context context, float f6) {
        return (int) ((f6 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i) {
        for (int i4 = 0; i4 < this.f9820b.size(); i4++) {
            StarLevelView starLevelView = this.f9820b.get(i4);
            if (i4 < i) {
                starLevelView.setState(true);
            } else {
                starLevelView.setState(false);
            }
        }
    }

    public void setStarMargin(int i) {
        this.f9822d = i;
    }

    public void setStarNum(int i) {
        if (this.f9820b == null) {
            this.f9820b = new ArrayList();
        }
        this.f9820b.clear();
        removeAllViews();
        setOrientation(0);
        for (int i4 = 0; i4 < i; i4++) {
            StarLevelView starLevelView = new StarLevelView(getContext());
            int i9 = this.f9821c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i9);
            if (i4 != i - 1) {
                layoutParams.setMargins(0, 0, dip2px(getContext(), this.f9822d), 0);
            }
            starLevelView.setLayoutParams(layoutParams);
            addView(starLevelView);
            this.f9820b.add(starLevelView);
        }
    }

    public void setStarSizeInDp(int i) {
        this.f9821c = dip2px(this.f9819a, i);
    }

    public AppRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9819a = context;
        setStarSizeInDp(17);
        setStarMargin(8);
    }
}
