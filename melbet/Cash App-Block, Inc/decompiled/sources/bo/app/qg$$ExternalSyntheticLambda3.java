package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class qg$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ y9 f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ qg$$ExternalSyntheticLambda3(y9 y9Var, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = y9Var;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        y9 y9Var = this.f$0;
        switch (i) {
            case 0:
                return qg.c(y9Var, j);
            case 1:
                return mg.a(y9Var, j);
            default:
                return qg.b(y9Var, j);
        }
    }
}
