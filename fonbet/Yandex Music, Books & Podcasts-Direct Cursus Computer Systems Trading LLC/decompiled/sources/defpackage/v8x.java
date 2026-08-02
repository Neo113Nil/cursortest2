package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v8x implements Executor {
    public static final v8x a;
    public static final /* synthetic */ v8x[] b;

    static {
        v8x v8xVar = new v8x("INSTANCE", 0);
        a = v8xVar;
        b = new v8x[]{v8xVar};
    }

    public static v8x[] values() {
        return (v8x[]) b.clone();
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
