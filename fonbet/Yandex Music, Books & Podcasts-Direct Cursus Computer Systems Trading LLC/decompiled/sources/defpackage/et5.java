package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class et5 {
    public final String a;
    public final List b;

    public et5(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et5)) {
            return false;
        }
        et5 et5Var = (et5) obj;
        return Intrinsics.d(this.a, et5Var.a) && Intrinsics.d(this.b, et5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dfi.h("ConcertCatalog(title=", this.a, ", items=", ")", this.b);
    }
}
