package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d6i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final d85 e;

    public d6i(String str, String str2, String str3, String str4, d85 d85Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6i)) {
            return false;
        }
        d6i d6iVar = (d6i) obj;
        return this.a.equals(d6iVar.a) && this.b.equals(d6iVar.b) && this.c.equals(d6iVar.c) && this.d.equals(d6iVar.d) && Intrinsics.d(this.e, d6iVar.e);
    }

    public final int hashCode() {
        int hashCode;
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        d85 d85Var = this.e;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        return c + hashCode;
    }

    public final String toString() {
        StringBuilder m = f1d.m("MixItemUiData(id=", this.a, ", title=", this.b, ", deeplink=");
        su4.v(m, this.c, ", coverUrl=", this.d, ", color=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
