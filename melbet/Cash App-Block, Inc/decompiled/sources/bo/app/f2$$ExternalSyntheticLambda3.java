package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f2$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ f2$$ExternalSyntheticLambda3(int i, long j, long j2, long j3) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = j2;
        this.f$2 = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return f2.a(this.f$0, this.f$1, this.f$2);
            default:
                return jg.a(this.f$0, this.f$1, this.f$2);
        }
    }
}
