package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iab {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ztd e;
    public final te f;
    public final o1u g;
    public final String h;
    public final boolean i;

    public iab(String str, String str2, String str3, String str4, ztd ztdVar, te teVar, o1u o1uVar, String str5, boolean z) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ztdVar;
        this.f = teVar;
        this.g = o1uVar;
        this.h = str5;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iab)) {
            return false;
        }
        iab iabVar = (iab) obj;
        return Intrinsics.d(this.a, iabVar.a) && Intrinsics.d(this.b, iabVar.b) && Intrinsics.d(this.c, iabVar.c) && Intrinsics.d(this.d, iabVar.d) && Intrinsics.d(this.e, iabVar.e) && Intrinsics.d(this.f, iabVar.f) && Intrinsics.d(this.g, iabVar.g) && Intrinsics.d(this.h, iabVar.h) && this.i == iabVar.i;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ztd ztdVar = this.e;
        int hashCode = (c + (ztdVar == null ? 0 : ztdVar.hashCode())) * 31;
        te teVar = this.f;
        int hashCode2 = (hashCode + (teVar == null ? 0 : teVar.hashCode())) * 31;
        o1u o1uVar = this.g;
        int hashCode3 = (hashCode2 + (o1uVar == null ? 0 : o1uVar.hashCode())) * 31;
        String str = this.h;
        return Boolean.hashCode(this.i) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("EntityHeaderUiData(title=", this.a, ", description=", this.b, ", coverUrl=");
        su4.v(m, this.c, ", bgImageUrl=", this.d, ", artistUiData=");
        m.append(this.e);
        m.append(", actionButtonUiData=");
        m.append(this.f);
        m.append(", myVibeUiData=");
        m.append(this.g);
        m.append(", bgVideoUrl=");
        m.append(this.h);
        m.append(", hasTrailer=");
        return ouj.r(m, this.i, ")");
    }

    public /* synthetic */ iab(String str, String str2, String str3, String str4, ztd ztdVar, te teVar, String str5) {
        this(str, str2, str3, str4, ztdVar, teVar, null, str5, false);
    }
}
