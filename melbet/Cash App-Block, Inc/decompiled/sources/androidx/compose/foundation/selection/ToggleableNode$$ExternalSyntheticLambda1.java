package androidx.compose.foundation.selection;

import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewEvent;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ToggleableNode$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ ToggleableNode$$ExternalSyntheticLambda1(Function1 function1, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(Boolean.valueOf(!z));
                break;
            case 1:
                function1.invoke(Boolean.valueOf(!z));
                break;
            case 2:
                function1.invoke(z ? LocalBrandLocationCartViewEvent.FinishAndPayClicked.INSTANCE : LocalBrandLocationCartViewEvent.CheckoutClicked.INSTANCE);
                break;
            case 3:
                if (!z) {
                    function1.invoke(AddPayerCustomersViewEvent.Dismiss.INSTANCE);
                }
                break;
            case 4:
                function1.invoke(Boolean.valueOf(z));
                break;
            case 5:
                if (z) {
                    function1.invoke(PoolMoreOptionsBottomSheetViewEvent.ClosePool.INSTANCE);
                } else {
                    function1.invoke(PoolMoreOptionsBottomSheetViewEvent.LeavePool.INSTANCE);
                }
                break;
            default:
                function1.invoke(Boolean.valueOf(!z));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToggleableNode$$ExternalSyntheticLambda1(boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = function1;
    }
}
