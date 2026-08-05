package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bj0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater MdtA4re8;
    public static final /* synthetic */ AtomicIntegerFieldUpdater NCTxEWno;
    public static final /* synthetic */ long P7K7Inc8;
    public static final /* synthetic */ long VgvYg0wo;
    public static final /* synthetic */ long b2ZJblxo;
    public static final /* synthetic */ long wxUZMvaN;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public final AtomicReferenceArray qoPGr6Ce = new AtomicReferenceArray(128);

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        P7K7Inc8 = unsafe.objectFieldOffset(bj0.class.getDeclaredField("lastScheduledTask$volatile"));
        NCTxEWno = AtomicIntegerFieldUpdater.newUpdater(bj0.class, "producerIndex$volatile");
        b2ZJblxo = unsafe.objectFieldOffset(bj0.class.getDeclaredField("producerIndex$volatile"));
        VgvYg0wo = unsafe.objectFieldOffset(bj0.class.getDeclaredField("consumerIndex$volatile"));
        MdtA4re8 = AtomicIntegerFieldUpdater.newUpdater(bj0.class, "blockingTasksInBuffer$volatile");
        wxUZMvaN = unsafe.objectFieldOffset(bj0.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final ob0 MdtA4re8() {
        ob0 ob0Var;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = VgvYg0wo;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, b2ZJblxo) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            bj0 bj0Var = this;
            if (unsafe.compareAndSwapInt(bj0Var, j, intVolatile, intVolatile + 1) && (ob0Var = (ob0) bj0Var.qoPGr6Ce.getAndSet(i, null)) != null) {
                if (ob0Var.MdtA4re8) {
                    MdtA4re8.decrementAndGet(bj0Var);
                }
                return ob0Var;
            }
            this = bj0Var;
        }
    }

    public final int NCTxEWno() {
        return b1.qoPGr6Ce.getIntVolatile(this, b2ZJblxo) - b1.qoPGr6Ce.getIntVolatile(this, VgvYg0wo);
    }

    public final ob0 qoPGr6Ce(ob0 ob0Var) {
        if (NCTxEWno() == 127) {
            return ob0Var;
        }
        if (ob0Var.MdtA4re8) {
            MdtA4re8.incrementAndGet(this);
        }
        int intVolatile = b1.qoPGr6Ce.getIntVolatile(this, b2ZJblxo) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.qoPGr6Ce;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, ob0Var);
                NCTxEWno.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final ob0 wxUZMvaN(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.qoPGr6Ce;
        ob0 ob0Var = (ob0) atomicReferenceArray.get(i2);
        if (ob0Var != null && ob0Var.MdtA4re8 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ob0Var, null)) {
                if (atomicReferenceArray.get(i2) != ob0Var) {
                }
            }
            if (z) {
                MdtA4re8.decrementAndGet(this);
            }
            return ob0Var;
        }
        return null;
    }
}
