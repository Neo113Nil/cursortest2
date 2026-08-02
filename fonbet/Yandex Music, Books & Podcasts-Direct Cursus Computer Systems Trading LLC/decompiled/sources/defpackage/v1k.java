package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v1k extends aur implements Function2 {
    public final /* synthetic */ int j;
    public x1k k;
    public qqi l;
    public w1k m;
    public int n;
    public final /* synthetic */ w1k o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1k(w1k w1kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = w1kVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new v1k(this.o, continuation, 0);
            default:
                return new v1k(this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((v1k) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        w1k w1kVar;
        x1k x1kVar;
        qqi qqiVar;
        Continuation continuation;
        w1k w1kVar2;
        x1k x1kVar2;
        qqi qqiVar2;
        Continuation continuation2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.n;
                try {
                    if (i == 0) {
                        qgg.h0(obj);
                        w1kVar = this.o;
                        x1kVar = w1kVar.i;
                        qqi qqiVar3 = x1kVar.a;
                        this.k = x1kVar;
                        this.l = qqiVar3;
                        this.m = w1kVar;
                        this.n = 1;
                        if (qqiVar3.a(this) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar3;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w1kVar = this.m;
                        qqiVar = this.l;
                        x1kVar = this.k;
                        qgg.h0(obj);
                    }
                    z1k z1kVar = x1kVar.b;
                    clc clcVar = new clc(zsd.V(z1kVar.g), new y1k(z1kVar, continuation, 1));
                    qqiVar.b(null);
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = 2;
                    if (w1k.a(w1kVar, clcVar, pfg.b, this) == nm6Var) {
                        return nm6Var;
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    qqiVar.b(null);
                    throw th;
                }
                continuation = null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.n;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        w1kVar2 = this.o;
                        x1kVar2 = w1kVar2.i;
                        qqi qqiVar4 = x1kVar2.a;
                        this.k = x1kVar2;
                        this.l = qqiVar4;
                        this.m = w1kVar2;
                        this.n = 1;
                        if (qqiVar4.a(this) == nm6Var2) {
                            return nm6Var2;
                        }
                        qqiVar2 = qqiVar4;
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w1kVar2 = this.m;
                        qqiVar2 = this.l;
                        x1kVar2 = this.k;
                        qgg.h0(obj);
                    }
                    z1k z1kVar2 = x1kVar2.b;
                    clc clcVar2 = new clc(zsd.V(z1kVar2.h), new y1k(z1kVar2, continuation2, 0));
                    qqiVar2.b(null);
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = 2;
                    if (w1k.a(w1kVar2, clcVar2, pfg.c, this) == nm6Var2) {
                        return nm6Var2;
                    }
                    return Unit.a;
                } catch (Throwable th2) {
                    qqiVar2.b(null);
                    throw th2;
                }
                continuation2 = null;
        }
    }
}
