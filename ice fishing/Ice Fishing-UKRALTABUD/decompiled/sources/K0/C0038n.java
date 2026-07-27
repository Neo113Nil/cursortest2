package K0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: K0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0038n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f522b = AtomicIntegerFieldUpdater.newUpdater(C0038n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f523a;

    public C0038n(Throwable th, boolean z2) {
        this.f523a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f523a + ']';
    }
}
