package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class pi6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ aqi c;

    public /* synthetic */ pi6(boolean z, aqi aqiVar, int i) {
        this.a = i;
        this.b = z;
        this.c = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        jfp jfpVar = (jfp) obj;
        jfpVar.getClass();
        switch (i) {
            case 0:
                wfp.q(jfpVar, 0);
                wfp.h(jfpVar, new jc(this.c, 7));
                if (!this.b) {
                    wfp.c(jfpVar);
                }
                break;
            default:
                wfp.q(jfpVar, 0);
                wfp.h(jfpVar, new jc(this.c, 8));
                if (!this.b) {
                    wfp.c(jfpVar);
                }
                break;
        }
        return Unit.a;
    }
}
