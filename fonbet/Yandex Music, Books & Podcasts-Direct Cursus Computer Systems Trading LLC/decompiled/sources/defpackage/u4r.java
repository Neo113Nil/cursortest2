package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes3.dex */
public final class u4r extends gt1 {
    public X509HostnameVerifier g;
    public ArrayList h;
    public Hashtable i;

    static {
        new my1();
    }

    public static void l(u4r u4rVar, String str, m56 m56Var, Exception exc, ss1 ss1Var) {
        eta.q(u4rVar.i.get(str));
        m56Var.g(exc, ss1Var);
    }

    @Override // defpackage.cjq
    public final boolean a(qr1 qr1Var) {
        if (!(qr1Var.e instanceof ht1)) {
            return false;
        }
        qr1Var.b.getClass();
        qr1Var.g.r(null);
        ((ht1) qr1Var.e).getClass();
        throw null;
    }

    @Override // defpackage.gt1, defpackage.cjq
    public final piq b(pr1 pr1Var) {
        pr1Var.b.getClass();
        if (g(pr1Var.b.b) == -1) {
            return null;
        }
        return super.b(pr1Var);
    }

    @Override // defpackage.cjq
    public final void c(qr1 qr1Var) {
        if (qr1Var.e instanceof ht1) {
            qr1Var.b.getClass();
        }
    }

    @Override // defpackage.gt1
    public final m56 k(pr1 pr1Var, Uri uri, int i, boolean z, mr1 mr1Var) {
        ps1 ps1Var = new ps1();
        ps1Var.f = this;
        ps1Var.c = mr1Var;
        ps1Var.b = z;
        ps1Var.d = pr1Var;
        ps1Var.e = uri;
        ps1Var.a = i;
        String str = (String) ((Hashtable) pr1Var.a.b).get("spdykey");
        if (str == null) {
            return ps1Var;
        }
        sfm sfmVar = new sfm();
        sfmVar.c = this;
        sfmVar.a = str;
        sfmVar.b = ps1Var;
        return sfmVar;
    }

    public final void m(dt1 dt1Var, pr1 pr1Var, Uri uri, int i, m56 m56Var) {
        rs1 rs1Var;
        String host = uri.getHost();
        String host2 = uri.getHost();
        SSLContext sSLContext = ss1.t;
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        SSLEngine sSLEngine = null;
        while (it.hasNext() && (sSLEngine = ((ns1) it.next()).b(sSLContext, host2, i)) == null) {
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ns1) it2.next()).a(sSLEngine, pr1Var, host2, i);
        }
        X509HostnameVerifier x509HostnameVerifier = this.g;
        String str = (String) ((Hashtable) pr1Var.a.b).get("spdykey");
        if (str == null) {
            rs1Var = new jzi(m56Var);
        } else {
            x3n x3nVar = new x3n();
            x3nVar.d = this;
            x3nVar.b = pr1Var;
            x3nVar.a = str;
            x3nVar.c = m56Var;
            rs1Var = x3nVar;
        }
        ss1 ss1Var = new ss1(dt1Var, host, sSLEngine, x509HostnameVerifier);
        ss1Var.i = rs1Var;
        dt1Var.d(new qxp(rs1Var));
        try {
            ss1Var.d.beginHandshake();
            ss1Var.b(ss1Var.d.getHandshakeStatus());
        } catch (SSLException e) {
            ss1Var.i(e);
        }
    }
}
