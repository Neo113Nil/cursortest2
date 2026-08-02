package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xd3 extends zd3 {
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd3(long j, long j2, String str, String str2) {
        super(48);
        str2.getClass();
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd3)) {
            return false;
        }
        xd3 xd3Var = (xd3) obj;
        return this.b.equals(xd3Var.b) && d85.c(this.c, xd3Var.c) && d85.c(this.d, xd3Var.d) && Intrinsics.d(this.e, xd3Var.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = d85.o;
        met metVar = net.b;
        return this.e.hashCode() + tlm.c(this.d, tlm.c(this.c, hashCode, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.c);
        return ouj.q(f1d.m("SimpleButton(title=", this.b, ", bgColor=", i, ", textColor="), d85.i(this.d), ", deeplink=", this.e, ")");
    }
}
