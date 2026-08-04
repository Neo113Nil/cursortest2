package com.gamericefishpro.space.i9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g5 extends p4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected o6 zzc;

    public g5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = o6.f;
    }

    public static g5 l(Class cls) {
        Map map = zzd;
        g5 g5Var = (g5) map.get(cls);
        if (g5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g5Var = (g5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (g5Var != null) {
            return g5Var;
        }
        g5 g5Var2 = (g5) ((g5) t6.e(cls)).o(6);
        if (g5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, g5Var2);
        return g5Var2;
    }

    public static void m(Class cls, g5 g5Var) {
        g5Var.f();
        zzd.put(cls, g5Var);
    }

    public static Object n(Method method, g5 g5Var, Object... objArr) {
        try {
            return method.invoke(g5Var, objArr);
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

    @Override // com.gamericefishpro.space.i9.p4
    public final int b(i6 i6Var) {
        if (e()) {
            int iH = i6Var.h(this);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iH).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iH);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iH2 = i6Var.h(this);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iH2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iH2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void d(x4 x4Var) {
        i6 i6VarA = f6.c.a(getClass());
        v5 v5Var = x4Var.g;
        if (v5Var == null) {
            v5Var = new v5(x4Var);
        }
        i6VarA.e(this, v5Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return f6.c.a(getClass()).c(this, (g5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        f6.c.a(getClass()).b(this);
        f();
    }

    public final f5 h() {
        return (f5) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return f6.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iG = f6.c.a(getClass()).g(this);
        this.zza = iG;
        return iG;
    }

    public final f5 i() {
        f5 f5Var = (f5) o(5);
        f5Var.f(this);
        return f5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iH = f6.c.a(getClass()).h(this);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iH).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iH);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iH2 = f6.c.a(getClass()).h(this);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iH2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iH2);
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Object o(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = a6.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        a6.b(this, sb, 0);
        return sb.toString();
    }
}
