package ru.yandex.video.m3.player.impl.source;

import android.net.Uri;
import defpackage.cj01;
import defpackage.g8e;
import defpackage.ipg;
import defpackage.kpg;
import defpackage.mpg;
import defpackage.npg;
import defpackage.tw21;
import defpackage.vuu;
import defpackage.xuu;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier;
import ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001d\u001eB!\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/source/LiveSessionDataSourceDecoratorFactory;", "Lipg;", "Lru/yandex/video/m3/player/lowlatency/TrackTypeIdentifier;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "Lvuu;", "dataSourceFactory", "", "isNetPerfEnabled", "", "originalDataSourcePerfName", "<init>", "(Lvuu;ZLjava/lang/String;)V", "(Lvuu;)V", "Lkpg;", "createDataSource", "()Lkpg;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lzy11;", "setTrackType", "(Lru/yandex/video/m3/player/tracks/TrackType;)V", "Lvuu;", "Z", "()Z", "Ljava/lang/String;", "liveSession", "className", "getClassName", "()Ljava/lang/String;", "Companion", "LiveSessionDataSourceDecorator", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LiveSessionDataSourceDecoratorFactory implements ipg, TrackTypeIdentifier, NetPerfMarker {
    public static final String LIVE_SESSION_HEADER = "X-Strm-Session";
    private static final String QUERY_PARAMETER_TIMESTAMP = "t";
    private final String className;
    private final vuu dataSourceFactory;
    private final boolean isNetPerfEnabled;
    private String liveSession;
    private final String originalDataSourcePerfName;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u001e\u001aD\u0012\u0004\u0012\u00020\u0012\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012 \u001c*\b\u0012\u0004\u0012\u00020\u00120\u001b0\u001a \u001c* \u0012\u0004\u0012\u00020\u0012\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012 \u001c*\b\u0012\u0004\u0012\u00020\u00120\u001b0\u001a0\u001d0\u0019H\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u0097\u0001¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J'\u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/yandex/video/m3/player/impl/source/LiveSessionDataSourceDecoratorFactory$LiveSessionDataSourceDecorator;", "Lxuu;", "Lru/yandex/video/m3/player/lowlatency/source/InterruptableHttpDataSource;", "dataSource", "<init>", "(Lru/yandex/video/m3/player/impl/source/LiveSessionDataSourceDecoratorFactory;Lxuu;)V", "Lnpg;", "applyLiveSession", "(Lnpg;)Lnpg;", "updateUriWithTimestamp", "Lzy11;", "updateLiveSession", "()V", "Lcj01;", "p0", "addTransferListener", "(Lcj01;)V", "clearAllRequestProperties", "", "clearRequestProperty", "(Ljava/lang/String;)V", "close", "", "getResponseCode", "()I", "", "", "", "kotlin.jvm.PlatformType", "", "getResponseHeaders", "()Ljava/util/Map;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "p1", "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "", "tryInterruptPendingRequest", "()Z", "", "target", "offset", "length", "read", "([BII)I", "Lxuu;", "isFirstRead", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LiveSessionDataSourceDecorator implements xuu, InterruptableHttpDataSource {
        private final xuu dataSource;
        private boolean isFirstRead = true;

        public LiveSessionDataSourceDecorator(xuu xuuVar) {
            this.dataSource = xuuVar;
        }

        private final npg applyLiveSession(npg npgVar) {
            String str = LiveSessionDataSourceDecoratorFactory.this.liveSession;
            if (str == null) {
                return npgVar;
            }
            mpg a = npgVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(npgVar.e);
            linkedHashMap.put(LiveSessionDataSourceDecoratorFactory.LIVE_SESSION_HEADER, str);
            a.e = linkedHashMap;
            return a.a();
        }

        private final void updateLiveSession() {
            List list = (List) this.dataSource.getResponseHeaders().get(LiveSessionDataSourceDecoratorFactory.LIVE_SESSION_HEADER);
            String X = list != null ? a.X(list, null, null, null, null, 63) : null;
            if (X != null) {
                LiveSessionDataSourceDecoratorFactory.this.liveSession = X;
            }
        }

        private final npg updateUriWithTimestamp(npg npgVar) {
            if (npgVar.a.getQueryParameter(LiveSessionDataSourceDecoratorFactory.QUERY_PARAMETER_TIMESTAMP) == null) {
                return npgVar;
            }
            Uri uri = npgVar.a;
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String str : uri.getQueryParameterNames()) {
                if (!str.equals(LiveSessionDataSourceDecoratorFactory.QUERY_PARAMETER_TIMESTAMP)) {
                    Iterator<String> it = uri.getQueryParameters(str).iterator();
                    while (it.hasNext()) {
                        buildUpon.appendQueryParameter(str, it.next());
                    }
                }
            }
            Uri build = buildUpon.build().buildUpon().appendQueryParameter(LiveSessionDataSourceDecoratorFactory.QUERY_PARAMETER_TIMESTAMP, String.valueOf(System.currentTimeMillis())).build();
            mpg a = npgVar.a();
            a.a = build;
            return a.a();
        }

        @Override // defpackage.kpg
        public void addTransferListener(cj01 p0) {
            this.dataSource.addTransferListener(p0);
        }

        @Override // defpackage.xuu
        public void clearAllRequestProperties() {
            this.dataSource.clearAllRequestProperties();
        }

        @Override // defpackage.xuu
        public void clearRequestProperty(String p0) {
            this.dataSource.clearRequestProperty(p0);
        }

        @Override // defpackage.kpg
        public void close() {
            this.dataSource.close();
        }

        @Override // defpackage.xuu
        public int getResponseCode() {
            return this.dataSource.getResponseCode();
        }

        @Override // defpackage.xuu, defpackage.kpg
        public Map<String, List<String>> getResponseHeaders() {
            return this.dataSource.getResponseHeaders();
        }

        @Override // defpackage.kpg
        /* renamed from: getUri */
        public Uri getInflatedUri() {
            return this.dataSource.getInflatedUri();
        }

        @Override // defpackage.kpg
        public long open(npg dataSpec) {
            this.isFirstRead = true;
            boolean z = tw21.N(dataSpec.a) == 0;
            xuu xuuVar = this.dataSource;
            if (z) {
                dataSpec = applyLiveSession(updateUriWithTimestamp(dataSpec));
            }
            return xuuVar.open(dataSpec);
        }

        @Override // defpackage.apg
        public int read(byte[] target, int offset, int length) {
            Uri inflatedUri;
            if (this.isFirstRead && (inflatedUri = getInflatedUri()) != null) {
                if (tw21.N(inflatedUri) == 0) {
                    updateLiveSession();
                }
                this.isFirstRead = false;
            }
            return this.dataSource.read(target, offset, length);
        }

        @Override // defpackage.xuu
        public void setRequestProperty(String p0, String p1) {
            this.dataSource.setRequestProperty(p0, p1);
        }

        @Override // ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource
        public boolean tryInterruptPendingRequest() {
            xuu xuuVar = this.dataSource;
            InterruptableHttpDataSource interruptableHttpDataSource = xuuVar instanceof InterruptableHttpDataSource ? (InterruptableHttpDataSource) xuuVar : null;
            if (interruptableHttpDataSource != null) {
                return interruptableHttpDataSource.tryInterruptPendingRequest();
            }
            return false;
        }
    }

    public LiveSessionDataSourceDecoratorFactory(vuu vuuVar, boolean z, String str) {
        this.dataSourceFactory = vuuVar;
        this.isNetPerfEnabled = z;
        this.originalDataSourcePerfName = str;
        this.className = g8e.o("LiveSessionDataSourceDecoratorFactory.", str);
    }

    @Override // defpackage.ipg
    public kpg createDataSource() {
        return new LiveSessionDataSourceDecorator(this.dataSourceFactory.createDataSource());
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    public String getClassName() {
        return this.className;
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    /* renamed from: isNetPerfEnabled, reason: from getter */
    public boolean getIsNetPerfEnabled() {
        return this.isNetPerfEnabled;
    }

    @Override // ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier
    public void setTrackType(TrackType trackType) {
        vuu vuuVar = this.dataSourceFactory;
        TrackTypeIdentifier trackTypeIdentifier = vuuVar instanceof TrackTypeIdentifier ? (TrackTypeIdentifier) vuuVar : null;
        if (trackTypeIdentifier != null) {
            trackTypeIdentifier.setTrackType(trackType);
        }
    }

    public LiveSessionDataSourceDecoratorFactory(vuu vuuVar) {
        this(vuuVar, false, vuuVar.getClass().getSimpleName());
    }
}
