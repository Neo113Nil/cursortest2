package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class rm81 implements ai61, w981 {
    public int B;
    public SurfaceTexture C;
    public byte[] F;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final y881 c = new y881();
    public final v291 w = new v291();
    public final t781 x = new t781();
    public final t781 y = new t781();
    public final float[] z = new float[16];
    public final float[] A = new float[16];
    public volatile int D = 0;
    public int E = -1;

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        if (r5 == 1) goto L63;
     */
    @Override // defpackage.ai61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2, qd81 qd81Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayList;
        int a;
        this.x.c(Long.valueOf(j), j2);
        byte[] bArr = qd81Var.O;
        int i2 = qd81Var.P;
        byte[] bArr2 = this.F;
        int i3 = this.E;
        this.F = bArr;
        if (i2 == -1) {
            i2 = this.D;
        }
        this.E = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.F)) {
            return;
        }
        byte[] bArr3 = this.F;
        xy71 xy71Var = null;
        int i4 = 1;
        if (bArr3 != null) {
            int i5 = this.E;
            dl81 dl81Var = new dl81(bArr3);
            try {
                dl81Var.m(dl81Var.b + 4);
                a = dl81Var.a();
                dl81Var.m(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (a == 1886547818) {
                dl81Var.m(dl81Var.b + 8);
                int i6 = dl81Var.b;
                int i7 = dl81Var.c;
                while (i6 < i7) {
                    int a2 = dl81Var.a() + i6;
                    if (a2 <= i6 || a2 > i7) {
                        break;
                    }
                    int a3 = dl81Var.a();
                    if (a3 != 2037673328 && a3 != 1836279920) {
                        dl81Var.m(a2);
                        i6 = a2;
                    }
                    dl81Var.k(a2);
                    arrayList = vha1.b(dl81Var);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = vha1.b(dl81Var);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    ts71 ts71Var = (ts71) arrayList.get(0);
                    xy71Var = new xy71(ts71Var, ts71Var, i5);
                } else if (size == 2) {
                    xy71Var = new xy71((ts71) arrayList.get(0), (ts71) arrayList.get(1), i5);
                }
            }
        }
        if (xy71Var == null || !y881.a(xy71Var)) {
            int i8 = this.E;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < 36) {
                float f3 = radians / 2.0f;
                float f4 = (i9 * f) - f3;
                int i12 = i9 + 1;
                float f5 = (i12 * f) - f3;
                float f6 = radians;
                int i13 = 0;
                while (i13 < 73) {
                    float f7 = radians2;
                    int i14 = 0;
                    int i15 = 2;
                    while (i14 < i15) {
                        float f8 = f;
                        float f9 = i13 * f2;
                        float f10 = f4;
                        double d = (f9 + 3.1415927f) - (f7 / 2.0f);
                        double d2 = i14 == 0 ? f4 : f5;
                        fArr[i10] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i10 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i16 = i10 + 3;
                        float f11 = f2;
                        fArr[i10 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i11] = f9 / f7;
                        int i17 = i11 + 2;
                        fArr2[i11 + 1] = ((i9 + i14) * f8) / f6;
                        if (i13 == 0) {
                            if (i14 == 0) {
                                System.arraycopy(fArr, i10, fArr, i16, 3);
                                i10 += 6;
                                i = 2;
                                System.arraycopy(fArr2, i11, fArr2, i17, 2);
                                i11 += 4;
                                i14++;
                                i15 = i;
                                f = f8;
                                f2 = f11;
                                f4 = f10;
                            }
                        }
                        if (i13 != 72) {
                        }
                        i = 2;
                        i10 = i16;
                        i11 = i17;
                        i14++;
                        i15 = i;
                        f = f8;
                        f2 = f11;
                        f4 = f10;
                    }
                    i13++;
                    radians2 = f7;
                    f2 = f2;
                }
                i9 = i12;
                radians = f6;
                i4 = 1;
            }
            ts71 ts71Var2 = new ts71(new ykf0(fArr, 0, fArr2, i4, 1));
            xy71Var = new xy71(ts71Var2, ts71Var2, i8);
        }
        this.y.c(xy71Var, j2);
    }

    @Override // defpackage.w981
    public final void b(long j, float[] fArr) {
        this.w.c.c(fArr, j);
    }

    @Override // defpackage.w981
    public final void c() {
        this.x.b();
        v291 v291Var = this.w;
        v291Var.c.b();
        v291Var.d = false;
        this.b.set(true);
    }

    public final SurfaceTexture d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        g8a1.a();
        y881 y881Var = this.c;
        y881Var.getClass();
        yy61 yy61Var = new yy61();
        y881Var.c = yy61Var;
        y881Var.d = GLES20.glGetUniformLocation(yy61Var.a, "uMvpMatrix");
        y881Var.e = GLES20.glGetUniformLocation(y881Var.c.a, "uTexMatrix");
        int glGetAttribLocation = GLES20.glGetAttribLocation(y881Var.c.a, "aPosition");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        g8a1.a();
        y881Var.f = glGetAttribLocation;
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(y881Var.c.a, "aTexCoords");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        g8a1.a();
        y881Var.g = glGetAttribLocation2;
        y881Var.h = GLES20.glGetUniformLocation(y881Var.c.a, "uTexture");
        g8a1.a();
        if (rf71.o(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            nba1.c("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g8a1.a();
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        g8a1.a();
        GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
        g8a1.a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        g8a1.a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        g8a1.a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        g8a1.a();
        this.B = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.B);
        this.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new vsr(3, this));
        return this.C;
    }
}
