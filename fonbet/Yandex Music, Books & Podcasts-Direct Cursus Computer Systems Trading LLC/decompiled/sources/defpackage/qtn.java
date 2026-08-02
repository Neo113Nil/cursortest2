package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qtn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final jzb e;
    public final boolean f;
    public final boolean g;

    public qtn(String str, String str2, String str3, String str4, jzb jzbVar, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jzbVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtn)) {
            return false;
        }
        qtn qtnVar = (qtn) obj;
        return Intrinsics.d(this.a, qtnVar.a) && Intrinsics.d(this.b, qtnVar.b) && this.c.equals(qtnVar.c) && Intrinsics.d(this.d, qtnVar.d) && this.e == qtnVar.e && this.f == qtnVar.f && this.g == qtnVar.g;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        jzb jzbVar = this.e;
        return Boolean.hashCode(this.g) + k5r.e(k5r.e((hashCode + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.f), 31, false);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ReleaseItemUiData(coverUrl=", this.a, ", title=", this.b, ", subtitle1=");
        su4.v(m, this.c, ", subtitle2=", this.d, ", explicitType=");
        m.append(this.e);
        m.append(", isExplicit=");
        m.append(this.f);
        m.append(", hasPlusBadge=false, preSave=");
        return ouj.r(m, this.g, ")");
    }
}
