package defpackage;

import com.yandex.messaging.domain.folders.GetMainFolderExcludedFoldersIdsUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.storage.folders.d;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class t8t extends vds0 {
    public final w5t b;
    public final d c;

    public t8t(kse kseVar, w5t w5tVar, d dVar) {
        super(kseVar.e);
        this.b = w5tVar;
        this.c = dVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(this.b.a(zy11.a), new GetMainFolderExcludedFoldersIdsUseCase$run$$inlined$flatMapLatest$1(null, this));
    }
}
