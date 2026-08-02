package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.internal.NavBackStackEntryStateImpl;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.EmptyMap;

/* loaded from: classes3.dex */
public final class NavBackStackEntryState {
    public final NavBackStackEntryStateImpl impl;

    public NavBackStackEntryState(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(NavBackStackEntryState.class.getClassLoader());
        this.impl = new NavBackStackEntryStateImpl(bundle);
    }

    public final Bundle writeToState() {
        NavBackStackEntryStateImpl navBackStackEntryStateImpl = this.impl;
        navBackStackEntryStateImpl.getClass();
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        String str = navBackStackEntryStateImpl.id;
        str.getClass();
        bundleOf.putString("nav-entry-state:id", str);
        bundleOf.putInt("nav-entry-state:destination-id", navBackStackEntryStateImpl.destinationId);
        Bundle bundle = navBackStackEntryStateImpl.args;
        if (bundle == null) {
            bundle = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        bundleOf.putBundle("nav-entry-state:args", bundle);
        Bundle bundle2 = navBackStackEntryStateImpl.savedState;
        bundle2.getClass();
        bundleOf.putBundle("nav-entry-state:saved-state", bundle2);
        return bundleOf;
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        this.impl = new NavBackStackEntryStateImpl(navBackStackEntry, navBackStackEntry.destination.impl.id);
    }
}
