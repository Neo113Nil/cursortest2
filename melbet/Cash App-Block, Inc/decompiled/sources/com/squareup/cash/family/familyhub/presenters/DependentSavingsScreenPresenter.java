package com.squareup.cash.family.familyhub.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.core.view.MotionEventCompat;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.api.BalanceType;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.savings.backend.api.data.ActiveGoal;
import com.squareup.cash.savings.backend.api.data.SavingsBalance;
import com.squareup.cash.savings.backend.api.mappers.SavingsScreenMappersKt;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore$Factory$Impl;
import com.squareup.cash.savings.presenters.LoadedSavingsModel;
import com.squareup.cash.savings.presenters.SavingsActivitySectionParams;
import com.squareup.cash.savings.presenters.SavingsScreenContentFactory;
import com.squareup.cash.savings.presenters.SavingsScreenContentFactory$Factory$Impl;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.protos.cash.piggybank.appapi.FamiliesSavingsScreensResponse;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.VersionedSavingsFolders;
import squareup.cash.savings.VersionedSavingsScreens;

/* loaded from: classes6.dex */
public final class DependentSavingsScreenPresenter implements MoleculePresenter, HasObservability {
    public final PersistentActiveGoalStore$Factory$Impl activeGoalStoreFactory;
    public final FamilySharedActivityCache$Factory$Impl activitiesCacheFactory;
    public final Analytics analytics;
    public final RealDependentBalancesStore dependentBalanceStore;
    public final EglCore dependentSavingsStore;
    public final ErrorReporter errorReporter;
    public final GpsConfigQueries goalLocalStatus;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PiggybankAppService piggybankAppService;
    public final RealRouter router;
    public final DependentGeneralSavingsScreen screen;
    public final SavingsScreenContentFactory screenContentFactory;
    public final String screenKey;
    public final SyncValueReader syncValueReader;

