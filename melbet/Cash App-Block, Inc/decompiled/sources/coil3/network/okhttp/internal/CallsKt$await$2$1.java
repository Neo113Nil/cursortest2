package coil3.network.okhttp.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes3.dex */
public final class CallsKt$await$2$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Call $this_await;

    public /* synthetic */ CallsKt$await$2$1(Call call, int i) {
        this.$r8$classId = i;
        this.$this_await = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((RealCall) this.$this_await).cancel();
                break;
            default:
                ((RealCall) this.$this_await).cancel();
                break;
        }
        return Unit.INSTANCE;
    }
}
