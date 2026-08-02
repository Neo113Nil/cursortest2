package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcgn {
    public static final Logger zza = Logger.getLogger(zzcgn.class.getName());
    public static final byte[] zzb = "-bin".getBytes(StandardCharsets.US_ASCII);

    private zzcgn() {
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
