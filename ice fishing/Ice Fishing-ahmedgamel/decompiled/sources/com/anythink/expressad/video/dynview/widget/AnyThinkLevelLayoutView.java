package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class AnyThinkLevelLayoutView extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    private static int f22162d = 18;

    /* renamed from: a, reason: collision with root package name */
    private double f22163a;

    /* renamed from: b, reason: collision with root package name */
    private int f22164b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22165c;

    public AnyThinkLevelLayoutView(Context context) {
        super(context);
    }

    private void a() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.f22165c) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dip2px(getContext(), f22162d));
            layoutParams.setMargins(0, dip2px(getContext(), 2.0f), 0, 0);
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(layoutParams);
        } else {
            linearLayout = null;
            linearLayout2 = null;
        }
        removeAllViews();
        if (linearLayout2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dip2px(getContext(), f22162d));
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setText("(");
            textView.setTextColor(Color.parseColor("#5f5f5f"));
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setGravity(17);
            textView2.setTextColor(Color.parseColor("#5f5f5f"));
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "anythink_reward_user", k.f20419c));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView2.setCompoundDrawables(drawable, null, null, null);
            textView2.setText(this.f22164b + " )");
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setLines(1);
            linearLayout2.addView(textView, layoutParams2);
            linearLayout2.addView(textView2, layoutParams2);
        }
        double d9 = this.f22163a;
        if (d9 == 0.0d) {
            d9 = 5.0d;
        }
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dip2px(getContext(), 15.0f), dip2px(getContext(), f22162d));
            if (i < d9) {
                imageView.setImageResource(k.a(getContext(), "anythink_download_message_dialog_star_sel", k.f20419c));
            } else {
                imageView.setImageResource(k.a(getContext(), "anythink_download_message_dilaog_star_nor", k.f20419c));
            }
            layoutParams3.weight = 1.0f;
            layoutParams3.setMargins(dip2px(getContext(), 2.0f), 0, 0, 0);
            if (linearLayout != null) {
                linearLayout.addView(imageView, layoutParams3);
            } else {
                addView(imageView, layoutParams3);
            }
        }
        if (linearLayout != null) {
            addView(linearLayout);
            addView(linearLayout2);
        }
    }

    public static int dip2px(Context context, float f2) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i) {
        this.f22163a = i;
        a();
    }

    public void setRatingAndUser(double d9, int i) {
        this.f22163a = d9;
        if (i == 0) {
            i = (int) (((Math.random() * 9.0d) + 1.0d) * 10000.0d);
        }
        this.f22164b = i;
        this.f22165c = true;
        a();
    }

    public AnyThinkLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkLevelLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
