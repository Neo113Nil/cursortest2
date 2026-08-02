package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q6a implements x6a {
    public final String a;
    public final String b;
    public final p6a c;
    public final tpi d;

    public q6a(String str, String str2, p6a p6aVar, tpi tpiVar) {
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
        if (!(obj instanceof q6a)) {
            return false;
        }
        q6a q6aVar = (q6a) obj;
        return Intrinsics.d(this.a, q6aVar.a) && Intrinsics.d(this.b, q6aVar.b) && Intrinsics.d(this.c, q6aVar.c) && Intrinsics.d(this.d, q6aVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        p6a p6aVar = this.c;
        return this.d.hashCode() + ((c + (p6aVar == null ? 0 : p6aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Entry(id=" + this.a + ", title=" + this.b + ", action=" + this.c + ", metricContext=" + this.d + ')';
    }
}
