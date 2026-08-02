package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class mcx extends lax {
    private static final Map zzb = new ConcurrentHashMap();
    protected sex zzc;
    private int zzd;

    public mcx() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = sex.f;
    }

    public static mcx h(Class cls) {
        Map map = zzb;
        mcx mcxVar = (mcx) map.get(cls);
        if (mcxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                mcxVar = (mcx) map.get(cls);
            } catch (ClassNotFoundException e) {
                b6e.o("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (mcxVar != null) {
            return mcxVar;
        }
        mcx mcxVar2 = (mcx) ((mcx) xex.g(cls)).d(6);
        if (mcxVar2 != null) {
            map.put(cls, mcxVar2);
            return mcxVar2;
        }
        e7o.n();
        return null;
    }

    public static Object i(Method method, mcx mcxVar, Object... objArr) {
        try {
            return method.invoke(mcxVar, objArr);
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

    public static void k(Class cls, mcx mcxVar) {
        mcxVar.j();
        zzb.put(cls, mcxVar);
    }

    public static final boolean m(mcx mcxVar, boolean z) {
        byte byteValue = ((Byte) mcxVar.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = fex.c.a(mcxVar.getClass()).f(mcxVar);
        if (z) {
            mcxVar.d(2);
        }
        return f;
    }

    @Override // defpackage.lax
    public final int a(iex iexVar) {
        if (c()) {
            int h = iexVar.h(this);
            if (h >= 0) {
                return h;
            }
            xq0.q(k5r.i(h, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int h2 = iexVar.h(this);
        if (h2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | h2;
            return h2;
        }
        xq0.q(k5r.i(h2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object d(int i);

    public final int e() {
        if (c()) {
            int h = fex.c.a(getClass()).h(this);
            if (h >= 0) {
                return h;
            }
            xq0.q(k5r.i(h, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int h2 = fex.c.a(getClass()).h(this);
        if (h2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | h2;
            return h2;
        }
        xq0.q(k5r.i(h2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return fex.c.a(getClass()).d(this, (mcx) obj);
    }

    public final ecx f() {
        return (ecx) d(5);
    }

    public final ecx g() {
        ecx ecxVar = (ecx) d(5);
        if (!ecxVar.a.equals(this)) {
            if (!ecxVar.b.c()) {
                mcx mcxVar = (mcx) ecxVar.a.d(4);
                fex.c.a(mcxVar.getClass()).c(mcxVar, ecxVar.b);
                ecxVar.b = mcxVar;
            }
            mcx mcxVar2 = ecxVar.b;
            fex.c.a(mcxVar2.getClass()).c(mcxVar2, this);
        }
        return ecxVar;
    }

    public final int hashCode() {
        if (c()) {
            return fex.c.a(getClass()).e(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int e = fex.c.a(getClass()).e(this);
        this.zza = e;
        return e;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = aex.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        aex.c(this, sb, 0);
        return sb.toString();
    }
}
