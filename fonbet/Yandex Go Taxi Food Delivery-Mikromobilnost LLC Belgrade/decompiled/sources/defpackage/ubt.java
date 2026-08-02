package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequestBuilder;
import com.yandex.messaging.domain.poll.GetPollInfoUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.j;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class ubt extends vds0 {
    public final j b;

    public ubt(kse kseVar, j jVar) {
        super(kseVar.e);
        this.b = jVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        tbt tbtVar = (tbt) obj;
        PollInfoRequestBuilder pollInfoRequestBuilder = new PollInfoRequestBuilder();
        pollInfoRequestBuilder.a = tbtVar.a;
        pollInfoRequestBuilder.b = tbtVar.b;
        pollInfoRequestBuilder.d = tbtVar.c;
        pollInfoRequestBuilder.e = tbtVar.d;
        pollInfoRequestBuilder.f = tbtVar.e;
        return e.X(gbb1.d(this.b), new GetPollInfoUseCase$run$$inlined$flatMapLatest$1(null, new PollInfoRequest(pollInfoRequestBuilder)));
    }
}
