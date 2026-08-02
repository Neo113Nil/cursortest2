package bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ ArrayList f$1;

    public /* synthetic */ n$$ExternalSyntheticLambda3(List list, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$1;
        List list = this.f$0;
        switch (i) {
            case 0:
                return n.a(list, arrayList);
            default:
                return qc.a(list, arrayList);
        }
    }
}
