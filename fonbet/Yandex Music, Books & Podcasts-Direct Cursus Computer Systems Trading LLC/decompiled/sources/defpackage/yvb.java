package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class yvb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvf b;
    public final /* synthetic */ pcu c;
    public final /* synthetic */ sdr d;
    public final /* synthetic */ aqi e;
    public final /* synthetic */ jub f;
    public final /* synthetic */ int g;

    public /* synthetic */ yvb(fvf fvfVar, pcu pcuVar, sdr sdrVar, aqi aqiVar, jub jubVar, int i, int i2) {
        this.a = i2;
        this.b = fvfVar;
        this.c = pcuVar;
        this.d = sdrVar;
        this.e = aqiVar;
        this.f = jubVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                vwb.t(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                cxb.n(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
        }
        return Unit.a;
    }
}
