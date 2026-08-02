package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class voa implements na8 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ mm6 d;

    public voa(Function0 function0, aqi aqiVar, aqi aqiVar2, mm6 mm6Var) {
        this.a = function0;
        this.b = aqiVar;
        this.c = aqiVar2;
        this.d = mm6Var;
    }

    @Override // defpackage.na8
    public final void a() {
        aqi aqiVar = this.b;
        if (((Boolean) aqiVar.getValue()).booleanValue()) {
            joa joaVar = (joa) this.c.getValue();
            if (joaVar != null) {
                x97.y(this.d, null, null, new uoa(joaVar, null, 0), 3);
            }
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                this.a.invoke();
            }
            aqiVar.setValue(Boolean.FALSE);
        }
    }
}
