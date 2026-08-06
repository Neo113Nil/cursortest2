package D1;

import A1.C0005f;
import A1.C0019u;
import A1.S;
import A1.b0;
import h1.C0239i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.EnumC0985a;

/* loaded from: classes.dex */
public final class r extends E1.b implements d, e, E1.j {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f299e = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f300d;

    public r(Object obj) {
        this._state = obj;
    }

    @Override // D1.e
    public final Object a(Object obj, l1.d dVar) {
        if (obj == null) {
            obj = E1.l.f331a;
        }
        b(null, obj);
        return C0239i.f3393a;
    }

    public final boolean b(Object obj, Object obj2) {
        int i2;
        E1.c[] cVarArr;
        C.j jVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f299e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.i.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f300d;
            if ((i3 & 1) != 0) {
                this.f300d = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f300d = i4;
            E1.c[] cVarArr2 = this.f311a;
            while (true) {
                t[] tVarArr = (t[]) cVarArr2;
                if (tVarArr != null) {
                    for (t tVar : tVarArr) {
                        if (tVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t.f303a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(tVar);
                                if (obj4 != null && obj4 != (jVar = s.f302b)) {
                                    C.j jVar2 = s.f301a;
                                    if (obj4 != jVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, obj4, jVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(tVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0005f) obj4).i(C0239i.f3393a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, obj4, jVar)) {
                                        if (atomicReferenceFieldUpdater2.get(tVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f300d;
                    if (i2 == i4) {
                        this.f300d = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f311a;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    @Override // E1.j
    public final d o(l1.i iVar, int i2, int i3) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) && !((i2 == 0 || i2 == -3) && i3 == 1)) ? new E1.h(this, iVar, i2, i3) : this;
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
    @Override // D1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(e eVar, l1.d dVar) {
        q qVar;
        EnumC0985a enumC0985a;
        int i2;
        E1.c cVar;
        t tVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar2;
        r rVar;
        t tVar2;
        S s2;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar instanceof q) {
                qVar = (q) dVar;
                int i3 = qVar.f298k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    qVar.f298k = i3 - Integer.MIN_VALUE;
                    Object obj4 = qVar.f296i;
                    enumC0985a = EnumC0985a.f8194a;
                    i2 = qVar.f298k;
                    int i4 = 1;
                    if (i2 != 0) {
                        R1.l.F(obj4);
                        synchronized (this) {
                            try {
                                E1.c[] cVarArr = this.f311a;
                                if (cVarArr == null) {
                                    cVarArr = new t[2];
                                    this.f311a = cVarArr;
                                } else if (this.f312b >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                                    this.f311a = (E1.c[]) copyOf;
                                    cVarArr = (E1.c[]) copyOf;
                                }
                                int i5 = this.f313c;
                                do {
                                    cVar = cVarArr[i5];
                                    if (cVar == null) {
                                        cVar = new t();
                                        cVarArr[i5] = cVar;
                                    }
                                    i5++;
                                    if (i5 >= cVarArr.length) {
                                        i5 = 0;
                                    }
                                    tVar = (t) cVar;
                                    atomicReferenceFieldUpdater = t.f303a;
                                } while (atomicReferenceFieldUpdater.get(tVar) != null);
                                atomicReferenceFieldUpdater.set(tVar, s.f301a);
                                this.f313c = i5;
                                this.f312b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        rVar = this;
                        tVar2 = (t) cVar;
                    } else if (i2 == 1) {
                        tVar2 = qVar.f293f;
                        eVar2 = qVar.f292e;
                        rVar = qVar.f291d;
                        R1.l.F(obj4);
                    } else if (i2 == 2) {
                        obj2 = qVar.f295h;
                        s2 = qVar.f294g;
                        tVar2 = qVar.f293f;
                        eVar3 = qVar.f292e;
                        rVar = qVar.f291d;
                        R1.l.F(obj4);
                        obj = obj2;
                        tVar2.getClass();
                        C.j jVar = s.f301a;
                        andSet = t.f303a.getAndSet(tVar2, jVar);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet != s.f302b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = qVar.f295h;
                        s2 = qVar.f294g;
                        tVar2 = qVar.f293f;
                        eVar3 = qVar.f292e;
                        rVar = qVar.f291d;
                        R1.l.F(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f299e.get(rVar);
                        if (s2 != null && !s2.b()) {
                            throw ((b0) s2).z();
                        }
                        obj3 = obj2 == E1.l.f331a ? null : obj2;
                        qVar.f291d = rVar;
                        qVar.f292e = eVar3;
                        qVar.f293f = tVar2;
                        qVar.f294g = s2;
                        qVar.f295h = obj2;
                        qVar.f298k = 2;
                        if (eVar3.a(obj3, qVar) == enumC0985a) {
                            return enumC0985a;
                        }
                        obj = obj2;
                        tVar2.getClass();
                        C.j jVar2 = s.f301a;
                        andSet = t.f303a.getAndSet(tVar2, jVar2);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet != s.f302b) {
                            obj2 = f299e.get(rVar);
                            if (s2 != null) {
                                throw ((b0) s2).z();
                            }
                            if (obj2 == E1.l.f331a) {
                            }
                            qVar.f291d = rVar;
                            qVar.f292e = eVar3;
                            qVar.f293f = tVar2;
                            qVar.f294g = s2;
                            qVar.f295h = obj2;
                            qVar.f298k = 2;
                            if (eVar3.a(obj3, qVar) == enumC0985a) {
                            }
                            obj = obj2;
                            tVar2.getClass();
                            C.j jVar22 = s.f301a;
                            andSet = t.f303a.getAndSet(tVar2, jVar22);
                            kotlin.jvm.internal.i.b(andSet);
                            if (andSet != s.f302b) {
                                qVar.f291d = rVar;
                                qVar.f292e = eVar3;
                                qVar.f293f = tVar2;
                                qVar.f294g = s2;
                                qVar.f295h = obj;
                                qVar.f298k = 3;
                                C0005f c0005f = new C0005f(i4, R1.d.t(qVar));
                                c0005f.u();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t.f303a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(tVar2, jVar22, c0005f);
                                    C0239i c0239i = C0239i.f3393a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(tVar2) != jVar22) {
                                        c0005f.i(c0239i);
                                        break;
                                    }
                                }
                                Object t = c0005f.t();
                                if (t == EnumC0985a.f8194a) {
                                }
                                if (t == enumC0985a) {
                                    return enumC0985a;
                                }
                                i4 = 1;
                                obj2 = f299e.get(rVar);
                                if (s2 != null) {
                                }
                                if (obj2 == E1.l.f331a) {
                                }
                                qVar.f291d = rVar;
                                qVar.f292e = eVar3;
                                qVar.f293f = tVar2;
                                qVar.f294g = s2;
                                qVar.f295h = obj2;
                                qVar.f298k = 2;
                                if (eVar3.a(obj3, qVar) == enumC0985a) {
                                }
                                obj = obj2;
                                tVar2.getClass();
                                C.j jVar222 = s.f301a;
                                andSet = t.f303a.getAndSet(tVar2, jVar222);
                                kotlin.jvm.internal.i.b(andSet);
                                if (andSet != s.f302b) {
                                }
                            }
                        }
                    }
                    l1.i iVar = qVar.f8213b;
                    kotlin.jvm.internal.i.b(iVar);
                    s2 = (S) iVar.m(C0019u.f73b);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f299e.get(rVar);
                    if (s2 != null) {
                    }
                    if (obj2 == E1.l.f331a) {
                    }
                    qVar.f291d = rVar;
                    qVar.f292e = eVar3;
                    qVar.f293f = tVar2;
                    qVar.f294g = s2;
                    qVar.f295h = obj2;
                    qVar.f298k = 2;
                    if (eVar3.a(obj3, qVar) == enumC0985a) {
                    }
                    obj = obj2;
                    tVar2.getClass();
                    C.j jVar2222 = s.f301a;
                    andSet = t.f303a.getAndSet(tVar2, jVar2222);
                    kotlin.jvm.internal.i.b(andSet);
                    if (andSet != s.f302b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            l1.i iVar2 = qVar.f8213b;
            kotlin.jvm.internal.i.b(iVar2);
            s2 = (S) iVar2.m(C0019u.f73b);
            eVar3 = eVar2;
            obj = null;
            obj2 = f299e.get(rVar);
            if (s2 != null) {
            }
            if (obj2 == E1.l.f331a) {
            }
            qVar.f291d = rVar;
            qVar.f292e = eVar3;
            qVar.f293f = tVar2;
            qVar.f294g = s2;
            qVar.f295h = obj2;
            qVar.f298k = 2;
            if (eVar3.a(obj3, qVar) == enumC0985a) {
            }
            obj = obj2;
            tVar2.getClass();
            C.j jVar22222 = s.f301a;
            andSet = t.f303a.getAndSet(tVar2, jVar22222);
            kotlin.jvm.internal.i.b(andSet);
            if (andSet != s.f302b) {
            }
        } catch (Throwable th2) {
            synchronized (rVar) {
                try {
                    int i6 = rVar.f312b - 1;
                    rVar.f312b = i6;
                    if (i6 == 0) {
                        rVar.f313c = 0;
                    }
                    kotlin.jvm.internal.i.c(tVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    t.f303a.set(tVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        qVar = new q(this, dVar);
        Object obj42 = qVar.f296i;
        enumC0985a = EnumC0985a.f8194a;
        i2 = qVar.f298k;
        int i42 = 1;
    }
}
