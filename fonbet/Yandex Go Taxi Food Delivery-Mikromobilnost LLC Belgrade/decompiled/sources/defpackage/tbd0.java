package defpackage;

import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import java.util.Map;

/* loaded from: classes8.dex */
public final class tbd0 {
    public final PlusPayEvent$Type a;
    public final String b;
    public final sbd0 c;
    public final Throwable d;

    public tbd0(PlusPayEvent$Type plusPayEvent$Type, String str, sbd0 sbd0Var, Throwable th) {
        this.a = plusPayEvent$Type;
        this.b = str;
        this.c = sbd0Var;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbd0)) {
            return false;
        }
        tbd0 tbd0Var = (tbd0) obj;
        return this.a == tbd0Var.a && jl40.l(this.b, tbd0Var.b) && jl40.l(this.c, tbd0Var.c) && jl40.l(this.d, tbd0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Throwable th = this.d;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayEvent(type=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", error=");
        return unr0.s(sb, this.d, ')');
    }

    public tbd0(PlusPayEvent$Type plusPayEvent$Type, String str, Map map, Throwable th) {
        this(plusPayEvent$Type, str, new qbd0(map), th);
    }

    public tbd0(PlusPayEvent$Type plusPayEvent$Type, String str, String str2, Throwable th) {
        this(plusPayEvent$Type, str, new rbd0(str2), th);
    }
}
