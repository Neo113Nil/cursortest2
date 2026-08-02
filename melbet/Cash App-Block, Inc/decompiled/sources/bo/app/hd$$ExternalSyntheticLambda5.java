package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class hd$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ hd f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ hd$$ExternalSyntheticLambda5(hd hdVar, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = hdVar;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        hd hdVar = this.f$0;
        switch (i) {
            case 0:
                return hd.a(hdVar, j);
            default:
                return hd.b(hdVar, j);
        }
    }
}
