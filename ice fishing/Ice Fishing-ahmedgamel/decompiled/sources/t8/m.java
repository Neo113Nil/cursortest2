package t8;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f40939a;

    /* renamed from: b, reason: collision with root package name */
    public n f40940b;

    public m(l lVar) {
        this.f40939a = lVar;
    }

    @Override // t8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f40939a.a(sSLSocket);
    }

    @Override // t8.n
    public final boolean b() {
        return true;
    }

    @Override // t8.n
    public final String c(SSLSocket sSLSocket) {
        n e9 = e(sSLSocket);
        if (e9 != null) {
            return e9.c(sSLSocket);
        }
        return null;
    }

    @Override // t8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        n e9 = e(sSLSocket);
        if (e9 != null) {
            e9.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f40940b == null && this.f40939a.a(sSLSocket)) {
                this.f40940b = this.f40939a.l(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f40940b;
    }
}
