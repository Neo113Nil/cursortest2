package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xgn extends zgn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xgn(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.zgn
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgn)) {
            return false;
        }
        xgn xgnVar = (xgn) obj;
        return this.a.equals(xgnVar.a) && this.b.equals(xgnVar.b) && this.c.equals(xgnVar.c) && Intrinsics.d(this.d, xgnVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ouj.q(f1d.m("Basic(name=", this.a, ", value=", this.b, ", serializedSeed="), this.c, ", iconUrl=", this.d, ")");
    }
}
