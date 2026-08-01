package n;

import X2.e;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4743b extends e {
    public static volatile C4743b i;

    /* renamed from: j, reason: collision with root package name */
    public static final ExecutorC4742a f39445j = new ExecutorC4742a(0);

    /* renamed from: h, reason: collision with root package name */
    public final C4745d f39446h = new C4745d();

    public static C4743b T() {
        if (i != null) {
            return i;
        }
        synchronized (C4743b.class) {
            try {
                if (i == null) {
                    i = new C4743b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
