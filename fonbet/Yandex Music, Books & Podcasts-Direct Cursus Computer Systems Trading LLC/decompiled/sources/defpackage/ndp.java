package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ndp {
    public final String a;
    public final tx3 b;

    public ndp(String str, tx3 tx3Var) {
        str.getClass();
        this.a = str;
        this.b = tx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndp)) {
            return false;
        }
        ndp ndpVar = (ndp) obj;
        return Intrinsics.d(this.a, ndpVar.a) && this.b.equals(ndpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedItemInfo(key=" + this.a + ", selection=" + this.b + ")";
    }
}
