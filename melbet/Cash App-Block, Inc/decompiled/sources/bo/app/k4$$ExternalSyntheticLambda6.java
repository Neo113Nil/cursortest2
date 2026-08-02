package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class k4$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ k4 f$0;

    public /* synthetic */ k4$$ExternalSyntheticLambda6(k4 k4Var, int i) {
        this.$r8$classId = i;
        this.f$0 = k4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        k4 k4Var = this.f$0;
        switch (i) {
            case 0:
                return k4.b(k4Var);
            case 1:
                return k4.a(k4Var);
            case 2:
                return k4.c(k4Var);
            default:
                return k4.d(k4Var);
        }
    }
}
