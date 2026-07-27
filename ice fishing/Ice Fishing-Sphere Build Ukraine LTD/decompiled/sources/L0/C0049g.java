package L0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: L0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049g extends C0056n {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f658c = AtomicIntegerFieldUpdater.newUpdater(C0049g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0049g(C0048f c0048f, Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new CancellationException("Continuation " + c0048f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
