package kotlinx.coroutines;

import defpackage.a9x;
import defpackage.b64;
import defpackage.b9x;
import defpackage.be90;
import defpackage.c9x;
import defpackage.cvw;
import defpackage.de60;
import defpackage.dse;
import defpackage.dvw;
import defpackage.ese;
import defpackage.ffx;
import defpackage.fse;
import defpackage.fyc;
import defpackage.h73;
import defpackage.hpb;
import defpackage.ipb;
import defpackage.iqv;
import defpackage.j18;
import defpackage.jb20;
import defpackage.jyw;
import defpackage.ke60;
import defpackage.kyw;
import defpackage.l0k0;
import defpackage.l8x;
import defpackage.ljo;
import defpackage.m1k;
import defpackage.mqv;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.ofa0;
import defpackage.p0k0;
import defpackage.pov;
import defpackage.q56;
import defpackage.qrq0;
import defpackage.qv7;
import defpackage.seu;
import defpackage.t8x;
import defpackage.tig0;
import defpackage.tls;
import defpackage.tzc;
import defpackage.uqy;
import defpackage.wb4;
import defpackage.wls;
import defpackage.wun;
import defpackage.wwg;
import defpackage.yhl;
import defpackage.ym11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public class c implements l8x, be90 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = wb4.a;
        w = unsafe.objectFieldOffset(c.class.getDeclaredField("_state$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_parentHandle$volatile");
        c = unsafe.objectFieldOffset(c.class.getDeclaredField("_parentHandle$volatile"));
    }

    public c(boolean z) {
        this._state$volatile = z ? ffx.h : ffx.g;
    }

    public static ipb W(kotlinx.coroutines.internal.a aVar) {
        while (aVar.l()) {
            aVar = aVar.k();
        }
        while (true) {
            aVar = aVar.j();
            if (!aVar.l()) {
                if (aVar instanceof ipb) {
                    return (ipb) aVar;
                }
                if (aVar instanceof de60) {
                    return null;
                }
            }
        }
    }

    public static String f0(Object obj) {
        if (!(obj instanceof c9x)) {
            return obj instanceof iqv ? ((iqv) obj).isActive() ? CA20Status.STATUS_USER_DESCRIPTION_A : "New" : obj instanceof tzc ? "Cancelled" : "Completed";
        }
        c9x c9xVar = (c9x) obj;
        return c9xVar.e() ? "Cancelling" : c9x.b.get(c9xVar) == 1 ? "Completing" : CA20Status.STATUS_USER_DESCRIPTION_A;
    }

    public final void A(iqv iqvVar, Object obj) {
        hpb M = M();
        if (M != null) {
            M.dispose();
            d0(ke60.a);
        }
        CompletionHandlerException completionHandlerException = null;
        tzc tzcVar = obj instanceof tzc ? (tzc) obj : null;
        Throwable th = tzcVar != null ? tzcVar.a : null;
        if (iqvVar instanceof t8x) {
            try {
                ((t8x) iqvVar).o(th);
                return;
            } catch (Throwable th2) {
                P(new CompletionHandlerException("Exception in completion handler " + iqvVar + " for " + this, th2));
                return;
            }
        }
        de60 b2 = iqvVar.b();
        if (b2 != null) {
            b2.c(new uqy(1), 1);
            for (kotlinx.coroutines.internal.a aVar = (kotlinx.coroutines.internal.a) b2.i(); !aVar.equals(b2); aVar = aVar.j()) {
                if (aVar instanceof t8x) {
                    try {
                        ((t8x) aVar).o(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            ljo.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + aVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                P(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public final Throwable B(Object obj) {
        CancellationException cancellationException;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(y(), null, this) : th;
        }
        c cVar = (c) ((be90) obj);
        Object N = cVar.N();
        if (N instanceof c9x) {
            cancellationException = ((c9x) N).d();
        } else if (N instanceof tzc) {
            cancellationException = ((tzc) N).a;
        } else {
            if (N instanceof iqv) {
                ny61.r(b64.i("Cannot be cancelling child in this state: ", N));
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new JobCancellationException("Parent job is ".concat(f0(N)), cancellationException, cVar) : cancellationException2;
    }

    public final Object C(c9x c9xVar, Object obj) {
        c9x c9xVar2;
        Throwable th;
        Throwable F;
        c cVar;
        c9x c9xVar3;
        tzc tzcVar = obj instanceof tzc ? (tzc) obj : null;
        Throwable th2 = tzcVar != null ? tzcVar.a : null;
        synchronized (c9xVar) {
            try {
                c9xVar.e();
                ArrayList<Throwable> f = c9xVar.f(th2);
                F = F(c9xVar, f);
                if (F != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            for (Throwable th3 : f) {
                                if (th3 != F && th3 != F && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    ljo.a(F, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c9xVar2 = c9xVar;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                c9xVar2 = c9xVar;
                th = th5;
            }
        }
        if (F != null && F != th2) {
            obj = new tzc(F, false);
        }
        if (F != null && (x(F) || O(F))) {
            tzc.b.compareAndSet((tzc) obj, 0, 1);
        }
        Y(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object mqvVar = obj instanceof iqv ? new mqv((iqv) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = wb4.a;
            long j = w;
            cVar = this;
            c9xVar3 = c9xVar;
            if (!unsafe.compareAndSwapObject(cVar, j, c9xVar3, mqvVar) && unsafe.getObjectVolatile(cVar, j) == c9xVar3) {
                this = cVar;
                c9xVar = c9xVar3;
            }
        }
        cVar.A(c9xVar3, obj);
        return obj;
    }

    @Override // defpackage.l8x
    public final m1k D(tls tlsVar, boolean z, boolean z2) {
        return R(z2, z ? new jyw(tlsVar) : new kyw(tlsVar));
    }

    public final Object E() {
        Object N = N();
        if (N instanceof iqv) {
            ny61.r("This job has not completed yet");
            return null;
        }
        if (N instanceof tzc) {
            throw ((tzc) N).a;
        }
        return ffx.g0(N);
    }

    public final Throwable F(c9x c9xVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c9xVar.e()) {
                return new JobCancellationException(y(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean G() {
        return true;
    }

    public final ofa0 H() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.b;
        ym11.e(3, jobSupport$onAwaitInternal$1);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.b;
        ym11.e(3, jobSupport$onAwaitInternal$2);
        return new ofa0(this, jobSupport$onAwaitInternal$1, jobSupport$onAwaitInternal$2, (Object) null);
    }

    @Override // defpackage.l8x
    public final CancellationException I() {
        CancellationException cancellationException;
        Object N = N();
        if (N instanceof c9x) {
            Throwable d = ((c9x) N).d();
            if (d == null) {
                yhl.d(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = d instanceof CancellationException ? (CancellationException) d : null;
            return cancellationException == null ? new JobCancellationException(concat, d, this) : cancellationException;
        }
        if (N instanceof iqv) {
            yhl.d(this, "Job is still new or active: ");
            return null;
        }
        if (!(N instanceof tzc)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((tzc) N).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(y(), th, this) : cancellationException;
    }

    public boolean J() {
        return this instanceof fyc;
    }

    public final tig0 K() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.b;
        ym11.e(3, jobSupport$onJoin$1);
        return new tig0(this, jobSupport$onJoin$1);
    }

    public final de60 L(iqv iqvVar) {
        de60 b2 = iqvVar.b();
        if (b2 != null) {
            return b2;
        }
        if (iqvVar instanceof wun) {
            return new de60();
        }
        if (iqvVar instanceof t8x) {
            c0((t8x) iqvVar);
            return null;
        }
        yhl.d(iqvVar, "State should have list: ");
        return null;
    }

    public final hpb M() {
        b.getClass();
        return (hpb) wb4.a.getObjectVolatile(this, c);
    }

    public final Object N() {
        a.getClass();
        return wb4.a.getObjectVolatile(this, w);
    }

    public boolean O(Throwable th) {
        return false;
    }

    public void P(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void Q(l8x l8xVar) {
        ke60 ke60Var = ke60.a;
        if (l8xVar == null) {
            d0(ke60Var);
            return;
        }
        l8xVar.start();
        hpb b0 = l8xVar.b0(this);
        d0(b0);
        if (k0()) {
            b0.dispose();
            d0(ke60Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m1k R(boolean z, t8x t8xVar) {
        c cVar;
        t8x t8xVar2;
        ke60 ke60Var;
        boolean c2;
        t8xVar.z = this;
        loop0: while (true) {
            Object N = this.N();
            if (N instanceof wun) {
                wun wunVar = (wun) N;
                if (wunVar.a) {
                    while (true) {
                        a.getClass();
                        Unsafe unsafe = wb4.a;
                        long j = w;
                        cVar = this;
                        t8xVar2 = t8xVar;
                        if (unsafe.compareAndSwapObject(cVar, j, N, t8xVar2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(cVar, j) != N) {
                            break;
                        }
                        this = cVar;
                        t8xVar = t8xVar2;
                    }
                } else {
                    cVar = this;
                    t8xVar2 = t8xVar;
                    cVar.a0(wunVar);
                }
                this = cVar;
                t8xVar = t8xVar2;
            } else {
                cVar = this;
                t8xVar2 = t8xVar;
                boolean z2 = N instanceof iqv;
                ke60Var = ke60.a;
                if (z2) {
                    iqv iqvVar = (iqv) N;
                    de60 b2 = iqvVar.b();
                    if (b2 == null) {
                        cVar.c0((t8x) N);
                    } else {
                        if (t8xVar2.n()) {
                            c9x c9xVar = iqvVar instanceof c9x ? (c9x) iqvVar : null;
                            Throwable d = c9xVar != null ? c9xVar.d() : null;
                            if (d == null) {
                                c2 = b2.c(t8xVar2, 5);
                            } else if (z) {
                                t8xVar2.o(d);
                                return ke60Var;
                            }
                        } else {
                            c2 = b2.c(t8xVar2, 1);
                        }
                        if (c2) {
                            break;
                        }
                    }
                    this = cVar;
                    t8xVar = t8xVar2;
                } else if (z) {
                    Object N2 = cVar.N();
                    tzc tzcVar = N2 instanceof tzc ? (tzc) N2 : null;
                    t8xVar2.o(tzcVar != null ? tzcVar.a : null);
                }
            }
        }
        return ke60Var;
    }

    public boolean S() {
        return this instanceof q56;
    }

    public final boolean T(Object obj) {
        Object h0;
        do {
            h0 = h0(N(), obj);
            if (h0 == ffx.b) {
                return false;
            }
            if (h0 == ffx.c) {
                return true;
            }
        } while (h0 == ffx.d);
        p(h0);
        return true;
    }

    public final Object U(Object obj) {
        Object h0;
        do {
            h0 = h0(N(), obj);
            if (h0 == ffx.b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                tzc tzcVar = obj instanceof tzc ? (tzc) obj : null;
                throw new IllegalStateException(str, tzcVar != null ? tzcVar.a : null);
            }
        } while (h0 == ffx.d);
        return h0;
    }

    public String V() {
        return getClass().getSimpleName();
    }

    public final void X(de60 de60Var, Throwable th) {
        de60Var.c(new uqy(4), 4);
        CompletionHandlerException completionHandlerException = null;
        for (kotlinx.coroutines.internal.a aVar = (kotlinx.coroutines.internal.a) de60Var.i(); !aVar.equals(de60Var); aVar = aVar.j()) {
            if ((aVar instanceof t8x) && ((t8x) aVar).n()) {
                try {
                    ((t8x) aVar).o(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ljo.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + aVar + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            P(completionHandlerException);
        }
        x(th);
    }

    public void Y(Object obj) {
    }

    public void Z() {
    }

    @Override // defpackage.l8x
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(y(), null, this);
        }
        u(cancellationException);
    }

    public final void a0(wun wunVar) {
        de60 de60Var = new de60();
        Object povVar = wunVar.a ? de60Var : new pov(de60Var);
        while (true) {
            a.getClass();
            Unsafe unsafe = wb4.a;
            long j = w;
            c cVar = this;
            wun wunVar2 = wunVar;
            if (unsafe.compareAndSwapObject(cVar, j, wunVar2, povVar) || unsafe.getObjectVolatile(cVar, j) != wunVar2) {
                return;
            }
            this = cVar;
            wunVar = wunVar2;
        }
    }

    @Override // defpackage.l8x
    public final hpb b0(c cVar) {
        ipb ipbVar = new ipb(cVar);
        ipbVar.z = this;
        while (true) {
            Object N = N();
            if (N instanceof wun) {
                wun wunVar = (wun) N;
                if (!wunVar.a) {
                    a0(wunVar);
                } else if (nzs.w(a, this, wunVar, ipbVar)) {
                    break;
                }
            } else {
                boolean z = N instanceof iqv;
                ke60 ke60Var = ke60.a;
                if (!z) {
                    Object N2 = N();
                    tzc tzcVar = N2 instanceof tzc ? (tzc) N2 : null;
                    ipbVar.o(tzcVar != null ? tzcVar.a : null);
                    return ke60Var;
                }
                de60 b2 = ((iqv) N).b();
                if (b2 == null) {
                    c0((t8x) N);
                } else if (!b2.c(ipbVar, 7)) {
                    boolean c2 = b2.c(ipbVar, 3);
                    Object N3 = N();
                    if (N3 instanceof c9x) {
                        r3 = ((c9x) N3).d();
                    } else {
                        tzc tzcVar2 = N3 instanceof tzc ? (tzc) N3 : null;
                        if (tzcVar2 != null) {
                            r3 = tzcVar2.a;
                        }
                    }
                    ipbVar.o(r3);
                    if (c2) {
                        break;
                    }
                    return ke60Var;
                }
            }
        }
        return ipbVar;
    }

    public Object c() {
        return E();
    }

    public final void c0(t8x t8xVar) {
        t8xVar.e(new de60());
        kotlinx.coroutines.internal.a j = t8xVar.j();
        while (true) {
            a.getClass();
            Unsafe unsafe = wb4.a;
            long j2 = w;
            c cVar = this;
            t8x t8xVar2 = t8xVar;
            if (unsafe.compareAndSwapObject(cVar, j2, t8xVar2, j) || unsafe.getObjectVolatile(cVar, j2) != t8xVar2) {
                return;
            }
            this = cVar;
            t8xVar = t8xVar2;
        }
    }

    public final void d0(hpb hpbVar) {
        b.getClass();
        wb4.a.putObjectVolatile(this, c, hpbVar);
    }

    public final int e0(Object obj) {
        boolean z = obj instanceof wun;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((wun) obj).a) {
                return 0;
            }
            if (!nzs.y(atomicReferenceFieldUpdater, this, obj)) {
                return -1;
            }
            Z();
            return 1;
        }
        if (!(obj instanceof pov)) {
            return 0;
        }
        if (!nzs.z(atomicReferenceFieldUpdater, this, obj, ((pov) obj).a)) {
            return -1;
        }
        Z();
        return 1;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    public final boolean g0(iqv iqvVar, Throwable th) {
        de60 L = L(iqvVar);
        if (L == null) {
            return false;
        }
        c9x c9xVar = new c9x(L, th);
        while (true) {
            a.getClass();
            Unsafe unsafe = wb4.a;
            long j = w;
            c cVar = this;
            iqv iqvVar2 = iqvVar;
            if (unsafe.compareAndSwapObject(cVar, j, iqvVar2, c9xVar)) {
                cVar.X(L, th);
                return true;
            }
            if (unsafe.getObjectVolatile(cVar, j) != iqvVar2) {
                return false;
            }
            this = cVar;
            iqvVar = iqvVar2;
        }
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.l8x
    public final qrq0 getChildren() {
        return new h73(2, new JobSupport$children$1(null, this));
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return seu.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final Object h0(Object obj, Object obj2) {
        if (!(obj instanceof iqv)) {
            return ffx.b;
        }
        if (((obj instanceof wun) || (obj instanceof t8x)) && !(obj instanceof ipb) && !(obj2 instanceof tzc)) {
            iqv iqvVar = (iqv) obj;
            if (!nzs.A(a, this, iqvVar, obj2 instanceof iqv ? new mqv((iqv) obj2) : obj2)) {
                return ffx.d;
            }
            Y(obj2);
            A(iqvVar, obj2);
            return obj2;
        }
        iqv iqvVar2 = (iqv) obj;
        de60 L = L(iqvVar2);
        if (L == null) {
            return ffx.d;
        }
        c9x c9xVar = iqvVar2 instanceof c9x ? (c9x) iqvVar2 : null;
        if (c9xVar == null) {
            c9xVar = new c9x(L, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c9xVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c9x.b;
            if (atomicIntegerFieldUpdater.get(c9xVar) == 1) {
                return ffx.b;
            }
            atomicIntegerFieldUpdater.set(c9xVar, 1);
            if (c9xVar != iqvVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, iqvVar2, c9xVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != iqvVar2) {
                        return ffx.d;
                    }
                }
            }
            boolean e = c9xVar.e();
            tzc tzcVar = obj2 instanceof tzc ? (tzc) obj2 : null;
            if (tzcVar != null) {
                c9xVar.a(tzcVar.a);
            }
            ?? d = e ? 0 : c9xVar.d();
            ref$ObjectRef.element = d;
            if (d != 0) {
                X(L, d);
            }
            ipb W = W(L);
            if (W != null && i0(c9xVar, W, obj2)) {
                return ffx.c;
            }
            L.c(new uqy(2), 2);
            ipb W2 = W(L);
            return (W2 == null || !i0(c9xVar, W2, obj2)) ? C(c9xVar, obj2) : ffx.c;
        }
    }

    public final boolean i0(c9x c9xVar, ipb ipbVar, Object obj) {
        while (a.o(ipbVar.A, false, new b9x(this, c9xVar, ipbVar, obj)) == ke60.a) {
            ipbVar = W(ipbVar);
            if (ipbVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.l8x
    public boolean isActive() {
        Object N = N();
        return (N instanceof iqv) && ((iqv) N).isActive();
    }

    @Override // defpackage.l8x
    public final boolean isCancelled() {
        Object N = N();
        if (N instanceof tzc) {
            return true;
        }
        return (N instanceof c9x) && ((c9x) N).e();
    }

    @Override // defpackage.l8x
    public final boolean k0() {
        return !(N() instanceof iqv);
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    public void p(Object obj) {
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    public void r(Object obj) {
        p(obj);
    }

    public final Object s(Continuation continuation) {
        Object N;
        do {
            N = N();
            if (!(N instanceof iqv)) {
                if (N instanceof tzc) {
                    throw ((tzc) N).a;
                }
                return ffx.g0(N);
            }
        } while (e0(N) < 0);
        a9x a9xVar = new a9x(dvw.b(continuation), this);
        a9xVar.u();
        a9xVar.x(new qv7(1, a.o(this, true, new l0k0(a9xVar))));
        Object s = a9xVar.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    @Override // defpackage.l8x
    public final boolean start() {
        int e0;
        do {
            e0 = e0(N());
            if (e0 == 0) {
                return false;
            }
        } while (e0 != 1);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.ffx.c) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(Object obj) {
        jb20 jb20Var;
        Object obj2 = ffx.b;
        if (J()) {
            do {
                Object N = N();
                if (N instanceof iqv) {
                    if (N instanceof c9x) {
                        if (c9x.b.get((c9x) N) == 1) {
                        }
                    }
                    obj2 = h0(N, new tzc(B(obj), false));
                }
                obj2 = ffx.b;
                break;
            } while (obj2 == ffx.d);
        }
        if (obj2 == ffx.b) {
            Throwable th = null;
            while (true) {
                Object N2 = N();
                if (!(N2 instanceof c9x)) {
                    if (!(N2 instanceof iqv)) {
                        jb20Var = ffx.e;
                        break;
                    }
                    if (th == null) {
                        th = B(obj);
                    }
                    iqv iqvVar = (iqv) N2;
                    if (!iqvVar.isActive()) {
                        Object h0 = h0(N2, new tzc(th, false));
                        if (h0 == ffx.b) {
                            ny61.r(b64.i("Cannot happen in ", N2));
                            return false;
                        }
                        if (h0 != ffx.d) {
                            obj2 = h0;
                            break;
                        }
                    } else if (g0(iqvVar, th)) {
                        jb20Var = ffx.b;
                        break;
                    }
                } else {
                    synchronized (N2) {
                        if (((c9x) N2).c() == ffx.f) {
                            jb20Var = ffx.e;
                        } else {
                            boolean e = ((c9x) N2).e();
                            if (obj != null || !e) {
                                if (th == null) {
                                    th = B(obj);
                                }
                                ((c9x) N2).a(th);
                            }
                            Throwable d = e ? null : ((c9x) N2).d();
                            if (d != null) {
                                X(((c9x) N2).a, d);
                            }
                            jb20Var = ffx.b;
                        }
                    }
                }
            }
        }
        if (obj2 != ffx.b && obj2 != ffx.c) {
            if (obj2 == ffx.e) {
                return false;
            }
            p(obj2);
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V() + '{' + f0(N()) + '}');
        sb.append('@');
        sb.append(wwg.s(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) {
        t(cancellationException);
    }

    @Override // defpackage.l8x
    public final Object u0(Continuation continuation) {
        Object N;
        zy11 zy11Var;
        do {
            N = N();
            boolean z = N instanceof iqv;
            zy11Var = zy11.a;
            if (!z) {
                a.k(continuation.get_context());
                return zy11Var;
            }
        } while (e0(N) < 0);
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        j18Var.x(new qv7(1, a.o(this, true, new p0k0(j18Var))));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s != coroutineSingletons) {
            s = zy11Var;
        }
        return s == coroutineSingletons ? s : zy11Var;
    }

    @Override // defpackage.l8x
    public final m1k w(tls tlsVar) {
        return R(true, new kyw(tlsVar));
    }

    public final boolean x(Throwable th) {
        if (S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        hpb M = M();
        return (M == null || M == ke60.a) ? z : M.a(th) || z;
    }

    public String y() {
        return "Job was cancelled";
    }

    public boolean z(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && G();
    }
}
