package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1532bj extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C1532bj(C1839gi c1839gi, C1097Na c1097Na, int i) {
        super(c1839gi);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f6 = XX.A02;
        int i4 = (int) (8.0f * f6);
        this.A02 = (int) (1.0f * f6);
        this.A04 = c1097Na.A05(false);
        this.A03 = P3.A02(this.A04, 128);
        this.A01 = new ArrayList();
        for (int i9 = 0; i9 < i; i9++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i4, i4);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1839gi);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, XV.A0t, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A00(int i) {
        int i4;
        int borderColor;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 == i) {
                i4 = this.A04;
                borderColor = this.A04;
            } else {
                i4 = this.A03;
                borderColor = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i9);
            int i10 = this.A02;
            gradientDrawable.setStroke(i10, borderColor);
            this.A01.get(i9).setColor(i4);
            this.A01.get(i9).invalidateSelf();
        }
    }
}
