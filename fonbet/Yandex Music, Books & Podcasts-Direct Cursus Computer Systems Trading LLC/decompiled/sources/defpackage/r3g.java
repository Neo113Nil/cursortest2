package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r3g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ nu1 l;
    public final /* synthetic */ t3g m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3g(t3g t3gVar, nu1 nu1Var, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.m = t3gVar;
        this.l = nu1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r3g(this.l, this.m, continuation, 0);
            case 1:
                return new r3g(this.l, this.m, continuation, 1);
            default:
                return new r3g(this.m, this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r3g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    nu1 nu1Var = this.l;
                    boolean z = nu1Var instanceof oq;
                    t3g t3gVar = this.m;
                    if (z) {
                        j1g j1gVar = j1g.a;
                        this.k = 1;
                        if (cu.a(t3gVar.c().b, (oq) nu1Var, j1gVar, this) == nm6Var) {
                        }
                    } else if (nu1Var instanceof c01) {
                        j1g j1gVar2 = j1g.a;
                        this.k = 2;
                        if (dc1.a(t3gVar.c().c, (c01) nu1Var, j1gVar2, this) == nm6Var) {
                        }
                    } else if (nu1Var instanceof rrl) {
                        bwl bwlVar = t3gVar.c().d;
                        cvl cvlVar = ((rrl) nu1Var).a;
                        j1g j1gVar3 = j1g.a;
                        this.k = 3;
                        if (tvl.a(bwlVar, cvlVar, j1gVar3, this) == nm6Var) {
                        }
                    } else if (nu1Var instanceof cvl) {
                        j1g j1gVar4 = j1g.a;
                        this.k = 4;
                        if (tvl.a(t3gVar.c().d, (cvl) nu1Var, j1gVar4, this) == nm6Var) {
                        }
                    }
                } else if (i != 1 && i != 2 && i != 3 && i != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    nu1 nu1Var2 = this.l;
                    boolean z2 = nu1Var2 instanceof oq;
                    t3g t3gVar2 = this.m;
                    if (z2) {
                        j1g j1gVar5 = j1g.b;
                        this.k = 1;
                        if (cu.a(t3gVar2.c().b, (oq) nu1Var2, j1gVar5, this) == nm6Var2) {
                        }
                    } else if (nu1Var2 instanceof c01) {
                        j1g j1gVar6 = j1g.b;
                        this.k = 2;
                        if (dc1.a(t3gVar2.c().c, (c01) nu1Var2, j1gVar6, this) == nm6Var2) {
                        }
                    } else if (nu1Var2 instanceof rrl) {
                        bwl bwlVar2 = t3gVar2.c().d;
                        cvl cvlVar2 = ((rrl) nu1Var2).a;
                        j1g j1gVar7 = j1g.b;
                        this.k = 3;
                        if (tvl.a(bwlVar2, cvlVar2, j1gVar7, this) == nm6Var2) {
                        }
                    } else if (nu1Var2 instanceof cvl) {
                        j1g j1gVar8 = j1g.b;
                        this.k = 4;
                        if (tvl.a(t3gVar2.c().d, (cvl) nu1Var2, j1gVar8, this) == nm6Var2) {
                        }
                    }
                } else if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                t3g t3gVar3 = this.m;
                nu1 nu1Var3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = t3gVar3.h(nu1Var3, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    t3gVar3.y(nu1Var3);
                } else {
                    t3gVar3.r(nu1Var3);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3g(nu1 nu1Var, t3g t3gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = nu1Var;
        this.m = t3gVar;
    }
}
