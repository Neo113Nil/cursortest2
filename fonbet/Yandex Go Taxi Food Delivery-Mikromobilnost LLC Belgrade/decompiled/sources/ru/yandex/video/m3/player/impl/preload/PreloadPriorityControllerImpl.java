package ru.yandex.video.m3.player.impl.preload;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.rds0;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;
import ru.yandex.video.m3.preload.PreloadPrioritySettings;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/yandex/video/m3/player/impl/preload/PreloadPriorityControllerImpl;", "Lru/yandex/video/m3/player/impl/preload/PreloadPriorityController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "settings", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/preload/PreloadPrioritySettings;)V", "Lrds0;", "(Lrds0;Lru/yandex/video/m3/preload/PreloadPrioritySettings;)V", "Lzy11;", "videoNotPlay", "()V", "removePausePriority", "addPausePriority", "", "currentBufferSizeMs", "checkBufferDelta", "(J)V", "onResumePlayback", "release", "onPausePlayback", "", "keepDecoders", "onStop", "(Z)V", "onPlaybackEnded", "bufferSizeMs", "onBufferSizeChanged", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "pauseAdded", "Z", "isPlaying", "previousBufferSizeMs", "Ljava/lang/Long;", "", "lock", "Ljava/lang/Object;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadPriorityControllerImpl implements PreloadPriorityController {
    private static final int PRIORITY_PRELOAD_PAUSE = -3999;
    private static final String TAG = "PreloadPriorityControllerImpl";
    private final ExoPlayer exoPlayer;
    private volatile boolean isPlaying;
    private final Object lock;
    private final TimberPlayerLogger logger;
    private boolean pauseAdded;
    private volatile Long previousBufferSizeMs;
    private final PreloadPrioritySettings settings;
    private volatile boolean willPlayWhenReady;
    public static final int $stable = 8;

    public PreloadPriorityControllerImpl(ExoPlayer exoPlayer, PreloadPrioritySettings preloadPrioritySettings) {
        this.exoPlayer = exoPlayer;
        this.settings = preloadPrioritySettings;
        this.lock = new Object();
        this.logger = new TimberPlayerLogger();
    }

    private final void addPausePriority() {
        synchronized (this.lock) {
            if (!this.pauseAdded) {
                this.settings.getPreloadPriorityTaskManager().a(PRIORITY_PRELOAD_PAUSE);
                this.pauseAdded = true;
            }
        }
    }

    private final void checkBufferDelta(long currentBufferSizeMs) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "checkBufferDelta", null, new Object[0], 4, null);
        }
        Long l = this.previousBufferSizeMs;
        if (l != null) {
            long longValue = l.longValue();
            if ((longValue > currentBufferSizeMs || currentBufferSizeMs - longValue > this.settings.getDifferenceBetweenBufferSizeMs()) && longValue <= currentBufferSizeMs) {
                removePausePriority();
            } else {
                addPausePriority();
            }
        }
    }

    private final void removePausePriority() {
        synchronized (this.lock) {
            if (this.pauseAdded) {
                this.settings.getPreloadPriorityTaskManager().d(PRIORITY_PRELOAD_PAUSE);
                this.pauseAdded = false;
            }
        }
    }

    private final void videoNotPlay() {
        removePausePriority();
        this.isPlaying = false;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
    public void onBufferSizeChanged(long bufferSizeMs) {
        if (this.willPlayWhenReady && this.isPlaying) {
            if (this.exoPlayer.getBufferedPosition() == this.exoPlayer.getDuration()) {
                removePausePriority();
                return;
            }
            if (bufferSizeMs <= this.settings.getCriticalBufferSizeMs()) {
                addPausePriority();
            } else if (bufferSizeMs <= this.settings.getMinBufferSizeMsToWatchDifferenceBetweenBuffer()) {
                checkBufferDelta(bufferSizeMs);
            } else if (bufferSizeMs > this.settings.getMinBufferSizeMsToWatchDifferenceBetweenBuffer()) {
                removePausePriority();
            }
            this.previousBufferSizeMs = Long.valueOf(bufferSizeMs);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
    public void onPausePlayback() {
        videoNotPlay();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
    public void onPlaybackEnded() {
        videoNotPlay();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
    public void onResumePlayback() {
        this.isPlaying = true;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
    public void onStop(boolean keepDecoders) {
        videoNotPlay();
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegate.Observer
    public void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
        if (!this.isPlaying && willPlayWhenReady && this.exoPlayer.getPlaybackState() == 2) {
            addPausePriority();
        }
        this.willPlayWhenReady = willPlayWhenReady;
    }

    @Override // ru.yandex.video.m3.player.impl.preload.PreloadPriorityController
    public void release() {
        videoNotPlay();
    }

    public PreloadPriorityControllerImpl(rds0 rds0Var, PreloadPrioritySettings preloadPrioritySettings) {
        throw null;
    }
}
