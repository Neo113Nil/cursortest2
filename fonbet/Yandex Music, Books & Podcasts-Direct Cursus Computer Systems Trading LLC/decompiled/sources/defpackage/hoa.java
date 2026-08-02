package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class hoa extends cw7 implements ofm {
    public bxj q;
    public uif r;
    public boolean s;
    public uoi t;
    public zi3 u;
    public joa v;
    public boolean w;
    public iur x;

    /* JADX WARN: Multi-variable type inference failed */
    public hoa(Function1 function1, boolean z, uoi uoiVar, bxj bxjVar) {
        this.q = bxjVar;
        this.r = (uif) function1;
        this.s = z;
        this.t = uoiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V0(hoa hoaVar, cg6 cg6Var) {
        aoa aoaVar;
        int i;
        if (cg6Var instanceof aoa) {
            aoaVar = (aoa) cg6Var;
            int i2 = aoaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aoaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aoaVar.k;
                nm6 nm6Var = nm6.a;
                i = aoaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    joa joaVar = hoaVar.v;
                    if (joaVar != null) {
                        uoi uoiVar = hoaVar.t;
                        if (uoiVar != null) {
                            ioa ioaVar = new ioa(joaVar);
                            aoaVar.j = hoaVar;
                            aoaVar.m = 1;
                            if (uoiVar.a(ioaVar, aoaVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    hoaVar.b1(0L);
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hoaVar = aoaVar.j;
                qgg.h0(obj);
                hoaVar.v = null;
                hoaVar.b1(0L);
                return Unit.a;
            }
        }
        aoaVar = new aoa(hoaVar, cg6Var);
        Object obj2 = aoaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aoaVar.m;
        if (i != 0) {
        }
        hoaVar.v = null;
        hoaVar.b1(0L);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r2.a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W0(hoa hoaVar, yma ymaVar, cg6 cg6Var) {
        coa coaVar;
        int i;
        joa joaVar;
        uoi uoiVar;
        hoa hoaVar2;
        joa joaVar2;
        if (cg6Var instanceof coa) {
            coaVar = (coa) cg6Var;
            int i2 = coaVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coaVar.o = i2 - Integer.MIN_VALUE;
                Object obj = coaVar.m;
                nm6 nm6Var = nm6.a;
                i = coaVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    joa joaVar3 = hoaVar.v;
                    if (joaVar3 != null && (r2 = hoaVar.t) != null) {
                        ioa ioaVar = new ioa(joaVar3);
                        coaVar.j = hoaVar;
                        coaVar.k = ymaVar;
                        coaVar.o = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        joaVar2 = coaVar.l;
                        ymaVar = coaVar.k;
                        hoaVar2 = coaVar.j;
                        qgg.h0(obj);
                        joaVar = joaVar2;
                        hoaVar = hoaVar2;
                        hoaVar.v = joaVar;
                        hoaVar.a1(ymaVar.a);
                        return Unit.a;
                    }
                    ymaVar = coaVar.k;
                    hoaVar = coaVar.j;
                    qgg.h0(obj);
                }
                joaVar = new joa();
                uoiVar = hoaVar.t;
                if (uoiVar != null) {
                    coaVar.j = hoaVar;
                    coaVar.k = ymaVar;
                    coaVar.l = joaVar;
                    coaVar.o = 2;
                    if (uoiVar.a(joaVar, coaVar) != nm6Var) {
                        hoaVar2 = hoaVar;
                        joaVar2 = joaVar;
                        joaVar = joaVar2;
                        hoaVar = hoaVar2;
                    }
                    return nm6Var;
                }
                hoaVar.v = joaVar;
                hoaVar.a1(ymaVar.a);
                return Unit.a;
            }
        }
        coaVar = new coa(hoaVar, cg6Var);
        Object obj2 = coaVar.m;
        nm6 nm6Var2 = nm6.a;
        i = coaVar.o;
        if (i != 0) {
        }
        joaVar = new joa();
        uoiVar = hoaVar.t;
        if (uoiVar != null) {
        }
        hoaVar.v = joaVar;
        hoaVar.a1(ymaVar.a);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X0(hoa hoaVar, ana anaVar, cg6 cg6Var) {
        eoa eoaVar;
        int i;
        if (cg6Var instanceof eoa) {
            eoaVar = (eoa) cg6Var;
            int i2 = eoaVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eoaVar.n = i2 - Integer.MIN_VALUE;
                Object obj = eoaVar.l;
                nm6 nm6Var = nm6.a;
                i = eoaVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    joa joaVar = hoaVar.v;
                    if (joaVar != null) {
                        uoi uoiVar = hoaVar.t;
                        if (uoiVar != null) {
                            koa koaVar = new koa(joaVar);
                            eoaVar.j = hoaVar;
                            eoaVar.k = anaVar;
                            eoaVar.n = 1;
                            if (uoiVar.a(koaVar, eoaVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    hoaVar.b1(anaVar.a);
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                anaVar = eoaVar.k;
                hoaVar = eoaVar.j;
                qgg.h0(obj);
                hoaVar.v = null;
                hoaVar.b1(anaVar.a);
                return Unit.a;
            }
        }
        eoaVar = new eoa(hoaVar, cg6Var);
        Object obj2 = eoaVar.l;
        nm6 nm6Var2 = nm6.a;
        i = eoaVar.n;
        if (i != 0) {
        }
        hoaVar.v = null;
        hoaVar.b1(anaVar.a);
        return Unit.a;
    }

    @Override // defpackage.xci
    public final void L0() {
        this.w = false;
        Y0();
    }

    public final void Y0() {
        joa joaVar = this.v;
        if (joaVar != null) {
            uoi uoiVar = this.t;
            if (uoiVar != null) {
                uoiVar.b(new ioa(joaVar));
            }
            this.v = null;
        }
    }

    @Override // defpackage.ofm
    public final void Z() {
        iur iurVar = this.x;
        if (iurVar != null) {
            iurVar.Z();
        }
    }

    public abstract Object Z0(Function2 function2, Continuation continuation);

    public abstract void a1(long j);

    public abstract void b1(long j);

    public abstract boolean c1();

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1(Function1 function1, boolean z, uoi uoiVar, bxj bxjVar, boolean z2) {
        iur iurVar;
        this.r = (uif) function1;
        boolean z3 = true;
        if (this.s != z) {
            this.s = z;
            if (!z) {
                Y0();
                iur iurVar2 = this.x;
                if (iurVar2 != null) {
                    T0(iurVar2);
                }
                this.x = null;
            }
            z2 = true;
        }
        if (!Intrinsics.d(this.t, uoiVar)) {
            Y0();
            this.t = uoiVar;
        }
        if (this.q != bxjVar) {
            this.q = bxjVar;
        } else {
            z3 = z2;
        }
        if (!z3 || (iurVar = this.x) == null) {
            return;
        }
        iurVar.U0();
    }

    @Override // defpackage.ofm
    public void o(ffm ffmVar, gfm gfmVar, long j) {
        if (this.s && this.x == null) {
            r5 r5Var = new r5(2, this);
            ffm ffmVar2 = eur.a;
            iur iurVar = new iur(null, null, null, r5Var);
            S0(iurVar);
            this.x = iurVar;
        }
        iur iurVar2 = this.x;
        if (iurVar2 != null) {
            iurVar2.o(ffmVar, gfmVar, j);
        }
    }
}
