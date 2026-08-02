package app.cash.local.presenters.brand.checkout;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.datastore.core.SimpleActor;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.local.primitives.Cart;
import app.cash.local.viewmodels.OrderBuilderEvent;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.api.Dependent;
import com.squareup.cash.family.familyhub.presenters.DependentControlsAndLimitsPresenter$models$1$1$1;
import com.squareup.cash.initialscreenloader.backend.AppVersionCheckerActivityWorker;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeRequiredScreen;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeSuggestedScreen;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.db.InvestingSearchTableQueries$entityBySearch$2;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.db.InvestmentEntityQueries$forTokens$2;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$OpenTheApp$ForceUpdate;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okhttp3.Cookie;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CheckoutTipStateKt$rememberCheckoutTipState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $currentCart$delegate;
    public final /* synthetic */ Object $currentOrderBuilderOnEvent$delegate;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $state;
    public final /* synthetic */ boolean $tippingEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutTipStateKt$rememberCheckoutTipState$1$1(Object obj, Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = obj;
        this.$currentOrderBuilderOnEvent$delegate = obj2;
        this.$currentCart$delegate = obj3;
        this.$tippingEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        boolean z = this.$tippingEnabled;
        Object obj2 = this.$currentCart$delegate;
        Object obj3 = this.$currentOrderBuilderOnEvent$delegate;
        switch (i) {
            case 0:
                return new CheckoutTipStateKt$rememberCheckoutTipState$1$1(this.$tippingEnabled, (CheckoutTipState) this.$state, (MutableState) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                CheckoutTipStateKt$rememberCheckoutTipState$1$1 checkoutTipStateKt$rememberCheckoutTipState$1$1 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1((TextFieldSelectionState) obj3, (PointerInputScope) obj2, z, continuation);
                checkoutTipStateKt$rememberCheckoutTipState$1$1.$state = obj;
                return checkoutTipStateKt$rememberCheckoutTipState$1$1;
            case 2:
                CheckoutTipStateKt$rememberCheckoutTipState$1$1 checkoutTipStateKt$rememberCheckoutTipState$1$12 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z, (MutableState) obj3, (RealBitcoinAmountPickerPresenter) obj2, continuation);
                checkoutTipStateKt$rememberCheckoutTipState$1$12.$state = obj;
                return checkoutTipStateKt$rememberCheckoutTipState$1$12;
            case 3:
                return new CheckoutTipStateKt$rememberCheckoutTipState$1$1(this.$tippingEnabled, (AppVersionCheckerActivityWorker) this.$state, (String) obj3, (String) obj2, continuation, 3);
            case 4:
                return new CheckoutTipStateKt$rememberCheckoutTipState$1$1((CashAccountDatabaseImpl) this.$state, (Set) obj3, (Set) obj2, this.$tippingEnabled, continuation, 4);
            case 5:
                return new CheckoutTipStateKt$rememberCheckoutTipState$1$1((CashAccountDatabaseImpl) this.$state, (String) obj3, (Set) obj2, this.$tippingEnabled, continuation, 5);
            default:
                return new CheckoutTipStateKt$rememberCheckoutTipState$1$1((Set) this.$state, (Set) obj3, (AccountPickerViewModel) obj2, this.$tippingEnabled, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CheckoutTipStateKt$rememberCheckoutTipState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 4;
        Continuation continuation = null;
        int i3 = 10;
        int i4 = 1;
        Object obj2 = this.$currentOrderBuilderOnEvent$delegate;
        Object obj3 = this.$currentCart$delegate;
        boolean z = this.$tippingEnabled;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    WorkLauncherImpl workLauncherImpl = CheckoutTipStateKt.CheckoutTipStateSaver;
                    ((Function1) ((MutableState) obj2).getValue()).invoke(new OrderBuilderEvent.UpdateTipAmount(((CheckoutTipState) this.$state).currentTipAsMoney(((Cart) ((MutableState) obj3).getValue()).total.currencyCode)));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.$state;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj2;
                PointerInputScope pointerInputScope = (PointerInputScope) obj3;
                JobKt.launch$default(coroutineScope, null, coroutineStart, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, continuation, i2), 1);
                JobKt.launch$default(coroutineScope, null, coroutineStart, new TextFieldSelectionState$selectionHandleGestures$2$2(pointerInputScope, textFieldSelectionState, z, (Continuation) null), 1).invokeOnCompletion(new TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0(textFieldSelectionState, i4));
                return JobKt.launch$default(coroutineScope, null, coroutineStart, new TextFieldSelectionState$selectionHandleGestures$2$2(textFieldSelectionState, pointerInputScope, z, (Continuation) null), 1);
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$state;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Dependent) ((MutableState) obj2).getValue()) != null && !z) {
                    JobKt.launch$default(coroutineScope2, null, null, new DependentControlsAndLimitsPresenter$models$1$1$1((RealBitcoinAmountPickerPresenter) obj3, continuation, i2), 3);
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj3;
                String str2 = (String) obj2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AppVersionCheckerActivityWorker appVersionCheckerActivityWorker = (AppVersionCheckerActivityWorker) this.$state;
                if (z) {
                    Provider provider = ((RealOpenTheAppUserJourney) appVersionCheckerActivityWorker.openTheAppUserJourney).userJourneyTrackerProvider;
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider.invoke();
                    UserJourney$Name userJourney$Name = UserJourney$Name.OPEN_THE_APP;
                    ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(userJourney$Name, UserJourney$Friction$OpenTheApp$ForceUpdate.INSTANCE);
                    ((RealUserJourneyTracker) ((UserJourneyTracker) provider.invoke())).endJourney(userJourney$Name, UserJourney$Outcome.Succeeded.INSTANCE);
                    MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1 = appVersionCheckerActivityWorker.navigatorSwitcher;
                    AppUpgradeRequiredScreen appUpgradeRequiredScreen = new AppUpgradeRequiredScreen(str2, str);
                    MainContainerDelegate mainContainerDelegate = mainActivity$navigatorSwitcher$1.this$0.mainContainerDelegate;
                    if (mainContainerDelegate == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
                        throw null;
                    }
                    CashNavigator cashNavigator = mainContainerDelegate.cashNavigator;
                    cashNavigator.getClass();
                    SimpleActor simpleActor = cashNavigator.navigator;
                    NavigatorState navigatorState = NavigatorState.UpdateRequired;
                    simpleActor.setActiveKey(navigatorState);
                    simpleActor.navigatorFor(navigatorState).goTo(appUpgradeRequiredScreen, null, null);
                } else {
                    appVersionCheckerActivityWorker.navigator.goTo(new AppUpgradeSuggestedScreen(str2, str));
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestmentEntityQueries investmentEntityQueries = ((CashAccountDatabaseImpl) this.$state).investmentEntityQueries;
                Set set = (Set) obj2;
                investmentEntityQueries.getClass();
                set.getClass();
                InvestmentEntityQueries$forTokens$2 investmentEntityQueries$forTokens$2 = InvestmentEntityQueries$forTokens$2.INSTANCE;
                List executeAsList = new OffersSheetQueries$ForSheetKeyQuery(investmentEntityQueries, set, new InvestmentEntityQueries$$ExternalSyntheticLambda7(investmentEntityQueries, 2)).executeAsList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
                Iterator it = executeAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Cookie.Companion.access$SearchResultItemModel((Investment_entity) it.next()));
                }
                Set set2 = (Set) obj3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Cookie.Companion.access$updateStatus((InvestingStockSelectionViewModel.SearchResultItemModel) it2.next(), set2, z));
                }
                return CollectionsKt.sortedWith(arrayList2, new SemanticsSortKt$special$$inlined$thenBy$1(new b.C0008b(19), i3));
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingDiscoveryQueries investingDiscoveryQueries = ((CashAccountDatabaseImpl) this.$state).investingSearchTableQueries;
                ByteString.Companion companion = InvestmentEntityStatus.Companion;
                String str3 = (String) obj2;
                investingDiscoveryQueries.getClass();
                str3.getClass();
                InvestingSearchTableQueries$entityBySearch$2 investingSearchTableQueries$entityBySearch$2 = InvestingSearchTableQueries$entityBySearch$2.INSTANCE;
                List executeAsList2 = new BadgeQueries$VersionQuery(investingDiscoveryQueries, str3, new InvestingSearchTableQueries$$ExternalSyntheticLambda0(investingDiscoveryQueries, i4)).executeAsList();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList2, 10));
                Iterator it3 = executeAsList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Cookie.Companion.access$SearchResultItemModel((Investment_entity) it3.next()));
                }
                Set set3 = (Set) obj3;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Cookie.Companion.access$updateStatus((InvestingStockSelectionViewModel.SearchResultItemModel) it4.next(), set3, z));
                }
                return new InvestingStockSelectionViewModel.SearchResultModel.UnlabeledSection(arrayList4);
            default:
                AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) obj3;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set4 = (Set) this.$state;
                Set set5 = (Set) obj2;
                Set minus = SetsKt___SetsKt.minus(set4, (Iterable) set5);
                Set minus2 = SetsKt___SetsKt.minus(set5, (Iterable) set4);
                if (minus.size() == 1) {
                    accountPickerViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(AccountPickerViewModel.PANE, true, z, (String) CollectionsKt.first(minus)));
                }
                if (minus2.size() == 1) {
                    accountPickerViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(AccountPickerViewModel.PANE, false, z, (String) CollectionsKt.first(minus2)));
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutTipStateKt$rememberCheckoutTipState$1$1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$currentOrderBuilderOnEvent$delegate = textFieldSelectionState;
        this.$currentCart$delegate = pointerInputScope;
        this.$tippingEnabled = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutTipStateKt$rememberCheckoutTipState$1$1(boolean z, MutableState mutableState, RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$tippingEnabled = z;
        this.$currentOrderBuilderOnEvent$delegate = mutableState;
        this.$currentCart$delegate = realBitcoinAmountPickerPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutTipStateKt$rememberCheckoutTipState$1$1(boolean z, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$tippingEnabled = z;
        this.$state = obj;
        this.$currentOrderBuilderOnEvent$delegate = obj2;
        this.$currentCart$delegate = obj3;
    }
}
