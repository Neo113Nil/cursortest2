package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c7$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ c7 f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ c7$$ExternalSyntheticLambda1(c7 c7Var, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = c7Var;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        c7 c7Var = this.f$0;
        switch (i) {
            case 0:
                return c7.d(c7Var, j);
            case 1:
                return c7.c(c7Var, j);
            case 2:
                return c7.a(c7Var, j);
            default:
                return c7.b(c7Var, j);
        }
    }
}
