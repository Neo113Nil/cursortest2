package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class vnf extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public /* synthetic */ boolean k;
    public final /* synthetic */ aqi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnf(boolean z, aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.k = z;
        this.l = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vnf(this.k, this.l, continuation);
            default:
                vnf vnfVar = new vnf(this.l, continuation);
                vnfVar.k = ((Boolean) obj).booleanValue();
                return vnfVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((vnf) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vnf) create(bool, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        aqi aqiVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (!this.k) {
                    aqiVar.setValue(Boolean.FALSE);
                }
                break;
            default:
                boolean z = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                aqiVar.setValue(Boolean.valueOf(z));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnf(aqi aqiVar, Continuation continuation) {
        super(2, continuation);
        this.l = aqiVar;
    }
}
