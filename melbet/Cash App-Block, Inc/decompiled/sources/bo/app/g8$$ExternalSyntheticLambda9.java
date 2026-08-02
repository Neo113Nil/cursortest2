package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g8$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ g8 f$0;

    public /* synthetic */ g8$$ExternalSyntheticLambda9(g8 g8Var, int i) {
        this.$r8$classId = i;
        this.f$0 = g8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        g8 g8Var = this.f$0;
        switch (i) {
            case 0:
                return g8.b(g8Var);
            default:
                return g8.a(g8Var);
        }
    }
}
