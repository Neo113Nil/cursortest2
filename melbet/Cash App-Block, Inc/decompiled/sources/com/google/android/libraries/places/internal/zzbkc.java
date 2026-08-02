package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class zzbkc {
    public static final byte[] zza;

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        ByteBuffer.wrap(bArr);
        zzbiq.zzJ(0, bArr);
    }

    public static void zza() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int zzc(int i, int i2, int i3, byte[] bArr) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
