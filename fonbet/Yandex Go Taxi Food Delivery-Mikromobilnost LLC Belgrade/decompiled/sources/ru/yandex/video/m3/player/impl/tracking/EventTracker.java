package ru.yandex.video.m3.player.impl.tracking;

import defpackage.sls;
import defpackage.w511;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.dto.PlaybackOptions;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.SimpleDecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackData;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b(\u0010\u001cJ\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b)\u0010\u001cJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b*\u0010\u001cJ\u001f\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H&¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00042\u0006\u0010,\u001a\u0002002\u0006\u0010-\u001a\u000200H&¢\u0006\u0004\b1\u00102J#\u00104\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u0001032\b\u0010-\u001a\u0004\u0018\u000103H&¢\u0006\u0004\b4\u00105J/\u0010<\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00132\f\u00109\u001a\b\u0012\u0004\u0012\u000208072\b\u0010;\u001a\u0004\u0018\u00010:H&¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010CJ)\u0010F\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010?\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u00010DH&¢\u0006\u0004\bF\u0010GJ3\u0010K\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020#2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010DH&¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u0013H&¢\u0006\u0004\bN\u0010\u001cJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00162\u0006\u0010E\u001a\u00020PH&¢\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00162\u0006\u0010E\u001a\u00020SH&¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00162\u0006\u0010E\u001a\u00020PH&¢\u0006\u0004\bV\u0010RJ\u001f\u0010W\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00162\u0006\u0010E\u001a\u00020PH&¢\u0006\u0004\bW\u0010RJ\u0017\u0010Z\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020XH&¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u00020\u00042\b\u0010]\u001a\u0004\u0018\u00010\\H&¢\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010a\u001a\u00020`H&¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bd\u0010\u001cJ\u001f\u0010e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010a\u001a\u00020`H&¢\u0006\u0004\be\u0010cJ\u0017\u0010f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bf\u0010\u001cJ'\u0010i\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010h\u001a\u00020g2\u0006\u0010J\u001a\u00020#H&¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bk\u0010\u001cJ\u0019\u0010n\u001a\u00020\u00042\b\u0010m\u001a\u0004\u0018\u00010lH&¢\u0006\u0004\bn\u0010oJ\u0019\u0010p\u001a\u00020\u00042\b\u0010m\u001a\u0004\u0018\u00010lH&¢\u0006\u0004\bp\u0010oJ\u001f\u0010r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010q\u001a\u00020\u0017H&¢\u0006\u0004\br\u0010sJ+\u0010w\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010t\u001a\u0004\u0018\u00010\u00162\b\u0010v\u001a\u0004\u0018\u00010uH&¢\u0006\u0004\bw\u0010xJ\u0017\u0010w\u001a\u00020\u00042\u0006\u0010z\u001a\u00020yH&¢\u0006\u0004\bw\u0010{J\u001f\u0010~\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010}\u001a\u00020|H&¢\u0006\u0004\b~\u0010\u007fJ\"\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u00020\u0017H&¢\u0006\u0005\b\u0081\u0001\u0010sJ\u001c\u0010\u0084\u0001\u001a\u00020\u00042\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H&¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J+\u0010\u0088\u0001\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>2\u000f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0086\u0001H&¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008a\u0001À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "Lzy11;", "onCreatePlayer", "(Lru/yandex/video/m3/ab/config/AbConfig;)V", "onSetSource", "()V", "onLoadSource", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "firstPlaybackInfo", "onCanPlay", "(Lru/yandex/video/m3/player/FirstPlaybackInfo;)V", "", "newPositionMs", "oldPositionMs", "onSeek", "(JJ)V", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "playerState", "", "Lru/yandex/video/m3/player/tracks/TrackType;", "", "initializedDecoders", "onStart", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/util/Map;)V", "onEnd", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;)V", "onRepeat", "Lru/yandex/video/m3/player/impl/tracking/StalledState;", "stalledState", "onStalled", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/impl/tracking/StalledState;)V", "onStalledEnd", "", "keepDecoders", "onStop", "(Z)V", "on4SecWatched", "on10SecWatched", "on20SecWatched", "on30SecHeartbeat", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "newTrackData", "oldTrackData", "onVideoTrackChanged", "(Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;)V", "Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;", "onAudioTrackChanged", "(Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;)V", "Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "onSubtitleTrackChanged", "(Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;)V", "currentPlayerState", "", "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "playerStates", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "playbackOptions", "onPlayerAlive", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/util/List;Lru/yandex/video/m3/data/dto/PlaybackOptions;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lru/yandex/video/m3/data/RecoverDetails;", "recoverDetails", "onRecoverStreamError", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/data/RecoverDetails;)V", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "eventData", "onFatalError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;)V", "", "throwable", "sendAvailableDecoders", "onError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/lang/Throwable;ZLru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;)V", "finalPlayerState", "onDestroyPlayer", "decoderType", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "Lru/yandex/video/m3/player/impl/tracking/data/SimpleDecoderEventData;", "onDecoderReleased", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/SimpleDecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;", "fallbackData", "onVideoDecoderFallback", "(Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;)V", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "onAdPodStart", "onAdPodEnd", "Lru/yandex/video/m3/player/AdException;", "adException", "onAdError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/AdException;Z)V", "onAdSkipped", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "eventName", "onEvent", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Ljava/lang/String;)V", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "quality", "onLoadCanceled", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;Lru/yandex/video/m3/player/tracking/LoadError;)V", "className", "onNetPerfDisabled", "Lru/yandex/video/m3/player/report/DebugReport;", "debugReport", "onDebugReport", "(Lru/yandex/video/m3/player/report/DebugReport;)V", "Lkotlin/Function0;", "lazyDebugReport", "onMaybeDebugReport", "(Lru/yandex/video/m3/player/PlaybackException;Lsls;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EventTracker {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void onError$default(EventTracker eventTracker, PlayerState playerState, Throwable th, boolean z, DefaultEventData defaultEventData, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: onError");
            return;
        }
        if ((i & 8) != 0) {
            defaultEventData = null;
        }
        eventTracker.onError(playerState, th, z, defaultEventData);
    }

    void on10SecWatched(PlayerState playerState);

    void on20SecWatched(PlayerState playerState);

    void on30SecHeartbeat(PlayerState playerState);

    void on4SecWatched(PlayerState playerState);

    void onAdConfigSet(AdConfig adConfig);

    void onAdEnd(PlayerState playerState);

    void onAdError(PlayerState playerState, AdException adException, boolean sendAvailableDecoders);

    void onAdPodEnd(PlayerState playerState);

    void onAdPodStart(PlayerState playerState, Ad ad);

    void onAdSkipped(PlayerState playerState);

    void onAdStart(PlayerState playerState, Ad ad);

    void onAudioTrackChanged(AudioTrackData newTrackData, AudioTrackData oldTrackData);

    void onCanPlay(FirstPlaybackInfo firstPlaybackInfo);

    void onCreatePlayer(AbConfig abConfig);

    void onDebugReport(DebugReport debugReport);

    void onDecoderDiscarded(TrackType decoderType, DecoderEventData eventData);

    void onDecoderInitialized(TrackType decoderType, DecoderEventData eventData);

    void onDecoderReleased(TrackType decoderType, SimpleDecoderEventData eventData);

    void onDecoderReused(TrackType decoderType, DecoderEventData eventData);

    void onDestroyPlayer(PlayerState finalPlayerState);

    void onEnd(PlayerState playerState);

    void onError(PlayerState playerState, Throwable throwable, boolean sendAvailableDecoders, DefaultEventData eventData);

    void onEvent(PlayerState playerState, String eventName);

    void onFatalError(PlayerState playerState, PlaybackException playbackException, DefaultEventData eventData);

    void onLoadCanceled(PlayerState playerState, TrackType trackType, Integer quality);

    void onLoadCanceled(LoadCanceled loadCanceled);

    void onLoadError(PlayerState playerState, LoadError loadError);

    void onLoadSource();

    void onMaybeDebugReport(PlaybackException playbackException, sls lazyDebugReport);

    void onNetPerfDisabled(PlayerState playerState, String className);

    void onPlayerAlive(PlayerState currentPlayerState, List<PlayerAliveState> playerStates, PlaybackOptions playbackOptions);

    void onPreparingWithAdConfig(AdConfig adConfig);

    void onRecoverStreamError(PlaybackException playbackException, RecoverDetails recoverDetails);

    void onRepeat(PlayerState playerState);

    void onSeek(long newPositionMs, long oldPositionMs);

    void onSetSource();

    void onStalled(PlayerState playerState, StalledState stalledState);

    void onStalledEnd(PlayerState playerState, StalledState stalledState);

    void onStart(PlayerState playerState, Map<TrackType, String> initializedDecoders);

    void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo);

    void onStop(boolean keepDecoders);

    void onSubtitleTrackChanged(SubtitleTrackData newTrackData, SubtitleTrackData oldTrackData);

    void onVideoDecoderFallback(DecoderFallbackData fallbackData);

    void onVideoTrackChanged(VideoTrackData newTrackData, VideoTrackData oldTrackData);
}
