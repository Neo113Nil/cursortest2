package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class af5 {
    public final String a;
    public final n1p b;

    public af5(String str, n1p n1pVar) {
        str.getClass();
        this.a = str;
        this.b = n1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af5)) {
            return false;
        }
        af5 af5Var = (af5) obj;
        return Intrinsics.d(this.a, af5Var.a) && Intrinsics.d(this.b, af5Var.b);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(this.a.hashCode() * 31, 31, false), 31, false);
        n1p n1pVar = this.b;
        return e + (n1pVar != null ? n1pVar.hashCode() : 0);
    }

    public final String toString() {
        return "CommonSearchRequest(query=" + this.a + ", voiceSearch=false, disableCorrection=false, selectedFilter=" + this.b + ")";
    }
}
