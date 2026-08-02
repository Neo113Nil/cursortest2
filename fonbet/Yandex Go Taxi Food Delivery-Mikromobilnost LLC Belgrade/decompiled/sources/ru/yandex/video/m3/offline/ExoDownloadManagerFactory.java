package ru.yandex.video.m3.offline;

import android.content.Context;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.exoplayer.offline.DownloadManager$InternalHandler;
import androidx.media3.exoplayer.offline.e;
import defpackage.bb7;
import defpackage.d6z;
import defpackage.db7;
import defpackage.omh;
import defpackage.ra7;
import defpackage.tls;
import defpackage.zy11;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig;
import ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfigKt;
import ru.yandex.video.m3.model.config.mediasource.MediaSourceConfig;
import ru.yandex.video.m3.model.config.mediasource.MediaSourceConfigKt;
import ru.yandex.video.m3.offline.ExoDownloadManagerFactory;
import ru.yandex.video.m3.player.ExoRenderersFactory;
import ru.yandex.video.m3.player.ExoRenderersFactoryKt;
import ru.yandex.video.m3.player.impl.offline.ExoWritableDownloadIndex;
import ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactoryKt;
import ru.yandex.video.m3.player.tracks.DefaultPlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.VideoTrackNameProvider;
import ru.yandex.video.m3.player.utils.ResourceProvider;
import ru.yandex.video.m3.source.DataSourceFactory;
import ru.yandex.video.m3.source.DefaultTrackFilterProviderKt;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0004&%'(By\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$¨\u0006)"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManagerFactory;", "Lru/yandex/video/m3/offline/DownloadManagerFactory;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/offline/DownloadStorage;", "downloadStorage", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "downloadActionHelper", "Lra7;", "downloadCache", "Lokhttp3/OkHttpClient;", "manifestOkHttpClient", "streamOkHttpClient", "", "minLoadableRetryCount", "maxParallelDownloads", "maxParallelChunkDownloads", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "audioTrackNameProvider", "videoTrackNameProvider", "subtitleTrackNameProvider", "otherTrackNameProvider", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/offline/DownloadStorage;Lru/yandex/video/m3/offline/DownloadActionHelper;Lra7;Lokhttp3/OkHttpClient;Lokhttp3/OkHttpClient;IIILru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;)V", "Lru/yandex/video/m3/offline/DownloadManager;", "create", "()Lru/yandex/video/m3/offline/DownloadManager;", "Landroid/content/Context;", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "Lru/yandex/video/m3/offline/DownloadStorage;", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "Lra7;", "Lokhttp3/OkHttpClient;", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "Companion", "Builder", "DownloadExecutor", "ThreadFactoryImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDownloadManagerFactory implements DownloadManagerFactory {

    @Deprecated
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;

    @Deprecated
    public static final long OFFLINE_MAX_RETRY_DELAY_MS = 10000;

    @Deprecated
    public static final int OFFLINE_MIN_LOADABLE_RETRY_COUNT = 15;
    private final PlayerTrackNameProvider audioTrackNameProvider;
    private final Context context;
    private final DownloadActionHelper downloadActionHelper;
    private final ra7 downloadCache;
    private final DownloadStorage downloadStorage;
    private final OkHttpClient manifestOkHttpClient;
    private final int maxParallelChunkDownloads;
    private final int maxParallelDownloads;
    private final int minLoadableRetryCount;
    private final PlayerTrackNameProvider otherTrackNameProvider;
    private final ResourceProvider resourceProvider;
    private final OkHttpClient streamOkHttpClient;
    private final PlayerTrackNameProvider subtitleTrackNameProvider;
    private final PlayerTrackNameProvider videoTrackNameProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R$\u0010?\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00107\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010L\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010D\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR$\u0010O\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010D\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010H¨\u0006R"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManagerFactory$Builder;", "", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/offline/DownloadStorage;", "downloadStorage", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "downloadActionHelper", "Lra7;", "downloadCache", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/offline/DownloadStorage;Lru/yandex/video/m3/offline/DownloadActionHelper;Lra7;)V", "Lru/yandex/video/m3/offline/ExoDownloadManagerFactory;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/offline/ExoDownloadManagerFactory;", "build", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "getResourceProvider", "()Lru/yandex/video/m3/player/utils/ResourceProvider;", "setResourceProvider", "(Lru/yandex/video/m3/player/utils/ResourceProvider;)V", "Lru/yandex/video/m3/offline/DownloadStorage;", "getDownloadStorage", "()Lru/yandex/video/m3/offline/DownloadStorage;", "setDownloadStorage", "(Lru/yandex/video/m3/offline/DownloadStorage;)V", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "getDownloadActionHelper", "()Lru/yandex/video/m3/offline/DownloadActionHelper;", "setDownloadActionHelper", "(Lru/yandex/video/m3/offline/DownloadActionHelper;)V", "Lra7;", "getDownloadCache", "()Lra7;", "setDownloadCache", "(Lra7;)V", "Lokhttp3/OkHttpClient;", "manifestOkHttpClient", "Lokhttp3/OkHttpClient;", "getManifestOkHttpClient", "()Lokhttp3/OkHttpClient;", "setManifestOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "streamOkHttpClient", "getStreamOkHttpClient", "setStreamOkHttpClient", "", "minLoadableRetryCount", "Ljava/lang/Integer;", "getMinLoadableRetryCount", "()Ljava/lang/Integer;", "setMinLoadableRetryCount", "(Ljava/lang/Integer;)V", "maxParallelDownloads", "getMaxParallelDownloads", "setMaxParallelDownloads", "maxParallelChunkDownloads", "getMaxParallelChunkDownloads", "setMaxParallelChunkDownloads", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "audioTrackNameProvider", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "getAudioTrackNameProvider", "()Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "setAudioTrackNameProvider", "(Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;)V", "videoTrackNameProvider", "getVideoTrackNameProvider", "setVideoTrackNameProvider", "subtitleTrackNameProvider", "getSubtitleTrackNameProvider", "setSubtitleTrackNameProvider", "otherTrackNameProvider", "getOtherTrackNameProvider", "setOtherTrackNameProvider", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private PlayerTrackNameProvider audioTrackNameProvider;
        private Context context;
        private DownloadActionHelper downloadActionHelper;
        private ra7 downloadCache;
        private DownloadStorage downloadStorage;
        private OkHttpClient manifestOkHttpClient;
        private Integer maxParallelChunkDownloads;
        private Integer maxParallelDownloads;
        private Integer minLoadableRetryCount;
        private PlayerTrackNameProvider otherTrackNameProvider;
        private ResourceProvider resourceProvider;
        private OkHttpClient streamOkHttpClient;
        private PlayerTrackNameProvider subtitleTrackNameProvider;
        private PlayerTrackNameProvider videoTrackNameProvider;

        public Builder(Context context, ResourceProvider resourceProvider, DownloadStorage downloadStorage, DownloadActionHelper downloadActionHelper, ra7 ra7Var) {
            this.context = context;
            this.resourceProvider = resourceProvider;
            this.downloadStorage = downloadStorage;
            this.downloadActionHelper = downloadActionHelper;
            this.downloadCache = ra7Var;
        }

        public final ExoDownloadManagerFactory build$video_player_internalRelease() {
            Context context = this.context;
            ResourceProvider resourceProvider = this.resourceProvider;
            DownloadStorage downloadStorage = this.downloadStorage;
            DownloadActionHelper downloadActionHelper = this.downloadActionHelper;
            ra7 ra7Var = this.downloadCache;
            OkHttpClient okHttpClient = this.manifestOkHttpClient;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient(new OkHttpClient.a());
            }
            OkHttpClient okHttpClient2 = this.streamOkHttpClient;
            if (okHttpClient2 == null) {
                okHttpClient2 = new OkHttpClient(new OkHttpClient.a());
            }
            Integer num = this.minLoadableRetryCount;
            int intValue = num != null ? num.intValue() : 15;
            Integer num2 = this.maxParallelDownloads;
            int intValue2 = num2 != null ? num2.intValue() : 3;
            Integer num3 = this.maxParallelChunkDownloads;
            int intValue3 = num3 != null ? num3.intValue() : 3;
            PlayerTrackNameProvider playerTrackNameProvider = this.audioTrackNameProvider;
            if (playerTrackNameProvider == null) {
                playerTrackNameProvider = new DefaultPlayerTrackNameProvider(this.resourceProvider);
            }
            PlayerTrackNameProvider playerTrackNameProvider2 = this.videoTrackNameProvider;
            if (playerTrackNameProvider2 == null) {
                playerTrackNameProvider2 = new VideoTrackNameProvider(this.resourceProvider);
            }
            PlayerTrackNameProvider playerTrackNameProvider3 = this.subtitleTrackNameProvider;
            if (playerTrackNameProvider3 == null) {
                playerTrackNameProvider3 = new DefaultPlayerTrackNameProvider(this.resourceProvider);
            }
            PlayerTrackNameProvider playerTrackNameProvider4 = this.otherTrackNameProvider;
            if (playerTrackNameProvider4 == null) {
                playerTrackNameProvider4 = new DefaultPlayerTrackNameProvider(this.resourceProvider);
            }
            return new ExoDownloadManagerFactory(context, resourceProvider, downloadStorage, downloadActionHelper, ra7Var, okHttpClient, okHttpClient2, intValue, intValue2, intValue3, playerTrackNameProvider, playerTrackNameProvider2, playerTrackNameProvider3, playerTrackNameProvider4, null);
        }

        public final PlayerTrackNameProvider getAudioTrackNameProvider() {
            return this.audioTrackNameProvider;
        }

        public final Context getContext() {
            return this.context;
        }

        public final DownloadActionHelper getDownloadActionHelper() {
            return this.downloadActionHelper;
        }

        public final ra7 getDownloadCache() {
            return this.downloadCache;
        }

        public final DownloadStorage getDownloadStorage() {
            return this.downloadStorage;
        }

        public final OkHttpClient getManifestOkHttpClient() {
            return this.manifestOkHttpClient;
        }

        public final Integer getMaxParallelChunkDownloads() {
            return this.maxParallelChunkDownloads;
        }

        public final Integer getMaxParallelDownloads() {
            return this.maxParallelDownloads;
        }

        public final Integer getMinLoadableRetryCount() {
            return this.minLoadableRetryCount;
        }

        public final PlayerTrackNameProvider getOtherTrackNameProvider() {
            return this.otherTrackNameProvider;
        }

        public final ResourceProvider getResourceProvider() {
            return this.resourceProvider;
        }

        public final OkHttpClient getStreamOkHttpClient() {
            return this.streamOkHttpClient;
        }

        public final PlayerTrackNameProvider getSubtitleTrackNameProvider() {
            return this.subtitleTrackNameProvider;
        }

        public final PlayerTrackNameProvider getVideoTrackNameProvider() {
            return this.videoTrackNameProvider;
        }

        public final void setAudioTrackNameProvider(PlayerTrackNameProvider playerTrackNameProvider) {
            this.audioTrackNameProvider = playerTrackNameProvider;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDownloadActionHelper(DownloadActionHelper downloadActionHelper) {
            this.downloadActionHelper = downloadActionHelper;
        }

        public final void setDownloadCache(ra7 ra7Var) {
            this.downloadCache = ra7Var;
        }

        public final void setDownloadStorage(DownloadStorage downloadStorage) {
            this.downloadStorage = downloadStorage;
        }

        public final void setManifestOkHttpClient(OkHttpClient okHttpClient) {
            this.manifestOkHttpClient = okHttpClient;
        }

        public final void setMaxParallelChunkDownloads(Integer num) {
            this.maxParallelChunkDownloads = num;
        }

        public final void setMaxParallelDownloads(Integer num) {
            this.maxParallelDownloads = num;
        }

        public final void setMinLoadableRetryCount(Integer num) {
            this.minLoadableRetryCount = num;
        }

        public final void setOtherTrackNameProvider(PlayerTrackNameProvider playerTrackNameProvider) {
            this.otherTrackNameProvider = playerTrackNameProvider;
        }

        public final void setResourceProvider(ResourceProvider resourceProvider) {
            this.resourceProvider = resourceProvider;
        }

        public final void setStreamOkHttpClient(OkHttpClient okHttpClient) {
            this.streamOkHttpClient = okHttpClient;
        }

        public final void setSubtitleTrackNameProvider(PlayerTrackNameProvider playerTrackNameProvider) {
            this.subtitleTrackNameProvider = playerTrackNameProvider;
        }

        public final void setVideoTrackNameProvider(PlayerTrackNameProvider playerTrackNameProvider) {
            this.videoTrackNameProvider = playerTrackNameProvider;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManagerFactory$DownloadExecutor;", "Ljava/util/concurrent/Executor;", "", "maxThreadCount", "<init>", "(I)V", "Lzy11;", "executeNext", "()V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", CA20Status.STATUS_USER_I, "Ljava/util/concurrent/atomic/AtomicLong;", "activeTasks", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/BlockingQueue;", "tasks", "Ljava/util/concurrent/BlockingQueue;", "executor", "Ljava/util/concurrent/Executor;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DownloadExecutor implements Executor {
        private final int maxThreadCount;
        private AtomicLong activeTasks = new AtomicLong(0);
        private final BlockingQueue<Runnable> tasks = new LinkedBlockingDeque();
        private final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1, TimeUnit.MINUTES, new SynchronousQueue(), new ThreadFactoryImpl("YP:ExoDownloadThread"));

        public DownloadExecutor(int i) {
            this.maxThreadCount = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(Runnable runnable, DownloadExecutor downloadExecutor) {
            try {
                runnable.run();
            } finally {
                downloadExecutor.activeTasks.decrementAndGet();
                downloadExecutor.executeNext();
            }
        }

        private final synchronized void executeNext() {
            Runnable poll;
            if (this.activeTasks.get() < this.maxThreadCount && (poll = this.tasks.poll()) != null) {
                this.activeTasks.incrementAndGet();
                ExecutorsUtilKt.executeSafely(this.executor, poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.tasks.add(new Runnable() { // from class: ru.yandex.video.m3.offline.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExoDownloadManagerFactory.DownloadExecutor.execute$lambda$0(runnable, this);
                }
            });
            executeNext();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManagerFactory$ThreadFactoryImpl;", "Ljava/util/concurrent/ThreadFactory;", "name", "", "(Ljava/lang/String;)V", "defaultFactory", "kotlin.jvm.PlatformType", "threadCounts", "Ljava/util/concurrent/atomic/AtomicLong;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ThreadFactoryImpl implements ThreadFactory {
        private final String name;
        private final ThreadFactory defaultFactory = Executors.defaultThreadFactory();
        private final AtomicLong threadCounts = new AtomicLong();

        public ThreadFactoryImpl(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Thread newThread = this.defaultFactory.newThread(r);
            newThread.setName(this.name + " # " + this.threadCounts.incrementAndGet());
            return newThread;
        }
    }

    private ExoDownloadManagerFactory(Context context, ResourceProvider resourceProvider, DownloadStorage downloadStorage, DownloadActionHelper downloadActionHelper, ra7 ra7Var, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, int i, int i2, int i3, PlayerTrackNameProvider playerTrackNameProvider, PlayerTrackNameProvider playerTrackNameProvider2, PlayerTrackNameProvider playerTrackNameProvider3, PlayerTrackNameProvider playerTrackNameProvider4) {
        this.context = context;
        this.resourceProvider = resourceProvider;
        this.downloadStorage = downloadStorage;
        this.downloadActionHelper = downloadActionHelper;
        this.downloadCache = ra7Var;
        this.manifestOkHttpClient = okHttpClient;
        this.streamOkHttpClient = okHttpClient2;
        this.minLoadableRetryCount = i;
        this.maxParallelDownloads = i2;
        this.maxParallelChunkDownloads = i3;
        this.audioTrackNameProvider = playerTrackNameProvider;
        this.videoTrackNameProvider = playerTrackNameProvider2;
        this.subtitleTrackNameProvider = playerTrackNameProvider3;
        this.otherTrackNameProvider = playerTrackNameProvider4;
    }

    @Override // ru.yandex.video.m3.offline.DownloadManagerFactory
    public DownloadManager create() {
        ExoRenderersFactory ExoRenderersFactory$default = ExoRenderersFactoryKt.ExoRenderersFactory$default(this.context, null, 2, null);
        DefaultMediaSourceFactory DefaultMediaSourceFactory = DefaultMediaSourceFactoryKt.DefaultMediaSourceFactory(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManagerFactory$create$mediaSourceFactory$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(DefaultMediaSourceFactory.Builder builder) {
                ra7 ra7Var;
                OkHttpClient okHttpClient;
                ra7 ra7Var2;
                OkHttpClient okHttpClient2;
                ra7Var = ExoDownloadManagerFactory.this.downloadCache;
                okHttpClient = ExoDownloadManagerFactory.this.manifestOkHttpClient;
                builder.setManifestDataSourceFactory(new CachedDataSourceFactory(ra7Var, okHttpClient, null, null, 12, null));
                ra7Var2 = ExoDownloadManagerFactory.this.downloadCache;
                okHttpClient2 = ExoDownloadManagerFactory.this.streamOkHttpClient;
                Object[] objArr = 0 == true ? 1 : 0;
                builder.setChunkDataSourceFactory(new CachedDataSourceFactory(ra7Var2, okHttpClient2, objArr, null, 12, null));
                builder.setTrackFilterProvider(DefaultTrackFilterProviderKt.DefaultTrackFilterProvider());
                builder.setConfig(MediaSourceConfigKt.MediaSourceConfig(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManagerFactory$create$mediaSourceFactory$1.1
                    public final void invoke(MediaSourceConfig.Builder builder2) {
                        builder2.setLoadErrorHandlingConfig(LoadErrorHandlingConfigKt.LoadErrorHandlingConfig(new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManagerFactory.create.mediaSourceFactory.1.1.1
                            public final void invoke(LoadErrorHandlingConfig.Builder builder3) {
                                builder3.setMinLoadableRetryCount(builder3.getMinLoadableRetryCount());
                                builder3.setMaxRetryDelayMs(10000L);
                            }

                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LoadErrorHandlingConfig.Builder) obj);
                                return zy11.a;
                            }
                        }));
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((MediaSourceConfig.Builder) obj);
                        return zy11.a;
                    }
                }));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DefaultMediaSourceFactory.Builder) obj);
                return zy11.a;
            }
        });
        Context context = this.context;
        ExoWritableDownloadIndex exoWritableDownloadIndex = new ExoWritableDownloadIndex(this.downloadStorage);
        db7 db7Var = new db7();
        db7Var.a = this.downloadCache;
        db7Var.y = DataSourceFactory.create$default(new DefaultDataSourceFactory(this.streamOkHttpClient, null, 2, null), null, 1, null);
        db7Var.b = new FileDataSource.a();
        bb7 bb7Var = new bb7();
        bb7Var.a = this.downloadCache;
        db7Var.c = bb7Var;
        db7Var.x = false;
        db7Var.B = 3;
        e eVar = new e(context, exoWritableDownloadIndex, new ExoDownloaderFactory(db7Var, new DownloadExecutor(this.maxParallelChunkDownloads)));
        int i = this.minLoadableRetryCount;
        d6z.l(i >= 0);
        int i2 = eVar.j;
        DownloadManager$InternalHandler downloadManager$InternalHandler = eVar.b;
        if (i2 != i) {
            eVar.j = i;
            eVar.e++;
            downloadManager$InternalHandler.obtainMessage(6, i, 0).sendToTarget();
        }
        int i3 = this.maxParallelDownloads;
        d6z.l(i3 > 0);
        if (eVar.i != i3) {
            eVar.i = i3;
            eVar.e++;
            downloadManager$InternalHandler.obtainMessage(5, i3, 0).sendToTarget();
        }
        return new ExoDownloadManager(eVar, ExoRenderersFactory$default, DefaultMediaSourceFactory, this.downloadActionHelper, this.audioTrackNameProvider, this.videoTrackNameProvider, this.subtitleTrackNameProvider, this.otherTrackNameProvider, omh.F);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/offline/ExoDownloadManagerFactory$Companion;", "", "()V", "DEFAULT_MAX_PARALLEL_DOWNLOADS", "", "OFFLINE_MAX_RETRY_DELAY_MS", "", "OFFLINE_MIN_LOADABLE_RETRY_COUNT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExoDownloadManagerFactory(Context context, ResourceProvider resourceProvider, DownloadStorage downloadStorage, DownloadActionHelper downloadActionHelper, ra7 ra7Var, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, int i, int i2, int i3, PlayerTrackNameProvider playerTrackNameProvider, PlayerTrackNameProvider playerTrackNameProvider2, PlayerTrackNameProvider playerTrackNameProvider3, PlayerTrackNameProvider playerTrackNameProvider4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, resourceProvider, downloadStorage, downloadActionHelper, ra7Var, okHttpClient, okHttpClient2, i, i2, i3, playerTrackNameProvider, playerTrackNameProvider2, playerTrackNameProvider3, playerTrackNameProvider4);
    }
}
