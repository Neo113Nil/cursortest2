package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class t2b {
    public final long a;
    public final String b;
    public final double c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final long h;
    public final long i;
    public final long j;
    public final Long k;
    public final long l;
    public final long m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final Long s;
    public final Long t;
    public final Long u;
    public final Long v;
    public final Long w;
    public final String x;
    public final boolean y;

    public /* synthetic */ t2b(long j, String str, double d, String str2, String str3, String str4, Long l, long j2, long j3, long j4, Long l2, long j5, long j6, String str5, String str6, String str7, String str8, boolean z, Long l3, Long l4, Long l5, Long l6, Long l7, String str9, boolean z2, int i) {
        this(j, str, d, str2, str3, str4, l, j2, j3, j4, l2, j5, j6, str5, str6, str7, str8, z, l3, l4, l5, (i & 2097152) != 0 ? null : l6, (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : l7, str9, (i & 16777216) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2b)) {
            return false;
        }
        t2b t2bVar = (t2b) obj;
        return this.a == t2bVar.a && jl40.l(this.b, t2bVar.b) && Double.compare(this.c, t2bVar.c) == 0 && jl40.l(this.d, t2bVar.d) && jl40.l(this.e, t2bVar.e) && jl40.l(this.f, t2bVar.f) && jl40.l(this.g, t2bVar.g) && this.h == t2bVar.h && this.i == t2bVar.i && this.j == t2bVar.j && jl40.l(this.k, t2bVar.k) && this.l == t2bVar.l && this.m == t2bVar.m && jl40.l(this.n, t2bVar.n) && jl40.l(this.o, t2bVar.o) && jl40.l(this.p, t2bVar.p) && jl40.l(this.q, t2bVar.q) && this.r == t2bVar.r && jl40.l(this.s, t2bVar.s) && jl40.l(this.t, t2bVar.t) && jl40.l(this.u, t2bVar.u) && jl40.l(this.v, t2bVar.v) && jl40.l(this.w, t2bVar.w) && jl40.l(this.x, t2bVar.x) && this.y == t2bVar.y;
    }

    public final int hashCode() {
        int a = unr0.a(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.g;
        int c = qv10.c(qv10.c(qv10.c((hashCode3 + (l == null ? 0 : l.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        Long l2 = this.k;
        int c2 = qv10.c(qv10.c((c + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.l), 31, this.m);
        String str4 = this.n;
        int hashCode4 = (c2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        int e = unr0.e((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.r);
        Long l3 = this.s;
        int hashCode7 = (e + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.t;
        int hashCode8 = (hashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.u;
        int hashCode9 = (hashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.v;
        int hashCode10 = (hashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.w;
        int hashCode11 = (hashCode10 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.x;
        return Boolean.hashCode(this.y) + ((hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("ChatEntity(internalId=", this.a, ", chatId=", this.b);
        nzs.o(k, ", createTime=", this.c, ", addresseeId=");
        g8e.D(k, this.d, ", name=", this.e, ", avatarId=");
        k.append(this.f);
        k.append(", seenMarker=");
        k.append(this.g);
        k.append(", ownerLastSeenSequenceNumber=");
        k.append(this.h);
        x4e.A(this.i, ", ownerSeenMarkerVersion=", ", flags=", k);
        k.append(this.j);
        k.append(", otherSeenMarker=");
        k.append(this.k);
        x4e.A(this.l, ", version=", ", fullInfoVersion=", k);
        uw51.v(this.m, ", inviteHash=", this.n, k);
        g8e.D(k, ", description=", this.o, ", alias=", this.p);
        uw51.x(", currentProfileId=", this.q, ", isTransient=", k, this.r);
        k.append(", minMessageTimestamp=");
        k.append(this.s);
        k.append(", parentInternalId=");
        k.append(this.t);
        k.append(", parentMessageTimestamp=");
        k.append(this.u);
        k.append(", lastTimestamp=");
        k.append(this.v);
        k.append(", lastSeqNo=");
        k.append(this.w);
        k.append(", partnerId=");
        k.append(this.x);
        return xra1.a(k, ", hasGuests=", this.y, Extension.C_BRAKE);
    }

    public t2b(long j, String str, double d, String str2, String str3, String str4, Long l, long j2, long j3, long j4, Long l2, long j5, long j6, String str5, String str6, String str7, String str8, boolean z, Long l3, Long l4, Long l5, Long l6, Long l7, String str9, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = l;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = l2;
        this.l = j5;
        this.m = j6;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = z;
        this.s = l3;
        this.t = l4;
        this.u = l5;
        this.v = l6;
        this.w = l7;
        this.x = str9;
        this.y = z2;
    }
}
