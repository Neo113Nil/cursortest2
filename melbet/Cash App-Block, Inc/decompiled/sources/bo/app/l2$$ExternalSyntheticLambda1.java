package bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class l2$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ l2 f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ l2$$ExternalSyntheticLambda1(l2 l2Var, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = l2Var;
        this.f$1 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        List list = this.f$1;
        l2 l2Var = this.f$0;
        switch (i) {
            case 0:
                return l2.b(l2Var, list);
            case 1:
                return l2.a(l2Var, list);
            default:
                return l2.c(l2Var, list);
        }
    }
}
