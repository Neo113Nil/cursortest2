package com.google.mlkit.common;

import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class MlKitException extends Exception {
    public final int zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        zzae.checkNotEmpty(str, "Provided message must not be empty.");
        this.zza = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(int i, Exception exc, String str) {
        super(str, exc);
        zzae.checkNotEmpty(str, "Provided message must not be empty.");
        this.zza = i;
    }
}
