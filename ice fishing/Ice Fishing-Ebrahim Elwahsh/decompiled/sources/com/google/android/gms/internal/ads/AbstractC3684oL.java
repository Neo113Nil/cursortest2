package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.oL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3684oL {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f33136a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f33137b;

    static {
        byte[] bArr = new byte[0];
        f33136a = bArr;
        f33137b = ByteBuffer.wrap(bArr);
        S7.b.f(bArr, 0, 0);
    }

    public static void a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i, int i4, int i9, byte[] bArr) {
        for (int i10 = i4; i10 < i4 + i9; i10++) {
            i = (i * 31) + bArr[i10];
        }
        return i;
    }
}
