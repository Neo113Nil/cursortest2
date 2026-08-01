package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class MD extends AbstractC1403Zd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C1130Og A04;
    public final C1840gi A05;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (XX.A02 * 4.0f);
        A08 = (int) (XX.A02 * 10.0f);
        A07 = (int) (XX.A02 * 44.0f);
    }

    public MD(C1840gi c1840gi, VA va, String str) {
        super(c1840gi, va, str);
        this.A05 = c1840gi;
        this.A04 = AbstractC1131Oh.A00(c1840gi.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        YB.A0N(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403Zd
    public final void A0O() {
        this.A01.setImageBitmap(YN.A01(YM.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC1412Zm(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C1407Zh c1407Zh = new C1407Zh(this.A05);
        c1407Zh.setData(this.A04.A0H(), YM.HIDE_AD);
        c1407Zh.setOnClickListener(new ViewOnClickListenerC1413Zn(this, c1407Zh));
        C1407Zh c1407Zh2 = new C1407Zh(this.A05);
        c1407Zh2.setData(this.A04.A0L(), YM.REPORT_AD);
        c1407Zh2.setOnClickListener(new ViewOnClickListenerC1414Zo(this, c1407Zh2));
        C1407Zh c1407Zh3 = new C1407Zh(this.A05);
        c1407Zh3.setData(this.A04.A0M(), YM.AD_CHOICES_ICON);
        c1407Zh3.setOnClickListener(new ViewOnClickListenerC1415Zp(this, c1407Zh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        YB.A0W(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c1407Zh, layoutParams);
        this.A02.addView(c1407Zh2, layoutParams);
        this.A02.addView(c1407Zh3, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403Zd
    public final void A0P() {
        YB.A0I(this);
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403Zd
    public final void A0Q(C1134Ok c1134Ok, EnumC1132Oi enumC1132Oi) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        YB.A0W(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
        super.A0Q(c1134Ok, enumC1132Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403Zd
    public final void A0R(C1134Ok c1134Ok, EnumC1132Oi enumC1132Oi) {
        YB.A0W(this.A03);
        this.A01.setImageBitmap(YN.A01(YM.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC1416Zq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C1134Ok c1134Ok2 : c1134Ok.A05()) {
            C1407Zh c1407Zh = new C1407Zh(this.A05);
            c1407Zh.setData(c1134Ok2.A04(), null);
            c1407Zh.setOnClickListener(new ViewOnClickListenerC1417Zr(this, c1407Zh, c1134Ok2));
            this.A02.addView(c1407Zh, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403Zd
    public final boolean A0S() {
        return true;
    }
}
