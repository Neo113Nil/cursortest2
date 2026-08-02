package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fgd extends ggd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fgd(String str, String str2, String str3, String str4) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.ggd
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ggd
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ggd
    public final String c() {
        return this.d;
    }

    @Override // defpackage.ggd
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgd)) {
            return false;
        }
        fgd fgdVar = (fgd) obj;
        return Intrinsics.d(this.a, fgdVar.a) && Intrinsics.d(this.b, fgdVar.b) && Intrinsics.d(this.c, fgdVar.c) && Intrinsics.d(this.d, fgdVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ouj.q(f1d.m("SmartHome(userId=", this.a, ", deviceId=", this.b, ", name="), this.c, ", platform=", this.d, ")");
    }
}
