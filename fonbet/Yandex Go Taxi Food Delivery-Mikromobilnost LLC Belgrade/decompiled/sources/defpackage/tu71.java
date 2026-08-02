package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class tu71 implements kq71 {
    public static final su71 y = new su71(0);
    public final int a;
    public final String b;
    public final int c;
    public final qd81[] w;
    public int x;

    public tu71(String str, qd81... qd81VarArr) {
        if (qd81VarArr.length <= 0) {
            w511.q();
            throw null;
        }
        this.b = str;
        this.w = qd81VarArr;
        this.a = qd81VarArr.length;
        int e = g681.e(qd81VarArr[0].E);
        this.c = e == -1 ? g681.e(qd81VarArr[0].D) : e;
        String str2 = qd81VarArr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = qd81VarArr[0].x | 16384;
        int i2 = 1;
        while (true) {
            qd81[] qd81VarArr2 = this.w;
            if (i2 >= qd81VarArr2.length) {
                return;
            }
            String str3 = qd81VarArr2[i2].c;
            boolean equals = str2.equals((str3 == null || str3.equals("und")) ? "" : str3);
            qd81[] qd81VarArr3 = this.w;
            if (!equals) {
                nba1.c("TrackGroup", nba1.b("", new IllegalStateException(oyr.m(i2, Extension.C_BRAKE, b64.v("Different languages combined in one TrackGroup: '", qd81VarArr3[0].c, "' (track 0) and '", qd81VarArr3[i2].c, "' (track ")))));
                return;
            } else {
                if (i != (qd81VarArr3[i2].x | 16384)) {
                    nba1.c("TrackGroup", nba1.b("", new IllegalStateException(oyr.m(i2, Extension.C_BRAKE, b64.v("Different role flags combined in one TrackGroup: '", Integer.toBinaryString(qd81VarArr3[0].x), "' (track 0) and '", Integer.toBinaryString(this.w[i2].x), "' (track ")))));
                    return;
                }
                i2++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tu71.class == obj.getClass()) {
            tu71 tu71Var = (tu71) obj;
            if (this.b.equals(tu71Var.b) && Arrays.equals(this.w, tu71Var.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.x == 0) {
            this.x = z2a1.a(527, this.b) + Arrays.hashCode(this.w);
        }
        return this.x;
    }
}
