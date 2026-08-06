package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l40 implements p00 {
    public static final /* synthetic */ long JFJ3QoxA;
    public static final /* synthetic */ AtomicReferenceFieldUpdater encWxUiV2;
    public static final /* synthetic */ long mOu10nynGul;
    public final dk0 OOA6hdeuvCS;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater EljAMC1QTz = AtomicIntegerFieldUpdater.newUpdater(l40.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater AvO7iQsrTN = AtomicReferenceFieldUpdater.newUpdater(l40.class, Object.class, "_rootCause$volatile");

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        JFJ3QoxA = unsafe.objectFieldOffset(l40.class.getDeclaredField("_rootCause$volatile"));
        encWxUiV2 = AtomicReferenceFieldUpdater.newUpdater(l40.class, Object.class, "_exceptionsHolder$volatile");
        mOu10nynGul = unsafe.objectFieldOffset(l40.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public l40(dk0 dk0Var, Throwable th) {
        this.OOA6hdeuvCS = dk0Var;
        this._rootCause$volatile = th;
    }

    public final ArrayList AvO7iQsrTN(Throwable th) {
        ArrayList arrayList;
        Object X1lG3V04pd = X1lG3V04pd();
        if (X1lG3V04pd == null) {
            arrayList = new ArrayList(4);
        } else if (X1lG3V04pd instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(X1lG3V04pd);
            arrayList = arrayList2;
        } else {
            if (!(X1lG3V04pd instanceof ArrayList)) {
                o4.EljAMC1QTz(X1lG3V04pd, "State is ");
                return null;
            }
            arrayList = (ArrayList) X1lG3V04pd;
        }
        Throwable OOA6hdeuvCS = OOA6hdeuvCS();
        if (OOA6hdeuvCS != null) {
            arrayList.add(0, OOA6hdeuvCS);
        }
        if (th != null && !th.equals(OOA6hdeuvCS)) {
            arrayList.add(th);
        }
        encWxUiV2(p.mOu10nynGul);
        return arrayList;
    }

    public final boolean EljAMC1QTz() {
        return OOA6hdeuvCS() != null;
    }

    public final void GWasM1elztuh(Throwable th) {
        Throwable OOA6hdeuvCS = OOA6hdeuvCS();
        if (OOA6hdeuvCS == null) {
            mOu10nynGul(th);
            return;
        }
        if (th == OOA6hdeuvCS) {
            return;
        }
        Object X1lG3V04pd = X1lG3V04pd();
        if (X1lG3V04pd == null) {
            encWxUiV2(th);
            return;
        }
        if (!(X1lG3V04pd instanceof Throwable)) {
            if (X1lG3V04pd instanceof ArrayList) {
                ((ArrayList) X1lG3V04pd).add(th);
                return;
            } else {
                o4.EljAMC1QTz(X1lG3V04pd, "State is ");
                return;
            }
        }
        if (th == X1lG3V04pd) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(X1lG3V04pd);
        arrayList.add(th);
        encWxUiV2(arrayList);
    }

    public final Throwable OOA6hdeuvCS() {
        AvO7iQsrTN.getClass();
        return (Throwable) o9.GWasM1elztuh.getObjectVolatile(this, JFJ3QoxA);
    }

    public final Object X1lG3V04pd() {
        encWxUiV2.getClass();
        return o9.GWasM1elztuh.getObjectVolatile(this, mOu10nynGul);
    }

    @Override // defpackage.p00
    public final boolean Yi7zF1RB1() {
        return OOA6hdeuvCS() == null;
    }

    public final void encWxUiV2(Object obj) {
        encWxUiV2.getClass();
        o9.GWasM1elztuh.putObjectVolatile(this, mOu10nynGul, obj);
    }

    public final void mOu10nynGul(Throwable th) {
        AvO7iQsrTN.getClass();
        o9.GWasM1elztuh.putObjectVolatile(this, JFJ3QoxA, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(EljAMC1QTz());
        sb.append(", completing=");
        sb.append(EljAMC1QTz.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(OOA6hdeuvCS());
        sb.append(", exceptions=");
        sb.append(X1lG3V04pd());
        sb.append(", list=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.p00
    public final dk0 xqGvceK5x() {
        return this.OOA6hdeuvCS;
    }
}
