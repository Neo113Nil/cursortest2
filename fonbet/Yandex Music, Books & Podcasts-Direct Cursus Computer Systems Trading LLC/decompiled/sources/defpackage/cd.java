package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class cd extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ aqi s;
    public final /* synthetic */ aqi t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd(aqi aqiVar, aqi aqiVar2, int i) {
        super(1);
        this.r = i;
        this.s = aqiVar;
        this.t = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((wof) obj).getClass();
                this.s.setValue(new cma((int) (r5.j() >> 32)));
                this.t.setValue(new cma((int) (r5.j() & 4294967295L)));
                break;
            case 1:
                ((wof) obj).getClass();
                this.s.setValue(new cma((int) (r5.j() >> 32)));
                this.t.setValue(new cma((int) (r5.j() & 4294967295L)));
                break;
            default:
                wof wofVar = (wof) obj;
                wofVar.getClass();
                this.s.setValue(new enj(wofVar.S(0L)));
                this.t.setValue(new hqe(wofVar.j()));
                break;
        }
        return Unit.a;
    }
}
