package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class jmx extends slx {
    private static final Map zzb = new ConcurrentHashMap();
    protected mnx zzc;
    private int zzd;

    public jmx() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = mnx.e;
    }

    public static rmx c(rmx rmxVar) {
        int size = rmxVar.size();
        return rmxVar.c(size == 0 ? 10 : size + size);
    }

    public static Object d(Method method, jmx jmxVar, Object... objArr) {
        try {
            return method.invoke(jmxVar, objArr);
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

    public static void f(Class cls, jmx jmxVar) {
        jmxVar.e();
        zzb.put(cls, jmxVar);
    }

    public static jmx l(Class cls) {
        Map map = zzb;
        jmx jmxVar = (jmx) map.get(cls);
        if (jmxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                jmxVar = (jmx) map.get(cls);
            } catch (ClassNotFoundException e) {
                b6e.o("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (jmxVar != null) {
            return jmxVar;
        }
        jmx jmxVar2 = (jmx) ((jmx) ynx.g(cls)).i(6, null);
        if (jmxVar2 != null) {
            map.put(cls, jmxVar2);
            return jmxVar2;
        }
        e7o.n();
        return null;
    }

    @Override // defpackage.slx
    public final int a(knx knxVar) {
        if (h()) {
            int e = knxVar.e(this);
            if (e >= 0) {
                return e;
            }
            xq0.q(k5r.i(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = knxVar.e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
            return e2;
        }
        xq0.q(k5r.i(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return hnx.c.a(getClass()).c(this, (jmx) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return hnx.c.a(getClass()).b(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b = hnx.c.a(getClass()).b(this);
        this.zza = b;
        return b;
    }

    public abstract Object i(int i, jmx jmxVar);

    public final int j() {
        if (h()) {
            int e = hnx.c.a(getClass()).e(this);
            if (e >= 0) {
                return e;
            }
            xq0.q(k5r.i(e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int e2 = hnx.c.a(getClass()).e(this);
        if (e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | e2;
            return e2;
        }
        xq0.q(k5r.i(e2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final imx k() {
        return (imx) i(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = dnx.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        dnx.c(this, sb, 0);
        return sb.toString();
    }
}
