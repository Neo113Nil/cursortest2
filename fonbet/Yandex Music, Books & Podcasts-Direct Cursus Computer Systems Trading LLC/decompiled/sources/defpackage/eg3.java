package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes5.dex */
public final class eg3 implements y2r {
    public static final dg3 a = new dg3();

    @Override // defpackage.y2r
    public final boolean a() {
        boolean z = cg3.d;
        return cg3.d;
    }

    @Override // defpackage.y2r
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.y2r
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.y2r
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            otk otkVar = otk.a;
            parameters.setApplicationProtocols((String[]) itk.b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
