package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzbvs {
    public static final zzbvs zza;
    public static final zzbvs zzb;
    public static final zzbvs zzc;
    public static final zzbvs zzd;
    public static final /* synthetic */ zzbvs[] zze;

    static {
        zzbvs zzbvsVar = new zzbvs("PROCESSED", 0);
        zza = zzbvsVar;
        zzbvs zzbvsVar2 = new zzbvs("REFUSED", 1);
        zzb = zzbvsVar2;
        zzbvs zzbvsVar3 = new zzbvs("DROPPED", 2);
        zzc = zzbvsVar3;
        zzbvs zzbvsVar4 = new zzbvs("MISCARRIED", 3);
        zzd = zzbvsVar4;
        zze = new zzbvs[]{zzbvsVar, zzbvsVar2, zzbvsVar3, zzbvsVar4};
    }

    public static zzbvs[] values() {
        return (zzbvs[]) zze.clone();
    }
}
