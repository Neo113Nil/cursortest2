package defpackage;

/* loaded from: classes.dex */
public abstract class e20 extends defpackage.QQUzIjv3iOC5 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, defpackage.e20> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected defpackage.pk1 unknownFields;

    public e20() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = defpackage.pk1.xiZrDbcSW0;
    }

    public static defpackage.e20 F7NU4MC0GW(java.lang.Class cls) {
        defpackage.e20 e20Var = defaultInstanceMap.get(cls);
        if (e20Var == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                e20Var = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (e20Var != null) {
            return e20Var;
        }
        defpackage.e20 e20Var2 = (defpackage.e20) ((defpackage.e20) defpackage.al1.F7NU4MC0GW(cls)).r1MBDhnF(6);
        if (e20Var2 == null) {
            throw new java.lang.IllegalStateException();
        }
        defaultInstanceMap.put(cls, e20Var2);
        return e20Var2;
    }

    public static void SH1y5HwkJhh(java.lang.Class cls, defpackage.e20 e20Var) {
        e20Var.EXtogiMhuM();
        defaultInstanceMap.put(cls, e20Var);
    }

    public static java.lang.Object adDC3e2L(java.lang.reflect.Method method, defpackage.e20 e20Var, java.lang.Object... objArr) {
        try {
            return method.invoke(e20Var, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean xiZrDbcSW0(defpackage.e20 e20Var, boolean z) {
        byte byteValue = ((java.lang.Byte) e20Var.r1MBDhnF(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        jy0Var.getClass();
        boolean adDC3e2L = jy0Var.IHQe1A4L2xu(e20Var.getClass()).adDC3e2L(e20Var);
        if (z) {
            e20Var.r1MBDhnF(2);
        }
        return adDC3e2L;
    }

    public final boolean AARZUJiTa() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void EXtogiMhuM() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // defpackage.QQUzIjv3iOC5
    public final int IHQe1A4L2xu(defpackage.c51 c51Var) {
        int F7NU4MC0GW;
        int F7NU4MC0GW2;
        if (AARZUJiTa()) {
            if (c51Var == null) {
                defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
                jy0Var.getClass();
                F7NU4MC0GW2 = jy0Var.IHQe1A4L2xu(getClass()).F7NU4MC0GW(this);
            } else {
                F7NU4MC0GW2 = c51Var.F7NU4MC0GW(this);
            }
            if (F7NU4MC0GW2 >= 0) {
                return F7NU4MC0GW2;
            }
            defpackage.db.AARZUJiTa(defpackage.fx0.SH1y5HwkJhh("serialized size must be non-negative, was ", F7NU4MC0GW2));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (c51Var == null) {
            defpackage.jy0 jy0Var2 = defpackage.jy0.r1MBDhnF;
            jy0Var2.getClass();
            F7NU4MC0GW = jy0Var2.IHQe1A4L2xu(getClass()).F7NU4MC0GW(this);
        } else {
            F7NU4MC0GW = c51Var.F7NU4MC0GW(this);
        }
        ez2rX8ReCYw(F7NU4MC0GW);
        return F7NU4MC0GW;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        jy0Var.getClass();
        return jy0Var.IHQe1A4L2xu(getClass()).AARZUJiTa(this, (defpackage.e20) obj);
    }

    public final void ez2rX8ReCYw(int i) {
        if (i < 0) {
            defpackage.db.AARZUJiTa(defpackage.fx0.SH1y5HwkJhh("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final int hashCode() {
        if (AARZUJiTa()) {
            defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
            jy0Var.getClass();
            return jy0Var.IHQe1A4L2xu(getClass()).IHQe1A4L2xu(this);
        }
        if (this.memoizedHashCode == 0) {
            defpackage.jy0 jy0Var2 = defpackage.jy0.r1MBDhnF;
            jy0Var2.getClass();
            this.memoizedHashCode = jy0Var2.IHQe1A4L2xu(getClass()).IHQe1A4L2xu(this);
        }
        return this.memoizedHashCode;
    }

    @Override // defpackage.QQUzIjv3iOC5
    public final void oh6vYeIP(defpackage.rd rdVar) {
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        jy0Var.getClass();
        defpackage.c51 IHQe1A4L2xu = jy0Var.IHQe1A4L2xu(getClass());
        defpackage.c1NqjJifC7 c1nqjjifc7 = rdVar.IHQe1A4L2xu;
        if (c1nqjjifc7 == null) {
            c1nqjjifc7 = new defpackage.c1NqjJifC7(rdVar);
        }
        IHQe1A4L2xu.xiZrDbcSW0(this, c1nqjjifc7);
    }

    public abstract java.lang.Object r1MBDhnF(int i);

    public final defpackage.e20 riuEU0zW4() {
        return (defpackage.e20) r1MBDhnF(4);
    }

    public final java.lang.String toString() {
        java.lang.String obj = super.toString();
        char[] cArr = defpackage.zi0.IHQe1A4L2xu;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(obj);
        defpackage.zi0.r1MBDhnF(this, sb, 0);
        return sb.toString();
    }
}
