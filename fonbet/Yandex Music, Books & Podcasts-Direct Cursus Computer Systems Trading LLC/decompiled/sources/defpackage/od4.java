package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class od4 extends qae {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final qae[] f;

    public od4(String str, boolean z, boolean z2, String[] strArr, qae[] qaeVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = qaeVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || od4.class != obj.getClass()) {
            return false;
        }
        od4 od4Var = (od4) obj;
        return this.c == od4Var.c && this.d == od4Var.d && this.b.equals(od4Var.b) && Arrays.equals(this.e, od4Var.e) && Arrays.equals(this.f, od4Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
