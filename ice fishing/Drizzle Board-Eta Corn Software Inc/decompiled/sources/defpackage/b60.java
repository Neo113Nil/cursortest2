package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class b60 extends r7 implements jw {
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long wxUZMvaN;
    public static final /* synthetic */ AtomicIntegerFieldUpdater VgvYg0wo = AtomicIntegerFieldUpdater.newUpdater(b60.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long P7K7Inc8 = b1.qoPGr6Ce.objectFieldOffset(b60.class.getDeclaredField("cleanedAndPointers$volatile"));

    public b60(long j, b60 b60Var, int i) {
        super(b60Var);
        this.wxUZMvaN = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.r7
    public final boolean MdtA4re8() {
        return b1.qoPGr6Ce.getIntVolatile(this, P7K7Inc8) == P7K7Inc8() && NCTxEWno() != null;
    }

    public abstract int P7K7Inc8();

    public final void Qr9iLBAD() {
        if (VgvYg0wo.incrementAndGet(this) == P7K7Inc8()) {
            wxUZMvaN();
        }
    }

    public final boolean VgvYg0wo() {
        return VgvYg0wo.addAndGet(this, -65536) == P7K7Inc8() && NCTxEWno() != null;
    }

    public abstract void b2ZJblxo(int i, l9 l9Var);

    public final boolean jb9XjC4I() {
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = P7K7Inc8;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.P7K7Inc8() && this.NCTxEWno() != null) {
                return false;
            }
            b60 b60Var = this;
            if (unsafe.compareAndSwapInt(b60Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = b60Var;
        }
    }
}
