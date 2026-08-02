package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class phi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ owu b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ phi(owu owuVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = owuVar;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.b((qmu) this.c.getValue());
                break;
            default:
                this.b.b((qmu) this.c.getValue());
                break;
        }
        return Unit.a;
    }
}
