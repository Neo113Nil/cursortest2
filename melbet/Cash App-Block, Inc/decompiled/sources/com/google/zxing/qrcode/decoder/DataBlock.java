package com.google.zxing.qrcode.decoder;

/* loaded from: classes4.dex */
public final class DataBlock {
    public final byte[] codewords;
    public final int numDataCodewords;

    public DataBlock(int i, byte[] bArr) {
        this.numDataCodewords = i;
        this.codewords = bArr;
    }

    public DataBlock(byte[] bArr, int i) {
        this.codewords = bArr;
        this.numDataCodewords = i;
    }
}
