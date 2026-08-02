package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b4k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ksk b;
    public final /* synthetic */ int c;

    public /* synthetic */ b4k(int i, int i2, ksk kskVar) {
        this.a = i2;
        this.b = kskVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        switch (this.a) {
            case 0:
                jskVar.getClass();
                jskVar.d(this.b, -this.c, 0, 0.0f);
                break;
            case 1:
                jskVar.getClass();
                jskVar.d(this.b, 0, this.c, 0.0f);
                break;
            case 2:
                jskVar.getClass();
                jsk.g(jskVar, this.b, this.c, 0);
                break;
            case 3:
                jskVar.getClass();
                jsk.g(jskVar, this.b, this.c / 2, 0);
                break;
            default:
                jskVar.getClass();
                jsk.g(jskVar, this.b, 0, -this.c);
                break;
        }
        return Unit.a;
    }
}
