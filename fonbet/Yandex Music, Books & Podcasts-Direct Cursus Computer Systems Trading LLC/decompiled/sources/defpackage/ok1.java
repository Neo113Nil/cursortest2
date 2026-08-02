package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ok1 implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final o43 e;

    public ok1(nrf nrfVar, onq onqVar, f73 f73Var, String str, o43 o43Var) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
        this.e = o43Var;
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
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return this.a.equals(ok1Var.a) && this.b.equals(ok1Var.b) && this.c == ok1Var.c && Intrinsics.d(this.d, ok1Var.d) && Intrinsics.d(this.e, ok1Var.e);
    }

    public final int hashCode() {
        int b = eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        o43 o43Var = this.e;
        return hashCode + (o43Var != null ? o43Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder i = eta.i("ArtistTracksBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", viewAllAction=");
        i.append(this.e);
        i.append(")");
        return i.toString();
    }
}
