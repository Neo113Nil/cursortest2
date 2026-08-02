package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class kvb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ fvf c;
    public final /* synthetic */ jub d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ kvb(aqi aqiVar, fvf fvfVar, jub jubVar, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = aqiVar;
        this.c = fvfVar;
        this.d = jubVar;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                vwb.D(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                cxb.A(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
        }
        return Unit.a;
    }
}
