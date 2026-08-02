package com.google.android.gms.internal.consent_sdk;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.consent_sdk.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4355o2 extends AbstractC4307c2 {
    private static final Map zzb = new ConcurrentHashMap();
    protected N2 zzc;
    private int zzd;

    public AbstractC4355o2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = N2.f35578e;
    }

    public static AbstractC4355o2 h(Class cls) {
        Map map = zzb;
        AbstractC4355o2 abstractC4355o2 = (AbstractC4355o2) map.get(cls);
        if (abstractC4355o2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4355o2 = (AbstractC4355o2) map.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (abstractC4355o2 != null) {
            return abstractC4355o2;
        }
        AbstractC4355o2 abstractC4355o22 = (AbstractC4355o2) ((AbstractC4355o2) T2.f(cls)).f(6);
        if (abstractC4355o22 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC4355o22);
        return abstractC4355o22;
    }

    public static Object i(Method method, AbstractC4307c2 abstractC4307c2, Object... objArr) {
        try {
            return method.invoke(abstractC4307c2, objArr);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void l(Class cls, AbstractC4355o2 abstractC4355o2) {
        abstractC4355o2.k();
        zzb.put(cls, abstractC4355o2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4307c2
    public final void a(C4331i2 c4331i2) {
        I2 a9 = F2.f35514c.a(getClass());
        C4386w2 c4386w2 = c4331i2.f35688b;
        if (c4386w2 == null) {
            c4386w2 = new C4386w2(c4331i2);
        }
        a9.d(this, c4386w2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4307c2
    public final int b(I2 i22) {
        if (e()) {
            int f3 = i22.f(this);
            if (f3 >= 0) {
                return f3;
            }
            throw new IllegalStateException(AbstractC4404f.e(f3, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f9 = i22.f(this);
        if (f9 < 0) {
            throw new IllegalStateException(AbstractC4404f.e(f9, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f9;
        return f9;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4307c2
    public final int c() {
        if (e()) {
            int f3 = F2.f35514c.a(getClass()).f(this);
            if (f3 >= 0) {
                return f3;
            }
            throw new IllegalStateException(AbstractC4404f.e(f3, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f9 = F2.f35514c.a(getClass()).f(this);
        if (f9 < 0) {
            throw new IllegalStateException(AbstractC4404f.e(f9, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f9;
        return f9;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return F2.f35514c.a(getClass()).c(this, (AbstractC4355o2) obj);
    }

    public abstract Object f(int i);

    public final AbstractC4351n2 g() {
        return (AbstractC4351n2) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return F2.f35514c.a(getClass()).b(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b9 = F2.f35514c.a(getClass()).b(this);
        this.zza = b9;
        return b9;
    }

    public final void j() {
        F2.f35514c.a(getClass()).a(this);
        k();
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = B2.f35491a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        B2.c(this, sb, 0);
        return sb.toString();
    }
}
