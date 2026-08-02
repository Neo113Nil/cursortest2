package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class q2$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ q2 f$0;

    public /* synthetic */ q2$$ExternalSyntheticLambda0(int i, q2 q2Var) {
        this.$r8$classId = i;
        this.f$0 = q2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        q2 q2Var = this.f$0;
        switch (i) {
            case 0:
                return q2.a(q2Var);
            case 1:
                return q2.e(q2Var);
            case 2:
                return q2.d(q2Var);
            case 3:
                return q2.c(q2Var);
            default:
                return q2.b(q2Var);
        }
    }
}
