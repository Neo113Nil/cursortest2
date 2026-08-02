package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class sqv extends ufy {
    public int c;
    public int w;
    public boolean x;
    public boolean y;

    public sqv(int i, InputStream inputStream) {
        super(i, inputStream);
        this.x = false;
        this.y = true;
        this.c = inputStream.read();
        int read = inputStream.read();
        this.w = read;
        if (read >= 0) {
            c();
        } else {
            ny61.b();
            throw null;
        }
    }

    public final boolean c() {
        if (!this.x && this.y && this.c == 0 && this.w == 0) {
            this.x = true;
            a();
        }
        return this.x;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.y || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.x) {
            return -1;
        }
        InputStream inputStream = this.a;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            ny61.b();
            return 0;
        }
        bArr[i] = (byte) this.c;
        bArr[i + 1] = (byte) this.w;
        this.c = inputStream.read();
        int read2 = inputStream.read();
        this.w = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        ny61.b();
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (c()) {
            return -1;
        }
        int read = this.a.read();
        if (read < 0) {
            ny61.b();
            return 0;
        }
        int i = this.c;
        this.c = this.w;
        this.w = read;
        return i;
    }
}
