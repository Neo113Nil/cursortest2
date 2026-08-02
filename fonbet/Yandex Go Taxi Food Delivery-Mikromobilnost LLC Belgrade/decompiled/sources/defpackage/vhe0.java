package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class vhe0 implements eie0 {
    public final String a;
    public final HashSet b;

    public vhe0(String str, HashSet hashSet) {
        this.a = str;
        this.b = hashSet;
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhe0)) {
            return false;
        }
        vhe0 vhe0Var = (vhe0) obj;
        return jl40.l(this.a, vhe0Var.a) && this.b.equals(vhe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InSet(argName=" + this.a + ", set=" + this.b + ')';
    }
}
