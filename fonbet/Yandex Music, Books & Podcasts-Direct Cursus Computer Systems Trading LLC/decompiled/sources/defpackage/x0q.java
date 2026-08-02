package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class x0q extends n9 implements xpi, cu3, hzc {
    public final int e;
    public final int f;
    public final oi3 g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public x0q(int i, int i2, oi3 oi3Var) {
        this.e = i;
        this.f = i2;
        this.g = oi3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:38|39|(3:41|42|43)(1:44))(4:18|(1:23)|32|(2:34|35)(1:36))|37))(4:50|51|52|53)|29|30)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|37)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        throw r2.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(x0q x0qVar, rjc rjcVar, Continuation continuation) {
        w0q w0qVar;
        int i;
        x0q x0qVar2;
        Throwable th;
        z0q z0qVar;
        rjc rjcVar2;
        r2f r2fVar;
        Object u;
        r2f r2fVar2;
        rjc rjcVar3;
        if (continuation instanceof w0q) {
            w0qVar = (w0q) continuation;
            int i2 = w0qVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0qVar.p = i2 - Integer.MIN_VALUE;
                Object obj = w0qVar.n;
                nm6 nm6Var = nm6.a;
                i = w0qVar.p;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            r2fVar2 = w0qVar.m;
                            z0qVar = w0qVar.l;
                            rjcVar3 = w0qVar.k;
                            x0qVar2 = w0qVar.j;
                        } else {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            r2fVar2 = w0qVar.m;
                            z0qVar = w0qVar.l;
                            rjcVar3 = w0qVar.k;
                            x0qVar2 = w0qVar.j;
                        }
                        try {
                            qgg.h0(obj);
                            rjcVar2 = rjcVar3;
                            r2fVar = r2fVar2;
                            x0qVar = x0qVar2;
                            while (true) {
                                u = x0qVar.u(z0qVar);
                                if (u == y0q.a) {
                                    w0qVar.j = x0qVar;
                                    w0qVar.k = rjcVar2;
                                    w0qVar.l = z0qVar;
                                    w0qVar.m = r2fVar;
                                    w0qVar.p = 2;
                                    if (x0qVar.k(z0qVar, w0qVar) == nm6Var) {
                                        return;
                                    }
                                } else {
                                    if (r2fVar != null && !r2fVar.b()) {
                                        break;
                                    }
                                    w0qVar.j = x0qVar;
                                    w0qVar.k = rjcVar2;
                                    w0qVar.l = z0qVar;
                                    w0qVar.m = r2fVar;
                                    w0qVar.p = 3;
                                    if (rjcVar2.emit(u, w0qVar) == nm6Var) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z0qVar = w0qVar.l;
                        rjc rjcVar4 = w0qVar.k;
                        x0q x0qVar3 = w0qVar.j;
                        try {
                            qgg.h0(obj);
                            rjcVar2 = rjcVar4;
                            x0qVar = x0qVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            x0qVar2 = x0qVar3;
                        }
                    }
                    x0qVar2.h(z0qVar);
                    throw th;
                }
                qgg.h0(obj);
                z0q z0qVar2 = (z0q) x0qVar.d();
                try {
                    if (rjcVar instanceof knr) {
                        w0qVar.j = x0qVar;
                        w0qVar.k = rjcVar;
                        w0qVar.l = z0qVar2;
                        w0qVar.p = 1;
                        if (((knr) rjcVar).b(w0qVar) == nm6Var) {
                            return;
                        }
                    }
                    rjcVar2 = rjcVar;
                    z0qVar = z0qVar2;
                } catch (Throwable th4) {
                    x0qVar2 = x0qVar;
                    th = th4;
                    z0qVar = z0qVar2;
                }
                r2fVar = (r2f) w0qVar.getContext().get(o6c.l);
                while (true) {
                    u = x0qVar.u(z0qVar);
                    if (u == y0q.a) {
                    }
                }
            }
        }
        w0qVar = new w0q(x0qVar, continuation);
        Object obj2 = w0qVar.n;
        nm6 nm6Var2 = nm6.a;
        i = w0qVar.p;
        if (i == 0) {
        }
        r2fVar = (r2f) w0qVar.getContext().get(o6c.l);
        while (true) {
            u = x0qVar.u(z0qVar);
            if (u == y0q.a) {
            }
        }
    }

    @Override // defpackage.xpi
    public final boolean a(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = xv.a;
        synchronized (this) {
            if (s(obj)) {
                continuationArr = p(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                r7o r7oVar = z7o.b;
                continuation.resumeWith(Unit.a);
            }
        }
        return z;
    }

    @Override // defpackage.u0q
    public final List b() {
        synchronized (this) {
            int q = (int) ((q() + this.k) - this.i);
            if (q == 0) {
                return c5b.a;
            }
            ArrayList arrayList = new ArrayList(q);
            Object[] objArr = this.h;
            objArr.getClass();
            for (int i = 0; i < q; i++) {
                arrayList.add(objArr[((int) (this.i + i)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // defpackage.hzc
    public final pjc c(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return y0q.d(this, coroutineContext, i, oi3Var);
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        m(this, rjcVar, continuation);
        return nm6.a;
    }

    @Override // defpackage.n9
    public final o9 e() {
        z0q z0qVar = new z0q();
        z0qVar.a = -1L;
        return z0qVar;
    }

    @Override // defpackage.xpi, defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Throwable th;
        Continuation[] p;
        v0q v0qVar;
        if (a(obj)) {
            return Unit.a;
        }
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        Continuation[] continuationArr = xv.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(Unit.a);
                        p = p(continuationArr);
                        v0qVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        v0q v0qVar2 = new v0q(this, q() + this.k + this.l, obj, zt3Var);
                        o(v0qVar2);
                        this.l++;
                        if (this.f == 0) {
                            continuationArr = p(continuationArr);
                        }
                        p = continuationArr;
                        v0qVar = v0qVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (v0qVar != null) {
                    zt3Var.v(new ot3(2, v0qVar));
                }
                for (Continuation continuation2 : p) {
                    if (continuation2 != null) {
                        r7o r7oVar2 = z7o.b;
                        continuation2.resumeWith(Unit.a);
                    }
                }
                Object q = zt3Var.q();
                nm6 nm6Var = nm6.a;
                if (q != nm6Var) {
                    q = Unit.a;
                }
                return q == nm6Var ? q : Unit.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.n9
    public final o9[] f() {
        return new z0q[2];
    }

    @Override // defpackage.xpi
    public final void g() {
        synchronized (this) {
            try {
                try {
                    v(q() + this.k, this.j, q() + this.k, q() + this.k + this.l);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final Object k(z0q z0qVar, w0q w0qVar) {
        zt3 zt3Var = new zt3(1, qxe.b(w0qVar));
        zt3Var.s();
        synchronized (this) {
            try {
                if (t(z0qVar) < 0) {
                    z0qVar.b = zt3Var;
                } else {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(Unit.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q = zt3Var.q();
        return q == nm6.a ? q : Unit.a;
    }

    public final void l() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            objArr.getClass();
            while (this.l > 0) {
                long q = q();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((q + (i + i2)) - 1)) & (objArr.length - 1)] != y0q.a) {
                    return;
                }
                this.l = i2 - 1;
                y0q.c(objArr, q() + this.k + this.l, null);
            }
        }
    }

    public final void n() {
        o9[] o9VarArr;
        Object[] objArr = this.h;
        objArr.getClass();
        y0q.c(objArr, q(), null);
        this.k--;
        long q = q() + 1;
        if (this.i < q) {
            this.i = q;
        }
        if (this.j < q) {
            if (this.a != 0 && (o9VarArr = (o9[]) this.c) != null) {
                for (o9 o9Var : o9VarArr) {
                    if (o9Var != null) {
                        z0q z0qVar = (z0q) o9Var;
                        long j = z0qVar.a;
                        if (j >= 0 && j < q) {
                            z0qVar.a = q;
                        }
                    }
                }
            }
            this.j = q;
        }
    }

    public final void o(Object obj) {
        int i = this.k + this.l;
        Object[] objArr = this.h;
        if (objArr == null) {
            objArr = r(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = r(i, objArr.length * 2, objArr);
        }
        y0q.c(objArr, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation[] p(Continuation[] continuationArr) {
        o9[] o9VarArr;
        z0q z0qVar;
        zt3 zt3Var;
        int length = continuationArr.length;
        if (this.a != 0 && (o9VarArr = (o9[]) this.c) != null) {
            int length2 = o9VarArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                o9 o9Var = o9VarArr[i];
                if (o9Var != null && (zt3Var = (z0qVar = (z0q) o9Var).b) != null && t(z0qVar) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = zt3Var;
                    z0qVar.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long q() {
        return Math.min(this.j, this.i);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            xq0.q("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long q = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + q;
                y0q.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i = this.a;
        int i2 = this.e;
        if (i != 0) {
            int i3 = this.k;
            int i4 = this.f;
            if (i3 >= i4 && this.j <= this.i) {
                int ordinal = this.g.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        b6e.s();
                        return false;
                    }
                }
            }
            o(obj);
            int i5 = this.k + 1;
            this.k = i5;
            if (i5 > i4) {
                n();
            }
            long q = q() + this.k;
            long j = this.i;
            if (((int) (q - j)) > i2) {
                v(1 + j, this.j, q() + this.k, q() + this.k + this.l);
            }
        } else if (i2 != 0) {
            o(obj);
            int i6 = this.k + 1;
            this.k = i6;
            if (i6 > i2) {
                n();
            }
            this.j = q() + this.k;
            return true;
        }
        return true;
    }

    public final long t(z0q z0qVar) {
        long j = z0qVar.a;
        if (j < q() + this.k) {
            return j;
        }
        if (this.f <= 0 && j <= q() && this.l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object u(z0q z0qVar) {
        Object obj;
        Continuation[] continuationArr = xv.a;
        synchronized (this) {
            try {
                long t = t(z0qVar);
                if (t < 0) {
                    obj = y0q.a;
                } else {
                    long j = z0qVar.a;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                    if (obj2 instanceof v0q) {
                        obj2 = ((v0q) obj2).c;
                    }
                    z0qVar.a = t + 1;
                    Object obj3 = obj2;
                    continuationArr = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                r7o r7oVar = z7o.b;
                continuation.resumeWith(Unit.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long q = q(); q < min; q++) {
            Object[] objArr = this.h;
            objArr.getClass();
            y0q.c(objArr, q, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - min);
        this.l = (int) (j4 - j3);
    }

    public final Continuation[] w(long j) {
        long j2;
        long j3;
        long j4;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        o9[] o9VarArr;
        Continuation[] continuationArr3 = xv.a;
        if (j <= this.j) {
            long q = q();
            long j5 = this.k + q;
            int i = this.f;
            if (i == 0 && this.l > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.a != 0 && (o9VarArr = (o9[]) this.c) != null) {
                for (o9 o9Var : o9VarArr) {
                    if (o9Var != null) {
                        long j6 = ((z0q) o9Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.j) {
                long q2 = q() + this.k;
                int i3 = this.a;
                int i4 = this.l;
                if (i3 > 0) {
                    i4 = Math.min(i4, i - ((int) (q2 - j5)));
                }
                long j7 = this.l + q2;
                js3 js3Var = y0q.a;
                if (i4 > 0) {
                    j4 = 1;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    j2 = q;
                    Continuation[] continuationArr4 = new Continuation[i4];
                    long j8 = q2;
                    while (true) {
                        if (q2 >= j7) {
                            continuationArr2 = continuationArr4;
                            j3 = j5;
                            break;
                        }
                        continuationArr2 = continuationArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) q2)];
                        if (obj != js3Var) {
                            obj.getClass();
                            v0q v0qVar = (v0q) obj;
                            int i5 = i2 + 1;
                            j3 = j5;
                            continuationArr2[i2] = v0qVar.d;
                            y0q.c(objArr, q2, js3Var);
                            y0q.c(objArr, j8, v0qVar.c);
                            j8++;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j3 = j5;
                        }
                        q2++;
                        continuationArr4 = continuationArr2;
                        j5 = j3;
                    }
                    q2 = j8;
                    continuationArr = continuationArr2;
                } else {
                    j2 = q;
                    j3 = j5;
                    j4 = 1;
                    continuationArr = continuationArr3;
                }
                int i6 = (int) (q2 - j2);
                long j9 = this.a == 0 ? q2 : j3;
                long max = Math.max(this.i, q2 - Math.min(this.e, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.h;
                    objArr2.getClass();
                    if (Intrinsics.d(objArr2[((int) max) & (objArr2.length - 1)], js3Var)) {
                        q2 += j4;
                        max += j4;
                    }
                }
                v(max, j9, q2, j7);
                l();
                return continuationArr.length == 0 ? continuationArr : p(continuationArr);
            }
        }
        return continuationArr3;
    }
}
