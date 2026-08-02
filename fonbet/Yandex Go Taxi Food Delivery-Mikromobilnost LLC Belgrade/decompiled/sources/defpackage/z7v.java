package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.c;
import androidx.concurrent.futures.b;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class z7v implements odv {
    public mdl0 A;
    public ImageWriter B;
    public ByteBuffer G;
    public ByteBuffer H;
    public ByteBuffer I;
    public ByteBuffer J;
    public ByteBuffer K;
    public ByteBuffer L;
    public t7v a;
    public volatile int b;
    public volatile int c;
    public volatile boolean x;
    public volatile boolean y;
    public Executor z;
    public volatile int w = 1;
    public Rect C = new Rect();
    public Rect D = new Rect();
    public Matrix E = new Matrix();
    public Matrix F = new Matrix();
    public final Object M = new Object();
    public boolean N = true;

    public abstract jdv a(pdv pdvVar);

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:6|7|(1:100)(1:11)|(1:13)|14)|(6:(11:16|(1:18)|19|20|21|22|23|24|25|26|27)|23|24|25|26|27)|98|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0120, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0121, code lost:
    
        r14 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final euy b(final jdv jdvVar) {
        Object obj;
        Executor executor;
        final t7v t7vVar;
        boolean z;
        mdl0 mdl0Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        e8v j;
        e8v e8vVar;
        int i = this.x ? this.b : 0;
        Object obj2 = this.M;
        synchronized (obj2) {
            try {
                try {
                    executor = this.z;
                    t7vVar = this.a;
                    z = this.x && i != this.c;
                    if (z) {
                        g(jdvVar, i);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.x) {
                        if (this.w == 3) {
                        }
                        mdl0Var = this.A;
                        imageWriter = this.B;
                        byteBuffer = this.G;
                        byteBuffer2 = this.H;
                        byteBuffer3 = this.I;
                        byteBuffer4 = this.J;
                        byteBuffer5 = this.K;
                        byteBuffer6 = this.L;
                    }
                    imageWriter = this.B;
                    byteBuffer = this.G;
                    byteBuffer2 = this.H;
                    byteBuffer3 = this.I;
                    byteBuffer4 = this.J;
                    byteBuffer5 = this.K;
                    byteBuffer6 = this.L;
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                    throw th;
                }
                d(jdvVar);
                mdl0Var = this.A;
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
        if (t7vVar == null || executor == null || !this.N) {
            return new hiv(1, new OperationCanceledException("No analyzer or executor currently set."));
        }
        int i2 = this.w;
        if (mdl0Var != null) {
            if (i2 == 2) {
                j = ImageProcessingUtil.d(jdvVar, mdl0Var, byteBuffer, i, this.y);
            } else {
                if (this.w == 1) {
                    if (this.y) {
                        ImageProcessingUtil.a(jdvVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        j = ImageProcessingUtil.i(jdvVar, mdl0Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                e8vVar = null;
            }
            e8vVar = j;
        } else {
            if (i2 == 3) {
                if (this.y) {
                    ImageProcessingUtil.a(jdvVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    j = ImageProcessingUtil.j(jdvVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    e8vVar = j;
                }
            }
            e8vVar = null;
        }
        boolean z2 = e8vVar == null;
        final jdv jdvVar2 = z2 ? jdvVar : e8vVar;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.M) {
            if (z && !z2) {
                try {
                    f(jdvVar.getWidth(), jdvVar.getHeight(), jdvVar2.getWidth(), jdvVar2.getHeight());
                } finally {
                }
            }
            this.c = i;
            rect.set(this.D);
            matrix.set(this.F);
        }
        final b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            executor.execute(new Runnable() { // from class: y7v
                @Override // java.lang.Runnable
                public final void run() {
                    z7v z7vVar = z7v.this;
                    jdv jdvVar3 = jdvVar;
                    Matrix matrix2 = matrix;
                    jdv jdvVar4 = jdvVar2;
                    Rect rect2 = rect;
                    t7v t7vVar2 = t7vVar;
                    b bVar2 = bVar;
                    if (!z7vVar.N) {
                        bVar2.d(new OperationCanceledException("ImageAnalysis is detached"));
                        return;
                    }
                    x4r0 x4r0Var = new x4r0(jdvVar4, null, new c(jdvVar3.G0().b(), jdvVar3.G0().getTimestamp(), z7vVar.x ? 0 : z7vVar.b, matrix2, jdvVar3.G0().d()));
                    if (!rect2.isEmpty()) {
                        x4r0Var.c(rect2);
                    }
                    t7vVar2.d(x4r0Var);
                    bVar2.b(null);
                }
            });
            bVar.a = "analyzeImage";
            return gl7Var;
        } catch (Exception e) {
            gl7Var.a(e);
            return gl7Var;
        }
    }

    public abstract void c();

    public final void d(jdv jdvVar) {
        if (this.w != 1 && this.w != 3) {
            if (this.w == 2 && this.G == null) {
                this.G = ByteBuffer.allocateDirect(jdvVar.getHeight() * jdvVar.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.H == null) {
            this.H = ByteBuffer.allocateDirect(jdvVar.getHeight() * jdvVar.getWidth());
        }
        this.H.position(0);
        if (this.I == null) {
            this.I = ByteBuffer.allocateDirect((jdvVar.getHeight() * jdvVar.getWidth()) / 4);
        }
        this.I.position(0);
        if (this.J == null) {
            this.J = ByteBuffer.allocateDirect((jdvVar.getHeight() * jdvVar.getWidth()) / 4);
        }
        this.J.position(0);
        if (this.w == 3) {
            if (this.K == null) {
                this.K = ByteBuffer.allocateDirect(jdvVar.getHeight() * jdvVar.getWidth());
            }
            this.K.position(0);
            if (this.L == null) {
                this.L = ByteBuffer.allocateDirect((jdvVar.getHeight() * jdvVar.getWidth()) / 2);
            }
            this.L.position(0);
        }
    }

    public abstract void e(jdv jdvVar);

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = lw01.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.C);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.D = rect;
        this.F.setConcat(this.E, matrix);
    }

    public final void g(jdv jdvVar, int i) {
        mdl0 mdl0Var = this.A;
        if (mdl0Var == null) {
            return;
        }
        mdl0Var.d();
        int width = jdvVar.getWidth();
        int height = jdvVar.getHeight();
        int h = this.A.h();
        int l = this.A.l();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.A = new mdl0(c5b1.a(i2, width, h, l));
        if (this.w == 1) {
            ImageWriter imageWriter = this.B;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.B = ImageWriter.newInstance(this.A.getSurface(), this.A.l());
        }
    }

    public final void h(Executor executor, t7v t7vVar) {
        if (t7vVar == null) {
            c();
        }
        synchronized (this.M) {
            this.a = t7vVar;
            this.z = executor;
        }
    }

    public final void i(Matrix matrix) {
        synchronized (this.M) {
            this.E = matrix;
            this.F = new Matrix(this.E);
        }
    }

    public final void j(Rect rect) {
        synchronized (this.M) {
            this.C = rect;
            this.D = new Rect(this.C);
        }
    }

    @Override // defpackage.odv
    public final void r(pdv pdvVar) {
        try {
            jdv a = a(pdvVar);
            if (a != null) {
                e(a);
            }
        } catch (IllegalStateException e) {
            sgb1.e("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }
}
