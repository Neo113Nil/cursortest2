package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class k4$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ k4 f$1;

    public /* synthetic */ k4$$ExternalSyntheticLambda9(long j, k4 k4Var, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = k4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        k4 k4Var = this.f$1;
        long j = this.f$0;
        switch (i) {
            case 0:
                return k4.b(j, k4Var);
            default:
                return k4.a(j, k4Var);
        }
    }
}
