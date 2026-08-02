package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mzv implements ctv {
    public final String b;
    public final String c;
    public final String d;
    public final xrv e;

    public mzv(String str, String str2, String str3, xrv xrvVar) {
        str.getClass();
        str2.getClass();
        xrvVar.getClass();
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
        if (!(obj instanceof mzv)) {
            return false;
        }
        mzv mzvVar = (mzv) obj;
        return Intrinsics.d(this.b, mzvVar.b) && Intrinsics.d(this.c, mzvVar.c) && this.d.equals(mzvVar.d) && Intrinsics.d(this.e, mzvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WizardOutboardingArtistUiData(id=", this.b, ", name=", this.c, ", imageUrl=");
        m.append(this.d);
        m.append(", domainInfo=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
