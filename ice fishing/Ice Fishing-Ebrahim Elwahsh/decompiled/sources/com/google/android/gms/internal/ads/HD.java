package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HD implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final HD f25326n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ HD[] f25327u;

    static {
        HD hd = new HD("INSTANCE", 0);
        f25326n = hd;
        f25327u = new HD[]{hd};
    }

    public static HD[] values() {
        return (HD[]) f25327u.clone();
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
