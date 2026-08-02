package flex.network.cache;

import defpackage.kp50;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class NetworkCaching$Default$2 extends FunctionReferenceImpl implements sls {
    public static final NetworkCaching$Default$2 b = new NetworkCaching$Default$2(0, 1, kp50.class, "currentTime", "currentTime()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
