package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o31 {
    public final ArrayList a;
    public final p43 b;

    public o31(ArrayList arrayList, p43 p43Var) {
        this.a = arrayList;
        this.b = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o31)) {
            return false;
        }
        o31 o31Var = (o31) obj;
        return this.a.equals(o31Var.a) && Intrinsics.d(this.b, o31Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p43 p43Var = this.b;
        return hashCode + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistConcertsBlockData(concerts=" + this.a + ", analytics=" + this.b + ")";
    }
}
