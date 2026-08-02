package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yrj extends ue5 {
    public final String a;
    public final c0p b;
    public final String c;
    public final n1p d;

    public yrj(String str, c0p c0pVar, String str2, n1p n1pVar) {
        str.getClass();
        c0pVar.getClass();
        this.a = str;
        this.b = c0pVar;
        this.c = str2;
        this.d = n1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrj)) {
            return false;
        }
        yrj yrjVar = (yrj) obj;
        return Intrinsics.d(this.a, yrjVar.a) && this.b == yrjVar.b && Intrinsics.d(this.c, yrjVar.c) && Intrinsics.d(this.d, yrjVar.d);
    }

    public final int hashCode() {
        int e = k5r.e((this.b.hashCode() + k5r.e(this.a.hashCode() * 31, 31, false)) * 31, 31, false);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        n1p n1pVar = this.d;
        return hashCode + (n1pVar != null ? n1pVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnlineSearchParams(query=" + this.a + ", voiceSearch=false, context=" + this.b + ", disableCorrection=false, artistId=" + this.c + ", filter=" + this.d + ")";
    }
}
