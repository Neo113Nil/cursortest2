package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class ThirdPartyNativeExtView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f11503a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f11504b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f11505c;

    public ThirdPartyNativeExtView(Context context) {
        this(context, null);
    }

    private static void a(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(Color.parseColor("#A0A0A0"));
        textView.setSelected(true);
        textView.setSingleLine();
        textView.setMarqueeRepeatLimit(-1);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    public TextView getAdFromView() {
        return this.f11505c;
    }

    public TextView getDomainView() {
        return this.f11503a;
    }

    public TextView getWarningView() {
        return this.f11504b;
    }

    public void initView(String str, String str2, String str3) {
        setOrientation(0);
        Context context = getContext();
        if (!TextUtils.isEmpty(str)) {
            TextView textView = new TextView(context);
            this.f11503a = textView;
            textView.setText(str);
            a(this.f11503a);
            addView(this.f11503a);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextView textView2 = new TextView(context);
            this.f11504b = textView2;
            textView2.setText(str2);
            a(this.f11504b);
            if (getChildCount() > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = q.a(context, 10.0f);
                addView(this.f11504b, layoutParams);
            } else {
                addView(this.f11504b);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            TextView textView3 = new TextView(context);
            this.f11505c = textView3;
            textView3.setText(str3);
            a(this.f11505c);
            if (getChildCount() > 0) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = q.a(context, 10.0f);
                addView(this.f11505c, layoutParams2);
            } else {
                addView(this.f11505c);
            }
        }
        setGravity(16);
    }

    public ThirdPartyNativeExtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyNativeExtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
