package S1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f1779f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1781b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1782c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1783d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1784e;

    public f(Class cls) {
        this.f1780a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1781b = declaredMethod;
        this.f1782c = cls.getMethod("setHostname", String.class);
        this.f1783d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1784e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // S1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1780a.isInstance(sSLSocket);
    }

    @Override // S1.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f1780a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f1783d.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, z1.a.f8620a);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // S1.n
    public final boolean c() {
        boolean z2 = R1.c.f1745e;
        return R1.c.f1745e;
    }

    @Override // S1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (this.f1780a.isInstance(sSLSocket)) {
            try {
                this.f1781b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1782c.invoke(sSLSocket, str);
                }
                Method method = this.f1784e;
                R1.n nVar = R1.n.f1772a;
                method.invoke(sSLSocket, m0.j.e(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
