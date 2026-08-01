package L1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: L1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0009j {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f564b = AtomicIntegerFieldUpdater.newUpdater(C0009j.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f565a;

    public C0009j(Throwable th, boolean z2) {
        this.f565a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f565a + ']';
    }
}
