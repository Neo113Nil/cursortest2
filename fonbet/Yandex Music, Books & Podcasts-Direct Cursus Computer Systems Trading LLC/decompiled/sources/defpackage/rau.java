package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class rau extends GLSurfaceView implements vau {
    public static final /* synthetic */ int b = 0;
    public final pau a;

    public rau(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        pau pauVar = new pau(this);
        this.a = pauVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(pauVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(tau tauVar) {
        pau pauVar = this.a;
        if (pauVar.f.getAndSet(tauVar) == null) {
            pauVar.a.requestRender();
        } else {
            l1j.f();
        }
    }

    @Deprecated
    public vau getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public rau(Context context) {
        this(context, null);
    }
}
