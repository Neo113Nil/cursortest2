package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t6a implements x6a {
    public final String a;
    public final String b;
    public final p6a c;
    public final tpi d;

    public t6a(String str, String str2, p6a p6aVar, tpi tpiVar) {
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
        if (!(obj instanceof t6a)) {
            return false;
        }
        t6a t6aVar = (t6a) obj;
        return Intrinsics.d(this.a, t6aVar.a) && Intrinsics.d(this.b, t6aVar.b) && Intrinsics.d(this.c, t6aVar.c) && Intrinsics.d(this.d, t6aVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        p6a p6aVar = this.c;
        return this.d.hashCode() + ((c + (p6aVar == null ? 0 : p6aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Missions(id=" + this.a + ", title=" + this.b + ", action=" + this.c + ", metricContext=" + this.d + ')';
    }
}
