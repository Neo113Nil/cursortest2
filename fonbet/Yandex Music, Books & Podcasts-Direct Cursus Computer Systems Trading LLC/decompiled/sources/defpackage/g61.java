package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g61 {
    public final ArrayList a;
    public final p43 b;

    public g61(ArrayList arrayList, p43 p43Var) {
        this.a = arrayList;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g61)) {
            return false;
        }
        g61 g61Var = (g61) obj;
        return this.a.equals(g61Var.a) && Intrinsics.d(this.b, g61Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistDonationsBlockData(donations=" + this.a + ", analytics=" + this.b + ")";
    }
}
