package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzgf {
    public static final zzgf zza;
    public static final zzgf zzb;
    public static final zzgf zzc;
    public static final zzgf zzd;
    public static final /* synthetic */ zzgf[] zze;

    static {
        zzgf zzgfVar = new zzgf("NONE", 0);
        zza = zzgfVar;
        zzgf zzgfVar2 = new zzgf("PSK", 1);
        zzb = zzgfVar2;
        zzgf zzgfVar3 = new zzgf("EAP", 2);
        zzc = zzgfVar3;
        zzgf zzgfVar4 = new zzgf("OTHER", 3);
        zzd = zzgfVar4;
        zze = new zzgf[]{zzgfVar, zzgfVar2, zzgfVar3, zzgfVar4};
    }

    public static zzgf valueOf(String str) {
        return (zzgf) Enum.valueOf(zzgf.class, str);
    }

    public static zzgf[] values() {
        return (zzgf[]) zze.clone();
    }
}
