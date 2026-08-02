package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zmg {
    public final String a;
    public final c0p b;
    public final p0p c;
    public final String d;
    public final String e;
    public final long f;

    public zmg(String str, c0p c0pVar, p0p p0pVar, String str2, String str3, long j) {
        str.getClass();
        c0pVar.getClass();
        p0pVar.getClass();
        this.a = str;
        this.b = c0pVar;
        this.c = p0pVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmg)) {
            return false;
        }
        zmg zmgVar = (zmg) obj;
        return Intrinsics.d(this.a, zmgVar.a) && this.b == zmgVar.b && this.c == zmgVar.c && Intrinsics.d(this.d, zmgVar.d) && Intrinsics.d(this.e, zmgVar.e) && this.f == zmgVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Long.hashCode(this.f) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LocalSearchAnalyticsTimings(query=" + this.a + ", context=" + this.b + ", searchEntityType=" + this.c + ", entityId=" + this.d + ", filterId=" + this.e + ", elapsedTimeMs=" + this.f + ")";
    }
}
