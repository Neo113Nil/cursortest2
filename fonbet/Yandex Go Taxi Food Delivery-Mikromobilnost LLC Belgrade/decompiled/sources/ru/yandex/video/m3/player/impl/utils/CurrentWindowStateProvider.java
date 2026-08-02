package ru.yandex.video.m3.player.impl.utils;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.fe10;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "", "lastObservedPosition", "J", "getLastObservedPosition", "()J", "setLastObservedPosition", "(J)V", "lastObservedDuration", "getLastObservedDuration", "setLastObservedDuration", "getCurrentPosition", "currentPosition", "getDuration", "duration", "", "isCurrentWindowDynamic", "()Z", "isCurrentWindowLive", "", "getCurrentWindowIndex", "()I", "currentWindowIndex", "getContentDuration", "contentDuration", "Lfe10;", "getCurrentMediaItem", "()Lfe10;", "currentMediaItem", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurrentWindowStateProvider {
    public static final int $stable = 8;
    private final ExoPlayer exoPlayer;
    private long lastObservedDuration;
    private long lastObservedPosition;

    public CurrentWindowStateProvider(ExoPlayer exoPlayer) {
        this.exoPlayer = exoPlayer;
    }

    public final long getContentDuration() {
        return this.exoPlayer.getContentDuration();
    }

    public final fe10 getCurrentMediaItem() {
        return this.exoPlayer.getCurrentMediaItem();
    }

    public final long getCurrentPosition() {
        return this.exoPlayer.getCurrentPosition();
    }

    public final int getCurrentWindowIndex() {
        return this.exoPlayer.getCurrentWindowIndex();
    }

    public final long getDuration() {
        return this.exoPlayer.getDuration();
    }

    public final long getLastObservedDuration() {
        return this.lastObservedDuration;
    }

    public final long getLastObservedPosition() {
        return this.lastObservedPosition;
    }

    public final boolean isCurrentWindowDynamic() {
        return this.exoPlayer.isCurrentWindowDynamic();
    }

    public final boolean isCurrentWindowLive() {
        return this.exoPlayer.isCurrentWindowLive();
    }

    public final void setLastObservedDuration(long j) {
        this.lastObservedDuration = j;
    }

    public final void setLastObservedPosition(long j) {
        this.lastObservedPosition = j;
    }
}
