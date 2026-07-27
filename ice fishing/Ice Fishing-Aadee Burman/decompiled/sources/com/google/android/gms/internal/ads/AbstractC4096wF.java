package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import v7.C5127h;

/* renamed from: com.google.android.gms.internal.ads.wF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4096wF {

    /* renamed from: a, reason: collision with root package name */
    public int f34816a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34817b;

    public AbstractC4096wF(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f34817b = AbstractC3988uF.c(bArr);
        this.f34816a = i;
    }

    public abstract int[] a(int[] iArr, int i);

    public abstract int b();

    public ByteBuffer c(int i, byte[] bArr) {
        int[] a9 = a(AbstractC3988uF.c(bArr), i);
        int[] iArr = (int[]) a9.clone();
        AbstractC3988uF.a(iArr);
        for (int i6 = 0; i6 < 16; i6++) {
            a9[i6] = a9[i6] + iArr[i6];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a9, 0, 16);
        return order;
    }

    public AbstractC4096wF() {
        this.f34817b = new C5127h();
    }
}
