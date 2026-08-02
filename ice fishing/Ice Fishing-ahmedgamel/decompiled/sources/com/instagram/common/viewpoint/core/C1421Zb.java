package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1421Zb extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C1150Og A02;
    public final C1860gi A03;
    public final InterfaceC1425Zf A04;
    public final boolean A05;
    public static final int A09 = (int) (XX.A02 * 16.0f);
    public static final int A0A = (int) (XX.A02 * 8.0f);
    public static final int A0D = (int) (XX.A02 * 44.0f);
    public static final int A08 = (int) (XX.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (XX.A02 * 75.0f);
    public static final int A0B = (int) (XX.A02 * 25.0f);
    public static final int A0F = (int) (XX.A02 * 45.0f);
    public static final int A0C = (int) (XX.A02 * 15.0f);
    public static final int A06 = (int) (XX.A02 * 16.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1421Zb(C1420Za c1420Za) {
        super(r0);
        C1860gi c1860gi;
        C1860gi c1860gi2;
        InterfaceC1425Zf interfaceC1425Zf;
        boolean z6;
        boolean z9;
        boolean z10;
        c1860gi = c1420Za.A0B;
        c1860gi2 = c1420Za.A0B;
        this.A03 = c1860gi2;
        this.A02 = AbstractC1151Oh.A00(this.A03.A02());
        interfaceC1425Zf = c1420Za.A02;
        this.A04 = interfaceC1425Zf;
        z6 = c1420Za.A0A;
        this.A01 = z6 ? A0E : A0F;
        z9 = c1420Za.A0A;
        this.A00 = z9 ? A0B : A0C;
        z10 = c1420Za.A07;
        this.A05 = z10;
        setFocusable(true);
        View A01 = A01(c1420Za);
        View A00 = A00(c1420Za);
        View footerView = getFooterView();
        YB.A0K(A01);
        YB.A0K(A00);
        YB.A0K(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, A01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(A01, contentParams);
        addView(A00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(0);
    }

    public /* synthetic */ C1421Zb(C1420Za c1420Za, ZY zy) {
        this(c1420Za);
    }

    private View A00(C1420Za c1420Za) {
        YM ym;
        int i;
        String str;
        String str2;
        boolean z6;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        ym = c1420Za.A01;
        imageView.setImageBitmap(YN.A01(ym));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i = c1420Za.A00;
        gradientDrawable.setColor(i);
        YB.A0V(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        YB.A0a(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        str = c1420Za.A06;
        subtitleView.setText(str);
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        YB.A0a(titleView, false, 16);
        titleView.setTextColor(-10459280);
        str2 = c1420Za.A05;
        titleView.setText(str2);
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        z6 = c1420Za.A08;
        if (z6) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = c1420Za.A04;
            if (!TextUtils.isEmpty(str3)) {
                C1554bk c1554bk = new C1554bk(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c1554bk.setFullCircleCorners(true);
                LM A05 = new LM(c1554bk, this.A03).A05(A0F, A0F);
                str5 = c1420Za.A04;
                A05.A07(str5);
                linearLayout2.addView(c1554bk, iconParams);
            }
            C1427Zh c1427Zh = new C1427Zh(this.A03);
            str4 = c1420Za.A03;
            c1427Zh.setData(str4, YM.CHECKMARK);
            c1427Zh.setSelected(true);
            linearLayout2.addView(c1427Zh, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C1420Za c1420Za) {
        boolean z6;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z6 = c1420Za.A09;
        if (z6) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(YN.A01(YM.CROSS));
            imageView.setOnClickListener(new ZY(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(YN.A01(YM.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        YB.A0a(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ZZ(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
