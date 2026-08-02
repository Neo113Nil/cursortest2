package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* loaded from: classes9.dex */
public final class rc20 extends bgo {
    public static ku00 a(yf7 yf7Var) {
        d5j0 k = yf7Var.k();
        g0c a = qoi0.a(ku00.class);
        return (ku00) a.a().cast(k.e.o(a));
    }

    @Override // defpackage.bgo
    public final void callEnd(yf7 yf7Var) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void callStart(yf7 yf7Var) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void connectEnd(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void connectStart(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void dnsEnd(yf7 yf7Var, String str, List list) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void dnsStart(yf7 yf7Var, String str) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void requestBodyEnd(yf7 yf7Var, long j) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void requestHeadersStart(yf7 yf7Var) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void responseBodyEnd(yf7 yf7Var, long j) {
        ku00 a = a(yf7Var);
        if (a != null) {
            ku00.a(a, j);
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersEnd(yf7 yf7Var, kvj0 kvj0Var) {
        if (a(yf7Var) != null) {
            kvj0Var.y.a("X-YaRequestId");
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersStart(yf7 yf7Var) {
        ku00 a = a(yf7Var);
        if (a != null) {
            ((j1m) a).c = Long.valueOf(System.currentTimeMillis());
        }
    }

    @Override // defpackage.bgo
    public final void secureConnectEnd(yf7 yf7Var, o6u o6uVar) {
        a(yf7Var);
    }

    @Override // defpackage.bgo
    public final void secureConnectStart(yf7 yf7Var) {
        a(yf7Var);
    }
}
