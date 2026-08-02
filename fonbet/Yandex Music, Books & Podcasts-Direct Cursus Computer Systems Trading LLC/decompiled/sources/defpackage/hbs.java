package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hbs extends aur implements pyc {
    public int j;
    public /* synthetic */ pqm k;
    public /* synthetic */ long l;
    public final /* synthetic */ mm6 m;
    public final /* synthetic */ aqi n;
    public final /* synthetic */ uoi o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbs(mm6 mm6Var, aqi aqiVar, uoi uoiVar, Continuation continuation) {
        super(3, continuation);
        this.m = mm6Var;
        this.n = aqiVar;
        this.o = uoiVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((enj) obj2).a;
        aqi aqiVar = this.n;
        uoi uoiVar = this.o;
        hbs hbsVar = new hbs(this.m, aqiVar, uoiVar, (Continuation) obj3);
        hbsVar.k = (pqm) obj;
        hbsVar.l = j;
        return hbsVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object h;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        mm6 mm6Var = this.m;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            pqm pqmVar = this.k;
            x97.y(mm6Var, null, null, new n5(this.n, this.l, this.o, (Continuation) null, 9), 3);
            this.j = 1;
            h = pqmVar.h(this);
            if (h == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            h = obj;
        }
        x97.y(mm6Var, null, null, new ak1(this.n, ((Boolean) h).booleanValue(), this.o, continuation, 11), 3);
        return Unit.a;
    }
}
