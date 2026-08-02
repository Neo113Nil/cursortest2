package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tm2 {
    public final String a;
    public final String b;

    public tm2(String str) {
        String e = eta.e();
        this.a = str;
        this.b = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm2)) {
            return false;
        }
        tm2 tm2Var = (tm2) obj;
        return Intrinsics.d(this.a, tm2Var.a) && Intrinsics.d(this.b, tm2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("BarAboveAnalyticsPayload(entity=", this.a, ", id=", this.b, ")");
    }
}
