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
public final class C1588cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1037Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1588cd(C1839gi c1839gi, ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr, AbstractC2004jd abstractC2004jd, VA va, InterfaceC1380Yh interfaceC1380Yh, C1784fp c1784fp, Y2 y22, C1097Na c1097Na, InterfaceC1517bU interfaceC1517bU) {
        super(c1839gi);
        this.A00 = c1097Na.A09(true);
        this.A01 = new RelativeLayout(c1839gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1839gi, abstractC2004jd.A29().A0J().A04());
        if (viewOnClickListenerC1037Kr == null) {
            this.A02 = new ViewOnClickListenerC1037Kr(c1839gi, abstractC2004jd.A0w(), (C1097Na) null, va, interfaceC1380Yh, c1784fp, y22, abstractC2004jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC1037Kr;
        }
        A03();
        this.A02.setCta(abstractC2004jd.A29().A0J(), abstractC2004jd.A2E(), new HashMap(), interfaceC1517bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1839gi c1839gi, View view) {
        ImageView imageView = new ImageView(c1839gi);
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

    private void A01(C1839gi c1839gi, String str) {
        Button button = new Button(c1839gi);
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
        A00(c1839gi, button);
    }

    public final EnumC1088Mq A02(String str) {
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

    public void setAutoClickTime(AbstractC2004jd abstractC2004jd, AbstractC1374Yb abstractC1374Yb) {
        this.A02.A0F(abstractC2004jd, abstractC1374Yb);
    }

    public void setCta(C1099Nc c1099Nc, String str, HashMap<String, String> extras, InterfaceC1517bU interfaceC1517bU) {
        this.A02.setCta(c1099Nc, str, extras, interfaceC1517bU);
    }
}
