package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z7a implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;

    public z7a(nrf nrfVar, onq onqVar, f73 f73Var, String str) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
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
        if (!(obj instanceof z7a)) {
            return false;
        }
        z7a z7aVar = (z7a) obj;
        return this.a.equals(z7aVar.a) && this.b.equals(z7aVar.b) && this.c == z7aVar.c && Intrinsics.d(this.d, z7aVar.d);
    }

    public final int hashCode() {
        int b = eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder i = eta.i("DonationsBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(")");
        return i.toString();
    }
}
