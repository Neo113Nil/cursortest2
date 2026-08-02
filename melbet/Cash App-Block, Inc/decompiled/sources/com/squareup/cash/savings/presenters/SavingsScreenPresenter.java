package com.squareup.cash.savings.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.core.text.TextUtilsCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.family.activity.presenters.DependentActivitiesContextKt;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentBalance;
import com.squareup.cash.family.familyhub.backend.api.DependentBalanceName;
import com.squareup.cash.family.familyhub.backend.api.DependentBalances;
import com.squareup.cash.family.familyhub.backend.real.DependentBalanceCategory;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$WhenMappings;
import com.squareup.cash.family.familyhub.presenters.DependentDetailPresenter$models$1$1;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.BadgeName;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentActivityEmbeddedSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentNotificationsSectionModel;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$TeenQrCode;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.recurringpayments.backend.RecurringPayment;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.data.ActiveGoal;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore$Factory$Impl;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$getGeneralSavingsBalance$2;
import com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$getSavingsBalance$2;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext$Context$GeneralFolder;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext$Context$GoalFolder;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext$Context$Home;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsScreensRequest;
import com.squareup.protos.cash.piggybank.appapi.RemoveActiveGoalRequest;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.Strings;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcStatus;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InputEventTrigger;
import papa.SafeTrace;
import squareup.cash.analytics.CdfEvent;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class SavingsScreenPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object activeGoalStore;
    public final Object activitiesCacheManager;
    public final Analytics analytics;
    public final Object errorReporter;
    public final Object goalLocalStatus;
    public final Object ioDispatcher;
    public final Object lastSeenBalance;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object observabilityManager;
    public final Object oneErrorPerAppSessionStrategy;
    public final RealRouter router;
    public final Object savingsBalanceStore;
    public final Object savingsScreenContentFactory;
    public final Object screenKey;
    public final Object screenType;
    public final Object service;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;
    public final Object syncValueReader;

    public SavingsScreenPresenter(SyncValueReader syncValueReader, SyncValuesBasedSavingsBalanceStore syncValuesBasedSavingsBalanceStore, PersistentActiveGoalStore$Factory$Impl persistentActiveGoalStore$Factory$Impl, AndroidStringManager androidStringManager, ErrorReporter errorReporter, SampleStrategy sampleStrategy, PiggybankAppService piggybankAppService, Analytics analytics, SavingsScreenContentFactory$Factory$Impl savingsScreenContentFactory$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, RealObservabilityManager realObservabilityManager, SessionManager sessionManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator, SavingsScreen.ScreenType screenType) {
        String str;
        screenType.getClass();
        this.syncValueReader = syncValueReader;
        this.savingsBalanceStore = syncValuesBasedSavingsBalanceStore;
        this.stringManager = androidStringManager;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.service = piggybankAppService;
        this.analytics = analytics;
        this.activitiesCacheManager = realActivitiesCacheManager;
        this.observabilityManager = realObservabilityManager;
        this.sessionManager = sessionManager;
        this.ioDispatcher = coroutineContext;
        this.navigator = screenNavigator;
        this.screenType = screenType;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.activeGoalStore = persistentActiveGoalStore$Factory$Impl.create$1(syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.VersionedSavingsFolders, EmptyList.INSTANCE, new SavingsScreenPresenter$$ExternalSyntheticLambda1(this, 1)));
        this.savingsScreenContentFactory = savingsScreenContentFactory$Factory$Impl.create(screenNavigator, screenType);
        if (screenType.equals(SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
            ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
            str = "savings_general_screen";
        } else if (screenType instanceof SavingsScreen.ScreenType.GoalDetail) {
            ObservabilityView[] observabilityViewArr2 = ObservabilityView.$VALUES;
            str = "savings_goal_screen";
        } else {
            if (!screenType.equals(SavingsScreen.ScreenType.Home.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            ObservabilityView[] observabilityViewArr3 = ObservabilityView.$VALUES;
            str = "savings_home_screen";
        }
        this.screenKey = str;
        this.goalLocalStatus = cashAccountDatabaseImpl.savingsGoalLocalStatusQueries;
        this.lastSeenBalance = cashAccountDatabaseImpl.lastSeenSavingsBalanceQueries;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshSavingsScreens(SavingsScreenPresenter savingsScreenPresenter, ContinuationImpl continuationImpl) {
        SavingsScreenPresenter$refreshSavingsScreens$1 savingsScreenPresenter$refreshSavingsScreens$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof SavingsScreenPresenter$refreshSavingsScreens$1) {
            savingsScreenPresenter$refreshSavingsScreens$1 = (SavingsScreenPresenter$refreshSavingsScreens$1) continuationImpl;
            int i2 = savingsScreenPresenter$refreshSavingsScreens$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                savingsScreenPresenter$refreshSavingsScreens$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = savingsScreenPresenter$refreshSavingsScreens$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsScreenPresenter$refreshSavingsScreens$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshSavingsScreensRequest refreshSavingsScreensRequest = new RefreshSavingsScreensRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    PiggybankAppService piggybankAppService = (PiggybankAppService) savingsScreenPresenter.service;
                    savingsScreenPresenter$refreshSavingsScreens$1.label = 1;
                    obj = piggybankAppService.refreshSavingsScreens(refreshSavingsScreensRequest, savingsScreenPresenter$refreshSavingsScreens$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.w("Failed to refresh Savings Screens: " + TextUtilsCompat.errorMessaging(savingsScreenPresenter.stringManager, (ApiResult.Failure) apiResult, null), new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully refreshed Savings Screens", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        savingsScreenPresenter$refreshSavingsScreens$1 = new SavingsScreenPresenter$refreshSavingsScreens$1(savingsScreenPresenter, continuationImpl);
        Object obj2 = savingsScreenPresenter$refreshSavingsScreens$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsScreenPresenter$refreshSavingsScreens$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$removeActiveGoal(SavingsScreenPresenter savingsScreenPresenter, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1, ContinuationImpl continuationImpl) {
        SavingsScreenPresenter$removeActiveGoal$1 savingsScreenPresenter$removeActiveGoal$1;
        int i;
        ApiResult apiResult;
        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$12 = shiftNotePresenter$models$1$1;
        if (continuationImpl instanceof SavingsScreenPresenter$removeActiveGoal$1) {
            savingsScreenPresenter$removeActiveGoal$1 = (SavingsScreenPresenter$removeActiveGoal$1) continuationImpl;
            int i2 = savingsScreenPresenter$removeActiveGoal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                savingsScreenPresenter$removeActiveGoal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = savingsScreenPresenter$removeActiveGoal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsScreenPresenter$removeActiveGoal$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    shiftNotePresenter$models$1$12.invoke(Boolean.TRUE);
                    PiggybankAppService piggybankAppService = (PiggybankAppService) savingsScreenPresenter.service;
                    RemoveActiveGoalRequest removeActiveGoalRequest = new RemoveActiveGoalRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    savingsScreenPresenter$removeActiveGoal$1.L$0 = shiftNotePresenter$models$1$12;
                    savingsScreenPresenter$removeActiveGoal$1.label = 1;
                    obj = piggybankAppService.removeActiveGoal(removeActiveGoalRequest, savingsScreenPresenter$removeActiveGoal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    shiftNotePresenter$models$1$12 = savingsScreenPresenter$removeActiveGoal$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.e("Failed to remove active goal: " + TextUtilsCompat.errorMessaging(savingsScreenPresenter.stringManager, (ApiResult.Failure) apiResult, null), new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully removed active goal", new Object[0]);
                }
                shiftNotePresenter$models$1$12.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        savingsScreenPresenter$removeActiveGoal$1 = new SavingsScreenPresenter$removeActiveGoal$1(savingsScreenPresenter, continuationImpl);
        Object obj2 = savingsScreenPresenter$removeActiveGoal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsScreenPresenter$removeActiveGoal$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        shiftNotePresenter$models$1$12.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static SavingsTransferContext getTransferContext(SavingsScreen.ScreenType screenType) {
        if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.Home.INSTANCE)) {
            return new SavingsTransferContext(new SavingsTransferContext$Context$Home(new SavingsTransferContext.Home(ByteString.EMPTY)));
        }
        if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
            return new SavingsTransferContext(new SavingsTransferContext$Context$GeneralFolder(new SavingsTransferContext.GeneralFolder(ByteString.EMPTY)));
        }
        if (screenType instanceof SavingsScreen.ScreenType.GoalDetail) {
            return new SavingsTransferContext(new SavingsTransferContext$Context$GoalFolder(new SavingsTransferContext.GoalFolder(((SavingsScreen.ScreenType.GoalDetail) screenType).token, ByteString.EMPTY)));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x08e0, code lost:
    
        if (r7 == null) goto L316;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01db  */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter] */
    /* JADX WARN: Type inference failed for: r1v143, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v145, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v146, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v151, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v153, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v1, types: [com.squareup.cash.savings.presenters.SavingsScreenContentFactory] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.squareup.cash.savings.backend.api.data.ActiveGoal] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent$BalanceSeenEvent] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6, types: [com.squareup.cash.ui.widget.StackedAvatarViewModel$Avatar] */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5, types: [com.squareup.cash.family.familyhub.viewmodels.BadgeName] */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [com.squareup.cash.savings.backend.api.data.ActiveGoal] */
    /* JADX WARN: Type inference failed for: r7v81 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        Object appLockMonitor$special$$inlined$map$2;
        Continuation continuation;
        Money money;
        Pair pair;
        ActiveGoal.LastSeenStatus lastSeenStatus;
        Object obj;
        Money money2;
        Money money3;
        Money money4;
        Money money5;
        boolean z;
        Object obj2;
        ?? r35;
        SavingsScreenViewEvent goalBalanceSeen;
        SavingsScreenViewEvent generalBalanceSeen;
        LoadedSavingsModel loadedSavingsModel;
        Object obj3;
        Object next;
        Object appLockMonitor$special$$inlined$map$22;
        MutableState mutableState3;
        MutableState mutableState4;
        Iterator it;
        int i2;
        DependentBalance.LoadingState.SavingsBalanceLoaded savingsBalanceLoaded;
        String str;
        boolean z2;
        MutableState mutableState5;
        String str2;
        boolean z3;
        String format2;
        DependentAccessControlsViewModel dependentAccessControlsViewModel;
        Continuation continuation2;
        ?? listOf;
        int i3 = this.$r8$classId;
        Object obj4 = this.savingsBalanceStore;
        Object obj5 = this.screenKey;
        Object obj6 = this.screenType;
        Object obj7 = this.ioDispatcher;
        Object obj8 = this.lastSeenBalance;
        Object obj9 = this.observabilityManager;
        Object obj10 = Composer.Companion.Empty;
        Object obj11 = this.savingsScreenContentFactory;
        Object obj12 = this.activeGoalStore;
        int i4 = 19;
        int i5 = 0;
        Continuation continuation3 = null;
        switch (i3) {
            case 0:
                CoroutineContext coroutineContext = (CoroutineContext) obj7;
                final GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj8;
                PersistentActiveGoalStore persistentActiveGoalStore = (PersistentActiveGoalStore) obj12;
                SyncValueReader syncValueReader = (SyncValueReader) this.syncValueReader;
                SavingsScreen.ScreenType screenType = (SavingsScreen.ScreenType) obj6;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1735508173);
                DragAndDrop_androidKt.AddViewAttributes((RealObservabilityManager) obj9, MapsKt__MapsJVMKt.mapOf(new Pair("type", (String) obj5)), gapComposer, 0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj10) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState6 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj10) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState7 = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj10) {
                    rememberedValue3 = StateFlowKt.combineState(syncValueReader.getSingleValue(AndroidSyncValueSpecs.VersionedSavingsScreens), syncValueReader.getAllValues(AndroidSyncValueSpecs.SavingsExternalElements), new SheetKt$$ExternalSyntheticLambda6(this, 1));
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue3, gapComposer);
                boolean changed = gapComposer.changed((SavingsScreen) receiveValueAsState.getValue());
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == obj10) {
                    if (screenType instanceof SavingsScreen.ScreenType.GoalDetail) {
                        String str3 = ((SavingsScreen.ScreenType.GoalDetail) screenType).token;
                        persistentActiveGoalStore.getClass();
                        str3.getClass();
                        mutableState = mutableState6;
                        mutableState2 = mutableState7;
                        appLockMonitor$special$$inlined$map$2 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(persistentActiveGoalStore.savingsFolders, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, persistentActiveGoalStore, str3, 24)), 22);
                    } else {
                        mutableState = mutableState6;
                        mutableState2 = mutableState7;
                        SavingsScreen savingsScreen = (SavingsScreen) receiveValueAsState.getValue();
                        appLockMonitor$special$$inlined$map$2 = (savingsScreen == null || !savingsScreen.useSingleGoalRules) ? new AppLockMonitor$special$$inlined$map$2(new LoadedSavingsModel(null), 19) : new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(persistentActiveGoalStore.savingsFolders, new RealPasscodeProvider$getPasscode$1((Continuation) null, persistentActiveGoalStore, 7)), 23);
                    }
                    rememberedValue4 = appLockMonitor$special$$inlined$map$2;
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    mutableState = mutableState6;
                    mutableState2 = mutableState7;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
                LoadedSavingsModel loadedSavingsModel2 = (LoadedSavingsModel) collectAsState.getValue();
                if (loadedSavingsModel2 != null) {
                    gapComposer.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer, loadedSavingsModel2, new AndroidFileSaver$save$2(loadedSavingsModel2, (Continuation) null, this, 24));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1106436997);
                    gapComposer.end(false);
                }
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj10) {
                    rememberedValue5 = ((SyncValuesBasedSavingsBalanceStore) obj4).get();
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj10) {
                    if (screenType instanceof SavingsScreen.ScreenType.Home) {
                        gpsConfigQueries.getClass();
                        int i6 = LastSeenSavingsBalanceQueries$getSavingsBalance$2.$r8$clinit;
                        SqlDriver sqlDriver = gpsConfigQueries.driver;
                        final int i7 = 1;
                        Function1 function1 = new Function1(gpsConfigQueries, i7) { // from class: com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$$ExternalSyntheticLambda2
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ GpsConfigQueries f$1;

                            {
                                this.$r8$classId = i7;
                                switch (i7) {
                                    case 1:
                                        int i8 = LastSeenSavingsBalanceQueries$getSavingsBalance$2.$r8$clinit;
                                        break;
                                    default:
                                        int i9 = LastSeenSavingsBalanceQueries$getGeneralSavingsBalance$2.$r8$clinit;
                                        break;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
                            /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                int i8 = this.$r8$classId;
                                GpsConfigQueries gpsConfigQueries2 = this.f$1;
                                switch (i8) {
                                    case 0:
                                        int i9 = LastSeenSavingsBalanceQueries$getGeneralSavingsBalance$2.$r8$clinit;
                                        AndroidCursor androidCursor = (AndroidCursor) obj13;
                                        androidCursor.getClass();
                                        ?? bytes = androidCursor.getBytes(0);
                                        return new GetGeneralSavingsBalance(bytes != 0 ? (Money) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.decode(bytes) : null);
                                    default:
                                        int i10 = LastSeenSavingsBalanceQueries$getSavingsBalance$2.$r8$clinit;
                                        AndroidCursor androidCursor2 = (AndroidCursor) obj13;
                                        androidCursor2.getClass();
                                        ?? bytes2 = androidCursor2.getBytes(0);
                                        return new GetSavingsBalance(bytes2 != 0 ? (Money) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.decode(bytes2) : null);
                                }
                            }
                        };
                        sqlDriver.getClass();
                        appLockMonitor$special$$inlined$map$22 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(284530082, new String[]{"lastSeenSavingsBalance"}, sqlDriver, "LastSeenSavingsBalance.sq", "getSavingsBalance", "SELECT balance FROM lastSeenSavingsBalance\nLIMIT 1", function1)), coroutineContext), 22);
                    } else if (screenType instanceof SavingsScreen.ScreenType.GeneralSavings) {
                        gpsConfigQueries.getClass();
                        int i8 = LastSeenSavingsBalanceQueries$getGeneralSavingsBalance$2.$r8$clinit;
                        SqlDriver sqlDriver2 = gpsConfigQueries.driver;
                        final int i9 = 0;
                        Function1 function12 = new Function1(gpsConfigQueries, i9) { // from class: com.squareup.cash.savings.db.LastSeenSavingsBalanceQueries$$ExternalSyntheticLambda2
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ GpsConfigQueries f$1;

                            {
                                this.$r8$classId = i9;
                                switch (i9) {
                                    case 1:
                                        int i82 = LastSeenSavingsBalanceQueries$getSavingsBalance$2.$r8$clinit;
                                        break;
                                    default:
                                        int i92 = LastSeenSavingsBalanceQueries$getGeneralSavingsBalance$2.$r8$clinit;
                                        break;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
                            /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                int i82 = this.$r8$classId;
                                GpsConfigQueries gpsConfigQueries2 = this.f$1;
                                switch (i82) {
                                    case 0:
                                        int i92 = LastSeenSavingsBalanceQueries$getGeneralSavingsBalance$2.$r8$clinit;
                                        AndroidCursor androidCursor = (AndroidCursor) obj13;
                                        androidCursor.getClass();
                                        ?? bytes = androidCursor.getBytes(0);
                                        return new GetGeneralSavingsBalance(bytes != 0 ? (Money) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.decode(bytes) : null);
                                    default:
                                        int i10 = LastSeenSavingsBalanceQueries$getSavingsBalance$2.$r8$clinit;
                                        AndroidCursor androidCursor2 = (AndroidCursor) obj13;
                                        androidCursor2.getClass();
                                        ?? bytes2 = androidCursor2.getBytes(0);
                                        return new GetSavingsBalance(bytes2 != 0 ? (Money) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.decode(bytes2) : null);
                                }
                            }
                        };
                        sqlDriver2.getClass();
                        appLockMonitor$special$$inlined$map$22 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-80186292, new String[]{"lastSeenSavingsBalance"}, sqlDriver2, "LastSeenSavingsBalance.sq", "getGeneralSavingsBalance", "SELECT generalBalance FROM lastSeenSavingsBalance\nLIMIT 1", function12)), coroutineContext), 23);
                    } else {
                        appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(new LoadedSavingsModel(null), 19);
                    }
                    rememberedValue6 = appLockMonitor$special$$inlined$map$22;
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (rememberedValue7 == obj10) {
                    rememberedValue7 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.VersionedSavingsFolders, null, new SavingsScreenPresenter$$ExternalSyntheticLambda1(this, 0));
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) rememberedValue7, gapComposer);
                boolean changed2 = gapComposer.changed((List) receiveValueAsState2.getValue()) | gapComposer.changed((SavingsScreen) receiveValueAsState.getValue());
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue8 == obj10) {
                    rememberedValue8 = Updater.derivedStateOf(new BasicShieetScope$$ExternalSyntheticLambda10(16, this, receiveValueAsState2, receiveValueAsState));
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                State state = (State) rememberedValue8;
                if (((Boolean) state.getValue()).booleanValue()) {
                    gapComposer.startReplaceGroup(-289179787);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-289234564);
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue9 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue9 == obj10) {
                        rememberedValue9 = new ChatInputView$Content$1$1$1(this, null, 4);
                        gapComposer.updateRememberedValue(rememberedValue9);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
                    gapComposer.end(false);
                }
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (rememberedValue10 == obj10) {
                    rememberedValue10 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.SavingsConfig, null, new CelebrationKt$$ExternalSyntheticLambda1(23));
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                MutableState receiveValueAsState3 = Strings.receiveValueAsState((StateFlow) rememberedValue10, gapComposer);
                SavingsScreen savingsScreen2 = (SavingsScreen) receiveValueAsState.getValue();
                SavingsBalance savingsBalance = (SavingsBalance) collectAsState2.getValue();
                Money money6 = savingsBalance != null ? savingsBalance.balance : null;
                LoadedSavingsModel loadedSavingsModel3 = (LoadedSavingsModel) collectAsState3.getValue();
                List list = (List) receiveValueAsState2.getValue();
                LoadedSavingsModel loadedSavingsModel4 = (LoadedSavingsModel) collectAsState.getValue();
                ActiveGoal activeGoal = loadedSavingsModel4 != null ? (ActiveGoal) loadedSavingsModel4.data : null;
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                SavingsScreen.ScreenType.GeneralSavings generalSavings = SavingsScreen.ScreenType.GeneralSavings.INSTANCE;
                SavingsScreen.ScreenType.Home home = SavingsScreen.ScreenType.Home.INSTANCE;
                if (savingsScreen2 == null) {
                    money4 = null;
                } else {
                    SavingsScreen.ScreenType screenType2 = savingsScreen2.f1196type;
                    if (Intrinsics.areEqual(screenType2, home)) {
                        if (loadedSavingsModel3 != null) {
                            money5 = (Money) loadedSavingsModel3.data;
                            if (money5 == null) {
                                money5 = money6;
                            }
                        } else {
                            money5 = null;
                        }
                        pair = new Pair(money6, money5);
                    } else if (Intrinsics.areEqual(screenType2, generalSavings)) {
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj13 : list) {
                                if (obj13 instanceof SavingsFolder.GeneralFolder) {
                                    arrayList.add(obj13);
                                }
                            }
                            SavingsFolder.GeneralFolder generalFolder = (SavingsFolder.GeneralFolder) CollectionsKt.first((List) arrayList);
                            if (generalFolder != null) {
                                money2 = generalFolder.balance;
                                if (loadedSavingsModel3 == null) {
                                    money3 = (Money) loadedSavingsModel3.data;
                                    if (money3 == null) {
                                        money3 = money2;
                                    }
                                } else {
                                    money3 = null;
                                }
                                pair = new Pair(money2, money3);
                            }
                        }
                        money2 = null;
                        if (loadedSavingsModel3 == null) {
                        }
                        pair = new Pair(money2, money3);
                    } else {
                        if (!(screenType2 instanceof SavingsScreen.ScreenType.GoalDetail)) {
                            continuation = null;
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation;
                        }
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj = it2.next();
                                    SavingsFolder savingsFolder = (SavingsFolder) obj;
                                    Iterator it3 = it2;
                                    SavingsFolder.GoalFolder goalFolder = savingsFolder instanceof SavingsFolder.GoalFolder ? (SavingsFolder.GoalFolder) savingsFolder : null;
                                    if (!Intrinsics.areEqual(goalFolder != null ? goalFolder.token : null, ((SavingsScreen.ScreenType.GoalDetail) screenType2).token)) {
                                        it2 = it3;
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            SavingsFolder savingsFolder2 = (SavingsFolder) obj;
                            if (savingsFolder2 != null) {
                                money = savingsFolder2.getBalance();
                                if (activeGoal != null || (lastSeenStatus = activeGoal.lastSeenStatus) == null || (r0 = lastSeenStatus.balance) == null) {
                                    Money money7 = money;
                                }
                                pair = new Pair(money, money7);
                            }
                        }
                        money = null;
                        if (activeGoal != null) {
                        }
                        Money money72 = money;
                        pair = new Pair(money, money72);
                    }
                    money4 = (Money) pair.first;
                    Money money8 = (Money) pair.second;
                    if (!booleanValue && Moneys.compareTo(money8, money4) <= 0) {
                        money4 = money8;
                    }
                }
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(money4, gapComposer);
                Money money9 = (Money) rememberUpdatedState.getValue();
                List list2 = (List) receiveValueAsState2.getValue();
                if (Intrinsics.areEqual(screenType, home)) {
                    if (list2 != null) {
                        Iterator it4 = list2.iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                Long l = ((SavingsFolder) next).getBalance().amount;
                                long longValue = l != null ? l.longValue() : 0L;
                                do {
                                    Object next2 = it4.next();
                                    Long l2 = ((SavingsFolder) next2).getBalance().amount;
                                    long longValue2 = l2 != null ? l2.longValue() : 0L;
                                    if (longValue < longValue2) {
                                        next = next2;
                                        longValue = longValue2;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        SavingsFolder savingsFolder3 = (SavingsFolder) next;
                        if (savingsFolder3 != null) {
                            money9 = savingsFolder3.getBalance();
                        }
                    }
                    money9 = null;
                } else if (!Intrinsics.areEqual(screenType, generalSavings) && !(screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(money9, gapComposer);
                SavingsBalance savingsBalance2 = (SavingsBalance) collectAsState2.getValue();
                boolean changed3 = gapComposer.changed(savingsBalance2);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue11 == obj10) {
                    rememberedValue11 = Updater.derivedStateOf(new ShareSheetViewKt$$ExternalSyntheticLambda5(8, this, savingsBalance2));
                    gapComposer.updateRememberedValue(rememberedValue11);
                }
                State state2 = (State) rememberedValue11;
                Updater.LaunchedEffect(gapComposer, flow, new CardSchemePresenter$models$3$1(flow, (Continuation) null, this, collectAsState, collectAsState2, rememberUpdatedState2, mutableState, mutableState2, 3));
                boolean changed4 = gapComposer.changed(flow);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue12 == obj10) {
                    rememberedValue12 = new NullStateSwipeConfigProvider(new RealRecipientRepository$suggestions$$inlined$map$1(flow, 6), 21);
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                Flow flow2 = (Flow) rememberedValue12;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer.changedInstance(this);
                Object rememberedValue13 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue13 == obj10) {
                    continuation = null;
                    rememberedValue13 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 17);
                    gapComposer.updateRememberedValue(rememberedValue13);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue13);
                SavingsScreen savingsScreen3 = (SavingsScreen) receiveValueAsState.getValue();
                Money money10 = (Money) rememberUpdatedState.getValue();
                if (savingsScreen3 != null && money10 != null) {
                    boolean z4 = screenType instanceof SavingsScreen.ScreenType.GoalDetail;
                    if (z4) {
                        LoadedSavingsModel loadedSavingsModel5 = (LoadedSavingsModel) collectAsState.getValue();
                        if (loadedSavingsModel5 != null) {
                            obj3 = (ActiveGoal) loadedSavingsModel5.data;
                            break;
                        } else {
                            obj3 = continuation;
                            break;
                        }
                    }
                    gapComposer.startReplaceGroup(-287420320);
                    ?? r27 = (SavingsScreenContentFactory) obj11;
                    List list3 = (List) receiveValueAsState2.getValue();
                    ?? r31 = (!((Boolean) state.getValue()).booleanValue() || (loadedSavingsModel = (LoadedSavingsModel) collectAsState.getValue()) == null) ? continuation : (ActiveGoal) loadedSavingsModel.data;
                    Animation animation = (Animation) receiveValueAsState3.getValue();
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    LoadedSavingsModel loadedSavingsModel6 = (LoadedSavingsModel) collectAsState.getValue();
                    ?? r7 = loadedSavingsModel6 != null ? (ActiveGoal) loadedSavingsModel6.data : continuation;
                    if (Intrinsics.areEqual(screenType, home)) {
                        if (r7 != 0) {
                            goalBalanceSeen = new SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen(r7.token, r7.progress, r7.amountRemaining, money10);
                            r35 = goalBalanceSeen;
                        } else {
                            generalBalanceSeen = new SavingsScreenViewEvent.BalanceSeenEvent.SavingsBalanceSeen(money10);
                            r35 = generalBalanceSeen;
                        }
                    } else if (Intrinsics.areEqual(screenType, generalSavings)) {
                        generalBalanceSeen = new SavingsScreenViewEvent.BalanceSeenEvent.GeneralBalanceSeen(money10);
                        r35 = generalBalanceSeen;
                    } else {
                        if (!z4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation;
                        }
                        if (r7 != 0) {
                            goalBalanceSeen = new SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen(((SavingsScreen.ScreenType.GoalDetail) screenType).token, r7.progress, r7.amountRemaining, money10);
                            r35 = goalBalanceSeen;
                        } else {
                            r35 = continuation;
                        }
                    }
                    obj2 = r27.content(savingsScreen3, money10, list3, r31, animation, flow2, booleanValue2, r35, (SavingsActivitySectionParams) state2.getValue(), gapComposer, 0, 0, 1536);
                    z = false;
                    gapComposer.end(false);
                    Object obj14 = obj2;
                    gapComposer.end(z);
                    return obj14;
                }
                z = false;
                gapComposer.startReplaceGroup(-287652727);
                gapComposer.end(false);
                obj2 = SavingsScreenViewModel.Loading.INSTANCE;
                Object obj142 = obj2;
                gapComposer.end(z);
                return obj142;
            default:
                Object obj15 = this.oneErrorPerAppSessionStrategy;
                DependentDetailScreen dependentDetailScreen = (DependentDetailScreen) obj15;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(203984400);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer2.changedInstance(this);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue14 == obj10) {
                    rememberedValue14 = new DependentDetailPresenter$models$1$1(this, continuation3, i5);
                    gapComposer2.updateRememberedValue(rememberedValue14);
                }
                Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue14);
                Object rememberedValue15 = gapComposer2.rememberedValue();
                if (rememberedValue15 == obj10) {
                    rememberedValue15 = ((RealDependentAllowanceManager) this.errorReporter).getAllowance(PlatformKt.activeAccountToken(this.sessionManager), dependentDetailScreen.dependentCustomerToken);
                    gapComposer2.updateRememberedValue(rememberedValue15);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue15, null, null, gapComposer2, 48, 2);
                boolean changed5 = gapComposer2.changed((ActivitiesManager.ActivityContext) obj12) | gapComposer2.changed((FamilySharedActivityCache) obj11);
                Object rememberedValue16 = gapComposer2.rememberedValue();
                AndroidStringManager androidStringManager = this.stringManager;
                if (changed5 || rememberedValue16 == obj10) {
                    rememberedValue16 = ((RealActivityEmbeddedPresenter$Factory$Impl) this.activitiesCacheManager).create(this.navigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default((ActivitiesManager.ActivityContext) obj12, (FamilySharedActivityCache) obj11, (DependentDetailScreen) obj15, new ArcadeModal$$ExternalSyntheticLambda2(this, i4), 3, androidStringManager.get(R.string.dependent_detail_recent_activity_empty_state), null, InputEventTrigger.Companion.decoratedWith((DefaultActivityItemEventHandler$Factory$Impl) obj9, new MaterialButton$$ExternalSyntheticLambda3(this, i4)), null, null, 7496));
                    gapComposer2.updateRememberedValue(rememberedValue16);
                }
                ?? r15 = (RealActivityEmbeddedPresenter) rememberedValue16;
                Object rememberedValue17 = gapComposer2.rememberedValue();
                if (rememberedValue17 == obj10) {
                    rememberedValue17 = (Flow) obj8;
                    gapComposer2.updateRememberedValue(rememberedValue17);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue17, null, null, gapComposer2, 48, 2);
                RealDependentBalancesStore realDependentBalancesStore = (RealDependentBalancesStore) this.service;
                String str4 = dependentDetailScreen.dependentCustomerToken;
                str4.getClass();
                gapComposer2.startReplaceGroup(2047890174);
                DependentBalances m3529balancesfUqyM7Y = realDependentBalancesStore.m3529balancesfUqyM7Y(str4, DependentBalanceCategory.ALL, null, gapComposer2, 432);
                gapComposer2.end(false);
                boolean changed6 = gapComposer2.changed(m3529balancesfUqyM7Y);
                Object rememberedValue18 = gapComposer2.rememberedValue();
                if (changed6 || rememberedValue18 == obj10) {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(m3529balancesfUqyM7Y, 10));
                    Iterator it5 = m3529balancesfUqyM7Y.balances.iterator();
                    while (it5.hasNext()) {
                        DependentBalance dependentBalance = (DependentBalance) it5.next();
                        MoneyFormatter moneyFormatter = (MoneyFormatter) this.goalLocalStatus;
                        DependentBalanceName dependentBalanceName = dependentBalance.name;
                        DependentBalance.LoadingState loadingState = dependentBalance.state;
                        String obj16 = dependentBalanceName.toString();
                        DependentBalanceName dependentBalanceName2 = dependentBalance.name;
                        int ordinal = dependentBalanceName2.ordinal();
                        MutableState mutableState8 = collectAsState5;
                        if (ordinal != 0) {
                            it = it5;
                            if (ordinal == 1) {
                                i2 = R.string.family_account_dependent_savings_balance;
                            } else if (ordinal == 2) {
                                i2 = R.string.family_account_dependent_stocks_balance;
                            } else {
                                if (ordinal != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                i2 = R.string.family_account_dependent_bitcoin_balance;
                            }
                        } else {
                            it = it5;
                            i2 = R.string.family_account_dependent_cash_balance;
                        }
                        String str5 = androidStringManager.get(i2);
                        boolean z5 = loadingState instanceof DependentBalance.LoadingState.SavingsBalanceLoaded;
                        if (z5 && (str = (savingsBalanceLoaded = (DependentBalance.LoadingState.SavingsBalanceLoaded) loadingState).interestRate) != null) {
                            InterestYieldStatus interestYieldStatus = savingsBalanceLoaded.status;
                            int i10 = interestYieldStatus == null ? -1 : DependentDetailPresenter$WhenMappings.$EnumSwitchMapping$1[interestYieldStatus.ordinal()];
                            z2 = z5;
                            if (i10 == 1) {
                                ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "enhanced_rate", str);
                                Resources resources = androidStringManager.resources;
                                resources.getClass();
                                mutableState5 = collectAsState4;
                                String format3 = new MessageFormat(resources.getString(R.string.family_account_dependent_unlock_enhanced_savings_yield)).format(m);
                                format3.getClass();
                                str2 = format3;
                            } else if (i10 == 2) {
                                str2 = str;
                                mutableState5 = collectAsState4;
                            }
                            z3 = loadingState instanceof DependentBalance.LoadingState.BalanceLoading;
                            if (!z3) {
                                format2 = "";
                            } else if (loadingState instanceof DependentBalance.LoadingState.BalanceFailedToLoad) {
                                format2 = androidStringManager.get(R.string.family_account_dependent_failed_to_load_balance);
                            } else if (loadingState instanceof DependentBalance.LoadingState.BalanceLoaded) {
                                format2 = moneyFormatter.format(((DependentBalance.LoadingState.BalanceLoaded) loadingState).amount);
                            } else {
                                if (!z2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                format2 = moneyFormatter.format(((DependentBalance.LoadingState.SavingsBalanceLoaded) loadingState).amount);
                            }
                            arrayList2.add(new DependentBalancesViewModel.BalanceStatModel(obj16, format2, str5, str2, new DependentDetailViewEvent.BalanceTapped(dependentBalanceName2), z3));
                            collectAsState5 = mutableState8;
                            it5 = it;
                            collectAsState4 = mutableState5;
                        } else {
                            z2 = z5;
                        }
                        mutableState5 = collectAsState4;
                        str2 = null;
                        z3 = loadingState instanceof DependentBalance.LoadingState.BalanceLoading;
                        if (!z3) {
                        }
                        arrayList2.add(new DependentBalancesViewModel.BalanceStatModel(obj16, format2, str5, str2, new DependentDetailViewEvent.BalanceTapped(dependentBalanceName2), z3));
                        collectAsState5 = mutableState8;
                        it5 = it;
                        collectAsState4 = mutableState5;
                    }
                    mutableState3 = collectAsState5;
                    mutableState4 = collectAsState4;
                    rememberedValue18 = new DependentBalancesViewModel(arrayList2);
                    gapComposer2.updateRememberedValue(rememberedValue18);
                } else {
                    mutableState3 = collectAsState5;
                    mutableState4 = collectAsState4;
                }
                DependentBalancesViewModel dependentBalancesViewModel = (DependentBalancesViewModel) rememberedValue18;
                Object rememberedValue19 = gapComposer2.rememberedValue();
                if (rememberedValue19 == obj10) {
                    RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(((RealDependentControlStatusManager) obj7).dependentControlStatus, 17);
                    gapComposer2.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$1);
                    rememberedValue19 = realGooglePayer$createWallet$$inlined$filter$1;
                }
                Boolean bool = Boolean.FALSE;
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue19, bool, null, gapComposer2, 48, 2);
                Object rememberedValue20 = gapComposer2.rememberedValue();
                if (rememberedValue20 == obj10) {
                    RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$12 = new RealGooglePayer$createWallet$$inlined$filter$1(((RealDependentControlStatusManager) obj6).dependentControlStatus, 18);
                    gapComposer2.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$12);
                    rememberedValue20 = realGooglePayer$createWallet$$inlined$filter$12;
                }
                Updater.collectAsState((Flow) rememberedValue20, bool, null, gapComposer2, 48, 2);
                RecurringPayments recurringPayments = (RecurringPayments) mutableState4.getValue();
                if (recurringPayments != null) {
                    if (recurringPayments instanceof RecurringPayments.Loaded) {
                        ArrayList arrayList3 = ((RecurringPayments.Loaded) recurringPayments).recurringPayments;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj17 : arrayList3) {
                            if (!((RecurringPayment) obj17).isCanceled) {
                                arrayList4.add(obj17);
                            }
                        }
                        if (arrayList4.size() == 0) {
                            listOf = CollectionsKt__CollectionsJVMKt.listOf(new AllowanceViewModel.NoAllowanceInDependentDetail(androidStringManager.get(R.string.family_account_dependent_no_allowance_row_title), androidStringManager.get(R.string.family_account_dependent_no_allowance_row_subtitle)));
                        } else {
                            listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                            Iterator it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                RecurringPayment recurringPayment = (RecurringPayment) it6.next();
                                listOf.add(new AllowanceViewModel.AllowanceDetail(recurringPayment.token, androidStringManager.get(R.string.family_account_dependent_allowance_row_title), recurringPayment.scheduleDescription, ((MoneyFormatter) obj5).format(recurringPayment.amount), recurringPayment.editUrl, false));
                            }
                        }
                    } else if ((recurringPayments instanceof RecurringPayments.Loading) || recurringPayments.equals(RecurringPayments.Error.INSTANCE)) {
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(AllowanceViewModel.Loading.INSTANCE);
                    } else {
                        if (!recurringPayments.equals(RecurringPayments.NotLoaded.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        listOf = EmptyList.INSTANCE;
                    }
                    dependentAccessControlsViewModel = new DependentAccessControlsViewModel(listOf, new DependentNotificationsSectionModel(androidStringManager.get(R.string.dependent_detail_notification_settings_title), androidStringManager.get(R.string.dependent_detail_notification_settings_subtitle)));
                } else {
                    dependentAccessControlsViewModel = null;
                }
                if (dependentAccessControlsViewModel != null) {
                    gapComposer2.startReplaceGroup(-1106477359);
                    continuation2 = null;
                    Updater.LaunchedEffect(gapComposer2, dependentAccessControlsViewModel, new GLSceneScopeProvider$SceneScope$2$1$1(dependentAccessControlsViewModel, continuation2, this, 8));
                    gapComposer2.end(false);
                } else {
                    continuation2 = null;
                    gapComposer2.startReplaceGroup(-1106436997);
                    gapComposer2.end(false);
                }
                Continuation continuation4 = continuation2;
                MutableState mutableState9 = mutableState3;
                Updater.LaunchedEffect(gapComposer2, flow, new RealIdvPresenter$models$1$1((Object) flow, (Continuation) null, (MoleculePresenter) this, mutableState4, (Object) collectAsState6, (State) mutableState9, 25));
                Recipient recipient = (Recipient) mutableState9.getValue();
                if (dependentBalancesViewModel.balances.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$3("balances should be always be non-empty since we always show Cash And Savings balances");
                    return continuation4;
                }
                DependentDetailViewModel dependentDetailViewModel = new DependentDetailViewModel(recipient != null ? GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(recipient)) : continuation4, recipient != null ? new BadgeName(recipient.getFirstName(), recipient.fullName, recipient.isBusiness, recipient.isVerified) : continuation4, recipient != null ? Cashtags.fromString(recipient.cashtag, recipient.region) : continuation4, dependentBalancesViewModel, dependentAccessControlsViewModel, new DependentActivityEmbeddedSectionViewModel(androidStringManager.get(R.string.dependent_detail_recent_activity_arcade_section_title), r15.models(gapComposer2, 0), DependentDetailViewEvent.SeeAllActivitiesEvent.INSTANCE), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj4)).peekCurrentValue(LaunchDarklyFeatureFlags$TeenQrCode.INSTANCE)).enabled());
                gapComposer2.end(false);
                return dependentDetailViewModel;
        }
    }

    public void navigateToTransferClientRoute(TransferConfig transferConfig, ActiveGoal activeGoal) {
        Object[] objArr;
        String format2;
        TransferConfig.ClientRouteTemplate clientRouteTemplate = transferConfig.getClientRouteTemplate();
        clientRouteTemplate.getClass();
        long j = clientRouteTemplate.argumentCount;
        SavingsScreen.ScreenType screenType = (SavingsScreen.ScreenType) this.screenType;
        if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.Home.INSTANCE) || Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
            objArr = new Object[0];
        } else if (!(screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else if (activeGoal == null) {
            return;
        } else {
            objArr = new String[]{activeGoal.goalFlowParameters};
        }
        int length = objArr.length;
        if (((int) j) != length) {
            ErrorReporter errorReporter = (ErrorReporter) this.errorReporter;
            StringBuilder sb = new StringBuilder("Client route template argument count mismatch for ");
            sb.append(screenType);
            sb.append(": template expects ");
            sb.append(j);
            errorReporter.report(new GeneralSavingsError(Boxes$$ExternalSyntheticOutline1.m(length, " arguments, but client provides ", sb), null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        if (j != 0 || (format2 = clientRouteTemplate.zeroArgVerbatimString) == null) {
            String str = clientRouteTemplate.formatString;
            Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
            format2 = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length));
        }
        this.router.route(new RoutingParams(new GeneralSavingsScreen(screenType), null, new GeneralSavingsScreen(screenType), null, null, null, HttpStatusCode.BAD_GATEWAY_502), format2);
    }

    public void reportTransferCdfEvent(CdfEvent cdfEvent) {
        UtilsKt$toCdfEvent$2 cdfEvent2;
        SavingsScreen.ScreenType screenType = (SavingsScreen.ScreenType) this.screenType;
        if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.Home.INSTANCE) || Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
            cdfEvent2 = UtilsKt.toCdfEvent(cdfEvent, new Pair[0]);
        } else {
            if (!(screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            cdfEvent2 = UtilsKt.toCdfEvent(cdfEvent, new Pair("sub_balance_token", ((SavingsScreen.ScreenType.GoalDetail) screenType).token));
        }
        this.analytics.track(cdfEvent2, null);
    }

    public SavingsScreenPresenter(Analytics analytics, RealCustomerStore realCustomerStore, RealFamilyAccountsManager realFamilyAccountsManager, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, RealDependentAllowanceManager realDependentAllowanceManager, RealRouter$Factory$Impl realRouter$Factory$Impl, RealDependentControlStatusManager.Factory factory, SessionManager sessionManager, DependentDetailScreen dependentDetailScreen, BetterNavigator.ScreenNavigator screenNavigator, LocalizedMoneyFormatter.Factory factory2, RealDependentBalancesStore realDependentBalancesStore, RealUuidGenerator realUuidGenerator, CoroutineScope coroutineScope, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl) {
        dependentDetailScreen.getClass();
        this.analytics = analytics;
        this.syncValueReader = realFamilyAccountsManager;
        this.stringManager = androidStringManager;
        this.savingsBalanceStore = featureFlagManager;
        this.errorReporter = realDependentAllowanceManager;
        this.sessionManager = sessionManager;
        this.oneErrorPerAppSessionStrategy = dependentDetailScreen;
        this.navigator = screenNavigator;
        this.service = realDependentBalancesStore;
        this.activitiesCacheManager = realActivityEmbeddedPresenter$Factory$Impl;
        this.observabilityManager = defaultActivityItemEventHandler$Factory$Impl;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        ControlType controlType = ControlType.STOCKS;
        String str = dependentDetailScreen.dependentCustomerToken;
        this.ioDispatcher = factory.create(controlType, str);
        this.screenType = factory.create(ControlType.BITCOIN, str);
        ActivitiesManager.ActivityContext dependentActivitiesContext$default = DependentActivitiesContextKt.dependentActivitiesContext$default(str, (ActivityScope) null, 6);
        this.activeGoalStore = dependentActivitiesContext$default;
        this.savingsScreenContentFactory = familySharedActivityCache$Factory$Impl.create(dependentActivitiesContext$default);
        this.screenKey = factory2.create(MoneyFormatterConfig.COMPACT);
        this.goalLocalStatus = factory2.create(MoneyFormatterConfig.STANDARD);
        this.lastSeenBalance = realCustomerStore.getCustomerForId(str);
    }
}
