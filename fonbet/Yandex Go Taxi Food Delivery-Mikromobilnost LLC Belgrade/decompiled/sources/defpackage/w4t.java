package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.GetChatOrganizationsCountUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class w4t extends vds0 {
    public final b b;
    public final k020 c;
    public final kse d;
    public final sb7 e;
    public final h3y f;
    public final p4t g;

    public w4t(b bVar, k020 k020Var, kse kseVar, sb7 sb7Var, h3y h3yVar, p4t p4tVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = k020Var;
        this.d = kseVar;
        this.e = sb7Var;
        this.f = h3yVar;
        this.g = p4tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        if (((y6b) this.f.get()).c) {
            return e.F(e.X(e.t(new syc(this.g.a(chatRequest), 19)), new GetChatOrganizationsCountUseCase$run$$inlined$flatMapLatest$1(this, chatRequest, null)), this.d.b);
        }
        return new g92(2, 0);
    }
}
