package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public class wi0 implements y2r {
    public static final h1b f = new h1b();
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public wi0(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.y2r
    public final boolean a() {
        boolean z = rh0.e;
        return rh0.e;
    }

    @Override // defpackage.y2r
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.y2r
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e) {
                xq0.w(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    xq0.w(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.y2r
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                otk otkVar = otk.a;
                method.invoke(sSLSocket, itk.d(list));
            } catch (IllegalAccessException e) {
                xq0.w(e);
            } catch (InvocationTargetException e2) {
                xq0.w(e2);
            }
        }
    }
}
