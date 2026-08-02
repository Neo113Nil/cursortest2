package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u6a implements x6a {
    public final String a;
    public final String b;
    public final p6a c;
    public final tpi d;

    public u6a(String str, String str2, p6a p6aVar, tpi tpiVar) {
        str.getClass();
        str2.getClass();
        tpiVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = p6aVar;
        this.d = tpiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6a)) {
            return false;
        }
        u6a u6aVar = (u6a) obj;
        return Intrinsics.d(this.a, u6aVar.a) && Intrinsics.d(this.b, u6aVar.b) && Intrinsics.d(this.c, u6aVar.c) && Intrinsics.d(this.d, u6aVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        p6a p6aVar = this.c;
        return this.d.hashCode() + ((c + (p6aVar == null ? 0 : p6aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Promocode(id=" + this.a + ", title=" + this.b + ", action=" + this.c + ", metricContext=" + this.d + ')';
    }
}
