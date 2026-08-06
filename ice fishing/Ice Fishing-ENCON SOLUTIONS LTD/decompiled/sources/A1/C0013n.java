package A1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: A1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0013n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f61b = AtomicIntegerFieldUpdater.newUpdater(C0013n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f62a;

    public C0013n(Throwable th, boolean z2) {
        this.f62a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f62a + ']';
    }
}
