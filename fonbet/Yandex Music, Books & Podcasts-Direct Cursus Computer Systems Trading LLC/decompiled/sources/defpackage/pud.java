package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pud {
    public final String a;
    public final String b;
    public final h06 c;
    public final ct5 d;
    public final String e;
    public final String f;

    public pud(String str, String str2, h06 h06Var, ct5 ct5Var, String str3, String str4) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = h06Var;
        this.d = ct5Var;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pud)) {
            return false;
        }
        pud pudVar = (pud) obj;
        return Intrinsics.d(this.a, pudVar.a) && Intrinsics.d(this.b, pudVar.b) && this.c.equals(pudVar.c) && this.d.equals(pudVar.d) && Intrinsics.d(this.e, pudVar.e) && Intrinsics.d(this.f, pudVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("HeaderConcertInfo(id=", this.a, ", dataSessionId=", this.b, ", concertShort=");
        m.append(this.c);
        m.append(", uiData=");
        m.append(this.d);
        m.append(", price=");
        return ouj.q(m, this.e, ", dateContentDescription=", this.f, ")");
    }
}
