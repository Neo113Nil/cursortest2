package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class vt7 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public oqi k;
    public int l;
    public int m;
    public int n;
    public final /* synthetic */ au7 o;
    public final /* synthetic */ au7 p;
    public final /* synthetic */ int q;
    public int r;
    public xvu s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt7(au7 au7Var, Continuation continuation, au7 au7Var2, int i, int i2) {
        super(2, continuation);
        this.j = i2;
        this.o = au7Var;
        this.p = au7Var2;
        this.q = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vt7(this.o, continuation, this.p, this.q, 0);
            default:
                return new vt7(this.o, continuation, this.p, this.q, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((vt7) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(1:(3:(1:(7:8|9|10|11|12|13|14)(2:20|21))(6:22|23|24|25|26|(1:29)(4:28|12|13|14))|18|19)(1:33))(2:65|(1:68)(1:67))|34|35|(1:37)(1:62)|38|(6:41|42|(2:44|(1:46)(4:47|48|49|(2:51|52)(3:53|26|(0)(0))))(2:54|(2:56|(1:58)(4:59|48|49|(0)(0)))(2:60|61))|12|13|14)|40|13|14) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:69|(1:(4:(1:(10:74|75|76|77|78|(1:80)(2:85|(1:87)(2:88|89))|81|82|83|84)(2:95|96))(13:97|98|99|100|101|(2:103|(2:105|106)(8:107|77|78|(0)(0)|81|82|83|84))|108|78|(0)(0)|81|82|83|84)|92|93|94)(1:112))(2:150|(1:153)(1:152))|113|114|(2:144|145)(1:116)|(4:118|119|83|84)(2:120|(7:122|78|(0)(0)|81|82|83|84)(2:123|(12:125|126|(1:128)(3:136|(1:138)(1:141)|(4:140|82|83|84))|129|(2:131|(2:133|134)(3:135|101|(0)))|108|78|(0)(0)|81|82|83|84)(2:142|143)))) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0230, code lost:
    
        r4 = r14;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0098, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0286 A[Catch: all -> 0x022f, TryCatch #6 {all -> 0x022f, blocks: (B:78:0x02a2, B:80:0x02a9, B:81:0x02d6, B:85:0x02be, B:87:0x02c2, B:88:0x02de, B:89:0x02e3, B:101:0x027e, B:103:0x0286, B:114:0x01a4, B:120:0x01d7, B:123:0x01fe, B:125:0x0202, B:128:0x0215, B:129:0x025b, B:131:0x0268, B:136:0x0234, B:140:0x0255, B:141:0x024d, B:142:0x02e4, B:143:0x02e9), top: B:113:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a9 A[Catch: all -> 0x022f, TryCatch #6 {all -> 0x022f, blocks: (B:78:0x02a2, B:80:0x02a9, B:81:0x02d6, B:85:0x02be, B:87:0x02c2, B:88:0x02de, B:89:0x02e3, B:101:0x027e, B:103:0x0286, B:114:0x01a4, B:120:0x01d7, B:123:0x01fe, B:125:0x0202, B:128:0x0215, B:129:0x025b, B:131:0x0268, B:136:0x0234, B:140:0x0255, B:141:0x024d, B:142:0x02e4, B:143:0x02e9), top: B:113:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02be A[Catch: all -> 0x022f, TryCatch #6 {all -> 0x022f, blocks: (B:78:0x02a2, B:80:0x02a9, B:81:0x02d6, B:85:0x02be, B:87:0x02c2, B:88:0x02de, B:89:0x02e3, B:101:0x027e, B:103:0x0286, B:114:0x01a4, B:120:0x01d7, B:123:0x01fe, B:125:0x0202, B:128:0x0215, B:129:0x025b, B:131:0x0268, B:136:0x0234, B:140:0x0255, B:141:0x024d, B:142:0x02e4, B:143:0x02e9), top: B:113:0x01a4 }] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [oqi] */
    /* JADX WARN: Type inference failed for: r5v53, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v17, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v18, types: [oqi] */
    /* JADX WARN: Type inference failed for: r6v27, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        int i;
        qqi qqiVar2;
        Object obj2;
        xvu xvuVar;
        xvu xvuVar2;
        xvu e;
        Boolean bool;
        Object a;
        int i2;
        xvu e2;
        Boolean bool2;
        Object obj3;
        qqi qqiVar3;
        ?? r4;
        qqi qqiVar4;
        int i3;
        ?? r2;
        xvu xvuVar3;
        fwu f;
        fwu fwuVar;
        Object a2;
        int i4;
        int i5;
        Object obj4;
        Object c;
        qqi qqiVar5;
        switch (this.j) {
            case 0:
                au7 au7Var = this.p;
                xdr xdrVar = (xdr) au7Var.o;
                int i6 = this.q;
                nm6 nm6Var = nm6.a;
                int i7 = this.n;
                int i8 = 0;
                if (i7 == 0) {
                    qgg.h0(obj);
                    qqi qqiVar6 = (qqi) this.o.m;
                    this.k = qqiVar6;
                    this.l = 0;
                    this.n = 1;
                    if (qqiVar6.a(this) == nm6Var) {
                        return nm6Var;
                    }
                    qqiVar = qqiVar6;
                    i = 0;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            int i9 = this.r;
                            int i10 = this.m;
                            int i11 = this.l;
                            xvu xvuVar4 = this.s;
                            ?? r6 = this.k;
                            try {
                                qgg.h0(obj);
                                i = i11;
                                e = xvuVar4;
                                qqiVar = r6;
                                i2 = i9;
                                i8 = i10;
                                a = obj;
                                if (((Boolean) a).booleanValue()) {
                                    jac jacVar = (jac) au7Var.b;
                                    this.k = qqiVar;
                                    this.s = e;
                                    this.l = i;
                                    this.m = i8;
                                    this.r = i2;
                                    this.n = 3;
                                    if (jacVar.c(this) == nm6Var) {
                                        return nm6Var;
                                    }
                                    e2 = e;
                                    qqiVar3 = qqiVar;
                                    qqiVar = qqiVar3;
                                    xdrVar.l(e2);
                                    if (e2 instanceof fwu) {
                                    }
                                    bool = Boolean.TRUE;
                                    bool2 = bool;
                                    obj3 = null;
                                    qqiVar.b(obj3);
                                    return bool2;
                                }
                                e2 = e;
                                xdrVar.l(e2);
                                if (e2 instanceof fwu) {
                                }
                                bool = Boolean.TRUE;
                                bool2 = bool;
                                obj3 = null;
                                qqiVar.b(obj3);
                                return bool2;
                            } catch (Throwable th) {
                                th = th;
                                r4 = r6;
                            }
                        } else {
                            if (i7 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            e2 = this.s;
                            r4 = this.k;
                            try {
                                qgg.h0(obj);
                                qqiVar3 = r4;
                                qqiVar = qqiVar3;
                                xdrVar.l(e2);
                                if (e2 instanceof fwu) {
                                    au7.g(au7Var, ((fwu) e2).a.a, ((fwu) e2).b, false, null, null, null, 124);
                                } else {
                                    if (!(e2 instanceof bwu)) {
                                        throw new x7j();
                                    }
                                    au7.g(au7Var, ((bwu) e2).a.a, ((bwu) e2).b, false, null, null, null, 124);
                                }
                                bool = Boolean.TRUE;
                                bool2 = bool;
                                obj3 = null;
                                qqiVar.b(obj3);
                                return bool2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        obj2 = null;
                        qqiVar2 = r4;
                        qqiVar2.b(obj2);
                        throw th;
                    }
                    int i12 = this.l;
                    ?? r62 = this.k;
                    qgg.h0(obj);
                    i = i12;
                    qqiVar = r62;
                }
                ssg.a(3, "DefaultWavePlayback", "removePlayable(queuePosition=" + ran.a(i6) + ")", null);
                Object value = xdrVar.getValue();
                if (value instanceof xvu) {
                    try {
                        xvuVar = (xvu) value;
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = null;
                        qqiVar2 = qqiVar;
                    }
                } else {
                    xvuVar = null;
                }
                if (xvuVar == null) {
                    bool2 = Boolean.FALSE;
                    obj3 = null;
                    qqiVar.b(obj3);
                    return bool2;
                }
                if (xvuVar instanceof bwu) {
                    e2 = au7Var.e(leu.e0(((bwu) xvuVar).a.a, i6), ((bwu) xvuVar).a.b, ((bwu) xvuVar).b, ((bwu) xvuVar).d, null);
                    xdrVar.l(e2);
                    if (e2 instanceof fwu) {
                    }
                    bool = Boolean.TRUE;
                    bool2 = bool;
                    obj3 = null;
                    qqiVar.b(obj3);
                    return bool2;
                }
                if (!(xvuVar instanceof fwu)) {
                    throw new x7j();
                }
                eu7 e0 = leu.e0(((fwu) xvuVar).a.a, i6);
                boolean f2 = e0.f();
                w2l w2lVar = w2l.a;
                if (f2) {
                    xvuVar2 = xvuVar;
                    e = au7Var.f(e0, ((fwu) xvuVar).a.b, ((fwu) xvuVar).b, false, w2lVar);
                } else {
                    xvuVar2 = xvuVar;
                    e = ((tvu) au7Var.f).a ? null : au7Var.e(e0, ((fwu) xvuVar2).a.b, ((fwu) xvuVar2).b, w2lVar, null);
                    if (e == null) {
                        bool = Boolean.FALSE;
                        bool2 = bool;
                        obj3 = null;
                        qqiVar.b(obj3);
                        return bool2;
                    }
                }
                if (((fwu) xvuVar2).a.a.b.a == i6) {
                    v5j v5jVar = v5j.e;
                    this.k = qqiVar;
                    this.s = e;
                    this.l = i;
                    this.m = 0;
                    this.r = 0;
                    this.n = 2;
                    a = au7.a(au7Var, xvuVar2, e, v5jVar, this);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                    i2 = 0;
                    if (((Boolean) a).booleanValue()) {
                    }
                }
                e2 = e;
                xdrVar.l(e2);
                if (e2 instanceof fwu) {
                }
                bool = Boolean.TRUE;
                bool2 = bool;
                obj3 = null;
                qqiVar.b(obj3);
                return bool2;
            default:
                au7 au7Var2 = this.p;
                xdr xdrVar2 = (xdr) au7Var2.o;
                nm6 nm6Var2 = nm6.a;
                int i13 = this.n;
                int i14 = 0;
                int i15 = this.q;
                if (i13 == 0) {
                    qgg.h0(obj);
                    qqi qqiVar7 = (qqi) this.o.m;
                    this.k = qqiVar7;
                    this.l = 0;
                    this.n = 1;
                    if (qqiVar7.a(this) == nm6Var2) {
                        return nm6Var2;
                    }
                    qqiVar4 = qqiVar7;
                    i3 = 0;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            int i16 = this.r;
                            int i17 = this.m;
                            i5 = this.l;
                            fwuVar = (fwu) this.s;
                            ?? r63 = this.k;
                            try {
                                qgg.h0(obj);
                                qqiVar4 = r63;
                                i4 = i16;
                                i14 = i17;
                                a2 = obj;
                                boolean booleanValue = ((Boolean) a2).booleanValue();
                                xdrVar2.l(fwuVar);
                                this.k = qqiVar4;
                                this.s = null;
                                this.l = i5;
                                this.m = i14;
                                this.r = i4;
                                this.n = 3;
                                c = au7.c(au7Var2, booleanValue, fwuVar, i15, this);
                                if (c != nm6Var2) {
                                    return nm6Var2;
                                }
                                qqiVar5 = qqiVar4;
                                obj4 = c;
                                qqiVar4 = qqiVar5;
                                qqiVar4.b(null);
                                return obj4;
                            } catch (Throwable th4) {
                                th = th4;
                                r2 = r63;
                            }
                        } else {
                            if (i13 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r2 = this.k;
                            try {
                                qgg.h0(obj);
                                c = obj;
                                qqiVar5 = r2;
                                obj4 = c;
                                qqiVar4 = qqiVar5;
                                qqiVar4.b(null);
                                return obj4;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        r2.b(null);
                        throw th;
                    }
                    int i18 = this.l;
                    ?? r5 = this.k;
                    qgg.h0(obj);
                    i3 = i18;
                    qqiVar4 = r5;
                }
                ssg.a(3, "DefaultWavePlayback", "setCurrentPosition(position=" + ran.a(i15) + ")", null);
                Object value2 = xdrVar2.getValue();
                xvu xvuVar5 = value2 instanceof xvu ? (xvu) value2 : null;
                pvu pvuVar = pvu.a;
                if (xvuVar5 != null) {
                    boolean z = xvuVar5 instanceof bwu;
                    x2l x2lVar = x2l.a;
                    if (z) {
                        eu7 a3 = ((bwu) xvuVar5).a.a(i15);
                        if (a3 != null) {
                            xvuVar3 = xvuVar5;
                            f = au7Var2.f(a3, ((bwu) xvuVar5).a.b, ((bwu) xvuVar5).b, false, x2lVar);
                            fwuVar = f;
                            v5j v5jVar2 = v5j.d;
                            this.k = qqiVar4;
                            this.s = fwuVar;
                            this.l = i3;
                            this.m = 0;
                            this.r = 0;
                            this.n = 2;
                            a2 = au7.a(au7Var2, xvuVar3, fwuVar, v5jVar2, this);
                            if (a2 != nm6Var2) {
                                return nm6Var2;
                            }
                            i4 = 0;
                            i5 = i3;
                            boolean booleanValue2 = ((Boolean) a2).booleanValue();
                            xdrVar2.l(fwuVar);
                            this.k = qqiVar4;
                            this.s = null;
                            this.l = i5;
                            this.m = i14;
                            this.r = i4;
                            this.n = 3;
                            c = au7.c(au7Var2, booleanValue2, fwuVar, i15, this);
                            if (c != nm6Var2) {
                            }
                        }
                    } else {
                        xvuVar3 = xvuVar5;
                        if (!(xvuVar3 instanceof fwu)) {
                            throw new x7j();
                        }
                        eu7 a4 = ((fwu) xvuVar3).a.a(i15);
                        if (a4 != null) {
                            f = au7Var2.f(a4, ((fwu) xvuVar3).a.b, ((fwu) xvuVar3).b, false, x2lVar);
                            fwuVar = f;
                            v5j v5jVar22 = v5j.d;
                            this.k = qqiVar4;
                            this.s = fwuVar;
                            this.l = i3;
                            this.m = 0;
                            this.r = 0;
                            this.n = 2;
                            a2 = au7.a(au7Var2, xvuVar3, fwuVar, v5jVar22, this);
                            if (a2 != nm6Var2) {
                            }
                        }
                    }
                    obj4 = c;
                    qqiVar4 = qqiVar5;
                    qqiVar4.b(null);
                    return obj4;
                }
                obj4 = pvuVar;
                qqiVar4.b(null);
                return obj4;
        }
    }
}
