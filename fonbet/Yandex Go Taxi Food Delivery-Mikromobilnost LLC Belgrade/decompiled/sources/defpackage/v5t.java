package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.unreadcount.GetCurrentOrgUnreadCountUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.domain.unreadcount.d;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class v5t extends vds0 {
    public final w5t b;
    public final d c;
    public final lqo d;

    public v5t(w5t w5tVar, d dVar, lqo lqoVar, kse kseVar) {
        super(kseVar.b);
        this.b = w5tVar;
        this.c = dVar;
        this.d = lqoVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        return e.t(this.d.a(tz10.j) ? e.X(this.b.a(zy11.a), new GetCurrentOrgUnreadCountUseCase$run$$inlined$flatMapLatest$1(null, this, chatRequest)) : d.d(this.c, null, chatRequest, 4));
    }
}
