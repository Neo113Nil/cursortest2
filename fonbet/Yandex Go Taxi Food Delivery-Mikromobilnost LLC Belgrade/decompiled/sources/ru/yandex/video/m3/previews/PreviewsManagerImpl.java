package ru.yandex.video.m3.previews;

import android.os.Handler;
import android.os.Looper;
import defpackage.cvu0;
import defpackage.d5z0;
import defpackage.egg;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.oxe0;
import defpackage.tls;
import defpackage.ud30;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.feature.FeatureConfigurator;
import ru.yandex.video.m3.previews.Preview;
import ru.yandex.video.m3.previews.util.UrlModifier;
import ru.yandex.video.m3.previews.util.UrlModifierImpl;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001=B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020$2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020$¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0-2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010<¨\u0006>"}, d2 = {"Lru/yandex/video/m3/previews/PreviewsManagerImpl;", "Lru/yandex/video/m3/previews/PreviewsManager;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;", "thumbnailsFromApiFetcher", "Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;", "thumbnailsFromPeriodSupplementalPropsParser", "Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;", "thumbnailsFromRepresentationParser", "Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;", "presentationTimeOffsetProvider", "<init>", "(Ljava/util/concurrent/ExecutorService;Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;)V", "Lru/yandex/video/m3/previews/RawThumbnail;", "thumbnail", "", "isThumbnailApplicable", "(Lru/yandex/video/m3/previews/RawThumbnail;)Z", "", "position", "rawThumbnail", "", "calculateAtlasNumber", "(JLru/yandex/video/m3/previews/RawThumbnail;)I", "atlasNumber", "calculateSpriteNumberInAtlas", "(JLru/yandex/video/m3/previews/RawThumbnail;I)I", "Lru/yandex/video/m3/previews/Type;", "type", "spriteInAtlasNumber", "Lru/yandex/video/m3/previews/Preview;", "createPreview", "(Lru/yandex/video/m3/previews/Type;IILru/yandex/video/m3/previews/RawThumbnail;)Lru/yandex/video/m3/previews/Preview;", "Lru/yandex/video/m3/previews/util/UrlModifier;", "urlModifier", "Lzy11;", "setUrlModifier", "(Lru/yandex/video/m3/previews/util/UrlModifier;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "stop", "()V", "", "getPreviews", "(J)Ljava/util/List;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;", "Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;", "Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;", "Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/previews/PreviewsManagerImpl$PlayerObserverImpl;", "observer", "Lru/yandex/video/m3/previews/PreviewsManagerImpl$PlayerObserverImpl;", "Lzxc0;", "hidedExoPlayer", "Lzxc0;", "Lru/yandex/video/m3/previews/util/UrlModifier;", "PlayerObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreviewsManagerImpl implements PreviewsManager {
    public static final int $stable = 8;
    private final ExecutorService executorService;
    private zxc0 hidedExoPlayer;
    private volatile PlayerObserverImpl observer;
    private final PresentationTimeOffsetProvider presentationTimeOffsetProvider;
    private final ThumbnailsFromApiFetcher thumbnailsFromApiFetcher;
    private final ThumbnailsFromPeriodSupplementalPropsParser thumbnailsFromPeriodSupplementalPropsParser;
    private final ThumbnailsFromRepresentationParser thumbnailsFromRepresentationParser;
    private UrlModifier urlModifier;
    private volatile YandexPlayer<?> yandexPlayer;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B;\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R(\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/yandex/video/m3/previews/PreviewsManagerImpl$PlayerObserverImpl;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;", "thumbnailsFromApiFetcher", "Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;", "thumbnailsFromPeriodSupplementalPropsParser", "Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;", "thumbnailsFromRepresentationParser", "Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;", "presentationTimeOffsetProvider", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Ljava/util/concurrent/ExecutorService;Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;)V", "Lzy11;", "startFetchRawThumbnailsInfoIfNeeded", "()V", "startFetchRawThumbnailsInfoIfNeededOnPlayerThread", "Lzxc0;", "player", "Landroid/os/Handler;", "getPlayerThreadHandler", "(Lzxc0;)Landroid/os/Handler;", "stopPlayerThreadHandler", "stop", "Lru/yandex/video/m3/previews/util/UrlModifier;", "urlModifier", "setUrlModifier", "(Lru/yandex/video/m3/previews/util/UrlModifier;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "hidedPlayer", "onHidedPlayerReady", "(Ljava/lang/Object;)V", "onLoadingFinished", "Lru/yandex/video/m3/player/YandexPlayer;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;", "Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;", "Lru/yandex/video/m3/previews/ThumbnailsFromRepresentationParser;", "Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;", "", "Lru/yandex/video/m3/previews/RawThumbnail;", "rawThumbnails", "Ljava/util/List;", "getRawThumbnails", "()Ljava/util/List;", "setRawThumbnails", "(Ljava/util/List;)V", "Ljava/util/concurrent/Future;", "fetchRawThumbnailsFuture", "Ljava/util/concurrent/Future;", "hidedExoPlayer", "Lzxc0;", "Lru/yandex/video/m3/previews/util/UrlModifier;", "playerThreadHandler", "Landroid/os/Handler;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerObserverImpl implements PlayerAnalyticsObserver, PlayerObserver<Object> {
        public static final int $stable = 8;
        private final ExecutorService executorService;
        private volatile Future<?> fetchRawThumbnailsFuture;
        private zxc0 hidedExoPlayer;
        private Handler playerThreadHandler;
        private final PresentationTimeOffsetProvider presentationTimeOffsetProvider;
        private final ThumbnailsFromApiFetcher thumbnailsFromApiFetcher;
        private final ThumbnailsFromPeriodSupplementalPropsParser thumbnailsFromPeriodSupplementalPropsParser;
        private final ThumbnailsFromRepresentationParser thumbnailsFromRepresentationParser;
        private final YandexPlayer<?> yandexPlayer;
        private volatile List<RawThumbnail> rawThumbnails = EmptyList.a;
        private UrlModifier urlModifier = new UrlModifierImpl();

        public PlayerObserverImpl(YandexPlayer<?> yandexPlayer, ExecutorService executorService, ThumbnailsFromApiFetcher thumbnailsFromApiFetcher, ThumbnailsFromPeriodSupplementalPropsParser thumbnailsFromPeriodSupplementalPropsParser, ThumbnailsFromRepresentationParser thumbnailsFromRepresentationParser, PresentationTimeOffsetProvider presentationTimeOffsetProvider) {
            this.yandexPlayer = yandexPlayer;
            this.executorService = executorService;
            this.thumbnailsFromApiFetcher = thumbnailsFromApiFetcher;
            this.thumbnailsFromPeriodSupplementalPropsParser = thumbnailsFromPeriodSupplementalPropsParser;
            this.thumbnailsFromRepresentationParser = thumbnailsFromRepresentationParser;
            this.presentationTimeOffsetProvider = presentationTimeOffsetProvider;
        }

        private final Handler getPlayerThreadHandler(zxc0 player) {
            Handler handler = this.playerThreadHandler;
            if (handler != null) {
                return handler;
            }
            Handler handler2 = new Handler(player.getApplicationLooper());
            this.playerThreadHandler = handler2;
            return handler2;
        }

        private final void startFetchRawThumbnailsInfoIfNeeded() {
            zxc0 zxc0Var = this.hidedExoPlayer;
            if (zxc0Var == null) {
                return;
            }
            if (jl40.l(zxc0Var.getApplicationLooper().getThread(), Thread.currentThread())) {
                startFetchRawThumbnailsInfoIfNeededOnPlayerThread();
            } else {
                getPlayerThreadHandler(zxc0Var).post(new oxe0(1, this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void startFetchRawThumbnailsInfoIfNeededOnPlayerThread() {
            kwu kwuVar;
            Looper applicationLooper;
            Looper applicationLooper2;
            zxc0 zxc0Var = this.hidedExoPlayer;
            Thread thread = null;
            kwu kwuVar2 = null;
            thread = null;
            if (!jl40.l((zxc0Var == null || (applicationLooper2 = zxc0Var.getApplicationLooper()) == null) ? null : applicationLooper2.getThread(), Thread.currentThread())) {
                d5z0 d5z0Var = h5z0.a;
                StringBuilder sb = new StringBuilder("wrong thread in startFetchRawThumbnailsInfoIfNeededOnPlayerThread Current thread is ");
                sb.append(Thread.currentThread());
                sb.append(". Player thread is ");
                zxc0 zxc0Var2 = this.hidedExoPlayer;
                if (zxc0Var2 != null && (applicationLooper = zxc0Var2.getApplicationLooper()) != null) {
                    thread = applicationLooper.getThread();
                }
                sb.append(thread);
                d5z0Var.a(sb.toString(), new Object[0]);
                return;
            }
            VideoData videoDataInternal = this.yandexPlayer.getVideoDataInternal();
            zxc0 zxc0Var3 = this.hidedExoPlayer;
            Object currentManifest = zxc0Var3 != null ? zxc0Var3.getCurrentManifest() : null;
            egg eggVar = currentManifest instanceof egg ? (egg) currentManifest : null;
            VideoType videoType = this.yandexPlayer.getVideoType();
            if (videoDataInternal == null || eggVar == null) {
                h5z0.a.a("Unable to load thumbnails with " + videoDataInternal + Extension.FIX_SPACE + videoType + Extension.FIX_SPACE + eggVar, new Object[0]);
                return;
            }
            String manifestUrl = videoDataInternal.getManifestUrl();
            try {
                jwu jwuVar = new jwu();
                jwuVar.i(null, manifestUrl);
                kwuVar = jwuVar.e();
            } catch (IllegalArgumentException unused) {
                kwuVar = null;
            }
            if (kwuVar == null) {
                h5z0.a.a("Unable to parse " + videoDataInternal.getManifestUrl(), new Object[0]);
                return;
            }
            Long presentationTimeOffset = this.presentationTimeOffsetProvider.getPresentationTimeOffset(eggVar);
            long longValue = presentationTimeOffset != null ? presentationTimeOffset.longValue() : 0L;
            try {
                if (!cvu0.x(kwuVar.b(), "/vod", false) && !cvu0.x(kwuVar.b(), FeatureConfigurator.LowLatency.URL_PATH_START, false) && !cvu0.x(kwuVar.b(), "/event", false)) {
                    this.rawThumbnails = this.thumbnailsFromPeriodSupplementalPropsParser.parse(kwuVar, longValue);
                    if (!this.rawThumbnails.isEmpty()) {
                        h5z0.a.a("---------- V2 Preview ----------", new Object[0]);
                        return;
                    } else {
                        h5z0.a.a("---------- V1 Preview ----------", new Object[0]);
                        this.rawThumbnails = this.thumbnailsFromRepresentationParser.parse(eggVar, kwuVar, this.yandexPlayer.getContentDuration());
                        return;
                    }
                }
                h5z0.a.a("Try to load thumbnails for " + kwuVar, new Object[0]);
                String addOrUpdateVsid = this.urlModifier.addOrUpdateVsid(kwuVar.i, this.yandexPlayer.getVideoSessionId());
                try {
                    jwu jwuVar2 = new jwu();
                    jwuVar2.i(null, addOrUpdateVsid);
                    kwuVar2 = jwuVar2.e();
                } catch (IllegalArgumentException unused2) {
                }
                if (kwuVar2 != null) {
                    kwuVar = kwuVar2;
                }
                h5z0.a.a("---------- V3 Preview ----------", new Object[0]);
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                if (videoType != VideoType.LIVE && videoType != VideoType.EVENT) {
                    if (videoType == VideoType.VOD) {
                        long j = eggVar.publishTimeMs;
                        if (j != -9223372036854775807L) {
                            longValue = j;
                        }
                        ref$LongRef.element = longValue;
                    }
                    this.fetchRawThumbnailsFuture = ExecutorsUtilKt.submitSafely(this.executorService, new ud30(20, this, kwuVar, ref$LongRef));
                }
                ref$LongRef.element = eggVar.publishTimeMs;
                this.fetchRawThumbnailsFuture = ExecutorsUtilKt.submitSafely(this.executorService, new ud30(20, this, kwuVar, ref$LongRef));
            } catch (Exception e) {
                h5z0.a.f(e, "exception while fetch ot parsing previews", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startFetchRawThumbnailsInfoIfNeededOnPlayerThread$lambda$1(PlayerObserverImpl playerObserverImpl, kwu kwuVar, Ref$LongRef ref$LongRef) {
            List<RawThumbnail> fetch = playerObserverImpl.thumbnailsFromApiFetcher.fetch(kwuVar, ref$LongRef.element);
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            playerObserverImpl.rawThumbnails = fetch;
        }

        private final void stopPlayerThreadHandler() {
            Handler handler = this.playerThreadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.playerThreadHandler = null;
        }

        public final List<RawThumbnail> getRawThumbnails() {
            return this.rawThumbnails;
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onHidedPlayerReady(Object hidedPlayer) {
            this.hidedExoPlayer = hidedPlayer instanceof zxc0 ? (zxc0) hidedPlayer : null;
            stopPlayerThreadHandler();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onLoadingFinished() {
            if (this.rawThumbnails.isEmpty()) {
                startFetchRawThumbnailsInfoIfNeeded();
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
        public void onPreparingStarted(PreparingParams params) {
            this.rawThumbnails = EmptyList.a;
            Future<?> future = this.fetchRawThumbnailsFuture;
            if (future != null) {
                future.cancel(true);
            }
            this.fetchRawThumbnailsFuture = null;
        }

        public final void setRawThumbnails(List<RawThumbnail> list) {
            this.rawThumbnails = list;
        }

        public final void setUrlModifier(UrlModifier urlModifier) {
            this.urlModifier = urlModifier;
        }

        public final void stop() {
            stopPlayerThreadHandler();
        }
    }

    public PreviewsManagerImpl(ExecutorService executorService, ThumbnailsFromApiFetcher thumbnailsFromApiFetcher, ThumbnailsFromPeriodSupplementalPropsParser thumbnailsFromPeriodSupplementalPropsParser, ThumbnailsFromRepresentationParser thumbnailsFromRepresentationParser, PresentationTimeOffsetProvider presentationTimeOffsetProvider) {
        this.executorService = executorService;
        this.thumbnailsFromApiFetcher = thumbnailsFromApiFetcher;
        this.thumbnailsFromPeriodSupplementalPropsParser = thumbnailsFromPeriodSupplementalPropsParser;
        this.thumbnailsFromRepresentationParser = thumbnailsFromRepresentationParser;
        this.presentationTimeOffsetProvider = presentationTimeOffsetProvider;
        this.urlModifier = new UrlModifierImpl();
    }

    private final int calculateAtlasNumber(long position, RawThumbnail rawThumbnail) {
        return (int) (((rawThumbnail.getPositionSupplementMs() + position) / 1000.0d) / rawThumbnail.getDurationSec());
    }

    private final int calculateSpriteNumberInAtlas(long position, RawThumbnail rawThumbnail, int atlasNumber) {
        return (int) ((((rawThumbnail.getPositionSupplementMs() + position) - ((long) ((atlasNumber * rawThumbnail.getDurationSec()) * 1000.0d))) / 1000.0d) / (rawThumbnail.getDurationSec() / (rawThumbnail.getTilesHeight() * rawThumbnail.getTilesWidth())));
    }

    private final Preview createPreview(Type type, int atlasNumber, int spriteInAtlasNumber, RawThumbnail rawThumbnail) {
        String videoSessionId;
        String addOrUpdateVsid;
        h5z0.a.a("type=" + type + " atlasNumber=" + atlasNumber + " spriteInAtlasNumber=" + spriteInAtlasNumber, new Object[0]);
        int tilesWidth = spriteInAtlasNumber / rawThumbnail.getTilesWidth();
        int tilesWidth2 = spriteInAtlasNumber - (rawThumbnail.getTilesWidth() * tilesWidth);
        int tilesHeight = rawThumbnail.getTilesHeight() * rawThumbnail.getTilesWidth();
        final long durationSec = (long) (((float) ((tilesHeight * atlasNumber) + spriteInAtlasNumber)) * (rawThumbnail.getDurationSec() / ((float) tilesHeight)) * 1000.0f);
        float tilesHeight2 = 1.0f / ((float) rawThumbnail.getTilesHeight());
        float tilesWidth3 = 1.0f / ((float) rawThumbnail.getTilesWidth());
        float f = tilesWidth3 * tilesWidth2;
        float f2 = tilesHeight2 * tilesWidth;
        RelativeCropRect RelativeCropRect$default = RelativeCropRectKt.RelativeCropRect$default(f, f2, f + tilesWidth3, f2 + tilesHeight2, null, 16, null);
        String str = rawThumbnail.getPathProvider().get(atlasNumber);
        if (rawThumbnail.getPreviewVersion() == PreviewVersion.V3) {
            return PreviewKt.Preview(type, str, RelativeCropRect$default, new tls() { // from class: ru.yandex.video.m3.previews.PreviewsManagerImpl$createPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Preview.Builder builder) {
                    builder.setTimelinePositionMs(Long.valueOf(durationSec));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Preview.Builder) obj);
                    return zy11.a;
                }
            });
        }
        YandexPlayer<?> yandexPlayer = this.yandexPlayer;
        if (yandexPlayer != null && (videoSessionId = yandexPlayer.getVideoSessionId()) != null && (addOrUpdateVsid = this.urlModifier.addOrUpdateVsid(str, videoSessionId)) != null) {
            str = addOrUpdateVsid;
        }
        return PreviewKt.Preview(type, str, RelativeCropRect$default, new tls() { // from class: ru.yandex.video.m3.previews.PreviewsManagerImpl$createPreview$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Preview.Builder builder) {
                builder.setTimelinePositionMs(Long.valueOf(durationSec));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Preview.Builder) obj);
                return zy11.a;
            }
        });
    }

    private final boolean isThumbnailApplicable(RawThumbnail thumbnail) {
        return thumbnail != null && thumbnail.getDurationSec() > 0.0f && thumbnail.getTilesWidth() > 0 && thumbnail.getTilesHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.previews.PreviewsManager
    public List<Preview> getPreviews(long position) {
        RawThumbnail rawThumbnail;
        List<RawThumbnail> rawThumbnails;
        List<RawThumbnail> rawThumbnails2;
        Object obj;
        PlayerObserverImpl playerObserverImpl = this.observer;
        RawThumbnail rawThumbnail2 = null;
        if (playerObserverImpl == null || (rawThumbnails2 = playerObserverImpl.getRawThumbnails()) == null) {
            rawThumbnail = null;
        } else {
            Iterator<T> it = rawThumbnails2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RawThumbnail) obj).getType() == Type.HI_RES) {
                    break;
                }
            }
            rawThumbnail = (RawThumbnail) obj;
        }
        PlayerObserverImpl playerObserverImpl2 = this.observer;
        if (playerObserverImpl2 != null && (rawThumbnails = playerObserverImpl2.getRawThumbnails()) != null) {
            Iterator<T> it2 = rawThumbnails.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((RawThumbnail) next).getType() == Type.LOW_RES) {
                    rawThumbnail2 = next;
                    break;
                }
            }
            rawThumbnail2 = rawThumbnail2;
        }
        if (!isThumbnailApplicable(rawThumbnail)) {
            return EmptyList.a;
        }
        int calculateAtlasNumber = calculateAtlasNumber(position, rawThumbnail);
        int calculateSpriteNumberInAtlas = calculateSpriteNumberInAtlas(position, rawThumbnail, calculateAtlasNumber);
        ArrayList arrayList = new ArrayList();
        arrayList.add(createPreview(Type.HI_RES, calculateAtlasNumber, calculateSpriteNumberInAtlas, rawThumbnail));
        if (isThumbnailApplicable(rawThumbnail2)) {
            int tilesHeight = (rawThumbnail.getTilesHeight() * rawThumbnail.getTilesWidth() * calculateAtlasNumber) + calculateSpriteNumberInAtlas;
            int tilesHeight2 = tilesHeight / (rawThumbnail2.getTilesHeight() * rawThumbnail2.getTilesWidth());
            arrayList.add(createPreview(Type.LOW_RES, tilesHeight2, tilesHeight - ((rawThumbnail2.getTilesHeight() * rawThumbnail2.getTilesWidth()) * tilesHeight2), rawThumbnail2));
        }
        return arrayList;
    }

    public final void setUrlModifier(UrlModifier urlModifier) {
        this.urlModifier = urlModifier;
    }

    public final void start(YandexPlayer<?> yandexPlayer) {
        this.yandexPlayer = yandexPlayer;
        PlayerObserverImpl playerObserverImpl = new PlayerObserverImpl(yandexPlayer, this.executorService, this.thumbnailsFromApiFetcher, this.thumbnailsFromPeriodSupplementalPropsParser, this.thumbnailsFromRepresentationParser, this.presentationTimeOffsetProvider);
        yandexPlayer.addObserver(playerObserverImpl);
        yandexPlayer.addAnalyticsObserver(playerObserverImpl);
        this.observer = playerObserverImpl;
    }

    public final void stop() {
        PlayerObserverImpl playerObserverImpl = this.observer;
        if (playerObserverImpl != null) {
            playerObserverImpl.stop();
            YandexPlayer<?> yandexPlayer = this.yandexPlayer;
            if (yandexPlayer != null) {
                yandexPlayer.removeObserver(playerObserverImpl);
            }
            YandexPlayer<?> yandexPlayer2 = this.yandexPlayer;
            if (yandexPlayer2 != null) {
                yandexPlayer2.removeAnalyticsObserver(playerObserverImpl);
            }
        }
        this.yandexPlayer = null;
        this.hidedExoPlayer = null;
    }

    public /* synthetic */ PreviewsManagerImpl(ExecutorService executorService, ThumbnailsFromApiFetcher thumbnailsFromApiFetcher, ThumbnailsFromPeriodSupplementalPropsParser thumbnailsFromPeriodSupplementalPropsParser, ThumbnailsFromRepresentationParser thumbnailsFromRepresentationParser, PresentationTimeOffsetProvider presentationTimeOffsetProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService, thumbnailsFromApiFetcher, thumbnailsFromPeriodSupplementalPropsParser, thumbnailsFromRepresentationParser, (i & 16) != 0 ? new PresentationTimeOffsetProviderImpl() : presentationTimeOffsetProvider);
    }
}
