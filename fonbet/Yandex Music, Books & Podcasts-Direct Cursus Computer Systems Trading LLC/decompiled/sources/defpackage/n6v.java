package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n6v {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final g6v e;
    public final String f;

    public n6v(String str, boolean z, String str2, String str3, g6v g6vVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = g6vVar;
        this.f = str2 == null ? str3 : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6v)) {
            return false;
        }
        n6v n6vVar = (n6v) obj;
        return this.a.equals(n6vVar.a) && this.b == n6vVar.b && Intrinsics.d(this.c, n6vVar.c) && this.d.equals(n6vVar.d) && this.e.equals(n6vVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + k5r.c((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder h = v3w.h("WaveWordsCardAction(title=", this.a, ", viewBrowser=", ", deeplink=", this.b);
        su4.v(h, this.c, ", fullLink=", this.d, ", analyticPayload=");
        h.append(this.e);
        h.append(")");
        return h.toString();
    }
}
