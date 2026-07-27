package com.anythink.expressad.videocommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class StarLevelView extends LinearLayout {
    public StarLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public void initScore(double d2) {
        for (int i = 0; i < ((int) d2); i++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(k.a(getContext(), "anythink_video_common_full_star", k.f19632c));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i != 0) {
                layoutParams.setMargins(5, 0, 5, 0);
            }
            addView(imageView, layoutParams);
        }
        int i6 = (int) (50.0d - (d2 * 10.0d));
        if (i6 <= 0) {
            return;
        }
        if (i6 > 1 && i6 < 10) {
            if (i6 <= 0 || i6 >= 5) {
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(k.a(getContext(), "anythink_video_common_full_star", k.f19632c));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(5, 0, 5, 0);
                addView(imageView2, layoutParams2);
            } else {
                ImageView imageView3 = new ImageView(getContext());
                imageView3.setImageResource(k.a(getContext(), "anythink_video_common_full_star", k.f19632c));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(5, 0, 5, 0);
                addView(imageView3, layoutParams3);
            }
        }
        int i9 = i6 / 10;
        if (i9 > 0) {
            int i10 = i6 % (i9 * 10);
            if (i10 > 0 && i10 < 5) {
                ImageView imageView4 = new ImageView(getContext());
                imageView4.setImageResource(k.a(getContext(), "anythink_video_common_full_while_star", k.f19632c));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.setMargins(5, 0, 5, 0);
                addView(imageView4, layoutParams4);
            } else if (i10 >= 5 && i10 <= 9) {
                ImageView imageView5 = new ImageView(getContext());
                imageView5.setImageResource(k.a(getContext(), "anythink_video_common_half_star", k.f19632c));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.setMargins(5, 0, 5, 0);
                addView(imageView5, layoutParams5);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                ImageView imageView6 = new ImageView(getContext());
                imageView6.setImageResource(k.a(getContext(), "anythink_video_common_full_while_star", k.f19632c));
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams6.setMargins(5, 0, 5, 0);
                addView(imageView6, layoutParams6);
            }
        }
    }

    public StarLevelView(Context context) {
        super(context);
        setOrientation(0);
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
