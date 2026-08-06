package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0122w extends AbstractC0101a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0122w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0122w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f2378f;
    }

    public static AbstractC0122w f(Class cls) {
        AbstractC0122w abstractC0122w = defaultInstanceMap.get(cls);
        if (abstractC0122w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0122w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0122w == null) {
            abstractC0122w = (AbstractC0122w) ((AbstractC0122w) j0.d(cls)).e(6);
            if (abstractC0122w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0122w);
        }
        return abstractC0122w;
    }

    public static Object g(Method method, AbstractC0101a abstractC0101a, Object... objArr) {
        try {
            return method.invoke(abstractC0101a, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0122w abstractC0122w, boolean z2) {
        byte byteValue = ((Byte) abstractC0122w.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t = T.f2345c;
        t.getClass();
        boolean a2 = t.a(abstractC0122w.getClass()).a(abstractC0122w);
        if (z2) {
            abstractC0122w.e(2);
        }
        return a2;
    }

    public static void l(Class cls, AbstractC0122w abstractC0122w) {
        abstractC0122w.j();
        defaultInstanceMap.put(cls, abstractC0122w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0101a
    public final int a(W w2) {
        int f2;
        int f3;
        if (i()) {
            if (w2 == null) {
                T t = T.f2345c;
                t.getClass();
                f3 = t.a(getClass()).f(this);
            } else {
                f3 = w2.f(this);
            }
            if (f3 >= 0) {
                return f3;
            }
            throw new IllegalStateException(C1.a.f(f3, "serialized size must be non-negative, was "));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (w2 == null) {
            T t2 = T.f2345c;
            t2.getClass();
            f2 = t2.a(getClass()).f(this);
        } else {
            f2 = w2.f(this);
        }
        m(f2);
        return f2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0101a
    public final void b(C0113m c0113m) {
        T t = T.f2345c;
        t.getClass();
        W a2 = t.a(getClass());
        F f2 = c0113m.f2423a;
        if (f2 == null) {
            f2 = new F(c0113m);
        }
        a2.d(this, f2);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t = T.f2345c;
        t.getClass();
        return t.a(getClass()).i(this, (AbstractC0122w) obj);
    }

    public final int hashCode() {
        if (i()) {
            T t = T.f2345c;
            t.getClass();
            return t.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            T t2 = T.f2345c;
            t2.getClass();
            this.memoizedHashCode = t2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0122w k() {
        return (AbstractC0122w) e(4);
    }

    public final void m(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(C1.a.f(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f2324a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
