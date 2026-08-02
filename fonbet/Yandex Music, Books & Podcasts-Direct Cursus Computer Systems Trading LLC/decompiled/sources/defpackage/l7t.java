package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l7t {
    public final mn0 a;
    public final mnj b;

    public l7t(mn0 mn0Var, mnj mnjVar) {
        this.a = mn0Var;
        this.b = mnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7t)) {
            return false;
        }
        l7t l7tVar = (l7t) obj;
        return Intrinsics.d(this.a, l7tVar.a) && this.b.equals(l7tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
