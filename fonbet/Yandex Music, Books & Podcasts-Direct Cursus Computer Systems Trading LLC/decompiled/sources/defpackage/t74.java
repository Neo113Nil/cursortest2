package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t74 extends x74 {
    public final String c;
    public final String d;
    public final t84 e;
    public final uhd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t74(String str, String str2, t84 t84Var, uhd uhdVar) {
        super(u74.c, vq1.R(uhdVar));
        str.getClass();
        str2.getClass();
        this.c = str;
        this.d = str2;
        this.e = t84Var;
        this.f = uhdVar;
    }

    @Override // defpackage.x74
    public final String a() {
        return this.c;
    }

    @Override // defpackage.x74
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t74)) {
            return false;
        }
        t74 t74Var = (t74) obj;
        return Intrinsics.d(this.c, t74Var.c) && Intrinsics.d(this.d, t74Var.d) && this.e == t74Var.e && this.f == t74Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + k5r.c(this.c.hashCode() * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Station(id=", this.c, ", title=", this.d, ", availability=");
        m.append(this.e);
        m.append(", platform=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
