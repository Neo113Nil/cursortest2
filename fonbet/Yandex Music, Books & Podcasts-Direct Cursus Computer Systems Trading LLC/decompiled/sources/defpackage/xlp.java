package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xlp {
    public final String a;
    public final s9p b;
    public final List c;

    public xlp(String str, s9p s9pVar, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = s9pVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlp)) {
            return false;
        }
        xlp xlpVar = (xlp) obj;
        return Intrinsics.d(this.a, xlpVar.a) && Intrinsics.d(this.b, xlpVar.b) && Intrinsics.d(this.c, xlpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s9p s9pVar = this.b;
        return this.c.hashCode() + ((hashCode + (s9pVar == null ? 0 : s9pVar.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionFeedbacks(rotorSessionId=");
        sb.append(this.a);
        sb.append(", seeds=");
        sb.append(this.b);
        sb.append(", feedback=");
        return vz1.u(sb, this.c, ")");
    }
}
