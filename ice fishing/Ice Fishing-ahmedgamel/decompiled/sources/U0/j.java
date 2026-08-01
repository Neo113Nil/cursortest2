package U0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final j f3162n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j[] f3163u;

    static {
        j jVar = new j("INSTANCE", 0);
        f3162n = jVar;
        f3163u = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f3163u.clone();
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
