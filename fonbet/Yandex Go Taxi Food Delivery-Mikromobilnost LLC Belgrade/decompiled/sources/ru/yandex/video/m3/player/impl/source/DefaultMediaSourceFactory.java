package ru.yandex.video.m3.player.impl.source;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.source.hls.playlist.YandexHlsPlaylistParser;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.bou;
import defpackage.cj01;
import defpackage.d6z;
import defpackage.fe10;
import defpackage.gg90;
import defpackage.ic7;
import defpackage.ipg;
import defpackage.jch;
import defpackage.jxi;
import defpackage.kpg;
import defpackage.lbh;
import defpackage.ny61;
import defpackage.o5r;
import defpackage.oyr;
import defpackage.qeh;
import defpackage.qmm;
import defpackage.rf10;
import defpackage.skf0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.td10;
import defpackage.tis0;
import defpackage.tw21;
import defpackage.twy;
import defpackage.uf10;
import defpackage.unu;
import defpackage.xd10;
import defpackage.yd10;
import defpackage.ynu;
import defpackage.zk51;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DataSourceParametersKt;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceFactoryCreatorConfig;
import ru.yandex.video.m3.model.config.mediasource.LivePlaybackConfig;
import ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig;
import ru.yandex.video.m3.model.config.mediasource.MediaSourceConfig;
import ru.yandex.video.m3.model.config.mediasource.MediaSourceConfigKt;
import ru.yandex.video.m3.player.CurrentBufferLengthProvider;
import ru.yandex.video.m3.player.MediaSourceListener;
import ru.yandex.video.m3.player.baseurls.BaseUrlsManagerProvider;
import ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManagerImpl;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.impl.NetPerfMarker;
import ru.yandex.video.m3.player.impl.source.SimpleDataSourceFactoryCreator;
import ru.yandex.video.m3.player.impl.source.dash.BaseUrlCheckerImpl;
import ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolderImpl;
import ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolderImpl;
import ru.yandex.video.m3.player.impl.source.dash.YandexDashChunkSourceFactory;
import ru.yandex.video.m3.player.impl.source.dash.manifest.ExtendedDashManifestParserCreator;
import ru.yandex.video.m3.player.impl.source.dash.manifest.SupplementalPropertiesInPeriodParseListener;
import ru.yandex.video.m3.player.impl.source.dash.manifest.ThumbnailsEssentialPropertiesParseListener;
import ru.yandex.video.m3.player.impl.source.hls.DummyUrlModifier;
import ru.yandex.video.m3.player.impl.source.hls.UrlModifier;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;
import ru.yandex.video.m3.player.impl.utils.LoadErrorHandlingPolicyImpl;
import ru.yandex.video.m3.player.impl.utils.UrlModifierHelper;
import ru.yandex.video.m3.player.netperf.DefaultNetPerfApiSendUrlBuilder;
import ru.yandex.video.m3.player.netperf.NetPerfManager;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.source.DataSourceFactory;
import ru.yandex.video.m3.source.DataSourceFactoryCreator;
import ru.yandex.video.m3.source.DefaultTrackFilterProviderKt;
import ru.yandex.video.m3.source.MediaSourceFactory;
import ru.yandex.video.m3.source.MediaSourceParameters;
import ru.yandex.video.m3.source.TrackFilterProvider;
import ru.yandex.video.m3.source.TrackItem;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 B2\u00020\u0001:\u0005CBDEFBM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jc\u0010%\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&Jy\u00102\u001a\u0002012\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00106\u001a\u00020\rH\u0000¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u00020$2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010A¨\u0006G"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory;", "Lru/yandex/video/m3/source/MediaSourceFactory;", "Lru/yandex/video/m3/source/DataSourceFactoryCreator;", "manifestDataSourceFactoryCreator", "chunkDataSourceFactoryCreator", "Lru/yandex/video/m3/source/TrackFilterProvider;", "trackFilterProvider", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;", "supplementalPropertiesInPeriodParseListener", "Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;", "thumbnailsEssentialPropertiesParseListener", "Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "netPerfManager", "<init>", "(Lru/yandex/video/m3/source/DataSourceFactoryCreator;Lru/yandex/video/m3/source/DataSourceFactoryCreator;Lru/yandex/video/m3/source/TrackFilterProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;Lru/yandex/video/m3/player/netperf/NetPerfManager;)V", "", "url", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "drmSessionManager", "Lcj01;", "transferListener", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "currentBufferLengthProvider", "Lru/yandex/video/m3/player/MediaSourceListener;", "mediaSourceListener", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "playbackFeaturesProvider", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "chunkDataSourceParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Luf10;", "createInternal", "(Ljava/lang/String;Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;Lcj01;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;Lru/yandex/video/m3/player/MediaSourceListener;Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/PlaybackParameters;)Luf10;", "Lipg;", "chunkDataSourceFactory", "manifestDataSourceFactory", "Ltwy;", "loadErrorHandlingPolicy", "Landroid/net/Uri;", "originalManifestUri", "originalPlayerVsid", "", "shouldUseLowLatency", "Lrf10;", "createDashMediaSourceFactory", "(Lcj01;Lipg;Lipg;Ltwy;Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;Landroid/net/Uri;Ljava/lang/String;Lru/yandex/video/m3/player/MediaSourceListener;ZLru/yandex/video/m3/source/TrackFilterProvider;Lru/yandex/video/m3/data/PlaybackParameters;)Lrf10;", "getConfig$video_player_internalRelease", "()Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "getConfig", "Lru/yandex/video/m3/source/MediaSourceParameters;", "parameters", "create", "(Lru/yandex/video/m3/source/MediaSourceParameters;)Luf10;", "Lru/yandex/video/m3/source/DataSourceFactoryCreator;", "Lru/yandex/video/m3/source/TrackFilterProvider;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;", "Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;", "Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "Companion", "Builder", "FilteringHlsPlaylistParserFactory", "FilteringManifestParser", "HlsUrlModifier", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DefaultMediaSourceFacto";
    private final DataSourceFactoryCreator chunkDataSourceFactoryCreator;
    private final MediaSourceConfig config;
    private final DataSourceFactoryCreator manifestDataSourceFactoryCreator;
    private final NetPerfManager netPerfManager;
    private final PlayerLogger playerLogger;
    private final SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener;
    private final ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener;
    private final TrackFilterProvider trackFilterProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory$Builder;", "", "()V", "chunkDataSourceFactory", "Lru/yandex/video/m3/source/DataSourceFactory;", "getChunkDataSourceFactory$annotations", "getChunkDataSourceFactory", "()Lru/yandex/video/m3/source/DataSourceFactory;", "setChunkDataSourceFactory", "(Lru/yandex/video/m3/source/DataSourceFactory;)V", "chunkDataSourceFactoryCreatorConfig", "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;", "getChunkDataSourceFactoryCreatorConfig", "()Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;", "setChunkDataSourceFactoryCreatorConfig", "(Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;)V", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "getConfig", "()Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "setConfig", "(Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;)V", "manifestDataSourceFactory", "getManifestDataSourceFactory$annotations", "getManifestDataSourceFactory", "setManifestDataSourceFactory", "manifestDataSourceFactoryCreatorConfig", "getManifestDataSourceFactoryCreatorConfig", "setManifestDataSourceFactoryCreatorConfig", "perfTrackingUrl", "Lru/yandex/video/m3/data/network/UrlParams;", "getPerfTrackingUrl$video_player_internalRelease", "()Lru/yandex/video/m3/data/network/UrlParams;", "setPerfTrackingUrl$video_player_internalRelease", "(Lru/yandex/video/m3/data/network/UrlParams;)V", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "setPlayerLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "supplementalPropertiesInPeriodParseListener", "Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;", "getSupplementalPropertiesInPeriodParseListener", "()Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;", "setSupplementalPropertiesInPeriodParseListener", "(Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;)V", "thumbnailsEssentialPropertiesParseListener", "Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;", "getThumbnailsEssentialPropertiesParseListener", "()Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;", "setThumbnailsEssentialPropertiesParseListener", "(Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;)V", "trackFilterProvider", "Lru/yandex/video/m3/source/TrackFilterProvider;", "getTrackFilterProvider", "()Lru/yandex/video/m3/source/TrackFilterProvider;", "setTrackFilterProvider", "(Lru/yandex/video/m3/source/TrackFilterProvider;)V", "build", "Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DataSourceFactory chunkDataSourceFactory;
        private DefaultDataSourceFactoryCreatorConfig chunkDataSourceFactoryCreatorConfig;
        private MediaSourceConfig config;
        private DataSourceFactory manifestDataSourceFactory;
        private DefaultDataSourceFactoryCreatorConfig manifestDataSourceFactoryCreatorConfig;
        private UrlParams perfTrackingUrl;
        private PlayerLogger playerLogger;
        private SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener;
        private ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener;
        private TrackFilterProvider trackFilterProvider;

        @jxi
        public static /* synthetic */ void getChunkDataSourceFactory$annotations() {
        }

        @jxi
        public static /* synthetic */ void getManifestDataSourceFactory$annotations() {
        }

        public final DefaultMediaSourceFactory build$video_player_internalRelease() {
            DataSourceFactoryCreator fromDataSourceFactory;
            DataSourceFactoryCreator fromDataSourceFactory2;
            final OkHttpClient okHttpClient = new OkHttpClient();
            NetPerfManager netPerfManager = new NetPerfManager(okHttpClient, null, 0L, null, null, new DefaultNetPerfApiSendUrlBuilder(this.perfTrackingUrl), null, 94, null);
            DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig = this.manifestDataSourceFactoryCreatorConfig;
            if (defaultDataSourceFactoryCreatorConfig != null) {
                fromDataSourceFactory = new DefaultDataSourceFactoryCreator(defaultDataSourceFactoryCreatorConfig, netPerfManager.getNetPerfEventTrackerFactory(), new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory$Builder$build$manifestDataSourceFactoryCreator$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final OkHttpClient invoke() {
                        return OkHttpClient.this;
                    }
                });
            } else {
                SimpleDataSourceFactoryCreator.Companion companion = SimpleDataSourceFactoryCreator.INSTANCE;
                DataSourceFactory dataSourceFactory = this.manifestDataSourceFactory;
                if (dataSourceFactory == null) {
                    dataSourceFactory = new DefaultDataSourceFactory(okHttpClient, null, 2, null);
                }
                fromDataSourceFactory = companion.fromDataSourceFactory(dataSourceFactory, netPerfManager.getNetPerfEventTrackerFactory());
            }
            DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig2 = this.chunkDataSourceFactoryCreatorConfig;
            if (defaultDataSourceFactoryCreatorConfig2 != null) {
                fromDataSourceFactory2 = new DefaultDataSourceFactoryCreator(defaultDataSourceFactoryCreatorConfig2, netPerfManager.getNetPerfEventTrackerFactory(), new sls() { // from class: ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory$Builder$build$chunkDataSourceFactoryCreator$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final OkHttpClient invoke() {
                        return OkHttpClient.this;
                    }
                });
            } else {
                SimpleDataSourceFactoryCreator.Companion companion2 = SimpleDataSourceFactoryCreator.INSTANCE;
                DataSourceFactory dataSourceFactory2 = this.chunkDataSourceFactory;
                if (dataSourceFactory2 == null) {
                    dataSourceFactory2 = new DefaultDataSourceFactory(okHttpClient, null, 2, null);
                }
                fromDataSourceFactory2 = companion2.fromDataSourceFactory(dataSourceFactory2, netPerfManager.getNetPerfEventTrackerFactory());
            }
            TrackFilterProvider trackFilterProvider = this.trackFilterProvider;
            if (trackFilterProvider == null) {
                trackFilterProvider = DefaultTrackFilterProviderKt.DefaultTrackFilterProvider();
            }
            PlayerLogger playerLogger = this.playerLogger;
            if (playerLogger == null) {
                playerLogger = new DummyPlayerLogger();
            }
            SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener = this.supplementalPropertiesInPeriodParseListener;
            ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener = this.thumbnailsEssentialPropertiesParseListener;
            MediaSourceConfig mediaSourceConfig = this.config;
            if (mediaSourceConfig == null) {
                mediaSourceConfig = MediaSourceConfigKt.MediaSourceConfig$default(null, 1, null);
            }
            DataSourceFactoryCreator dataSourceFactoryCreator = fromDataSourceFactory2;
            return new DefaultMediaSourceFactory(fromDataSourceFactory, dataSourceFactoryCreator, trackFilterProvider, playerLogger, supplementalPropertiesInPeriodParseListener, thumbnailsEssentialPropertiesParseListener, mediaSourceConfig, netPerfManager, null);
        }

        public final DataSourceFactory getChunkDataSourceFactory() {
            return this.chunkDataSourceFactory;
        }

        public final DefaultDataSourceFactoryCreatorConfig getChunkDataSourceFactoryCreatorConfig() {
            return this.chunkDataSourceFactoryCreatorConfig;
        }

        public final MediaSourceConfig getConfig() {
            return this.config;
        }

        public final DataSourceFactory getManifestDataSourceFactory() {
            return this.manifestDataSourceFactory;
        }

        public final DefaultDataSourceFactoryCreatorConfig getManifestDataSourceFactoryCreatorConfig() {
            return this.manifestDataSourceFactoryCreatorConfig;
        }

        /* renamed from: getPerfTrackingUrl$video_player_internalRelease, reason: from getter */
        public final UrlParams getPerfTrackingUrl() {
            return this.perfTrackingUrl;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final SupplementalPropertiesInPeriodParseListener getSupplementalPropertiesInPeriodParseListener() {
            return this.supplementalPropertiesInPeriodParseListener;
        }

        public final ThumbnailsEssentialPropertiesParseListener getThumbnailsEssentialPropertiesParseListener() {
            return this.thumbnailsEssentialPropertiesParseListener;
        }

        public final TrackFilterProvider getTrackFilterProvider() {
            return this.trackFilterProvider;
        }

        public final void setChunkDataSourceFactory(DataSourceFactory dataSourceFactory) {
            this.chunkDataSourceFactory = dataSourceFactory;
        }

        public final void setChunkDataSourceFactoryCreatorConfig(DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig) {
            this.chunkDataSourceFactoryCreatorConfig = defaultDataSourceFactoryCreatorConfig;
        }

        public final void setConfig(MediaSourceConfig mediaSourceConfig) {
            this.config = mediaSourceConfig;
        }

        public final void setManifestDataSourceFactory(DataSourceFactory dataSourceFactory) {
            this.manifestDataSourceFactory = dataSourceFactory;
        }

        public final void setManifestDataSourceFactoryCreatorConfig(DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig) {
            this.manifestDataSourceFactoryCreatorConfig = defaultDataSourceFactoryCreatorConfig;
        }

        public final void setPerfTrackingUrl$video_player_internalRelease(UrlParams urlParams) {
            this.perfTrackingUrl = urlParams;
        }

        public final void setPlayerLogger(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
        }

        public final void setSupplementalPropertiesInPeriodParseListener(SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener) {
            this.supplementalPropertiesInPeriodParseListener = supplementalPropertiesInPeriodParseListener;
        }

        public final void setThumbnailsEssentialPropertiesParseListener(ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener) {
            this.thumbnailsEssentialPropertiesParseListener = thumbnailsEssentialPropertiesParseListener;
        }

        public final void setTrackFilterProvider(TrackFilterProvider trackFilterProvider) {
            this.trackFilterProvider = trackFilterProvider;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory$FilteringManifestParser;", "Lo5r;", "T", "Lgg90;", "parser", "Lru/yandex/video/m3/source/TrackFilterProvider;", "trackFilterProvider", "Landroid/net/Uri;", "originalManifestUri", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "<init>", "(Lgg90;Lru/yandex/video/m3/source/TrackFilterProvider;Landroid/net/Uri;Lru/yandex/video/m3/data/PlaybackParameters;)V", LaunchBrowserActivity.KEY_URI, "Ljava/io/InputStream;", "inputStream", "parse", "(Landroid/net/Uri;Ljava/io/InputStream;)Lo5r;", "Lgg90;", "Lru/yandex/video/m3/source/TrackFilterProvider;", "Landroid/net/Uri;", "Lru/yandex/video/m3/data/PlaybackParameters;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FilteringManifestParser<T extends o5r> implements gg90 {
        public static final int $stable = 8;
        private final Uri originalManifestUri;
        private final gg90 parser;
        private final PlaybackParameters playbackParameters;
        private final TrackFilterProvider trackFilterProvider;

        public FilteringManifestParser(gg90 gg90Var, TrackFilterProvider trackFilterProvider, Uri uri, PlaybackParameters playbackParameters) {
            this.parser = gg90Var;
            this.trackFilterProvider = trackFilterProvider;
            this.originalManifestUri = uri;
            this.playbackParameters = playbackParameters;
        }

        @Override // defpackage.gg90
        public T parse(Uri uri, InputStream inputStream) throws IOException {
            T t = (T) this.parser.parse(uri, inputStream);
            List<TrackItem> filter = this.trackFilterProvider.filter(this.originalManifestUri, this.playbackParameters);
            ArrayList arrayList = new ArrayList(tcc.n(filter, 10));
            for (TrackItem trackItem : filter) {
                arrayList.add(new StreamKey(trackItem.getPeriodIndex(), trackItem.getGroupIndex(), trackItem.getTrackIndex()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            T t2 = arrayList != null ? (T) t.copy(arrayList) : null;
            return t2 == null ? t : t2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory$HlsUrlModifier;", "Lru/yandex/video/m3/player/impl/source/hls/UrlModifier;", "originalPlayerVsid", "", "mediaSourceListener", "Lru/yandex/video/m3/player/MediaSourceListener;", "(Ljava/lang/String;Lru/yandex/video/m3/player/MediaSourceListener;)V", "modifyMediaPlaylistUrl", "url", "modifySegmentUrl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HlsUrlModifier implements UrlModifier {
        private final MediaSourceListener mediaSourceListener;
        private final String originalPlayerVsid;

        public HlsUrlModifier(String str, MediaSourceListener mediaSourceListener) {
            this.originalPlayerVsid = str;
            this.mediaSourceListener = mediaSourceListener;
        }

        @Override // ru.yandex.video.m3.player.impl.source.hls.UrlModifier
        public String modifyMediaPlaylistUrl(String url) {
            return modifySegmentUrl(url);
        }

        @Override // ru.yandex.video.m3.player.impl.source.hls.UrlModifier
        public String modifySegmentUrl(String url) {
            return UrlModifierHelper.INSTANCE.changeVsid(url, this.originalPlayerVsid, this.mediaSourceListener);
        }
    }

    private DefaultMediaSourceFactory(DataSourceFactoryCreator dataSourceFactoryCreator, DataSourceFactoryCreator dataSourceFactoryCreator2, TrackFilterProvider trackFilterProvider, PlayerLogger playerLogger, SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener, ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener, MediaSourceConfig mediaSourceConfig, NetPerfManager netPerfManager) {
        this.manifestDataSourceFactoryCreator = dataSourceFactoryCreator;
        this.chunkDataSourceFactoryCreator = dataSourceFactoryCreator2;
        this.trackFilterProvider = trackFilterProvider;
        this.playerLogger = playerLogger;
        this.supplementalPropertiesInPeriodParseListener = supplementalPropertiesInPeriodParseListener;
        this.thumbnailsEssentialPropertiesParseListener = thumbnailsEssentialPropertiesParseListener;
        this.config = mediaSourceConfig;
        this.netPerfManager = netPerfManager;
    }

    private final rf10 createDashMediaSourceFactory(cj01 transferListener, ipg chunkDataSourceFactory, ipg manifestDataSourceFactory, twy loadErrorHandlingPolicy, ExoDrmSessionManager drmSessionManager, CurrentBufferLengthProvider currentBufferLengthProvider, Uri originalManifestUri, String originalPlayerVsid, MediaSourceListener mediaSourceListener, boolean shouldUseLowLatency, TrackFilterProvider trackFilterProvider, PlaybackParameters playbackParameters) {
        ParsedBaseUrlsHolderImpl parsedBaseUrlsHolderImpl = new ParsedBaseUrlsHolderImpl();
        ParsedSegmentBaseHolderImpl parsedSegmentBaseHolderImpl = new ParsedSegmentBaseHolderImpl();
        BaseUrlsManagerProvider baseUrlsManagerProvider = new BaseUrlsManagerProvider(new BlacklistedBaseUrlsManagerImpl(new BaseUrlCheckerImpl(manifestDataSourceFactory)));
        String queryParameter = originalManifestUri.getQueryParameter(UriQueryParameters.INSTANCE.get(13).getName());
        zk51 zk51Var = manifestDataSourceFactory instanceof zk51 ? (zk51) manifestDataSourceFactory : null;
        FilteringManifestParser filteringManifestParser = new FilteringManifestParser(ExtendedDashManifestParserCreator.INSTANCE.create(parsedBaseUrlsHolderImpl, parsedSegmentBaseHolderImpl, this.supplementalPropertiesInPeriodParseListener, this.thumbnailsEssentialPropertiesParseListener, originalPlayerVsid, queryParameter, mediaSourceListener, zk51Var != null ? zk51Var.a : null, zk51Var != null ? zk51Var.w : null, Boolean.valueOf(this.config.getExperimentalPreloadLiveDashEnabled())), trackFilterProvider, originalManifestUri, playbackParameters);
        DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(new YandexDashChunkSourceFactory(parsedBaseUrlsHolderImpl, parsedSegmentBaseHolderImpl, baseUrlsManagerProvider, chunkDataSourceFactory, currentBufferLengthProvider, this.config.getRequestCMAFSegments(), this.playerLogger, 0, this.config.getValidateDashRangeRequests(), shouldUseLowLatency, this.config.getExperimentalAllowGzipSubtitles(), this.config.getExperimentalPreloadLiveDashEnabled(), 128, null), new ic7(2, manifestDataSourceFactory, transferListener));
        dashMediaSource$Factory.h = filteringManifestParser;
        dashMediaSource$Factory.c = new qeh(drmSessionManager, 3);
        d6z.u(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        dashMediaSource$Factory.e = loadErrorHandlingPolicy;
        return new DelegateMediaSourceFactory(baseUrlsManagerProvider, dashMediaSource$Factory, this.netPerfManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qmm createDashMediaSourceFactory$lambda$11$lambda$10(ExoDrmSessionManager exoDrmSessionManager, fe10 fe10Var) {
        return exoDrmSessionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kpg createDashMediaSourceFactory$lambda$9(ipg ipgVar, cj01 cj01Var) {
        kpg createDataSource = ipgVar.createDataSource();
        if (cj01Var != null) {
            createDataSource.addTransferListener(cj01Var);
        }
        return createDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final uf10 createInternal(String url, ExoDrmSessionManager drmSessionManager, cj01 transferListener, CurrentBufferLengthProvider currentBufferLengthProvider, MediaSourceListener mediaSourceListener, PlaybackFeaturesProvider playbackFeaturesProvider, DataSourceParameters manifestDataSourceParameters, DataSourceParameters chunkDataSourceParameters, PlaybackParameters playbackParameters) throws IllegalStateException {
        Object failure;
        ipg ipgVar;
        boolean z;
        Uri uri;
        rf10 rf10Var;
        String name;
        SsMediaSource$Factory ssMediaSource$Factory;
        SsMediaSource$Factory ssMediaSource$Factory2;
        LoadErrorHandlingPolicyImpl createLoadErrorHandlingPolicy$video_player_internalRelease = INSTANCE.createLoadErrorHandlingPolicy$video_player_internalRelease(url, this.config.getLoadErrorHandlingConfig(), playbackFeaturesProvider.getExpDoRetryForStreamResetException());
        int i = 1;
        ipg create = this.manifestDataSourceFactoryCreator.create(manifestDataSourceParameters == null ? DataSourceParametersKt.DataSourceParameters$default(null, 1, null) : manifestDataSourceParameters, playbackParameters);
        ipg create2 = this.chunkDataSourceFactoryCreator.create(chunkDataSourceParameters == null ? DataSourceParametersKt.DataSourceParameters$default(null, 1, null) : chunkDataSourceParameters, playbackParameters);
        boolean z2 = create2 instanceof NetPerfMarker;
        NetPerfMarker netPerfMarker = z2 ? (NetPerfMarker) create2 : null;
        int i2 = 0;
        boolean isNetPerfEnabled = netPerfMarker != null ? netPerfMarker.getIsNetPerfEnabled() : false;
        Uri parse = Uri.parse(url);
        int N = tw21.N(parse);
        try {
            failure = parse.getQueryParameter("vsid");
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        LivePlaybackConfig livePlaybackConfig = this.config.getLivePlaybackConfig();
        xd10 xd10Var = new xd10();
        xd10Var.a = livePlaybackConfig.getTargetOffsetMs();
        xd10Var.b = livePlaybackConfig.getMinTargetOffsetMs();
        xd10Var.c = livePlaybackConfig.getMaxTargetOffsetMs();
        xd10Var.d = livePlaybackConfig.getMinPlaybackSpeed();
        xd10Var.e = livePlaybackConfig.getMaxPlaybackSpeed();
        yd10 yd10Var = new yd10(xd10Var);
        if (N != 0) {
            if (N != 1) {
                int i3 = 2;
                if (N == 2) {
                    HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(create2);
                    uri = parse;
                    hlsMediaSource$Factory.e = new FilteringHlsPlaylistParserFactory(this.trackFilterProvider, uri, str, mediaSourceListener, playbackParameters);
                    d6z.u(createLoadErrorHandlingPolicy$video_player_internalRelease, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                    hlsMediaSource$Factory.i = createLoadErrorHandlingPolicy$video_player_internalRelease;
                    hlsMediaSource$Factory.h = new qeh(drmSessionManager, i);
                    hlsMediaSource$Factory.b = new jch(false);
                    ipgVar = create2;
                    ssMediaSource$Factory = hlsMediaSource$Factory;
                    z = isNetPerfEnabled;
                    rf10Var = ssMediaSource$Factory;
                } else {
                    if (N != 4) {
                        ny61.r(oyr.i(N, "Unsupported type: "));
                        return null;
                    }
                    skf0 skf0Var = new skf0(create2, new lbh());
                    d6z.u(createLoadErrorHandlingPolicy$video_player_internalRelease, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                    skf0Var.d = createLoadErrorHandlingPolicy$video_player_internalRelease;
                    skf0Var.c = new qeh(drmSessionManager, i3);
                    ssMediaSource$Factory2 = skf0Var;
                }
            } else {
                SsMediaSource$Factory ssMediaSource$Factory3 = new SsMediaSource$Factory(new tis0(create2), create);
                ssMediaSource$Factory3.g = new FilteringManifestParser(new SsManifestParser(), this.trackFilterProvider, parse, playbackParameters);
                d6z.u(createLoadErrorHandlingPolicy$video_player_internalRelease, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                ssMediaSource$Factory3.e = createLoadErrorHandlingPolicy$video_player_internalRelease;
                ssMediaSource$Factory3.d = new qeh(drmSessionManager, i2);
                ssMediaSource$Factory2 = ssMediaSource$Factory3;
            }
            uri = parse;
            ipgVar = create2;
            ssMediaSource$Factory = ssMediaSource$Factory2;
            z = isNetPerfEnabled;
            rf10Var = ssMediaSource$Factory;
        } else {
            ipgVar = create2;
            z = isNetPerfEnabled;
            rf10 createDashMediaSourceFactory = createDashMediaSourceFactory(transferListener, ipgVar, create, createLoadErrorHandlingPolicy$video_player_internalRelease, drmSessionManager, currentBufferLengthProvider, parse, str, mediaSourceListener, playbackFeaturesProvider.isLowLatency(), this.trackFilterProvider, playbackParameters);
            uri = parse;
            rf10Var = createDashMediaSourceFactory;
        }
        td10 td10Var = new td10();
        td10Var.b = uri;
        td10Var.k = yd10Var.a();
        uf10 createMediaSource = rf10Var.createMediaSource(td10Var.a());
        NetPerfMarker netPerfMarker2 = z2 ? (NetPerfMarker) ipgVar : null;
        if (netPerfMarker2 == null || (name = netPerfMarker2.getClassName()) == null) {
            name = ipgVar.getClass().getName();
        }
        return new NetPerfMediaSource(z, name, createMediaSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qmm createInternal$lambda$2$lambda$1(ExoDrmSessionManager exoDrmSessionManager, fe10 fe10Var) {
        return exoDrmSessionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qmm createInternal$lambda$4$lambda$3(ExoDrmSessionManager exoDrmSessionManager, fe10 fe10Var) {
        return exoDrmSessionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qmm createInternal$lambda$6$lambda$5(ExoDrmSessionManager exoDrmSessionManager, fe10 fe10Var) {
        return exoDrmSessionManager;
    }

    @Override // ru.yandex.video.m3.source.MediaSourceFactory
    public uf10 create(MediaSourceParameters parameters) throws IllegalStateException {
        String url = parameters.getUrl();
        ExoDrmSessionManager drmSessionManager = parameters.getDrmSessionManager();
        cj01 transferListener = parameters.getTransferListener();
        CurrentBufferLengthProvider currentBufferLengthProvider = parameters.getCurrentBufferLengthProvider();
        MediaSourceListener mediaSourceListener = parameters.getMediaSourceListener();
        PlaybackFeaturesProvider playbackFeaturesProvider = parameters.getPlaybackFeaturesProvider();
        DataSourceParameters manifestDataSourceParameters = parameters.getManifestDataSourceParameters();
        DataSourceParameters chunkDataSourceParameters = parameters.getChunkDataSourceParameters();
        DelegatePrepareParams prepareParams = parameters.getPrepareParams();
        return createInternal(url, drmSessionManager, transferListener, currentBufferLengthProvider, mediaSourceListener, playbackFeaturesProvider, manifestDataSourceParameters, chunkDataSourceParameters, prepareParams != null ? prepareParams.getPlaybackParameters() : null);
    }

    /* renamed from: getConfig$video_player_internalRelease, reason: from getter */
    public final MediaSourceConfig getConfig() {
        return this.config;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory$Companion;", "", "()V", "TAG", "", "createLoadErrorHandlingPolicy", "Lru/yandex/video/m3/player/impl/utils/LoadErrorHandlingPolicyImpl;", "url", "loadErrorHandlingConfig", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "expDoRetryForStreamResetException", "", "createLoadErrorHandlingPolicy$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoadErrorHandlingPolicyImpl createLoadErrorHandlingPolicy$video_player_internalRelease(String url, LoadErrorHandlingConfig loadErrorHandlingConfig, boolean expDoRetryForStreamResetException) {
            LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl = new LoadErrorHandlingPolicyImpl(loadErrorHandlingConfig.getMaxRetryDelayMs(), loadErrorHandlingConfig.getMinLoadableRetryCount());
            loadErrorHandlingPolicyImpl.setExpDoRetryForStreamResetException$video_player_internalRelease(expDoRetryForStreamResetException);
            return loadErrorHandlingPolicyImpl;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DefaultMediaSourceFactory(DataSourceFactoryCreator dataSourceFactoryCreator, DataSourceFactoryCreator dataSourceFactoryCreator2, TrackFilterProvider trackFilterProvider, PlayerLogger playerLogger, SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener, ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener, MediaSourceConfig mediaSourceConfig, NetPerfManager netPerfManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataSourceFactoryCreator, dataSourceFactoryCreator2, trackFilterProvider, playerLogger, supplementalPropertiesInPeriodParseListener, thumbnailsEssentialPropertiesParseListener, mediaSourceConfig, netPerfManager);
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DefaultMediaSourceFactory$FilteringHlsPlaylistParserFactory;", "Lbou;", "Lru/yandex/video/m3/source/TrackFilterProvider;", "trackFilterProvider", "Landroid/net/Uri;", "originalManifestUri", "", "originalPlayerVsid", "Lru/yandex/video/m3/player/MediaSourceListener;", "mediaSourceListener", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "<init>", "(Lru/yandex/video/m3/source/TrackFilterProvider;Landroid/net/Uri;Ljava/lang/String;Lru/yandex/video/m3/player/MediaSourceListener;Lru/yandex/video/m3/data/PlaybackParameters;)V", "Lgg90;", "Lznu;", "createPlaylistParser", "()Lgg90;", "Lynu;", "masterPlaylist", "Lunu;", "previousMediaPlaylist", "(Lynu;Lunu;)Lgg90;", "Lru/yandex/video/m3/source/TrackFilterProvider;", "Landroid/net/Uri;", "Lru/yandex/video/m3/data/PlaybackParameters;", "Lru/yandex/video/m3/player/impl/source/hls/UrlModifier;", "kotlin.jvm.PlatformType", "urlModifier", "Lru/yandex/video/m3/player/impl/source/hls/UrlModifier;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FilteringHlsPlaylistParserFactory implements bou {
        private final Uri originalManifestUri;
        private final PlaybackParameters playbackParameters;
        private final TrackFilterProvider trackFilterProvider;
        private final UrlModifier urlModifier;

        public FilteringHlsPlaylistParserFactory(TrackFilterProvider trackFilterProvider, Uri uri, String str, MediaSourceListener mediaSourceListener, PlaybackParameters playbackParameters) {
            this.trackFilterProvider = trackFilterProvider;
            this.originalManifestUri = uri;
            this.playbackParameters = playbackParameters;
            this.urlModifier = str != null ? new HlsUrlModifier(str, mediaSourceListener) : DummyUrlModifier.INSTANCE;
        }

        @Override // defpackage.bou
        public gg90 createPlaylistParser() {
            return new FilteringManifestParser(new YandexHlsPlaylistParser(ynu.l, null, this.urlModifier), this.trackFilterProvider, this.originalManifestUri, this.playbackParameters);
        }

        @Override // defpackage.bou
        public gg90 createPlaylistParser(ynu masterPlaylist, unu previousMediaPlaylist) {
            return new FilteringManifestParser(new YandexHlsPlaylistParser(masterPlaylist, previousMediaPlaylist, this.urlModifier), this.trackFilterProvider, this.originalManifestUri, this.playbackParameters);
        }
    }
}
