package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ka1 extends defpackage.wj implements defpackage.ds0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.ka1.class, "cleanedAndPointers$volatile");
    public final long WDYagTQQm9ns;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public ka1(long j, defpackage.ka1 ka1Var, int i) {
        super(ka1Var);
        this.WDYagTQQm9ns = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean GE9mJIPrb8gP() {
        return oh71FJcDz6S2.addAndGet(this, -65536) == Ns0WNyEWdPsk() && fWTAfUmVKrZq() != null;
    }

    public abstract int Ns0WNyEWdPsk();

    public abstract void fNwYGHIYeJcR(int i, defpackage.jm jmVar);

    public final boolean gUjdnLbkVAaA() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = oh71FJcDz6S2;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == Ns0WNyEWdPsk() && fWTAfUmVKrZq() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public final void h3m55N1URyyK() {
        if (oh71FJcDz6S2.incrementAndGet(this) == Ns0WNyEWdPsk()) {
            P05cfTpS5W5L();
        }
    }

    @Override // defpackage.wj
    public final boolean oh71FJcDz6S2() {
        return oh71FJcDz6S2.get(this) == Ns0WNyEWdPsk() && fWTAfUmVKrZq() != null;
    }
}
