package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ga2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvf b;

    public /* synthetic */ ga2(fvf fvfVar, int i) {
        this.a = i;
        this.b = fvfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.h.b());
            case 1:
                cvf cvfVar = (cvf) CollectionsKt.firstOrNull(this.b.j().k);
                return Boolean.valueOf(cvfVar != null && cvfVar.a == 0 && cvfVar.p == 0);
            case 2:
                return Integer.valueOf(this.b.i());
            case 3:
                cvf cvfVar2 = (cvf) CollectionsKt.firstOrNull(this.b.j().k);
                return Boolean.valueOf(cvfVar2 != null && cvfVar2.a == 0 && cvfVar2.p == 0);
            case 4:
                return Integer.valueOf(this.b.i());
            case 5:
                return y2x.k(this.b);
            case 6:
                fvf fvfVar = this.b;
                fvfVar.l(fvfVar.h(), fvfVar.i());
                return Unit.a;
            case 7:
                return Integer.valueOf(this.b.i());
            default:
                return Boolean.valueOf(this.b.h.b());
        }
    }
}
