package S1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1785a = new g();

    @Override // S1.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // S1.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : kotlin.jvm.internal.i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // S1.n
    public final boolean c() {
        boolean z2 = R1.e.f1748d;
        return R1.e.f1748d;
    }

    @Override // S1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            R1.n nVar = R1.n.f1772a;
            Object[] array = m0.j.c(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
