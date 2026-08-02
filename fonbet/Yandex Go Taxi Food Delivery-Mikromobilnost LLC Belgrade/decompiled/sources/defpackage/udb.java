package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class udb {
    public final long A;
    public final long B;
    public final long C;
    public final boolean D;
    public final long a;
    public final String b;
    public final Integer c;
    public final String d;
    public final int e;
    public final String f;
    public final Long g;
    public final Integer h;
    public final long i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final String t;
    public final boolean u;
    public final long v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final long z;

    public udb(long j, String str, Integer num, String str2, int i, String str3, Long l, Integer num2, long j2, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, boolean z7, boolean z8, String str4, boolean z9, long j3, String str5, boolean z10, boolean z11, long j4, long j5, long j6, long j7, boolean z12) {
        this.a = j;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = l;
        this.h = num2;
        this.i = j2;
        this.j = i2;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = i3;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = str4;
        this.u = z9;
        this.v = j3;
        this.w = str5;
        this.x = z10;
        this.y = z11;
        this.z = j4;
        this.A = j5;
        this.B = j6;
        this.C = j7;
        this.D = z12;
        z83.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udb)) {
            return false;
        }
        udb udbVar = (udb) obj;
        return this.a == udbVar.a && jl40.l(this.b, udbVar.b) && jl40.l(this.c, udbVar.c) && jl40.l(this.d, udbVar.d) && this.e == udbVar.e && jl40.l(this.f, udbVar.f) && jl40.l(this.g, udbVar.g) && jl40.l(this.h, udbVar.h) && this.i == udbVar.i && this.j == udbVar.j && this.k == udbVar.k && this.l == udbVar.l && this.m == udbVar.m && this.n == udbVar.n && this.o == udbVar.o && this.p == udbVar.p && this.q == udbVar.q && this.r == udbVar.r && this.s == udbVar.s && jl40.l(this.t, udbVar.t) && this.u == udbVar.u && this.v == udbVar.v && jl40.l(this.w, udbVar.w) && this.x == udbVar.x && this.y == udbVar.y && this.z == udbVar.z && this.A == udbVar.A && this.B == udbVar.B && this.C == udbVar.C && this.D == udbVar.D;
    }

    public final int hashCode() {
        int b = unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int b2 = oyr.b(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f;
        int hashCode2 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.g;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.h;
        int e = unr0.e(unr0.e(unr0.e(oyr.b(this.p, unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.j, qv10.c((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s);
        String str3 = this.t;
        return Boolean.hashCode(this.D) + qv10.c(qv10.c(qv10.c(qv10.c(unr0.e(unr0.e(unr0.b(qv10.c(unr0.e((e + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
    }

    public final String toString() {
        StringBuilder k = x4e.k("ChatViewEntity(chatInternalId=", this.a, ", chatId=", this.b);
        k.append(", namespace=");
        k.append(this.c);
        k.append(", url=");
        k.append(this.d);
        k.append(", unseenCount=");
        k.append(this.e);
        k.append(", addresseeId=");
        k.append(this.f);
        k.append(", averageResponseTime=");
        k.append(this.g);
        k.append(", firstUnseenRow=");
        k.append(this.h);
        x4e.A(this.i, ", flags=", ", rights=", k);
        tse0.z(k, this.j, ", mute=", this.k, ", muteMentions=");
        nnm.v(", isMember=", ", isBlocked=", k, this.l, this.m);
        nnm.v(", isSubscriber=", ", participantsCount=", k, this.n, this.o);
        tse0.z(k, this.p, ", canCall=", this.q, ", isAdmin=");
        nnm.v(", isPhoneRequiredForWrite=", ", currentProfileId=", k, this.r, this.s);
        tse0.y(this.t, ", isTransient=", ", sortTime=", k, this.u);
        uw51.v(this.v, ", displayName=", this.w, k);
        n.z(", isPinned=", ", isHidden=", k, this.x, this.y);
        x4e.A(this.z, ", minMessageTimestamp=", ", lastSeqNo=", k);
        k.append(this.A);
        x4e.A(this.B, ", lastMessageTimestamp=", ", supportedEvents=", k);
        k.append(this.C);
        k.append(", hasGuests=");
        k.append(this.D);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
