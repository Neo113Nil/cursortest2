package androidx.navigation.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavBackStackEntry;
import androidx.savedstate.SavedStateReaderKt;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.EmptyMap;

/* loaded from: classes3.dex */
public final class NavBackStackEntryStateImpl {
    public final Bundle args;
    public final int destinationId;
    public final String id;
    public final Bundle savedState;

    public NavBackStackEntryStateImpl(Bundle bundle) {
        bundle.getClass();
        String string2 = bundle.getString("nav-entry-state:id");
        if (string2 == null) {
            SavedStateReaderKt.keyOrValueNotFoundError("nav-entry-state:id");
            throw null;
        }
        this.id = string2;
        this.destinationId = BundleKt.m1095getIntimpl(bundle, "nav-entry-state:destination-id");
        this.args = BundleKt.m1096getSavedStateimpl(bundle, "nav-entry-state:args");
        this.savedState = BundleKt.m1096getSavedStateimpl(bundle, "nav-entry-state:saved-state");
    }

    public NavBackStackEntryStateImpl(NavBackStackEntry navBackStackEntry, int i) {
        this.id = navBackStackEntry.id;
        this.destinationId = i;
        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.impl;
        this.args = navBackStackEntryImpl.getArguments$navigation_common_release();
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.savedState = bundleOf;
        navBackStackEntryImpl.savedStateRegistryController.performSave(bundleOf);
    }
}
