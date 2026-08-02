package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r60 {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final fe10[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;

    static {
        x4e.x(0, 1, 2, 3, 4);
        x4e.x(5, 6, 7, 8, 9);
        tw21.Q(10);
    }

    public r60(int i, int i2, int[] iArr, fe10[] fe10VarArr, long[] jArr, String[] strArr) {
        Uri uri;
        int i3 = 0;
        d6z.l(iArr.length == fe10VarArr.length);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = fe10VarArr;
        this.f = jArr;
        this.c = new Uri[fe10VarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 >= uriArr.length) {
                this.g = strArr;
                return;
            }
            fe10 fe10Var = fe10VarArr[i3];
            if (fe10Var == null) {
                uri = null;
            } else {
                zd10 zd10Var = fe10Var.b;
                zd10Var.getClass();
                uri = zd10Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r60.class != obj.getClass()) {
            return false;
        }
        r60 r60Var = (r60) obj;
        return this.a == r60Var.a && this.b == r60Var.b && Arrays.equals(this.d, r60Var.d) && Arrays.equals(this.e, r60Var.e) && Arrays.equals(this.f, r60Var.f) && Arrays.equals(this.g, r60Var.g);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.a * 31) + this.b) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.g)) * 31;
    }
}
