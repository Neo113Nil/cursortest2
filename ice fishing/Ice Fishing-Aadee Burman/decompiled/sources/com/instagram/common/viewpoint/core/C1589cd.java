package com.instagram.common.viewpoint.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1589cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1038Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1589cd(C1840gi c1840gi, ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr, AbstractC2005jd abstractC2005jd, VA va, InterfaceC1381Yh interfaceC1381Yh, C1785fp c1785fp, Y2 y22, C1098Na c1098Na, InterfaceC1518bU interfaceC1518bU) {
        super(c1840gi);
        this.A00 = c1098Na.A09(true);
        this.A01 = new RelativeLayout(c1840gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1840gi, abstractC2005jd.A29().A0J().A04());
        if (viewOnClickListenerC1038Kr == null) {
            this.A02 = new ViewOnClickListenerC1038Kr(c1840gi, abstractC2005jd.A0w(), (C1098Na) null, va, interfaceC1381Yh, c1785fp, y22, abstractC2005jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC1038Kr;
        }
        A03();
        this.A02.setCta(abstractC2005jd.A29().A0J(), abstractC2005jd.A2E(), new HashMap(), interfaceC1518bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1840gi c1840gi, View view) {
        ImageView imageView = new ImageView(c1840gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1840gi c1840gi, String str) {
        Button button = new Button(c1840gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1840gi, button);
    }

    public final EnumC1089Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2005jd abstractC2005jd, AbstractC1375Yb abstractC1375Yb) {
        this.A02.A0F(abstractC2005jd, abstractC1375Yb);
    }

    public void setCta(C1100Nc c1100Nc, String str, HashMap<String, String> extras, InterfaceC1518bU interfaceC1518bU) {
        this.A02.setCta(c1100Nc, str, extras, interfaceC1518bU);
    }
}
