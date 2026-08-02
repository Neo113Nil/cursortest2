package androidx.lifecycle;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.fragment.DialogFragmentNavigator$observer$1$WhenMappings;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.workflow1.ui.androidx.KeyedSavedStateRegistryOwner;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final Object generatedAdapters;

    public /* synthetic */ CompositeGeneratedAdaptersObserver(Object obj, int i) {
        this.$r8$classId = i;
        this.generatedAdapters = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i;
        LinkedHashMap linkedHashMap;
        Set<String> keySet;
        int i2 = this.$r8$classId;
        Object obj = this.generatedAdapters;
        Object obj2 = null;
        switch (i2) {
            case 0:
                new HashMap();
                GeneratedAdapter[] generatedAdapterArr = (GeneratedAdapter[]) obj;
                if (generatedAdapterArr.length > 0) {
                    GeneratedAdapter generatedAdapter = generatedAdapterArr[0];
                    throw null;
                }
                if (generatedAdapterArr.length <= 0) {
                    return;
                }
                GeneratedAdapter generatedAdapter2 = generatedAdapterArr[0];
                throw null;
            case 1:
                MiSnapView miSnapView = (MiSnapView) obj;
                if (event == Lifecycle.Event.ON_PAUSE) {
                    int i3 = MiSnapView.$r8$clinit;
                    miSnapView.a$1$2();
                    miSnapView.m.cancel(miSnapView.D);
                    MibiData.releaseSession(CompositeGeneratedAdaptersObserver.class.getName());
                    return;
                }
                return;
            case 2:
                DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) obj;
                int i4 = DialogFragmentNavigator$observer$1$WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i4 == 1) {
                    DialogFragment dialogFragment = (DialogFragment) lifecycleOwner;
                    Iterable iterable = (Iterable) dialogFragmentNavigator.getState().backStack.$$delegate_0.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).id, dialogFragment.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogFragment.dismiss();
                    return;
                }
                if (i4 == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) lifecycleOwner;
                    for (Object obj3 : (Iterable) dialogFragmentNavigator.getState().transitionsInProgress.$$delegate_0.getValue()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj3).id, dialogFragment2.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                    if (navBackStackEntry != null) {
                        dialogFragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
                        return;
                    }
                    return;
                }
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) lifecycleOwner;
                    for (Object obj4 : (Iterable) dialogFragmentNavigator.getState().transitionsInProgress.$$delegate_0.getValue()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj4).id, dialogFragment3.getTag())) {
                            obj2 = obj4;
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
                    if (navBackStackEntry2 != null) {
                        dialogFragmentNavigator.getState().markTransitionComplete(navBackStackEntry2);
                    }
                    dialogFragment3.getLifecycle().removeObserver(this);
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) lifecycleOwner;
                if (dialogFragment4.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) dialogFragmentNavigator.getState().backStack.$$delegate_0.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (Intrinsics.areEqual(((NavBackStackEntry) listIterator.previous()).id, dialogFragment4.getTag())) {
                        i = listIterator.nextIndex();
                    }
                }
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.getOrNull(i, list);
                if (!Intrinsics.areEqual(CollectionsKt.lastOrNull(list), navBackStackEntry3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (navBackStackEntry3 != null) {
                    dialogFragmentNavigator.popWithTransition(i, navBackStackEntry3, false);
                    return;
                }
                return;
            case 3:
                ((FragmentStateAdapter.FragmentMaxLifecycleEnforcer) obj).updateFragmentMaxLifecycle(false);
                return;
            default:
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj;
                if (event != Lifecycle.Event.ON_CREATE) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) Intrinsics.stringPlus(event, "Expected to receive ON_CREATE event before anything else, but got "));
                    return;
                }
                if (((LinkedHashMap) markwonConfiguration.theme) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Expected not to be observing lifecycle after restoration.");
                    return;
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
                SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) markwonConfiguration.syntaxHighlight;
                savedStateRegistryOwner.getClass();
                SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                String str = (String) markwonConfiguration.linkResolver;
                str.getClass();
                Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str);
                if (((LinkedHashMap) markwonConfiguration.theme) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Expected performRestore to be called only once.");
                    return;
                }
                markwonConfiguration.theme = new LinkedHashMap();
                if (consumeRestoredStateForKey != null && (keySet = consumeRestoredStateForKey.keySet()) != null) {
                    for (String str2 : keySet) {
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) markwonConfiguration.theme;
                        linkedHashMap2.getClass();
                        Bundle bundle = consumeRestoredStateForKey.getBundle(str2);
                        bundle.getClass();
                        linkedHashMap2.put(str2, bundle);
                    }
                }
                for (KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwner : ((LinkedHashMap) markwonConfiguration.imageDestinationProcessor).values()) {
                    if (keyedSavedStateRegistryOwner.$$delegate_0.getLifecycle().getCurrentState() == Lifecycle.State.INITIALIZED && (linkedHashMap = (LinkedHashMap) markwonConfiguration.theme) != null) {
                        keyedSavedStateRegistryOwner.controller.performRestore((Bundle) linkedHashMap.remove(keyedSavedStateRegistryOwner.key));
                    }
                }
                return;
        }
    }
}
