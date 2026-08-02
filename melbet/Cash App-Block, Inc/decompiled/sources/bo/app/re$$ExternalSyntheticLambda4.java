package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class re$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ re f$0;

    public /* synthetic */ re$$ExternalSyntheticLambda4(re reVar, int i) {
        this.$r8$classId = i;
        this.f$0 = reVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        re reVar = this.f$0;
        switch (i) {
            case 0:
                return re.a(reVar);
            default:
                return ue.b(reVar);
        }
    }
}
