package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tun implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;
    public final enq f;

    public tun(nrf nrfVar, onq onqVar, f73 f73Var, String str, String str2, enq enqVar) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
        this.e = str2;
        this.f = enqVar;
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
        if (!(obj instanceof tun)) {
            return false;
        }
        tun tunVar = (tun) obj;
        return this.a.equals(tunVar.a) && this.b.equals(tunVar.b) && this.c == tunVar.c && Intrinsics.d(this.d, tunVar.d) && Intrinsics.d(this.e, tunVar.e) && Intrinsics.d(this.f, tunVar.f);
    }

    public final int hashCode() {
        int b = eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        enq enqVar = this.f;
        return hashCode2 + (enqVar != null ? enqVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder i = eta.i("RemoteDataBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
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
