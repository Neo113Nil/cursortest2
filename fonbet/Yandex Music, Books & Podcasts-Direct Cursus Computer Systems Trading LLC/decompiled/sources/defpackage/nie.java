package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class nie extends r5g {
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public nie(int i, InputStream inputStream) {
        super(i, inputStream);
        this.e = false;
        this.f = true;
        this.c = inputStream.read();
        int read = inputStream.read();
        this.d = read;
        if (read >= 0) {
            b();
        } else {
            xq0.v();
            throw null;
        }
    }

    public final boolean b() {
        if (!this.e && this.f && this.c == 0 && this.d == 0) {
            this.e = true;
            a();
        }
        return this.e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.e) {
            return -1;
        }
        InputStream inputStream = this.a;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            xq0.v();
            return 0;
        }
        bArr[i] = (byte) this.c;
        bArr[i + 1] = (byte) this.d;
        this.c = inputStream.read();
        int read2 = inputStream.read();
        this.d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        xq0.v();
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (b()) {
            return -1;
        }
        int read = this.a.read();
        if (read >= 0) {
            int i = this.c;
            this.c = this.d;
            this.d = read;
            return i;
        }
        xq0.v();
        return 0;
    }
}
