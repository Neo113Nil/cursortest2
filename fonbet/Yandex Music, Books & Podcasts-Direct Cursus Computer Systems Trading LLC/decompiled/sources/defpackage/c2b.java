package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2b implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;

    public c2b(f73 f73Var, nrf nrfVar, onq onqVar, String str, String str2) {
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
        if (!(obj instanceof c2b)) {
            return false;
        }
        c2b c2bVar = (c2b) obj;
        return this.a.equals(c2bVar.a) && this.b.equals(c2bVar.b) && this.c == c2bVar.c && Intrinsics.d(this.d, c2bVar.d) && Intrinsics.d(this.e, c2bVar.e);
    }

    public final int hashCode() {
        int b = eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder i = eta.i("EditorialWavesBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", description=");
        return su4.o(i, this.e, ")");
    }
}
