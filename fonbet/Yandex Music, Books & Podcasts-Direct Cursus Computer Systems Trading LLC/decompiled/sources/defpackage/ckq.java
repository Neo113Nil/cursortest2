package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ckq {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final saf e;
    public final String f;
    public final dtq g;
    public final d85 h;

    public ckq(String str, String str2, String str3, boolean z, saf safVar, String str4, dtq dtqVar, d85 d85Var) {
        dtqVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = safVar;
        this.f = str4;
        this.g = dtqVar;
        this.h = d85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckq)) {
            return false;
        }
        ckq ckqVar = (ckq) obj;
        return Intrinsics.d(this.a, ckqVar.a) && Intrinsics.d(this.b, ckqVar.b) && Intrinsics.d(this.c, ckqVar.c) && this.d == ckqVar.d && Intrinsics.d(this.e, ckqVar.e) && Intrinsics.d(this.f, ckqVar.f) && Intrinsics.d(this.g, ckqVar.g) && Intrinsics.d(this.h, ckqVar.h);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (this.e.hashCode() + k5r.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d)) * 31;
        String str4 = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        d85 d85Var = this.h;
        if (d85Var != null) {
            long j = d85Var.a;
            met metVar = net.b;
            i = Long.hashCode(j);
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder m = f1d.m("SingleEntityContentUiData(title=", this.a, ", subtitle=", this.b, ", description=");
        m.append(this.c);
        m.append(", rewind=");
        m.append(this.d);
        m.append(", coverComposition=");
        m.append(this.e);
        m.append(", smallRoundCover=");
        m.append(this.f);
        m.append(", align=");
        m.append(this.g);
        m.append(", trailerIconFallbackColor=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ ckq(String str, String str2, String str3, nn6 nn6Var, String str4, dtq dtqVar) {
        this(str, str2, str3, false, nn6Var, str4, dtqVar, null);
    }
}
