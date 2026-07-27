package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1493b5 extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C1493b5(C1840gi c1840gi) {
        super(c1840gi);
        this.A03 = new ImageView(c1840gi);
        this.A02 = new ImageView(c1840gi);
        A00();
    }

    public C1493b5(C1840gi c1840gi, AttributeSet attributeSet) {
        super(c1840gi, attributeSet);
        this.A03 = new ImageView(c1840gi, attributeSet);
        this.A02 = new ImageView(c1840gi, attributeSet);
        A00();
    }

    public C1493b5(C1840gi c1840gi, AttributeSet attributeSet, int i) {
        super(c1840gi, attributeSet, i);
        this.A03 = new ImageView(c1840gi, attributeSet, i);
        this.A02 = new ImageView(c1840gi, attributeSet, i);
        A00();
    }

    public C1493b5(C1840gi c1840gi, AttributeSet attributeSet, int i, int i6) {
        super(c1840gi, attributeSet, i, i6);
        this.A03 = new ImageView(c1840gi, attributeSet, i, i6);
        this.A02 = new ImageView(c1840gi, attributeSet, i, i6);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC1350Xc.A04(this.A03, EnumC1350Xc.A0B);
        setId(YB.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z3, i, i6, i9, i10);
            return;
        }
        int i11 = i9 - i;
        int i12 = i10 - i6;
        float min = Math.min(i11 / this.A01, i12 / this.A00);
        int i13 = (int) (this.A01 * min);
        int i14 = (int) (this.A00 * min);
        this.A02.layout(i, i6, i9, i10);
        int blurBorderViewHeight = (i11 / 2) + i;
        int blurBorderViewWidth = (i12 / 2) + i6;
        this.A03.layout(blurBorderViewHeight - (i13 / 2), blurBorderViewWidth - (i14 / 2), (i13 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i14 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            YB.A0V(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            YB.A0N(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
