package V7;

import E2.C0316m;
import S7.C0393g;
import S7.C0407v;
import S7.Y;
import S7.h0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class n extends W7.b implements k, b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3486x = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: w, reason: collision with root package name */
    public int f3487w;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    public final Object E() {
        C0316m c0316m = W7.o.f3610a;
        Object obj = f3486x.get(this);
        if (obj == c0316m) {
            return null;
        }
        return obj;
    }

    public final void F(Object obj) {
        int i;
        W7.c[] cVarArr;
        C0316m c0316m;
        if (obj == null) {
            obj = W7.o.f3610a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3486x;
            if (kotlin.jvm.internal.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i4 = this.f3487w;
            if ((i4 & 1) != 0) {
                this.f3487w = i4 + 2;
                return;
            }
            int i6 = i4 + 1;
            this.f3487w = i6;
            W7.c[] cVarArr2 = (W7.c[]) this.f3578v;
            while (true) {
                p[] pVarArr = (p[]) cVarArr2;
                if (pVarArr != null) {
                    for (p pVar : pVarArr) {
                        if (pVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f3490a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(pVar);
                                if (obj2 != null && obj2 != (c0316m = o.f3489b)) {
                                    C0316m c0316m2 = o.f3488a;
                                    if (obj2 != c0316m2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, c0316m2)) {
                                            if (atomicReferenceFieldUpdater2.get(pVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0393g) obj2).resumeWith(v.f41073a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, c0316m)) {
                                        if (atomicReferenceFieldUpdater2.get(pVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f3487w;
                    if (i == i6) {
                        this.f3487w = i6 + 1;
                        return;
                    }
                    cVarArr = (W7.c[]) this.f3578v;
                }
                cVarArr2 = cVarArr;
                i6 = i;
            }
        }
    }

    @Override // V7.c
    public final Object a(Object obj, InterfaceC5240d interfaceC5240d) {
        F(obj);
        return v.f41073a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        if (r4 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0151, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cd, B:18:0x00d5, B:21:0x00dc, B:22:0x00e2, B:26:0x00e5, B:28:0x0106, B:31:0x0119, B:32:0x0131, B:39:0x0145, B:34:0x013c, B:38:0x0142, B:47:0x00eb, B:50:0x00f2, B:58:0x0054, B:60:0x005f, B:61:0x00be), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cd, B:18:0x00d5, B:21:0x00dc, B:22:0x00e2, B:26:0x00e5, B:28:0x0106, B:31:0x0119, B:32:0x0131, B:39:0x0145, B:34:0x013c, B:38:0x0142, B:47:0x00eb, B:50:0x00f2, B:58:0x0054, B:60:0x005f, B:61:0x00be), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0118 -> B:16:0x00cd). Please report as a decompilation issue!!! */
    @Override // V7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(c cVar, InterfaceC5240d interfaceC5240d) {
        m mVar;
        A7.a aVar;
        int i;
        Object obj;
        p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2;
        n nVar;
        p pVar2;
        Y y7;
        c cVar3;
        Object obj2;
        Object obj3;
        Object andSet;
        Object obj4;
        try {
            if (interfaceC5240d instanceof m) {
                mVar = (m) interfaceC5240d;
                int i4 = mVar.f3478A;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    mVar.f3478A = i4 - Integer.MIN_VALUE;
                    Object obj5 = mVar.f3484y;
                    aVar = A7.a.f215n;
                    i = mVar.f3478A;
                    int i6 = 1;
                    if (i != 0) {
                        Q3.b.s(obj5);
                        synchronized (this) {
                            try {
                                Object[] objArr = (W7.c[]) this.f3578v;
                                if (objArr == null) {
                                    objArr = new p[2];
                                    this.f3578v = objArr;
                                } else if (this.f3576n >= objArr.length) {
                                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
                                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                                    this.f3578v = (W7.c[]) copyOf;
                                    objArr = (W7.c[]) copyOf;
                                }
                                int i9 = this.f3577u;
                                do {
                                    obj = objArr[i9];
                                    if (obj == null) {
                                        obj = new p();
                                        objArr[i9] = obj;
                                    }
                                    i9++;
                                    if (i9 >= objArr.length) {
                                        i9 = 0;
                                    }
                                    pVar = (p) obj;
                                    atomicReferenceFieldUpdater = p.f3490a;
                                } while (atomicReferenceFieldUpdater.get(pVar) != null);
                                atomicReferenceFieldUpdater.set(pVar, o.f3488a);
                                this.f3577u = i9;
                                this.f3576n++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        cVar2 = cVar;
                        nVar = this;
                        pVar2 = (p) obj;
                    } else if (i == 1) {
                        pVar2 = mVar.f3481v;
                        cVar2 = mVar.f3480u;
                        nVar = mVar.f3479n;
                        Q3.b.s(obj5);
                    } else if (i == 2) {
                        obj3 = mVar.f3483x;
                        y7 = mVar.f3482w;
                        pVar2 = mVar.f3481v;
                        cVar3 = mVar.f3480u;
                        nVar = mVar.f3479n;
                        Q3.b.s(obj5);
                        obj2 = obj3;
                        pVar2.getClass();
                        C0316m c0316m = o.f3488a;
                        andSet = p.f3490a.getAndSet(pVar2, c0316m);
                        kotlin.jvm.internal.h.b(andSet);
                        if (andSet == o.f3489b) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj6 = mVar.f3483x;
                        y7 = mVar.f3482w;
                        pVar2 = mVar.f3481v;
                        cVar3 = mVar.f3480u;
                        nVar = mVar.f3479n;
                        Q3.b.s(obj5);
                        obj2 = obj6;
                        i6 = 1;
                        obj3 = f3486x.get(nVar);
                        if (y7 != null && !y7.j()) {
                            throw ((h0) y7).w();
                        }
                        obj4 = obj3 != W7.o.f3610a ? null : obj3;
                        mVar.f3479n = nVar;
                        mVar.f3480u = cVar3;
                        mVar.f3481v = pVar2;
                        mVar.f3482w = y7;
                        mVar.f3483x = obj3;
                        mVar.f3478A = 2;
                        if (cVar3.a(obj4, mVar) == aVar) {
                            return aVar;
                        }
                        obj2 = obj3;
                        pVar2.getClass();
                        C0316m c0316m2 = o.f3488a;
                        andSet = p.f3490a.getAndSet(pVar2, c0316m2);
                        kotlin.jvm.internal.h.b(andSet);
                        if (andSet == o.f3489b) {
                            obj3 = f3486x.get(nVar);
                            if (y7 != null) {
                                throw ((h0) y7).w();
                            }
                            if (obj3 != W7.o.f3610a) {
                            }
                            mVar.f3479n = nVar;
                            mVar.f3480u = cVar3;
                            mVar.f3481v = pVar2;
                            mVar.f3482w = y7;
                            mVar.f3483x = obj3;
                            mVar.f3478A = 2;
                            if (cVar3.a(obj4, mVar) == aVar) {
                            }
                            obj2 = obj3;
                            pVar2.getClass();
                            C0316m c0316m22 = o.f3488a;
                            andSet = p.f3490a.getAndSet(pVar2, c0316m22);
                            kotlin.jvm.internal.h.b(andSet);
                            if (andSet == o.f3489b) {
                                mVar.f3479n = nVar;
                                mVar.f3480u = cVar3;
                                mVar.f3481v = pVar2;
                                mVar.f3482w = y7;
                                mVar.f3483x = obj2;
                                mVar.f3478A = 3;
                                C0393g c0393g = new C0393g(i6, A8.b.n(mVar));
                                c0393g.r();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f3490a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(pVar2, c0316m22, c0393g);
                                    v vVar = v.f41073a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(pVar2) != c0316m22) {
                                        c0393g.resumeWith(vVar);
                                        break;
                                    }
                                }
                                Object q8 = c0393g.q();
                                if (q8 == A7.a.f215n) {
                                }
                            }
                        }
                    }
                    y7 = (Y) mVar.getContext().m(C0407v.f3081u);
                    cVar3 = cVar2;
                    obj2 = null;
                    obj3 = f3486x.get(nVar);
                    if (y7 != null) {
                    }
                    if (obj3 != W7.o.f3610a) {
                    }
                    mVar.f3479n = nVar;
                    mVar.f3480u = cVar3;
                    mVar.f3481v = pVar2;
                    mVar.f3482w = y7;
                    mVar.f3483x = obj3;
                    mVar.f3478A = 2;
                    if (cVar3.a(obj4, mVar) == aVar) {
                    }
                    obj2 = obj3;
                    pVar2.getClass();
                    C0316m c0316m222 = o.f3488a;
                    andSet = p.f3490a.getAndSet(pVar2, c0316m222);
                    kotlin.jvm.internal.h.b(andSet);
                    if (andSet == o.f3489b) {
                    }
                }
            }
            if (i != 0) {
            }
            y7 = (Y) mVar.getContext().m(C0407v.f3081u);
            cVar3 = cVar2;
            obj2 = null;
            obj3 = f3486x.get(nVar);
            if (y7 != null) {
            }
            if (obj3 != W7.o.f3610a) {
            }
            mVar.f3479n = nVar;
            mVar.f3480u = cVar3;
            mVar.f3481v = pVar2;
            mVar.f3482w = y7;
            mVar.f3483x = obj3;
            mVar.f3478A = 2;
            if (cVar3.a(obj4, mVar) == aVar) {
            }
            obj2 = obj3;
            pVar2.getClass();
            C0316m c0316m2222 = o.f3488a;
            andSet = p.f3490a.getAndSet(pVar2, c0316m2222);
            kotlin.jvm.internal.h.b(andSet);
            if (andSet == o.f3489b) {
            }
        } catch (Throwable th2) {
            synchronized (nVar) {
                try {
                    int i10 = nVar.f3576n - 1;
                    nVar.f3576n = i10;
                    if (i10 == 0) {
                        nVar.f3577u = 0;
                    }
                    kotlin.jvm.internal.h.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    p.f3490a.set(pVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        mVar = new m(this, interfaceC5240d);
        Object obj52 = mVar.f3484y;
        aVar = A7.a.f215n;
        i = mVar.f3478A;
        int i62 = 1;
    }
}
