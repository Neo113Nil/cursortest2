package ru.yandex.video.m3.player.impl.source;

import android.net.Uri;
import androidx.media3.datasource.FileDataSource;
import defpackage.bb7;
import defpackage.cj01;
import defpackage.d5z0;
import defpackage.e90;
import defpackage.h5z0;
import defpackage.hpg;
import defpackage.ic7;
import defpackage.ipg;
import defpackage.jxi;
import defpackage.kpg;
import defpackage.npg;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.yk51;
import defpackage.zk51;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfig;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfigKt;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.player.impl.cache.CacheMissLogger;
import ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory;
import ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory;
import ru.yandex.video.m3.source.DataSourceFactory;

@jxi
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00041234B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0014\u0010/\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Lru/yandex/video/m3/player/impl/source/CachedDataSourceFactory;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "Lra7;", "cache", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lpb7;", "cacheKeyFactory", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", ConfigConstants.CONFIG, "<init>", "(Lra7;Lokhttp3/OkHttpClient;Lpb7;Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;)V", "Lzk51;", "Lzy11;", "tryEnableDebugCacheMiss", "(Lzk51;)V", "parentCache", "Lhpg;", "provideCacheWriteDataSinkFactory", "(Lra7;)Lhpg;", "Lkpg;", "provideCacheReadDataSourceFactory", "(Lra7;)Lkpg;", "Lipg;", "dataSourceFactory", "provideUpstreamDataSourceFactory", "(Lra7;Lipg;)Lkpg;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "setNetPerfEventTrackerFactory", "(Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;)V", "Lcj01;", "transferListener", "create", "(Lcj01;)Lipg;", "Lra7;", "Lokhttp3/OkHttpClient;", "Lpb7;", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "", "className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "", "isNetPerfEnabled", "()Z", "Companion", "DebugCacheMissDataSource", "DebugPutToCacheDataSink", "DebugTryGetFromCacheDataSource", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedDataSourceFactory implements DataSourceFactory, NetPerfMarker {
    private static final String CACHE_DEBUG_TAG = "CACHE_DEBUG";
    private final ra7 cache;
    private final pb7 cacheKeyFactory;
    private final String className;
    private final CachedDataSourceConfig config;
    private NetPerfEventTrackerFactory netPerfEventTrackerFactory;
    private final OkHttpClient okHttpClient;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/impl/source/CachedDataSourceFactory$DebugCacheMissDataSource;", "Lkpg;", "Lra7;", "cache", "realDataSource", "<init>", "(Lra7;Lkpg;)V", "Lcj01;", "p0", "Lzy11;", "addTransferListener", "(Lcj01;)V", "close", "()V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "p1", "p2", "read", "([BII)I", "Lnpg;", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "Lra7;", "Lkpg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DebugCacheMissDataSource implements kpg {
        private final ra7 cache;
        private final kpg realDataSource;

        public DebugCacheMissDataSource(ra7 ra7Var, kpg kpgVar) {
            this.cache = ra7Var;
            this.realDataSource = kpgVar;
        }

        @Override // defpackage.kpg
        public void addTransferListener(cj01 p0) {
            this.realDataSource.addTransferListener(p0);
        }

        @Override // defpackage.kpg
        public void close() {
            this.realDataSource.close();
        }

        @Override // defpackage.kpg
        public Map getResponseHeaders() {
            return Collections.EMPTY_MAP;
        }

        @Override // defpackage.kpg
        /* renamed from: getUri */
        public Uri getInflatedUri() {
            return this.realDataSource.getInflatedUri();
        }

        @Override // defpackage.kpg
        public long open(npg dataSpec) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(CachedDataSourceFactory.CACHE_DEBUG_TAG);
            d5z0Var.o(CacheMissLogger.INSTANCE.logCacheMiss(this.cache, dataSpec, true), new Object[0]);
            return this.realDataSource.open(dataSpec);
        }

        @Override // defpackage.apg
        public int read(byte[] p0, int p1, int p2) {
            return this.realDataSource.read(p0, p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/source/CachedDataSourceFactory$DebugPutToCacheDataSink;", "Lhpg;", "realDataSink", "<init>", "(Lhpg;)V", "Lzy11;", "close", "()V", "", "p0", "", "p1", "p2", "write", "([BII)V", "Lnpg;", "dataSpec", OpenList.STR_OPEN, "(Lnpg;)V", "Lhpg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DebugPutToCacheDataSink implements hpg {
        private final hpg realDataSink;

        public DebugPutToCacheDataSink(hpg hpgVar) {
            this.realDataSink = hpgVar;
        }

        @Override // defpackage.hpg
        public void close() {
            this.realDataSink.close();
        }

        @Override // defpackage.hpg
        public void open(npg dataSpec) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(CachedDataSourceFactory.CACHE_DEBUG_TAG);
            d5z0Var.o("Try put to cache " + dataSpec.a, new Object[0]);
            this.realDataSink.open(dataSpec);
        }

        @Override // defpackage.hpg
        public void write(byte[] p0, int p1, int p2) {
            this.realDataSink.write(p0, p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/impl/source/CachedDataSourceFactory$DebugTryGetFromCacheDataSource;", "Lkpg;", "Lra7;", "cache", "realDataSource", "<init>", "(Lra7;Lkpg;)V", "Lcj01;", "p0", "Lzy11;", "addTransferListener", "(Lcj01;)V", "close", "()V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "p1", "p2", "read", "([BII)I", "Lnpg;", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "Lra7;", "Lkpg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DebugTryGetFromCacheDataSource implements kpg {
        private final ra7 cache;
        private final kpg realDataSource;

        public DebugTryGetFromCacheDataSource(ra7 ra7Var, kpg kpgVar) {
            this.cache = ra7Var;
            this.realDataSource = kpgVar;
        }

        @Override // defpackage.kpg
        public void addTransferListener(cj01 p0) {
            this.realDataSource.addTransferListener(p0);
        }

        @Override // defpackage.kpg
        public void close() {
            this.realDataSource.close();
        }

        @Override // defpackage.kpg
        public Map getResponseHeaders() {
            return Collections.EMPTY_MAP;
        }

        @Override // defpackage.kpg
        /* renamed from: getUri */
        public Uri getInflatedUri() {
            return this.realDataSource.getInflatedUri();
        }

        @Override // defpackage.kpg
        public long open(npg dataSpec) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(CachedDataSourceFactory.CACHE_DEBUG_TAG);
            d5z0Var.a(CacheMissLogger.INSTANCE.logContainInCache(this.cache, dataSpec), new Object[0]);
            return this.realDataSource.open(dataSpec);
        }

        @Override // defpackage.apg
        public int read(byte[] p0, int p1, int p2) {
            return this.realDataSource.read(p0, p1, p2);
        }
    }

    public /* synthetic */ CachedDataSourceFactory(ra7 ra7Var, OkHttpClient okHttpClient, pb7 pb7Var, CachedDataSourceConfig cachedDataSourceConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ra7Var, okHttpClient, (i & 4) != 0 ? null : pb7Var, (i & 8) != 0 ? CachedDataSourceConfigKt.CachedDataSourceConfig$default(null, 1, null) : cachedDataSourceConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kpg provideCacheReadDataSourceFactory(ra7 parentCache) {
        FileDataSource.a aVar = new FileDataSource.a();
        FileDataSource fileDataSource = new FileDataSource();
        cj01 cj01Var = aVar.a;
        if (cj01Var != null) {
            fileDataSource.addTransferListener(cj01Var);
        }
        return this.config.getEnableDebugCacheMiss() ? new DebugTryGetFromCacheDataSource(parentCache, fileDataSource) : fileDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hpg provideCacheWriteDataSinkFactory(ra7 parentCache) {
        bb7 bb7Var = new bb7();
        bb7Var.a = parentCache;
        hpg c = bb7Var.c();
        return this.config.getEnableDebugCacheMiss() ? new DebugPutToCacheDataSink(c) : c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kpg provideUpstreamDataSourceFactory(ra7 parentCache, ipg dataSourceFactory) {
        kpg createDataSource = dataSourceFactory.createDataSource();
        return this.config.getEnableDebugCacheMiss() ? new DebugCacheMissDataSource(parentCache, createDataSource) : createDataSource;
    }

    private final void tryEnableDebugCacheMiss(zk51 zk51Var) {
        if (this.config.getEnableDebugCacheMiss()) {
            zk51Var.A = new yk51() { // from class: ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory$tryEnableDebugCacheMiss$1
                @Override // defpackage.yk51
                public void onCacheIgnored(int reason) {
                    d5z0 d5z0Var = h5z0.a;
                    d5z0Var.t("CACHE_DEBUG");
                    d5z0Var.o("onCacheIgnored. Reason " + reason, new Object[0]);
                }

                @Override // defpackage.yk51
                public void onCachedBytesRead(long cacheSizeBytes, long cachedBytesRead) {
                }
            };
        }
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(cj01 transferListener) {
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(this.okHttpClient, null, 2, null);
        NetPerfEventTrackerFactory netPerfEventTrackerFactory = this.netPerfEventTrackerFactory;
        if (netPerfEventTrackerFactory != null) {
            defaultDataSourceFactory.setNetPerfEventTrackerFactory(netPerfEventTrackerFactory);
        }
        final ipg create = defaultDataSourceFactory.create(transferListener);
        zk51 zk51Var = new zk51();
        final ra7 ra7Var = this.cache;
        pb7 pb7Var = this.cacheKeyFactory;
        boolean isNetPerfEnabled = getIsNetPerfEnabled();
        int i = 3;
        int i2 = this.config.getEnableFallbackToUpstream() ? 11 : 3;
        zk51Var.a = ra7Var;
        zk51Var.y = new ipg() { // from class: fd7
            @Override // defpackage.ipg
            public final kpg createDataSource() {
                kpg provideUpstreamDataSourceFactory;
                provideUpstreamDataSourceFactory = CachedDataSourceFactory.this.provideUpstreamDataSourceFactory(ra7Var, create);
                return provideUpstreamDataSourceFactory;
            }
        };
        zk51Var.b = new ic7(this, ra7Var);
        PreloadLiveDashConfig experimentalPreloadLiveDashConfig = this.config.getExperimentalPreloadLiveDashConfig();
        if (this.config.getEnableCacheWriteWhileWatching()) {
            zk51Var.c = new e90(i, this, ra7Var);
            zk51Var.x = false;
        } else {
            zk51Var.c = null;
            zk51Var.x = true;
        }
        if (experimentalPreloadLiveDashConfig != null) {
            zk51Var.C = experimentalPreloadLiveDashConfig;
        }
        zk51Var.z = i2;
        zk51Var.B = isNetPerfEnabled;
        tryEnableDebugCacheMiss(zk51Var);
        if (pb7Var != null) {
            zk51Var.w = pb7Var;
        }
        return zk51Var;
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    public String getClassName() {
        return this.className;
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    /* renamed from: isNetPerfEnabled */
    public boolean getIsNetPerfEnabled() {
        return this.netPerfEventTrackerFactory != null;
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public void setNetPerfEventTrackerFactory(NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
        this.netPerfEventTrackerFactory = netPerfEventTrackerFactory;
    }

    public CachedDataSourceFactory(ra7 ra7Var, OkHttpClient okHttpClient, pb7 pb7Var, CachedDataSourceConfig cachedDataSourceConfig) {
        this.cache = ra7Var;
        this.okHttpClient = okHttpClient;
        this.cacheKeyFactory = pb7Var;
        this.config = cachedDataSourceConfig;
        this.className = "CachedDataSourceFactory";
    }
}
