package app.cash.local.views.cart;

import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewEvent;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.LocalOrderStatusViewEvent;
import app.cash.local.viewmodels.MapDecisionEvent;
import app.cash.local.viewmodels.MoreOptionsMenuEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MapDecisionEvent.Cancel cancel = MapDecisionEvent.Cancel.INSTANCE;
        MoreOptionsMenuEvent.ShareProfile shareProfile = MoreOptionsMenuEvent.ShareProfile.INSTANCE;
        LocalBrandLocationCartViewEvent.OpenTabClicked openTabClicked = LocalBrandLocationCartViewEvent.OpenTabClicked.INSTANCE;
        MoreOptionsMenuEvent.AddBrandClicked addBrandClicked = MoreOptionsMenuEvent.AddBrandClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(LocalBrandLocationCartViewEvent.BackClicked.INSTANCE);
                break;
            case 1:
                function1.invoke(LocalOrderStatusViewEvent.RetryClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(LocalOrderStatusViewEvent.ArrivalToastDismissed.INSTANCE);
                break;
            case 3:
                function1.invoke(LocalBrandProfileViewEvent.LocationAddressClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(MapDecisionEvent.OpenGoogleMap.INSTANCE);
                break;
            case 5:
                function1.invoke(MapDecisionEvent.CopyAddress.INSTANCE);
                break;
            case 6:
                function1.invoke(MapDecisionEvent.CopyPhone.INSTANCE);
                break;
            case 7:
                function1.invoke(cancel);
                break;
            case 8:
                function1.invoke(LocalBrandProfileViewEvent.ShowAllMessagesClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(LocalBrandProfileViewEvent.MenuSelectorClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(LocalBrandProfileViewEvent.BackClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(cancel);
                break;
            case 12:
                function1.invoke(LocalBrandProfileViewEvent.OfferToastDismissed.INSTANCE);
                break;
            case 13:
                function1.invoke(LocalBrandProfileViewEvent.InvalidCouponToastDismissed.INSTANCE);
                break;
            case 14:
                function1.invoke(LocalBrandProfileViewEvent.StartOrderingClicked.INSTANCE);
                break;
            case 15:
                function1.invoke(LocalBrandProfileViewEvent.CheckedInSheetDismissed.INSTANCE);
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                function1.invoke(shareProfile);
                break;
            case 20:
                function1.invoke(addBrandClicked);
                break;
            case 21:
                function1.invoke(LocalBrandLocationCartViewEvent.AddItemsClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(LocalBrandLocationCartViewEvent.TermsClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(openTabClicked);
                break;
            case 24:
                function1.invoke(LocalBrandLocationCartViewEvent.FulfillmentRowClicked.INSTANCE);
                break;
            case 25:
                function1.invoke(LocalBrandLocationCartViewEvent.FulfillmentRowChangeLocationClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(openTabClicked);
                break;
            case 27:
                function1.invoke(LocalBrandLocationCartViewEvent.FulfillmentRowAsapClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(LocalBrandLocationCartViewEvent.FulfillmentRowLaterClicked.INSTANCE);
                break;
            default:
                function1.invoke(LocalBrandLocationOpenTabViewEvent.BackClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
