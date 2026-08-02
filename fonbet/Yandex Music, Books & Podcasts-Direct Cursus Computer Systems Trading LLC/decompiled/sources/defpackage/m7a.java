package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m7a {
    public final String a;
    public final u7a b;
    public final u51 c;

    public m7a(String str, u7a u7aVar, u51 u51Var) {
        this.a = str;
        this.b = u7aVar;
        this.c = u51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7a)) {
            return false;
        }
        m7a m7aVar = (m7a) obj;
        return this.a.equals(m7aVar.a) && Intrinsics.d(this.b, m7aVar.b) && this.c.equals(m7aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u7a u7aVar = this.b;
        return this.c.hashCode() + ((hashCode + (u7aVar == null ? 0 : u7aVar.a.hashCode())) * 31);
    }

    public final String toString() {
        return "Donation(url=" + this.a + ", goal=" + this.b + ", artist=" + this.c + ")";
    }
}
