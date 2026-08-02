package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class su7 implements y2r {
    public final ru7 a;
    public y2r b;

    public su7(ru7 ru7Var) {
        this.a = ru7Var;
    }

    @Override // defpackage.y2r
    public final boolean a() {
        return true;
    }

    @Override // defpackage.y2r
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.y2r
    public final String c(SSLSocket sSLSocket) {
        y2r e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.y2r
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        y2r e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized y2r e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.t(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
