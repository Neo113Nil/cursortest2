package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class thd0 implements whd0 {
    public final String a;
    public final Map b;

    public thd0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final Map a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thd0)) {
            return false;
        }
        thd0 thd0Var = (thd0) obj;
        return jl40.l(this.a, thd0Var.a) && jl40.l(this.b, thd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSpecific(type=");
        sb.append(this.a);
        sb.append(", items=");
        return smw0.n(sb, this.b, ')');
    }
}
