package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public final class zzga extends zzh implements Serializable {
    public final MessageDigest zza;
    public final int zzb;
    public final boolean zzc;
    public final String zzd;

    public zzga() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.zza = messageDigest;
            this.zzb = messageDigest.getDigestLength();
            this.zzd = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.zzc = z;
        } catch (NoSuchAlgorithmException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            throw null;
        }
    }

    public final String toString() {
        return this.zzd;
    }
}
