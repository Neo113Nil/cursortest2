package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class VC {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f28098a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i6 = 0; i6 < 26; i6++) {
            byte b9 = (byte) (i6 + 10);
            bArr[i6 + 65] = b9;
            bArr[i6 + 97] = b9;
        }
        f28098a = bArr;
    }
}
