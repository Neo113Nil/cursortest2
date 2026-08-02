package bo.app;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class u4$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ u4$$ExternalSyntheticLambda1(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String _set_outboundNetworkRequestsOffline_$lambda$0;
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                return u4.a(z);
            case 1:
                return Boolean.valueOf(z);
            default:
                _set_outboundNetworkRequestsOffline_$lambda$0 = Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(z);
                return _set_outboundNetworkRequestsOffline_$lambda$0;
        }
    }
}
