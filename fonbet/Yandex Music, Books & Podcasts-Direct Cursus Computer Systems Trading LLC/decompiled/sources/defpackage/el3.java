package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class el3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fk0 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ tre o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el3(fk0 fk0Var, float f, boolean z, Object obj, tre treVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fk0Var;
        this.m = f;
        this.n = z;
        this.p = obj;
        this.o = treVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new el3(this.l, this.m, this.n, (fl3) this.p, this.o, continuation, 0);
            default:
                return new el3(this.l, this.m, this.n, (lk7) this.p, this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((el3) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a4, code lost:
    
        if ((r13 instanceof defpackage.poc) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r13.f(r0, r12) == r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        if ((r13 instanceof defpackage.poc) != false) goto L47;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object f2;
        switch (this.j) {
            case 0:
                fl3 fl3Var = (fl3) this.p;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = this.l;
                    float f3 = ((cma) fk0Var.e.getValue()).a;
                    float f4 = this.m;
                    if (!cma.a(f3, f4)) {
                        if (this.n) {
                            float f5 = ((cma) fk0Var.e.getValue()).a;
                            act actVar = null;
                            tre rqmVar = cma.a(f5, fl3Var.b) ? new rqm(0L) : cma.a(f5, fl3Var.d) ? new k4e() : cma.a(f5, fl3Var.c) ? new poc() : null;
                            this.k = 2;
                            act actVar2 = r2b.b;
                            act actVar3 = r2b.a;
                            tre treVar = this.o;
                            if (treVar != null) {
                                if ((treVar instanceof rqm) || (treVar instanceof joa) || (treVar instanceof k4e) || (treVar instanceof poc)) {
                                    actVar = actVar3;
                                }
                            } else if (rqmVar != null) {
                                if (!(rqmVar instanceof rqm) && !(rqmVar instanceof joa)) {
                                    if (!(rqmVar instanceof k4e)) {
                                        break;
                                    } else {
                                        actVar = r2b.c;
                                    }
                                }
                                actVar = actVar2;
                            }
                            fk0 fk0Var2 = this.l;
                            if (actVar != null) {
                                f = fk0.c(fk0Var2, new cma(f4), actVar, null, this, 12);
                                if (f != nm6Var) {
                                    f = Unit.a;
                                }
                            } else {
                                f = fk0Var2.f(new cma(f4), this);
                                if (f != nm6Var) {
                                    f = Unit.a;
                                }
                            }
                            if (f == nm6Var) {
                            }
                        } else {
                            cma cmaVar = new cma(f4);
                            this.k = 1;
                            if (fk0Var.f(cmaVar, this) == nm6Var) {
                            }
                        }
                    }
                } else if (i != 1 && i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                lk7 lk7Var = (lk7) this.p;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var3 = this.l;
                    float f6 = ((cma) fk0Var3.e.getValue()).a;
                    float f7 = this.m;
                    if (!cma.a(f6, f7)) {
                        if (!this.n) {
                            cma cmaVar2 = new cma(f7);
                            this.k = 1;
                            break;
                        } else {
                            float f8 = ((cma) fk0Var3.e.getValue()).a;
                            act actVar4 = null;
                            tre rqmVar2 = cma.a(f8, lk7Var.b) ? new rqm(0L) : cma.a(f8, lk7Var.d) ? new k4e() : cma.a(f8, lk7Var.e) ? new poc() : null;
                            this.k = 2;
                            act actVar5 = s2b.b;
                            act actVar6 = s2b.a;
                            tre treVar2 = this.o;
                            if (treVar2 != null) {
                                if ((treVar2 instanceof rqm) || (treVar2 instanceof joa) || (treVar2 instanceof k4e) || (treVar2 instanceof poc)) {
                                    actVar4 = actVar6;
                                }
                            } else if (rqmVar2 != null) {
                                if (!(rqmVar2 instanceof rqm) && !(rqmVar2 instanceof joa)) {
                                    if (!(rqmVar2 instanceof k4e)) {
                                        break;
                                    } else {
                                        actVar4 = s2b.c;
                                    }
                                }
                                actVar4 = actVar5;
                            }
                            act actVar7 = actVar4;
                            fk0 fk0Var4 = this.l;
                            if (actVar7 != null) {
                                f2 = fk0.c(fk0Var4, new cma(f7), actVar7, null, this, 12);
                                if (f2 != nm6Var2) {
                                    f2 = Unit.a;
                                }
                            } else {
                                f2 = fk0Var4.f(new cma(f7), this);
                                if (f2 != nm6Var2) {
                                    f2 = Unit.a;
                                }
                            }
                            if (f2 == nm6Var2) {
                            }
                        }
                    }
                } else if (i2 != 1 && i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    nm6Var2 = null;
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
