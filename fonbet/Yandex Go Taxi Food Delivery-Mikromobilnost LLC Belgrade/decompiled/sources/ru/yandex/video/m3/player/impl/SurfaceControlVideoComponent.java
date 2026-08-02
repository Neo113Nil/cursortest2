package ru.yandex.video.m3.player.impl;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.ny61;
import defpackage.sls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u0019\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0019\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b$\u0010#J\u0019\u0010&\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010#J/\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b1\u0010#J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R(\u0010:\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010\r¨\u0006>"}, d2 = {"Lru/yandex/video/m3/player/impl/SurfaceControlVideoComponent;", "Lru/yandex/video/m3/player/impl/VideoComponent;", "Landroid/view/SurfaceHolder$Callback;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "exoPlayerProperThreadRunner", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;)V", "Landroid/view/SurfaceView;", "surfaceView", "Lzy11;", "reparent", "(Landroid/view/SurfaceView;)V", "T", "Lkotlin/Function0;", "block", "runOnExoThread", "(Lsls;)Ljava/lang/Object;", "", "surfaceType", "throwIllegalStateExceptionWithType", "(Ljava/lang/String;)V", "Landroid/view/Surface;", "surface", "setVideoSurface", "(Landroid/view/Surface;)V", "clearVideoSurface", "()V", "view", "setVideoSurfaceView", "clearVideoSurfaceView", "Landroid/view/SurfaceHolder;", "surfaceHolder", "setVideoSurfaceHolder", "(Landroid/view/SurfaceHolder;)V", "clearVideoSurfaceHolder", "Landroid/view/TextureView;", "setVideoTextureView", "(Landroid/view/TextureView;)V", "clearVideoTextureView", "holder", "surfaceCreated", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "release", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "Landroid/view/SurfaceControl;", "surfaceControl", "Landroid/view/SurfaceControl;", "videoSurface", "Landroid/view/Surface;", "currentOutputView", "Landroid/view/SurfaceView;", "setCurrentOutputView", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SurfaceControlVideoComponent implements VideoComponent, SurfaceHolder.Callback {
    private static final String SURFACE_CONTROL_TAG = "YP:SurfaceControl";
    private SurfaceView currentOutputView;
    private final ExoPlayer exoPlayer;
    private final ExoPlayerProperThreadRunner exoPlayerProperThreadRunner;
    private SurfaceControl surfaceControl;
    private Surface videoSurface;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public SurfaceControlVideoComponent(ExoPlayer exoPlayer, ExoPlayerProperThreadRunner exoPlayerProperThreadRunner) {
        this.exoPlayer = exoPlayer;
        this.exoPlayerProperThreadRunner = exoPlayerProperThreadRunner;
        SurfaceControl.Builder builder = new SurfaceControl.Builder();
        builder.setName(SURFACE_CONTROL_TAG);
        builder.setBufferSize(0, 0);
        SurfaceControl build = builder.build();
        this.surfaceControl = build;
        this.videoSurface = new Surface(build);
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.SurfaceControlVideoComponent.1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m785invoke() {
                SurfaceControlVideoComponent.this.exoPlayer.setVideoSurface(SurfaceControlVideoComponent.this.videoSurface);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m785invoke();
                return zy11.a;
            }
        });
    }

    private final void reparent(SurfaceView surfaceView) {
        SurfaceControl surfaceControl = this.surfaceControl;
        if (surfaceControl == null) {
            ny61.r("Required value was null.");
        } else if (surfaceView == null) {
            new SurfaceControl.Transaction().reparent(surfaceControl, null).setBufferSize(surfaceControl, 0, 0).setVisibility(surfaceControl, true).apply();
        } else {
            new SurfaceControl.Transaction().reparent(surfaceControl, surfaceView.getSurfaceControl()).setBufferSize(surfaceControl, surfaceView.getWidth(), surfaceView.getHeight()).setVisibility(surfaceControl, true).apply();
        }
    }

    private final <T> T runOnExoThread(sls block) {
        return (T) this.exoPlayerProperThreadRunner.runOnProperThread(block);
    }

    private final void setCurrentOutputView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        SurfaceView surfaceView2 = this.currentOutputView;
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.removeCallback(this);
        }
        this.currentOutputView = surfaceView;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null) {
            return;
        }
        surfaceView.getHolder().addCallback(this);
        reparent(surfaceView);
    }

    private final void throwIllegalStateExceptionWithType(String surfaceType) {
        throw new IllegalStateException(unr0.l('.', "Wrong usage. In SurfaceControl mode only SurfaceView is operateable. You tried ", surfaceType));
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurface(final Surface surface) {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.SurfaceControlVideoComponent$clearVideoSurface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m786invoke() {
                SurfaceControlVideoComponent.this.exoPlayer.clearVideoSurface(surface);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m786invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        throwIllegalStateExceptionWithType("SurfaceHolder");
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurfaceView(SurfaceView view) {
        setCurrentOutputView(null);
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoTextureView(TextureView view) {
        throwIllegalStateExceptionWithType("TextureView");
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void release() {
        runOnExoThread(new sls() { // from class: ru.yandex.video.m3.player.impl.SurfaceControlVideoComponent$release$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m787invoke() {
                SurfaceControlVideoComponent.this.exoPlayer.clearVideoSurface(SurfaceControlVideoComponent.this.videoSurface);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m787invoke();
                return zy11.a;
            }
        });
        SurfaceControl surfaceControl = this.surfaceControl;
        if (surfaceControl != null) {
            surfaceControl.release();
        }
        this.surfaceControl = null;
        Surface surface = this.videoSurface;
        if (surface != null) {
            surface.release();
        }
        this.videoSurface = null;
        setCurrentOutputView(null);
        reparent(null);
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoSurface(Surface surface) {
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        throwIllegalStateExceptionWithType("SurfaceHolder");
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoSurfaceView(SurfaceView view) {
        setCurrentOutputView(view);
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void setVideoTextureView(TextureView view) {
        throwIllegalStateExceptionWithType("TextureView");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        reparent(this.currentOutputView);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        reparent(this.currentOutputView);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        reparent(null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/SurfaceControlVideoComponent$Companion;", "", "()V", "SURFACE_CONTROL_TAG", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.player.impl.VideoComponent
    public void clearVideoSurface() {
        clearVideoSurface(null);
    }
}
