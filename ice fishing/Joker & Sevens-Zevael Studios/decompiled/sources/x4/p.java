package x4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f8322a;

    /* renamed from: b, reason: collision with root package name */
    public int f8323b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8324c;

    /* renamed from: d, reason: collision with root package name */
    public String f8325d;

    /* renamed from: e, reason: collision with root package name */
    public o4.e f8326e;

    /* renamed from: f, reason: collision with root package name */
    public final o4.e f8327f;

    /* renamed from: g, reason: collision with root package name */
    public long f8328g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8329h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8330i;

    /* renamed from: j, reason: collision with root package name */
    public o4.d f8331j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8332k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8333l;

    /* renamed from: m, reason: collision with root package name */
    public final long f8334m;

    /* renamed from: n, reason: collision with root package name */
    public long f8335n;

    /* renamed from: o, reason: collision with root package name */
    public final long f8336o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8337p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8338q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8339r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8340s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8341t;

    static {
        pc.j.d(o4.o.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public p(String str, int i10, String str2, String str3, o4.e eVar, o4.e eVar2, long j3, long j6, long j10, o4.d dVar, int i11, int i12, long j11, long j12, long j13, long j14, boolean z10, int i13, int i14, int i15) {
        pc.j.e(str, "id");
        a4.d.t("state", i10);
        pc.j.e(str2, "workerClassName");
        pc.j.e(eVar, "input");
        pc.j.e(eVar2, "output");
        pc.j.e(dVar, "constraints");
        a4.d.t("backoffPolicy", i12);
        a4.d.t("outOfQuotaPolicy", i13);
        this.f8322a = str;
        this.f8323b = i10;
        this.f8324c = str2;
        this.f8325d = str3;
        this.f8326e = eVar;
        this.f8327f = eVar2;
        this.f8328g = j3;
        this.f8329h = j6;
        this.f8330i = j10;
        this.f8331j = dVar;
        this.f8332k = i11;
        this.f8333l = i12;
        this.f8334m = j11;
        this.f8335n = j12;
        this.f8336o = j13;
        this.f8337p = j14;
        this.f8338q = z10;
        this.f8339r = i13;
        this.f8340s = i14;
        this.f8341t = i15;
    }

    public final long a() {
        int i10;
        if (this.f8323b == 1 && (i10 = this.f8332k) > 0) {
            int i11 = this.f8333l;
            long j3 = this.f8334m;
            long scalb = i11 == 2 ? j3 * i10 : (long) Math.scalb(j3, i10 - 1);
            long j6 = this.f8335n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j6 + scalb;
        }
        if (!c()) {
            long j10 = this.f8335n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.f8328g;
        }
        int i12 = this.f8340s;
        long j11 = this.f8335n;
        if (i12 == 0) {
            j11 += this.f8328g;
        }
        long j12 = this.f8330i;
        long j13 = this.f8329h;
        if (j12 != j13) {
            return j11 + j13 + (i12 == 0 ? (-1) * j12 : 0L);
        }
        return j11 + (i12 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !pc.j.a(o4.d.f5195i, this.f8331j);
    }

    public final boolean c() {
        return this.f8329h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pc.j.a(this.f8322a, pVar.f8322a) && this.f8323b == pVar.f8323b && pc.j.a(this.f8324c, pVar.f8324c) && pc.j.a(this.f8325d, pVar.f8325d) && pc.j.a(this.f8326e, pVar.f8326e) && pc.j.a(this.f8327f, pVar.f8327f) && this.f8328g == pVar.f8328g && this.f8329h == pVar.f8329h && this.f8330i == pVar.f8330i && pc.j.a(this.f8331j, pVar.f8331j) && this.f8332k == pVar.f8332k && this.f8333l == pVar.f8333l && this.f8334m == pVar.f8334m && this.f8335n == pVar.f8335n && this.f8336o == pVar.f8336o && this.f8337p == pVar.f8337p && this.f8338q == pVar.f8338q && this.f8339r == pVar.f8339r && this.f8340s == pVar.f8340s && this.f8341t == pVar.f8341t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f8324c.hashCode() + ((v.f.d(this.f8323b) + (this.f8322a.hashCode() * 31)) * 31)) * 31;
        String str = this.f8325d;
        int c3 = a4.d.c(a4.d.c(a4.d.c(a4.d.c((v.f.d(this.f8333l) + v.f.b(this.f8332k, (this.f8331j.hashCode() + a4.d.c(a4.d.c(a4.d.c((this.f8327f.hashCode() + ((this.f8326e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f8328g), 31, this.f8329h), 31, this.f8330i)) * 31, 31)) * 31, 31, this.f8334m), 31, this.f8335n), 31, this.f8336o), 31, this.f8337p);
        boolean z10 = this.f8338q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return Integer.hashCode(this.f8341t) + v.f.b(this.f8340s, (v.f.d(this.f8339r) + ((c3 + i10) * 31)) * 31, 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f8322a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(String str, int i10, String str2, String str3, o4.e eVar, o4.e eVar2, long j3, long j6, long j10, o4.d dVar, int i11, int i12, long j11, long j12, long j13, long j14, boolean z10, int i13, int i14, int i15, int i16) {
        this(str, r5, str2, r7, r8, r9, (i15 & 64) != 0 ? 0L : j3, (i15 & 128) != 0 ? 0L : j6, (i15 & 256) != 0 ? 0L : j10, (i15 & 512) != 0 ? o4.d.f5195i : dVar, (i15 & 1024) != 0 ? 0 : i11, (i15 & 2048) != 0 ? 1 : i12, (i15 & 4096) != 0 ? 30000L : j11, (i15 & 8192) != 0 ? 0L : j12, (i15 & 16384) != 0 ? 0L : j13, (32768 & i15) != 0 ? -1L : j14, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? 1 : i13, (i15 & 262144) != 0 ? 0 : i14, 0);
        o4.e eVar3;
        o4.e eVar4;
        int i17 = (i15 & 2) != 0 ? 1 : i10;
        String str4 = (i15 & 8) != 0 ? null : str3;
        if ((i15 & 16) != 0) {
            o4.e eVar5 = o4.e.f5205c;
            pc.j.d(eVar5, "EMPTY");
            eVar3 = eVar5;
        } else {
            eVar3 = eVar;
        }
        if ((i15 & 32) != 0) {
            o4.e eVar6 = o4.e.f5205c;
            pc.j.d(eVar6, "EMPTY");
            eVar4 = eVar6;
        } else {
            eVar4 = eVar2;
        }
    }
}
