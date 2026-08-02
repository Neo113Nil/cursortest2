package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ugt implements hht {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public ugt(long j, long j2, String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugt)) {
            return false;
        }
        ugt ugtVar = (ugt) obj;
        return Intrinsics.d(this.a, ugtVar.a) && Intrinsics.d(this.b, ugtVar.b) && d85.c(this.c, ugtVar.c) && d85.c(this.d, ugtVar.d) && this.e.equals(ugtVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = d85.o;
        met metVar = net.b;
        return this.e.hashCode() + tlm.c(this.d, tlm.c(this.c, hashCode2, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.c);
        String i2 = d85.i(this.d);
        StringBuilder m = f1d.m("Success(title=", this.a, ", image=", this.b, ", backgroundColor=");
        su4.v(m, i, ", titleColor=", i2, ", deeplink=");
        return su4.o(m, this.e, ")");
    }
}
