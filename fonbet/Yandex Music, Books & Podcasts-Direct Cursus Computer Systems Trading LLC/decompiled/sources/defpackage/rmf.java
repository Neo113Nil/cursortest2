package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class rmf extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rdk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmf(rdk rdkVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = rdkVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new rmf(this.l, continuation, 0);
            default:
                return new rmf(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((rmf) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        s9p s9pVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ifd ifdVar = new ifd(((mg5) this.l.c).e, 14);
                this.k = 1;
                Object g0 = zsd.g0(ifdVar, this);
                return g0 == nm6Var ? nm6Var : g0;
            default:
                rdk rdkVar = this.l;
                Function2 function2 = (Function2) rdkVar.f;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                Continuation continuation = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rmf rmfVar = new rmf(rdkVar, continuation, 0);
                    this.k = 1;
                    obj = tyf.L(2000L, rmfVar, this);
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
                jwu jwuVar = (jwu) obj;
                String t = weo.t();
                if (jwuVar == null) {
                    s9pVar = new s9p(t75.c(r9p.a));
                    function2.invoke(o8g.R(s9pVar), t);
                } else {
                    if (!(jwuVar instanceof ewu)) {
                        if (jwuVar instanceof zvu) {
                            zvu zvuVar = (zvu) jwuVar;
                            if (!zvuVar.b) {
                                function2.invoke(o8g.R(zvuVar.a.a), t);
                            }
                        } else if (jwuVar instanceof dwu) {
                            mg5 mg5Var = (mg5) rdkVar.c;
                            s9p s9pVar2 = ((dwu) jwuVar).a.a;
                            mg5Var.b(s9pVar2, (kxi) rdkVar.d, (x5l) ((ezc) rdkVar.g).invoke(s9pVar2), null);
                        } else {
                            if (!(jwuVar instanceof cwu)) {
                                b6e.s();
                                return null;
                            }
                            function2.invoke(o8g.R(((cwu) jwuVar).a.a), t);
                        }
                    }
                    s9pVar = jwuVar.a().a;
                }
                ((ekf) rdkVar.e).b(t, o8g.R(s9pVar));
                return Unit.a;
        }
    }
}
