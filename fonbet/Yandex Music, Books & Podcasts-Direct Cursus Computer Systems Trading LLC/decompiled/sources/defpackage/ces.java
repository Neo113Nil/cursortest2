package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ces {
    public final String a;
    public String b;
    public boolean c = false;
    public w5k d = null;

    public ces(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ces)) {
            return false;
        }
        ces cesVar = (ces) obj;
        return Intrinsics.d(this.a, cesVar.a) && Intrinsics.d(this.b, cesVar.b) && this.c == cesVar.c && Intrinsics.d(this.d, cesVar.d);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        w5k w5kVar = this.d;
        return e + (w5kVar == null ? 0 : w5kVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return dfi.j(sb, this.c, ')');
    }
}
