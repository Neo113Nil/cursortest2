package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Z2 extends M2 {
    public Z2(int i2, String str, PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    public final int b() {
        return this.f4726a;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i2 = this.f4726a;
        if (length <= i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f4728c.warning("\"%s\" %s exceeded limit of %d bytes", this.f4727b, bArr, Integer.valueOf(this.f4726a));
        return bArr2;
    }

    public final String a() {
        return this.f4727b;
    }
}
