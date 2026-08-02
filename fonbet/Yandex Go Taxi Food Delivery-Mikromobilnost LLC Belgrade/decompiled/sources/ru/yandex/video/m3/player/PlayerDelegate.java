package ru.yandex.video.m3.player;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h42;
import defpackage.jxi;
import defpackage.kju0;
import defpackage.oyr;
import defpackage.tls;
import defpackage.w511;
import defpackage.w820;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.DelegatePlaybackParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.ad.AdsLoaderHolder;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.provider.ManifestVideoTrackNameProvider;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 r*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003rstJ\u001d\u0010\u0005\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H&¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u001cH&¢\u0006\u0004\b \u0010\u001eJ\u0011\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H&¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b.\u0010-J\u0019\u00100\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/H&¢\u0006\u0004\b0\u00101J+\u00109\u001a\u0002082\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\n\b\u0002\u00107\u001a\u0004\u0018\u000106H&¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000bH&¢\u0006\u0004\b;\u0010\u000fJ\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020<H&¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0011H&¢\u0006\u0004\bB\u0010(J\u0017\u0010D\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u0011H&¢\u0006\u0004\bD\u0010\u0014J\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u0011H&¢\u0006\u0004\bF\u0010\u0014J\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020<H&¢\u0006\u0004\bH\u0010?J\u000f\u0010I\u001a\u00020<H&¢\u0006\u0004\bI\u0010AJ\u000f\u0010J\u001a\u00020\u001cH&¢\u0006\u0004\bJ\u0010\u001eJ\u000f\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020NH&¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\b\u0012\u0004\u0012\u00020W0VH&¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH&¢\u0006\u0004\b[\u0010\\J\u0011\u0010^\u001a\u0004\u0018\u00010]H&¢\u0006\u0004\b^\u0010_J\u0011\u0010`\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH'¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020eH&¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020eH&¢\u0006\u0004\bi\u0010jJ\u0011\u0010l\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u000bH\u0016¢\u0006\u0004\bn\u0010\u000fJ\u000f\u0010p\u001a\u00020oH&¢\u0006\u0004\bp\u0010q¨\u0006uÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerDelegate;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/YandexPlayer;", "player", "extractPlayer", "(Lru/yandex/video/m3/player/YandexPlayer;)Ljava/lang/Object;", "Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "playbackParameters", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "prepareParameters", "Lzy11;", "prepare", "(Lru/yandex/video/m3/data/DelegatePlaybackParameters;Lru/yandex/video/m3/data/DelegatePrepareParams;)V", "play", "()V", "pause", "", "keepDecoders", "stop", "(Z)V", "Lru/yandex/video/m3/player/PlayerDelegate$Position;", "position", "seekTo", "(Lru/yandex/video/m3/player/PlayerDelegate$Position;)V", "getPosition", "()Lru/yandex/video/m3/player/PlayerDelegate$Position;", "getBufferedPosition", "", "getDuration", "()J", "getLiveEdgePosition", "getTimelineLeftEdge", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "isPlaying", "()Z", "isPlayingAd", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observer", "addObserver", "(Lru/yandex/video/m3/player/PlayerDelegate$Observer;)V", "removeObserver", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/player/drm/PrepareDrm;)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "trackNameProvider", "Lru/yandex/video/m3/player/tracks/Track;", "getTrack", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;)Lru/yandex/video/m3/player/tracks/Track;", "release", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "isMuted", "muted", "setMuted", "handleAudioFocus", "setHandleAudioFocus", "speed", "setPlaybackSpeed", "getPlaybackSpeed", "getLiveOffset", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "getStartCacheInfo", "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "", "videoSessionId", "setVideoSessionId", "(Ljava/lang/String;)V", "", "sourceIndex", "setSourceIndex", "(I)V", "", "Lru/yandex/video/m3/data/Ad;", "getAdsList", "()Ljava/util/List;", "Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "getLoadControl", "()Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getAdsLoaderHolder", "()Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getExoLiveOffset", "()Ljava/lang/Long;", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "setRepeatMode", "(Lru/yandex/video/m3/player/RepeatMode;)V", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "getManifestVideoTrackNameProvider", "()Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "allowInitCodec", "Lru/yandex/video/m3/data/PlaybackViewState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "Companion", "Observer", "Position", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerDelegate<H> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/PlayerDelegate$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/PlayerDelegate$Position$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/PlayerDelegate$Position;", "Position", "(Ltls;)Lru/yandex/video/m3/player/PlayerDelegate$Position;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Position Position$default(Companion companion, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.PlayerDelegate$Companion$Position$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((PlayerDelegate.Position.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(PlayerDelegate.Position.Builder builder) {
                    }
                };
            }
            return companion.Position(tlsVar);
        }

        public final /* synthetic */ Position Position(tls builderAction) {
            Position.Builder builder = new Position.Builder();
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <H> void allowInitCodec(PlayerDelegate<H> playerDelegate) {
            PlayerDelegate.super.allowInitCodec();
        }

        @Deprecated
        public static <H> ManifestVideoTrackNameProvider getManifestVideoTrackNameProvider(PlayerDelegate<H> playerDelegate) {
            return PlayerDelegate.super.getManifestVideoTrackNameProvider();
        }

        @Deprecated
        public static <H> void setSourceIndex(PlayerDelegate<H> playerDelegate, int i) {
            PlayerDelegate.super.setSourceIndex(i);
        }
    }

    static /* synthetic */ Track getTrack$default(PlayerDelegate playerDelegate, TrackType trackType, ResourceProvider resourceProvider, PlayerTrackNameProvider playerTrackNameProvider, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: getTrack");
            return null;
        }
        if ((i & 4) != 0) {
            playerTrackNameProvider = null;
        }
        return playerDelegate.getTrack(trackType, resourceProvider, playerTrackNameProvider);
    }

    void addObserver(Observer observer);

    default void allowInitCodec() {
    }

    H extractPlayer(YandexPlayer<H> player);

    List<Ad> getAdsList();

    AdsLoaderHolder getAdsLoaderHolder();

    Position getBufferedPosition();

    long getDuration();

    Long getExoLiveOffset();

    Position getLiveEdgePosition();

    long getLiveOffset();

    DependentLifecycleLoadControl getLoadControl();

    default ManifestVideoTrackNameProvider getManifestVideoTrackNameProvider() {
        return null;
    }

    float getPlaybackSpeed();

    @jxi
    PlaybackStats getPlaybackStats();

    PlaybackViewState getPlaybackViewState();

    Position getPosition();

    RepeatMode getRepeatMode();

    StartFromCacheInfo getStartCacheInfo();

    StreamType getStreamType();

    long getTimelineLeftEdge();

    Track getTrack(TrackType trackType, ResourceProvider resourceProvider, PlayerTrackNameProvider trackNameProvider);

    VideoType getVideoType();

    float getVolume();

    boolean isMuted();

    boolean isPlaying();

    boolean isPlayingAd();

    void pause();

    void play();

    void prepare(DelegatePlaybackParameters playbackParameters, DelegatePrepareParams prepareParameters);

    void prepareDrm(PrepareDrm prepareDrm);

    void release();

    void removeObserver(Observer observer);

    void seekTo(Position position);

    void setHandleAudioFocus(boolean handleAudioFocus);

    void setMuted(boolean muted);

    void setPlaybackSpeed(float speed);

    void setRepeatMode(RepeatMode repeatMode);

    default void setSourceIndex(int sourceIndex) {
    }

    void setVideoSessionId(String videoSessionId);

    void setVolume(float volume);

    void stop(boolean keepDecoders);

    @Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0014J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010\nJ\u0017\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010\nJ'\u00102\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u00103J)\u00108\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020.2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bA\u0010=J!\u0010F\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ!\u0010H\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bH\u0010GJ\u001f\u0010J\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u0010I\u001a\u00020.H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0007H\u0016¢\u0006\u0004\bM\u0010\nJ'\u0010Q\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u0007H\u0016¢\u0006\u0004\bQ\u0010RJ#\u0010U\u001a\u00020\u00022\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00070SH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00022\u0006\u0010W\u001a\u00020&H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020&H\u0016¢\u0006\u0004\b[\u0010YJ\u0017\u0010^\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020\u00022\u0006\u0010`\u001a\u00020.2\u0006\u0010a\u001a\u00020&H\u0016¢\u0006\u0004\bb\u0010cJ#\u0010e\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u0001042\b\u0010d\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010e\u001a\u00020\u00022\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\be\u0010iJ\u0017\u0010l\u001a\u00020\u00022\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00022\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0002H\u0016¢\u0006\u0004\br\u0010\u0004J\u001f\u0010t\u001a\u00020\u00022\u0006\u0010o\u001a\u00020n2\u0006\u0010s\u001a\u00020\u001bH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u0002H\u0016¢\u0006\u0004\bv\u0010\u0004J\u001d\u0010y\u001a\u00020\u00022\f\u0010x\u001a\b\u0012\u0004\u0012\u00020n0wH\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020{H\u0016¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020\u0002H\u0016¢\u0006\u0004\b~\u0010\u0004J\u001d\u0010\u0081\u0001\u001a\u00020\u00022\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010\u0083\u0001\u001a\u00020\u00022\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007fH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u00022\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0005\b\u0084\u0001\u0010qJ&\u0010\u0089\u0001\u001a\u00020\u00022\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J$\u0010\u008d\u0001\u001a\u00020\u00022\u0007\u0010\u008b\u0001\u001a\u00020&2\u0007\u0010\u008c\u0001\u001a\u00020.H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\u00022\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001c\u0010\u0095\u0001\u001a\u00020\u00022\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0002H\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0004J\u001c\u0010\u009a\u0001\u001a\u00020\u00022\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001b\u0010\u009d\u0001\u001a\u00020\u00022\u0007\u0010\u009c\u0001\u001a\u00020\u001bH\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J*\u0010£\u0001\u001a\u00020\u00022\n\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J%\u0010¦\u0001\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020\u0002H\u0016¢\u0006\u0005\b¨\u0001\u0010\u0004J\u001b\u0010ª\u0001\u001a\u00020\u00022\u0007\u0010©\u0001\u001a\u00020\u001bH\u0016¢\u0006\u0006\bª\u0001\u0010\u009e\u0001¨\u0006«\u0001À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "", "Lzy11;", "onFirstFrame", "()V", "onPausePlayback", "onResumePlayback", "", "position", "onPlaybackProgress", "(J)V", "bufferSizeMs", "onBufferSizeChanged", "onBufferingStart", "onBufferingEnd", "onTracksChanged", "onTracksSelected", "newPosition", "oldPosition", "onSeek", "(JJ)V", "Lru/yandex/video/m3/player/PlaybackException;", Constants.KEY_EXCEPTION, "onError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onNonFatalError", "onPlaybackEnded", "", "width", "height", "onSurfaceSizeChanged", "(II)V", "onVideoSizeChanged", "chunkLengthMs", "loadTime", "onDataLoaded", "", "speed", "", "isUserAction", "onPlaybackSpeedChanged", "(FZ)V", "duration", "onDurationChanged", "timelineLeftEdgeMs", "onTimelineLeftEdgeChanged", "", "decoderName", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Ljava/lang/String;JJ)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "onVideoDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "onVideoDecoderReleased", "(Ljava/lang/String;)V", "onAudioDecoderReleased", "onAudioDecoderEnabled", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "logMessage", "onNoSupportedTracksForRenderer", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;)V", "bandwidthEstimation", "onBandwidthEstimation", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "", "estimates", "onInitialBandwidthEstimatesAcquired", "(Ljava/util/Map;)V", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "(Z)V", "keepDecoders", "onStop", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "url", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "quality", "onLoadCanceled", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "", "adList", "onAdListChanged", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/AdException;", "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdSkipped", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "onAdSkipAvailable", "Lh42;", "eventTime", "Lw820;", kju0.j, "onMetadata", "(Lh42;Lw820;)V", BackendConfig.Restrictions.ENABLED, "className", "onNetPerfStatus", "(ZLjava/lang/String;)V", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "onRepeatModeChanged", "(Lru/yandex/video/m3/player/RepeatMode;)V", "onRepeat", "Lru/yandex/video/m3/data/DrmType;", "drmType", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "count", "onVideoFramesDropped", "(I)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "bytes", "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "onDrmKeysLoaded", "bitrate", "onVideoChunkLoaded", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Observer {
        default void onAdConfigSet(AdConfig adConfig) {
        }

        default void onAdEnd() {
        }

        default void onAdError(AdException exception) {
        }

        default void onAdListChanged(List<Ad> adList) {
        }

        default void onAdMetadata(AdMetadata adMetadata) {
        }

        default void onAdPodEnd() {
        }

        default void onAdPodStart(Ad ad, int index) {
        }

        default void onAdSkipAvailable(Ad ad) {
        }

        default void onAdSkipped() {
        }

        default void onAdStart(Ad ad) {
        }

        default void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
        }

        default void onAudioDecoderReleased(String decoderName) {
        }

        default void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        }

        default void onBandwidthEstimation(long bandwidthEstimation) {
        }

        default void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        }

        default void onBufferSizeChanged(long bufferSizeMs) {
        }

        default void onBufferingEnd() {
        }

        default void onBufferingStart() {
        }

        default void onBytesLoaded(long bytes, TrackType trackType) {
        }

        default void onDataLoaded(long chunkLengthMs, long loadTime) {
        }

        default void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
        }

        default void onDrmKeysLoaded() {
        }

        default void onDrmSessionAcquired(DrmType drmType) {
        }

        default void onDurationChanged(long duration) {
        }

        default void onError(PlaybackException exception) {
        }

        default void onFirstFrame() {
        }

        default void onInitialBandwidthEstimatesAcquired(Map<String, Long> estimates) {
        }

        default void onLoadCanceled(LoadCanceled loadCanceled) {
        }

        default void onLoadCanceled(TrackType trackType, Integer quality) {
        }

        default void onLoadError(LoadError loadError) {
        }

        default void onMetadata(h42 eventTime, w820 metadata) {
        }

        default void onNetPerfStatus(boolean enabled, String className) {
        }

        default void onNewMediaItem(String url, boolean autoplay) {
        }

        default void onNoSupportedTracksForRenderer(TrackType trackType, String logMessage) {
        }

        default void onNonFatalError(PlaybackException exception) {
        }

        default void onPausePlayback() {
        }

        default void onPlaybackEnded() {
        }

        default void onPlaybackProgress(long position) {
        }

        default void onPlaybackSpeedChanged(float speed, boolean isUserAction) {
        }

        default void onPreparingWithAdConfig(AdConfig adConfig) {
        }

        default void onRepeat() {
        }

        default void onRepeatModeChanged(RepeatMode repeatMode) {
        }

        default void onResumePlayback() {
        }

        default void onSeek(long newPosition, long oldPosition) {
        }

        default void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo) {
        }

        default void onStop(boolean keepDecoders) {
        }

        default void onSurfaceSizeChanged(int width, int height) {
        }

        default void onTimelineLeftEdgeChanged(long timelineLeftEdgeMs) {
        }

        default void onTracksChanged() {
        }

        default void onTracksSelected() {
        }

        default void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
        }

        default void onVideoChunkLoaded(int bitrate) {
        }

        default void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
        }

        default void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        }

        default void onVideoDecoderReleased(String decoderName) {
        }

        default void onVideoFramesDropped(int count) {
        }

        default void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        }

        default void onVideoSizeChanged(int width, int height) {
        }

        default void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void onAdConfigSet(Observer observer, AdConfig adConfig) {
                Observer.super.onAdConfigSet(adConfig);
            }

            @Deprecated
            public static void onAdEnd(Observer observer) {
                Observer.super.onAdEnd();
            }

            @Deprecated
            public static void onAdError(Observer observer, AdException adException) {
                Observer.super.onAdError(adException);
            }

            @Deprecated
            public static void onAdListChanged(Observer observer, List<Ad> list) {
                Observer.super.onAdListChanged(list);
            }

            @Deprecated
            public static void onAdMetadata(Observer observer, AdMetadata adMetadata) {
                Observer.super.onAdMetadata(adMetadata);
            }

            @Deprecated
            public static void onAdPodEnd(Observer observer) {
                Observer.super.onAdPodEnd();
            }

            @Deprecated
            public static void onAdPodStart(Observer observer, Ad ad, int i) {
                Observer.super.onAdPodStart(ad, i);
            }

            @Deprecated
            public static void onAdSkipAvailable(Observer observer, Ad ad) {
                Observer.super.onAdSkipAvailable(ad);
            }

            @Deprecated
            public static void onAdSkipped(Observer observer) {
                Observer.super.onAdSkipped();
            }

            @Deprecated
            public static void onAdStart(Observer observer, Ad ad) {
                Observer.super.onAdStart(ad);
            }

            @Deprecated
            public static void onAudioDecoderEnabled(Observer observer, DecoderCounter decoderCounter) {
                Observer.super.onAudioDecoderEnabled(decoderCounter);
            }

            @Deprecated
            public static void onAudioDecoderReleased(Observer observer, String str) {
                Observer.super.onAudioDecoderReleased(str);
            }

            @Deprecated
            public static void onAudioInputFormatChanged(Observer observer, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
                Observer.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
            }

            @Deprecated
            public static void onBandwidthEstimation(Observer observer, long j) {
                Observer.super.onBandwidthEstimation(j);
            }

            @Deprecated
            public static void onBandwidthSample(Observer observer, int i, long j, long j2) {
                Observer.super.onBandwidthSample(i, j, j2);
            }

            @Deprecated
            public static void onBufferSizeChanged(Observer observer, long j) {
                Observer.super.onBufferSizeChanged(j);
            }

            @Deprecated
            public static void onBufferingEnd(Observer observer) {
                Observer.super.onBufferingEnd();
            }

            @Deprecated
            public static void onBufferingStart(Observer observer) {
                Observer.super.onBufferingStart();
            }

            @Deprecated
            public static void onBytesLoaded(Observer observer, long j, TrackType trackType) {
                Observer.super.onBytesLoaded(j, trackType);
            }

            @Deprecated
            public static void onDataLoaded(Observer observer, long j, long j2) {
                Observer.super.onDataLoaded(j, j2);
            }

            @Deprecated
            public static void onDecoderInitialized(Observer observer, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
                Observer.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
            }

            @Deprecated
            public static void onDrmKeysLoaded(Observer observer) {
                Observer.super.onDrmKeysLoaded();
            }

            @Deprecated
            public static void onDrmSessionAcquired(Observer observer, DrmType drmType) {
                Observer.super.onDrmSessionAcquired(drmType);
            }

            @Deprecated
            public static void onDurationChanged(Observer observer, long j) {
                Observer.super.onDurationChanged(j);
            }

            @Deprecated
            public static void onError(Observer observer, PlaybackException playbackException) {
                Observer.super.onError(playbackException);
            }

            @Deprecated
            public static void onFirstFrame(Observer observer) {
                Observer.super.onFirstFrame();
            }

            @Deprecated
            public static void onInitialBandwidthEstimatesAcquired(Observer observer, Map<String, Long> map) {
                Observer.super.onInitialBandwidthEstimatesAcquired(map);
            }

            @Deprecated
            public static void onLoadCanceled(Observer observer, TrackType trackType, Integer num) {
                Observer.super.onLoadCanceled(trackType, num);
            }

            @Deprecated
            public static void onLoadError(Observer observer, LoadError loadError) {
                Observer.super.onLoadError(loadError);
            }

            @Deprecated
            public static void onMetadata(Observer observer, h42 h42Var, w820 w820Var) {
                Observer.super.onMetadata(h42Var, w820Var);
            }

            @Deprecated
            public static void onNetPerfStatus(Observer observer, boolean z, String str) {
                Observer.super.onNetPerfStatus(z, str);
            }

            @Deprecated
            public static void onNewMediaItem(Observer observer, String str, boolean z) {
                Observer.super.onNewMediaItem(str, z);
            }

            @Deprecated
            public static void onNoSupportedTracksForRenderer(Observer observer, TrackType trackType, String str) {
                Observer.super.onNoSupportedTracksForRenderer(trackType, str);
            }

            @Deprecated
            public static void onNonFatalError(Observer observer, PlaybackException playbackException) {
                Observer.super.onNonFatalError(playbackException);
            }

            @Deprecated
            public static void onPausePlayback(Observer observer) {
                Observer.super.onPausePlayback();
            }

            @Deprecated
            public static void onPlaybackEnded(Observer observer) {
                Observer.super.onPlaybackEnded();
            }

            @Deprecated
            public static void onPlaybackProgress(Observer observer, long j) {
                Observer.super.onPlaybackProgress(j);
            }

            @Deprecated
            public static void onPlaybackSpeedChanged(Observer observer, float f, boolean z) {
                Observer.super.onPlaybackSpeedChanged(f, z);
            }

            @Deprecated
            public static void onPreparingWithAdConfig(Observer observer, AdConfig adConfig) {
                Observer.super.onPreparingWithAdConfig(adConfig);
            }

            @Deprecated
            public static void onRepeat(Observer observer) {
                Observer.super.onRepeat();
            }

            @Deprecated
            public static void onRepeatModeChanged(Observer observer, RepeatMode repeatMode) {
                Observer.super.onRepeatModeChanged(repeatMode);
            }

            @Deprecated
            public static void onResumePlayback(Observer observer) {
                Observer.super.onResumePlayback();
            }

            @Deprecated
            public static void onSeek(Observer observer, long j, long j2) {
                Observer.super.onSeek(j, j2);
            }

            @Deprecated
            public static void onStartFromCacheInfoReady(Observer observer, StartFromCacheInfo startFromCacheInfo) {
                Observer.super.onStartFromCacheInfoReady(startFromCacheInfo);
            }

            @Deprecated
            public static void onStop(Observer observer, boolean z) {
                Observer.super.onStop(z);
            }

            @Deprecated
            public static void onSurfaceSizeChanged(Observer observer, int i, int i2) {
                Observer.super.onSurfaceSizeChanged(i, i2);
            }

            @Deprecated
            public static void onTimelineLeftEdgeChanged(Observer observer, long j) {
                Observer.super.onTimelineLeftEdgeChanged(j);
            }

            @Deprecated
            public static void onTracksChanged(Observer observer) {
                Observer.super.onTracksChanged();
            }

            @Deprecated
            public static void onTracksSelected(Observer observer) {
                Observer.super.onTracksSelected();
            }

            @Deprecated
            public static void onVideoAndStreamTypeChanged(Observer observer, VideoType videoType, StreamType streamType) {
                Observer.super.onVideoAndStreamTypeChanged(videoType, streamType);
            }

            @Deprecated
            public static void onVideoChunkLoaded(Observer observer, int i) {
                Observer.super.onVideoChunkLoaded(i);
            }

            @Deprecated
            public static void onVideoDecoderEnabled(Observer observer, DecoderCounter decoderCounter) {
                Observer.super.onVideoDecoderEnabled(decoderCounter);
            }

            @Deprecated
            public static void onVideoDecoderInitialized(Observer observer, String str, long j, long j2) {
                Observer.super.onVideoDecoderInitialized(str, j, j2);
            }

            @Deprecated
            public static void onVideoDecoderReleased(Observer observer, String str) {
                Observer.super.onVideoDecoderReleased(str);
            }

            @Deprecated
            public static void onVideoFramesDropped(Observer observer, int i) {
                Observer.super.onVideoFramesDropped(i);
            }

            @Deprecated
            public static void onVideoInputFormatChanged(Observer observer, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
                Observer.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
            }

            @Deprecated
            public static void onVideoSizeChanged(Observer observer, int i, int i2) {
                Observer.super.onVideoSizeChanged(i, i2);
            }

            @Deprecated
            public static void onWillPlayWhenReadyChanged(Observer observer, boolean z) {
                Observer.super.onWillPlayWhenReadyChanged(z);
            }

            @Deprecated
            public static void onLoadCanceled(Observer observer, LoadCanceled loadCanceled) {
                Observer.super.onLoadCanceled(loadCanceled);
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/PlayerDelegate$Position;", "Ljava/io/Serializable;", "", "currentPosition", "", "currentWindowIndex", "<init>", "(JI)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/PlayerDelegate$Position$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/PlayerDelegate$Position;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getCurrentPosition", "()J", CA20Status.STATUS_USER_I, "getCurrentWindowIndex", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Position implements Serializable {
        public static final int $stable = 0;
        private final long currentPosition;
        private final int currentWindowIndex;

        private Position(long j, int i) {
            this.currentPosition = j;
            this.currentWindowIndex = i;
        }

        public static /* synthetic */ Position copy$default(Position position, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.PlayerDelegate$Position$copy$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((PlayerDelegate.Position.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(PlayerDelegate.Position.Builder builder) {
                    }
                };
            }
            return position.copy(tlsVar);
        }

        public final Position copy(tls builderAction) {
            Builder builder = new Builder(this);
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Position.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Position position = (Position) other;
            return this.currentPosition == position.currentPosition && this.currentWindowIndex == position.currentWindowIndex;
        }

        public final long getCurrentPosition() {
            return this.currentPosition;
        }

        public final int getCurrentWindowIndex() {
            return this.currentWindowIndex;
        }

        public int hashCode() {
            return (Long.hashCode(this.currentPosition) * 31) + this.currentWindowIndex;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Position(currentPosition=");
            sb.append(this.currentPosition);
            sb.append(", currentWindowIndex=");
            return oyr.s(sb, this.currentWindowIndex, ')');
        }

        public /* synthetic */ Position(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i);
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/PlayerDelegate$Position$Builder;", "", "position", "Lru/yandex/video/m3/player/PlayerDelegate$Position;", "(Lru/yandex/video/m3/player/PlayerDelegate$Position;)V", "()V", "currentPosition", "", "getCurrentPosition", "()Ljava/lang/Long;", "setCurrentPosition", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "currentWindowIndex", "", "getCurrentWindowIndex", "()Ljava/lang/Integer;", "setCurrentWindowIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Long currentPosition;
            private Integer currentWindowIndex;

            public Builder(Position position) {
                this();
                this.currentPosition = Long.valueOf(position.getCurrentPosition());
                this.currentWindowIndex = Integer.valueOf(position.getCurrentWindowIndex());
            }

            public final Position build$video_player_internalRelease() {
                Long l = this.currentPosition;
                long longValue = l != null ? l.longValue() : 0L;
                Integer num = this.currentWindowIndex;
                return new Position(longValue, num != null ? num.intValue() : 0, null);
            }

            public final Long getCurrentPosition() {
                return this.currentPosition;
            }

            public final Integer getCurrentWindowIndex() {
                return this.currentWindowIndex;
            }

            public final void setCurrentPosition(Long l) {
                this.currentPosition = l;
            }

            public final void setCurrentWindowIndex(Integer num) {
                this.currentWindowIndex = num;
            }

            public Builder() {
            }
        }
    }
}
