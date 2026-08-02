package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ivr extends aur implements Function2 {
    public int j;
    public final /* synthetic */ nvr k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ a2o m;
    public final /* synthetic */ jx7 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivr(nvr nvrVar, Map map, a2o a2oVar, jx7 jx7Var, Function2 function2, float f, Continuation continuation) {
        super(2, continuation);
        this.k = nvrVar;
        this.l = map;
        this.m = a2oVar;
        this.n = jx7Var;
        this.o = function2;
        this.p = f;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new ivr(this.k, this.l, this.m, this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ivr) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            nvr nvrVar = this.k;
            Map map = (Map) nvrVar.i.getValue();
            x6k x6kVar = nvrVar.i;
            ?? r4 = this.l;
            x6kVar.setValue(r4);
            nvrVar.o.setValue(this.m);
            Function2 function2 = this.o;
            jx7 jx7Var = this.n;
            nvrVar.m.setValue(new lf0(r4, function2, jx7Var));
            nvrVar.n.h(jx7Var.n0(this.p));
            this.j = 1;
            if (nvrVar.c(map, r4, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
