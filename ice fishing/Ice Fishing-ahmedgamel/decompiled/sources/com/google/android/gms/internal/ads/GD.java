package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GD implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final GD f24952n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ GD[] f24953u;

    static {
        GD gd = new GD("INSTANCE", 0);
        f24952n = gd;
        f24953u = new GD[]{gd};
    }

    public static GD[] values() {
        return (GD[]) f24953u.clone();
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
