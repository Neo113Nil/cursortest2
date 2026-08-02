package ru.yandex.video.m3.telemetry.helpers;

import defpackage.fe10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackParametersKt;
import ru.yandex.video.m3.player.impl.listeners.InternalPlayerEventListener;
import ru.yandex.video.m3.telemetry.player.StandaloneTelemetryPlayerDelegateObserver;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/telemetry/helpers/StandaloneTelemetryHelper;", "", "Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "playbackStatsProvider", "Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;", "playerEventListener", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "observer", "<init>", "(Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;)V", "Lfe10;", "mediaItem", "", "startPositionMs", "Lzy11;", "setMediaSource", "(Lfe10;Ljava/lang/Long;)V", "", "url", "loadSource", "(Ljava/lang/String;)V", "stop", "()V", "Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandaloneTelemetryHelper {
    public static final int $stable = 8;
    private final StandaloneTelemetryPlayerDelegateObserver observer;
    private final PlaybackStatsProvider playbackStatsProvider;
    private final InternalPlayerEventListener playerEventListener;

    public StandaloneTelemetryHelper(PlaybackStatsProvider playbackStatsProvider, InternalPlayerEventListener internalPlayerEventListener, StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
        this.playbackStatsProvider = playbackStatsProvider;
        this.playerEventListener = internalPlayerEventListener;
        this.observer = standaloneTelemetryPlayerDelegateObserver;
    }

    public final void loadSource(String url) {
        this.observer.onLoadSource(url);
    }

    public final void setMediaSource(fe10 mediaItem, final Long startPositionMs) {
        this.playerEventListener.resetPlayingState();
        this.observer.onSetMediaSource(mediaItem, PlaybackParametersKt.PlaybackParameters(this.playbackStatsProvider.isPlayerPrepared$video_player_internalRelease() && this.playbackStatsProvider.getPlayWhenReady$video_player_internalRelease(), new tls() { // from class: ru.yandex.video.m3.telemetry.helpers.StandaloneTelemetryHelper$setMediaSource$1
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
                builder.setStartPosition(startPositionMs);
            }
        }));
    }

    public final void stop() {
        this.observer.onStop(false);
    }
}
