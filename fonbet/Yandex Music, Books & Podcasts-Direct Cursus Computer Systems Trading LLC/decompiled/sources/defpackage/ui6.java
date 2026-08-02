package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ui6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ ui6(aqi aqiVar, aqi aqiVar2, int i) {
        this.a = i;
        this.b = aqiVar;
        this.c = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        aqi aqiVar = this.c;
        aqi aqiVar2 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    ((Function0) aqiVar.getValue()).invoke();
                }
                break;
            case 1:
                float f = fj6.a;
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    ((Function0) aqiVar.getValue()).invoke();
                }
                break;
            case 2:
                if (((Boolean) ((Function0) aqiVar2.getValue()).invoke()).booleanValue()) {
                    ((Function0) aqiVar.getValue()).invoke();
                }
                break;
            default:
                Float f2 = (Float) obj;
                f2.getClass();
                aqiVar2.setValue(Boolean.TRUE);
                aqiVar.setValue(f2);
                break;
        }
        return Unit.a;
    }
}
