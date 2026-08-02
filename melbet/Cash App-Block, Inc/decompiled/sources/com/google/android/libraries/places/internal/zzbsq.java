package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzbsq {
    public static final zzbsq zza;
    public static final zzbsq zzc;
    public static final /* synthetic */ zzbsq[] zzf;

    static {
        zzbsq zzbsqVar = new zzbsq("UNARY", 0);
        zza = zzbsqVar;
        zzbsq zzbsqVar2 = new zzbsq("CLIENT_STREAMING", 1);
        zzbsq zzbsqVar3 = new zzbsq("SERVER_STREAMING", 2);
        zzc = zzbsqVar3;
        zzf = new zzbsq[]{zzbsqVar, zzbsqVar2, zzbsqVar3, new zzbsq("BIDI_STREAMING", 3), new zzbsq("UNKNOWN", 4)};
    }

    public static zzbsq[] values() {
        return (zzbsq[]) zzf.clone();
    }
}
