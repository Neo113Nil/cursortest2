package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t2j {
    public final String a;
    public final String b;
    public final String c;
    public final s2j d;

    public t2j(String str, String str2, String str3, s2j s2jVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s2jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2j)) {
            return false;
        }
        t2j t2jVar = (t2j) obj;
        return Intrinsics.d(this.a, t2jVar.a) && Intrinsics.d(this.b, t2jVar.b) && Intrinsics.d(this.c, t2jVar.c) && this.d.equals(t2jVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NeuromusicUiData(stationId=", this.a, ", title=", this.b, ", imageUrl=");
        m.append(this.c);
        m.append(", style=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
