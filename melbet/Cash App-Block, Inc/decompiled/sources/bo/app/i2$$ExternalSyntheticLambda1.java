package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class i2$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ i2 f$0;

    public /* synthetic */ i2$$ExternalSyntheticLambda1(i2 i2Var, int i) {
        this.$r8$classId = i;
        this.f$0 = i2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        i2 i2Var = this.f$0;
        switch (i) {
            case 0:
                return i2.c(i2Var);
            case 1:
                return i2.a(i2Var);
            default:
                return i2.b(i2Var);
        }
    }
}
