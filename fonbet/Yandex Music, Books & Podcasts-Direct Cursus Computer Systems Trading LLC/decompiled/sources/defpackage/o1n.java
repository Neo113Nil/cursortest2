package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class o1n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2n b;

    public /* synthetic */ o1n(j2n j2nVar, int i) {
        this.a = i;
        this.b = j2nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.h().b(false);
                return Unit.a;
            default:
                j2n j2nVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(tya.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new y74((tya) qdcVar.C(I), j2nVar.b);
        }
    }
}
