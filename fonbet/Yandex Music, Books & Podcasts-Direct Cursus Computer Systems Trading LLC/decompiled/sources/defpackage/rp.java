package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class rp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ poi b;

    public /* synthetic */ rp(poi poiVar, int i) {
        this.a = i;
        this.b = poiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((t6k) this.b).h(((Float) obj).floatValue());
                return Unit.a;
            case 1:
                ((t6k) this.b).h(((Float) obj).floatValue());
                return Unit.a;
            case 2:
                ((jx7) obj).getClass();
                return new wpe(xv.t((int) ((t6k) this.b).e(), 0));
            case 3:
                cds cdsVar = (cds) obj;
                cdsVar.getClass();
                ((t6k) this.b).h(cdsVar.b.g(0));
                return Unit.a;
            case 4:
                ((jx7) obj).getClass();
                return new wpe(xv.t((int) ((t6k) this.b).e(), 0));
            default:
                cds cdsVar2 = (cds) obj;
                cdsVar2.getClass();
                ((t6k) this.b).h(cdsVar2.b.g(0));
                return Unit.a;
        }
    }
}
