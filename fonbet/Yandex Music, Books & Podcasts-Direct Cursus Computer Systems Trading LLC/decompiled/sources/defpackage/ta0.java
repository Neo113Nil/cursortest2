package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ta0 implements Function1 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ta0(float f, uqn uqnVar, ca0 ca0Var, uqn uqnVar2) {
        this.b = f;
        this.c = uqnVar;
        this.e = ca0Var;
        this.d = uqnVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                uqn uqnVar = (uqn) this.c;
                ca0 ca0Var = (ca0) this.e;
                uqn uqnVar2 = (uqn) this.d;
                sm0 sm0Var = (sm0) obj;
                x6k x6kVar = sm0Var.e;
                float floatValue = ((Number) x6kVar.getValue()).floatValue();
                float f = this.b;
                if ((floatValue >= f || uqnVar.a <= f) && (((Number) x6kVar.getValue()).floatValue() <= f || uqnVar.a >= f)) {
                    ca0Var.a(((Number) x6kVar.getValue()).floatValue(), ((Number) sm0Var.b()).floatValue());
                    uqnVar2.a = ((Number) sm0Var.b()).floatValue();
                    uqnVar.a = ((Number) x6kVar.getValue()).floatValue();
                } else {
                    float floatValue2 = ((Number) x6kVar.getValue()).floatValue();
                    if (f == 0.0f) {
                        f = 0.0f;
                    } else if (f <= 0.0f ? floatValue2 >= f : floatValue2 <= f) {
                        f = floatValue2;
                    }
                    ca0Var.a(f, ((Number) sm0Var.b()).floatValue());
                    uqnVar2.a = Float.isNaN(((Number) sm0Var.b()).floatValue()) ? 0.0f : ((Number) sm0Var.b()).floatValue();
                    uqnVar.a = f;
                    sm0Var.a();
                }
                break;
            case 1:
                List list = (List) this.c;
                Function2 function2 = (Function2) this.d;
                wn5 wn5Var = (wn5) this.e;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(list.size(), function2 != null ? new sea(13, function2, list) : null, new bl(28, list, false), new wn5(new fqd(list, function2, this.b, wn5Var), -1091073711, true));
                break;
            default:
                Function1 function1 = (Function1) this.c;
                aqi aqiVar = (aqi) this.d;
                aqi aqiVar2 = (aqi) this.e;
                aqiVar.setValue(Float.valueOf(((Number) aqiVar.getValue()).floatValue() + ((Float) obj).floatValue()));
                aqiVar2.setValue(Float.valueOf(yhn.c(((Number) aqiVar.getValue()).floatValue() / this.b, 0.0f, 1.0f)));
                function1.invoke(Float.valueOf(((Number) aqiVar2.getValue()).floatValue()));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ta0(float f, Function1 function1, aqi aqiVar, aqi aqiVar2) {
        this.b = f;
        this.c = function1;
        this.d = aqiVar;
        this.e = aqiVar2;
    }

    public /* synthetic */ ta0(List list, Function2 function2, float f, wn5 wn5Var) {
        this.c = list;
        this.d = function2;
        this.b = f;
        this.e = wn5Var;
    }
}
