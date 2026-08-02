package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pgt extends cht {
    public final String a;
    public final List b;
    public final ahe c;

    public pgt(String str, List list, ahe aheVar) {
        list.getClass();
        aheVar.getClass();
        this.a = str;
        this.b = list;
        this.c = aheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgt)) {
            return false;
        }
        pgt pgtVar = (pgt) obj;
        return Intrinsics.d(this.a, pgtVar.a) && Intrinsics.d(this.b, pgtVar.b) && Intrinsics.d(this.c, pgtVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = ouj.v("Success(blockTitle=", this.a, ", items=", ", selected=", this.b);
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}
