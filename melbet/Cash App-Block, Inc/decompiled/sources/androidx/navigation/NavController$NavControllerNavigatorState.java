package androidx.navigation;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.GlideBuilder$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavController$NavControllerNavigatorState {
    public final StateFlowImpl _backStack;
    public final StateFlowImpl _transitionsInProgress;
    public final ReadonlyStateFlow backStack;
    public final GlideBuilder$1 backStackLock;
    public boolean isNavigating;
    public final Navigator navigator;
    public final /* synthetic */ NavHostController this$0;
    public final ReadonlyStateFlow transitionsInProgress;

    public NavController$NavControllerNavigatorState(NavHostController navHostController, Navigator navigator) {
        navigator.getClass();
        this.this$0 = navHostController;
        this.backStackLock = new GlideBuilder$1();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(EmptyList.INSTANCE);
        this._backStack = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(EmptySet.INSTANCE);
        this._transitionsInProgress = MutableStateFlow2;
        this.backStack = FlowKt.asStateFlow(MutableStateFlow);
        this.transitionsInProgress = FlowKt.asStateFlow(MutableStateFlow2);
        this.navigator = navigator;
    }

    public final void addInternal(NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        synchronized (this.backStackLock) {
            StateFlowImpl stateFlowImpl = this._backStack;
            ArrayList plus = CollectionsKt.plus((Collection) stateFlowImpl.getValue(), (Object) navBackStackEntry);
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, plus);
        }
    }

    public final NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle) {
        NavControllerImpl navControllerImpl = this.this$0.impl;
        navControllerImpl.getClass();
        return NavBackStackEntry.Companion.create$default(navControllerImpl.navController.navContext, navDestination, bundle, navControllerImpl.getHostLifecycleState$navigation_runtime_release(), navControllerImpl.viewModel);
    }

    public final void markTransitionComplete(NavBackStackEntry navBackStackEntry) {
        NavControllerViewModel navControllerViewModel;
        navBackStackEntry.getClass();
        NavControllerImpl navControllerImpl = this.this$0.impl;
        StateFlowImpl stateFlowImpl = navControllerImpl._visibleEntries;
        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.impl;
        LinkedHashMap linkedHashMap = navControllerImpl.entrySavedState;
        boolean areEqual = Intrinsics.areEqual(linkedHashMap.get(navBackStackEntry), Boolean.TRUE);
        StateFlowImpl stateFlowImpl2 = this._transitionsInProgress;
        stateFlowImpl2.updateState(null, SetsKt___SetsKt.minus((Set) stateFlowImpl2.getValue(), navBackStackEntry));
        linkedHashMap.remove(navBackStackEntry);
        ArrayDeque arrayDeque = navControllerImpl.backQueue;
        if (arrayDeque.contains(navBackStackEntry)) {
            if (this.isNavigating) {
                return;
            }
            navControllerImpl.updateBackStackLifecycle$navigation_runtime_release();
            StateFlowImpl stateFlowImpl3 = navControllerImpl._currentBackStack;
            ArrayList arrayList = new ArrayList(arrayDeque);
            stateFlowImpl3.getClass();
            stateFlowImpl3.updateState(null, arrayList);
            ArrayList populateVisibleEntries$navigation_runtime_release = navControllerImpl.populateVisibleEntries$navigation_runtime_release();
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, populateVisibleEntries$navigation_runtime_release);
            return;
        }
        navControllerImpl.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
        String str = navBackStackEntry.id;
        if (navBackStackEntryImpl.lifecycle.state.isAtLeast(Lifecycle.State.CREATED)) {
            navBackStackEntryImpl.maxLifecycle = Lifecycle.State.DESTROYED;
            navBackStackEntryImpl.updateState$navigation_common_release();
        }
        if (!arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).id, str)) {
                    break;
                }
            }
        }
        if (!areEqual && (navControllerViewModel = navControllerImpl.viewModel) != null) {
            str.getClass();
            ViewModelStore viewModelStore = (ViewModelStore) navControllerViewModel.viewModelStores.remove(str);
            if (viewModelStore != null) {
                viewModelStore.clear();
            }
        }
        navControllerImpl.updateBackStackLifecycle$navigation_runtime_release();
        ArrayList populateVisibleEntries$navigation_runtime_release2 = navControllerImpl.populateVisibleEntries$navigation_runtime_release();
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, populateVisibleEntries$navigation_runtime_release2);
    }

    public final void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        int i;
        synchronized (this.backStackLock) {
            try {
                ArrayList mutableList = CollectionsKt.toMutableList((Collection) this.backStack.$$delegate_0.getValue());
                ListIterator listIterator = mutableList.listIterator(mutableList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.areEqual(((NavBackStackEntry) listIterator.previous()).id, navBackStackEntry.id)) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                mutableList.set(i, navBackStackEntry);
                StateFlowImpl stateFlowImpl = this._backStack;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, mutableList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void pop(NavBackStackEntry navBackStackEntry, boolean z) {
        navBackStackEntry.getClass();
        NavControllerImpl navControllerImpl = this.this$0.impl;
        DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(this, navBackStackEntry, z);
        navControllerImpl.getClass();
        Navigator navigator = navControllerImpl._navigatorProvider.getNavigator(navBackStackEntry.destination.navigatorName);
        navControllerImpl.entrySavedState.put(navBackStackEntry, Boolean.valueOf(z));
        if (!navigator.equals(this.navigator)) {
            Object obj = navControllerImpl.navigatorState.get(navigator);
            obj.getClass();
            ((NavController$NavControllerNavigatorState) obj).pop(navBackStackEntry, z);
            return;
        }
        MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = navControllerImpl.popFromBackStackHandler;
        if (menuKt$$ExternalSyntheticLambda0 != null) {
            menuKt$$ExternalSyntheticLambda0.invoke(navBackStackEntry);
            dialogHostKt$$ExternalSyntheticLambda0.invoke();
            return;
        }
        ArrayDeque arrayDeque = navControllerImpl.backQueue;
        int indexOf = arrayDeque.indexOf(navBackStackEntry);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != arrayDeque.size) {
            navControllerImpl.popBackStackInternal$navigation_runtime_release(((NavBackStackEntry) arrayDeque.get(i)).destination.impl.id, true, false);
        }
        NavControllerImpl.popEntryFromBackStack$navigation_runtime_release$default(navControllerImpl, navBackStackEntry);
        dialogHostKt$$ExternalSyntheticLambda0.invoke();
        navControllerImpl.updateOnBackPressedCallbackEnabledCallback.invoke();
        navControllerImpl.dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void popWithTransition(NavBackStackEntry navBackStackEntry, boolean z) {
        Object obj;
        StateFlowImpl stateFlowImpl = this._transitionsInProgress;
        Iterable iterable = (Iterable) stateFlowImpl.getValue();
        boolean z2 = iterable instanceof Collection;
        ReadonlyStateFlow readonlyStateFlow = this.backStack;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) readonlyStateFlow.$$delegate_0.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                        }
                    }
                    return;
                }
            }
        }
        stateFlowImpl.updateState(null, SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), navBackStackEntry));
        StateFlow stateFlow = readonlyStateFlow.$$delegate_0;
        StateFlow stateFlow2 = readonlyStateFlow.$$delegate_0;
        List list = (List) stateFlow.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (!Intrinsics.areEqual(navBackStackEntry2, navBackStackEntry) && ((List) stateFlow2.getValue()).lastIndexOf(navBackStackEntry2) < ((List) stateFlow2.getValue()).lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
        if (navBackStackEntry3 != null) {
            stateFlowImpl.updateState(null, SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), navBackStackEntry3));
        }
        pop(navBackStackEntry, z);
    }

    public final void prepareForTransition(NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        StateFlowImpl stateFlowImpl = this._transitionsInProgress;
        stateFlowImpl.updateState(null, SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), navBackStackEntry));
        NavControllerImpl navControllerImpl = this.this$0.impl;
        navControllerImpl.getClass();
        if (!navControllerImpl.backQueue.contains(navBackStackEntry)) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot transition entry that is not in the back stack");
            return;
        }
        Lifecycle.State state = Lifecycle.State.STARTED;
        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.impl;
        navBackStackEntryImpl.getClass();
        navBackStackEntryImpl.maxLifecycle = state;
        navBackStackEntryImpl.updateState$navigation_common_release();
    }

    public final void push(NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        NavControllerImpl navControllerImpl = this.this$0.impl;
        navControllerImpl.getClass();
        Navigator navigator = navControllerImpl._navigatorProvider.getNavigator(navBackStackEntry.destination.navigatorName);
        if (!navigator.equals(this.navigator)) {
            Object obj = navControllerImpl.navigatorState.get(navigator);
            if (obj != null) {
                ((NavController$NavControllerNavigatorState) obj).push(navBackStackEntry);
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("NavigatorBackStack for "), navBackStackEntry.destination.navigatorName, " should already be created"));
                return;
            }
        }
        Function1 function1 = navControllerImpl.addToBackStackHandler;
        if (function1 != null) {
            function1.invoke(navBackStackEntry);
            addInternal(navBackStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.destination + " outside of the call to navigate(). ");
        }
    }

    public final void pushWithTransition(NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        StateFlowImpl stateFlowImpl = this._transitionsInProgress;
        Iterable iterable = (Iterable) stateFlowImpl.getValue();
        boolean z = iterable instanceof Collection;
        ReadonlyStateFlow readonlyStateFlow = this.backStack;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) readonlyStateFlow.$$delegate_0.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.lastOrNull((List) readonlyStateFlow.$$delegate_0.getValue());
        if (navBackStackEntry2 != null) {
            LinkedHashSet plus = SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), navBackStackEntry2);
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, plus);
        }
        LinkedHashSet plus2 = SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), navBackStackEntry);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, plus2);
        push(navBackStackEntry);
    }
}
