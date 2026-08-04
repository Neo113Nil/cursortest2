package com.gamericefishpro.space.q4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, s> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected y0 unknownFields;

    public s() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = y0.f;
    }

    public static s d(Class cls) {
        s sVar = defaultInstanceMap.get(cls);
        if (sVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = (s) ((s) e1.d(cls)).c(6);
        if (sVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, sVar2);
        return sVar2;
    }

    public static Object e(Method method, s sVar, Object... objArr) {
        try {
            return method.invoke(sVar, objArr);
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

    public static final boolean f(s sVar, boolean z) {
        byte bByteValue = ((Byte) sVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        q0 q0Var = q0.c;
        q0Var.getClass();
        boolean zE = q0Var.a(sVar.getClass()).e(sVar);
        if (z) {
            sVar.c(2);
        }
        return zE;
    }

    public static void j(Class cls, s sVar) {
        sVar.h();
        defaultInstanceMap.put(cls, sVar);
    }

    @Override // com.gamericefishpro.space.q4.a
    public final int a(t0 t0Var) {
        int iD;
        int iD2;
        if (g()) {
            if (t0Var == null) {
                q0 q0Var = q0.c;
                q0Var.getClass();
                iD2 = q0Var.a(getClass()).d(this);
            } else {
                iD2 = t0Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            throw new IllegalStateException(com.gamericefishpro.space.m5.a.g(iD2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (t0Var == null) {
            q0 q0Var2 = q0.c;
            q0Var2.getClass();
            iD = q0Var2.a(getClass()).d(this);
        } else {
            iD = t0Var.d(this);
        }
        k(iD);
        return iD;
    }

    @Override // com.gamericefishpro.space.q4.a
    public final void b(i iVar) {
        q0 q0Var = q0.c;
        q0Var.getClass();
        t0 t0VarA = q0Var.a(getClass());
        c0 c0Var = iVar.c;
        if (c0Var == null) {
            c0Var = new c0(iVar);
        }
        t0VarA.i(this, c0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q0 q0Var = q0.c;
        q0Var.getClass();
        return q0Var.a(getClass()).b(this, (s) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            q0 q0Var = q0.c;
            q0Var.getClass();
            return q0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            q0 q0Var2 = q0.c;
            q0Var2.getClass();
            this.memoizedHashCode = q0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final s i() {
        return (s) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            throw new IllegalStateException(com.gamericefishpro.space.m5.a.g(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = j0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        j0.c(this, sb, 0);
        return sb.toString();
    }
}
