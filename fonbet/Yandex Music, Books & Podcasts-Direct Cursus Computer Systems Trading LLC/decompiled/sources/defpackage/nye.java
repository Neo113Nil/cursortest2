package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes5.dex */
public final class nye extends y2f {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(nye.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final aub e;

    public nye(aub aubVar) {
        this.e = aubVar;
    }

    @Override // defpackage.y2f
    public final boolean k() {
        return true;
    }

    @Override // defpackage.y2f
    public final void l(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
