package defpackage;

import java.util.Objects;

/* loaded from: classes9.dex */
public final class yzy0 {
    public final xzy0 a;
    public final String b;

    public yzy0(xzy0 xzy0Var, String str) {
        this.a = xzy0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !yzy0.class.equals(obj.getClass())) {
            return false;
        }
        yzy0 yzy0Var = (yzy0) obj;
        String str = yzy0Var.b;
        String str2 = this.b;
        return (str == null && str2 == null) ? jl40.l(yzy0Var.a.a, this.a.a) : cvu0.t(str2, str, false);
    }

    public final int hashCode() {
        String str = this.b;
        return str == null ? Objects.hash(this.a.a) : Objects.hash(str);
    }
}
