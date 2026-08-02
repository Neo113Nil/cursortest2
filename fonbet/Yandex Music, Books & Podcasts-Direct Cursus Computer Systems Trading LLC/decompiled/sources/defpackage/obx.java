package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class obx implements Iterable, Serializable {
    public static final obx c = new obx(ybx.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i = jbx.a;
    }

    public obx(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int s(int i, int i2, int i3) {
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

    public static obx t(int i, byte[] bArr) {
        s(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new obx(bArr2);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof obx) || o() != ((obx) obj).o()) {
            return false;
        }
        if (o() == 0) {
            return true;
        }
        if (!(obj instanceof obx)) {
            return obj.equals(this);
        }
        obx obxVar = (obx) obj;
        int i = this.a;
        int i2 = obxVar.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int o = o();
        if (o > obxVar.o()) {
            tiu.e(o, o());
            return false;
        }
        if (o > obxVar.o()) {
            xq0.x(f1d.e(o, obxVar.o(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = obxVar.b;
        int n = n() + o;
        int n2 = n();
        int n3 = obxVar.n();
        while (n2 < n) {
            if (this.b[n2] != bArr[n3]) {
                return false;
            }
            n2++;
            n3++;
        }
        return true;
    }

    public byte g(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int o = o();
        int n = n();
        byte[] bArr = ybx.a;
        int i2 = o;
        for (int i3 = n; i3 < n + o; i3++) {
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
        return 0;
    }

    public int o() {
        return this.b.length;
    }

    public void q(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.b, n(), o());
    }

    public final String toString() {
        obx lbxVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o = o();
        if (o() <= 50) {
            concat = szf.x0(this);
        } else {
            int s = s(0, 47, o());
            if (s == 0) {
                lbxVar = c;
            } else {
                lbxVar = new lbx(this.b, n(), s);
            }
            concat = szf.x0(lbxVar).concat("...");
        }
        return su4.o(f1d.l(o, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }

    public final byte[] u() {
        int o = o();
        if (o == 0) {
            return ybx.a;
        }
        byte[] bArr = new byte[o];
        q(o, bArr);
        return bArr;
    }
}
