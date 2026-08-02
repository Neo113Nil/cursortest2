package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class jtk extends ntk {
    public final Method e;
    public final Method f;

    public jtk(Provider provider, Method method, Method method2) {
        super(provider);
        this.e = method;
        this.f = method2;
    }

    @Override // defpackage.ntk
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hzm hzmVar = (hzm) it.next();
            if (hzmVar != hzm.HTTP_1_0) {
                arrayList.add(hzmVar.a);
            }
        }
        try {
            this.e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            b6e.q(e);
        } catch (InvocationTargetException e2) {
            b6e.q(e2);
        }
    }

    @Override // defpackage.ntk
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            b6e.q(e);
            return null;
        } catch (InvocationTargetException e2) {
            b6e.q(e2);
            return null;
        }
    }

    @Override // defpackage.ntk
    public final int e() {
        return 1;
    }
}
