package o4;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final f f5207g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f[] f5208h;

    static {
        f fVar = new f("INSTANCE", 0);
        f5207g = fVar;
        f5208h = new f[]{fVar};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f5208h.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        pc.j.e(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
