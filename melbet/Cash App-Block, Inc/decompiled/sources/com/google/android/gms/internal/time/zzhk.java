package com.google.android.gms.internal.time;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzhk implements Executor {
    public static final zzhk zza;
    public static final /* synthetic */ zzhk[] zzb;

    static {
        zzhk zzhkVar = new zzhk("INSTANCE", 0);
        zza = zzhkVar;
        zzb = new zzhk[]{zzhkVar};
    }

    public static zzhk[] values() {
        return (zzhk[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
