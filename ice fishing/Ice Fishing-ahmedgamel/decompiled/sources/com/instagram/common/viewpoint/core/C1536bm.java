package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1536bm extends LinearLayout {
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1840gi A04;
    public final C1537bn[] A05;

    public C1536bm(C1840gi c1840gi, int i, int i6, int i9, int i10) {
        super(c1840gi);
        this.A00 = A06;
        this.A04 = c1840gi;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i9;
        this.A02 = i10;
        this.A05 = new C1537bn[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            this.A05[i11] = A00();
            addView(this.A05[i11]);
        }
        A01();
    }

    private C1537bn A00() {
        C1537bn c1537bn = new C1537bn(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c1537bn.setLayoutParams(starRatingViewParams);
        return c1537bn;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        int i = 0;
        while (i < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i6 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i6;
            i++;
        }
        requestLayout();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f3) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f3 - i);
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

    public void setRating(float f3) {
        A02(f3);
    }
}
