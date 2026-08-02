package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class sau extends GLSurfaceView implements wau {
    public static final /* synthetic */ int b = 0;
    public final qau a;

    public sau(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        qau qauVar = new qau(this);
        this.a = qauVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(qauVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(uau uauVar) {
        qau qauVar = this.a;
        if (qauVar.f.getAndSet(uauVar) == null) {
            qauVar.a.requestRender();
        } else {
            l1j.f();
        }
    }

    @Deprecated
    public wau getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public sau(Context context) {
        this(context, null);
    }
}
