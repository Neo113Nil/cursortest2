package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class j6r implements GLSurfaceView.Renderer, dxj, exj {
    public final /* synthetic */ int a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final Object k;
    public final /* synthetic */ GLSurfaceView l;

    public j6r(l6r l6rVar, dto dtoVar) {
        this.a = 1;
        this.l = l6rVar;
        this.b = new float[16];
        this.c = new float[16];
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.i = new float[16];
        this.j = new float[16];
        this.k = dtoVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    private final void b(GL10 gl10) {
        Object d;
        Object d2;
        Object d3;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        cto ctoVar = (cto) this.k;
        float[] fArr = this.c;
        GLES20.glClear(16384);
        try {
            ot0.v();
        } catch (zcd e) {
            tt0.B("Failed to draw a frame", e);
        }
        if (ctoVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = ctoVar.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                ot0.v();
            } catch (zcd e2) {
                tt0.B("Failed to draw a frame", e2);
            }
            if (ctoVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(ctoVar.g, 0);
            }
            long timestamp = ctoVar.j.getTimestamp();
            lis lisVar = ctoVar.e;
            synchronized (lisVar) {
                d = lisVar.d(timestamp, false);
            }
            Long l = (Long) d;
            if (l != null) {
                z0j z0jVar = ctoVar.d;
                float[] fArr2 = ctoVar.g;
                long longValue = l.longValue();
                lis lisVar2 = (lis) z0jVar.e;
                synchronized (lisVar2) {
                    d3 = lisVar2.d(longValue, true);
                }
                float[] fArr3 = (float[]) d3;
                if (fArr3 != null) {
                    float[] fArr4 = (float[]) z0jVar.d;
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!z0jVar.b) {
                        z0j.G((float[]) z0jVar.c, (float[]) z0jVar.d);
                        z0jVar.b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) z0jVar.c, 0, (float[]) z0jVar.d, 0);
                }
            }
            lis lisVar3 = ctoVar.f;
            synchronized (lisVar3) {
                d2 = lisVar3.d(timestamp, true);
            }
            if (d2 != null) {
                l1j.f();
                return;
            }
        }
        Matrix.multiplyMM(ctoVar.h, 0, fArr, 0, ctoVar.g, 0);
        ctoVar.c.getClass();
    }

    @Override // defpackage.dxj, defpackage.exj
    public final synchronized void a(float f, float[] fArr) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    float[] fArr2 = this.d;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                    float f2 = -f;
                    this.h = f2;
                    Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
                    return;
                default:
                    float[] fArr3 = this.d;
                    System.arraycopy(fArr, 0, fArr3, 0, fArr3.length);
                    float f3 = -f;
                    this.h = f3;
                    Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f3), (float) Math.sin(this.h), 0.0f);
                    return;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object d;
        float[] fArr;
        switch (this.a) {
            case 0:
                b(gl10);
                return;
            default:
                synchronized (this) {
                    Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                    Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
                }
                Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
                dto dtoVar = (dto) this.k;
                float[] fArr2 = this.c;
                GLES20.glClear(16384);
                try {
                    tt0.w();
                } catch (add e) {
                    vq1.L("SceneRenderer", "Failed to draw a frame", e);
                }
                if (dtoVar.a.compareAndSet(true, false)) {
                    SurfaceTexture surfaceTexture = dtoVar.j;
                    surfaceTexture.getClass();
                    surfaceTexture.updateTexImage();
                    try {
                        tt0.w();
                    } catch (add e2) {
                        vq1.L("SceneRenderer", "Failed to draw a frame", e2);
                    }
                    if (dtoVar.b.compareAndSet(true, false)) {
                        Matrix.setIdentityM(dtoVar.g, 0);
                    }
                    long timestamp = dtoVar.j.getTimestamp();
                    lis lisVar = dtoVar.e;
                    synchronized (lisVar) {
                        d = lisVar.d(timestamp, false);
                    }
                    Long l = (Long) d;
                    if (l != null) {
                        z0j z0jVar = dtoVar.d;
                        float[] fArr3 = dtoVar.g;
                        float[] fArr4 = (float[]) ((lis) z0jVar.e).f(l.longValue());
                        if (fArr4 != null) {
                            float[] fArr5 = (float[]) z0jVar.d;
                            float f = fArr4[0];
                            float f2 = -fArr4[1];
                            float f3 = -fArr4[2];
                            float length = Matrix.length(f, f2, f3);
                            if (length != 0.0f) {
                                fArr = fArr3;
                                Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                            } else {
                                fArr = fArr3;
                                Matrix.setIdentityM(fArr5, 0);
                            }
                            if (!z0jVar.b) {
                                z0j.I((float[]) z0jVar.c, (float[]) z0jVar.d);
                                z0jVar.b = true;
                            }
                            Matrix.multiplyMM(fArr, 0, (float[]) z0jVar.c, 0, (float[]) z0jVar.d, 0);
                        }
                    }
                    zvm zvmVar = (zvm) dtoVar.f.f(timestamp);
                    if (zvmVar != null) {
                        awm awmVar = dtoVar.c;
                        awmVar.getClass();
                        if (awm.c(zvmVar)) {
                            awmVar.a = zvmVar.c;
                            awmVar.g = new ah3(zvmVar.a.a[0]);
                            if (!zvmVar.d) {
                                ah3 ah3Var = zvmVar.b.a[0];
                                float[] fArr6 = (float[]) ah3Var.d;
                                int length2 = fArr6.length;
                                tt0.z(fArr6);
                                tt0.z((float[]) ah3Var.e);
                            }
                        }
                    }
                }
                Matrix.multiplyMM(dtoVar.h, 0, fArr2, 0, dtoVar.g, 0);
                awm awmVar2 = dtoVar.c;
                int i = dtoVar.i;
                float[] fArr7 = dtoVar.h;
                ah3 ah3Var2 = (ah3) awmVar2.g;
                if (ah3Var2 == null) {
                    return;
                }
                int i2 = awmVar2.a;
                GLES20.glUniformMatrix3fv(awmVar2.c, 1, false, i2 == 1 ? awm.j : i2 == 2 ? awm.k : awm.i, 0);
                GLES20.glUniformMatrix4fv(awmVar2.b, 1, false, fArr7, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i);
                GLES20.glUniform1i(awmVar2.f, 0);
                try {
                    tt0.w();
                } catch (add e3) {
                    Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
                }
                GLES20.glVertexAttribPointer(awmVar2.d, 3, 5126, false, 12, (Buffer) ah3Var2.d);
                try {
                    tt0.w();
                } catch (add e4) {
                    Log.e("ProjectionRenderer", "Failed to load position data", e4);
                }
                GLES20.glVertexAttribPointer(awmVar2.e, 2, 5126, false, 8, (Buffer) ah3Var2.e);
                try {
                    tt0.w();
                } catch (add e5) {
                    Log.e("ProjectionRenderer", "Failed to load texture data", e5);
                }
                GLES20.glDrawArrays(ah3Var2.c, 0, ah3Var2.b);
                try {
                    tt0.w();
                    return;
                } catch (add e6) {
                    Log.e("ProjectionRenderer", "Failed to render", e6);
                    return;
                }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        switch (this.a) {
            case 0:
                GLES20.glViewport(0, 0, i, i2);
                float f = i / i2;
                Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
                break;
            default:
                GLES20.glViewport(0, 0, i, i2);
                float f2 = i / i2;
                Matrix.perspectiveM(this.b, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
                break;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    k6r k6rVar = (k6r) this.l;
                    k6rVar.e.post(new zvh(27, k6rVar, ((cto) this.k).a()));
                    return;
                default:
                    l6r l6rVar = (l6r) this.l;
                    l6rVar.e.post(new zvh(28, l6rVar, ((dto) this.k).a()));
                    return;
            }
        }
    }

    public j6r(k6r k6rVar, cto ctoVar) {
        this.a = 0;
        this.l = k6rVar;
        this.b = new float[16];
        this.c = new float[16];
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.i = new float[16];
        this.j = new float[16];
        this.k = ctoVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }
}
