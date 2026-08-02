package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class unf extends aur implements Function2 {
    public int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ o3k l;
    public final /* synthetic */ int m;
    public final /* synthetic */ aqi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unf(boolean z, o3k o3kVar, int i, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = o3kVar;
        this.m = i;
        this.n = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new unf(this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((unf) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        aqi aqiVar = this.n;
        if (i == 0) {
            qgg.h0(obj);
            if (this.k) {
                o3k o3kVar = this.l;
                int j = o3kVar.j();
                int i2 = this.m;
                if (j == i2 || o3kVar.k.b()) {
                    aqiVar.setValue(Boolean.TRUE);
                } else {
                    this.j = 1;
                    if (o3k.v(i2, o3kVar, this) == nm6Var) {
                        return nm6Var;
                    }
                }
            } else {
                aqiVar.setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
        if (i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        aqiVar.setValue(Boolean.TRUE);
        return Unit.a;
    }
}
