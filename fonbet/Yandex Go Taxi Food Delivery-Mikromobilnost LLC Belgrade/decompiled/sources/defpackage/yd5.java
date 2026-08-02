package defpackage;

import core.network.mapi.client.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import okhttp3.Protocol;

/* loaded from: classes7.dex */
public final class yd5 extends bgo {
    public final /* synthetic */ a m;

    public yd5(a aVar) {
        this.m = aVar;
    }

    public final ku00 a(yf7 yf7Var) {
        Object obj;
        ku00 ku00Var;
        a aVar = this.m;
        synchronized (aVar.c) {
            try {
                Iterator it = aVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((Pair) obj).c(), yf7Var)) {
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                ku00Var = pair != null ? (ku00) pair.f() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ku00Var;
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
        a(yf7Var);
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
