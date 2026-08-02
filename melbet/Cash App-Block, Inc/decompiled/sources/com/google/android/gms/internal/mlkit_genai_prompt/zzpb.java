package com.google.android.gms.internal.mlkit_genai_prompt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzpb {
    public static final zzpb zza;
    public static final zzpb zzb;
    public static final zzpb zzc;
    public static final /* synthetic */ zzpb[] zzd;

    static {
        zzpb zzpbVar = new zzpb("INFERENCE_WITHOUT_CACHE", 0);
        zza = zzpbVar;
        zzpb zzpbVar2 = new zzpb("CACHE_CREATION", 1);
        zzb = zzpbVar2;
        zzpb zzpbVar3 = new zzpb("INFERENCE_WITH_CACHE", 2);
        zzc = zzpbVar3;
        zzd = new zzpb[]{zzpbVar, zzpbVar2, zzpbVar3};
    }

    public static zzpb[] values() {
        return (zzpb[]) zzd.clone();
    }
}
