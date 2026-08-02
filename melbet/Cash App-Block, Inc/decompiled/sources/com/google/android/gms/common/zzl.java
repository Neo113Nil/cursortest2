package com.google.android.gms.common;

import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzl implements Callable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzk zzc;

    public /* synthetic */ zzl(boolean z, String str, zzk zzkVar) {
        this.zza = z;
        this.zzb = str;
        this.zzc = zzkVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        int i = 0;
        boolean z = this.zza;
        String str = this.zzb;
        zzk zzkVar = this.zzc;
        String str2 = (z || !zzo.zzf(str, zzkVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        com.google.android.gms.common.internal.zzae.checkNotNull(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + Hex.bytesToStringLowercase(messageDigest.digest(zzkVar.zza)) + ", atk=" + z + ", ver=12451000.false";
    }
}
