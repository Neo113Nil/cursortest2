package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ljl implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ljl(boolean z, int i, ksk kskVar, ksk kskVar2, ksk kskVar3, ksk kskVar4) {
        this.b = z;
        this.c = i;
        this.d = kskVar;
        this.e = kskVar2;
        this.f = kskVar3;
        this.g = kskVar4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ksk kskVar = (ksk) this.d;
                ksk kskVar2 = (ksk) this.e;
                ksk kskVar3 = (ksk) this.f;
                ksk kskVar4 = (ksk) this.g;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                boolean z = this.b;
                int i = this.c;
                int i2 = z ? 0 : i;
                if (kskVar != null) {
                    jskVar.d(kskVar, 0, i2, 0.0f);
                }
                if (kskVar2 != null) {
                    jskVar.d(kskVar2, 0, 0, 0.0f);
                }
                if (kskVar3 != null) {
                    jskVar.d(kskVar3, 0, i, 0.0f);
                }
                if (kskVar4 != null) {
                    jskVar.d(kskVar4, 0, 0, 0.0f);
                }
                break;
            default:
                aqi aqiVar = (aqi) this.d;
                mm6 mm6Var = (mm6) this.e;
                fk0 fk0Var = (fk0) this.f;
                d24 d24Var = (d24) this.g;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                boolean z2 = this.b;
                int i3 = this.c;
                if (z2) {
                    wfp.y(jfpVar, new cwo(new jc(aqiVar, 28), new uw1(i3, 2), false));
                } else {
                    wfp.m(jfpVar, new cwo(new jc(aqiVar, 29), new uw1(i3, 3), false));
                }
                jfpVar.o(hfp.d, new sa(null, new vu0(z2, aqiVar, i3, mm6Var, fk0Var, d24Var)));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ljl(boolean z, aqi aqiVar, int i, mm6 mm6Var, fk0 fk0Var, d24 d24Var) {
        this.b = z;
        this.d = aqiVar;
        this.c = i;
        this.e = mm6Var;
        this.f = fk0Var;
        this.g = d24Var;
    }
}
