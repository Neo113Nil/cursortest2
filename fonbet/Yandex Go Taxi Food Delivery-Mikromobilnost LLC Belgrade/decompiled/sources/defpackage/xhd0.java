package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class xhd0 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    public xhd0(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z, int i) {
        LinkedHashMap f = (i & 1) != 0 ? b.f() : linkedHashMap;
        LinkedHashMap f2 = (i & 2) != 0 ? b.f() : linkedHashMap2;
        Map f3 = b.f();
        z = (i & 8) != 0 ? false : z;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhd0)) {
            return false;
        }
        xhd0 xhd0Var = (xhd0) obj;
        return jl40.l(this.a, xhd0Var.a) && jl40.l(this.b, xhd0Var.b) && jl40.l(this.c, xhd0Var.c) && this.d == xhd0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.d(unr0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPlaqueExternalContext(conditionValues=");
        sb.append(this.a);
        sb.append(", templates=");
        sb.append(this.b);
        sb.append(", switchesStates=");
        sb.append(this.c);
        sb.append(", defaultSwitchState=");
        return unr0.u(sb, this.d, ')');
    }

    public xhd0() {
        this(null, null, false, 15);
    }
}
