package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class shd0 implements whd0 {
    public final String a;
    public final boolean b;
    public final Map c;

    public shd0(String str, boolean z, Map map) {
        this.a = str;
        this.b = z;
        this.c = map;
    }

    public final Map a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shd0)) {
            return false;
        }
        shd0 shd0Var = (shd0) obj;
        return jl40.l(this.a, shd0Var.a) && this.b == shd0Var.b && jl40.l(this.c, shd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemotePerformAction(actionId=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        sb.append(this.b);
        sb.append(", meta=");
        return smw0.n(sb, this.c, ')');
    }
}
