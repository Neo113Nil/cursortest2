package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.translator.GetTranslationStatusesUseCase$run$$inlined$flatMapLatest$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class vet extends vds0 {
    public final kse b;
    public final b c;

    public vet(kse kseVar, b bVar) {
        super(kseVar.b);
        this.b = kseVar;
        this.c = bVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.F(e.X(this.c.b((ChatRequest) obj), new GetTranslationStatusesUseCase$run$$inlined$flatMapLatest$1(3, null)), this.b.e);
    }
}
