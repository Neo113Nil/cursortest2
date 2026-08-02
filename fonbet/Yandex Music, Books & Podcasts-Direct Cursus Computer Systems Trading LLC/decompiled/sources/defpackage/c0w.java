package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0w implements ctv {
    public final String b;
    public final String c;
    public final String d;
    public final xrv e;

    public c0w(String str, String str2, String str3, xrv xrvVar) {
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = xrvVar;
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
        if (!(obj instanceof c0w)) {
            return false;
        }
        c0w c0wVar = (c0w) obj;
        return Intrinsics.d(this.b, c0wVar.b) && Intrinsics.d(this.c, c0wVar.c) && this.d.equals(c0wVar.d) && this.e.equals(c0wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WizardProgressArtistUiData(id=", this.b, ", name=", this.c, ", imageUrl=");
        m.append(this.d);
        m.append(", domainInfo=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
