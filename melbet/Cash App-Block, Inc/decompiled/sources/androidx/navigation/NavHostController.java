package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavControllerImpl;
import androidx.savedstate.SavedStateReaderKt;
import androidx.savedstate.SavedStateWriterKt;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda2;
import com.squareup.cash.transfers.presenters.UtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavHostController {
    public final Activity activity;
    public final Context context;
    public boolean deepLinkHandled;
    public final boolean enableOnBackPressedCallback;
    public final NavControllerImpl impl;
    public final ActionBarPolicy navContext;
    public final Lazy navInflater$delegate;
    public final RedwoodLayoutKt$toAndroid$1 onBackPressedCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public NavHostController(Context context) {
        Object obj;
        context.getClass();
        this.context = context;
        Object[] objArr = 0;
        this.impl = new NavControllerImpl(this, new NavController$$ExternalSyntheticLambda0(this, 0));
        int i = 2;
        this.navContext = new ActionBarPolicy(context, i);
        Iterator it = SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(16), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) obj;
        this.onBackPressedCallback = new RedwoodLayoutKt$toAndroid$1(this, objArr == true ? 1 : 0, i);
        this.enableOnBackPressedCallback = true;
        NavigatorProvider navigatorProvider = this.impl._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this.impl._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.navInflater$delegate = LazyKt.lazy(new NavController$$ExternalSyntheticLambda0(this, 1));
    }

    public final void addOnDestinationChangedListener(HelpFragment$$ExternalSyntheticLambda2 helpFragment$$ExternalSyntheticLambda2) {
        helpFragment$$ExternalSyntheticLambda2.getClass();
        NavControllerImpl navControllerImpl = this.impl;
        navControllerImpl.getClass();
        navControllerImpl.onDestinationChangedListeners.add(helpFragment$$ExternalSyntheticLambda2);
        ArrayDeque arrayDeque = navControllerImpl.backQueue;
        if (arrayDeque.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.last();
        NavHostController navHostController = navControllerImpl.navController;
        NavDestination navDestination = navBackStackEntry.destination;
        navBackStackEntry.impl.getArguments$navigation_common_release();
        helpFragment$$ExternalSyntheticLambda2.onDestinationChanged(navHostController, navDestination);
    }

    public final NavBackStackEntry getPreviousBackStackEntry() {
        Object obj;
        Iterator it = CollectionsKt.reversed(this.impl.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt__SequencesKt.asSequence(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((NavBackStackEntry) obj).destination instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    public final void navigate(int i) {
        int i2;
        NavOptions navOptions;
        Bundle bundle;
        NavControllerImpl navControllerImpl = this.impl;
        NavDestination navDestination = navControllerImpl.backQueue.isEmpty() ? navControllerImpl._graph : ((NavBackStackEntry) navControllerImpl.backQueue.last()).destination;
        if (navDestination == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        NavAction action = navDestination.getAction(i);
        if (action != null) {
            navOptions = action.navOptions;
            i2 = action.destinationId;
            Bundle bundle2 = action.defaultArguments;
            if (bundle2 != null) {
                EmptyMap.INSTANCE.getClass();
                bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundle.putAll(bundle2);
            } else {
                bundle = null;
            }
        } else {
            i2 = i;
            navOptions = null;
            bundle = null;
        }
        if (i2 == 0 && navOptions != null) {
            String str = navOptions.popUpToRoute;
            boolean z = navOptions.popUpToInclusive;
            int i3 = navOptions.popUpToId;
            if (i3 != -1 || str != null) {
                if (str != null) {
                    if (navControllerImpl.popBackStackInternal$navigation_runtime_release(str, z, false)) {
                        navControllerImpl.dispatchOnDestinationChanged$navigation_runtime_release();
                        return;
                    }
                    return;
                } else {
                    if (i3 == -1 || !navControllerImpl.popBackStackInternal$navigation_runtime_release(i3, z, false)) {
                        return;
                    }
                    navControllerImpl.dispatchOnDestinationChanged$navigation_runtime_release();
                    return;
                }
            }
        }
        if (i2 == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        NavDestination findDestination$navigation_runtime_release = navControllerImpl.findDestination$navigation_runtime_release(i2, null);
        if (findDestination$navigation_runtime_release != null) {
            navControllerImpl.navigate$navigation_runtime_release(findDestination$navigation_runtime_release, bundle, navOptions);
            return;
        }
        int i4 = NavDestination.$r8$clinit;
        ActionBarPolicy actionBarPolicy = this.navContext;
        String displayName = NavDestination.Companion.getDisplayName(actionBarPolicy, i2);
        if (action == null) {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Navigation action/destination ", displayName, " cannot be found from the current destination ", navDestination);
            return;
        }
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Navigation destination ", displayName, " referenced from action ");
        m3m.append(NavDestination.Companion.getDisplayName(actionBarPolicy, i));
        m3m.append(" cannot be found from the current destination ");
        m3m.append(navDestination);
        throw new IllegalArgumentException(m3m.toString().toString());
    }

    public final boolean popBackStack() {
        NavControllerImpl navControllerImpl = this.impl;
        if (navControllerImpl.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination$navigation_runtime_release = navControllerImpl.getCurrentDestination$navigation_runtime_release();
        currentDestination$navigation_runtime_release.getClass();
        return navControllerImpl.popBackStackInternal$navigation_runtime_release(currentDestination$navigation_runtime_release.impl.id, true, false) && navControllerImpl.dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final void removeOnDestinationChangedListener(HelpFragment$$ExternalSyntheticLambda2 helpFragment$$ExternalSyntheticLambda2) {
        helpFragment$$ExternalSyntheticLambda2.getClass();
        NavControllerImpl navControllerImpl = this.impl;
        navControllerImpl.getClass();
        navControllerImpl.onDestinationChangedListeners.remove(helpFragment$$ExternalSyntheticLambda2);
    }

    public final void restoreState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.context.getClassLoader());
        }
        NavControllerImpl navControllerImpl = this.impl;
        LinkedHashMap linkedHashMap = navControllerImpl.backStackStates;
        if (bundle != null) {
            navControllerImpl.navigatorStateToRestore = bundle.containsKey("android-support-nav:controller:navigatorState") ? BundleKt.m1096getSavedStateimpl(bundle, "android-support-nav:controller:navigatorState") : null;
            navControllerImpl.backStackToRestore = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) BundleKt.m1097getSavedStateListimpl(bundle, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray == null) {
                    SavedStateReaderKt.keyOrValueNotFoundError("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (stringArrayList == null) {
                    SavedStateReaderKt.keyOrValueNotFoundError("android-support-nav:controller:backStackIds");
                    throw null;
                }
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    navControllerImpl.backStackMap.put(Integer.valueOf(intArray[i]), !Intrinsics.areEqual(stringArrayList.get(i2), "") ? stringArrayList.get(i2) : null);
                    i++;
                    i2 = i3;
                }
            }
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 == null) {
                    SavedStateReaderKt.keyOrValueNotFoundError("android-support-nav:controller:backStackStates");
                    throw null;
                }
                for (String str : stringArrayList2) {
                    if (bundle.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                        ArrayList m1097getSavedStateListimpl = BundleKt.m1097getSavedStateListimpl(bundle, "android-support-nav:controller:backStackStates:" + str);
                        ArrayDeque arrayDeque = new ArrayDeque(m1097getSavedStateListimpl.size());
                        Iterator it = m1097getSavedStateListimpl.iterator();
                        while (it.hasNext()) {
                            arrayDeque.addLast(new NavBackStackEntryState((Bundle) it.next()));
                        }
                        linkedHashMap.put(str, arrayDeque);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean valueOf = (z || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : null;
            this.deepLinkHandled = valueOf != null ? valueOf.booleanValue() : false;
        }
    }

    public final Bundle saveState() {
        Bundle bundle;
        NavControllerImpl navControllerImpl = this.impl;
        LinkedHashMap linkedHashMap = navControllerImpl.backStackStates;
        ArrayDeque arrayDeque = navControllerImpl.backQueue;
        LinkedHashMap linkedHashMap2 = navControllerImpl.backStackMap;
        ArrayList arrayList = new ArrayList();
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : MapsKt__MapsKt.toMap(navControllerImpl._navigatorProvider._navigators).entrySet()) {
            String str = (String) entry.getKey();
            Bundle onSaveState = ((Navigator) entry.getValue()).onSaveState();
            if (onSaveState != null) {
                arrayList.add(str);
                str.getClass();
                bundleOf.putBundle(str, onSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            EmptyMap.INSTANCE.getClass();
            bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            PlatformKt.m1341putStringListimpl(bundleOf, "android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundleOf);
        }
        if (!arrayDeque.isEmpty()) {
            if (bundle == null) {
                EmptyMap.INSTANCE.getClass();
                bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList2.add(new NavBackStackEntryState((NavBackStackEntry) it.next()).writeToState());
            }
            bundle.putParcelableArrayList("android-support-nav:controller:backStack", SavedStateWriterKt.toArrayListUnsafe(arrayList2));
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                EmptyMap.INSTANCE.getClass();
                bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                int i2 = i + 1;
                iArr[i] = intValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i = i2;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            PlatformKt.m1341putStringListimpl(bundle, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                EmptyMap.INSTANCE.getClass();
                bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                ArrayDeque arrayDeque2 = (ArrayDeque) entry3.getValue();
                arrayList4.add(str3);
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayDeque2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((NavBackStackEntryState) it2.next()).writeToState());
                }
                bundle.putParcelableArrayList(Recorder$$ExternalSyntheticOutline2.m("android-support-nav:controller:backStackStates:", str3), SavedStateWriterKt.toArrayListUnsafe(arrayList5));
            }
            PlatformKt.m1341putStringListimpl(bundle, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                EmptyMap.INSTANCE.getClass();
                bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        lifecycleOwner.getClass();
        NavControllerImpl navControllerImpl = this.impl;
        Lifecycle$$ExternalSyntheticLambda0 lifecycle$$ExternalSyntheticLambda0 = navControllerImpl.lifecycleObserver;
        if (lifecycleOwner.equals(navControllerImpl.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = navControllerImpl.lifecycleOwner;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(lifecycle$$ExternalSyntheticLambda0);
        }
        navControllerImpl.lifecycleOwner = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(lifecycle$$ExternalSyntheticLambda0);
    }

    public final void setViewModelStore(ViewModelStore viewModelStore) {
        viewModelStore.getClass();
        NavControllerImpl navControllerImpl = this.impl;
        navControllerImpl.getClass();
        if (Intrinsics.areEqual(navControllerImpl.viewModel, UtilsKt.getInstance(viewModelStore))) {
            return;
        }
        if (navControllerImpl.backQueue.isEmpty()) {
            navControllerImpl.viewModel = UtilsKt.getInstance(viewModelStore);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("ViewModelStore should be set before setGraph call");
        }
    }
}
