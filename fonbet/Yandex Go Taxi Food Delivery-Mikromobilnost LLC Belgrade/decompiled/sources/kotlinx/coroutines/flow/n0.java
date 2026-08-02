package kotlinx.coroutines.flow;

import defpackage.dvw;
import defpackage.ffx;
import defpackage.fse;
import defpackage.gqs;
import defpackage.inr0;
import defpackage.j18;
import defpackage.jb20;
import defpackage.jl40;
import defpackage.jnr0;
import defpackage.knr0;
import defpackage.l8x;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.oa;
import defpackage.pa;
import defpackage.qv7;
import defpackage.r18;
import defpackage.sb2;
import defpackage.seu;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public class n0 extends oa implements lz40, r18, gqs {
    public Object[] A;
    public long B;
    public long C;
    public int D;
    public int E;
    public final int x;
    public final int y;
    public final BufferOverflow z;

    public n0(int i, int i2, BufferOverflow bufferOverflow) {
        this.x = i;
        this.y = i2;
        this.z = bufferOverflow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(3:(7:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(2:16|(3:28|29|(2:31|32)(2:33|27))(4:18|(1:20)|21|(1:23)(2:26|27)))|24)(4:44|45|46|47)|37|38)(5:53|54|55|(1:57)|60)|48|49|15|(3:16|(0)(0)|27)|24))|63|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r6 = r9;
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008f, code lost:
    
        if (((kotlinx.coroutines.flow.s0) r10).a(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CoroutineSingletons m(n0 n0Var, vpr vprVar, Continuation continuation) {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        int i;
        n0 n0Var2;
        Throwable th;
        knr0 knr0Var;
        vpr vprVar2;
        l8x l8xVar;
        Object u;
        l8x l8xVar2;
        vpr vprVar3;
        if (continuation instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) continuation;
            int i2 = sharedFlowImpl$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedFlowImpl$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedFlowImpl$collect$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            l8xVar2 = (l8x) sharedFlowImpl$collect$1.L$3;
                            knr0Var = (knr0) sharedFlowImpl$collect$1.L$2;
                            vprVar3 = (vpr) sharedFlowImpl$collect$1.L$1;
                            n0Var2 = (n0) sharedFlowImpl$collect$1.L$0;
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            l8xVar2 = (l8x) sharedFlowImpl$collect$1.L$3;
                            knr0Var = (knr0) sharedFlowImpl$collect$1.L$2;
                            vprVar3 = (vpr) sharedFlowImpl$collect$1.L$1;
                            n0Var2 = (n0) sharedFlowImpl$collect$1.L$0;
                        }
                        try {
                            kotlin.b.b(obj);
                            vprVar2 = vprVar3;
                            l8xVar = l8xVar2;
                            n0Var = n0Var2;
                            while (true) {
                                u = n0Var.u(knr0Var);
                                if (u == ffx.i) {
                                    sharedFlowImpl$collect$1.L$0 = n0Var;
                                    sharedFlowImpl$collect$1.L$1 = vprVar2;
                                    sharedFlowImpl$collect$1.L$2 = knr0Var;
                                    sharedFlowImpl$collect$1.L$3 = l8xVar;
                                    sharedFlowImpl$collect$1.L$4 = null;
                                    sharedFlowImpl$collect$1.label = 2;
                                    if (n0Var.k(knr0Var, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                        break;
                                    }
                                } else {
                                    if (l8xVar != null) {
                                        kotlinx.coroutines.a.l(l8xVar);
                                    }
                                    sharedFlowImpl$collect$1.L$0 = n0Var;
                                    sharedFlowImpl$collect$1.L$1 = vprVar2;
                                    sharedFlowImpl$collect$1.L$2 = knr0Var;
                                    sharedFlowImpl$collect$1.L$3 = l8xVar;
                                    sharedFlowImpl$collect$1.L$4 = null;
                                    sharedFlowImpl$collect$1.label = 3;
                                    if (vprVar2.emit(u, sharedFlowImpl$collect$1) == coroutineSingletons) {
                                        break;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        knr0Var = (knr0) sharedFlowImpl$collect$1.L$2;
                        vpr vprVar4 = (vpr) sharedFlowImpl$collect$1.L$1;
                        n0 n0Var3 = (n0) sharedFlowImpl$collect$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            vprVar2 = vprVar4;
                            n0Var = n0Var3;
                        } catch (Throwable th3) {
                            th = th3;
                            n0Var2 = n0Var3;
                        }
                    }
                    n0Var2.i(knr0Var);
                    throw th;
                }
                kotlin.b.b(obj);
                knr0 knr0Var2 = (knr0) n0Var.d();
                try {
                    if (vprVar instanceof s0) {
                        sharedFlowImpl$collect$1.L$0 = n0Var;
                        sharedFlowImpl$collect$1.L$1 = vprVar;
                        sharedFlowImpl$collect$1.L$2 = knr0Var2;
                        sharedFlowImpl$collect$1.label = 1;
                    }
                    vprVar2 = vprVar;
                    knr0Var = knr0Var2;
                } catch (Throwable th4) {
                    n0Var2 = n0Var;
                    th = th4;
                    knr0Var = knr0Var2;
                }
                l8xVar = (l8x) sharedFlowImpl$collect$1.get_context().get(seu.C);
                while (true) {
                    u = n0Var.u(knr0Var);
                    if (u == ffx.i) {
                    }
                }
                return coroutineSingletons;
            }
        }
        sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(n0Var, continuation);
        Object obj2 = sharedFlowImpl$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedFlowImpl$collect$1.label;
        if (i == 0) {
        }
        l8xVar = (l8x) sharedFlowImpl$collect$1.get_context().get(seu.C);
        while (true) {
            u = n0Var.u(knr0Var);
            if (u == ffx.i) {
            }
        }
        return coroutineSingletons2;
    }

    @Override // defpackage.gqs
    public final tpr a(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return ffx.G(this, fseVar, i, bufferOverflow);
    }

    @Override // defpackage.hnr0
    public final List b() {
        synchronized (this) {
            int q = (int) ((q() + this.D) - this.B);
            if (q == 0) {
                return EmptyList.a;
            }
            ArrayList arrayList = new ArrayList(q);
            Object[] objArr = this.A;
            for (int i = 0; i < q; i++) {
                arrayList.add(objArr[((int) (this.B + i)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        return m(this, vprVar, continuation);
    }

    @Override // defpackage.oa
    public final pa e() {
        return new knr0();
    }

    @Override // defpackage.lz40, defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        n0 n0Var;
        Throwable th;
        Continuation[] p;
        inr0 inr0Var;
        if (g(obj)) {
            return zy11.a;
        }
        int i = 1;
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        Continuation[] continuationArr = sb2.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        j18Var.resumeWith(zy11.a);
                        p = p(continuationArr);
                        inr0Var = null;
                        n0Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        n0Var = this;
                        throw th;
                    }
                } else {
                    try {
                        n0Var = this;
                        try {
                            inr0 inr0Var2 = new inr0(n0Var, q() + this.D + this.E, obj, j18Var);
                            n0Var.o(inr0Var2);
                            n0Var.E++;
                            if (n0Var.y == 0) {
                                continuationArr = n0Var.p(continuationArr);
                            }
                            p = continuationArr;
                            inr0Var = inr0Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        n0Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (inr0Var != null) {
                    j18Var.x(new qv7(i, inr0Var));
                }
                for (Continuation continuation2 : p) {
                    if (continuation2 != null) {
                        continuation2.resumeWith(zy11.a);
                    }
                }
                Object s = j18Var.s();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (s != coroutineSingletons) {
                    s = zy11.a;
                }
                return s == coroutineSingletons ? s : zy11.a;
            } catch (Throwable th5) {
                th = th5;
                n0Var = this;
            }
        }
    }

    @Override // defpackage.lz40
    public final void f() {
        n0 n0Var;
        synchronized (this) {
            try {
                n0Var = this;
                try {
                    n0Var.v(q() + this.D, this.C, q() + this.D, q() + this.D + this.E);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                n0Var = this;
            }
        }
    }

    @Override // defpackage.lz40
    public final boolean g(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = sb2.a;
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
                continuation.resumeWith(zy11.a);
            }
        }
        return z;
    }

    @Override // defpackage.oa
    public final pa[] h() {
        return new knr0[2];
    }

    public final Object k(knr0 knr0Var, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        synchronized (this) {
            try {
                if (t(knr0Var) < 0) {
                    knr0Var.b = j18Var;
                } else {
                    j18Var.resumeWith(zy11.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    public final void l() {
        if (this.y != 0 || this.E > 1) {
            Object[] objArr = this.A;
            while (this.E > 0) {
                long q = q();
                int i = this.D;
                int i2 = this.E;
                if (objArr[((int) ((q + (i + i2)) - 1)) & (objArr.length - 1)] != ffx.i) {
                    return;
                }
                this.E = i2 - 1;
                ffx.e(objArr, q() + this.D + this.E, null);
            }
        }
    }

    public final void n() {
        pa[] paVarArr;
        ffx.e(this.A, q(), null);
        this.D--;
        long q = q() + 1;
        if (this.B < q) {
            this.B = q;
        }
        if (this.C < q) {
            if (this.b != 0 && (paVarArr = this.a) != null) {
                for (pa paVar : paVarArr) {
                    if (paVar != null) {
                        knr0 knr0Var = (knr0) paVar;
                        long j = knr0Var.a;
                        if (0 <= j && j < q) {
                            knr0Var.a = q;
                        }
                    }
                }
            }
            this.C = q;
        }
    }

    public final void o(Object obj) {
        int i = this.D + this.E;
        Object[] objArr = this.A;
        if (objArr == null) {
            objArr = r(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = r(i, objArr.length * 2, objArr);
        }
        ffx.e(objArr, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation[] p(Continuation[] continuationArr) {
        pa[] paVarArr;
        knr0 knr0Var;
        j18 j18Var;
        int length = continuationArr.length;
        if (this.b != 0 && (paVarArr = this.a) != null) {
            int length2 = paVarArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                pa paVar = paVarArr[i];
                if (paVar != null && (j18Var = (knr0Var = (knr0) paVar).b) != null && t(knr0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = j18Var;
                    knr0Var.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long q() {
        return Math.min(this.C, this.B);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            ny61.r("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.A = objArr2;
        if (objArr != null) {
            long q = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + q;
                ffx.e(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i = this.b;
        int i2 = this.x;
        if (i != 0) {
            int i3 = this.D;
            int i4 = this.y;
            if (i3 >= i4 && this.C <= this.B) {
                int i5 = jnr0.a[this.z.ordinal()];
                if (i5 == 1) {
                    return false;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        w511.b();
                        return false;
                    }
                }
            }
            o(obj);
            int i6 = this.D + 1;
            this.D = i6;
            if (i6 > i4) {
                n();
            }
            long q = q() + this.D;
            long j = this.B;
            if (((int) (q - j)) > i2) {
                v(1 + j, this.C, q() + this.D, q() + this.D + this.E);
            }
        } else if (i2 != 0) {
            o(obj);
            int i7 = this.D + 1;
            this.D = i7;
            if (i7 > i2) {
                n();
            }
            this.C = q() + this.D;
            return true;
        }
        return true;
    }

    public final long t(knr0 knr0Var) {
        long j = knr0Var.a;
        if (j >= q() + this.D && (this.y > 0 || j > q() || this.E == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(knr0 knr0Var) {
        Object obj;
        Continuation[] continuationArr = sb2.a;
        synchronized (this) {
            try {
                long t = t(knr0Var);
                if (t < 0) {
                    obj = ffx.i;
                } else {
                    long j = knr0Var.a;
                    Object obj2 = this.A[((int) t) & (r0.length - 1)];
                    if (obj2 instanceof inr0) {
                        obj2 = ((inr0) obj2).c;
                    }
                    knr0Var.a = t + 1;
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
                continuation.resumeWith(zy11.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long q = q(); q < min; q++) {
            ffx.e(this.A, q, null);
        }
        this.B = j;
        this.C = j2;
        this.D = (int) (j3 - min);
        this.E = (int) (j4 - j3);
    }

    public final Continuation[] w(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        pa[] paVarArr;
        jb20 jb20Var = ffx.i;
        Continuation[] continuationArr3 = sb2.a;
        if (j <= this.C) {
            long q = q();
            long j5 = this.D + q;
            int i2 = this.y;
            if (i2 == 0 && this.E > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.b != 0 && (paVarArr = this.a) != null) {
                for (pa paVar : paVarArr) {
                    if (paVar != null) {
                        long j6 = ((knr0) paVar).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.C) {
                long q2 = q() + this.D;
                int i4 = this.b;
                int i5 = this.E;
                if (i4 > 0) {
                    j2 = 1;
                    i5 = Math.min(i5, i2 - ((int) (q2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.E + q2;
                if (i5 > 0) {
                    Continuation[] continuationArr4 = new Continuation[i5];
                    Object[] objArr = this.A;
                    j3 = j5;
                    long j8 = q2;
                    while (true) {
                        if (q2 >= j7) {
                            continuationArr2 = continuationArr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        continuationArr2 = continuationArr4;
                        Object obj = objArr[((int) q2) & (objArr.length - 1)];
                        if (obj != jb20Var) {
                            inr0 inr0Var = (inr0) obj;
                            i = i2;
                            int i6 = i3 + 1;
                            j4 = j7;
                            continuationArr2[i3] = inr0Var.w;
                            ffx.e(objArr, q2, jb20Var);
                            ffx.e(objArr, j8, inr0Var.c);
                            j8 += j2;
                            if (i6 >= i5) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        q2 += j2;
                        continuationArr4 = continuationArr2;
                        i2 = i;
                        j7 = j4;
                    }
                    q2 = j8;
                    continuationArr = continuationArr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    continuationArr = continuationArr3;
                }
                long max = Math.max(this.B, Math.max(q, q2 - this.x));
                if (i == 0 && max < j4) {
                    if (jl40.l(this.A[((int) max) & (r4.length - 1)], jb20Var)) {
                        q2 += j2;
                        max += j2;
                    }
                }
                long j9 = q2;
                v(max, this.b == 0 ? j9 : j3, j9, j4);
                l();
                return continuationArr.length == 0 ? continuationArr : p(continuationArr);
            }
        }
        return continuationArr3;
    }
}
