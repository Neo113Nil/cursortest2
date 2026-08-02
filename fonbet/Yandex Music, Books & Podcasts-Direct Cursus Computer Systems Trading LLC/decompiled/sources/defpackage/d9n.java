package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class d9n extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ f9n c;

    public d9n(f9n f9nVar, c9n c9nVar) {
        this.c = f9nVar;
        this.a = f9nVar.Q(c9nVar.b + 4);
        this.b = c9nVar.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            jj4.j("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        f9n f9nVar = this.c;
        f9nVar.I(i4, i, i2, bArr);
        this.a = f9nVar.Q(this.a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        f9n f9nVar = this.c;
        RandomAccessFile randomAccessFile = f9nVar.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = f9nVar.Q(this.a + 1);
        this.b--;
        return read;
    }
}
