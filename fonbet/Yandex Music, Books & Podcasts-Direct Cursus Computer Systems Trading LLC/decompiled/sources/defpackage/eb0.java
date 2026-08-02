package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public final class eb0 extends otk {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = itk.n() && Build.VERSION.SDK_INT >= 29;
    }

    public eb0() {
        List w = xz0.w(new y2r[]{(!itk.n() || Build.VERSION.SDK_INT < 29) ? null : new fb0(), new su7(wi0.f), new su7(f86.a), new su7(eg3.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : w) {
            if (((y2r) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.otk
    public final irf b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x509TrustManager.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        wd0 wd0Var = x509TrustManagerExtensions != null ? new wd0(x509TrustManager, x509TrustManagerExtensions) : null;
        return wd0Var != null ? wd0Var : super.b(x509TrustManager);
    }

    @Override // defpackage.otk
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((y2r) obj).b(sSLSocket)) {
                    break;
                }
            }
        }
        y2r y2rVar = (y2r) obj;
        if (y2rVar != null) {
            y2rVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.otk
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y2r) obj).b(sSLSocket)) {
                break;
            }
        }
        y2r y2rVar = (y2r) obj;
        if (y2rVar != null) {
            return y2rVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.otk
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
