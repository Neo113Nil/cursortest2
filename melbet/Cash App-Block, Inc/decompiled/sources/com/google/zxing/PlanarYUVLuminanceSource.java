package com.google.zxing;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {
    public final int dataHeight;
    public final int dataWidth;
    public final byte[] yuvData;

    public PlanarYUVLuminanceSource(byte[] bArr, int i, int i2, int i3, int i4) {
        super(i3, i4);
        if (i3 > i || i4 > i2) {
            a$$ExternalSyntheticBUOutline0.m$3("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.yuvData = bArr;
        this.dataWidth = i;
        this.dataHeight = i2;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] getMatrix() {
        byte[] bArr = this.yuvData;
        int i = this.width;
        int i2 = this.height;
        int i3 = this.dataWidth;
        if (i == i3 && i2 == this.dataHeight) {
            return bArr;
        }
        int i4 = i * i2;
        byte[] bArr2 = new byte[i4];
        if (i == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i4);
            return bArr2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr, i5, bArr2, i6 * i, i);
            i5 += i3;
        }
        return bArr2;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] getRow(int i, byte[] bArr) {
        if (i < 0 || i >= this.height) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested row is outside the image: "));
            return null;
        }
        int i2 = this.width;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.yuvData, i * this.dataWidth, bArr, 0, i2);
        return bArr;
    }
}
