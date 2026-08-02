package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.GetChatMetadataUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class u4t extends vds0 {
    public final b b;

    public u4t(kse kseVar, b bVar) {
        super(kseVar.e);
        this.b = bVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(this.b.b((ChatRequest) obj), new GetChatMetadataUseCase$run$$inlined$flatMapLatest$1(3, null));
    }
}
