package defpackage;

import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;

/* loaded from: classes15.dex */
public final class x2e0 extends zwd0 {
    public final /* synthetic */ PollInfoRequest a;
    public final /* synthetic */ y6f0 b;

    public x2e0(PollInfoRequest pollInfoRequest, y6f0 y6f0Var) {
        this.a = pollInfoRequest;
        this.b = y6f0Var;
    }

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        return PollInfoRequest.copy$default(this.a, null, null, 0L, null, new CommonRequestFields(i2 > 0, i), false, 0, null, 239, null);
    }

    @Override // defpackage.zwd0
    public final void f(PollInfoResponse pollInfoResponse) {
        ((x6f0) this.b).d(pollInfoResponse);
    }
}
