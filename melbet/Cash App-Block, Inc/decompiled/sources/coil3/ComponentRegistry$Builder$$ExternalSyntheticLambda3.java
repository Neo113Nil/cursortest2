package coil3;

import android.net.ConnectivityManager;
import androidx.activity.compose.ComposeBackHandler;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.BackgroundNode;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextRange;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.SharedNetworkCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.cdp.backend.jvm.ActivityEventFlushStrategy$setup$1$observer$1;
import app.cash.local.navigation.api.RealCashLocalNavigator$Factory$Impl;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.sqldelight.driver.android.AndroidPreparedStatement;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import coil3.fetch.Fetcher;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.clientrouting.routers.account.MultipleAccountsRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.account.VerifyRouter;
import com.squareup.cash.clientrouting.routers.account.VerifyRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.activity.ActivityRouter;
import com.squareup.cash.clientrouting.routers.activity.ActivityRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.bitcoin.BitkeyAutoWithdrawRouter;
import com.squareup.cash.clientrouting.routers.bitcoin.BitkeyAutoWithdrawRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.core.NotImplementedRouter;
import com.squareup.cash.clientrouting.routers.core.NotImplementedRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.core.PlayStoreRouter;
import com.squareup.cash.clientrouting.routers.core.PlayStoreRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.core.ShareTextRouter;
import com.squareup.cash.clientrouting.routers.core.ShareTextRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.directDeposit.DirectDepositRouter;
import com.squareup.cash.clientrouting.routers.directDeposit.DirectDepositRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.earningsTracker.EarningsTrackerRouter;
import com.squareup.cash.clientrouting.routers.earningsTracker.EarningsTrackerRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.investing.InvestingRouter;
import com.squareup.cash.clientrouting.routers.investing.InvestingRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.local.LocalRouter;
import com.squareup.cash.clientrouting.routers.local.LocalRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.merchant.LinkedMerchantsRouter;
import com.squareup.cash.clientrouting.routers.merchant.LinkedMerchantsRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.directdeposit.navigation.real.RealDirectDepositInboundNavigator$Factory$Impl;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$Factory$Impl;
import com.squareup.cash.knot.backend.api.KnotLauncher;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.validation.RealPendingEmailVerification;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.wire.GrpcMethod;
import dev.zacsweers.metro.Provider;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentRegistry$Builder$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ComponentRegistry$Builder$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TransformedTextFieldState.TransformedText transformedText;
        SupportSQLiteDatabase writableDatabase;
        int i = 2;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                return CollectionsKt__CollectionsJVMKt.listOf(new Pair((Fetcher.Factory) this.f$0, (KClass) this.f$1));
            case 1:
                ((ComposeBackHandler) this.f$0).currentOnBackCompleted = (Function0) this.f$1;
                return Unit.INSTANCE;
            case 2:
                ((Ref$BooleanRef) this.f$0).element = ((Boolean) ((Function0) this.f$1).invoke()).booleanValue();
                return Unit.INSTANCE;
            case 3:
                BackgroundNode backgroundNode = (BackgroundNode) this.f$0;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) this.f$1;
                backgroundNode.tmpOutline = backgroundNode.shape.mo175createOutlinePq9zytI(layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc(), layoutNodeDrawScope.getLayoutDirection(), layoutNodeDrawScope);
                return Unit.INSTANCE;
            case 4:
                ((Ref$ObjectRef) this.f$0).element = DepthSortedSetKt.currentValueOf((FocusableNode) this.f$1, PinnableContainerKt.LocalPinnableContainer);
                return Unit.INSTANCE;
            case 5:
                TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) this.f$0;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f$1;
                textFieldCoreModifierNode.textFieldState.getVisualText();
                if (textFieldCoreModifierNode.isAttached() && ((LazyWindowInfo) ((WindowInfo) DepthSortedSetKt.currentValueOf(textFieldCoreModifierNode, CompositionLocalsKt.LocalWindowInfo))).isWindowFocused()) {
                    i = 1;
                }
                int i3 = ref$IntRef.element;
                int i4 = i * i3;
                ref$IntRef.element = i3 * (-1);
                return Integer.valueOf(i4);
            case 6:
                TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) this.f$0;
                return SingleLineCodepointTransformation.access$calculateTransformedText(transformedTextFieldState.textFieldState.getValue$foundation(), (OutputTransformation) this.f$1, transformedTextFieldState.getSelectionWedgeAffinity());
            case 7:
                TransformedTextFieldState transformedTextFieldState2 = (TransformedTextFieldState) this.f$0;
                SingleLineCodepointTransformation singleLineCodepointTransformation = (SingleLineCodepointTransformation) this.f$1;
                DerivedSnapshotState derivedSnapshotState = transformedTextFieldState2.outputTransformedText;
                TextFieldCharSequence value$foundation = (derivedSnapshotState == null || (transformedText = (TransformedTextFieldState.TransformedText) derivedSnapshotState.getValue()) == null) ? transformedTextFieldState2.textFieldState.getValue$foundation() : transformedText.text;
                SelectionWedgeAffinity selectionWedgeAffinity = transformedTextFieldState2.getSelectionWedgeAffinity();
                IntStack intStack = new IntStack(1, false);
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                while (i2 < value$foundation.text.length()) {
                    int codePointAt = Character.codePointAt(value$foundation, i2);
                    singleLineCodepointTransformation.getClass();
                    int i5 = codePointAt == 10 ? 32 : codePointAt == 13 ? 65279 : codePointAt;
                    int charCount = Character.charCount(codePointAt);
                    if (i5 != codePointAt) {
                        intStack.recordEditOperation(sb.length(), sb.length() + charCount, Character.charCount(i5));
                        z = true;
                    }
                    sb.appendCodePoint(i5);
                    i2 += charCount;
                }
                CharSequence sb2 = z ? sb.toString() : value$foundation;
                if (sb2 == value$foundation) {
                    return null;
                }
                long m405mapToTransformedXGyztTk = SingleLineCodepointTransformation.m405mapToTransformedXGyztTk(value$foundation.selection, intStack, selectionWedgeAffinity);
                TextRange textRange = value$foundation.composition;
                return new TransformedTextFieldState.TransformedText(new TextFieldCharSequence(sb2, m405mapToTransformedXGyztTk, textRange != null ? new TextRange(SingleLineCodepointTransformation.m405mapToTransformedXGyztTk(textRange.packedValue, intStack, selectionWedgeAffinity)) : null, null, null, null, 56), intStack);
            case 8:
                GrpcMethod grpcMethod = (GrpcMethod) this.f$0;
                Recomposer$$ExternalSyntheticLambda1 recomposer$$ExternalSyntheticLambda1 = (Recomposer$$ExternalSyntheticLambda1) this.f$1;
                if (((AtomicInt) grpcMethod.path).get() == 0) {
                    recomposer$$ExternalSyntheticLambda1.invoke();
                }
                return Unit.INSTANCE;
            case 9:
                MutableScatterSet mutableScatterSet = (MutableScatterSet) this.f$0;
                CompositionImpl compositionImpl = (CompositionImpl) this.f$1;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    compositionImpl.recordWriteOf(objArr[(i6 << 3) + i8]);
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 10:
                Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = (Recomposer$$ExternalSyntheticLambda4) this.f$0;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f$1;
                synchronized (SharedNetworkCallback.requestsLock) {
                    LinkedHashMap linkedHashMap = SharedNetworkCallback.requests;
                    linkedHashMap.remove(recomposer$$ExternalSyntheticLambda4);
                    if (linkedHashMap.isEmpty()) {
                        Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(SharedNetworkCallback.INSTANCE);
                        SharedNetworkCallback.isBlocked = null;
                        SharedNetworkCallback.cachedCapabilities = null;
                        SharedNetworkCallback.capabilitiesInitialized = false;
                    }
                }
                return Unit.INSTANCE;
            case 11:
                String str = (String) this.f$0;
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.f$1;
                WorkDatabase workDatabase = workManagerImpl.mWorkDatabase;
                workDatabase.getClass();
                workDatabase.runInTransaction(new Processor$$ExternalSyntheticLambda1(3, workDatabase, str, workManagerImpl));
                Schedulers.schedule(workManagerImpl.mConfiguration, workDatabase, workManagerImpl.mSchedulers);
                return Unit.INSTANCE;
            case 12:
                ((Lifecycle) this.f$0).removeObserver((ActivityEventFlushStrategy$setup$1$observer$1) this.f$1);
                return Unit.INSTANCE;
            case 13:
                ((Lifecycle) this.f$0).removeObserver((SavedStateRegistryImpl$$ExternalSyntheticLambda0) this.f$1);
                return Unit.INSTANCE;
            case 14:
                AndroidSqliteDriver androidSqliteDriver = (AndroidSqliteDriver) this.f$0;
                SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) this.f$1;
                SupportSQLiteOpenHelper supportSQLiteOpenHelper = androidSqliteDriver.openHelper;
                if (supportSQLiteOpenHelper != null && (writableDatabase = supportSQLiteOpenHelper.getWritableDatabase()) != null) {
                    return writableDatabase;
                }
                supportSQLiteDatabase.getClass();
                return supportSQLiteDatabase;
            case 15:
                return new AndroidPreparedStatement(((AndroidSqliteDriver) this.f$0).getDatabase().compileStatement((String) this.f$1));
            case 16:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) this.f$0;
                Function1 function1 = (Function1) this.f$1;
                if (!registerAliasViewModel.isLoading) {
                    function1.invoke(RegisterAliasViewEvent.GoBack.INSTANCE);
                }
                return Unit.INSTANCE;
            case 17:
                RegisterAliasViewModel registerAliasViewModel2 = (RegisterAliasViewModel) this.f$0;
                TextFieldState textFieldState = (TextFieldState) this.f$1;
                if (registerAliasViewModel2.mode == RegisterAliasViewModel.Mode.EMAIL) {
                    return Updater.mutableStateOf$default(Boolean.valueOf(Emails.normalize(textFieldState.getValue$foundation().text.toString()) != null));
                }
                return Updater.mutableStateOf$default(Boolean.valueOf(PhoneNumbers.normalize(textFieldState.getValue$foundation().text.toString()) != null));
            case 18:
                return ((MultipleAccountsRouter$Factory$Impl) this.f$0).create((Navigator) this.f$1);
            case 19:
                NotImplementedRouter$Factory$Impl notImplementedRouter$Factory$Impl = (NotImplementedRouter$Factory$Impl) this.f$0;
                Navigator navigator = (Navigator) this.f$1;
                navigator.getClass();
                RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = notImplementedRouter$Factory$Impl.delegateFactory;
                ErrorReporter errorReporter = (ErrorReporter) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
                IntentLauncher intentLauncher = (IntentLauncher) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
                RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator = (RealSelectiveUnrecognizedURLNavigator) realYouPresenter$MetroFactory.passcodeProvider.invoke();
                errorReporter.getClass();
                intentLauncher.getClass();
                realSelectiveUnrecognizedURLNavigator.getClass();
                return new NotImplementedRouter(errorReporter, intentLauncher, realSelectiveUnrecognizedURLNavigator, navigator);
            case 20:
                VerifyRouter$Factory$Impl verifyRouter$Factory$Impl = (VerifyRouter$Factory$Impl) this.f$0;
                Navigator navigator2 = (Navigator) this.f$1;
                navigator2.getClass();
                RealYouPresenter$MetroFactory realYouPresenter$MetroFactory2 = verifyRouter$Factory$Impl.delegateFactory;
                FlowStarter flowStarter = (FlowStarter) realYouPresenter$MetroFactory2.assignedJobProvider.invoke();
                RealPendingEmailVerification realPendingEmailVerification = (RealPendingEmailVerification) realYouPresenter$MetroFactory2.assignedLocationProvider.invoke();
                SessionManager sessionManager = (SessionManager) realYouPresenter$MetroFactory2.passcodeProvider.invoke();
                flowStarter.getClass();
                realPendingEmailVerification.getClass();
                sessionManager.getClass();
                return new VerifyRouter(flowStarter, navigator2, realPendingEmailVerification, sessionManager);
            case 21:
                PlayStoreRouter$Factory$Impl playStoreRouter$Factory$Impl = (PlayStoreRouter$Factory$Impl) this.f$0;
                Navigator navigator3 = (Navigator) this.f$1;
                navigator3.getClass();
                LoadTimeClock.MetroFactory metroFactory = playStoreRouter$Factory$Impl.delegateFactory;
                IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory.clock.invoke();
                String str2 = (String) metroFactory.observabilityManager.invoke();
                intentLauncher2.getClass();
                str2.getClass();
                return new PlayStoreRouter(navigator3, intentLauncher2, str2);
            case 22:
                ShareTextRouter$Factory$Impl shareTextRouter$Factory$Impl = (ShareTextRouter$Factory$Impl) this.f$0;
                Navigator navigator4 = (Navigator) this.f$1;
                navigator4.getClass();
                IntentLauncher intentLauncher3 = (IntentLauncher) shareTextRouter$Factory$Impl.delegateFactory.staticImageLoader.invoke();
                intentLauncher3.getClass();
                return new ShareTextRouter(intentLauncher3, navigator4);
            case 23:
                DirectDepositRouter$Factory$Impl directDepositRouter$Factory$Impl = (DirectDepositRouter$Factory$Impl) this.f$0;
                Navigator navigator5 = (Navigator) this.f$1;
                navigator5.getClass();
                RealBrandFollowPresenter.MetroFactory metroFactory2 = directDepositRouter$Factory$Impl.delegateFactory;
                RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl = (RealMoneyInboundNavigator$Factory$Impl) metroFactory2.syncer.invoke();
                RealDirectDepositInboundNavigator$Factory$Impl realDirectDepositInboundNavigator$Factory$Impl = (RealDirectDepositInboundNavigator$Factory$Impl) metroFactory2.store.invoke();
                RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory2.service.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory2.repository.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) metroFactory2.analytics.invoke();
                RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory2.responseContextHandlerFactory.invoke();
                realMoneyInboundNavigator$Factory$Impl.getClass();
                realDirectDepositInboundNavigator$Factory$Impl.getClass();
                realBlockersHelper$Factory$Impl.getClass();
                realRouter$Factory$Impl.getClass();
                syncValueReader.getClass();
                realUuidGenerator.getClass();
                return new DirectDepositRouter(realMoneyInboundNavigator$Factory$Impl, realDirectDepositInboundNavigator$Factory$Impl, realBlockersHelper$Factory$Impl, realRouter$Factory$Impl, syncValueReader, realUuidGenerator, navigator5);
            case 24:
                BitkeyAutoWithdrawRouter$Factory$Impl bitkeyAutoWithdrawRouter$Factory$Impl = (BitkeyAutoWithdrawRouter$Factory$Impl) this.f$0;
                Navigator navigator6 = (Navigator) this.f$1;
                navigator6.getClass();
                RealYouPresenter$MetroFactory realYouPresenter$MetroFactory3 = bitkeyAutoWithdrawRouter$Factory$Impl.delegateFactory;
                AppService appService = (AppService) realYouPresenter$MetroFactory3.assignedJobProvider.invoke();
                RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) realYouPresenter$MetroFactory3.assignedLocationProvider.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) realYouPresenter$MetroFactory3.passcodeProvider.invoke();
                appService.getClass();
                realClientScenarioCompleter.getClass();
                coroutineContext.getClass();
                return new BitkeyAutoWithdrawRouter(appService, realClientScenarioCompleter, coroutineContext, navigator6);
            case 25:
                EarningsTrackerRouter$Factory$Impl earningsTrackerRouter$Factory$Impl = (EarningsTrackerRouter$Factory$Impl) this.f$0;
                Navigator navigator7 = (Navigator) this.f$1;
                navigator7.getClass();
                Instrument$Adapter instrument$Adapter = earningsTrackerRouter$Factory$Impl.delegateFactory;
                RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) ((MoneyUiFactory.MetroFactory) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) instrument$Adapter.card_brandAdapter).invoke();
                RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) ((Provider) instrument$Adapter.balance_currencyAdapter).invoke();
                androidStringManager.getClass();
                realEarningsTrackerAnalytics.getClass();
                return new EarningsTrackerRouter(realP2pSettingsManager, androidStringManager, realEarningsTrackerAnalytics, navigator7);
            case 26:
                ActivityRouter$Factory$Impl activityRouter$Factory$Impl = (ActivityRouter$Factory$Impl) this.f$0;
                Navigator navigator8 = (Navigator) this.f$1;
                navigator8.getClass();
                RealActivitiesManager.MetroFactory metroFactory3 = activityRouter$Factory$Impl.delegateFactory;
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory3.ioDispatcher.invoke();
                Analytics analytics = (Analytics) metroFactory3.badger2.invoke();
                CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory3.errorReporter.invoke();
                RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier = (RealActivityScreenInitialArgumentsSupplier) metroFactory3.appService.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) metroFactory3.formattingPageRequestHandlerFactory.value;
                RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) metroFactory3.defaultGetRequestHandlerFactory.invoke();
                cashAccountDatabaseImpl.getClass();
                analytics.getClass();
                coroutineContext2.getClass();
                realActivityScreenInitialArgumentsSupplier.getClass();
                coroutineScope.getClass();
                realUuidGenerator2.getClass();
                return new ActivityRouter(cashAccountDatabaseImpl, analytics, coroutineContext2, navigator8, realActivityScreenInitialArgumentsSupplier, coroutineScope, realUuidGenerator2);
            case 27:
                InvestingRouter$Factory$Impl investingRouter$Factory$Impl = (InvestingRouter$Factory$Impl) this.f$0;
                Navigator navigator9 = (Navigator) this.f$1;
                navigator9.getClass();
                RealActivitiesManager.MetroFactory metroFactory4 = investingRouter$Factory$Impl.delegateFactory;
                CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory4.ioDispatcher.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) metroFactory4.badger2.invoke();
                FlowStarter flowStarter2 = (FlowStarter) metroFactory4.errorReporter.invoke();
                IssuedCardManager issuedCardManager = (IssuedCardManager) metroFactory4.appService.invoke();
                RealInvestingInboundNavigator$Factory$Impl realInvestingInboundNavigator$Factory$Impl = (RealInvestingInboundNavigator$Factory$Impl) metroFactory4.formattingPageRequestHandlerFactory.value;
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory4.defaultGetRequestHandlerFactory.invoke();
                coroutineContext3.getClass();
                cashAccountDatabaseImpl2.getClass();
                flowStarter2.getClass();
                issuedCardManager.getClass();
                realInvestingInboundNavigator$Factory$Impl.getClass();
                featureFlagManager.getClass();
                return new InvestingRouter(navigator9, coroutineContext3, cashAccountDatabaseImpl2, flowStarter2, issuedCardManager, realInvestingInboundNavigator$Factory$Impl, featureFlagManager);
            case 28:
                LocalRouter$Factory$Impl localRouter$Factory$Impl = (LocalRouter$Factory$Impl) this.f$0;
                Navigator navigator10 = (Navigator) this.f$1;
                navigator10.getClass();
                KeysetHandle keysetHandle = localRouter$Factory$Impl.delegateFactory;
                RealCashLocalNavigator$Factory$Impl realCashLocalNavigator$Factory$Impl = (RealCashLocalNavigator$Factory$Impl) ((Provider) keysetHandle.entries).invoke();
                RealLocalTabProvider realLocalTabProvider = (RealLocalTabProvider) ((CashNavigationLogger.MetroFactory) keysetHandle.annotationsMap).invoke();
                realCashLocalNavigator$Factory$Impl.getClass();
                return new LocalRouter(realCashLocalNavigator$Factory$Impl, realLocalTabProvider, navigator10);
            default:
                LinkedMerchantsRouter$Factory$Impl linkedMerchantsRouter$Factory$Impl = (LinkedMerchantsRouter$Factory$Impl) this.f$0;
                Navigator navigator11 = (Navigator) this.f$1;
                navigator11.getClass();
                return new LinkedMerchantsRouter((KnotLauncher) ((RealKnotLauncher.MetroFactory) linkedMerchantsRouter$Factory$Impl.delegateFactory.delegate).invoke(), navigator11);
        }
    }
}
