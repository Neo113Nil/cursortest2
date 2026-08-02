package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g58 {
    public final String a;
    public final String b;

    public g58(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g58)) {
            return false;
        }
        g58 g58Var = (g58) obj;
        return Intrinsics.d(this.a, g58Var.a) && Intrinsics.d(this.b, g58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("DisclaimerDetailsUiData(title=", this.a, ", url=", this.b, ")");
    }
}
