package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d48 implements Executor {
    public static final d48 a;
    public static final /* synthetic */ d48[] b;

    static {
        d48 d48Var = new d48("INSTANCE", 0);
        a = d48Var;
        b = new d48[]{d48Var};
    }

    public static d48 valueOf(String str) {
        return (d48) Enum.valueOf(d48.class, str);
    }

    public static d48[] values() {
        return (d48[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
