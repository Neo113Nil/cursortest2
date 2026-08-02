package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class l1k extends aur implements pyc {
    public final /* synthetic */ int j = 0;
    public int k;
    public /* synthetic */ rjc l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1k(Continuation continuation, w5u w5uVar, List list, int i) {
        super(3, continuation);
        this.o = w5uVar;
        this.p = list;
        this.m = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        switch (this.j) {
            case 0:
                l1k l1kVar = new l1k((Continuation) obj3, (w1k) this.o, (pfg) this.p);
                l1kVar.l = rjcVar;
                l1kVar.n = obj2;
                return l1kVar.invokeSuspend(Unit.a);
            default:
                l1k l1kVar2 = new l1k((Continuation) obj3, (w5u) this.o, (List) this.p, this.m);
                l1kVar2.l = rjcVar;
                l1kVar2.n = (Object[]) obj2;
                return l1kVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        int intValue;
        x1k x1kVar;
        qqi qqiVar;
        pjc n1kVar;
        rjc rjcVar2;
        l1k l1kVar;
        switch (this.j) {
            case 0:
                w1k w1kVar = (w1k) this.o;
                pfg pfgVar = (pfg) this.p;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                try {
                    if (i == 0) {
                        qgg.h0(obj);
                        rjcVar = this.l;
                        intValue = ((Number) this.n).intValue();
                        x1kVar = w1kVar.i;
                        qqiVar = x1kVar.a;
                        this.l = rjcVar;
                        this.n = x1kVar;
                        this.q = qqiVar;
                        this.m = intValue;
                        this.k = 1;
                        if (qqiVar.a(this) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        intValue = this.m;
                        qqiVar = (qqi) this.q;
                        x1kVar = (x1k) this.n;
                        rjcVar = this.l;
                        qgg.h0(obj);
                    }
                    ime imeVar = x1kVar.b.j;
                    if (imeVar.s(pfgVar).equals(nfg.b)) {
                        n1kVar = new fs(14, new q3d[0]);
                    } else {
                        if (!(imeVar.s(pfgVar) instanceof lfg)) {
                            imeVar.W(pfgVar, nfg.c);
                        }
                        qqiVar.b(null);
                        n1kVar = new n1k(zsd.d0(w1kVar.f.u(pfgVar), intValue == 0 ? 0 : 1), intValue, 0);
                    }
                    this.l = null;
                    this.n = null;
                    this.q = null;
                    this.k = 2;
                    if (zsd.e0(rjcVar, n1kVar, this) == nm6Var) {
                        return nm6Var;
                    }
                    return Unit.a;
                } finally {
                    qqiVar.b(null);
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjcVar2 = this.l;
                    p4u[] p4uVarArr = (p4u[]) ((Object[]) this.n);
                    w5u w5uVar = (w5u) this.o;
                    List list = (List) this.p;
                    int i3 = this.m;
                    int a = tah.a(p4uVarArr.length);
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                    for (p4u p4uVar : p4uVarArr) {
                        linkedHashMap.put(p4uVar.a, p4uVar.b);
                    }
                    this.l = null;
                    this.n = null;
                    this.q = rjcVar2;
                    this.k = 1;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    l1kVar = this;
                    obj = w5uVar.a(list, i3, e5bVar, e5bVar, linkedHashMap, l1kVar);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rjcVar2 = (rjc) this.q;
                    qgg.h0(obj);
                    l1kVar = this;
                }
                l1kVar.l = null;
                l1kVar.n = null;
                l1kVar.q = null;
                l1kVar.k = 2;
                if (rjcVar2.emit(obj, this) == nm6Var2) {
                    return nm6Var2;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1k(Continuation continuation, w1k w1kVar, pfg pfgVar) {
        super(3, continuation);
        this.o = w1kVar;
        this.p = pfgVar;
    }
}
