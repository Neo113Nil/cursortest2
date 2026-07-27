package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZC extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 10.0f);
    public static final int A04 = (int) (XX.A02 * 24.0f);
    public final ImageView A00;
    public final C1129Og A01;
    public final C1839gi A02;

    public ZC(C1839gi c1839gi) {
        super(c1839gi);
        this.A02 = c1839gi;
        this.A01 = AbstractC1130Oh.A00(c1839gi.A02());
        this.A00 = new ImageView(c1839gi);
        A02();
    }

    private void A02() {
        A03(this.A00, YM.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, YM ym) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(YN.A01(ym));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1109Nm c1109Nm, String str, VI vi, InterfaceC1380Yh interfaceC1380Yh) {
        setOnClickListener(new ZB(this, vi, interfaceC1380Yh, str, c1109Nm));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
