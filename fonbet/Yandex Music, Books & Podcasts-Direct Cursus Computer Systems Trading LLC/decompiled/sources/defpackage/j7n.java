package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j7n extends k7n {
    public final String a;
    public final String b;

    public j7n(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.k7n
    public final String a() {
        return this.b;
    }

    @Override // defpackage.k7n
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7n)) {
            return false;
        }
        j7n j7nVar = (j7n) obj;
        return Intrinsics.d(this.a, j7nVar.a) && Intrinsics.d(this.b, j7nVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("Shimmer(title=", this.a, ", description=", this.b, ")");
    }
}
