package defpackage;

import com.yandex.messaging.domain.folders.GetFoldersUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.storage.folders.d;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class t7t extends vds0 {
    public final d b;
    public final w5t c;

    public t7t(kse kseVar, w5t w5tVar, d dVar) {
        super(kseVar.b);
        this.b = dVar;
        this.c = w5tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(this.c.a(zy11.a), new GetFoldersUseCase$run$$inlined$flatMapLatest$1(null, this));
    }
}
