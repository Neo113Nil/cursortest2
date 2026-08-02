package androidx.savedstate;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
public final class Recreator implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final SavedStateRegistryOwner owner;

    /* loaded from: classes3.dex */
    public final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        public final LinkedHashSet classes = new LinkedHashSet();

        public SavedStateProvider(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.registerSavedStateProvider("androidx.savedstate.Restarter", this);
        }

        public final void add(String str) {
            this.classes.add(str);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public final Bundle saveState() {
            EmptyMap.INSTANCE.getClass();
            Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            PlatformKt.m1341putStringListimpl(bundleOf, "classes_to_restore", CollectionsKt.toList(this.classes));
            return bundleOf;
        }
    }

    public /* synthetic */ Recreator(SavedStateRegistryOwner savedStateRegistryOwner, int i) {
        this.$r8$classId = i;
        this.owner = savedStateRegistryOwner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        SavedStateRegistryOwner savedStateRegistryOwner = this.owner;
        switch (i) {
            case 0:
                if (event != Lifecycle.Event.ON_CREATE) {
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "Next event must be ON_CREATE");
                    return;
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
                Bundle consumeRestoredStateForKey = savedStateRegistryOwner.getSavedStateRegistry().consumeRestoredStateForKey("androidx.savedstate.Restarter");
                if (consumeRestoredStateForKey == null) {
                    return;
                }
                ArrayList<String> stringArrayList = consumeRestoredStateForKey.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                ((LegacySavedStateHandleController.OnRecreation) ((SavedStateRegistry.AutoRecreated) newInstance)).onRecreated(savedStateRegistryOwner);
                            } catch (Exception e) {
                                OptionalProvider$$ExternalSyntheticLambda0.m(Recorder$$ExternalSyntheticOutline2.m("Failed to instantiate ", str), (Throwable) e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Class ", str, " wasn't found"), (Throwable) e3);
                        return;
                    }
                }
                return;
            default:
                ComponentActivity componentActivity = (ComponentActivity) savedStateRegistryOwner;
                ComponentActivity.access$ensureViewModelStore(componentActivity);
                componentActivity.getLifecycle().removeObserver(this);
                return;
        }
    }
}
