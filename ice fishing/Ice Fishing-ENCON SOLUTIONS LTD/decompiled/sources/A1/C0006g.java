package A1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: A1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends C0013n {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f49c = AtomicIntegerFieldUpdater.newUpdater(C0006g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0006g(C0005f c0005f, Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new CancellationException("Continuation " + c0005f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
