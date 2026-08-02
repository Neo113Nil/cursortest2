package com.google.android.gms.internal.mlkit_genai_prompt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zznl {
    public static final zznl zza;
    public static final zznl zzb;
    public static final zznl zzd;
    public static final /* synthetic */ zznl[] zze;

    static {
        zznl zznlVar = new zznl("CREATE", 0);
        zza = zznlVar;
        zznl zznlVar2 = new zznl("INFERENCE", 1);
        zzb = zznlVar2;
        zznl zznlVar3 = new zznl("COUNT_TOKENS", 2);
        zznl zznlVar4 = new zznl("CLOSE", 3);
        zzd = zznlVar4;
        zze = new zznl[]{zznlVar, zznlVar2, zznlVar3, zznlVar4};
    }

    public static zznl[] values() {
        return (zznl[]) zze.clone();
    }
}
