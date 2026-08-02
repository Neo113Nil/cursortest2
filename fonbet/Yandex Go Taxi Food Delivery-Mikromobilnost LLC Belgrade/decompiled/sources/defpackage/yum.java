package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class yum extends w570 {
    public int n = -1;
    public int o = -1;
    public final jud p;
    public final jud q;

    public yum(jud judVar, jud judVar2) {
        this.p = judVar;
        this.q = judVar2;
    }

    @Override // defpackage.w570
    public final t64 e(q8n q8nVar, Map map) {
        t64 e = super.e(q8nVar, map);
        this.n = brs.g();
        this.o = brs.g();
        return e;
    }

    @Override // defpackage.w570
    public final void h() {
        super.h();
        this.n = -1;
        this.o = -1;
    }

    public final void m(long j, Surface surface, qnw0 qnw0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        brs.d(true, this.a);
        brs.c(this.c);
        HashMap hashMap = this.b;
        d6z.y("The surface is not registered.", hashMap.containsKey(surface));
        ry80 ry80Var = (ry80) hashMap.get(surface);
        Objects.requireNonNull(ry80Var);
        if (ry80Var == brs.j) {
            ry80Var = b(surface);
            if (ry80Var == null) {
                return;
            } else {
                hashMap.put(surface, ry80Var);
            }
        }
        ry80 ry80Var2 = ry80Var;
        if (surface != this.i) {
            f(ry80Var2.a());
            this.i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        n(ry80Var2, qnw0Var, surfaceTexture, this.p, this.n, true);
        n(ry80Var2, qnw0Var, surfaceTexture2, this.q, this.o, false);
        EGLExt.eglPresentationTimeANDROID(this.d, ry80Var2.a(), j);
        if (EGL14.eglSwapBuffers(this.d, ry80Var2.a())) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        sgb1.g(5, "DualOpenGlRenderer");
        j(surface, false);
    }

    public final void n(ry80 ry80Var, qnw0 qnw0Var, SurfaceTexture surfaceTexture, jud judVar, int i, boolean z) {
        l(i);
        GLES20.glViewport(0, 0, ry80Var.c(), ry80Var.b());
        GLES20.glScissor(0, 0, ry80Var.c(), ry80Var.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        snw0 snw0Var = (snw0) qnw0Var;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? snw0Var.x : snw0Var.y, 0);
        zqs zqsVar = this.k;
        zqsVar.getClass();
        if (zqsVar instanceof ars) {
            GLES20.glUniformMatrix4fv(((ars) zqsVar).f, 1, false, fArr2, 0);
            brs.b("glUniformMatrix4fv");
        }
        float c = ry80Var.c();
        sa90 sa90Var = judVar.b;
        Object obj = sa90Var.a;
        Object obj2 = sa90Var.b;
        Size size = new Size((int) (((Float) sa90Var.a).floatValue() * c), (int) (((Float) obj2).floatValue() * ry80Var.b()));
        Size size2 = new Size(ry80Var.c(), ry80Var.b());
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        sa90 sa90Var2 = judVar.a;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) sa90Var2.a).floatValue() / ((Float) obj).floatValue(), ((Float) sa90Var2.b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(zqsVar.b, 1, false, fArr5, 0);
        brs.b("glUniformMatrix4fv");
        GLES20.glUniform1f(zqsVar.c, 1.0f);
        brs.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        brs.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
