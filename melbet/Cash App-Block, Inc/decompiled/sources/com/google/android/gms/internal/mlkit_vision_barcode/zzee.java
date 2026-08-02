package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzee implements Executor {
    public static final zzee zza;
    public static final /* synthetic */ zzee[] zzb;

    static {
        zzee zzeeVar = new zzee("INSTANCE", 0);
        zza = zzeeVar;
        zzb = new zzee[]{zzeeVar};
    }

    public static zzee[] values() {
        return (zzee[]) zzb.clone();
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
