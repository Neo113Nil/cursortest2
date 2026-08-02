package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gsu implements hsu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final mhi e;
    public final dou f;

    public gsu(String str, String str2, String str3, String str4, mhi mhiVar, dou douVar) {
        str2.getClass();
        douVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mhiVar;
        this.f = douVar;
    }

    public static gsu c(gsu gsuVar, String str, mhi mhiVar, int i) {
        String str2 = gsuVar.a;
        if ((i & 2) != 0) {
            str = gsuVar.b;
        }
        String str3 = str;
        String str4 = gsuVar.c;
        String str5 = gsuVar.d;
        if ((i & 16) != 0) {
            mhiVar = gsuVar.e;
        }
        dou douVar = gsuVar.f;
        gsuVar.getClass();
        str3.getClass();
        douVar.getClass();
        return new gsu(str2, str3, str4, str5, mhiVar, douVar);
    }

    @Override // defpackage.hsu
    public final String a() {
        return this.c;
    }

    @Override // defpackage.hsu
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsu)) {
            return false;
        }
        gsu gsuVar = (gsu) obj;
        return this.a.equals(gsuVar.a) && Intrinsics.d(this.b, gsuVar.b) && Intrinsics.d(this.c, gsuVar.c) && Intrinsics.d(this.d, gsuVar.d) && this.e == gsuVar.e && Intrinsics.d(this.f, gsuVar.f);
    }

    @Override // defpackage.hsu
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.hsu
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Enabled(id=", this.a, ", name=", this.b, ", userImageUrl=");
        su4.v(m, this.c, ", otherUserImageUrl=", this.d, ", playingState=");
        m.append(this.e);
        m.append(", wave=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
