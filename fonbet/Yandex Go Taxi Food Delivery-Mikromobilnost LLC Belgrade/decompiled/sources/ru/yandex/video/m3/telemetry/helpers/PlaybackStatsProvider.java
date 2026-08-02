package ru.yandex.video.m3.telemetry.helpers;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.a9z0;
import defpackage.egg;
import defpackage.sls;
import defpackage.tls;
import defpackage.tw21;
import defpackage.yo90;
import defpackage.z8z0;
import defpackage.zy11;
import java.util.concurrent.Exchanger;
import kotlin.Metadata;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackStatsKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001cR\u0014\u0010.\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0014\u00100\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001c¨\u00061"}, d2 = {"Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "", "windowIndex", "Lz8z0;", "getWindowByIndex", "(I)Lz8z0;", "R", "Lkotlin/Function0;", "action", "runOnPlayerFront", "(Lsls;)Ljava/lang/Object;", "", "getPosition", "()J", "getBufferedPosition", "getLiveEdgePosition", "getTimelineLeftEdge", "getContentDuration", "", "getVolume", "()F", "", "isMuted", "()Z", "getPlaybackSpeed", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "getLiveOffset", "Landroidx/media3/exoplayer/ExoPlayer;", "Landroid/os/Looper;", "playerLooper", "Landroid/os/Looper;", "Landroid/os/Handler;", "playerHandler", "Landroid/os/Handler;", "tempWindow", "Lz8z0;", "isPlayerPrepared$video_player_internalRelease", "isPlayerPrepared", "getPlayWhenReady$video_player_internalRelease", "playWhenReady", "isPlaying$video_player_internalRelease", "isPlaying", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackStatsProvider {
    public static final int $stable = 8;
    private final ExoPlayer exoPlayer;
    private final Handler playerHandler;
    private final Looper playerLooper;
    private z8z0 tempWindow = new z8z0();

    public PlaybackStatsProvider(ExoPlayer exoPlayer) {
        this.exoPlayer = exoPlayer;
        this.playerLooper = exoPlayer.getApplicationLooper();
        this.playerHandler = new Handler(exoPlayer.getApplicationLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z8z0 getWindowByIndex(int windowIndex) {
        a9z0 currentTimeline = this.exoPlayer.getCurrentTimeline();
        if (currentTimeline.q()) {
            currentTimeline = null;
        }
        if (currentTimeline != null) {
            return currentTimeline.n(windowIndex, this.tempWindow, 0L);
        }
        return null;
    }

    private final <R> R runOnPlayerFront(sls action) {
        if (Looper.myLooper() == this.playerLooper) {
            return (R) action.invoke();
        }
        Exchanger exchanger = new Exchanger();
        this.playerHandler.postAtFrontOfQueue(new yo90(12, exchanger, action));
        return (R) exchanger.exchange(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnPlayerFront$lambda$1(Exchanger exchanger, sls slsVar) {
        exchanger.exchange(slsVar.invoke());
    }

    public final long getBufferedPosition() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getBufferedPosition$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Long.valueOf(Math.max(0L, exoPlayer.getBufferedPosition()));
            }
        })).longValue();
    }

    public final long getContentDuration() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getContentDuration$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                Long valueOf = Long.valueOf(exoPlayer.getDuration());
                if (valueOf.longValue() == -9223372036854775807L) {
                    valueOf = null;
                }
                return Long.valueOf(valueOf != null ? valueOf.longValue() : -1L);
            }
        })).longValue();
    }

    public final long getLiveEdgePosition() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getLiveEdgePosition$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                ExoPlayer exoPlayer;
                z8z0 windowByIndex;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                windowByIndex = PlaybackStatsProvider.this.getWindowByIndex(exoPlayer.getCurrentTimeline().c(false));
                return Long.valueOf((windowByIndex != null && windowByIndex.h && windowByIndex.g) ? tw21.l0(windowByIndex.k) : -1L);
            }
        })).longValue();
    }

    public final long getLiveOffset() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getLiveOffset$1
            @Override // defpackage.sls
            public final Long invoke() {
                return -9223372036854775807L;
            }
        })).longValue();
    }

    public final boolean getPlayWhenReady$video_player_internalRelease() {
        return ((Boolean) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$playWhenReady$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Boolean.valueOf(exoPlayer.getPlayWhenReady());
            }
        })).booleanValue();
    }

    public final float getPlaybackSpeed() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getPlaybackSpeed$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Float invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Float.valueOf(exoPlayer.getPlaybackParameters().a);
            }
        })).floatValue();
    }

    public final PlaybackStats getPlaybackStats() {
        return (PlaybackStats) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getPlaybackStats$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PlaybackStats invoke() {
                ExoPlayer exoPlayer;
                PlaybackStats PlaybackStats;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                if (exoPlayer.getPlaybackState() == 1) {
                    return null;
                }
                PlaybackStats = PlaybackStatsKt.PlaybackStats(PlaybackStatsProvider.this.getBufferedPosition(), PlaybackStatsProvider.this.getLiveOffset(), -9223372036854775807L, PlaybackStatsProvider.this.getLiveEdgePosition(), null, PlaybackStatsProvider.this.isPlaying$video_player_internalRelease(), PlaybackStatsProvider.this.getPosition(), null, PlaybackStatsProvider.this.getPlayWhenReady$video_player_internalRelease(), PlaybackStatsProvider.this.getContentDuration(), -1L, null, (r41 & 4096) != 0 ? new tls() { // from class: ru.yandex.video.m3.data.PlaybackStatsKt$PlaybackStats$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((PlaybackStats.Builder) obj);
                        return zy11.a;
                    }

                    public final void invoke(PlaybackStats.Builder builder) {
                    }
                } : null);
                return PlaybackStats;
            }
        });
    }

    public final long getPosition() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getPosition$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Long.valueOf(Math.max(0L, exoPlayer.getCurrentPosition()));
            }
        })).longValue();
    }

    public final long getTimelineLeftEdge() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getTimelineLeftEdge$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                ExoPlayer exoPlayer;
                ExoPlayer exoPlayer2;
                z8z0 windowByIndex;
                Long valueOf;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                Object currentManifest = exoPlayer.getCurrentManifest();
                if (currentManifest instanceof egg) {
                    valueOf = Long.valueOf(((egg) currentManifest).publishTimeMs);
                } else {
                    PlaybackStatsProvider playbackStatsProvider = PlaybackStatsProvider.this;
                    exoPlayer2 = playbackStatsProvider.exoPlayer;
                    windowByIndex = playbackStatsProvider.getWindowByIndex(exoPlayer2.getCurrentMediaItemIndex());
                    valueOf = windowByIndex != null ? Long.valueOf(windowByIndex.e) : null;
                }
                Long l = (valueOf == null || valueOf.longValue() != -9223372036854775807L) ? valueOf : null;
                return Long.valueOf(l != null ? l.longValue() : 0L);
            }
        })).longValue();
    }

    public final float getVolume() {
        return ((Number) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$getVolume$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Float invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Float.valueOf(exoPlayer.getVolume());
            }
        })).floatValue();
    }

    public final boolean isMuted() {
        return ((Boolean) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$isMuted$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Boolean.valueOf(exoPlayer.isDeviceMuted());
            }
        })).booleanValue();
    }

    public final boolean isPlayerPrepared$video_player_internalRelease() {
        return ((Boolean) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$isPlayerPrepared$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Boolean.valueOf(exoPlayer.getPlaybackState() != 1);
            }
        })).booleanValue();
    }

    public final boolean isPlaying$video_player_internalRelease() {
        return ((Boolean) runOnPlayerFront(new sls() { // from class: ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider$isPlaying$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = PlaybackStatsProvider.this.exoPlayer;
                return Boolean.valueOf(exoPlayer.isPlaying());
            }
        })).booleanValue();
    }
}
