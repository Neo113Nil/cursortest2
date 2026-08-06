package defpackage;

/* loaded from: classes.dex */
public final class b90 implements defpackage.x40 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater EXtogiMhuM;
    public static final /* synthetic */ long SH1y5HwkJhh;
    public static final /* synthetic */ long riuEU0zW4;
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;
    public final defpackage.kp0 adDC3e2L;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater xiZrDbcSW0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.b90.class, "_isCompleting$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater AARZUJiTa = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.b90.class, java.lang.Object.class, "_rootCause$volatile");

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        SH1y5HwkJhh = unsafe.objectFieldOffset(defpackage.b90.class.getDeclaredField("_rootCause$volatile"));
        EXtogiMhuM = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.b90.class, java.lang.Object.class, "_exceptionsHolder$volatile");
        riuEU0zW4 = unsafe.objectFieldOffset(defpackage.b90.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public b90(defpackage.kp0 kp0Var, java.lang.Throwable th) {
        this.adDC3e2L = kp0Var;
        this._rootCause$volatile = th;
    }

    public final java.util.ArrayList AARZUJiTa(java.lang.Throwable th) {
        java.util.ArrayList arrayList;
        java.lang.Object r1MBDhnF = r1MBDhnF();
        if (r1MBDhnF == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (r1MBDhnF instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(r1MBDhnF);
            arrayList = arrayList2;
        } else {
            if (!(r1MBDhnF instanceof java.util.ArrayList)) {
                defpackage.db.xiZrDbcSW0(r1MBDhnF, "State is ");
                return null;
            }
            arrayList = (java.util.ArrayList) r1MBDhnF;
        }
        java.lang.Throwable adDC3e2L = adDC3e2L();
        if (adDC3e2L != null) {
            arrayList.add(0, adDC3e2L);
        }
        if (th != null && !th.equals(adDC3e2L)) {
            arrayList.add(th);
        }
        EXtogiMhuM(defpackage.gq1.riuEU0zW4);
        return arrayList;
    }

    public final void EXtogiMhuM(java.lang.Object obj) {
        EXtogiMhuM.getClass();
        defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, riuEU0zW4, obj);
    }

    @Override // defpackage.x40
    public final defpackage.kp0 F7NU4MC0GW() {
        return this.adDC3e2L;
    }

    public final void IHQe1A4L2xu(java.lang.Throwable th) {
        java.lang.Throwable adDC3e2L = adDC3e2L();
        if (adDC3e2L == null) {
            riuEU0zW4(th);
            return;
        }
        if (th == adDC3e2L) {
            return;
        }
        java.lang.Object r1MBDhnF = r1MBDhnF();
        if (r1MBDhnF == null) {
            EXtogiMhuM(th);
            return;
        }
        if (!(r1MBDhnF instanceof java.lang.Throwable)) {
            if (r1MBDhnF instanceof java.util.ArrayList) {
                ((java.util.ArrayList) r1MBDhnF).add(th);
                return;
            } else {
                defpackage.db.xiZrDbcSW0(r1MBDhnF, "State is ");
                return;
            }
        }
        if (th == r1MBDhnF) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(r1MBDhnF);
        arrayList.add(th);
        EXtogiMhuM(arrayList);
    }

    public final java.lang.Throwable adDC3e2L() {
        AARZUJiTa.getClass();
        return (java.lang.Throwable) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, SH1y5HwkJhh);
    }

    @Override // defpackage.x40
    public final boolean oh6vYeIP() {
        return adDC3e2L() == null;
    }

    public final java.lang.Object r1MBDhnF() {
        EXtogiMhuM.getClass();
        return defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, riuEU0zW4);
    }

    public final void riuEU0zW4(java.lang.Throwable th) {
        AARZUJiTa.getClass();
        defpackage.cb.IHQe1A4L2xu.putObjectVolatile(this, SH1y5HwkJhh, th);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Finishing[cancelling=");
        sb.append(xiZrDbcSW0());
        sb.append(", completing=");
        sb.append(xiZrDbcSW0.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(adDC3e2L());
        sb.append(", exceptions=");
        sb.append(r1MBDhnF());
        sb.append(", list=");
        sb.append(this.adDC3e2L);
        sb.append(']');
        return sb.toString();
    }

    public final boolean xiZrDbcSW0() {
        return adDC3e2L() != null;
    }
}
