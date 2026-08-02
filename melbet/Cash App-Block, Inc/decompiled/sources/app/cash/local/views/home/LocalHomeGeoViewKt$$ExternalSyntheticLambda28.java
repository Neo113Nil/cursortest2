package app.cash.local.views.home;

import app.cash.local.viewmodels.LocalAddBrandsViewEvent;
import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewEvent;
import app.cash.local.viewmodels.LocalCashAllActivityViewEvent;
import app.cash.local.viewmodels.LocalCashBalanceViewEvent;
import app.cash.local.viewmodels.LocalEditorialViewEvent;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchCleared;
import app.cash.local.viewmodels.PhoneRowEvent$PhoneClicked;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewEvent;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewEvent;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionMapViewEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda28 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda28(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LocalCashBalanceViewEvent.ButtonClicked buttonClicked = LocalCashBalanceViewEvent.ButtonClicked.INSTANCE;
        LocalCashBalanceViewEvent.SheetDismissed sheetDismissed = LocalCashBalanceViewEvent.SheetDismissed.INSTANCE;
        SchedulingDayTimePickerViewEvent.BackClicked backClicked = SchedulingDayTimePickerViewEvent.BackClicked.INSTANCE;
        TableQrCodeScannerViewEvent.NavigationClicked navigationClicked = TableQrCodeScannerViewEvent.NavigationClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(CashMapViewEvent.CenterOnUserLocationClick.INSTANCE);
                break;
            case 1:
                function1.invoke(LocalBrandLocationOpenTabViewEvent.AddItemsClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(LocalBrandLocationOpenTabViewEvent.FinishAndPayClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(sheetDismissed);
                break;
            case 4:
                function1.invoke(LocalAddBrandsViewEvent.CancelClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(LocalSearchViewEvent$SearchCleared.INSTANCE);
                break;
            case 6:
                function1.invoke(LocalAddBrandsViewEvent.DoneClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(LocalCashAllActivityViewEvent.BackClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(LocalCashBalanceViewEvent.Dismiss.INSTANCE);
                break;
            case 9:
                function1.invoke(buttonClicked);
                break;
            case 10:
                function1.invoke(buttonClicked);
                break;
            case 11:
                function1.invoke(LocalCashBalanceViewEvent.ManageCardsClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(sheetDismissed);
                break;
            case 13:
                function1.invoke(LocalCashBalanceViewEvent.CheckInClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(LocalEditorialViewEvent.BackClicked.INSTANCE);
                break;
            case 15:
                function1.invoke(LocalEditorialViewEvent.ShareClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(FulfillmentPickerViewEvent.Dismissed.INSTANCE);
                break;
            case 17:
                function1.invoke(backClicked);
                break;
            case 18:
                function1.invoke(SchedulingDayTimePickerViewEvent.RetryLoadingTimes.INSTANCE);
                break;
            case 19:
                function1.invoke(SchedulingDayTimePickerViewEvent.RetryLoadingDays.INSTANCE);
                break;
            case 20:
                function1.invoke(backClicked);
                break;
            case 21:
                function1.invoke(SchedulingDayTimePickerViewEvent.ConfirmClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(LocalHomeViewEvent.LocalCashClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(LocalHomeViewEvent.CheckInClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(navigationClicked);
                break;
            case 25:
                function1.invoke(navigationClicked);
                break;
            case 26:
                function1.invoke(LocalBottomModalViewEvent.BottomModalLinkClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(LocalCashBalanceViewEvent.ViewAllClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(PhoneRowEvent$PhoneClicked.INSTANCE);
                break;
            default:
                function1.invoke(BrandCollectionMapViewEvent.BackClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
