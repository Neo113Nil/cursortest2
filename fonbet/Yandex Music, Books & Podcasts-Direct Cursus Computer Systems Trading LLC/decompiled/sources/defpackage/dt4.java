package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class dt4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ksk c;
    public final /* synthetic */ int d;

    public /* synthetic */ dt4(int i, int i2, ksk kskVar) {
        this.a = 1;
        this.b = i;
        this.c = kskVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        switch (this.a) {
            case 0:
                jskVar.getClass();
                ksk kskVar = this.c;
                if (kskVar != null) {
                    jsk.g(jskVar, kskVar, 0, this.b - this.d);
                }
                break;
            case 1:
                jskVar.getClass();
                jskVar.d(this.c, eeh.b((this.b - r0.a) / 2.0f), eeh.b((this.d - r0.b) / 2.0f), 0.0f);
                break;
            case 2:
                jskVar.getClass();
                jskVar.d(this.c, -this.b, -this.d, 0.0f);
                break;
            case 3:
                jskVar.getClass();
                jskVar.d(this.c, this.b, -this.d, 0.0f);
                break;
            default:
                jskVar.getClass();
                jskVar.d(this.c, this.b, -this.d, 0.0f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dt4(ksk kskVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = kskVar;
        this.b = i;
        this.d = i2;
    }
}
