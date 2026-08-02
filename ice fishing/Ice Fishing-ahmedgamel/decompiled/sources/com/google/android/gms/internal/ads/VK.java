package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class VK extends AbstractC4286zK {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, VK> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected LL zzt;

    public VK() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = LL.f26906f;
    }

    public static Object j(Method method, AbstractC4286zK abstractC4286zK, Object... objArr) {
        try {
            return method.invoke(abstractC4286zK, objArr);
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

    public static C3532lL k(InterfaceC2996bL interfaceC2996bL) {
        C3532lL c3532lL = (C3532lL) interfaceC2996bL;
        int i = c3532lL.f32541v;
        return c3532lL.D(i + i);
    }

    public static VK l(VK vk, W7.b bVar, PK pk) {
        VK p9 = vk.p();
        try {
            DL a9 = C4179xL.f35771c.a(p9.getClass());
            C4265z c4265z = (C4265z) bVar.f3578v;
            if (c4265z == null) {
                c4265z = new C4265z(bVar);
            }
            a9.b(p9, c4265z, pk);
            a9.g(p9);
            return p9;
        } catch (KL e9) {
            throw new C3318hL(e9.getMessage());
        } catch (C3318hL e10) {
            if (e10.f31526n) {
                throw new C3318hL(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof C3318hL) {
                throw ((C3318hL) e11.getCause());
            }
            throw new C3318hL(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof C3318hL) {
                throw ((C3318hL) e12.getCause());
            }
            throw e12;
        }
    }

    public static VK m(VK vk, JK jk, PK pk) {
        W7.b o4 = jk.o();
        VK l9 = l(vk, o4, pk);
        o4.k(0);
        z(l9);
        return l9;
    }

    public static VK n(VK vk, byte[] bArr, PK pk) {
        VK y7 = y(vk, bArr, bArr.length, pk);
        z(y7);
        return y7;
    }

    public static VK t(Class cls) {
        Map<Class<?>, VK> map = zzd;
        VK vk = map.get(cls);
        if (vk == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vk = map.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (vk != null) {
            return vk;
        }
        VK vk2 = (VK) ((VK) PL.a(cls)).w(6, null);
        if (vk2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, vk2);
        return vk2;
    }

    public static void u(Class cls, VK vk) {
        vk.i();
        zzd.put(cls, vk);
    }

    public static final boolean x(VK vk, boolean z6) {
        byte byteValue = ((Byte) vk.w(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e9 = C4179xL.f35771c.a(vk.getClass()).e(vk);
        if (z6) {
            vk.w(2, true == e9 ? vk : null);
        }
        return e9;
    }

    public static VK y(VK vk, byte[] bArr, int i, PK pk) {
        if (i == 0) {
            return vk;
        }
        VK p9 = vk.p();
        try {
            DL a9 = C4179xL.f35771c.a(p9.getClass());
            a9.f(p9, bArr, 0, i, new CK(pk));
            a9.g(p9);
            return p9;
        } catch (KL e9) {
            throw new C3318hL(e9.getMessage());
        } catch (C3318hL e10) {
            if (e10.f31526n) {
                throw new C3318hL(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof C3318hL) {
                throw ((C3318hL) e11.getCause());
            }
            throw new C3318hL(e11.getMessage(), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void z(VK vk) {
        if (vk != null && !x(vk, true)) {
            throw new C3318hL(new KL().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4286zK
    public final int d(DL dl) {
        int i;
        int i4;
        if (h()) {
            if (dl == null) {
                i4 = C4179xL.f35771c.a(getClass()).i(this);
            } else {
                i4 = dl.i(this);
            }
            if (i4 >= 0) {
                return i4;
            }
            throw new IllegalStateException(D.x.k(i4, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i4).length() + 42)));
        }
        int i6 = this.zzc;
        if ((i6 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i6 & Integer.MAX_VALUE;
        }
        if (dl == null) {
            i = C4179xL.f35771c.a(getClass()).i(this);
        } else {
            i = dl.i(this);
        }
        g(i);
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C4179xL.f35771c.a(getClass()).h(this, (VK) obj);
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalStateException(D.x.k(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        this.zzc = i | (this.zzc & Integer.MIN_VALUE);
    }

    public final boolean h() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return C4179xL.f35771c.a(getClass()).j(this);
        }
        if (this.zzq == 0) {
            this.zzq = C4179xL.f35771c.a(getClass()).j(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final InterfaceC4071vL o() {
        return (InterfaceC4071vL) w(7, null);
    }

    public final VK p() {
        return (VK) w(4, null);
    }

    public final void q() {
        C4179xL.f35771c.a(getClass()).g(this);
        i();
    }

    public final TK r() {
        return (TK) w(5, null);
    }

    public final TK s() {
        TK tk = (TK) w(5, null);
        tk.k(this);
        return tk;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC3802qL.f34019a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC3802qL.b(this, sb, 0);
        return sb.toString();
    }

    public final void v(OK ok) {
        DL a9 = C4179xL.f35771c.a(getClass());
        C4201xq c4201xq = (C4201xq) ok.f27380n;
        if (c4201xq == null) {
            c4201xq = new C4201xq(ok);
        }
        a9.a(this, c4201xq);
    }

    public abstract Object w(int i, VK vk);
}
