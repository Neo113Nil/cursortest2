package defpackage;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes6.dex */
public final class ktr implements fau, SurfaceHolder.Callback {
    public final ExoPlayer a;
    public final le3 b;
    public SurfaceControl c;
    public Surface d;
    public SurfaceView e;

    public ktr(ExoPlayer exoPlayer, le3 le3Var) {
        exoPlayer.getClass();
        this.a = exoPlayer;
        this.b = le3Var;
        SurfaceControl.Builder builder = new SurfaceControl.Builder();
        builder.setName("YP:SurfaceControl");
        builder.setBufferSize(0, 0);
        SurfaceControl build = builder.build();
        build.getClass();
        this.c = build;
        this.d = new Surface(build);
        le3Var.l(new jtr(this, 0));
    }

    @Override // defpackage.fau
    public final void a() {
        this.b.l(new jtr(this, 1));
        SurfaceControl surfaceControl = this.c;
        if (surfaceControl != null) {
            surfaceControl.release();
        }
        this.c = null;
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
        }
        this.d = null;
        c(null);
        b(null);
    }

    public final void b(SurfaceView surfaceView) {
        SurfaceControl surfaceControl = this.c;
        if (surfaceControl == null) {
            xq0.q("Required value was null.");
        } else if (surfaceView == null) {
            new SurfaceControl.Transaction().reparent(surfaceControl, null).setBufferSize(surfaceControl, 0, 0).setVisibility(surfaceControl, true).apply();
        } else {
            new SurfaceControl.Transaction().reparent(surfaceControl, surfaceView.getSurfaceControl()).setBufferSize(surfaceControl, surfaceView.getWidth(), surfaceView.getHeight()).setVisibility(surfaceControl, true).apply();
        }
    }

    public final void c(SurfaceView surfaceView) {
        SurfaceHolder holder;
        SurfaceView surfaceView2 = this.e;
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.removeCallback(this);
        }
        this.e = surfaceView;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null) {
            return;
        }
        surfaceView.getHolder().addCallback(this);
        b(surfaceView);
    }

    @Override // defpackage.fau
    public final void j(SurfaceView surfaceView) {
        c(surfaceView);
    }

    @Override // defpackage.fau
    public final void n(TextureView textureView) {
        throw new IllegalStateException("Wrong usage. In SurfaceControl mode only SurfaceView is operateable. You tried TextureView.");
    }

    @Override // defpackage.fau
    public final void p(TextureView textureView) {
        throw new IllegalStateException("Wrong usage. In SurfaceControl mode only SurfaceView is operateable. You tried TextureView.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        surfaceHolder.getClass();
        b(this.e);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        b(this.e);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        b(null);
    }

    @Override // defpackage.fau
    public final void v(SurfaceView surfaceView) {
        c(null);
    }

    @Override // defpackage.fau
    public final void z(Surface surface) {
        this.b.l(new j5n(13, this, surface));
    }

    @Override // defpackage.fau
    public final void h(Surface surface) {
    }
}
