package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ti6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ aqi d;

    public /* synthetic */ ti6(Function1 function1, aqi aqiVar, aqi aqiVar2, int i) {
        this.a = i;
        this.b = function1;
        this.c = aqiVar;
        this.d = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        aqi aqiVar = this.d;
        aqi aqiVar2 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    aqiVar.setValue(Boolean.TRUE);
                    function1.invoke(zug.a);
                }
                break;
            case 1:
                float f = fj6.a;
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    aqiVar.setValue(Boolean.TRUE);
                    function1.invoke(b6h.a);
                }
                break;
            default:
                bpc bpcVar = (bpc) obj;
                bpcVar.getClass();
                aqiVar2.setValue(Boolean.valueOf(bpcVar.b()));
                if (bpcVar.b() && ((ybs) aqiVar.getValue()).a.b.length() > 0) {
                    ybs ybsVar = (ybs) aqiVar.getValue();
                    int length = ((ybs) aqiVar.getValue()).a.b.length();
                    aqiVar.setValue(ybs.a(ybsVar, null, y5g.P(length, length), 5));
                }
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(bpcVar.b()));
                }
                break;
        }
        return Unit.a;
    }
}
