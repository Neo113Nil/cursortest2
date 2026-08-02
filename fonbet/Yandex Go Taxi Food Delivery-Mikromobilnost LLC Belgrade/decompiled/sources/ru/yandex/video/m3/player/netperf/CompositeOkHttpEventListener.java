package ru.yandex.video.m3.player.netperf;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.bgo;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.o6u;
import defpackage.s4e;
import defpackage.tls;
import defpackage.yf7;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Protocol;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00020\u00072\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ!\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J9\u0010(\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u000eJ\u001f\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u000eJ\u001f\u00107\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010\u000eJ\u001f\u0010<\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010\u000eJ\u001f\u0010?\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b?\u00108J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\u000eJ\u001f\u0010A\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010C¨\u0006D"}, d2 = {"Lru/yandex/video/m3/player/netperf/CompositeOkHttpEventListener;", "Lbgo;", "", "listeners", "<init>", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lzy11;", "callback", "notifyListeners", "(Ltls;)V", "Lyf7;", "call", "callStart", "(Lyf7;)V", "", "domainName", "dnsStart", "(Lyf7;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lyf7;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(Lyf7;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lo6u;", "handshake", "secureConnectEnd", "(Lyf7;Lo6u;)V", "Lokhttp3/Protocol;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "connectEnd", "(Lyf7;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lyf7;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Ls4e;", "connection", "connectionAcquired", "(Lyf7;Ls4e;)V", "connectionReleased", "requestHeadersStart", "Ld5j0;", "request", "requestHeadersEnd", "(Lyf7;Ld5j0;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lyf7;J)V", "responseHeadersStart", "Lkvj0;", "response", "responseHeadersEnd", "(Lyf7;Lkvj0;)V", "responseBodyStart", "responseBodyEnd", "callEnd", "callFailed", "(Lyf7;Ljava/io/IOException;)V", "Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositeOkHttpEventListener extends bgo {
    public static final int $stable = 8;
    private final List<bgo> listeners;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeOkHttpEventListener(List<? extends bgo> list) {
        this.listeners = list;
    }

    private final void notifyListeners(tls callback) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                callback.invoke((bgo) it.next());
            }
        }
    }

    @Override // defpackage.bgo
    public void callEnd(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).callEnd(call);
            }
        }
    }

    @Override // defpackage.bgo
    public void callFailed(yf7 call, IOException ioe) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).callFailed(call, ioe);
            }
        }
    }

    @Override // defpackage.bgo
    public void callStart(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).callStart(call);
            }
        }
    }

    @Override // defpackage.bgo
    public void connectEnd(yf7 call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).connectEnd(call, inetSocketAddress, proxy, protocol);
            }
        }
    }

    @Override // defpackage.bgo
    public void connectFailed(yf7 call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                yf7 yf7Var = call;
                InetSocketAddress inetSocketAddress2 = inetSocketAddress;
                Proxy proxy2 = proxy;
                Protocol protocol2 = protocol;
                IOException iOException = ioe;
                ((bgo) it.next()).connectFailed(yf7Var, inetSocketAddress2, proxy2, protocol2, iOException);
                call = yf7Var;
                inetSocketAddress = inetSocketAddress2;
                proxy = proxy2;
                protocol = protocol2;
                ioe = iOException;
            }
        }
    }

    @Override // defpackage.bgo
    public void connectStart(yf7 call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).connectStart(call, inetSocketAddress, proxy);
            }
        }
    }

    @Override // defpackage.bgo
    public void connectionAcquired(yf7 call, s4e connection) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).connectionAcquired(call, connection);
            }
        }
    }

    @Override // defpackage.bgo
    public void connectionReleased(yf7 call, s4e connection) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).connectionReleased(call, connection);
            }
        }
    }

    @Override // defpackage.bgo
    public void dnsEnd(yf7 call, String domainName, List<? extends InetAddress> inetAddressList) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).dnsEnd(call, domainName, inetAddressList);
            }
        }
    }

    @Override // defpackage.bgo
    public void dnsStart(yf7 call, String domainName) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).dnsStart(call, domainName);
            }
        }
    }

    @Override // defpackage.bgo
    public void requestBodyEnd(yf7 call, long byteCount) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).requestBodyEnd(call, byteCount);
            }
        }
    }

    @Override // defpackage.bgo
    public void requestBodyStart(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).requestBodyStart(call);
            }
        }
    }

    @Override // defpackage.bgo
    public void requestHeadersEnd(yf7 call, d5j0 request) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).requestHeadersEnd(call, request);
            }
        }
    }

    @Override // defpackage.bgo
    public void requestHeadersStart(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).requestHeadersStart(call);
            }
        }
    }

    @Override // defpackage.bgo
    public void responseBodyEnd(yf7 call, long byteCount) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).responseBodyEnd(call, byteCount);
            }
        }
    }

    @Override // defpackage.bgo
    public void responseBodyStart(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).responseBodyStart(call);
            }
        }
    }

    @Override // defpackage.bgo
    public void responseHeadersEnd(yf7 call, kvj0 response) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).responseHeadersEnd(call, response);
            }
        }
    }

    @Override // defpackage.bgo
    public void responseHeadersStart(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).responseHeadersStart(call);
            }
        }
    }

    @Override // defpackage.bgo
    public void secureConnectEnd(yf7 call, o6u handshake) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).secureConnectEnd(call, handshake);
            }
        }
    }

    @Override // defpackage.bgo
    public void secureConnectStart(yf7 call) {
        synchronized (this.listeners) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((bgo) it.next()).secureConnectStart(call);
            }
        }
    }
}
