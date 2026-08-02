package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vjg implements wfm {
    public final nrf a;
    public final f73 b;
    public final String c;
    public final String d;
    public final String e;

    public vjg(nrf nrfVar, f73 f73Var, String str, String str2, String str3) {
        this.a = nrfVar;
        this.b = f73Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjg)) {
            return false;
        }
        vjg vjgVar = (vjg) obj;
        return Intrinsics.d(this.a, vjgVar.a) && this.b == vjgVar.b && Intrinsics.d(this.c, vjgVar.c) && Intrinsics.d(this.d, vjgVar.d) && Intrinsics.d(this.e, vjgVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f73 f73Var = this.b;
        int hashCode2 = (hashCode + (f73Var == null ? 0 : f73Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalDataBlock(meta=");
        sb.append(this.a);
        sb.append(", showPolicy=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", description=", this.d, ", coverUrl=");
        return su4.o(sb, this.e, ")");
    }
}
