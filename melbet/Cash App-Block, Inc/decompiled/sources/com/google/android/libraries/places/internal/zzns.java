package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzns {
    public static final zzns zza;
    public static final zzns zzb;
    public static final zzns zzc;
    public static final zzns zzd;
    public static final zzns zze;
    public static final /* synthetic */ zzns[] zzf;

    static {
        zzns zznsVar = new zzns("PROGRAMMATIC_API", 0);
        zza = zznsVar;
        zzns zznsVar2 = new zzns("AUTOCOMPLETE_WIDGET", 1);
        zzb = zznsVar2;
        zzns zznsVar3 = new zzns("PROGRAMMATIC_KOTLIN_API", 2);
        zzc = zznsVar3;
        zzns zznsVar4 = new zzns("PLACES_UI_KIT", 3);
        zzd = zznsVar4;
        zzns zznsVar5 = new zzns("ONE_PLATFORM_AUTOCOMPLETE_WIDGET", 4);
        zze = zznsVar5;
        zzf = new zzns[]{zznsVar, zznsVar2, zznsVar3, zznsVar4, zznsVar5};
    }

    public static zzns valueOf(String str) {
        return (zzns) Enum.valueOf(zzns.class, str);
    }

    public static zzns[] values() {
        return (zzns[]) zzf.clone();
    }
}
