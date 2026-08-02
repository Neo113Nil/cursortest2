package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d3t {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final xvs b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i2 = dvt.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public d3t(xvs xvsVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = xvsVar.a;
        this.a = i2;
        boolean z2 = false;
        vq1.v(i2 == iArr.length && i2 == zArr.length);
        this.b = xvsVar;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final dsc a(int i2) {
        return this.b.d[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d3t.class == obj.getClass()) {
            d3t d3tVar = (d3t) obj;
            if (this.c == d3tVar.c && this.b.equals(d3tVar.b) && Arrays.equals(this.d, d3tVar.d) && Arrays.equals(this.e, d3tVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
