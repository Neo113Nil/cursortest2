package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xmf {
    public final ofo a;
    public final mm6 b;
    public final qqi c;
    public final xdr d;
    public final xdr e;
    public rar f;
    public rar g;

    public xmf(ofo ofoVar, mm6 mm6Var) {
        ofoVar.getClass();
        this.a = ofoVar;
        this.b = mm6Var;
        this.c = rqi.a();
        xdr a = ydr.a(null);
        this.d = a;
        this.e = a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (c(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (b(false, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xxq xxqVar, Continuation continuation) {
        tmf tmfVar;
        int i;
        if (continuation instanceof tmf) {
            tmfVar = (tmf) continuation;
            int i2 = tmfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tmfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = tmfVar.k;
                Object obj2 = nm6.a;
                i = tmfVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tmfVar.j = xxqVar;
                    tmfVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xxqVar = tmfVar.j;
                    qgg.h0(obj);
                }
                if (xxqVar.a()) {
                    return Unit.a;
                }
                tmfVar.j = null;
                tmfVar.m = 2;
            }
        }
        tmfVar = new tmf(this, continuation);
        Object obj3 = tmfVar.k;
        Object obj22 = nm6.a;
        i = tmfVar.m;
        if (i != 0) {
        }
        if (xxqVar.a()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (defpackage.saf.C(r4, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        if (r8.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0073, B:15:0x007c), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #0 {all -> 0x006f, blocks: (B:27:0x005c, B:29:0x0060), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, cg6 cg6Var) {
        umf umfVar;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        rar rarVar;
        try {
            if (cg6Var instanceof umf) {
                umfVar = (umf) cg6Var;
                int i3 = umfVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    umfVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = umfVar.m;
                    nm6 nm6Var = nm6.a;
                    i = umfVar.o;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.c;
                        umfVar.k = qqiVar;
                        umfVar.j = z;
                        i2 = 0;
                        umfVar.l = 0;
                        umfVar.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = umfVar.j;
                            oqiVar = umfVar.k;
                            try {
                                qgg.h0(obj);
                                this.f = null;
                                this.d.l(null);
                                if (z) {
                                    rar y = x97.y(this.b, null, null, new vmf(this, continuation, 0), 3);
                                    y.R(new smf(this, 0));
                                    this.g = y;
                                }
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = umfVar.l;
                        boolean z2 = umfVar.j;
                        ?? r4 = umfVar.k;
                        qgg.h0(obj);
                        i2 = i4;
                        z = z2;
                        qqiVar = r4;
                    }
                    rarVar = this.f;
                    if (rarVar != null) {
                        umfVar.k = qqiVar;
                        umfVar.j = z;
                        umfVar.l = i2;
                        umfVar.o = 2;
                    }
                    oqiVar = qqiVar;
                    this.f = null;
                    this.d.l(null);
                    if (z) {
                    }
                    oqiVar.b(null);
                    return Unit.a;
                }
            }
            rarVar = this.f;
            if (rarVar != null) {
            }
            oqiVar = qqiVar;
            this.f = null;
            this.d.l(null);
            if (z) {
            }
            oqiVar.b(null);
            return Unit.a;
        } catch (Throwable th2) {
            th = th2;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        umfVar = new umf(this, cg6Var);
        Object obj2 = umfVar.m;
        nm6 nm6Var2 = nm6.a;
        i = umfVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r4.j0(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:26:0x0052, B:28:0x0056, B:30:0x005a), top: B:25:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        wmf wmfVar;
        int i;
        qqi qqiVar;
        int i2;
        ?? r0;
        Throwable th;
        try {
            if (cg6Var instanceof wmf) {
                wmfVar = (wmf) cg6Var;
                int i3 = wmfVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    wmfVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = wmfVar.l;
                    nm6 nm6Var = nm6.a;
                    i = wmfVar.n;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.c;
                        wmfVar.j = qqiVar;
                        i2 = 0;
                        wmfVar.k = 0;
                        wmfVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = wmfVar.j;
                            try {
                                qgg.h0(obj);
                                r0 = r0;
                                this.g = null;
                                rar y = x97.y(this.b, null, null, new vmf(this, continuation, 1), 3);
                                y.R(new smf(this, 1));
                                this.f = y;
                                qqiVar = r0;
                                qqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                r0.b(null);
                                throw th;
                            }
                        }
                        i2 = wmfVar.k;
                        ?? r4 = wmfVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    if (this.f == null) {
                        rar rarVar = this.g;
                        if (rarVar != null) {
                            wmfVar.j = qqiVar;
                            wmfVar.k = i2;
                            wmfVar.n = 2;
                        }
                        r0 = qqiVar;
                        this.g = null;
                        rar y2 = x97.y(this.b, null, null, new vmf(this, continuation, 1), 3);
                        y2.R(new smf(this, 1));
                        this.f = y2;
                        qqiVar = r0;
                    }
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            if (this.f == null) {
            }
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th3) {
            r0 = qqiVar;
            th = th3;
            r0.b(null);
            throw th;
        }
        wmfVar = new wmf(this, cg6Var);
        Object obj2 = wmfVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wmfVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}
