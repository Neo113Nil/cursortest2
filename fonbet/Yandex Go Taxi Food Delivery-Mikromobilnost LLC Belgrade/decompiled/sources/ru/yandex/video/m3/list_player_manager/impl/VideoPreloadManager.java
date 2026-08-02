package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.unr0;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerAudioStateObserver;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl;
import ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManager;
import ru.yandex.video.m3.list_player_manager.impl.preload.PreloadErrorHandler;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.utils.LimitedLinkedList;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.preload_manager.DownloadResult;
import ru.yandex.video.m3.preload_manager.PreloadConfig;
import ru.yandex.video.m3.preload_manager.PreloadConfigKt;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.PreloadManager;
import ru.yandex.video.m3.preload_manager.PreloadPriorityKt;
import ru.yandex.video.m3.preload_manager.PreloaderTransaction;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u007f\u0080\u0001B]\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b \u0010\u001eJ\u001b\u0010\"\u001a\u00020\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J'\u0010+\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J-\u00100\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\n2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0019H\u0016¢\u0006\u0004\b0\u00101J#\u00104\u001a\u00020\u001c2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&02H\u0016¢\u0006\u0004\b4\u00105J#\u00106\u001a\u00020\u001c2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020)02H\u0016¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u001c¢\u0006\u0004\b7\u00108J\u001d\u0010<\u001a\u00020\u001c2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000209¢\u0006\u0004\b<\u0010=J)\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020&022\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010J\u001a\u00020\u001c2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0HH\u0002¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u001c2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0H2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010%J\u000f\u0010O\u001a\u00020\u001cH\u0002¢\u0006\u0004\bO\u00108J\u0017\u0010Q\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020\u0004H\u0002¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ZR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010[R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\\R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010]R\u0014\u0010^\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b^\u0010XR$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010iR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001a0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010iR\"\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020&0k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u001a0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\"\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020&0k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010mR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001a0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010oR\u0016\u0010x\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010gR\u0016\u0010~\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010g¨\u0006\u0081\u0001"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager;", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;", "Lnoh;", "Lru/yandex/video/m3/preload_manager/PreloadManager;", "preloadManagerDeferred", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager;", "videoDataPreloadManager", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "listSdkVsid", "Lru/yandex/video/m3/player/IndexGenerator;", "sourceIndexGenerator", "eventIndexGenerator", "Lru/yandex/video/m3/list_player_manager/impl/preload/PreloadErrorHandler;", "preloadErrorHandler", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "listPlayerManagerAudioControl", "Lru/yandex/video/m3/ab/config/AbFlags;", "abFlags", "Ltse;", "observerScope", "<init>", "(Lnoh;Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager;Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/lang/String;Lru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/list_player_manager/impl/preload/PreloadErrorHandler;Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;Lru/yandex/video/m3/ab/config/AbFlags;Ltse;)V", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaItems", "Lzy11;", "onUpdateItemsList", "(Ljava/util/List;)V", "visibleMediaItems", "onUpdateVisibleItemsList", "items", "preloadItems", "mediaData", "notifyItemAttachedToListPlayer", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "videoSessionId", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_EXCEPTION, "onCancel", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Lru/yandex/video/m3/preload_manager/PreloadException;)V", "onError", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "results", "onSuccess", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Ljava/util/List;)V", "", Constants.KEY_DATA, "onVideoDataLoaded", "(Ljava/util/Map;)V", "onVideoDataError", "release", "()V", "", "width", "height", "setActualViewSize", "(II)V", "mediaDataList", "prepareDataForPreload", "(Ljava/util/List;)Ljava/util/Map;", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", "createPreloadConfig", "()Lru/yandex/video/m3/preload_manager/PreloadConfig;", "", "forceCurrentPreloadsRescheduling", "scheduleItemsToPreloader", "(Z)V", "", "itemsMustBePreloaded", "scheduleVideoDataPreload", "(Ljava/util/Set;)V", "scheduleVideoPreload", "(Ljava/util/Set;Z)V", "cancelPreload", "releasePreloadManager", "manager", "onPreloadManagerReady", "(Lru/yandex/video/m3/preload_manager/PreloadManager;)V", "mediaDataListToLogString", "(Ljava/util/List;)Ljava/lang/String;", "Lnoh;", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/lang/String;", "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/list_player_manager/impl/preload/PreloadErrorHandler;", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "Lru/yandex/video/m3/ab/config/AbFlags;", "Ltse;", "TAG", "Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManagerListener;", "videoPreloadManagerListener", "Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManagerListener;", "getVideoPreloadManagerListener", "()Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManagerListener;", "setVideoPreloadManagerListener", "(Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManagerListener;)V", "preloadCount", CA20Status.STATUS_USER_I, "", "Ljava/util/List;", "visibleItems", "", "preloadedVideoData", "Ljava/util/Map;", "isDestroyed", "Z", "", "preloadingVideoData", "Ljava/util/Set;", "preloadingItems", "Lru/yandex/video/m3/player/impl/utils/LimitedLinkedList;", "itemsConnectedToPlayer", "Lru/yandex/video/m3/player/impl/utils/LimitedLinkedList;", "isPreloadManagerReady", "preloadManager", "Lru/yandex/video/m3/preload_manager/PreloadManager;", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerAudioStateObserver;", "mutedObserver", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerAudioStateObserver;", "actualViewWidth", "actualViewHeight", "InternalContentIdProvider", "PreloadVideoData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoPreloadManager implements PreloadManager.Listener, VideoDataPreloadManager.VideoDataPreloadListener {
    public static final int $stable = 8;
    private final AbFlags abFlags;
    private int actualViewHeight;
    private int actualViewWidth;
    private final IndexGenerator eventIndexGenerator;
    private boolean isDestroyed;
    private boolean isPreloadManagerReady;
    private final ListPlayerManagerAudioControl listPlayerManagerAudioControl;
    private final String listSdkVsid;
    private final ListPlayerAudioStateObserver mutedObserver;
    private final tse observerScope;
    private final PlayerLogger playerLogger;
    private final int preloadCount;
    private final PreloadErrorHandler preloadErrorHandler;
    private PreloadManager preloadManager;
    private final noh preloadManagerDeferred;
    private final IndexGenerator sourceIndexGenerator;
    private final VideoDataPreloadManager videoDataPreloadManager;
    private VideoPreloadManagerListener videoPreloadManagerListener;
    private final String TAG = "VideoPreloadManager";
    private List<MediaData> items = new ArrayList();
    private List<MediaData> visibleItems = new ArrayList();
    private Map<MediaData, VideoData> preloadedVideoData = new LinkedHashMap();
    private Set<MediaData> preloadingVideoData = new LinkedHashSet();
    private Map<MediaData, VideoData> preloadingItems = new LinkedHashMap();
    private LimitedLinkedList<MediaData> itemsConnectedToPlayer = new LimitedLinkedList<>(5);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManager$1", f = "VideoPreloadManager.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return VideoPreloadManager.this.new AnonymousClass1(continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VideoPreloadManager videoPreloadManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                VideoPreloadManager videoPreloadManager2 = VideoPreloadManager.this;
                noh nohVar = videoPreloadManager2.preloadManagerDeferred;
                this.L$0 = videoPreloadManager2;
                this.label = 1;
                Object k = nohVar.k(this);
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = k;
                videoPreloadManager = videoPreloadManager2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                videoPreloadManager = (VideoPreloadManager) this.L$0;
                kotlin.b.b(obj);
            }
            videoPreloadManager.onPreloadManagerReady((PreloadManager) obj);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager$InternalContentIdProvider;", "", "getContentId", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InternalContentIdProvider {
        String getContentId();
    }

    public VideoPreloadManager(noh nohVar, VideoDataPreloadManager videoDataPreloadManager, PlayerLogger playerLogger, String str, IndexGenerator indexGenerator, IndexGenerator indexGenerator2, PreloadErrorHandler preloadErrorHandler, ListPlayerManagerAudioControl listPlayerManagerAudioControl, AbFlags abFlags, tse tseVar) {
        this.preloadManagerDeferred = nohVar;
        this.videoDataPreloadManager = videoDataPreloadManager;
        this.playerLogger = playerLogger;
        this.listSdkVsid = str;
        this.sourceIndexGenerator = indexGenerator;
        this.eventIndexGenerator = indexGenerator2;
        this.preloadErrorHandler = preloadErrorHandler;
        this.listPlayerManagerAudioControl = listPlayerManagerAudioControl;
        this.abFlags = abFlags;
        this.observerScope = tseVar;
        this.preloadCount = abFlags.getPreloadCountInListSDK();
        ListPlayerAudioStateObserver listPlayerAudioStateObserver = new ListPlayerAudioStateObserver() { // from class: an31
            @Override // ru.yandex.video.m3.list_player_manager.audio.ListPlayerAudioStateObserver
            public final void onMutedSet(boolean z) {
                VideoPreloadManager.this.scheduleItemsToPreloader(true);
            }
        };
        this.mutedObserver = listPlayerAudioStateObserver;
        tje.N(tseVar, null, null, new AnonymousClass1(null), 3);
        listPlayerManagerAudioControl.addObserver(listPlayerAudioStateObserver);
        this.actualViewWidth = Integer.MAX_VALUE;
        this.actualViewHeight = Integer.MAX_VALUE;
    }

    private final void cancelPreload(MediaData mediaData) {
        if (this.isPreloadManagerReady) {
            VideoData videoData = this.preloadingItems.get(mediaData);
            if (videoData != null) {
                PlayerLogger playerLogger = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                    playerLogger.verbose(this.TAG, "cancelPreload", String.valueOf(mediaData.getVideoContentId()), new Object[0]);
                }
                PreloadManager preloadManager = this.preloadManager;
                if (preloadManager == null) {
                    preloadManager = null;
                }
                preloadManager.cancelPreload(videoData);
            }
            String videoContentId = mediaData.getVideoContentId();
            if (videoContentId != null) {
                this.videoDataPreloadManager.cancelPreload(Collections.singletonList(videoContentId));
            }
        }
        this.preloadingItems.remove(mediaData);
        VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
        if (videoPreloadManagerListener != null) {
            videoPreloadManagerListener.onPreloadCanceled(mediaData);
        }
        this.preloadingVideoData.remove(mediaData);
    }

    private final PreloadConfig createPreloadConfig() {
        final int nextIndex = this.sourceIndexGenerator.getNextIndex();
        final boolean isMuted = this.listPlayerManagerAudioControl.isMuted();
        final int i = 1;
        return PreloadConfigKt.PreloadConfig(5242880L, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManager$createPreloadConfig$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PreloadConfig.Builder builder) {
                String str;
                IndexGenerator indexGenerator;
                int i2;
                int i3;
                builder.setMaxDownloadSegmentCount(Integer.valueOf(i));
                str = this.listSdkVsid;
                builder.setVsid(str);
                builder.setSourceIndex(Integer.valueOf(nextIndex));
                indexGenerator = this.eventIndexGenerator;
                builder.setEventIndexGenerator$video_player_internalRelease(indexGenerator);
                i2 = this.actualViewWidth;
                builder.setMaxWidth(Integer.valueOf(i2));
                i3 = this.actualViewHeight;
                builder.setMaxHeight(Integer.valueOf(i3));
                builder.setOmitAudio(Boolean.valueOf(isMuted));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PreloadConfig.Builder) obj);
                return zy11.a;
            }
        });
    }

    private final String mediaDataListToLogString(List<MediaData> list) {
        List<MediaData> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaData) it.next()).getVideoContentId());
        }
        return kotlin.collections.a.X(arrayList, null, null, null, null, 63);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPreloadManagerReady(PreloadManager manager) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, this.TAG, "onPreloadManagerReady", null, new Object[0], 4, null);
        }
        this.preloadManager = manager;
        if (manager == null) {
            manager = null;
        }
        manager.addListener(this);
        this.videoDataPreloadManager.setListener(this);
        this.isPreloadManagerReady = true;
        if (this.isDestroyed) {
            releasePreloadManager();
        } else {
            if (this.items.isEmpty() || this.visibleItems.isEmpty()) {
                return;
            }
            scheduleItemsToPreloader(false);
        }
    }

    private final Map<MediaData, VideoData> prepareDataForPreload(List<MediaData> mediaDataList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MediaData mediaData : mediaDataList) {
            VideoData videoData = this.preloadedVideoData.get(mediaData);
            if (videoData != null) {
                linkedHashMap.put(mediaData, new PreloadVideoData(mediaData, videoData.getManifestUrl(), null, null, 12, null));
            } else {
                String streamFromMediaData = UtilKt.streamFromMediaData(mediaData);
                if (streamFromMediaData != null) {
                    linkedHashMap.put(mediaData, new PreloadVideoData(mediaData, streamFromMediaData, null, null, 12, null));
                }
            }
        }
        return linkedHashMap;
    }

    private final void releasePreloadManager() {
        if (!this.isPreloadManagerReady) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "releasePreloadManager", "preloadManager is not ready!", null, new Object[0], 8, null);
            return;
        }
        PreloadManager preloadManager = this.preloadManager;
        if (preloadManager == null) {
            preloadManager = null;
        }
        PreloaderTransaction startTransaction = preloadManager.startTransaction();
        Iterator<T> it = this.preloadingItems.values().iterator();
        while (it.hasNext()) {
            startTransaction.cancelPreload((VideoData) it.next());
        }
        startTransaction.commit();
        PreloadManager preloadManager2 = this.preloadManager;
        (preloadManager2 != null ? preloadManager2 : null).shutdown();
        this.videoDataPreloadManager.shutDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleItemsToPreloader(boolean forceCurrentPreloadsRescheduling) {
        boolean z = this.isPreloadManagerReady;
        PlayerLogger playerLogger = this.playerLogger;
        if (!z) {
            PlayerLogger.error$default(playerLogger, this.TAG, "scheduleItemsToPreloader", "preloadManager is not ready!", null, new Object[0], 8, null);
            return;
        }
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, this.TAG, "scheduleItemsToPreloader", null, new Object[0], 4, null);
        }
        int indexOf = this.items.indexOf(kotlin.collections.a.R(this.visibleItems));
        if (indexOf == -1) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "scheduleItemsToPreloader", "current item not found", null, new Object[0], 8, null);
        }
        PlayerLogger playerLogger2 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(this.TAG, "scheduleItemsToPreloader", "items next to visible = " + mediaDataListToLogString(this.items.subList(Integer.max(0, indexOf - 4), Integer.min(this.items.size(), indexOf + 4))), new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (indexOf >= 0) {
            List<MediaData> list = this.items;
            arrayList.addAll(list.subList(indexOf, Integer.min(list.size(), this.preloadCount + indexOf)));
        }
        Set<MediaData> N0 = kotlin.collections.a.N0(kotlin.collections.a.k0(arrayList, this.itemsConnectedToPlayer));
        scheduleVideoDataPreload(N0);
        scheduleVideoPreload(N0, forceCurrentPreloadsRescheduling);
        PlayerLogger playerLogger3 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger3)) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("now preloading streams [");
            sb.append(mediaDataListToLogString(kotlin.collections.a.J0(this.preloadingItems.keySet())));
            sb.append("], videoData [");
            playerLogger3.verbose(str, "scheduleItemsToPreloader", b64.p(sb, mediaDataListToLogString(kotlin.collections.a.J0(this.preloadingVideoData)), ']'), new Object[0]);
        }
    }

    private final void scheduleVideoDataPreload(Set<MediaData> itemsMustBePreloaded) {
        String videoContentId;
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemsMustBePreloaded) {
            MediaData mediaData = (MediaData) obj;
            if (mediaData.getStreams().isEmpty() && (videoContentId = mediaData.getVideoContentId()) != null && videoContentId.length() != 0) {
                arrayList.add(obj);
            }
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        if (N0.isEmpty()) {
            return;
        }
        Set g = v4r0.g(this.preloadingVideoData, N0);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "scheduleVideoDataPreload", "items selected for stop preloading by contentId = " + mediaDataListToLogString(kotlin.collections.a.J0(g)), new Object[0]);
        }
        Set g2 = v4r0.g(v4r0.g(v4r0.g(N0, this.preloadingVideoData), this.preloadedVideoData.keySet()), this.itemsConnectedToPlayer);
        PlayerLogger playerLogger2 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(this.TAG, "scheduleVideoDataPreload", "items selected for start preloading by contentId = " + mediaDataListToLogString(kotlin.collections.a.J0(g2)), new Object[0]);
        }
        this.preloadingVideoData.removeAll(g);
        VideoDataPreloadManager videoDataPreloadManager = this.videoDataPreloadManager;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String videoContentId2 = ((MediaData) it.next()).getVideoContentId();
            if (videoContentId2 != null) {
                arrayList2.add(videoContentId2);
            }
        }
        videoDataPreloadManager.cancelPreload(arrayList2);
        Set<MediaData> set = g2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String videoContentId3 = ((MediaData) it2.next()).getVideoContentId();
            if (videoContentId3 != null) {
                arrayList3.add(videoContentId3);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        this.videoDataPreloadManager.startPreload(arrayList3);
        this.preloadingVideoData.addAll(g2);
        for (MediaData mediaData2 : set) {
            VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
            if (videoPreloadManagerListener != null) {
                videoPreloadManagerListener.onPreloadStarted(mediaData2);
            }
        }
    }

    private final void scheduleVideoPreload(Set<MediaData> itemsMustBePreloaded, boolean forceCurrentPreloadsRescheduling) {
        Map<MediaData, VideoData> map = this.preloadingItems;
        Set<MediaData> N0 = forceCurrentPreloadsRescheduling ? kotlin.collections.a.N0(map.keySet()) : v4r0.g(map.keySet(), itemsMustBePreloaded);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "scheduleStreamsPreload", "items selected for stop preloading by url = " + mediaDataListToLogString(kotlin.collections.a.J0(N0)), new Object[0]);
        }
        Set<MediaData> set = this.preloadingVideoData;
        Set g = forceCurrentPreloadsRescheduling ? v4r0.g(v4r0.g(itemsMustBePreloaded, set), this.itemsConnectedToPlayer) : v4r0.g(v4r0.g(v4r0.g(itemsMustBePreloaded, set), this.preloadingItems.keySet()), this.itemsConnectedToPlayer);
        PlayerLogger playerLogger2 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(this.TAG, "scheduleStreamsPreload", "items selected for start preloading by url = " + mediaDataListToLogString(kotlin.collections.a.J0(g)), new Object[0]);
        }
        Map<MediaData, VideoData> prepareDataForPreload = prepareDataForPreload(kotlin.collections.a.J0(g));
        if (N0.isEmpty() && prepareDataForPreload.isEmpty()) {
            return;
        }
        PreloadManager preloadManager = this.preloadManager;
        if (preloadManager == null) {
            preloadManager = null;
        }
        PreloaderTransaction startTransaction = preloadManager.startTransaction();
        for (MediaData mediaData : N0) {
            VideoData videoData = this.preloadingItems.get(mediaData);
            if (videoData != null) {
                startTransaction.cancelPreload(videoData);
            }
            this.preloadingItems.remove(mediaData);
        }
        PreloadConfig createPreloadConfig = createPreloadConfig();
        for (Map.Entry<MediaData, VideoData> entry : prepareDataForPreload.entrySet()) {
            MediaData key = entry.getKey();
            VideoData value = entry.getValue();
            startTransaction.startPreload(value, createPreloadConfig, PreloadPriorityKt.PreloadPriority$default(1, null, 2, null));
            this.preloadingItems.put(key, value);
            VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
            if (videoPreloadManagerListener != null) {
                videoPreloadManagerListener.onPreloadStarted(key);
            }
        }
        startTransaction.commit();
    }

    public final VideoPreloadManagerListener getVideoPreloadManagerListener() {
        return this.videoPreloadManagerListener;
    }

    public final void notifyItemAttachedToListPlayer(MediaData mediaData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "notifyItemAttachedToListPlayer", String.valueOf(mediaData.getVideoContentId()), new Object[0]);
        }
        cancelPreload(mediaData);
        PlayerLogger playerLogger2 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(this.TAG, "notifyItemAttachedToListPlayer", "now preloading= " + mediaDataListToLogString(kotlin.collections.a.J0(this.preloadingItems.keySet())), new Object[0]);
        }
        this.itemsConnectedToPlayer.addLast(mediaData);
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager.Listener
    public void onCancel(VideoData videoData, String videoSessionId, PreloadException exception) {
        MediaData mediaData = ((PreloadVideoData) videoData).getMediaData();
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "onCancel", "preload " + mediaData.getVideoContentId() + " ex=" + exception, new Object[0]);
        }
        VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
        if (videoPreloadManagerListener != null) {
            videoPreloadManagerListener.onPreloadCanceled(mediaData);
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager.Listener
    public void onError(VideoData videoData, String videoSessionId, PreloadException exception) {
        MediaData mediaData = ((PreloadVideoData) videoData).getMediaData();
        this.playerLogger.error(this.TAG, "onError", "preload " + mediaData.getVideoContentId(), exception, new Object[0]);
        VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
        if (videoPreloadManagerListener != null) {
            videoPreloadManagerListener.onPreloadError(mediaData);
        }
        String videoContentId = mediaData.getVideoContentId();
        if (videoContentId != null) {
            this.preloadErrorHandler.handleVideoLoadError(videoContentId, exception);
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager.Listener
    public void onSuccess(VideoData videoData, String videoSessionId, List<DownloadResult> results) {
        MediaData mediaData = ((PreloadVideoData) videoData).getMediaData();
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "onSuccess", "preload " + mediaData.getVideoContentId() + " res=" + results, new Object[0]);
        }
        VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
        if (videoPreloadManagerListener != null) {
            DownloadResult downloadResult = (DownloadResult) kotlin.collections.a.R(results);
            videoPreloadManagerListener.onPreloadSuccess(mediaData, downloadResult != null ? downloadResult.getBytesDownloaded() : 0L);
        }
    }

    public final void onUpdateItemsList(List<MediaData> mediaItems) {
        this.items.clear();
        this.items.addAll(mediaItems);
        Map<MediaData, VideoData> map = this.preloadedVideoData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<MediaData, VideoData> entry : map.entrySet()) {
            if (mediaItems.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.preloadedVideoData = new LinkedHashMap(linkedHashMap);
        if (this.isPreloadManagerReady) {
            scheduleItemsToPreloader(false);
        }
    }

    public final void onUpdateVisibleItemsList(List<MediaData> visibleMediaItems) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "onUpdateVisibleItemsList", "visibleItems updated = " + mediaDataListToLogString(visibleMediaItems), new Object[0]);
        }
        if (visibleMediaItems.isEmpty()) {
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                playerLogger2.verbose(this.TAG, "onUpdateVisibleItemsList", "visibleItems.isEmpty()", new Object[0]);
            }
        }
        this.visibleItems.clear();
        this.visibleItems.addAll(visibleMediaItems);
        if (this.isPreloadManagerReady) {
            scheduleItemsToPreloader(false);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager.VideoDataPreloadListener
    public void onVideoDataError(Map<String, ? extends PreloadException> data) {
        Object obj;
        for (Map.Entry<String, ? extends PreloadException> entry : data.entrySet()) {
            String key = entry.getKey();
            this.playerLogger.error(this.TAG, "onError", g8e.o("preload ", key), entry.getValue(), new Object[0]);
            Iterator<T> it = this.preloadingVideoData.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((MediaData) obj).getVideoContentId(), key)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MediaData mediaData = (MediaData) obj;
            if (mediaData != null) {
                VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
                if (videoPreloadManagerListener != null) {
                    videoPreloadManagerListener.onPreloadError(mediaData);
                }
                this.preloadingVideoData.remove(mediaData);
            }
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager.VideoDataPreloadListener
    public void onVideoDataLoaded(Map<String, ? extends VideoData> data) {
        Object obj;
        for (Map.Entry<String, ? extends VideoData> entry : data.entrySet()) {
            String key = entry.getKey();
            VideoData value = entry.getValue();
            Iterator<T> it = this.preloadingVideoData.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((MediaData) obj).getVideoContentId(), key)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MediaData mediaData = (MediaData) obj;
            if (mediaData != null) {
                this.preloadedVideoData.put(mediaData, value);
                this.preloadingVideoData.remove(mediaData);
            }
        }
        if (this.isPreloadManagerReady) {
            scheduleItemsToPreloader(false);
        }
    }

    public final void preloadItems(List<MediaData> items) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "preloadItems", "items = " + mediaDataListToLogString(items), new Object[0]);
        }
        Map<MediaData, VideoData> prepareDataForPreload = prepareDataForPreload(items);
        PreloadConfig createPreloadConfig = createPreloadConfig();
        PreloadManager preloadManager = this.preloadManager;
        if (preloadManager == null) {
            preloadManager = null;
        }
        PreloaderTransaction startTransaction = preloadManager.startTransaction();
        for (Map.Entry<MediaData, VideoData> entry : prepareDataForPreload.entrySet()) {
            MediaData key = entry.getKey();
            VideoData value = entry.getValue();
            startTransaction.startPreload(value, createPreloadConfig, PreloadPriorityKt.PreloadPriority$default(2, null, 2, null));
            this.preloadingItems.put(key, value);
            VideoPreloadManagerListener videoPreloadManagerListener = this.videoPreloadManagerListener;
            if (videoPreloadManagerListener != null) {
                videoPreloadManagerListener.onPreloadStarted(key);
            }
        }
        startTransaction.commit();
    }

    public final void release() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "release", "isPreloadManagerReady = " + this.isPreloadManagerReady, new Object[0]);
        }
        if (this.isPreloadManagerReady) {
            releasePreloadManager();
        }
        this.preloadingItems.clear();
        this.preloadedVideoData.clear();
        this.preloadingVideoData.clear();
        this.itemsConnectedToPlayer.clear();
        this.isDestroyed = true;
    }

    public final void setActualViewSize(int width, int height) {
        this.actualViewWidth = width;
        this.actualViewHeight = height;
    }

    public final void setVideoPreloadManagerListener(VideoPreloadManagerListener videoPreloadManagerListener) {
        this.videoPreloadManagerListener = videoPreloadManagerListener;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager$PreloadVideoData;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/list_player_manager/impl/VideoPreloadManager$InternalContentIdProvider;", "mediaData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "manifestUrl", "", "audioLanguage", "subtitleLanguage", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioLanguage", "()Ljava/lang/String;", "getManifestUrl", "getMediaData", "()Lru/yandex/video/m3/list_player_manager/model/MediaData;", "getSubtitleLanguage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "getContentId", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreloadVideoData implements VideoData, InternalContentIdProvider {
        private final String audioLanguage;
        private final String manifestUrl;
        private final MediaData mediaData;
        private final String subtitleLanguage;

        public /* synthetic */ PreloadVideoData(MediaData mediaData, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(mediaData, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public static /* synthetic */ PreloadVideoData copy$default(PreloadVideoData preloadVideoData, MediaData mediaData, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaData = preloadVideoData.mediaData;
            }
            if ((i & 2) != 0) {
                str = preloadVideoData.manifestUrl;
            }
            if ((i & 4) != 0) {
                str2 = preloadVideoData.audioLanguage;
            }
            if ((i & 8) != 0) {
                str3 = preloadVideoData.subtitleLanguage;
            }
            return preloadVideoData.copy(mediaData, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final MediaData getMediaData() {
            return this.mediaData;
        }

        /* renamed from: component2, reason: from getter */
        public final String getManifestUrl() {
            return this.manifestUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAudioLanguage() {
            return this.audioLanguage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitleLanguage() {
            return this.subtitleLanguage;
        }

        public final PreloadVideoData copy(MediaData mediaData, String manifestUrl, String audioLanguage, String subtitleLanguage) {
            return new PreloadVideoData(mediaData, manifestUrl, audioLanguage, subtitleLanguage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreloadVideoData)) {
                return false;
            }
            PreloadVideoData preloadVideoData = (PreloadVideoData) other;
            return jl40.l(this.mediaData, preloadVideoData.mediaData) && jl40.l(this.manifestUrl, preloadVideoData.manifestUrl) && jl40.l(this.audioLanguage, preloadVideoData.audioLanguage) && jl40.l(this.subtitleLanguage, preloadVideoData.subtitleLanguage);
        }

        @Override // ru.yandex.video.m3.data.dto.VideoData
        public String getAudioLanguage() {
            return this.audioLanguage;
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManager.InternalContentIdProvider
        public String getContentId() {
            String videoContentId = this.mediaData.getVideoContentId();
            return videoContentId == null ? "unknown" : videoContentId;
        }

        @Override // ru.yandex.video.m3.data.dto.VideoData
        public String getManifestUrl() {
            return this.manifestUrl;
        }

        public final MediaData getMediaData() {
            return this.mediaData;
        }

        @Override // ru.yandex.video.m3.data.dto.VideoData
        public String getSubtitleLanguage() {
            return this.subtitleLanguage;
        }

        public int hashCode() {
            int b = unr0.b(this.mediaData.hashCode() * 31, 31, this.manifestUrl);
            String str = this.audioLanguage;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitleLanguage;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PreloadVideoData(mediaData=");
            sb.append(this.mediaData);
            sb.append(", manifestUrl=");
            sb.append(this.manifestUrl);
            sb.append(", audioLanguage=");
            sb.append(this.audioLanguage);
            sb.append(", subtitleLanguage=");
            return b64.p(sb, this.subtitleLanguage, ')');
        }

        public PreloadVideoData(MediaData mediaData, String str, String str2, String str3) {
            this.mediaData = mediaData;
            this.manifestUrl = str;
            this.audioLanguage = str2;
            this.subtitleLanguage = str3;
        }
    }
}
