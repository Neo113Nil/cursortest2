package androidx.navigationevent.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.BundleKt;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import com.squareup.cash.R;

/* loaded from: classes.dex */
public abstract class LocalNavigationEventDispatcherOwner {
    public static final DynamicProvidableCompositionLocal LocalNavigationEventDispatcherOwner = new DynamicProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(21));

    public static NavigationEventDispatcherOwner getCurrent(Composer composer) {
        NavigationEventDispatcherOwner navigationEventDispatcherOwner;
        GapComposer gapComposer = (GapComposer) composer;
        NavigationEventDispatcherOwner navigationEventDispatcherOwner2 = (NavigationEventDispatcherOwner) gapComposer.consume(LocalNavigationEventDispatcherOwner);
        if (navigationEventDispatcherOwner2 != null) {
            gapComposer.startReplaceGroup(950834231);
            gapComposer.end(false);
            return navigationEventDispatcherOwner2;
        }
        gapComposer.startReplaceGroup(950836184);
        View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
        view.getClass();
        while (true) {
            navigationEventDispatcherOwner = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            NavigationEventDispatcherOwner navigationEventDispatcherOwner3 = tag instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) tag : null;
            if (navigationEventDispatcherOwner3 != null) {
                navigationEventDispatcherOwner = navigationEventDispatcherOwner3;
                break;
            }
            Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        gapComposer.end(false);
        return navigationEventDispatcherOwner;
    }
}
