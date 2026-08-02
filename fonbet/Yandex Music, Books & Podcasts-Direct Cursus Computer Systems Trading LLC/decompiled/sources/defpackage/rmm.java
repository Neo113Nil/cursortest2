package defpackage;

import android.os.Trace;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rmm implements duf {
    public final int a;
    public final long b;
    public final xdh c;
    public anr d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ma h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public final /* synthetic */ sfm m;

    public rmm(sfm sfmVar, int i, long j, xdh xdhVar) {
        this.m = sfmVar;
        this.a = i;
        this.b = j;
        this.c = xdhVar;
        gis.a.getClass();
        rdi.a.getClass();
        this.l = rdi.a();
    }

    @Override // defpackage.duf
    public final void a() {
        this.i = true;
    }

    public final boolean b(ci0 ci0Var) {
        long j;
        xdh xdhVar;
        long j2;
        xdh xdhVar2;
        long j3;
        long j4;
        List list;
        long j5 = ci0Var.a;
        sfm sfmVar = this.m;
        ttf ttfVar = (ttf) ((stf) sfmVar.a).b.invoke();
        if (this.f) {
            return false;
        }
        int a = ttfVar.a();
        int i = this.a;
        if (i < 0 || i >= a) {
            return false;
        }
        Object c = ttfVar.c(i);
        this.j = Math.max(0L, j5 - System.nanoTime());
        gis.a.getClass();
        rdi.a.getClass();
        this.l = rdi.a();
        this.k = 0L;
        anr anrVar = this.d;
        xdh xdhVar3 = this.c;
        if (anrVar != null) {
            j3 = j5;
            j = 0;
            xdhVar2 = xdhVar3;
        } else {
            j = 0;
            long j6 = this.j;
            long j7 = xdhVar3.f(c).a;
            if ((!this.i || j6 <= 0) && j7 >= j6) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                if (this.d != null) {
                    vme.a("Request was already composed!");
                }
                Object e = ttfVar.e(i);
                this.d = ((cnr) sfmVar.b).a().g(e, ((stf) sfmVar.a).a(i, e, c));
                Trace.endSection();
                d();
                long j8 = this.k;
                xg2 xg2Var = (xg2) xdhVar3.a;
                long j9 = xg2Var.a;
                if (j9 == 0) {
                    j2 = j8;
                    xdhVar = xdhVar3;
                } else {
                    long j10 = 4;
                    xdhVar = xdhVar3;
                    j2 = (j8 / j10) + ((j9 / j10) * 3);
                }
                xg2Var.a = j2;
                xdhVar2 = xdhVar;
                xg2 f = xdhVar2.f(c);
                long j11 = f.a;
                if (j11 == 0) {
                    j3 = j5;
                } else {
                    long j12 = 4;
                    j3 = j5;
                    j8 = (j8 / j12) + ((j11 / j12) * 3);
                }
                f.a = j8;
            } finally {
            }
        }
        if (!this.i) {
            if (!this.g) {
                if (this.j <= j) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.h = c();
                    this.g = true;
                } finally {
                }
            }
            ma maVar = this.h;
            if (maVar != null) {
                List[] listArr = (List[]) maVar.d;
                int i2 = maVar.a;
                List list2 = (List) maVar.c;
                if (i2 < list2.size()) {
                    if (((rmm) maVar.e).f) {
                        vme.c("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (maVar.a < list2.size()) {
                        try {
                            if (listArr[maVar.a] == null) {
                                long j13 = j;
                                if (Math.max(j13, j3 - System.nanoTime()) <= j13) {
                                    return true;
                                }
                                int i3 = maVar.a;
                                euf eufVar = (euf) list2.get(i3);
                                Function1 function1 = eufVar.a;
                                if (function1 == null) {
                                    list = c5b.a;
                                } else {
                                    cuf cufVar = new cuf(eufVar);
                                    function1.invoke(cufVar);
                                    list = cufVar.a;
                                }
                                listArr[i3] = list;
                            }
                            List list3 = listArr[maVar.a];
                            list3.getClass();
                            while (maVar.b < list3.size()) {
                                if (((rmm) list3.get(maVar.b)).b(ci0Var)) {
                                    return true;
                                }
                                maVar.b++;
                            }
                            maVar.b = 0;
                            maVar.a++;
                            j = 0;
                        } finally {
                        }
                    }
                }
            }
            d();
        }
        if (this.e) {
            return false;
        }
        long j14 = this.b;
        if (ga6.l(j14)) {
            return false;
        }
        long j15 = this.j;
        long j16 = xdhVar2.f(c).b;
        if ((!this.i || j15 <= 0) && j16 >= j15) {
            return true;
        }
        Trace.beginSection("compose:lazy:prefetch:measure");
        try {
            if (this.f) {
                vme.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.e) {
                vme.a("Request was already measured!");
            }
            this.e = true;
            anr anrVar2 = this.d;
            if (anrVar2 != null) {
                int b = anrVar2.b();
                for (int i4 = 0; i4 < b; i4++) {
                    anrVar2.d(i4, j14);
                }
            } else {
                vme.b("performComposition() must be called before performMeasure()");
                rj7.f();
            }
            Trace.endSection();
            d();
            long j17 = this.k;
            xg2 xg2Var2 = (xg2) xdhVar2.a;
            long j18 = xg2Var2.b;
            if (j18 == 0) {
                j4 = j17;
            } else {
                long j19 = 4;
                j4 = (j17 / j19) + ((j18 / j19) * 3);
            }
            xg2Var2.b = j4;
            xg2 f2 = xdhVar2.f(c);
            long j20 = f2.b;
            if (j20 != 0) {
                long j21 = 4;
                j17 = (j17 / j21) + ((j20 / j21) * 3);
            }
            f2.b = j17;
            return false;
        } finally {
        }
    }

    public final ma c() {
        anr anrVar = this.d;
        if (anrVar == null) {
            vme.b("Should precompose before resolving nested prefetch states");
            rj7.f();
            return null;
        }
        xqn xqnVar = new xqn();
        anrVar.c(new ne0(xqnVar, 7));
        List list = (List) xqnVar.a;
        if (list == null) {
            return null;
        }
        ma maVar = new ma();
        maVar.e = this;
        maVar.c = list;
        maVar.d = new List[list.size()];
        if (list.isEmpty()) {
            vme.a("NestedPrefetchController shouldn't be created with no states");
        }
        return maVar;
    }

    @Override // defpackage.duf
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        anr anrVar = this.d;
        if (anrVar != null) {
            anrVar.a();
        }
        this.d = null;
    }

    public final void d() {
        gis.a.getClass();
        rdi.a.getClass();
        long a = rdi.a();
        long c = fis.c(a, this.l);
        msa msaVar = nsa.b;
        long j = c >> 1;
        if ((((int) c) & 1) != 0) {
            j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
        }
        this.k = j;
        this.j -= j;
        this.l = a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append((Object) ga6.m(this.b));
        sb.append(", isComposed = ");
        sb.append(this.d != null);
        sb.append(", isMeasured = ");
        sb.append(this.e);
        sb.append(", isCanceled = ");
        return ouj.r(sb, this.f, " }");
    }
}
