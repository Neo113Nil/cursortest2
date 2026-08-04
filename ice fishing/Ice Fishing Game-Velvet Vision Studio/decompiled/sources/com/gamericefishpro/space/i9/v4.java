package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends w4 {
    public final int v;

    public v4(int i, byte[] bArr) {
        super(bArr);
        w4.h(0, i, bArr.length);
        this.v = i;
    }

    @Override // com.gamericefishpro.space.i9.w4
    public final byte b(int i) {
        int i2 = this.v;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.e[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.gamericefishpro.space.i9.w4
    public final byte c(int i) {
        return this.e[i];
    }

    @Override // com.gamericefishpro.space.i9.w4
    public final int d() {
        return this.v;
    }
}
