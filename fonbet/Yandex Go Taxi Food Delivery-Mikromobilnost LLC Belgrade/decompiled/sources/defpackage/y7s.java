package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class y7s implements h8s {
    public final c8s a;
    public final List b;

    public y7s(c8s c8sVar, List list) {
        this.a = c8sVar;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7s)) {
            return false;
        }
        y7s y7sVar = (y7s) obj;
        return jl40.l(this.a, y7sVar.a) && jl40.l(this.b, y7sVar.b);
    }

    public final int hashCode() {
        c8s c8sVar = this.a;
        return this.b.hashCode() + ((c8sVar == null ? 0 : c8sVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Container(groupAttributes=");
        sb.append(this.a);
        sb.append(", items=");
        return unr0.t(sb, this.b, ')');
    }

    public y7s() {
        this(null, EmptyList.a);
    }
}
