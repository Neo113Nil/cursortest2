package com.squareup.cash.core.navigationcontainer.navigator;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.broadway.Broadway;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.navigation.ScreenOverrideRule;
import app.cash.broadway.presenter.Placement;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.presenter.SwipeContext;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.broadway.screen.Answer;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.history.screens.HistoryScreens;
import app.cash.passcode.backend.AppLockMonitor$setup$1$1$1;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.backstack.api.BackStack$Entry;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.backstack.real.RealBackStackEditor;
import com.squareup.cash.backstack.real.RealBackStackSnapshot;
import com.squareup.cash.core.navigationcontainer.RealGenericOverlayResultHandler$WhenMappings;
import com.squareup.cash.core.navigationcontainer.api.NavigationPolicy;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.api.PresenterElement;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.core.navigationcontainer.navigator.Navigation;
import com.squareup.cash.core.navigationcontainer.navigator.NavigatorError;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.navigation.RealNavigationPolicyResolver$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.api.BugsnagClient$ErrorContext$ActiveScreen;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.payments.common.PaymentSessionScreen;
import com.squareup.cash.payments.common.RealPaymentListener;
import com.squareup.cash.payments.common.RealPaymentListener$onPaymentEnded$1;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.storage.RealStorage$temp$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tabprovider.api.TabInfo;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.ConnectionPool;
import okhttp3.internal.Tags;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;
import papa.SafeTrace;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda2;
import retrofit2.Retrofit;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class BetterNavigator {
    public final RoomDatabase$closeBarrier$1 backPressDispatcher;
    public final RealBackStack backStack;
    public final Retrofit.Builder backStackManager;
    public final Broadway broadway;
    public final BugsnagClient bugsnagClient;
    public final MoneybotHomeScreen defaultSwipeScreen;
    public final LinkedHashMap deferredTearDowns;
    public final StateFlowImpl delayedBackPressed;
    public boolean dirty;
    public final ErrorReporter errorReporter;
    public final List eventListeners;
    public final Set experimentalPersistedOverlayScreens;
    public FullScreen fullScreen;
    public final KeysetHandle genericOverlayResultHandler;
    public final BufferedChannel goToQueue;
    public boolean hasReceivedNavigation;
    public final NavigatorState identifier;
    public final LifecycleOwner lifecycleOwner;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final StateFlowImpl mutableState;
    public int navigationCount;
    public final ConnectionPool navigationPolicyResolver;
    public final StateFlowImpl navigationState;
    public OverlayScreen overlay;
    public final ArrayList overlayResults;
    public final LinkedHashMap pausedStates;
    public final CoroutineContext phasedTearDownContext;
    public Job queueCollectionJob;
    public boolean readyToNavigate;
    public boolean returnToSidePanelOnBack;
    public final Bundle savedState;
    public final CoroutineScope scope;
    public final List screenOverrideRules;
    public boolean sidePanelHasBeenForegrounded;
    public State state;
    public FullScreen swipe;
    public boolean swipeEnabled;
    public NavigationModel.Ready.Swipe swipeState;
    public final String swipeStateKey;
    public final LinkedHashMap tabPresenterStates;
    public final ArrayList tabs;
    public final MainContainerDelegate$$ExternalSyntheticLambda0 uiOnBack;
    public final LinkedHashSet uiStateKeys;

    /* renamed from: com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$5, reason: invalid class name */
    public final class AnonymousClass5 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ BetterNavigator this$0;

        /* renamed from: com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$5$1, reason: invalid class name */
        public final class AnonymousClass1 extends SuspendLambda implements Function2 {
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ BetterNavigator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BetterNavigator betterNavigator, Continuation continuation) {
                super(2, continuation);
                this.this$0 = betterNavigator;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    this.Z$0 = z;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                BetterNavigator betterNavigator = this.this$0;
                betterNavigator.errorReporter.report(new NavigatorError.BackEventTimeoutNoTabs(), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                betterNavigator.backPressDispatcher.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass5(BetterNavigator betterNavigator, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = betterNavigator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            BetterNavigator betterNavigator = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass5(betterNavigator, continuation, 0);
                case 1:
                    return new AnonymousClass5(betterNavigator, continuation, 1);
                default:
                    return new AnonymousClass5(betterNavigator, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            BetterNavigator betterNavigator = this.this$0;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlowImpl stateFlowImpl = betterNavigator.delayedBackPressed;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(betterNavigator, null);
                        stateFlowImpl.getClass();
                        this.label = 1;
                        if (FlowKt.collectLatest(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("SharedFlow never completes, this call should never return.");
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow moneybotHomeEnabled = betterNavigator.moneybotFlagsHelper.moneybotHomeEnabled();
                        BetterNavigator$6$1 betterNavigator$6$1 = new BetterNavigator$6$1(betterNavigator, continuation, 0);
                        this.label = 1;
                        if (FlowKt.collectLatest(moneybotHomeEnabled, betterNavigator$6$1, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelAsFlow receiveAsFlow = FlowKt.receiveAsFlow(betterNavigator.goToQueue);
                        AppLockMonitor$setup$1$1$1 appLockMonitor$setup$1$1$1 = new AppLockMonitor$setup$1$1$1(betterNavigator, 2);
                        this.label = 1;
                        if (receiveAsFlow.collect(appLockMonitor$setup$1$1$1, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* loaded from: classes6.dex */
    public final class GenericResultNavigator implements Navigator {
        public GenericResultNavigator() {
        }

        @Override // app.cash.broadway.navigation.Navigator
        public final void askQuestion(Question question, Function1 function1) {
            question.getClass();
            function1.getClass();
            throw new UnsupportedOperationException();
        }

        @Override // app.cash.broadway.navigation.Navigator
        public final void giveAnswer(AskedQuestion askedQuestion, Object obj) {
            askedQuestion.getClass();
            obj.getClass();
            throw new UnsupportedOperationException();
        }

        @Override // app.cash.broadway.navigation.Navigator
        public final void goTo(Screen screen) {
            screen.getClass();
            BetterNavigator.this.goTo(screen, null, null);
        }
    }

    public final class ScreenNavigator implements Navigator {
        public final Screen ownerScreen;
        public final String ownerStateKey;
        public final /* synthetic */ BetterNavigator this$0;

        public ScreenNavigator(BetterNavigator betterNavigator, Screen screen, String str) {
            screen.getClass();
            str.getClass();
            this.this$0 = betterNavigator;
            this.ownerScreen = screen;
            this.ownerStateKey = str;
        }

        @Override // app.cash.broadway.navigation.Navigator
        public final void askQuestion(Question question, Function1 function1) {
            question.getClass();
            function1.getClass();
            String m = re$$ExternalSyntheticOutline0.m();
            Screen screen = (Screen) function1.invoke(new AskedQuestion(m, question));
            screen.getClass();
            Screen screen2 = this.ownerScreen;
            screen2.getClass();
            String str = this.ownerStateKey;
            str.getClass();
            boolean z = screen2 instanceof OnlyOneOverlayTreatment;
            BetterNavigator betterNavigator = this.this$0;
            if (z) {
                if (!betterNavigator.isPersistedAsOverlay(screen2)) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) re$$ExternalSyntheticOutline0.m(screen2, "Overlays cannot ask questions (", ")"));
                    return;
                } else if (screen instanceof OnlyOneOverlayTreatment) {
                    a$$ExternalSyntheticBUOutline0.m(screen2, " -> ", screen, ")", "Overlays cannot ask questions to other overlays (");
                    return;
                }
            }
            if ((screen instanceof Back) || (screen instanceof Finish)) {
                a$$ExternalSyntheticBUOutline0.m(screen, ". (Navigator owner: ", screen2, ")", "Cannot ask a question of a meta screen: ");
            } else if (betterNavigator.isPaused(str)) {
                betterNavigator.errorReporter.report(new NavigatorError.PausedAskQuestion(str, screen2, question), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            } else {
                betterNavigator.enqueueNavigation(new Navigation.ScreenNavigation.AskQuestion(screen, m, question, screen2, str));
            }
        }

        @Override // app.cash.broadway.navigation.Navigator
        public final void giveAnswer(AskedQuestion askedQuestion, Object obj) {
            askedQuestion.getClass();
            obj.getClass();
            String id = askedQuestion.getId();
            Question question = askedQuestion.getQuestion();
            id.getClass();
            question.getClass();
            Screen screen = this.ownerScreen;
            screen.getClass();
            String str = this.ownerStateKey;
            str.getClass();
            BetterNavigator betterNavigator = this.this$0;
            if (betterNavigator.isPaused(str)) {
                betterNavigator.errorReporter.report(new NavigatorError.PausedGiveAnswer(str, screen, id, question), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            } else {
                betterNavigator.enqueueNavigation(new Navigation.ScreenNavigation.GiveAnswer(id, question, obj, screen, str));
            }
        }

        @Override // app.cash.broadway.navigation.Navigator
        public final void goTo(Screen screen) {
            screen.getClass();
            this.this$0.goTo(screen, this.ownerScreen, this.ownerStateKey);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Active;
        public static final State Paused;

        static {
            State state = new State("Active", 0);
            Active = state;
            State state2 = new State("Paused", 1);
            Paused = state2;
            $VALUES = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public BetterNavigator(Retrofit.Builder builder, ConnectionPool connectionPool, Broadway broadway, ErrorReporter errorReporter, BugsnagClient bugsnagClient, List list, KeysetHandle keysetHandle, CoroutineScope coroutineScope, List list2, RealTabPublisher realTabPublisher, RealUuidGenerator realUuidGenerator, LifecycleOwner lifecycleOwner, RealSessionFlags realSessionFlags, MoneybotFlagsHelper moneybotFlagsHelper, NavigatorState navigatorState, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1, MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0, Bundle bundle, Set set, CoroutineContext coroutineContext) {
        String string2;
        State valueOf;
        navigatorState.getClass();
        set.getClass();
        coroutineContext.getClass();
        this.backStackManager = builder;
        this.navigationPolicyResolver = connectionPool;
        this.broadway = broadway;
        this.errorReporter = errorReporter;
        this.bugsnagClient = bugsnagClient;
        this.eventListeners = list;
        this.genericOverlayResultHandler = keysetHandle;
        this.scope = coroutineScope;
        this.screenOverrideRules = list2;
        this.lifecycleOwner = lifecycleOwner;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.identifier = navigatorState;
        this.backPressDispatcher = roomDatabase$closeBarrier$1;
        this.uiOnBack = mainContainerDelegate$$ExternalSyntheticLambda0;
        this.savedState = bundle;
        this.experimentalPersistedOverlayScreens = set;
        this.phasedTearDownContext = coroutineContext;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(NavigationModel.Initializing.INSTANCE);
        this.mutableState = MutableStateFlow;
        this.navigationState = MutableStateFlow;
        this.defaultSwipeScreen = MoneybotHomeScreen.INSTANCE;
        this.state = (bundle == null || (string2 = bundle.getString("state")) == null || (valueOf = State.valueOf(string2)) == null) ? State.Active : valueOf;
        this.overlayResults = new ArrayList();
        this.tabs = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.tabPresenterStates = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.pausedStates = linkedHashMap2;
        this.swipeStateKey = Recorder$$ExternalSyntheticOutline2.m$1(navigatorState.name(), "-swipe");
        Continuation continuation = null;
        this.swipeState = new NavigationModel.Ready.Swipe(null, 7);
        this.uiStateKeys = new LinkedHashSet();
        this.deferredTearDowns = new LinkedHashMap();
        int i = 0;
        BufferedChannel Channel$default = PapaEvent.Channel$default(50, null, new BetterNavigator$$ExternalSyntheticLambda3(this, i), 2);
        this.goToQueue = Channel$default;
        this.delayedBackPressed = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.navigationCount = bundle != null ? bundle.getInt("navigationCount") : 0;
        int i2 = 1;
        if (bundle == null) {
            this.backStack = new RealBackStack();
        } else {
            bundle.setClassLoader(BetterNavigator.class.getClassLoader());
            if (!Intrinsics.areEqual(bundle.getString("identifier"), navigatorState.name())) {
                a$$ExternalSyntheticBUOutline0.m(navigatorState, ") does not match the identifier retrieved from savedState (", bundle.getString("identifier"), "). This is an error because we cannot guarantee unique keys if identifiers are accidentally swapped.", "The identifier provided (");
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("stack");
            parcelable.getClass();
            RealBackStack realBackStack = (RealBackStack) parcelable;
            this.backStack = realBackStack;
            PresentersSavedState presentersSavedState = (PresentersSavedState) bundle.getParcelable("tabsSavedState");
            if (presentersSavedState != null) {
                linkedHashMap.clear();
                linkedHashMap.putAll(presentersSavedState.getPresenterStates());
            }
            PresentersSavedState presentersSavedState2 = (PresentersSavedState) bundle.getParcelable("pausedStates");
            if (presentersSavedState2 != null) {
                linkedHashMap2.clear();
                linkedHashMap2.putAll(presentersSavedState2.getPresenterStates());
            }
            int i3 = bundle.getInt("swipePageVersion", 0);
            String string3 = bundle.getString("swipePage");
            NavigationModel.Ready.Swipe.Page page = (string3 == null || (page = NavigationModel.Ready.Swipe.Page.valueOf(string3)) == null) ? NavigationModel.Ready.Swipe.Page.MainTabs : page;
            this.sidePanelHasBeenForegrounded = bundle.getBoolean("sidePanelHasBeenForegrounded", page == NavigationModel.Ready.Swipe.Page.SidePanel);
            this.swipeState = new NavigationModel.Ready.Swipe(new Versioned(page, i3), 3);
            if (bundle.containsKey("fullScreen")) {
                String string4 = bundle.getString("fullScreenStateKey");
                string4.getClass();
                Parcelable parcelable2 = bundle.getParcelable("fullScreen");
                parcelable2.getClass();
                StateFlowKt.sendOrThrow$default(Channel$default, new Navigation.ScreenNavigation.Restore((Screen) parcelable2, string4, (SavedState) bundle.getParcelable("fullScreenState")));
                if (bundle.containsKey("overlayScreen")) {
                    String string5 = bundle.getString("overlayStateKey");
                    string5.getClass();
                    Parcelable parcelable3 = bundle.getParcelable("overlayScreen");
                    parcelable3.getClass();
                    StateFlowKt.sendOrThrow$default(Channel$default, new Navigation.ScreenNavigation.Restore((Screen) parcelable3, string5, (SavedState) bundle.getParcelable("overlayScreenState")));
                }
            } else if (!realBackStack.isEmpty()) {
                errorReporter.report(new NavigatorError.RestoredWithStackAndNoFullScreen(navigatorState.name()), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            }
        }
        if (navigatorState.supportsTabs) {
            BetterNavigator$$ExternalSyntheticLambda3 betterNavigator$$ExternalSyntheticLambda3 = new BetterNavigator$$ExternalSyntheticLambda3(this, i2);
            if (realTabPublisher.listener != null) {
                a$$ExternalSyntheticBUOutline0.m$1("A high priority listener has already been registered.");
                throw null;
            }
            realTabPublisher.listener = betterNavigator$$ExternalSyntheticLambda3;
            betterNavigator$$ExternalSyntheticLambda3.invoke(realTabPublisher._state.getValue());
        } else {
            setReadyToNavigate(true);
        }
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this, continuation, i), 3);
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass5(this, continuation, i2), 1);
    }

    public static EventListener.Initiator toEventInitiator(Navigation navigation) {
        if (navigation instanceof Navigation.ScreenNavigation.GoTo) {
            Navigation.ScreenNavigation.GoTo goTo = (Navigation.ScreenNavigation.GoTo) navigation;
            Screen screen = goTo.initiatorScreen;
            if (screen != null) {
                String str = goTo.initiatorStateKey;
                str.getClass();
                return new EventListener.Initiator.Location(screen, str);
            }
        } else {
            if (navigation instanceof Navigation.ScreenNavigation.AskQuestion) {
                Navigation.ScreenNavigation.AskQuestion askQuestion = (Navigation.ScreenNavigation.AskQuestion) navigation;
                return new EventListener.Initiator.Location(askQuestion.getInitiatorScreen(), askQuestion.getInitiatorStateKey());
            }
            if (navigation instanceof Navigation.ScreenNavigation.GiveAnswer) {
                Navigation.ScreenNavigation.GiveAnswer giveAnswer = (Navigation.ScreenNavigation.GiveAnswer) navigation;
                return new EventListener.Initiator.Location(giveAnswer.getInitiatorScreen(), giveAnswer.getInitiatorStateKey());
            }
            if (navigation instanceof Navigation.ScreenNavigation.ResetBefore) {
                Navigation.ScreenNavigation.ResetBefore resetBefore = (Navigation.ScreenNavigation.ResetBefore) navigation;
                return new EventListener.Initiator.Location(resetBefore.getOwnerScreen(), resetBefore.getOwnerStateKey());
            }
            if (navigation instanceof Navigation.ScreenNavigation.Restore) {
                return EventListener.Initiator.Restore.INSTANCE;
            }
            if (!Intrinsics.areEqual(navigation, Navigation.Reset.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return EventListener.Initiator.None.INSTANCE;
    }

    public final void clearSwipe(boolean z, boolean z2) {
        NavigationModel.Ready.Swipe copy$default;
        CoroutineScope coroutineScope;
        CoroutineContext coroutineContext;
        PresenterElement presenterElement;
        FullScreen fullScreen = this.swipe;
        boolean z3 = !z2 && (this.sidePanelHasBeenForegrounded || !(fullScreen == null || (coroutineScope = fullScreen.startedScope) == null || (coroutineContext = coroutineScope.getCoroutineContext()) == null || (presenterElement = (PresenterElement) coroutineContext.get(PresenterElement.Key)) == null || presenterElement.state != PresenterElement.State.Active || presenterElement.isObscured));
        String str = this.swipeStateKey;
        LinkedHashMap linkedHashMap = this.pausedStates;
        if (fullScreen != null) {
            if (z3) {
                SavedState savePresenterState = savePresenterState(fullScreen);
                if (savePresenterState != null) {
                    linkedHashMap.put(str, savePresenterState);
                }
            } else {
                linkedHashMap.remove(str);
            }
            tearDownOrDefer(fullScreen, z || !z3);
            if (z2) {
                linkedHashMap.remove(fullScreen.stateKey);
            }
            this.swipe = null;
            this.dirty = true;
        }
        if (z2) {
            linkedHashMap.remove(str);
            this.sidePanelHasBeenForegrounded = false;
        }
        if (z2) {
            copy$default = new NavigationModel.Ready.Swipe(null, 7);
        } else {
            NavigationModel.Ready.Swipe swipe = this.swipeState;
            copy$default = NavigationModel.Ready.Swipe.copy$default(swipe, null, new Versioned(NavigationModel.Ready.Swipe.Page.MainTabs, swipe.activePage.version), 3);
        }
        this.swipeState = copy$default;
    }

    public final EventListener.State createEventState() {
        String name = this.identifier.name();
        State state = this.state;
        FullScreen fullScreen = this.fullScreen;
        EventListener.Location location = fullScreen != null ? new EventListener.Location(fullScreen.getStateKey(), fullScreen.getScreen(), fullScreen.isBack) : null;
        OverlayScreen overlayScreen = this.overlay;
        EventListener.Location location2 = overlayScreen != null ? new EventListener.Location(overlayScreen.getStateKey(), overlayScreen.getScreen(), false) : null;
        RealBackStack realBackStack = this.backStack;
        realBackStack.getClass();
        return new EventListener.State(name, state, location, location2, new RealBackStackSnapshot(CollectionsKt.toList(realBackStack.entries)));
    }

    public final void dispatchSwipeHandlers(NavigationModel.Ready.Swipe.Page page, boolean z) {
        Screen screen;
        Screen screen2;
        page.getClass();
        int ordinal = page.ordinal();
        SwipeContext.Source source = null;
        Path.Companion companion = PresenterElement.Key;
        if (ordinal == 0) {
            FullScreen fullScreen = this.swipe;
            fullScreen.getClass();
            PresenterElement presenterElement = (PresenterElement) fullScreen.getScope().getCoroutineContext().get(companion);
            if (presenterElement != null) {
                FullScreen fullScreen2 = this.fullScreen;
                if (fullScreen2 != null && (screen = fullScreen2.screen) != null) {
                    source = tabId(screen);
                }
                presenterElement.sendSwipeIn(new SwipeContext(z, source));
                return;
            }
            return;
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        FullScreen fullScreen3 = this.fullScreen;
        fullScreen3.getClass();
        PresenterElement presenterElement2 = (PresenterElement) fullScreen3.getScope().getCoroutineContext().get(companion);
        if (presenterElement2 != null) {
            FullScreen fullScreen4 = this.swipe;
            if (fullScreen4 != null && (screen2 = fullScreen4.screen) != null) {
                source = tabId(screen2);
            }
            presenterElement2.sendSwipeIn(new SwipeContext(z, source));
        }
    }

    public final void emitIfDirty() {
        Screen screen;
        CoroutineScope scope;
        CoroutineContext coroutineContext;
        PresenterElement presenterElement;
        if (this.dirty) {
            this.dirty = false;
            State state = this.state;
            State state2 = State.Paused;
            StateFlowImpl stateFlowImpl = this.mutableState;
            if (state == state2) {
                StateFlowKt.emitOrThrow(stateFlowImpl, NavigationModel.Paused.INSTANCE);
                return;
            }
            FullScreen fullScreen = this.fullScreen;
            if (fullScreen == null) {
                if (this.overlay == null) {
                    StateFlowKt.emitOrThrow(stateFlowImpl, NavigationModel.Initializing.INSTANCE);
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("Navigated to overlay without a full screen.");
                    return;
                }
            }
            boolean z = this.swipeEnabled;
            if (z) {
                if (z && this.swipe == null && isTab(fullScreen.screen)) {
                    ensureSwipe(this.defaultSwipeScreen);
                }
                if (this.returnToSidePanelOnBack && this.swipe != null) {
                    this.swipeState = NavigationModel.Ready.Swipe.copy$default(this.swipeState, null, VersionedKt.update(this.swipeState.activePage, NavigationModel.Ready.Swipe.Page.SidePanel), 3);
                    this.returnToSidePanelOnBack = false;
                }
            }
            FullScreen fullScreen2 = this.swipe;
            FullScreen fullScreen3 = this.fullScreen;
            fullScreen3.getClass();
            if (!isTab(fullScreen3.screen)) {
                fullScreen2 = null;
            }
            ArrayList arrayList = this.tabs;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TabInfo) it.next()).identifier.name());
            }
            Set set = CollectionsKt.toSet(arrayList2);
            this.tabPresenterStates.keySet().retainAll(set);
            NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) this.swipeState.activePage.value;
            OverlayScreen overlayScreen = this.overlay;
            if (overlayScreen != null) {
                screen = overlayScreen.getScreen();
            } else if (fullScreen2 == null || page != NavigationModel.Ready.Swipe.Page.SidePanel) {
                FullScreen fullScreen4 = this.fullScreen;
                fullScreen4.getClass();
                screen = fullScreen4.screen;
            } else {
                screen = fullScreen2.screen;
            }
            this.bugsnagClient.setErrorContext(new BugsnagClient$ErrorContext$ActiveScreen(screen));
            for (EventListener eventListener : this.eventListeners) {
                createEventState();
                eventListener.getClass();
            }
            FullScreen fullScreen5 = this.fullScreen;
            fullScreen5.getClass();
            CoroutineContext coroutineContext2 = fullScreen5.getScope().getCoroutineContext();
            Path.Companion companion = PresenterElement.Key;
            PresenterElement presenterElement2 = (PresenterElement) coroutineContext2.get(companion);
            Placement placement = Placement.Background.INSTANCE;
            Placement.Foreground foreground = Placement.Foreground.INSTANCE;
            if (presenterElement2 != null) {
                presenterElement2.setPlacement((this.overlay != null || (fullScreen2 != null && page == NavigationModel.Ready.Swipe.Page.SidePanel)) ? placement : foreground);
                boolean z2 = this.overlay != null || (fullScreen2 != null && page == NavigationModel.Ready.Swipe.Page.SidePanel);
                if (presenterElement2.isObscured != z2) {
                    presenterElement2.isObscured = z2;
                    presenterElement2.updateLifecycleState();
                }
            }
            if (fullScreen2 != null && (scope = fullScreen2.getScope()) != null && (coroutineContext = scope.getCoroutineContext()) != null && (presenterElement = (PresenterElement) coroutineContext.get(companion)) != null) {
                if (this.overlay == null && page == NavigationModel.Ready.Swipe.Page.SidePanel) {
                    placement = foreground;
                }
                presenterElement.setPlacement(placement);
                boolean z3 = (this.overlay == null && page == NavigationModel.Ready.Swipe.Page.SidePanel) ? false : true;
                if (presenterElement.isObscured != z3) {
                    presenterElement.isObscured = z3;
                    presenterElement.updateLifecycleState();
                }
                if (!this.sidePanelHasBeenForegrounded && presenterElement.state == PresenterElement.State.Active && !presenterElement.isObscured) {
                    this.sidePanelHasBeenForegrounded = true;
                }
            }
            FullScreen fullScreen6 = this.fullScreen;
            fullScreen6.getClass();
            String str = fullScreen6.stateKey;
            Screen screen2 = fullScreen6.screen;
            CoroutineScope scope2 = fullScreen6.getScope();
            String str2 = fullScreen6.previousStateKey;
            boolean z4 = fullScreen6.isBack;
            boolean isTab = isTab(fullScreen6.screen);
            Object obj = fullScreen6.result;
            ArrayList arrayList3 = this.overlayResults;
            NavigationModel.Ready.FullScreenLocation fullScreenLocation = new NavigationModel.Ready.FullScreenLocation(str, screen2, scope2, str2, z4, isTab, obj, Tags.toPersistentList(arrayList3), fullScreen6.initiatorScreen);
            NavigationModel.Ready.Swipe copy$default = fullScreen2 != null ? NavigationModel.Ready.Swipe.copy$default(this.swipeState, new NavigationModel.Ready.FullScreenLocation(fullScreen2.stateKey, fullScreen2.screen, fullScreen2.getScope(), fullScreen2.previousStateKey, fullScreen2.isBack, isTab(fullScreen2.screen), fullScreen2.result, Tags.toPersistentList(arrayList3), fullScreen2.initiatorScreen), null, 6) : null;
            OverlayScreen overlayScreen2 = this.overlay;
            NavigationModel.Ready.OverlayLocation overlayLocation = overlayScreen2 != null ? new NavigationModel.Ready.OverlayLocation(overlayScreen2.getStateKey(), overlayScreen2.getScreen(), overlayScreen2.getScope()) : null;
            PersistentOrderedSet persistentOrderedSet = PersistentOrderedSet.EMPTY;
            persistentOrderedSet.getClass();
            PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(persistentOrderedSet);
            persistentOrderedSetBuilder.addAll(this.backStack.getStateKeys());
            persistentOrderedSetBuilder.addAll(set);
            if (fullScreen2 != null) {
                persistentOrderedSetBuilder.add(fullScreen2.stateKey);
            }
            PersistentOrderedSet persistentOrderedSet2 = persistentOrderedSetBuilder.builtSet;
            PersistentHashMapBuilder persistentHashMapBuilder = persistentOrderedSetBuilder.hashMapBuilder;
            if (persistentOrderedSet2 != null) {
                PersistentHashMap persistentHashMap = persistentHashMapBuilder.builtMap;
            } else {
                PersistentHashMap persistentHashMap2 = persistentHashMapBuilder.builtMap;
                PersistentOrderedSet persistentOrderedSet3 = new PersistentOrderedSet(persistentOrderedSetBuilder.firstElement, persistentOrderedSetBuilder.lastElement, persistentHashMapBuilder.build());
                persistentOrderedSetBuilder.builtSet = persistentOrderedSet3;
                persistentOrderedSet2 = persistentOrderedSet3;
            }
            StateFlowKt.emitOrThrow(stateFlowImpl, new NavigationModel.Ready(fullScreenLocation, overlayLocation, persistentOrderedSet2, copy$default));
            this.dirty = false;
        }
    }

    public final void enqueueNavigation(Navigation navigation) {
        if (!(navigation instanceof Navigation.ScreenNavigation.Restore)) {
            this.hasReceivedNavigation = true;
        }
        StateFlowKt.sendOrThrow$default(this.goToQueue, navigation);
    }

    public final void ensureSwipe(Screen screen) {
        if (this.swipe != null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.pausedStates;
        String str = this.swipeStateKey;
        SavedState savedState = (SavedState) linkedHashMap.remove(str);
        FullScreen fullScreen = (FullScreen) recoverFromDeferredTearDown(str);
        if (fullScreen == null) {
            fullScreen = new FullScreen(this.swipeStateKey, screen, new CopyCodeKt$$ExternalSyntheticLambda4(28, this, screen, savedState), false, null, null, null);
        }
        this.swipe = fullScreen;
        this.dirty = true;
    }

    public final String generateStateKey() {
        int i = this.navigationCount;
        this.navigationCount = i + 1;
        return this.identifier + i + "-" + RealUuidGenerator.generate();
    }

    public final void goTo(Screen screen, Screen screen2, String str) {
        screen.getClass();
        if (str != null && screen2 != null && isPaused(str)) {
            this.errorReporter.report(new NavigatorError.PausedGoTo(screen2, screen, str), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return;
        }
        Navigation.ScreenNavigation.GoTo goTo = new Navigation.ScreenNavigation.GoTo(screen, screen2, str, false);
        for (EventListener eventListener : this.eventListeners) {
            toEventInitiator(goTo);
            createEventState();
            eventListener.getClass();
        }
        enqueueNavigation(goTo);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0441 A[LOOP:7: B:182:0x043b->B:184:0x0441, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void goToFromQueue(Navigation navigation) {
        RealBackStackEditor edit;
        Iterator it;
        FullScreen fullScreen;
        Object obj;
        boolean z = navigation instanceof Navigation.ScreenNavigation;
        List<EventListener> list = this.eventListeners;
        if (z) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((EventListener) it2.next()).navigationStart(((Navigation.ScreenNavigation) navigation).getTargetScreen(), toEventInitiator(navigation), createEventState());
            }
        }
        boolean areEqual = Intrinsics.areEqual(navigation, Navigation.Reset.INSTANCE);
        CashInstrumentType cashInstrumentType = null;
        ErrorReporter errorReporter = this.errorReporter;
        RealBackStack realBackStack = this.backStack;
        if (areEqual) {
            setFullScreen(null);
            clearSwipe(true, true);
            setOverlay(null);
            edit = realBackStack.edit(errorReporter);
            try {
                edit.clear();
                edit.commit();
                this.tabPresenterStates.clear();
                this.pausedStates.clear();
                Iterator it3 = MapsKt__MapsKt.toMap(this.deferredTearDowns).entrySet().iterator();
                while (it3.hasNext()) {
                    tearDownOrDefer((InternalScreen) ((Map.Entry) it3.next()).getValue(), true);
                }
                emitIfDirty();
                return;
            } finally {
            }
        }
        if (navigation instanceof Navigation.ScreenNavigation.GoTo) {
            Navigation.ScreenNavigation.GoTo goTo = (Navigation.ScreenNavigation.GoTo) navigation;
            String str = goTo.initiatorStateKey;
            Screen screen = goTo.targetScreen;
            if (this.swipeEnabled && (fullScreen = this.fullScreen) != null && this.overlay == null && isTab(fullScreen.screen)) {
                FullScreen fullScreen2 = this.swipe;
                if (fullScreen2 == null || (obj = fullScreen2.screen) == null) {
                    obj = this.defaultSwipeScreen;
                }
                if (Intrinsics.areEqual(screen, obj)) {
                    ensureSwipe(screen);
                    Versioned versioned = this.swipeState.activePage;
                    NavigationModel.Ready.Swipe.Page page = NavigationModel.Ready.Swipe.Page.SidePanel;
                    Versioned update = VersionedKt.update(versioned, page);
                    dispatchSwipeHandlers(page, false);
                    this.swipeState = NavigationModel.Ready.Swipe.copy$default(this.swipeState, null, update, 3);
                    this.dirty = true;
                } else {
                    if (screen instanceof Back) {
                        FullScreen fullScreen3 = this.swipe;
                        if (Intrinsics.areEqual(str, fullScreen3 != null ? fullScreen3.stateKey : null)) {
                            Versioned versioned2 = this.swipeState.activePage;
                            NavigationModel.Ready.Swipe.Page page2 = NavigationModel.Ready.Swipe.Page.MainTabs;
                            Versioned update2 = VersionedKt.update(versioned2, page2);
                            dispatchSwipeHandlers(page2, false);
                            this.swipeState = NavigationModel.Ready.Swipe.copy$default(this.swipeState, null, update2, 3);
                            this.dirty = true;
                        }
                    }
                    FullScreen fullScreen4 = this.swipe;
                    if (fullScreen4 != null && Intrinsics.areEqual(str, fullScreen4.stateKey)) {
                        this.returnToSidePanelOnBack = true;
                    }
                }
            }
            Screen offerOverride = goTo.overridden ? null : offerOverride(screen);
            if (offerOverride != null) {
                Timber.Forest.d(screen + " has been redirected to " + offerOverride + ".", new Object[0]);
                for (EventListener eventListener : list) {
                    toEventInitiator(goTo);
                    createEventState();
                    eventListener.getClass();
                    screen.getClass();
                }
                goToFromQueue(new Navigation.ScreenNavigation.GoTo(offerOverride, goTo.initiatorScreen, str, true));
            } else if (screen instanceof Back) {
                if (!onBack(false)) {
                    this.backPressDispatcher.invoke();
                }
            } else if (screen instanceof Finish) {
                Finish finish = (Finish) screen;
                Object obj2 = finish.result;
                FullScreen fullScreen5 = this.fullScreen;
                OverlayScreen overlayScreen = this.overlay;
                if ((fullScreen5 != null ? fullScreen5.screen : null) != null) {
                    Screen screen2 = fullScreen5.screen;
                    realBackStack.getClass();
                    screen2.getClass();
                }
                if (overlayScreen != null) {
                    if (obj2 != null && fullScreen5 != null) {
                        GenericResultNavigator genericResultNavigator = new GenericResultNavigator();
                        Screen screen3 = fullScreen5.screen;
                        Screen screen4 = overlayScreen.getScreen();
                        screen3.getClass();
                        screen4.getClass();
                        if (!(screen3 instanceof SupportScreens) || (screen3 instanceof SupportScreens.FlowScreens.SupportHomeScreen) || (screen3 instanceof SupportScreens.ContactScreens.ContactSupportMessageScreen)) {
                            if (screen4 instanceof HistoryScreens.SelectPaymentInstrument) {
                                SelectPaymentInstrumentResult selectPaymentInstrumentResult = (SelectPaymentInstrumentResult) obj2;
                                int ordinal = selectPaymentInstrumentResult.getStatus().ordinal();
                                KeysetHandle keysetHandle = this.genericOverlayResultHandler;
                                if (ordinal == 0) {
                                    HistoryScreens.SelectPaymentInstrument selectPaymentInstrument = (HistoryScreens.SelectPaymentInstrument) screen4;
                                    HistoryScreens.SelectPaymentInstrument.NextScreen nextScreen = selectPaymentInstrument.getNextScreen();
                                    int i = nextScreen == null ? -1 : RealGenericOverlayResultHandler$WhenMappings.$EnumSwitchMapping$0[nextScreen.ordinal()];
                                    if (i == 1) {
                                        PaymentManager paymentManager = (PaymentManager) keysetHandle.annotationsMap;
                                        String flowToken = selectPaymentInstrument.getFlowToken();
                                        String paymentToken = selectPaymentInstrument.getPaymentToken();
                                        paymentToken.getClass();
                                        InstrumentSelection instrumentSelection = new InstrumentSelection(selectPaymentInstrumentResult.getToken(), selectPaymentInstrumentResult.getAcceptedAmount(), cashInstrumentType, 12);
                                        flowToken.getClass();
                                        StateFlowKt.emitOrThrow(((RealPaymentManager) paymentManager).paymentActions, new PaymentAction.SendConfirmAction(flowToken, paymentToken, instrumentSelection));
                                    } else if (i != 2) {
                                        if (i == 3) {
                                            if (!(screen3 instanceof PaymentScreens.QuickPay)) {
                                                a$$ExternalSyntheticBUOutline0.m$2(selectPaymentInstrument.getNextScreen(), "Can't handle next screen: ");
                                                return;
                                            }
                                        }
                                    } else if (selectPaymentInstrument.getCustomerPasscodeToken() == null) {
                                        String flowToken2 = selectPaymentInstrument.getFlowToken();
                                        String paymentToken2 = selectPaymentInstrument.getPaymentToken();
                                        paymentToken2.getClass();
                                        String token = selectPaymentInstrumentResult.getToken();
                                        token.getClass();
                                        genericResultNavigator.goTo(new HistoryScreens.PaymentPasscodeDialog(flowToken2, paymentToken2, token, selectPaymentInstrumentResult.getToken(), selectPaymentInstrumentResult.getCardBrand(), selectPaymentInstrumentResult.getSuffix(), selectPaymentInstrumentResult.getAcceptedAmount()));
                                    } else {
                                        String flowToken3 = selectPaymentInstrument.getFlowToken();
                                        String paymentToken3 = selectPaymentInstrument.getPaymentToken();
                                        paymentToken3.getClass();
                                        String token2 = selectPaymentInstrumentResult.getToken();
                                        token2.getClass();
                                        genericResultNavigator.goTo(new HistoryScreens.PaymentPasscodeDialog(flowToken3, paymentToken3, token2, selectPaymentInstrument.getCustomerPasscodeToken(), null, null, selectPaymentInstrumentResult.getAcceptedAmount()));
                                    }
                                } else {
                                    if (ordinal != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                    if (!(screen3 instanceof PaymentScreens.QuickPay)) {
                                        FlowStarter flowStarter = (FlowStarter) keysetHandle.entries;
                                        HistoryScreens.SelectPaymentInstrument selectPaymentInstrument2 = (HistoryScreens.SelectPaymentInstrument) screen4;
                                        String flowToken4 = selectPaymentInstrument2.getFlowToken();
                                        CashInstrumentType linkType = selectPaymentInstrumentResult.getLinkType();
                                        linkType.getClass();
                                        boolean z2 = selectPaymentInstrumentResult.getLinkType() == CashInstrumentType.CREDIT_CARD && selectPaymentInstrumentResult.getSendingToBusiness();
                                        Role paymentRole = selectPaymentInstrument2.getPaymentRole();
                                        paymentRole.getClass();
                                        String paymentToken4 = selectPaymentInstrument2.getPaymentToken();
                                        paymentToken4.getClass();
                                        genericResultNavigator.goTo(((RealFlowStarter) flowStarter).startActivityLinkingFlow(flowToken4, linkType, false, z2, paymentRole, paymentToken4, screen3));
                                    }
                                }
                            }
                            this.overlayResults.add(new NavigationModel.Ready.FullScreenLocation.OverlayResult(overlayScreen.getStateKey(), overlayScreen.getScreen(), obj2));
                        } else {
                            genericResultNavigator.goTo(Back.INSTANCE);
                        }
                    }
                    setOverlay(null);
                } else if (realBackStack.isEmpty()) {
                    errorReporter.report(new NavigatorError.NothingToFinish(finish, fullScreen5 != null ? fullScreen5.screen : null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    goTo(PaymentScreens$HomeScreens$Home.INSTANCE, null, null);
                } else {
                    performFullScreenBack(obj2);
                }
            } else if (screen instanceof OnlyOneOverlayTreatment) {
                handleOverlay(goTo);
            } else {
                handleFullscreen(goTo);
            }
        } else if (navigation instanceof Navigation.ScreenNavigation.AskQuestion) {
            List list2 = list;
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((EventListener) it4.next()).questionStart(((Navigation.ScreenNavigation.AskQuestion) navigation).getScreen(), toEventInitiator(navigation), createEventState());
            }
            edit = realBackStack.edit(errorReporter);
            try {
                String questionId = ((Navigation.ScreenNavigation.AskQuestion) navigation).getQuestionId();
                String initiatorStateKey = ((Navigation.ScreenNavigation.AskQuestion) navigation).getInitiatorStateKey();
                initiatorStateKey.getClass();
                ArrayDeque arrayDeque = edit.entries;
                RealBackStack.Mark mark = new RealBackStack.Mark(questionId, initiatorStateKey);
                ArrayList arrayList = edit.ledger;
                arrayList.getClass();
                arrayList.add(new RealBackStackEditor.PushEntry(mark));
                arrayDeque.addLast(mark);
                edit.commit();
                Navigation.ScreenNavigation.AskQuestion askQuestion = (Navigation.ScreenNavigation.AskQuestion) navigation;
                goToFromQueue(new Navigation.ScreenNavigation.GoTo(askQuestion.getScreen(), askQuestion.getInitiatorScreen(), askQuestion.getInitiatorStateKey(), false));
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    ((EventListener) it5.next()).questionEnd(askQuestion.getScreen(), toEventInitiator(navigation), createEventState());
                }
            } finally {
            }
        } else if (navigation instanceof Navigation.ScreenNavigation.GiveAnswer) {
            Navigation.ScreenNavigation.GiveAnswer giveAnswer = (Navigation.ScreenNavigation.GiveAnswer) navigation;
            List list3 = list;
            Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                ((EventListener) it6.next()).answerStart(toEventInitiator(giveAnswer), createEventState());
            }
            Answer answer = new Answer(giveAnswer.getQuestion(), giveAnswer.getAnswerValue());
            OverlayScreen overlayScreen2 = this.overlay;
            if (overlayScreen2 != null) {
                setOverlay(null);
            }
            edit = realBackStack.edit(errorReporter);
            if (overlayScreen2 != null) {
                try {
                    String questionId2 = giveAnswer.getQuestionId();
                    FullScreen fullScreen6 = this.fullScreen;
                    fullScreen6.getClass();
                    if (edit.popToMarkIfOwnerMatches(questionId2, fullScreen6.stateKey)) {
                        FullScreen fullScreen7 = this.fullScreen;
                        fullScreen7.getClass();
                        CoroutineContext.Element element = fullScreen7.getScope().getCoroutineContext().get(PresenterElement.Key);
                        element.getClass();
                        Presenter.Binding binding = ((PresenterElement) element).binding;
                        if (binding == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            throw null;
                        }
                        binding.sendAnswer(answer);
                        edit.commit();
                        it = list3.iterator();
                        while (it.hasNext()) {
                            ((EventListener) it.next()).answerEnd(toEventInitiator(giveAnswer), createEventState());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            performFullScreenAnswer(edit, giveAnswer.getQuestionId(), answer, giveAnswer.getInitiatorScreen());
            edit.commit();
            it = list3.iterator();
            while (it.hasNext()) {
            }
        } else if (navigation instanceof Navigation.ScreenNavigation.Restore) {
            Screen screen5 = ((Navigation.ScreenNavigation.Restore) navigation).targetScreen;
            if ((screen5 instanceof PaymentScreens$HomeScreens$Home) || (screen5 instanceof Back) || (screen5 instanceof Finish)) {
                a$$ExternalSyntheticBUOutline0.m$3(re$$ExternalSyntheticOutline0.m(screen5, "Cannot restore to a meta screen (", ")"));
                return;
            } else if (screen5 instanceof OnlyOneOverlayTreatment) {
                handleOverlay((Navigation.ScreenNavigation) navigation);
            } else {
                handleFullscreen((Navigation.ScreenNavigation) navigation);
            }
        } else if (!(navigation instanceof Navigation.ScreenNavigation.ResetBefore)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            try {
                realBackStack.edit(errorReporter).resetBeforeMark(((Navigation.ScreenNavigation.ResetBefore) navigation).getQuestionId());
            } finally {
            }
        }
        if (z) {
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                ((EventListener) it7.next()).navigationEnd(((Navigation.ScreenNavigation) navigation).getTargetScreen(), toEventInitiator(navigation), createEventState());
            }
        }
        if (this.goToQueue.isEmpty()) {
            emitIfDirty();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:149:0x00bd, B:151:0x00c5, B:153:0x00cb, B:155:0x00d1, B:156:0x00da, B:43:0x00e2, B:45:0x00e6, B:50:0x015b, B:53:0x0162, B:58:0x016f, B:118:0x00f1, B:119:0x00f5, B:121:0x00fb, B:124:0x010d, B:131:0x0123, B:133:0x0127, B:136:0x0132, B:137:0x0136, B:139:0x013c, B:142:0x014a), top: B:148:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleFullscreen(Navigation.ScreenNavigation screenNavigation) {
        BackStack$ScreenEntry popScreen;
        Screen screen;
        BetterNavigator betterNavigator;
        FullScreen fullScreen;
        Object obj;
        Function0 function0;
        Screen targetScreen = screenNavigation.getTargetScreen();
        Navigation.ScreenNavigation.Restore restore = screenNavigation instanceof Navigation.ScreenNavigation.Restore ? (Navigation.ScreenNavigation.Restore) screenNavigation : null;
        String str = restore != null ? restore.stateKey : null;
        FullScreen fullScreen2 = this.fullScreen;
        OverlayScreen overlayScreen = this.overlay;
        BackStack$ScreenEntry.Overlay overlay = (overlayScreen == null || !isPersistedAsOverlay(overlayScreen.getScreen())) ? null : new BackStack$ScreenEntry.Overlay(overlayScreen.getScreen(), overlayScreen.getStateKey(), savePresenterState(overlayScreen));
        if (overlayScreen != null) {
            setOverlay(null);
        }
        if (!((fullScreen2 != null ? fullScreen2.screen : null) instanceof MoneyTabScreen) || fullScreen2.screen.getClass() != targetScreen.getClass()) {
            if (!Intrinsics.areEqual(fullScreen2 != null ? fullScreen2.screen : null, targetScreen)) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                RealBackStackEditor edit = this.backStack.edit(this.errorReporter);
                RealBackStack realBackStack = edit.view;
                if (fullScreen2 != null) {
                    try {
                        String str2 = fullScreen2.stateKey;
                        Screen screen2 = fullScreen2.screen;
                        if (!(screen2 instanceof NeverInBackStackScreen)) {
                            SavedState savePresenterState = savePresenterState(fullScreen2);
                            if (savePresenterState != null && isTab(screen2)) {
                                this.tabPresenterStates.put(str2, savePresenterState);
                            }
                            edit.push(new BackStack$ScreenEntry(screen2, str2, savePresenterState, overlay));
                        }
                    } catch (Throwable th) {
                        edit.commit();
                        throw th;
                    }
                }
                if (!(targetScreen instanceof SingleInstanceScreen)) {
                    if (targetScreen instanceof RestoringScreen) {
                        ArrayList screenEntries = realBackStack.getScreenEntries();
                        if (!screenEntries.isEmpty()) {
                            Iterator it = screenEntries.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.areEqual(((BackStack$ScreenEntry) it.next()).args, targetScreen)) {
                                    do {
                                        edit.popCurrentFlowsIfEmpty();
                                        popScreen = edit.popScreen();
                                    } while (!Intrinsics.areEqual(popScreen.args, targetScreen));
                                    ref$ObjectRef.element = (popScreen == null && (targetScreen instanceof RestoringScreen)) ? popScreen : null;
                                    if (popScreen == null) {
                                    }
                                    if (r15) {
                                    }
                                    edit.commit();
                                    if (str != null) {
                                    }
                                    if (str == null) {
                                    }
                                    String str3 = str;
                                    fullScreen = (FullScreen) betterNavigator.recoverFromDeferredTearDown(str3);
                                    if (fullScreen == null) {
                                    }
                                    betterNavigator.setFullScreen(fullScreen);
                                    return;
                                }
                            }
                        }
                    }
                    popScreen = null;
                    ref$ObjectRef.element = (popScreen == null && (targetScreen instanceof RestoringScreen)) ? popScreen : null;
                    if (popScreen == null) {
                    }
                    if (r15) {
                    }
                    edit.commit();
                    if (str != null) {
                    }
                    if (str == null) {
                    }
                    String str32 = str;
                    fullScreen = (FullScreen) betterNavigator.recoverFromDeferredTearDown(str32);
                    if (fullScreen == null) {
                    }
                    betterNavigator.setFullScreen(fullScreen);
                    return;
                }
                ArrayList screenEntries2 = realBackStack.getScreenEntries();
                if (!screenEntries2.isEmpty()) {
                    Iterator it2 = screenEntries2.iterator();
                    while (it2.hasNext()) {
                        if (((BackStack$ScreenEntry) it2.next()).args.getClass() == targetScreen.getClass()) {
                            do {
                                edit.popCurrentFlowsIfEmpty();
                                popScreen = edit.popScreen();
                            } while (popScreen.args.getClass() != targetScreen.getClass());
                            ref$ObjectRef.element = (popScreen == null && (targetScreen instanceof RestoringScreen)) ? popScreen : null;
                            boolean z = popScreen == null;
                            String str4 = (z || fullScreen2 == null) ? null : fullScreen2.stateKey;
                            edit.commit();
                            if (str != null) {
                                PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
                                Screen offerOverride = offerOverride(paymentScreens$HomeScreens$Home);
                                Screen screen3 = offerOverride == null ? paymentScreens$HomeScreens$Home : offerOverride;
                                FullScreen fullScreen3 = this.fullScreen;
                                Screen screen4 = fullScreen3 != null ? fullScreen3.screen : null;
                                Screen screen5 = screen3;
                                RealStorage$temp$1 realStorage$temp$1 = new RealStorage$temp$1(1, this, BetterNavigator.class, "isTab", "isTab(Lapp/cash/broadway/screen/Screen;)Z", 0, 8);
                                NavigationPolicy managedAccountHomeRoot = ((RealFamilyProfileManager) this.navigationPolicyResolver.delegate).familyProfile.$$delegate_0.getValue() instanceof FamilyProfile.ManagedAccount ? new NavigationPolicy.ManagedAccountHomeRoot(screen5, CollectionsKt__CollectionsKt.listOf((Object[]) new RealNavigationPolicyResolver$$ExternalSyntheticLambda0[]{new RealNavigationPolicyResolver$$ExternalSyntheticLambda0(0), new RealNavigationPolicyResolver$$ExternalSyntheticLambda0(1), new RealNavigationPolicyResolver$$ExternalSyntheticLambda0(2), new RealNavigationPolicyResolver$$ExternalSyntheticLambda0(3)})) : new NavigationPolicy.StandardTabs(screen5);
                                betterNavigator = this;
                                screen = targetScreen;
                                this.backStackManager.onNewScreen(this.backStack, screen, screen4, realStorage$temp$1, screen5, managedAccountHomeRoot, this.identifier);
                            } else {
                                screen = targetScreen;
                                betterNavigator = this;
                            }
                            if (str == null) {
                                Iterator it3 = betterNavigator.tabs.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it3.next();
                                        if (((Boolean) ((TabInfo) obj).screenMatcher.invoke(screen)).booleanValue()) {
                                            break;
                                        }
                                    }
                                }
                                TabInfo tabInfo = (TabInfo) obj;
                                str = tabInfo != null ? tabInfo.identifier.name() : null;
                                if (str == null) {
                                    BackStack$ScreenEntry backStack$ScreenEntry = (BackStack$ScreenEntry) ref$ObjectRef.element;
                                    str = backStack$ScreenEntry != null ? backStack$ScreenEntry.stateKey : null;
                                    if (str == null) {
                                        str = betterNavigator.generateStateKey();
                                    }
                                }
                            }
                            String str322 = str;
                            fullScreen = (FullScreen) betterNavigator.recoverFromDeferredTearDown(str322);
                            if (fullScreen == null) {
                                ViewTreeObservers$$ExternalSyntheticLambda2 viewTreeObservers$$ExternalSyntheticLambda2 = new ViewTreeObservers$$ExternalSyntheticLambda2(betterNavigator, screen, str322, screenNavigation, ref$ObjectRef, 1);
                                Navigation.ScreenNavigation.GoTo goTo = screenNavigation instanceof Navigation.ScreenNavigation.GoTo ? (Navigation.ScreenNavigation.GoTo) screenNavigation : null;
                                fullScreen = new FullScreen(str322, screen, viewTreeObservers$$ExternalSyntheticLambda2, z, str4, null, goTo != null ? goTo.initiatorScreen : null);
                            }
                            betterNavigator.setFullScreen(fullScreen);
                            return;
                        }
                    }
                }
                popScreen = null;
                ref$ObjectRef.element = (popScreen == null && (targetScreen instanceof RestoringScreen)) ? popScreen : null;
                if (popScreen == null) {
                }
                if (z) {
                }
                edit.commit();
                if (str != null) {
                }
                if (str == null) {
                }
                String str3222 = str;
                fullScreen = (FullScreen) betterNavigator.recoverFromDeferredTearDown(str3222);
                if (fullScreen == null) {
                }
                betterNavigator.setFullScreen(fullScreen);
                return;
                edit.commit();
                throw th;
            }
        }
        Timber.Forest.d("%s@%x: %s not swapping to %s", "BetterNavigator", Integer.valueOf(System.identityHashCode(this)), fullScreen2.screen, targetScreen);
        PresenterElement presenterElement = (PresenterElement) fullScreen2.getScope().getCoroutineContext().get(PresenterElement.Key);
        if (presenterElement != null) {
            Presenter.Binding binding = presenterElement.binding;
            if (binding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
            Presenter.RenavigationBinding renavigationBinding = binding instanceof Presenter.RenavigationBinding ? (Presenter.RenavigationBinding) binding : null;
            if (renavigationBinding == null || (function0 = ((MoleculePresenterKt$asPresenter$1$start$2) renavigationBinding).$renavigationDispatcher.handler) == null) {
                return;
            }
            function0.invoke();
        }
    }

    public final void handleOverlay(Navigation.ScreenNavigation screenNavigation) {
        BetterNavigator betterNavigator;
        Screen targetScreen = screenNavigation.getTargetScreen();
        Navigation.ScreenNavigation.Restore restore = screenNavigation instanceof Navigation.ScreenNavigation.Restore ? (Navigation.ScreenNavigation.Restore) screenNavigation : null;
        String str = restore != null ? restore.stateKey : null;
        OverlayScreen overlayScreen = this.overlay;
        if (Intrinsics.areEqual(overlayScreen != null ? overlayScreen.getScreen() : null, targetScreen)) {
            Timber.Forest.d("%s@%x: %s not swapping to %s", "BetterNavigator", Integer.valueOf(System.identityHashCode(this)), overlayScreen.getScreen(), targetScreen);
            return;
        }
        if (str == null) {
            str = generateStateKey();
        }
        String str2 = str;
        OverlayScreen overlayScreen2 = (OverlayScreen) recoverFromDeferredTearDown(str2);
        if (overlayScreen2 == null) {
            betterNavigator = this;
            overlayScreen2 = new OverlayScreen(str2, targetScreen, new l2$$ExternalSyntheticLambda7(betterNavigator, targetScreen, str2, screenNavigation, 23));
        } else {
            betterNavigator = this;
        }
        betterNavigator.setOverlay(overlayScreen2);
    }

    public final boolean isPaused(String str) {
        CoroutineScope coroutineScope;
        CoroutineContext coroutineContext;
        PresenterElement presenterElement;
        InternalScreen internalScreen = (InternalScreen) this.deferredTearDowns.get(str);
        return ((internalScreen == null || (coroutineScope = internalScreen.startedScope) == null || (coroutineContext = coroutineScope.getCoroutineContext()) == null || (presenterElement = (PresenterElement) coroutineContext.get(PresenterElement.Key)) == null) ? null : presenterElement.state) == PresenterElement.State.TransitioningOut;
    }

    public final boolean isPersistedAsOverlay(Screen screen) {
        Set set = this.experimentalPersistedOverlayScreens;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((KClass) it.next()).isInstance(screen)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTab(Screen screen) {
        ArrayList arrayList = this.tabs;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((TabInfo) it.next()).screenMatcher.invoke(screen)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final Screen offerOverride(Screen screen) {
        FullScreen fullScreen = this.fullScreen;
        Screen screen2 = fullScreen != null ? fullScreen.screen : null;
        OverlayScreen overlayScreen = this.overlay;
        ScreenOverrideRule.State state = new ScreenOverrideRule.State(screen2, overlayScreen != null ? overlayScreen.getScreen() : null);
        Iterator it = this.screenOverrideRules.iterator();
        while (it.hasNext()) {
            Screen maybeOverride = ((ScreenOverrideRule) it.next()).maybeOverride(state, screen);
            if (maybeOverride != null) {
                return maybeOverride;
            }
        }
        return null;
    }

    public final boolean onBack(boolean z) {
        OverlayScreen overlayScreen = this.overlay;
        MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0 = this.uiOnBack;
        if (overlayScreen != null) {
            if (!z || !((Boolean) mainContainerDelegate$$ExternalSyntheticLambda0.invoke(Boolean.TRUE)).booleanValue()) {
                setOverlay(null);
                return true;
            }
        } else if (this.fullScreen == null || !z || !((Boolean) mainContainerDelegate$$ExternalSyntheticLambda0.invoke(Boolean.FALSE)).booleanValue()) {
            if (this.backStack.isEmpty()) {
                return false;
            }
            performFullScreenBack(null);
            return true;
        }
        return true;
    }

    public final void performFullScreenAnswer(RealBackStackEditor realBackStackEditor, String str, Answer answer, Screen screen) {
        BackStack$ScreenEntry backStack$ScreenEntry;
        FullScreen fullScreen = this.fullScreen;
        fullScreen.getClass();
        realBackStackEditor.popCurrentFlowsIfEmpty();
        ArrayDeque arrayDeque = realBackStackEditor.entries;
        str.getClass();
        ErrorReporter errorReporter = realBackStackEditor.errorReporter;
        int i = 0;
        ConnectionPool connectionPool = new ConnectionPool(21, false);
        try {
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                BackStack$Entry backStack$Entry = (BackStack$Entry) it.next();
                if ((backStack$Entry instanceof RealBackStack.Mark) && Intrinsics.areEqual(((RealBackStack.Mark) backStack$Entry).getId(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                realBackStackEditor.addBackstackMetadata(connectionPool);
                throw new IllegalArgumentException(("A mark with ID '" + str + "' was not found in the stack: " + realBackStackEditor).toString());
            }
            Iterator it2 = arrayDeque.subList(i + 1, arrayDeque.size).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    backStack$ScreenEntry = null;
                    break;
                }
                BackStack$Entry backStack$Entry2 = (BackStack$Entry) it2.next();
                backStack$ScreenEntry = backStack$Entry2 instanceof BackStack$ScreenEntry ? (BackStack$ScreenEntry) backStack$Entry2 : null;
                if (backStack$ScreenEntry != null) {
                    break;
                }
            }
            if (backStack$ScreenEntry == null) {
                realBackStackEditor.addBackstackMetadata(connectionPool);
                throw new IllegalArgumentException(("A mark with ID '" + str + "' was found, but there was no screen associated with the mark on the stack: " + realBackStackEditor).toString());
            }
            BackStack$ScreenEntry.Overlay overlay = backStack$ScreenEntry.overlay;
            String str2 = backStack$ScreenEntry.stateKey;
            Object obj = arrayDeque.get(i);
            obj.getClass();
            String owner = ((RealBackStack.Mark) obj).getOwner();
            if (!Intrinsics.areEqual(owner, str2)) {
                if (!Intrinsics.areEqual(owner, overlay != null ? overlay.getStateKey() : null)) {
                    realBackStackEditor.addBackstackMetadata(connectionPool);
                    throw new IllegalArgumentException(("A mark with ID '" + str + "' was found, but the owner was not found on the stack: " + realBackStackEditor).toString());
                }
            }
            List subList = arrayDeque.subList(i, arrayDeque.size);
            ArrayList arrayList = realBackStackEditor.ledger;
            subList.getClass();
            arrayList.getClass();
            if (!subList.isEmpty()) {
                List list = CollectionsKt.toList(subList);
                list.getClass();
                arrayList.add(new RealBackStackEditor.PopToMarkAndReturnOwner(str, list));
            }
            subList.clear();
            Screen screen2 = backStack$ScreenEntry.args;
            SavedState savedState = backStack$ScreenEntry.presenterState;
            if (str2 == null) {
                str2 = generateStateKey();
            }
            String str3 = str2;
            setFullScreen(new FullScreen(str3, screen2, new ta$$ExternalSyntheticLambda1(this, screen2, str3, overlay == null ? answer : null, savedState, 10), true, fullScreen.stateKey, null, screen));
            if (overlay != null) {
                setOverlay(new OverlayScreen(overlay.getStateKey(), overlay.getArgs(), new CopyCodeKt$$ExternalSyntheticLambda4(29, this, overlay, answer)));
            }
        } catch (Throwable th) {
            Map map = (Map) connectionPool.delegate;
            if (!map.isEmpty()) {
                errorReporter.annotateException(th, map);
            }
            throw th;
        }
    }

    public final void performFullScreenBack(Object obj) {
        FullScreen fullScreen = this.fullScreen;
        fullScreen.getClass();
        Screen screen = fullScreen.screen;
        RealBackStackEditor edit = this.backStack.edit(this.errorReporter);
        try {
            edit.popCurrentFlowsIfEmpty();
            BackStack$ScreenEntry popScreen = edit.popScreen();
            edit.commit();
            Screen screen2 = popScreen.args;
            SavedState savedState = popScreen.presenterState;
            screen.getClass();
            screen2.getClass();
            if (screen instanceof PaymentSessionScreen) {
                RealPaymentListener realPaymentListener = (RealPaymentListener) this.backStackManager.baseUrl;
                JobKt.launch$default(realPaymentListener.coroutineScope, null, null, new RealPaymentListener$onPaymentEnded$1(realPaymentListener, null, 0), 3);
            }
            String str = popScreen.stateKey;
            if (str == null) {
                str = generateStateKey();
            }
            String str2 = str;
            FullScreen fullScreen2 = (FullScreen) recoverFromDeferredTearDown(str2);
            if (fullScreen2 == null) {
                fullScreen2 = new FullScreen(str2, screen2, new l2$$ExternalSyntheticLambda7(this, screen2, str2, savedState, 22), true, fullScreen.stateKey, obj, null);
            }
            setFullScreen(fullScreen2);
            BackStack$ScreenEntry.Overlay overlay = popScreen.overlay;
            if (overlay != null) {
                OverlayScreen overlayScreen = (OverlayScreen) recoverFromDeferredTearDown(overlay.getStateKey());
                if (overlayScreen == null) {
                    overlayScreen = new OverlayScreen(overlay.getStateKey(), overlay.getArgs(), new ArcadeModal2Kt$$ExternalSyntheticLambda2(9, this, overlay));
                }
                setOverlay(overlayScreen);
            }
        } catch (Throwable th) {
            edit.commit();
            throw th;
        }
    }

    public final InternalScreen recoverFromDeferredTearDown(String str) {
        CoroutineContext coroutineContext;
        PresenterElement presenterElement;
        LinkedHashMap linkedHashMap = this.deferredTearDowns;
        InternalScreen internalScreen = (InternalScreen) linkedHashMap.get(str);
        if (internalScreen == null) {
            return null;
        }
        CoroutineScope coroutineScope = internalScreen.startedScope;
        if (coroutineScope != null && (coroutineContext = coroutineScope.getCoroutineContext()) != null && (presenterElement = (PresenterElement) coroutineContext.get(PresenterElement.Key)) != null) {
            presenterElement.setState(PresenterElement.State.Active);
        }
        linkedHashMap.remove(str);
        return internalScreen;
    }

    public final SavedState savePresenterState(InternalScreen internalScreen) {
        CoroutineContext coroutineContext;
        PresenterElement presenterElement;
        CoroutineScope coroutineScope = internalScreen.startedScope;
        if (coroutineScope == null || (coroutineContext = coroutineScope.getCoroutineContext()) == null || (presenterElement = (PresenterElement) coroutineContext.get(PresenterElement.Key)) == null) {
            return null;
        }
        return presenterElement.presenter.saveState();
    }

    public final void setFullScreen(FullScreen fullScreen) {
        String str;
        if (Intrinsics.areEqual(this.fullScreen, fullScreen)) {
            return;
        }
        FullScreen fullScreen2 = this.fullScreen;
        if (fullScreen2 != null) {
            tearDownOrDefer(fullScreen2, false);
        }
        this.overlayResults.clear();
        FullScreen fullScreen3 = this.fullScreen;
        if (fullScreen3 != null && (str = fullScreen3.stateKey) != null) {
        }
        this.fullScreen = fullScreen;
        if (fullScreen == null || !isTab(fullScreen.screen)) {
            clearSwipe(false, false);
        }
        this.dirty = true;
    }

    public final void setOverlay(OverlayScreen overlayScreen) {
        if (Intrinsics.areEqual(this.overlay, overlayScreen)) {
            return;
        }
        OverlayScreen overlayScreen2 = this.overlay;
        if (overlayScreen2 != null) {
            tearDownOrDefer(overlayScreen2, false);
            if (overlayScreen == null) {
                ArrayList arrayList = this.overlayResults;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((NavigationModel.Ready.FullScreenLocation.OverlayResult) it.next()).getStateKey(), overlayScreen2.getStateKey())) {
                            break;
                        }
                    }
                }
                arrayList.add(new NavigationModel.Ready.FullScreenLocation.OverlayResult(overlayScreen2.getStateKey(), overlayScreen2.getScreen(), null));
            }
        }
        this.overlay = overlayScreen;
        this.dirty = true;
    }

    public final void setReadyToNavigate(boolean z) {
        if (this.readyToNavigate != z) {
            Continuation continuation = null;
            if (z) {
                StateFlowKt.emitOrThrow(this.delayedBackPressed, Boolean.FALSE);
                if (this.queueCollectionJob != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return;
                }
                StandaloneCoroutine launch$default = JobKt.launch$default(this.scope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass5(this, continuation, 2), 1);
                Job job = this.queueCollectionJob;
                if (job != null) {
                    job.cancel(null);
                }
                this.queueCollectionJob = launch$default;
            } else {
                Job job2 = this.queueCollectionJob;
                if (job2 != null) {
                    job2.cancel(null);
                }
                this.queueCollectionJob = null;
            }
        }
        this.readyToNavigate = z;
    }

    public final ContextScope startPresenter(Screen screen, String str, Answer answer, SavedState savedState) {
        Pair pair;
        ScreenNavigator screenNavigator = new ScreenNavigator(this, screen, str);
        Broadway broadway = this.broadway;
        Iterator it = broadway.presenterFactories.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            PresenterFactory presenterFactory = (PresenterFactory) it.next();
            TimeMark markNow = broadway.timeSource.markNow();
            Presenter create = presenterFactory.create(screen, screenNavigator);
            if (create != null) {
                pair = new Pair(create, new Duration(markNow.mo4160elapsedNowUwyO8pc()));
            }
        } while (pair == null);
        SupervisorJobImpl supervisorJobImpl = new SupervisorJobImpl(JobKt.getJob(this.scope.getCoroutineContext()));
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        CoroutineContext plus = CoroutineContext.Element.DefaultImpls.plus(supervisorJobImpl, MainDispatcherLoader.dispatcher.immediate);
        if (pair == null) {
            return JobKt.CoroutineScope(plus);
        }
        Object obj = pair.first;
        obj.getClass();
        Presenter presenter = (Presenter) obj;
        PresenterElement presenterElement = new PresenterElement(presenter);
        if (savedState == null) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            savedState = new SavedState(emptyMap);
        }
        ContextScope CoroutineScope = JobKt.CoroutineScope(plus.plus(presenterElement));
        long nanoTime = System.nanoTime();
        presenterElement.binding = presenter.start(CoroutineScope, this.lifecycleOwner, answer, savedState);
        presenterElement.updateLifecycleState();
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS);
        Iterator it2 = this.eventListeners.iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).mo3506presenterStart5qebJ5I(screen, ((Duration) pair.second).rawValue, duration);
        }
        return CoroutineScope;
    }

    public final SwipeContext.Source tabId(Screen screen) {
        Object obj;
        Iterator it = this.tabs.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((TabInfo) obj).screenMatcher.invoke(screen)).booleanValue()) {
                break;
            }
        }
        TabInfo tabInfo = (TabInfo) obj;
        if (tabInfo == null) {
            return null;
        }
        int ordinal = tabInfo.identifier.ordinal();
        if (ordinal == 0) {
            return SwipeContext.Source.Activity;
        }
        if (ordinal == 1) {
            return SwipeContext.Source.Money;
        }
        if (ordinal == 2) {
            return SwipeContext.Source.Moneybot;
        }
        if (ordinal == 3) {
            return SwipeContext.Source.Payment;
        }
        if (ordinal == 4) {
            return SwipeContext.Source.TreehouseActivity;
        }
        if (ordinal == 5) {
            return SwipeContext.Source.Local;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void tearDownOrDefer(InternalScreen internalScreen, boolean z) {
        CoroutineContext coroutineContext;
        CoroutineScope coroutineScope = internalScreen.startedScope;
        Path.Companion companion = PresenterElement.Key;
        Continuation continuation = null;
        PresenterElement presenterElement = (coroutineScope == null || (coroutineContext = coroutineScope.getCoroutineContext()) == null) ? null : (PresenterElement) coroutineContext.get(companion);
        LinkedHashMap linkedHashMap = this.deferredTearDowns;
        if (!z && this.uiStateKeys.contains(internalScreen.getStateKey())) {
            linkedHashMap.put(internalScreen.getStateKey(), internalScreen);
            if (presenterElement != null) {
                presenterElement.setState(PresenterElement.State.TransitioningOutStaged);
            }
            CoroutineScope coroutineScope2 = internalScreen.startedScope;
            if (coroutineScope2 != null) {
                JobKt.launch$default(coroutineScope2, this.phasedTearDownContext, null, new CashApp$onCreate$1(presenterElement, continuation, 1), 2);
                return;
            }
            return;
        }
        if (presenterElement != null) {
            presenterElement.setState(PresenterElement.State.Destroyed);
        }
        CoroutineScope coroutineScope3 = internalScreen.startedScope;
        if (coroutineScope3 != null) {
            JobKt.cancel(coroutineScope3, (CancellationException) null);
            if (coroutineScope3.getCoroutineContext().get(companion) != null) {
                for (EventListener eventListener : this.eventListeners) {
                    Screen screen = internalScreen.getScreen();
                    eventListener.getClass();
                    screen.getClass();
                }
            }
        }
        internalScreen.startedScope = null;
        linkedHashMap.remove(internalScreen.getStateKey());
    }
}
