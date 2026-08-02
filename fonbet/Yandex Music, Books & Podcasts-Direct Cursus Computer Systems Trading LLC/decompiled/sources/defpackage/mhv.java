package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mhv extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ thv m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhv(thv thvVar, Continuation continuation) {
        super(2, continuation);
        this.m = thvVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                mhv mhvVar = new mhv(this.m, continuation);
                mhvVar.l = obj;
                return mhvVar;
            default:
                mhv mhvVar2 = new mhv(continuation, this.m);
                mhvVar2.l = obj;
                return mhvVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((mhv) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((mhv) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                Pair pair = (Pair) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                n6l n6lVar = (n6l) pair.a;
                x66 x66Var = (x66) pair.b;
                boolean d = Intrinsics.d(n6lVar, l6l.a);
                thv thvVar = this.m;
                if (d) {
                    thvVar.h = null;
                    xdr xdrVar = thvVar.i;
                    xdrVar.getClass();
                    xdrVar.m(null, ckv.a);
                } else {
                    if (!(n6lVar instanceof m6l)) {
                        b6e.s();
                        return null;
                    }
                    u5j u5jVar = ((m6l) n6lVar).a;
                    this.l = null;
                    this.k = 1;
                    if (thv.a(thvVar, u5jVar, x66Var, this) == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            default:
                Object obj2 = this.l;
                Object obj3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) obj2).booleanValue()) {
                        this.l = null;
                        this.k = 1;
                        thv thvVar2 = this.m;
                        boolean z = thvVar2.f;
                        f7l f7lVar = thvVar2.c.a;
                        Object O = zsd.O(new u21(10, !z ? new qhv(zsd.b0(new cla(y1g.L(f7lVar), 15)), thvVar2, 0) : new qhv(zsd.b0(new e7v(f7lVar.c, 2)), thvVar2, 1), thvVar2.d.c(), lhv.a), new mhv(thvVar2, (Continuation) null), this);
                        if (O != obj3) {
                            O = Unit.a;
                        }
                        if (O == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhv(Continuation continuation, thv thvVar) {
        super(2, continuation);
        this.m = thvVar;
    }
}
