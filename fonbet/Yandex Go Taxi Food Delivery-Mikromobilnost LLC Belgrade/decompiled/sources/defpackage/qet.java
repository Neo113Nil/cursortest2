package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.textsuggest.GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class qet {
    public final ChatRequest a;
    public final b b;
    public final kse c;

    public qet(kse kseVar, ChatRequest chatRequest, b bVar) {
        this.a = chatRequest;
        this.b = bVar;
        this.c = kseVar;
    }

    public final tpr a(String str) {
        return e.X(e.F(this.b.b(this.a), this.c.e), new GetTextSuggestUseCase$execute$$inlined$flatMapLatest$1(str, null));
    }
}
