package androidx.compose.material;

import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.SwipeToDismissBoxValue;
import app.cash.local.viewmodels.CurbsidePickupCarViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewEvent;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewEvent;
import app.cash.local.viewmodels.LocalOrderStatusViewEvent;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchClicked;
import app.cash.local.viewmodels.MapDecisionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class DrawerKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DrawerKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        switch (i) {
            case 3:
                SwipeToDismissBoxValue swipeToDismissBoxValue = SwipeToDismissBoxValue.StartToEnd;
                break;
            default:
                DrawerValue drawerValue = DrawerValue.Closed;
                break;
        }
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LocalOrderStatusViewEvent.BrandPhoneClicked brandPhoneClicked = LocalOrderStatusViewEvent.BrandPhoneClicked.INSTANCE;
        LocalOrderStatusViewEvent.CloseClicked closeClicked = LocalOrderStatusViewEvent.CloseClicked.INSTANCE;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                break;
            case 1:
                function1.invoke(new DisplayMode(1));
                break;
            case 2:
                function1.invoke(new DisplayMode(0));
                break;
            case 3:
                break;
            case 4:
                function1.invoke(CurbsidePickupCarViewEvent.Exit.INSTANCE);
                break;
            case 5:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.BackClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.FulfillmentRowClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.FulfillmentRowAsapClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.FulfillmentRowLaterClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.FulfillmentRowChangeLocationClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.EditBuyerInfoClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.ApplyGiftCardClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(LocalBrandLocationCheckoutViewEvent.VehicleDescriptionClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(LocalOpenTabCheckoutViewEvent.BackClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(LocalOpenTabCheckoutViewEvent.EditBuyerInfoClicked.INSTANCE);
                break;
            case 15:
                function1.invoke(LocalBrandLocationMenuViewEvent.BackClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(LocalBrandLocationMenuViewEvent.MenuSelectorClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(LocalSearchViewEvent$SearchClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(LocalMenuComboDetailsViewEvent.BackClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(LocalMenuItemDetailsViewEvent.BackClicked.INSTANCE);
                break;
            case 20:
                function1.invoke(closeClicked);
                break;
            case 21:
                function1.invoke(closeClicked);
                break;
            case 22:
                function1.invoke(LocalOrderStatusViewEvent.MapClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(LocalOrderStatusViewEvent.ImHereClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(closeClicked);
                break;
            case 25:
                function1.invoke(brandPhoneClicked);
                break;
            case 26:
                function1.invoke(LocalOrderStatusViewEvent.CourierPhoneClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(brandPhoneClicked);
                break;
            case 28:
                function1.invoke(MapDecisionEvent.Cancel.INSTANCE);
                break;
            default:
                function1.invoke(closeClicked);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DrawerKt$$ExternalSyntheticLambda1(Function1 function1, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
    }
}
