package com.gamericefishpro.space.s8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final byte[] f;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f = bArr;
    }

    @Override // com.gamericefishpro.space.s8.n
    public final byte[] F() {
        return this.f;
    }
}
