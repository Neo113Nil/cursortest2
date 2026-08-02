package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e8q {
    public final String a;
    public final c0p b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;

    public e8q(String str, c0p c0pVar, String str2, String str3, int i, long j) {
        str.getClass();
        c0pVar.getClass();
        this.a = str;
        this.b = c0pVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j;
    }

    public static e8q a(e8q e8qVar, long j) {
        String str = e8qVar.a;
        c0p c0pVar = e8qVar.b;
        String str2 = e8qVar.c;
        String str3 = e8qVar.d;
        int i = e8qVar.e;
        e8qVar.getClass();
        str.getClass();
        c0pVar.getClass();
        return new e8q(str, c0pVar, str2, str3, i, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8q)) {
            return false;
        }
        e8q e8qVar = (e8q) obj;
        return Intrinsics.d(this.a, e8qVar.a) && this.b == e8qVar.b && Intrinsics.d(this.c, e8qVar.c) && Intrinsics.d(this.d, e8qVar.d) && this.e == e8qVar.e && this.f == e8qVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Long.hashCode(this.f) + f1d.a(this.e, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedSearchAnalyticsTimings(query=");
        sb.append(this.a);
        sb.append(", context=");
        sb.append(this.b);
        sb.append(", artistId=");
        su4.v(sb, this.c, ", filterId=", this.d, ", page=");
        sb.append(this.e);
        sb.append(", elapsedTimeMs=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
