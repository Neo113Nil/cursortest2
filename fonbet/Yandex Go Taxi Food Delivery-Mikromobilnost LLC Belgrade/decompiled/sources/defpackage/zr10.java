package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Mesh$PrimitiveMode;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.ArrayDeque;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public final class zr10 implements Closeable {
    public static final /* synthetic */ int y = 0;
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public final Object w;
    public final Object x;

    public zr10(Mesh$PrimitiveMode mesh$PrimitiveMode, ern ernVar, r2x0[] r2x0VarArr) {
        this.a = 0;
        int[] iArr = {0};
        this.b = iArr;
        if (r2x0VarArr.length == 0) {
            ny61.g("Must pass at least one vertex buffer");
            throw null;
        }
        this.c = mesh$PrimitiveMode;
        this.w = ernVar;
        this.x = r2x0VarArr;
        try {
            GLES30.glGenVertexArrays(1, iArr, 0);
            pva1.i("Failed to generate a vertex array", "glGenVertexArrays");
            GLES30.glBindVertexArray(iArr[0]);
            pva1.i("Failed to bind vertex array object", "glBindVertexArray");
            if (ernVar != null) {
                GLES20.glBindBuffer(34963, ((int[]) ((zi6) ernVar.b).y)[0]);
            }
            int length = r2x0VarArr.length;
            for (int i = 0; i < length; i++) {
                GLES20.glBindBuffer(34962, ((int[]) ((zi6) r2x0VarArr[i].c).y)[0]);
                pva1.i("Failed to bind vertex buffer", "glBindBuffer");
                GLES20.glVertexAttribPointer(i, r2x0VarArr[i].b, 5126, false, 0, 0);
                pva1.i("Failed to associate vertex buffer with vertex array", "glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(i);
                pva1.i("Failed to enable vertex buffer", "glEnableVertexAttribArray");
            }
        } catch (Throwable th) {
            close();
            throw th;
        }
    }

    public byte[] B() {
        o();
        long n = n();
        if (n < 0 || n > 2147483647L) {
            w511.x("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (((ByteArrayInputStream) this.b).available() < n) {
            ny61.b();
            return null;
        }
        int i = (int) n;
        byte[] bArr = new byte[i];
        w(i, bArr);
        return bArr;
    }

    public long a() {
        v(DerValue.TAG_CONTEXT);
        o();
        long n = n();
        if (n < 0) {
            w511.x("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (n > 0) {
            ((a77) this.x).a.push(Long.valueOf(n));
        }
        return n;
    }

    public long c() {
        boolean z;
        e();
        byte b = ((e8a1) this.c).a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                ny61.r(oyr.i((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long n = n();
        if (n >= 0) {
            return z ? n : ~n;
        }
        w511.x("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr[0] != 0) {
                    GLES30.glDeleteVertexArrays(1, iArr, 0);
                    pva1.h("zr10", "Failed to free vertex array object", "glDeleteVertexArrays");
                    break;
                }
                break;
            default:
                ((ByteArrayInputStream) obj).close();
                ((a77) this.x).b();
                break;
        }
    }

    public long d() {
        v((byte) -96);
        o();
        long n = n();
        if (n < 0 || n > 4611686018427387903L) {
            w511.x("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (n > 0) {
            ((a77) this.x).a.push(Long.valueOf(n + n));
        }
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
    
        if (r1 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e8a1 e() {
        a77 a77Var = (a77) this.x;
        if (((e8a1) this.c) == null) {
            int read = ((ByteArrayInputStream) this.b).read();
            if (read == -1) {
                a77Var.b();
                return null;
            }
            e8a1 e8a1Var = new e8a1(read);
            this.c = e8a1Var;
            long j = -2;
            byte b = e8a1Var.a;
            if (b != Byte.MIN_VALUE && b != -96 && b != -64) {
                if (b != -32) {
                    if (b != 0 && b != 32) {
                        if (b == 64) {
                            a77Var.c(-1L);
                        } else {
                            if (b != 96) {
                                ny61.r(oyr.i((b >> 5) & 7, "invalid major type: "));
                                return null;
                            }
                            a77Var.c(-2L);
                        }
                        long d = a77Var.d();
                        ArrayDeque arrayDeque = a77Var.a;
                        if (d == 1) {
                            arrayDeque.pop();
                        } else if (d > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(d - 1));
                        } else if (d == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (d == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (e8a1Var.b == 31) {
                    long d2 = a77Var.d();
                    if (d2 >= 0) {
                        ny61.v(qv10.j(d2, "expected indefinite length scope but found "));
                        return null;
                    }
                    if (d2 == -5) {
                        ny61.v("expected a value for dangling key in indefinite-length map");
                        return null;
                    }
                    a77Var.a.pop();
                }
            }
            long d3 = a77Var.d();
            if (d3 == -1) {
                j = d3;
            }
            ny61.v(qv10.j(j, "expected non-string scope but found "));
            return null;
        }
        return (e8a1) this.c;
    }

    public boolean k() {
        v((byte) -32);
        if (((e8a1) this.c).b > 24) {
            ny61.r("expected simple value");
            return false;
        }
        int n = (int) n();
        if (n == 20) {
            return false;
        }
        if (n == 21) {
            return true;
        }
        ny61.r("expected FALSE or TRUE");
        return false;
    }

    public long n() {
        byte[] bArr = (byte[]) this.w;
        e8a1 e8a1Var = (e8a1) this.c;
        byte b = e8a1Var.b;
        if (b < 24) {
            long j = b;
            this.c = null;
            return j;
        }
        if (b == 24) {
            int read = ((ByteArrayInputStream) this.b).read();
            if (read != -1) {
                this.c = null;
                return read & 255;
            }
            ny61.b();
            return 0L;
        }
        if (b == 25) {
            w(2, bArr);
            return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        }
        if (b == 26) {
            w(4, bArr);
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        if (b != 27) {
            ny61.v(oyr.h(b, (e8a1Var.a >> 5) & 7, "invalid additional information ", " for major type "));
            return 0L;
        }
        w(8, bArr);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        long j6 = bArr[4];
        return (bArr[7] & 255) | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((j6 & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public void o() {
        e();
        byte b = ((e8a1) this.c).b;
        if (b != 31) {
            return;
        }
        ny61.r(oyr.i(b, "expected definite length but found "));
    }

    public void v(byte b) {
        e();
        byte b2 = ((e8a1) this.c).a;
        if (b2 == b) {
            return;
        }
        ny61.r(oyr.h((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }

    public void w(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = ((ByteArrayInputStream) this.b).read(bArr, i2, i - i2);
            if (read == -1) {
                ny61.b();
                return;
            }
            i2 += read;
        }
        this.c = null;
    }

    public zr10(ByteArrayInputStream byteArrayInputStream) {
        this.a = 1;
        this.w = new byte[8];
        this.x = new a77(1);
        this.b = byteArrayInputStream;
    }
}
