package com.gamericefishpro.space.n9;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends FutureTask implements Comparable {
    public final long d;
    public final boolean e;
    public final String i;
    public final /* synthetic */ p1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.v = p1Var;
        long andIncrement = p1.D.getAndIncrement();
        this.d = andIncrement;
        this.i = str;
        this.e = z;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((r1) p1Var.d).y;
            r1.l(v0Var);
            v0Var.y.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n1 n1Var = (n1) obj;
        boolean z = n1Var.e;
        boolean z2 = this.e;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = n1Var.d;
        long j2 = this.d;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        v0 v0Var = ((r1) this.v.d).y;
        r1.l(v0Var);
        v0Var.z.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        v0 v0Var = ((r1) this.v.d).y;
        r1.l(v0Var);
        v0Var.y.b(th, this.i);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Callable callable, boolean z) {
        super(callable);
        this.v = p1Var;
        long andIncrement = p1.D.getAndIncrement();
        this.d = andIncrement;
        this.i = "Task exception on worker thread";
        this.e = z;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((r1) p1Var.d).y;
            r1.l(v0Var);
            v0Var.y.a("Tasks index overflow");
        }
    }
}
