package N0;

import K0.C0030f;
import K0.C0044u;
import K0.Q;
import K0.a0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q extends O0.b implements d, e, O0.j {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f804j = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: i, reason: collision with root package name */
    public int f805i;

    public q(Object obj) {
        this._state = obj;
    }

    public final boolean a(Object obj, Object obj2) {
        int i2;
        O0.c[] cVarArr;
        A.j jVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f804j;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !E0.i.a(obj3, obj)) {
                return false;
            }
            if (E0.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f805i;
            if ((i3 & 1) != 0) {
                this.f805i = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f805i = i4;
            O0.c[] cVarArr2 = this.f811f;
            while (true) {
                s[] sVarArr = (s[]) cVarArr2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f808a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                if (obj4 != null && obj4 != (jVar = r.f807b)) {
                                    A.j jVar2 = r.f806a;
                                    if (obj4 != jVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, jVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0030f) obj4).c(t0.g.f2989a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, jVar)) {
                                        if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f805i;
                    if (i2 == i4) {
                        this.f805i = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f811f;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    @Override // N0.e
    public final Object b(Object obj, v0.d dVar) {
        if (obj == null) {
            obj = O0.l.f831a;
        }
        a(null, obj);
        return t0.g.f2989a;
    }

    @Override // O0.j
    public final d c(v0.i iVar, int i2, int i3) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) && !((i2 == 0 || i2 == -3) && i3 == 1)) ? new O0.h(this, iVar, i2, i3) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // N0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(e eVar, v0.d dVar) {
        p pVar;
        w0.a aVar;
        int i2;
        O0.c cVar;
        s sVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar2;
        q qVar;
        s sVar2;
        Q q2;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar instanceof p) {
                pVar = (p) dVar;
                int i3 = pVar.f803p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    pVar.f803p = i3 - Integer.MIN_VALUE;
                    Object obj4 = pVar.f801n;
                    aVar = w0.a.f3071f;
                    i2 = pVar.f803p;
                    int i4 = 1;
                    if (i2 != 0) {
                        o.g.C(obj4);
                        synchronized (this) {
                            try {
                                O0.c[] cVarArr = this.f811f;
                                if (cVarArr == null) {
                                    cVarArr = new s[2];
                                    this.f811f = cVarArr;
                                } else if (this.f812g >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    E0.i.d(copyOf, "copyOf(this, newSize)");
                                    this.f811f = (O0.c[]) copyOf;
                                    cVarArr = (O0.c[]) copyOf;
                                }
                                int i5 = this.f813h;
                                do {
                                    cVar = cVarArr[i5];
                                    if (cVar == null) {
                                        cVar = new s();
                                        cVarArr[i5] = cVar;
                                    }
                                    i5++;
                                    if (i5 >= cVarArr.length) {
                                        i5 = 0;
                                    }
                                    sVar = (s) cVar;
                                    atomicReferenceFieldUpdater = s.f808a;
                                } while (atomicReferenceFieldUpdater.get(sVar) != null);
                                atomicReferenceFieldUpdater.set(sVar, r.f806a);
                                this.f813h = i5;
                                this.f812g++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        qVar = this;
                        sVar2 = (s) cVar;
                    } else if (i2 == 1) {
                        sVar2 = pVar.f798k;
                        eVar2 = pVar.f797j;
                        qVar = pVar.f796i;
                        o.g.C(obj4);
                    } else if (i2 == 2) {
                        obj2 = pVar.f800m;
                        q2 = pVar.f799l;
                        sVar2 = pVar.f798k;
                        eVar3 = pVar.f797j;
                        qVar = pVar.f796i;
                        o.g.C(obj4);
                        obj = obj2;
                        sVar2.getClass();
                        A.j jVar = r.f806a;
                        andSet = s.f808a.getAndSet(sVar2, jVar);
                        E0.i.b(andSet);
                        if (andSet != r.f807b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = pVar.f800m;
                        q2 = pVar.f799l;
                        sVar2 = pVar.f798k;
                        eVar3 = pVar.f797j;
                        qVar = pVar.f796i;
                        o.g.C(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f804j.get(qVar);
                        if (q2 != null && !q2.b()) {
                            throw ((a0) q2).A();
                        }
                        obj3 = obj2 == O0.l.f831a ? null : obj2;
                        pVar.f796i = qVar;
                        pVar.f797j = eVar3;
                        pVar.f798k = sVar2;
                        pVar.f799l = q2;
                        pVar.f800m = obj2;
                        pVar.f803p = 2;
                        if (eVar3.b(obj3, pVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        sVar2.getClass();
                        A.j jVar2 = r.f806a;
                        andSet = s.f808a.getAndSet(sVar2, jVar2);
                        E0.i.b(andSet);
                        if (andSet != r.f807b) {
                            obj2 = f804j.get(qVar);
                            if (q2 != null) {
                                throw ((a0) q2).A();
                            }
                            if (obj2 == O0.l.f831a) {
                            }
                            pVar.f796i = qVar;
                            pVar.f797j = eVar3;
                            pVar.f798k = sVar2;
                            pVar.f799l = q2;
                            pVar.f800m = obj2;
                            pVar.f803p = 2;
                            if (eVar3.b(obj3, pVar) == aVar) {
                            }
                            obj = obj2;
                            sVar2.getClass();
                            A.j jVar22 = r.f806a;
                            andSet = s.f808a.getAndSet(sVar2, jVar22);
                            E0.i.b(andSet);
                            if (andSet != r.f807b) {
                                pVar.f796i = qVar;
                                pVar.f797j = eVar3;
                                pVar.f798k = sVar2;
                                pVar.f799l = q2;
                                pVar.f800m = obj;
                                pVar.f803p = 3;
                                C0030f c0030f = new C0030f(i4, o.g.u(pVar));
                                c0030f.v();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f808a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(sVar2, jVar22, c0030f);
                                    t0.g gVar = t0.g.f2989a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(sVar2) != jVar22) {
                                        c0030f.c(gVar);
                                        break;
                                    }
                                }
                                Object u2 = c0030f.u();
                                if (u2 == w0.a.f3071f) {
                                }
                                if (u2 == aVar) {
                                    return aVar;
                                }
                                i4 = 1;
                                obj2 = f804j.get(qVar);
                                if (q2 != null) {
                                }
                                if (obj2 == O0.l.f831a) {
                                }
                                pVar.f796i = qVar;
                                pVar.f797j = eVar3;
                                pVar.f798k = sVar2;
                                pVar.f799l = q2;
                                pVar.f800m = obj2;
                                pVar.f803p = 2;
                                if (eVar3.b(obj3, pVar) == aVar) {
                                }
                                obj = obj2;
                                sVar2.getClass();
                                A.j jVar222 = r.f806a;
                                andSet = s.f808a.getAndSet(sVar2, jVar222);
                                E0.i.b(andSet);
                                if (andSet != r.f807b) {
                                }
                            }
                        }
                    }
                    v0.i iVar = pVar.f3086g;
                    E0.i.b(iVar);
                    q2 = (Q) iVar.i(C0044u.f534g);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f804j.get(qVar);
                    if (q2 != null) {
                    }
                    if (obj2 == O0.l.f831a) {
                    }
                    pVar.f796i = qVar;
                    pVar.f797j = eVar3;
                    pVar.f798k = sVar2;
                    pVar.f799l = q2;
                    pVar.f800m = obj2;
                    pVar.f803p = 2;
                    if (eVar3.b(obj3, pVar) == aVar) {
                    }
                    obj = obj2;
                    sVar2.getClass();
                    A.j jVar2222 = r.f806a;
                    andSet = s.f808a.getAndSet(sVar2, jVar2222);
                    E0.i.b(andSet);
                    if (andSet != r.f807b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            v0.i iVar2 = pVar.f3086g;
            E0.i.b(iVar2);
            q2 = (Q) iVar2.i(C0044u.f534g);
            eVar3 = eVar2;
            obj = null;
            obj2 = f804j.get(qVar);
            if (q2 != null) {
            }
            if (obj2 == O0.l.f831a) {
            }
            pVar.f796i = qVar;
            pVar.f797j = eVar3;
            pVar.f798k = sVar2;
            pVar.f799l = q2;
            pVar.f800m = obj2;
            pVar.f803p = 2;
            if (eVar3.b(obj3, pVar) == aVar) {
            }
            obj = obj2;
            sVar2.getClass();
            A.j jVar22222 = r.f806a;
            andSet = s.f808a.getAndSet(sVar2, jVar22222);
            E0.i.b(andSet);
            if (andSet != r.f807b) {
            }
        } catch (Throwable th2) {
            synchronized (qVar) {
                try {
                    int i6 = qVar.f812g - 1;
                    qVar.f812g = i6;
                    if (i6 == 0) {
                        qVar.f813h = 0;
                    }
                    E0.i.c(sVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    s.f808a.set(sVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        pVar = new p(this, dVar);
        Object obj42 = pVar.f801n;
        aVar = w0.a.f3071f;
        i2 = pVar.f803p;
        int i42 = 1;
    }
}
