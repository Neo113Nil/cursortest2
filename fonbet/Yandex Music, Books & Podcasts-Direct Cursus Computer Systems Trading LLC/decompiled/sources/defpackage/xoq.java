package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class xoq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ hgp l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xoq(hgp hgpVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = hgpVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new xoq(this.l, continuation, 0);
            default:
                return new xoq(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((xoq) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        djf djfVar;
        djf djfVar2;
        djf djfVar3;
        switch (this.j) {
            case 0:
                hgp hgpVar = this.l;
                fjf fjfVar = (fjf) hgpVar.e;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    p6o p6oVar = new p6o(((xqq) hgpVar.c).M(), 20);
                    this.k = 1;
                    obj = zsd.g0(p6oVar, this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (!(((cpq) obj) instanceof bpq)) {
                    fjfVar.h = null;
                }
                if (fjfVar.c && (djfVar2 = fjfVar.h) != null) {
                    djfVar2.e = fjfVar.g().a() - djfVar2.a;
                }
                if (fjfVar.c && (djfVar = fjfVar.h) != null) {
                    djfVar.f = fjfVar.g().a() - djfVar.a;
                }
                ((u1e) ((mka) hgpVar.f).a).f.invoke();
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                hgp hgpVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    p6o p6oVar2 = new p6o(((xqq) hgpVar2.c).H(), 21);
                    this.k = 1;
                    obj = zsd.i0(p6oVar2, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                e73 e73Var = (e73) obj;
                fjf fjfVar2 = (fjf) hgpVar2.e;
                Continuation continuation = null;
                drf a = e73Var != null ? e73Var.a() : null;
                if (fjfVar2.c && (djfVar3 = fjfVar2.h) != null && djfVar3.g != 0) {
                    djfVar3.h = fjfVar2.g().a() - djfVar3.a;
                    x97.y(fjfVar2.b, dm6.b, null, new n71(fjfVar2, djfVar3, a, continuation, 16), 2);
                    fjfVar2.h = null;
                }
                break;
        }
        return Unit.a;
    }
}
