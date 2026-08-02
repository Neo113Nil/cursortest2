package ru.yandex.video.m3.player.netperf;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.bgo;
import defpackage.i3y;
import defpackage.s4e;
import defpackage.sls;
import defpackage.yf7;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.a;
import okhttp3.Protocol;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ-\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0012J1\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J9\u0010'\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0012J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0012J\u001f\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010,J\u001f\u00103\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u001b\u0010;\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetworkEventsListener;", "Lbgo;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;", "netPerfEventTracker", "<init>", "(Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;)V", "Lyf7;", "call", "", "name", "Lzy11;", "logCallTime", "(Lyf7;Ljava/lang/String;)V", "", "size", "logCallTimeAndSize", "(Lyf7;Ljava/lang/String;J)V", "callStart", "(Lyf7;)V", "domainName", "dnsStart", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lyf7;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(Lyf7;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Protocol;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "connectEnd", "(Lyf7;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lyf7;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Ls4e;", "connection", "connectionAcquired", "(Lyf7;Ls4e;)V", "requestHeadersStart", "responseHeadersStart", "byteCount", "responseBodyEnd", "(Lyf7;J)V", "connectionReleased", "callFailed", "(Lyf7;Ljava/io/IOException;)V", "callEnd", "Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;", "myTag$delegate", "Li3y;", "getMyTag", "()Ljava/lang/String;", "myTag", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkEventsListener extends bgo {
    public static final int $stable = 8;

    /* renamed from: myTag$delegate, reason: from kotlin metadata */
    private final i3y myTag = a.a(new sls() { // from class: ru.yandex.video.m3.player.netperf.NetworkEventsListener$myTag$2
        @Override // defpackage.sls
        public final String invoke() {
            AtomicInteger atomicInteger;
            StringBuilder sb = new StringBuilder("NetEventListener");
            atomicInteger = NetworkEventsListenerKt.ListenerCount;
            sb.append(atomicInteger.getAndIncrement());
            return sb.toString();
        }
    });
    private final NetPerfEventTracker netPerfEventTracker;

    public NetworkEventsListener(NetPerfEventTracker netPerfEventTracker) {
        this.netPerfEventTracker = netPerfEventTracker;
    }

    private final String getMyTag() {
        return (String) this.myTag.getValue();
    }

    private final void logCallTime(yf7 call, String name) {
    }

    private final void logCallTimeAndSize(yf7 call, String name, long size) {
    }

    @Override // defpackage.bgo
    public void callEnd(yf7 call) {
        this.netPerfEventTracker.onNetworkCallEnd();
    }

    @Override // defpackage.bgo
    public void callFailed(yf7 call, IOException ioe) {
        this.netPerfEventTracker.onNetworkCallFailed(ioe);
    }

    @Override // defpackage.bgo
    public void callStart(yf7 call) {
        logCallTime(call, "callStart");
        this.netPerfEventTracker.onNetworkCallStart(call.k().a.i);
    }

    @Override // defpackage.bgo
    public void connectEnd(yf7 call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        logCallTime(call, "connectEnd, protocol = " + protocol);
        this.netPerfEventTracker.onConnectEnd(protocol != null ? protocol.getProtocol() : null);
    }

    @Override // defpackage.bgo
    public void connectFailed(yf7 call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        logCallTime(call, "connectFailed, protocol = " + protocol);
        this.netPerfEventTracker.onConnectFailed(protocol != null ? protocol.getProtocol() : null, ioe);
    }

    @Override // defpackage.bgo
    public void connectStart(yf7 call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        logCallTime(call, "connectStart");
        this.netPerfEventTracker.onConnectStart();
    }

    @Override // defpackage.bgo
    public void connectionAcquired(yf7 call, s4e connection) {
        logCallTime(call, "connectionAcquired");
        this.netPerfEventTracker.onConnectionAcquired();
    }

    @Override // defpackage.bgo
    public void connectionReleased(yf7 call, s4e connection) {
        logCallTime(call, "connectionReleased");
        this.netPerfEventTracker.onConnectionReleased();
    }

    @Override // defpackage.bgo
    public void dnsEnd(yf7 call, String domainName, List<? extends InetAddress> inetAddressList) {
        logCallTime(call, "dnsEnd");
        this.netPerfEventTracker.onDnsResolveEnd();
    }

    @Override // defpackage.bgo
    public void dnsStart(yf7 call, String domainName) {
        logCallTime(call, "dnsStart");
        this.netPerfEventTracker.onDnsResolveStart();
    }

    @Override // defpackage.bgo
    public void requestHeadersStart(yf7 call) {
        logCallTime(call, "requestHeadersStart");
        this.netPerfEventTracker.onRequestHeadersStart();
    }

    @Override // defpackage.bgo
    public void responseBodyEnd(yf7 call, long byteCount) {
        logCallTimeAndSize(call, "responseBodyEnd", byteCount);
        this.netPerfEventTracker.onResponseBodyEnd(byteCount);
    }

    @Override // defpackage.bgo
    public void responseHeadersStart(yf7 call) {
        logCallTime(call, "responseHeadersStart");
        this.netPerfEventTracker.onResponseHeadersStart();
    }

    @Override // defpackage.bgo
    public void secureConnectStart(yf7 call) {
        logCallTime(call, "secureConnectStart");
        this.netPerfEventTracker.onSecureConnectStart();
    }
}
