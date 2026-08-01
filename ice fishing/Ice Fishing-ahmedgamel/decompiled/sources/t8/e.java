package t8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final M2.i f40929e = new M2.i(26);

    /* renamed from: a, reason: collision with root package name */
    public final Class f40930a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f40931b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f40932c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f40933d;

    public e(Class cls) {
        this.f40930a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.h.d(declaredMethod, "getDeclaredMethod(...)");
        this.f40931b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f40932c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f40933d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // t8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f40930a.isInstance(sSLSocket);
    }

    @Override // t8.n
    public final boolean b() {
        boolean z3 = s8.d.f40497e;
        return s8.d.f40497e;
    }

    @Override // t8.n
    public final String c(SSLSocket sSLSocket) {
        if (!this.f40930a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f40932c.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Q7.a.f2664a);
            }
            return null;
        } catch (IllegalAccessException e9) {
            throw new AssertionError(e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.h.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e10);
        }
    }

    @Override // t8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (this.f40930a.isInstance(sSLSocket)) {
            try {
                this.f40931b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f40933d;
                s8.f fVar = s8.f.f40500a;
                method.invoke(sSLSocket, a4.e.d(protocols));
            } catch (IllegalAccessException e9) {
                throw new AssertionError(e9);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
