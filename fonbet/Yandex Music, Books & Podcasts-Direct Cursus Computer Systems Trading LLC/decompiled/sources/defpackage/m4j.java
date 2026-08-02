package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m4j implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;
    public final o43 f;

    public m4j(nrf nrfVar, onq onqVar, f73 f73Var, String str, String str2, o43 o43Var) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
        this.e = str2;
        this.f = o43Var;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.c;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4j)) {
            return false;
        }
        m4j m4jVar = (m4j) obj;
        return this.a.equals(m4jVar.a) && this.b.equals(m4jVar.b) && this.c == m4jVar.c && Intrinsics.d(this.d, m4jVar.d) && Intrinsics.d(this.e, m4jVar.e) && Intrinsics.d(this.f, m4jVar.f);
    }

    public final int hashCode() {
        int b = eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        o43 o43Var = this.f;
        return hashCode2 + (o43Var != null ? o43Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder i = eta.i("NewReleasesBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", description=");
        i.append(this.e);
        i.append(", viewAllAction=");
        i.append(this.f);
        i.append(")");
        return i.toString();
    }
}
