package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class xcm extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ zcm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xcm(zcm zcmVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = zcmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new xcm(this.l, continuation, 0);
            default:
                return new xcm(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((xcm) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                zcm zcmVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = zcmVar.b;
                    xdrVar.getClass();
                    xdrVar.m(null, t2i.d);
                    edm edmVar = zcmVar.a;
                    this.k = 1;
                    obj = edmVar.a(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    vcm vcmVar = (vcm) ((qj6) rj6Var).a;
                    xdr xdrVar2 = zcmVar.b;
                    t2i t2iVar = new t2i(vcmVar);
                    xdrVar2.getClass();
                    xdrVar2.m(null, t2iVar);
                    Iterator it = vcmVar.d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((tcm) obj2).a() == g94.ContinueListen) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    fg6 fg6Var = obj2 instanceof fg6 ? (fg6) obj2 : null;
                    if (fg6Var != null) {
                        xdr xdrVar3 = zcmVar.c;
                        xdrVar3.getClass();
                        xdrVar3.m(null, fg6Var);
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdr xdrVar4 = zcmVar.b;
                    t2i t2iVar2 = new t2i((Throwable) ((pj6) rj6Var).a());
                    xdrVar4.getClass();
                    xdrVar4.m(null, t2iVar2);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                zcm zcmVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    edm edmVar2 = zcmVar2.a;
                    this.k = 1;
                    obj = edmVar2.b(this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6 rj6Var2 = (rj6) obj;
                if (rj6Var2 instanceof qj6) {
                    zcmVar2.c.l(((qj6) rj6Var2).a);
                } else if (rj6Var2 instanceof nj6) {
                    ssg.a(3, null, "failed to load myshelf block data: block not found", ((nj6) rj6Var2).a());
                } else {
                    if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(3, null, "failed to load myshelf block data", ((pj6) rj6Var2).a());
                }
                return Unit.a;
        }
    }
}
