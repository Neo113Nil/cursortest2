package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzfb implements Executor {
    public static final zzfb zza;
    public static final /* synthetic */ zzfb[] zzb;

    static {
        zzfb zzfbVar = new zzfb("INSTANCE", 0);
        zza = zzfbVar;
        zzb = new zzfb[]{zzfbVar};
    }

    public static zzfb[] values() {
        return (zzfb[]) zzb.clone();
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
