package ru.yandex.video.m3.debug;

import defpackage.bvf0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.debug.model.InitMediaItemBundle;
import ru.yandex.video.m3.debug.model.ListSdkDebugData;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.ui.debug.EngineHolder;
import ru.yandex.video.m3.ui.debug.Item;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;
import ru.yandex.video.m3.ui.debug.StartBitrateDataHolder;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 d2\u00020\u0001:\u0002deB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u001dJ\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010\u001dJ\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010\u001dJ'\u00102\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J'\u00105\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b5\u00103J\u001d\u00108\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001306H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u000e2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001306H\u0017¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0010J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000eH\u0002¢\u0006\u0004\bM\u0010\u0010J\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020\u000e2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P06H\u0002¢\u0006\u0004\bR\u00109J\u001d\u0010S\u001a\u00020\u000e2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P06H\u0002¢\u0006\u0004\bS\u00109J\u001d\u0010T\u001a\u00020\u000e2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P06H\u0002¢\u0006\u0004\bT\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010]\u001a\b\u0012\u0004\u0012\u00020Y0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lru/yandex/video/m3/debug/ListSdkDebugDataManagerImpl;", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "debugViewToggleManager", "", "bufferForPlaybackMs", "Lru/yandex/video/m3/debug/SpeedTelemetryObservable;", "speedTelemetryObservable", "Ltse;", "scope", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/debug/DebugViewToggleManager;Ljava/lang/Integer;Lru/yandex/video/m3/debug/SpeedTelemetryObservable;Ltse;)V", "Lzy11;", "resetDebugData", "()V", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "playerDebugData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "currentMediaData", "onPlayerDebugDataUpdate", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "mediaData", "", "videoCachePositionMs", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Ljava/lang/Long;)V", "onUpdateIsOnDemand", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "onItemAttachedToListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "onEngineAttachedToMediaData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetachedToMediaData", "onPreloadStarted", "bytes", "onPreloadSuccess", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;J)V", "onPreloadCanceled", "onPreloadError", "engineIndex", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", Constants.KEY_DATA, "onDecoderInitialized", "(ILru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "", "mediaItems", "onUpdateItemsList", "(Ljava/util/List;)V", "visibleItems", "onUpdateVisibleItemsList", "release", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "bandwidthEstimation", "appendLastPlayerBandwidth", "(Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;)V", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "videoTrackData", "updateVideoTrackData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "currentBufferSize", "updateCurrentBufferSize", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/ui/debug/model/BufferSize;)V", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "lastLoadedChunk", "updateLoadedChunksHistory", "(Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;)V", "updateItemsList", "updateDecoderData", "(ILru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "Lru/yandex/video/m3/debug/model/InitMediaItemBundle;", "initMediaItemBundles", "onSpeedTelemetryUpdate", "updatePlayDelta", "updateSpeedTelemetry", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "Ljava/lang/Integer;", "Lpz40;", "Lru/yandex/video/m3/debug/model/ListSdkDebugData;", "_debugData", "Lpz40;", "Ln4u0;", "debugData", "Ln4u0;", "getDebugData", "()Ln4u0;", "Ll8x;", "speedTelemetryObservableJob", "Ll8x;", "Companion", "DebugDataPlayerObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListSdkDebugDataManagerImpl implements ListSdkDebugDataManager {
    private static final String NOTHING_CONTENT_ID = "nothing";
    private static final int NO_BITRATE = -1;
    private static final String TAG = "ListSdkDebugDataManager";
    private final pz40 _debugData;
    private final Integer bufferForPlaybackMs;
    private final n4u0 debugData;
    private final DebugViewToggleManager debugViewToggleManager;
    private final PlayerLogger playerLogger;
    private l8x speedTelemetryObservableJob;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/yandex/video/m3/debug/model/InitMediaItemBundle;", "initMediaItemBundles", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.debug.ListSdkDebugDataManagerImpl$1", f = "ListSdkDebugDataManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.debug.ListSdkDebugDataManagerImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ListSdkDebugDataManagerImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(List<InitMediaItemBundle> list, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            List list = (List) this.L$0;
            boolean isNotEnabled$video_player_internalRelease = DebugViewToggleManagerImpl.INSTANCE.isNotEnabled$video_player_internalRelease(ListSdkDebugDataManagerImpl.this.debugViewToggleManager);
            zy11 zy11Var = zy11.a;
            if (isNotEnabled$video_player_internalRelease) {
                return zy11Var;
            }
            ListSdkDebugDataManagerImpl.this.onSpeedTelemetryUpdate(list);
            return zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/debug/ListSdkDebugDataManagerImpl$DebugDataPlayerObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "<init>", "(Lru/yandex/video/m3/debug/ListSdkDebugDataManagerImpl;Lru/yandex/video/m3/player/YandexPlayer;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lzy11;", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onReadyForFirstPlayback", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DebugDataPlayerObserver implements PlayerObserver<Object> {
        private final YandexPlayer<?> player;

        public DebugDataPlayerObserver(YandexPlayer<?> yandexPlayer) {
            this.player = yandexPlayer;
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackError(PlaybackException playbackException) {
            if (DebugViewToggleManagerImpl.INSTANCE.isNotEnabled$video_player_internalRelease(ListSdkDebugDataManagerImpl.this.debugViewToggleManager)) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) ListSdkDebugDataManagerImpl.this._debugData).getValue()).getFatalErrorData());
            String sessionId = this.player.getSessionId();
            Integer num = (Integer) linkedHashMap.get(sessionId);
            linkedHashMap.put(sessionId, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            pz40 pz40Var = ListSdkDebugDataManagerImpl.this._debugData;
            while (true) {
                r0 r0Var = (r0) pz40Var;
                Object value = r0Var.getValue();
                pz40 pz40Var2 = pz40Var;
                if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, 130943, null))) {
                    return;
                } else {
                    pz40Var = pz40Var2;
                }
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onReadyForFirstPlayback() {
            Object obj;
            String str;
            r0 r0Var;
            Object value;
            TrackFormat selectedTrackFormat;
            MediaData mediaData;
            if (DebugViewToggleManagerImpl.INSTANCE.isNotEnabled$video_player_internalRelease(ListSdkDebugDataManagerImpl.this.debugViewToggleManager)) {
                return;
            }
            Iterator<T> it = ((ListSdkDebugData) ((r0) ListSdkDebugDataManagerImpl.this._debugData).getValue()).getAttachedEnginesData().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((EngineHolder) ((Map.Entry) obj).getValue()).getEngine(), this.player)) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (mediaData = (MediaData) entry.getKey()) == null || (str = mediaData.getVideoContentId()) == null) {
                str = ListSdkDebugDataManagerImpl.NOTHING_CONTENT_ID;
            }
            ArrayList arrayList = new ArrayList(((ListSdkDebugData) ((r0) ListSdkDebugDataManagerImpl.this._debugData).getValue()).getStartVideoBitrateData());
            Track videoTrack = this.player.getVideoTrack();
            arrayList.add(new StartBitrateDataHolder(str, (videoTrack == null || (selectedTrackFormat = videoTrack.getSelectedTrackFormat()) == null) ? -1 : selectedTrackFormat.getBitrate()));
            pz40 pz40Var = ListSdkDebugDataManagerImpl.this._debugData;
            do {
                r0Var = (r0) pz40Var;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, 130815, null)));
        }
    }

    public ListSdkDebugDataManagerImpl(PlayerLogger playerLogger, DebugViewToggleManager debugViewToggleManager, Integer num, SpeedTelemetryObservable speedTelemetryObservable, tse tseVar) {
        this.playerLogger = playerLogger;
        this.debugViewToggleManager = debugViewToggleManager;
        this.bufferForPlaybackMs = num;
        r0 c = bvf0.c(new ListSdkDebugData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null));
        this._debugData = c;
        this.debugData = e.d(c);
        this.speedTelemetryObservableJob = e.H(tseVar, new jqr(speedTelemetryObservable.getItems(), new AnonymousClass1(null), 3));
    }

    private final void appendLastPlayerBandwidth(BandwidthEstimation bandwidthEstimation) {
        Set M0 = a.M0(((ListSdkDebugData) ((r0) this._debugData).getValue()).getListBandwidthHistory());
        M0.add(bandwidthEstimation);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            Set set = M0;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, set, null, null, 114687, null))) {
                return;
            }
            M0 = set;
            pz40Var = pz40Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSpeedTelemetryUpdate(List<InitMediaItemBundle> initMediaItemBundles) {
        updatePlayDelta(initMediaItemBundles);
        updateSpeedTelemetry(initMediaItemBundles);
    }

    private final void updateCurrentBufferSize(MediaData mediaData, BufferSize currentBufferSize) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getCurrentBufferSize());
        linkedHashMap.put(mediaData, currentBufferSize);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap2, null, null, null, 122879, null))) {
                return;
            }
            pz40Var = pz40Var2;
            linkedHashMap = linkedHashMap2;
        }
    }

    private final void updateDecoderData(int engineIndex, DecoderEventData data) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getDecoderData());
        linkedHashMap.put(Integer.valueOf(engineIndex), data);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, 131007, null))) {
                return;
            } else {
                pz40Var = pz40Var2;
            }
        }
    }

    private final void updateItemsList() {
        r0 r0Var;
        Object value;
        List<MediaData> mediaData = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getMediaData();
        List<MediaData> visibleMediaData = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getVisibleMediaData();
        int indexOf = mediaData.indexOf(a.R(visibleMediaData));
        ArrayList<MediaData> arrayList = new ArrayList();
        if (indexOf >= 0) {
            arrayList.addAll(mediaData.subList(Integer.max(0, indexOf - 1), Integer.min(mediaData.size(), indexOf + 6)));
        }
        Map<MediaData, PreloadState> preloadData = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getPreloadData();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (MediaData mediaData2 : arrayList) {
            boolean contains = visibleMediaData.contains(mediaData2);
            EngineHolder engineHolder = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getAttachedEnginesData().get(mediaData2);
            YandexPlayer<?> engine = engineHolder != null ? engineHolder.getEngine() : null;
            Integer num = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getAttachedListPlayerIndex().get(mediaData2);
            PreloadState preloadState = preloadData.get(mediaData2);
            if (preloadState == null) {
                preloadState = PreloadState.NONE;
            }
            arrayList2.add(new Item(mediaData2, contains, engine, num, preloadState));
        }
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067, null)));
    }

    private final void updateLoadedChunksHistory(LoadedChunk lastLoadedChunk) {
        Set M0 = a.M0(((ListSdkDebugData) ((r0) this._debugData).getValue()).getLoadedChunksHistory());
        M0.add(lastLoadedChunk);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            Set set = M0;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, set, null, 98303, null))) {
                return;
            }
            M0 = set;
            pz40Var = pz40Var2;
        }
    }

    private final void updatePlayDelta(List<InitMediaItemBundle> initMediaItemBundles) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InitMediaItemBundle initMediaItemBundle : initMediaItemBundles) {
            MediaData mediaData = initMediaItemBundle.getMediaData();
            if (mediaData != null) {
                linkedHashMap.put(mediaData, initMediaItemBundle.getInitMediaItemData().getPlayDelta());
            }
        }
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap2, 65535, null))) {
                return;
            }
            linkedHashMap = linkedHashMap2;
            pz40Var = pz40Var2;
        }
    }

    private final void updateSpeedTelemetry(List<InitMediaItemBundle> initMediaItemBundles) {
        r0 r0Var;
        Object value;
        ListSdkDebugData listSdkDebugData;
        ArrayList arrayList;
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
            listSdkDebugData = (ListSdkDebugData) value;
            List<InitMediaItemBundle> list = initMediaItemBundles;
            arrayList = new ArrayList(tcc.n(list, 10));
            for (InitMediaItemBundle initMediaItemBundle : list) {
                MediaData mediaData = initMediaItemBundle.getMediaData();
                arrayList.add(new SpeedTelemetry(mediaData != null ? mediaData.getVideoContentId() : null, initMediaItemBundle.getInitMediaItemData().getBlurDelta(), initMediaItemBundle.getInitMediaItemData().getImageDelta(), initMediaItemBundle.getInitMediaItemData().getFirstFrameVideoDelta(), initMediaItemBundle.getInitMediaItemData().getTotalTime(), initMediaItemBundle.getInitMediaItemData().getFinishReason()));
            }
        } while (!r0Var.k(value, ListSdkDebugData.copy$default(listSdkDebugData, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, 130559, null)));
    }

    private final void updateVideoTrackData(MediaData mediaData, VideoTrackData videoTrackData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getVideoTrackData());
        linkedHashMap.put(mediaData, videoTrackData);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, 126975, null))) {
                return;
            } else {
                pz40Var = pz40Var2;
            }
        }
    }

    @Override // ru.yandex.video.m3.debug.ListSdkDebugDataManager
    public n4u0 getDebugData() {
        return this.debugData;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onDecoderDiscarded(int engineIndex, TrackType trackType, DecoderEventData data) {
        if (trackType == TrackType.Video) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                PlayerLogger.verbose$default(playerLogger, TAG, "onDecoderDiscarded trackType: " + trackType + " data: " + data, null, new Object[0], 4, null);
            }
            updateDecoderData(engineIndex, data);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onDecoderInitialized(int engineIndex, TrackType trackType, DecoderEventData data) {
        if (trackType == TrackType.Video) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                PlayerLogger.verbose$default(playerLogger, TAG, "onDecoderInitialized trackType: " + trackType + " data: " + data, null, new Object[0], 4, null);
            }
            updateDecoderData(engineIndex, data);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onDecoderReused(int engineIndex, TrackType trackType, DecoderEventData data) {
        if (trackType == TrackType.Video) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                PlayerLogger.verbose$default(playerLogger, TAG, "onDecoderReused trackType: " + trackType + " data: " + data, null, new Object[0], 4, null);
            }
            updateDecoderData(engineIndex, data);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onEngineAttachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer) {
        r0 r0Var;
        Object value;
        Object obj;
        DebugDataPlayerObserver debugDataPlayerObserver = new DebugDataPlayerObserver(yandexPlayer);
        yandexPlayer.addObserver(debugDataPlayerObserver);
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getAttachedEnginesData());
        linkedHashMap.put(mediaData, new EngineHolder(yandexPlayer, debugDataPlayerObserver));
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, 131039, null)));
        Iterator<T> it = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getCurrentItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((Item) obj).getMediaData(), mediaData)) {
                    break;
                }
            }
        }
        if (obj != null) {
            updateItemsList();
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onEngineDetachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getAttachedEnginesData());
        EngineHolder engineHolder = (EngineHolder) linkedHashMap.remove(mediaData);
        if (engineHolder != null) {
            engineHolder.component1().removeObserver(engineHolder.component2());
        }
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, 131039, null))) {
                break;
            } else {
                pz40Var = pz40Var2;
            }
        }
        Iterator<T> it = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getCurrentItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((Item) obj).getMediaData(), mediaData)) {
                    break;
                }
            }
        }
        if (obj != null) {
            updateItemsList();
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onItemAttachedToListPlayer(InternalListYandexPlayer player, MediaData mediaData) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getAttachedListPlayerIndex());
        linkedHashMap.put(mediaData, Integer.valueOf(player.getListPlayerIndex()));
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, 131055, null))) {
                break;
            } else {
                pz40Var = pz40Var2;
            }
        }
        Iterator<T> it = ((ListSdkDebugData) ((r0) this._debugData).getValue()).getCurrentItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((Item) obj).getMediaData(), mediaData)) {
                    break;
                }
            }
        }
        if (obj != null) {
            updateItemsList();
        }
    }

    @Override // ru.yandex.video.m3.debug.ListSdkDebugDataManager
    public void onPlayerDebugDataUpdate(DebugData playerDebugData, MediaData currentMediaData) {
        BandwidthEstimation lastBandwidthEstimation = playerDebugData.getLastBandwidthEstimation();
        if (lastBandwidthEstimation != null) {
            appendLastPlayerBandwidth(lastBandwidthEstimation);
        }
        LoadedChunk lastLoadedChunk = playerDebugData.getLastLoadedChunk();
        if (lastLoadedChunk != null) {
            updateLoadedChunksHistory(lastLoadedChunk);
        }
        if (currentMediaData != null) {
            BufferSize currentBufferSize = playerDebugData.getCurrentBufferSize();
            if (currentBufferSize != null) {
                updateCurrentBufferSize(currentMediaData, currentBufferSize);
            }
            VideoTrackData videoTrackData = playerDebugData.getVideoTrackData();
            if (videoTrackData != null) {
                updateVideoTrackData(currentMediaData, videoTrackData);
            }
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadCanceled(MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.CANCELED);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null))) {
                updateItemsList();
                return;
            }
            pz40Var = pz40Var2;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadError(MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.ERROR);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null))) {
                updateItemsList();
                return;
            }
            pz40Var = pz40Var2;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadStarted(MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.STARTED);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null))) {
                updateItemsList();
                return;
            }
            pz40Var = pz40Var2;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadSuccess(MediaData mediaData, long bytes) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.SUCCESS);
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null))) {
                updateItemsList();
                return;
            }
            pz40Var = pz40Var2;
        }
    }

    @Override // ru.yandex.video.m3.debug.ListSdkDebugDataManager
    public void onStartFromCacheInfoReady(MediaData mediaData, Long videoCachePositionMs) {
        if (this.bufferForPlaybackMs == null || videoCachePositionMs == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).isStartFromCache());
        linkedHashMap.put(mediaData, Boolean.valueOf(videoCachePositionMs.longValue() >= ((long) this.bufferForPlaybackMs.intValue())));
        pz40 pz40Var = this._debugData;
        while (true) {
            r0 r0Var = (r0) pz40Var;
            Object value = r0Var.getValue();
            pz40 pz40Var2 = pz40Var;
            if (r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, 130047, null))) {
                return;
            } else {
                pz40Var = pz40Var2;
            }
        }
    }

    @Override // ru.yandex.video.m3.debug.ListSdkDebugDataManager
    public void onUpdateIsOnDemand(MediaData mediaData) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(((ListSdkDebugData) ((r0) this._debugData).getValue()).isOnDemand());
        linkedHashMap.put(mediaData, Boolean.valueOf(!((ListSdkDebugData) ((r0) this._debugData).getValue()).getMediaData().contains(mediaData)));
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, 129023, null)));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onUpdateItemsList(List<MediaData> mediaItems) {
        r0 r0Var;
        Object value;
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, mediaItems, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070, null)));
        updateItemsList();
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onUpdateVisibleItemsList(List<MediaData> visibleItems) {
        r0 r0Var;
        Object value;
        pz40 pz40Var = this._debugData;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ListSdkDebugData.copy$default((ListSdkDebugData) value, null, visibleItems, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069, null)));
        updateItemsList();
    }

    @Override // ru.yandex.video.m3.debug.ListSdkDebugDataManager
    public void release() {
        l8x l8xVar = this.speedTelemetryObservableJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        for (EngineHolder engineHolder : ((ListSdkDebugData) ((r0) this._debugData).getValue()).getAttachedEnginesData().values()) {
            engineHolder.component1().removeObserver(engineHolder.component2());
        }
    }

    @Override // ru.yandex.video.m3.debug.ListSdkDebugDataManager
    public void resetDebugData() {
        pz40 pz40Var = this._debugData;
        ListSdkDebugData listSdkDebugData = new ListSdkDebugData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, listSdkDebugData);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/debug/ListSdkDebugDataManagerImpl$Companion;", "", "()V", "NOTHING_CONTENT_ID", "", "NO_BITRATE", "", "TAG", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
