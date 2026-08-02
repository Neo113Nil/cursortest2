package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ptq {
    public final String a;
    public final List b;
    public final boolean c;

    public ptq(String str, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptq)) {
            return false;
        }
        ptq ptqVar = (ptq) obj;
        return Intrinsics.d(this.a, ptqVar.a) && Intrinsics.d(this.b, ptqVar.b) && this.c == ptqVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(ouj.v("SlideUiData(logoUrl=", this.a, ", slides=", ", withSound=", this.b), this.c, ")");
    }
}
