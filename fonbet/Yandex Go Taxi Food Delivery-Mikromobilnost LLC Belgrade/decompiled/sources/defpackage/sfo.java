package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;

/* loaded from: classes7.dex */
public final class sfo extends bgo {
    public final bgo[] m;

    public sfo(bgo[] bgoVarArr) {
        this.m = bgoVarArr;
    }

    public final bgo[] a() {
        return this.m;
    }

    @Override // defpackage.bgo
    public final void cacheConditionalHit(yf7 yf7Var, kvj0 kvj0Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.cacheConditionalHit(yf7Var, kvj0Var);
        }
    }

    @Override // defpackage.bgo
    public final void cacheHit(yf7 yf7Var, kvj0 kvj0Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.cacheHit(yf7Var, kvj0Var);
        }
    }

    @Override // defpackage.bgo
    public final void cacheMiss(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.cacheMiss(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void callEnd(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.callEnd(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void callFailed(yf7 yf7Var, IOException iOException) {
        for (bgo bgoVar : this.m) {
            bgoVar.callFailed(yf7Var, iOException);
        }
    }

    @Override // defpackage.bgo
    public final void callStart(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.callStart(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void canceled(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.canceled(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void connectEnd(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        for (bgo bgoVar : this.m) {
            bgoVar.connectEnd(yf7Var, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // defpackage.bgo
    public final void connectFailed(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        for (bgo bgoVar : this.m) {
            bgoVar.connectFailed(yf7Var, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // defpackage.bgo
    public final void connectStart(yf7 yf7Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        for (bgo bgoVar : this.m) {
            bgoVar.connectStart(yf7Var, inetSocketAddress, proxy);
        }
    }

    @Override // defpackage.bgo
    public final void connectionAcquired(yf7 yf7Var, s4e s4eVar) {
        for (bgo bgoVar : this.m) {
            bgoVar.connectionAcquired(yf7Var, s4eVar);
        }
    }

    @Override // defpackage.bgo
    public final void connectionReleased(yf7 yf7Var, s4e s4eVar) {
        for (bgo bgoVar : this.m) {
            bgoVar.connectionReleased(yf7Var, s4eVar);
        }
    }

    @Override // defpackage.bgo
    public final void dispatcherQueueEnd(yf7 yf7Var, ryj ryjVar) {
        for (bgo bgoVar : this.m) {
            bgoVar.dispatcherQueueEnd(yf7Var, ryjVar);
        }
    }

    @Override // defpackage.bgo
    public final void dispatcherQueueStart(yf7 yf7Var, ryj ryjVar) {
        for (bgo bgoVar : this.m) {
            bgoVar.dispatcherQueueStart(yf7Var, ryjVar);
        }
    }

    @Override // defpackage.bgo
    public final void dnsEnd(yf7 yf7Var, String str, List list) {
        for (bgo bgoVar : this.m) {
            bgoVar.dnsEnd(yf7Var, str, list);
        }
    }

    @Override // defpackage.bgo
    public final void dnsStart(yf7 yf7Var, String str) {
        for (bgo bgoVar : this.m) {
            bgoVar.dnsStart(yf7Var, str);
        }
    }

    @Override // defpackage.bgo
    public final void followUpDecision(yf7 yf7Var, kvj0 kvj0Var, d5j0 d5j0Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.followUpDecision(yf7Var, kvj0Var, d5j0Var);
        }
    }

    @Override // defpackage.bgo
    public final void proxySelectEnd(yf7 yf7Var, kwu kwuVar, List list) {
        for (bgo bgoVar : this.m) {
            bgoVar.proxySelectEnd(yf7Var, kwuVar, list);
        }
    }

    @Override // defpackage.bgo
    public final void proxySelectStart(yf7 yf7Var, kwu kwuVar) {
        for (bgo bgoVar : this.m) {
            bgoVar.proxySelectStart(yf7Var, kwuVar);
        }
    }

    @Override // defpackage.bgo
    public final void requestBodyEnd(yf7 yf7Var, long j) {
        for (bgo bgoVar : this.m) {
            bgoVar.requestBodyEnd(yf7Var, j);
        }
    }

    @Override // defpackage.bgo
    public final void requestBodyStart(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.requestBodyStart(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void requestFailed(yf7 yf7Var, IOException iOException) {
        for (bgo bgoVar : this.m) {
            bgoVar.requestFailed(yf7Var, iOException);
        }
    }

    @Override // defpackage.bgo
    public final void requestHeadersEnd(yf7 yf7Var, d5j0 d5j0Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.requestHeadersEnd(yf7Var, d5j0Var);
        }
    }

    @Override // defpackage.bgo
    public final void requestHeadersStart(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.requestHeadersStart(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void responseBodyEnd(yf7 yf7Var, long j) {
        for (bgo bgoVar : this.m) {
            bgoVar.responseBodyEnd(yf7Var, j);
        }
    }

    @Override // defpackage.bgo
    public final void responseBodyStart(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.responseBodyStart(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void responseFailed(yf7 yf7Var, IOException iOException) {
        for (bgo bgoVar : this.m) {
            bgoVar.responseFailed(yf7Var, iOException);
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersEnd(yf7 yf7Var, kvj0 kvj0Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.responseHeadersEnd(yf7Var, kvj0Var);
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersStart(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.responseHeadersStart(yf7Var);
        }
    }

    @Override // defpackage.bgo
    public final void retryDecision(yf7 yf7Var, IOException iOException, boolean z) {
        for (bgo bgoVar : this.m) {
            bgoVar.retryDecision(yf7Var, iOException, z);
        }
    }

    @Override // defpackage.bgo
    public final void satisfactionFailure(yf7 yf7Var, kvj0 kvj0Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.satisfactionFailure(yf7Var, kvj0Var);
        }
    }

    @Override // defpackage.bgo
    public final void secureConnectEnd(yf7 yf7Var, o6u o6uVar) {
        for (bgo bgoVar : this.m) {
            bgoVar.secureConnectEnd(yf7Var, o6uVar);
        }
    }

    @Override // defpackage.bgo
    public final void secureConnectStart(yf7 yf7Var) {
        for (bgo bgoVar : this.m) {
            bgoVar.secureConnectStart(yf7Var);
        }
    }
}
