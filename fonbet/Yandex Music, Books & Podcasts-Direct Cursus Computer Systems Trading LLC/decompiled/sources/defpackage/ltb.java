package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ltb implements uyf {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ ltb(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        switch (this.a) {
            case 0:
                this.b.setValue(Boolean.valueOf(kyfVar == kyf.ON_RESUME));
                break;
            case 1:
                ((Function1) this.b.getValue()).invoke(kyfVar);
                break;
            default:
                ((Function1) this.b.getValue()).invoke(kyfVar);
                break;
        }
    }
}
