package androidx.navigation.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;

@Navigator.Name("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/compose/ComposeNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "Destination", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeNavigator extends Navigator {
    public final ParcelableSnapshotMutableState isPop = Updater.mutableStateOf$default(Boolean.FALSE);

    public final class Destination extends NavDestination {
        public final Function4 content;

        public Destination(ComposeNavigator composeNavigator, ComposableLambdaImpl composableLambdaImpl) {
            super(composeNavigator);
            this.content = composableLambdaImpl;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.lambda$127448943);
    }

    @Override // androidx.navigation.Navigator
    public final void navigate(List list, NavOptions navOptions) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.Navigator
    public final void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        getState().popWithTransition(navBackStackEntry, z);
        this.isPop.setValue(Boolean.TRUE);
    }
}
