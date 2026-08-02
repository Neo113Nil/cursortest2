package defpackage;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public final /* synthetic */ class bto implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bto(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((cto) this.b).a.set(true);
                break;
            default:
                ((dto) this.b).a.set(true);
                break;
        }
    }
}
