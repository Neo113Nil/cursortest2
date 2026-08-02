package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzbtq {
    public static final zzbtq zza;
    public static final zzbtq zzc;
    public static final /* synthetic */ zzbtq[] zzd;

    static {
        zzbtq zzbtqVar = new zzbtq("NONE", 0);
        zza = zzbtqVar;
        zzbtq zzbtqVar2 = new zzbtq("INTEGRITY", 1);
        zzbtq zzbtqVar3 = new zzbtq("PRIVACY_AND_INTEGRITY", 2);
        zzc = zzbtqVar3;
        zzd = new zzbtq[]{zzbtqVar, zzbtqVar2, zzbtqVar3};
    }

    public static zzbtq[] values() {
        return (zzbtq[]) zzd.clone();
    }
}
