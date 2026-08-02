package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vgl extends t7g {
    public final String b;
    public final String c;
    public final be6 d;

    public vgl(String str, String str2, be6 be6Var) {
        str.getClass();
        str2.getClass();
        be6Var.getClass();
        this.b = str;
        this.c = str2;
        this.d = be6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgl)) {
            return false;
        }
        vgl vglVar = (vgl) obj;
        return Intrinsics.d(this.b, vglVar.b) && Intrinsics.d(this.c, vglVar.c) && this.d == vglVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // defpackage.t7g
    public final String s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder m = f1d.m("Track(id=", this.b, ", trackId=", this.c, ", contentType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
