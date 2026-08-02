package ru.yandex.video.m3.player.impl.source;

import android.net.Uri;
import androidx.media3.datasource.FileDataSource;
import defpackage.ag9;
import defpackage.aw60;
import defpackage.bb7;
import defpackage.cj01;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.hpg;
import defpackage.i3y;
import defpackage.ipg;
import defpackage.kbs;
import defpackage.kpg;
import defpackage.npg;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.sls;
import defpackage.tls;
import defpackage.ya7;
import defpackage.yk51;
import defpackage.zk51;
import defpackage.zy11;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.cache.CacheProvider;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DataSourceParametersKt;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceFactoryCreatorConfig;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.player.impl.cache.CacheMissLogger;
import ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator;
import ru.yandex.video.m3.player.netperf.NetPerfCallFactory;
import ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.source.DataSourceFactoryCreator;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0004DEFGB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJB\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u0082\u0002\u0014\n\u0012\b\u0000\u0012\u0002\u0018\u0000\u001a\n\b\u0003\u0010\u00022\u0004\b\u0003\u0010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010*\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b*\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultDataSourceFactoryCreator;", "Lru/yandex/video/m3/source/DataSourceFactoryCreator;", "Lru/yandex/video/m3/player/impl/NetPerfMarker;", "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "fallbackOkHttpClientProvider", "<init>", "(Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;Lsls;)V", "", "wantsCache", "Lra7;", "cache", "Lpb7;", "cacheKeyFactory", "checkCacheIsSatisfied", "(ZLra7;Lpb7;)Z", "Lru/yandex/video/m3/data/DataSourceParameters;", "sourceParameters", "Lru/yandex/video/m3/player/impl/source/LiveSessionDataSourceDecoratorFactory;", "createUpstreamDataSourceFactory", "(Lru/yandex/video/m3/data/DataSourceParameters;)Lru/yandex/video/m3/player/impl/source/LiveSessionDataSourceDecoratorFactory;", "Lzk51;", "Lzy11;", "tryEnableDebugCacheMiss", "(Lzk51;)V", "parentCache", "Lhpg;", "provideCacheWriteDataSinkFactory", "(Lra7;)Lhpg;", "Lkpg;", "provideCacheReadDataSourceFactory", "(Lra7;)Lkpg;", "Lipg;", "httpDataSourceFactory", "provideUpstreamDataSourceFactory", "(Lra7;Lipg;)Lkpg;", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "create", "(Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/PlaybackParameters;)Lipg;", "Lcj01;", "transferListener", "(Lcj01;)Lipg;", "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "Lsls;", "", "className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "failFast", "Z", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/player/netperf/NetPerfCallFactory;", "netPerfCallFactory$delegate", "Li3y;", "getNetPerfCallFactory", "()Lru/yandex/video/m3/player/netperf/NetPerfCallFactory;", "netPerfCallFactory", "isNetPerfEnabled", "()Z", "Companion", "DebugCacheMissDataSource", "DebugPutToCacheDataSink", "DebugTryGetFromCacheDataSource", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultDataSourceFactoryCreator implements DataSourceFactoryCreator, NetPerfMarker {
    private static final String CACHE_DEBUG_TAG = "CACHE_DEBUG";
    private final DefaultDataSourceFactoryCreatorConfig config;
    private final boolean failFast;
    private final sls fallbackOkHttpClientProvider;
    private final PlayerLogger logger;
    private final NetPerfEventTrackerFactory netPerfEventTrackerFactory;
    public static final int $stable = 8;
    private final String className = "DefaultDataSourceFactoryCreator";

    /* renamed from: netPerfCallFactory$delegate, reason: from kotlin metadata */
    private final i3y netPerfCallFactory = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$netPerfCallFactory$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final NetPerfCallFactory invoke() {
            DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig;
            NetPerfEventTrackerFactory netPerfEventTrackerFactory;
            sls slsVar;
            defaultDataSourceFactoryCreatorConfig = DefaultDataSourceFactoryCreator.this.config;
            OkHttpClient okHttpClient = defaultDataSourceFactoryCreatorConfig.getOkHttpClient();
            if (okHttpClient == null) {
                slsVar = DefaultDataSourceFactoryCreator.this.fallbackOkHttpClientProvider;
                okHttpClient = (OkHttpClient) slsVar.invoke();
            }
            netPerfEventTrackerFactory = DefaultDataSourceFactoryCreator.this.netPerfEventTrackerFactory;
            return new NetPerfCallFactory(okHttpClient, null, null, netPerfEventTrackerFactory, 6, null);
        }
    });
    private final boolean isNetPerfEnabled = true;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultDataSourceFactoryCreator$DebugCacheMissDataSource;", "Lkpg;", "Lra7;", "cache", "realDataSource", "<init>", "(Lra7;Lkpg;)V", "Lcj01;", "p0", "Lzy11;", "addTransferListener", "(Lcj01;)V", "close", "()V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "p1", "p2", "read", "([BII)I", "Lnpg;", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "Lra7;", "Lkpg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            d5z0Var.t(DefaultDataSourceFactoryCreator.CACHE_DEBUG_TAG);
            d5z0Var.o(CacheMissLogger.INSTANCE.logCacheMiss(this.cache, dataSpec, true), new Object[0]);
            return this.realDataSource.open(dataSpec);
        }

        @Override // defpackage.apg
        public int read(byte[] p0, int p1, int p2) {
            return this.realDataSource.read(p0, p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultDataSourceFactoryCreator$DebugPutToCacheDataSink;", "Lhpg;", "realDataSink", "<init>", "(Lhpg;)V", "Lzy11;", "close", "()V", "", "p0", "", "p1", "p2", "write", "([BII)V", "Lnpg;", "dataSpec", OpenList.STR_OPEN, "(Lnpg;)V", "Lhpg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            d5z0Var.t(DefaultDataSourceFactoryCreator.CACHE_DEBUG_TAG);
            d5z0Var.o("Try put to cache " + dataSpec.a, new Object[0]);
            this.realDataSink.open(dataSpec);
        }

        @Override // defpackage.hpg
        public void write(byte[] p0, int p1, int p2) {
            this.realDataSink.write(p0, p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultDataSourceFactoryCreator$DebugTryGetFromCacheDataSource;", "Lkpg;", "Lra7;", "cache", "realDataSource", "<init>", "(Lra7;Lkpg;)V", "Lcj01;", "p0", "Lzy11;", "addTransferListener", "(Lcj01;)V", "close", "()V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "p1", "p2", "read", "([BII)I", "Lnpg;", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "Lra7;", "Lkpg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            d5z0Var.t(DefaultDataSourceFactoryCreator.CACHE_DEBUG_TAG);
            d5z0Var.a(CacheMissLogger.INSTANCE.logContainInCache(this.cache, dataSpec), new Object[0]);
            return this.realDataSource.open(dataSpec);
        }

        @Override // defpackage.apg
        public int read(byte[] p0, int p1, int p2) {
            return this.realDataSource.read(p0, p1, p2);
        }
    }

    public DefaultDataSourceFactoryCreator(DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig, NetPerfEventTrackerFactory netPerfEventTrackerFactory, sls slsVar) {
        this.config = defaultDataSourceFactoryCreatorConfig;
        this.netPerfEventTrackerFactory = netPerfEventTrackerFactory;
        this.fallbackOkHttpClientProvider = slsVar;
        this.failFast = defaultDataSourceFactoryCreatorConfig.getFailFast();
        this.logger = defaultDataSourceFactoryCreatorConfig.getPlayerLogger();
    }

    private final boolean checkCacheIsSatisfied(boolean wantsCache, ra7 cache, pb7 cacheKeyFactory) {
        boolean z = (cache == null || cacheKeyFactory == null) ? false : true;
        if (!wantsCache || z) {
            return true;
        }
        String str = (cache == null && cacheKeyFactory == null) ? "Can not read/write cache, cache and cacheKeyFactory are null" : cache == null ? "Can not read/write cache, cache is null" : "Can not read/write cache, cacheKeyFactory is null";
        if (this.failFast) {
            kbs.g(str);
            return false;
        }
        PlayerLogger.error$default(this.logger, getClassName(), "checkCacheIsSatisfied", str, null, new Object[0], 8, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kpg create$lambda$4$lambda$1(sls slsVar) {
        return (kpg) slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kpg create$lambda$4$lambda$2(sls slsVar) {
        return (kpg) slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hpg create$lambda$4$lambda$3(sls slsVar) {
        return (hpg) slsVar.invoke();
    }

    private final LiveSessionDataSourceDecoratorFactory createUpstreamDataSourceFactory(DataSourceParameters sourceParameters) {
        aw60 aw60Var = new aw60(getNetPerfCallFactory());
        aw60Var.c = sourceParameters.getTransferListener();
        ya7 ya7Var = new ya7();
        ya7Var.a = true;
        ya7Var.b = true;
        aw60Var.w = ya7Var.a();
        return new LiveSessionDataSourceDecoratorFactory(aw60Var, getIsNetPerfEnabled(), getClassName());
    }

    private final NetPerfCallFactory getNetPerfCallFactory() {
        return (NetPerfCallFactory) this.netPerfCallFactory.getValue();
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
    public final kpg provideUpstreamDataSourceFactory(ra7 parentCache, ipg httpDataSourceFactory) {
        kpg createDataSource = httpDataSourceFactory.createDataSource();
        return (!this.config.getEnableDebugCacheMiss() || parentCache == null) ? createDataSource : new DebugCacheMissDataSource(parentCache, createDataSource);
    }

    private final void tryEnableDebugCacheMiss(zk51 zk51Var) {
        if (this.config.getEnableDebugCacheMiss()) {
            zk51Var.A = new yk51() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$tryEnableDebugCacheMiss$1
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.source.DataSourceFactoryCreator
    public ipg create(DataSourceParameters sourceParameters, PlaybackParameters playbackParameters) {
        final sls slsVar;
        int i;
        CacheProvider cacheProvider = this.config.getCacheProvider();
        final ra7 cache = cacheProvider != null ? cacheProvider.getCache(playbackParameters) : null;
        CacheProvider cacheProvider2 = this.config.getCacheProvider();
        pb7 cacheKeyFactory = cacheProvider2 != null ? cacheProvider2.getCacheKeyFactory(playbackParameters) : null;
        boolean isNetPerfEnabled = getIsNetPerfEnabled();
        Object[] objArr = 0;
        final int i2 = 1;
        boolean z = sourceParameters.getCanWriteToCache() || sourceParameters.getCanReadFromCache();
        final LiveSessionDataSourceDecoratorFactory createUpstreamDataSourceFactory = createUpstreamDataSourceFactory(sourceParameters);
        if (!z || !checkCacheIsSatisfied(z, cache, cacheKeyFactory)) {
            return createUpstreamDataSourceFactory;
        }
        zk51 zk51Var = new zk51();
        PreloadLiveDashConfig experimentalPreloadLiveDashConfig = this.config.getExperimentalPreloadLiveDashConfig();
        Object[] objArr2 = experimentalPreloadLiveDashConfig != null && experimentalPreloadLiveDashConfig.getLiveDashPreloadEnabled();
        zk51Var.a = cache;
        zk51Var.w = cacheKeyFactory;
        if (experimentalPreloadLiveDashConfig != null) {
            zk51Var.C = experimentalPreloadLiveDashConfig;
        }
        if (sourceParameters.getCanReadFromUpstream()) {
            i = this.config.getEnableFallbackToUpstream() ? 11 : 3;
            slsVar = new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$create$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final kpg invoke() {
                    kpg provideUpstreamDataSourceFactory;
                    provideUpstreamDataSourceFactory = DefaultDataSourceFactoryCreator.this.provideUpstreamDataSourceFactory(cache, createUpstreamDataSourceFactory);
                    return provideUpstreamDataSourceFactory;
                }
            };
        } else {
            slsVar = new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$create$1$3
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final kpg invoke() {
                    return new NotCachedDataSource(ra7.this, true);
                }
            };
            i = 1;
        }
        final Object[] objArr3 = objArr == true ? 1 : 0;
        zk51Var.y = new ipg() { // from class: n9h
            @Override // defpackage.ipg
            public final kpg createDataSource() {
                kpg create$lambda$4$lambda$1;
                kpg create$lambda$4$lambda$2;
                int i3 = objArr3;
                sls slsVar2 = slsVar;
                switch (i3) {
                    case 0:
                        create$lambda$4$lambda$1 = DefaultDataSourceFactoryCreator.create$lambda$4$lambda$1(slsVar2);
                        return create$lambda$4$lambda$1;
                    default:
                        create$lambda$4$lambda$2 = DefaultDataSourceFactoryCreator.create$lambda$4$lambda$2(slsVar2);
                        return create$lambda$4$lambda$2;
                }
            }
        };
        final sls slsVar2 = sourceParameters.getCanReadFromCache() ? new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$create$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final kpg invoke() {
                kpg provideCacheReadDataSourceFactory;
                provideCacheReadDataSourceFactory = DefaultDataSourceFactoryCreator.this.provideCacheReadDataSourceFactory(cache);
                return provideCacheReadDataSourceFactory;
            }
        } : new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$create$1$5
            {
                super(0);
            }

            @Override // defpackage.sls
            public final kpg invoke() {
                return new NotCachedDataSource(ra7.this, true);
            }
        };
        zk51Var.b = new ipg() { // from class: n9h
            @Override // defpackage.ipg
            public final kpg createDataSource() {
                kpg create$lambda$4$lambda$1;
                kpg create$lambda$4$lambda$2;
                int i3 = i2;
                sls slsVar22 = slsVar2;
                switch (i3) {
                    case 0:
                        create$lambda$4$lambda$1 = DefaultDataSourceFactoryCreator.create$lambda$4$lambda$1(slsVar22);
                        return create$lambda$4$lambda$1;
                    default:
                        create$lambda$4$lambda$2 = DefaultDataSourceFactoryCreator.create$lambda$4$lambda$2(slsVar22);
                        return create$lambda$4$lambda$2;
                }
            }
        };
        sls slsVar3 = (!sourceParameters.getCanWriteToCache() || objArr2 == true) ? null : new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$create$1$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final hpg invoke() {
                hpg provideCacheWriteDataSinkFactory;
                provideCacheWriteDataSinkFactory = DefaultDataSourceFactoryCreator.this.provideCacheWriteDataSinkFactory(cache);
                return provideCacheWriteDataSinkFactory;
            }
        };
        ag9 ag9Var = slsVar3 != null ? new ag9(slsVar3) : null;
        zk51Var.c = ag9Var;
        zk51Var.x = ag9Var == null;
        zk51Var.z = i;
        zk51Var.B = isNetPerfEnabled;
        tryEnableDebugCacheMiss(zk51Var);
        return zk51Var;
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

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(final cj01 transferListener) {
        PlayerLogger.error$default(this.logger, getClassName(), "create(TransferListener?)", "This method is deprecated. Use `create(DataSourceParameters, PlaybackParameters?)` instead. Falling back to create(\n        DataSourceParameters,\n        PlaybackParameters?,\n    ) with defaults.", null, new Object[0], 8, null);
        return create(DataSourceParametersKt.DataSourceParameters(new tls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator$create$2
            {
                super(1);
            }

            public final void invoke(DataSourceParameters.Builder builder) {
                builder.m733setCanReadFromUpstream(true);
                builder.m734setCanWriteToCache(false);
                builder.m732setCanReadFromCache(false);
                builder.m735setTransferListener(cj01.this);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DataSourceParameters.Builder) obj);
                return zy11.a;
            }
        }), null);
    }
}
