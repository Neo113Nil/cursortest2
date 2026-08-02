package defpackage;

import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class w971 implements bb71 {
    public final jz61 b;
    public final long c;
    public long w;
    public int y;
    public int z;
    public byte[] x = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        xc81.a("goog.exo.extractor");
    }

    public w971(jz61 jz61Var, long j, long j2) {
        this.b = jz61Var;
        this.w = j;
        this.c = j2;
    }

    @Override // defpackage.bb71
    public final boolean E(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.z;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.x, 0, bArr, i, min);
            d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.w += i3;
        }
        return i3 != -1;
    }

    @Override // defpackage.bb71
    public final boolean I(byte[] bArr, int i, int i2, boolean z) {
        if (!c(i2, z)) {
            return false;
        }
        System.arraycopy(this.x, this.y - i2, bArr, i, i2);
        return true;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int v = this.b.v(i + i3, i2 - i3, bArr);
        if (v != -1) {
            return i3 + v;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        ny61.b();
        return 0;
    }

    @Override // defpackage.bb71
    public final void b(int i) {
        int min = Math.min(this.z, i);
        d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = a(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.w += i2;
        }
    }

    public final boolean c(int i, boolean z) {
        int i2 = this.y + i;
        byte[] bArr = this.x;
        if (i2 > bArr.length) {
            int i3 = rf71.a;
            this.x = Arrays.copyOf(this.x, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int i4 = this.z - this.y;
        while (i4 < i) {
            w971 w971Var = this;
            int i5 = i;
            boolean z2 = z;
            i4 = w971Var.a(this.x, this.y, i5, i4, z2);
            if (i4 == -1) {
                return false;
            }
            w971Var.z = w971Var.y + i4;
            this = w971Var;
            i = i5;
            z = z2;
        }
        this.y += i;
        return true;
    }

    public final void d(int i) {
        int i2 = this.z - i;
        this.z = i2;
        this.y = 0;
        byte[] bArr = this.x;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.x = bArr2;
    }

    @Override // defpackage.bb71
    public final long e() {
        return this.w + this.y;
    }

    public final int f(int i, int i2, byte[] bArr) {
        w971 w971Var;
        int min;
        int i3 = this.y + i2;
        byte[] bArr2 = this.x;
        if (i3 > bArr2.length) {
            int i4 = rf71.a;
            this.x = Arrays.copyOf(this.x, Math.max(65536 + i3, Math.min(bArr2.length * 2, i3 + 524288)));
        }
        int i5 = this.z;
        int i6 = this.y;
        int i7 = i5 - i6;
        if (i7 == 0) {
            w971Var = this;
            min = w971Var.a(this.x, i6, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            w971Var.z += min;
        } else {
            w971Var = this;
            min = Math.min(i2, i7);
        }
        System.arraycopy(w971Var.x, w971Var.y, bArr, i, min);
        w971Var.y += min;
        return min;
    }

    @Override // defpackage.bb71
    public final void s(int i, int i2, byte[] bArr) {
        I(bArr, i, i2, false);
    }

    @Override // defpackage.bb71
    public final void u(int i, int i2, byte[] bArr) {
        E(bArr, i, i2, false);
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        w971 w971Var;
        int i3 = this.z;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.x, 0, bArr, i, min);
            d(min);
            i4 = min;
        }
        if (i4 == 0) {
            w971Var = this;
            i4 = w971Var.a(bArr, i, i2, 0, true);
        } else {
            w971Var = this;
        }
        if (i4 != -1) {
            w971Var.w += i4;
        }
        return i4;
    }

    @Override // defpackage.bb71
    public final void e(int i) {
        c(i, false);
    }

    @Override // defpackage.bb71
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bb71
    public final void c() {
        this.y = 0;
    }

    @Override // defpackage.bb71
    public final long f() {
        return this.w;
    }
}
