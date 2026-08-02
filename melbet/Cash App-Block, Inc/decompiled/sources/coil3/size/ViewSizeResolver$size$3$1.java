package coil3.size;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.zipline.internal.bridge.CancelCallback;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import com.google.android.libraries.places.api.net.zzf;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher$PlacesSearchResult$computeAddress$2$1$WhenMappings;
import com.squareup.cash.R;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3;
import com.squareup.cash.arcade.components.FilterBarChipType;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LogoViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchFilterGroupViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.presenters.AllocationGroupWithPercentage;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.presenters.PoolContributeWithNotePresenter;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepUtils;
import defpackage.JsonLogicResult;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.o0;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class ViewSizeResolver$size$3$1 implements Function1 {
    public final /* synthetic */ Object $preDrawListener;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $viewTreeObserver;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ ViewSizeResolver$size$3$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$viewTreeObserver = obj2;
        this.$preDrawListener = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.squareup.protos.common.Money] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.squareup.protos.common.Money] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.squareup.protos.common.Money] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r3;
        InstrumentSelection instrumentSelection;
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 0;
        UiStepUtils uiStepUtils = UiStepUtils.INSTANCE;
        Continuation continuation = null;
        r7 = null;
        String str = null;
        LogoViewModel logoViewModel = null;
        Object obj2 = this.$preDrawListener;
        Object obj3 = this.$viewTreeObserver;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1 = (ViewSizeResolver$size$3$preDrawListener$1) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                } else {
                    realViewSizeResolver.view.getViewTreeObserver().removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                }
                return Unit.INSTANCE;
            case 1:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) obj4;
                BrandSpot brandSpot = localMenuComboDetailsPresenter.screen.brandSpot;
                String str2 = brandSpot.locationToken;
                str2.getClass();
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localMenuComboDetailsPresenter.sessionManager);
                RealCartBuilder realCartBuilder = (RealCartBuilder) ((CartBuilder) obj3);
                String str3 = realCartBuilder.checkoutFlowToken;
                SnapshotStateList snapshotStateList = realCartBuilder.selections;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                ListIterator listIterator = snapshotStateList.listIterator();
                while (true) {
                    StateListIterator stateListIterator = (StateListIterator) listIterator;
                    if (!stateListIterator.hasNext()) {
                        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) ((MutableState) obj2).getValue();
                        fulfillmentConfiguration.getClass();
                        return new LocalSchedulingDayTimePickerScreen(brandSpot, str2, activeAccountTokenOrNull, str3, arrayList, fulfillmentConfiguration, askedQuestion);
                    }
                    arrayList.add(new MenuItemToken(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry().menuItemToken));
                }
            case 2:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter = (LocalMenuItemDetailsPresenter) obj4;
                BrandSpot brandSpot2 = localMenuItemDetailsPresenter.screen.brandSpot;
                String str4 = brandSpot2.locationToken;
                str4.getClass();
                String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(localMenuItemDetailsPresenter.sessionManager);
                RealCartBuilder realCartBuilder2 = (RealCartBuilder) ((CartBuilder) obj3);
                String str5 = realCartBuilder2.checkoutFlowToken;
                SnapshotStateList snapshotStateList2 = realCartBuilder2.selections;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList2, 10));
                ListIterator listIterator2 = snapshotStateList2.listIterator();
                while (true) {
                    StateListIterator stateListIterator2 = (StateListIterator) listIterator2;
                    if (!stateListIterator2.hasNext()) {
                        FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) ((MutableState) obj2).getValue();
                        fulfillmentConfiguration2.getClass();
                        return new LocalSchedulingDayTimePickerScreen(brandSpot2, str4, activeAccountTokenOrNull2, str5, arrayList2, fulfillmentConfiguration2, askedQuestion2);
                    }
                    arrayList2.add(new MenuItemToken(((CartEntryWithQuantity) stateListIterator2.next()).getCartEntry().menuItemToken));
                }
            case 3:
                JobKt.launch$default(((OutboundCallHandler) obj4).endpoint.scope, null, null, new EventBridge$sendEvent$1((OutboundCallHandler.RealSuspendCallback) obj3, (CancelCallback) obj2, continuation, 24), 3);
                return Unit.INSTANCE;
            case 4:
                zzf zzfVar = (zzf) obj;
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj2;
                PlacesAddressSearcher.PlacesSearchResult placesSearchResult = (PlacesAddressSearcher.PlacesSearchResult) obj3;
                ((PlacesAddressSearcher) obj4).sessionToken = null;
                try {
                    JsonLogicResult buildLocation$real = PlacesAddressSearcher$PlacesSearchResult$computeAddress$2$1$WhenMappings.$EnumSwitchMapping$0[placesSearchResult.typeFilter.ordinal()] == 1 ? placesSearchResult.buildLocation$real(zzfVar.zza) : PlacesAddressSearcher.PlacesSearchResult.buildAddress$real$default(placesSearchResult, zzfVar.zza, placesSearchResult.primaryText.toString());
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(new AddressSearchResult.ComputedAddressResult.Success(buildLocation$real));
                } catch (IllegalArgumentException e) {
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(AddressSearchResult.ComputedAddressResult.Failure.INSTANCE);
                    Timber.Forest.e(e);
                }
                return Unit.INSTANCE;
            case 5:
                AskedQuestion askedQuestion3 = (AskedQuestion) obj;
                askedQuestion3.getClass();
                BitcoinAmountPickerScreen.AmountPickerPurpose amountPickerPurpose = BitcoinAmountPickerScreen.AmountPickerPurpose.DEPOSIT;
                MutableState mutableState = (MutableState) obj3;
                if (((CurrencyCode) ((State) obj4).getValue()) == CurrencyCode.BTC) {
                    continuation = ((BitcoinAmountPickerResult) mutableState.getValue()).bitcoinAmount;
                } else {
                    Money money = ((BitcoinAmountPickerResult) mutableState.getValue()).userInputtedAmount;
                    if (money != null) {
                        r3 = money;
                        return new BitcoinAmountPickerScreen(amountPickerPurpose, r3, ((BitcoinAmountPickerResult) mutableState.getValue()).note, askedQuestion3, false, 16);
                    }
                    Money money2 = (Money) ((State) obj2).getValue();
                    if (money2 != null) {
                        continuation = Moneys.convertBitcoinEquivalentAmount(((BitcoinAmountPickerResult) mutableState.getValue()).bitcoinAmount, money2);
                    }
                }
                r3 = continuation;
                return new BitcoinAmountPickerScreen(amountPickerPurpose, r3, ((BitcoinAmountPickerResult) mutableState.getValue()).note, askedQuestion3, false, 16);
            case 6:
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                Function1 function1 = (Function1) obj3;
                Function0 function0 = (Function0) obj2;
                for (Object obj5 : ((FilterGroupsSectionViewModel) obj4).filterGroups) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    OffersSearchFilterGroupViewModel offersSearchFilterGroupViewModel = (OffersSearchFilterGroupViewModel) obj5;
                    FilterBarScope.legacyChip$default(filterBarScope, new AbstractSignatureParts$$Lambda$2(i3, function0, function1), null, false, offersSearchFilterGroupViewModel.active, FilterBarChipType.Dropdown, offersSearchFilterGroupViewModel.name, new ComposableLambdaImpl(new AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3(offersSearchFilterGroupViewModel, i2), true, -1826426876), 6);
                    i3 = i4;
                }
                return Unit.INSTANCE;
            case 7:
                AvatarCarouselEntry avatarCarouselEntry = (AvatarCarouselEntry) obj;
                avatarCarouselEntry.getClass();
                Iterator it = ((OffersSearchListItemViewModel.RecentlyViewedSectionViewModel) obj4).models.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (Intrinsics.areEqual(((LogoViewModel) next).id, avatarCarouselEntry.key)) {
                            logoViewModel = next;
                        }
                    }
                }
                LogoViewModel logoViewModel2 = logoViewModel;
                if (logoViewModel2 != null) {
                    ((Function1) obj3).invoke(new OfferItemClicked(logoViewModel2.tapActionUrl, logoViewModel2.itemToken, logoViewModel2.tapEventSpecs));
                    ((Function0) obj2).invoke();
                }
                return Unit.INSTANCE;
            case 8:
                AskedQuestion askedQuestion4 = (AskedQuestion) obj;
                askedQuestion4.getClass();
                AllocationGroupWithPercentage allocationGroupWithPercentage = (AllocationGroupWithPercentage) obj4;
                long percentageBps = allocationGroupWithPercentage.getPercentageBps();
                List list = (List) ((MutableState) obj2).getValue();
                List list2 = allocationGroupWithPercentage.allocations;
                long basisPoints = UtilsKt.getBasisPoints(UtilsKt.forceToWholePercentage(UtilsKt.maxAllocationFor((MultipleAllocationBlocker.Allocation) CollectionsKt.first(list2), CollectionsKt.minus((Iterable) list, (Iterable) CollectionsKt.toSet(list2)), new HelpSheetViewKt$$ExternalSyntheticLambda4(11), new HelpSheetViewKt$$ExternalSyntheticLambda4(12))));
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                MultipleAllocationBlocker multipleAllocationBlocker = (MultipleAllocationBlocker) cardLockPresenter.ioDispatcher;
                return new CustomAllocationScreen(askedQuestion4, percentageBps, basisPoints, multipleAllocationBlocker.title, multipleAllocationBlocker.customAmountSubtitle, ((SetPaycheckMultipleAllocationScreen) cardLockPresenter.args).accentColor);
            case 9:
                AskedQuestion askedQuestion5 = (AskedQuestion) obj;
                askedQuestion5.getClass();
                Money access$models$rawAmountAsMoney = LocalPosLocalCashRedemptionPresenter.access$models$rawAmountAsMoney((MutableState) obj3);
                InstrumentSelection instrumentSelection2 = (InstrumentSelection) ((MutableState) obj2).getValue();
                String str6 = instrumentSelection2 != null ? instrumentSelection2.instrument_token : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                boolean z = ((LocalPosLocalCashRedemptionPresenter) obj4).canAbandonCheckIn;
                SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                return new InstrumentSelectionScreen(access$models$rawAmountAsMoney, askedQuestion5, str6, emptyList, true, z, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
            case 10:
                AskedQuestion askedQuestion6 = (AskedQuestion) obj;
                PoolContributeWithNotePresenter poolContributeWithNotePresenter = (PoolContributeWithNotePresenter) obj4;
                askedQuestion6.getClass();
                AbstractPersistentList abstractPersistentList = PoolContributeWithNotePresenter.quickAmounts;
                Money amount = ((PoolContributeWithNoteViewModel) ((MutableState) obj3).getValue()).getAmount();
                InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) ((MutableState) obj2).getValue();
                if (instrumentSelectionRowViewModel != null && (instrumentSelection = instrumentSelectionRowViewModel.instrumentSelection) != null) {
                    str = instrumentSelection.instrument_token;
                }
                Long l = poolContributeWithNotePresenter.args.poolCreditCardBps;
                return new InstrumentSelectionScreen(amount, askedQuestion6, str, CollectionsKt__CollectionsJVMKt.listOf(new RecipientPaymentInfo(l != null ? l.longValue() : 0L, false)), true ^ poolContributeWithNotePresenter.isOwner, false, poolContributeWithNotePresenter.stringManager.get(R.string.instrument_page_title), 672);
            case 11:
                final Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding = (Pi2GenericUiStepScreenBinding) obj;
                pi2GenericUiStepScreenBinding.getClass();
                final UiComponentScreen uiComponentScreen = (UiComponentScreen) obj4;
                final MarkwonImpl markwonImpl = uiStepUtils.setupViewsForNestedUiStep(pi2GenericUiStepScreenBinding, uiComponentScreen, (Equals$$ExternalSyntheticLambda0) obj3);
                final StateFlowKt$combineState$2 stateFlowKt$combineState$2 = (StateFlowKt$combineState$2) obj2;
                final int i5 = 1;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationView$special$$inlined$getViewFactoryForScreen$default$2$1
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj6, ViewEnvironment viewEnvironment) {
                        Drawable backgroundImageDrawable;
                        int i6 = i5;
                        MarkwonImpl markwonImpl2 = markwonImpl;
                        FunctionReferenceImpl functionReferenceImpl = stateFlowKt$combineState$2;
                        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
                        Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding2 = pi2GenericUiStepScreenBinding;
                        viewEnvironment.getClass();
                        switch (i6) {
                            case 0:
                                Integer backgroundColor = uiComponentScreen2.getBackgroundColor();
                                if (backgroundColor != null) {
                                    int intValue = backgroundColor.intValue();
                                    pi2GenericUiStepScreenBinding2.rootView.setBackgroundColor(intValue);
                                    Context context = pi2GenericUiStepScreenBinding2.rootView.getContext();
                                    context.getClass();
                                    zzat.updateSystemUiColor(viewEnvironment, context, intValue);
                                }
                                Context context2 = pi2GenericUiStepScreenBinding2.rootView.getContext();
                                context2.getClass();
                                StepStyles.UiStepStyle uiStepStyle = uiComponentScreen2.styles;
                                backgroundImageDrawable = uiStepStyle != null ? AbstractHashFunction.backgroundImageDrawable(uiStepStyle, context2) : null;
                                if (backgroundImageDrawable != null) {
                                    pi2GenericUiStepScreenBinding2.rootView.setBackground(backgroundImageDrawable);
                                    pi2GenericUiStepScreenBinding2.footerContainer.setBackgroundColor(0);
                                }
                                ((StateFlowKt$combineState$2) functionReferenceImpl).invoke(pi2GenericUiStepScreenBinding2, obj6, (LinkedHashMap) ((o0) markwonImpl2.parser).a);
                                break;
                            default:
                                Integer backgroundColor2 = uiComponentScreen2.getBackgroundColor();
                                if (backgroundColor2 != null) {
                                    int intValue2 = backgroundColor2.intValue();
                                    pi2GenericUiStepScreenBinding2.rootView.setBackgroundColor(intValue2);
                                    Context context3 = pi2GenericUiStepScreenBinding2.rootView.getContext();
                                    context3.getClass();
                                    zzat.updateSystemUiColor(viewEnvironment, context3, intValue2);
                                }
                                Context context4 = pi2GenericUiStepScreenBinding2.rootView.getContext();
                                context4.getClass();
                                StepStyles.UiStepStyle uiStepStyle2 = uiComponentScreen2.styles;
                                backgroundImageDrawable = uiStepStyle2 != null ? AbstractHashFunction.backgroundImageDrawable(uiStepStyle2, context4) : null;
                                if (backgroundImageDrawable != null) {
                                    pi2GenericUiStepScreenBinding2.rootView.setBackground(backgroundImageDrawable);
                                    pi2GenericUiStepScreenBinding2.footerContainer.setBackgroundColor(0);
                                }
                                ((StateFlowKt$combineState$2) functionReferenceImpl).invoke(pi2GenericUiStepScreenBinding2, obj6, (LinkedHashMap) ((o0) markwonImpl2.parser).a);
                                break;
                        }
                    }
                };
            default:
                final Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding2 = (Pi2GenericUiStepScreenBinding) obj;
                pi2GenericUiStepScreenBinding2.getClass();
                final UiComponentScreen uiComponentScreen2 = (UiComponentScreen) obj4;
                final MarkwonImpl markwonImpl2 = uiStepUtils.setupViewsForNestedUiStep(pi2GenericUiStepScreenBinding2, uiComponentScreen2, (Equals$$ExternalSyntheticLambda0) obj3);
                final StateFlowKt$combineState$2 stateFlowKt$combineState$22 = (StateFlowKt$combineState$2) obj2;
                final int i6 = 0;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationView$special$$inlined$getViewFactoryForScreen$default$2$1
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj6, ViewEnvironment viewEnvironment) {
                        Drawable backgroundImageDrawable;
                        int i62 = i6;
                        MarkwonImpl markwonImpl22 = markwonImpl2;
                        FunctionReferenceImpl functionReferenceImpl = stateFlowKt$combineState$22;
                        UiComponentScreen uiComponentScreen22 = uiComponentScreen2;
                        Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding22 = pi2GenericUiStepScreenBinding2;
                        viewEnvironment.getClass();
                        switch (i62) {
                            case 0:
                                Integer backgroundColor = uiComponentScreen22.getBackgroundColor();
                                if (backgroundColor != null) {
                                    int intValue = backgroundColor.intValue();
                                    pi2GenericUiStepScreenBinding22.rootView.setBackgroundColor(intValue);
                                    Context context = pi2GenericUiStepScreenBinding22.rootView.getContext();
                                    context.getClass();
                                    zzat.updateSystemUiColor(viewEnvironment, context, intValue);
                                }
                                Context context2 = pi2GenericUiStepScreenBinding22.rootView.getContext();
                                context2.getClass();
                                StepStyles.UiStepStyle uiStepStyle = uiComponentScreen22.styles;
                                backgroundImageDrawable = uiStepStyle != null ? AbstractHashFunction.backgroundImageDrawable(uiStepStyle, context2) : null;
                                if (backgroundImageDrawable != null) {
                                    pi2GenericUiStepScreenBinding22.rootView.setBackground(backgroundImageDrawable);
                                    pi2GenericUiStepScreenBinding22.footerContainer.setBackgroundColor(0);
                                }
                                ((StateFlowKt$combineState$2) functionReferenceImpl).invoke(pi2GenericUiStepScreenBinding22, obj6, (LinkedHashMap) ((o0) markwonImpl22.parser).a);
                                break;
                            default:
                                Integer backgroundColor2 = uiComponentScreen22.getBackgroundColor();
                                if (backgroundColor2 != null) {
                                    int intValue2 = backgroundColor2.intValue();
                                    pi2GenericUiStepScreenBinding22.rootView.setBackgroundColor(intValue2);
                                    Context context3 = pi2GenericUiStepScreenBinding22.rootView.getContext();
                                    context3.getClass();
                                    zzat.updateSystemUiColor(viewEnvironment, context3, intValue2);
                                }
                                Context context4 = pi2GenericUiStepScreenBinding22.rootView.getContext();
                                context4.getClass();
                                StepStyles.UiStepStyle uiStepStyle2 = uiComponentScreen22.styles;
                                backgroundImageDrawable = uiStepStyle2 != null ? AbstractHashFunction.backgroundImageDrawable(uiStepStyle2, context4) : null;
                                if (backgroundImageDrawable != null) {
                                    pi2GenericUiStepScreenBinding22.rootView.setBackground(backgroundImageDrawable);
                                    pi2GenericUiStepScreenBinding22.footerContainer.setBackgroundColor(0);
                                }
                                ((StateFlowKt$combineState$2) functionReferenceImpl).invoke(pi2GenericUiStepScreenBinding22, obj6, (LinkedHashMap) ((o0) markwonImpl22.parser).a);
                                break;
                        }
                    }
                };
        }
    }
}
