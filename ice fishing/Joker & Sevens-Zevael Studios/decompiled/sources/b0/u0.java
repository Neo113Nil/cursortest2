package b0;

import android.os.Trace;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f901a;

    /* renamed from: b, reason: collision with root package name */
    public final long f902b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f903c;

    /* renamed from: d, reason: collision with root package name */
    public v1.q0 f904d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f905e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f906f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f907g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f909i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a5.c f910j;

    public u0(a5.c cVar, int i10, long j3, v0 v0Var) {
        this.f910j = cVar;
        this.f901a = i10;
        this.f902b = j3;
        this.f903c = v0Var;
    }

    @Override // b0.c0
    public final void a() {
        this.f909i = true;
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Serializable, java.util.List[]] */
    public final boolean b(a aVar) {
        s0 s0Var;
        if (c()) {
            Object b2 = ((a0.i) ((s) this.f910j.f262h).f886b.invoke()).b(this.f901a);
            v1.q0 q0Var = this.f904d;
            v0 v0Var = this.f903c;
            if (q0Var == null) {
                long c3 = (b2 == null || v0Var.f916a.b(b2) < 0) ? v0Var.f918c : v0Var.f916a.c(b2);
                long a6 = aVar.a();
                if ((!this.f909i || a6 <= 0) && c3 >= a6) {
                    return true;
                }
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (b2 != null) {
                        s.b0 b0Var = v0Var.f916a;
                        int b10 = b0Var.b(b2);
                        v0Var.f916a.e(v0.a(v0Var, nanoTime2, b10 >= 0 ? b0Var.f6228c[b10] : 0L), b2);
                    }
                    v0Var.f918c = v0.a(v0Var, nanoTime2, v0Var.f918c);
                } finally {
                }
            }
            if (!this.f909i) {
                if (!this.f907g) {
                    if (aVar.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        v1.q0 q0Var2 = this.f904d;
                        if (q0Var2 == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        pc.s sVar = new pc.s();
                        q0Var2.b(new t0(sVar, 0));
                        List list = (List) sVar.f5683g;
                        if (list != null) {
                            s0Var = new s0();
                            s0Var.f892e = this;
                            s0Var.f890c = list;
                            s0Var.f891d = new List[list.size()];
                            if (list.isEmpty()) {
                                throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                            }
                        } else {
                            s0Var = null;
                        }
                        this.f908h = s0Var;
                        this.f907g = true;
                    } finally {
                    }
                }
                s0 s0Var2 = this.f908h;
                if (s0Var2 != null) {
                    List[] listArr = (List[]) s0Var2.f891d;
                    int i10 = s0Var2.f888a;
                    List list2 = (List) s0Var2.f890c;
                    if (i10 < list2.size()) {
                        if (((u0) s0Var2.f892e).f906f) {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (s0Var2.f888a < list2.size()) {
                            try {
                                if (listArr[s0Var2.f888a] == null) {
                                    if (aVar.a() <= 0) {
                                        return true;
                                    }
                                    int i11 = s0Var2.f888a;
                                    d0 d0Var = (d0) list2.get(i11);
                                    a0.w wVar = d0Var.f813a;
                                    b0 b0Var2 = new b0(d0Var);
                                    wVar.invoke(b0Var2);
                                    listArr[i11] = b0Var2.f805a;
                                }
                                List list3 = listArr[s0Var2.f888a];
                                pc.j.b(list3);
                                while (s0Var2.f889b < list3.size()) {
                                    if (((u0) list3.get(s0Var2.f889b)).b(aVar)) {
                                        return true;
                                    }
                                    s0Var2.f889b++;
                                }
                                s0Var2.f889b = 0;
                                s0Var2.f888a++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            }
            if (!this.f905e) {
                long j3 = this.f902b;
                int i12 = (int) (3 & j3);
                int i13 = (((i12 & 2) >> 1) * 3) + ((i12 & 1) << 1);
                int i14 = (((int) (j3 >> 33)) & ((1 << (i13 + 13)) - 1)) - 1;
                if (!(((((1 << (18 - i13)) - 1) & ((int) (j3 >> (i13 + 46)))) - 1 == 0) | (i14 == 0))) {
                    long c7 = (b2 == null || v0Var.f917b.b(b2) < 0) ? v0Var.f919d : v0Var.f917b.c(b2);
                    long a8 = aVar.a();
                    if ((!this.f909i || a8 <= 0) && c7 >= a8) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j3);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (b2 != null) {
                            s.b0 b0Var3 = v0Var.f917b;
                            int b11 = b0Var3.b(b2);
                            v0Var.f917b.e(v0.a(v0Var, nanoTime4, b11 >= 0 ? b0Var3.f6228c[b11] : 0L), b2);
                        }
                        v0Var.f919d = v0.a(v0Var, nanoTime4, v0Var.f919d);
                        return false;
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.f906f) {
            return false;
        }
        int c3 = ((a0.i) ((s) this.f910j.f262h).f886b.invoke()).c();
        int i10 = this.f901a;
        return i10 >= 0 && i10 < c3;
    }

    @Override // b0.c0
    public final void cancel() {
        if (this.f906f) {
            return;
        }
        this.f906f = true;
        v1.q0 q0Var = this.f904d;
        if (q0Var != null) {
            q0Var.a();
        }
        this.f904d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f904d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        a5.c cVar = this.f910j;
        a0.i iVar = (a0.i) ((s) cVar.f262h).f886b.invoke();
        int i10 = this.f901a;
        Object d10 = iVar.d(i10);
        this.f904d = ((v1.s0) cVar.f261g).a().f(d10, ((s) cVar.f262h).a(i10, d10, iVar.b(i10)));
    }

    public final void e(long j3) {
        if (this.f906f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f905e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f905e = true;
        v1.q0 q0Var = this.f904d;
        if (q0Var == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int c3 = q0Var.c();
        for (int i10 = 0; i10 < c3; i10++) {
            q0Var.d(i10, j3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f901a);
        sb.append(", constraints = ");
        sb.append((Object) s2.a.k(this.f902b));
        sb.append(", isComposed = ");
        sb.append(this.f904d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f905e);
        sb.append(", isCanceled = ");
        sb.append(this.f906f);
        sb.append(" }");
        return sb.toString();
    }
}
