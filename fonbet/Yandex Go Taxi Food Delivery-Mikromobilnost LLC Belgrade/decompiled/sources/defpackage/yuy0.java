package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.view.TextureRegistry$SurfaceProducer;

/* loaded from: classes4.dex */
public final class yuy0 extends nm31 implements wuy0 {
    public boolean x;

    @Override // defpackage.nm31
    public final qno a(ExoPlayer exoPlayer, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer != null) {
            return new suy0(exoPlayer, this.a, textureRegistry$SurfaceProducer.handlesCropAndRotation());
        }
        ny61.g("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        return null;
    }

    @Override // defpackage.nm31
    public final void b() {
        super.b();
        this.b.release();
    }

    @Override // defpackage.wuy0
    public final void onSurfaceAvailable() {
        if (this.x) {
            this.w.setVideoSurface(this.b.getSurface());
            this.x = false;
        }
    }

    @Override // defpackage.wuy0
    public final void onSurfaceCleanup() {
        this.w.setVideoSurface(null);
        this.x = true;
    }
}
