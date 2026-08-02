package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class qn3 implements Iterable, Serializable {
    public static final ln3 b = new ln3(vse.b);
    public static final gn3 c;
    private static final long serialVersionUID = 1;
    public int a;

    static {
        c = ib0.a() ? new mvt(16) : new mvn(16);
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

    public static ln3 n(byte[] bArr, int i, int i2) {
        g(i, i + i2, bArr.length);
        return new ln3(c.b(bArr, i, i2));
    }

    public abstract byte a(int i);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        ln3 ln3Var = (ln3) this;
        int q = ln3Var.q();
        int i2 = size;
        for (int i3 = q; i3 < q + size; i3++) {
            i2 = (i2 * 31) + ln3Var.d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public abstract byte o(int i);

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = u1g.C(this);
        } else {
            ln3 ln3Var = (ln3) this;
            int g = g(0, 47, ln3Var.size());
            concat = u1g.C(g == 0 ? b : new dn3(ln3Var.d, ln3Var.q(), g)).concat("...");
        }
        return su4.o(f1d.l(size, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
