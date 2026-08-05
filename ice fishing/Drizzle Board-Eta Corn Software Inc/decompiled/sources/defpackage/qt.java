package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qt extends e60 implements ot {
    public static final /* synthetic */ AtomicReferenceFieldUpdater eVhOlqcC = AtomicReferenceFieldUpdater.newUpdater(qt.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long k3x7lurq = b1.qoPGr6Ce.objectFieldOffset(qt.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public qt() {
        super(1);
        this.owner$volatile = ra.wxUZMvaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0041, code lost:
    
        r1 = defpackage.qt.eVhOlqcC;
        r2 = r0.MdtA4re8;
        r1.set(r2, null);
        r11 = r0.NCTxEWno;
        r11.lwWCatUu(r7, r11.wxUZMvaN, new defpackage.l3(0, new defpackage.b2ZJblxo(r2, r0)));
     */
    @Override // defpackage.ot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P7K7Inc8(h9 h9Var) {
        qt qtVar;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = e60.b2ZJblxo;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = this.NCTxEWno;
            if (intVolatile > i) {
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    long j2 = e60.b2ZJblxo;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i2 = this.NCTxEWno;
                    qtVar = this;
                    if (intVolatile2 > i2 && !unsafe2.compareAndSwapInt(qtVar, j2, intVolatile2, i2)) {
                        this = qtVar;
                    }
                }
            } else {
                qtVar = this;
                xe0 xe0Var = xe0.qoPGr6Ce;
                if (intVolatile <= 0) {
                    m3 amk52bBQ = le0.amk52bBQ(w30.SgZGMMPL(h9Var));
                    try {
                        pt ptVar = new pt(qtVar, amk52bBQ);
                        while (true) {
                            int andDecrement = e60.P7K7Inc8.getAndDecrement(qtVar);
                            if (andDecrement <= i) {
                                if (andDecrement > 0) {
                                    break;
                                }
                                if (qtVar.qoPGr6Ce(ptVar)) {
                                    break;
                                }
                            }
                        }
                        Object Ey6iv0m0 = amk52bBQ.Ey6iv0m0();
                        u9 u9Var = u9.NCTxEWno;
                        if (Ey6iv0m0 != u9Var) {
                            Ey6iv0m0 = xe0Var;
                        }
                        return Ey6iv0m0 == u9Var ? Ey6iv0m0 : xe0Var;
                    } catch (Throwable th) {
                        amk52bBQ.DK9slbsy();
                        throw th;
                    }
                }
                if (unsafe.compareAndSwapInt(qtVar, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(qtVar, k3x7lurq, (Object) null);
                    return xe0Var;
                }
            }
            this = qtVar;
        }
    }

    @Override // defpackage.ot
    public final void VgvYg0wo(Object obj) {
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            if (Math.max(unsafe.getIntVolatile(this, e60.b2ZJblxo), 0) != 0) {
                m1.Ey6iv0m0("This mutex is not locked");
                return;
            }
            long j = k3x7lurq;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            lf lfVar = ra.wxUZMvaN;
            if (objectVolatile != lfVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    qt qtVar = this;
                    if (unsafe2.compareAndSwapObject(qtVar, k3x7lurq, objectVolatile, lfVar)) {
                        qtVar.NCTxEWno();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(qtVar, j) != objectVolatile) {
                            this = qtVar;
                            break;
                        }
                        this = qtVar;
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(ra.I5GHvsYW(this));
        sb.append("[isLocked=");
        Unsafe unsafe = b1.qoPGr6Ce;
        sb.append(Math.max(unsafe.getIntVolatile(this, e60.b2ZJblxo), 0) == 0);
        sb.append(",owner=");
        sb.append(unsafe.getObjectVolatile(this, k3x7lurq));
        sb.append(']');
        return sb.toString();
    }
}
