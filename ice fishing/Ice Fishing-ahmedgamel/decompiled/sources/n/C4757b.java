package n;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4757b extends Q3.b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4757b f39602c;

    /* renamed from: d, reason: collision with root package name */
    public static final ExecutorC4756a f39603d = new ExecutorC4756a(0);

    /* renamed from: b, reason: collision with root package name */
    public final C4759d f39604b = new C4759d();

    public static C4757b z() {
        if (f39602c != null) {
            return f39602c;
        }
        synchronized (C4757b.class) {
            try {
                if (f39602c == null) {
                    f39602c = new C4757b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f39602c;
    }
}
