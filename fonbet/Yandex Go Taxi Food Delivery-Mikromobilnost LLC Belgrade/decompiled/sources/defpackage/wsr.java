package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.f;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;

/* loaded from: classes4.dex */
public final class wsr implements TextureRegistry$SurfaceTextureEntry, vuy0 {
    public final long a;
    public final SurfaceTextureWrapper b;
    public boolean c;
    public vuy0 d;
    public final /* synthetic */ f e;

    public wsr(f fVar, long j, SurfaceTexture surfaceTexture) {
        this.e = fVar;
        this.a = j;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new ejp(8, this));
        this.b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new vsr(0, this), new Handler());
    }

    public final void finalize() {
        try {
            if (this.c) {
                return;
            }
            f fVar = this.e;
            fVar.e.post(new xsr(this.a, fVar.a, 0));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.a;
    }

    @Override // defpackage.vuy0
    public final void onTrimMemory(int i) {
        vuy0 vuy0Var = this.d;
        if (vuy0Var != null) {
            vuy0Var.onTrimMemory(i);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.c) {
            return;
        }
        this.b.release();
        long j = this.a;
        f fVar = this.e;
        fVar.a.unregisterTexture(j);
        fVar.e(this);
        this.c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(uuy0 uuy0Var) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(vuy0 vuy0Var) {
        this.d = vuy0Var;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.b.surfaceTexture();
    }
}
