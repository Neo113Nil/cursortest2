package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class oa$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ v9 f$0;

    public /* synthetic */ oa$$ExternalSyntheticLambda1(v9 v9Var, int i) {
        this.$r8$classId = i;
        this.f$0 = v9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        v9 v9Var = this.f$0;
        switch (i) {
            case 0:
                return oa.c(v9Var);
            case 1:
                return mg.b(v9Var);
            case 2:
                return mg.c(v9Var);
            case 3:
                return mg.e(v9Var);
            default:
                return oa.d(v9Var);
        }
    }
}
