package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ugs {
    public final String A;
    public final int B;
    public final long C;
    public final long D;
    public final long E;
    public final boolean F;
    public final long G;
    public final boolean H;
    public final boolean I;
    public final long a;
    public final String b;
    public final double c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final String m;
    public final String n;
    public final boolean o;
    public final long p;
    public final Long q;
    public final Long r;
    public final long s;
    public final String t;
    public final String u;
    public final String v;
    public final Long w;
    public final Boolean x;
    public final Boolean y;
    public final Long z;

    public ugs(long j, String str, double d, String str2, String str3, String str4, long j2, int i, long j3, long j4, long j5, long j6, String str5, String str6, boolean z, long j7, Long l, Long l2, long j8, String str7, String str8, String str9, Long l3, Boolean bool, Boolean bool2, Long l4, String str10, int i2, long j9, long j10, long j11, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j2;
        this.h = i;
        this.i = j3;
        this.j = j4;
        this.k = j5;
        this.l = j6;
        this.m = str5;
        this.n = str6;
        this.o = z;
        this.p = j7;
        this.q = l;
        this.r = l2;
        this.s = j8;
        this.t = str7;
        this.u = str8;
        this.v = str9;
        this.w = l3;
        this.x = bool;
        this.y = bool2;
        this.z = l4;
        this.A = str10;
        this.B = i2;
        this.C = j9;
        this.D = j10;
        this.E = j11;
        this.F = z2;
        long longValue = l4 != null ? l4.longValue() : -1L;
        this.G = longValue;
        boolean z3 = false;
        this.H = longValue != -1;
        if (j2 == 0 && j3 == 0) {
            z3 = true;
        }
        this.I = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugs)) {
            return false;
        }
        ugs ugsVar = (ugs) obj;
        return this.a == ugsVar.a && jl40.l(this.b, ugsVar.b) && Double.compare(this.c, ugsVar.c) == 0 && jl40.l(this.d, ugsVar.d) && jl40.l(this.e, ugsVar.e) && jl40.l(this.f, ugsVar.f) && this.g == ugsVar.g && this.h == ugsVar.h && this.i == ugsVar.i && this.j == ugsVar.j && this.k == ugsVar.k && this.l == ugsVar.l && jl40.l(this.m, ugsVar.m) && jl40.l(this.n, ugsVar.n) && this.o == ugsVar.o && this.p == ugsVar.p && jl40.l(this.q, ugsVar.q) && jl40.l(this.r, ugsVar.r) && this.s == ugsVar.s && jl40.l(this.t, ugsVar.t) && jl40.l(this.u, ugsVar.u) && jl40.l(this.v, ugsVar.v) && jl40.l(this.w, ugsVar.w) && jl40.l(this.x, ugsVar.x) && jl40.l(this.y, ugsVar.y) && jl40.l(this.z, ugsVar.z) && jl40.l(this.A, ugsVar.A) && this.B == ugsVar.B && this.C == ugsVar.C && this.D == ugsVar.D && this.E == ugsVar.E && this.F == ugsVar.F;
    }

    public final int hashCode() {
        int a = unr0.a(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int c = qv10.c(qv10.c(qv10.c(qv10.c(oyr.b(this.h, qv10.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        String str4 = this.m;
        int hashCode3 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int c2 = qv10.c(unr0.e((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.o), 31, this.p);
        Long l = this.q;
        int hashCode4 = (c2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.r;
        int c3 = qv10.c((hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.s);
        String str6 = this.t;
        int hashCode5 = (c3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.u;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.v;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l3 = this.w;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.x;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.y;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l4 = this.z;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str9 = this.A;
        return Boolean.hashCode(this.F) + qv10.c(qv10.c(qv10.c(oyr.b(this.B, (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31, 31), 31, this.C), 31, this.D), 31, this.E);
    }

    public final String toString() {
        StringBuilder k = x4e.k("FullChatInfo(chatInternalId=", this.a, ", chatId=", this.b);
        nzs.o(k, ", createTime=", this.c, ", addresseeId=");
        g8e.D(k, this.d, ", name=", this.e, ", avatarId=");
        ly3.y(this.g, this.f, ", seenMarker=", k);
        n.A(k, ", ownerLastSeenSequenceNumber=", this.h, ", ownerSeenMarkerVersion=");
        k.append(this.i);
        x4e.A(this.j, ", flags=", ", otherSeenMarker=", k);
        k.append(this.k);
        x4e.A(this.l, ", version=", ", inviteHash=", k);
        g8e.D(k, this.m, ", currentProfileId=", this.n, ", isTransient=");
        k.append(this.o);
        k.append(", lastSeqNo=");
        k.append(this.p);
        k.append(", parentInternalId=");
        k.append(this.q);
        k.append(", parentMessageTimestamp=");
        k.append(this.r);
        x4e.A(this.s, ", minMessageTimestamp=", ", addresseeShownName=", k);
        g8e.D(k, this.t, ", addresseeAvatarUrl=", this.u, ", addresseeWebsite=");
        k.append(this.v);
        k.append(", addresseeResponseTime=");
        k.append(this.w);
        k.append(", chatWithBot=");
        k.append(this.x);
        k.append(", chatWithSupportBot=");
        k.append(this.y);
        k.append(", lastMessageTime=");
        k.append(this.z);
        k.append(", lastMessageAuthor=");
        k.append(this.A);
        k.append(", lastMessageSeqNo=");
        k.append(this.B);
        k.append(", mute=");
        k.append(this.C);
        x4e.A(this.D, ", muteMentions=", ", muteVersion=", k);
        k.append(this.E);
        k.append(", hasGuests=");
        k.append(this.F);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
