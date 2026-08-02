package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ij {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final int[] d;
    public final long[] e;

    static {
        yut.d(0);
        yut.d(1);
        yut.d(2);
        yut.d(3);
        yut.d(4);
        yut.d(5);
        yut.d(6);
        yut.d(7);
    }

    public ij(int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
        vnj.n(iArr.length == uriArr.length);
        this.a = i;
        this.b = i2;
        this.d = iArr;
        this.c = uriArr;
        this.e = jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ij.class != obj.getClass()) {
            return false;
        }
        ij ijVar = (ij) obj;
        return this.a == ijVar.a && this.b == ijVar.b && Arrays.equals(this.c, ijVar.c) && Arrays.equals(this.d, ijVar.d) && Arrays.equals(this.e, ijVar.e);
    }

    public final int hashCode() {
        int i = (int) 0;
        return (((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((((((this.a * 31) + this.b) * 31) + i) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31) + i) * 31;
    }
}
