package ru.yandex.video.m3.list_player_manager.impl.image;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import defpackage.b64;
import defpackage.cit;
import defpackage.cvu0;
import defpackage.d6w;
import defpackage.dbm;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jty;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oyr;
import defpackage.p5j0;
import defpackage.pey;
import defpackage.q4y;
import defpackage.r4y;
import defpackage.s4y;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.xx01;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.first_frame.ThumbHashUtils;
import ru.yandex.video.m3.list_player_manager.impl.ItemsListAbsoluteIndicesAdapter;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider;
import ru.yandex.video.m3.list_player_manager.impl.WorkHelper;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.list_player_manager.model.FirstFrameData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0003QRSBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0083@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\"\u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b#\u0010$J+\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000&H\u0002¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u0004\u0018\u00010+2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00103\u001a\u00020\u001d2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00105\u001a\u000201¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u001d¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010DR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u00060KR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u0002010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;", "", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "items", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "videoDataCache", "Lru/yandex/video/m3/list_player_manager/model/FirstFrameData;", "firstFrameCache", "Landroidx/fragment/app/FragmentActivity;", "activityContext", "", "preloadCount", "Lru/yandex/video/m3/list_player_manager/impl/WorkHelper;", "workHelper", "", "useHardcodedRatioForBlurs", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Landroidx/fragment/app/FragmentActivity;ILru/yandex/video/m3/list_player_manager/impl/WorkHelper;Z)V", "", "firstFrameUrl", "firstFrameHash", "videoContentId", "createTagFromData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "view", "Lzy11;", "startLoadImageIntoViewIfNecessary", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedFirstFrameUrl", "(Ljava/lang/String;)Ljava/lang/String;", "getCachedFirstFrameHash", "checkContext", "()Landroidx/fragment/app/FragmentActivity;", "R", "Lkotlin/Function1;", "block", "withSafeContext", "(Ltls;)Ljava/lang/Object;", "Lp5j0;", "Landroid/graphics/drawable/Drawable;", "loadMediaData", "(Ljava/lang/String;Ljava/lang/String;)Lp5j0;", "makeBlurDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "visibleItems", "onUpdateVisibleItemsList", "(Ljava/util/List;)V", "mediaItem", "onSourceSetForView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onVideoDataLoadedForView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/data/dto/VideoData;)V", "onSourceClearedFromView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "release", "()V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/list_player_manager/impl/WorkHelper;", "Z", "context", "Landroidx/fragment/app/FragmentActivity;", "failFast", "Lcom/bumptech/glide/RequestManager;", "glideRequestManager", "Lcom/bumptech/glide/RequestManager;", "Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$PreloadModelProviderImpl;", "preloadModelProvider", "Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$PreloadModelProviderImpl;", "Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll;", "listPreloader", "Lru/yandex/video/m3/list_player_manager/impl/image/ListPreloaderWithBufferedScroll;", "Companion", "FirstFrameDrawableTarget", "PreloadModelProviderImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GlideBitmapDownloader {

    @Deprecated
    public static final String ACCEPT_HEADER = "Accept";

    @Deprecated
    public static final String ACCEPT_WEBP = "image/webp";

    @Deprecated
    public static final int RATIO_HEIGHT = 16;

    @Deprecated
    public static final int RATIO_WIDTH = 9;

    @Deprecated
    public static final String TAG = "GlideBitmapDownloader";

    @Deprecated
    public static final String URL_SUFFIX_PLACEHOLDER = "orig";

    @Deprecated
    public static final String WEBP_URL_SUFFIX = "1080x1920q15";
    private FragmentActivity context;
    private final boolean failFast = ListYandexPlayerManagerInstanceProvider.INSTANCE.isFailFast$video_player_internalRelease();
    private final DataCache<FirstFrameData> firstFrameCache;
    private final RequestManager glideRequestManager;
    private final ItemsListAbsoluteIndicesAdapter items;
    private final ListPreloaderWithBufferedScroll<MediaData> listPreloader;
    private final PlayerLogger playerLogger;
    private final PreloadModelProviderImpl preloadModelProvider;
    private final boolean useHardcodedRatioForBlurs;
    private final DataCache<VhVideoData> videoDataCache;
    private final WorkHelper workHelper;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0000\u0012\u00020\b\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$FirstFrameDrawableTarget;", "Ldbm;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "playerView", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "Landroid/graphics/drawable/Drawable;", "placeholder", "Lzy11;", "onLoadStarted", "(Landroid/graphics/drawable/Drawable;)V", "resource", "Lxx01;", "transition", "onResourceReady", "(Landroid/graphics/drawable/Drawable;Lxx01;)V", "errorDrawable", "onLoadFailed", "onLoadCleared", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FirstFrameDrawableTarget extends dbm {
        private final PlayerLogger playerLogger;
        private final ListYandexPlayerView playerView;

        public FirstFrameDrawableTarget(PlayerLogger playerLogger, ListYandexPlayerView listYandexPlayerView) {
            super(listYandexPlayerView.getFirstFrameView());
            this.playerLogger = playerLogger;
            this.playerView = listYandexPlayerView;
        }

        @Override // defpackage.rgv, com.bumptech.glide.request.target.ViewTarget, defpackage.jb5, defpackage.iax0
        public void onLoadCleared(Drawable placeholder) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("GlideBitmapDownloader", "onLoadCleared", "view tag:" + this.playerView.tag$video_player_internalRelease(), new Object[0]);
            }
            super.onLoadCleared(placeholder);
        }

        @Override // defpackage.rgv, defpackage.jb5, defpackage.iax0
        public void onLoadFailed(Drawable errorDrawable) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("GlideBitmapDownloader", "onLoadFailed", "view tag:" + this.playerView.tag$video_player_internalRelease(), new Object[0]);
            }
            super.onLoadFailed(errorDrawable);
        }

        @Override // defpackage.rgv, defpackage.jb5, defpackage.iax0
        public void onLoadStarted(Drawable placeholder) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("GlideBitmapDownloader", "onLoadStarted", "view tag:" + this.playerView.tag$video_player_internalRelease(), new Object[0]);
            }
            if (placeholder != null) {
                this.playerView.notifyBlurPictureIsSet$video_player_internalRelease();
            }
            super.onLoadStarted(placeholder);
        }

        @Override // defpackage.rgv, defpackage.iax0
        public void onResourceReady(Drawable resource, xx01 transition) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose("GlideBitmapDownloader", "onResourceReady", "view tag:" + this.playerView.tag$video_player_internalRelease(), new Object[0]);
            }
            this.playerView.notifyFirstFramePictureIsSet$video_player_internalRelease();
            b(resource);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$PreloadModelProviderImpl;", "Ljty;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader;)V", "", "position", "", "getPreloadItems", "(I)Ljava/util/List;", "item", "Lp5j0;", "getPreloadRequestBuilder", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)Lp5j0;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PreloadModelProviderImpl implements jty {
        public PreloadModelProviderImpl() {
        }

        @Override // defpackage.jty
        public List<MediaData> getPreloadItems(int position) {
            d6w windowIndices = GlideBitmapDownloader.this.items.getWindowIndices();
            return (position > windowIndices.b || windowIndices.a > position) ? EmptyList.a : Collections.singletonList(GlideBitmapDownloader.this.items.get(position));
        }

        @Override // defpackage.jty
        public p5j0 getPreloadRequestBuilder(MediaData item) {
            GlideBitmapDownloader glideBitmapDownloader = GlideBitmapDownloader.this;
            String firstFrameUrl = item.getFirstFrameUrl();
            if (firstFrameUrl == null) {
                firstFrameUrl = GlideBitmapDownloader.this.getCachedFirstFrameUrl(item.getVideoContentId());
            }
            String firstFrameHash = item.getFirstFrameHash();
            if (firstFrameHash == null) {
                firstFrameHash = GlideBitmapDownloader.this.getCachedFirstFrameHash(item.getVideoContentId());
            }
            return glideBitmapDownloader.loadMediaData(firstFrameUrl, firstFrameHash);
        }
    }

    public GlideBitmapDownloader(PlayerLogger playerLogger, ItemsListAbsoluteIndicesAdapter itemsListAbsoluteIndicesAdapter, DataCache<VhVideoData> dataCache, DataCache<FirstFrameData> dataCache2, FragmentActivity fragmentActivity, int i, WorkHelper workHelper, boolean z) {
        this.playerLogger = playerLogger;
        this.items = itemsListAbsoluteIndicesAdapter;
        this.videoDataCache = dataCache;
        this.firstFrameCache = dataCache2;
        this.workHelper = workHelper;
        this.useHardcodedRatioForBlurs = z;
        this.context = fragmentActivity;
        RequestManager with = Glide.with(fragmentActivity);
        this.glideRequestManager = with;
        PreloadModelProviderImpl preloadModelProviderImpl = new PreloadModelProviderImpl();
        this.preloadModelProvider = preloadModelProviderImpl;
        this.listPreloader = new ListPreloaderWithBufferedScroll<>(playerLogger, fragmentActivity, with, preloadModelProviderImpl, i);
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("GlideBitmapDownloader", "init", oyr.j(i, "Created with ", " preload count."), new Object[0]);
        }
        if (workHelper != null && PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("GlideBitmapDownloader", "init", "Using workhelper.", new Object[0]);
        }
        withSafeContext(new AnonymousClass3());
    }

    private final FragmentActivity checkContext() {
        FragmentActivity fragmentActivity = this.context;
        if (fragmentActivity != null || !this.failFast) {
            return fragmentActivity;
        }
        ny61.r("Activity is already dead!");
        return null;
    }

    private final String createTagFromData(String firstFrameUrl, String firstFrameHash, String videoContentId) {
        return g8e.p(firstFrameUrl, firstFrameHash, videoContentId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCachedFirstFrameHash(String videoContentId) {
        String hash;
        if (videoContentId != null) {
            FirstFrameData firstFrameData = this.firstFrameCache.get(videoContentId);
            if (firstFrameData != null && (hash = firstFrameData.getHash()) != null) {
                return hash;
            }
            VhVideoData vhVideoData = this.videoDataCache.get(videoContentId);
            if (vhVideoData != null) {
                return vhVideoData.getFirstFrameHash();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCachedFirstFrameUrl(String videoContentId) {
        String url;
        if (videoContentId != null) {
            FirstFrameData firstFrameData = this.firstFrameCache.get(videoContentId);
            if (firstFrameData != null && (url = firstFrameData.getUrl()) != null) {
                return url;
            }
            VhVideoData vhVideoData = this.videoDataCache.get(videoContentId);
            if (vhVideoData != null) {
                return vhVideoData.getFirstFrameUrl();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p5j0 loadMediaData(String firstFrameUrl, String firstFrameHash) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("GlideBitmapDownloader", "loadMediaData", b64.l("firstFrameUrl=", firstFrameUrl, " firstFrameUrl=", firstFrameHash), new Object[0]);
        }
        if (firstFrameUrl == null) {
            firstFrameUrl = null;
        } else if (cvu0.s(firstFrameUrl, URL_SUFFIX_PLACEHOLDER, true)) {
            d6w n = y6i0.n(0, firstFrameUrl.length() - 4);
            firstFrameUrl = firstFrameUrl.substring(n.a, n.b + 1).concat(WEBP_URL_SUFFIX);
        }
        Drawable makeBlurDrawable = makeBlurDrawable(firstFrameHash);
        if (firstFrameUrl == null || firstFrameUrl.length() == 0) {
            return (p5j0) ((p5j0) this.glideRequestManager.load(makeBlurDrawable).g(null)).h();
        }
        q4y q4yVar = new q4y();
        r4y r4yVar = new r4y(ACCEPT_WEBP);
        if (q4yVar.a) {
            q4yVar.a = false;
            HashMap hashMap = new HashMap(q4yVar.b.size());
            for (Map.Entry entry : q4yVar.b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            q4yVar.b = hashMap;
        }
        List list = (List) q4yVar.b.get(ACCEPT_HEADER);
        if (list == null) {
            list = new ArrayList();
            q4yVar.b.put(ACCEPT_HEADER, list);
        }
        list.add(r4yVar);
        q4yVar.a = true;
        p5j0 p5j0Var = (p5j0) ((p5j0) this.glideRequestManager.load((Object) new cit(firstFrameUrl, new s4y(q4yVar.b))).g(null)).h();
        return firstFrameHash != null ? (p5j0) p5j0Var.p(makeBlurDrawable) : p5j0Var;
    }

    public static /* synthetic */ p5j0 loadMediaData$default(GlideBitmapDownloader glideBitmapDownloader, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return glideBitmapDownloader.loadMediaData(str, str2);
    }

    private final Drawable makeBlurDrawable(String firstFrameHash) {
        if (firstFrameHash == null) {
            return null;
        }
        final Bitmap makeScaledBlurredBitmap = this.useHardcodedRatioForBlurs ? ThumbHashUtils.INSTANCE.makeScaledBlurredBitmap(firstFrameHash, 9, 16) : ThumbHashUtils.INSTANCE.makeBlurredBitmap(firstFrameHash);
        if (makeScaledBlurredBitmap != null) {
            return (Drawable) withSafeContext(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$makeBlurDrawable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final BitmapDrawable invoke(FragmentActivity fragmentActivity) {
                    return new BitmapDrawable(fragmentActivity.getResources(), makeScaledBlurredBitmap);
                }
            });
        }
        if (!this.failFast) {
            return null;
        }
        ny61.g("Thumbnail hash is invalid!");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startLoadImageIntoViewIfNecessary(String str, String str2, String str3, ListYandexPlayerView listYandexPlayerView, Continuation<? super zy11> continuation) {
        String createTagFromData = createTagFromData(str, str2, str3);
        if (!jl40.l(listYandexPlayerView.getFirstFrameView().getTag(), createTagFromData)) {
            listYandexPlayerView.getFirstFrameView().setTag(createTagFromData);
            p5j0 loadMediaData = loadMediaData(str, str2);
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a.x, new GlideBitmapDownloader$startLoadImageIntoViewIfNecessary$2(loadMediaData, this, listYandexPlayerView, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        }
        return zy11.a;
    }

    private final <R> R withSafeContext(tls block) {
        FragmentActivity checkContext = checkContext();
        if (checkContext != null) {
            return (R) block.invoke(checkContext);
        }
        return null;
    }

    public final void onSourceClearedFromView(ListYandexPlayerView view) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("GlideBitmapDownloader", "onSourceClearedFromView", "view tag:" + view.tag$video_player_internalRelease(), new Object[0]);
        }
        view.getFirstFrameView().setTag(null);
        this.glideRequestManager.clear(view.getFirstFrameView());
    }

    public final void onSourceSetForView(ListYandexPlayerView view, MediaData mediaItem) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("GlideBitmapDownloader", "onSourceSetForView", "view tag:" + view.tag$video_player_internalRelease(), new Object[0]);
        }
        checkContext();
        GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1 glideBitmapDownloader$onSourceSetForView$loadFirstFrame$1 = new GlideBitmapDownloader$onSourceSetForView$loadFirstFrame$1(mediaItem, this, view, null);
        WorkHelper workHelper = this.workHelper;
        if (workHelper == null || workHelper.launch(new GlideBitmapDownloader$onSourceSetForView$2(glideBitmapDownloader$onSourceSetForView$loadFirstFrame$1, null)) == null) {
            tje.X(new GlideBitmapDownloader$onSourceSetForView$3(glideBitmapDownloader$onSourceSetForView$loadFirstFrame$1, null));
        }
    }

    public final void onUpdateVisibleItemsList(List<MediaData> visibleItems) {
        checkContext();
        if (visibleItems.isEmpty()) {
            return;
        }
        int absoluteIndexOf = this.items.absoluteIndexOf((MediaData) kotlin.collections.a.P(visibleItems));
        if (absoluteIndexOf != -1) {
            this.listPreloader.onScroll(absoluteIndexOf, visibleItems.size(), this.items.getAbsoluteSize());
        } else if (this.failFast) {
            ny61.g("Visible items list is not contained in the whole list!");
        }
    }

    public final void onVideoDataLoadedForView(ListYandexPlayerView view, VideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose("GlideBitmapDownloader", "onVideoDataLoadedForView", "view tag:" + view.tag$video_player_internalRelease(), new Object[0]);
        }
        checkContext();
        GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1 glideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1 = new GlideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1(videoData instanceof VhVideoData ? (VhVideoData) videoData : null, this, view, null);
        WorkHelper workHelper = this.workHelper;
        if (workHelper == null || workHelper.launch(new GlideBitmapDownloader$onVideoDataLoadedForView$2(glideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1, null)) == null) {
            tje.X(new GlideBitmapDownloader$onVideoDataLoadedForView$3(glideBitmapDownloader$onVideoDataLoadedForView$loadFirstFrame$1, null));
        }
    }

    public final void release() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, "GlideBitmapDownloader", "release", null, new Object[0], 4, null);
        }
        this.glideRequestManager.pauseAllRequests();
        this.context = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/GlideBitmapDownloader$Companion;", "", "()V", "ACCEPT_HEADER", "", "ACCEPT_WEBP", "RATIO_HEIGHT", "", "RATIO_WIDTH", "TAG", "URL_SUFFIX_PLACEHOLDER", "WEBP_URL_SUFFIX", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "ctx", "Lzy11;", "invoke", "(Landroidx/fragment/app/FragmentActivity;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$3, reason: invalid class name */
    public static final class AnonymousClass3 extends Lambda implements tls {
        public AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(Lifecycle lifecycle, final GlideBitmapDownloader glideBitmapDownloader) {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$3$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* bridge */ /* synthetic */ void onCreate(pey peyVar) {
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(pey owner) {
                    GlideBitmapDownloader.this.release();
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* bridge */ /* synthetic */ void onPause(pey peyVar) {
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* bridge */ /* synthetic */ void onResume(pey peyVar) {
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* bridge */ /* synthetic */ void onStart(pey peyVar) {
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public /* bridge */ /* synthetic */ void onStop(pey peyVar) {
                }
            });
            if (lifecycle.b().a(Lifecycle.State.STARTED)) {
                glideBitmapDownloader.glideRequestManager.resumeRequests();
            }
        }

        public final void invoke(FragmentActivity fragmentActivity) {
            final Lifecycle lifecycle = fragmentActivity.getLifecycle();
            final GlideBitmapDownloader glideBitmapDownloader = GlideBitmapDownloader.this;
            fragmentActivity.runOnUiThread(new Runnable() { // from class: ru.yandex.video.m3.list_player_manager.impl.image.a
                @Override // java.lang.Runnable
                public final void run() {
                    GlideBitmapDownloader.AnonymousClass3.invoke$lambda$0(Lifecycle.this, glideBitmapDownloader);
                }
            });
        }

        @Override // defpackage.tls
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FragmentActivity) obj);
            return zy11.a;
        }
    }
}
