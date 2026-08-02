package bo.app;

import com.braze.support.ReflectionUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class yf$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Ref$ObjectRef f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ yf$$ExternalSyntheticLambda9(String str, Ref$ObjectRef ref$ObjectRef) {
        this.f$1 = str;
        this.f$0 = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String declaredMethodQuietly$lambda$0;
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.f$0;
        String str = this.f$1;
        switch (i) {
            case 0:
                return yf.a(ref$ObjectRef, str);
            default:
                declaredMethodQuietly$lambda$0 = ReflectionUtils.getDeclaredMethodQuietly$lambda$0(str, ref$ObjectRef);
                return declaredMethodQuietly$lambda$0;
        }
    }

    public /* synthetic */ yf$$ExternalSyntheticLambda9(Ref$ObjectRef ref$ObjectRef, String str) {
        this.f$0 = ref$ObjectRef;
        this.f$1 = str;
    }
}
