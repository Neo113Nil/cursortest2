package com.google.crypto.tink.internal;

import com.google.android.gms.dynamite.zze;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class Random {
    public static final zze localRandom = new zze(5);

    public static byte[] randBytes(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) localRandom.get()).nextBytes(bArr);
        return bArr;
    }
}
