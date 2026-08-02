package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3n {
    public final mkj a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public o3n(mkj mkjVar, String str, String str2, String str3, boolean z) {
        str.getClass();
        this.a = mkjVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3n)) {
            return false;
        }
        o3n o3nVar = (o3n) obj;
        return this.a.equals(o3nVar.a) && Intrinsics.d(this.b, o3nVar.b) && Intrinsics.d(this.c, o3nVar.c) && Intrinsics.d(this.d, o3nVar.d) && this.e == o3nVar.e;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseButtonState(config=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", additionalText=");
        su4.v(sb, this.c, ", combinedTextA11y=", this.d, ", isOneClick=");
        return ouj.r(sb, this.e, ")");
    }
}
