package com.google.zxing;

/* loaded from: classes4.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    public final PlanarYUVLuminanceSource delegate;

    public InvertedLuminanceSource(PlanarYUVLuminanceSource planarYUVLuminanceSource) {
        super(planarYUVLuminanceSource.width, planarYUVLuminanceSource.height);
        this.delegate = planarYUVLuminanceSource;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] getMatrix() {
        byte[] matrix = this.delegate.getMatrix();
        int i = this.width * this.height;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (matrix[i2] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public final byte[] getRow(int i, byte[] bArr) {
        byte[] row = this.delegate.getRow(i, bArr);
        for (int i2 = 0; i2 < this.width; i2++) {
            row[i2] = (byte) (255 - (row[i2] & 255));
        }
        return row;
    }
}
