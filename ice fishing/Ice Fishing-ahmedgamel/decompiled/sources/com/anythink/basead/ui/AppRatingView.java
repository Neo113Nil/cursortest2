package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AppRatingView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Context f10448a;

    /* renamed from: b, reason: collision with root package name */
    private List<StarLevelView> f10449b;

    /* renamed from: c, reason: collision with root package name */
    private int f10450c;

    /* renamed from: d, reason: collision with root package name */
    private int f10451d;

    public AppRatingView(Context context) {
        this(context, null, 0);
    }

    public static int dip2px(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i) {
        for (int i4 = 0; i4 < this.f10449b.size(); i4++) {
            StarLevelView starLevelView = this.f10449b.get(i4);
            if (i4 < i) {
                starLevelView.setState(true);
            } else {
                starLevelView.setState(false);
            }
        }
    }

    public void setStarMargin(int i) {
        this.f10451d = i;
    }

    public void setStarNum(int i) {
        if (this.f10449b == null) {
            this.f10449b = new ArrayList();
        }
        this.f10449b.clear();
        removeAllViews();
        setOrientation(0);
        for (int i4 = 0; i4 < i; i4++) {
            StarLevelView starLevelView = new StarLevelView(getContext());
            int i6 = this.f10450c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i6);
            if (i4 != i - 1) {
                layoutParams.setMargins(0, 0, dip2px(getContext(), this.f10451d), 0);
            }
            starLevelView.setLayoutParams(layoutParams);
            addView(starLevelView);
            this.f10449b.add(starLevelView);
        }
    }

    public void setStarSizeInDp(int i) {
        this.f10450c = dip2px(this.f10448a, i);
    }

    public AppRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10448a = context;
        setStarSizeInDp(17);
        setStarMargin(8);
    }
}
