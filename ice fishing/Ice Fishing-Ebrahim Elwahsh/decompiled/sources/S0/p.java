package S0;

import com.google.android.gms.internal.ads.CL;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f2920a;

    /* renamed from: b, reason: collision with root package name */
    public int f2921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2922c;

    /* renamed from: d, reason: collision with root package name */
    public String f2923d;

    /* renamed from: e, reason: collision with root package name */
    public J0.h f2924e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.h f2925f;

    /* renamed from: g, reason: collision with root package name */
    public long f2926g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2927h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public J0.d f2928j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2929k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2930l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2931m;

    /* renamed from: n, reason: collision with root package name */
    public long f2932n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2933o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2934p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2935q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2936r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2937s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2938t;

    static {
        kotlin.jvm.internal.h.d(J0.s.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public p(String id, int i, String workerClassName, String str, J0.h input, J0.h output, long j9, long j10, long j11, J0.d constraints, int i4, int i9, long j12, long j13, long j14, long j15, boolean z8, int i10, int i11, int i12) {
        kotlin.jvm.internal.h.e(id, "id");
        CL.o(i, com.anythink.core.express.b.a.f17684b);
        kotlin.jvm.internal.h.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.h.e(input, "input");
        kotlin.jvm.internal.h.e(output, "output");
        kotlin.jvm.internal.h.e(constraints, "constraints");
        CL.o(i9, "backoffPolicy");
        CL.o(i10, "outOfQuotaPolicy");
        this.f2920a = id;
        this.f2921b = i;
        this.f2922c = workerClassName;
        this.f2923d = str;
        this.f2924e = input;
        this.f2925f = output;
        this.f2926g = j9;
        this.f2927h = j10;
        this.i = j11;
        this.f2928j = constraints;
        this.f2929k = i4;
        this.f2930l = i9;
        this.f2931m = j12;
        this.f2932n = j13;
        this.f2933o = j14;
        this.f2934p = j15;
        this.f2935q = z8;
        this.f2936r = i10;
        this.f2937s = i11;
        this.f2938t = i12;
    }

    public final long a() {
        int i;
        if (this.f2921b == 1 && (i = this.f2929k) > 0) {
            long j9 = this.f2931m;
            long scalb = this.f2930l == 2 ? j9 * i : (long) Math.scalb(j9, i - 1);
            long j10 = this.f2932n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j10 + scalb;
        }
        if (!c()) {
            long j11 = this.f2932n;
            if (j11 == 0) {
                j11 = System.currentTimeMillis();
            }
            return j11 + this.f2926g;
        }
        int i4 = this.f2937s;
        long j12 = this.f2932n;
        if (i4 == 0) {
            j12 += this.f2926g;
        }
        long j13 = this.i;
        long j14 = this.f2927h;
        if (j13 != j14) {
            return j12 + j14 + (i4 == 0 ? (-1) * j13 : 0L);
        }
        return j12 + (i4 != 0 ? j14 : 0L);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.h.a(J0.d.i, this.f2928j);
    }

    public final boolean c() {
        return this.f2927h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.h.a(this.f2920a, pVar.f2920a) && this.f2921b == pVar.f2921b && kotlin.jvm.internal.h.a(this.f2922c, pVar.f2922c) && kotlin.jvm.internal.h.a(this.f2923d, pVar.f2923d) && kotlin.jvm.internal.h.a(this.f2924e, pVar.f2924e) && kotlin.jvm.internal.h.a(this.f2925f, pVar.f2925f) && this.f2926g == pVar.f2926g && this.f2927h == pVar.f2927h && this.i == pVar.i && kotlin.jvm.internal.h.a(this.f2928j, pVar.f2928j) && this.f2929k == pVar.f2929k && this.f2930l == pVar.f2930l && this.f2931m == pVar.f2931m && this.f2932n == pVar.f2932n && this.f2933o == pVar.f2933o && this.f2934p == pVar.f2934p && this.f2935q == pVar.f2935q && this.f2936r == pVar.f2936r && this.f2937s == pVar.f2937s && this.f2938t == pVar.f2938t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int k6 = AbstractC5051n.k((AbstractC5088e.d(this.f2921b) + (this.f2920a.hashCode() * 31)) * 31, 31, this.f2922c);
        String str = this.f2923d;
        int hashCode = (Long.hashCode(this.f2934p) + ((Long.hashCode(this.f2933o) + ((Long.hashCode(this.f2932n) + ((Long.hashCode(this.f2931m) + ((AbstractC5088e.d(this.f2930l) + ((Integer.hashCode(this.f2929k) + ((this.f2928j.hashCode() + ((Long.hashCode(this.i) + ((Long.hashCode(this.f2927h) + ((Long.hashCode(this.f2926g) + ((this.f2925f.hashCode() + ((this.f2924e.hashCode() + ((k6 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z8 = this.f2935q;
        int i = z8;
        if (z8 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f2938t) + ((Integer.hashCode(this.f2937s) + ((AbstractC5088e.d(this.f2936r) + ((hashCode + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f2920a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(String str, int i, String str2, String str3, J0.h hVar, J0.h hVar2, long j9, long j10, long j11, J0.d dVar, int i4, int i9, long j12, long j13, long j14, long j15, boolean z8, int i10, int i11, int i12, int i13) {
        this(str, r5, str2, r7, r8, r9, (i12 & 64) != 0 ? 0L : j9, (i12 & 128) != 0 ? 0L : j10, (i12 & 256) != 0 ? 0L : j11, (i12 & 512) != 0 ? J0.d.i : dVar, (i12 & 1024) != 0 ? 0 : i4, (i12 & 2048) != 0 ? 1 : i9, (i12 & 4096) != 0 ? 30000L : j12, (i12 & 8192) != 0 ? 0L : j13, (i12 & 16384) != 0 ? 0L : j14, (32768 & i12) != 0 ? -1L : j15, (65536 & i12) != 0 ? false : z8, (131072 & i12) != 0 ? 1 : i10, (i12 & 262144) != 0 ? 0 : i11, 0);
        J0.h hVar3;
        J0.h hVar4;
        int i14 = (i12 & 2) != 0 ? 1 : i;
        String str4 = (i12 & 8) != 0 ? null : str3;
        if ((i12 & 16) != 0) {
            J0.h EMPTY = J0.h.f1315c;
            kotlin.jvm.internal.h.d(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i12 & 32) != 0) {
            J0.h EMPTY2 = J0.h.f1315c;
            kotlin.jvm.internal.h.d(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
    }
}
