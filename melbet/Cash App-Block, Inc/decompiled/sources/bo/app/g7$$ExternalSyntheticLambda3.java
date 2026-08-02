package bo.app;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g7$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkedHashMap f$0;

    public /* synthetic */ g7$$ExternalSyntheticLambda3(LinkedHashMap linkedHashMap, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LinkedHashMap linkedHashMap = this.f$0;
        switch (i) {
            case 0:
                return g7.a((Map) linkedHashMap);
            case 1:
                return jc.a(linkedHashMap);
            case 2:
                return mg.a(linkedHashMap);
            default:
                return qg.a(linkedHashMap);
        }
    }
}
