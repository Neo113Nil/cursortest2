package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes9.dex */
public final class zoh implements l5t0 {
    public final yoh a;
    public l5t0 b;

    public zoh(yoh yohVar) {
        this.a = yohVar;
    }

    @Override // defpackage.l5t0
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.l5t0
    public final String b(SSLSocket sSLSocket) {
        l5t0 d = d(sSLSocket);
        if (d != null) {
            return d.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.l5t0
    public final void c(SSLSocket sSLSocket, String str, List list) {
        l5t0 d = d(sSLSocket);
        if (d != null) {
            d.c(sSLSocket, str, list);
        }
    }

    public final synchronized l5t0 d(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.l5t0
    public final boolean isSupported() {
        return true;
    }
}
