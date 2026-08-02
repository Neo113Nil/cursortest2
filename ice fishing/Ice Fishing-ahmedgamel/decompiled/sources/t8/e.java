package t8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final c4.e f40892e = new c4.e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f40893a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f40894b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f40895c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f40896d;

    public e(Class cls) {
        this.f40893a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.h.d(declaredMethod, "getDeclaredMethod(...)");
        this.f40894b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f40895c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f40896d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // t8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f40893a.isInstance(sSLSocket);
    }

    @Override // t8.n
    public final boolean b() {
        boolean z6 = s8.d.f40551e;
        return s8.d.f40551e;
    }

    @Override // t8.n
    public final String c(SSLSocket sSLSocket) {
        if (!this.f40893a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f40895c.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Q7.a.f2701a);
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
        if (this.f40893a.isInstance(sSLSocket)) {
            try {
                this.f40894b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f40896d;
                s8.f fVar = s8.f.f40554a;
                method.invoke(sSLSocket, c4.e.o(protocols));
            } catch (IllegalAccessException e9) {
                throw new AssertionError(e9);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
