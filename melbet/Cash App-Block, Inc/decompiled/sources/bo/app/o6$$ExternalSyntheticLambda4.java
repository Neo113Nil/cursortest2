package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class o6$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ o6 f$0;

    public /* synthetic */ o6$$ExternalSyntheticLambda4(o6 o6Var, int i) {
        this.$r8$classId = i;
        this.f$0 = o6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        o6 o6Var = this.f$0;
        switch (i) {
            case 0:
                return o6.a(o6Var);
            case 1:
                return o6.c(o6Var);
            case 2:
                return o6.d(o6Var);
            default:
                return o6.b(o6Var);
        }
    }
}
