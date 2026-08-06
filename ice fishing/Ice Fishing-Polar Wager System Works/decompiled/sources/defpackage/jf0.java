package defpackage;

/* loaded from: classes.dex */
public class jf0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater AARZUJiTa;
    public static final /* synthetic */ long EXtogiMhuM;
    public static final /* synthetic */ long SH1y5HwkJhh;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater adDC3e2L = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.jf0.class, java.lang.Object.class, "_next$volatile");
    public static final /* synthetic */ long riuEU0zW4;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater xiZrDbcSW0;
    private volatile /* synthetic */ java.lang.Object _next$volatile = this;
    private volatile /* synthetic */ java.lang.Object _prev$volatile = this;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        EXtogiMhuM = unsafe.objectFieldOffset(defpackage.jf0.class.getDeclaredField("_next$volatile"));
        xiZrDbcSW0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.jf0.class, java.lang.Object.class, "_prev$volatile");
        riuEU0zW4 = unsafe.objectFieldOffset(defpackage.jf0.class.getDeclaredField("_prev$volatile"));
        AARZUJiTa = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.jf0.class, java.lang.Object.class, "_removedRef$volatile");
        SH1y5HwkJhh = unsafe.objectFieldOffset(defpackage.jf0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static defpackage.jf0 riuEU0zW4(defpackage.jf0 jf0Var) {
        while (jf0Var.SyNS6RMn()) {
            xiZrDbcSW0.getClass();
            jf0Var = (defpackage.jf0) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(jf0Var, riuEU0zW4);
        }
        return jf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AARZUJiTa(defpackage.kp0 kp0Var) {
        xiZrDbcSW0.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        unsafe.putObjectVolatile(kp0Var, riuEU0zW4, this);
        adDC3e2L.getClass();
        long j = EXtogiMhuM;
        unsafe.putObjectVolatile(kp0Var, j, this);
        while (this.ez2rX8ReCYw() == this) {
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                defpackage.jf0 jf0Var = this;
                defpackage.kp0 kp0Var2 = kp0Var;
                if (unsafe2.compareAndSwapObject(jf0Var, EXtogiMhuM, this, kp0Var2)) {
                    kp0Var2.SH1y5HwkJhh(jf0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(jf0Var, j) != jf0Var) {
                        break;
                    }
                    this = jf0Var;
                    kp0Var = kp0Var2;
                }
            }
        }
    }

    public final defpackage.jf0 DFo87pBq1E5() {
        defpackage.jf0 EXtogiMhuM2 = EXtogiMhuM();
        if (EXtogiMhuM2 != null) {
            return EXtogiMhuM2;
        }
        xiZrDbcSW0.getClass();
        return riuEU0zW4((defpackage.jf0) defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, riuEU0zW4));
    }

    public final defpackage.jf0 EXtogiMhuM() {
        defpackage.jf0 jf0Var;
        defpackage.jf0 jf0Var2;
        sun.misc.Unsafe unsafe;
        loop0: while (true) {
            xiZrDbcSW0.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            long j = riuEU0zW4;
            defpackage.jf0 jf0Var3 = (defpackage.jf0) unsafe2.getObjectVolatile(this, j);
            defpackage.jf0 jf0Var4 = null;
            jf0Var = jf0Var3;
            while (true) {
                adDC3e2L.getClass();
                if (jf0Var == null) {
                    defpackage.db.kd6TUFXn();
                    return null;
                }
                sun.misc.Unsafe unsafe3 = defpackage.cb.IHQe1A4L2xu;
                long j2 = EXtogiMhuM;
                java.lang.Object objectVolatile = unsafe3.getObjectVolatile(jf0Var, j2);
                if (objectVolatile != this) {
                    defpackage.jf0 jf0Var5 = jf0Var3;
                    jf0Var2 = this;
                    if (jf0Var2.SyNS6RMn()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof defpackage.a11)) {
                        objectVolatile.getClass();
                        jf0Var4 = jf0Var;
                        jf0Var = (defpackage.jf0) objectVolatile;
                    } else if (jf0Var4 != null) {
                        defpackage.jf0 jf0Var6 = ((defpackage.a11) objectVolatile).IHQe1A4L2xu;
                        do {
                            defpackage.jf0 jf0Var7 = jf0Var;
                            unsafe = defpackage.cb.IHQe1A4L2xu;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(jf0Var4, EXtogiMhuM, jf0Var7, jf0Var6);
                            jf0Var = jf0Var7;
                            if (compareAndSwapObject) {
                                this = jf0Var2;
                                jf0Var = jf0Var4;
                                jf0Var3 = jf0Var5;
                                jf0Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(jf0Var4, j2) == jf0Var);
                    } else {
                        if (jf0Var == null) {
                            defpackage.db.kd6TUFXn();
                            return null;
                        }
                        jf0Var = (defpackage.jf0) unsafe3.getObjectVolatile(jf0Var, j);
                    }
                    this = jf0Var2;
                    jf0Var3 = jf0Var5;
                } else {
                    if (jf0Var3 == jf0Var) {
                        break;
                    }
                    while (true) {
                        sun.misc.Unsafe unsafe4 = defpackage.cb.IHQe1A4L2xu;
                        defpackage.jf0 jf0Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(jf0Var8, riuEU0zW4, jf0Var3, jf0Var);
                        defpackage.jf0 jf0Var9 = jf0Var3;
                        jf0Var2 = jf0Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(jf0Var2, j) != jf0Var9) {
                            break;
                        }
                        this = jf0Var2;
                        jf0Var3 = jf0Var9;
                    }
                }
            }
            this = jf0Var2;
        }
        return jf0Var;
    }

    public final defpackage.jf0 JlrlGoKF() {
        java.lang.Object ez2rX8ReCYw = ez2rX8ReCYw();
        defpackage.a11 a11Var = ez2rX8ReCYw instanceof defpackage.a11 ? (defpackage.a11) ez2rX8ReCYw : null;
        if (a11Var != null) {
            return a11Var.IHQe1A4L2xu;
        }
        ez2rX8ReCYw.getClass();
        return (defpackage.jf0) ez2rX8ReCYw;
    }

    public final defpackage.a11 QoRHpC4k() {
        AARZUJiTa.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        long j = SH1y5HwkJhh;
        defpackage.a11 a11Var = (defpackage.a11) unsafe.getObjectVolatile(this, j);
        if (a11Var != null) {
            return a11Var;
        }
        defpackage.a11 a11Var2 = new defpackage.a11(this);
        unsafe.putObjectVolatile(this, j, a11Var2);
        return a11Var2;
    }

    public final void SH1y5HwkJhh(defpackage.jf0 jf0Var) {
        defpackage.jf0 jf0Var2;
        while (true) {
            xiZrDbcSW0.getClass();
            if (jf0Var == null) {
                defpackage.db.kd6TUFXn();
                return;
            }
            sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
            long j = riuEU0zW4;
            defpackage.jf0 jf0Var3 = (defpackage.jf0) unsafe.getObjectVolatile(jf0Var, j);
            if (this.ez2rX8ReCYw() != jf0Var) {
                return;
            }
            while (jf0Var != null) {
                sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
                jf0Var2 = this;
                defpackage.jf0 jf0Var4 = jf0Var;
                if (unsafe2.compareAndSwapObject(jf0Var4, riuEU0zW4, jf0Var3, jf0Var2)) {
                    if (jf0Var2.SyNS6RMn()) {
                        jf0Var4.EXtogiMhuM();
                        return;
                    }
                    return;
                } else {
                    if (jf0Var4 == null) {
                        defpackage.db.kd6TUFXn();
                        return;
                    }
                    jf0Var = jf0Var4;
                    if (unsafe2.getObjectVolatile(jf0Var4, j) != jf0Var3) {
                        break;
                    } else {
                        this = jf0Var2;
                    }
                }
            }
            defpackage.db.kd6TUFXn();
            return;
            this = jf0Var2;
        }
    }

    public boolean SyNS6RMn() {
        return ez2rX8ReCYw() instanceof defpackage.a11;
    }

    public final boolean adDC3e2L(defpackage.jf0 jf0Var, int i) {
        defpackage.jf0 DFo87pBq1E5;
        do {
            DFo87pBq1E5 = DFo87pBq1E5();
            if (DFo87pBq1E5 instanceof defpackage.ue0) {
                return (((defpackage.ue0) DFo87pBq1E5).ez2rX8ReCYw & i) == 0 && DFo87pBq1E5.adDC3e2L(jf0Var, i);
            }
        } while (!DFo87pBq1E5.xiZrDbcSW0(jf0Var, this));
        return true;
    }

    public final defpackage.jf0 cnag84Bm() {
        defpackage.jf0 jf0Var;
        while (true) {
            java.lang.Object ez2rX8ReCYw = this.ez2rX8ReCYw();
            if (ez2rX8ReCYw instanceof defpackage.a11) {
                return ((defpackage.a11) ez2rX8ReCYw).IHQe1A4L2xu;
            }
            if (ez2rX8ReCYw == this) {
                return (defpackage.jf0) ez2rX8ReCYw;
            }
            ez2rX8ReCYw.getClass();
            defpackage.jf0 jf0Var2 = (defpackage.jf0) ez2rX8ReCYw;
            defpackage.a11 QoRHpC4k = jf0Var2.QoRHpC4k();
            while (true) {
                adDC3e2L.getClass();
                sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
                long j = EXtogiMhuM;
                jf0Var = this;
                if (unsafe.compareAndSwapObject(jf0Var, j, ez2rX8ReCYw, QoRHpC4k)) {
                    jf0Var2.EXtogiMhuM();
                    return null;
                }
                if (unsafe.getObjectVolatile(jf0Var, j) != ez2rX8ReCYw) {
                    break;
                }
                this = jf0Var;
            }
            this = jf0Var;
        }
    }

    public final java.lang.Object ez2rX8ReCYw() {
        adDC3e2L.getClass();
        return defpackage.cb.IHQe1A4L2xu.getObjectVolatile(this, EXtogiMhuM);
    }

    public java.lang.String toString() {
        return new defpackage.pc0(1, 1, defpackage.fm.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + defpackage.fm.UsuH8pd5P(this);
    }

    public final boolean xiZrDbcSW0(defpackage.jf0 jf0Var, defpackage.jf0 jf0Var2) {
        xiZrDbcSW0.getClass();
        sun.misc.Unsafe unsafe = defpackage.cb.IHQe1A4L2xu;
        unsafe.putObjectVolatile(jf0Var, riuEU0zW4, this);
        adDC3e2L.getClass();
        long j = EXtogiMhuM;
        unsafe.putObjectVolatile(jf0Var, j, jf0Var2);
        while (true) {
            sun.misc.Unsafe unsafe2 = defpackage.cb.IHQe1A4L2xu;
            defpackage.jf0 jf0Var3 = this;
            defpackage.jf0 jf0Var4 = jf0Var;
            defpackage.jf0 jf0Var5 = jf0Var2;
            if (unsafe2.compareAndSwapObject(jf0Var3, EXtogiMhuM, jf0Var5, jf0Var4)) {
                jf0Var4.SH1y5HwkJhh(jf0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(jf0Var3, j) != jf0Var5) {
                return false;
            }
            this = jf0Var3;
            jf0Var2 = jf0Var5;
            jf0Var = jf0Var4;
        }
    }
}
