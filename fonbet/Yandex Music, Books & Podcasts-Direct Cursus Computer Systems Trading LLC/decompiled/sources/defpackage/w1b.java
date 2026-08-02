package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1b {
    public final ArrayList a;
    public final p43 b;

    public w1b(ArrayList arrayList, p43 p43Var) {
        this.a = arrayList;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1b)) {
            return false;
        }
        w1b w1bVar = (w1b) obj;
        return this.a.equals(w1bVar.a) && Intrinsics.d(this.b, w1bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "EditorialWaveAgentsHolder(items=" + this.a + ", analytics=" + this.b + ")";
    }
}
