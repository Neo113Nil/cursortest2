package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b5j {
    public final ArrayList a;
    public final p43 b;

    public b5j(ArrayList arrayList, p43 p43Var) {
        this.a = arrayList;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5j)) {
            return false;
        }
        b5j b5jVar = (b5j) obj;
        return this.a.equals(b5jVar.a) && Intrinsics.d(this.b, b5jVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "NewReleasesEntities(items=" + this.a + ", analytics=" + this.b + ")";
    }
}
