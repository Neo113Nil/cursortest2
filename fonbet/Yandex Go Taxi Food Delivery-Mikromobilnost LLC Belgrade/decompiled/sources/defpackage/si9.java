package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class si9 extends x5v {
    public final String b;
    public final boolean c;
    public final boolean w;
    public final String[] x;
    public final x5v[] y;

    public si9(String str, boolean z, boolean z2, String[] strArr, x5v[] x5vVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.w = z2;
        this.x = strArr;
        this.y = x5vVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || si9.class != obj.getClass()) {
            return false;
        }
        si9 si9Var = (si9) obj;
        return this.c == si9Var.c && this.w == si9Var.w && this.b.equals(si9Var.b) && Arrays.equals(this.x, si9Var.x) && Arrays.equals(this.y, si9Var.y);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31);
    }
}
