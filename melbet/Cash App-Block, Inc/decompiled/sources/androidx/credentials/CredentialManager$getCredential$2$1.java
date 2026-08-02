package androidx.credentials;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class CredentialManager$getCredential$2$1 implements Function1 {
    public final /* synthetic */ CancellationSignal $canceller;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CredentialManager$getCredential$2$1(CancellationSignal cancellationSignal, int i) {
        this.$r8$classId = i;
        this.$canceller = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CancellationSignal cancellationSignal = this.$canceller;
        switch (i) {
            case 0:
                cancellationSignal.cancel();
                break;
            default:
                cancellationSignal.cancel();
                break;
        }
        return Unit.INSTANCE;
    }
}
