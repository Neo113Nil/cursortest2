package bo.app;

import com.braze.BrazeUser;
import com.braze.configuration.CachedConfigurationProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ld$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ld$$ExternalSyntheticLambda5(String str, int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String customAttribute$lambda$1$0;
        String customAttribute$lambda$1$1;
        String resourceConfigurationValue$lambda$0;
        String runtimeConfigurationValue$lambda$0;
        String readResourceValue$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                return ld.a(str, obj);
            case 1:
                return ob.a(str, obj);
            case 2:
                return xg.d(str, obj);
            case 3:
                return xg.b(str, obj);
            case 4:
                customAttribute$lambda$1$0 = BrazeUser.setCustomAttribute$lambda$1$0(str, obj);
                return customAttribute$lambda$1$0;
            case 5:
                customAttribute$lambda$1$1 = BrazeUser.setCustomAttribute$lambda$1$1(str, obj);
                return customAttribute$lambda$1$1;
            case 6:
                resourceConfigurationValue$lambda$0 = CachedConfigurationProvider.getResourceConfigurationValue$lambda$0(str, obj);
                return resourceConfigurationValue$lambda$0;
            case 7:
                runtimeConfigurationValue$lambda$0 = CachedConfigurationProvider.getRuntimeConfigurationValue$lambda$0(str, obj);
                return runtimeConfigurationValue$lambda$0;
            default:
                readResourceValue$lambda$0 = CachedConfigurationProvider.readResourceValue$lambda$0(str, obj);
                return readResourceValue$lambda$0;
        }
    }
}
