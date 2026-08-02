package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.dL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3103dL {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f30518a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f30519b;

    static {
        byte[] bArr = new byte[0];
        f30518a = bArr;
        f30519b = ByteBuffer.wrap(bArr);
        W7.b.f(bArr, 0, 0);
    }

    public static void a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i, int i4, int i6, byte[] bArr) {
        for (int i9 = i4; i9 < i4 + i6; i9++) {
            i = (i * 31) + bArr[i9];
        }
        return i;
    }
}
