package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network/classes2.dex */
public final class LF extends C1142Os {
    public static byte[] A07;
    public static String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", "O", "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC2005jd A02;
    public final C1840gi A03;
    public final VA A04;
    public final Y2 A05;
    public final InterfaceC1381Yh A06;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 65);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A02() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C1534bk c1534bk = new C1534bk(this.A03);
        new LM(c1534bk, this.A03).A05(A0D, A0D).A07(this.A02.A2C().A01());
        c1534bk.setFullCircleCorners(true);
        YB.A0N(c1534bk, 0);
        YB.A0K(c1534bk);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(c1534bk, layoutParams);
        TextView textView = new TextView(this.A03);
        YB.A0K(textView);
        textView.setTextColor(this.A02.A28().A01().A07(true));
        textView.setText(this.A02.A29().A0I().A0G());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c1534bk.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        YB.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C1536bm c1536bm = new C1536bm(this.A03, A0B, 5, A0A, -1);
        c1536bm.setGravity(16);
        linearLayout.addView(c1536bm, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        YB.A0a(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A29().A0I().A0C())) {
            String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c1536bm.setRating(Float.parseFloat(this.A02.A29().A0I().A0C()));
            if (this.A02.A29().A0I().A09() != null) {
                textView2.setText(A00(0, 1, 116) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A29().A0I().A09())) + A00(1, 1, 1));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A28().A01().A07(true));
        textView3.setText(this.A02.A29().A0I().A04());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A03() {
        A07 = new byte[]{29, 105};
    }

    static {
        A03();
        A0C = (int) (C1142Os.A08 * 12.0f);
        A0D = (int) (C1142Os.A08 * 84.0f);
        A0B = (int) (C1142Os.A08 * 14.0f);
        A09 = XV.A0v;
        A0A = P3.A02(-1, 77);
    }

    public LF(C1840gi c1840gi, AbstractC2005jd abstractC2005jd, VA va, InterfaceC1381Yh interfaceC1381Yh) {
        super(c1840gi);
        this.A05 = new Y2();
        this.A03 = c1840gi;
        this.A02 = abstractC2005jd;
        this.A04 = va;
        this.A06 = interfaceC1381Yh;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new RelativeLayout(c1840gi);
        AbstractC1541br.A00(c1840gi, this.A01, abstractC2005jd.A29().A0H().A08());
        this.A00 = new LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A02();
        A01();
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A01() {
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr = new ViewOnClickListenerC1038Kr(this.A03, EnumC1733ez.A04.A03(), this.A02.A28().A01(), this.A02.A29().A0J().A06(), this.A04, this.A06, null, this.A05, this.A02.A2A());
        viewOnClickListenerC1038Kr.setViewShowsOverMedia(true);
        YB.A0G(1001, viewOnClickListenerC1038Kr);
        viewOnClickListenerC1038Kr.setCta(this.A02.A29().A0J(), this.A02.A2E(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        viewOnClickListenerC1038Kr.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(viewOnClickListenerC1038Kr, layoutParams);
    }
}
