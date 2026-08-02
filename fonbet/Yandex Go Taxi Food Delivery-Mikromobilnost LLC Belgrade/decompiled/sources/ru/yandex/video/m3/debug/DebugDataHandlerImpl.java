package ru.yandex.video.m3.debug;

import android.content.Context;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.tls;
import defpackage.tse;
import defpackage.zls;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.debug.DebugDataHandlerImpl;
import ru.yandex.video.m3.debug.model.ListSdkDebugData;
import ru.yandex.video.m3.debug.model.ListSdkPlayerDebugData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.ui.debug.manager.YandexPlayerDebugDataManager;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.ui.debug.EngineHolder;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 L2\u00020\u0001:\u0003MLNB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001d\u0010'\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010\u001eJ\u001f\u0010,\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u000608R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R \u0010@\u001a\b\u0012\u0004\u0012\u00020=0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00120;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00107¨\u0006O"}, d2 = {"Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "Lru/yandex/video/m3/debug/DebugDataHandler;", "Ltse;", "scope", "Landroid/content/Context;", "applicationContext", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "debugViewToggleManager", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "listSdkDebugDataManager", "<init>", "(Ltse;Landroid/content/Context;Lru/yandex/video/m3/debug/DebugViewToggleManager;Lru/yandex/video/m3/debug/ListSdkDebugDataManager;)V", "Lru/yandex/video/m3/debug/model/ListSdkDebugData;", "listSdkDebugData", "", "isCompactView", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl$EpsilonConfig;", "epsilonConfig", "Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "getEpsilonForCurrentMediaItem", "(Lru/yandex/video/m3/debug/model/ListSdkDebugData;ZLru/yandex/video/m3/debug/DebugDataHandlerImpl$EpsilonConfig;)Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "E", "", "", "fromIndex", "toIndex", "safeBoundsSubList", "(Ljava/util/List;II)Ljava/util/List;", "Lzy11;", "release", "()V", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "setSource", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "dropSource", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "attachEngine", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "detachEngine", "width", "height", "setViewSize", "(II)V", "Ltse;", "Landroid/content/Context;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager;", "playerEngineDebugDataManager", "Lru/yandex/video/m3/player/ui/debug/manager/YandexPlayerDebugDataManager;", "Ll8x;", "playerCollectDebugDataJob", "Ll8x;", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl$AnalyticsObserver;", "analyticsObserver", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl$AnalyticsObserver;", "Lpz40;", "Lpz40;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "_playerEngineDebugDataFlow", "Ln4u0;", "playerEngineDebugDataFlow", "Ln4u0;", "getPlayerEngineDebugDataFlow", "()Ln4u0;", "_listPlayerManagerDebugDataFlow", "listPlayerManagerDebugDataFlow", "getListPlayerManagerDebugDataFlow", "currentMediaData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "currentEngine", "Lru/yandex/video/m3/player/YandexPlayer;", "handlerJob", "Companion", "AnalyticsObserver", "EpsilonConfig", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugDataHandlerImpl implements DebugDataHandler {
    private pz40 _listPlayerManagerDebugDataFlow;
    private final pz40 _playerEngineDebugDataFlow;
    private final Context applicationContext;
    private YandexPlayer<zxc0> currentEngine;
    private MediaData currentMediaData;
    private final DebugViewToggleManager debugViewToggleManager;
    private final l8x handlerJob;
    private final n4u0 listPlayerManagerDebugDataFlow;
    private final ListSdkDebugDataManager listSdkDebugDataManager;
    private l8x playerCollectDebugDataJob;
    private final n4u0 playerEngineDebugDataFlow;
    private YandexPlayerDebugDataManager playerEngineDebugDataManager;
    private final tse scope;
    public static final int $stable = 8;
    private static final Size COMPACT_VIEW_SIZE_THRESHOLD = SizeKt.Size$default(500, 900, null, 4, null);
    private final AnalyticsObserver analyticsObserver = new AnalyticsObserver();
    private pz40 isCompactView = bvf0.c(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/debug/DebugDataHandlerImpl$AnalyticsObserver;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "<init>", "(Lru/yandex/video/m3/debug/DebugDataHandlerImpl;)V", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "firstPlaybackInfo", "Lzy11;", "onReadyForFirstPlayback", "(Lru/yandex/video/m3/player/FirstPlaybackInfo;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AnalyticsObserver implements PlayerAnalyticsObserver {
        public AnalyticsObserver() {
        }

        @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
        public void onReadyForFirstPlayback(FirstPlaybackInfo firstPlaybackInfo) {
            MediaData mediaData = DebugDataHandlerImpl.this.currentMediaData;
            if (mediaData != null) {
                ListSdkDebugDataManager listSdkDebugDataManager = DebugDataHandlerImpl.this.listSdkDebugDataManager;
                StartFromCacheInfo startFromCacheInfo = firstPlaybackInfo.getStartFromCacheInfo();
                listSdkDebugDataManager.onStartFromCacheInfoReady(mediaData, startFromCacheInfo != null ? startFromCacheInfo.getVideoCachePositionMs() : null);
            }
        }
    }

    public DebugDataHandlerImpl(tse tseVar, Context context, DebugViewToggleManager debugViewToggleManager, ListSdkDebugDataManager listSdkDebugDataManager) {
        this.scope = tseVar;
        this.applicationContext = context;
        this.debugViewToggleManager = debugViewToggleManager;
        this.listSdkDebugDataManager = listSdkDebugDataManager;
        r0 c = bvf0.c(new DebugData(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, false, 67108863, null));
        this._playerEngineDebugDataFlow = c;
        this.playerEngineDebugDataFlow = e.d(c);
        Map map = null;
        boolean z = false;
        r0 c2 = bvf0.c(new ListSdkPlayerDebugData(null, null, null, null, null, null, null, null, null, map, null, null, null, null, z, null, 65535, null));
        this._listPlayerManagerDebugDataFlow = c2;
        this.listPlayerManagerDebugDataFlow = e.d(c2);
        this.handlerJob = e.H(tseVar, new m0(listSdkDebugDataManager.getDebugData(), this.isCompactView, new AnonymousClass1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListSdkPlayerDebugData getEpsilonForCurrentMediaItem(ListSdkDebugData listSdkDebugData, boolean isCompactView, EpsilonConfig epsilonConfig) {
        int numOfElementsBefore;
        int numOfElementsAfter;
        MediaData mediaData;
        Iterator<MediaData> it = listSdkDebugData.getMediaData().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(it.next(), this.currentMediaData)) {
                break;
            }
            i++;
        }
        Object obj = null;
        if (i == -1) {
            numOfElementsAfter = epsilonConfig.getNumOfElementsIfMediaDataNotFound();
            mediaData = null;
            numOfElementsBefore = 0;
        } else {
            numOfElementsBefore = i - epsilonConfig.getNumOfElementsBefore();
            if (numOfElementsBefore < 0) {
                numOfElementsBefore = 0;
            }
            numOfElementsAfter = i + epsilonConfig.getNumOfElementsAfter() + 1;
            mediaData = this.currentMediaData;
        }
        List safeBoundsSubList = safeBoundsSubList(listSdkDebugData.getMediaData(), numOfElementsBefore, numOfElementsAfter);
        Map<MediaData, PreloadState> preloadData = listSdkDebugData.getPreloadData();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<MediaData, PreloadState> entry : preloadData.entrySet()) {
            if (safeBoundsSubList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map<MediaData, Integer> attachedListPlayerIndex = listSdkDebugData.getAttachedListPlayerIndex();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<MediaData, Integer> entry2 : attachedListPlayerIndex.entrySet()) {
            if (safeBoundsSubList.contains(entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Map<MediaData, EngineHolder> attachedEnginesData = listSdkDebugData.getAttachedEnginesData();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<MediaData, EngineHolder> entry3 : attachedEnginesData.entrySet()) {
            if (safeBoundsSubList.contains(entry3.getKey())) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        Map<Integer, DecoderEventData> decoderData = listSdkDebugData.getDecoderData();
        Map<String, Integer> fatalErrorData = listSdkDebugData.getFatalErrorData();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry4 : fatalErrorData.entrySet()) {
            if (jl40.l(entry4.getKey(), ((DebugData) ((r0) this._playerEngineDebugDataFlow).getValue()).getVsid())) {
                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
            }
        }
        Integer num = (Integer) a.Q(linkedHashMap4.values());
        int intValue = num != null ? num.intValue() : 0;
        Iterator<T> it2 = listSdkDebugData.getSpeedTelemetry().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (jl40.l(((SpeedTelemetry) next).getUuid(), mediaData != null ? mediaData.getVideoContentId() : null)) {
                obj = next;
                break;
            }
        }
        SpeedTelemetry speedTelemetry = (SpeedTelemetry) obj;
        Map<MediaData, Boolean> isStartFromCache = listSdkDebugData.isStartFromCache();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry<MediaData, Boolean> entry5 : isStartFromCache.entrySet()) {
            if (jl40.l(entry5.getKey(), mediaData)) {
                linkedHashMap5.put(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = (Boolean) a.Q(linkedHashMap5.values());
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Map<MediaData, Boolean> isOnDemand = listSdkDebugData.isOnDemand();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry<MediaData, Boolean> entry6 : isOnDemand.entrySet()) {
            if (jl40.l(entry6.getKey(), mediaData)) {
                linkedHashMap6.put(entry6.getKey(), entry6.getValue());
            }
        }
        Boolean bool2 = (Boolean) a.Q(linkedHashMap6.values());
        List x0 = a.x0(a.J0(listSdkDebugData.getListBandwidthHistory()), new Comparator() { // from class: ru.yandex.video.m3.debug.DebugDataHandlerImpl$getEpsilonForCurrentMediaItem$lambda$11$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((BandwidthEstimation) t).getTimestamp()).compareTo(Long.valueOf(((BandwidthEstimation) t2).getTimestamp()));
            }
        });
        return new ListSdkPlayerDebugData(safeBoundsSubList, linkedHashMap, linkedHashMap2, linkedHashMap3, decoderData, Integer.valueOf(intValue), speedTelemetry, Boolean.valueOf(booleanValue), bool2, listSdkDebugData.getVideoTrackData(), listSdkDebugData.getCurrentBufferSize(), x0, a.x0(a.J0(listSdkDebugData.getLoadedChunksHistory()), new Comparator() { // from class: ru.yandex.video.m3.debug.DebugDataHandlerImpl$getEpsilonForCurrentMediaItem$lambda$11$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((LoadedChunk) t).getTimestamp()).compareTo(Long.valueOf(((LoadedChunk) t2).getTimestamp()));
            }
        }), mediaData, isCompactView, listSdkDebugData.getPlayDelta().get(mediaData));
    }

    private final <E> List<E> safeBoundsSubList(List<? extends E> list, int i, int i2) {
        int f = scc.f(list);
        if (f < 0) {
            f = 0;
        }
        if (i2 > f) {
            i2 = f;
        }
        if (i > i2) {
            i = i2;
        }
        return list.subList(i, i2);
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public void attachEngine(final YandexPlayer<zxc0> engine) {
        this.currentEngine = engine;
        engine.addAnalyticsObserver(this.analyticsObserver);
        YandexPlayerDebugDataManager yandexPlayerDebugDataManager = this.playerEngineDebugDataManager;
        if (yandexPlayerDebugDataManager != null) {
            yandexPlayerDebugDataManager.stop();
        }
        l8x l8xVar = this.playerCollectDebugDataJob;
        pzt0 pzt0Var = null;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        YandexPlayerDebugDataManager yandexPlayerDebugDataManager2 = new YandexPlayerDebugDataManager(this.scope);
        yandexPlayerDebugDataManager2.start(engine, this.applicationContext);
        this.playerEngineDebugDataManager = yandexPlayerDebugDataManager2;
        n4u0 debugData = yandexPlayerDebugDataManager2.getDebugData();
        if (debugData != null) {
            pzt0Var = e.H(this.scope, new jqr(debugData, new DebugDataHandlerImpl$attachEngine$2(this, null), 3));
        }
        this.playerCollectDebugDataJob = pzt0Var;
        if (pzt0Var != null) {
            pzt0Var.w(new tls() { // from class: ru.yandex.video.m3.debug.DebugDataHandlerImpl$attachEngine$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    DebugDataHandlerImpl.AnalyticsObserver analyticsObserver;
                    YandexPlayer<zxc0> yandexPlayer = engine;
                    analyticsObserver = this.analyticsObserver;
                    yandexPlayer.removeAnalyticsObserver(analyticsObserver);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return zy11.a;
                }
            });
        }
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public void detachEngine() {
        YandexPlayer<zxc0> yandexPlayer = this.currentEngine;
        if (yandexPlayer != null) {
            yandexPlayer.removeAnalyticsObserver(this.analyticsObserver);
        }
        this.currentEngine = null;
        YandexPlayerDebugDataManager yandexPlayerDebugDataManager = this.playerEngineDebugDataManager;
        if (yandexPlayerDebugDataManager != null) {
            yandexPlayerDebugDataManager.stop();
        }
        this.playerEngineDebugDataManager = null;
        l8x l8xVar = this.playerCollectDebugDataJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.playerCollectDebugDataJob = null;
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public void dropSource() {
        this.currentMediaData = null;
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public n4u0 getListPlayerManagerDebugDataFlow() {
        return this.listPlayerManagerDebugDataFlow;
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public n4u0 getPlayerEngineDebugDataFlow() {
        return this.playerEngineDebugDataFlow;
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public void release() {
        this.handlerJob.a(null);
        dropSource();
        detachEngine();
        YandexPlayerDebugDataManager yandexPlayerDebugDataManager = this.playerEngineDebugDataManager;
        if (yandexPlayerDebugDataManager != null) {
            yandexPlayerDebugDataManager.resetDebugData();
        }
        this.listSdkDebugDataManager.resetDebugData();
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public void setSource(MediaData mediaData) {
        this.currentMediaData = mediaData;
        this.listSdkDebugDataManager.onUpdateIsOnDemand(mediaData);
    }

    @Override // ru.yandex.video.m3.debug.DebugDataHandler
    public void setViewSize(int width, int height) {
        pz40 pz40Var = this.isCompactView;
        Size size = COMPACT_VIEW_SIZE_THRESHOLD;
        Boolean valueOf = Boolean.valueOf(width < size.getWidth() || height < size.getHeight());
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/debug/DebugDataHandlerImpl$EpsilonConfig;", "", "numOfElementsBefore", "", "numOfElementsAfter", "numOfElementsIfMediaDataNotFound", "(III)V", "getNumOfElementsAfter", "()I", "getNumOfElementsBefore", "getNumOfElementsIfMediaDataNotFound", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class EpsilonConfig {
        private final int numOfElementsAfter;
        private final int numOfElementsBefore;
        private final int numOfElementsIfMediaDataNotFound;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final EpsilonConfig DEFAULT_VIEW = new EpsilonConfig(3, 5, 5);
        private static final EpsilonConfig COMPACT_VIEW = new EpsilonConfig(1, 1, 1);

        public /* synthetic */ EpsilonConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? 1 : i2, (i4 & 4) != 0 ? 1 : i3);
        }

        public static /* synthetic */ EpsilonConfig copy$default(EpsilonConfig epsilonConfig, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = epsilonConfig.numOfElementsBefore;
            }
            if ((i4 & 2) != 0) {
                i2 = epsilonConfig.numOfElementsAfter;
            }
            if ((i4 & 4) != 0) {
                i3 = epsilonConfig.numOfElementsIfMediaDataNotFound;
            }
            return epsilonConfig.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNumOfElementsBefore() {
            return this.numOfElementsBefore;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNumOfElementsAfter() {
            return this.numOfElementsAfter;
        }

        /* renamed from: component3, reason: from getter */
        public final int getNumOfElementsIfMediaDataNotFound() {
            return this.numOfElementsIfMediaDataNotFound;
        }

        public final EpsilonConfig copy(int numOfElementsBefore, int numOfElementsAfter, int numOfElementsIfMediaDataNotFound) {
            return new EpsilonConfig(numOfElementsBefore, numOfElementsAfter, numOfElementsIfMediaDataNotFound);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EpsilonConfig)) {
                return false;
            }
            EpsilonConfig epsilonConfig = (EpsilonConfig) other;
            return this.numOfElementsBefore == epsilonConfig.numOfElementsBefore && this.numOfElementsAfter == epsilonConfig.numOfElementsAfter && this.numOfElementsIfMediaDataNotFound == epsilonConfig.numOfElementsIfMediaDataNotFound;
        }

        public final int getNumOfElementsAfter() {
            return this.numOfElementsAfter;
        }

        public final int getNumOfElementsBefore() {
            return this.numOfElementsBefore;
        }

        public final int getNumOfElementsIfMediaDataNotFound() {
            return this.numOfElementsIfMediaDataNotFound;
        }

        public int hashCode() {
            return Integer.hashCode(this.numOfElementsIfMediaDataNotFound) + oyr.b(this.numOfElementsAfter, Integer.hashCode(this.numOfElementsBefore) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EpsilonConfig(numOfElementsBefore=");
            sb.append(this.numOfElementsBefore);
            sb.append(", numOfElementsAfter=");
            sb.append(this.numOfElementsAfter);
            sb.append(", numOfElementsIfMediaDataNotFound=");
            return oyr.s(sb, this.numOfElementsIfMediaDataNotFound, ')');
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/debug/DebugDataHandlerImpl$EpsilonConfig$Companion;", "", "()V", "COMPACT_VIEW", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl$EpsilonConfig;", "getCOMPACT_VIEW", "()Lru/yandex/video/m3/debug/DebugDataHandlerImpl$EpsilonConfig;", "DEFAULT_VIEW", "getDEFAULT_VIEW", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EpsilonConfig getCOMPACT_VIEW() {
                return EpsilonConfig.COMPACT_VIEW;
            }

            public final EpsilonConfig getDEFAULT_VIEW() {
                return EpsilonConfig.DEFAULT_VIEW;
            }

            private Companion() {
            }
        }

        public EpsilonConfig(int i, int i2, int i3) {
            this.numOfElementsBefore = i;
            this.numOfElementsAfter = i2;
            this.numOfElementsIfMediaDataNotFound = i3;
        }

        public EpsilonConfig() {
            this(0, 0, 0, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/video/m3/debug/model/ListSdkDebugData;", "listSdkDebugData", "", "isCompactView", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/debug/model/ListSdkDebugData;Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.debug.DebugDataHandlerImpl$1", f = "DebugDataHandlerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.debug.DebugDataHandlerImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        public final Object invoke(ListSdkDebugData listSdkDebugData, boolean z, Continuation<? super zy11> continuation) {
            AnonymousClass1 anonymousClass1 = DebugDataHandlerImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = listSdkDebugData;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ListSdkDebugData listSdkDebugData = (ListSdkDebugData) this.L$0;
            boolean z = this.Z$0;
            boolean isNotEnabled$video_player_internalRelease = DebugViewToggleManagerImpl.INSTANCE.isNotEnabled$video_player_internalRelease(DebugDataHandlerImpl.this.debugViewToggleManager);
            zy11 zy11Var = zy11.a;
            if (isNotEnabled$video_player_internalRelease) {
                return zy11Var;
            }
            ((r0) DebugDataHandlerImpl.this._listPlayerManagerDebugDataFlow).l(DebugDataHandlerImpl.this.getEpsilonForCurrentMediaItem(listSdkDebugData, z, z ? EpsilonConfig.INSTANCE.getCOMPACT_VIEW() : EpsilonConfig.INSTANCE.getDEFAULT_VIEW()));
            return zy11Var;
        }

        @Override // defpackage.zls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ListSdkDebugData) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super zy11>) obj3);
        }
    }
}
