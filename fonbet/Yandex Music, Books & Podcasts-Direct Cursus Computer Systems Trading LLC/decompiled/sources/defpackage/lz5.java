package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class lz5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ges b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ lz5(ges gesVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = gesVar;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                cds cdsVar = (cds) obj;
                cdsVar.getClass();
                if (cdsVar.c()) {
                    this.c.setValue(this.b);
                }
                break;
            case 1:
                cds cdsVar2 = (cds) obj;
                cdsVar2.getClass();
                if (cdsVar2.c()) {
                    this.c.setValue(this.b);
                }
                break;
            default:
                cds cdsVar3 = (cds) obj;
                cdsVar3.getClass();
                if (cdsVar3.b.f > 1) {
                    this.c.setValue(ges.b(this.b, 0L, v7g.z(14), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213));
                }
                break;
        }
        return Unit.a;
    }
}
