package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xa0 extends defpackage.fb0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater h3m55N1URyyK = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.xa0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final defpackage.WDYagTQQm9ns fNwYGHIYeJcR;

    public xa0(defpackage.WDYagTQQm9ns wDYagTQQm9ns) {
        this.fNwYGHIYeJcR = wDYagTQQm9ns;
    }

    @Override // defpackage.fb0
    public final void BHfvd2J71qpO(java.lang.Throwable th) {
        if (h3m55N1URyyK.compareAndSet(this, 0, 1)) {
            this.fNwYGHIYeJcR.P05cfTpS5W5L(th);
        }
    }

    @Override // defpackage.fb0
    public final boolean s0TASMVLSWD5() {
        return true;
    }
}
