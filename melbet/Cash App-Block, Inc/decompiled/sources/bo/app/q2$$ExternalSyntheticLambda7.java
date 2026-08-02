package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class q2$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ za f$0;

    public /* synthetic */ q2$$ExternalSyntheticLambda7(za zaVar, int i) {
        this.$r8$classId = i;
        this.f$0 = zaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        za zaVar = this.f$0;
        switch (i) {
            case 0:
                return q2.e(zaVar);
            case 1:
                return q2.c(zaVar);
            case 2:
                return q2.d(zaVar);
            case 3:
                return q2.f(zaVar);
            case 4:
                return q2.a(zaVar);
            default:
                return q2.b(zaVar);
        }
    }
}
