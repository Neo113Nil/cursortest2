package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "Destination", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogNavigator extends Navigator {

    public final class Destination extends NavDestination implements FloatingWindow {
        public final ComposableLambdaImpl content;
        public final DialogProperties dialogProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(DialogNavigator dialogNavigator) {
            super(dialogNavigator);
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$DialogNavigatorKt.f13lambda$1092249270;
            DialogProperties dialogProperties = new DialogProperties(7);
            this.dialogProperties = dialogProperties;
            this.content = composableLambdaImpl;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination createDestination() {
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$DialogNavigatorKt.f13lambda$1092249270;
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public final void navigate(List list, NavOptions navOptions) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public final void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        getState().popWithTransition(navBackStackEntry, z);
        int indexOf = CollectionsKt.indexOf((Iterable) getState().transitionsInProgress.$$delegate_0.getValue(), navBackStackEntry);
        int i = 0;
        for (Object obj : (Iterable) getState().transitionsInProgress.$$delegate_0.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i > indexOf) {
                getState().markTransitionComplete(navBackStackEntry2);
            }
            i = i2;
        }
    }
}
