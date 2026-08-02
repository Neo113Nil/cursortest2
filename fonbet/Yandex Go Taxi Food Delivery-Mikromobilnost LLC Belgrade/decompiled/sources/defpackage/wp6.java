package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes9.dex */
public final class wp6 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq6 b;

    public /* synthetic */ wp6(qq6 qq6Var, int i) {
        this.a = i;
        this.b = qq6Var;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.a;
        qq6 qq6Var = this.b;
        switch (i) {
            case 0:
                return (int) Math.min(((yp6) qq6Var).b, 2147483647L);
            default:
                jci0 jci0Var = (jci0) qq6Var;
                if (!jci0Var.c) {
                    return (int) Math.min(jci0Var.b.b, 2147483647L);
                }
                ny61.v("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((jci0) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        qq6 qq6Var = this.b;
        switch (i) {
            case 0:
                yp6 yp6Var = (yp6) qq6Var;
                if (yp6Var.b > 0) {
                    return yp6Var.readByte() & 255;
                }
                return -1;
            default:
                jci0 jci0Var = (jci0) qq6Var;
                yp6 yp6Var2 = jci0Var.b;
                if (jci0Var.c) {
                    ny61.v("closed");
                    return 0;
                }
                if (yp6Var2.b == 0 && jci0Var.a.read(yp6Var2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return yp6Var2.readByte() & 255;
        }
    }

    public final String toString() {
        int i = this.a;
        qq6 qq6Var = this.b;
        switch (i) {
            case 0:
                return ((yp6) qq6Var) + ".inputStream()";
            default:
                return ((jci0) qq6Var) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.a) {
            case 1:
                jci0 jci0Var = (jci0) this.b;
                yp6 yp6Var = jci0Var.b;
                if (jci0Var.c) {
                    ny61.v("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (yp6Var.b == 0 && jci0Var.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return j;
                    }
                    long j2 = yp6Var.b;
                    j += j2;
                    j.b(j2, 0L, j2);
                    t7q0 t7q0Var = yp6Var.a;
                    while (j2 > 0) {
                        int min = (int) Math.min(j2, t7q0Var.c - t7q0Var.b);
                        outputStream.write(t7q0Var.a, t7q0Var.b, min);
                        int i = t7q0Var.b + min;
                        t7q0Var.b = i;
                        long j3 = min;
                        yp6Var.b -= j3;
                        j2 -= j3;
                        if (i == t7q0Var.c) {
                            t7q0 a = t7q0Var.a();
                            yp6Var.a = a;
                            p8q0.a(t7q0Var);
                            t7q0Var = a;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        qq6 qq6Var = this.b;
        switch (i3) {
            case 0:
                return ((yp6) qq6Var).read(bArr, i, i2);
            default:
                jci0 jci0Var = (jci0) qq6Var;
                yp6 yp6Var = jci0Var.b;
                if (!jci0Var.c) {
                    j.b(bArr.length, i, i2);
                    if (yp6Var.b == 0 && jci0Var.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                    return yp6Var.read(bArr, i, i2);
                }
                ny61.v("closed");
                return 0;
        }
    }
}
