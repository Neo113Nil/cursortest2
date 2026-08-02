package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nkm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final jzb e;
    public final boolean f;

    public nkm(jzb jzbVar, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jzbVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkm)) {
            return false;
        }
        nkm nkmVar = (nkm) obj;
        return Intrinsics.d(this.a, nkmVar.a) && Intrinsics.d(this.b, nkmVar.b) && this.c.equals(nkmVar.c) && Intrinsics.d(this.d, nkmVar.d) && this.e == nkmVar.e && this.f == nkmVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        jzb jzbVar = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (jzbVar != null ? jzbVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PreSaveListItemUiData(coverUrl=", this.a, ", title=", this.b, ", artistName=");
        su4.v(m, this.c, ", releaseDateWithType=", this.d, ", explicitType=");
        m.append(this.e);
        m.append(", isExplicit=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
