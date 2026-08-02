package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class z71 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ a81 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z71(a81 a81Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = a81Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z71(this.l, continuation, 0);
            case 1:
                return new z71(this.l, continuation, 1);
            default:
                return new z71(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z71) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object value;
        v71 v71Var;
        Object value2;
        v71 v71Var2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                a81 a81Var = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = x97.V(dm6.b, new z71(a81Var, null, 1), this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list = (List) obj;
                xdr xdrVar = a81Var.n;
                do {
                    value = xdrVar.getValue();
                    v71Var = (v71) value;
                } while (!xdrVar.k(value, a81.a(a81Var, v71Var, list != null ? a81.G(a81Var, v71Var.b, list) : v71Var.b)));
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    a81 a81Var2 = this.l;
                    i71 i71Var = (i71) a81Var2.m.getValue();
                    String str = a81Var2.k.a;
                    this.k = 1;
                    obj = i71Var.a(str, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list2 = (List) jf0.F((rj6) obj);
                if (list2 != null) {
                    List<mqs> list3 = list2;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    for (mqs mqsVar : list3) {
                        arrayList.add(new io6(oo6.a.a(mqsVar), mqsVar));
                    }
                    break;
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                Continuation continuation = null;
                a81 a81Var3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = x97.V(dm6.b, new z71(a81Var3, continuation, 1), this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                List list4 = (List) obj;
                xdr xdrVar2 = a81Var3.n;
                do {
                    value2 = xdrVar2.getValue();
                    v71Var2 = (v71) value2;
                } while (!xdrVar2.k(value2, v71.a(v71Var2, null, list4 != null ? a81.G(a81Var3, v71Var2.b, list4) : v71Var2.b, false, 1)));
                break;
        }
        return Unit.a;
    }
}
