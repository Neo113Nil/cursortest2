package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class nn3 implements Iterable, Serializable {
    public static final kn3 b = new kn3(use.b);
    public static final fn3 c;
    private static final long serialVersionUID = 1;
    public int a;

    static {
        c = hb0.a() ? new imp() : new b3i(16);
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

    public static kn3 n(byte[] bArr, int i, int i2) {
        g(i, i + i2, bArr.length);
        return new kn3(c.b(bArr, i, i2));
    }

    public static kn3 o(String str) {
        return new kn3(str.getBytes(use.a));
    }

    public abstract byte a(int i);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            i = u(size, size);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract void q(int i, byte[] bArr);

    public abstract byte r(int i);

    public abstract boolean s();

    public abstract int size();

    public abstract qr4 t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return su4.o(f1d.l(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? p1g.A(this) : p1g.A(v(47)).concat("..."), "\">");
    }

    public abstract int u(int i, int i2);

    public abstract nn3 v(int i);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return use.b;
        }
        byte[] bArr = new byte[size];
        q(size, bArr);
        return bArr;
    }

    public abstract String x(Charset charset);

    public final String y() {
        return size() == 0 ? "" : x(use.a);
    }

    public abstract void z(yr4 yr4Var);
}
