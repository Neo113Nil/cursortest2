package p8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final W3.e f39840e = new W3.e(21);

    /* renamed from: a, reason: collision with root package name */
    public final Class f39841a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f39842b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f39843c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f39844d;

    public e(Class cls) {
        this.f39841a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.h.d(declaredMethod, "getDeclaredMethod(...)");
        this.f39842b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f39843c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f39844d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f39841a.isInstance(sSLSocket);
    }

    @Override // p8.n
    public final boolean b() {
        boolean z8 = o8.d.f39736e;
        return o8.d.f39736e;
    }

    @Override // p8.n
    public final String c(SSLSocket sSLSocket) {
        if (!this.f39841a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f39843c.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, M7.a.f1916a);
            }
            return null;
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.h.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e9);
        }
    }

    @Override // p8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (this.f39841a.isInstance(sSLSocket)) {
            try {
                this.f39842b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f39844d;
                o8.f fVar = o8.f.f39739a;
                method.invoke(sSLSocket, C3.e.l(protocols));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }
}
