package ru.yandex.video.m3.list_player_manager.impl;

import android.os.Handler;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.tw21;
import defpackage.unr0;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackParametersKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListPlayerDebugManager;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackManager;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackManagerImpl;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackVariant;
import ru.yandex.video.m3.list_player_manager.model.FirstFrameData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoDataKt;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import ru.yandex.video.m3.ui.PlayerView;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0006\u00ad\u0001®\u0001¯\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u001f\u0010+\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u0010.J/\u0010:\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010<\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020\u001aH\u0016¢\u0006\u0004\bJ\u0010.J\u000f\u0010K\u001a\u00020\u001aH\u0016¢\u0006\u0004\bK\u0010.J\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010NJ\u000f\u0010P\u001a\u00020LH\u0016¢\u0006\u0004\bP\u0010NJ\u0017\u0010R\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020LH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020TH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\bH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010 J\u0019\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010^\u001a\u00020\u0006H\u0016¢\u0006\u0004\b`\u0010aJ\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020_0b2\u0006\u0010^\u001a\u00020\u0006H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\b2\u0006\u0010e\u001a\u00020_H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\bH\u0016¢\u0006\u0004\bh\u0010 J\u000f\u0010i\u001a\u00020\u001aH\u0016¢\u0006\u0004\bi\u0010.J\u000f\u0010j\u001a\u00020\u001aH\u0016¢\u0006\u0004\bj\u0010.J\u000f\u0010k\u001a\u00020\u001aH\u0002¢\u0006\u0004\bk\u0010.J\u000f\u0010l\u001a\u00020\u001aH\u0002¢\u0006\u0004\bl\u0010.J\u0017\u0010m\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010q\u001a\u00020o2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\bH\u0002¢\u0006\u0004\bt\u0010\\J\u000f\u0010u\u001a\u00020\bH\u0002¢\u0006\u0004\bu\u0010 J\u0015\u0010v\u001a\u0004\u0018\u00010\u000b*\u00020'H\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u001a2\u0006\u0010x\u001a\u00020\u000bH\u0002¢\u0006\u0004\by\u0010zR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010|R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010}R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010~R\u001c\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u007fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u007fR\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0080\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0081\u0001R\u0016\u0010\u0082\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010|R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u008d\u0001R\u0019\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u008e\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020F0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u0092\u0001R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010~R(\u0010\u0096\u0001\u001a\u00020\b2\u0007\u0010\u0095\u0001\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010~\u001a\u0005\b\u0097\u0001\u0010 R\u0018\u0010\u0098\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010~R\u001e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0091\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R.\u0010©\u0001\u001a\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u001a\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010«\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010~R\u0018\u0010¬\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010~¨\u0006°\u0001"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "listSdkVsid", "", "listPlayerIndex", "", "failFast", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/data/dto/VideoData;", "videoDataCache", "Lru/yandex/video/m3/list_player_manager/model/FirstFrameData;", "firstFrameCache", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "listPlayerManagerAudioControl", "Lru/yandex/video/m3/ab/config/AbFlags;", "abFlags", "Lru/yandex/video/m3/list_player_manager/ListPlayerDebugManager;", "listPlayerDebugManager", "<init>", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/lang/String;IZLru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;Lru/yandex/video/m3/ab/config/AbFlags;Lru/yandex/video/m3/list_player_manager/ListPlayerDebugManager;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "Lzy11;", "attachEngine", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "detachEngine", "()Lru/yandex/video/m3/player/YandexPlayer;", "isWithEngine", "()Z", "getEngine", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "observer", "addInternalObserver", "(Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;)V", "removeInternalObserver", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "setSource", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "dropSource", "()V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "Lru/yandex/video/m3/ui/PlayerView;", "playerView", "onAttachToView", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/ui/PlayerView;)V", "onDetachFromView", "w", "h", "oldw", "oldh", "onPlayerViewSizeChange", "(IIII)V", "getAttachedView", "()Lru/yandex/video/m3/ui/ListYandexPlayerView;", "getVideoSessionId", "()Ljava/lang/String;", "getListPlayerIndex", "()I", "getCurrentPlaybackConfig", "()Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "getItem", "()Lru/yandex/video/m3/list_player_manager/model/MediaData;", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "addObserver", "(Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;)V", "removeObserver", "play", "pause", "", "getPosition", "()J", "getBufferedPosition", "getContentDuration", "position", "seekTo", "(J)V", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "muted", "setMuted", "(Z)V", "isMuted", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "getCurrentTrack", "(I)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "", "getAvailableTracks", "(I)Ljava/util/List;", "trackVariant", "setTrack", "(Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;)Z", "isInLive", "goToLive", "release", "startInternalLoading", "stopInternalLoading", "cacheFirstFrameIfPossible", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "getActualPlaybackParameters", "(Lru/yandex/video/m3/data/PlaybackParameters;)Lru/yandex/video/m3/data/PlaybackParameters;", "loopPlayback", "setLoopPlayback", "isEngineAndListPlayerHaveSameContent", "convertToVideoData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onVideoDataLoaded", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Z", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "Lru/yandex/video/m3/ab/config/AbFlags;", "TAG", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$EngineObserver;", "engineObserver", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$EngineObserver;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$EngineAnalyticsObserver;", "engineAnalyticsObserver", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$EngineAnalyticsObserver;", "Lru/yandex/video/m3/ui/PlayerView;", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "mediaDataIsFromCache", "<set-?>", "willPlayWhenReady", "getWillPlayWhenReady", "isReadyForPlaybackWithCurrentSource", "internalObservers", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackManager;", "trackManager", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackManager;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$PostponedOperation;", "preparePostponedOperation", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$PostponedOperation;", "", "postponedOperations", "Ljava/util/List;", "postponedStartPosition", "Ljava/lang/Long;", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerAudioControl;", "audioControl", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerAudioControl;", "Lkotlin/Function1;", "viewPostponedOperation", "Ltls;", "isInternalLoadingProceed", "isInnerPlayerLoadingProceed", "EngineAnalyticsObserver", "EngineObserver", "PostponedOperation", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListYandexPlayerImpl implements InternalListYandexPlayer {
    public static final int $stable = 8;
    private final String TAG;
    private final AbFlags abFlags;
    private final ListPlayerAudioControl audioControl;
    private YandexPlayer<zxc0> engine;
    private final EngineAnalyticsObserver engineAnalyticsObserver;
    private final EngineObserver engineObserver;
    private final boolean failFast;
    private final DataCache<FirstFrameData> firstFrameCache;
    private final Handler handler;
    private final ObserverDispatcher<ListPlayerInternalObserver> internalObservers;
    private boolean isInnerPlayerLoadingProceed;
    private boolean isInternalLoadingProceed;
    private boolean isReadyForPlaybackWithCurrentSource;
    private final int listPlayerIndex;
    private final ListPlayerManagerAudioControl listPlayerManagerAudioControl;
    private final String listSdkVsid;
    private ListYandexPlayerView listYandexPlayerView;
    private MediaData mediaData;
    private boolean mediaDataIsFromCache;
    private final ObserverDispatcher<ListPlayerObserver> observerDispatcher;
    private PlaybackConfig playbackConfig;
    private final PlayerLogger playerLogger;
    private PlayerView playerView;
    private final List<PostponedOperation> postponedOperations;
    private Long postponedStartPosition;
    private PostponedOperation preparePostponedOperation;
    private TrackManager trackManager;
    private final DataCache<? extends VideoData> videoDataCache;
    private tls viewPostponedOperation;
    private boolean willPlayWhenReady;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$EngineAnalyticsObserver;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "feedYandexPlayerImpl", "Landroid/os/Handler;", "handler", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "TAG", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;Landroid/os/Handler;Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/lang/String;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "Lzy11;", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "Landroid/os/Handler;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EngineAnalyticsObserver implements PlayerAnalyticsObserver {
        private final String TAG;
        private final ListYandexPlayerImpl feedYandexPlayerImpl;
        private final Handler handler;
        private final PlayerLogger playerLogger;

        public EngineAnalyticsObserver(ListYandexPlayerImpl listYandexPlayerImpl, Handler handler, PlayerLogger playerLogger, String str) {
            this.feedYandexPlayerImpl = listYandexPlayerImpl;
            this.handler = handler;
            this.playerLogger = playerLogger;
            this.TAG = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPreparingStarted$lambda$2(EngineAnalyticsObserver engineAnalyticsObserver, PreparingParams preparingParams) {
            HashSet H0;
            Object failure;
            PlayerLogger playerLogger = engineAnalyticsObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineAnalyticsObserver.TAG;
                MediaData item = engineAnalyticsObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onPreparingStarted", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            ObserverDispatcher observerDispatcher = engineAnalyticsObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onPreparingStarted(preparingParams);
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

        @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
        public void onPreparingStarted(PreparingParams params) {
            tw21.a0(this.handler, new g(0, this, params));
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+¨\u0006,"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$EngineObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "feedYandexPlayerImpl", "Landroid/os/Handler;", "handler", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "TAG", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;Landroid/os/Handler;Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/lang/String;)V", "", "newPositionMs", "oldPositionMs", "Lzy11;", "onSeek", "(JJ)V", "onLoadingStart", "()V", "onLoadingFinished", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onVideoDataPrepared", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "onResumePlayback", "onPausePlayback", "onPlaybackEnded", "onReadyForFirstPlayback", "positionMs", "onPlaybackProgress", "(J)V", "bufferSizeMs", "onBufferSizeChanged", "onRepeat", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "Landroid/os/Handler;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EngineObserver implements PlayerObserver<Object> {
        private final String TAG;
        private final ListYandexPlayerImpl feedYandexPlayerImpl;
        private final Handler handler;
        private final PlayerLogger playerLogger;

        public EngineObserver(ListYandexPlayerImpl listYandexPlayerImpl, Handler handler, PlayerLogger playerLogger, String str) {
            this.feedYandexPlayerImpl = listYandexPlayerImpl;
            this.handler = handler;
            this.playerLogger = playerLogger;
            this.TAG = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBufferSizeChanged$lambda$26(EngineObserver engineObserver, long j) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onBufferSizeChanged(j);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLoadingFinished$lambda$5(EngineObserver engineObserver) {
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onLoadingFinished", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            engineObserver.feedYandexPlayerImpl.isInnerPlayerLoadingProceed = false;
            engineObserver.feedYandexPlayerImpl.stopInternalLoading();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLoadingStart$lambda$3(EngineObserver engineObserver) {
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onLoadingStart", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            engineObserver.feedYandexPlayerImpl.startInternalLoading();
            engineObserver.feedYandexPlayerImpl.isInnerPlayerLoadingProceed = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPausePlayback$lambda$15(EngineObserver engineObserver) {
            HashSet H0;
            Object failure;
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onPausePlayback", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onPausePlayback();
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPlaybackEnded$lambda$18(EngineObserver engineObserver) {
            HashSet H0;
            Object failure;
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onPlaybackEnded", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onPlaybackEnded();
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPlaybackError$lambda$7(EngineObserver engineObserver, PlaybackException playbackException) {
            HashSet H0;
            Object failure;
            PlayerLogger playerLogger = engineObserver.playerLogger;
            String str = engineObserver.TAG;
            MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
            PlayerLogger.error$default(playerLogger, str, "onPlaybackError", String.valueOf(item != null ? item.getVideoContentId() : null), null, new Object[0], 8, null);
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onPlaybackError(playbackException);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPlaybackProgress$lambda$24(EngineObserver engineObserver, long j) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onPlaybackProgress(j);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onReadyForFirstPlayback$lambda$22(EngineObserver engineObserver) {
            HashSet H0;
            Object failure;
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onReadyForFirstPlayback", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            if (engineObserver.feedYandexPlayerImpl.isEngineAndListPlayerHaveSameContent()) {
                engineObserver.feedYandexPlayerImpl.isReadyForPlaybackWithCurrentSource = true;
                engineObserver.feedYandexPlayerImpl.stopInternalLoading();
                PlayerLogger playerLogger2 = engineObserver.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                    String str2 = engineObserver.TAG;
                    StringBuilder sb = new StringBuilder();
                    MediaData item2 = engineObserver.feedYandexPlayerImpl.getItem();
                    playerLogger2.verbose(str2, "onReadyForFirstPlayback", oyr.t(sb, item2 != null ? item2.getVideoContentId() : null, " notify"), new Object[0]);
                }
                ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
                synchronized (observerDispatcher.getObservers()) {
                    H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    try {
                        ((ListPlayerObserver) it.next()).onReadyForFirstPlayback();
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
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onRepeat$lambda$28(EngineObserver engineObserver) {
            HashSet H0;
            Object failure;
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onRepeat();
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResumePlayback$lambda$12(EngineObserver engineObserver) {
            HashSet H0;
            Object failure;
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                StringBuilder sb = new StringBuilder();
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                sb.append(item != null ? item.getVideoContentId() : null);
                sb.append(" position=");
                sb.append(engineObserver.feedYandexPlayerImpl.getPosition());
                playerLogger.verbose(str, "onResumePlayback", sb.toString(), new Object[0]);
            }
            ObserverDispatcher observerDispatcher = engineObserver.feedYandexPlayerImpl.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onResumePlayback();
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSeek$lambda$1(EngineObserver engineObserver, long j, long j2) {
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                StringBuilder sb = new StringBuilder();
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                ly3.y(j, item != null ? item.getVideoContentId() : null, " from=", sb);
                sb.append(" to=");
                sb.append(j2);
                playerLogger.verbose(str, "onSeek", sb.toString(), new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVideoDataPrepared$lambda$9(EngineObserver engineObserver, VideoData videoData) {
            PlayerLogger playerLogger = engineObserver.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                String str = engineObserver.TAG;
                MediaData item = engineObserver.feedYandexPlayerImpl.getItem();
                playerLogger.verbose(str, "onVideoDataPrepared", String.valueOf(item != null ? item.getVideoContentId() : null), new Object[0]);
            }
            engineObserver.feedYandexPlayerImpl.onVideoDataLoaded(videoData);
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onBufferSizeChanged(long bufferSizeMs) {
            tw21.a0(this.handler, new h(this, bufferSizeMs, 0));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onLoadingFinished() {
            tw21.a0(this.handler, new i(this, 2));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onLoadingStart() {
            tw21.a0(this.handler, new i(this, 1));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPausePlayback() {
            tw21.a0(this.handler, new i(this, 4));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackEnded() {
            tw21.a0(this.handler, new i(this, 3));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackError(PlaybackException playbackException) {
            tw21.a0(this.handler, new g(1, this, playbackException));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackProgress(long positionMs) {
            tw21.a0(this.handler, new h(this, positionMs, 1));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onReadyForFirstPlayback() {
            tw21.a0(this.handler, new i(this, 5));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onRepeat() {
            tw21.a0(this.handler, new i(this, 0));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onResumePlayback() {
            tw21.a0(this.handler, new i(this, 6));
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onSeek(final long newPositionMs, final long oldPositionMs) {
            tw21.a0(this.handler, new Runnable() { // from class: ru.yandex.video.m3.list_player_manager.impl.j
                @Override // java.lang.Runnable
                public final void run() {
                    ListYandexPlayerImpl.EngineObserver.onSeek$lambda$1(ListYandexPlayerImpl.EngineObserver.this, oldPositionMs, newPositionMs);
                }
            });
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onVideoDataPrepared(VideoData videoData) {
            tw21.a0(this.handler, new g(2, this, videoData));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl$PostponedOperation;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "Lzy11;", "invoke", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PostponedOperation {
        void invoke(YandexPlayer<zxc0> engine);
    }

    public ListYandexPlayerImpl(PlayerLogger playerLogger, String str, int i, boolean z, DataCache<? extends VideoData> dataCache, DataCache<FirstFrameData> dataCache2, ListPlayerManagerAudioControl listPlayerManagerAudioControl, AbFlags abFlags, ListPlayerDebugManager listPlayerDebugManager) {
        this.playerLogger = playerLogger;
        this.listSdkVsid = str;
        this.listPlayerIndex = i;
        this.failFast = z;
        this.videoDataCache = dataCache;
        this.firstFrameCache = dataCache2;
        this.listPlayerManagerAudioControl = listPlayerManagerAudioControl;
        this.abFlags = abFlags;
        String e = oyr.e(']', i, "ListYandexPlayerImpl[");
        this.TAG = e;
        Handler o = tw21.o(null);
        this.handler = o;
        this.engineObserver = new EngineObserver(this, o, playerLogger, e);
        this.engineAnalyticsObserver = new EngineAnalyticsObserver(this, o, playerLogger, e);
        this.observerDispatcher = new ObserverDispatcher<>();
        this.internalObservers = new ObserverDispatcher<>();
        addInternalObserver(listPlayerDebugManager);
        this.postponedOperations = new ArrayList();
        this.audioControl = new ListPlayerAudioControl(playerLogger, e);
    }

    private final void cacheFirstFrameIfPossible(MediaData mediaData) {
        String firstFrameHash;
        if (mediaData.getVideoContentId() != null) {
            String firstFrameUrl = mediaData.getFirstFrameUrl();
            if ((firstFrameUrl == null || evu0.J(firstFrameUrl)) && ((firstFrameHash = mediaData.getFirstFrameHash()) == null || evu0.J(firstFrameHash))) {
                return;
            }
            this.firstFrameCache.set(mediaData.getVideoContentId(), new FirstFrameData(mediaData.getFirstFrameUrl(), mediaData.getFirstFrameHash()));
        }
    }

    private final VideoData convertToVideoData(final MediaData mediaData) {
        VideoData videoData;
        String streamFromMediaData = UtilKt.streamFromMediaData(mediaData);
        if (streamFromMediaData != null) {
            String videoContentId = mediaData.getVideoContentId();
            if (videoContentId == null) {
                videoContentId = "unknown";
            }
            return VhVideoDataKt.VhVideoData(streamFromMediaData, videoContentId, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$convertToVideoData$1
                {
                    super(1);
                }

                public final void invoke(VhVideoData.Builder builder) {
                    builder.setFirstFrameUrl(MediaData.this.getFirstFrameUrl());
                    builder.setFirstFrameHash(MediaData.this.getFirstFrameHash());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            });
        }
        if (mediaData.getVideoContentId() == null || (videoData = this.videoDataCache.get(mediaData.getVideoContentId())) == null) {
            return null;
        }
        this.mediaDataIsFromCache = true;
        return videoData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detachEngine$lambda$12(ListYandexPlayerImpl listYandexPlayerImpl, PlaybackParameters playbackParameters, YandexPlayer yandexPlayer) {
        String videoContentId;
        VideoData convertToVideoData;
        MediaData mediaData = listYandexPlayerImpl.mediaData;
        if (mediaData != null && (convertToVideoData = listYandexPlayerImpl.convertToVideoData(mediaData)) != null) {
            PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose(listYandexPlayerImpl.TAG, "detachEngine", "Postponed prepare", new Object[0]);
            }
            yandexPlayer.prepare(convertToVideoData, playbackParameters);
            return;
        }
        MediaData mediaData2 = listYandexPlayerImpl.mediaData;
        if (mediaData2 == null || (videoContentId = mediaData2.getVideoContentId()) == null) {
            return;
        }
        PlayerLogger playerLogger2 = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
            playerLogger2.verbose(listYandexPlayerImpl.TAG, "detachEngine", "Postponed prepare contentId", new Object[0]);
        }
        yandexPlayer.prepare(videoContentId, playbackParameters);
    }

    private final PlaybackParameters getActualPlaybackParameters(final PlaybackParameters playbackParameters) {
        return this.postponedStartPosition != null ? PlaybackParametersKt.PlaybackParameters(playbackParameters.getAutoPlay(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$getActualPlaybackParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                Long l;
                l = ListYandexPlayerImpl.this.postponedStartPosition;
                builder.setStartPosition(l);
                builder.setAdditionalParameters(playbackParameters.getAdditionalParameters());
                builder.setStartQualityConstraint(playbackParameters.getStartQualityConstraint());
                builder.setAdParameters(playbackParameters.getAdParameters());
                builder.setPlayerAnalyticsData(playbackParameters.getPlayerAnalyticsData());
                builder.setDisableAudioFromStart(Boolean.valueOf(playbackParameters.getDisableAudioFromStart()));
                builder.setPrepareWithoutInitCodecs(Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs()));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }
        }) : playbackParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEngineAndListPlayerHaveSameContent() {
        VideoData videoDataInternal;
        VideoData videoDataInternal2;
        MediaData mediaData = this.mediaData;
        String streamFromMediaData = mediaData != null ? UtilKt.streamFromMediaData(mediaData) : null;
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (streamFromMediaData == null) {
            if ((yandexPlayer != null ? yandexPlayer.getVideoContentId() : null) == null) {
                return false;
            }
            YandexPlayer<zxc0> yandexPlayer2 = this.engine;
            String videoContentId = yandexPlayer2 != null ? yandexPlayer2.getVideoContentId() : null;
            MediaData mediaData2 = this.mediaData;
            return jl40.l(videoContentId, mediaData2 != null ? mediaData2.getVideoContentId() : null);
        }
        if (((yandexPlayer == null || (videoDataInternal2 = yandexPlayer.getVideoDataInternal()) == null) ? null : videoDataInternal2.getManifestUrl()) != null) {
            YandexPlayer<zxc0> yandexPlayer3 = this.engine;
            if (yandexPlayer3 != null && (videoDataInternal = yandexPlayer3.getVideoDataInternal()) != null) {
                r1 = videoDataInternal.getManifestUrl();
            }
            if (jl40.l(r1, streamFromMediaData)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoDataLoaded(VideoData videoData) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onItemVideoDataLoaded(this, this.listYandexPlayerView, videoData, this.mediaDataIsFromCache);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$56$lambda$55(ListYandexPlayerImpl listYandexPlayerImpl, YandexPlayer yandexPlayer) {
        PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(listYandexPlayerImpl.TAG, "pause", "Postponed pause", new Object[0]);
        }
        yandexPlayer.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$51$lambda$50(ListYandexPlayerImpl listYandexPlayerImpl, YandexPlayer yandexPlayer) {
        PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(listYandexPlayerImpl.TAG, "play", "Postponed play", new Object[0]);
        }
        yandexPlayer.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void seekTo$lambda$60$lambda$59(ListYandexPlayerImpl listYandexPlayerImpl, long j, YandexPlayer yandexPlayer) {
        PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(listYandexPlayerImpl.TAG, "seekTo", "Postponed seekTo", new Object[0]);
        }
        yandexPlayer.seekTo(j);
    }

    private final void setLoopPlayback(final boolean loopPlayback) {
        final RepeatMode repeatMode = loopPlayback ? RepeatMode.Infinity.INSTANCE : RepeatMode.None.INSTANCE;
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            yandexPlayer.setRepeatMode(repeatMode);
        } else {
            this.postponedOperations.add(new PostponedOperation() { // from class: ru.yandex.video.m3.list_player_manager.impl.b
                @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
                public final void invoke(YandexPlayer yandexPlayer2) {
                    ListYandexPlayerImpl.setLoopPlayback$lambda$35$lambda$34(ListYandexPlayerImpl.this, repeatMode, loopPlayback, yandexPlayer2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLoopPlayback$lambda$35$lambda$34(ListYandexPlayerImpl listYandexPlayerImpl, RepeatMode repeatMode, boolean z, YandexPlayer yandexPlayer) {
        PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(listYandexPlayerImpl.TAG, "setLoopPlayback", "setLoopPlayback = " + z, new Object[0]);
        }
        yandexPlayer.setRepeatMode(repeatMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSource$lambda$26$lambda$25(ListYandexPlayerImpl listYandexPlayerImpl, PlaybackParameters playbackParameters, VideoData videoData, YandexPlayer yandexPlayer) {
        PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(listYandexPlayerImpl.TAG, "setSource", "Postponed prepare postponedStartPosition = " + listYandexPlayerImpl.postponedStartPosition, new Object[0]);
        }
        PlaybackParameters actualPlaybackParameters = listYandexPlayerImpl.getActualPlaybackParameters(playbackParameters);
        listYandexPlayerImpl.postponedStartPosition = null;
        yandexPlayer.prepare(videoData, actualPlaybackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSource$lambda$29$lambda$28(ListYandexPlayerImpl listYandexPlayerImpl, PlaybackParameters playbackParameters, MediaData mediaData, YandexPlayer yandexPlayer) {
        PlayerLogger playerLogger = listYandexPlayerImpl.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(listYandexPlayerImpl.TAG, "setSource", "Postponed prepare postponedStartPosition = " + listYandexPlayerImpl.postponedStartPosition, new Object[0]);
        }
        PlaybackParameters actualPlaybackParameters = listYandexPlayerImpl.getActualPlaybackParameters(playbackParameters);
        listYandexPlayerImpl.postponedStartPosition = null;
        yandexPlayer.prepare(mediaData.getVideoContentId(), actualPlaybackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInternalLoading() {
        HashSet H0;
        Object failure;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "startInternalLoading", "isInternalLoadingProceed=" + this.isInternalLoadingProceed + " isInnerPlayerLoadingProceed=" + this.isInnerPlayerLoadingProceed, new Object[0]);
        }
        if (!this.isInternalLoadingProceed && !this.isInnerPlayerLoadingProceed) {
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                playerLogger2.verbose(this.TAG, "startInternalLoading", "notifyObservers", new Object[0]);
            }
            ObserverDispatcher<ListPlayerObserver> observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onLoadingStart();
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
        this.isInternalLoadingProceed = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopInternalLoading() {
        HashSet H0;
        Object failure;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "stopInternalLoading", "isInternalLoadingProceed=" + this.isInternalLoadingProceed + " isInnerPlayerLoadingProceed=" + this.isInnerPlayerLoadingProceed, new Object[0]);
        }
        if (this.isInternalLoadingProceed && !this.isInnerPlayerLoadingProceed) {
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                playerLogger2.verbose(this.TAG, "stopInternalLoading", "notifyObservers", new Object[0]);
            }
            ObserverDispatcher<ListPlayerObserver> observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onLoadingFinished();
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
        this.isInternalLoadingProceed = false;
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public void addInternalObserver(ListPlayerInternalObserver observer) {
        this.internalObservers.add((ObserverDispatcher<ListPlayerInternalObserver>) observer);
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void addObserver(ListPlayerObserver observer) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "addObserver", observer, new Object[0]);
        }
        this.observerDispatcher.add((ObserverDispatcher<ListPlayerObserver>) observer);
        TrackManager trackManager = this.trackManager;
        if (trackManager != null) {
            trackManager.addPlayerListener(observer);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public void attachEngine(YandexPlayer<zxc0> engine) {
        HashSet H0;
        ListYandexPlayerView listYandexPlayerView;
        Object failure;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("item = ");
            MediaData mediaData = this.mediaData;
            sb.append(mediaData != null ? mediaData.getVideoContentId() : null);
            sb.append(", WxH: ");
            ListYandexPlayerView listYandexPlayerView2 = this.listYandexPlayerView;
            sb.append(listYandexPlayerView2 != null ? Integer.valueOf(listYandexPlayerView2.getWidth()) : null);
            sb.append('x');
            ListYandexPlayerView listYandexPlayerView3 = this.listYandexPlayerView;
            sb.append(listYandexPlayerView3 != null ? Integer.valueOf(listYandexPlayerView3.getHeight()) : null);
            playerLogger.verbose(str, "attachEngine", sb.toString(), new Object[0]);
        }
        this.engine = engine;
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer(engine.getHidedPlayer());
        }
        engine.addObserver(this.engineObserver);
        engine.addAnalyticsObserver(this.engineAnalyticsObserver);
        tls tlsVar = this.viewPostponedOperation;
        if (tlsVar != null) {
            tlsVar.invoke(engine);
        }
        this.viewPostponedOperation = null;
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onEngineAttached(engine);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        final TrackManagerImpl trackManagerImpl = new TrackManagerImpl(engine, this.handler);
        this.observerDispatcher.forEach(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$attachEngine$3$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ListPlayerObserver) obj);
                return zy11.a;
            }

            public final void invoke(ListPlayerObserver listPlayerObserver) {
                TrackManagerImpl.this.addPlayerListener(listPlayerObserver);
            }
        });
        this.trackManager = trackManagerImpl;
        if (this.abFlags.getEnableSurfaceCappingInListSDK() && (listYandexPlayerView = this.listYandexPlayerView) != null && listYandexPlayerView.getWidth() > 0 && listYandexPlayerView.getHeight() > 0) {
            engine.setSurfaceSize(listYandexPlayerView.getWidth(), listYandexPlayerView.getHeight());
        }
        if (!isEngineAndListPlayerHaveSameContent()) {
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                String str2 = this.TAG;
                StringBuilder sb2 = new StringBuilder("other media data in engine mediaData=");
                MediaData mediaData2 = this.mediaData;
                sb2.append(mediaData2 != null ? UtilKt.streamFromMediaData(mediaData2) : null);
                sb2.append(" engine=");
                VideoData videoDataInternal = engine.getVideoDataInternal();
                sb2.append(videoDataInternal != null ? videoDataInternal.getManifestUrl() : null);
                playerLogger2.verbose(str2, "attachEngine", sb2.toString(), new Object[0]);
            }
            startInternalLoading();
        }
        PostponedOperation postponedOperation = this.preparePostponedOperation;
        if (postponedOperation != null) {
            postponedOperation.invoke(engine);
        }
        this.preparePostponedOperation = null;
        Iterator<T> it2 = this.postponedOperations.iterator();
        while (it2.hasNext()) {
            ((PostponedOperation) it2.next()).invoke(engine);
        }
        this.postponedOperations.clear();
        this.audioControl.applyToEngine(engine);
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public YandexPlayer<zxc0> detachEngine() {
        final Long l;
        HashSet H0;
        Object failure;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("item = ");
            MediaData mediaData = this.mediaData;
            sb.append(mediaData != null ? mediaData.getVideoContentId() : null);
            sb.append(" isWithEngine = ");
            sb.append(isWithEngine());
            playerLogger.verbose(str, "detachEngine", sb.toString(), new Object[0]);
        }
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null && yandexPlayer.isPlaying()) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "detachEngine", "detachEngine while engine isPlaying", null, new Object[0], 8, null);
        }
        if (getWillPlayWhenReady()) {
            PlayerLogger.error$default(this.playerLogger, this.TAG, "detachEngine", "detachEngine, but player willPlayWhenReady", null, new Object[0], 8, null);
        }
        YandexPlayer<zxc0> yandexPlayer2 = this.engine;
        if (yandexPlayer2 != null) {
            yandexPlayer2.pause();
        }
        if (this.isReadyForPlaybackWithCurrentSource) {
            YandexPlayer<zxc0> yandexPlayer3 = this.engine;
            l = yandexPlayer3 != null ? Long.valueOf(yandexPlayer3.getPosition()) : this.postponedStartPosition;
        } else {
            l = this.postponedStartPosition;
        }
        this.isReadyForPlaybackWithCurrentSource = false;
        final PlaybackParameters PlaybackParameters = PlaybackParametersKt.PlaybackParameters(false, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$detachEngine$playbackParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                builder.setStartPosition(l);
            }
        });
        YandexPlayer<zxc0> yandexPlayer4 = this.engine;
        boolean l2 = jl40.l(yandexPlayer4 != null ? yandexPlayer4.getRepeatMode() : null, RepeatMode.Infinity.INSTANCE);
        TrackManager trackManager = this.trackManager;
        if (trackManager != null) {
            trackManager.release();
        }
        this.trackManager = null;
        this.preparePostponedOperation = new PostponedOperation() { // from class: ru.yandex.video.m3.list_player_manager.impl.a
            @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
            public final void invoke(YandexPlayer yandexPlayer5) {
                ListYandexPlayerImpl.detachEngine$lambda$12(ListYandexPlayerImpl.this, PlaybackParameters, yandexPlayer5);
            }
        };
        YandexPlayer<zxc0> yandexPlayer5 = this.engine;
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        YandexPlayer<zxc0> yandexPlayer6 = this.engine;
        if (yandexPlayer6 != null) {
            yandexPlayer6.removeObserver(this.engineObserver);
        }
        YandexPlayer<zxc0> yandexPlayer7 = this.engine;
        if (yandexPlayer7 != null) {
            yandexPlayer7.removeAnalyticsObserver(this.engineAnalyticsObserver);
        }
        this.engine = null;
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onEngineDetached();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        setLoopPlayback(l2);
        return yandexPlayer5;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void dropSource() {
        HashSet H0;
        Object failure;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("mediaData = ");
            MediaData mediaData = this.mediaData;
            sb.append(mediaData != null ? mediaData.getVideoContentId() : null);
            sb.append(" isWithEngine = ");
            sb.append(isWithEngine());
            playerLogger.verbose(str, "dropSource", sb.toString(), new Object[0]);
        }
        this.willPlayWhenReady = false;
        MediaData mediaData2 = this.mediaData;
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            yandexPlayer.pause();
        }
        this.mediaData = null;
        this.playbackConfig = null;
        this.isReadyForPlaybackWithCurrentSource = false;
        this.preparePostponedOperation = null;
        this.postponedOperations.clear();
        this.postponedStartPosition = null;
        if (mediaData2 != null) {
            ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerInternalObserver) it.next()).onDropSource(this, this.listYandexPlayerView, mediaData2);
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
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    /* renamed from: getAttachedView, reason: from getter */
    public ListYandexPlayerView getListYandexPlayerView() {
        return this.listYandexPlayerView;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public List<TrackVariant> getAvailableTracks(int trackType) {
        List<TrackVariant> availableTracks;
        TrackManager trackManager = this.trackManager;
        return (trackManager == null || (availableTracks = trackManager.getAvailableTracks(trackType)) == null) ? EmptyList.a : availableTracks;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public long getBufferedPosition() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            return yandexPlayer.getBufferedPosition();
        }
        return 0L;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public long getContentDuration() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            return yandexPlayer.getContentDuration();
        }
        return 0L;
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    /* renamed from: getCurrentPlaybackConfig, reason: from getter */
    public PlaybackConfig getPlaybackConfig() {
        return this.playbackConfig;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public TrackVariant getCurrentTrack(int trackType) {
        TrackManager trackManager = this.trackManager;
        if (trackManager != null) {
            return trackManager.getCurrentTrack(trackType);
        }
        return null;
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public YandexPlayer<zxc0> getEngine() {
        return this.engine;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public MediaData getItem() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        return this.mediaData;
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public int getListPlayerIndex() {
        return this.listPlayerIndex;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public long getPosition() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            return yandexPlayer.getPosition();
        }
        return 0L;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    /* renamed from: getVideoSessionId, reason: from getter */
    public String getListSdkVsid() {
        return this.listSdkVsid;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public float getVolume() {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        return yandexPlayer != null ? yandexPlayer.getVolume() : this.audioControl.getCurrentVolume();
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public boolean getWillPlayWhenReady() {
        return this.willPlayWhenReady;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void goToLive() {
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            yandexPlayer.seekTo(-9223372036854775807L);
        } else {
            new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$goToLive$1
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m739invoke() {
                    ListYandexPlayerImpl.this.postponedStartPosition = null;
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m739invoke();
                    return zy11.a;
                }
            };
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public boolean isInLive() {
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            return yandexPlayer.isInLive();
        }
        return false;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public boolean isMuted() {
        return this.audioControl.getForcedMute();
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public boolean isWithEngine() {
        return this.engine != null;
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public void onAttachToView(ListYandexPlayerView listYandexPlayerView, final PlayerView playerView) {
        HashSet H0;
        Object failure;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "onAttachToView", "attach view isWithEngine = " + isWithEngine(), new Object[0]);
        }
        this.playerView = playerView;
        this.listYandexPlayerView = listYandexPlayerView;
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer == null) {
            this.viewPostponedOperation = new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$onAttachToView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(YandexPlayer<zxc0> yandexPlayer2) {
                    PlayerLogger playerLogger2;
                    String str;
                    playerLogger2 = ListYandexPlayerImpl.this.playerLogger;
                    ListYandexPlayerImpl listYandexPlayerImpl = ListYandexPlayerImpl.this;
                    if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                        str = listYandexPlayerImpl.TAG;
                        playerLogger2.verbose(str, "onAttachToView", "Postponed attach view", new Object[0]);
                    }
                    playerView.setPlayer(yandexPlayer2.getHidedPlayer());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((YandexPlayer<zxc0>) obj);
                    return zy11.a;
                }
            };
        } else {
            playerView.setPlayer(yandexPlayer != null ? yandexPlayer.getHidedPlayer() : null);
        }
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onViewAttached(this, listYandexPlayerView);
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

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public void onDetachFromView() {
        HashSet H0;
        Object failure;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "onDetachFromView", "detach view isWithEngine = " + isWithEngine(), new Object[0]);
        }
        ListYandexPlayerView listYandexPlayerView = this.listYandexPlayerView;
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        this.playerView = null;
        this.listYandexPlayerView = null;
        this.viewPostponedOperation = null;
        if (listYandexPlayerView != null) {
            ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerInternalObserver) it.next()).onViewDetached(this, listYandexPlayerView);
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
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[SYNTHETIC] */
    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPlayerViewSizeChange(int w, int h, int oldw, int oldh) {
        HashSet H0;
        ListYandexPlayerImpl listYandexPlayerImpl;
        int i;
        int i2;
        int i3;
        int i4;
        Object failure;
        Throwable a;
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                listYandexPlayerImpl = this;
                i = w;
                i2 = h;
                i3 = oldw;
                i4 = oldh;
            } catch (Throwable th) {
                th = th;
                listYandexPlayerImpl = this;
                i = w;
                i2 = h;
                i3 = oldw;
                i4 = oldh;
            }
            try {
                ((ListPlayerInternalObserver) it.next()).onPlayerViewSizeChange(listYandexPlayerImpl, i, i2, i3, i4);
                failure = zy11.a;
            } catch (Throwable th2) {
                th = th2;
                failure = new Result.Failure(th);
                a = Result.a(failure);
                if (a == null) {
                }
                this = listYandexPlayerImpl;
                w = i;
                h = i2;
                oldw = i3;
                oldh = i4;
            }
            a = Result.a(failure);
            if (a == null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
            this = listYandexPlayerImpl;
            w = i;
            h = i2;
            oldw = i3;
            oldh = i4;
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void pause() {
        HashSet H0;
        zy11 zy11Var;
        Object failure;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        boolean willPlayWhenReady = getWillPlayWhenReady();
        int i = 0;
        this.willPlayWhenReady = false;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "pause", "isWithEngine = " + isWithEngine(), new Object[0]);
        }
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onPause(this, willPlayWhenReady);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            yandexPlayer.pause();
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            this.postponedOperations.add(new c(this, i));
            stopInternalLoading();
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void play() {
        HashSet H0;
        zy11 zy11Var;
        Object failure;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        boolean willPlayWhenReady = getWillPlayWhenReady();
        int i = 1;
        this.willPlayWhenReady = true;
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "play", "isWithEngine = " + isWithEngine() + " wasPlayWhenReady = " + willPlayWhenReady, new Object[0]);
        }
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onPlay(this, willPlayWhenReady);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            yandexPlayer.play();
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            this.postponedOperations.add(new c(this, i));
            startInternalLoading();
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public void release() {
        HashSet H0;
        Object failure;
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it.next()).onRelease(this);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        this.internalObservers.clear();
        this.observerDispatcher.clear();
    }

    @Override // ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer
    public void removeInternalObserver(ListPlayerInternalObserver observer) {
        this.internalObservers.remove(observer);
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void removeObserver(ListPlayerObserver observer) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "removeObserver", observer, new Object[0]);
        }
        this.observerDispatcher.remove(observer);
        TrackManager trackManager = this.trackManager;
        if (trackManager != null) {
            trackManager.removePlayerListener(observer);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void seekTo(final long position) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            String str = this.TAG;
            StringBuilder w = unr0.w(position, "seekTo ", " isWithEngine = ");
            w.append(isWithEngine());
            playerLogger.verbose(str, "seekTo", w.toString(), new Object[0]);
        }
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            yandexPlayer.seekTo(position);
        } else {
            this.postponedOperations.add(new PostponedOperation() { // from class: ru.yandex.video.m3.list_player_manager.impl.f
                @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
                public final void invoke(YandexPlayer yandexPlayer2) {
                    ListYandexPlayerImpl.seekTo$lambda$60$lambda$59(ListYandexPlayerImpl.this, position, yandexPlayer2);
                }
            });
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void setMuted(boolean muted) {
        HashSet H0;
        Object failure;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "setMuted", "setMuted " + muted + " isWithEngine = " + isWithEngine(), new Object[0]);
        }
        boolean muted2 = this.audioControl.setMuted(muted);
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            this.audioControl.applyToEngine(yandexPlayer);
        }
        if (muted2) {
            ObserverDispatcher<ListPlayerObserver> observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((ListPlayerObserver) it.next()).onMutedChanged(muted);
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
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void setSource(final MediaData mediaData, final PlaybackConfig playbackConfig) {
        HashSet H0;
        HashSet H02;
        HashSet H03;
        Object failure;
        Object failure2;
        Object failure3;
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        final int i = 0;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "setSource", mediaData.getVideoContentId() + " playbackConfig: " + playbackConfig + " isWithEngine = " + isWithEngine(), new Object[0]);
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("mediaData=");
            sb.append(mediaData);
            playerLogger.verbose(str, "setSource", sb.toString(), new Object[0]);
        }
        MediaData mediaData2 = this.mediaData;
        this.mediaDataIsFromCache = false;
        this.isReadyForPlaybackWithCurrentSource = false;
        this.willPlayWhenReady = playbackConfig.getAutoplay();
        this.mediaData = mediaData;
        this.playbackConfig = playbackConfig;
        ObserverDispatcher<ListPlayerObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ListPlayerObserver) it.next()).onNewSourceIsSet();
                failure3 = zy11.a;
            } catch (Throwable th) {
                failure3 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure3);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<ListPlayerInternalObserver> observerDispatcher2 = this.internalObservers;
        synchronized (observerDispatcher2.getObservers()) {
            H02 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H02.iterator();
        while (it2.hasNext()) {
            try {
                ((ListPlayerInternalObserver) it2.next()).onSetSource(this, mediaData2, mediaData, playbackConfig);
                failure2 = zy11.a;
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure2);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
        this.postponedStartPosition = Long.valueOf(playbackConfig.getStartPosition());
        zy11 zy11Var = null;
        this.preparePostponedOperation = null;
        this.audioControl.setMuted(playbackConfig.isMuted());
        final boolean isMuted = this.listPlayerManagerAudioControl.isMuted();
        final PlaybackParameters PlaybackParameters = PlaybackParametersKt.PlaybackParameters(playbackConfig.getAutoplay(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl$setSource$playbackParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                builder.setStartPosition(Long.valueOf(PlaybackConfig.this.getStartPosition()));
                builder.setAdditionalParameters(PlaybackConfig.this.getAdditionalParameters());
                builder.setDisableAudioFromStart(Boolean.valueOf(isMuted));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }
        });
        cacheFirstFrameIfPossible(mediaData);
        final VideoData convertToVideoData = convertToVideoData(mediaData);
        if (convertToVideoData != null) {
            YandexPlayer<zxc0> yandexPlayer = this.engine;
            if (yandexPlayer != null) {
                yandexPlayer.prepare(convertToVideoData, PlaybackParameters);
                zy11Var = zy11.a;
            }
            if (zy11Var == null) {
                this.preparePostponedOperation = new PostponedOperation(this) { // from class: ru.yandex.video.m3.list_player_manager.impl.d
                    public final /* synthetic */ ListYandexPlayerImpl b;

                    {
                        this.b = this;
                    }

                    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
                    public final void invoke(YandexPlayer yandexPlayer2) {
                        int i2 = i;
                        Object obj = convertToVideoData;
                        PlaybackParameters playbackParameters = PlaybackParameters;
                        ListYandexPlayerImpl listYandexPlayerImpl = this.b;
                        switch (i2) {
                            case 0:
                                ListYandexPlayerImpl.setSource$lambda$26$lambda$25(listYandexPlayerImpl, playbackParameters, (VideoData) obj, yandexPlayer2);
                                break;
                            default:
                                ListYandexPlayerImpl.setSource$lambda$29$lambda$28(listYandexPlayerImpl, playbackParameters, (MediaData) obj, yandexPlayer2);
                                break;
                        }
                    }
                };
                if (playbackConfig.getAutoplay()) {
                    startInternalLoading();
                }
            }
        } else {
            if (mediaData.getVideoContentId() == null) {
                PlayerLogger.error$default(this.playerLogger, this.TAG, "setSource", "Empty stream url and videoContentId for " + mediaData + '!', null, new Object[0], 8, null);
                ObserverDispatcher<ListPlayerObserver> observerDispatcher3 = this.observerDispatcher;
                synchronized (observerDispatcher3.getObservers()) {
                    H03 = kotlin.collections.a.H0(observerDispatcher3.getObservers());
                }
                Iterator it3 = H03.iterator();
                while (it3.hasNext()) {
                    try {
                        ((ListPlayerObserver) it3.next()).onPlaybackError(new PlaybackException.ErrorPreparing.InvalidStreamUrl(new IllegalArgumentException("Empty stream url and videoContentId for " + mediaData + '!')));
                        failure = zy11.a;
                    } catch (Throwable th3) {
                        failure = new Result.Failure(th3);
                    }
                    Throwable a3 = Result.a(failure);
                    if (a3 != null) {
                        h5z0.a.f(a3, "notifyObservers", new Object[0]);
                    }
                }
                YandexPlayer<zxc0> yandexPlayer2 = this.engine;
                if (yandexPlayer2 != null) {
                    yandexPlayer2.stopKeepingDecoders();
                    zy11Var = zy11.a;
                }
                if (zy11Var == null) {
                    this.preparePostponedOperation = new e();
                    return;
                }
                return;
            }
            YandexPlayer<zxc0> yandexPlayer3 = this.engine;
            if (yandexPlayer3 != null) {
                yandexPlayer3.prepare(mediaData.getVideoContentId(), PlaybackParameters);
                zy11Var = zy11.a;
            }
            if (zy11Var == null) {
                final int i2 = 1;
                this.preparePostponedOperation = new PostponedOperation(this) { // from class: ru.yandex.video.m3.list_player_manager.impl.d
                    public final /* synthetic */ ListYandexPlayerImpl b;

                    {
                        this.b = this;
                    }

                    @Override // ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl.PostponedOperation
                    public final void invoke(YandexPlayer yandexPlayer22) {
                        int i22 = i2;
                        Object obj = mediaData;
                        PlaybackParameters playbackParameters = PlaybackParameters;
                        ListYandexPlayerImpl listYandexPlayerImpl = this.b;
                        switch (i22) {
                            case 0:
                                ListYandexPlayerImpl.setSource$lambda$26$lambda$25(listYandexPlayerImpl, playbackParameters, (VideoData) obj, yandexPlayer22);
                                break;
                            default:
                                ListYandexPlayerImpl.setSource$lambda$29$lambda$28(listYandexPlayerImpl, playbackParameters, (MediaData) obj, yandexPlayer22);
                                break;
                        }
                    }
                };
                if (playbackConfig.getAutoplay()) {
                    startInternalLoading();
                }
            }
        }
        setLoopPlayback(playbackConfig.getLoopPlayback());
        setMuted(playbackConfig.isMuted());
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public boolean setTrack(TrackVariant trackVariant) {
        TrackManager trackManager = this.trackManager;
        if (trackManager != null) {
            return trackManager.setTrack(trackVariant);
        }
        return false;
    }

    @Override // ru.yandex.video.m3.list_player_manager.ListYandexPlayer
    public void setVolume(float volume) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            playerLogger.verbose(this.TAG, "setVolume", "setVolume " + volume + " isWithEngine = " + isWithEngine(), new Object[0]);
        }
        this.audioControl.setVolume(volume);
        YandexPlayer<zxc0> yandexPlayer = this.engine;
        if (yandexPlayer != null) {
            this.audioControl.applyToEngine(yandexPlayer);
        }
    }
}
