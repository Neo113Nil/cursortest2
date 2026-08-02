package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mou {
    public final long a;
    public final String b;
    public final String c;
    public final s9p d;
    public final long e;
    public final String f;
    public final Long g;
    public final Long h;
    public final String i;
    public final String j;

    public mou(long j, String str, String str2, s9p s9pVar, long j2, String str3, Long l, Long l2, String str4, String str5) {
        str.getClass();
        str2.getClass();
        s9pVar.getClass();
        str4.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = s9pVar;
        this.e = j2;
        this.f = str3;
        this.g = l;
        this.h = l2;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mou)) {
            return false;
        }
        mou mouVar = (mou) obj;
        return this.a == mouVar.a && Intrinsics.d(this.b, mouVar.b) && Intrinsics.d(this.c, mouVar.c) && Intrinsics.d(this.d, mouVar.d) && this.e == mouVar.e && Intrinsics.d(this.f, mouVar.f) && Intrinsics.d(this.g, mouVar.g) && Intrinsics.d(this.h, mouVar.h) && Intrinsics.d(this.i, mouVar.i) && Intrinsics.d(this.j, mouVar.j);
    }

    public final int hashCode() {
        int c = tlm.c(this.e, k5r.d(k5r.c(k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d.a), 31);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.g;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int c2 = k5r.c((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.i);
        String str2 = this.j;
        return c2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaveFeedbackDbRow(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", rotorSessionId=");
        sb.append(this.c);
        sb.append(", seeds=");
        sb.append(this.d);
        ouj.C(sb, ", timestamp=", this.e, ", trackId=");
        sb.append(this.f);
        sb.append(", totalPlayedMs=");
        sb.append(this.g);
        sb.append(", trackDurationMs=");
        sb.append(this.h);
        sb.append(", from=");
        sb.append(this.i);
        sb.append(", batchId=");
        return su4.o(sb, this.j, ")");
    }
}
