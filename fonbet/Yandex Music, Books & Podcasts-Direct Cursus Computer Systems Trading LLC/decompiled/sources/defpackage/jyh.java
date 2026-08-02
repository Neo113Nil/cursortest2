package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jyh {
    public final String a;
    public final kyh b;
    public final String c;
    public final String d;

    public jyh(String str, kyh kyhVar, String str2, String str3) {
        this.a = str;
        this.b = kyhVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyh)) {
            return false;
        }
        jyh jyhVar = (jyh) obj;
        return Intrinsics.d(this.a, jyhVar.a) && this.b == jyhVar.b && this.c.equals(jyhVar.c) && this.d.equals(jyhVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k5r.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuTabData(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        return ouj.q(sb, this.c, ", urlScheme=", this.d, ")");
    }
}
