package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class snw0 implements qnw0 {
    public Executor A;
    public final gl7 D;
    public final b E;
    public final Surface b;
    public final int c;
    public final Size w;
    public final float[] x;
    public final float[] y;
    public e9e z;
    public final Object a = new Object();
    public boolean B = false;
    public boolean C = false;

    public snw0(Surface surface, int i, Size size, s84 s84Var, onw0 onw0Var) {
        float[] fArr = new float[16];
        this.x = fArr;
        float[] fArr2 = new float[16];
        this.y = fArr2;
        this.b = surface;
        this.c = i;
        this.w = size;
        a(fArr, new float[16], s84Var);
        a(fArr2, new float[16], onw0Var);
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        try {
            this.E = bVar;
            bVar.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.D = gl7Var;
    }

    public static void a(float[] fArr, float[] fArr2, onw0 onw0Var) {
        Matrix.setIdentityM(fArr, 0);
        if (onw0Var == null) {
            return;
        }
        jjb1.f(fArr);
        jjb1.e(fArr, onw0Var.e());
        if (onw0Var.d()) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix a = lw01.a(lw01.j(onw0Var.c()), lw01.j(lw01.i(onw0Var.e(), onw0Var.c())), onw0Var.e(), onw0Var.d());
        RectF rectF = new RectF(onw0Var.b());
        a.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        br7 a2 = onw0Var.a();
        Matrix.setIdentityM(fArr2, 0);
        jjb1.f(fArr2);
        if (a2 != null) {
            d6z.y("Camera has no transform.", a2.q());
            jjb1.e(fArr2, a2.c().m());
            if (a2.g()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface c(Executor executor, e9e e9eVar) {
        boolean z;
        synchronized (this.a) {
            this.A = executor;
            this.z = e9eVar;
            z = this.B;
        }
        if (z) {
            d();
        }
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.C) {
                    this.C = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.E.b(null);
    }

    public final void d() {
        Executor executor;
        e9e e9eVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.A != null && (e9eVar = this.z) != null) {
                    if (!this.C) {
                        atomicReference.set(e9eVar);
                        executor = this.A;
                        this.B = false;
                    }
                    executor = null;
                }
                this.B = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new tpt0(25, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                sgb1.g(3, "SurfaceOutputImpl");
            }
        }
    }
}
