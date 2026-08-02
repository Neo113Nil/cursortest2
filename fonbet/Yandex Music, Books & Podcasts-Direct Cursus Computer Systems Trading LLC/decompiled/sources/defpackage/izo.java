package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class izo implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wdj b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ izo(wdj wdjVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = wdjVar;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.m(((j1g) this.c.getValue()) == j1g.a);
                break;
            default:
                this.b.m(((j1g) this.c.getValue()) == j1g.a);
                break;
        }
        return Unit.a;
    }
}
