package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ruf implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ fvf c;

    public /* synthetic */ ruf(fvf fvfVar, aqi aqiVar) {
        this.c = fvfVar;
        this.b = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                return new Pair(y2x.k(this.c), this.b.getValue());
            default:
                re reVar = (re) this.b.getValue();
                if (reVar != null) {
                    if (this.c.h() > reVar.b) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ruf(aqi aqiVar, fvf fvfVar) {
        this.b = aqiVar;
        this.c = fvfVar;
    }
}
