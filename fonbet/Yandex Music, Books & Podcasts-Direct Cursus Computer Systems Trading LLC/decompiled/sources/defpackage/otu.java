package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class otu implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ sdr c;

    public /* synthetic */ otu(aqi aqiVar, aqi aqiVar2) {
        this.b = aqiVar;
        this.c = aqiVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((Boolean) this.c.getValue()).booleanValue() ? new s7v(((ylu) this.b.getValue()).b) : new s7v(zlu.c.b);
            default:
                fav favVar = (fav) this.b.getValue();
                eav eavVar = favVar instanceof eav ? (eav) favVar : null;
                boolean z = false;
                boolean z2 = eavVar != null ? eavVar.d : false;
                if (((Boolean) this.c.getValue()).booleanValue() && z2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ otu(sdr sdrVar, aqi aqiVar) {
        this.c = sdrVar;
        this.b = aqiVar;
    }
}
