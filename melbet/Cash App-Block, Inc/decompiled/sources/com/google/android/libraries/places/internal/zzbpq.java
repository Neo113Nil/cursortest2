package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzbpq {
    public static final zzbpq zza;
    public static final zzbpq zzb;
    public static final zzbpq zzc;
    public static final zzbpq zzd;
    public static final zzbpq zze;
    public static final /* synthetic */ zzbpq[] zzf;

    static {
        zzbpq zzbpqVar = new zzbpq("CONNECTING", 0);
        zza = zzbpqVar;
        zzbpq zzbpqVar2 = new zzbpq("READY", 1);
        zzb = zzbpqVar2;
        zzbpq zzbpqVar3 = new zzbpq("TRANSIENT_FAILURE", 2);
        zzc = zzbpqVar3;
        zzbpq zzbpqVar4 = new zzbpq("IDLE", 3);
        zzd = zzbpqVar4;
        zzbpq zzbpqVar5 = new zzbpq("SHUTDOWN", 4);
        zze = zzbpqVar5;
        zzf = new zzbpq[]{zzbpqVar, zzbpqVar2, zzbpqVar3, zzbpqVar4, zzbpqVar5};
    }

    public static zzbpq[] values() {
        return (zzbpq[]) zzf.clone();
    }
}
