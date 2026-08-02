package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w48 {
    public final qo6 a;
    public final String b;
    public final String c;
    public final String d;

    public w48(qo6 qo6Var, String str, String str2, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        str.getClass();
        this.a = qo6Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w48)) {
            return false;
        }
        w48 w48Var = (w48) obj;
        return this.a == w48Var.a && Intrinsics.d(this.b, w48Var.b) && Intrinsics.d(this.c, w48Var.c) && Intrinsics.d(this.d, w48Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisabledListItemUiData(cover=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitleLargeLine1=");
        return ouj.q(sb, this.c, ", subtitleLargeLine2=null, subtitleMedium=", this.d, ")");
    }
}
