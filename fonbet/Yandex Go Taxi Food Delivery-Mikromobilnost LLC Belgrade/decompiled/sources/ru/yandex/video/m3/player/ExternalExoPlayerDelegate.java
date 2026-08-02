package ru.yandex.video.m3.player;

import defpackage.jxi;
import defpackage.zxc0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.DelegatePlaybackParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.ad.AdsLoaderHolder;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.impl.ExoPlayerDelegate;
import ru.yandex.video.m3.player.provider.ManifestVideoTrackNameProvider;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010,H\u0097\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0010\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\b7\u00108J\u0012\u0010:\u001a\u0004\u0018\u000109H\u0096\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b<\u0010\u001eJ,\u0010D\u001a\u00020C2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010AH\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010FH\u0096\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020)H\u0096\u0001¢\u0006\u0004\bI\u0010+J\u0010\u0010K\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bM\u0010LJ\u0010\u0010N\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bN\u0010LJ\u0010\u0010O\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bO\u0010\rJ\u0010\u0010P\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bP\u0010\rJ\u0010\u0010Q\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bQ\u0010\rJ\u0018\u0010R\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bR\u0010\u000bJ\u0018\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\bT\u0010UJ\u0018\u0010W\u001a\u00020\t2\u0006\u0010V\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bW\u0010XJ\u0018\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bZ\u0010XJ\u0018\u0010\\\u001a\u00020\t2\u0006\u0010[\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b\\\u0010]J\u0018\u0010_\u001a\u00020\t2\u0006\u0010^\u001a\u000203H\u0096\u0001¢\u0006\u0004\b_\u0010`J\u0018\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020aH\u0096\u0001¢\u0006\u0004\bc\u0010dJ\u0018\u0010g\u001a\u00020\t2\u0006\u0010f\u001a\u00020eH\u0096\u0001¢\u0006\u0004\bg\u0010hJ\u0018\u0010j\u001a\u00020\t2\u0006\u0010i\u001a\u00020)H\u0096\u0001¢\u0006\u0004\bj\u0010]J\u0018\u0010l\u001a\u00020\t2\u0006\u0010k\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bl\u0010XJ!\u0010q\u001a\u00020\t2\u0006\u0010n\u001a\u00020m2\b\u0010p\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\bq\u0010rJ\u0019\u0010t\u001a\u00020\t2\b\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bt\u0010uR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010v¨\u0006w"}, d2 = {"Lru/yandex/video/m3/player/ExternalExoPlayerDelegate;", "Lru/yandex/video/m3/player/PlayerDelegate;", "Lzxc0;", "Lru/yandex/video/m3/player/impl/ExoPlayerDelegate;", "exoPlayerDelegate", "<init>", "(Lru/yandex/video/m3/player/impl/ExoPlayerDelegate;)V", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observer", "Lzy11;", "addObserver", "(Lru/yandex/video/m3/player/PlayerDelegate$Observer;)V", "allowInitCodec", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "extractPlayer", "(Lru/yandex/video/m3/player/YandexPlayer;)Lzxc0;", "", "Lru/yandex/video/m3/data/Ad;", "getAdsList", "()Ljava/util/List;", "Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getAdsLoaderHolder", "()Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "Lru/yandex/video/m3/player/PlayerDelegate$Position;", "getBufferedPosition", "()Lru/yandex/video/m3/player/PlayerDelegate$Position;", "", "getDuration", "()J", "getExoLiveOffset", "()Ljava/lang/Long;", "getLiveEdgePosition", "getLiveOffset", "Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "getLoadControl", "()Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "getManifestVideoTrackNameProvider", "()Lru/yandex/video/m3/player/provider/ManifestVideoTrackNameProvider;", "", "getPlaybackSpeed", "()F", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "Lru/yandex/video/m3/data/PlaybackViewState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "getPosition", "Lru/yandex/video/m3/player/RepeatMode;", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "getStartCacheInfo", "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "getTimelineLeftEdge", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "trackNameProvider", "Lru/yandex/video/m3/player/tracks/Track;", "getTrack", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;)Lru/yandex/video/m3/player/tracks/Track;", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "getVolume", "", "isMuted", "()Z", "isPlaying", "isPlayingAd", "pause", "play", "release", "removeObserver", "position", "seekTo", "(Lru/yandex/video/m3/player/PlayerDelegate$Position;)V", "handleAudioFocus", "setHandleAudioFocus", "(Z)V", "muted", "setMuted", "speed", "setPlaybackSpeed", "(F)V", "repeatMode", "setRepeatMode", "(Lru/yandex/video/m3/player/RepeatMode;)V", "", "sourceIndex", "setSourceIndex", "(I)V", "", "videoSessionId", "setVideoSessionId", "(Ljava/lang/String;)V", "volume", "setVolume", "keepDecoders", "stop", "Lru/yandex/video/m3/data/DelegatePlaybackParameters;", "playbackParameters", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "prepareParameters", "prepare", "(Lru/yandex/video/m3/data/DelegatePlaybackParameters;Lru/yandex/video/m3/data/DelegatePrepareParams;)V", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/player/drm/PrepareDrm;)V", "Lru/yandex/video/m3/player/impl/ExoPlayerDelegate;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalExoPlayerDelegate implements PlayerDelegate<zxc0> {
    public static final int $stable = 8;
    private final ExoPlayerDelegate exoPlayerDelegate;

    public ExternalExoPlayerDelegate(ExoPlayerDelegate exoPlayerDelegate) {
        this.exoPlayerDelegate = exoPlayerDelegate;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void addObserver(PlayerDelegate.Observer observer) {
        this.exoPlayerDelegate.addObserver(observer);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void allowInitCodec() {
        this.exoPlayerDelegate.allowInitCodec();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public zxc0 extractPlayer(YandexPlayer<zxc0> player) {
        return this.exoPlayerDelegate.extractPlayer(player);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public List<Ad> getAdsList() {
        return this.exoPlayerDelegate.getAdsList();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public AdsLoaderHolder getAdsLoaderHolder() {
        return this.exoPlayerDelegate.getAdsLoaderHolder();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlayerDelegate.Position getBufferedPosition() {
        return this.exoPlayerDelegate.getBufferedPosition();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public long getDuration() {
        return this.exoPlayerDelegate.getDuration();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public Long getExoLiveOffset() {
        return this.exoPlayerDelegate.getExoLiveOffset();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlayerDelegate.Position getLiveEdgePosition() {
        return this.exoPlayerDelegate.getLiveEdgePosition();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public long getLiveOffset() {
        return this.exoPlayerDelegate.getLiveOffset();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public DependentLifecycleLoadControl getLoadControl() {
        return this.exoPlayerDelegate.getLoadControl();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public ManifestVideoTrackNameProvider getManifestVideoTrackNameProvider() {
        return this.exoPlayerDelegate.getManifestVideoTrackNameProvider();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public float getPlaybackSpeed() {
        return this.exoPlayerDelegate.getPlaybackSpeed();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    @jxi
    public PlaybackStats getPlaybackStats() {
        return this.exoPlayerDelegate.getPlaybackStats();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlaybackViewState getPlaybackViewState() {
        return this.exoPlayerDelegate.getPlaybackViewState();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public PlayerDelegate.Position getPosition() {
        return this.exoPlayerDelegate.getPosition();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public RepeatMode getRepeatMode() {
        return this.exoPlayerDelegate.getRepeatMode();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public StartFromCacheInfo getStartCacheInfo() {
        return this.exoPlayerDelegate.getStartCacheInfo();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public StreamType getStreamType() {
        return this.exoPlayerDelegate.getStreamType();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public long getTimelineLeftEdge() {
        return this.exoPlayerDelegate.getTimelineLeftEdge();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public Track getTrack(TrackType trackType, ResourceProvider resourceProvider, PlayerTrackNameProvider trackNameProvider) {
        return this.exoPlayerDelegate.getTrack(trackType, resourceProvider, trackNameProvider);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public VideoType getVideoType() {
        return this.exoPlayerDelegate.getVideoType();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public float getVolume() {
        return this.exoPlayerDelegate.getVolume();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public boolean isMuted() {
        return this.exoPlayerDelegate.isMuted();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public boolean isPlaying() {
        return this.exoPlayerDelegate.isPlaying();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public boolean isPlayingAd() {
        return this.exoPlayerDelegate.isPlayingAd();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void pause() {
        this.exoPlayerDelegate.pause();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void play() {
        this.exoPlayerDelegate.play();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void prepare(DelegatePlaybackParameters playbackParameters, DelegatePrepareParams prepareParameters) {
        this.exoPlayerDelegate.getPlayerEventListener().resetPlayingState();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void prepareDrm(PrepareDrm prepareDrm) {
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void release() {
        this.exoPlayerDelegate.release();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void removeObserver(PlayerDelegate.Observer observer) {
        this.exoPlayerDelegate.removeObserver(observer);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void seekTo(PlayerDelegate.Position position) {
        this.exoPlayerDelegate.seekTo(position);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setHandleAudioFocus(boolean handleAudioFocus) {
        this.exoPlayerDelegate.setHandleAudioFocus(handleAudioFocus);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setMuted(boolean muted) {
        this.exoPlayerDelegate.setMuted(muted);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setPlaybackSpeed(float speed) {
        this.exoPlayerDelegate.setPlaybackSpeed(speed);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setRepeatMode(RepeatMode repeatMode) {
        this.exoPlayerDelegate.setRepeatMode(repeatMode);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setSourceIndex(int sourceIndex) {
        this.exoPlayerDelegate.setSourceIndex(sourceIndex);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setVideoSessionId(String videoSessionId) {
        this.exoPlayerDelegate.setVideoSessionId(videoSessionId);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void setVolume(float volume) {
        this.exoPlayerDelegate.setVolume(volume);
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate
    public void stop(boolean keepDecoders) {
        this.exoPlayerDelegate.stop(keepDecoders);
    }
}
