package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class xzz0 {
    public final int a;
    public final String b;
    public final int c;
    public final a[] d;
    public int e;

    static {
        tw21.Q(0);
        tw21.Q(1);
    }

    public xzz0(String str, a... aVarArr) {
        d6z.l(aVarArr.length > 0);
        this.b = str;
        this.d = aVarArr;
        this.a = aVarArr.length;
        int i = eh20.i(aVarArr[0].n);
        this.c = i == -1 ? eh20.i(aVarArr[0].m) : i;
        String str2 = aVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = aVarArr[0].f | 16384;
        for (int i3 = 1; i3 < aVarArr.length; i3++) {
            String str3 = aVarArr[i3].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i3, "languages", aVarArr[0].d, aVarArr[i3].d);
                return;
            } else {
                if (i2 != (aVarArr[i3].f | 16384)) {
                    b(i3, "role flags", Integer.toBinaryString(aVarArr[0].f), Integer.toBinaryString(aVarArr[i3].f));
                    return;
                }
            }
        }
    }

    public static void b(int i, String str, String str2, String str3) {
        StringBuilder v = b64.v("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        v.append(str3);
        v.append("' (track ");
        v.append(i);
        v.append(Extension.C_BRAKE);
        lk91.f("TrackGroup", "", new IllegalStateException(v.toString()));
    }

    public final int a(a aVar) {
        int i = 0;
        while (true) {
            a[] aVarArr = this.d;
            if (i >= aVarArr.length) {
                return -1;
            }
            if (aVar == aVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xzz0.class == obj.getClass()) {
            xzz0 xzz0Var = (xzz0) obj;
            if (this.b.equals(xzz0Var.b) && Arrays.equals(this.d, xzz0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + unr0.b(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + Extension.COLON_SPACE + Arrays.toString(this.d);
    }
}
