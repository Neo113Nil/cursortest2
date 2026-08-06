package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q9 extends uc {
    public static final /* synthetic */ AtomicIntegerFieldUpdater X1lG3V04pd = AtomicIntegerFieldUpdater.newUpdater(q9.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q9(n9 n9Var, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + n9Var + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
