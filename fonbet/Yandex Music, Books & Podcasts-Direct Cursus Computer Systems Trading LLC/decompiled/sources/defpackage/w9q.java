package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w9q implements x9q {
    public final String a;
    public final String b;
    public final String c;

    public w9q(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.x9q
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9q)) {
            return false;
        }
        w9q w9qVar = (w9q) obj;
        return Intrinsics.d(this.a, w9qVar.a) && Intrinsics.d(this.b, w9qVar.b) && Intrinsics.d(this.c, w9qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.x9q
    public final String s() {
        return this.a;
    }

    public final String toString() {
        return su4.o(f1d.m("WithFilter(owner=", this.a, ", kind=", this.b, ", filterId="), this.c, ")");
    }
}
