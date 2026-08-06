package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ay extends WRKkgoJXwDn {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ay> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected lc1 unknownFields;

    public ay() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = lc1.EljAMC1QTz;
    }

    public static final boolean EljAMC1QTz(ay ayVar, boolean z) {
        byte byteValue = ((Byte) ayVar.X1lG3V04pd(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ns0 ns0Var = ns0.X1lG3V04pd;
        ns0Var.getClass();
        boolean OOA6hdeuvCS = ns0Var.GWasM1elztuh(ayVar.getClass()).OOA6hdeuvCS(ayVar);
        if (z) {
            ayVar.X1lG3V04pd(2);
        }
        return OOA6hdeuvCS;
    }

    public static void JFJ3QoxA(Class cls, ay ayVar) {
        ayVar.encWxUiV2();
        defaultInstanceMap.put(cls, ayVar);
    }

    public static Object OOA6hdeuvCS(Method method, ay ayVar, Object... objArr) {
        try {
            return method.invoke(ayVar, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static ay xqGvceK5x(Class cls) {
        ay ayVar = defaultInstanceMap.get(cls);
        if (ayVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ayVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ayVar != null) {
            return ayVar;
        }
        ay ayVar2 = (ay) ((ay) wc1.xqGvceK5x(cls)).X1lG3V04pd(6);
        if (ayVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, ayVar2);
        return ayVar2;
    }

    public final boolean AvO7iQsrTN() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    @Override // defpackage.WRKkgoJXwDn
    public final int GWasM1elztuh(nx0 nx0Var) {
        int xqGvceK5x;
        int xqGvceK5x2;
        if (AvO7iQsrTN()) {
            if (nx0Var == null) {
                ns0 ns0Var = ns0.X1lG3V04pd;
                ns0Var.getClass();
                xqGvceK5x2 = ns0Var.GWasM1elztuh(getClass()).xqGvceK5x(this);
            } else {
                xqGvceK5x2 = nx0Var.xqGvceK5x(this);
            }
            if (xqGvceK5x2 >= 0) {
                return xqGvceK5x2;
            }
            o4.jivtDDk9H(mr0.AvO7iQsrTN("serialized size must be non-negative, was ", xqGvceK5x2));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (nx0Var == null) {
            ns0 ns0Var2 = ns0.X1lG3V04pd;
            ns0Var2.getClass();
            xqGvceK5x = ns0Var2.GWasM1elztuh(getClass()).xqGvceK5x(this);
        } else {
            xqGvceK5x = nx0Var.xqGvceK5x(this);
        }
        rQPn8YBR(xqGvceK5x);
        return xqGvceK5x;
    }

    public abstract Object X1lG3V04pd(int i);

    @Override // defpackage.WRKkgoJXwDn
    public final void Yi7zF1RB1(pb pbVar) {
        ns0 ns0Var = ns0.X1lG3V04pd;
        ns0Var.getClass();
        nx0 GWasM1elztuh = ns0Var.GWasM1elztuh(getClass());
        j6IIN2O8eOU j6iin2o8eou = pbVar.GWasM1elztuh;
        if (j6iin2o8eou == null) {
            j6iin2o8eou = new j6IIN2O8eOU(pbVar);
        }
        GWasM1elztuh.EljAMC1QTz(this, j6iin2o8eou);
    }

    public final void encWxUiV2() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ns0 ns0Var = ns0.X1lG3V04pd;
        ns0Var.getClass();
        return ns0Var.GWasM1elztuh(getClass()).AvO7iQsrTN(this, (ay) obj);
    }

    public final int hashCode() {
        if (AvO7iQsrTN()) {
            ns0 ns0Var = ns0.X1lG3V04pd;
            ns0Var.getClass();
            return ns0Var.GWasM1elztuh(getClass()).GWasM1elztuh(this);
        }
        if (this.memoizedHashCode == 0) {
            ns0 ns0Var2 = ns0.X1lG3V04pd;
            ns0Var2.getClass();
            this.memoizedHashCode = ns0Var2.GWasM1elztuh(getClass()).GWasM1elztuh(this);
        }
        return this.memoizedHashCode;
    }

    public final ay mOu10nynGul() {
        return (ay) X1lG3V04pd(4);
    }

    public final void rQPn8YBR(int i) {
        if (i < 0) {
            o4.jivtDDk9H(mr0.AvO7iQsrTN("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ud0.GWasM1elztuh;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ud0.X1lG3V04pd(this, sb, 0);
        return sb.toString();
    }
}
