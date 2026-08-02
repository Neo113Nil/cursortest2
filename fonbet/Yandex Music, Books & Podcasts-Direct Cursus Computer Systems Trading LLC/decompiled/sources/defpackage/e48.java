package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e48 implements Executor {
    public static final e48 a;
    public static final /* synthetic */ e48[] b;

    static {
        e48 e48Var = new e48("INSTANCE", 0);
        a = e48Var;
        b = new e48[]{e48Var};
    }

    public static e48 valueOf(String str) {
        return (e48) Enum.valueOf(e48.class, str);
    }

    public static e48[] values() {
        return (e48[]) b.clone();
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
