package com.google.android.gms.internal.mlkit_genai_prompt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zznk {
    public static final zznk zza;
    public static final zznk zzb;
    public static final zznk zzc;
    public static final /* synthetic */ zznk[] zzd;

    static {
        zznk zznkVar = new zznk("INFERENCE_WITHOUT_CACHE", 0);
        zza = zznkVar;
        zznk zznkVar2 = new zznk("CACHE_CREATION", 1);
        zzb = zznkVar2;
        zznk zznkVar3 = new zznk("INFERENCE_WITH_CACHE", 2);
        zzc = zznkVar3;
        zzd = new zznk[]{zznkVar, zznkVar2, zznkVar3};
    }

    public static zznk[] values() {
        return (zznk[]) zzd.clone();
    }
}