    public DependentSavingsScreenPresenter(Analytics analytics, PiggybankAppService piggybankAppService, RealDependentBalancesStore realDependentBalancesStore, SyncValueReader syncValueReader, ErrorReporter errorReporter, EglCore eglCore, FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl, SampleStrategy sampleStrategy, SavingsScreenContentFactory$Factory$Impl savingsScreenContentFactory$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealObservabilityManager realObservabilityManager, PersistentActiveGoalStore$Factory$Impl persistentActiveGoalStore$Factory$Impl, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator, DependentGeneralSavingsScreen dependentGeneralSavingsScreen) {
        String str;
        dependentGeneralSavingsScreen.getClass();
        this.analytics = analytics;
        this.piggybankAppService = piggybankAppService;
        this.dependentBalanceStore = realDependentBalancesStore;
        this.syncValueReader = syncValueReader;
        this.errorReporter = errorReporter;
        this.dependentSavingsStore = eglCore;
        this.activitiesCacheFactory = familySharedActivityCache$Factory$Impl;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.observabilityManager = realObservabilityManager;
        this.activeGoalStoreFactory = persistentActiveGoalStore$Factory$Impl;
        this.ioDispatcher = coroutineContext;
        this.navigator = screenNavigator;
        this.screen = dependentGeneralSavingsScreen;
        this.goalLocalStatus = cashAccountDatabaseImpl.savingsGoalLocalStatusQueries;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        SavingsScreen.ScreenType screenType = dependentGeneralSavingsScreen.screenType;
        if (Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
            ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
            str = "dependent_general_savings_screen";
        } else if (screenType instanceof SavingsScreen.ScreenType.GoalDetail) {
            ObservabilityView[] observabilityViewArr2 = ObservabilityView.$VALUES;
            str = "dependent_savings_goal_screen";
        } else {
            if (!Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.Home.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            ObservabilityView[] observabilityViewArr3 = ObservabilityView.$VALUES;
            str = "dependent_savings_home_screen";
        }
        this.screenKey = str;
        this.screenContentFactory = savingsScreenContentFactory$Factory$Impl.create(screenNavigator, screenType);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0194, code lost:
    
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0396  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        SavingsScreen savingsScreen;
        VersionedSavingsFolders versionedSavingsFolders;
        SavingsBalance savingsBalance;
        Money money;
        boolean changed;
        Object rememberedValue;
        List list;
        boolean changed2;
        Object rememberedValue2;
        PersistentActiveGoalStore persistentActiveGoalStore;
        boolean changed3;
        Object rememberedValue3;
        char c;
        List list2;
        Money money2;
        Pair pair;
        ActiveGoal.LastSeenStatus lastSeenStatus;
        Object obj;
        Money money3;
        Money money4;
        Money money5;
        Money money6;
        boolean changed4;
        Object rememberedValue4;
        Object rememberedValue5;
        SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent;
        SavingsScreenViewEvent.BalanceSeenEvent goalBalanceSeen;
        SyncEntity syncEntity;
        SyncValue syncValue;
        SyncValue.Value value;
        SavingsScreen savingsScreen2;
        SyncValue syncValue2;
        SyncValue.Value value2;
        Flow lastBalanceSeen;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(204762415);
        Object rememberedValue6 = gapComposer.rememberedValue();
        Continuation continuation = null;
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue6 == obj2) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState = (MutableState) rememberedValue6;
        DragAndDrop_androidKt.AddViewAttributes(this.observabilityManager, MapsKt__MapsJVMKt.mapOf(new Pair("type", this.screenKey)), gapComposer, 0);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue7 == obj2) {
            rememberedValue7 = new FormCashtag.AnonymousClass8.AnonymousClass2(this, mutableState, continuation, 8);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue7);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState2 = (MutableState) rememberedValue8;
        Object rememberedValue9 = gapComposer.rememberedValue();
        DependentGeneralSavingsScreen dependentGeneralSavingsScreen = this.screen;
        if (rememberedValue9 == obj2) {
            SavingsScreen.ScreenType screenType = dependentGeneralSavingsScreen.screenType;
            String str = dependentGeneralSavingsScreen.dependentCustomerToken;
            boolean z = screenType instanceof SavingsScreen.ScreenType.Home;
            EglCore eglCore = this.dependentSavingsStore;
            if (z) {
                lastBalanceSeen = eglCore.lastBalanceSeen(BalanceType.Savings.INSTANCE, str);
            } else if (screenType instanceof SavingsScreen.ScreenType.GeneralSavings) {
                lastBalanceSeen = eglCore.lastBalanceSeen(BalanceType.GeneralSavings.INSTANCE, str);
            } else {
                if (!(screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                lastBalanceSeen = eglCore.lastBalanceSeen(new BalanceType.Goal(((SavingsScreen.ScreenType.GoalDetail) screenType).token), str);
            }
            RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(FlowKt.flowOn(lastBalanceSeen, this.ioDispatcher), 19);
            gapComposer.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$1);
            rememberedValue9 = realGooglePayer$createWallet$$inlined$filter$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue9, new LoadedSavingsModel(null), null, gapComposer, 0, 2);
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse = (FamiliesSavingsScreensResponse) mutableState.getValue();
        if (familiesSavingsScreensResponse != null) {
            SyncEntity syncEntity2 = familiesSavingsScreensResponse.savings_screens;
            if (syncEntity2 != null && (syncValue2 = syncEntity2.sync_value) != null && (value2 = syncValue2.value) != null) {
                SyncValue.Value.SavingsScreens savingsScreens = value2 instanceof SyncValue.Value.SavingsScreens ? (SyncValue.Value.SavingsScreens) value2 : null;
                VersionedSavingsScreens versionedSavingsScreens = savingsScreens != null ? savingsScreens.value : null;
                if (versionedSavingsScreens != null) {
                    savingsScreen2 = SavingsScreenMappersKt.toSavingsScreen(this, versionedSavingsScreens, dependentGeneralSavingsScreen.screenType, EmptyList.INSTANCE);
                    savingsScreen = savingsScreen2;
                }
            }
            savingsScreen2 = null;
            savingsScreen = savingsScreen2;
        } else {
            savingsScreen = null;
        }
        FamiliesSavingsScreensResponse familiesSavingsScreensResponse2 = (FamiliesSavingsScreensResponse) mutableState.getValue();
        if (familiesSavingsScreensResponse2 != null && (syncEntity = familiesSavingsScreensResponse2.savings_folders) != null && (syncValue = syncEntity.sync_value) != null && (value = syncValue.value) != null) {
            SyncValue.Value.SavingsFolders savingsFolders = value instanceof SyncValue.Value.SavingsFolders ? (SyncValue.Value.SavingsFolders) value : null;
            if (savingsFolders != null) {
                versionedSavingsFolders = savingsFolders.value;
                if (versionedSavingsFolders != null) {
                    gapComposer.startReplaceGroup(1225624209);
                    gapComposer.end(false);
                    savingsBalance = null;
                } else {
                    String str2 = versionedSavingsFolders.v2_balance_token;
                    gapComposer.startReplaceGroup(1225624210);
                    String str3 = dependentGeneralSavingsScreen.dependentCustomerToken;
                    str3.getClass();
                    gapComposer.startReplaceGroup(-1493946353);
                    Object rememberedValue10 = gapComposer.rememberedValue();
                    RealDependentBalancesStore realDependentBalancesStore = this.dependentBalanceStore;
                    if (rememberedValue10 == obj2) {
                        CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(realDependentBalancesStore.jurisdictionConfigManager.select(), 29);
                        gapComposer.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                        rememberedValue10 = cardModelView$cardHeat$$inlined$map$1;
                    }
                    String str4 = str2;
                    MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
                    TargetEntityManager$TargetEntityValue syncValues = realDependentBalancesStore.targetEntityManager.syncValues(realDependentBalancesStore.entityManagerEvent, str3, CollectionsKt__CollectionsJVMKt.listOf(DomainType.BALANCE_SNAPSHOT), gapComposer, MLKEMEngine.KyberPolyBytes);
                    gapComposer = gapComposer;
                    if (syncValues instanceof TargetEntityManager$TargetEntityValue.Ready) {
                        String str5 = str4 == null ? "" : str4;
                        CurrencyCode currencyCode = (CurrencyCode) collectAsState2.getValue();
                        if (currencyCode != null) {
                            List list3 = ((TargetEntityManager$TargetEntityValue.Ready) syncValues).syncValues;
                            if (str4 == null) {
                                str4 = "";
                            }
                            money = RealDependentBalancesStore.findSavingsBalance(list3, currencyCode, SetsKt__SetsJVMKt.setOf(str4));
                        }
                        money = new Money((Long) 0L, (CurrencyCode) collectAsState2.getValue(), 4);
                        savingsBalance = new SavingsBalance(money, str5, false);
                    } else {
                        savingsBalance = null;
                    }
                    gapComposer.end(false);
                    gapComposer.end(false);
                }
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(savingsBalance, gapComposer);
                changed = gapComposer.changed(versionedSavingsFolders);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == obj2) {
                    List savingsFolders2 = versionedSavingsFolders == null ? MotionEventCompat.toSavingsFolders(this, versionedSavingsFolders) : null;
                    gapComposer.updateRememberedValue(savingsFolders2);
                    rememberedValue = savingsFolders2;
                }
                list = (List) rememberedValue;
                changed2 = gapComposer.changed(list);
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed2 || rememberedValue2 == obj2) {
                    PersistentActiveGoalStore create$1 = list == null ? this.activeGoalStoreFactory.create$1(new StateFlowKt$stateFlowOf$1(list)) : null;
                    gapComposer.updateRememberedValue(create$1);
                    rememberedValue2 = create$1;
                }
                persistentActiveGoalStore = (PersistentActiveGoalStore) rememberedValue2;
                changed3 = gapComposer.changed(savingsScreen) | gapComposer.changed(persistentActiveGoalStore);
                rememberedValue3 = gapComposer.rememberedValue();
                if (!changed3 || rememberedValue3 == obj2) {
                    SavingsScreen.ScreenType screenType2 = dependentGeneralSavingsScreen.screenType;
                    if (persistentActiveGoalStore != null) {
                        rememberedValue3 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                    } else {
                        Continuation continuation2 = null;
                        StateFlow stateFlow = persistentActiveGoalStore.savingsFolders;
                        if (screenType2 instanceof SavingsScreen.ScreenType.GoalDetail) {
                            String str6 = ((SavingsScreen.ScreenType.GoalDetail) screenType2).token;
                            str6.getClass();
                            rememberedValue3 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(stateFlow, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation2, persistentActiveGoalStore, str6, 24)), 1);
                        } else {
                            if (savingsScreen == null || !savingsScreen.useSingleGoalRules) {
                                c = 2;
                                rememberedValue3 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                            } else {
                                c = 2;
                                rememberedValue3 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(stateFlow, new RealPasscodeProvider$getPasscode$1(continuation2, persistentActiveGoalStore, 7)), 2);
                            }
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                    }
                    c = 2;
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    c = 2;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
                SavingsBalance savingsBalance2 = (SavingsBalance) rememberUpdatedState.getValue();
                Money money7 = savingsBalance2 == null ? savingsBalance2.balance : null;
                LoadedSavingsModel loadedSavingsModel = (LoadedSavingsModel) collectAsState.getValue();
                ActiveGoal activeGoal = (ActiveGoal) collectAsState3.getValue();
                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                SavingsScreen.ScreenType.GeneralSavings generalSavings = SavingsScreen.ScreenType.GeneralSavings.INSTANCE;
                SavingsScreen.ScreenType.Home home = SavingsScreen.ScreenType.Home.INSTANCE;
                if (savingsScreen != null) {
                    list2 = list;
                    money5 = null;
                } else {
                    SavingsScreen.ScreenType screenType3 = savingsScreen.f1196type;
                    if (Intrinsics.areEqual(screenType3, home)) {
                        if (loadedSavingsModel != null) {
                            money6 = (Money) loadedSavingsModel.data;
                            if (money6 == null) {
                                money6 = money7;
                            }
                        } else {
                            money6 = null;
                        }
                        pair = new Pair(money7, money6);
                        list2 = list;
                    } else if (Intrinsics.areEqual(screenType3, generalSavings)) {
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                List list4 = list;
                                if (obj3 instanceof SavingsFolder.GeneralFolder) {
                                    arrayList.add(obj3);
                                }
                                list = list4;
                            }
                            list2 = list;
                            SavingsFolder.GeneralFolder generalFolder = (SavingsFolder.GeneralFolder) CollectionsKt.first((List) arrayList);
                            if (generalFolder != null) {
                                money3 = generalFolder.balance;
                                if (loadedSavingsModel == null) {
                                    money4 = (Money) loadedSavingsModel.data;
                                    if (money4 == null) {
                                        money4 = money3;
                                    }
                                } else {
                                    money4 = null;
                                }
                                pair = new Pair(money3, money4);
                            }
                        } else {
                            list2 = list;
                        }
                        money3 = null;
                        if (loadedSavingsModel == null) {
                        }
                        pair = new Pair(money3, money4);
                    } else {
                        list2 = list;
                        if (!(screenType3 instanceof SavingsScreen.ScreenType.GoalDetail)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                SavingsFolder savingsFolder = (SavingsFolder) obj;
                                Iterator it2 = it;
                                SavingsFolder.GoalFolder goalFolder = savingsFolder instanceof SavingsFolder.GoalFolder ? (SavingsFolder.GoalFolder) savingsFolder : null;
                                if (Intrinsics.areEqual(goalFolder != null ? goalFolder.token : null, ((SavingsScreen.ScreenType.GoalDetail) screenType3).token)) {
                                    break;
                                }
                                it = it2;
                            }
                            SavingsFolder savingsFolder2 = (SavingsFolder) obj;
                            if (savingsFolder2 != null) {
                                money2 = savingsFolder2.getBalance();
                                if (activeGoal != null || (lastSeenStatus = activeGoal.lastSeenStatus) == null || (r4 = lastSeenStatus.balance) == null) {
                                    Money money8 = money2;
                                }
                                pair = new Pair(money2, money8);
                            }
                        }
                        money2 = null;
                        if (activeGoal != null) {
                        }
                        Money money82 = money2;
                        pair = new Pair(money2, money82);
                    }
                    money5 = (Money) pair.first;
                    Money money9 = (Money) pair.second;
                    if (!booleanValue && Moneys.compareTo(money9, money5) <= 0) {
                        money5 = money9;
                    }
                }
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(money5, gapComposer);
                SavingsBalance savingsBalance3 = (SavingsBalance) rememberUpdatedState.getValue();
                changed4 = gapComposer.changed(savingsBalance3);
                rememberedValue4 = gapComposer.rememberedValue();
                if (!changed4 || rememberedValue4 == obj2) {
                    rememberedValue4 = Updater.derivedStateOf(new ArcadeModal2Kt$$ExternalSyntheticLambda2(25, this, savingsBalance3));
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                State state = (State) rememberedValue4;
                rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj2) {
                    rememberedValue5 = this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.SavingsConfig, null, new FamilyActivityFixtures$$ExternalSyntheticLambda0(2));
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue5, gapComposer);
                Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, rememberUpdatedState, mutableState2, 25));
                Money money10 = (Money) rememberUpdatedState2.getValue();
                if (savingsScreen != null || money10 == null || ((dependentGeneralSavingsScreen.screenType instanceof SavingsScreen.ScreenType.GoalDetail) && ((ActiveGoal) collectAsState3.getValue()) == null)) {
                    gapComposer.startReplaceGroup(1227591966);
                    gapComposer.end(false);
                    gapComposer.end(false);
                    return SavingsScreenViewModel.Loading.INSTANCE;
                }
                gapComposer.startReplaceGroup(1227632142);
                ActiveGoal activeGoal2 = (ActiveGoal) collectAsState3.getValue();
                Animation animation = (Animation) receiveValueAsState.getValue();
                SavingsScreen.ScreenType screenType4 = dependentGeneralSavingsScreen.screenType;
                ActiveGoal activeGoal3 = (ActiveGoal) collectAsState3.getValue();
                if (Intrinsics.areEqual(screenType4, home)) {
                    goalBalanceSeen = activeGoal3 != null ? new SavingsScreenViewEvent.BalanceSeenEvent.SavingsAndGoalBalanceSeen(activeGoal3.token, activeGoal3.progress, activeGoal3.amountRemaining, money10) : new SavingsScreenViewEvent.BalanceSeenEvent.SavingsBalanceSeen(money10);
                } else if (Intrinsics.areEqual(screenType4, generalSavings)) {
                    goalBalanceSeen = new SavingsScreenViewEvent.BalanceSeenEvent.GeneralBalanceSeen(money10);
                } else {
                    if (!(screenType4 instanceof SavingsScreen.ScreenType.GoalDetail)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (activeGoal3 == null) {
                        balanceSeenEvent = null;
                        GapComposer gapComposer2 = gapComposer;
                        SavingsScreenViewModel.Content content = this.screenContentFactory.content(savingsScreen, money10, list2, activeGoal2, animation, EmptyFlow.INSTANCE, true, balanceSeenEvent, (SavingsActivitySectionParams) state.getValue(), gapComposer2, 135790592, 70, 512);
                        gapComposer2.end(false);
                        gapComposer2.end(false);
                        return content;
                    }
                    goalBalanceSeen = new SavingsScreenViewEvent.BalanceSeenEvent.GoalBalanceSeen(((SavingsScreen.ScreenType.GoalDetail) screenType4).token, activeGoal3.progress, activeGoal3.amountRemaining, money10);
                }
                balanceSeenEvent = goalBalanceSeen;
                GapComposer gapComposer22 = gapComposer;
                SavingsScreenViewModel.Content content2 = this.screenContentFactory.content(savingsScreen, money10, list2, activeGoal2, animation, EmptyFlow.INSTANCE, true, balanceSeenEvent, (SavingsActivitySectionParams) state.getValue(), gapComposer22, 135790592, 70, 512);
                gapComposer22.end(false);
                gapComposer22.end(false);
                return content2;
            }
        }
        versionedSavingsFolders = null;
        if (versionedSavingsFolders != null) {
        }
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(savingsBalance, gapComposer);
        changed = gapComposer.changed(versionedSavingsFolders);
        rememberedValue = gapComposer.rememberedValue();
        if (!changed) {
        }
        if (versionedSavingsFolders == null) {
        }
        gapComposer.updateRememberedValue(savingsFolders2);
        rememberedValue = savingsFolders2;
        list = (List) rememberedValue;
        changed2 = gapComposer.changed(list);
        rememberedValue2 = gapComposer.rememberedValue();
        if (!changed2) {
        }
        if (list == null) {
        }
        gapComposer.updateRememberedValue(create$1);
        rememberedValue2 = create$1;
        persistentActiveGoalStore = (PersistentActiveGoalStore) rememberedValue2;
        changed3 = gapComposer.changed(savingsScreen) | gapComposer.changed(persistentActiveGoalStore);
        rememberedValue3 = gapComposer.rememberedValue();
        if (changed3) {
        }
        SavingsScreen.ScreenType screenType22 = dependentGeneralSavingsScreen.screenType;
        if (persistentActiveGoalStore != null) {
        }
        c = 2;
        gapComposer.updateRememberedValue(rememberedValue3);
        MutableState collectAsState32 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        SavingsBalance savingsBalance22 = (SavingsBalance) rememberUpdatedState3.getValue();
        if (savingsBalance22 == null) {
        }
        LoadedSavingsModel loadedSavingsModel2 = (LoadedSavingsModel) collectAsState.getValue();
        ActiveGoal activeGoal4 = (ActiveGoal) collectAsState32.getValue();
        boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
        SavingsScreen.ScreenType.GeneralSavings generalSavings2 = SavingsScreen.ScreenType.GeneralSavings.INSTANCE;
        SavingsScreen.ScreenType.Home home2 = SavingsScreen.ScreenType.Home.INSTANCE;
        if (savingsScreen != null) {
        }
        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(money5, gapComposer);
        SavingsBalance savingsBalance32 = (SavingsBalance) rememberUpdatedState3.getValue();
        changed4 = gapComposer.changed(savingsBalance32);
        rememberedValue4 = gapComposer.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = Updater.derivedStateOf(new ArcadeModal2Kt$$ExternalSyntheticLambda2(25, this, savingsBalance32));
        gapComposer.updateRememberedValue(rememberedValue4);
        State state2 = (State) rememberedValue4;
        rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj2) {
        }
        MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) rememberedValue5, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, rememberUpdatedState3, mutableState2, 25));
        Money money102 = (Money) rememberUpdatedState22.getValue();
        if (savingsScreen != null) {
        }
        gapComposer.startReplaceGroup(1227591966);
        gapComposer.end(false);
        gapComposer.end(false);
        return SavingsScreenViewModel.Loading.INSTANCE;
    }
}
