package kotlinx.coroutines.selects;

import defpackage.b64;
import defpackage.dvw;
import defpackage.ecq0;
import defpackage.fcq0;
import defpackage.fse;
import defpackage.i18;
import defpackage.j18;
import defpackage.jb20;
import defpackage.jl40;
import defpackage.k041;
import defpackage.ny61;
import defpackage.ofa0;
import defpackage.qv10;
import defpackage.rv7;
import defpackage.rzo;
import defpackage.s7q0;
import defpackage.tls;
import defpackage.w511;
import defpackage.wb4;
import defpackage.wls;
import defpackage.xfo;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class b implements rv7, fcq0, k041 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state$volatile");
    public static final /* synthetic */ long z = wb4.a.objectFieldOffset(b.class.getDeclaredField("state$volatile"));
    public final fse a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = rzo.g;
    public ArrayList b = new ArrayList(2);
    public int w = -1;
    public Object x = rzo.j;

    public b(fse fseVar) {
        this.a = fseVar;
    }

    @Override // defpackage.rv7
    public final void a(Throwable th) {
        b bVar;
        while (true) {
            y.getClass();
            Unsafe unsafe = wb4.a;
            long j = z;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == rzo.h) {
                return;
            }
            jb20 jb20Var = rzo.i;
            while (true) {
                Unsafe unsafe2 = wb4.a;
                bVar = this;
                if (unsafe2.compareAndSwapObject(bVar, z, objectVolatile, jb20Var)) {
                    ArrayList arrayList = bVar.b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ecq0) it.next()).a();
                    }
                    bVar.x = rzo.j;
                    bVar.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(bVar, j) != objectVolatile) {
                    break;
                } else {
                    this = bVar;
                }
            }
            this = bVar;
        }
    }

    public final void b(ecq0 ecq0Var) {
        ArrayList<ecq0> arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        for (ecq0 ecq0Var2 : arrayList) {
            if (ecq0Var2 != ecq0Var) {
                ecq0Var2.a();
            }
        }
        jb20 jb20Var = rzo.h;
        y.getClass();
        wb4.a.putObjectVolatile(this, z, jb20Var);
        this.x = rzo.j;
        this.b = null;
    }

    @Override // defpackage.k041
    public final void c(s7q0 s7q0Var, int i) {
        this.c = s7q0Var;
        this.w = i;
    }

    public final Object d(Continuation continuation) {
        y.getClass();
        ecq0 ecq0Var = (ecq0) wb4.a.getObjectVolatile(this, z);
        Object obj = this.x;
        b(ecq0Var);
        zls zlsVar = ecq0Var.c;
        Object obj2 = ecq0Var.a;
        Object obj3 = ecq0Var.d;
        Object invoke = zlsVar.invoke(obj2, obj3, obj);
        Continuation continuation2 = ecq0Var.e;
        return obj3 == rzo.k ? ((tls) continuation2).invoke(continuation) : ((wls) continuation2).invoke(invoke, continuation);
    }

    public final Object e(Continuation continuation) {
        return i() ? d(continuation) : f(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (m(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Continuation continuation) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        int i;
        if (continuation instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuation;
            int i2 = selectImplementation$doSelectSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectImplementation$doSelectSuspend$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectImplementation$doSelectSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    selectImplementation$doSelectSuspend$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                selectImplementation$doSelectSuspend$1.label = 2;
                Object d = d(selectImplementation$doSelectSuspend$1);
                return d != obj2 ? obj2 : d;
            }
        }
        selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuation);
        Object obj3 = selectImplementation$doSelectSuspend$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectImplementation$doSelectSuspend$1.label;
        if (i != 0) {
        }
        selectImplementation$doSelectSuspend$1.label = 2;
        Object d2 = d(selectImplementation$doSelectSuspend$1);
        if (d2 != obj22) {
        }
    }

    public final ecq0 g(Object obj) {
        Object obj2;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((ecq0) obj2).a == obj) {
                break;
            }
        }
        ecq0 ecq0Var = (ecq0) obj2;
        if (ecq0Var != null) {
            return ecq0Var;
        }
        w511.j("Clause with object ", obj, " is not found");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(ofa0 ofa0Var, wls wlsVar) {
        j(new ecq0(this, ofa0Var.a, (zls) ofa0Var.b, (zls) ofa0Var.c, null, (SuspendLambda) wlsVar, (zls) ofa0Var.w), false);
    }

    public final boolean i() {
        y.getClass();
        return wb4.a.getObjectVolatile(this, z) instanceof ecq0;
    }

    public final void j(ecq0 ecq0Var, boolean z2) {
        Object obj = ecq0Var.a;
        y.getClass();
        Unsafe unsafe = wb4.a;
        long j = z;
        if (unsafe.getObjectVolatile(this, j) instanceof ecq0) {
            return;
        }
        if (!z2) {
            ArrayList arrayList = this.b;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ecq0) it.next()).a == obj) {
                        xfo.g(qv10.o("Cannot use select clauses on the same object: ", obj));
                        return;
                    }
                }
            }
        }
        ecq0Var.b.invoke(obj, this, ecq0Var.d);
        if (this.x != rzo.j) {
            wb4.a.putObjectVolatile(this, j, ecq0Var);
            return;
        }
        if (!z2) {
            this.b.add(ecq0Var);
        }
        ecq0Var.g = this.c;
        ecq0Var.h = this.w;
        this.c = null;
        this.w = -1;
    }

    public final boolean k(Object obj, Object obj2) {
        return l(obj, obj2) == 0;
    }

    public final int l(Object obj, Object obj2) {
        b bVar;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            y.getClass();
            Unsafe unsafe3 = wb4.a;
            long j = z;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof i18) {
                ecq0 g = this.g(obj);
                if (g != null) {
                    zls zlsVar = g.f;
                    zls zlsVar2 = zlsVar != null ? (zls) zlsVar.invoke(this, g.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = wb4.a;
                        bVar = this;
                        if (unsafe4.compareAndSwapObject(bVar, z, objectVolatile, g)) {
                            i18 i18Var = (i18) objectVolatile;
                            bVar.x = obj2;
                            jb20 m = i18Var.m(zy11.a, zlsVar2);
                            if (m == null) {
                                bVar.x = rzo.j;
                                return 2;
                            }
                            i18Var.j(m);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(bVar, j) != objectVolatile) {
                            break;
                        }
                        this = bVar;
                    }
                } else {
                    continue;
                }
            } else {
                bVar = this;
                if (jl40.l(objectVolatile, rzo.h) || (objectVolatile instanceof ecq0)) {
                    return 3;
                }
                if (jl40.l(objectVolatile, rzo.i)) {
                    return 2;
                }
                if (jl40.l(objectVolatile, rzo.g)) {
                    List singletonList = Collections.singletonList(obj);
                    do {
                        unsafe2 = wb4.a;
                        if (unsafe2.compareAndSwapObject(bVar, z, objectVolatile, singletonList)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(bVar, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        ny61.r(b64.i("Unexpected state: ", objectVolatile));
                        return 0;
                    }
                    ArrayList o0 = kotlin.collections.a.o0((Collection) objectVolatile, obj);
                    do {
                        unsafe = wb4.a;
                        if (unsafe.compareAndSwapObject(bVar, z, objectVolatile, o0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(bVar, j) == objectVolatile);
                }
            }
            this = bVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        r0 = r10.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Continuation continuation) {
        j18 j18Var;
        j18 j18Var2 = new j18(1, dvw.b(continuation));
        j18Var2.u();
        loop0: while (true) {
            y.getClass();
            Unsafe unsafe = wb4.a;
            long j = z;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            j18 j18Var3 = j18Var2;
            jb20 jb20Var = rzo.g;
            zy11 zy11Var = zy11.a;
            if (objectVolatile == jb20Var) {
                j18 j18Var4 = j18Var3;
                while (true) {
                    Unsafe unsafe2 = wb4.a;
                    j18Var = j18Var4;
                    if (unsafe2.compareAndSwapObject(this, z, objectVolatile, j18Var4)) {
                        j18Var.x(this);
                        break loop0;
                    }
                    if (unsafe2.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    }
                    j18Var4 = j18Var;
                }
            } else {
                j18Var = j18Var3;
                if (objectVolatile instanceof List) {
                    while (true) {
                        Unsafe unsafe3 = wb4.a;
                        if (unsafe3.compareAndSwapObject(this, z, objectVolatile, jb20Var)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                ecq0 g = g(it.next());
                                g.g = null;
                                g.h = -1;
                                j(g, true);
                            }
                        } else if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                    }
                    j18Var2 = j18Var;
                } else {
                    if (!(objectVolatile instanceof ecq0)) {
                        ny61.r(b64.i("unexpected state: ", objectVolatile));
                        return null;
                    }
                    ecq0 ecq0Var = (ecq0) objectVolatile;
                    Object obj = this.x;
                    zls zlsVar = ecq0Var.f;
                    j18Var.q(zy11Var, zlsVar != null ? (zls) zlsVar.invoke(this, ecq0Var.d, obj) : null);
                }
            }
        }
    }
}
