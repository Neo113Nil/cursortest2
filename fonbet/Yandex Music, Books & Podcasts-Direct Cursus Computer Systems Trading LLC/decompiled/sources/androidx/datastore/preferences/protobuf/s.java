package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s.a;
import androidx.datastore.preferences.protobuf.u;
import defpackage.a1c;
import defpackage.b6e;
import defpackage.e7o;
import defpackage.kac;
import defpackage.mmm;
import defpackage.rit;
import defpackage.tlm;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class s<MessageType extends s<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, s<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected y0 unknownFields;

    public static abstract class a<MessageType extends s<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0000a<MessageType, BuilderType> {
        public final s a;
        public s b;
        public boolean c = false;

        public a(s sVar) {
            this.a = sVar;
            this.b = (s) sVar.d(c.d);
        }

        public static void e(s sVar, s sVar2) {
            n0 n0Var = n0.c;
            n0Var.getClass();
            n0Var.a(sVar.getClass()).f(sVar, sVar2);
        }

        public final s b() {
            s c = c();
            if (c.i()) {
                return c;
            }
            throw new rit();
        }

        public final s c() {
            boolean z = this.c;
            s sVar = this.b;
            if (z) {
                return sVar;
            }
            sVar.getClass();
            n0 n0Var = n0.c;
            n0Var.getClass();
            n0Var.a(sVar.getClass()).a(sVar);
            this.c = true;
            return this.b;
        }

        public final Object clone() {
            a aVar = (a) this.a.d(c.e);
            s c = c();
            aVar.d();
            e(aVar.b, c);
            return aVar;
        }

        public final void d() {
            if (this.c) {
                s sVar = (s) this.b.d(c.d);
                e(sVar, this.b);
                this.b = sVar;
                this.c = false;
            }
        }
    }

    public static class b<T extends s<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final /* synthetic */ c[] g;

        static {
            c cVar = new c("GET_MEMOIZED_IS_INITIALIZED", 0);
            a = cVar;
            c cVar2 = new c("SET_MEMOIZED_IS_INITIALIZED", 1);
            b = cVar2;
            c cVar3 = new c("BUILD_MESSAGE_INFO", 2);
            c = cVar3;
            c cVar4 = new c("NEW_MUTABLE_INSTANCE", 3);
            d = cVar4;
            c cVar5 = new c("NEW_BUILDER", 4);
            e = cVar5;
            c cVar6 = new c("GET_DEFAULT_INSTANCE", 5);
            f = cVar6;
            g = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, new c("GET_PARSER", 6)};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) g.clone();
        }
    }

    public s() {
        this.memoizedHashCode = 0;
        this.unknownFields = y0.f;
        this.memoizedSerializedSize = -1;
    }

    public static u.a e() {
        return o0.d;
    }

    public static s f(Class cls) {
        s<?, ?> sVar = defaultInstanceMap.get(cls);
        if (sVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                b6e.o("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        s<?, ?> sVar2 = (s) ((s) b1.a(cls)).d(c.f);
        if (sVar2 != null) {
            defaultInstanceMap.put(cls, sVar2);
            return sVar2;
        }
        e7o.n();
        return null;
    }

    public static Object h(Method method, s sVar, Object... objArr) {
        try {
            return method.invoke(sVar, objArr);
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

    public static Object j(s sVar, String str, Object[] objArr) {
        return new p0(sVar, str, objArr);
    }

    public static s k(mmm mmmVar, FileInputStream fileInputStream) {
        h.b bVar = new h.b(fileInputStream);
        a1c a2 = a1c.a();
        s sVar = (s) mmmVar.d(c.d);
        try {
            n0 n0Var = n0.c;
            n0Var.getClass();
            r0 a3 = n0Var.a(sVar.getClass());
            i iVar = bVar.b;
            if (iVar == null) {
                iVar = new i(bVar);
            }
            a3.d(sVar, iVar, a2);
            a3.a(sVar);
            if (sVar.i()) {
                return sVar;
            }
            throw new v(new rit().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof v) {
                throw ((v) e.getCause());
            }
            throw new v(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof v) {
                throw ((v) e2.getCause());
            }
            throw e2;
        }
    }

    public static void l(Class cls, s sVar) {
        defaultInstanceMap.put(cls, sVar);
    }

    public abstract Object d(c cVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((s) d(c.f)).getClass().isInstance(obj)) {
            return false;
        }
        n0 n0Var = n0.c;
        n0Var.getClass();
        return n0Var.a(getClass()).i(this, (s) obj);
    }

    public final int g() {
        if (this.memoizedSerializedSize == -1) {
            n0 n0Var = n0.c;
            n0Var.getClass();
            this.memoizedSerializedSize = n0Var.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        n0 n0Var = n0.c;
        n0Var.getClass();
        int g = n0Var.a(getClass()).g(this);
        this.memoizedHashCode = g;
        return g;
    }

    public final boolean i() {
        byte byteValue = ((Byte) d(c.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        n0 n0Var = n0.c;
        n0Var.getClass();
        boolean b2 = n0Var.a(getClass()).b(this);
        d(c.b);
        return b2;
    }

    public final void m(j jVar) {
        n0 n0Var = n0.c;
        n0Var.getClass();
        r0 a2 = n0Var.a(getClass());
        k kVar = jVar.a;
        if (kVar == null) {
            kVar = new k(jVar);
        }
        a2.h(this, kVar);
    }

    public final String toString() {
        StringBuilder m = tlm.m("# ", super.toString());
        g0.c(this, m, 0);
        return m.toString();
    }
}
