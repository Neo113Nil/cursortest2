package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g48 implements Executor {
    public static final g48 a;
    public static final /* synthetic */ g48[] b;

    static {
        g48 g48Var = new g48("INSTANCE", 0);
        a = g48Var;
        b = new g48[]{g48Var};
    }

    public static g48 valueOf(String str) {
        return (g48) Enum.valueOf(g48.class, str);
    }

    public static g48[] values() {
        return (g48[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
