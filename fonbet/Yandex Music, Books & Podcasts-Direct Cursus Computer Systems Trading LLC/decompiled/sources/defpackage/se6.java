package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class se6 implements Executor {
    public static final se6 a;
    public static final /* synthetic */ se6[] b;

    static {
        se6 se6Var = new se6("INSTANCE", 0);
        a = se6Var;
        b = new se6[]{se6Var};
    }

    public static se6 valueOf(String str) {
        return (se6) Enum.valueOf(se6.class, str);
    }

    public static se6[] values() {
        return (se6[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
