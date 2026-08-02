package defpackage;

import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;

/* loaded from: classes15.dex */
public final class w2e0 extends zwd0 {
    public final /* synthetic */ PollInfoRequest a;
    public final /* synthetic */ j18 b;

    public w2e0(PollInfoRequest pollInfoRequest, j18 j18Var) {
        this.a = pollInfoRequest;
        this.b = j18Var;
    }

    @Override // defpackage.o5t0
    public final Object c(int i, int i2) {
        return PollInfoRequest.copy$default(this.a, null, null, 0L, null, new CommonRequestFields(i2 > 0, i), false, 0, null, 239, null);
    }

    @Override // defpackage.zwd0
    public final void f(PollInfoResponse pollInfoResponse) {
        this.b.resumeWith(pollInfoResponse);
    }
}
