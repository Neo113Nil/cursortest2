package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class mn3 implements Iterable, Serializable {
    public static final jn3 b = new jn3(tse.b);
    public static final en3 c;
    public int a;

    static {
        c = gb0.a() ? new ogp() : new x2i(16);
    }

    public static int g(int i, int i2, int i3) {
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

    public static jn3 n(byte[] bArr, int i, int i2) {
        g(i, i + i2, bArr.length);
        return new jn3(c.b(bArr, i, i2));
    }

    public abstract byte a(int i);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        jn3 jn3Var = (jn3) this;
        int s = jn3Var.s();
        int i2 = size;
        for (int i3 = s; i3 < s + size; i3++) {
            i2 = (i2 * 31) + jn3Var.d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new an3(this);
    }

    public abstract void o(int i, byte[] bArr);

    public abstract byte q(int i);

    public final byte[] r() {
        int size = size();
        if (size == 0) {
            return tse.b;
        }
        byte[] bArr = new byte[size];
        o(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = cb0.v(this);
        } else {
            jn3 jn3Var = (jn3) this;
            int g = g(0, 47, jn3Var.size());
            concat = cb0.v(g == 0 ? b : new bn3(jn3Var.d, jn3Var.s(), g)).concat("...");
        }
        return su4.o(f1d.l(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
