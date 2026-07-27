package S0;

import com.icefishing.icefishinglive2.AbstractC4404f;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f2808a;

    /* renamed from: b, reason: collision with root package name */
    public int f2809b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2810c;

    /* renamed from: d, reason: collision with root package name */
    public String f2811d;

    /* renamed from: e, reason: collision with root package name */
    public J0.h f2812e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.h f2813f;

    /* renamed from: g, reason: collision with root package name */
    public long f2814g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2815h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public J0.d f2816j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2817k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2818l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2819m;

    /* renamed from: n, reason: collision with root package name */
    public long f2820n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2821o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2822p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2823q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2824r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2825s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2826t;

    static {
        kotlin.jvm.internal.h.d(J0.s.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public p(String id, int i, String workerClassName, String str, J0.h input, J0.h output, long j6, long j9, long j10, J0.d constraints, int i6, int i9, long j11, long j12, long j13, long j14, boolean z3, int i10, int i11, int i12) {
        kotlin.jvm.internal.h.e(id, "id");
        AbstractC4404f.l(i, com.anythink.core.express.b.a.f17526b);
        kotlin.jvm.internal.h.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.h.e(input, "input");
        kotlin.jvm.internal.h.e(output, "output");
        kotlin.jvm.internal.h.e(constraints, "constraints");
        AbstractC4404f.l(i9, "backoffPolicy");
        AbstractC4404f.l(i10, "outOfQuotaPolicy");
        this.f2808a = id;
        this.f2809b = i;
        this.f2810c = workerClassName;
        this.f2811d = str;
        this.f2812e = input;
        this.f2813f = output;
        this.f2814g = j6;
        this.f2815h = j9;
        this.i = j10;
        this.f2816j = constraints;
        this.f2817k = i6;
        this.f2818l = i9;
        this.f2819m = j11;
        this.f2820n = j12;
        this.f2821o = j13;
        this.f2822p = j14;
        this.f2823q = z3;
        this.f2824r = i10;
        this.f2825s = i11;
        this.f2826t = i12;
    }

    public final long a() {
        int i;
        if (this.f2809b == 1 && (i = this.f2817k) > 0) {
            long j6 = this.f2819m;
            long scalb = this.f2818l == 2 ? j6 * i : (long) Math.scalb(j6, i - 1);
            long j9 = this.f2820n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j9 + scalb;
        }
        if (!c()) {
            long j10 = this.f2820n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.f2814g;
        }
        int i6 = this.f2825s;
        long j11 = this.f2820n;
        if (i6 == 0) {
            j11 += this.f2814g;
        }
        long j12 = this.i;
        long j13 = this.f2815h;
        if (j12 != j13) {
            return j11 + j13 + (i6 == 0 ? (-1) * j12 : 0L);
        }
        return j11 + (i6 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.h.a(J0.d.i, this.f2816j);
    }

    public final boolean c() {
        return this.f2815h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.h.a(this.f2808a, pVar.f2808a) && this.f2809b == pVar.f2809b && kotlin.jvm.internal.h.a(this.f2810c, pVar.f2810c) && kotlin.jvm.internal.h.a(this.f2811d, pVar.f2811d) && kotlin.jvm.internal.h.a(this.f2812e, pVar.f2812e) && kotlin.jvm.internal.h.a(this.f2813f, pVar.f2813f) && this.f2814g == pVar.f2814g && this.f2815h == pVar.f2815h && this.i == pVar.i && kotlin.jvm.internal.h.a(this.f2816j, pVar.f2816j) && this.f2817k == pVar.f2817k && this.f2818l == pVar.f2818l && this.f2819m == pVar.f2819m && this.f2820n == pVar.f2820n && this.f2821o == pVar.f2821o && this.f2822p == pVar.f2822p && this.f2823q == pVar.f2823q && this.f2824r == pVar.f2824r && this.f2825s == pVar.f2825s && this.f2826t == pVar.f2826t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int k9 = u1.h.k((AbstractC5049e.d(this.f2809b) + (this.f2808a.hashCode() * 31)) * 31, 31, this.f2810c);
        String str = this.f2811d;
        int hashCode = (Long.hashCode(this.f2822p) + ((Long.hashCode(this.f2821o) + ((Long.hashCode(this.f2820n) + ((Long.hashCode(this.f2819m) + ((AbstractC5049e.d(this.f2818l) + ((Integer.hashCode(this.f2817k) + ((this.f2816j.hashCode() + ((Long.hashCode(this.i) + ((Long.hashCode(this.f2815h) + ((Long.hashCode(this.f2814g) + ((this.f2813f.hashCode() + ((this.f2812e.hashCode() + ((k9 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z3 = this.f2823q;
        int i = z3;
        if (z3 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f2826t) + ((Integer.hashCode(this.f2825s) + ((AbstractC5049e.d(this.f2824r) + ((hashCode + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f2808a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(String str, int i, String str2, String str3, J0.h hVar, J0.h hVar2, long j6, long j9, long j10, J0.d dVar, int i6, int i9, long j11, long j12, long j13, long j14, boolean z3, int i10, int i11, int i12, int i13) {
        this(str, r5, str2, r7, r8, r9, (i12 & 64) != 0 ? 0L : j6, (i12 & 128) != 0 ? 0L : j9, (i12 & 256) != 0 ? 0L : j10, (i12 & 512) != 0 ? J0.d.i : dVar, (i12 & 1024) != 0 ? 0 : i6, (i12 & 2048) != 0 ? 1 : i9, (i12 & 4096) != 0 ? 30000L : j11, (i12 & 8192) != 0 ? 0L : j12, (i12 & 16384) != 0 ? 0L : j13, (32768 & i12) != 0 ? -1L : j14, (65536 & i12) != 0 ? false : z3, (131072 & i12) != 0 ? 1 : i10, (i12 & 262144) != 0 ? 0 : i11, 0);
        J0.h hVar3;
        J0.h hVar4;
        int i14 = (i12 & 2) != 0 ? 1 : i;
        String str4 = (i12 & 8) != 0 ? null : str3;
        if ((i12 & 16) != 0) {
            J0.h EMPTY = J0.h.f1390c;
            kotlin.jvm.internal.h.d(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i12 & 32) != 0) {
            J0.h EMPTY2 = J0.h.f1390c;
            kotlin.jvm.internal.h.d(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
    }
}
