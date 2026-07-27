package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.dL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3080dL {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f29746a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f29747b;

    static {
        byte[] bArr = new byte[0];
        f29746a = bArr;
        f29747b = ByteBuffer.wrap(bArr);
        W7.b.f(bArr, 0, 0);
    }

    public static void a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i, int i6, int i9, byte[] bArr) {
        for (int i10 = i6; i10 < i6 + i9; i10++) {
            i = (i * 31) + bArr[i10];
        }
        return i;
    }
}
