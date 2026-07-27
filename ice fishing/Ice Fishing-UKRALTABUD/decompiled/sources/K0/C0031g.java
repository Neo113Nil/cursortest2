package K0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: K0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g extends C0038n {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f510c = AtomicIntegerFieldUpdater.newUpdater(C0031g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0031g(C0030f c0030f, Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new CancellationException("Continuation " + c0030f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
