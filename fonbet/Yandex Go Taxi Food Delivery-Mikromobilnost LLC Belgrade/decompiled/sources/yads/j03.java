package yads;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import defpackage.blf0;
import defpackage.g8a1;
import defpackage.nc71;
import defpackage.rm81;
import defpackage.t781;
import defpackage.v291;
import defpackage.xy71;
import defpackage.y881;
import defpackage.ykf0;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes7.dex */
public final class j03 implements GLSurfaceView.Renderer, nc71 {
    public final rm81 a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final /* synthetic */ l03 k;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public j03(l03 l03Var, rm81 rm81Var) {
        this.k = l03Var;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = rm81Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // defpackage.nc71
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object a;
        Object a2;
        Object a3;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        rm81 rm81Var = this.a;
        float[] fArr = this.c;
        rm81Var.getClass();
        GLES20.glClear(16384);
        g8a1.a();
        if (rm81Var.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = rm81Var.C;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            g8a1.a();
            if (rm81Var.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(rm81Var.z, 0);
            }
            long timestamp = rm81Var.C.getTimestamp();
            t781 t781Var = rm81Var.x;
            synchronized (t781Var) {
                a = t781Var.a(timestamp, false);
            }
            Long l = (Long) a;
            if (l != null) {
                v291 v291Var = rm81Var.w;
                float[] fArr2 = rm81Var.z;
                long longValue = l.longValue();
                t781 t781Var2 = v291Var.c;
                synchronized (t781Var2) {
                    a3 = t781Var2.a(longValue, true);
                }
                float[] fArr3 = (float[]) a3;
                if (fArr3 != null) {
                    float[] fArr4 = v291Var.b;
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!v291Var.d) {
                        v291.a(v291Var.a, v291Var.b);
                        v291Var.d = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, v291Var.a, 0, v291Var.b, 0);
                }
            }
            t781 t781Var3 = rm81Var.y;
            synchronized (t781Var3) {
                a2 = t781Var3.a(timestamp, true);
            }
            xy71 xy71Var = (xy71) a2;
            if (xy71Var != null) {
                y881 y881Var = rm81Var.c;
                y881Var.getClass();
                if (y881.a(xy71Var)) {
                    y881Var.a = xy71Var.c;
                    y881Var.b = new blf0(xy71Var.a.a[0], false);
                    if (!xy71Var.d) {
                        ykf0 ykf0Var = xy71Var.b.a[0];
                        float[] fArr5 = ykf0Var.c;
                        float[] fArr6 = ykf0Var.d;
                    }
                }
            }
        }
        Matrix.multiplyMM(rm81Var.A, 0, fArr, 0, rm81Var.z, 0);
        y881 y881Var2 = rm81Var.c;
        int i = rm81Var.B;
        float[] fArr7 = rm81Var.A;
        blf0 blf0Var = y881Var2.b;
        if (blf0Var == null) {
            return;
        }
        int i2 = y881Var2.a;
        GLES20.glUniformMatrix3fv(y881Var2.e, 1, false, i2 == 1 ? y881.j : i2 == 2 ? y881.k : y881.i, 0);
        GLES20.glUniformMatrix4fv(y881Var2.d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(y881Var2.h, 0);
        g8a1.a();
        GLES20.glVertexAttribPointer(y881Var2.f, 3, 5126, false, 12, (Buffer) blf0Var.b);
        g8a1.a();
        GLES20.glVertexAttribPointer(y881Var2.g, 2, 5126, false, 8, (Buffer) blf0Var.c);
        g8a1.a();
        GLES20.glDrawArrays(blf0Var.d, 0, blf0Var.a);
        g8a1.a();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.k.b(this.a.d());
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.k.performClick();
    }
}
