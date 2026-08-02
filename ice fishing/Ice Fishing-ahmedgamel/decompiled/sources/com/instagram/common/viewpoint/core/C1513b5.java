package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1513b5 extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C1513b5(C1860gi c1860gi) {
        super(c1860gi);
        this.A03 = new ImageView(c1860gi);
        this.A02 = new ImageView(c1860gi);
        A00();
    }

    public C1513b5(C1860gi c1860gi, AttributeSet attributeSet) {
        super(c1860gi, attributeSet);
        this.A03 = new ImageView(c1860gi, attributeSet);
        this.A02 = new ImageView(c1860gi, attributeSet);
        A00();
    }

    public C1513b5(C1860gi c1860gi, AttributeSet attributeSet, int i) {
        super(c1860gi, attributeSet, i);
        this.A03 = new ImageView(c1860gi, attributeSet, i);
        this.A02 = new ImageView(c1860gi, attributeSet, i);
        A00();
    }

    public C1513b5(C1860gi c1860gi, AttributeSet attributeSet, int i, int i4) {
        super(c1860gi, attributeSet, i, i4);
        this.A03 = new ImageView(c1860gi, attributeSet, i, i4);
        this.A02 = new ImageView(c1860gi, attributeSet, i, i4);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC1370Xc.A04(this.A03, EnumC1370Xc.A0B);
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
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z6, i, i4, i6, i9);
            return;
        }
        int i10 = i6 - i;
        int i11 = i9 - i4;
        float min = Math.min(i10 / this.A01, i11 / this.A00);
        int i12 = (int) (this.A01 * min);
        int i13 = (int) (this.A00 * min);
        this.A02.layout(i, i4, i6, i9);
        int blurBorderViewHeight = (i10 / 2) + i;
        int blurBorderViewWidth = (i11 / 2) + i4;
        this.A03.layout(blurBorderViewHeight - (i12 / 2), blurBorderViewWidth - (i13 / 2), (i12 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i13 / 2));
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
