package t8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes2.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final f f40935a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f40936b;

    static {
        boolean z3 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f40936b = z3;
    }

    @Override // t8.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // t8.n
    public final boolean b() {
        return f40936b;
    }

    @Override // t8.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // t8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            s8.f fVar = s8.f.f40500a;
            parameters.setApplicationProtocols((String[]) a4.e.c(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
