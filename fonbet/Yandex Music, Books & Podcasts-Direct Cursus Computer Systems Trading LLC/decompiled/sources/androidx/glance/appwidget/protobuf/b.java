package androidx.glance.appwidget.protobuf;

import defpackage.b6e;
import defpackage.e7o;
import defpackage.emt;
import defpackage.k5r;
import defpackage.kac;
import defpackage.mkt;
import defpackage.xq0;
import defpackage.xto;
import defpackage.zym;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, b> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected mkt unknownFields;

    public b() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = mkt.f;
    }

    public static b c(Class cls) {
        b bVar = defaultInstanceMap.get(cls);
        if (bVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                b6e.o("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = (b) ((b) emt.d(cls)).b(6);
        if (bVar2 != null) {
            defaultInstanceMap.put(cls, bVar2);
            return bVar2;
        }
        e7o.n();
        return null;
    }

    public static Object d(Method method, b bVar, Object... objArr) {
        try {
            return method.invoke(bVar, objArr);
        } catch (IllegalAccessException e) {
            kac.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            kac.k("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean e(b bVar, boolean z) {
        byte byteValue = ((Byte) bVar.b(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        zym zymVar = zym.c;
        zymVar.getClass();
        boolean b = zymVar.a(bVar.getClass()).b(bVar);
        if (z) {
            bVar.b(2);
        }
        return b;
    }

    public static void i(Class cls, b bVar) {
        bVar.g();
        defaultInstanceMap.put(cls, bVar);
    }

    @Override // androidx.glance.appwidget.protobuf.a
    public final int a(xto xtoVar) {
        int g;
        int g2;
        if (f()) {
            if (xtoVar == null) {
                zym zymVar = zym.c;
                zymVar.getClass();
                g2 = zymVar.a(getClass()).g(this);
            } else {
                g2 = xtoVar.g(this);
            }
            if (g2 >= 0) {
                return g2;
            }
            xq0.q(k5r.i(g2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (xtoVar == null) {
            zym zymVar2 = zym.c;
            zymVar2.getClass();
            g = zymVar2.a(getClass()).g(this);
        } else {
            g = xtoVar.g(this);
        }
        j(g);
        return g;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zym zymVar = zym.c;
        zymVar.getClass();
        return zymVar.a(getClass()).i(this, (b) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final b h() {
        return (b) b(4);
    }

    public final int hashCode() {
        if (f()) {
            zym zymVar = zym.c;
            zymVar.getClass();
            return zymVar.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            zym zymVar2 = zym.c;
            zymVar2.getClass();
            this.memoizedHashCode = zymVar2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(int i) {
        if (i < 0) {
            xq0.q(k5r.i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = c.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        c.c(this, sb, 0);
        return sb.toString();
    }
}
