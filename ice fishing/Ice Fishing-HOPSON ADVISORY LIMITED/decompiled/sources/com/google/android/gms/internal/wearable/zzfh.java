package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzfh extends RuntimeException {
    public zzfh(zzel zzelVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzdv zza() {
        return new zzdv(getMessage());
    }
}
