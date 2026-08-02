package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes13.dex */
public final class t850 {
    public final List a;
    public final Map b;

    public /* synthetic */ t850(int i) {
        this(EmptyList.a, b.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t850)) {
            return false;
        }
        t850 t850Var = (t850) obj;
        return jl40.l(this.a, t850Var.a) && jl40.l(this.b, t850Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationViewState(features=");
        sb.append(this.a);
        sb.append(", badges=");
        return smw0.n(sb, this.b, ')');
    }

    public t850(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public t850() {
        this(0);
    }
}
