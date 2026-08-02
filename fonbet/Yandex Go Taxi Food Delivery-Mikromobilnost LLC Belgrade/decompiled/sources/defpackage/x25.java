package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final class x25 {
    public final String a;
    public final List b;
    public final boolean c;

    public x25(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x25)) {
            return false;
        }
        x25 x25Var = (x25) obj;
        return jl40.l(this.a, x25Var.a) && jl40.l(this.b, x25Var.b) && this.c == x25Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskData(pattern=");
        sb.append(this.a);
        sb.append(", decoding=");
        sb.append(this.b);
        sb.append(", alwaysVisible=");
        return unr0.u(sb, this.c, ')');
    }
}
