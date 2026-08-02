package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r9s {
    public final mn0 a;
    public mn0 b;
    public boolean c = false;
    public qgi d = null;

    public r9s(mn0 mn0Var, mn0 mn0Var2) {
        this.a = mn0Var;
        this.b = mn0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9s)) {
            return false;
        }
        r9s r9sVar = (r9s) obj;
        return Intrinsics.d(this.a, r9sVar.a) && Intrinsics.d(this.b, r9sVar.b) && this.c == r9sVar.c && Intrinsics.d(this.d, r9sVar.d);
    }

    public final int hashCode() {
        int e = k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        qgi qgiVar = this.d;
        return e + (qgiVar == null ? 0 : qgiVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
