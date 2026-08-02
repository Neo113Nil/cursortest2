package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r14 {
    public final ArrayList a;
    public final p43 b;

    public r14(ArrayList arrayList, p43 p43Var) {
        this.a = arrayList;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r14)) {
            return false;
        }
        r14 r14Var = (r14) obj;
        return this.a.equals(r14Var.a) && Intrinsics.d(this.b, r14Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "CarouselEntities(items=" + this.a + ", analytics=" + this.b + ")";
    }
}
