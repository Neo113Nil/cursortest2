package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ezi extends aur implements tyc {
    public final /* synthetic */ int j;
    public lja k;
    public d6l l;
    public int m;
    public /* synthetic */ lja n;
    public /* synthetic */ e6l o;
    public /* synthetic */ u0j p;
    public Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezi(Object obj, Continuation continuation, int i) {
        super(5, continuation);
        this.j = i;
        this.r = obj;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lja ljaVar = (lja) obj;
        e6l e6lVar = (e6l) obj2;
        u0j u0jVar = (u0j) obj4;
        Continuation continuation = (Continuation) obj5;
        switch (this.j) {
            case 0:
                ezi eziVar = new ezi((fzi) this.r, continuation, 0);
                eziVar.n = ljaVar;
                eziVar.o = e6lVar;
                eziVar.p = u0jVar;
                return eziVar.invokeSuspend(Unit.a);
            default:
                ezi eziVar2 = new ezi((w6j) this.r, continuation, 1);
                eziVar2.n = ljaVar;
                eziVar2.o = e6lVar;
                eziVar2.p = u0jVar;
                return eziVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        d6l d6lVar;
        d6l x;
        d6l d6lVar2;
        int i = this.j;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                fzi fziVar = (fzi) obj2;
                lja ljaVar = this.n;
                e6l e6lVar = this.o;
                u0j u0jVar = this.p;
                nm6 nm6Var = nm6.a;
                int i2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    d6l x2 = p6g.x(e6lVar);
                    c72 c72Var = fziVar.a;
                    this.n = null;
                    this.o = null;
                    this.p = u0jVar;
                    this.q = fziVar;
                    this.k = ljaVar;
                    this.l = x2;
                    this.m = 1;
                    Object b = ((z22) c72Var).b(this);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    d6lVar = x2;
                    obj = b;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d6l d6lVar3 = this.l;
                    lja ljaVar2 = this.k;
                    fziVar = (fzi) this.q;
                    qgg.h0(obj);
                    d6lVar = d6lVar3;
                    ljaVar = ljaVar2;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!fziVar.b.a()) {
                    if (u0jVar == u0j.a) {
                        return fo2.a;
                    }
                    if (((Boolean) fziVar.c.invoke()).booleanValue()) {
                        n7q n7qVar = d6lVar != null ? d6lVar.a : null;
                        boolean isEmpty = ljaVar.a.isEmpty();
                        if (!isEmpty) {
                            vuu vuuVar = (vuu) fziVar.e.getValue();
                            vuuVar.getClass();
                            r1 = (n7qVar != null ? (mwk) wdg.A(n7qVar, new n7b(vuuVar)) : null) != null;
                            if (r1) {
                                return go2.b;
                            }
                            if (!r1) {
                                return do2.b;
                            }
                            b6e.s();
                            return null;
                        }
                        if (!isEmpty) {
                            b6e.s();
                            return null;
                        }
                        if (booleanValue) {
                            return jo2.b;
                        }
                        if (!booleanValue) {
                            return io2.b;
                        }
                        b6e.s();
                        return null;
                    }
                    boolean isEmpty2 = ljaVar.a.isEmpty();
                    if (!isEmpty2) {
                        return eo2.b;
                    }
                    if (!isEmpty2) {
                        b6e.s();
                        return null;
                    }
                }
                return bo2.a;
            default:
                w6j w6jVar = (w6j) obj2;
                lja ljaVar3 = this.n;
                e6l e6lVar2 = this.o;
                u0j u0jVar2 = this.p;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.m;
                if (i3 == 0) {
                    qgg.h0(obj);
                    x = p6g.x(e6lVar2);
                    w6jVar.a.getClass();
                    jyr jyrVar = dvu.e;
                    if (kwl.d()) {
                        c72 c72Var2 = w6jVar.c;
                        this.n = null;
                        this.o = null;
                        this.p = u0jVar2;
                        this.q = w6jVar;
                        this.k = ljaVar3;
                        this.l = x;
                        this.m = 1;
                        Object b2 = ((z22) c72Var2).b(this);
                        if (b2 == nm6Var2) {
                            return nm6Var2;
                        }
                        d6lVar2 = x;
                        obj = b2;
                    }
                    d6lVar2 = x;
                    return w6jVar.a(ljaVar3, d6lVar2, r1, u0jVar2);
                }
                if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d6l d6lVar4 = this.l;
                lja ljaVar4 = this.k;
                w6jVar = (w6j) this.q;
                qgg.h0(obj);
                d6lVar2 = d6lVar4;
                ljaVar3 = ljaVar4;
                if (((Boolean) obj).booleanValue()) {
                    r1 = true;
                    return w6jVar.a(ljaVar3, d6lVar2, r1, u0jVar2);
                }
                x = d6lVar2;
                d6lVar2 = x;
                return w6jVar.a(ljaVar3, d6lVar2, r1, u0jVar2);
        }
    }
}
