package com.squareup.cash.dialog;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.core.view.ViewConfigurationCompat;
import app.cash.broadway.ui.compose.UiScope;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.routers.moneybot.MoneybotRouter;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.clipboard.RealClipboardObserver$clipboardManagerChanges$1$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewEvent;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.Benefit;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel$DistributionsSection$NullState;
import com.squareup.cash.earningstracker.viewmodels.CustomerViewModel;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewEvent;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewEvent;
import com.squareup.cash.earningstracker.viewmodels.TimeframeViewModel;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent$ToggleEvent$LimitClicked;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewEvent;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.observability.types.SampleStrategy$Companion$SampleAll;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.kgoose.api.v3.ClientKickoffParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal2Kt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ArcadeModal2Kt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.$r8$classId;
        Object[] objArr = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (!((UiScope) obj2).$$delegate_0.getTransition().isRunning()) {
                    function0.invoke();
                }
                break;
            case 1:
                MoneybotRouter moneybotRouter = (MoneybotRouter) obj;
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(((ClientRoute.ViewMoneybotChat) obj2).base64EncodedJsonParams);
                if (decodeBase64 != null) {
                    try {
                        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) moneybotRouter.moshi.adapter(ClientKickoffParams.class, Util.NO_ANNOTATIONS, null).fromJson(decodeBase64.utf8());
                        if (clientKickoffParams != null) {
                            break;
                        }
                    } catch (Exception e) {
                        moneybotRouter.errorReporter.report(new GeneralMoneybotError("Failed to parse kickoff parameters from base64 encoded JSON", e), SampleStrategy$Companion$SampleAll.INSTANCE);
                        return null;
                    }
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                ((RealClipboardObserver) obj2).clipboard.clipboard.removePrimaryClipChangedListener((RealClipboardObserver$clipboardManagerChanges$1$$ExternalSyntheticLambda0) obj);
                break;
            case 7:
                Painter painter = (Painter) obj2;
                if (((Throwable) ((MutableState) obj).getValue()) != null) {
                    break;
                } else if (painter.mo759getIntrinsicSizeNHjbRc() != 9205357640488583168L) {
                    break;
                } else {
                    break;
                }
            case 8:
                float floatValue = ((Number) ((State) obj2).getValue()).floatValue();
                if (((Boolean) ((Function0) obj).invoke()).booleanValue()) {
                    floatValue = 1.0f - floatValue;
                }
                break;
            case 9:
                BackStack$ScreenEntry.Overlay overlay = (BackStack$ScreenEntry.Overlay) obj;
                break;
            case 10:
                ((Function1) obj2).invoke(new BitcoinP2pConversionPercentageViewEvent.SelectPercentage(((BitcoinP2pConversionPercentageViewModel.Content.PickerOption) obj).bps));
                break;
            case 11:
                ((Function1) obj2).invoke(new PaperMoneyDepositBarcodeEvent.HelpClick(((PaperMoneyDepositBarcodeViewModel.Ready) obj).success.support_url));
                break;
            case 12:
                String str2 = ((Benefit) obj).buttonClientRoute;
                str2.getClass();
                ((Function1) obj2).invoke(new AtmExplainerViewEvent.LinkClientRoute(str2));
                break;
            case 13:
                ((Function1) obj2).invoke(new AtmExplainerViewEvent.LinkClientRoute(((AtmExplainerViewModel) obj).helpButtonClientRoute));
                break;
            case 14:
                PaperMoneyDepositMapViewModel.DepositMethodFilter depositMethodFilter = (PaperMoneyDepositMapViewModel.DepositMethodFilter) obj2;
                MutableState mutableState = (MutableState) obj;
                if (((List) mutableState.getValue()).contains(depositMethodFilter)) {
                    List list = (List) mutableState.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((PaperMoneyDepositMapViewModel.DepositMethodFilter) obj3) != depositMethodFilter) {
                            arrayList.add(obj3);
                        }
                    }
                    mutableState.setValue(arrayList);
                } else {
                    mutableState.setValue(CollectionsKt.plus((Collection) mutableState.getValue(), (Object) depositMethodFilter));
                }
                break;
            case 15:
                ((Function1) obj2).invoke(new DirectDepositManualFormDetailsViewEvent.CheckAddSignature(!((DirectDepositManualFormDetailsViewModel) obj).addSignature));
                break;
            case 16:
                ((Function1) obj2).invoke(new DirectDepositUpdateManualFormDetailsViewEvent.CheckAddSignature(!((DirectDepositUpdateManualFormDetailsViewModel.Content) ((DirectDepositUpdateManualFormDetailsViewModel) obj)).addSignature));
                break;
            case 17:
                ((Function1) obj2).invoke((DateFilter) obj);
                break;
            case 18:
                ((Function1) obj2).invoke(((EarningsHomeViewModel$DistributionsSection$NullState) obj).callToActionButtonAction);
                break;
            case 19:
                ((Function1) obj2).invoke(((EarningsHomeViewModel.Loaded.Button) obj).action);
                break;
            case 20:
                ((MutableState) obj).setValue((EarningsHomeViewModel.EarnerModeSheet.DurationOption) obj2);
                break;
            case 21:
                JobKt.launch$default((CoroutineScope) obj2, null, null, new RealProfileManager$profileOrNull$2((TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj, objArr == true ? 1 : 0, 8), 3);
                break;
            case 22:
                ((Function1) obj2).invoke(new EarningsTimeframeSelectorSheetViewEvent.TimeframeClicked(((TimeframeViewModel) obj).timeframe));
                break;
            case 23:
                ((Function1) obj2).invoke(new EarningsTrackerViewEvent.CustomerClicked(((CustomerViewModel) obj).customerToken));
                break;
            case 24:
                ((ScoreAppletViewsModule$$ExternalSyntheticLambda1) obj2).invoke(new AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile(((AllowanceAppletTileViewModel.Uninstalled) obj).initializationUrl));
                break;
            case 25:
                DependentSavingsScreenPresenter dependentSavingsScreenPresenter = (DependentSavingsScreenPresenter) obj2;
                SavingsBalance savingsBalance = (SavingsBalance) obj;
                DependentGeneralSavingsScreen dependentGeneralSavingsScreen = dependentSavingsScreenPresenter.screen;
                SavingsScreen.ScreenType screenType = dependentGeneralSavingsScreen.screenType;
                String str3 = dependentGeneralSavingsScreen.dependentCustomerToken;
                boolean z = screenType instanceof SavingsScreen.ScreenType.GoalDetail;
                ActivityTokenType activityTokenType = (z || (screenType instanceof SavingsScreen.ScreenType.GeneralSavings)) ? ActivityTokenType.SAVINGS_FOLDER_TOKEN : ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT;
                ActivitiesManager.ActivityContext savingsActivityContext = z ? ViewConfigurationCompat.savingsActivityContext(ActivityScope.SPONSORED_ACCOUNT, activityTokenType, str3, ((SavingsScreen.ScreenType.GoalDetail) screenType).token) : screenType instanceof SavingsScreen.ScreenType.GeneralSavings ? (savingsBalance == null || (str = savingsBalance.token) == null) ? null : ViewConfigurationCompat.savingsActivityContext(ActivityScope.SPONSORED_ACCOUNT, activityTokenType, str3, str) : ViewConfigurationCompat.savingsActivityContext$default(str3, activityTokenType, null, ActivityScope.SPONSORED_ACCOUNT, 4);
                break;
            case 26:
                ((Function1) obj2).invoke(new AllowanceViewEvent.TapAllowanceDetail(((AllowanceViewModel.AllowanceDetail) obj).token));
                break;
            case 27:
                ((Function1) obj2).invoke(new DependentControlViewEvent$ToggleEvent$LimitClicked((ControlType) obj));
                break;
            case 28:
                Function1 function1 = (Function1) obj;
                if (((Integer) obj2) != null) {
                    function1.invoke(DependentControlsAndLimitsViewEvent.TapBlockedAccounts.INSTANCE);
                }
                break;
            default:
                ((Function1) obj2).invoke(((DependentBalancesViewModel.BalanceStatModel) obj).onClick);
                break;
        }
        return Unit.INSTANCE;
    }
}
