package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.GetChatMessageCountUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class t4t extends vds0 {
    public final b b;
    public final at2 c;

    public t4t(b bVar, at2 at2Var, kse kseVar) {
        super(kseVar.e);
        this.b = bVar;
        this.c = at2Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(this.b.b((ChatRequest) obj), new GetChatMessageCountUseCase$run$$inlined$flatMapLatest$1(null, this));
    }
}
