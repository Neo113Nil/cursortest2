package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class o24 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o24(float f, aqi aqiVar) {
        this.a = 0;
        this.b = f;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((l54) ((aqi) obj).getValue()).a.b(u75.h(new Pair(d44.c, Float.valueOf(-f)), new Pair(d44.b, Float.valueOf(0.0f)), new Pair(d44.a, Float.valueOf(f))));
                return Unit.a;
            case 1:
                fvf fvfVar = (fvf) obj;
                float f2 = m4c.a;
                return Float.valueOf(fvfVar.h() == 0 ? yhn.c(Math.abs(fvfVar.i()) / f, 0.0f, 1.0f) : 1.0f);
            default:
                rxv rxvVar = (rxv) obj;
                return Boolean.valueOf(((Boolean) rxvVar.j.getValue()).booleanValue() && rxvVar.h.e() == f);
        }
    }

    public /* synthetic */ o24(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
