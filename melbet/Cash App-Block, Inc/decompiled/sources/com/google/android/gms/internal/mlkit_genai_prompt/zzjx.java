package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzjx implements Executor {
    public static final zzjx zza;
    public static final /* synthetic */ zzjx[] zzb;

    static {
        zzjx zzjxVar = new zzjx("INSTANCE", 0);
        zza = zzjxVar;
        zzb = new zzjx[]{zzjxVar};
    }

    public static zzjx[] values() {
        return (zzjx[]) zzb.clone();
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
