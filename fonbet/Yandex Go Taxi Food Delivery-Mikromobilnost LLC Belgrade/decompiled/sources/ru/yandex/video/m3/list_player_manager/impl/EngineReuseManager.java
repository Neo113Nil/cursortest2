package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.g8e;
import defpackage.tcc;
import defpackage.v4r0;
import defpackage.ym11;
import defpackage.zxc0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.debug.DecoderUsageListener;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.impl.EngineReuseException;
import ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerPool;
import ru.yandex.video.m3.list_player_manager.model.EngineCount;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 d2\u00020\u0001:\u0001dB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0012\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0019\u0010\u001d\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0013\u0010!\u001a\u00020\u001c*\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b+\u0010)J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u0013J\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J1\u00109\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u001b2\u0006\u00106\u001a\u00020\u001b2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J)\u0010>\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010?J1\u0010C\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00112\u0006\u0010F\u001a\u00020E2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u00112\u0006\u0010F\u001a\u00020E2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\bI\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010MR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010MR\u0014\u0010N\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000f0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001b0T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR&\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001b0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010VR$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManager;", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerFactory;", "listPlayerFactory", "Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerPool;", "playbackEnginePool", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "failFast", "enableNotDetachingEngineFromPlayingPlayerInListSDK", "Lru/yandex/video/m3/list_player_manager/model/EngineCount;", "engineCount", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerFactory;Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerPool;Lru/yandex/video/m3/player/utils/PlayerLogger;ZZLru/yandex/video/m3/list_player_manager/model/EngineCount;)V", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "Lzy11;", "giveEngineToPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "listPlayer", "detachEngine", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "", "mediaDataListToLogString", "(Ljava/util/List;)Ljava/lang/String;", "mediaDataListToLogWithPlayerString", "listYandexPlayersToLogString", "listYandexPlayerToLogString", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)Ljava/lang/String;", "Lru/yandex/video/m3/debug/DecoderUsageListener;", "decoderUsageListener", "setDecoderUsageListener", "(Lru/yandex/video/m3/debug/DecoderUsageListener;)V", "mediaItems", "onUpdateItemsList", "(Ljava/util/List;)V", "visibleItems", "onUpdateVisibleItemsList", "getPlayer", "()Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "listYandexPlayer", "returnPlayer", "release", "()V", "wasPlayWhenReady", "onPlay", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Z)V", "oldMediaData", "newMediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "onSetSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "mediaData", "onDropSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "isFromCache", "onItemVideoDataLoaded", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/data/dto/VideoData;Z)V", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "listYandexPlayerImpl", "onViewAttached", "(Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "onViewDetached", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerFactory;", "Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerPool;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Z", "TAG", "Ljava/lang/String;", "", "forwardEngineCount", CA20Status.STATUS_USER_I, "backwardEngineCount", "", "listPlayers", "Ljava/util/List;", "items", "", "attachedEngines", "Ljava/util/Map;", "listPlayersByMediaData", "itemsMustBeConnectedWithEngine", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManagerListener;", "engineReuseManagerListener", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManagerListener;", "getEngineReuseManagerListener", "()Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManagerListener;", "setEngineReuseManagerListener", "(Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManagerListener;)V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EngineReuseManager implements ListPlayerInternalObserver {
    private final int backwardEngineCount;
    private final boolean enableNotDetachingEngineFromPlayingPlayerInListSDK;
    private EngineReuseManagerListener engineReuseManagerListener;
    private final boolean failFast;
    private final int forwardEngineCount;
    private final ListYandexPlayerFactory listPlayerFactory;
    private final YandexPlayerPool playbackEnginePool;
    private final PlayerLogger playerLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final String TAG = "EngineReuseManager";
    private final List<InternalListYandexPlayer> listPlayers = new ArrayList();
    private List<MediaData> items = new ArrayList();
    private Map<InternalListYandexPlayer, YandexPlayer<?>> attachedEngines = new LinkedHashMap();
    private Map<MediaData, InternalListYandexPlayer> listPlayersByMediaData = new LinkedHashMap();
    private final List<MediaData> itemsMustBeConnectedWithEngine = new ArrayList();

    public EngineReuseManager(ListYandexPlayerFactory listYandexPlayerFactory, YandexPlayerPool yandexPlayerPool, PlayerLogger playerLogger, boolean z, boolean z2, EngineCount engineCount) {
        this.listPlayerFactory = listYandexPlayerFactory;
        this.playbackEnginePool = yandexPlayerPool;
        this.playerLogger = playerLogger;
        this.failFast = z;
        this.enableNotDetachingEngineFromPlayingPlayerInListSDK = z2;
        this.forwardEngineCount = engineCount.getForward();
        this.backwardEngineCount = engineCount.getBackward();
    }

    private final void detachEngine(InternalListYandexPlayer listPlayer) {
        EngineReuseManagerListener engineReuseManagerListener;
        YandexPlayer<zxc0> detachEngine = listPlayer.detachEngine();
        if (detachEngine != null) {
            this.playbackEnginePool.release(detachEngine);
            MediaData item = listPlayer.getItem();
            if (item != null && (engineReuseManagerListener = this.engineReuseManagerListener) != null) {
                engineReuseManagerListener.onEngineDetachedToMediaData(item, detachEngine);
            }
        }
        this.attachedEngines.remove(listPlayer);
    }

    private final void giveEngineToPlayer(InternalListYandexPlayer player) {
        Object obj;
        EngineReuseManagerListener engineReuseManagerListener;
        YandexPlayer<zxc0> acquire = this.playbackEnginePool.acquire();
        if (acquire == null) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose(this.TAG, "giveEngineToPlayer", "No free engine found. Try get paused from other item", new Object[0]);
            }
            Iterator<T> it = this.attachedEngines.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                InternalListYandexPlayer internalListYandexPlayer = (InternalListYandexPlayer) obj;
                if (internalListYandexPlayer.isWithEngine() && !internalListYandexPlayer.getWillPlayWhenReady()) {
                    break;
                }
            }
            InternalListYandexPlayer internalListYandexPlayer2 = (InternalListYandexPlayer) obj;
            if (internalListYandexPlayer2 != null && (acquire = internalListYandexPlayer2.detachEngine()) != null) {
                PlayerLogger playerLogger2 = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                    playerLogger2.verbose(this.TAG, "giveEngineToPlayer", "Found paused from other player with index " + internalListYandexPlayer2.getListPlayerIndex(), new Object[0]);
                }
                MediaData item = internalListYandexPlayer2.getItem();
                if (item != null && (engineReuseManagerListener = this.engineReuseManagerListener) != null) {
                    engineReuseManagerListener.onEngineDetachedToMediaData(item, acquire);
                }
                this.attachedEngines.remove(internalListYandexPlayer2);
                EngineReuseManagerListener engineReuseManagerListener2 = this.engineReuseManagerListener;
                if (engineReuseManagerListener2 != null) {
                    engineReuseManagerListener2.onGetEngineFromOtherPlayer(player, internalListYandexPlayer2);
                }
            }
        }
        if (acquire == null) {
            PlayerLogger playerLogger3 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger3)) {
                playerLogger3.verbose(this.TAG, "giveEngineToPlayer", "No free engine found. Force new engine from pool", new Object[0]);
            }
            EngineReuseManagerListener engineReuseManagerListener3 = this.engineReuseManagerListener;
            if (engineReuseManagerListener3 != null) {
                engineReuseManagerListener3.onForceEngineAcquire(player, this.attachedEngines.keySet());
            }
            acquire = this.playbackEnginePool.acquireForce();
        }
        giveEngineToPlayer(acquire, player);
    }

    private final String listYandexPlayerToLogString(InternalListYandexPlayer internalListYandexPlayer) {
        return UtilKt.debugStringIdentificator(internalListYandexPlayer);
    }

    private final String listYandexPlayersToLogString(List<? extends InternalListYandexPlayer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String debugStringIdentificator = UtilKt.debugStringIdentificator((InternalListYandexPlayer) it.next());
            if (debugStringIdentificator != null) {
                arrayList.add(debugStringIdentificator);
            }
        }
        return kotlin.collections.a.X(arrayList, null, null, null, null, 63);
    }

    private final String mediaDataListToLogString(List<MediaData> list) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        List<MediaData> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaData) it.next()).getVideoContentId());
        }
        return kotlin.collections.a.X(arrayList, null, null, null, null, 63);
    }

    private final String mediaDataListToLogWithPlayerString(List<MediaData> list) {
        StringBuilder sb = new StringBuilder("[MediaData + ListPlayer]: ");
        List<MediaData> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (MediaData mediaData : list2) {
            arrayList.add("[" + mediaData.getVideoContentId() + " + " + UtilKt.debugStringIdentificator(this.listPlayersByMediaData.get(mediaData)) + ']');
        }
        sb.append(kotlin.collections.a.X(arrayList, null, null, null, null, 63));
        return sb.toString();
    }

    public final EngineReuseManagerListener getEngineReuseManagerListener() {
        return this.engineReuseManagerListener;
    }

    public final InternalListYandexPlayer getPlayer() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        InternalListYandexPlayer create = this.listPlayerFactory.create();
        create.addInternalObserver(this);
        this.listPlayers.add(create);
        EngineReuseManagerListener engineReuseManagerListener = this.engineReuseManagerListener;
        if (engineReuseManagerListener != null) {
            engineReuseManagerListener.onListPlayerCountChanged(this.listPlayers.size());
        }
        return create;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onDropSource(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        this.listPlayersByMediaData.remove(mediaData);
        EngineReuseManagerListener engineReuseManagerListener = this.engineReuseManagerListener;
        if (engineReuseManagerListener != null) {
            engineReuseManagerListener.onItemDetachedFromListPlayer(player, listYandexPlayerView, mediaData);
        }
        detachEngine(player);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onItemVideoDataLoaded(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean isFromCache) {
        EngineReuseManagerListener engineReuseManagerListener = this.engineReuseManagerListener;
        if (engineReuseManagerListener != null) {
            engineReuseManagerListener.onItemVideoDataLoaded(listYandexPlayerView, videoData);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onPlay(InternalListYandexPlayer player, boolean wasPlayWhenReady) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("try to play ");
            MediaData item = player.getItem();
            sb.append(item != null ? item.getVideoContentId() : null);
            playerLogger.verbose(str, "onPlay", sb.toString(), new Object[0]);
        }
        if (player.isWithEngine()) {
            return;
        }
        String str2 = "Try to play " + UtilKt.debugStringIdentificator(player) + " without engine";
        UtilKt.throwError(this.failFast, new EngineReuseException.PlayToPlayerWithoutEngine(str2, null, 2, null), this.playerLogger, this.TAG, "onPlay", str2);
        giveEngineToPlayer(player);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onSetSource(InternalListYandexPlayer player, MediaData oldMediaData, MediaData newMediaData, PlaybackConfig playbackConfig) {
        String str;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder("from ");
            sb.append(oldMediaData != null ? oldMediaData.getVideoContentId() : null);
            sb.append(" to ");
            sb.append(newMediaData.getVideoContentId());
            sb.append(" on player ");
            sb.append(UtilKt.debugStringIdentificator(player));
            playerLogger.verbose(str2, "onSetSource", sb.toString(), new Object[0]);
        }
        ym11.c(this.listPlayersByMediaData).remove(oldMediaData);
        this.listPlayersByMediaData.put(newMediaData, player);
        if (!player.isWithEngine()) {
            boolean z = true;
            if (this.itemsMustBeConnectedWithEngine.contains(newMediaData)) {
                str = "Found player that was missing it's engine, probably this item was preloaded. Give engine to player " + UtilKt.debugStringIdentificator(player);
            } else if (playbackConfig.getAutoplay()) {
                str = "Autoplay is enabled, but some why this item not in itemsMustBeConnectedWithEngine list " + UtilKt.debugStringIdentificator(player);
            } else {
                str = "";
                z = false;
            }
            if (z) {
                PlayerLogger playerLogger2 = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                    playerLogger2.verbose(this.TAG, "onSetSource", str, new Object[0]);
                }
                giveEngineToPlayer(player);
            }
        }
        EngineReuseManagerListener engineReuseManagerListener = this.engineReuseManagerListener;
        if (engineReuseManagerListener != null) {
            engineReuseManagerListener.onItemAttachedToListPlayer(player, newMediaData);
        }
    }

    public final void onUpdateItemsList(List<MediaData> mediaItems) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        this.items.clear();
        this.items.addAll(mediaItems);
    }

    public final void onUpdateVisibleItemsList(List<MediaData> visibleItems) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "onUpdateVisibleItemsList", "visibleItems updated = " + mediaDataListToLogWithPlayerString(visibleItems), new Object[0]);
        }
        if (visibleItems.isEmpty()) {
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                playerLogger2.verbose(this.TAG, "onUpdateVisibleItemsList", "visibleItems.isEmpty()", new Object[0]);
            }
        }
        int indexOf = this.items.indexOf(kotlin.collections.a.R(visibleItems));
        if (indexOf == -1) {
            String str = "Can not find visible item in items list. First call onUpdateItemsList. items = " + mediaDataListToLogString(this.items);
            UtilKt.throwError(this.failFast, new EngineReuseException.CanNotFindVisibleItemsInItemsList(str, null, 2, null), this.playerLogger, this.TAG, "onUpdateVisibleItemsList", str);
        }
        this.itemsMustBeConnectedWithEngine.clear();
        if (indexOf >= 0) {
            this.itemsMustBeConnectedWithEngine.addAll(this.items.subList(Integer.max(0, indexOf - this.backwardEngineCount), Integer.min(this.items.size(), this.forwardEngineCount + indexOf)));
        }
        PlayerLogger playerLogger3 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger3)) {
            playerLogger3.verbose(this.TAG, "onUpdateVisibleItemsList", g8e.o("items next to visible = ", mediaDataListToLogWithPlayerString(this.items.subList(Integer.max(0, indexOf - 4), Integer.min(this.items.size(), indexOf + 4)))), new Object[0]);
            playerLogger3.verbose(this.TAG, "onUpdateVisibleItemsList", "itemsMustBeConnectedWithEngine = " + mediaDataListToLogWithPlayerString(this.itemsMustBeConnectedWithEngine), new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (MediaData mediaData : this.itemsMustBeConnectedWithEngine) {
            InternalListYandexPlayer internalListYandexPlayer = this.listPlayersByMediaData.get(mediaData);
            if (internalListYandexPlayer != null) {
                arrayList.add(internalListYandexPlayer);
            } else {
                PlayerLogger playerLogger4 = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger4)) {
                    playerLogger4.verbose(this.TAG, "onUpdateVisibleItemsList", "Can not find ListYandexPlayer for " + mediaData.getVideoContentId() + " that should be connected with engine. Maybe setSource should be called first. Or it is ok, for just preloading case", new Object[0]);
                }
            }
        }
        PlayerLogger playerLogger5 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger5)) {
            playerLogger5.verbose(this.TAG, "onUpdateVisibleItemsList", "listYandexPlayerMustBeConnectedWithEngine = " + listYandexPlayersToLogString(arrayList), new Object[0]);
        }
        List<? extends InternalListYandexPlayer> J0 = kotlin.collections.a.J0(v4r0.g(this.attachedEngines.keySet(), arrayList));
        PlayerLogger playerLogger6 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger6)) {
            playerLogger6.verbose(this.TAG, "onUpdateVisibleItemsList", "listYandexPlayerMustBeDisconnectedFromEngine = " + listYandexPlayersToLogString(J0), new Object[0]);
        }
        for (InternalListYandexPlayer internalListYandexPlayer2 : J0) {
            if (this.enableNotDetachingEngineFromPlayingPlayerInListSDK && internalListYandexPlayer2.getWillPlayWhenReady()) {
                PlayerLogger.error$default(this.playerLogger, this.TAG, "onUpdateVisibleItemsList", "Try to detach engine from willPlayWhenReady player " + listYandexPlayerToLogString(internalListYandexPlayer2), null, new Object[0], 8, null);
            } else {
                detachEngine(internalListYandexPlayer2);
            }
        }
        List<? extends InternalListYandexPlayer> k0 = kotlin.collections.a.k0(arrayList, this.attachedEngines.keySet());
        PlayerLogger playerLogger7 = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger7)) {
            playerLogger7.verbose(this.TAG, "onUpdateVisibleItemsList", "listYandexPlayersToConnectWithEngine = " + listYandexPlayersToLogString(k0), new Object[0]);
        }
        Iterator it = k0.iterator();
        while (it.hasNext()) {
            giveEngineToPlayer((InternalListYandexPlayer) it.next());
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onViewAttached(ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        EngineReuseManagerListener engineReuseManagerListener = this.engineReuseManagerListener;
        if (engineReuseManagerListener != null) {
            engineReuseManagerListener.onPlayerAttachedToViewWithSize(listYandexPlayerView.getWidth(), listYandexPlayerView.getHeight());
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onViewDetached(ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        EngineReuseManagerListener engineReuseManagerListener = this.engineReuseManagerListener;
        if (engineReuseManagerListener != null) {
            engineReuseManagerListener.onItemDetachedFromListPlayer(listYandexPlayerImpl, listYandexPlayerView, null);
        }
    }

    public final void release() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        this.items.clear();
        this.itemsMustBeConnectedWithEngine.clear();
        if (this.listPlayers.isEmpty() && this.attachedEngines.isEmpty() && this.listPlayersByMediaData.isEmpty()) {
            return;
        }
        UtilKt.throwError(false, new EngineReuseException.ReleaseCalledButPlayersAlive("Release called, but some players are not returned to ListYandexPlayerManager.", null, 2, null), this.playerLogger, this.TAG, "release", "Release called, but some players are not returned to ListYandexPlayerManager.");
        Iterator it = kotlin.collections.a.J0(this.listPlayers).iterator();
        while (it.hasNext()) {
            returnPlayer((InternalListYandexPlayer) it.next());
        }
        this.attachedEngines.clear();
        this.listPlayersByMediaData.clear();
    }

    public final void returnPlayer(InternalListYandexPlayer listYandexPlayer) {
        YandexPlayer<zxc0> detachEngine;
        EngineReuseManagerListener engineReuseManagerListener;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        listYandexPlayer.removeInternalObserver(this);
        this.listPlayers.remove(listYandexPlayer);
        if (listYandexPlayer.isWithEngine() && (detachEngine = listYandexPlayer.detachEngine()) != null) {
            this.playbackEnginePool.release(detachEngine);
            this.attachedEngines.remove(listYandexPlayer);
            MediaData item = listYandexPlayer.getItem();
            if (item != null && (engineReuseManagerListener = this.engineReuseManagerListener) != null) {
                engineReuseManagerListener.onEngineDetachedToMediaData(item, detachEngine);
            }
        }
        EngineReuseManagerListener engineReuseManagerListener2 = this.engineReuseManagerListener;
        if (engineReuseManagerListener2 != null) {
            engineReuseManagerListener2.onListPlayerCountChanged(this.listPlayers.size());
        }
        listYandexPlayer.release();
    }

    public final void setDecoderUsageListener(DecoderUsageListener decoderUsageListener) {
        this.playbackEnginePool.setDecoderUsageListener(decoderUsageListener);
    }

    public final void setEngineReuseManagerListener(EngineReuseManagerListener engineReuseManagerListener) {
        this.engineReuseManagerListener = engineReuseManagerListener;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManager$Companion;", "", "()V", "calculateEngineCount", "Lru/yandex/video/m3/list_player_manager/model/EngineCount;", "backwardEngineCount", "", "forwardEngineCount", "maxEngineCount", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EngineCount calculateEngineCount(int backwardEngineCount, int forwardEngineCount, int maxEngineCount) {
            int i = backwardEngineCount + forwardEngineCount;
            if (i <= maxEngineCount) {
                return new EngineCount(backwardEngineCount, forwardEngineCount);
            }
            int floor = (int) Math.floor(((maxEngineCount * 1.0d) * backwardEngineCount) / i);
            return new EngineCount(floor, maxEngineCount - floor);
        }

        private Companion() {
        }
    }

    private final void giveEngineToPlayer(YandexPlayer<zxc0> engine, InternalListYandexPlayer player) {
        EngineReuseManagerListener engineReuseManagerListener;
        player.attachEngine(engine);
        this.attachedEngines.put(player, engine);
        MediaData item = player.getItem();
        if (item == null || (engineReuseManagerListener = this.engineReuseManagerListener) == null) {
            return;
        }
        engineReuseManagerListener.onEngineAttachedToMediaData(item, engine);
    }
}
