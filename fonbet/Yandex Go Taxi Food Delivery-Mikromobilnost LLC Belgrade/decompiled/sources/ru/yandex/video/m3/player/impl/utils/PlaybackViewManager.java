package ru.yandex.video.m3.player.impl.utils;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0014\u0010\u001d\u001a\t\u0018\u00010\u001b¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010\"\u001a\t\u0018\u00010\u001b¢\u0006\u0002\b\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/PlaybackViewManager;", "", "<init>", "()V", "", "isPlaybackViewVisible", "()Z", "Landroid/view/SurfaceView;", "view", "Lzy11;", "setVideoSurfaceView", "(Landroid/view/SurfaceView;)V", "Landroid/view/TextureView;", "setVideoTextureView", "(Landroid/view/TextureView;)V", "clearVideoSurfaceView", "clearVideoTextureView", "Landroid/view/Surface;", "surface", "setVideoSurface", "(Landroid/view/Surface;)V", "clearVideoSurface", "Landroid/view/SurfaceHolder;", "surfaceHolder", "setVideoSurfaceHolder", "(Landroid/view/SurfaceHolder;)V", "clearVideoSurfaceHolder", "", "Lru/yandex/video/m3/data/SurfaceType;", "getSurfaceType", "()Ljava/lang/Integer;", "Landroid/view/View;", "playbackView", "Landroid/view/View;", "surfaceType", "Ljava/lang/Integer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackViewManager {
    public static final int $stable = 8;
    private View playbackView;
    private Integer surfaceType;

    public final void clearVideoSurface(Surface surface) {
        Integer num;
        if (surface == null || (num = this.surfaceType) == null || num.intValue() != 0) {
            return;
        }
        this.surfaceType = null;
    }

    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        Integer num;
        if (surfaceHolder == null || (num = this.surfaceType) == null || num.intValue() != 2) {
            return;
        }
        this.surfaceType = null;
    }

    public final void clearVideoSurfaceView(SurfaceView view) {
        Integer num;
        this.playbackView = null;
        if (view == null || (num = this.surfaceType) == null || num.intValue() != 1) {
            return;
        }
        this.surfaceType = null;
    }

    public final void clearVideoTextureView(TextureView view) {
        Integer num;
        this.playbackView = null;
        if (view == null || (num = this.surfaceType) == null || num.intValue() != 3) {
            return;
        }
        this.surfaceType = null;
    }

    public final Integer getSurfaceType() {
        return this.surfaceType;
    }

    public final boolean isPlaybackViewVisible() {
        View view = this.playbackView;
        if (view != null) {
            return view.isAttachedToWindow();
        }
        return false;
    }

    public final void setVideoSurface(Surface surface) {
        if (surface != null) {
            this.surfaceType = 0;
        }
    }

    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.surfaceType = 2;
        }
    }

    public final void setVideoSurfaceView(SurfaceView view) {
        this.playbackView = view;
        if (view != null) {
            this.surfaceType = 1;
        }
    }

    public final void setVideoTextureView(TextureView view) {
        this.playbackView = view;
        if (view != null) {
            this.surfaceType = 3;
        }
    }

    public final void clearVideoSurface() {
        this.surfaceType = null;
    }
}
