package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nti implements oti {
    public final String a;
    public final ub7 b;

    public nti(String str, ub7 ub7Var) {
        str.getClass();
        this.a = str;
        this.b = ub7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nti)) {
            return false;
        }
        nti ntiVar = (nti) obj;
        return Intrinsics.d(this.a, ntiVar.a) && this.b.equals(ntiVar.b);
    }

    @Override // defpackage.oti
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(title=" + this.a + ", pagingItems=" + this.b + ")";
    }
}
