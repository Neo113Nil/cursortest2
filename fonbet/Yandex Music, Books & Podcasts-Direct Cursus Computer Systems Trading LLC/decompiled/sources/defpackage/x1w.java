package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x1w implements ctv {
    public final String b;
    public final String c;
    public final String d;
    public final xrv e;
    public final boolean f;
    public final jyr g;

    public x1w(String str, String str2, String str3, xrv xrvVar, boolean z) {
        dfi.s(str, str2, str3);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = xrvVar;
        this.f = z;
        this.g = btf.b(new dxv(4, this));
    }

    @Override // defpackage.ctv
    public final String a() {
        return this.d;
    }

    @Override // defpackage.ctv
    public final xrv b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1w)) {
            return false;
        }
        x1w x1wVar = (x1w) obj;
        return Intrinsics.d(this.b, x1wVar.b) && Intrinsics.d(this.c, x1wVar.c) && Intrinsics.d(this.d, x1wVar.d) && this.e.equals(x1wVar.e) && this.f == x1wVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + k5r.c(k5r.c(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WizardSearchArtistUiData(id=", this.b, ", name=", this.c, ", imageUrl=");
        m.append(this.d);
        m.append(", domainInfo=");
        m.append(this.e);
        m.append(", isLiked=");
        return ouj.r(m, this.f, ")");
    }
}
