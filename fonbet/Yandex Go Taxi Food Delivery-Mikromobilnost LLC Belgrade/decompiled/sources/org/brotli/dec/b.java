package org.brotli.dec;

import defpackage.b64;
import defpackage.dac;
import defpackage.i3u0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class b extends InputStream {
    public final byte[] a;
    public int b;
    public int c;
    public final i3u0 w;

    public b(InputStream inputStream) {
        i3u0 i3u0Var = new i3u0();
        this.w = i3u0Var;
        if (inputStream == null) {
            ny61.g("source is null");
            throw null;
        }
        this.a = new byte[16384];
        this.b = 0;
        this.c = 0;
        try {
            i3u0.a(i3u0Var, inputStream);
        } catch (BrotliRuntimeException e) {
            dac.g("Brotli decoder initialization failed", e);
            throw null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i3u0 i3u0Var = this.w;
        int i = i3u0Var.a;
        if (i == 0) {
            ny61.r("State MUST be initialized");
            return;
        }
        if (i == 11) {
            return;
        }
        i3u0Var.a = 11;
        a aVar = i3u0Var.c;
        InputStream inputStream = aVar.d;
        aVar.d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        i3u0 i3u0Var = this.w;
        if (i < 0) {
            ny61.g(oyr.i(i, "Bad offset: "));
            return 0;
        }
        if (i2 < 0) {
            ny61.g(oyr.i(i2, "Bad length: "));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            xfo.k(b64.t(i3, "Buffer overflow: ", " > "), bArr.length);
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int max = Math.max(this.b - this.c, 0);
        if (max != 0) {
            max = Math.min(max, i2);
            System.arraycopy(this.a, this.c, bArr, i, max);
            this.c += max;
            i += max;
            i2 -= max;
            if (i2 == 0) {
                return max;
            }
        }
        try {
            i3u0Var.Y = bArr;
            i3u0Var.T = i;
            i3u0Var.U = i2;
            i3u0Var.V = 0;
            c.d(i3u0Var);
            int i4 = i3u0Var.V;
            if (i4 == 0) {
                return -1;
            }
            return i4 + max;
        } catch (BrotliRuntimeException e) {
            dac.g("Brotli stream decoding failed", e);
            return 0;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.c;
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i >= i2) {
            int read = read(bArr, 0, bArr.length);
            this.b = read;
            this.c = 0;
            if (read == -1) {
                return -1;
            }
        }
        int i3 = this.c;
        this.c = i3 + 1;
        return bArr[i3] & 255;
    }
}
