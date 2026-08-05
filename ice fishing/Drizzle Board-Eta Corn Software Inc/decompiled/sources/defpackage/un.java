package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class un implements qm {
    public static final /* synthetic */ long MdtA4re8;
    public static final /* synthetic */ long VgvYg0wo;
    public static final /* synthetic */ long wxUZMvaN;
    public final gw NCTxEWno;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = b1.qoPGr6Ce;
        wxUZMvaN = unsafe.objectFieldOffset(un.class.getDeclaredField("_isCompleting$volatile"));
        VgvYg0wo = unsafe.objectFieldOffset(un.class.getDeclaredField("_rootCause$volatile"));
        MdtA4re8 = unsafe.objectFieldOffset(un.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public un(gw gwVar, Throwable th) {
        this.NCTxEWno = gwVar;
        this._rootCause$volatile = th;
    }

    public final Throwable MdtA4re8() {
        return (Throwable) b1.qoPGr6Ce.getObjectVolatile(this, VgvYg0wo);
    }

    @Override // defpackage.qm
    public final boolean NCTxEWno() {
        return MdtA4re8() == null;
    }

    public final boolean P7K7Inc8() {
        return b1.qoPGr6Ce.getIntVolatile(this, wxUZMvaN) != 0;
    }

    public final boolean VgvYg0wo() {
        return MdtA4re8() != null;
    }

    public final ArrayList b2ZJblxo(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = MdtA4re8;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                m1.P7K7Inc8(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable MdtA4re82 = MdtA4re8();
        if (MdtA4re82 != null) {
            arrayList.add(0, MdtA4re82);
        }
        if (th != null && !th.equals(MdtA4re82)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, fn.ygLcUYwZ);
        return arrayList;
    }

    public final void qoPGr6Ce(Throwable th) {
        Throwable MdtA4re82 = MdtA4re8();
        if (MdtA4re82 == null) {
            b1.qoPGr6Ce.putObjectVolatile(this, VgvYg0wo, th);
            return;
        }
        if (th == MdtA4re82) {
            return;
        }
        Unsafe unsafe = b1.qoPGr6Ce;
        long j = MdtA4re8;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                m1.P7K7Inc8(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final String toString() {
        return "Finishing[cancelling=" + VgvYg0wo() + ", completing=" + P7K7Inc8() + ", rootCause=" + MdtA4re8() + ", exceptions=" + b1.qoPGr6Ce.getObjectVolatile(this, MdtA4re8) + ", list=" + this.NCTxEWno + ']';
    }

    @Override // defpackage.qm
    public final gw wxUZMvaN() {
        return this.NCTxEWno;
    }
}
