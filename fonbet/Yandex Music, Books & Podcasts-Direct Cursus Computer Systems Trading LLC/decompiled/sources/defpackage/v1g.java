package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1g {
    public final String a;
    public final String b;
    public final jzb c;
    public final qo6 d;

    public v1g(String str, String str2, jzb jzbVar, qo6 qo6Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jzbVar;
        this.d = qo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1g)) {
            return false;
        }
        v1g v1gVar = (v1g) obj;
        return Intrinsics.d(this.a, v1gVar.a) && Intrinsics.d(this.b, v1gVar.b) && this.c == v1gVar.c && this.d == v1gVar.d;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        jzb jzbVar = this.c;
        return this.d.hashCode() + ((c + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("LikedEntityItemUiData(title=", this.a, ", imageUrl=", this.b, ", explicitType=");
        m.append(this.c);
        m.append(", coverType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
