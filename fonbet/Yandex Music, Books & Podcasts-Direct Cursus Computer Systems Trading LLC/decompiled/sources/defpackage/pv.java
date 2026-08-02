package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ poi b;

    public /* synthetic */ pv(poi poiVar, int i) {
        this.a = i;
        this.b = poiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((t6k) this.b).h(floatValue);
                break;
            case 1:
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((t6k) this.b).h(floatValue2);
                break;
            case 2:
                float floatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((t6k) this.b).h(floatValue3);
                break;
            case 3:
                cds cdsVar = (cds) obj2;
                ((mn0) obj).getClass();
                cdsVar.getClass();
                ((t6k) this.b).h(((int) (cdsVar.c & 4294967295L)) - cdsVar.e);
                break;
            case 4:
                float floatValue4 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((t6k) this.b).h(floatValue4);
                break;
            default:
                float floatValue5 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((t6k) this.b).h(floatValue5);
                break;
        }
        return Unit.a;
    }
}
