package ru.yandex.video.m3.ui.debug;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.buy;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.r7v;
import defpackage.run;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.debug.SpeedTelemetryObservable;
import ru.yandex.video.m3.debug.model.InitMediaItemBundle;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;
import ru.yandex.video.m3.list_player_manager.LogcatPlayerLogger;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002]^BG\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0017¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0017¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001e2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0016¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001e2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001e2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b6\u00101J\u0017\u00107\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u00101J'\u0010>\u001a\u00020\u00162\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J'\u0010@\u001a\u00020\u00162\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b@\u0010?J'\u0010A\u001a\u00020\u00162\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\bA\u0010?J\u000f\u0010B\u001a\u00020\u0016H\u0002¢\u0006\u0004\bB\u0010%J\u001f\u0010C\u001a\u00020\u00162\u0006\u00109\u001a\u0002082\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0016H\u0002¢\u0006\u0004\bE\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR*\u0010J\u001a\u00020H2\u0006\u0010I\u001a\u00020H8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00190P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lru/yandex/video/m3/ui/debug/ListYandexPlayerManagerDebugView;", "Landroid/widget/LinearLayout;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerDebugListener;", "Lru/yandex/video/m3/ui/debug/DebugDataObservable;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "listYandexPlayerManager", "Lru/yandex/video/m3/debug/SpeedTelemetryObservable;", "speedTelemetryObservable", "Ltse;", "scope", "", "vsid", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;Lru/yandex/video/m3/debug/SpeedTelemetryObservable;Ltse;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/Configuration;", "newConfig", "Lzy11;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lru/yandex/video/m3/ui/debug/DebugDataObserver;", "observer", "observe", "(Lru/yandex/video/m3/ui/debug/DebugDataObserver;)V", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaItems", "onUpdateItemsList", "(Ljava/util/List;)V", "visibleItems", "onUpdateVisibleItemsList", "destroy", "()V", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "mediaData", "onItemAttachedToListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "onEngineAttachedToMediaData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetachedToMediaData", "onPreloadStarted", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "", "bytes", "onPreloadSuccess", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;J)V", "onPreloadCanceled", "onPreloadError", "", "engineIndex", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", Constants.KEY_DATA, "onDecoderInitialized", "(ILru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "updateItemsList", "updateDecoderData", "(ILru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "drawActualDecodersInfo", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "Lru/yandex/video/m3/ui/debug/DebugData;", "value", "debugData", "Lru/yandex/video/m3/ui/debug/DebugData;", "getDebugData", "()Lru/yandex/video/m3/ui/debug/DebugData;", "setDebugData", "(Lru/yandex/video/m3/ui/debug/DebugData;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Landroid/widget/ListView;", "itemsListView", "Landroid/widget/ListView;", "Landroid/widget/TextView;", "preloadInProgressTv", "Landroid/widget/TextView;", "decodersTv", "Ll8x;", "speedTelemetryObservableJob", "Ll8x;", "Companion", "DebugDataPlayerObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerDebugView extends LinearLayout implements ListYandexPlayerManagerDebugListener, DebugDataObservable {
    private static final String NOTHING_CONTENT_ID = "nothing";
    private static final int NO_BITRATE = -1;
    private static final String TAG = "DebugView";
    private DebugData debugData;
    private final TextView decodersTv;
    private final ListView itemsListView;
    private final ListYandexPlayerManager listYandexPlayerManager;
    private final ObserverDispatcher<DebugDataObserver> observerDispatcher;
    private final PlayerLogger playerLogger;
    private final TextView preloadInProgressTv;
    private l8x speedTelemetryObservableJob;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/yandex/video/m3/debug/model/InitMediaItemBundle;", "bundles", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView$2", f = "ListYandexPlayerManagerDebugView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ListYandexPlayerManagerDebugView.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(List<InitMediaItemBundle> list, Continuation<? super zy11> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(zy11.a);
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
            ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView = ListYandexPlayerManagerDebugView.this;
            DebugData debugData = listYandexPlayerManagerDebugView.getDebugData();
            List<InitMediaItemBundle> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (InitMediaItemBundle initMediaItemBundle : list2) {
                MediaData mediaData = initMediaItemBundle.getMediaData();
                arrayList.add(new SpeedTelemetry(mediaData != null ? mediaData.getVideoContentId() : null, initMediaItemBundle.getInitMediaItemData().getBlurDelta(), initMediaItemBundle.getInitMediaItemData().getImageDelta(), initMediaItemBundle.getInitMediaItemData().getFirstFrameVideoDelta(), initMediaItemBundle.getInitMediaItemData().getTotalTime(), initMediaItemBundle.getInitMediaItemData().getFinishReason()));
            }
            listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(debugData, null, null, null, null, null, null, null, null, null, arrayList, 511, null));
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/ui/debug/ListYandexPlayerManagerDebugView$DebugDataPlayerObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "<init>", "(Lru/yandex/video/m3/ui/debug/ListYandexPlayerManagerDebugView;Lru/yandex/video/m3/player/YandexPlayer;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lzy11;", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onReadyForFirstPlayback", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DebugDataPlayerObserver implements PlayerObserver<Object> {
        private final YandexPlayer<?> player;

        public DebugDataPlayerObserver(YandexPlayer<?> yandexPlayer) {
            this.player = yandexPlayer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPlaybackError$lambda$0(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, DebugDataPlayerObserver debugDataPlayerObserver) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(listYandexPlayerManagerDebugView.getDebugData().getFatalErrorData());
            String videoSessionId = debugDataPlayerObserver.player.getVideoSessionId();
            Integer num = (Integer) linkedHashMap.get(videoSessionId);
            linkedHashMap.put(videoSessionId, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(listYandexPlayerManagerDebugView.getDebugData(), null, null, null, null, null, null, null, linkedHashMap, null, null, 895, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReadyForFirstPlayback$lambda$2(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, DebugDataPlayerObserver debugDataPlayerObserver) {
            Object obj;
            String str;
            TrackFormat selectedTrackFormat;
            MediaData mediaData;
            Iterator<T> it = listYandexPlayerManagerDebugView.getDebugData().getAttachedEnginesData().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((EngineHolder) ((Map.Entry) obj).getValue()).getEngine(), debugDataPlayerObserver.player)) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (mediaData = (MediaData) entry.getKey()) == null || (str = mediaData.getVideoContentId()) == null) {
                str = ListYandexPlayerManagerDebugView.NOTHING_CONTENT_ID;
            }
            ArrayList arrayList = new ArrayList(listYandexPlayerManagerDebugView.getDebugData().getStartVideoBitrateData());
            Track videoTrack = debugDataPlayerObserver.player.getVideoTrack();
            arrayList.add(new StartBitrateDataHolder(str, (videoTrack == null || (selectedTrackFormat = videoTrack.getSelectedTrackFormat()) == null) ? -1 : selectedTrackFormat.getBitrate()));
            listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(listYandexPlayerManagerDebugView.getDebugData(), null, null, null, null, null, null, null, null, arrayList, null, 767, null));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackError(PlaybackException playbackException) {
            ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView = ListYandexPlayerManagerDebugView.this;
            listYandexPlayerManagerDebugView.post(new a(listYandexPlayerManagerDebugView, this, 1));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onReadyForFirstPlayback() {
            ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView = ListYandexPlayerManagerDebugView.this;
            listYandexPlayerManagerDebugView.post(new a(listYandexPlayerManagerDebugView, this, 0));
        }
    }

    public ListYandexPlayerManagerDebugView(PlayerLogger playerLogger, ListYandexPlayerManager listYandexPlayerManager, SpeedTelemetryObservable speedTelemetryObservable, tse tseVar, String str, Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.playerLogger = playerLogger;
        this.listYandexPlayerManager = listYandexPlayerManager;
        this.debugData = new DebugData(null, null, null, null, null, null, null, null, null, null, 1023, null);
        this.observerDispatcher = new ObserverDispatcher<>();
        View.inflate(getContext(), R.layout.list_yandex_player_manager_debug_view, this);
        this.itemsListView = (ListView) findViewById(R.id.feedItems);
        this.preloadInProgressTv = (TextView) findViewById(R.id.tv_preloads_in_progress);
        this.decodersTv = (TextView) findViewById(R.id.tv_decoders);
        TextView textView = (TextView) findViewById(R.id.tv_vsid);
        textView.setText(str);
        textView.setOnLongClickListener(new run(1, this, context));
        jqr jqrVar = new jqr(speedTelemetryObservable.getItems(), new AnonymousClass2(null), 3);
        sjh sjhVar = uyj.a;
        this.speedTelemetryObservableJob = e.H(tseVar, e.F(jqrVar, o400.a.x));
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View p0) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View p0) {
                l8x l8xVar = ListYandexPlayerManagerDebugView.this.speedTelemetryObservableJob;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, Context context, View view) {
        listYandexPlayerManagerDebugView.listYandexPlayerManager.sendDebugReport();
        Toast.makeText(context, "Report sended", 0).show();
        return false;
    }

    private final void drawActualDecodersInfo() {
        Map<Integer, DecoderEventData> decoderData = getDebugData().getDecoderData();
        TextView textView = this.decodersTv;
        ArrayList arrayList = new ArrayList(decoderData.size());
        for (Map.Entry<Integer, DecoderEventData> entry : decoderData.entrySet()) {
            arrayList.add("[" + entry.getKey().intValue() + "] " + entry.getValue().getName() + " inits: " + entry.getValue().getInits() + " reuses: " + entry.getValue().getReuses() + " releases: " + entry.getValue().getReleases());
        }
        textView.setText(kotlin.collections.a.X(arrayList, "\n", null, null, null, 62));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DebugData getDebugData() {
        if (jl40.l(Looper.getMainLooper(), Looper.myLooper())) {
            return this.debugData;
        }
        ny61.r("Check failed.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreloadCanceled$lambda$13(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(listYandexPlayerManagerDebugView.getDebugData().getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.CANCELED);
        listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(listYandexPlayerManagerDebugView.getDebugData(), null, null, null, linkedHashMap, null, null, null, null, null, null, 1015, null));
        listYandexPlayerManagerDebugView.updateItemsList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreloadError$lambda$14(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(listYandexPlayerManagerDebugView.getDebugData().getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.ERROR);
        listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(listYandexPlayerManagerDebugView.getDebugData(), null, null, null, linkedHashMap, null, null, null, null, null, null, 1015, null));
        listYandexPlayerManagerDebugView.updateItemsList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreloadStarted$lambda$11(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(listYandexPlayerManagerDebugView.getDebugData().getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.STARTED);
        listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(listYandexPlayerManagerDebugView.getDebugData(), null, null, null, linkedHashMap, null, null, null, null, null, null, 1015, null));
        listYandexPlayerManagerDebugView.updateItemsList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPreloadSuccess$lambda$12(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, MediaData mediaData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(listYandexPlayerManagerDebugView.getDebugData().getPreloadData());
        linkedHashMap.put(mediaData, PreloadState.SUCCESS);
        listYandexPlayerManagerDebugView.setDebugData(DebugData.copy$default(listYandexPlayerManagerDebugView.getDebugData(), null, null, null, linkedHashMap, null, null, null, null, null, null, 1015, null));
        listYandexPlayerManagerDebugView.updateItemsList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDebugData(DebugData debugData) {
        HashSet H0;
        Object failure;
        if (!jl40.l(Looper.getMainLooper(), Looper.myLooper())) {
            ny61.r("Check failed.");
            return;
        }
        this.debugData = debugData;
        ObserverDispatcher<DebugDataObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((DebugDataObserver) it.next()).onDataChanged(this.debugData);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    private final void updateDecoderData(int engineIndex, DecoderEventData data) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(getDebugData().getDecoderData());
        linkedHashMap.put(Integer.valueOf(engineIndex), data);
        setDebugData(DebugData.copy$default(getDebugData(), null, null, null, null, null, null, linkedHashMap, null, null, null, 959, null));
        drawActualDecodersInfo();
    }

    private final void updateItemsList() {
        List<MediaData> mediaData = getDebugData().getMediaData();
        List<MediaData> visibleMediaData = getDebugData().getVisibleMediaData();
        int indexOf = mediaData.indexOf(kotlin.collections.a.R(visibleMediaData));
        ArrayList arrayList = new ArrayList();
        if (indexOf >= 0) {
            arrayList.addAll(mediaData.subList(Integer.max(0, indexOf - 1), Integer.min(mediaData.size(), indexOf + 6)));
        }
        Map<MediaData, PreloadState> preloadData = getDebugData().getPreloadData();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaData mediaData2 = (MediaData) it.next();
            boolean contains = visibleMediaData.contains(mediaData2);
            EngineHolder engineHolder = getDebugData().getAttachedEnginesData().get(mediaData2);
            YandexPlayer<?> engine = engineHolder != null ? engineHolder.getEngine() : null;
            Integer num = getDebugData().getAttachedListPlayerIndex().get(mediaData2);
            PreloadState preloadState = preloadData.get(mediaData2);
            if (preloadState == null) {
                preloadState = PreloadState.NONE;
            }
            arrayList2.add(new Item(mediaData2, contains, engine, num, preloadState));
        }
        setDebugData(DebugData.copy$default(getDebugData(), null, null, arrayList2, null, null, null, null, null, null, null, 1019, null));
        Set<MediaData> keySet = preloadData.keySet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : keySet) {
            if (preloadData.get((MediaData) obj) == PreloadState.STARTED) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((MediaData) it2.next()).getVideoContentId());
        }
        post(new r7v(21, this, kotlin.collections.a.X(arrayList4, "\n", null, null, null, 62)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateItemsList$lambda$6(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, String str) {
        listYandexPlayerManagerDebugView.itemsListView.setAdapter((ListAdapter) new ItemsListAdapter(listYandexPlayerManagerDebugView.getContext(), R.layout.list_yandex_player_manager_debug_view_item, listYandexPlayerManagerDebugView.getDebugData().getCurrentItems()));
        listYandexPlayerManagerDebugView.preloadInProgressTv.setText(str);
    }

    public final void destroy() {
        l8x l8xVar = this.speedTelemetryObservableJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        for (EngineHolder engineHolder : getDebugData().getAttachedEnginesData().values()) {
            engineHolder.component1().removeObserver(engineHolder.component2());
        }
    }

    @Override // ru.yandex.video.m3.ui.debug.DebugDataObservable
    public void observe(DebugDataObserver observer) {
        this.observerDispatcher.add((ObserverDispatcher<DebugDataObserver>) observer);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        l8x l8xVar = this.speedTelemetryObservableJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
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
        Object obj;
        DebugDataPlayerObserver debugDataPlayerObserver = new DebugDataPlayerObserver(yandexPlayer);
        yandexPlayer.addObserver(debugDataPlayerObserver);
        LinkedHashMap linkedHashMap = new LinkedHashMap(getDebugData().getAttachedEnginesData());
        linkedHashMap.put(mediaData, new EngineHolder(yandexPlayer, debugDataPlayerObserver));
        setDebugData(DebugData.copy$default(getDebugData(), null, null, null, null, null, linkedHashMap, null, null, null, null, 991, null));
        Iterator<T> it = getDebugData().getCurrentItems().iterator();
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
        LinkedHashMap linkedHashMap = new LinkedHashMap(getDebugData().getAttachedEnginesData());
        EngineHolder engineHolder = (EngineHolder) linkedHashMap.remove(mediaData);
        if (engineHolder != null) {
            engineHolder.component1().removeObserver(engineHolder.component2());
        }
        setDebugData(DebugData.copy$default(getDebugData(), null, null, null, null, null, linkedHashMap, null, null, null, null, 991, null));
        Iterator<T> it = getDebugData().getCurrentItems().iterator();
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
        LinkedHashMap linkedHashMap = new LinkedHashMap(getDebugData().getAttachedListPlayerIndex());
        linkedHashMap.put(mediaData, Integer.valueOf(player.getListPlayerIndex()));
        setDebugData(DebugData.copy$default(getDebugData(), null, null, null, null, linkedHashMap, null, null, null, null, null, 1007, null));
        Iterator<T> it = getDebugData().getCurrentItems().iterator();
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
    public void onPreloadCanceled(MediaData mediaData) {
        post(new buy(this, mediaData, 1));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadError(MediaData mediaData) {
        post(new buy(this, mediaData, 2));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadStarted(MediaData mediaData) {
        post(new buy(this, mediaData, 3));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onPreloadSuccess(MediaData mediaData, long bytes) {
        post(new buy(this, mediaData, 0));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onUpdateItemsList(List<MediaData> mediaItems) {
        setDebugData(DebugData.copy$default(getDebugData(), mediaItems, null, null, null, null, null, null, null, null, null, 1022, null));
        updateItemsList();
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener
    public void onUpdateVisibleItemsList(List<MediaData> visibleItems) {
        setDebugData(DebugData.copy$default(getDebugData(), null, visibleItems, null, null, null, null, null, null, null, null, 1021, null));
        updateItemsList();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ui/debug/ListYandexPlayerManagerDebugView$Companion;", "", "()V", "NOTHING_CONTENT_ID", "", "NO_BITRATE", "", "TAG", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ListYandexPlayerManagerDebugView(PlayerLogger playerLogger, ListYandexPlayerManager listYandexPlayerManager, SpeedTelemetryObservable speedTelemetryObservable, tse tseVar, String str, Context context) {
        this(playerLogger, listYandexPlayerManager, speedTelemetryObservable, tseVar, str, context, null, 64, null);
    }

    public /* synthetic */ ListYandexPlayerManagerDebugView(PlayerLogger playerLogger, ListYandexPlayerManager listYandexPlayerManager, SpeedTelemetryObservable speedTelemetryObservable, tse tseVar, String str, Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LogcatPlayerLogger() : playerLogger, listYandexPlayerManager, speedTelemetryObservable, tseVar, str, context, (i & 64) != 0 ? null : attributeSet);
    }

    public ListYandexPlayerManagerDebugView(ListYandexPlayerManager listYandexPlayerManager, SpeedTelemetryObservable speedTelemetryObservable, tse tseVar, String str, Context context) {
        this(null, listYandexPlayerManager, speedTelemetryObservable, tseVar, str, context, null, 65, null);
    }
}
