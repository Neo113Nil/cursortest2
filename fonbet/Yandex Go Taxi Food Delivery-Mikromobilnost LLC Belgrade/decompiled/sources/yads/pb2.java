package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes7.dex */
public final class pb2 extends Surface {
    public static int e;
    public static boolean f;
    public final boolean b;
    public final ob2 c;
    public boolean d;

    public pb2(ob2 ob2Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.c = ob2Var;
        this.b = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.c) {
            try {
                if (!this.d) {
                    ob2 ob2Var = this.c;
                    ob2Var.c.getClass();
                    ob2Var.c.sendEmptyMessage(2);
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
