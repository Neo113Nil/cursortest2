package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class kr7 implements k9q {
    public final k7q e;
    public final au7 f;
    public final mzu g;
    public final r0o h;
    public final lu6 i;
    public final f7l j;
    public final k1l k;
    public final k1l l;
    public final t5l m;
    public final tf6 n;
    public final xdr o;
    public final qqi p;
    public final AtomicBoolean q;

    public kr7(k7q k7qVar, au7 au7Var, mzu mzuVar, r0o r0oVar, lu6 lu6Var, f7l f7lVar, k1l k1lVar, k1l k1lVar2, uoh uohVar, a aVar, t5l t5lVar) {
        k7qVar.getClass();
        mzuVar.getClass();
        aVar.getClass();
        this.e = k7qVar;
        this.f = au7Var;
        this.g = mzuVar;
        this.h = r0oVar;
        this.i = lu6Var;
        this.j = f7lVar;
        this.k = k1lVar;
        this.l = k1lVar2;
        this.m = t5lVar;
        tf6 e = gld.e(e.c(a4g.n(), aVar).plus(new im6("DefaultSharedWavePlaybackQueue")));
        this.n = e;
        this.o = ydr.a(r7q.a);
        this.p = rqi.a();
        this.q = new AtomicBoolean(false);
        zsd.r0(e, new u21(10, (xdr) au7Var.o, uohVar.a, new gv6(this, (Continuation) null, 1)));
    }

    @Override // defpackage.g4q
    public final void a(c9g c9gVar) {
        this.f.l(c9gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (r15 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:19:0x0067, B:21:0x006d, B:24:0x0073, B:26:0x0077, B:28:0x00a2, B:31:0x008b, B:33:0x008f, B:34:0x00c3, B:35:0x00c8), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:19:0x0067, B:21:0x006d, B:24:0x0073, B:26:0x0077, B:28:0x00a2, B:31:0x008b, B:33:0x008f, B:34:0x00c3, B:35:0x00c8), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, cg6 cg6Var) {
        rq7 rq7Var;
        int i;
        int i2;
        List list2;
        oqi oqiVar;
        xvu d;
        int size;
        try {
            if (cg6Var instanceof rq7) {
                rq7Var = (rq7) cg6Var;
                int i3 = rq7Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    rq7Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = rq7Var.m;
                    nm6 nm6Var = nm6.a;
                    i = rq7Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        rq7Var.j = list;
                        qqi qqiVar = this.p;
                        rq7Var.k = qqiVar;
                        i2 = 0;
                        rq7Var.l = 0;
                        rq7Var.o = 1;
                        if (qqiVar.a(rq7Var) != nm6Var) {
                            list2 = list;
                            oqiVar = qqiVar;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = rq7Var.k;
                        List list3 = rq7Var.j;
                        qgg.h0(obj);
                        oqiVar.b(null);
                        return obj;
                    }
                    int i4 = rq7Var.l;
                    oqi oqiVar2 = rq7Var.k;
                    List list4 = rq7Var.j;
                    qgg.h0(obj);
                    i2 = i4;
                    oqiVar = oqiVar2;
                    list2 = list4;
                    d = d();
                    if (d != null) {
                        Boolean bool = Boolean.FALSE;
                        oqiVar.b(null);
                        return bool;
                    }
                    if (d instanceof bwu) {
                        size = ((bwu) d).a.a.a.a.f().size();
                    } else {
                        if (!(d instanceof fwu)) {
                            throw new x7j();
                        }
                        size = ((fwu) d).a.a.a.a.f().size();
                    }
                    int i5 = size;
                    au7 au7Var = this.f;
                    rq7Var.j = null;
                    rq7Var.k = oqiVar;
                    rq7Var.l = i2;
                    rq7Var.o = 2;
                    obj = x97.V((a) au7Var.h, new b51(au7Var, null, au7Var, list2, i5, i5), rq7Var);
                }
            }
            if (i != 0) {
            }
            d = d();
            if (d != null) {
            }
        } catch (Throwable th) {
            list.b(null);
            throw th;
        }
        rq7Var = new rq7(this, cg6Var);
        Object obj2 = rq7Var.m;
        nm6 nm6Var2 = nm6.a;
        i = rq7Var.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r15 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:19:0x0068, B:21:0x006e, B:24:0x0074, B:26:0x0078, B:28:0x0096, B:30:0x009a, B:32:0x00be, B:35:0x00a8, B:37:0x00ac, B:38:0x00b9, B:39:0x0085, B:41:0x0089, B:42:0x00de, B:43:0x00e3), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:19:0x0068, B:21:0x006e, B:24:0x0074, B:26:0x0078, B:28:0x0096, B:30:0x009a, B:32:0x00be, B:35:0x00a8, B:37:0x00ac, B:38:0x00b9, B:39:0x0085, B:41:0x0089, B:42:0x00de, B:43:0x00e3), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, cg6 cg6Var) {
        sq7 sq7Var;
        int i;
        int i2;
        List list2;
        oqi oqiVar;
        xvu d;
        int c;
        int i3;
        try {
            if (cg6Var instanceof sq7) {
                sq7Var = (sq7) cg6Var;
                int i4 = sq7Var.o;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    sq7Var.o = i4 - Integer.MIN_VALUE;
                    Object obj = sq7Var.m;
                    nm6 nm6Var = nm6.a;
                    i = sq7Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        sq7Var.j = list;
                        qqi qqiVar = this.p;
                        sq7Var.k = qqiVar;
                        i2 = 0;
                        sq7Var.l = 0;
                        sq7Var.o = 1;
                        if (qqiVar.a(sq7Var) != nm6Var) {
                            list2 = list;
                            oqiVar = qqiVar;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = sq7Var.k;
                        List list3 = sq7Var.j;
                        qgg.h0(obj);
                        oqiVar.b(null);
                        return obj;
                    }
                    int i5 = sq7Var.l;
                    oqi oqiVar2 = sq7Var.k;
                    List list4 = sq7Var.j;
                    qgg.h0(obj);
                    i2 = i5;
                    oqiVar = oqiVar2;
                    list2 = list4;
                    d = d();
                    if (d != null) {
                        Boolean bool = Boolean.FALSE;
                        oqiVar.b(null);
                        return bool;
                    }
                    if (d instanceof bwu) {
                        c = ((bwu) d).a.a.b.a;
                    } else {
                        if (!(d instanceof fwu)) {
                            throw new x7j();
                        }
                        c = 1 + ((fwu) d).a.a.c();
                    }
                    int i6 = c;
                    if (d instanceof bwu) {
                        i3 = ((bwu) d).a.a.a.c(i6);
                    } else if (d instanceof fwu) {
                        i3 = ((fwu) d).a.a.a.c(i6);
                    } else {
                        b6e.s();
                        i3 = 0;
                    }
                    int i7 = i3;
                    au7 au7Var = this.f;
                    sq7Var.j = null;
                    sq7Var.k = oqiVar;
                    sq7Var.l = i2;
                    sq7Var.o = 2;
                    obj = x97.V((a) au7Var.h, new b51(au7Var, null, au7Var, list2, i7, i6), sq7Var);
                }
            }
            if (i != 0) {
            }
            d = d();
            if (d != null) {
            }
        } catch (Throwable th) {
            list.b(null);
            throw th;
        }
        sq7Var = new sq7(this, cg6Var);
        Object obj2 = sq7Var.m;
        nm6 nm6Var2 = nm6.a;
        i = sq7Var.o;
    }

    public final xvu d() {
        mwu mwuVar = (mwu) ((xdr) this.f.o).getValue();
        if (mwuVar instanceof xvu) {
            return (xvu) mwuVar;
        }
        if (Intrinsics.d(mwuVar, yvu.a) || (mwuVar instanceof gwu)) {
            return null;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(s9p s9pVar, cg6 cg6Var) {
        tq7 tq7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object V;
        try {
            if (cg6Var instanceof tq7) {
                tq7Var = (tq7) cg6Var;
                int i3 = tq7Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tq7Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = tq7Var.m;
                    nm6Var = nm6.a;
                    i = tq7Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        tq7Var.j = s9pVar;
                        qqiVar = this.p;
                        tq7Var.k = qqiVar;
                        i2 = 0;
                        tq7Var.l = 0;
                        tq7Var.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = tq7Var.k;
                            try {
                                qgg.h0(obj);
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                oqiVar.b(null);
                                return bool;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = tq7Var.l;
                        ?? r2 = tq7Var.k;
                        s9p s9pVar2 = tq7Var.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        s9pVar = s9pVar2;
                    }
                    au7 au7Var = this.f;
                    tq7Var.j = null;
                    tq7Var.k = qqiVar;
                    tq7Var.l = i2;
                    tq7Var.o = 2;
                    V = x97.V((a) au7Var.h, new st7(au7Var, (Continuation) null, au7Var, s9pVar), tq7Var);
                    if (V != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = V;
                        oqiVar = qqiVar2;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        oqiVar.b(null);
                        return bool2;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            tq7Var.j = null;
            tq7Var.k = qqiVar;
            tq7Var.l = i2;
            tq7Var.o = 2;
            V = x97.V((a) au7Var2.h, new st7(au7Var2, (Continuation) null, au7Var2, s9pVar), tq7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        tq7Var = new tq7(this, cg6Var);
        Object obj2 = tq7Var.m;
        nm6Var = nm6.a;
        i = tq7Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        uq7 uq7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Boolean h;
        try {
            if (cg6Var instanceof uq7) {
                uq7Var = (uq7) cg6Var;
                int i3 = uq7Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    uq7Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = uq7Var.l;
                    nm6Var = nm6.a;
                    i = uq7Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        uq7Var.j = qqiVar;
                        i2 = 0;
                        uq7Var.k = 0;
                        uq7Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = uq7Var.j;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = uq7Var.k;
                        ?? r4 = uq7Var.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    uq7Var.j = qqiVar;
                    uq7Var.k = i2;
                    uq7Var.n = 2;
                    h = au7Var.h();
                    if (h != nm6Var) {
                        oqiVar = qqiVar;
                        obj = h;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            uq7Var.j = qqiVar;
            uq7Var.k = i2;
            uq7Var.n = 2;
            h = au7Var2.h();
            if (h != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        uq7Var = new uq7(this, cg6Var);
        Object obj2 = uq7Var.l;
        nm6Var = nm6.a;
        i = uq7Var.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        vq7 vq7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object V;
        try {
            if (cg6Var instanceof vq7) {
                vq7Var = (vq7) cg6Var;
                int i3 = vq7Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    vq7Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = vq7Var.l;
                    nm6Var = nm6.a;
                    i = vq7Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        vq7Var.j = qqiVar;
                        i2 = 0;
                        vq7Var.k = 0;
                        vq7Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = vq7Var.j;
                            try {
                                qgg.h0(obj);
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                oqiVar.b(null);
                                return bool;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = vq7Var.k;
                        ?? r4 = vq7Var.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    lln llnVar = lln.a;
                    vq7Var.j = qqiVar;
                    vq7Var.k = i2;
                    vq7Var.n = 2;
                    V = x97.V((a) au7Var.h, new r72(au7Var, (Continuation) null, au7Var, llnVar), vq7Var);
                    if (V != nm6Var) {
                        oqiVar = qqiVar;
                        obj = V;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        oqiVar.b(null);
                        return bool2;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            lln llnVar2 = lln.a;
            vq7Var.j = qqiVar;
            vq7Var.k = i2;
            vq7Var.n = 2;
            V = x97.V((a) au7Var2.h, new r72(au7Var2, (Continuation) null, au7Var2, llnVar2), vq7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        vq7Var = new vq7(this, cg6Var);
        Object obj2 = vq7Var.l;
        nm6Var = nm6.a;
        i = vq7Var.n;
        if (i != 0) {
        }
    }

    @Override // defpackage.g4q
    public final k7q getDescriptor() {
        return this.e;
    }

    @Override // defpackage.g4q
    public final vdr getState() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r10.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, int i2, cg6 cg6Var) {
        wq7 wq7Var;
        nm6 nm6Var;
        int i3;
        qqi qqiVar;
        int i4;
        oqi oqiVar;
        Boolean i5;
        try {
            if (cg6Var instanceof wq7) {
                wq7Var = (wq7) cg6Var;
                int i6 = wq7Var.p;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    wq7Var.p = i6 - Integer.MIN_VALUE;
                    Object obj = wq7Var.n;
                    nm6Var = nm6.a;
                    i3 = wq7Var.p;
                    if (i3 != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        wq7Var.m = qqiVar;
                        wq7Var.j = i;
                        wq7Var.k = i2;
                        i4 = 0;
                        wq7Var.l = 0;
                        wq7Var.p = 1;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = wq7Var.m;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i7 = wq7Var.l;
                        i2 = wq7Var.k;
                        int i8 = wq7Var.j;
                        ?? r4 = wq7Var.m;
                        qgg.h0(obj);
                        i4 = i7;
                        i = i8;
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    wq7Var.m = qqiVar;
                    wq7Var.j = i;
                    wq7Var.k = i2;
                    wq7Var.l = i4;
                    wq7Var.p = 2;
                    i5 = au7Var.i(i, i2);
                    if (i5 != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = i5;
                        oqiVar = qqiVar2;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            wq7Var.m = qqiVar;
            wq7Var.j = i;
            wq7Var.k = i2;
            wq7Var.l = i4;
            wq7Var.p = 2;
            i5 = au7Var2.i(i, i2);
            if (i5 != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        wq7Var = new wq7(this, cg6Var);
        Object obj2 = wq7Var.n;
        nm6Var = nm6.a;
        i3 = wq7Var.p;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
    
        if (r11.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0076, B:22:0x0089, B:23:0x008e, B:25:0x008f, B:28:0x0092, B:29:0x0095, B:30:0x0098), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum i(v5j v5jVar, cg6 cg6Var) {
        xq7 xq7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object V;
        int ordinal;
        oxi oxiVar;
        try {
            if (cg6Var instanceof xq7) {
                xq7Var = (xq7) cg6Var;
                int i3 = xq7Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xq7Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = xq7Var.m;
                    nm6Var = nm6.a;
                    i = xq7Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        xq7Var.j = v5jVar;
                        qqiVar = this.p;
                        xq7Var.k = qqiVar;
                        i2 = 0;
                        xq7Var.l = 0;
                        xq7Var.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = xq7Var.k;
                            try {
                                qgg.h0(obj);
                                ordinal = ((nvu) obj).ordinal();
                                if (ordinal != 0) {
                                    oxiVar = oxi.a;
                                } else if (ordinal == 1) {
                                    oxiVar = oxi.b;
                                } else if (ordinal != 2) {
                                    if (ordinal != 3 && ordinal != 4) {
                                        throw new x7j();
                                    }
                                    oxiVar = oxi.d;
                                } else {
                                    oxiVar = oxi.c;
                                }
                                oqiVar.b(null);
                                return oxiVar;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = xq7Var.l;
                        ?? r2 = xq7Var.k;
                        v5j v5jVar2 = xq7Var.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        v5jVar = v5jVar2;
                    }
                    au7 au7Var = this.f;
                    xq7Var.j = null;
                    xq7Var.k = qqiVar;
                    xq7Var.l = i2;
                    xq7Var.o = 2;
                    V = x97.V((a) au7Var.h, new tt7(au7Var, (Continuation) null, au7Var, v5jVar), xq7Var);
                    if (V != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = V;
                        oqiVar = qqiVar2;
                        ordinal = ((nvu) obj).ordinal();
                        if (ordinal != 0) {
                        }
                        oqiVar.b(null);
                        return oxiVar;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            xq7Var.j = null;
            xq7Var.k = qqiVar;
            xq7Var.l = i2;
            xq7Var.o = 2;
            V = x97.V((a) au7Var2.h, new tt7(au7Var2, (Continuation) null, au7Var2, v5jVar), xq7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        xq7Var = new xq7(this, cg6Var);
        Object obj2 = xq7Var.m;
        nm6Var = nm6.a;
        i = xq7Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0050, code lost:
    
        if (r10.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x006e, B:17:0x007a, B:21:0x007d, B:22:0x0082, B:23:0x0083, B:24:0x0086), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v2, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum j(cg6 cg6Var) {
        yq7 yq7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object V;
        int ordinal;
        oxi oxiVar;
        try {
            if (cg6Var instanceof yq7) {
                yq7Var = (yq7) cg6Var;
                int i3 = yq7Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    yq7Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = yq7Var.l;
                    nm6Var = nm6.a;
                    i = yq7Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        yq7Var.j = qqiVar;
                        i2 = 0;
                        yq7Var.k = 0;
                        yq7Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = yq7Var.j;
                            try {
                                qgg.h0(obj);
                                ordinal = ((ovu) obj).ordinal();
                                if (ordinal != 0) {
                                    oxiVar = oxi.a;
                                } else if (ordinal == 1) {
                                    oxiVar = oxi.b;
                                } else {
                                    if (ordinal != 2) {
                                        throw new x7j();
                                    }
                                    oxiVar = oxi.d;
                                }
                                oqiVar.b(null);
                                return oxiVar;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = yq7Var.k;
                        ?? r6 = yq7Var.j;
                        qgg.h0(obj);
                        qqiVar = r6;
                    }
                    au7 au7Var = this.f;
                    yq7Var.j = qqiVar;
                    yq7Var.k = i2;
                    yq7Var.n = 2;
                    V = x97.V((a) au7Var.h, new b51(au7Var, (Continuation) null, au7Var), yq7Var);
                    if (V != nm6Var) {
                        oqiVar = qqiVar;
                        obj = V;
                        ordinal = ((ovu) obj).ordinal();
                        if (ordinal != 0) {
                        }
                        oqiVar.b(null);
                        return oxiVar;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            yq7Var.j = qqiVar;
            yq7Var.k = i2;
            yq7Var.n = 2;
            V = x97.V((a) au7Var2.h, new b51(au7Var2, (Continuation) null, au7Var2), yq7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        yq7Var = new yq7(this, cg6Var);
        Object obj2 = yq7Var.l;
        nm6Var = nm6.a;
        i = yq7Var.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        zq7 zq7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object V;
        try {
            if (cg6Var instanceof zq7) {
                zq7Var = (zq7) cg6Var;
                int i3 = zq7Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    zq7Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = zq7Var.l;
                    nm6Var = nm6.a;
                    i = zq7Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        zq7Var.j = qqiVar;
                        i2 = 0;
                        zq7Var.k = 0;
                        zq7Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = zq7Var.j;
                            try {
                                qgg.h0(obj);
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                oqiVar.b(null);
                                return bool;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = zq7Var.k;
                        ?? r4 = zq7Var.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    h1b h1bVar = h1b.f;
                    zq7Var.j = qqiVar;
                    zq7Var.k = i2;
                    zq7Var.n = 2;
                    V = x97.V((a) au7Var.h, new r72(au7Var, (Continuation) null, au7Var, h1bVar), zq7Var);
                    if (V != nm6Var) {
                        oqiVar = qqiVar;
                        obj = V;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        oqiVar.b(null);
                        return bool2;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            h1b h1bVar2 = h1b.f;
            zq7Var.j = qqiVar;
            zq7Var.k = i2;
            zq7Var.n = 2;
            V = x97.V((a) au7Var2.h, new r72(au7Var2, (Continuation) null, au7Var2, h1bVar2), zq7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        zq7Var = new zq7(this, cg6Var);
        Object obj2 = zq7Var.l;
        nm6Var = nm6.a;
        i = zq7Var.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r13 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0029, B:19:0x005d, B:21:0x0063, B:24:0x0069, B:26:0x006d, B:27:0x0082, B:29:0x0088, B:32:0x008e, B:35:0x0076, B:37:0x007a, B:38:0x00ae, B:39:0x00b3), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #0 {all -> 0x002e, blocks: (B:12:0x0029, B:19:0x005d, B:21:0x0063, B:24:0x0069, B:26:0x006d, B:27:0x0082, B:29:0x0088, B:32:0x008e, B:35:0x0076, B:37:0x007a, B:38:0x00ae, B:39:0x00b3), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i, cg6 cg6Var) {
        ar7 ar7Var;
        int i2;
        int i3;
        int i4;
        oqi oqiVar;
        xvu d;
        cu7 cu7Var;
        try {
            if (cg6Var instanceof ar7) {
                ar7Var = (ar7) cg6Var;
                int i5 = ar7Var.o;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    ar7Var.o = i5 - Integer.MIN_VALUE;
                    Object obj = ar7Var.m;
                    nm6 nm6Var = nm6.a;
                    i2 = ar7Var.o;
                    Continuation continuation = null;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        qqi qqiVar = this.p;
                        ar7Var.l = qqiVar;
                        ar7Var.j = i;
                        i3 = 0;
                        ar7Var.k = 0;
                        ar7Var.o = 1;
                        if (qqiVar.a(ar7Var) != nm6Var) {
                            i4 = i;
                            oqiVar = qqiVar;
                        }
                        return nm6Var;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = ar7Var.l;
                        qgg.h0(obj);
                        oqiVar.b(null);
                        return obj;
                    }
                    int i6 = ar7Var.k;
                    int i7 = ar7Var.j;
                    oqi oqiVar2 = ar7Var.l;
                    qgg.h0(obj);
                    i4 = i7;
                    i3 = i6;
                    oqiVar = oqiVar2;
                    d = d();
                    if (d != null) {
                        Boolean bool = Boolean.FALSE;
                        oqiVar.b(null);
                        return bool;
                    }
                    if (d instanceof fwu) {
                        cu7Var = ((fwu) d).a.a.a;
                    } else {
                        if (!(d instanceof bwu)) {
                            throw new x7j();
                        }
                        cu7Var = ((bwu) d).a.a.a;
                    }
                    if (!cu7Var.g(i4)) {
                        Boolean bool2 = Boolean.FALSE;
                        oqiVar.b(null);
                        return bool2;
                    }
                    au7 au7Var = this.f;
                    ar7Var.l = oqiVar;
                    ar7Var.j = i4;
                    ar7Var.k = i3;
                    ar7Var.o = 2;
                    obj = x97.V((a) au7Var.h, new vt7(au7Var, continuation, au7Var, i4, 0), ar7Var);
                }
            }
            if (i2 != 0) {
            }
            d = d();
            if (d != null) {
            }
        } catch (Throwable th) {
            i.b(null);
            throw th;
        }
        ar7Var = new ar7(this, cg6Var);
        Object obj2 = ar7Var.m;
        nm6 nm6Var2 = nm6.a;
        i2 = ar7Var.o;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r13 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v2, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i, cg6 cg6Var) {
        br7 br7Var;
        int i2;
        int i3;
        int i4;
        qqi qqiVar;
        try {
            if (cg6Var instanceof br7) {
                br7Var = (br7) cg6Var;
                int i5 = br7Var.o;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    br7Var.o = i5 - Integer.MIN_VALUE;
                    Object obj = br7Var.m;
                    nm6 nm6Var = nm6.a;
                    i2 = br7Var.o;
                    Continuation continuation = null;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.p;
                        br7Var.l = qqiVar2;
                        br7Var.j = i;
                        i3 = 0;
                        br7Var.k = 0;
                        br7Var.o = 1;
                        if (qqiVar2.a(br7Var) != nm6Var) {
                            i4 = i;
                            qqiVar = qqiVar2;
                        }
                        return nm6Var;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqi oqiVar = br7Var.l;
                        qgg.h0(obj);
                        i = oqiVar;
                        i.b(null);
                        return obj;
                    }
                    int i6 = br7Var.k;
                    int i7 = br7Var.j;
                    ?? r4 = br7Var.l;
                    qgg.h0(obj);
                    i4 = i7;
                    i3 = i6;
                    qqiVar = r4;
                    au7 au7Var = this.f;
                    br7Var.l = qqiVar;
                    br7Var.j = i4;
                    br7Var.k = i3;
                    br7Var.o = 2;
                    obj = x97.V((a) au7Var.h, new vt7(au7Var, continuation, au7Var, i4, 1), br7Var);
                    i = qqiVar;
                }
            }
            if (i2 != 0) {
            }
            au7 au7Var2 = this.f;
            br7Var.l = qqiVar;
            br7Var.j = i4;
            br7Var.k = i3;
            br7Var.o = 2;
            obj = x97.V((a) au7Var2.h, new vt7(au7Var2, continuation, au7Var2, i4, 1), br7Var);
            i = qqiVar;
        } catch (Throwable th) {
            i.b(null);
            throw th;
        }
        br7Var = new br7(this, cg6Var);
        Object obj2 = br7Var.m;
        nm6 nm6Var2 = nm6.a;
        i2 = br7Var.o;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0059, code lost:
    
        if (r14.a(r0) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:25:0x005c, B:27:0x0062, B:30:0x006e, B:32:0x0072, B:34:0x0096, B:38:0x0080, B:40:0x0084, B:41:0x0091), top: B:24:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #0 {all -> 0x0068, blocks: (B:25:0x005c, B:27:0x0062, B:30:0x006e, B:32:0x0072, B:34:0x0096, B:38:0x0080, B:40:0x0084, B:41:0x0091), top: B:24:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v15, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, cg6 cg6Var) {
        cr7 cr7Var;
        int i2;
        qqi qqiVar;
        int i3;
        Throwable th;
        oqi oqiVar;
        xvu d;
        int i4;
        try {
            if (cg6Var instanceof cr7) {
                cr7Var = (cr7) cg6Var;
                int i5 = cr7Var.o;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    cr7Var.o = i5 - Integer.MIN_VALUE;
                    Object obj = cr7Var.m;
                    nm6 nm6Var = nm6.a;
                    i2 = cr7Var.o;
                    Continuation continuation = null;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        cr7Var.l = qqiVar;
                        cr7Var.j = i;
                        i3 = 0;
                        cr7Var.k = 0;
                        cr7Var.o = 1;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = cr7Var.l;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i6 = cr7Var.k;
                        int i7 = cr7Var.j;
                        ?? r4 = cr7Var.l;
                        qgg.h0(obj);
                        i3 = i6;
                        i = i7;
                        qqiVar = r4;
                    }
                    d = d();
                    if (d != null) {
                        pvu pvuVar = pvu.a;
                        qqiVar.b(null);
                        return pvuVar;
                    }
                    if (d instanceof bwu) {
                        i4 = ((bwu) d).a.a.a.b(i);
                    } else if (d instanceof fwu) {
                        i4 = ((fwu) d).a.a.a.b(i);
                    } else {
                        b6e.s();
                        i4 = 0;
                    }
                    int i8 = i4;
                    au7 au7Var = this.f;
                    cr7Var.l = qqiVar;
                    cr7Var.j = i;
                    cr7Var.k = i3;
                    cr7Var.o = 2;
                    Object V = x97.V((a) au7Var.h, new vt7(au7Var, continuation, au7Var, i8, 1), cr7Var);
                    if (V != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = V;
                        oqiVar = qqiVar2;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            d = d();
            if (d != null) {
            }
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        cr7Var = new cr7(this, cg6Var);
        Object obj2 = cr7Var.m;
        nm6 nm6Var2 = nm6.a;
        i2 = cr7Var.o;
        Continuation continuation2 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r9v2, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(List list, fyu fyuVar, List list2, int i, int i2, cg6 cg6Var) {
        dr7 dr7Var;
        Object obj;
        nm6 nm6Var;
        int i3;
        qqi qqiVar;
        int i4;
        int i5;
        int i6;
        List list3;
        List list4;
        fyu fyuVar2;
        oqi oqiVar;
        try {
            if (cg6Var instanceof dr7) {
                dr7Var = (dr7) cg6Var;
                int i7 = dr7Var.s;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    dr7Var.s = i7 - Integer.MIN_VALUE;
                    obj = dr7Var.q;
                    nm6Var = nm6.a;
                    i3 = dr7Var.s;
                    if (i3 != 0) {
                        qgg.h0(obj);
                        dr7Var.j = list;
                        dr7Var.k = fyuVar;
                        dr7Var.l = list2;
                        qqiVar = this.p;
                        dr7Var.m = qqiVar;
                        i4 = i;
                        dr7Var.n = i4;
                        i5 = i2;
                        dr7Var.o = i5;
                        i6 = 0;
                        dr7Var.p = 0;
                        dr7Var.s = 1;
                        if (qqiVar.a(dr7Var) != nm6Var) {
                            list3 = list;
                            list4 = list2;
                            fyuVar2 = fyuVar;
                        }
                        return nm6Var;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = dr7Var.m;
                        List list5 = dr7Var.l;
                        List list6 = dr7Var.j;
                        try {
                            qgg.h0(obj);
                            oqiVar.b(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    int i8 = dr7Var.p;
                    int i9 = dr7Var.o;
                    i4 = dr7Var.n;
                    ?? r9 = dr7Var.m;
                    List list7 = dr7Var.l;
                    fyu fyuVar3 = dr7Var.k;
                    List list8 = dr7Var.j;
                    qgg.h0(obj);
                    list4 = list7;
                    fyuVar2 = fyuVar3;
                    list3 = list8;
                    i6 = i8;
                    qqiVar = r9;
                    i5 = i9;
                    au7 au7Var = this.f;
                    dr7Var.j = null;
                    dr7Var.k = null;
                    dr7Var.l = null;
                    dr7Var.m = qqiVar;
                    dr7Var.n = i4;
                    dr7Var.o = i5;
                    dr7Var.p = i6;
                    dr7Var.s = 2;
                    obj = x97.V((a) au7Var.h, new wt7(au7Var, null, au7Var, fyuVar2, list3, list4, i4, i5), dr7Var);
                    if (obj != nm6Var) {
                        oqiVar = qqiVar;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            dr7Var.j = null;
            dr7Var.k = null;
            dr7Var.l = null;
            dr7Var.m = qqiVar;
            dr7Var.n = i4;
            dr7Var.o = i5;
            dr7Var.p = i6;
            dr7Var.s = 2;
            obj = x97.V((a) au7Var2.h, new wt7(au7Var2, null, au7Var2, fyuVar2, list3, list4, i4, i5), dr7Var);
            if (obj != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        dr7Var = new dr7(this, cg6Var);
        obj = dr7Var.q;
        nm6Var = nm6.a;
        i3 = dr7Var.s;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(nyn nynVar, cg6 cg6Var) {
        er7 er7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object V;
        try {
            if (cg6Var instanceof er7) {
                er7Var = (er7) cg6Var;
                int i3 = er7Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    er7Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = er7Var.m;
                    nm6Var = nm6.a;
                    i = er7Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        er7Var.j = nynVar;
                        qqiVar = this.p;
                        er7Var.k = qqiVar;
                        i2 = 0;
                        er7Var.l = 0;
                        er7Var.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = er7Var.k;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = er7Var.l;
                        ?? r2 = er7Var.k;
                        nyn nynVar2 = er7Var.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        nynVar = nynVar2;
                    }
                    au7 au7Var = this.f;
                    er7Var.j = null;
                    er7Var.k = qqiVar;
                    er7Var.l = i2;
                    er7Var.o = 2;
                    V = x97.V((a) au7Var.h, new d57(au7Var, (Continuation) null, au7Var, nynVar), er7Var);
                    if (V != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = V;
                        oqiVar = qqiVar2;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            er7Var.j = null;
            er7Var.k = qqiVar;
            er7Var.l = i2;
            er7Var.o = 2;
            V = x97.V((a) au7Var2.h, new d57(au7Var2, (Continuation) null, au7Var2, nynVar), er7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        er7Var = new er7(this, cg6Var);
        Object obj2 = er7Var.m;
        nm6Var = nm6.a;
        i = er7Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(boolean z, cg6 cg6Var) {
        fr7 fr7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object V;
        try {
            if (cg6Var instanceof fr7) {
                fr7Var = (fr7) cg6Var;
                int i3 = fr7Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fr7Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = fr7Var.m;
                    nm6Var = nm6.a;
                    i = fr7Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        fr7Var.k = qqiVar;
                        fr7Var.j = z;
                        i2 = 0;
                        fr7Var.l = 0;
                        fr7Var.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = fr7Var.k;
                            try {
                                qgg.h0(obj);
                                oqiVar.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = fr7Var.l;
                        boolean z2 = fr7Var.j;
                        ?? r4 = fr7Var.k;
                        qgg.h0(obj);
                        i2 = i4;
                        z = z2;
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    fr7Var.k = qqiVar;
                    fr7Var.j = z;
                    fr7Var.l = i2;
                    fr7Var.o = 2;
                    V = x97.V((a) au7Var.h, new xt7(au7Var, null, au7Var, z), fr7Var);
                    if (V != nm6Var) {
                        qqi qqiVar2 = qqiVar;
                        obj = V;
                        oqiVar = qqiVar2;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            fr7Var.k = qqiVar;
            fr7Var.j = z;
            fr7Var.l = i2;
            fr7Var.o = 2;
            V = x97.V((a) au7Var2.h, new xt7(au7Var2, null, au7Var2, z), fr7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar3 = qqiVar;
            th = th3;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        fr7Var = new fr7(this, cg6Var);
        Object obj2 = fr7Var.m;
        nm6Var = nm6.a;
        i = fr7Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r8v1, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(boolean z, gxj gxjVar, List list, cg6 cg6Var) {
        gr7 gr7Var;
        Object obj;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        List list2;
        gxj gxjVar2;
        boolean z2;
        oqi oqiVar;
        try {
            if (cg6Var instanceof gr7) {
                gr7Var = (gr7) cg6Var;
                int i3 = gr7Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gr7Var.q = i3 - Integer.MIN_VALUE;
                    obj = gr7Var.o;
                    nm6Var = nm6.a;
                    i = gr7Var.q;
                    if (i != 0) {
                        qgg.h0(obj);
                        gr7Var.k = gxjVar;
                        gr7Var.l = list;
                        qqiVar = this.p;
                        gr7Var.m = qqiVar;
                        gr7Var.j = z;
                        i2 = 0;
                        gr7Var.n = 0;
                        gr7Var.q = 1;
                        if (qqiVar.a(gr7Var) != nm6Var) {
                            list2 = list;
                            gxjVar2 = gxjVar;
                            z2 = z;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = gr7Var.m;
                        List list3 = gr7Var.l;
                        try {
                            qgg.h0(obj);
                            oqiVar.b(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    int i4 = gr7Var.n;
                    boolean z3 = gr7Var.j;
                    ?? r8 = gr7Var.m;
                    List list4 = gr7Var.l;
                    gxj gxjVar3 = gr7Var.k;
                    qgg.h0(obj);
                    z2 = z3;
                    list2 = list4;
                    gxjVar2 = gxjVar3;
                    i2 = i4;
                    qqiVar = r8;
                    au7 au7Var = this.f;
                    gr7Var.k = null;
                    gr7Var.l = null;
                    gr7Var.m = qqiVar;
                    gr7Var.j = z2;
                    gr7Var.n = i2;
                    gr7Var.q = 2;
                    obj = x97.V((a) au7Var.h, new yt7(au7Var, null, au7Var, z2, gxjVar2, list2), gr7Var);
                    if (obj != nm6Var) {
                        oqiVar = qqiVar;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            gr7Var.k = null;
            gr7Var.l = null;
            gr7Var.m = qqiVar;
            gr7Var.j = z2;
            gr7Var.n = i2;
            gr7Var.q = 2;
            obj = x97.V((a) au7Var2.h, new yt7(au7Var2, null, au7Var2, z2, gxjVar2, list2), gr7Var);
            if (obj != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        gr7Var = new gr7(this, cg6Var);
        obj = gr7Var.o;
        nm6Var = nm6.a;
        i = gr7Var.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(cg6 cg6Var) {
        ir7 ir7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object V;
        try {
            if (cg6Var instanceof ir7) {
                ir7Var = (ir7) cg6Var;
                int i3 = ir7Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ir7Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = ir7Var.l;
                    nm6Var = nm6.a;
                    i = ir7Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        ir7Var.j = qqiVar;
                        i2 = 0;
                        ir7Var.k = 0;
                        ir7Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = ir7Var.j;
                            try {
                                qgg.h0(obj);
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                oqiVar.b(null);
                                return bool;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = ir7Var.k;
                        ?? r4 = ir7Var.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    lln llnVar = lln.c;
                    ir7Var.j = qqiVar;
                    ir7Var.k = i2;
                    ir7Var.n = 2;
                    V = x97.V((a) au7Var.h, new r72(au7Var, (Continuation) null, au7Var, llnVar), ir7Var);
                    if (V != nm6Var) {
                        oqiVar = qqiVar;
                        obj = V;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        oqiVar.b(null);
                        return bool2;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            lln llnVar2 = lln.c;
            ir7Var.j = qqiVar;
            ir7Var.k = i2;
            ir7Var.n = 2;
            V = x97.V((a) au7Var2.h, new r72(au7Var2, (Continuation) null, au7Var2, llnVar2), ir7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        ir7Var = new ir7(this, cg6Var);
        Object obj2 = ir7Var.l;
        nm6Var = nm6.a;
        i = ir7Var.n;
        if (i != 0) {
        }
    }

    @Override // defpackage.g4q
    public final void start() {
        e5q b5qVar;
        mzu mzuVar = this.g;
        oyu oyuVar = mzuVar.c;
        xsu xsuVar = mzuVar.a;
        if (oyuVar instanceof kyu) {
            kyu kyuVar = (kyu) oyuVar;
            xsuVar.getClass();
            b5qVar = new u4q(kyuVar.a, kyuVar.b, kyuVar.c, bfg.o(xsuVar), kyuVar.d, null);
        } else {
            if (!(oyuVar instanceof nyu)) {
                b6e.s();
                return;
            }
            nyu nyuVar = (nyu) oyuVar;
            xsuVar.getClass();
            if (nyuVar instanceof hyu) {
                hyu hyuVar = (hyu) nyuVar;
                b5qVar = new w4q(hyuVar.a, hyuVar.b, hyuVar.c, bfg.o(xsuVar), hyuVar.d, hyuVar.e);
            } else if (nyuVar instanceof iyu) {
                b5qVar = bfg.N(xsuVar, (iyu) nyuVar);
            } else {
                if (!(nyuVar instanceof jyu)) {
                    b6e.s();
                    return;
                }
                b5qVar = new b5q(new ynu(bfg.m(xsuVar)), ((jyu) nyuVar).a);
            }
        }
        xsuVar.getClass();
        if (!xsuVar.equals(rsu.a) && !(xsuVar instanceof qsu)) {
            if (!(xsuVar instanceof wsu)) {
                b6e.s();
                return;
            } else {
                wsu wsuVar = (wsu) xsuVar;
                xsuVar = wsu.a(wsuVar, bfg.B(wsuVar.a, b5qVar), bfg.B(wsuVar.b, b5qVar), null, 28);
            }
        }
        vvu vvuVar = new vvu(xsuVar, qgg.V(mzuVar.c), mzuVar.b, b5qVar);
        au7 au7Var = this.f;
        x97.y((tf6) au7Var.l, null, null, new zt7(au7Var, vvuVar, null), 3);
        ox6.B(this.j.e, this.n, new hr7(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(cg6 cg6Var) {
        jr7 jr7Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object V;
        try {
            if (cg6Var instanceof jr7) {
                jr7Var = (jr7) cg6Var;
                int i3 = jr7Var.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    jr7Var.n = i3 - Integer.MIN_VALUE;
                    Object obj = jr7Var.l;
                    nm6Var = nm6.a;
                    i = jr7Var.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        jr7Var.j = qqiVar;
                        i2 = 0;
                        jr7Var.k = 0;
                        jr7Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = jr7Var.j;
                            try {
                                qgg.h0(obj);
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                oqiVar.b(null);
                                return bool;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = jr7Var.k;
                        ?? r4 = jr7Var.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    au7 au7Var = this.f;
                    lln llnVar = lln.b;
                    jr7Var.j = qqiVar;
                    jr7Var.k = i2;
                    jr7Var.n = 2;
                    V = x97.V((a) au7Var.h, new r72(au7Var, (Continuation) null, au7Var, llnVar), jr7Var);
                    if (V != nm6Var) {
                        oqiVar = qqiVar;
                        obj = V;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        oqiVar.b(null);
                        return bool2;
                    }
                    return nm6Var;
                }
            }
            au7 au7Var2 = this.f;
            lln llnVar2 = lln.b;
            jr7Var.j = qqiVar;
            jr7Var.k = i2;
            jr7Var.n = 2;
            V = x97.V((a) au7Var2.h, new r72(au7Var2, (Continuation) null, au7Var2, llnVar2), jr7Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        jr7Var = new jr7(this, cg6Var);
        Object obj2 = jr7Var.l;
        nm6Var = nm6.a;
        i = jr7Var.n;
        if (i != 0) {
        }
    }
}
