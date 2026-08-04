package com.gamericefishpro.space.f1;

import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.t0.m1;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final Function1 a;
    public boolean c;
    public com.gamericefishpro.space.a8.b h;
    public x i;
    public final AtomicReference b = new AtomicReference(null);
    public final n1 d = new n1(2, this);
    public final com.gamericefishpro.space.a7.c e = new com.gamericefishpro.space.a7.c(5, this);
    public final com.gamericefishpro.space.v0.e f = new com.gamericefishpro.space.v0.e(new x[16]);
    public final Object g = new Object();
    public long j = -1;

    public y(Function1 function1) {
        this.a = function1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[Catch: all -> 0x0090, LOOP:1: B:12:0x002e->B:23:0x0073, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:24:0x007a, B:26:0x0082, B:31:0x0092, B:28:0x0087, B:9:0x0022, B:12:0x002e, B:14:0x0043, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:23:0x0073, B:32:0x0098), top: B:37:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:24:0x007a BREAK  A[LOOP:1: B:12:0x002e->B:23:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final void a(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                com.gamericefishpro.space.v0.e eVar = this.f;
                int i2 = eVar.i;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    x xVar = (x) eVar.d[i3];
                    com.gamericefishpro.space.t.c0 c0Var = (com.gamericefishpro.space.t.c0) xVar.f.k(obj);
                    if (c0Var == null) {
                        i = i3;
                    } else {
                        Object[] objArr = c0Var.b;
                        int[] iArr = c0Var.c;
                        long[] jArr = c0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                i = i3;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j & 255) < 128) {
                                            int i8 = (i5 << 3) + i7;
                                            Object obj2 = objArr[i8];
                                            int i9 = iArr[i8];
                                            xVar.c(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i6 != 8) {
                                        break;
                                    }
                                    if (i5 != length) {
                                        break;
                                    }
                                    i5++;
                                    i3 = i;
                                } else if (i5 != length) {
                                    break;
                                    break;
                                } else {
                                    i5++;
                                    i3 = i;
                                }
                            }
                        } else {
                            i = i3;
                        }
                    }
                    if (!xVar.f.j()) {
                        i4++;
                    } else if (i4 > 0) {
                        Object[] objArr2 = eVar.d;
                        objArr2[i - i4] = objArr2[i];
                    }
                    i3 = i + 1;
                }
                Object[] objArr3 = eVar.d;
                int i10 = i2 - i4;
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                Arrays.fill(objArr3, i10, i2, (Object) null);
                eVar.i = i10;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        com.gamericefishpro.space.t0.s.b("Unexpected notification");
                        throw new com.gamericefishpro.space.oh.e();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                try {
                    com.gamericefishpro.space.v0.e eVar = this.f;
                    Object[] objArr = eVar.d;
                    int i = eVar.i;
                    for (int i2 = 0; i2 < i; i2++) {
                        z2 = ((x) objArr[i2]).a(set) || z2;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01d1  */
    public final void c(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        x xVar;
        boolean z;
        com.gamericefishpro.space.t.c0 c0Var;
        g h0Var;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        synchronized (this.g) {
            com.gamericefishpro.space.v0.e eVar = this.f;
            Object[] objArr = eVar.d;
            int i2 = eVar.i;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((x) obj2).a == function1) {
                    break;
                } else {
                    i3++;
                }
            }
            xVar = (x) obj2;
            z = true;
            if (xVar == null) {
                Intrinsics.c(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                com.gamericefishpro.space.ei.e0.c(1, function1);
                xVar = new x(function1);
                eVar.b(xVar);
            }
        }
        x xVar2 = this.i;
        long j2 = this.j;
        if (j2 != -1 && j2 != com.gamericefishpro.space.b1.n.b()) {
            m1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + com.gamericefishpro.space.b1.n.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = xVar;
            this.j = com.gamericefishpro.space.b1.n.b();
            com.gamericefishpro.space.a7.c cVar = this.e;
            Object obj5 = xVar.b;
            com.gamericefishpro.space.t.c0 c0Var2 = xVar.c;
            int i4 = xVar.d;
            xVar.b = obj;
            xVar.c = (com.gamericefishpro.space.t.c0) xVar.f.g(obj);
            if (xVar.d == -1) {
                xVar.d = Long.hashCode(p.j().g());
            }
            w wVar = xVar.i;
            com.gamericefishpro.space.v0.e eVarO = com.gamericefishpro.space.t0.i.o();
            try {
                eVarO.b(wVar);
                if (cVar == null) {
                    function0.invoke();
                    c0Var = c0Var2;
                } else {
                    g gVar = (g) p.b.get();
                    if (gVar instanceof h0) {
                        c0Var = c0Var2;
                        if (((h0) gVar).t == com.gamericefishpro.space.b1.n.b()) {
                            Function1 function2 = ((h0) gVar).r;
                            Function1 function3 = ((h0) gVar).s;
                            try {
                                ((h0) gVar).r = p.k(cVar, function2, true);
                                ((h0) gVar).s = function3;
                                function0.invoke();
                                ((h0) gVar).r = function2;
                                ((h0) gVar).s = function3;
                            } catch (Throwable th) {
                                ((h0) gVar).r = function2;
                                ((h0) gVar).s = function3;
                                throw th;
                            }
                        }
                    } else {
                        c0Var = c0Var2;
                    }
                    if (gVar == null || (gVar instanceof c)) {
                        h0Var = new h0(gVar instanceof c ? (c) gVar : null, cVar, null, true, false);
                    } else {
                        h0Var = gVar.u(cVar);
                    }
                    try {
                        g gVarJ = h0Var.j();
                        try {
                            function0.invoke();
                            g.q(gVarJ);
                            h0Var.c();
                        } catch (Throwable th2) {
                            try {
                                g.q(gVarJ);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    h0Var.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    eVarO.l(eVarO.i - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                eVarO.l(eVarO.i - 1);
                Object obj6 = xVar.b;
                Intrinsics.b(obj6);
                int i5 = xVar.d;
                com.gamericefishpro.space.t.c0 c0Var3 = xVar.c;
                if (c0Var3 != null) {
                    long[] jArr3 = c0Var3.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j3 = jArr3[i6];
                            boolean z2 = z;
                            obj4 = obj5;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j3 & 255) < 128) {
                                        i = i8;
                                        int i9 = (i6 << 3) + i;
                                        jArr2 = jArr3;
                                        Object obj7 = c0Var3.b[i9];
                                        j = j3;
                                        boolean z3 = c0Var3.c[i9] != i5 ? z2 : false;
                                        if (z3) {
                                            xVar.c(obj6, obj7);
                                        }
                                        if (z3) {
                                            c0Var3.f(i9);
                                        }
                                    } else {
                                        i = i8;
                                        jArr2 = jArr3;
                                        j = j3;
                                    }
                                    j3 = j >> 8;
                                    i8 = i + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i7 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            z = z2;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj5;
                    }
                } else {
                    obj3 = obj5;
                }
                xVar.b = obj3;
                xVar.c = c0Var;
                xVar.d = i4;
                this.i = xVar2;
                this.j = j2;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            this.i = xVar2;
            this.j = j2;
            throw th7;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        n1 n1Var = this.d;
        p.e(p.a);
        synchronized (p.c) {
            p.h = CollectionsKt.E(p.h, n1Var);
            Unit unit = Unit.a;
        }
        this.h = new com.gamericefishpro.space.a8.b(4, n1Var);
    }
}
