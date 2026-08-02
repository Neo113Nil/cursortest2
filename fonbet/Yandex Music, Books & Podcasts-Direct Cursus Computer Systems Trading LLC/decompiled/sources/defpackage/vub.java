package defpackage;

/* loaded from: classes3.dex */
public final class vub {
    public final snq a;
    public snq b;
    public final qqi c;
    public final jyr d;

    public vub(snq snqVar, upq upqVar, gnq gnqVar, String str) {
        snqVar.getClass();
        gnqVar.getClass();
        this.a = snqVar;
        this.c = rqi.a();
        this.d = btf.b(new vd(22, str, upqVar, gnqVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0050, code lost:
    
        if (r8.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0073, B:15:0x0079, B:16:0x0086, B:20:0x0080, B:22:0x0084, B:23:0x008c, B:24:0x0091), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0073, B:15:0x0079, B:16:0x0086, B:20:0x0080, B:22:0x0084, B:23:0x008c, B:24:0x0091), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:32:0x0053, B:36:0x005b), top: B:31:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v6, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        tub tubVar;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        snq snqVar;
        cqq cqqVar;
        snq snqVar2;
        try {
            if (cg6Var instanceof tub) {
                tubVar = (tub) cg6Var;
                int i3 = tubVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tubVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = tubVar.l;
                    nm6 nm6Var = nm6.a;
                    i = tubVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.c;
                        tubVar.j = qqiVar;
                        i2 = 0;
                        tubVar.k = 0;
                        tubVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = tubVar.j;
                            try {
                                qgg.h0(obj);
                                cqqVar = (cqq) obj;
                                if (!(cqqVar instanceof bqq)) {
                                    snqVar2 = (snq) ((bqq) cqqVar).a;
                                } else {
                                    if (!(cqqVar instanceof aqq)) {
                                        throw new x7j();
                                    }
                                    snqVar2 = this.a;
                                }
                                this.b = snqVar2;
                                oqiVar.b(null);
                                return snqVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = tubVar.k;
                        ?? r4 = tubVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    snqVar = this.b;
                    if (snqVar == null) {
                        qqiVar.b(null);
                        return snqVar;
                    }
                    cjf cjfVar = (cjf) this.d.getValue();
                    tubVar.j = qqiVar;
                    tubVar.k = i2;
                    tubVar.n = 2;
                    Object a = cjfVar.a(tubVar);
                    if (a != nm6Var) {
                        oqiVar = qqiVar;
                        obj = a;
                        cqqVar = (cqq) obj;
                        if (!(cqqVar instanceof bqq)) {
                        }
                        this.b = snqVar2;
                        oqiVar.b(null);
                        return snqVar2;
                    }
                    return nm6Var;
                }
            }
            snqVar = this.b;
            if (snqVar == null) {
            }
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        tubVar = new tub(this, cg6Var);
        Object obj2 = tubVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tubVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        uub uubVar;
        Object obj;
        int i;
        Object c;
        snq snqVar;
        cqq cqqVar;
        if (cg6Var instanceof uub) {
            uubVar = (uub) cg6Var;
            int i2 = uubVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uubVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = uubVar.k;
                obj = nm6.a;
                i = uubVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    uubVar.m = 1;
                    obj2 = a(uubVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        snqVar = uubVar.j;
                        qgg.h0(obj2);
                        cqqVar = (cqq) obj2;
                        if (!(cqqVar instanceof bqq)) {
                            return (snq) ((bqq) cqqVar).a;
                        }
                        if (cqqVar instanceof aqq) {
                            return snqVar;
                        }
                        b6e.s();
                        return null;
                    }
                    qgg.h0(obj2);
                }
                snq snqVar2 = (snq) obj2;
                cjf cjfVar = (cjf) this.d.getValue();
                uubVar.j = snqVar2;
                uubVar.m = 2;
                cjfVar.getClass();
                c = cjf.c(cjfVar, false, uubVar);
                if (c != obj) {
                    snqVar = snqVar2;
                    obj2 = c;
                    cqqVar = (cqq) obj2;
                    if (!(cqqVar instanceof bqq)) {
                    }
                }
                return obj;
            }
        }
        uubVar = new uub(this, cg6Var);
        Object obj22 = uubVar.k;
        obj = nm6.a;
        i = uubVar.m;
        if (i != 0) {
        }
        snq snqVar22 = (snq) obj22;
        cjf cjfVar2 = (cjf) this.d.getValue();
        uubVar.j = snqVar22;
        uubVar.m = 2;
        cjfVar2.getClass();
        c = cjf.c(cjfVar2, false, uubVar);
        if (c != obj) {
        }
        return obj;
    }
}
