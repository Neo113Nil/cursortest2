package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r41 implements t41 {
    public final String a;
    public final List b;
    public final boolean c;

    public r41(String str, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r41)) {
            return false;
        }
        r41 r41Var = (r41) obj;
        return Intrinsics.d(this.a, r41Var.a) && Intrinsics.d(this.b, r41Var.b) && this.c == r41Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(ouj.v("Loaded(artistTitle=", this.a, ", concerts=", ", isRefreshing=", this.b), this.c, ")");
    }
}
