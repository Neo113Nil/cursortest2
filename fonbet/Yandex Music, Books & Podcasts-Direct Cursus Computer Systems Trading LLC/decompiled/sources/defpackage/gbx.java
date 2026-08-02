package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class gbx implements Iterable, Serializable {
    public static final gbx c = new gbx(xcx.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = qax.a;
    }

    public gbx(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            e7o.o(dfi.c(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            e7o.o(f1d.e(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        e7o.o(f1d.e(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static gbx q(byte[] bArr, int i, int i2) {
        o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new gbx(bArr2);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof gbx) && n() == ((gbx) obj).n()) {
            if (n() == 0) {
                return true;
            }
            if (!(obj instanceof gbx)) {
                return obj.equals(this);
            }
            gbx gbxVar = (gbx) obj;
            int i = this.a;
            int i2 = gbxVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int n = n();
                if (n > gbxVar.n()) {
                    tiu.e(n, n());
                    return false;
                }
                if (n > gbxVar.n()) {
                    xq0.x(f1d.e(n, gbxVar.n(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = gbxVar.b;
                int i3 = 0;
                int i4 = 0;
                while (i3 < n) {
                    if (this.b[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte g(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int n = n();
        int i2 = n;
        for (int i3 = 0; i3 < n; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new an3(this);
    }

    public int n() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int n = n();
        if (n() <= 50) {
            concat = g0g.Z(this);
        } else {
            int o = o(0, 47, n());
            concat = g0g.Z(o == 0 ? c : new ebx(this.b, o)).concat("...");
        }
        return su4.o(f1d.l(n, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
