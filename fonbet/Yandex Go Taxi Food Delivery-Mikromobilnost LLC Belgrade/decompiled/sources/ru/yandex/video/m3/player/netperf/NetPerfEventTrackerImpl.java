package ru.yandex.video.m3.player.netperf;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.sls;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010+R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010+R\u0016\u00105\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010)¨\u00066"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerImpl;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "collector", "Lkotlin/Function0;", "", "timePointProvider", "<init>", "(Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;Lsls;)V", "Lzy11;", "produceEvent", "()V", "", "url", "onNetworkCallStart", "(Ljava/lang/String;)V", "onDnsResolveStart", "onDnsResolveEnd", "onConnectStart", "onSecureConnectStart", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "onConnectEnd", "onConnectionAcquired", "onRequestHeadersStart", "onResponseHeadersStart", "byteCount", "onResponseBodyEnd", "(J)V", "onConnectionReleased", "Ljava/io/IOException;", "ioe", "onConnectFailed", "(Ljava/lang/String;Ljava/io/IOException;)V", "onNetworkCallFailed", "(Ljava/io/IOException;)V", "onNetworkCallEnd", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "Lsls;", "Ljava/lang/String;", "", "isFailed", "Z", "start", "J", "dnsStart", "dnsEnd", "connectStart", "SSLConnectStart", "connectEnd", "requestStart", "responseStart", "responseEnd", "transferSize", "wasProduced", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfEventTrackerImpl implements NetPerfEventTracker {
    public static final int $stable = 8;
    private long SSLConnectStart;
    private final NetworkEventsCollector collector;
    private long connectEnd;
    private long connectStart;
    private long dnsEnd;
    private long dnsStart;
    private boolean isFailed;
    private long requestStart;
    private long responseEnd;
    private long responseStart;
    private long start;
    private final sls timePointProvider;
    private long transferSize;
    private boolean wasProduced;
    private String url = "";
    private String protocol = "";

    public NetPerfEventTrackerImpl(NetworkEventsCollector networkEventsCollector, sls slsVar) {
        this.collector = networkEventsCollector;
        this.timePointProvider = slsVar;
    }

    private final void produceEvent() {
        if (this.wasProduced) {
            return;
        }
        this.wasProduced = true;
        String str = this.url;
        String str2 = this.protocol;
        long j = this.start;
        long j2 = this.dnsStart;
        long j3 = this.dnsEnd;
        long j4 = this.connectStart;
        long j5 = this.SSLConnectStart;
        long j6 = this.connectEnd;
        long j7 = this.requestStart;
        long j8 = this.responseStart;
        long j9 = this.responseEnd;
        this.collector.addEvent(new NetPerfEvent(str, str2, j, j2, j3, j4, j5, j6, j7, j8, j9, this.transferSize, j9 - j));
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onConnectEnd(String protocol) {
        this.connectEnd = ((Number) this.timePointProvider.invoke()).longValue();
        if (protocol == null) {
            protocol = "";
        }
        this.protocol = protocol;
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onConnectFailed(String protocol, IOException ioe) {
        this.isFailed = true;
        if (protocol == null) {
            protocol = "";
        }
        this.protocol = protocol;
        produceEvent();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onConnectStart() {
        this.connectStart = ((Number) this.timePointProvider.invoke()).longValue();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onConnectionAcquired() {
        if (this.connectStart == 0) {
            long longValue = ((Number) this.timePointProvider.invoke()).longValue();
            this.connectStart = longValue;
            this.SSLConnectStart = longValue;
            this.connectEnd = ((Number) this.timePointProvider.invoke()).longValue();
        }
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onConnectionReleased() {
        if (this.responseEnd == 0) {
            this.responseEnd = ((Number) this.timePointProvider.invoke()).longValue();
        }
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onDnsResolveEnd() {
        this.dnsEnd = ((Number) this.timePointProvider.invoke()).longValue();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onDnsResolveStart() {
        this.dnsStart = ((Number) this.timePointProvider.invoke()).longValue();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onNetworkCallEnd() {
        produceEvent();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onNetworkCallFailed(IOException ioe) {
        this.isFailed = true;
        produceEvent();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onNetworkCallStart(String url) {
        this.url = url;
        this.start = ((Number) this.timePointProvider.invoke()).longValue();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onRequestHeadersStart() {
        this.requestStart = ((Number) this.timePointProvider.invoke()).longValue();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onResponseBodyEnd(long byteCount) {
        this.responseEnd = ((Number) this.timePointProvider.invoke()).longValue();
        this.transferSize = byteCount;
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onResponseHeadersStart() {
        this.responseStart = ((Number) this.timePointProvider.invoke()).longValue();
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTracker
    public void onSecureConnectStart() {
        this.SSLConnectStart = ((Number) this.timePointProvider.invoke()).longValue();
    }
}
