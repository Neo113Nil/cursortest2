package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jj {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final onh[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final long i;
    public final boolean j;
    public final boolean k;

    static {
        int i = dvt.a;
        l = Integer.toString(0, 36);
        m = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        o = Integer.toString(3, 36);
        p = Integer.toString(4, 36);
        q = Integer.toString(5, 36);
        r = Integer.toString(6, 36);
        s = Integer.toString(7, 36);
        t = Integer.toString(8, 36);
        u = Integer.toString(9, 36);
        v = Integer.toString(10, 36);
    }

    public jj(long j, int i, int i2, int[] iArr, onh[] onhVarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        vq1.v(iArr.length == onhVarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = onhVarArr;
        this.g = jArr;
        this.i = j2;
        this.j = z;
        this.d = new Uri[onhVarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.k = z2;
                return;
            }
            onh onhVar = onhVarArr[i3];
            if (onhVar == null) {
                uri = null;
            } else {
                gnh gnhVar = onhVar.b;
                gnhVar.getClass();
                uri = gnhVar.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.j || (i2 = iArr[i3]) == 0 || i2 == 1) {
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
        if (obj != null && jj.class == obj.getClass()) {
            jj jjVar = (jj) obj;
            if (this.a == jjVar.a && this.b == jjVar.b && this.c == jjVar.c && Arrays.equals(this.e, jjVar.e) && Arrays.equals(this.f, jjVar.f) && Arrays.equals(this.g, jjVar.g) && this.i == jjVar.i && this.j == jjVar.j && Arrays.equals(this.h, jjVar.h) && this.k == jjVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int hashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.i;
        return ((((((hashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.j ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + (this.k ? 1 : 0);
    }
}
