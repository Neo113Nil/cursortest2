package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o1u {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final nmu e;
    public final enu f;
    public final String g;

    public o1u(String str, String str2, String str3, String str4, qo6 qo6Var, enu enuVar, String str5) {
        str.getClass();
        nmu nmuVar = qo6Var == qo6.d ? nmu.c : nmu.b;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = nmuVar;
        this.f = enuVar;
        this.g = str5;
    }

    public final lnu a(long j) {
        if (j == 16) {
            j = oa5.a;
        }
        long j2 = j;
        String str = this.d;
        return new lnu(this.a, this.b, j2, str != null ? new amu(str, null, null) : null, this.c, this.e, null, null, 192);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1u)) {
            return false;
        }
        o1u o1uVar = (o1u) obj;
        return Intrinsics.d(this.a, o1uVar.a) && Intrinsics.d(this.b, o1uVar.b) && Intrinsics.d(this.c, o1uVar.c) && Intrinsics.d(this.d, o1uVar.d) && this.e == o1uVar.e && this.f == o1uVar.f && Intrinsics.d(this.g, o1uVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("VibeButtonEntityScreenUiData(title=", this.a, ", header=", this.b, ", imgUri=");
        su4.v(m, this.c, ", bgImgUri=", this.d, ", imageRounding=");
        m.append(this.e);
        m.append(", position=");
        m.append(this.f);
        m.append(", animationUrl=");
        return su4.o(m, this.g, ")");
    }
}
