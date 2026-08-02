package defpackage;

import com.yandex.messaging.domain.privacy.GetUserPrivacyDataUseCase$run$$inlined$disposableFlowWrapper$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class sft extends vds0 {
    public final b4f0 b;

    public sft(kse kseVar, b4f0 b4f0Var) {
        super(kseVar.b);
        this.b = b4f0Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.i(new GetUserPrivacyDataUseCase$run$$inlined$disposableFlowWrapper$1(null, this));
    }
}
