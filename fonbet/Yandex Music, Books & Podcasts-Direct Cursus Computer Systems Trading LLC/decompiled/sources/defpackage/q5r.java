package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q5r implements s5r {
    public final String a;
    public final String b;
    public final o43 c;

    public q5r(String str, String str2, o43 o43Var) {
        this.a = str;
        this.b = str2;
        this.c = o43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5r)) {
            return false;
        }
        q5r q5rVar = (q5r) obj;
        return this.a.equals(q5rVar.a) && this.b.equals(q5rVar.b) && Intrinsics.d(this.c, q5rVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        o43 o43Var = this.c;
        return c + (o43Var == null ? 0 : o43Var.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("DoodleImageLogo(darkDoodleImageUrl=", this.a, ", lightDoodleImageUrl=", this.b, ", blockAction=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
