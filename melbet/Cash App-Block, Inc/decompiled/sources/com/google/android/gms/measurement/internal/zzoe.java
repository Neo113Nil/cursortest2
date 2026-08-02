package com.google.android.gms.measurement.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zzoe {
    public static final zzoe zza;
    public static final zzoe zzd;
    public static final /* synthetic */ zzoe[] zze;

    static {
        zzoe zzoeVar = new zzoe("CONSENT", 0);
        zza = zzoeVar;
        zzoe zzoeVar2 = new zzoe("LEGITIMATE_INTEREST", 1);
        zzoe zzoeVar3 = new zzoe("FLEXIBLE_CONSENT", 2);
        zzoe zzoeVar4 = new zzoe("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        zzd = zzoeVar4;
        zze = new zzoe[]{zzoeVar, zzoeVar2, zzoeVar3, zzoeVar4};
    }

    public static zzoe[] values() {
        return (zzoe[]) zze.clone();
    }
}
