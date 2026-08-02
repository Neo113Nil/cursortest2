package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class w8$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ kd f$0;

    public /* synthetic */ w8$$ExternalSyntheticLambda0(kd kdVar, int i) {
        this.$r8$classId = i;
        this.f$0 = kdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        kd kdVar = this.f$0;
        switch (i) {
            case 0:
                return w8.a(kdVar);
            default:
                return l2.a(kdVar);
        }
    }
}
