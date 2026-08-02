package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.oyr;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class cl_62 extends OutputStream {
    public SSLSocketImpl a;
    public SSLEngineImpl b;
    public cl_82 c;

    public static void c(int i, int i2) {
        if (i < i2) {
            return;
        }
        kbs.g(oyr.h(i, i2, "Field length overflow, the field length (", ") should be less than "));
    }

    public final void a(int i) {
        c(i, 256);
        this.c.write(i);
    }

    public void b(byte[] bArr) throws IOException {
        if (bArr == null) {
            e(0);
            return;
        }
        c(bArr.length, 65536);
        e(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void d(byte[] bArr) {
        if (bArr == null) {
            a(0);
            return;
        }
        c(bArr.length, 256);
        a(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void e(int i) {
        c(i, 65536);
        cl_82 cl_82Var = this.c;
        if (cl_82Var.B() < 2) {
            flush();
        }
        cl_82Var.write(i >> 8);
        cl_82Var.write(i);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        cl_82 cl_82Var = this.c;
        SSLSocketImpl sSLSocketImpl = this.a;
        if (sSLSocketImpl == null) {
            this.b.i((cl_30) cl_82Var);
            return;
        }
        try {
            sSLSocketImpl.w(cl_82Var);
        } catch (IOException e) {
            sSLSocketImpl.B(true);
            throw e;
        }
    }

    public final void k(int i) {
        c(i, 16777216);
        cl_82 cl_82Var = this.c;
        if (cl_82Var.B() < 3) {
            flush();
        }
        cl_82Var.write(i >> 16);
        cl_82Var.write(i >> 8);
        cl_82Var.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        cl_82 cl_82Var = this.c;
        while (i2 > 0) {
            int min = Math.min(i2, cl_82Var.B());
            if (min == 0) {
                flush();
            } else {
                cl_82Var.write(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        cl_82 cl_82Var = this.c;
        if (cl_82Var.B() < 1) {
            flush();
        }
        cl_82Var.write(i);
    }
}
