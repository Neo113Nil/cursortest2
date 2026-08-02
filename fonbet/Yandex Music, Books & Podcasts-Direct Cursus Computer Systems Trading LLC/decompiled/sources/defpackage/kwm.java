package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kwm {
    public final String a;
    public final String b;
    public final String c;
    public final thj d;

    public kwm(String str, String str2, String str3, thj thjVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = thjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwm)) {
            return false;
        }
        kwm kwmVar = (kwm) obj;
        return this.a.equals(kwmVar.a) && this.b.equals(kwmVar.b) && Intrinsics.d(this.c, kwmVar.c) && this.d.equals(kwmVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PromoBlockUiData(title=", this.a, ", description=", this.b, ", coverUrl=");
        m.append(this.c);
        m.append(", objectInfo=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
