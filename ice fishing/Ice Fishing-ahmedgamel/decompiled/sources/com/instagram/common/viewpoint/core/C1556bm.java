package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1556bm extends LinearLayout {
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1860gi A04;
    public final C1557bn[] A05;

    public C1556bm(C1860gi c1860gi, int i, int i4, int i6, int i9) {
        super(c1860gi);
        this.A00 = A06;
        this.A04 = c1860gi;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i6;
        this.A02 = i9;
        this.A05 = new C1557bn[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            this.A05[i10] = A00();
            addView(this.A05[i10]);
        }
        A01();
    }

    private C1557bn A00() {
        C1557bn c1557bn = new C1557bn(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c1557bn.setLayoutParams(starRatingViewParams);
        return c1557bn;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        int i = 0;
        while (i < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i4 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i4;
            i++;
        }
        requestLayout();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f2) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f2 - i);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f2) {
        A02(f2);
    }
}
