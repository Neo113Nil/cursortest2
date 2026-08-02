package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.StateFlowImpl;

@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Destination", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogFragmentNavigator extends Navigator {
    public final Context context;
    public final FragmentManager fragmentManager;
    public final CompositeGeneratedAdaptersObserver observer;
    public final LinkedHashSet restoredTagsAwaitingAttach;
    public final LinkedHashMap transitioningFragments;

    public final class Destination extends NavDestination implements FloatingWindow {
        public String _className;

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof Destination) && super.equals(obj) && Intrinsics.areEqual(this._className, ((Destination) obj)._className);
        }

        public final String getClassName() {
            String str = this._className;
            if (str != null) {
                str.getClass();
                return str;
            }
            a$$ExternalSyntheticBUOutline0.m$1("DialogFragment class was not set");
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this._className;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        public final void onInflate(Context context, AttributeSet attributeSet) {
            context.getClass();
            super.onInflate(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.DialogFragmentNavigator);
            obtainAttributes.getClass();
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                this._className = string2;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        context.getClass();
        fragmentManager.getClass();
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new CompositeGeneratedAdaptersObserver(this, 2);
        this.transitioningFragments = new LinkedHashMap();
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination createDestination() {
        return new Destination(this);
    }

    public final DialogFragment createDialogFragment(NavBackStackEntry navBackStackEntry) {
        NavDestination navDestination = navBackStackEntry.destination;
        navDestination.getClass();
        Destination destination = (Destination) navDestination;
        String className = destination.getClassName();
        char charAt = className.charAt(0);
        Context context = this.context;
        if (charAt == '.') {
            className = context.getPackageName() + className;
        }
        Fragment instantiate = this.fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), className);
        instantiate.getClass();
        if (!DialogFragment.class.isAssignableFrom(instantiate.getClass())) {
            a$$ExternalSyntheticBUOutline0.m("Dialog destination ", destination.getClassName(), " is not an instance of DialogFragment");
            return null;
        }
        DialogFragment dialogFragment = (DialogFragment) instantiate;
        dialogFragment.setArguments(navBackStackEntry.impl.getArguments$navigation_common_release());
        dialogFragment.getLifecycle().addObserver(this.observer);
        this.transitioningFragments.put(navBackStackEntry.id, dialogFragment);
        return dialogFragment;
    }

    @Override // androidx.navigation.Navigator
    public final void navigate(List list, NavOptions navOptions) {
        list.getClass();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            createDialogFragment(navBackStackEntry).show(fragmentManager, navBackStackEntry.id);
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.lastOrNull((List) getState().backStack.$$delegate_0.getValue());
            boolean contains = CollectionsKt.contains((Iterable) getState().transitionsInProgress.$$delegate_0.getValue(), navBackStackEntry2);
            getState().pushWithTransition(navBackStackEntry);
            if (navBackStackEntry2 != null && !contains) {
                getState().markTransitionComplete(navBackStackEntry2);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void onAttach(NavController$NavControllerNavigatorState navController$NavControllerNavigatorState) {
        Lifecycle lifecycle;
        this._state = navController$NavControllerNavigatorState;
        this.isAttached = true;
        Iterator it = ((List) navController$NavControllerNavigatorState.backStack.$$delegate_0.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            FragmentManager fragmentManager = this.fragmentManager;
            if (!hasNext) {
                fragmentManager.mOnAttachListeners.add(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$$ExternalSyntheticLambda0
                    @Override // androidx.fragment.app.FragmentOnAttachListener
                    public final void onAttachFragment(FragmentManager fragmentManager2, Fragment fragment) {
                        fragmentManager2.getClass();
                        DialogFragmentNavigator dialogFragmentNavigator = DialogFragmentNavigator.this;
                        LinkedHashSet linkedHashSet = dialogFragmentNavigator.restoredTagsAwaitingAttach;
                        if (TypeIntrinsics.asMutableCollection(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getLifecycle().addObserver(dialogFragmentNavigator.observer);
                        }
                        LinkedHashMap linkedHashMap = dialogFragmentNavigator.transitioningFragments;
                        TypeIntrinsics.asMutableMap(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(navBackStackEntry.id);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.id);
            } else {
                lifecycle.addObserver(this.observer);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        String str = navBackStackEntry.id;
        DialogFragment dialogFragment = (DialogFragment) this.transitioningFragments.get(str);
        if (dialogFragment == null) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().removeObserver(this.observer);
            dialogFragment.dismiss();
        }
        createDialogFragment(navBackStackEntry).show(fragmentManager, str);
        NavController$NavControllerNavigatorState state = getState();
        List list = (List) state.backStack.$$delegate_0.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntry2.id, str)) {
                StateFlowImpl stateFlowImpl = state._transitionsInProgress;
                stateFlowImpl.updateState(null, SetsKt___SetsKt.plus(SetsKt___SetsKt.plus((Set) stateFlowImpl.getValue(), navBackStackEntry2), navBackStackEntry));
                state.onLaunchSingleTop(navBackStackEntry);
                return;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("List contains no element matching the predicate.");
    }

    @Override // androidx.navigation.Navigator
    public final void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().backStack.$$delegate_0.getValue();
        int indexOf = list.indexOf(navBackStackEntry);
        Iterator it = CollectionsKt.reversed(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(((NavBackStackEntry) it.next()).id);
            if (findFragmentByTag != null) {
                ((DialogFragment) findFragmentByTag).dismiss();
            }
        }
        popWithTransition(indexOf, navBackStackEntry, z);
    }

    public final void popWithTransition(int i, NavBackStackEntry navBackStackEntry, boolean z) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.getOrNull(i - 1, (List) getState().backStack.$$delegate_0.getValue());
        boolean contains = CollectionsKt.contains((Iterable) getState().transitionsInProgress.$$delegate_0.getValue(), navBackStackEntry2);
        getState().popWithTransition(navBackStackEntry, z);
        if (navBackStackEntry2 == null || contains) {
            return;
        }
        getState().markTransitionComplete(navBackStackEntry2);
    }
}
