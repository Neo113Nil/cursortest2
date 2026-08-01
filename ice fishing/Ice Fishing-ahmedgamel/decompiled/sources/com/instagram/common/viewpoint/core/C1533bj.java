package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1533bj extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C1533bj(C1840gi c1840gi, C1098Na c1098Na, int i) {
        super(c1840gi);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f3 = XX.A02;
        int i6 = (int) (8.0f * f3);
        this.A02 = (int) (1.0f * f3);
        this.A04 = c1098Na.A05(false);
        this.A03 = P3.A02(this.A04, 128);
        this.A01 = new ArrayList();
        for (int i9 = 0; i9 < i; i9++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i6, i6);
            gradientDrawable.setStroke(this.A02, 0);
            ImageView imageView = new ImageView(c1840gi);
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
        int i6;
        int borderColor;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        for (int i9 = 0; i9 < i; i9++) {
            if (i9 == i) {
                i6 = this.A04;
                borderColor = this.A04;
            } else {
                i6 = this.A03;
                borderColor = 0;
            }
            GradientDrawable gradientDrawable = this.A01.get(i9);
            int i10 = this.A02;
            gradientDrawable.setStroke(i10, borderColor);
            this.A01.get(i9).setColor(i6);
            this.A01.get(i9).invalidateSelf();
        }
    }
}
