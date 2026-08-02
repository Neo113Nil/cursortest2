package ru.yandex.video.m3.player.impl.netperf;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cj01;
import defpackage.kpg;
import defpackage.npg;
import defpackage.ny61;
import defpackage.sls;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.netperf.NetPerfEvent;
import ru.yandex.video.m3.player.netperf.NetworkEventsCollector;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J/\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001e\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060#R\u00020\u00000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/netperf/NetPerfTransferListener;", "Lcj01;", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "collector", "Lkotlin/Function0;", "", "timeProvider", "", "Lru/yandex/video/m3/player/impl/netperf/VideoSessionIdProvider;", "videoSessionIdProvider", "<init>", "(Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;Lsls;Lsls;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "key", "buildUri", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "Lkpg;", "source", "Lnpg;", "dataSpec", "", "isNetwork", "Lzy11;", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "", "bytesTransferred", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "Lsls;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/yandex/video/m3/player/impl/netperf/NetPerfTransferListener$CacheEvent;", "events", "Ljava/util/concurrent/ConcurrentHashMap;", "CacheEvent", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfTransferListener implements cj01 {
    public static final int $stable = 8;
    private final NetworkEventsCollector collector;
    private final ConcurrentHashMap<String, CacheEvent> events = new ConcurrentHashMap<>();
    private final sls timeProvider;
    private final sls videoSessionIdProvider;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/netperf/NetPerfTransferListener$CacheEvent;", "", "", "url", "", "start", "<init>", "(Lru/yandex/video/m3/player/impl/netperf/NetPerfTransferListener;Ljava/lang/String;J)V", "", "bytesTransferred", "Lzy11;", "updateTransferredSize", "(I)V", "Lru/yandex/video/m3/player/netperf/NetPerfEvent;", "toNetPerfEvent", "()Lru/yandex/video/m3/player/netperf/NetPerfEvent;", "Ljava/lang/String;", "J", "connected", "getConnected", "()J", "setConnected", "(J)V", "end", "getEnd", "setEnd", "totalTransferred", CA20Status.STATUS_USER_I, "getTotalTransferred", "()I", "setTotalTransferred", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class CacheEvent {
        private long connected;
        private long end;
        private final long start;
        private volatile int totalTransferred;
        private final String url;

        public CacheEvent(String str, long j) {
            this.url = str;
            this.start = j;
        }

        public final long getConnected() {
            return this.connected;
        }

        public final long getEnd() {
            return this.end;
        }

        public final int getTotalTransferred() {
            return this.totalTransferred;
        }

        public final void setConnected(long j) {
            this.connected = j;
        }

        public final void setEnd(long j) {
            this.end = j;
        }

        public final void setTotalTransferred(int i) {
            this.totalTransferred = i;
        }

        public final NetPerfEvent toNetPerfEvent() {
            String str = this.url;
            long j = this.start;
            long j2 = this.connected;
            return new NetPerfEvent(str, "file", j, j, j, j, j, j, j2, j2, this.end, this.totalTransferred, this.end - this.start);
        }

        public final void updateTransferredSize(int bytesTransferred) {
            this.totalTransferred += bytesTransferred;
        }
    }

    public NetPerfTransferListener(NetworkEventsCollector networkEventsCollector, sls slsVar, sls slsVar2) {
        this.collector = networkEventsCollector;
        this.timeProvider = slsVar;
        this.videoSessionIdProvider = slsVar2;
    }

    private final String buildUri(Uri uri, String key) {
        return uri.buildUpon().clearQuery().appendQueryParameter("vsid", (String) this.videoSessionIdProvider.invoke()).build().toString();
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
        String str = dataSpec.h;
        if (isNetwork || str == null) {
            return;
        }
        CacheEvent cacheEvent = this.events.get(str);
        if (cacheEvent != null) {
            cacheEvent.updateTransferredSize(bytesTransferred);
        } else {
            ny61.r("Check failed.");
        }
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
        String str = dataSpec.h;
        if (isNetwork || str == null) {
            return;
        }
        CacheEvent cacheEvent = this.events.get(str);
        if (cacheEvent == null) {
            ny61.r("Check failed.");
            return;
        }
        this.events.remove(str);
        cacheEvent.setEnd(((Number) this.timeProvider.invoke()).longValue());
        this.collector.addEvent(cacheEvent.toNetPerfEvent());
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
        String str = dataSpec.h;
        if (isNetwork || str == null) {
            return;
        }
        this.events.put(str, new CacheEvent(buildUri(dataSpec.a, str), ((Number) this.timeProvider.invoke()).longValue()));
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
        String str = dataSpec.h;
        if (isNetwork || str == null) {
            return;
        }
        CacheEvent cacheEvent = this.events.get(str);
        if (cacheEvent != null) {
            cacheEvent.setConnected(((Number) this.timeProvider.invoke()).longValue());
        } else {
            ny61.r("Check failed.");
        }
    }
}
