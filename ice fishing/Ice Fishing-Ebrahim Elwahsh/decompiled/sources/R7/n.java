package R7;

import O7.C0382g;
import O7.C0396v;
import O7.Y;
import O7.h0;
import T7.v;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class n extends S7.b implements k, b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2877x = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: w, reason: collision with root package name */
    public int f2878w;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    public final Object E() {
        v vVar = S7.o.f3014a;
        Object obj = f2877x.get(this);
        if (obj == vVar) {
            return null;
        }
        return obj;
    }

    public final void F(Object obj) {
        int i;
        S7.c[] cVarArr;
        v vVar;
        if (obj == null) {
            obj = S7.o.f3014a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2877x;
            if (kotlin.jvm.internal.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i4 = this.f2878w;
            if ((i4 & 1) != 0) {
                this.f2878w = i4 + 2;
                return;
            }
            int i9 = i4 + 1;
            this.f2878w = i9;
            S7.c[] cVarArr2 = (S7.c[]) this.f2982v;
            while (true) {
                p[] pVarArr = (p[]) cVarArr2;
                if (pVarArr != null) {
                    for (p pVar : pVarArr) {
                        if (pVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f2881a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(pVar);
                                if (obj2 != null && obj2 != (vVar = o.f2880b)) {
                                    v vVar2 = o.f2879a;
                                    if (obj2 != vVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, vVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(pVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0382g) obj2).resumeWith(q7.v.f40183a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(pVar, obj2, vVar)) {
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
                    i = this.f2878w;
                    if (i == i9) {
                        this.f2878w = i9 + 1;
                        return;
                    }
                    cVarArr = (S7.c[]) this.f2982v;
                }
                cVarArr2 = cVarArr;
                i9 = i;
            }
        }
    }

    @Override // R7.c
    public final Object a(Object obj, InterfaceC5133d interfaceC5133d) {
        F(obj);
        return q7.v.f40183a;
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
    @Override // R7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(c cVar, InterfaceC5133d interfaceC5133d) {
        m mVar;
        EnumC5179a enumC5179a;
        int i;
        Object obj;
        p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2;
        n nVar;
        p pVar2;
        Y y6;
        c cVar3;
        Object obj2;
        Object obj3;
        Object andSet;
        Object obj4;
        try {
            if (interfaceC5133d instanceof m) {
                mVar = (m) interfaceC5133d;
                int i4 = mVar.f2869A;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    mVar.f2869A = i4 - Integer.MIN_VALUE;
                    Object obj5 = mVar.f2875y;
                    enumC5179a = EnumC5179a.f41704n;
                    i = mVar.f2869A;
                    int i9 = 1;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj5);
                        synchronized (this) {
                            try {
                                Object[] objArr = (S7.c[]) this.f2982v;
                                if (objArr == null) {
                                    objArr = new p[2];
                                    this.f2982v = objArr;
                                } else if (this.f2980n >= objArr.length) {
                                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
                                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                                    this.f2982v = (S7.c[]) copyOf;
                                    objArr = (S7.c[]) copyOf;
                                }
                                int i10 = this.f2981u;
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
                                    atomicReferenceFieldUpdater = p.f2881a;
                                } while (atomicReferenceFieldUpdater.get(pVar) != null);
                                atomicReferenceFieldUpdater.set(pVar, o.f2879a);
                                this.f2981u = i10;
                                this.f2980n++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        cVar2 = cVar;
                        nVar = this;
                        pVar2 = (p) obj;
                    } else if (i == 1) {
                        pVar2 = mVar.f2872v;
                        cVar2 = mVar.f2871u;
                        nVar = mVar.f2870n;
                        com.bumptech.glide.f.r(obj5);
                    } else if (i == 2) {
                        obj3 = mVar.f2874x;
                        y6 = mVar.f2873w;
                        pVar2 = mVar.f2872v;
                        cVar3 = mVar.f2871u;
                        nVar = mVar.f2870n;
                        com.bumptech.glide.f.r(obj5);
                        obj2 = obj3;
                        pVar2.getClass();
                        v vVar = o.f2879a;
                        andSet = p.f2881a.getAndSet(pVar2, vVar);
                        kotlin.jvm.internal.h.b(andSet);
                        if (andSet == o.f2880b) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj6 = mVar.f2874x;
                        y6 = mVar.f2873w;
                        pVar2 = mVar.f2872v;
                        cVar3 = mVar.f2871u;
                        nVar = mVar.f2870n;
                        com.bumptech.glide.f.r(obj5);
                        obj2 = obj6;
                        i9 = 1;
                        obj3 = f2877x.get(nVar);
                        if (y6 != null && !y6.j()) {
                            throw ((h0) y6).w();
                        }
                        obj4 = obj3 != S7.o.f3014a ? null : obj3;
                        mVar.f2870n = nVar;
                        mVar.f2871u = cVar3;
                        mVar.f2872v = pVar2;
                        mVar.f2873w = y6;
                        mVar.f2874x = obj3;
                        mVar.f2869A = 2;
                        if (cVar3.a(obj4, mVar) == enumC5179a) {
                            return enumC5179a;
                        }
                        obj2 = obj3;
                        pVar2.getClass();
                        v vVar2 = o.f2879a;
                        andSet = p.f2881a.getAndSet(pVar2, vVar2);
                        kotlin.jvm.internal.h.b(andSet);
                        if (andSet == o.f2880b) {
                            obj3 = f2877x.get(nVar);
                            if (y6 != null) {
                                throw ((h0) y6).w();
                            }
                            if (obj3 != S7.o.f3014a) {
                            }
                            mVar.f2870n = nVar;
                            mVar.f2871u = cVar3;
                            mVar.f2872v = pVar2;
                            mVar.f2873w = y6;
                            mVar.f2874x = obj3;
                            mVar.f2869A = 2;
                            if (cVar3.a(obj4, mVar) == enumC5179a) {
                            }
                            obj2 = obj3;
                            pVar2.getClass();
                            v vVar22 = o.f2879a;
                            andSet = p.f2881a.getAndSet(pVar2, vVar22);
                            kotlin.jvm.internal.h.b(andSet);
                            if (andSet == o.f2880b) {
                                mVar.f2870n = nVar;
                                mVar.f2871u = cVar3;
                                mVar.f2872v = pVar2;
                                mVar.f2873w = y6;
                                mVar.f2874x = obj2;
                                mVar.f2869A = 3;
                                C0382g c0382g = new C0382g(i9, w8.a.f(mVar));
                                c0382g.r();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p.f2881a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(pVar2, vVar22, c0382g);
                                    q7.v vVar3 = q7.v.f40183a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(pVar2) != vVar22) {
                                        c0382g.resumeWith(vVar3);
                                        break;
                                    }
                                }
                                Object q6 = c0382g.q();
                                if (q6 == EnumC5179a.f41704n) {
                                }
                            }
                        }
                    }
                    y6 = (Y) mVar.getContext().i(C0396v.f2634u);
                    cVar3 = cVar2;
                    obj2 = null;
                    obj3 = f2877x.get(nVar);
                    if (y6 != null) {
                    }
                    if (obj3 != S7.o.f3014a) {
                    }
                    mVar.f2870n = nVar;
                    mVar.f2871u = cVar3;
                    mVar.f2872v = pVar2;
                    mVar.f2873w = y6;
                    mVar.f2874x = obj3;
                    mVar.f2869A = 2;
                    if (cVar3.a(obj4, mVar) == enumC5179a) {
                    }
                    obj2 = obj3;
                    pVar2.getClass();
                    v vVar222 = o.f2879a;
                    andSet = p.f2881a.getAndSet(pVar2, vVar222);
                    kotlin.jvm.internal.h.b(andSet);
                    if (andSet == o.f2880b) {
                    }
                }
            }
            if (i != 0) {
            }
            y6 = (Y) mVar.getContext().i(C0396v.f2634u);
            cVar3 = cVar2;
            obj2 = null;
            obj3 = f2877x.get(nVar);
            if (y6 != null) {
            }
            if (obj3 != S7.o.f3014a) {
            }
            mVar.f2870n = nVar;
            mVar.f2871u = cVar3;
            mVar.f2872v = pVar2;
            mVar.f2873w = y6;
            mVar.f2874x = obj3;
            mVar.f2869A = 2;
            if (cVar3.a(obj4, mVar) == enumC5179a) {
            }
            obj2 = obj3;
            pVar2.getClass();
            v vVar2222 = o.f2879a;
            andSet = p.f2881a.getAndSet(pVar2, vVar2222);
            kotlin.jvm.internal.h.b(andSet);
            if (andSet == o.f2880b) {
            }
        } catch (Throwable th2) {
            synchronized (nVar) {
                try {
                    int i11 = nVar.f2980n - 1;
                    nVar.f2980n = i11;
                    if (i11 == 0) {
                        nVar.f2981u = 0;
                    }
                    kotlin.jvm.internal.h.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    p.f2881a.set(pVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        mVar = new m(this, interfaceC5133d);
        Object obj52 = mVar.f2875y;
        enumC5179a = EnumC5179a.f41704n;
        i = mVar.f2869A;
        int i92 = 1;
    }
}
