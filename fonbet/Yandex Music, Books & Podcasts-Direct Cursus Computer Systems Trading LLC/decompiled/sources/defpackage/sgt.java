package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sgt implements fht {
    public final String a;
    public final List b;
    public final glu c;

    public sgt(String str, List list, glu gluVar) {
        gluVar.getClass();
        this.a = str;
        this.b = list;
        this.c = gluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgt)) {
            return false;
        }
        sgt sgtVar = (sgt) obj;
        return Intrinsics.d(this.a, sgtVar.a) && this.b.equals(sgtVar.b) && Intrinsics.d(this.c, sgtVar.c);
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
