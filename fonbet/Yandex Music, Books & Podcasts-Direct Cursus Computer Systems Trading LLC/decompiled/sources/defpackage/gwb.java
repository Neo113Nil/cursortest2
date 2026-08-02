package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class gwb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fvf l;
    public final /* synthetic */ aqi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gwb(fvf fvfVar, aqi aqiVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fvfVar;
        this.m = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gwb(this.l, this.m, continuation, 0);
            default:
                return new gwb(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((gwb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        fvf fvfVar = this.l;
        aqi aqiVar = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) aqiVar.getValue()).booleanValue()) {
                        this.k = 1;
                        apo apoVar = fvf.w;
                        if (fvfVar.f(0, 0, this) == nm6Var) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    if (((Boolean) aqiVar.getValue()).booleanValue()) {
                        this.k = 1;
                        apo apoVar2 = fvf.w;
                        if (fvfVar.f(0, 0, this) == nm6Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
