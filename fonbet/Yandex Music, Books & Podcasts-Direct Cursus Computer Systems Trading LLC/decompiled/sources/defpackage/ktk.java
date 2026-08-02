package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class ktk extends ntk {
    public final Method e;
    public final Method f;
    public final Method g;
    public final Class h;
    public final Class i;

    public ktk(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.e = method;
        this.f = method2;
        this.g = method3;
        this.h = cls;
        this.i = cls2;
    }

    @Override // defpackage.ntk
    public final void a(SSLSocket sSLSocket) {
        try {
            this.g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            wvs.b();
        } catch (InvocationTargetException e) {
            ntk.b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // defpackage.ntk
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hzm hzmVar = (hzm) list.get(i);
            if (hzmVar != hzm.HTTP_1_0) {
                arrayList.add(hzmVar.a);
            }
        }
        try {
            this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(ntk.class.getClassLoader(), new Class[]{this.h, this.i}, new ltk(arrayList)));
        } catch (IllegalAccessException e) {
            xq0.w(e);
        } catch (InvocationTargetException e2) {
            xq0.w(e2);
        }
    }

    @Override // defpackage.ntk
    public final String d(SSLSocket sSLSocket) {
        try {
            ltk ltkVar = (ltk) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
            boolean z = ltkVar.b;
            if (!z && ltkVar.c == null) {
                ntk.b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return ltkVar.c;
        } catch (IllegalAccessException unused) {
            wvs.b();
            return null;
        } catch (InvocationTargetException unused2) {
            wvs.b();
            return null;
        }
    }

    @Override // defpackage.ntk
    public final int e() {
        return 1;
    }
}
