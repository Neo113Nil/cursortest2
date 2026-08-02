package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.PopBackStackState;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigation.Navigator;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.checks.CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import okio.Path$$ExternalSyntheticBUOutline0;

@Navigator.Name(BreadcrumbHelper.Category.FRAGMENT)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Destination", "ClearEntryStateViewModel", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FragmentNavigator extends Navigator {
    public final int containerId;
    public final Context context;
    public final FragmentManager fragmentManager;
    public final Lifecycle$$ExternalSyntheticLambda0 fragmentObserver;
    public final CachedPageEventFlow$$ExternalSyntheticLambda0 fragmentViewObserver;
    public final ArrayList pendingOps;
    public final LinkedHashSet savedIds;

    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference completeTransition;

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            WeakReference weakReference = this.completeTransition;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
                throw null;
            }
            Function0 function0 = (Function0) weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final class Destination extends NavDestination {
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
            a$$ExternalSyntheticBUOutline0.m$1("Fragment class was not set");
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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.FragmentNavigator);
            obtainAttributes.getClass();
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                this._className = string2;
            }
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i) {
        context.getClass();
        fragmentManager.getClass();
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new Lifecycle$$ExternalSyntheticLambda0(this, 2);
        this.fragmentViewObserver = new CachedPageEventFlow$$ExternalSyntheticLambda0(this, 13);
    }

    public static void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = fragmentNavigator.pendingOps;
        if (z2) {
            CollectionsKt__MutableCollectionsKt.removeAll(arrayList, new IconKt$$ExternalSyntheticLambda0(str, 11));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean isLoggingEnabled() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    public final void attachClearViewModel$navigation_fragment_release(Fragment fragment, NavBackStackEntry navBackStackEntry, NavController$NavControllerNavigatorState navController$NavControllerNavigatorState) {
        fragment.getClass();
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        Navigation$$ExternalSyntheticLambda1 navigation$$ExternalSyntheticLambda1 = new Navigation$$ExternalSyntheticLambda1(27);
        ReflectionFactory reflectionFactory = Reflection.factory;
        chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ClearEntryStateViewModel.class), navigation$$ExternalSyntheticLambda1);
        InitializerViewModelFactory build = chunkIndexMerger.build();
        CreationExtras.Empty empty = CreationExtras.Empty.INSTANCE;
        empty.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, build, empty);
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(ClearEntryStateViewModel.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        } else {
            ((ClearEntryStateViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass)).completeTransition = new WeakReference(new DialogHostKt$$ExternalSyntheticLambda0(navBackStackEntry, navController$NavControllerNavigatorState, this, fragment));
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination createDestination() {
        return new Destination(this);
    }

    public final BackStackRecord createFragmentTransaction(NavBackStackEntry navBackStackEntry, NavOptions navOptions) {
        NavDestination navDestination = navBackStackEntry.destination;
        navDestination.getClass();
        Bundle arguments$navigation_common_release = navBackStackEntry.impl.getArguments$navigation_common_release();
        String className = ((Destination) navDestination).getClassName();
        char charAt = className.charAt(0);
        Context context = this.context;
        if (charAt == '.') {
            className = context.getPackageName() + className;
        }
        FragmentManager fragmentManager = this.fragmentManager;
        Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), className);
        instantiate.getClass();
        instantiate.setArguments(arguments$navigation_common_release);
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        int i = navOptions != null ? navOptions.enterAnim : -1;
        int i2 = navOptions != null ? navOptions.exitAnim : -1;
        int i3 = navOptions != null ? navOptions.popEnterAnim : -1;
        int i4 = navOptions != null ? navOptions.popExitAnim : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            backStackRecord.mEnterAnim = i;
            backStackRecord.mExitAnim = i2;
            backStackRecord.mPopEnterAnim = i3;
            backStackRecord.mPopExitAnim = i5;
        }
        backStackRecord.replace(this.containerId, navBackStackEntry.id, instantiate);
        backStackRecord.setPrimaryNavigationFragment(instantiate);
        backStackRecord.mReorderingAllowed = true;
        return backStackRecord;
    }

    @Override // androidx.navigation.Navigator
    public final void navigate(List list, NavOptions navOptions) {
        list.getClass();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            boolean isEmpty = ((List) getState().backStack.$$delegate_0.getValue()).isEmpty();
            if (navOptions == null || isEmpty || !navOptions.restoreState || !this.savedIds.remove(navBackStackEntry.id)) {
                BackStackRecord createFragmentTransaction = createFragmentTransaction(navBackStackEntry, navOptions);
                String str = navBackStackEntry.id;
                if (!isEmpty) {
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.lastOrNull((List) getState().backStack.$$delegate_0.getValue());
                    if (navBackStackEntry2 != null) {
                        addPendingOps$default(this, navBackStackEntry2.id, 6);
                    }
                    addPendingOps$default(this, str, 6);
                    createFragmentTransaction.addToBackStack(str);
                }
                createFragmentTransaction.commit();
                if (isLoggingEnabled()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + navBackStackEntry);
                }
                getState().pushWithTransition(navBackStackEntry);
            } else {
                fragmentManager.enqueueAction(new FragmentManager.SaveBackStackState(fragmentManager, navBackStackEntry.id, 1), false);
                getState().pushWithTransition(navBackStackEntry);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void onAttach(final NavController$NavControllerNavigatorState navController$NavControllerNavigatorState) {
        this._state = navController$NavControllerNavigatorState;
        this.isAttached = true;
        if (isLoggingEnabled()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        FragmentOnAttachListener fragmentOnAttachListener = new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda3
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                Object obj;
                fragmentManager.getClass();
                NavController$NavControllerNavigatorState navController$NavControllerNavigatorState2 = NavController$NavControllerNavigatorState.this;
                List list = (List) navController$NavControllerNavigatorState2.backStack.$$delegate_0.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj).id, fragment.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                boolean isLoggingEnabled = FragmentNavigator.isLoggingEnabled();
                FragmentNavigator fragmentNavigator = this;
                if (isLoggingEnabled) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + navBackStackEntry + " to FragmentManager " + fragmentNavigator.fragmentManager);
                }
                if (navBackStackEntry != null) {
                    fragment.getViewLifecycleOwnerLiveData().observe(fragment, new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(3, new MenuKt$$ExternalSyntheticLambda0(25, fragmentNavigator, fragment, navBackStackEntry)));
                    fragment.getLifecycle().addObserver(fragmentNavigator.fragmentObserver);
                    fragmentNavigator.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, navController$NavControllerNavigatorState2);
                }
            }
        };
        FragmentManager fragmentManager = this.fragmentManager;
        fragmentManager.mOnAttachListeners.add(fragmentOnAttachListener);
        fragmentManager.mBackStackChangeListeners.add(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator$onAttach$2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChangeCommitted(Fragment fragment, boolean z) {
                Object obj;
                Object obj2;
                FragmentNavigator fragmentNavigator = this;
                ArrayList arrayList = fragmentNavigator.pendingOps;
                fragment.getClass();
                NavController$NavControllerNavigatorState navController$NavControllerNavigatorState2 = NavController$NavControllerNavigatorState.this;
                ArrayList plus = CollectionsKt.plus((Iterable) navController$NavControllerNavigatorState2.transitionsInProgress.$$delegate_0.getValue(), (Collection) navController$NavControllerNavigatorState2.backStack.$$delegate_0.getValue());
                ListIterator listIterator = plus.listIterator(plus.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = listIterator.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj2).id, fragment.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                boolean z2 = z && arrayList.isEmpty() && fragment.isRemoving();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((Pair) next).first, fragment.getTag())) {
                        obj = next;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    arrayList.remove(pair);
                }
                if (!z2 && FragmentNavigator.isLoggingEnabled()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                }
                boolean z3 = pair != null && ((Boolean) pair.second).booleanValue();
                if (!z && !z3 && navBackStackEntry == null) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Fragment$5$$ExternalSyntheticOutline0.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
                    return;
                }
                if (navBackStackEntry != null) {
                    fragmentNavigator.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, navController$NavControllerNavigatorState2);
                    if (z2) {
                        if (FragmentNavigator.isLoggingEnabled()) {
                            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + navBackStackEntry + " via system back");
                        }
                        navController$NavControllerNavigatorState2.popWithTransition(navBackStackEntry, false);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChangeStarted(Fragment fragment, boolean z) {
                Object obj;
                fragment.getClass();
                if (z) {
                    NavController$NavControllerNavigatorState navController$NavControllerNavigatorState2 = NavController$NavControllerNavigatorState.this;
                    List list = (List) navController$NavControllerNavigatorState2.backStack.$$delegate_0.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        } else {
                            obj = listIterator.previous();
                            if (Intrinsics.areEqual(((NavBackStackEntry) obj).id, fragment.getTag())) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (FragmentNavigator.isLoggingEnabled()) {
                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        navController$NavControllerNavigatorState2.prepareForTransition(navBackStackEntry);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public final void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        String str = navBackStackEntry.id;
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        BackStackRecord createFragmentTransaction = createFragmentTransaction(navBackStackEntry, null);
        List list = (List) getState().backStack.$$delegate_0.getValue();
        if (list.size() > 1) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.getOrNull(list.size() - 2, list);
            if (navBackStackEntry2 != null) {
                addPendingOps$default(this, navBackStackEntry2.id, 6);
            }
            addPendingOps$default(this, str, 4);
            fragmentManager.enqueueAction(fragmentManager.new PopBackStackState(str, -1, 1), false);
            addPendingOps$default(this, str, 2);
            createFragmentTransaction.addToBackStack(str);
        }
        createFragmentTransaction.commit();
        getState().onLaunchSingleTop(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public final void onRestoreState(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.savedIds;
            linkedHashSet.clear();
            CollectionsKt__MutableCollectionsKt.addAll(stringArrayList, linkedHashSet);
        }
    }

    @Override // androidx.navigation.Navigator
    public final Bundle onSaveState() {
        LinkedHashSet linkedHashSet = this.savedIds;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.navigation.Navigator
    public final void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        Iterator it;
        int i;
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().backStack.$$delegate_0.getValue();
        int indexOf = list.indexOf(navBackStackEntry);
        List subList = list.subList(indexOf, list.size());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.first(list);
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.getOrNull(indexOf - 1, list);
        if (navBackStackEntry3 != null) {
            addPendingOps$default(this, navBackStackEntry3.id, 6);
        }
        List list2 = subList;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            int i2 = 0;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    addPendingOps$default(this, ((NavBackStackEntry) it3.next()).id, 4);
                }
                if (z) {
                    for (NavBackStackEntry navBackStackEntry4 : CollectionsKt.reversed(list2)) {
                        if (Intrinsics.areEqual(navBackStackEntry4, navBackStackEntry2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry4);
                        } else {
                            fragmentManager.enqueueAction(new FragmentManager.SaveBackStackState(fragmentManager, navBackStackEntry4.id, i2), false);
                            this.savedIds.add(navBackStackEntry4.id);
                        }
                    }
                } else {
                    fragmentManager.enqueueAction(fragmentManager.new PopBackStackState(navBackStackEntry.id, -1, 1), false);
                }
                if (isLoggingEnabled()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + navBackStackEntry + " with savedState " + z);
                }
                getState().popWithTransition(navBackStackEntry, z);
                return;
            }
            Object next = it2.next();
            NavBackStackEntry navBackStackEntry5 = (NavBackStackEntry) next;
            TransformingSequence map = SequencesKt___SequencesKt.map(CollectionsKt.asSequence(this.pendingOps), new Navigation$$ExternalSyntheticLambda1(26));
            String str = navBackStackEntry5.id;
            Iterator it4 = map.sequence.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    it = it2;
                    i = -1;
                    break;
                }
                it = it2;
                Object invoke = map.transformer.invoke(it4.next());
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                if (Intrinsics.areEqual(str, invoke)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                    it2 = it;
                }
            }
            if (i >= 0 || !Intrinsics.areEqual(navBackStackEntry5.id, navBackStackEntry2.id)) {
                arrayList.add(next);
            }
            it2 = it;
        }
    }
}
