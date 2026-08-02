package com.anythink.expressad.video.dynview.i.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes.dex */
public final class a {
    private static void a(View view, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(v.b(view.getContext(), 12.0f));
            gradientDrawable.setStroke(v.b(view.getContext(), 1.0f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    public static void a(View view, float f2, float f9, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null) {
            int[] iArr = new int[2];
            for (int i = 0; i < 2; i++) {
                iArr[i] = Color.parseColor(strArr[i]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(v.b(view.getContext(), f9));
            gradientDrawable.setStroke(v.b(view.getContext(), f2), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }
}
