package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class woa extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ aqi t;
    public final /* synthetic */ mm6 u;
    public final /* synthetic */ aqi v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ woa(Function0 function0, aqi aqiVar, mm6 mm6Var, aqi aqiVar2, int i) {
        super(0);
        this.r = i;
        this.s = function0;
        this.t = aqiVar;
        this.u = mm6Var;
        this.v = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                joa joaVar = (joa) this.t.getValue();
                if (joaVar != null) {
                    x97.y(this.u, null, null, new uoa(joaVar, null, 2), 3);
                }
                aqi aqiVar = this.v;
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                    this.s.invoke();
                }
                aqiVar.setValue(Boolean.FALSE);
                break;
            default:
                joa joaVar2 = (joa) this.t.getValue();
                if (joaVar2 != null) {
                    x97.y(this.u, null, null, new uoa(joaVar2, null, 3), 3);
                }
                aqi aqiVar2 = this.v;
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    this.s.invoke();
                }
                aqiVar2.setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
