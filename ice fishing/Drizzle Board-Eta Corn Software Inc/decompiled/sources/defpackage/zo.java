package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zo extends n9 implements ub {
    public final int P7K7Inc8;
    public final Object Qr9iLBAD;
    public final n9 VgvYg0wo;
    public final hq b2ZJblxo;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final /* synthetic */ ub wxUZMvaN;
    public static final /* synthetic */ AtomicIntegerFieldUpdater jb9XjC4I = AtomicIntegerFieldUpdater.newUpdater(zo.class, "runningWorkers$volatile");
    public static final /* synthetic */ long eVhOlqcC = b1.qoPGr6Ce.objectFieldOffset(zo.class.getDeclaredField("runningWorkers$volatile"));

    /* JADX WARN: Multi-variable type inference failed */
    public zo(n9 n9Var, int i) {
        ub ubVar = n9Var instanceof ub ? (ub) n9Var : null;
        this.wxUZMvaN = ubVar == null ? va.qoPGr6Ce : ubVar;
        this.VgvYg0wo = n9Var;
        this.P7K7Inc8 = i;
        this.b2ZJblxo = new hq();
        this.Qr9iLBAD = new Object();
    }

    public final Runnable DK9slbsy() {
        while (true) {
            Runnable runnable = (Runnable) this.b2ZJblxo.wxUZMvaN();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.Qr9iLBAD) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = jb9XjC4I;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.b2ZJblxo.MdtA4re8() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.n9
    public final void FySoLYna(l9 l9Var, Runnable runnable) {
        Runnable DK9slbsy;
        this.b2ZJblxo.qoPGr6Ce(runnable);
        if (b1.qoPGr6Ce.getIntVolatile(this, eVhOlqcC) >= this.P7K7Inc8 || !lwWCatUu() || (DK9slbsy = DK9slbsy()) == null) {
            return;
        }
        this.VgvYg0wo.FySoLYna(this, new XrPeKzBk(this, 7, DK9slbsy));
    }

    @Override // defpackage.ub
    public final void P7K7Inc8(long j, m3 m3Var) {
        this.wxUZMvaN.P7K7Inc8(j, m3Var);
    }

    @Override // defpackage.n9
    public final void RXQxj5Oe(l9 l9Var, Runnable runnable) {
        Runnable DK9slbsy;
        this.b2ZJblxo.qoPGr6Ce(runnable);
        if (b1.qoPGr6Ce.getIntVolatile(this, eVhOlqcC) >= this.P7K7Inc8 || !lwWCatUu() || (DK9slbsy = DK9slbsy()) == null) {
            return;
        }
        this.VgvYg0wo.RXQxj5Oe(this, new XrPeKzBk(this, 7, DK9slbsy));
    }

    @Override // defpackage.ub
    public final kd VgvYg0wo(long j, pc0 pc0Var, l9 l9Var) {
        return this.wxUZMvaN.VgvYg0wo(j, pc0Var, l9Var);
    }

    public final boolean lwWCatUu() {
        synchronized (this.Qr9iLBAD) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = jb9XjC4I;
            if (b1.qoPGr6Ce.getIntVolatile(this, eVhOlqcC) >= this.P7K7Inc8) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.n9
    public final String toString() {
        return this.VgvYg0wo + ".limitedParallelism(" + this.P7K7Inc8 + ')';
    }
}
