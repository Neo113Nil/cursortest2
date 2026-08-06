package defpackage;

/* loaded from: classes.dex */
public final class m80 extends defpackage.y80 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater DFo87pBq1E5 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.m80.class, "_invoked$volatile");
    public final defpackage.xiZrDbcSW0 JlrlGoKF;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public m80(defpackage.xiZrDbcSW0 xizrdbcsw0) {
        this.JlrlGoKF = xizrdbcsw0;
    }

    @Override // defpackage.y80
    public final void EgCjBq0SZwJ(java.lang.Throwable th) {
        if (DFo87pBq1E5.compareAndSet(this, 0, 1)) {
            this.JlrlGoKF.AARZUJiTa(th);
        }
    }

    @Override // defpackage.y80
    public final boolean kd6TUFXn() {
        return true;
    }
}
