package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ b f$0;

    public /* synthetic */ b$$ExternalSyntheticLambda1(b bVar, int i) {
        this.$r8$classId = i;
        this.f$0 = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        b bVar = this.f$0;
        switch (i) {
            case 0:
                return b.a(bVar);
            default:
                return b.b(bVar);
        }
    }
}
