package defpackage;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes6.dex */
public final class dm7 implements fau {
    public final ExoPlayer a;
    public final le3 b;

    public dm7(ExoPlayer exoPlayer, le3 le3Var) {
        exoPlayer.getClass();
        this.a = exoPlayer;
        this.b = le3Var;
    }

    @Override // defpackage.fau
    public final void h(Surface surface) {
        this.b.l(new am7(this, surface, 1));
    }

    @Override // defpackage.fau
    public final void j(SurfaceView surfaceView) {
        this.b.l(new bm7(this, surfaceView, 1));
    }

    @Override // defpackage.fau
    public final void n(TextureView textureView) {
        this.b.l(new cm7(this, textureView, 1));
    }

    @Override // defpackage.fau
    public final void p(TextureView textureView) {
        this.b.l(new cm7(this, textureView, 0));
    }

    @Override // defpackage.fau
    public final void v(SurfaceView surfaceView) {
        this.b.l(new bm7(this, surfaceView, 0));
    }

    @Override // defpackage.fau
    public final void z(Surface surface) {
        this.b.l(new am7(this, surface, 0));
    }

    @Override // defpackage.fau
    public final void a() {
    }
}
