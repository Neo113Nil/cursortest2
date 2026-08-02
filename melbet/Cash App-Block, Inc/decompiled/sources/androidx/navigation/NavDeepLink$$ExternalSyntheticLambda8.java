package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class NavDeepLink$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bundle f$0;

    public /* synthetic */ NavDeepLink$$ExternalSyntheticLambda8(Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean containsKey;
        int i = this.$r8$classId;
        Bundle bundle = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
