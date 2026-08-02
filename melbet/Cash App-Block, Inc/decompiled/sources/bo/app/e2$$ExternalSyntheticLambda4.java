package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e2$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ e2 f$0;

    public /* synthetic */ e2$$ExternalSyntheticLambda4(e2 e2Var, int i) {
        this.$r8$classId = i;
        this.f$0 = e2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        e2 e2Var = this.f$0;
        switch (i) {
            case 0:
                return e2.c(e2Var);
            case 1:
                return e2.e(e2Var);
            case 2:
                return e2.b(e2Var);
            case 3:
                return e2.d(e2Var);
            case 4:
                return e2.a(e2Var);
            default:
                return e2.f(e2Var);
        }
    }
}
