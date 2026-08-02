package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class me3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ksk b;

    public /* synthetic */ me3(ksk kskVar, int i) {
        this.a = i;
        this.b = kskVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                jsk.g(jskVar, this.b, 0, 0);
                break;
            case 1:
                jsk jskVar2 = (jsk) obj;
                jskVar2.getClass();
                jsk.g(jskVar2, this.b, 0, 0);
                break;
            default:
                jsk jskVar3 = (jsk) obj;
                jskVar3.getClass();
                jskVar3.d(this.b, 0, 0, 0.0f);
                break;
        }
        return Unit.a;
    }
}
