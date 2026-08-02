package S0;

import com.google.android.gms.internal.ads.Wv;
import u.AbstractC5050e;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f2937a;

    /* renamed from: b, reason: collision with root package name */
    public int f2938b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2939c;

    /* renamed from: d, reason: collision with root package name */
    public String f2940d;

    /* renamed from: e, reason: collision with root package name */
    public J0.g f2941e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.g f2942f;

    /* renamed from: g, reason: collision with root package name */
    public long f2943g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2944h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public J0.d f2945j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2946k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2947l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2948m;

    /* renamed from: n, reason: collision with root package name */
    public long f2949n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2950o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2951p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2952q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2953r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2954s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2955t;

    static {
        kotlin.jvm.internal.h.d(J0.r.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public p(String id, int i, String workerClassName, String str, J0.g input, J0.g output, long j6, long j9, long j10, J0.d constraints, int i4, int i6, long j11, long j12, long j13, long j14, boolean z6, int i9, int i10, int i11) {
        kotlin.jvm.internal.h.e(id, "id");
        Wv.n(i, com.anythink.core.express.b.a.f18313b);
        kotlin.jvm.internal.h.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.h.e(input, "input");
        kotlin.jvm.internal.h.e(output, "output");
        kotlin.jvm.internal.h.e(constraints, "constraints");
        Wv.n(i6, "backoffPolicy");
        Wv.n(i9, "outOfQuotaPolicy");
        this.f2937a = id;
        this.f2938b = i;
        this.f2939c = workerClassName;
        this.f2940d = str;
        this.f2941e = input;
        this.f2942f = output;
        this.f2943g = j6;
        this.f2944h = j9;
        this.i = j10;
        this.f2945j = constraints;
        this.f2946k = i4;
        this.f2947l = i6;
        this.f2948m = j11;
        this.f2949n = j12;
        this.f2950o = j13;
        this.f2951p = j14;
        this.f2952q = z6;
        this.f2953r = i9;
        this.f2954s = i10;
        this.f2955t = i11;
    }

    public final long a() {
        int i;
        if (this.f2938b == 1 && (i = this.f2946k) > 0) {
            long j6 = this.f2948m;
            long scalb = this.f2947l == 2 ? j6 * i : (long) Math.scalb(j6, i - 1);
            long j9 = this.f2949n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j9 + scalb;
        }
        if (!c()) {
            long j10 = this.f2949n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.f2943g;
        }
        int i4 = this.f2954s;
        long j11 = this.f2949n;
        if (i4 == 0) {
            j11 += this.f2943g;
        }
        long j12 = this.i;
        long j13 = this.f2944h;
        if (j12 != j13) {
            return j11 + j13 + (i4 == 0 ? (-1) * j12 : 0L);
        }
        return j11 + (i4 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.h.a(J0.d.i, this.f2945j);
    }

    public final boolean c() {
        return this.f2944h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.h.a(this.f2937a, pVar.f2937a) && this.f2938b == pVar.f2938b && kotlin.jvm.internal.h.a(this.f2939c, pVar.f2939c) && kotlin.jvm.internal.h.a(this.f2940d, pVar.f2940d) && kotlin.jvm.internal.h.a(this.f2941e, pVar.f2941e) && kotlin.jvm.internal.h.a(this.f2942f, pVar.f2942f) && this.f2943g == pVar.f2943g && this.f2944h == pVar.f2944h && this.i == pVar.i && kotlin.jvm.internal.h.a(this.f2945j, pVar.f2945j) && this.f2946k == pVar.f2946k && this.f2947l == pVar.f2947l && this.f2948m == pVar.f2948m && this.f2949n == pVar.f2949n && this.f2950o == pVar.f2950o && this.f2951p == pVar.f2951p && this.f2952q == pVar.f2952q && this.f2953r == pVar.f2953r && this.f2954s == pVar.f2954s && this.f2955t == pVar.f2955t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a9 = AbstractC5128c.a((AbstractC5050e.d(this.f2938b) + (this.f2937a.hashCode() * 31)) * 31, 31, this.f2939c);
        String str = this.f2940d;
        int hashCode = (Long.hashCode(this.f2951p) + ((Long.hashCode(this.f2950o) + ((Long.hashCode(this.f2949n) + ((Long.hashCode(this.f2948m) + ((AbstractC5050e.d(this.f2947l) + ((Integer.hashCode(this.f2946k) + ((this.f2945j.hashCode() + ((Long.hashCode(this.i) + ((Long.hashCode(this.f2944h) + ((Long.hashCode(this.f2943g) + ((this.f2942f.hashCode() + ((this.f2941e.hashCode() + ((a9 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z6 = this.f2952q;
        int i = z6;
        if (z6 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f2955t) + ((Integer.hashCode(this.f2954s) + ((AbstractC5050e.d(this.f2953r) + ((hashCode + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f2937a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(String str, int i, String str2, String str3, J0.g gVar, J0.g gVar2, long j6, long j9, long j10, J0.d dVar, int i4, int i6, long j11, long j12, long j13, long j14, boolean z6, int i9, int i10, int i11, int i12) {
        this(str, r5, str2, r7, r8, r9, (i11 & 64) != 0 ? 0L : j6, (i11 & 128) != 0 ? 0L : j9, (i11 & 256) != 0 ? 0L : j10, (i11 & 512) != 0 ? J0.d.i : dVar, (i11 & 1024) != 0 ? 0 : i4, (i11 & 2048) != 0 ? 1 : i6, (i11 & 4096) != 0 ? 30000L : j11, (i11 & 8192) != 0 ? 0L : j12, (i11 & 16384) != 0 ? 0L : j13, (32768 & i11) != 0 ? -1L : j14, (65536 & i11) != 0 ? false : z6, (131072 & i11) != 0 ? 1 : i9, (i11 & 262144) != 0 ? 0 : i10, 0);
        J0.g gVar3;
        J0.g gVar4;
        int i13 = (i11 & 2) != 0 ? 1 : i;
        String str4 = (i11 & 8) != 0 ? null : str3;
        if ((i11 & 16) != 0) {
            J0.g EMPTY = J0.g.f1418c;
            kotlin.jvm.internal.h.d(EMPTY, "EMPTY");
            gVar3 = EMPTY;
        } else {
            gVar3 = gVar;
        }
        if ((i11 & 32) != 0) {
            J0.g EMPTY2 = J0.g.f1418c;
            kotlin.jvm.internal.h.d(EMPTY2, "EMPTY");
            gVar4 = EMPTY2;
        } else {
            gVar4 = gVar2;
        }
    }
}
