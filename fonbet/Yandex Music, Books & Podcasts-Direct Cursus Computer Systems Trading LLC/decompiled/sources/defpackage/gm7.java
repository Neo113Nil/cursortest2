package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gm7 implements s2c {
    public final ma7 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[SQLiteDatabase.OPEN_FULLMUTEX];
    public final byte[] a = new byte[4096];

    static {
        ynh.a("media3.extractor");
    }

    public gm7(ma7 ma7Var, long j, long j2) {
        this.b = ma7Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.s2c
    public final void A(byte[] bArr, int i, int i2) {
        l(bArr, i, i2, false);
    }

    public final boolean c(int i, boolean z) {
        d(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            int i3 = i;
            boolean z2 = z;
            i2 = f(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void d(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, dvt.i(bArr.length * 2, SQLiteDatabase.OPEN_FULLMUTEX + i2, i2 + 524288));
        }
    }

    public final int f(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        xq0.v();
        return 0;
    }

    public final void g(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[SQLiteDatabase.OPEN_FULLMUTEX + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.s2c
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.s2c
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.s2c
    public final boolean l(byte[] bArr, int i, int i2, boolean z) {
        if (!c(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.s2c
    public final void m(long j, IOException iOException) {
        vq1.v(j >= 0);
        this.d = j;
        throw iOException;
    }

    @Override // defpackage.s2c
    public final void n() {
        this.f = 0;
    }

    @Override // defpackage.s2c
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            g(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = f(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4 != -1;
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        gm7 gm7Var;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            g(min);
            i4 = min;
        }
        if (i4 == 0) {
            gm7Var = this;
            i4 = gm7Var.f(bArr, i, i2, 0, true);
        } else {
            gm7Var = this;
        }
        if (i4 != -1) {
            gm7Var.d += i4;
        }
        return i4;
    }

    @Override // defpackage.s2c
    public final void readFully(byte[] bArr, int i, int i2) {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.s2c
    public final long s() {
        return this.d + this.f;
    }

    @Override // defpackage.s2c
    public final void u(int i) {
        c(i, false);
    }

    @Override // defpackage.s2c
    public final int v(int i) {
        gm7 gm7Var;
        int min = Math.min(this.g, i);
        g(min);
        if (min == 0) {
            byte[] bArr = this.a;
            gm7Var = this;
            min = gm7Var.f(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            gm7Var = this;
        }
        if (min != -1) {
            gm7Var.d += min;
        }
        return min;
    }

    @Override // defpackage.s2c
    public final int w(byte[] bArr, int i, int i2) {
        gm7 gm7Var;
        int min;
        d(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            gm7Var = this;
            min = gm7Var.f(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            gm7Var.g += min;
        } else {
            gm7Var = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(gm7Var.e, gm7Var.f, bArr, i, min);
        gm7Var.f += min;
        return min;
    }

    @Override // defpackage.s2c
    public final void y(int i) {
        int min = Math.min(this.g, i);
        g(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = f(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }
}
