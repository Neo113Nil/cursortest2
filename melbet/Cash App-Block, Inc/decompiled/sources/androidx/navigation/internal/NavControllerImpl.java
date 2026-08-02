package androidx.navigation.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController$$ExternalSyntheticLambda0;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.NavType;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigation.Navigator;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.navigation.NavigatorProvider;
import androidx.savedstate.SavedStateReaderKt;
import androidx.work.Data$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.bugsnag.android.TraceParser;
import com.caverock.androidsvg.SVG;
import com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.ReversedList$listIterator$1;
import kotlin.collections.ReversedListReadOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TakeWhileSequence$iterator$1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavControllerImpl {
    public final StateFlowImpl _currentBackStack;
    public final SharedFlowImpl _currentBackStackEntryFlow;
    public NavGraph _graph;
    public final NavigatorProvider _navigatorProvider;
    public final StateFlowImpl _visibleEntries;
    public Function1 addToBackStackHandler;
    public final ArrayDeque backQueue = new ArrayDeque();
    public final ArrayList backStackEntriesToDispatch;
    public final LinkedHashMap backStackMap;
    public final LinkedHashMap backStackStates;
    public Bundle[] backStackToRestore;
    public final LinkedHashMap childToParentEntries;
    public int dispatchReentrantCount;
    public final LinkedHashMap entrySavedState;
    public Lifecycle.State hostLifecycleState;
    public final Lifecycle$$ExternalSyntheticLambda0 lifecycleObserver;
    public LifecycleOwner lifecycleOwner;
    public final NavHostController navController;
    public final LinkedHashMap navigatorState;
    public Bundle navigatorStateToRestore;
    public final ArrayList onDestinationChangedListeners;
    public final LinkedHashMap parentToChildCount;
    public MenuKt$$ExternalSyntheticLambda0 popFromBackStackHandler;
    public final NavController$$ExternalSyntheticLambda0 updateOnBackPressedCallbackEnabledCallback;
    public NavControllerViewModel viewModel;
    public final ReadonlyStateFlow visibleEntries;

    public NavControllerImpl(NavHostController navHostController, NavController$$ExternalSyntheticLambda0 navController$$ExternalSyntheticLambda0) {
        this.navController = navHostController;
        this.updateOnBackPressedCallbackEnabledCallback = navController$$ExternalSyntheticLambda0;
        EmptyList emptyList = EmptyList.INSTANCE;
        this._currentBackStack = FlowKt.MutableStateFlow(emptyList);
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(emptyList);
        this._visibleEntries = MutableStateFlow;
        this.visibleEntries = FlowKt.asStateFlow(MutableStateFlow);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new ArrayList();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new Lifecycle$$ExternalSyntheticLambda0(this, 3);
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this.backStackEntriesToDispatch = new ArrayList();
        this._currentBackStackEntryFlow = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    public static NavDestination findDestinationComprehensive$navigation_runtime_release(int i, NavDestination navDestination, NavDestination navDestination2, boolean z) {
        if (navDestination.impl.id == i && (navDestination2 == null || (navDestination.equals(navDestination2) && Intrinsics.areEqual(navDestination.parent, navDestination2.parent)))) {
            return navDestination;
        }
        NavGraph navGraph = navDestination instanceof NavGraph ? (NavGraph) navDestination : null;
        if (navGraph == null) {
            navGraph = navDestination.parent;
            navGraph.getClass();
        }
        return navGraph.impl.findNodeComprehensive$navigation_common_release(i, navGraph, navDestination2, z);
    }

    public static /* synthetic */ void popEntryFromBackStack$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavBackStackEntry navBackStackEntry) {
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, false, new ArrayDeque());
    }

    public final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list) {
        Object obj;
        Object obj2;
        ActionBarPolicy actionBarPolicy = this.navController.navContext;
        NavDestination navDestination2 = navBackStackEntry.destination;
        boolean z = navDestination2 instanceof FloatingWindow;
        ArrayDeque arrayDeque = this.backQueue;
        if (!z) {
            while (!arrayDeque.isEmpty() && (((NavBackStackEntry) arrayDeque.last()).destination instanceof FloatingWindow) && popBackStackInternal$navigation_runtime_release(((NavBackStackEntry) arrayDeque.last()).destination.impl.id, true, false)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        Object obj3 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination3 = navDestination2;
            do {
                navDestination3.getClass();
                navDestination3 = navDestination3.parent;
                if (navDestination3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Intrinsics.areEqual(((NavBackStackEntry) obj2).destination, navDestination3)) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
                    if (navBackStackEntry2 == null) {
                        navBackStackEntry2 = NavBackStackEntry.Companion.create$default(actionBarPolicy, navDestination3, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                    }
                    arrayDeque2.addFirst(navBackStackEntry2);
                    if (!arrayDeque.isEmpty() && ((NavBackStackEntry) arrayDeque.last()).destination == navDestination3) {
                        popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) arrayDeque.last());
                    }
                }
                if (navDestination3 == null) {
                    break;
                }
            } while (navDestination3 != navDestination);
        }
        NavDestination navDestination4 = arrayDeque2.isEmpty() ? navDestination2 : ((NavBackStackEntry) arrayDeque2.first()).destination;
        while (navDestination4 != null && findDestination$navigation_runtime_release(navDestination4.impl.id, navDestination4) != navDestination4) {
            navDestination4 = navDestination4.parent;
            if (navDestination4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj).destination, navDestination4)) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
                if (navBackStackEntry3 == null) {
                    navBackStackEntry3 = NavBackStackEntry.Companion.create$default(actionBarPolicy, navDestination4, navDestination4.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                }
                arrayDeque2.addFirst(navBackStackEntry3);
            }
        }
        if (!arrayDeque2.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) arrayDeque2.first()).destination;
        }
        while (!arrayDeque.isEmpty() && (((NavBackStackEntry) arrayDeque.last()).destination instanceof NavGraph)) {
            NavDestination navDestination5 = ((NavBackStackEntry) arrayDeque.last()).destination;
            navDestination5.getClass();
            SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) ((NavGraph) navDestination5).impl.projectPackages;
            int i = navDestination2.impl.id;
            sparseArrayCompat.getClass();
            if (SieveCacheKt.commonGet(sparseArrayCompat, i) != null) {
                break;
            } else {
                popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) arrayDeque.last());
            }
        }
        NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) arrayDeque.firstOrNull();
        if (navBackStackEntry4 == null) {
            navBackStackEntry4 = (NavBackStackEntry) arrayDeque2.firstOrNull();
        }
        if (!Intrinsics.areEqual(navBackStackEntry4 != null ? navBackStackEntry4.destination : null, this._graph)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                NavDestination navDestination6 = ((NavBackStackEntry) previous).destination;
                NavGraph navGraph = this._graph;
                navGraph.getClass();
                if (Intrinsics.areEqual(navDestination6, navGraph)) {
                    obj3 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry) obj3;
            if (navBackStackEntry5 == null) {
                NavGraph navGraph2 = this._graph;
                navGraph2.getClass();
                NavGraph navGraph3 = this._graph;
                navGraph3.getClass();
                navBackStackEntry5 = NavBackStackEntry.Companion.create$default(actionBarPolicy, navGraph2, navGraph3.addInDefaultArgs(bundle), getHostLifecycleState$navigation_runtime_release(), this.viewModel);
            }
            arrayDeque2.addFirst(navBackStackEntry5);
        }
        Iterator it = arrayDeque2.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry6 = (NavBackStackEntry) it.next();
            Object obj4 = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry6.destination.navigatorName));
            if (obj4 == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("NavigatorBackStack for "), navDestination.navigatorName, " should already be created"));
                return;
            }
            ((NavController$NavControllerNavigatorState) obj4).addInternal(navBackStackEntry6);
        }
        arrayDeque.addAll(arrayDeque2);
        arrayDeque.addLast(navBackStackEntry);
        Iterator it2 = CollectionsKt.plus((Collection) arrayDeque2, (Object) navBackStackEntry).iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry7 = (NavBackStackEntry) it2.next();
            NavGraph navGraph4 = navBackStackEntry7.destination.parent;
            if (navGraph4 != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry7, getBackStackEntry$navigation_runtime_release(((NavDestination) navGraph4).impl.id));
            }
        }
    }

    public final boolean dispatchOnDestinationChanged$navigation_runtime_release() {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.backQueue;
            if (arrayDeque.isEmpty() || !(((NavBackStackEntry) arrayDeque.last()).destination instanceof NavGraph)) {
                break;
            }
            popEntryFromBackStack$navigation_runtime_release$default(this, (NavBackStackEntry) arrayDeque.last());
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.lastOrNull();
        ArrayList arrayList = this.backStackEntriesToDispatch;
        if (navBackStackEntry != null) {
            arrayList.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i;
        if (i == 0) {
            ArrayList mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            arrayList.clear();
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
                for (HelpFragment$$ExternalSyntheticLambda2 helpFragment$$ExternalSyntheticLambda2 : CollectionsKt.toList(this.onDestinationChangedListeners)) {
                    NavDestination navDestination = navBackStackEntry2.destination;
                    navBackStackEntry2.impl.getArguments$navigation_common_release();
                    helpFragment$$ExternalSyntheticLambda2.onDestinationChanged(this.navController, navDestination);
                }
                this._currentBackStackEntryFlow.tryEmit(navBackStackEntry2);
            }
            ArrayList arrayList2 = new ArrayList(arrayDeque);
            StateFlowImpl stateFlowImpl = this._currentBackStack;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, arrayList2);
            ArrayList populateVisibleEntries$navigation_runtime_release = populateVisibleEntries$navigation_runtime_release();
            StateFlowImpl stateFlowImpl2 = this._visibleEntries;
            stateFlowImpl2.getClass();
            stateFlowImpl2.updateState(null, populateVisibleEntries$navigation_runtime_release);
        }
        return navBackStackEntry != null;
    }

    public final boolean executePopOperations$navigation_runtime_release(ArrayList arrayList, NavDestination navDestination, boolean z, boolean z2) {
        final NavControllerImpl navControllerImpl;
        boolean z3;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                navControllerImpl = this;
                z3 = z2;
                break;
            }
            Navigator navigator = (Navigator) it.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
            navControllerImpl = this;
            z3 = z2;
            MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(ref$BooleanRef2, ref$BooleanRef, navControllerImpl, z3, arrayDeque, 2);
            navigator.getClass();
            navBackStackEntry.getClass();
            navControllerImpl.popFromBackStackHandler = menuKt$$ExternalSyntheticLambda0;
            navigator.popBackStack(navBackStackEntry, z3);
            navControllerImpl.popFromBackStackHandler = null;
            if (!ref$BooleanRef2.element) {
                break;
            }
            this = navControllerImpl;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = navControllerImpl.backStackMap;
            if (!z) {
                final int i = 0;
                TakeWhileSequence$iterator$1 takeWhileSequence$iterator$1 = new TakeWhileSequence$iterator$1(SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(29), navDestination), new Function1(navControllerImpl) { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda4
                    public final /* synthetic */ NavControllerImpl f$0;

                    {
                        this.f$0 = navControllerImpl;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        int i2 = i;
                        NavControllerImpl navControllerImpl2 = this.f$0;
                        NavDestination navDestination2 = (NavDestination) obj;
                        switch (i2) {
                            case 0:
                                navDestination2.getClass();
                                containsKey = navControllerImpl2.backStackMap.containsKey(Integer.valueOf(navDestination2.impl.id));
                                break;
                            default:
                                navDestination2.getClass();
                                containsKey = navControllerImpl2.backStackMap.containsKey(Integer.valueOf(navDestination2.impl.id));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }));
                while (takeWhileSequence$iterator$1.hasNext()) {
                    Integer valueOf = Integer.valueOf(((NavDestination) takeWhileSequence$iterator$1.next()).impl.id);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque.firstOrNull();
                    linkedHashMap.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.impl.id : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryStateImpl navBackStackEntryStateImpl = ((NavBackStackEntryState) arrayDeque.first()).impl;
                final int i2 = 1;
                TakeWhileSequence$iterator$1 takeWhileSequence$iterator$12 = new TakeWhileSequence$iterator$1(SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(new Data$$ExternalSyntheticLambda0(i2), navControllerImpl.findDestination$navigation_runtime_release(navBackStackEntryStateImpl.destinationId, null)), new Function1(navControllerImpl) { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda4
                    public final /* synthetic */ NavControllerImpl f$0;

                    {
                        this.f$0 = navControllerImpl;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean containsKey;
                        int i22 = i2;
                        NavControllerImpl navControllerImpl2 = this.f$0;
                        NavDestination navDestination2 = (NavDestination) obj;
                        switch (i22) {
                            case 0:
                                navDestination2.getClass();
                                containsKey = navControllerImpl2.backStackMap.containsKey(Integer.valueOf(navDestination2.impl.id));
                                break;
                            default:
                                navDestination2.getClass();
                                containsKey = navControllerImpl2.backStackMap.containsKey(Integer.valueOf(navDestination2.impl.id));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }));
                while (takeWhileSequence$iterator$12.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((NavDestination) takeWhileSequence$iterator$12.next()).impl.id), navBackStackEntryStateImpl.id);
                }
                if (linkedHashMap.values().contains(navBackStackEntryStateImpl.id)) {
                    navControllerImpl.backStackStates.put(navBackStackEntryStateImpl.id, arrayDeque);
                }
            }
        }
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        return ref$BooleanRef.element;
    }

    public final NavDestination findDestination$navigation_runtime_release(int i, NavDestination navDestination) {
        NavDestination navDestination2;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        if (((NavDestination) navGraph).impl.id == i) {
            if (navDestination == null) {
                return navGraph;
            }
            if (Intrinsics.areEqual(navGraph, navDestination) && navDestination.parent == null) {
                return this._graph;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry == null || (navDestination2 = navBackStackEntry.destination) == null) {
            navDestination2 = this._graph;
            navDestination2.getClass();
        }
        return findDestinationComprehensive$navigation_runtime_release(i, navDestination2, navDestination, false);
    }

    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(int i) {
        Object obj;
        ArrayDeque arrayDeque = this.backQueue;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((NavBackStackEntry) obj).destination.impl.id == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        m2m.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalArgumentException(m2m.toString().toString());
    }

    public final NavDestination getCurrentDestination$navigation_runtime_release() {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry != null) {
            return navBackStackEntry.destination;
        }
        return null;
    }

    public final NavGraph getGraph$navigation_runtime_release() {
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            navGraph.getClass();
            return navGraph;
        }
        a$$ExternalSyntheticBUOutline0.m$1("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    public final NavGraph getTopGraph$navigation_runtime_release() {
        NavDestination navDestination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.destination) == null) {
            navDestination = this._graph;
            navDestination.getClass();
        }
        NavGraph navGraph = navDestination instanceof NavGraph ? (NavGraph) navDestination : null;
        if (navGraph != null) {
            return navGraph;
        }
        NavGraph navGraph2 = navDestination.parent;
        navGraph2.getClass();
        return navGraph2;
    }

    public final void linkChildToParent$navigation_runtime_release(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        LinkedHashMap linkedHashMap = this.parentToChildCount;
        if (linkedHashMap.get(navBackStackEntry2) == null) {
            linkedHashMap.put(navBackStackEntry2, new AtomicInt());
        }
        Object obj = linkedHashMap.get(navBackStackEntry2);
        obj.getClass();
        ((AtomicInt) obj).atomicInt.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if (r13.equals(r0) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        r0 = new kotlin.collections.ArrayDeque();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if ((r12.size() - r4) < r14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011d, code lost:
    
        r10 = (androidx.navigation.NavBackStackEntry) kotlin.collections.CollectionsKt__MutableCollectionsKt.removeLast(r12);
        unlinkChildFromParent$navigation_runtime_release(r10);
        r24 = r1;
        r15 = new androidx.navigation.NavBackStackEntry(r10.context, r10.destination, r10.destination.addInDefaultArgs(r27), r10.hostLifecycleState, r10.viewModelStoreProvider, r10.id, r10.savedState);
        r1 = r10.hostLifecycleState;
        r8 = r15.impl;
        r8.getClass();
        r1.getClass();
        r8.hostLifecycleState = r1;
        r1 = r10.impl.maxLifecycle;
        r1.getClass();
        r8.maxLifecycle = r1;
        r8.updateState$navigation_common_release();
        r0.addFirst(r15);
        r1 = r24;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        r24 = r1;
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0176, code lost:
    
        if (r1.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r4 = (androidx.navigation.NavBackStackEntry) r1.next();
        r8 = r4.destination.parent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
    
        if (r8 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
    
        linkChildToParent$navigation_runtime_release(r4, getBackStackEntry$navigation_runtime_release(((androidx.navigation.NavDestination) r8).impl.id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018f, code lost:
    
        r12.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019b, code lost:
    
        if (r0.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
    
        r1 = (androidx.navigation.NavBackStackEntry) r0.next();
        r11.getNavigator(r1.destination.navigatorName).onLaunchSingleTop(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01af, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010f, code lost:
    
        if (r10.id == r0.impl.id) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01fd A[LOOP:1: B:20:0x01f7->B:22:0x01fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void navigate$navigation_runtime_release(NavDestination navDestination, Bundle bundle, NavOptions navOptions) {
        boolean z;
        NavDestinationImpl navDestinationImpl;
        Ref$BooleanRef ref$BooleanRef;
        boolean z2;
        ListIterator listIterator;
        int i;
        Iterator it;
        boolean popBackStackInternal$navigation_runtime_release;
        navDestination.getClass();
        LinkedHashMap linkedHashMap = this.navigatorState;
        Iterator it2 = linkedHashMap.values().iterator();
        while (true) {
            int i2 = 1;
            if (!it2.hasNext()) {
                break;
            } else {
                ((NavController$NavControllerNavigatorState) it2.next()).isNavigating = true;
            }
        }
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        if (navOptions != null) {
            boolean z3 = navOptions.popUpToSaveState;
            boolean z4 = navOptions.popUpToInclusive;
            String str = navOptions.popUpToRoute;
            if (str != null) {
                popBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(str, z4, z3);
            } else {
                int i3 = navOptions.popUpToId;
                if (i3 != -1) {
                    popBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(i3, z4, z3);
                }
            }
            z = popBackStackInternal$navigation_runtime_release;
            Bundle addInDefaultArgs = navDestination.addInDefaultArgs(bundle);
            navDestinationImpl = navDestination.impl;
            if (navOptions != null && navOptions.restoreState) {
                if (this.backStackMap.containsKey(Integer.valueOf(navDestinationImpl.id))) {
                    ref$BooleanRef2.element = restoreStateInternal(navDestinationImpl.id, addInDefaultArgs, navOptions);
                    z2 = false;
                    this.updateOnBackPressedCallbackEnabledCallback.invoke();
                    it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((NavController$NavControllerNavigatorState) it.next()).isNavigating = false;
                    }
                    if (!z || ref$BooleanRef2.element || z2) {
                        dispatchOnDestinationChanged$navigation_runtime_release();
                    } else {
                        updateBackStackLifecycle$navigation_runtime_release();
                        return;
                    }
                }
            }
            NavigatorProvider navigatorProvider = this._navigatorProvider;
            if (navOptions != null && navOptions.singleTop) {
                ArrayDeque arrayDeque = this.backQueue;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.lastOrNull();
                listIterator = arrayDeque.listIterator(arrayDeque.getSize());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((NavBackStackEntry) listIterator.previous()).destination == navDestination) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    if (navDestination instanceof NavGraph) {
                        int i4 = NavGraph.$r8$clinit;
                        List list = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(19), (NavGraph) navDestination), new Data$$ExternalSyntheticLambda0(2)));
                        if (arrayDeque.size - i == list.size()) {
                            List subList = arrayDeque.subList(i, arrayDeque.size);
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10));
                            Iterator it3 = subList.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(Integer.valueOf(((NavBackStackEntry) it3.next()).destination.impl.id));
                            }
                        }
                    } else if (navBackStackEntry != null) {
                        NavDestination navDestination2 = navBackStackEntry.destination;
                        if (navDestination2 != null) {
                        }
                    }
                    if (z2) {
                        ref$BooleanRef2 = ref$BooleanRef;
                    } else {
                        NavBackStackEntry create$default = NavBackStackEntry.Companion.create$default(this.navController.navContext, navDestination, addInDefaultArgs, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                        Navigator navigator = navigatorProvider.getNavigator(navDestination.navigatorName);
                        List listOf = CollectionsKt__CollectionsJVMKt.listOf(create$default);
                        ref$BooleanRef2 = ref$BooleanRef;
                        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(ref$BooleanRef2, this, navDestination, addInDefaultArgs, 9);
                        listOf.getClass();
                        this.addToBackStackHandler = n3__externalsyntheticlambda0;
                        navigator.navigate(listOf, navOptions);
                        this.addToBackStackHandler = null;
                    }
                    this.updateOnBackPressedCallbackEnabledCallback.invoke();
                    it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                    }
                    if (z) {
                    }
                    dispatchOnDestinationChanged$navigation_runtime_release();
                }
            }
            ref$BooleanRef = ref$BooleanRef2;
            z2 = false;
            if (z2) {
            }
            this.updateOnBackPressedCallbackEnabledCallback.invoke();
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
            }
            if (z) {
            }
            dispatchOnDestinationChanged$navigation_runtime_release();
        }
        z = false;
        Bundle addInDefaultArgs2 = navDestination.addInDefaultArgs(bundle);
        navDestinationImpl = navDestination.impl;
        if (navOptions != null) {
            if (this.backStackMap.containsKey(Integer.valueOf(navDestinationImpl.id))) {
            }
        }
        NavigatorProvider navigatorProvider2 = this._navigatorProvider;
        if (navOptions != null) {
            ArrayDeque arrayDeque2 = this.backQueue;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) arrayDeque2.lastOrNull();
            listIterator = arrayDeque2.listIterator(arrayDeque2.getSize());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        ref$BooleanRef = ref$BooleanRef2;
        z2 = false;
        if (z2) {
        }
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        dispatchOnDestinationChanged$navigation_runtime_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8 A[EDGE_INSN: B:48:0x00c8->B:49:0x00c8 BREAK  A[LOOP:0: B:6:0x0020->B:57:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[LOOP:0: B:6:0x0020->B:57:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean popBackStackInternal$navigation_runtime_release(String str, boolean z, boolean z2) {
        Object obj;
        boolean z3;
        str.getClass();
        ArrayDeque arrayDeque = this.backQueue;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getSize());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            NavDestination navDestination = navBackStackEntry.destination;
            Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
            navDestination.getClass();
            NavDestinationImpl navDestinationImpl = navDestination.impl;
            navDestinationImpl.getClass();
            if (!Intrinsics.areEqual(navDestinationImpl.route, str)) {
                NavDestination.DeepLinkMatch matchRoute$navigation_common_release = navDestinationImpl.matchRoute$navigation_common_release(str);
                if (navDestinationImpl.destination.equals(matchRoute$navigation_common_release != null ? matchRoute$navigation_common_release.destination : null)) {
                    Bundle bundle = matchRoute$navigation_common_release.matchingArgs;
                    if (arguments$navigation_common_release != null && bundle != null) {
                        Set<String> keySet = bundle.keySet();
                        keySet.getClass();
                        for (String str2 : keySet) {
                            str2.getClass();
                            if (arguments$navigation_common_release.containsKey(str2)) {
                                NavArgument navArgument = (NavArgument) matchRoute$navigation_common_release.destination.getArguments().get(str2);
                                NavType navType = navArgument != null ? navArgument.f901type : null;
                                Object obj2 = navType != null ? navType.get(bundle, str2) : null;
                                Object obj3 = navType != null ? navType.get(arguments$navigation_common_release, str2) : null;
                                if (navType == null || navType.valueEquals(obj2, obj3)) {
                                }
                            }
                        }
                    }
                }
                z3 = false;
                if (!z || !z3) {
                    arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.destination.navigatorName));
                }
                if (!z3) {
                    break;
                }
            }
            z3 = true;
            if (!z) {
            }
            arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.destination.navigatorName));
            if (!z3) {
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        NavDestination navDestination2 = navBackStackEntry2 != null ? navBackStackEntry2.destination : null;
        if (navDestination2 != null) {
            return executePopOperations$navigation_runtime_release(arrayList, navDestination2, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void popEntryFromBackStack$navigation_runtime_release(NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque) {
        NavControllerViewModel navControllerViewModel;
        ReadonlyStateFlow readonlyStateFlow;
        Set set;
        navBackStackEntry.getClass();
        ArrayDeque arrayDeque2 = this.backQueue;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) arrayDeque2.last();
        if (!Intrinsics.areEqual(navBackStackEntry2, navBackStackEntry)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(navBackStackEntry.destination);
            NavDestination navDestination = navBackStackEntry2.destination;
            sb.append(", which is not the top of the back stack (");
            sb.append(navDestination);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        CollectionsKt__MutableCollectionsKt.removeLast(arrayDeque2);
        NavDestination navDestination2 = navBackStackEntry2.destination;
        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry2.impl;
        NavController$NavControllerNavigatorState navController$NavControllerNavigatorState = (NavController$NavControllerNavigatorState) this.navigatorState.get(this._navigatorProvider.getNavigator(navDestination2.navigatorName));
        boolean z2 = true;
        if ((navController$NavControllerNavigatorState == null || (readonlyStateFlow = navController$NavControllerNavigatorState.transitionsInProgress) == null || (set = (Set) readonlyStateFlow.$$delegate_0.getValue()) == null || !set.contains(navBackStackEntry2)) && !this.parentToChildCount.containsKey(navBackStackEntry2)) {
            z2 = false;
        }
        Lifecycle.State state = navBackStackEntryImpl.lifecycle.state;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.isAtLeast(state2)) {
            if (z) {
                navBackStackEntryImpl.maxLifecycle = state2;
                navBackStackEntryImpl.updateState$navigation_common_release();
                arrayDeque.addFirst(new NavBackStackEntryState(navBackStackEntry2));
            }
            if (z2) {
                navBackStackEntryImpl.maxLifecycle = state2;
                navBackStackEntryImpl.updateState$navigation_common_release();
            } else {
                navBackStackEntryImpl.maxLifecycle = Lifecycle.State.DESTROYED;
                navBackStackEntryImpl.updateState$navigation_common_release();
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry2);
            }
        }
        if (z || z2 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        String str = navBackStackEntry2.id;
        str.getClass();
        ViewModelStore viewModelStore = (ViewModelStore) navControllerViewModel.viewModelStores.remove(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    public final ArrayList populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavController$NavControllerNavigatorState) it.next()).transitionsInProgress.$$delegate_0.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.impl.maxLifecycle.isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.backQueue.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.impl.maxLifecycle.isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(next);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((NavBackStackEntry) next2).destination instanceof NavGraph)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean restoreStateInternal(int i, Bundle bundle, NavOptions navOptions) {
        NavDestination graph$navigation_runtime_release;
        NavBackStackEntry navBackStackEntry;
        NavDestination navDestination;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.backStackMap;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), str)) {
                it.remove();
            }
        }
        ArrayDeque arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(str);
        ActionBarPolicy actionBarPolicy = this.navController.navContext;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry2 == null || (graph$navigation_runtime_release = navBackStackEntry2.destination) == null) {
            graph$navigation_runtime_release = getGraph$navigation_runtime_release();
        }
        if (arrayDeque != null) {
            Iterator it2 = arrayDeque.iterator();
            while (it2.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it2.next();
                NavBackStackEntryStateImpl navBackStackEntryStateImpl = navBackStackEntryState.impl;
                NavBackStackEntryStateImpl navBackStackEntryStateImpl2 = navBackStackEntryState.impl;
                NavDestination findDestinationComprehensive$navigation_runtime_release = findDestinationComprehensive$navigation_runtime_release(navBackStackEntryStateImpl.destinationId, graph$navigation_runtime_release, null, true);
                if (findDestinationComprehensive$navigation_runtime_release == null) {
                    int i2 = NavDestination.$r8$clinit;
                    Handlers$$ExternalSyntheticBUOutline0.m("Restore State failed: destination ", NavDestination.Companion.getDisplayName(actionBarPolicy, navBackStackEntryStateImpl2.destinationId), " cannot be found from the current destination ", graph$navigation_runtime_release);
                    return false;
                }
                Lifecycle.State hostLifecycleState$navigation_runtime_release = getHostLifecycleState$navigation_runtime_release();
                NavControllerViewModel navControllerViewModel = this.viewModel;
                actionBarPolicy.getClass();
                hostLifecycleState$navigation_runtime_release.getClass();
                Bundle bundle3 = navBackStackEntryStateImpl2.args;
                if (bundle3 != null) {
                    Context context = actionBarPolicy.mContext;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = navBackStackEntryStateImpl2.id;
                Bundle bundle4 = navBackStackEntryStateImpl2.savedState;
                str2.getClass();
                arrayList.add(new NavBackStackEntry(actionBarPolicy, findDestinationComprehensive$navigation_runtime_release, bundle2, hostLifecycleState$navigation_runtime_release, navControllerViewModel, str2, bundle4));
                graph$navigation_runtime_release = findDestinationComprehensive$navigation_runtime_release;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((NavBackStackEntry) next).destination instanceof NavGraph)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) it4.next();
            List list = (List) CollectionsKt.lastOrNull((List) arrayList2);
            if (Intrinsics.areEqual((list == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt.last(list)) == null || (navDestination = navBackStackEntry.destination) == null) ? null : navDestination.navigatorName, navBackStackEntry3.destination.navigatorName)) {
                list.add(navBackStackEntry3);
            } else {
                arrayList2.add(CollectionsKt__CollectionsKt.mutableListOf(navBackStackEntry3));
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            Navigator navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) CollectionsKt.first(list2)).destination.navigatorName);
            ArrayList arrayList4 = arrayList;
            this.addToBackStackHandler = new OverlayKt$$ExternalSyntheticLambda3(ref$BooleanRef, arrayList4, new Ref$IntRef(), this, bundle, 6);
            navigator.navigate(list2, navOptions);
            this.addToBackStackHandler = null;
            arrayList = arrayList4;
        }
        return ref$BooleanRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setGraph$navigation_runtime_release(NavGraph navGraph, Bundle bundle) {
        ArrayDeque arrayDeque;
        boolean z;
        ArrayDeque arrayDeque2;
        Intent intent;
        int[] intArray;
        Bundle bundle2;
        NavDestination.DeepLinkMatch matchDeepLinkComprehensive;
        int length;
        int i;
        String str;
        NavDestination findNode$navigation_common_release;
        NavGraph navGraph2;
        int i2;
        Bundle bundle3;
        NavDestination findNode$navigation_common_release2;
        NavGraph navGraph3;
        navGraph.getClass();
        TraceParser traceParser = navGraph.impl;
        ArrayDeque arrayDeque3 = this.backQueue;
        if (!arrayDeque3.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            a$$ExternalSyntheticBUOutline0.m$1("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (Intrinsics.areEqual(this._graph, navGraph)) {
            int size = ((SparseArrayCompat) traceParser.projectPackages).size();
            for (int i3 = 0; i3 < size; i3++) {
                NavDestination navDestination = (NavDestination) ((SparseArrayCompat) traceParser.projectPackages).valueAt(i3);
                NavGraph navGraph4 = this._graph;
                navGraph4.getClass();
                int keyAt = ((SparseArrayCompat) navGraph4.impl.projectPackages).keyAt(i3);
                NavGraph navGraph5 = this._graph;
                navGraph5.getClass();
                SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) navGraph5.impl.projectPackages;
                if (sparseArrayCompat.garbage) {
                    SieveCacheKt.access$gc(sparseArrayCompat);
                }
                int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.size, keyAt, sparseArrayCompat.keys);
                if (binarySearch >= 0) {
                    Object[] objArr = sparseArrayCompat.values;
                    Object obj = objArr[binarySearch];
                    objArr[binarySearch] = navDestination;
                }
            }
            Iterator it = arrayDeque3.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                int i4 = NavDestination.$r8$clinit;
                ReversedListReadOnly asReversed = CollectionsKt__ReversedViewsKt.asReversed(SequencesKt___SequencesKt.toList(NavDestination.Companion.getHierarchy(navBackStackEntry.destination)));
                NavDestination navDestination2 = this._graph;
                navDestination2.getClass();
                Iterator it2 = asReversed.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((ReversedList$listIterator$1) it2).delegateIterator;
                    if (listIterator.hasPrevious()) {
                        NavDestination navDestination3 = (NavDestination) listIterator.previous();
                        if (!Intrinsics.areEqual(navDestination3, this._graph) || !navDestination2.equals(navGraph)) {
                            if (navDestination2 instanceof NavGraph) {
                                navDestination2 = ((NavGraph) navDestination2).impl.findNode$navigation_common_release(navDestination3.impl.id);
                                navDestination2.getClass();
                            }
                        }
                    }
                }
                navBackStackEntry.destination = navDestination2;
            }
            return;
        }
        NavGraph navGraph6 = this._graph;
        LinkedHashMap linkedHashMap = this.navigatorState;
        boolean z2 = true;
        if (navGraph6 != null) {
            Iterator it3 = new ArrayList(this.backStackMap.keySet()).iterator();
            while (it3.hasNext()) {
                Integer num = (Integer) it3.next();
                num.getClass();
                int intValue = num.intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((NavController$NavControllerNavigatorState) it4.next()).isNavigating = true;
                }
                ArrayDeque arrayDeque4 = arrayDeque3;
                boolean restoreStateInternal = restoreStateInternal(intValue, null, new NavOptions(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((NavController$NavControllerNavigatorState) it5.next()).isNavigating = false;
                }
                if (restoreStateInternal) {
                    popBackStackInternal$navigation_runtime_release(intValue, true, false);
                }
                arrayDeque3 = arrayDeque4;
            }
            arrayDeque = arrayDeque3;
            popBackStackInternal$navigation_runtime_release(((NavDestination) navGraph6).impl.id, true, false);
        } else {
            arrayDeque = arrayDeque3;
        }
        this._graph = navGraph;
        NavHostController navHostController = this.navController;
        NavControllerImpl navControllerImpl = navHostController.impl;
        ActionBarPolicy actionBarPolicy = navHostController.navContext;
        Bundle bundle4 = this.navigatorStateToRestore;
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        if (bundle4 != null && bundle4.containsKey("android-support-nav:controller:navigatorState:names")) {
            ArrayList<String> stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList == null) {
                SavedStateReaderKt.keyOrValueNotFoundError("android-support-nav:controller:navigatorState:names");
                throw null;
            }
            for (String str2 : stringArrayList) {
                Navigator navigator = navigatorProvider.getNavigator(str2);
                if (bundle4.containsKey(str2)) {
                    navigator.onRestoreState(BundleKt.m1096getSavedStateimpl(bundle4, str2));
                }
            }
        }
        Bundle[] bundleArr = this.backStackToRestore;
        if (bundleArr != null) {
            int length2 = bundleArr.length;
            int i5 = 0;
            while (i5 < length2) {
                Bundle bundle5 = bundleArr[i5];
                bundle5.getClass();
                bundle5.setClassLoader(NavBackStackEntryState.class.getClassLoader());
                String string2 = bundle5.getString("nav-entry-state:id");
                if (string2 == null) {
                    SavedStateReaderKt.keyOrValueNotFoundError("nav-entry-state:id");
                    throw null;
                }
                int m1095getIntimpl = BundleKt.m1095getIntimpl(bundle5, "nav-entry-state:destination-id");
                Bundle m1096getSavedStateimpl = BundleKt.m1096getSavedStateimpl(bundle5, "nav-entry-state:args");
                boolean z3 = z2;
                Bundle m1096getSavedStateimpl2 = BundleKt.m1096getSavedStateimpl(bundle5, "nav-entry-state:saved-state");
                NavDestination findDestination$navigation_runtime_release = findDestination$navigation_runtime_release(m1095getIntimpl, null);
                if (findDestination$navigation_runtime_release == null) {
                    int i6 = NavDestination.$r8$clinit;
                    a$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Restoring the Navigation back stack failed: destination ", NavDestination.Companion.getDisplayName(actionBarPolicy, m1095getIntimpl), " cannot be found from the current destination "), getCurrentDestination$navigation_runtime_release());
                    return;
                }
                Lifecycle.State hostLifecycleState$navigation_runtime_release = getHostLifecycleState$navigation_runtime_release();
                NavControllerViewModel navControllerViewModel = this.viewModel;
                actionBarPolicy.getClass();
                hostLifecycleState$navigation_runtime_release.getClass();
                Context context = actionBarPolicy.mContext;
                m1096getSavedStateimpl.setClassLoader(context != null ? context.getClassLoader() : null);
                NavBackStackEntry navBackStackEntry2 = new NavBackStackEntry(actionBarPolicy, findDestination$navigation_runtime_release, m1096getSavedStateimpl, hostLifecycleState$navigation_runtime_release, navControllerViewModel, string2, m1096getSavedStateimpl2);
                Navigator navigator2 = navigatorProvider.getNavigator(findDestination$navigation_runtime_release.navigatorName);
                Object obj2 = linkedHashMap.get(navigator2);
                if (obj2 == null) {
                    obj2 = new NavController$NavControllerNavigatorState(navHostController, navigator2);
                    linkedHashMap.put(navigator2, obj2);
                }
                ArrayDeque arrayDeque5 = arrayDeque;
                arrayDeque5.addLast(navBackStackEntry2);
                ((NavController$NavControllerNavigatorState) obj2).addInternal(navBackStackEntry2);
                NavGraph navGraph7 = navBackStackEntry2.destination.parent;
                if (navGraph7 != null) {
                    linkChildToParent$navigation_runtime_release(navBackStackEntry2, getBackStackEntry$navigation_runtime_release(((NavDestination) navGraph7).impl.id));
                }
                i5++;
                arrayDeque = arrayDeque5;
                z2 = z3;
            }
            z = z2;
            arrayDeque2 = arrayDeque;
            this.updateOnBackPressedCallbackEnabledCallback.invoke();
            this.backStackToRestore = null;
        } else {
            z = true;
            arrayDeque2 = arrayDeque;
        }
        Collection values = MapsKt__MapsKt.toMap(navigatorProvider._navigators).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : values) {
            if (!((Navigator) obj3).isAttached) {
                arrayList.add(obj3);
            }
        }
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            Navigator navigator3 = (Navigator) it6.next();
            Object obj4 = linkedHashMap.get(navigator3);
            if (obj4 == null) {
                navigator3.getClass();
                obj4 = new NavController$NavControllerNavigatorState(navHostController, navigator3);
                linkedHashMap.put(navigator3, obj4);
            }
            navigator3.onAttach((NavController$NavControllerNavigatorState) obj4);
        }
        if (this._graph == null || !arrayDeque2.isEmpty()) {
            dispatchOnDestinationChanged$navigation_runtime_release();
            return;
        }
        Activity activity = navHostController.activity;
        if (!navHostController.deepLinkHandled && activity != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                }
                ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                EmptyMap.INSTANCE.getClass();
                Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundle2 = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                if (bundle2 != null) {
                    bundleOf.putAll(bundle2);
                }
                if (intArray != null || intArray.length == 0) {
                    NavGraph topGraph$navigation_runtime_release = navControllerImpl.getTopGraph$navigation_runtime_release();
                    matchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(new SVG(intent.getData(), intent.getAction(), intent.getType(), false, 3), topGraph$navigation_runtime_release);
                    if (matchDeepLinkComprehensive != null) {
                        NavDestination navDestination4 = matchDeepLinkComprehensive.destination;
                        ArrayDeque arrayDeque6 = new ArrayDeque();
                        NavDestination navDestination5 = navDestination4;
                        while (true) {
                            NavDestinationImpl navDestinationImpl = navDestination5.impl;
                            NavGraph navGraph8 = navDestination5.parent;
                            if (navGraph8 == null || navGraph8.impl.state != navDestinationImpl.id) {
                                arrayDeque6.addFirst(navDestination5);
                            }
                            if (!Intrinsics.areEqual(navGraph8, (Object) null) && navGraph8 != null) {
                                navDestination5 = navGraph8;
                            }
                        }
                        List list = CollectionsKt.toList(arrayDeque6);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            arrayList2.add(Integer.valueOf(((NavDestination) it7.next()).impl.id));
                        }
                        intArray = CollectionsKt.toIntArray(arrayList2);
                        Bundle addInDefaultArgs = navDestination4.addInDefaultArgs(matchDeepLinkComprehensive.matchingArgs);
                        if (addInDefaultArgs != null) {
                            bundleOf.putAll(addInDefaultArgs);
                        }
                        parcelableArrayList = null;
                    }
                }
                if (intArray != null && intArray.length != 0) {
                    navControllerImpl.getClass();
                    NavGraph navGraph9 = navControllerImpl._graph;
                    length = intArray.length;
                    NavGraph navGraph10 = navGraph9;
                    i = 0;
                    while (true) {
                        if (i < length) {
                            str = null;
                            break;
                        }
                        int i7 = intArray[i];
                        if (i == 0) {
                            NavGraph navGraph11 = navControllerImpl._graph;
                            navGraph11.getClass();
                            findNode$navigation_common_release2 = ((NavDestination) navGraph11).impl.id == i7 ? navControllerImpl._graph : null;
                        } else {
                            navGraph10.getClass();
                            findNode$navigation_common_release2 = navGraph10.impl.findNode$navigation_common_release(i7);
                        }
                        if (findNode$navigation_common_release2 == null) {
                            int i8 = NavDestination.$r8$clinit;
                            str = NavDestination.Companion.getDisplayName(navControllerImpl.navController.navContext, i7);
                            break;
                        }
                        if (i != intArray.length - 1 && (findNode$navigation_common_release2 instanceof NavGraph)) {
                            while (true) {
                                navGraph3 = (NavGraph) findNode$navigation_common_release2;
                                navGraph3.getClass();
                                TraceParser traceParser2 = navGraph3.impl;
                                if (!(traceParser2.findNode$navigation_common_release(traceParser2.state) instanceof NavGraph)) {
                                    break;
                                } else {
                                    findNode$navigation_common_release2 = traceParser2.findNode$navigation_common_release(traceParser2.state);
                                }
                            }
                            navGraph10 = navGraph3;
                        }
                        i++;
                    }
                    if (str != null) {
                        bundleOf.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                        int length3 = intArray.length;
                        Bundle[] bundleArr2 = new Bundle[length3];
                        for (int i9 = 0; i9 < length3; i9++) {
                            EmptyMap.INSTANCE.getClass();
                            Bundle bundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            bundleOf2.putAll(bundleOf);
                            if (parcelableArrayList != null && (bundle3 = (Bundle) parcelableArrayList.get(i9)) != null) {
                                bundleOf2.putAll(bundle3);
                            }
                            bundleArr2[i9] = bundleOf2;
                        }
                        int flags = intent.getFlags();
                        int i10 = 268435456 & flags;
                        if (i10 != 0 && (flags & 32768) == 0) {
                            intent.addFlags(32768);
                            TaskStackBuilder taskStackBuilder = new TaskStackBuilder(navHostController.context);
                            ComponentName component = intent.getComponent();
                            if (component == null) {
                                component = intent.resolveActivity(taskStackBuilder.mSourceContext.getPackageManager());
                            }
                            if (component != null) {
                                taskStackBuilder.addParentStack(component);
                            }
                            taskStackBuilder.mIntents.add(intent);
                            taskStackBuilder.startActivities();
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                            return;
                        }
                        if (i10 != 0 ? z : false) {
                            if (navControllerImpl.backQueue.isEmpty()) {
                                i2 = 0;
                            } else {
                                NavGraph navGraph12 = navControllerImpl._graph;
                                navGraph12.getClass();
                                i2 = 0;
                                navControllerImpl.popBackStackInternal$navigation_runtime_release(((NavDestination) navGraph12).impl.id, z, false);
                            }
                            while (i2 < intArray.length) {
                                int i11 = intArray[i2];
                                int i12 = i2 + 1;
                                Bundle bundle6 = bundleArr2[i2];
                                NavDestination findDestination$navigation_runtime_release2 = navControllerImpl.findDestination$navigation_runtime_release(i11, null);
                                if (findDestination$navigation_runtime_release2 == null) {
                                    int i13 = NavDestination.$r8$clinit;
                                    a$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Deep Linking failed: destination ", NavDestination.Companion.getDisplayName(actionBarPolicy, i11), " cannot be found from the current destination "), navControllerImpl.getCurrentDestination$navigation_runtime_release());
                                    return;
                                } else {
                                    navControllerImpl.navigate$navigation_runtime_release(findDestination$navigation_runtime_release2, bundle6, NavOptionsBuilderKt.navOptions(new Navigator$$ExternalSyntheticLambda0(24, findDestination$navigation_runtime_release2, navHostController)));
                                    i2 = i12;
                                }
                            }
                            navHostController.deepLinkHandled = true;
                            return;
                        }
                        NavGraph navGraph13 = navControllerImpl._graph;
                        int length4 = intArray.length;
                        for (int i14 = 0; i14 < length4; i14++) {
                            int i15 = intArray[i14];
                            Bundle bundle7 = bundleArr2[i14];
                            if (i14 == 0) {
                                findNode$navigation_common_release = navControllerImpl._graph;
                            } else {
                                navGraph13.getClass();
                                findNode$navigation_common_release = navGraph13.impl.findNode$navigation_common_release(i15);
                            }
                            if (findNode$navigation_common_release == null) {
                                int i16 = NavDestination.$r8$clinit;
                                Drop$$ExternalSyntheticBUOutline0.m("Deep Linking failed: destination ", NavDestination.Companion.getDisplayName(actionBarPolicy, i15), " cannot be found in graph ", navGraph13);
                                return;
                            }
                            if (i14 == intArray.length - 1) {
                                NavGraph navGraph14 = navControllerImpl._graph;
                                navGraph14.getClass();
                                navControllerImpl.navigate$navigation_runtime_release(findNode$navigation_common_release, bundle7, new NavOptions(false, false, ((NavDestination) navGraph14).impl.id, true, false, 0, 0, -1, -1));
                            } else if (findNode$navigation_common_release instanceof NavGraph) {
                                while (true) {
                                    navGraph2 = (NavGraph) findNode$navigation_common_release;
                                    navGraph2.getClass();
                                    TraceParser traceParser3 = navGraph2.impl;
                                    if (!(traceParser3.findNode$navigation_common_release(traceParser3.state) instanceof NavGraph)) {
                                        break;
                                    } else {
                                        findNode$navigation_common_release = traceParser3.findNode$navigation_common_release(traceParser3.state);
                                    }
                                }
                                navGraph13 = navGraph2;
                            }
                        }
                        navHostController.deepLinkHandled = true;
                        return;
                    }
                    Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                }
            }
            intArray = null;
            if (extras == null) {
            }
            EmptyMap.INSTANCE.getClass();
            Bundle bundleOf3 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (extras == null) {
            }
            if (bundle2 != null) {
            }
            if (intArray != null) {
            }
            NavGraph topGraph$navigation_runtime_release2 = navControllerImpl.getTopGraph$navigation_runtime_release();
            matchDeepLinkComprehensive = topGraph$navigation_runtime_release2.matchDeepLinkComprehensive(new SVG(intent.getData(), intent.getAction(), intent.getType(), false, 3), topGraph$navigation_runtime_release2);
            if (matchDeepLinkComprehensive != null) {
            }
            if (intArray != null) {
                navControllerImpl.getClass();
                NavGraph navGraph92 = navControllerImpl._graph;
                length = intArray.length;
                NavGraph navGraph102 = navGraph92;
                i = 0;
                while (true) {
                    if (i < length) {
                    }
                    i++;
                }
                if (str != null) {
                }
            }
        }
        NavGraph navGraph15 = this._graph;
        navGraph15.getClass();
        navigate$navigation_runtime_release(navGraph15, bundle, null);
    }

    public final void unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.childToParentEntries.remove(navBackStackEntry);
        if (navBackStackEntry2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.parentToChildCount;
        AtomicInt atomicInt = (AtomicInt) linkedHashMap.get(navBackStackEntry2);
        Integer valueOf = atomicInt != null ? Integer.valueOf(atomicInt.atomicInt.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            NavController$NavControllerNavigatorState navController$NavControllerNavigatorState = (NavController$NavControllerNavigatorState) this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry2.destination.navigatorName));
            if (navController$NavControllerNavigatorState != null) {
                navController$NavControllerNavigatorState.markTransitionComplete(navBackStackEntry2);
            }
            linkedHashMap.remove(navBackStackEntry2);
        }
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        AtomicInt atomicInt;
        ReadonlyStateFlow readonlyStateFlow;
        Set set;
        ArrayList mutableList = CollectionsKt.toMutableList((Collection) this.backQueue);
        if (mutableList.isEmpty()) {
            return;
        }
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(((NavBackStackEntry) CollectionsKt.last((List) mutableList)).destination);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.last((List) mutableListOf) instanceof FloatingWindow) {
            Iterator it = CollectionsKt.reversed(mutableList).iterator();
            while (it.hasNext()) {
                NavDestination navDestination = ((NavBackStackEntry) it.next()).destination;
                arrayList.add(navDestination);
                if (!(navDestination instanceof FloatingWindow) && !(navDestination instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt.reversed(mutableList)) {
            NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.impl;
            Lifecycle.State state = navBackStackEntryImpl.maxLifecycle;
            NavDestination navDestination2 = navBackStackEntry.destination;
            NavDestination navDestination3 = (NavDestination) CollectionsKt.firstOrNull((List) mutableListOf);
            if (navDestination3 != null && navDestination3.impl.id == navDestination2.impl.id) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    NavController$NavControllerNavigatorState navController$NavControllerNavigatorState = (NavController$NavControllerNavigatorState) this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry.destination.navigatorName));
                    if (Intrinsics.areEqual((navController$NavControllerNavigatorState == null || (readonlyStateFlow = navController$NavControllerNavigatorState.transitionsInProgress) == null || (set = (Set) readonlyStateFlow.$$delegate_0.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInt = (AtomicInt) this.parentToChildCount.get(navBackStackEntry)) != null && atomicInt.atomicInt.get() == 0)) {
                        hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        hashMap.put(navBackStackEntry, state2);
                    }
                }
                NavDestination navDestination4 = (NavDestination) CollectionsKt.firstOrNull((List) arrayList);
                if (navDestination4 != null && navDestination4.impl.id == navDestination2.impl.id) {
                    CollectionsKt__MutableCollectionsKt.removeFirst(arrayList);
                }
                CollectionsKt__MutableCollectionsKt.removeFirst(mutableListOf);
                NavGraph navGraph = navDestination2.parent;
                if (navGraph != null) {
                    mutableListOf.add(navGraph);
                }
            } else if (arrayList.isEmpty() || navDestination2.impl.id != ((NavDestination) CollectionsKt.first((List) arrayList)).impl.id) {
                Lifecycle.State state3 = Lifecycle.State.CREATED;
                navBackStackEntryImpl.getClass();
                navBackStackEntryImpl.maxLifecycle = state3;
                navBackStackEntryImpl.updateState$navigation_common_release();
            } else {
                NavDestination navDestination5 = (NavDestination) CollectionsKt__MutableCollectionsKt.removeFirst(arrayList);
                if (state == Lifecycle.State.RESUMED) {
                    Lifecycle.State state4 = Lifecycle.State.STARTED;
                    navBackStackEntryImpl.getClass();
                    navBackStackEntryImpl.maxLifecycle = state4;
                    navBackStackEntryImpl.updateState$navigation_common_release();
                } else {
                    Lifecycle.State state5 = Lifecycle.State.STARTED;
                    if (state != state5) {
                        hashMap.put(navBackStackEntry, state5);
                    }
                }
                NavGraph navGraph2 = navDestination5.parent;
                if (navGraph2 != null && !arrayList.contains(navGraph2)) {
                    arrayList.add(navGraph2);
                }
            }
        }
        Iterator it2 = mutableList.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
            Lifecycle.State state6 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state6 != null) {
                navBackStackEntry2.getClass();
                NavBackStackEntryImpl navBackStackEntryImpl2 = navBackStackEntry2.impl;
                navBackStackEntryImpl2.getClass();
                navBackStackEntryImpl2.maxLifecycle = state6;
                navBackStackEntryImpl2.updateState$navigation_common_release();
            } else {
                navBackStackEntry2.impl.updateState$navigation_common_release();
            }
        }
    }

    public final boolean popBackStackInternal$navigation_runtime_release(int i, boolean z, boolean z2) {
        NavDestination navDestination;
        ArrayDeque arrayDeque = this.backQueue;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(arrayDeque).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).destination;
            String str = navDestination.navigatorName;
            NavDestinationImpl navDestinationImpl = navDestination.impl;
            Navigator navigator = this._navigatorProvider.getNavigator(str);
            if (z || navDestinationImpl.id != i) {
                arrayList.add(navigator);
            }
            if (navDestinationImpl.id == i) {
                break;
            }
        }
        if (navDestination == null) {
            int i2 = NavDestination.$r8$clinit;
            Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.navController.navContext, i) + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, navDestination, z, z2);
    }
}
