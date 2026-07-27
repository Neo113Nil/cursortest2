package V7;

import S7.C0389g;
import S7.C0403v;
import S7.Y;
import S7.h0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class n extends W7.b implements k, b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3356x = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: w, reason: collision with root package name */
    public int f3357w;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    public final Object E() {
        D2.b bVar = W7.o.f3448a;
        Object obj = f3356x.get(this);
        if (obj == bVar) {
            return null;
        }
        return obj;
    }

    public final void F(Object obj) {
        int i;
        W7.c[] cVarArr;
        D2.b bVar;
        if (obj == null) {
            obj = W7.o.f3448a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3356x;
            if (kotlin.jvm.internal.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i6 = this.f3357w;
            if ((i6 & 1) != 0) {
                this.f3357w = i6 + 2;
                return;
            }
            int i9 = i6 + 1;
            this.f3357w = i9;
            W7.c[] cVarArr2 = (W7.c[]) this.f3416v;
            while (true) {
                p[] pVarArr = (p[]) cVarArr2;
                if (pVarArr != null) {
                    for (p pVar : pVarArr) {
                        if (pVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f3360a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(pVar);
                                if (obj2 != null && obj2 != (bVar = o.f3359b)) {
                                    D2.b bVar2 = o.f3358a;
                                    if (obj2 != bVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, bVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(pVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0389g) obj2).resumeWith(v.f41350a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, bVar)) {
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
                    i = this.f3357w;
                    if (i == i9) {
                        this.f3357w = i9 + 1;
                        return;
                    }
                    cVarArr = (W7.c[]) this.f3416v;
                }
                cVarArr2 = cVarArr;
                i9 = i;
            }
        }
    }

    @Override // V7.c
    public final Object a(Object obj, InterfaceC5267d interfaceC5267d) {
        F(obj);
        return v.f41350a;
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
    public final Object p(c cVar, InterfaceC5267d interfaceC5267d) {
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
            if (interfaceC5267d instanceof m) {
                mVar = (m) interfaceC5267d;
                int i6 = mVar.f3348A;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    mVar.f3348A = i6 - Integer.MIN_VALUE;
                    Object obj5 = mVar.f3354y;
                    aVar = A7.a.f58n;
                    i = mVar.f3348A;
                    int i9 = 1;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj5);
                        synchronized (this) {
                            try {
                                Object[] objArr = (W7.c[]) this.f3416v;
                                if (objArr == null) {
                                    objArr = new p[2];
                                    this.f3416v = objArr;
                                } else if (this.f3414n >= objArr.length) {
                                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
                                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                                    this.f3416v = (W7.c[]) copyOf;
                                    objArr = (W7.c[]) copyOf;
                                }
                                int i10 = this.f3415u;
                                do {
                                    obj = objArr[i10];
                                    if (obj == null) {
                                        obj = new p();
                                        objArr[i10] = obj;
                                    }
                                    i10++;
                                    if (i10 >= objArr.length) {
                                        i10 = 0;
                                    }
                                    pVar = (p) obj;
                                    atomicReferenceFieldUpdater = p.f3360a;
                                } while (atomicReferenceFieldUpdater.get(pVar) != null);
                                atomicReferenceFieldUpdater.set(pVar, o.f3358a);
                                this.f3415u = i10;
                                this.f3414n++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        cVar2 = cVar;
                        nVar = this;
                        pVar2 = (p) obj;
                    } else if (i == 1) {
                        pVar2 = mVar.f3351v;
                        cVar2 = mVar.f3350u;
                        nVar = mVar.f3349n;
                        com.bumptech.glide.d.k(obj5);
                    } else if (i == 2) {
                        obj3 = mVar.f3353x;
                        y7 = mVar.f3352w;
                        pVar2 = mVar.f3351v;
                        cVar3 = mVar.f3350u;
                        nVar = mVar.f3349n;
                        com.bumptech.glide.d.k(obj5);
                        obj2 = obj3;
                        pVar2.getClass();
                        D2.b bVar = o.f3358a;
                        andSet = p.f3360a.getAndSet(pVar2, bVar);
                        kotlin.jvm.internal.h.b(andSet);
                        if (andSet == o.f3359b) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj6 = mVar.f3353x;
                        y7 = mVar.f3352w;
                        pVar2 = mVar.f3351v;
                        cVar3 = mVar.f3350u;
                        nVar = mVar.f3349n;
                        com.bumptech.glide.d.k(obj5);
                        obj2 = obj6;
                        i9 = 1;
                        obj3 = f3356x.get(nVar);
                        if (y7 != null && !y7.j()) {
                            throw ((h0) y7).w();
                        }
                        obj4 = obj3 != W7.o.f3448a ? null : obj3;
                        mVar.f3349n = nVar;
                        mVar.f3350u = cVar3;
                        mVar.f3351v = pVar2;
                        mVar.f3352w = y7;
                        mVar.f3353x = obj3;
                        mVar.f3348A = 2;
                        if (cVar3.a(obj4, mVar) == aVar) {
                            return aVar;
                        }
                        obj2 = obj3;
                        pVar2.getClass();
                        D2.b bVar2 = o.f3358a;
                        andSet = p.f3360a.getAndSet(pVar2, bVar2);
                        kotlin.jvm.internal.h.b(andSet);
                        if (andSet == o.f3359b) {
                            obj3 = f3356x.get(nVar);
                            if (y7 != null) {
                                throw ((h0) y7).w();
                            }
                            if (obj3 != W7.o.f3448a) {
                            }
                            mVar.f3349n = nVar;
                            mVar.f3350u = cVar3;
                            mVar.f3351v = pVar2;
                            mVar.f3352w = y7;
                            mVar.f3353x = obj3;
                            mVar.f3348A = 2;
                            if (cVar3.a(obj4, mVar) == aVar) {
                            }
                            obj2 = obj3;
                            pVar2.getClass();
                            D2.b bVar22 = o.f3358a;
                            andSet = p.f3360a.getAndSet(pVar2, bVar22);
                            kotlin.jvm.internal.h.b(andSet);
                            if (andSet == o.f3359b) {
                                mVar.f3349n = nVar;
                                mVar.f3350u = cVar3;
                                mVar.f3351v = pVar2;
                                mVar.f3352w = y7;
                                mVar.f3353x = obj2;
                                mVar.f3348A = 3;
                                C0389g c0389g = new C0389g(i9, A8.b.l(mVar));
                                c0389g.r();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f3360a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(pVar2, bVar22, c0389g);
                                    v vVar = v.f41350a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(pVar2) != bVar22) {
                                        c0389g.resumeWith(vVar);
                                        break;
                                    }
                                }
                                Object q8 = c0389g.q();
                                if (q8 == A7.a.f58n) {
                                }
                            }
                        }
                    }
                    y7 = (Y) mVar.getContext().m(C0403v.f2998u);
                    cVar3 = cVar2;
                    obj2 = null;
                    obj3 = f3356x.get(nVar);
                    if (y7 != null) {
                    }
                    if (obj3 != W7.o.f3448a) {
                    }
                    mVar.f3349n = nVar;
                    mVar.f3350u = cVar3;
                    mVar.f3351v = pVar2;
                    mVar.f3352w = y7;
                    mVar.f3353x = obj3;
                    mVar.f3348A = 2;
                    if (cVar3.a(obj4, mVar) == aVar) {
                    }
                    obj2 = obj3;
                    pVar2.getClass();
                    D2.b bVar222 = o.f3358a;
                    andSet = p.f3360a.getAndSet(pVar2, bVar222);
                    kotlin.jvm.internal.h.b(andSet);
                    if (andSet == o.f3359b) {
                    }
                }
            }
            if (i != 0) {
            }
            y7 = (Y) mVar.getContext().m(C0403v.f2998u);
            cVar3 = cVar2;
            obj2 = null;
            obj3 = f3356x.get(nVar);
            if (y7 != null) {
            }
            if (obj3 != W7.o.f3448a) {
            }
            mVar.f3349n = nVar;
            mVar.f3350u = cVar3;
            mVar.f3351v = pVar2;
            mVar.f3352w = y7;
            mVar.f3353x = obj3;
            mVar.f3348A = 2;
            if (cVar3.a(obj4, mVar) == aVar) {
            }
            obj2 = obj3;
            pVar2.getClass();
            D2.b bVar2222 = o.f3358a;
            andSet = p.f3360a.getAndSet(pVar2, bVar2222);
            kotlin.jvm.internal.h.b(andSet);
            if (andSet == o.f3359b) {
            }
        } catch (Throwable th2) {
            synchronized (nVar) {
                try {
                    int i11 = nVar.f3414n - 1;
                    nVar.f3414n = i11;
                    if (i11 == 0) {
                        nVar.f3415u = 0;
                    }
                    kotlin.jvm.internal.h.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    p.f3360a.set(pVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        mVar = new m(this, interfaceC5267d);
        Object obj52 = mVar.f3354y;
        aVar = A7.a.f58n;
        i = mVar.f3348A;
        int i92 = 1;
    }
}
