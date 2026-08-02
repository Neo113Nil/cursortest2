package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fta implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;

    public fta(f73 f73Var, nrf nrfVar, onq onqVar, String str, String str2) {
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
        if (!(obj instanceof fta)) {
            return false;
        }
        fta ftaVar = (fta) obj;
        return this.a.equals(ftaVar.a) && this.b.equals(ftaVar.b) && this.c == ftaVar.c && Intrinsics.d(this.d, ftaVar.d) && this.e.equals(ftaVar.e);
    }

    public final int hashCode() {
        int b = eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("DynamicBannerBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", anchorId=");
        return su4.o(i, this.e, ")");
    }
}
