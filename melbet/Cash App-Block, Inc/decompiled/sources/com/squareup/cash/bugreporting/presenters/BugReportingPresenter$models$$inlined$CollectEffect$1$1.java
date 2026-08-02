package com.squareup.cash.bugreporting.presenters;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardApplyResult$Invalid;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardApplyResult$Valid;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardState;
import app.cash.local.presenters.brand.checkout.CheckoutTipState;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter$$ExternalSyntheticLambda11;
import app.cash.local.presenters.brand.menu.OrderLimitToasts;
import app.cash.local.presenters.cart.LineSelectionInformationRenderer$ModifierInformation;
import app.cash.local.presenters.cart.LineSelectionInformationRendererKt;
import app.cash.local.presenters.internal.AnalyticsKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.GiftCardAccountNumber;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.LoyaltyRewardToApplyQuestion;
import app.cash.local.screens.app.MenuItemDetailsQuestion;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.screens.app.VehicleDescriptionQuestion;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.CurbsidePickupDetails;
import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Clicked;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Dismissed;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Toggled;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewEvent;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.OrderBuilderEvent;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.ViewSizeResolver$size$3$1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachments;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.cdf.localclient.BannerLocation;
import com.squareup.cash.cdf.localclient.LocalClientBannerInteraction;
import com.squareup.cash.cdf.localclient.LocalClientCartComboSlotItemAdded;
import com.squareup.cash.cdf.localclient.LocalClientCartMenuItemAddFailure;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowGCFailure;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import com.squareup.cash.work.views.you.WorkYouViewKt;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.util.android.RealIntentFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.Okio;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BugReportingPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $bugReport$delegate$inlined;
    public final /* synthetic */ Object $bugReportSender$inlined;
    public final /* synthetic */ MutableState $bugReportSuccessIdentifier$delegate$inlined;
    public final /* synthetic */ MutableState $bugReportSuccessUrl$delegate$inlined;
    public final /* synthetic */ Object $diagnosticAttachments$delegate$inlined;
    public final /* synthetic */ Object $diagnosticAttachmentsExpanded$delegate$inlined;
    public final /* synthetic */ Object $displayEmail$delegate$inlined;
    public final /* synthetic */ Object $isSubmitting$delegate$inlined;
    public final /* synthetic */ MutableState $isTitleManuallyEdited$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object $rawScreenshots$delegate$inlined;
    public final /* synthetic */ Object $scope$inlined;
    public final /* synthetic */ Object $submitError$delegate$inlined;
    public final /* synthetic */ MutableState $titleGenerationFailed$delegate$inlined;
    public final /* synthetic */ Object this$0;

    public BugReportingPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, CartBuilder cartBuilder, LocationMenu locationMenu, CartEntryWithQuantity cartEntryWithQuantity, ArrayList arrayList, MenuItem menuItem, MutableState mutableState, MutableState mutableState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state, MutableState mutableState3, State state2, State state3, MutableState mutableState4) {
        this.this$0 = localMenuComboDetailsPresenter;
        this.$scope$inlined = cartBuilder;
        this.$bugReport$delegate$inlined = locationMenu;
        this.$submitError$delegate$inlined = cartEntryWithQuantity;
        this.$rawScreenshots$delegate$inlined = arrayList;
        this.$diagnosticAttachmentsExpanded$delegate$inlined = menuItem;
        this.$bugReportSuccessIdentifier$delegate$inlined = mutableState;
        this.$bugReportSuccessUrl$delegate$inlined = mutableState2;
        this.$diagnosticAttachments$delegate$inlined = parcelableSnapshotMutableIntState;
        this.$displayEmail$delegate$inlined = state;
        this.$isTitleManuallyEdited$delegate$inlined = mutableState3;
        this.$isSubmitting$delegate$inlined = state2;
        this.$bugReportSender$inlined = state3;
        this.$titleGenerationFailed$delegate$inlined = mutableState4;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        DiagnosticAttachments copy$default;
        Object checkoutGiftCardApplyResult$Invalid;
        boolean z;
        Object obj2;
        String str;
        CartEntry.ComboSlotSelection comboSlotSelection;
        int i = this.$r8$classId;
        MutableState mutableState = this.$bugReportSuccessUrl$delegate$inlined;
        Object obj3 = this.$bugReportSender$inlined;
        Object obj4 = this.$isSubmitting$delegate$inlined;
        Object obj5 = this.$displayEmail$delegate$inlined;
        MutableState mutableState2 = this.$titleGenerationFailed$delegate$inlined;
        Object obj6 = this.this$0;
        Object obj7 = this.$diagnosticAttachments$delegate$inlined;
        MutableState mutableState3 = this.$bugReportSuccessIdentifier$delegate$inlined;
        Object obj8 = this.$scope$inlined;
        Object obj9 = this.$rawScreenshots$delegate$inlined;
        Object obj10 = this.$diagnosticAttachmentsExpanded$delegate$inlined;
        Object obj11 = this.$bugReport$delegate$inlined;
        MutableState mutableState4 = this.$isTitleManuallyEdited$delegate$inlined;
        Back back = Back.INSTANCE;
        Object obj12 = this.$submitError$delegate$inlined;
        switch (i) {
            case 0:
                MutableState mutableState5 = (MutableState) obj9;
                CoroutineScope coroutineScope = (CoroutineScope) obj8;
                MutableState mutableState6 = (MutableState) obj11;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj6;
                RealIntentFactory realIntentFactory = (RealIntentFactory) localHomePresenter.tabContentPresenterFactory;
                Activity activity = (Activity) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                MutableState mutableState7 = (MutableState) obj7;
                BugReportingViewEvent bugReportingViewEvent = (BugReportingViewEvent) obj;
                if (bugReportingViewEvent instanceof BugReportingViewEvent.GoBack) {
                    screenNavigator.goTo(back);
                } else {
                    boolean z2 = bugReportingViewEvent instanceof BugReportingViewEvent.Continue;
                    MutableState mutableState8 = this.$bugReportSuccessUrl$delegate$inlined;
                    if (z2) {
                        mutableState3.setValue(null);
                        mutableState8.setValue(null);
                        screenNavigator.goTo(back);
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.TitleChanged) {
                        mutableState4.setValue(Boolean.valueOf(!StringsKt.isBlank(r11.title)));
                        mutableState2.setValue(Boolean.FALSE);
                        mutableState6.setValue(BugReport.copy$default((BugReport) mutableState6.getValue(), ((BugReportingViewEvent.TitleChanged) bugReportingViewEvent).title, null, null, null, 30));
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.DescriptionChanged) {
                        mutableState6.setValue(BugReport.copy$default((BugReport) mutableState6.getValue(), null, ((BugReportingViewEvent.DescriptionChanged) bugReportingViewEvent).description, null, null, 29));
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.AddMoreScreenshots) {
                        FilePickerResult filePickerResult = ((BugReportingViewEvent.AddMoreScreenshots) bugReportingViewEvent).result;
                        if (filePickerResult instanceof FilePickerResult.Success) {
                            JobKt.launch$default(coroutineScope, null, null, new RealBoostSelector$removeBoost$1(localHomePresenter, filePickerResult, (MutableState) obj12, mutableState5, null, 16), 3);
                        }
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.RemoveScreenshot) {
                        List list = (List) mutableState5.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj13 : list) {
                            if (!Intrinsics.areEqual(((Screenshot) obj13).uri, ((BugReportingViewEvent.RemoveScreenshot) bugReportingViewEvent).uri)) {
                                arrayList.add(obj13);
                            }
                        }
                        mutableState5.setValue(arrayList);
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.ToggleDiagnosticAttachmentsExpanded) {
                        ((MutableState) obj10).setValue(Boolean.valueOf(!((Boolean) r14.getValue()).booleanValue()));
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.ToggleAllDiagnosticAttachments) {
                        boolean z3 = !((DiagnosticAttachments) mutableState7.getValue()).includeAll;
                        DiagnosticAttachments copy$default2 = DiagnosticAttachments.copy$default((DiagnosticAttachments) mutableState7.getValue(), z3, z3, z3, z3, z3, z3, z3, z3, 768);
                        mutableState7.setValue(copy$default2);
                        mutableState6.setValue(BugReport.copy$default((BugReport) mutableState6.getValue(), null, null, null, copy$default2, 15));
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.ToggleDiagnosticAttachment) {
                        DiagnosticAttachments diagnosticAttachments = (DiagnosticAttachments) mutableState7.getValue();
                        switch (((BugReportingViewEvent.ToggleDiagnosticAttachment) bugReportingViewEvent).attachment.ordinal()) {
                            case 0:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, !diagnosticAttachments.includeViewHierarchy, false, false, false, false, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS);
                                break;
                            case 1:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, false, !diagnosticAttachments.includeBackStack, false, false, false, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW);
                                break;
                            case 2:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, false, false, !diagnosticAttachments.includeLogs, false, false, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC);
                                break;
                            case 3:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, false, false, false, !diagnosticAttachments.includeDatabase, false, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO);
                                break;
                            case 4:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, false, false, false, false, !diagnosticAttachments.includePreferences, false, false, 991);
                                break;
                            case 5:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, false, false, false, false, false, !diagnosticAttachments.includeDebugPreferences, false, 959);
                                break;
                            case 6:
                                copy$default = DiagnosticAttachments.copy$default(diagnosticAttachments, false, false, false, false, false, false, false, !diagnosticAttachments.includeSamEligibility, 895);
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        DiagnosticAttachments copy$default3 = DiagnosticAttachments.copy$default(copy$default, copy$default.includeViewHierarchy && copy$default.includeBackStack && copy$default.includeLogs && copy$default.includeDatabase && copy$default.includePreferences && copy$default.includeDebugPreferences && copy$default.includeSamEligibility, false, false, false, false, false, false, false, IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        mutableState7.setValue(copy$default3);
                        mutableState6.setValue(BugReport.copy$default((BugReport) mutableState6.getValue(), null, null, null, copy$default3, 15));
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.Submit) {
                        JobKt.launch$default(coroutineScope, null, null, new OffersHomePresenter$models$8$1(localHomePresenter, bugReportingViewEvent, (RealBugReportSender) obj3, mutableState6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj12, this.$bugReportSuccessIdentifier$delegate$inlined, mutableState8, (Continuation) null), 3);
                    } else if (bugReportingViewEvent instanceof BugReportingViewEvent.ShareTicketUrl) {
                        String str2 = (String) mutableState8.getValue();
                        if (str2 != null) {
                            activity.startActivity(RealIntentFactory.createTextIntent$default(realIntentFactory, str2, null, 6));
                        }
                    } else {
                        if (!(bugReportingViewEvent instanceof BugReportingViewEvent.OpenTicketUrl)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realIntentFactory.maybeStartUrlIntent(((BugReportingViewEvent.OpenTicketUrl) bugReportingViewEvent).url, activity, true);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                JWECryptoParts jWECryptoParts = (JWECryptoParts) obj10;
                CheckoutTipState checkoutTipState = (CheckoutTipState) obj7;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = checkoutTipState.currentTip$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = checkoutTipState.currentTipLocalCashEarningsLabel$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = checkoutTipState.overrideTip$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = checkoutTipState.selectedTipIndex$delegate;
                Cart cart = (Cart) obj4;
                State state = (State) obj3;
                CheckoutGiftCardState checkoutGiftCardState = (CheckoutGiftCardState) obj5;
                OrderBuilderModel orderBuilderModel = (OrderBuilderModel) obj6;
                CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = orderBuilderModel.loyaltySummary;
                Function1 function1 = (Function1) obj12;
                LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) obj11;
                AndroidStringManager androidStringManager = localBrandLocationCheckoutPresenter.stringManager;
                Analytics analytics = localBrandLocationCheckoutPresenter.analytics;
                LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen = localBrandLocationCheckoutPresenter.screen;
                BrandSpot brandSpot = localBrandLocationCheckoutPresenter.brandSpot;
                BetterNavigator.ScreenNavigator screenNavigator2 = localBrandLocationCheckoutPresenter.navigator;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj8;
                LocalBrandLocationCheckoutViewEvent localBrandLocationCheckoutViewEvent = (LocalBrandLocationCheckoutViewEvent) obj;
                if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.PlaceOrderClicked) {
                    if (!orderBuilderModel.updatingCart && !orderBuilderModel.isWorkingAsync) {
                        OrderBuilderModel.BuyerInfo.UiReady validateForCheckout = CashAppServiceModule.validateForCheckout(((LocalBrandLocationCheckoutViewEvent.PlaceOrderClicked) localBrandLocationCheckoutViewEvent).buyerInfo, androidStringManager, true);
                        if (validateForCheckout instanceof OrderBuilderModel.BuyerInfo.UiReady.Validated) {
                            JobKt.launch$default(coroutineScope2, null, null, new MoleculeKt$immediateClockFlow$1$1$1(function1, (OrderBuilderModel.BuyerInfo.UiReady.Validated) validateForCheckout, localBrandLocationCheckoutPresenter, orderBuilderModel, jWECryptoParts, null, 2), 3);
                        } else {
                            function1.invoke(new OrderBuilderEvent.UpdateBuyerInfo(validateForCheckout));
                        }
                    }
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.BackClicked) {
                    screenNavigator2.goTo(back);
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.EditBuyerInfoClicked) {
                    function1.invoke(new OrderBuilderEvent.UpdateBuyerInfo(CashAppServiceModule.asEditable((OrderBuilderModel.BuyerInfo.UiReady) obj9)));
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.FulfillmentRowClicked) {
                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) mutableState3.getValue();
                    Location.LocationDetail locationDetail = (Location.LocationDetail) state.getValue();
                    if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
                        z = locationDetail.summary.deliveryFulfillmentSchedulingEnabled;
                    } else if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
                        z = locationDetail.summary.pickupFulfillmentSchedulingEnabled;
                    } else {
                        if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration, FulfillmentConfiguration.Unspecified.INSTANCE) && fulfillmentConfiguration != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z = false;
                    }
                    if (z) {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                    } else {
                        screenNavigator2.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, FulfillmentConfigurationKt.getType(fulfillmentConfiguration), fulfillmentConfiguration, new LocalBrandProfileScreen(brandSpot.clearLocation(), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, localBrandLocationCheckoutScreen.syncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                    }
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.FulfillmentRowAsapClicked) {
                    function1.invoke(new OrderBuilderEvent.UpdateFulfillmentScheduling(new LocalFulfillment.SchedulingDetails(null, LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP, null, null, 13, null)));
                    JobKt.launch$default(coroutineScope2, null, null, new BlockRunner$cancel$1(localBrandLocationCheckoutPresenter, (Continuation) null, 8), 3);
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.FulfillmentRowLaterClicked) {
                    FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) mutableState3.getValue();
                    if (fulfillmentConfiguration2 != null) {
                        screenNavigator2.askQuestion(new SchedulingDayTimeQuestion(), new AbstractTypeChecker$$Lambda$0(localBrandLocationCheckoutPresenter, cart, fulfillmentConfiguration2, state, 1));
                    }
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.FulfillmentRowChangeLocationClicked) {
                    FulfillmentConfiguration fulfillmentConfiguration3 = (FulfillmentConfiguration) mutableState3.getValue();
                    screenNavigator2.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, FulfillmentConfigurationKt.getType(fulfillmentConfiguration3), fulfillmentConfiguration3, new LocalBrandProfileScreen(brandSpot.clearLocation(), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, localBrandLocationCheckoutScreen.syncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.FulfillmentRowSwitchType) {
                    screenNavigator2.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, ((LocalBrandLocationCheckoutViewEvent.FulfillmentRowSwitchType) localBrandLocationCheckoutViewEvent).f919type, (FulfillmentConfiguration) mutableState3.getValue(), new LocalBrandProfileScreen(brandSpot.clearLocation(), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, localBrandLocationCheckoutScreen.syncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.UrlClicked) {
                    localBrandLocationCheckoutPresenter.launcher.openWeb(screenNavigator2, ((LocalBrandLocationCheckoutViewEvent.UrlClicked) localBrandLocationCheckoutViewEvent).url);
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.PaymentMethodSelected) {
                    String str3 = ((LocalBrandLocationCheckoutViewEvent.PaymentMethodSelected) localBrandLocationCheckoutViewEvent).token;
                    if (jWECryptoParts.m2169onPaymentMethodSelected0YaROmY(str3)) {
                        function1.invoke(new OrderBuilderEvent.UpdatePaymentMethod(str3));
                    }
                } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.SuggestedTipClicked) {
                    int i2 = ((LocalBrandLocationCheckoutViewEvent.SuggestedTipClicked) localBrandLocationCheckoutViewEvent).index;
                    Integer num = (Integer) parcelableSnapshotMutableState4.getValue();
                    if (num != null && num.intValue() == i2) {
                        parcelableSnapshotMutableState4.setValue(-1);
                        parcelableSnapshotMutableState3.setValue(null);
                        parcelableSnapshotMutableState2.setValue(null);
                        parcelableSnapshotMutableState.setValue("");
                    } else {
                        parcelableSnapshotMutableState4.setValue(Integer.valueOf(i2));
                        LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) checkoutTipState.suggestions.get(i2);
                        LocalMoney localMoney = suggestion.tip_amount;
                        localMoney.getClass();
                        String prettyPrint$default = LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney), false, null, 7);
                        parcelableSnapshotMutableState3.setValue(StringsKt.substringAfter(prettyPrint$default, "$", prettyPrint$default));
                        parcelableSnapshotMutableState2.setValue(suggestion.local_cash_earnings_label);
                        String str4 = (String) parcelableSnapshotMutableState3.getValue();
                        str4.getClass();
                        parcelableSnapshotMutableState.setValue(str4);
                    }
                } else {
                    if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.TipEntered) {
                        String str5 = ((LocalBrandLocationCheckoutViewEvent.TipEntered) localBrandLocationCheckoutViewEvent).amount;
                        str5.getClass();
                        parcelableSnapshotMutableState4.setValue(-1);
                        parcelableSnapshotMutableState2.setValue(null);
                        if (checkoutTipState.useEnteredTipAsOverride) {
                            parcelableSnapshotMutableState3.setValue(str5);
                        }
                        parcelableSnapshotMutableState.setValue(str5);
                    } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.GiftCardCodeEntered) {
                        String str6 = ((LocalBrandLocationCheckoutViewEvent.GiftCardCodeEntered) localBrandLocationCheckoutViewEvent).code;
                        checkoutGiftCardState.getClass();
                        str6.getClass();
                        StringBuilder sb = new StringBuilder();
                        int length = str6.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char charAt = str6.charAt(i3);
                            if (Character.isDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        checkoutGiftCardState.code$delegate.setValue(sb.toString());
                        checkoutGiftCardState.error$delegate.setValue(null);
                        function1.invoke(OrderBuilderEvent.ClearGiftCardError.INSTANCE);
                    } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.ApplyGiftCardClicked) {
                        String str7 = androidStringManager.get(R.string.local_presenters_gift_card_error_invalid);
                        checkoutGiftCardState.getClass();
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = checkoutGiftCardState.error$delegate;
                        str7.getClass();
                        parcelableSnapshotMutableState5.setValue(null);
                        String code = checkoutGiftCardState.getCode();
                        code.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        int length2 = code.length();
                        for (int i4 = 0; i4 < length2; i4++) {
                            char charAt2 = code.charAt(i4);
                            if (Character.isDigit(charAt2)) {
                                sb2.append(charAt2);
                            }
                        }
                        if (sb2.toString().length() == 16) {
                            String code2 = checkoutGiftCardState.getCode();
                            code2.getClass();
                            checkoutGiftCardApplyResult$Invalid = new CheckoutGiftCardApplyResult$Valid(code2);
                        } else {
                            parcelableSnapshotMutableState5.setValue(str7);
                            checkoutGiftCardApplyResult$Invalid = new CheckoutGiftCardApplyResult$Invalid(StringsKt___StringsKt.takeLast(4, checkoutGiftCardState.getCode()), str7);
                        }
                        if (checkoutGiftCardApplyResult$Invalid instanceof CheckoutGiftCardApplyResult$Invalid) {
                            CheckoutGiftCardApplyResult$Invalid checkoutGiftCardApplyResult$Invalid2 = (CheckoutGiftCardApplyResult$Invalid) checkoutGiftCardApplyResult$Invalid;
                            analytics.track(new LocalClientCheckoutFlowGCFailure(PlatformKt.activeAccountTokenOrNull(localBrandLocationCheckoutPresenter.sessionManager), cart.token, checkoutGiftCardApplyResult$Invalid2.last4, checkoutGiftCardApplyResult$Invalid2.errorMessage), null);
                        } else {
                            if (!(checkoutGiftCardApplyResult$Invalid instanceof CheckoutGiftCardApplyResult$Valid)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            function1.invoke(new OrderBuilderEvent.UpdateGiftCards(CollectionsKt__CollectionsJVMKt.listOf(new GiftCardAccountNumber(((CheckoutGiftCardApplyResult$Valid) checkoutGiftCardApplyResult$Invalid).accountNumber))));
                        }
                    } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.RemoveGiftCardClicked) {
                        function1.invoke(new OrderBuilderEvent.UpdateGiftCards(EmptyList.INSTANCE));
                    } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.GiftCardsExpandedChanged) {
                        checkoutGiftCardState.isExpanded$delegate.setValue(Boolean.valueOf(((LocalBrandLocationCheckoutViewEvent.GiftCardsExpandedChanged) localBrandLocationCheckoutViewEvent).isExpanded));
                    } else {
                        if (!(localBrandLocationCheckoutViewEvent instanceof LocalBrandBannerEvent$Toggled)) {
                            if (localBrandLocationCheckoutViewEvent instanceof LocalBrandBannerEvent$Clicked) {
                                BrandSpot brandSpot2 = localBrandLocationCheckoutScreen.brandSpot;
                                String str8 = brandSpot2.brandToken;
                                String str9 = brandSpot2.locationToken;
                                LocalBrandBannerEvent$Clicked localBrandBannerEvent$Clicked = (LocalBrandBannerEvent$Clicked) localBrandLocationCheckoutViewEvent;
                                analytics.track(new LocalClientBannerInteraction(str8, str9 == null ? null : str9, BannerLocation.ORDER_DETAILS, AnalyticsKt.toBannerType(localBrandBannerEvent$Clicked.f914type), LocalClientBannerInteraction.InteractionType.Action), null);
                                LocalBrandBanner.Action action = localBrandBannerEvent$Clicked.action;
                                if (action instanceof LocalBrandBanner.Action.ApplySingleOffer) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Cannot apply single offer in the checkout view.");
                                } else if (action instanceof LocalBrandBanner.Action.ShowLoyaltyRewards) {
                                    cartLoyaltySummary.getClass();
                                    LocalLoyaltyProgram localLoyaltyProgram = cartLoyaltySummary.loyalty_program;
                                    localLoyaltyProgram.getClass();
                                    cartLoyaltySummary.getClass();
                                    LocalLoyaltyAccount localLoyaltyAccount = cartLoyaltySummary.loyalty_account;
                                    localLoyaltyAccount.getClass();
                                    screenNavigator2.askQuestion(new LoyaltyRewardToApplyQuestion(localLoyaltyProgram, localLoyaltyAccount), new RealBrandFollowPresenter$models$2$1$1(1, mutableState4));
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                return null;
                            }
                            if (localBrandLocationCheckoutViewEvent instanceof LocalBrandBannerEvent$Dismissed) {
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Banner cannot be ", Reflection.factory.getOrCreateKotlinClass(localBrandLocationCheckoutViewEvent.getClass()).getSimpleName(), " in the checkout view");
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.DropoffNotesUpdated) {
                                function1.invoke(new OrderBuilderEvent.UpdateDropoffNotes(((LocalBrandLocationCheckoutViewEvent.DropoffNotesUpdated) localBrandLocationCheckoutViewEvent).notes));
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.NoContactDeliveryToggled) {
                                function1.invoke(new OrderBuilderEvent.UpdateNoContactDelivery(((LocalBrandLocationCheckoutViewEvent.NoContactDeliveryToggled) localBrandLocationCheckoutViewEvent).toggled));
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.OrderNotesUpdated) {
                                function1.invoke(new OrderBuilderEvent.UpdateOrderNotes(((LocalBrandLocationCheckoutViewEvent.OrderNotesUpdated) localBrandLocationCheckoutViewEvent).notes));
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.CurbsidePickupToggled) {
                                boolean z4 = ((LocalBrandLocationCheckoutViewEvent.CurbsidePickupToggled) localBrandLocationCheckoutViewEvent).isSelected;
                                VehicleDescription vehicleDescription = (VehicleDescription) mutableState2.getValue();
                                String str10 = vehicleDescription != null ? vehicleDescription.colorLabel : null;
                                VehicleDescription vehicleDescription2 = (VehicleDescription) mutableState2.getValue();
                                String str11 = vehicleDescription2 != null ? vehicleDescription2.typeLabel : null;
                                VehicleDescription vehicleDescription3 = (VehicleDescription) mutableState2.getValue();
                                function1.invoke(new OrderBuilderEvent.UpdateCurbsideDetails(new CurbsidePickupDetails(z4, str10, str11, vehicleDescription3 != null ? vehicleDescription3.note : null)));
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.VehicleDescriptionClicked) {
                                screenNavigator2.askQuestion(new VehicleDescriptionQuestion(), new RealBrandFollowPresenter$models$2$1$1(2, mutableState2));
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.CouponCodeSubmitted) {
                                function1.invoke(new OrderBuilderEvent.AddDiscountCode(new DiscountCode.Entered(((LocalBrandLocationCheckoutViewEvent.CouponCodeSubmitted) localBrandLocationCheckoutViewEvent).code)));
                            } else if (localBrandLocationCheckoutViewEvent instanceof LocalBrandLocationCheckoutViewEvent.CouponRemoved) {
                                function1.invoke(new OrderBuilderEvent.RemoveDiscountCode(new DiscountCode.Entered(((LocalBrandLocationCheckoutViewEvent.CouponRemoved) localBrandLocationCheckoutViewEvent).code)));
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            return null;
                        }
                        BrandSpot brandSpot3 = localBrandLocationCheckoutScreen.brandSpot;
                        String str12 = brandSpot3.brandToken;
                        String str13 = brandSpot3.locationToken;
                        LocalBrandBannerEvent$Toggled localBrandBannerEvent$Toggled = (LocalBrandBannerEvent$Toggled) localBrandLocationCheckoutViewEvent;
                        analytics.track(new LocalClientBannerInteraction(str12, str13 == null ? null : str13, BannerLocation.ORDER_DETAILS, AnalyticsKt.toBannerType(localBrandBannerEvent$Toggled.f916type), LocalClientBannerInteraction.InteractionType.Toggle), null);
                        function1.invoke(new OrderBuilderEvent.UpdateRedeemLocalCashBalance(localBrandBannerEvent$Toggled.isApplied));
                    }
                }
                return Unit.INSTANCE;
            default:
                CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) obj12;
                LocationMenu locationMenu = (LocationMenu) obj11;
                MenuItem menuItem = (MenuItem) obj10;
                ArrayList<ComboSlot> arrayList2 = (ArrayList) obj9;
                CartBuilder cartBuilder = (CartBuilder) obj8;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj7;
                LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) obj6;
                Analytics analytics2 = localMenuComboDetailsPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator3 = localMenuComboDetailsPresenter.navigator;
                LocalMenuComboDetailsScreen localMenuComboDetailsScreen = localMenuComboDetailsPresenter.screen;
                LocalMenuComboDetailsViewEvent localMenuComboDetailsViewEvent = (LocalMenuComboDetailsViewEvent) obj;
                if ((localMenuComboDetailsViewEvent instanceof LocalMenuComboDetailsViewEvent.BackClicked) || (localMenuComboDetailsViewEvent instanceof CartItemCounterViewEvent.Trash)) {
                    screenNavigator3.goTo(back);
                } else if (localMenuComboDetailsViewEvent instanceof CartItemCounterViewEvent.Increment) {
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                    Location.LocationDetail locationDetail2 = (Location.LocationDetail) ((State) obj5).getValue();
                    FulfillmentConfiguration fulfillmentConfiguration4 = (FulfillmentConfiguration) mutableState4.getValue();
                    Integer num2 = new Integer(parcelableSnapshotMutableIntState.getIntValue() - (cartEntryWithQuantity != null ? cartEntryWithQuantity.getQuantity() : 0));
                    app.cash.local.primitives.LocalMoney localMoney2 = (app.cash.local.primitives.LocalMoney) ((State) obj4).getValue();
                    app.cash.local.primitives.LocalMoney localMoney3 = (app.cash.local.primitives.LocalMoney) ((State) obj3).getValue();
                    if (localMoney3 == null) {
                        localMoney3 = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                    }
                    mutableState2.setValue(OrderLimitToasts.toastDataForOrderLimitCheck(localMenuComboDetailsPresenter.stringManager, cartBuilder, locationDetail2, locationMenu, fulfillmentConfiguration4, num2, LocalMoneysKt.minus(localMoney2, localMoney3)));
                } else if (localMenuComboDetailsViewEvent instanceof CartItemCounterViewEvent.Decrement) {
                    int intValue = parcelableSnapshotMutableIntState.getIntValue();
                    parcelableSnapshotMutableIntState.setIntValue(intValue - 1);
                    Okio.boxInt(intValue);
                } else {
                    if (localMenuComboDetailsViewEvent instanceof LocalMenuComboDetailsViewEvent.SelectSlotOption) {
                        for (ComboSlot comboSlot : arrayList2) {
                            LocalMenuComboDetailsViewEvent.SelectSlotOption selectSlotOption = (LocalMenuComboDetailsViewEvent.SelectSlotOption) localMenuComboDetailsViewEvent;
                            if (Intrinsics.areEqual(comboSlot.token, selectSlotOption.slotToken)) {
                                int i5 = selectSlotOption.sectionIndex;
                                String str14 = menuItem.name;
                                String str15 = selectSlotOption.itemToken;
                                String str16 = selectSlotOption.variationToken;
                                TreeSet treeSet = new TreeSet();
                                ArraysKt___ArraysKt.toCollection(new CartEntry.ModifierSelection[0], treeSet);
                                TreeSet treeSet2 = new TreeSet();
                                ArraysKt___ArraysKt.toCollection(new CartEntry.ModifierFreeEntry[0], treeSet2);
                                localMenuComboDetailsPresenter.m1214performSelectionr5FUkSU(locationMenu, comboSlot, i5, str14, str15, str16, treeSet, treeSet2, this.$bugReportSuccessIdentifier$delegate$inlined, this.$bugReportSuccessUrl$delegate$inlined, false);
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if (localMenuComboDetailsViewEvent instanceof LocalMenuComboDetailsViewEvent.CustomizeSlot) {
                        Map map = (Map) mutableState3.getValue();
                        LocalMenuComboDetailsViewEvent.CustomizeSlot customizeSlot = (LocalMenuComboDetailsViewEvent.CustomizeSlot) localMenuComboDetailsViewEvent;
                        String str17 = customizeSlot.token;
                        Map map2 = (Map) map.get(new ComboSlotToken(str17));
                        if (map2 != null && (comboSlotSelection = (CartEntry.ComboSlotSelection) map2.get(new LocalMenuComboDetailsViewModel.SectionIndex(customizeSlot.sectionIndex))) != null) {
                            for (ComboSlot comboSlot2 : arrayList2) {
                                if (Intrinsics.areEqual(comboSlot2.token, str17)) {
                                    localMenuComboDetailsPresenter.navigator.askQuestion(new MenuItemDetailsQuestion(), new LocalMenuComboDetailsPresenter$$ExternalSyntheticLambda11(localMenuComboDetailsPresenter, comboSlotSelection.menuItemToken, menuItem.name, comboSlot2, customizeSlot.sectionIndex, new LocalMenuItemDetailsScreen.Mode.Update(comboSlotSelection.variationToken, CollectionsKt.toList(comboSlotSelection.modifierSelections), CollectionsKt.toList(comboSlotSelection.freeTextEntries))));
                                }
                            }
                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            return null;
                        }
                    } else if (localMenuComboDetailsViewEvent instanceof LocalBottomModalViewEvent.BottomModalLinkClicked) {
                        screenNavigator3.askQuestion(new SchedulingDayTimeQuestion(), new ViewSizeResolver$size$3$1(1, localMenuComboDetailsPresenter, cartBuilder, mutableState4));
                    } else if (localMenuComboDetailsViewEvent instanceof LocalBottomModalViewEvent.CtaClicked) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ComboSlot comboSlot3 = (ComboSlot) it.next();
                            int i6 = comboSlot3.numberOfSelections;
                            int i7 = 0;
                            while (i7 < i6) {
                                LocalMenuComboDetailsPresenter.validateSelection(locationMenu, new LocalMenuComboDetailsPresenter.ComboTokenAndSectionIndex(comboSlot3.token, i7), mutableState3, mutableState);
                                i7++;
                                it = it;
                            }
                        }
                        Collection values = ((Map) mutableState.getValue()).values();
                        if (!(values instanceof Collection) || !values.isEmpty()) {
                            Iterator it2 = values.iterator();
                            while (it2.hasNext()) {
                                if (((LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus) it2.next()) != LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.Validated) {
                                }
                            }
                        }
                        CartEntry createCartEntry = LocalMenuComboDetailsPresenter.createCartEntry(menuItem, mutableState3);
                        LocalMenuComboDetailsScreen.Mode mode = localMenuComboDetailsScreen.mode;
                        if (mode instanceof LocalMenuComboDetailsScreen.Mode.Add) {
                            RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
                            realCartBuilder.add(createCartEntry, parcelableSnapshotMutableIntState.getIntValue(), locationMenu, localMenuComboDetailsScreen.analyticsContext);
                            String str18 = realCartBuilder.checkoutFlowToken;
                            Collection values2 = ((Map) mutableState3.getValue()).values();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = values2.iterator();
                            while (it3.hasNext()) {
                                CollectionsKt__MutableCollectionsKt.addAll(((Map) it3.next()).values(), arrayList3);
                            }
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                CartEntry.ComboSlotSelection comboSlotSelection2 = (CartEntry.ComboSlotSelection) it4.next();
                                String str19 = comboSlotSelection2.menuItemToken;
                                String str20 = comboSlotSelection2.variationToken;
                                MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(str19);
                                if (m1244menuItemOrNullGvMOdU0 == null) {
                                    str = str18;
                                } else {
                                    String str21 = localMenuComboDetailsScreen.brandSpot.brandToken;
                                    String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localMenuComboDetailsPresenter.sessionManager);
                                    String str22 = localMenuComboDetailsScreen.brandSpot.locationToken;
                                    String str23 = str22 == null ? null : str22;
                                    String str24 = localMenuComboDetailsScreen.itemToken;
                                    String str25 = m1244menuItemOrNullGvMOdU0.token;
                                    String str26 = str20 == null ? null : str20;
                                    Iterator it5 = m1244menuItemOrNullGvMOdU0.variations.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj2 = it5.next();
                                            if (str20 == null ? false : Intrinsics.areEqual(((MenuItemVariation) obj2).token, str20)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    MenuItemVariation menuItemVariation = (MenuItemVariation) obj2;
                                    String str27 = menuItemVariation != null ? menuItemVariation.name : null;
                                    String joinToString$default = CollectionsKt.joinToString$default(comboSlotSelection2.modifierSelections, ",", null, null, 0, null, new Data$$ExternalSyntheticLambda0(22), 30);
                                    SortedSet<CartEntry.ModifierSelection> sortedSet = comboSlotSelection2.modifierSelections;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (CartEntry.ModifierSelection modifierSelection : sortedSet) {
                                        modifierSelection.getClass();
                                        LineSelectionInformationRenderer$ModifierInformation modifierInformation = LineSelectionInformationRendererKt.toModifierInformation(modifierSelection, locationMenu);
                                        if (modifierInformation != null) {
                                            arrayList4.add(modifierInformation);
                                        }
                                    }
                                    SortedSet<CartEntry.ModifierFreeEntry> sortedSet2 = comboSlotSelection2.freeTextEntries;
                                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet2, 10));
                                    for (CartEntry.ModifierFreeEntry modifierFreeEntry : sortedSet2) {
                                        modifierFreeEntry.getClass();
                                        arrayList5.add(LineSelectionInformationRendererKt.toTextModifierInformation(modifierFreeEntry, locationMenu));
                                    }
                                    str = str18;
                                    analytics2.track(new LocalClientCartComboSlotItemAdded(str24, str21, activeAccountTokenOrNull, str23, str25, str26, str27, joinToString$default, WorkYouViewKt.renderSelectionInformation(null, arrayList4, arrayList5), str), null);
                                }
                                str18 = str;
                            }
                        } else {
                            if (!(mode instanceof LocalMenuComboDetailsScreen.Mode.Edit)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            CartEntry cartEntry = cartEntryWithQuantity != null ? cartEntryWithQuantity.getCartEntry() : null;
                            if (cartEntry != null) {
                                ((RealCartBuilder) cartBuilder).update(cartEntry, createCartEntry, parcelableSnapshotMutableIntState.getIntValue(), locationMenu);
                            } else {
                                Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((LocalMenuComboDetailsScreen.Mode.Edit) mode).itemIndexInCart, "Failed to find entry for "), new Object[0]);
                            }
                        }
                        screenNavigator3.goTo(back);
                    } else {
                        if (!Intrinsics.areEqual(localMenuComboDetailsViewEvent, LocalMenuComboDetailsViewEvent.MissingSlotSelections.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str28 = localMenuComboDetailsScreen.itemToken;
                        Boolean bool = Boolean.TRUE;
                        Boolean bool2 = Boolean.FALSE;
                        Map map3 = (Map) mutableState3.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = map3.entrySet().iterator();
                        while (it6.hasNext()) {
                            Collection values3 = ((Map) ((Map.Entry) it6.next()).getValue()).values();
                            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values3, 10));
                            Iterator it7 = values3.iterator();
                            while (it7.hasNext()) {
                                arrayList7.add(((CartEntry.ComboSlotSelection) it7.next()).menuItemToken);
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList7, arrayList6);
                        }
                        analytics2.track(new LocalClientCartMenuItemAddFailure(bool, bool2, str28, CollectionsKt.joinToString$default(arrayList6, ",", null, null, 0, null, null, 62)), null);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public BugReportingPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, CoroutineScope coroutineScope2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, RealBugReportSender realBugReportSender, MutableState mutableState10, MutableState mutableState11) {
        this.this$0 = localHomePresenter;
        this.$scope$inlined = coroutineScope2;
        this.$bugReportSuccessIdentifier$delegate$inlined = mutableState;
        this.$bugReportSuccessUrl$delegate$inlined = mutableState2;
        this.$isTitleManuallyEdited$delegate$inlined = mutableState3;
        this.$titleGenerationFailed$delegate$inlined = mutableState4;
        this.$bugReport$delegate$inlined = mutableState5;
        this.$submitError$delegate$inlined = mutableState6;
        this.$rawScreenshots$delegate$inlined = mutableState7;
        this.$diagnosticAttachmentsExpanded$delegate$inlined = mutableState8;
        this.$diagnosticAttachments$delegate$inlined = mutableState9;
        this.$bugReportSender$inlined = realBugReportSender;
        this.$displayEmail$delegate$inlined = mutableState10;
        this.$isSubmitting$delegate$inlined = mutableState11;
    }

    public BugReportingPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, OrderBuilderModel orderBuilderModel, LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter, Function1 function1, OrderBuilderModel.BuyerInfo.UiReady uiReady, JWECryptoParts jWECryptoParts, CheckoutTipState checkoutTipState, CheckoutGiftCardState checkoutGiftCardState, Cart cart, MutableState mutableState, State state, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.this$0 = orderBuilderModel;
        this.$bugReport$delegate$inlined = localBrandLocationCheckoutPresenter;
        this.$submitError$delegate$inlined = function1;
        this.$rawScreenshots$delegate$inlined = uiReady;
        this.$diagnosticAttachmentsExpanded$delegate$inlined = jWECryptoParts;
        this.$diagnosticAttachments$delegate$inlined = checkoutTipState;
        this.$displayEmail$delegate$inlined = checkoutGiftCardState;
        this.$isSubmitting$delegate$inlined = cart;
        this.$bugReportSuccessIdentifier$delegate$inlined = mutableState;
        this.$bugReportSender$inlined = state;
        this.$bugReportSuccessUrl$delegate$inlined = mutableState2;
        this.$isTitleManuallyEdited$delegate$inlined = mutableState3;
        this.$titleGenerationFailed$delegate$inlined = mutableState4;
        this.$scope$inlined = coroutineScope;
    }
}
