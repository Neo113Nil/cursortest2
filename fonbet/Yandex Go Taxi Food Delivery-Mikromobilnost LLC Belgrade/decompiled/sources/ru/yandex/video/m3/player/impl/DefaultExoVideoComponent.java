package ru.yandex.video.m3.player.impl;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, d2 = {"Lru/yandex/video/m3/player/impl/DefaultExoVideoComponent;", "Lru/yandex/video/m3/player/impl/VideoComponent;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "exoPlayerProperThreadRunner", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;)V", "T", "Lkotlin/Function0;", "block", "runOnExoThread", "(Lsls;)Ljava/lang/Object;", "Landroid/view/SurfaceView;", "view", "Lzy11;", "setVideoSurfaceView", "(Landroid/view/SurfaceView;)V", "clearVideoSurfaceView", "Landroid/view/TextureView;", "setVideoTextureView", "(Landroid/view/TextureView;)V", "clearVideoTextureView", "Landroid/view/Surface;", "surface", "setVideoSurface", "(Landroid/view/Surface;)V", "clearVideoSurface", "()V", "Landroid/view/SurfaceHolder;", "surfaceHolder", "setVideoSurfaceHolder", "(Landroid/view/SurfaceHolder;)V", "clearVideoSurfaceHolder", "release", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultExoVideoComponent implements VideoComponent {
    public static final int $stable = 8;
    private final ExoPlayer exoPlayer;
    private final ExoPlayerProperThreadRunner exoPlayerProperThreadRunner;

    public DefaultExoVideoComponent(ExoPlayer exoPlayer, ExoPlayerProperThreadRunner exoPlayerProperThreadRunner) {
        this.exoPlayer = exoPlayer;
        this.exoPlayerProperThreadRunner = exoPlayerProperThreadRunner;
    }

    private final <T> T runOnExoThread(sls block) {
        return (T) this.exoPlayerProperThreadRunner.runOnProperThread(block);
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurface() {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$clearVideoSurface$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m764invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.clearVideoSurface();
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m764invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurfaceHolder(final SurfaceHolder surfaceHolder) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$clearVideoSurfaceHolder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m766invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.clearVideoSurfaceHolder(surfaceHolder);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m766invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurfaceView(final SurfaceView view) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$clearVideoSurfaceView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m767invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.clearVideoSurfaceView(view);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m767invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoTextureView(final TextureView view) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$clearVideoTextureView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m768invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.clearVideoTextureView(view);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m768invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void release() {
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoSurface(final Surface surface) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$setVideoSurface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m769invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.setVideoSurface(surface);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m769invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoSurfaceHolder(final SurfaceHolder surfaceHolder) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$setVideoSurfaceHolder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m770invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.setVideoSurfaceHolder(surfaceHolder);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m770invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoSurfaceView(final SurfaceView view) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$setVideoSurfaceView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m771invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.setVideoSurfaceView(view);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m771invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoTextureView(final TextureView view) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$setVideoTextureView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m772invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.setVideoTextureView(view);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m772invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurface(final Surface surface) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.DefaultExoVideoComponent$clearVideoSurface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m765invoke() {
                ExoPlayer exoPlayer;
                exoPlayer = DefaultExoVideoComponent.this.exoPlayer;
                exoPlayer.clearVideoSurface(surface);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m765invoke();
                return zy11.a;
            }
        });
    }
}
