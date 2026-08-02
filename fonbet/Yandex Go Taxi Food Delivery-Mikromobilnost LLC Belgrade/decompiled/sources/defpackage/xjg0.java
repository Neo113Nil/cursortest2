package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public final class xjg0 extends InputStream {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public final /* synthetic */ Object w;

    public xjg0(zjg0 zjg0Var, vjg0 vjg0Var) {
        this.w = zjg0Var;
        this.b = zjg0Var.k(vjg0Var.b + 4);
        this.c = vjg0Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.w;
        switch (i3) {
            case 0:
                zjg0 zjg0Var = (zjg0) obj;
                if (bArr == null) {
                    ny61.t("buffer");
                    return 0;
                }
                if ((i | i2) < 0 || i2 > bArr.length - i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i4 = this.c;
                if (i4 <= 0) {
                    return -1;
                }
                if (i2 > i4) {
                    i2 = i4;
                }
                zjg0Var.i(this.b, i, i2, bArr);
                this.b = zjg0Var.k(this.b + i2);
                this.c -= i2;
                return i2;
            default:
                akg0 akg0Var = (akg0) obj;
                if (bArr == null) {
                    ny61.t("buffer");
                    return 0;
                }
                if ((i | i2) < 0 || i2 > bArr.length - i) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i5 = this.c;
                if (i5 <= 0) {
                    return -1;
                }
                if (i2 > i5) {
                    i2 = i5;
                }
                akg0Var.v(this.b, i, i2, bArr);
                this.b = akg0Var.D(this.b + i2);
                this.c -= i2;
                return i2;
        }
    }

    public xjg0(akg0 akg0Var, wjg0 wjg0Var) {
        this.w = akg0Var;
        this.b = akg0Var.D(wjg0Var.a + 4);
        this.c = wjg0Var.b;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                zjg0 zjg0Var = (zjg0) obj;
                RandomAccessFile randomAccessFile = zjg0Var.a;
                if (this.c == 0) {
                    return -1;
                }
                randomAccessFile.seek(this.b);
                int read = randomAccessFile.read();
                this.b = zjg0Var.k(this.b + 1);
                this.c--;
                return read;
            default:
                akg0 akg0Var = (akg0) obj;
                RandomAccessFile randomAccessFile2 = akg0Var.a;
                if (this.c == 0) {
                    return -1;
                }
                randomAccessFile2.seek(this.b);
                int read2 = randomAccessFile2.read();
                this.b = akg0Var.D(this.b + 1);
                this.c--;
                return read2;
        }
    }
}
