package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xdr extends n9 implements bqi, cu3, hzc {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(xdr.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public xdr(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.xpi
    public final boolean a(Object obj) {
        l(obj);
        return true;
    }

    @Override // defpackage.u0q
    public final List b() {
        return t75.c(getValue());
    }

    @Override // defpackage.hzc
    public final pjc c(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return (((i < 0 || i >= 2) && i != -2) || oi3Var != oi3.b) ? y0q.d(this, coroutineContext, i, oi3Var) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r14.equals(r15) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        if (r15 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if (kotlin.Unit.a == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0077, code lost:
    
        if (((defpackage.knr) r14).b(r0) == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008f, B:16:0x0097, B:19:0x009e, B:20:0x00a2, B:24:0x00a5, B:26:0x00c6, B:29:0x00d6, B:30:0x00f0, B:36:0x0104, B:41:0x010d, B:32:0x00f7, B:35:0x00fd, B:46:0x00ab, B:49:0x00b2, B:57:0x004b, B:59:0x0056, B:60:0x0080), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x008f, B:16:0x0097, B:19:0x009e, B:20:0x00a2, B:24:0x00a5, B:26:0x00c6, B:29:0x00d6, B:30:0x00f0, B:36:0x0104, B:41:0x010d, B:32:0x00f7, B:35:0x00fd, B:46:0x00ab, B:49:0x00b2, B:57:0x004b, B:59:0x0056, B:60:0x0080), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d5 -> B:14:0x008f). Please report as a decompilation issue!!! */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        wdr wdrVar;
        nm6 nm6Var;
        int i;
        xdr xdrVar;
        zdr zdrVar;
        rjc rjcVar2;
        r2f r2fVar;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (continuation instanceof wdr) {
                wdrVar = (wdr) continuation;
                int i2 = wdrVar.q;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wdrVar.q = i2 - Integer.MIN_VALUE;
                    Object obj3 = wdrVar.o;
                    nm6Var = nm6.a;
                    i = wdrVar.q;
                    if (i != 0) {
                        qgg.h0(obj3);
                        zdrVar = (zdr) d();
                        try {
                            if (rjcVar instanceof knr) {
                                wdrVar.j = this;
                                wdrVar.k = rjcVar;
                                wdrVar.l = zdrVar;
                                wdrVar.q = 1;
                            }
                            xdrVar = this;
                        } catch (Throwable th) {
                            th = th;
                            xdrVar = this;
                            xdrVar.h(zdrVar);
                            throw th;
                        }
                    } else if (i == 1) {
                        zdrVar = wdrVar.l;
                        rjcVar = wdrVar.k;
                        xdrVar = wdrVar.j;
                        qgg.h0(obj3);
                    } else if (i == 2) {
                        obj = wdrVar.n;
                        r2fVar = wdrVar.m;
                        zdrVar = wdrVar.l;
                        rjcVar2 = wdrVar.k;
                        xdrVar = wdrVar.j;
                        qgg.h0(obj3);
                        AtomicReference atomicReference = zdrVar.a;
                        js3 js3Var = ydr.a;
                        andSet = atomicReference.getAndSet(js3Var);
                        andSet.getClass();
                        if (andSet == ydr.b) {
                        }
                        Object obj4 = f.get(xdrVar);
                        if (r2fVar != null) {
                        }
                        if (obj4 == ugj.a) {
                        }
                        wdrVar.j = xdrVar;
                        wdrVar.k = rjcVar2;
                        wdrVar.l = zdrVar;
                        wdrVar.m = r2fVar;
                        wdrVar.n = obj4;
                        wdrVar.q = 2;
                        if (rjcVar2.emit(obj2, wdrVar) == nm6Var) {
                        }
                    } else {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = wdrVar.n;
                        r2fVar = wdrVar.m;
                        zdrVar = wdrVar.l;
                        rjcVar2 = wdrVar.k;
                        xdrVar = wdrVar.j;
                        qgg.h0(obj3);
                        Object obj42 = f.get(xdrVar);
                        if (r2fVar != null && !r2fVar.b()) {
                            throw r2fVar.D();
                        }
                        obj2 = obj42 == ugj.a ? null : obj42;
                        wdrVar.j = xdrVar;
                        wdrVar.k = rjcVar2;
                        wdrVar.l = zdrVar;
                        wdrVar.m = r2fVar;
                        wdrVar.n = obj42;
                        wdrVar.q = 2;
                        if (rjcVar2.emit(obj2, wdrVar) == nm6Var) {
                            return nm6Var;
                        }
                        obj = obj42;
                        AtomicReference atomicReference2 = zdrVar.a;
                        js3 js3Var2 = ydr.a;
                        andSet = atomicReference2.getAndSet(js3Var2);
                        andSet.getClass();
                        if (andSet == ydr.b) {
                            wdrVar.j = xdrVar;
                            wdrVar.k = rjcVar2;
                            wdrVar.l = zdrVar;
                            wdrVar.m = r2fVar;
                            wdrVar.n = obj;
                            wdrVar.q = 3;
                            zt3 zt3Var = new zt3(1, qxe.b(wdrVar));
                            zt3Var.s();
                            AtomicReference atomicReference3 = zdrVar.a;
                            while (true) {
                                if (atomicReference3.compareAndSet(js3Var2, zt3Var)) {
                                    break;
                                }
                                if (atomicReference3.get() != js3Var2) {
                                    r7o r7oVar = z7o.b;
                                    zt3Var.resumeWith(Unit.a);
                                    break;
                                }
                            }
                            Object q = zt3Var.q();
                            if (q != nm6.a) {
                            }
                        }
                        Object obj422 = f.get(xdrVar);
                        if (r2fVar != null) {
                            throw r2fVar.D();
                        }
                        if (obj422 == ugj.a) {
                        }
                        wdrVar.j = xdrVar;
                        wdrVar.k = rjcVar2;
                        wdrVar.l = zdrVar;
                        wdrVar.m = r2fVar;
                        wdrVar.n = obj422;
                        wdrVar.q = 2;
                        if (rjcVar2.emit(obj2, wdrVar) == nm6Var) {
                        }
                    }
                    rjcVar2 = rjcVar;
                    r2fVar = (r2f) wdrVar.getContext().get(o6c.l);
                    obj = null;
                    Object obj4222 = f.get(xdrVar);
                    if (r2fVar != null) {
                    }
                    if (obj4222 == ugj.a) {
                    }
                    wdrVar.j = xdrVar;
                    wdrVar.k = rjcVar2;
                    wdrVar.l = zdrVar;
                    wdrVar.m = r2fVar;
                    wdrVar.n = obj4222;
                    wdrVar.q = 2;
                    if (rjcVar2.emit(obj2, wdrVar) == nm6Var) {
                    }
                }
            }
            if (i != 0) {
            }
            rjcVar2 = rjcVar;
            r2fVar = (r2f) wdrVar.getContext().get(o6c.l);
            obj = null;
            Object obj42222 = f.get(xdrVar);
            if (r2fVar != null) {
            }
            if (obj42222 == ugj.a) {
            }
            wdrVar.j = xdrVar;
            wdrVar.k = rjcVar2;
            wdrVar.l = zdrVar;
            wdrVar.m = r2fVar;
            wdrVar.n = obj42222;
            wdrVar.q = 2;
            if (rjcVar2.emit(obj2, wdrVar) == nm6Var) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        wdrVar = new wdr(this, continuation);
        Object obj32 = wdrVar.o;
        nm6Var = nm6.a;
        i = wdrVar.q;
    }

    @Override // defpackage.n9
    public final o9 e() {
        return new zdr();
    }

    @Override // defpackage.xpi, defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        l(obj);
        return Unit.a;
    }

    @Override // defpackage.n9
    public final o9[] f() {
        return new zdr[2];
    }

    @Override // defpackage.xpi
    public final void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.vdr
    public final Object getValue() {
        Object obj = f.get(this);
        if (obj == ugj.a) {
            return null;
        }
        return obj;
    }

    public final boolean k(Object obj, Object obj2) {
        js3 js3Var = ugj.a;
        if (obj == null) {
            obj = js3Var;
        }
        if (obj2 == null) {
            obj2 = js3Var;
        }
        return m(obj, obj2);
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = ugj.a;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        o9[] o9VarArr;
        js3 js3Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.d(obj3, obj)) {
                return false;
            }
            if (Intrinsics.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            o9[] o9VarArr2 = (o9[]) this.c;
            while (true) {
                zdr[] zdrVarArr = (zdr[]) o9VarArr2;
                if (zdrVarArr != null) {
                    for (zdr zdrVar : zdrVarArr) {
                        if (zdrVar != null) {
                            AtomicReference atomicReference = zdrVar.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (js3Var = ydr.b)) {
                                    js3 js3Var2 = ydr.a;
                                    if (obj4 != js3Var2) {
                                        while (!atomicReference.compareAndSet(obj4, js3Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        r7o r7oVar = z7o.b;
                                        ((zt3) obj4).resumeWith(Unit.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, js3Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    o9VarArr = (o9[]) this.c;
                }
                o9VarArr2 = o9VarArr;
                i3 = i;
            }
        }
    }
}
