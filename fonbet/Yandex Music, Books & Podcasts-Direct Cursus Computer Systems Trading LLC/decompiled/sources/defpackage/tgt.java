package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tgt implements ght {
    public final String a;
    public final List b;
    public final oav c;

    public tgt(String str, List list, oav oavVar) {
        list.getClass();
        oavVar.getClass();
        this.a = str;
        this.b = list;
        this.c = oavVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgt)) {
            return false;
        }
        tgt tgtVar = (tgt) obj;
        return Intrinsics.d(this.a, tgtVar.a) && Intrinsics.d(this.b, tgtVar.b) && Intrinsics.d(this.c, tgtVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = ouj.v("Success(title=", this.a, ", entities=", ", selected=", this.b);
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}
