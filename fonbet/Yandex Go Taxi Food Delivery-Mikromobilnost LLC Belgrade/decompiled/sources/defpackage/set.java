package defpackage;

import android.app.Activity;
import com.yandex.messaging.internal.GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.t;
import com.yandex.messaging.internal.view.timeline.l;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class set extends vds0 {
    public final p4t b;
    public final c9t c;
    public final t d;
    public final tmt0 e;
    public final l f;
    public final noy0 g;

    public set(Activity activity, p4t p4tVar, c9t c9tVar, t tVar, tmt0 tmt0Var, l lVar, kse kseVar, noy0 noy0Var) {
        super(kseVar.b);
        this.b = p4tVar;
        this.c = c9tVar;
        this.d = tVar;
        this.e = tmt0Var;
        this.f = lVar;
        this.g = noy0Var;
        lVar.c = fxa1.c(jng0.messagingIncomingLinkColor, activity).data;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ThreadChat threadChat = (ThreadChat) obj;
        return e.X(this.b.a(threadChat), new GetThreadMessagePreviewUseCase$run$$inlined$flatMapLatest$1(null, this, threadChat.parent()));
    }
}
