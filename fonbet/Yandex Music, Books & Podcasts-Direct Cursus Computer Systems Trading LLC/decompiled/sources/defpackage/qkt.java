package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qkt implements uvn {
    public final nrf a;
    public final f73 b;
    public final onq c;
    public final String d;
    public final String e;

    public qkt(f73 f73Var, nrf nrfVar, onq onqVar, String str, String str2) {
        this.a = nrfVar;
        this.b = f73Var;
        this.c = onqVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.b;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkt)) {
            return false;
        }
        qkt qktVar = (qkt) obj;
        return this.a.equals(qktVar.a) && this.b == qktVar.b && this.c.equals(qktVar.c) && Intrinsics.d(this.d, qktVar.d) && Intrinsics.d(this.e, qktVar.e);
    }

    public final int hashCode() {
        int c = eta.c(this.c, eta.b(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownTypeBlock(meta=");
        sb.append(this.a);
        sb.append(", showPolicy=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        return su4.o(sb, this.e, ")");
    }
}
