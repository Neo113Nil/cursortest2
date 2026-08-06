package S1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f1790a;

    /* renamed from: b, reason: collision with root package name */
    public n f1791b;

    public m(l lVar) {
        this.f1790a = lVar;
    }

    @Override // S1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1790a.a(sSLSocket);
    }

    @Override // S1.n
    public final String b(SSLSocket sSLSocket) {
        n e2 = e(sSLSocket);
        if (e2 == null) {
            return null;
        }
        return e2.b(sSLSocket);
    }

    @Override // S1.n
    public final boolean c() {
        return true;
    }

    @Override // S1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        n e2 = e(sSLSocket);
        if (e2 == null) {
            return;
        }
        e2.d(sSLSocket, str, protocols);
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f1791b == null && this.f1790a.a(sSLSocket)) {
                this.f1791b = this.f1790a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1791b;
    }
}
