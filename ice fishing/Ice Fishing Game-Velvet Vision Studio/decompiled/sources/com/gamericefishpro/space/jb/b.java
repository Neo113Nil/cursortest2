package com.gamericefishpro.space.jb;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {
    public long d;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.d++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.d += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
