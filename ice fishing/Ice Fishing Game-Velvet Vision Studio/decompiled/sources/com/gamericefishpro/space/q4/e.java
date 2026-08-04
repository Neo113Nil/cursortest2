package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public final int w;
    public final int y;

    public e(byte[] bArr, int i, int i2) {
        super(bArr);
        f.c(i, i + i2, bArr.length);
        this.w = i;
        this.y = i2;
    }

    @Override // com.gamericefishpro.space.q4.f
    public final byte b(int i) {
        int i2 = this.y;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.e[this.w + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(com.gamericefishpro.space.m5.a.g(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // com.gamericefishpro.space.q4.f
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.e, this.w, bArr, 0, i);
    }

    @Override // com.gamericefishpro.space.q4.f
    public final int h() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.q4.f
    public final byte i(int i) {
        return this.e[this.w + i];
    }

    @Override // com.gamericefishpro.space.q4.f
    public final int size() {
        return this.y;
    }
}
