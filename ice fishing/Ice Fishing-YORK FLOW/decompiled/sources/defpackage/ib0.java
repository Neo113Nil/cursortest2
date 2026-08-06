package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ib0 implements defpackage.s60 {
    public static final /* synthetic */ long GE9mJIPrb8gP;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater P05cfTpS5W5L;
    public static final /* synthetic */ long e6mdH7fiFuta;
    public final defpackage.ur0 WDYagTQQm9ns;
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.ib0.class, "_isCompleting$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater QiMR8OkAhezm = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.ib0.class, java.lang.Object.class, "_rootCause$volatile");

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        GE9mJIPrb8gP = unsafe.objectFieldOffset(defpackage.ib0.class.getDeclaredField("_rootCause$volatile"));
        P05cfTpS5W5L = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.ib0.class, java.lang.Object.class, "_exceptionsHolder$volatile");
        e6mdH7fiFuta = unsafe.objectFieldOffset(defpackage.ib0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public ib0(defpackage.ur0 ur0Var, java.lang.Throwable th) {
        this.WDYagTQQm9ns = ur0Var;
        this._rootCause$volatile = th;
    }

    @Override // defpackage.s60
    public final defpackage.ur0 JhCgjQRTAOCT() {
        return this.WDYagTQQm9ns;
    }

    public final void P05cfTpS5W5L(java.lang.Object obj) {
        P05cfTpS5W5L.getClass();
        defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, e6mdH7fiFuta, obj);
    }

    public final java.util.ArrayList QiMR8OkAhezm(java.lang.Throwable th) {
        java.util.ArrayList arrayList;
        java.lang.Object fWTAfUmVKrZq = fWTAfUmVKrZq();
        if (fWTAfUmVKrZq == null) {
            arrayList = new java.util.ArrayList(4);
        } else if (fWTAfUmVKrZq instanceof java.lang.Throwable) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            arrayList2.add(fWTAfUmVKrZq);
            arrayList = arrayList2;
        } else {
            if (!(fWTAfUmVKrZq instanceof java.util.ArrayList)) {
                defpackage.h7.QiMR8OkAhezm(fWTAfUmVKrZq, "State is ");
                return null;
            }
            arrayList = (java.util.ArrayList) fWTAfUmVKrZq;
        }
        java.lang.Throwable WDYagTQQm9ns = WDYagTQQm9ns();
        if (WDYagTQQm9ns != null) {
            arrayList.add(0, WDYagTQQm9ns);
        }
        if (th != null && !th.equals(WDYagTQQm9ns)) {
            arrayList.add(th);
        }
        P05cfTpS5W5L(defpackage.jr0.QiMR8OkAhezm);
        return arrayList;
    }

    public final java.lang.Throwable WDYagTQQm9ns() {
        QiMR8OkAhezm.getClass();
        return (java.lang.Throwable) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, GE9mJIPrb8gP);
    }

    public final void ZpBGe2uQfcn8(java.lang.Throwable th) {
        java.lang.Throwable WDYagTQQm9ns = WDYagTQQm9ns();
        if (WDYagTQQm9ns == null) {
            e6mdH7fiFuta(th);
            return;
        }
        if (th == WDYagTQQm9ns) {
            return;
        }
        java.lang.Object fWTAfUmVKrZq = fWTAfUmVKrZq();
        if (fWTAfUmVKrZq == null) {
            P05cfTpS5W5L(th);
            return;
        }
        if (!(fWTAfUmVKrZq instanceof java.lang.Throwable)) {
            if (fWTAfUmVKrZq instanceof java.util.ArrayList) {
                ((java.util.ArrayList) fWTAfUmVKrZq).add(th);
                return;
            } else {
                defpackage.h7.QiMR8OkAhezm(fWTAfUmVKrZq, "State is ");
                return;
            }
        }
        if (th == fWTAfUmVKrZq) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(fWTAfUmVKrZq);
        arrayList.add(th);
        P05cfTpS5W5L(arrayList);
    }

    public final void e6mdH7fiFuta(java.lang.Throwable th) {
        QiMR8OkAhezm.getClass();
        defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, GE9mJIPrb8gP, th);
    }

    public final java.lang.Object fWTAfUmVKrZq() {
        P05cfTpS5W5L.getClass();
        return defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, e6mdH7fiFuta);
    }

    @Override // defpackage.s60
    public final boolean giKS3J6vZuNy() {
        return WDYagTQQm9ns() == null;
    }

    public final boolean oh71FJcDz6S2() {
        return WDYagTQQm9ns() != null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Finishing[cancelling=");
        sb.append(oh71FJcDz6S2());
        sb.append(", completing=");
        sb.append(oh71FJcDz6S2.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(WDYagTQQm9ns());
        sb.append(", exceptions=");
        sb.append(fWTAfUmVKrZq());
        sb.append(", list=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(']');
        return sb.toString();
    }
}
