package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class rgq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sgq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgq(sgq sgqVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = sgqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new rgq(this.l, continuation, 0);
            default:
                return new rgq(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((rgq) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = this.l.p;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar.emit(j0, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                sgq sgqVar = this.l;
                xdr xdrVar = sgqVar.n;
                dj4 dj4Var = sgqVar.o;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ogq ogqVar = (ogq) sgqVar.l.getValue();
                    String str = sgqVar.k;
                    boolean z = sgqVar.m;
                    this.k = 1;
                    obj = ogqVar.a(str, z, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                rj6 rj6Var = (rj6) obj;
                Continuation continuation = null;
                if (rj6Var instanceof qj6) {
                    Iterable<c01> iterable = (Iterable) ((qj6) rj6Var).a;
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    for (c01 c01Var : iterable) {
                        c01Var.getClass();
                        String w = vz1.w(c01Var.q.a);
                        String str2 = c01Var.b;
                        int i3 = c01Var.g;
                        w3g w3gVar = new w3g(tt0.C(i3), dag.A(i3, false), false);
                        if (i3 <= 0) {
                            w3gVar = null;
                        }
                        arrayList.add(new ggq(c01Var, new jd1(w, str2, false, w3gVar)));
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, arrayList);
                    dj4Var.g();
                } else if (rj6Var instanceof nj6) {
                    xdrVar.l(c5b.a);
                    dj4Var.g();
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    break;
                } else {
                    dj4Var.f();
                    x97.y(ot0.F(sgqVar), null, null, new rgq(sgqVar, continuation, 0), 3);
                }
                break;
        }
        return Unit.a;
    }
}
