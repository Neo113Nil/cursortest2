package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class oa$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ oa f$0;

    public /* synthetic */ oa$$ExternalSyntheticLambda0(oa oaVar, int i) {
        this.$r8$classId = i;
        this.f$0 = oaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        oa oaVar = this.f$0;
        switch (i) {
            case 0:
                return oa.b(oaVar);
            default:
                return oa.a(oaVar);
        }
    }
}
