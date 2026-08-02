package app.cash.local.views.cart;

import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewEvent;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ LocalFulfillmentType f$1;

    public /* synthetic */ LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36(Function1 function1, LocalFulfillmentType localFulfillmentType, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = localFulfillmentType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new LocalBrandLocationCartViewEvent.FulfillmentRowSwitchType(this.f$1));
                break;
            case 1:
                this.f$0.invoke(this.f$1);
                break;
            default:
                this.f$0.invoke(new FulfillmentPickerViewEvent.FulfillmentTypeSelected(this.f$1));
                break;
        }
        return Unit.INSTANCE;
    }
}
