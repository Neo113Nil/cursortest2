package defpackage;

import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class aar implements bse {
    public final qdc a;
    public final boolean b;

    public aar(qdc qdcVar, boolean z) {
        qdcVar.getClass();
        this.a = qdcVar;
        this.b = z;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        d0o d0oVar = (d0o) uknVar.i;
        try {
            return uknVar.f(d0oVar);
        } catch (SSLHandshakeException e) {
            String str = d0oVar.a.d;
            Pair pair = new Pair("source", "okhttp");
            Pair pair2 = new Pair("host", str);
            Throwable cause = e.getCause();
            this.a.sendEvent("wm_ssl_error", uah.e(pair, pair2, new Pair("error_reason", (cause != null ? cause.getClass() : e.getClass()).getSimpleName()), new Pair("ya_certificates_enabled", Boolean.valueOf(this.b)), new Pair("handled", Boolean.FALSE)));
            throw e;
        }
    }
}
