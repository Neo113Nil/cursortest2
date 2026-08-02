package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ShakeThumbView extends BaseShakeView {

    /* renamed from: l, reason: collision with root package name */
    private FrameLayout f11059l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f11060m;

    public ShakeThumbView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(getContext(), 80.0f), q.a(getContext(), 80.0f));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        int a9 = q.a(getContext(), 88.0f);
        int parseColor = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a9);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f10691a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(q.a(getContext(), 48.0f), q.a(getContext(), 48.0f));
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = q.a(getContext(), 16.0f);
        this.f10691a.setLayoutParams(layoutParams2);
        this.f11060m = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        this.f11060m.setGravity(1);
        this.f11060m.setMaxWidth(q.a(getContext(), 124.0f));
        this.f11060m.setMaxLines(2);
        this.f11060m.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = q.a(getContext(), 86.0f);
        this.f11060m.setLayoutParams(layoutParams3);
        this.f11060m.setText(q.a(t.b().g(), "myoffer_shake_full_title", k.f20423g));
        this.f11060m.setTextSize(1, 12.0f);
        this.f11060m.setTextColor(-1);
        this.f11060m.setBackgroundResource(q.a(t.b().g(), "myoffer_bg_shake_thumb_hint", k.f20419c));
        int a10 = q.a(getContext(), 6.0f);
        int a11 = q.a(getContext(), 12.0f);
        this.f11060m.setPadding(a11, a10, a11, a10);
        this.f11059l = new FrameLayout(getContext());
        this.f11059l.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f11059l.addView(imageView);
        this.f11059l.addView(this.f10691a);
        this.f11059l.addView(this.f11060m);
        addView(this.f11059l);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            FrameLayout frameLayout = this.f11059l;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(onClickListener);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (this.f11060m != null) {
            if (TextUtils.isEmpty(this.f10697g)) {
                this.f11060m.setText(e.a(getContext(), i));
            } else {
                this.f11060m.setText(this.f10697g);
            }
        }
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
    }

    private void a(View view) {
        int a9 = q.a(getContext(), 88.0f);
        int parseColor = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a9);
        view.setBackgroundDrawable(gradientDrawable);
    }
}
