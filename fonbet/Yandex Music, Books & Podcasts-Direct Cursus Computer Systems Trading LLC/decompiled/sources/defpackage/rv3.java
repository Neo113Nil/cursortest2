package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rv3 extends uv3 {
    public final String a;
    public final List b;

    public rv3(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv3)) {
            return false;
        }
        rv3 rv3Var = (rv3) obj;
        return Intrinsics.d(this.a, rv3Var.a) && Intrinsics.d(this.b, rv3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("CHALLENGE_3DS(url=", this.a, ", trustedUrls=", ")", this.b);
    }
}
