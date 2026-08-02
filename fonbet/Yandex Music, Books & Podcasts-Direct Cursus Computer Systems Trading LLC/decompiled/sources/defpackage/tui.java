package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tui {
    public static final tui d = new tui(null, c5b.a, null);
    public final String a;
    public final List b;
    public final ap0 c;

    public tui(String str, List list, ap0 ap0Var) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = ap0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tui)) {
            return false;
        }
        tui tuiVar = (tui) obj;
        return Intrinsics.d(this.a, tuiVar.a) && Intrinsics.d(this.b, tuiVar.b) && Intrinsics.d(this.c, tuiVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int d2 = k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        ap0 ap0Var = this.c;
        return d2 + (ap0Var != null ? ap0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ouj.v("MyShelfScreenEntities(title=", this.a, ", entities=", ", pager=", this.b);
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}
