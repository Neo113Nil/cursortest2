package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2b {
    public final List a;
    public final p43 b;

    public g2b(List list, p43 p43Var) {
        this.a = list;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2b)) {
            return false;
        }
        g2b g2bVar = (g2b) obj;
        return this.a.equals(g2bVar.a) && Intrinsics.d(this.b, g2bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "EditorialWavesHolder(items=" + this.a + ", analytics=" + this.b + ")";
    }
}
