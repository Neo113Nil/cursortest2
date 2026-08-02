package app.cash.zipline.loader;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes3.dex */
public final class OkHttpZiplineHttpClient$download$2$1 implements Function1 {
    public final /* synthetic */ RealCall $call;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OkHttpZiplineHttpClient$download$2$1(RealCall realCall, int i) {
        this.$r8$classId = i;
        this.$call = realCall;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RealCall realCall = this.$call;
        switch (i) {
            case 0:
                realCall.cancel();
                break;
            default:
                realCall.cancel();
                break;
        }
        return Unit.INSTANCE;
    }
}
