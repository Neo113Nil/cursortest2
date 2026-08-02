package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class gd$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ nb f$0;

    public /* synthetic */ gd$$ExternalSyntheticLambda0(nb nbVar, int i) {
        this.$r8$classId = i;
        this.f$0 = nbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        nb nbVar = this.f$0;
        switch (i) {
            case 0:
                return gd.b(nbVar);
            case 1:
                return nb.a(nbVar);
            default:
                return nb.b(nbVar);
        }
    }
}
