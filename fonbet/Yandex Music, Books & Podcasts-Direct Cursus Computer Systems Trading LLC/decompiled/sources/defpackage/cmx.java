package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class cmx implements Iterable, Serializable {
    public static final cmx c = new cmx(smx.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = ulx.a;
    }

    public cmx(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void o(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        e7o.o(k5r.i(i, "End index: 47 >= "));
    }

    public byte a(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cmx) && n() == ((cmx) obj).n()) {
            if (n() == 0) {
                return true;
            }
            if (!(obj instanceof cmx)) {
                return obj.equals(this);
            }
            cmx cmxVar = (cmx) obj;
            int i = this.a;
            int i2 = cmxVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int n = n();
                if (n > cmxVar.n()) {
                    tiu.e(n, n());
                    return false;
                }
                if (n > cmxVar.n()) {
                    xq0.x(f1d.e(n, cmxVar.n(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = cmxVar.b;
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
        Charset charset = smx.a;
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
            concat = o2g.s0(this);
        } else {
            o(n());
            concat = o2g.s0(new wlx(this.b)).concat("...");
        }
        return su4.o(f1d.l(n, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
