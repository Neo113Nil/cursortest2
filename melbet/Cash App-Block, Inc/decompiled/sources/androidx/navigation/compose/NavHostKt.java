package androidx.navigation.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableObjectFloatMap;
import androidx.collection.ObjectFloatMapKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigation.Navigator;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.internal.NavControllerImpl;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.ui.widget.AvatarDrawables;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class NavHostKt {
    public static final void NavHost(final NavHostController navHostController, final NavGraph navGraph, final Modifier modifier, final Alignment alignment, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        final Alignment alignment2;
        final Function1 function15;
        Function1 function16;
        final ComposeNavigator composeNavigator;
        MutableState mutableState;
        GapComposer gapComposer;
        NavigatorProvider navigatorProvider;
        int i3;
        NavigatorProvider navigatorProvider2;
        MutableObjectFloatMap mutableObjectFloatMap;
        NavBackStackEntry navBackStackEntry;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function17;
        SeekableTransitionState seekableTransitionState;
        Transition transition;
        State state;
        MutableObjectFloatMap mutableObjectFloatMap2;
        ComposeNavigator composeNavigator2;
        MutableState mutableState2;
        Object obj;
        Object obj2;
        DialogNavigator dialogNavigator;
        SeekableTransitionState seekableTransitionState2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1964664536);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(navGraph) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            alignment2 = alignment;
            i2 |= gapComposer2.changed(alignment2) ? 2048 : 1024;
        } else {
            alignment2 = alignment;
        }
        if ((i & 24576) == 0) {
            function15 = function1;
            i2 |= gapComposer2.changedInstance(function15) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function15 = function1;
        }
        if ((196608 & i) == 0) {
            function16 = function12;
            i2 |= gapComposer2.changedInstance(function16) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function16 = function12;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer2.changedInstance(function13) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer2.changedInstance(function14) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) == 38347922 && gapComposer2.getSkipping()) {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        } else {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer2.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer2);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            navHostController.setViewModelStore(current.getViewModelStore());
            NavControllerImpl navControllerImpl = navHostController.impl;
            navGraph.getClass();
            navControllerImpl.getClass();
            NavigatorProvider navigatorProvider3 = navControllerImpl._navigatorProvider;
            navControllerImpl.setGraph$navigation_runtime_release(navGraph, null);
            Navigator navigator = navigatorProvider3.getNavigator("composable");
            ComposeNavigator composeNavigator3 = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
            if (composeNavigator3 == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 2;
                    final Function1 function18 = function16;
                    endRestartGroup.block = new Function2() { // from class: androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i5 = i4;
                            int i6 = i;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    NavHostKt.NavHost(navHostController, navGraph, modifier2, alignment2, function15, function18, function13, function14, (Composer) obj3, Updater.updateChangedFlags(i6 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    NavHostKt.NavHost(navHostController, navGraph, modifier2, alignment2, function15, function18, function13, function14, (Composer) obj3, Updater.updateChangedFlags(i6 | 1));
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    NavHostKt.NavHost(navHostController, navGraph, modifier2, alignment2, function15, function18, function13, function14, (Composer) obj3, Updater.updateChangedFlags(i6 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            MutableState collectAsState = Updater.collectAsState(composeNavigator3.getState().backStack, null, gapComposer2, 1);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Object obj3 = rememberedValue;
            if (rememberedValue == neverEqualPolicy2) {
                obj3 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer2);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) obj3;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj4 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy2) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(mutableStateOf$default);
                obj4 = mutableStateOf$default;
            }
            final MutableState mutableState3 = (MutableState) obj4;
            int i5 = 0;
            boolean z2 = ((List) collectAsState.getValue()).size() > 1;
            boolean changed = gapComposer2.changed(collectAsState) | gapComposer2.changedInstance(composeNavigator3);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy2) {
                ComposeNavigator composeNavigator4 = composeNavigator3;
                rememberedValue3 = new RealImageLoader$execute$result$1(composeNavigator4, collectAsState, mutableFloatState, mutableState3, (Continuation) null, 9);
                composeNavigator = composeNavigator4;
                mutableState = collectAsState;
                gapComposer2.updateRememberedValue(rememberedValue3);
            } else {
                ComposeNavigator composeNavigator5 = composeNavigator3;
                mutableState = collectAsState;
                composeNavigator = composeNavigator5;
            }
            AvatarDrawables.PredictiveBackHandler(z2, (Function2) rememberedValue3, gapComposer2, 0);
            boolean changedInstance = gapComposer2.changedInstance(navHostController) | gapComposer2.changedInstance(lifecycleOwner);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Object obj5 = rememberedValue4;
            if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                Navigator$$ExternalSyntheticLambda0 navigator$$ExternalSyntheticLambda0 = new Navigator$$ExternalSyntheticLambda0(26, navHostController, lifecycleOwner);
                gapComposer2.updateRememberedValue(navigator$$ExternalSyntheticLambda0);
                obj5 = navigator$$ExternalSyntheticLambda0;
            }
            Updater.DisposableEffect(lifecycleOwner, (Function1) obj5, gapComposer2);
            SaveableStateHolderImpl rememberSaveableStateHolder = SaverKt.rememberSaveableStateHolder(gapComposer2);
            ReadonlyStateFlow readonlyStateFlow = navControllerImpl.visibleEntries;
            DialogNavigator dialogNavigator2 = null;
            MutableState collectAsState2 = Updater.collectAsState(readonlyStateFlow, null, gapComposer2, 1);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj6 = rememberedValue5;
            if (rememberedValue5 == neverEqualPolicy2) {
                DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(collectAsState2, i5));
                gapComposer2.updateRememberedValue(derivedStateOf);
                obj6 = derivedStateOf;
            }
            State state2 = (State) obj6;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.lastOrNull((List) state2.getValue());
            Object rememberedValue6 = gapComposer2.rememberedValue();
            Object obj7 = rememberedValue6;
            if (rememberedValue6 == neverEqualPolicy2) {
                int i6 = ObjectFloatMapKt.$r8$clinit;
                MutableObjectFloatMap mutableObjectFloatMap3 = new MutableObjectFloatMap(6);
                gapComposer2.updateRememberedValue(mutableObjectFloatMap3);
                obj7 = mutableObjectFloatMap3;
            }
            MutableObjectFloatMap mutableObjectFloatMap4 = (MutableObjectFloatMap) obj7;
            if (navBackStackEntry2 != null) {
                gapComposer2.startReplaceGroup(-1797250687);
                boolean changedInstance2 = gapComposer2.changedInstance(composeNavigator) | ((((3670016 & i2) ^ 1572864) > 1048576 && gapComposer2.changed(function13)) || (i2 & 1572864) == 1048576) | ((57344 & i2) == 16384);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue7 == neverEqualPolicy2) {
                    final int i7 = 0;
                    i3 = i2;
                    navigatorProvider2 = navigatorProvider3;
                    mutableObjectFloatMap = mutableObjectFloatMap4;
                    navBackStackEntry = navBackStackEntry2;
                    z = false;
                    neverEqualPolicy = neverEqualPolicy2;
                    Function1 function19 = new Function1() { // from class: androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i8 = i7;
                            MutableState mutableState4 = mutableState3;
                            Function1 function110 = function1;
                            Function1 function111 = function13;
                            ComposeNavigator composeNavigator6 = composeNavigator;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj8;
                            switch (i8) {
                                case 0:
                                    NavDestination navDestination = ((NavBackStackEntry) animatedContentTransitionScopeImpl.getTargetState()).destination;
                                    navDestination.getClass();
                                    ComposeNavigator.Destination destination = (ComposeNavigator.Destination) navDestination;
                                    if (((Boolean) composeNavigator6.isPop.getValue()).booleanValue() || ((Boolean) mutableState4.getValue()).booleanValue()) {
                                        int i9 = NavDestination.$r8$clinit;
                                        for (NavDestination navDestination2 : NavDestination.Companion.getHierarchy(destination)) {
                                        }
                                        return (EnterTransitionImpl) function111.invoke(animatedContentTransitionScopeImpl);
                                    }
                                    int i10 = NavDestination.$r8$clinit;
                                    for (NavDestination navDestination3 : NavDestination.Companion.getHierarchy(destination)) {
                                    }
                                    return (EnterTransitionImpl) function110.invoke(animatedContentTransitionScopeImpl);
                                default:
                                    NavDestination navDestination4 = ((NavBackStackEntry) animatedContentTransitionScopeImpl.getInitialState()).destination;
                                    navDestination4.getClass();
                                    ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) navDestination4;
                                    if (((Boolean) composeNavigator6.isPop.getValue()).booleanValue() || ((Boolean) mutableState4.getValue()).booleanValue()) {
                                        int i11 = NavDestination.$r8$clinit;
                                        for (NavDestination navDestination5 : NavDestination.Companion.getHierarchy(destination2)) {
                                        }
                                        return (ExitTransitionImpl) function111.invoke(animatedContentTransitionScopeImpl);
                                    }
                                    int i12 = NavDestination.$r8$clinit;
                                    for (NavDestination navDestination6 : NavDestination.Companion.getHierarchy(destination2)) {
                                    }
                                    return (ExitTransitionImpl) function110.invoke(animatedContentTransitionScopeImpl);
                            }
                        }
                    };
                    gapComposer2.updateRememberedValue(function19);
                    rememberedValue7 = function19;
                } else {
                    i3 = i2;
                    navigatorProvider2 = navigatorProvider3;
                    mutableObjectFloatMap = mutableObjectFloatMap4;
                    navBackStackEntry = navBackStackEntry2;
                    z = false;
                    neverEqualPolicy = neverEqualPolicy2;
                }
                Function1 function110 = (Function1) rememberedValue7;
                boolean changedInstance3 = gapComposer2.changedInstance(composeNavigator) | (((((29360128 & i3) ^ 12582912) <= 8388608 || !gapComposer2.changed(function14)) && (i3 & 12582912) != 8388608) ? z : true) | ((458752 & i3) == 131072 ? true : z);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                    final int i8 = 1;
                    function17 = function110;
                    Function1 function111 = new Function1() { // from class: androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i82 = i8;
                            MutableState mutableState4 = mutableState3;
                            Function1 function1102 = function12;
                            Function1 function1112 = function14;
                            ComposeNavigator composeNavigator6 = composeNavigator;
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj8;
                            switch (i82) {
                                case 0:
                                    NavDestination navDestination = ((NavBackStackEntry) animatedContentTransitionScopeImpl.getTargetState()).destination;
                                    navDestination.getClass();
                                    ComposeNavigator.Destination destination = (ComposeNavigator.Destination) navDestination;
                                    if (((Boolean) composeNavigator6.isPop.getValue()).booleanValue() || ((Boolean) mutableState4.getValue()).booleanValue()) {
                                        int i9 = NavDestination.$r8$clinit;
                                        for (NavDestination navDestination2 : NavDestination.Companion.getHierarchy(destination)) {
                                        }
                                        return (EnterTransitionImpl) function1112.invoke(animatedContentTransitionScopeImpl);
                                    }
                                    int i10 = NavDestination.$r8$clinit;
                                    for (NavDestination navDestination3 : NavDestination.Companion.getHierarchy(destination)) {
                                    }
                                    return (EnterTransitionImpl) function1102.invoke(animatedContentTransitionScopeImpl);
                                default:
                                    NavDestination navDestination4 = ((NavBackStackEntry) animatedContentTransitionScopeImpl.getInitialState()).destination;
                                    navDestination4.getClass();
                                    ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) navDestination4;
                                    if (((Boolean) composeNavigator6.isPop.getValue()).booleanValue() || ((Boolean) mutableState4.getValue()).booleanValue()) {
                                        int i11 = NavDestination.$r8$clinit;
                                        for (NavDestination navDestination5 : NavDestination.Companion.getHierarchy(destination2)) {
                                        }
                                        return (ExitTransitionImpl) function1112.invoke(animatedContentTransitionScopeImpl);
                                    }
                                    int i12 = NavDestination.$r8$clinit;
                                    for (NavDestination navDestination6 : NavDestination.Companion.getHierarchy(destination2)) {
                                    }
                                    return (ExitTransitionImpl) function1102.invoke(animatedContentTransitionScopeImpl);
                            }
                        }
                    };
                    gapComposer2.updateRememberedValue(function111);
                    rememberedValue8 = function111;
                } else {
                    function17 = function110;
                }
                Function1 function112 = (Function1) rememberedValue8;
                boolean z3 = (234881024 & i3) == 67108864 ? true : z;
                Object rememberedValue9 = gapComposer2.rememberedValue();
                Object obj8 = rememberedValue9;
                if (z3 || rememberedValue9 == neverEqualPolicy) {
                    Navigation$$ExternalSyntheticLambda1 navigation$$ExternalSyntheticLambda1 = new Navigation$$ExternalSyntheticLambda1(23);
                    gapComposer2.updateRememberedValue(navigation$$ExternalSyntheticLambda1);
                    obj8 = navigation$$ExternalSyntheticLambda1;
                }
                Function1 function113 = (Function1) obj8;
                Boolean bool = Boolean.TRUE;
                boolean changedInstance4 = gapComposer2.changedInstance(composeNavigator);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                int i9 = 25;
                Object obj9 = rememberedValue10;
                if (changedInstance4 || rememberedValue10 == neverEqualPolicy) {
                    Navigator$$ExternalSyntheticLambda0 navigator$$ExternalSyntheticLambda02 = new Navigator$$ExternalSyntheticLambda0(i9, state2, composeNavigator);
                    gapComposer2.updateRememberedValue(navigator$$ExternalSyntheticLambda02);
                    obj9 = navigator$$ExternalSyntheticLambda02;
                }
                Updater.DisposableEffect(bool, (Function1) obj9, gapComposer2);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                Object obj10 = rememberedValue11;
                if (rememberedValue11 == neverEqualPolicy) {
                    SeekableTransitionState seekableTransitionState3 = new SeekableTransitionState(navBackStackEntry);
                    gapComposer2.updateRememberedValue(seekableTransitionState3);
                    obj10 = seekableTransitionState3;
                }
                SeekableTransitionState seekableTransitionState4 = (SeekableTransitionState) obj10;
                Transition rememberTransition = AnimatableKt.rememberTransition(seekableTransitionState4, "entry", gapComposer2, 56, 0);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    gapComposer2.startReplaceGroup(-1795016672);
                    Float valueOf = Float.valueOf(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                    boolean changed2 = gapComposer2.changed(mutableState) | gapComposer2.changedInstance(seekableTransitionState4);
                    Object rememberedValue12 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue12 == neverEqualPolicy) {
                        dialogNavigator = null;
                        rememberedValue12 = new SliderState$drag$2(seekableTransitionState4, mutableState, mutableFloatState, false ? 1 : 0, 6);
                        seekableTransitionState2 = seekableTransitionState4;
                        gapComposer2.updateRememberedValue(rememberedValue12);
                    } else {
                        seekableTransitionState2 = seekableTransitionState4;
                        dialogNavigator = null;
                    }
                    Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue12);
                    gapComposer2.end(false);
                    transition = rememberTransition;
                    seekableTransitionState = seekableTransitionState2;
                    dialogNavigator2 = dialogNavigator;
                } else {
                    Continuation continuation = null;
                    gapComposer2.startReplaceGroup(-1794598265);
                    boolean changedInstance5 = gapComposer2.changedInstance(seekableTransitionState4) | gapComposer2.changedInstance(navBackStackEntry) | gapComposer2.changed(rememberTransition);
                    Object rememberedValue13 = gapComposer2.rememberedValue();
                    if (changedInstance5 || rememberedValue13 == neverEqualPolicy) {
                        seekableTransitionState = seekableTransitionState4;
                        rememberedValue13 = new FlowExtKt$simpleScan$1(seekableTransitionState, navBackStackEntry, rememberTransition, continuation, 24);
                        transition = rememberTransition;
                        dialogNavigator2 = null;
                        gapComposer2.updateRememberedValue(rememberedValue13);
                    } else {
                        transition = rememberTransition;
                        seekableTransitionState = seekableTransitionState4;
                        dialogNavigator2 = null;
                    }
                    Updater.LaunchedEffect(gapComposer2, navBackStackEntry, (Function2) rememberedValue13);
                    gapComposer2.end(false);
                }
                MutableObjectFloatMap mutableObjectFloatMap5 = mutableObjectFloatMap;
                boolean changedInstance6 = gapComposer2.changedInstance(mutableObjectFloatMap5) | gapComposer2.changedInstance(composeNavigator) | gapComposer2.changed(function17) | gapComposer2.changed(function112) | gapComposer2.changed(function113);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (changedInstance6 || rememberedValue14 == neverEqualPolicy) {
                    ComposeNavigator composeNavigator6 = composeNavigator;
                    state = state2;
                    rememberedValue14 = new SliderKt$$ExternalSyntheticLambda4(mutableObjectFloatMap5, composeNavigator6, function17, function112, function113, state, mutableState3, 2);
                    mutableObjectFloatMap2 = mutableObjectFloatMap5;
                    composeNavigator2 = composeNavigator6;
                    mutableState2 = mutableState3;
                    gapComposer2.updateRememberedValue(rememberedValue14);
                } else {
                    mutableObjectFloatMap2 = mutableObjectFloatMap5;
                    state = state2;
                    mutableState2 = mutableState3;
                    composeNavigator2 = composeNavigator;
                }
                Function1 function114 = (Function1) rememberedValue14;
                Object rememberedValue15 = gapComposer2.rememberedValue();
                Object obj11 = rememberedValue15;
                if (rememberedValue15 == neverEqualPolicy) {
                    Navigation$$ExternalSyntheticLambda1 navigation$$ExternalSyntheticLambda12 = new Navigation$$ExternalSyntheticLambda1(25);
                    gapComposer2.updateRememberedValue(navigation$$ExternalSyntheticLambda12);
                    obj11 = navigation$$ExternalSyntheticLambda12;
                }
                State state3 = state;
                NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
                navigatorProvider = navigatorProvider2;
                AnimatedContentKt.AnimatedContent(transition, modifier, function114, alignment, (Function1) obj11, Expect_jvmKt.rememberComposableLambda(820763100, new NavHostKt$NavHost$32(seekableTransitionState, navBackStackEntry, rememberSaveableStateHolder, mutableState2, state3, 0), gapComposer2), gapComposer2, ((i3 >> 3) & 112) | 221184 | (i3 & 7168), 0);
                Transition transition2 = transition;
                Object currentState = transition2.transitionState.getCurrentState();
                Object value = transition2.targetState$delegate.getValue();
                boolean changed3 = gapComposer2.changed(transition2) | gapComposer2.changedInstance(navHostController) | gapComposer2.changedInstance(navBackStackEntry) | gapComposer2.changedInstance(composeNavigator2) | gapComposer2.changedInstance(mutableObjectFloatMap2);
                Object rememberedValue16 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue16 == neverEqualPolicy3) {
                    obj = value;
                    MutableObjectFloatMap mutableObjectFloatMap6 = mutableObjectFloatMap2;
                    obj2 = currentState;
                    gapComposer = gapComposer2;
                    NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(transition2, navHostController, navBackStackEntry, mutableObjectFloatMap6, state3, composeNavigator2, (Continuation) null, 0);
                    gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
                    rememberedValue16 = navHostKt$NavHost$33$1;
                } else {
                    gapComposer = gapComposer2;
                    obj2 = currentState;
                    obj = value;
                }
                Updater.LaunchedEffect(obj2, obj, (Function2) rememberedValue16, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                navigatorProvider = navigatorProvider3;
                gapComposer.startReplaceGroup(-1789446406);
                gapComposer.end(false);
            }
            Navigator navigator2 = navigatorProvider.getNavigator("dialog");
            DialogNavigator dialogNavigator3 = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : dialogNavigator2;
            if (dialogNavigator3 == null) {
                RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
                if (endRestartGroup2 != null) {
                    final int i10 = 0;
                    endRestartGroup2.block = new Function2() { // from class: androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj32, Object obj42) {
                            int i52 = i10;
                            int i62 = i;
                            switch (i52) {
                                case 0:
                                    ((Integer) obj42).getClass();
                                    NavHostKt.NavHost(navHostController, navGraph, modifier, alignment, function1, function12, function13, function14, (Composer) obj32, Updater.updateChangedFlags(i62 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj42).getClass();
                                    NavHostKt.NavHost(navHostController, navGraph, modifier, alignment, function1, function12, function13, function14, (Composer) obj32, Updater.updateChangedFlags(i62 | 1));
                                    break;
                                default:
                                    ((Integer) obj42).getClass();
                                    NavHostKt.NavHost(navHostController, navGraph, modifier, alignment, function1, function12, function13, function14, (Composer) obj32, Updater.updateChangedFlags(i62 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            DialogHostKt.DialogHost(dialogNavigator3, gapComposer, 0);
        }
        RecomposeScopeImpl endRestartGroup3 = gapComposer.endRestartGroup();
        if (endRestartGroup3 != null) {
            final int i11 = 1;
            endRestartGroup3.block = new Function2() { // from class: androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj32, Object obj42) {
                    int i52 = i11;
                    int i62 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj42).getClass();
                            NavHostKt.NavHost(navHostController, navGraph, modifier, alignment, function1, function12, function13, function14, (Composer) obj32, Updater.updateChangedFlags(i62 | 1));
                            break;
                        case 1:
                            ((Integer) obj42).getClass();
                            NavHostKt.NavHost(navHostController, navGraph, modifier, alignment, function1, function12, function13, function14, (Composer) obj32, Updater.updateChangedFlags(i62 | 1));
                            break;
                        default:
                            ((Integer) obj42).getClass();
                            NavHostKt.NavHost(navHostController, navGraph, modifier, alignment, function1, function12, function13, function14, (Composer) obj32, Updater.updateChangedFlags(i62 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBillsSubscriptionsMerchantList.deepLinkSpecs;
    }

    public static EmptyList provideKeyboardShortcuts() {
        return EmptyList.INSTANCE;
    }

    public static final void NavHost(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Composer composer, int i) {
        Function1 function16;
        Function1 function17;
        int i2;
        Alignment alignment2;
        Modifier modifier2;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Object build;
        GapComposer gapComposer;
        Function1 function111;
        Function1 function112;
        Function1 function113;
        Function1 function114;
        Alignment alignment3;
        Modifier modifier3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1840250294);
        int i3 = i | (gapComposer2.changedInstance(navHostController) ? 4 : 2) | (gapComposer2.changed(str) ? 32 : 16) | 844852608;
        if ((306783379 & i3) == 306783378 && gapComposer2.getSkipping()) {
            gapComposer2.skipToGroupEnd();
            modifier3 = modifier;
            alignment3 = alignment;
            function114 = function1;
            function113 = function12;
            function112 = function13;
            function110 = function15;
            gapComposer = gapComposer2;
            function111 = function14;
        } else {
            gapComposer2.startDefaults();
            int i4 = i & 1;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i4 != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
                modifier2 = modifier;
                function18 = function1;
                function17 = function12;
                function16 = function13;
                function19 = function14;
                i2 = i3 & (-264241153);
                alignment2 = alignment;
            } else {
                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Navigation$$ExternalSyntheticLambda1(22);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function16 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Navigation$$ExternalSyntheticLambda1(24);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                function17 = (Function1) rememberedValue2;
                i2 = i3 & (-264241153);
                alignment2 = biasAlignment;
                modifier2 = Modifier.Companion.$$INSTANCE;
                function18 = function16;
                function19 = function17;
            }
            gapComposer2.endDefaults();
            boolean z = (i2 & 112) == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.impl._navigatorProvider, str);
                function110 = function15;
                function110.invoke(navGraphBuilder);
                build = navGraphBuilder.build();
                gapComposer2.updateRememberedValue(build);
            } else {
                build = rememberedValue3;
                function110 = function15;
            }
            Alignment alignment4 = alignment2;
            Function1 function115 = function19;
            Function1 function116 = function17;
            NavHost(navHostController, (NavGraph) build, modifier2, alignment4, function18, function116, function16, function115, gapComposer2, (i2 & 8078) | 100884480);
            gapComposer = gapComposer2;
            function111 = function115;
            function112 = function16;
            function113 = function116;
            function114 = function18;
            alignment3 = alignment4;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NavHostKt$$ExternalSyntheticLambda2(navHostController, str, modifier3, alignment3, function114, function113, function112, function111, function110, i);
        }
    }
}
