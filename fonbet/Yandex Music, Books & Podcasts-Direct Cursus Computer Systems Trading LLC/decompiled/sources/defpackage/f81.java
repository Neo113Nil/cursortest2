package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f81 implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;

    public f81(f73 f73Var, nrf nrfVar, onq onqVar, String str, String str2) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
        this.e = str2;
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
        if (!(obj instanceof f81)) {
            return false;
        }
        f81 f81Var = (f81) obj;
        return this.a.equals(f81Var.a) && this.b.equals(f81Var.b) && this.c == f81Var.c && this.d.equals(f81Var.d) && Intrinsics.d(this.e, f81Var.e);
    }

    public final int hashCode() {
        int c = k5r.c(eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder i = eta.i("ArtistFamiliarToYouBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", description=");
        return su4.o(i, this.e, ")");
    }
}
