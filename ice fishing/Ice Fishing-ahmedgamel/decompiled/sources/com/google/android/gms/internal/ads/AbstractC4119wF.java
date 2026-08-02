package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import v7.C5117h;

/* renamed from: com.google.android.gms.internal.ads.wF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4119wF {

    /* renamed from: a, reason: collision with root package name */
    public int f35585a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35586b;

    public AbstractC4119wF(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f35586b = AbstractC4011uF.c(bArr);
        this.f35585a = i;
    }

    public abstract int[] a(int[] iArr, int i);

    public abstract int b();

    public ByteBuffer c(int i, byte[] bArr) {
        int[] a9 = a(AbstractC4011uF.c(bArr), i);
        int[] iArr = (int[]) a9.clone();
        AbstractC4011uF.a(iArr);
        for (int i4 = 0; i4 < 16; i4++) {
            a9[i4] = a9[i4] + iArr[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a9, 0, 16);
        return order;
    }

    public AbstractC4119wF() {
        this.f35586b = new C5117h();
    }
}
