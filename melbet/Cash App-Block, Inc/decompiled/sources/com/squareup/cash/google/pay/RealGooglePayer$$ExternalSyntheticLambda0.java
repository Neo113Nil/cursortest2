package com.squareup.cash.google.pay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.tapandpay.zzag;
import com.google.android.gms.tapandpay.zza;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.cdf.sponsoredaccount.DependentBalanceType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountBalanceDetailSeeAllActivity;
import com.squareup.cash.deposits.physical.backend.api.map.CameraState;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NativeMoneyAppletServerRecommendations;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NewGooglePlacesApi;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPicker;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyInput;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.components.arcade.ArcadeFormSelectableInput;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.components.arcade.FormTextInputTransformation;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.instruments.views.InstrumentAvatarView;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.components.DiscoverStockAdapter;
import com.squareup.cash.investing.components.MooncakeInvestingExplanatoryDialogView;
import com.squareup.cash.investing.components.MyInvestmentsAdapter;
import com.squareup.cash.investing.components.categories.InvestingChoiceRow;
import com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView;
import com.squareup.cash.investing.components.dialogs.ConfirmCancelScheduledOrderDialog;
import com.squareup.cash.investing.components.exchange.MaxCentsCappedKeypadListener;
import com.squareup.cash.investing.presenters.families.InvestingDependentActivityPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingExplanatoryViewEvent$Close;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.custom.order.CancelOrderViewEvent;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenterKt;
import com.squareup.cash.maps.viewmodels.LatLng;
import com.squareup.cash.maps.viewmodels.LatLngBounds;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketcapabilities.viewmodels.MarketCapabilitiesErrorViewEvent$PositiveButtonClicked;
import com.squareup.cash.marketcapabilities.views.MarketCapabilitiesErrorDialog;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.scrubbing.InsertingScrubber;
import com.squareup.cash.support.chat.views.transcript.message.UnknownMessageBodyView;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.android.Views;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealGooglePayer$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RealGooglePayer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r6 <= r4) goto L29;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        int i;
        String str2;
        int i2 = this.$r8$classId;
        String str3 = "";
        int i3 = 1;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                Activity activity = ((RealGooglePayer) obj).activity;
                return new zzag(activity, activity, zza.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
            case 1:
                FormBlocker.Element.EmojiPickerElement.InitialSelection initialSelection = ((ArcadeFormEmojiPicker) obj).element.initial_selection;
                return Updater.mutableStateOf$default(initialSelection != null ? Integer.valueOf((int) initialSelection.categories_index) : null);
            case 2:
                ArcadeFormMoneyInput arcadeFormMoneyInput = (ArcadeFormMoneyInput) obj;
                InsertingScrubber insertingScrubber = arcadeFormMoneyInput.scrubber;
                Money money = arcadeFormMoneyInput.element.prefill_amount;
                if (money == null || (str = arcadeFormMoneyInput.moneyFormatter.format(money)) == null) {
                    str = "";
                }
                return Updater.mutableStateOf$default(insertingScrubber.scrub("", str));
            case 3:
                return (String) ((ArcadeFormOptionPickerView) obj).selectedOptionId$delegate.getValue();
            case 4:
                ArcadeFormSelectableInput arcadeFormSelectableInput = (ArcadeFormSelectableInput) obj;
                FormBlocker.Element.SelectableInputElement.Action action = arcadeFormSelectableInput.element.input_action;
                BlockerAction blockerAction = action != null ? action.action : null;
                if (blockerAction != null) {
                    arcadeFormSelectableInput.onEvent.invoke(new FormViewEvent.BlockerActionViewEvent.SelectableRowClicked(blockerAction));
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("missing input action");
                return null;
            case 5:
                List list = ((ArcadeFormTextInputGroupView) obj).inputFields;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ArcadeFormTextInputGroupView.InputFieldModel inputFieldModel = (ArcadeFormTextInputGroupView.InputFieldModel) list.get(i4);
                    String str4 = inputFieldModel.preFilledText;
                    if (str4 == null) {
                        str4 = "";
                    }
                    TextFieldState textFieldState = new TextFieldState(str4, 2);
                    TextFieldBuffer startEdit = textFieldState.startEdit();
                    try {
                        new FormTextInputTransformation(inputFieldModel.validations, new ClusterItemKt$$ExternalSyntheticLambda0(i3)).transformInput(startEdit);
                        textFieldState.commitEdit(startEdit);
                        textFieldState.finishEditing();
                        arrayList.add(textFieldState);
                    } catch (Throwable th) {
                        textFieldState.finishEditing();
                        throw th;
                    }
                }
                return arrayList;
            case 6:
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj;
                RealGlobalSearchRepository realGlobalSearchRepository = (RealGlobalSearchRepository) stuckPlayerDetector.callback;
                realGlobalSearchRepository.cacheKey = null;
                StateFlowKt.emitOrThrow(realGlobalSearchRepository.cachedData, null);
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) stuckPlayerDetector.stuckSuppressedDetector;
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
            case 7:
                ((SearchBarKeyboardState) obj).setOpen(false);
                return Unit.INSTANCE;
            case 8:
                return Long.valueOf(((Scene) obj).shaderManager.initialMaxSize);
            case 9:
                ProfilePaymentHistoryPresenter profilePaymentHistoryPresenter = (ProfilePaymentHistoryPresenter) obj;
                profilePaymentHistoryPresenter.navigator.goTo(new PaymentHistoryScreens$ProfileCompletePaymentHistory(profilePaymentHistoryPresenter.args.profileId));
                return Unit.INSTANCE;
            case 10:
                InstrumentAvatarView instrumentAvatarView = (InstrumentAvatarView) obj;
                float dip = Views.dip((View) instrumentAvatarView, 1.5f);
                int dip2 = (int) Views.dip(instrumentAvatarView, instrumentAvatarView.size.size - 1.5f);
                int ordinal = ThemeHelpersKt.themeInfo(instrumentAvatarView).theme.ordinal();
                if (ordinal == 0) {
                    i = -1513240;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = -14474461;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.setIntrinsicWidth(dip2);
                shapeDrawable.setIntrinsicHeight(dip2);
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable.getPaint().setStrokeWidth(dip);
                shapeDrawable.getPaint().setColor(i);
                return new InsetDrawable((Drawable) shapeDrawable, (int) dip);
            case 11:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).peekCurrentValue(LaunchDarklyFeatureFlags$NewGooglePlacesApi.INSTANCE)).enabled());
            case 12:
                return Long.valueOf(((RealEntityPriceRefresher) obj).clock.millis());
            case 13:
                ((Ui.EventReceiver) ((DiscoverStockAdapter) obj).eventReceiverProducer.invoke()).sendEvent(new InvestingHomeViewEvent.SearchClicked(InvestingHomeViewEvent.SearchClicked.Source.NEW_CUSTOMER_CTA_BUTTON));
                return Unit.INSTANCE;
            case 14:
                Ui.EventReceiver eventReceiver = ((MooncakeInvestingExplanatoryDialogView) obj).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(InvestingExplanatoryViewEvent$Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 15:
                ((Ui.EventReceiver) ((MyInvestmentsAdapter) obj).eventReceiverProducer.invoke()).sendEvent(InvestingHomeViewEvent.ShowPortfolioPerformance.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                int i5 = InvestingFilterCategoriesView.$r8$clinit;
                Context context = ((InvestingFilterCategoriesView) obj).getContext();
                context.getClass();
                return new InvestingChoiceRow(context);
            case 17:
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, 0});
                gradientDrawable.setAlpha(45);
                gradientDrawable.setCornerRadius(Views.dip((View) obj, 24.0f));
                return gradientDrawable;
            case 18:
                Ui.EventReceiver eventReceiver2 = ((ConfirmCancelScheduledOrderDialog) obj).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(CancelOrderViewEvent.Cancel.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 19:
                ((MaxCentsCappedKeypadListener) obj).onLongBackspace();
                return Unit.INSTANCE;
            case 20:
                ((DependentActivityViewModel) obj).activityEmbeddedModel.onEvent.invoke(ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE);
                return Unit.INSTANCE;
            case 21:
                InvestingSearchViewModel investingSearchViewModel = (InvestingSearchViewModel) obj;
                if (investingSearchViewModel != null && (str2 = investingSearchViewModel.searchQuery) != null) {
                    str3 = str2;
                }
                return Updater.mutableStateOf$default(str3);
            case 22:
                ((UnknownMessageBodyView) obj).onUpdateClick.invoke();
                return Unit.INSTANCE;
            case 23:
                return Updater.mutableStateOf$default((Set) ((TapToPayPresenter) obj).screenRecodingDetector);
            case 24:
                InvestingDependentActivityPresenter investingDependentActivityPresenter = (InvestingDependentActivityPresenter) obj;
                RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = investingDependentActivityPresenter.balanceDetailerLogger;
                String customerToken = realDependentBalanceDetailLoggingManager.dependentCustomerTokenRepository.getCustomerToken();
                if (customerToken != null) {
                    Analytics analytics = realDependentBalanceDetailLoggingManager.analytics;
                    DependentBalanceType dependentBalanceType = DependentBalanceType.Bitcoin;
                    analytics.track(new SponsoredAccountBalanceDetailSeeAllActivity(customerToken), null);
                }
                investingDependentActivityPresenter.navigator.goTo(new DependentActivityScreen(DependentActivityScreen.ActivityType.INVESTING, investingDependentActivityPresenter.dependentCustomerToken, false));
                return Unit.INSTANCE;
            case 25:
                InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) obj;
                investingStockDetailsPresenter.navigator.goTo(new InvestingScreens.InvestingActivityHistoryScreen(investingStockDetailsPresenter.args.investmentEntityToken));
                return Unit.INSTANCE;
            case 26:
                CashMapPresenter cashMapPresenter = (CashMapPresenter) obj;
                LocationViewModel locationViewModel = cashMapPresenter.initialLocationModel;
                if (locationViewModel == null) {
                    locationViewModel = LocationViewModel.DEFAULT_LOCATION_VIEW_MODEL;
                }
                CameraState cameraState = (CameraState) cashMapPresenter.cameraStateManager.lastCameraState.getValue();
                if (cameraState != null) {
                    WorkLauncherImpl workLauncherImpl = CashMapPresenterKt.LocationViewModelSaver;
                    double d = cameraState.lat;
                    double d2 = cameraState.lng;
                    LocationViewModel locationViewModel2 = new LocationViewModel(d, d2, cameraState.zoom);
                    LatLngBounds latLngBounds = cashMapPresenter.cameraBounds;
                    if (latLngBounds != null) {
                        LatLng latLng = latLngBounds.southwest;
                        double d3 = latLng.lat;
                        LatLng latLng2 = latLngBounds.northeast;
                        double d4 = latLng2.lat;
                        if (d3 <= d && d <= d4) {
                            double d5 = latLng.lng;
                            double d6 = latLng2.lng;
                            if (d5 <= d2) {
                                break;
                            }
                        }
                    }
                    locationViewModel = locationViewModel2;
                }
                return Updater.mutableStateOf$default(locationViewModel);
            case 27:
                Ui.EventReceiver eventReceiver3 = ((MarketCapabilitiesErrorDialog) obj).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(MarketCapabilitiesErrorViewEvent$PositiveButtonClicked.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 28:
                return Float.valueOf(((TooltipState) obj)._alpha$delegate.getFloatValue());
            default:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((RealAppletTileServerRecommendationProvider) obj).flags).peekCurrentValue(LaunchDarklyFeatureFlags$NativeMoneyAppletServerRecommendations.INSTANCE)).enabled());
        }
    }
}
