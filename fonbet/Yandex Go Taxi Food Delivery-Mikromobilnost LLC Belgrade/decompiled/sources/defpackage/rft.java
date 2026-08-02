package defpackage;

import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.user.GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class rft extends vds0 {
    public final j b;

    public rft(kse kseVar, j jVar) {
        super(kseVar.e);
        this.b = jVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(gbb1.d(this.b), new GetUserOnlineStatusUseCase$getUserOnlineStatusFlow$$inlined$flatMapLatest$1((String) obj, null));
    }
}
