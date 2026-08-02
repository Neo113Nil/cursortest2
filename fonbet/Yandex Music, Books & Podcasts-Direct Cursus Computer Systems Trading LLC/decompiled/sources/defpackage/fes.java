package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fes {
    public final b95 a;
    public final kes b;
    public final sqc c;

    public fes(b95 b95Var, kes kesVar, sqc sqcVar, int i) {
        kesVar = (i & 2) != 0 ? null : kesVar;
        sqcVar = (i & 4) != 0 ? null : sqcVar;
        this.a = b95Var;
        this.b = kesVar;
        this.c = sqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fes)) {
            return false;
        }
        fes fesVar = (fes) obj;
        return Intrinsics.d(this.a, fesVar.a) && Intrinsics.d(this.b, fesVar.b) && Intrinsics.d(this.c, fesVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kes kesVar = this.b;
        return (((hashCode + (kesVar != null ? Long.hashCode(kesVar.a) : 0)) * 31) + (this.c != null ? Integer.hashCode(500) : 0)) * 923521;
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=null, fontFamily=null)";
    }
}
