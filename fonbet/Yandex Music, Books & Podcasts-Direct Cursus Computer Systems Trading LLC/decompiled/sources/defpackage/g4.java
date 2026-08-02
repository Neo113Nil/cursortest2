package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g4 implements h4 {
    public final String a;
    public final String b;
    public final mqs c;
    public final mwk d;

    public g4(String str, String str2, mqs mqsVar, mwk mwkVar) {
        this.a = str;
        this.b = str2;
        this.c = mqsVar;
        this.d = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Intrinsics.d(this.a, g4Var.a) && this.b.equals(g4Var.b) && this.c.equals(g4Var.c) && this.d.equals(g4Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k5r.c(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c.a);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(title=", this.a, ", shortDescription=", this.b, ", track=");
        m.append(this.c);
        m.append(", keyData=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
