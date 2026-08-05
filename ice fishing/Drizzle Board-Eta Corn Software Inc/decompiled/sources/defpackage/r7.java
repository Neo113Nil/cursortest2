package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class r7 {
    public static final /* synthetic */ int MdtA4re8 = 0;
    public static final /* synthetic */ long NCTxEWno;
    public static final /* synthetic */ long qoPGr6Ce;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        qoPGr6Ce = unsafe.objectFieldOffset(r7.class.getDeclaredField("_next$volatile"));
        NCTxEWno = unsafe.objectFieldOffset(r7.class.getDeclaredField("_prev$volatile"));
    }

    public r7(b60 b60Var) {
        this._prev$volatile = b60Var;
    }

    public abstract boolean MdtA4re8();

    public final r7 NCTxEWno() {
        Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(this, qoPGr6Ce);
        if (objectVolatile == w30.MdtA4re8) {
            return null;
        }
        return (r7) objectVolatile;
    }

    public final void qoPGr6Ce() {
        b1.qoPGr6Ce.putObjectVolatile(this, NCTxEWno, (Object) null);
    }

    public final void wxUZMvaN() {
        r7 r7Var;
        Unsafe unsafe;
        if (NCTxEWno() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = b1.qoPGr6Ce;
            long j = NCTxEWno;
            r7 r7Var2 = (r7) unsafe2.getObjectVolatile(this, j);
            while (r7Var2 != null && r7Var2.MdtA4re8()) {
                r7Var2 = (r7) b1.qoPGr6Ce.getObjectVolatile(r7Var2, j);
            }
            r7 NCTxEWno2 = NCTxEWno();
            NCTxEWno2.getClass();
            do {
                r7Var = NCTxEWno2;
                if (!r7Var.MdtA4re8()) {
                    break;
                } else {
                    NCTxEWno2 = r7Var.NCTxEWno();
                }
            } while (NCTxEWno2 != null);
            while (true) {
                Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(r7Var, j);
                r7 r7Var3 = ((r7) objectVolatile) == null ? null : r7Var2;
                do {
                    unsafe = b1.qoPGr6Ce;
                    if (unsafe.compareAndSwapObject(r7Var, NCTxEWno, objectVolatile, r7Var3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(r7Var, j) == objectVolatile);
            }
            if (r7Var2 != null) {
                unsafe.putObjectVolatile(r7Var2, qoPGr6Ce, r7Var);
            }
            if (!r7Var.MdtA4re8() || r7Var.NCTxEWno() == null) {
                if (r7Var2 == null || !r7Var2.MdtA4re8()) {
                    return;
                }
            }
        }
    }
}
