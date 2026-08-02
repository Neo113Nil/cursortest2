package io.flutter.plugins.videoplayer.platformview;

import android.view.SurfaceHolder;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.owc0;

/* loaded from: classes4.dex */
class PlatformVideoView$1 implements SurfaceHolder.Callback {
    final /* synthetic */ owc0 this$0;
    final /* synthetic */ ExoPlayer val$exoPlayer;

    public PlatformVideoView$1(owc0 owc0Var, ExoPlayer exoPlayer) {
        this.this$0 = owc0Var;
        this.val$exoPlayer = exoPlayer;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.val$exoPlayer.setVideoSurface(surfaceHolder.getSurface());
        this.val$exoPlayer.seekTo(1L);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.val$exoPlayer.setVideoSurface(null);
    }
}
