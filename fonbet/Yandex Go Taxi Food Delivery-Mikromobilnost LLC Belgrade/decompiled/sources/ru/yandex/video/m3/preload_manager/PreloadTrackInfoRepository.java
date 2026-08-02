package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.f;
import com.google.common.collect.ImmutableList;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.d5z0;
import defpackage.d6z;
import defpackage.egg;
import defpackage.eh20;
import defpackage.f9h;
import defpackage.h5z0;
import defpackage.ip4;
import defpackage.jl40;
import defpackage.knu;
import defpackage.loo;
import defpackage.npg;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.sk51;
import defpackage.tl51;
import defpackage.tw21;
import defpackage.u4r0;
import defpackage.ud30;
import defpackage.wls;
import defpackage.xv00;
import defpackage.xzz0;
import defpackage.yzz0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.model.config.download.DownloaderConfigKt;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.preload.PreloadHelper;
import ru.yandex.video.m3.preload.PreloadedInfo;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 S2\u00020\u0001:\u0002STB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122.\u0010\u001c\u001a*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017\u0012\f\u0012\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0004\u0012\u00020\u001a0\u0014j\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010 \u001a\u00060\u001fR\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010 \u001a\u00060\u001fR\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010\"J3\u0010%\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010 \u001a\u00060\u001fR\u00020\u00002\u000e\u0010$\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J%\u0010,\u001a\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017*\u00020)2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u0004\u0018\u00010.*\u00020)2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b/\u00100JC\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0015*\u00020)2\b\u00101\u001a\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\n2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u0004\u0018\u00010<*\u00020.H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u00172\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b?\u0010@JG\u0010A\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*2.\u0010\u001c\u001a*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017\u0012\f\u0012\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0004\u0012\u00020\u001a0\u0014j\u0002`\u001bH\u0007¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u0004\u0018\u00010.*\u00020)H\u0007¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010KR*\u0010M\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u00170L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR8\u0010Q\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u001fR\u00020\u00000Oj\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u001fR\u00020\u0000`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "", "Lra7;", "cache", "Lip4;", "bandwidthMeter", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "downloaderFactory", "Lru/yandex/video/m3/preload_manager/YandexDownloadHelperFactory;", "downloadHelperFactory", "", "trackFetchTimeoutInSec", "Lpb7;", "cacheKeyFactory", "Landroid/os/Handler;", "handler", "<init>", "(Lra7;Lip4;Lru/yandex/video/m3/preload/YandexDownloaderFactory;Lru/yandex/video/m3/preload_manager/YandexDownloadHelperFactory;JLpb7;Landroid/os/Handler;)V", "", LaunchBrowserActivity.KEY_URI, "Lkotlin/Function2;", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "Lru/yandex/video/m3/preload_manager/PreloadTracksInfo;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lzy11;", "Lru/yandex/video/m3/preload_manager/TracksInfoCallback;", "callback", "cancel", "(Ljava/lang/String;Lwls;)V", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository$FetchRequest;", "fetchRequest", "onFetchRequestLaunched", "(Ljava/lang/String;Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository$FetchRequest;)V", "onFetchRequestCompleted", Constants.KEY_EXCEPTION, "onFetchRequestFailed", "(Ljava/lang/String;Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository$FetchRequest;Ljava/lang/Exception;)V", "onFetchRequestCanceled", "(Ljava/lang/String;)V", "Landroidx/media3/exoplayer/offline/f;", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "preloadRequest", "extractPreloadTracks", "(Landroidx/media3/exoplayer/offline/f;Lru/yandex/video/m3/preload_manager/PreloadRequest;)Ljava/util/List;", "Landroidx/media3/common/a;", "selectTargetVideoFormat", "(Landroidx/media3/exoplayer/offline/f;Lru/yandex/video/m3/preload_manager/PreloadRequest;)Landroidx/media3/common/a;", "targetFormat", "Lru/yandex/video/m3/data/StreamType;", "streamType", "bitrateEstimate", "", "omitAudio", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/ExoPlayerPreloadTrackInfo;", "getTrackVariants", "(Landroidx/media3/exoplayer/offline/f;Landroidx/media3/common/a;Lru/yandex/video/m3/data/StreamType;JZLru/yandex/video/m3/preload_manager/PreloadConfig;)Ljava/util/List;", "Lru/yandex/video/m3/player/tracks/TrackType;", "toTrackType", "(Landroidx/media3/common/a;)Lru/yandex/video/m3/player/tracks/TrackType;", "fetchTracksSync", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)Ljava/util/List;", "fetchTracksAsync", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lwls;)V", "preloadedTargetVideoFormat", "(Landroidx/media3/exoplayer/offline/f;)Landroidx/media3/common/a;", "Lra7;", "Lip4;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Lru/yandex/video/m3/preload_manager/YandexDownloadHelperFactory;", "J", "Lpb7;", "Landroid/os/Handler;", "Landroid/util/LruCache;", "tracksInfoCache", "Landroid/util/LruCache;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "runningRequests", "Ljava/util/HashMap;", "Companion", "FetchRequest", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadTrackInfoRepository {
    private static final String KEY_TIMESTAMP = "timestamp";
    private final ip4 bandwidthMeter;
    private final ra7 cache;
    private final pb7 cacheKeyFactory;
    private final YandexDownloadHelperFactory downloadHelperFactory;
    private final YandexDownloaderFactory downloaderFactory;
    private final Handler handler;
    private final long trackFetchTimeoutInSec;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final LruCache<String, List<PreloadTrackInfo>> tracksInfoCache = new LruCache<>(64);
    private final HashMap<String, FetchRequest> runningRequests = new HashMap<>();

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012.\u0010\u000e\u001a*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0016J\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0016J=\u0010\u001f\u001a\u00020\f2.\u0010\u000e\u001a*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r¢\u0006\u0004\b\u001f\u0010 J=\u0010!\u001a\u00020\f2.\u0010\u000e\u001a*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u00020\f2\u0010\u0010$\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u000e\u0010%\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)RB\u0010+\u001a0\u0012,\u0012*\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u0014\u00101\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00103¨\u00064"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository$FetchRequest;", "", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "preloadRequest", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "downloaderFactory", "Lkotlin/Function2;", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "Lru/yandex/video/m3/preload_manager/PreloadTracksInfo;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lzy11;", "Lru/yandex/video/m3/preload_manager/TracksInfoCallback;", "callback", "<init>", "(Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload/YandexDownloaderFactory;Lwls;)V", "", "url", "removeFromCache", "(Ljava/lang/String;)V", "maybeRefreshCacheData", "()V", "cacheKey", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "preloadLiveDashConfig", "", "isCachedLiveDashManifestExpired", "(Ljava/lang/String;Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;)Z", "launch", "cancel", "addCallback", "(Lwls;)V", "removeCallbackAndMaybeCancel", "getTracks", "()Ljava/util/List;", "tracks", Constants.KEY_EXCEPTION, "notify", "(Ljava/util/List;Ljava/lang/Exception;)V", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "", "callbacks", "Ljava/util/Set;", "Landroidx/media3/exoplayer/offline/f;", "downloadHelper", "Landroidx/media3/exoplayer/offline/f;", "Ljava/util/List;", "key", "Ljava/lang/String;", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FetchRequest {
        private final Set<wls> callbacks;
        private final f downloadHelper;
        private final YandexDownloaderFactory downloaderFactory;
        private final String key;
        private final PreloadLiveDashConfig preloadLiveDashConfig;
        private final PreloadRequest preloadRequest;
        private List<? extends PreloadTrackInfo> tracks;

        public FetchRequest(PreloadRequest preloadRequest, YandexDownloaderFactory yandexDownloaderFactory, wls wlsVar) {
            this.preloadRequest = preloadRequest;
            this.downloaderFactory = yandexDownloaderFactory;
            this.callbacks = u4r0.d(wlsVar);
            this.downloadHelper = PreloadTrackInfoRepository.this.downloadHelperFactory.create(preloadRequest);
            this.key = preloadRequest.getPreloadKey();
            this.preloadLiveDashConfig = preloadRequest.getConfig().getExperimentalPreloadLiveDashConfig();
        }

        private final boolean isCachedLiveDashManifestExpired(String cacheKey, PreloadLiveDashConfig preloadLiveDashConfig) {
            long d = ((f9h) PreloadTrackInfoRepository.this.cache.getContentMetadata(cacheKey)).d(-9223372036854775807L, "timestamp");
            return d != -9223372036854775807L && System.currentTimeMillis() - d >= preloadLiveDashConfig.getTimeSincePreloadingWhileCacheIsValid();
        }

        private final void maybeRefreshCacheData() {
            if (this.preloadRequest.getConfig().getIsForceRefresh()) {
                removeFromCache(PreloadTrackInfoRepository.this.cacheKeyFactory.buildCacheKey(new npg(Uri.parse(this.preloadRequest.getManifestUrl()))));
                return;
            }
            PreloadLiveDashConfig preloadLiveDashConfig = this.preloadLiveDashConfig;
            if (preloadLiveDashConfig == null || !preloadLiveDashConfig.getLiveDashPreloadEnabled()) {
                return;
            }
            String buildCacheKey = PreloadTrackInfoRepository.this.cacheKeyFactory.buildCacheKey(new npg(Uri.parse(this.preloadRequest.getManifestUrl())));
            if (isCachedLiveDashManifestExpired(buildCacheKey, this.preloadLiveDashConfig)) {
                removeFromCache(buildCacheKey);
            }
        }

        private final void removeFromCache(String url) {
            this.downloaderFactory.createDownloader(new DownloadRequest(url, Uri.parse(url), null, ImmutableList.p(), null, null, null, null), DownloaderConfigKt.DownloaderConfig$default(null, 1, null)).remove();
        }

        public final void addCallback(wls callback) {
            this.callbacks.add(callback);
        }

        public final void cancel() {
            this.downloadHelper.d();
            PreloadTrackInfoRepository.this.onFetchRequestCanceled(this.key);
        }

        public final List<PreloadTrackInfo> getTracks() {
            List list = this.tracks;
            if (list == null) {
                list = EmptyList.a;
            }
            return Collections.unmodifiableList(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository$FetchRequest$launch$1] */
        public final void launch() {
            PreloadTrackInfoRepository.this.onFetchRequestLaunched(this.key, this);
            maybeRefreshCacheData();
            f fVar = this.downloadHelper;
            final PreloadTrackInfoRepository preloadTrackInfoRepository = PreloadTrackInfoRepository.this;
            fVar.c(new tl51() { // from class: ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository$FetchRequest$launch$1
                @Override // defpackage.tl51
                public void onPrepareError(f helper, IOException exception) {
                    Handler handler;
                    PreloadRequest preloadRequest;
                    String str;
                    Looper myLooper = Looper.myLooper();
                    handler = PreloadTrackInfoRepository.this.handler;
                    jl40.l(myLooper, handler.getLooper());
                    d5z0 d5z0Var = h5z0.a;
                    StringBuilder sb = new StringBuilder("Downloader exception for preloadRequest = ");
                    preloadRequest = this.preloadRequest;
                    sb.append(preloadRequest);
                    d5z0Var.f(exception, sb.toString(), new Object[0]);
                    helper.d();
                    PreloadTrackInfoRepository preloadTrackInfoRepository2 = PreloadTrackInfoRepository.this;
                    str = this.key;
                    preloadTrackInfoRepository2.onFetchRequestFailed(str, this, exception);
                }

                @Override // defpackage.tl51
                public void onPrepared(f downloader) {
                    Handler handler;
                    PreloadRequest preloadRequest;
                    List extractPreloadTracks;
                    String str;
                    String str2;
                    Object obj = zy11.a;
                    try {
                        try {
                            Looper myLooper = Looper.myLooper();
                            handler = PreloadTrackInfoRepository.this.handler;
                            jl40.l(myLooper, handler.getLooper());
                            PreloadTrackInfoRepository preloadTrackInfoRepository2 = PreloadTrackInfoRepository.this;
                            preloadRequest = this.preloadRequest;
                            extractPreloadTracks = preloadTrackInfoRepository2.extractPreloadTracks(downloader, preloadRequest);
                            d5z0 d5z0Var = h5z0.a;
                            StringBuilder sb = new StringBuilder("Downloader found ");
                            sb.append(extractPreloadTracks.size());
                            sb.append(" tracks, key = ");
                            str = this.key;
                            sb.append(str);
                            d5z0Var.a(sb.toString(), new Object[0]);
                            d5z0Var.a("Tracks are: " + extractPreloadTracks, new Object[0]);
                            this.tracks = extractPreloadTracks;
                            PreloadTrackInfoRepository preloadTrackInfoRepository3 = PreloadTrackInfoRepository.this;
                            str2 = this.key;
                            preloadTrackInfoRepository3.onFetchRequestCompleted(str2, this);
                            try {
                                downloader.d();
                            } catch (Throwable th) {
                                obj = new Result.Failure(th);
                            }
                            if (obj instanceof Result.Failure) {
                                h5z0.a.f(Result.a(obj), "Failed to release downloader", new Object[0]);
                            }
                        } catch (Exception e) {
                            onPrepareError(downloader, new IOException("failed to extract tracks", e));
                            try {
                                downloader.d();
                            } catch (Throwable th2) {
                                obj = new Result.Failure(th2);
                            }
                            if (obj instanceof Result.Failure) {
                                h5z0.a.f(Result.a(obj), "Failed to release downloader", new Object[0]);
                            }
                        }
                    } finally {
                    }
                }
            });
        }

        public final void notify(List<? extends PreloadTrackInfo> tracks, Exception exception) {
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((wls) it.next()).invoke(tracks, exception);
            }
            this.callbacks.clear();
        }

        public final void removeCallbackAndMaybeCancel(wls callback) {
            this.callbacks.remove(callback);
            if (this.callbacks.isEmpty()) {
                cancel();
            }
        }
    }

    public PreloadTrackInfoRepository(ra7 ra7Var, ip4 ip4Var, YandexDownloaderFactory yandexDownloaderFactory, YandexDownloadHelperFactory yandexDownloadHelperFactory, long j, pb7 pb7Var, Handler handler) {
        this.cache = ra7Var;
        this.bandwidthMeter = ip4Var;
        this.downloaderFactory = yandexDownloaderFactory;
        this.downloadHelperFactory = yandexDownloadHelperFactory;
        this.trackFetchTimeoutInSec = j;
        this.cacheKeyFactory = pb7Var;
        this.handler = handler;
    }

    private final void cancel(String uri, wls callback) {
        h5z0.a.a("Request for cancel, uri = " + uri + ", callback = " + callback, new Object[0]);
        tw21.a0(this.handler, new ud30(18, uri, callback, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$2(String str, wls wlsVar, PreloadTrackInfoRepository preloadTrackInfoRepository) {
        h5z0.a.a("Running cancel(), uri = " + str + ", callback = " + wlsVar, new Object[0]);
        FetchRequest fetchRequest = preloadTrackInfoRepository.runningRequests.get(str);
        if (fetchRequest != null) {
            fetchRequest.removeCallbackAndMaybeCancel(wlsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PreloadTrackInfo> extractPreloadTracks(f fVar, PreloadRequest preloadRequest) {
        androidx.media3.common.a aVar;
        Object b = fVar.b();
        StreamType streamType = b instanceof egg ? StreamType.Dash : b instanceof knu ? StreamType.Hls : StreamType.Unknown;
        if (streamType == StreamType.Unknown) {
            return Collections.singletonList(ExoPlayerPreloadTrackInfo.INSTANCE.getEMPTY$video_player_internalRelease());
        }
        androidx.media3.common.a preloadedTargetVideoFormat = preloadedTargetVideoFormat(fVar);
        if (preloadedTargetVideoFormat == null) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.a("YandexDownloadHelper.extractPreloadTracks: Preloaded video format not found. Select video format", new Object[0]);
            androidx.media3.common.a selectTargetVideoFormat = selectTargetVideoFormat(fVar, preloadRequest);
            if (selectTargetVideoFormat == null) {
                d5z0Var.a("YandexDownloadHelper.extractPreloadTracks: Target video format not selected", new Object[0]);
            } else {
                d5z0Var.a("YandexDownloadHelper.extractPreloadTracks: Target video format selected: " + selectTargetVideoFormat, new Object[0]);
            }
            aVar = selectTargetVideoFormat;
        } else {
            h5z0.a.a("YandexDownloadHelper.extractPreloadTracks: Preloaded video format " + preloadedTargetVideoFormat, new Object[0]);
            aVar = preloadedTargetVideoFormat;
        }
        return getTrackVariants(fVar, aVar, streamType, this.bandwidthMeter.getBitrateEstimate(), preloadRequest.getOmitAudio(), preloadRequest.getConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchTracksAsync$lambda$1(PreloadRequest preloadRequest, PreloadTrackInfoRepository preloadTrackInfoRepository, wls wlsVar) {
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.a("Running getTracks(), preloadRequest = " + preloadRequest, new Object[0]);
        List<PreloadTrackInfo> list = preloadTrackInfoRepository.tracksInfoCache.get(preloadRequest.getPreloadKey());
        if (list != null) {
            d5z0Var.a("getTracks() cache hit,preloadRequest = " + preloadRequest, new Object[0]);
            wlsVar.invoke(list, null);
            return;
        }
        FetchRequest fetchRequest = preloadTrackInfoRepository.runningRequests.get(preloadRequest.getPreloadKey());
        if (fetchRequest != null) {
            d5z0Var.a("getTracks() merge to existing request, preloadRequest = " + preloadRequest, new Object[0]);
            fetchRequest.addCallback(wlsVar);
            return;
        }
        d5z0Var.a("getTracks() new request, preloadRequest = " + preloadRequest, new Object[0]);
        preloadTrackInfoRepository.new FetchRequest(preloadRequest, preloadTrackInfoRepository.downloaderFactory, wlsVar).launch();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<ExoPlayerPreloadTrackInfo> getTrackVariants(f fVar, androidx.media3.common.a aVar, StreamType streamType, long j, boolean z, PreloadConfig preloadConfig) {
        int length;
        Object next;
        ArrayList arrayList;
        f fVar2 = fVar;
        ArrayList arrayList2 = new ArrayList();
        if (fVar2.b == null) {
            length = 0;
        } else {
            d6z.x(fVar2.g);
            length = fVar2.j.length;
        }
        int i = 0;
        while (i < length) {
            d6z.x(fVar2.g);
            yzz0 yzz0Var = fVar2.j[i];
            int i2 = yzz0Var.a;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                xzz0 a = yzz0Var.a(i3);
                int i5 = a.a;
                int i6 = 0;
                while (i6 < i5) {
                    androidx.media3.common.a aVar2 = a.d[i6];
                    TrackType trackType = toTrackType(aVar2);
                    if (trackType == null) {
                        i4++;
                    } else {
                        Object b = fVar2.b();
                        egg eggVar = b instanceof egg ? (egg) b : null;
                        boolean z2 = eggVar != null && eggVar.dynamic;
                        String aVar3 = aVar2.toString();
                        PreloadLiveDashConfig experimentalPreloadLiveDashConfig = preloadConfig.getExperimentalPreloadLiveDashConfig();
                        arrayList2.add(new ExoPlayerPreloadTrackInfo(aVar3, trackType, new StreamKey(i, (experimentalPreloadLiveDashConfig == null || !experimentalPreloadLiveDashConfig.getLiveDashPreloadEnabled()) ? i3 : i3 - i4, i6), aVar2, streamType, z2));
                    }
                    i6++;
                    fVar2 = fVar;
                }
                i3++;
                fVar2 = fVar;
            }
            i++;
            fVar2 = fVar;
        }
        if (aVar == null) {
            h5z0.a.a("YandexDownloadHelper.getTrackVariants: fallback. reason targetFormat==null", new Object[0]);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (((ExoPlayerPreloadTrackInfo) next2).getTrackType() == TrackType.Video && r4.getFormat().j < j * 0.7d) {
                    arrayList3.add(next2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i7 = ((ExoPlayerPreloadTrackInfo) next).getFormat().j;
                    do {
                        Object next3 = it2.next();
                        int i8 = ((ExoPlayerPreloadTrackInfo) next3).getFormat().j;
                        if (i7 < i8) {
                            next = next3;
                            i7 = i8;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo = (ExoPlayerPreloadTrackInfo) next;
            if (exoPlayerPreloadTrackInfo != null) {
                h5z0.a.a("YandexDownloadHelper.getTrackVariants: fallback target video found " + exoPlayerPreloadTrackInfo, new Object[0]);
                arrayList = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next4 = it3.next();
                    ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo2 = (ExoPlayerPreloadTrackInfo) next4;
                    if (exoPlayerPreloadTrackInfo2.getTrackType() != TrackType.Video || jl40.l(exoPlayerPreloadTrackInfo2.getFormat().a, exoPlayerPreloadTrackInfo.getFormat().a)) {
                        arrayList.add(next4);
                    }
                }
            }
            if (z) {
                return arrayList2;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((ExoPlayerPreloadTrackInfo) obj).getTrackType() != TrackType.Audio) {
                    arrayList4.add(obj);
                }
            }
            return arrayList4;
        }
        arrayList = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next5 = it4.next();
            ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo3 = (ExoPlayerPreloadTrackInfo) next5;
            if (exoPlayerPreloadTrackInfo3.getTrackType() != TrackType.Video || jl40.l(exoPlayerPreloadTrackInfo3.getFormat().a, aVar.a)) {
                arrayList.add(next5);
            }
        }
        arrayList2 = arrayList;
        if (z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFetchRequestCanceled(String uri) {
        jl40.l(Looper.myLooper(), this.handler.getLooper());
        this.runningRequests.remove(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFetchRequestCompleted(String uri, FetchRequest fetchRequest) {
        jl40.l(Looper.myLooper(), this.handler.getLooper());
        List<PreloadTrackInfo> tracks = fetchRequest.getTracks();
        this.tracksInfoCache.put(uri, tracks);
        this.runningRequests.remove(uri);
        fetchRequest.notify(tracks, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFetchRequestFailed(String uri, FetchRequest fetchRequest, Exception exception) {
        jl40.l(Looper.myLooper(), this.handler.getLooper());
        this.runningRequests.remove(uri);
        fetchRequest.notify(EmptyList.a, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFetchRequestLaunched(String uri, FetchRequest fetchRequest) {
        jl40.l(Looper.myLooper(), this.handler.getLooper());
        this.runningRequests.put(uri, fetchRequest);
    }

    private final androidx.media3.common.a selectTargetVideoFormat(f fVar, PreloadRequest preloadRequest) {
        d6z.x(fVar.g);
        xv00 xv00Var = fVar.k[0];
        int i = xv00Var.a;
        androidx.media3.common.a aVar = null;
        Integer num = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (xv00Var.b[i2] == 2) {
                num = Integer.valueOf(i2);
                h5z0.a.a("YandexDownloadHelper.selectTargetVideoFormat: videoRendererIndex found. It is " + num, new Object[0]);
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            d6z.x(fVar.g);
            List list = fVar.m[0][intValue];
            if (list.size() > 0 && list.get(0) != null) {
                loo looVar = (loo) list.get(0);
                if (looVar instanceof sk51) {
                    aVar = looVar.getFormat(((sk51) looVar).determineIdealSelectedIndex(Long.MIN_VALUE, -9223372036854775807L));
                }
            }
            h5z0.a.a("YandexDownloadHelper.selectTargetVideoFormat: targetVideoFormat found. It is " + aVar, new Object[0]);
        }
        return aVar;
    }

    private final TrackType toTrackType(androidx.media3.common.a aVar) {
        String str = aVar.n;
        String str2 = aVar.n;
        if (eh20.l(str)) {
            return TrackType.Audio;
        }
        if (eh20.p(str2)) {
            return TrackType.Video;
        }
        if (eh20.o(str2)) {
            return TrackType.Subtitles;
        }
        return null;
    }

    public final void fetchTracksAsync(PreloadRequest preloadRequest, wls callback) {
        h5z0.a.a("Request for getTracks(), preloadRequest = " + preloadRequest + ", callback = " + callback, new Object[0]);
        tw21.a0(this.handler, new ud30(19, preloadRequest, this, callback));
    }

    public final List<PreloadTrackInfo> fetchTracksSync(PreloadRequest preloadRequest) {
        jl40.l(Looper.myLooper(), this.handler.getLooper());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        wls wlsVar = new wls() { // from class: ru.yandex.video.m3.preload_manager.PreloadTrackInfoRepository$fetchTracksSync$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void invoke(List<? extends PreloadTrackInfo> list, Exception exc) {
                atomicReference.set(list);
                atomicReference2.set(exc);
                countDownLatch.countDown();
            }

            @Override // defpackage.wls
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<? extends PreloadTrackInfo>) obj, (Exception) obj2);
                return zy11.a;
            }
        };
        fetchTracksAsync(preloadRequest, wlsVar);
        try {
            if (!countDownLatch.await(this.trackFetchTimeoutInSec, TimeUnit.SECONDS)) {
                cancel(preloadRequest.getPreloadKey(), wlsVar);
                throw new PreloadException.ManifestDownloadError("Timeout waiting for manifest download", null, 2, null);
            }
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                throw new PreloadException.ManifestDownloadError("YandexDownloadHelper.prepare signalled an error", exc);
            }
            List<PreloadTrackInfo> list = (List) atomicReference.get();
            if (list == null || list.isEmpty()) {
                throw new PreloadException.EmptyTrackListSelectedError("Track selection returned empty result", null, 2, null);
            }
            return list;
        } catch (InterruptedException e) {
            cancel(preloadRequest.getPreloadKey(), wlsVar);
            throw new PreloadException.CanceledOperationException.CanceledManifestDownload("Manifest downloading was interrupted", e);
        }
    }

    public final androidx.media3.common.a preloadedTargetVideoFormat(f fVar) {
        PreloadedInfo findPreloadedVideoTrackIndex = PreloadHelper.INSTANCE.findPreloadedVideoTrackIndex(this.cache, this.cacheKeyFactory, fVar.b());
        if (findPreloadedVideoTrackIndex != null) {
            return findPreloadedVideoTrackIndex.getFormat();
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository$Companion;", "", "()V", "KEY_TIMESTAMP", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
