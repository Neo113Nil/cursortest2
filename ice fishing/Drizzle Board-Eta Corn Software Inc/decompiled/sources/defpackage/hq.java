package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class hq {
    public static final /* synthetic */ long qoPGr6Ce = b1.qoPGr6Ce.objectFieldOffset(hq.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new jq(8, false);

    public final int MdtA4re8() {
        jq jqVar = (jq) b1.qoPGr6Ce.getObjectVolatile(this, qoPGr6Ce);
        jqVar.getClass();
        long longVolatile = b1.qoPGr6Ce.getLongVolatile(jqVar, jq.b2ZJblxo);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final void NCTxEWno() {
        hq hqVar;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = qoPGr6Ce;
            jq jqVar = (jq) unsafe.getObjectVolatile(this, j);
            if (jqVar.NCTxEWno()) {
                return;
            }
            jq MdtA4re8 = jqVar.MdtA4re8();
            while (true) {
                hqVar = this;
                if (!b1.qoPGr6Ce.compareAndSwapObject(hqVar, qoPGr6Ce, jqVar, MdtA4re8) && b1.qoPGr6Ce.getObjectVolatile(hqVar, j) == jqVar) {
                    this = hqVar;
                }
            }
            this = hqVar;
        }
    }

    public final boolean qoPGr6Ce(Runnable runnable) {
        hq hqVar;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = qoPGr6Ce;
            jq jqVar = (jq) unsafe.getObjectVolatile(this, j);
            int qoPGr6Ce2 = jqVar.qoPGr6Ce(runnable);
            if (qoPGr6Ce2 == 0) {
                return true;
            }
            if (qoPGr6Ce2 == 1) {
                jq MdtA4re8 = jqVar.MdtA4re8();
                while (true) {
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    hqVar = this;
                    if (!unsafe2.compareAndSwapObject(hqVar, qoPGr6Ce, jqVar, MdtA4re8) && unsafe2.getObjectVolatile(hqVar, j) == jqVar) {
                        this = hqVar;
                    }
                }
            } else {
                if (qoPGr6Ce2 == 2) {
                    return false;
                }
                hqVar = this;
            }
            this = hqVar;
        }
    }

    public final Object wxUZMvaN() {
        hq hqVar;
        while (true) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = qoPGr6Ce;
            jq jqVar = (jq) unsafe.getObjectVolatile(this, j);
            Object wxUZMvaN = jqVar.wxUZMvaN();
            if (wxUZMvaN != jq.VgvYg0wo) {
                return wxUZMvaN;
            }
            jq MdtA4re8 = jqVar.MdtA4re8();
            while (true) {
                hqVar = this;
                if (!b1.qoPGr6Ce.compareAndSwapObject(hqVar, qoPGr6Ce, jqVar, MdtA4re8) && b1.qoPGr6Ce.getObjectVolatile(hqVar, j) == jqVar) {
                    this = hqVar;
                }
            }
            this = hqVar;
        }
    }
}
