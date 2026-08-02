package androidx.lifecycle;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import com.miteksystems.misnap.workflow.view.TorchView;
import com.squareup.cash.R;
import com.squareup.cash.money.views.HypeWelcomeVideoKt$WhenMappings;
import com.stripe.android.financialconnections.navigation.bottomsheet.BackstackSafeContentKt$WhenMappings;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class Lifecycle$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Lifecycle$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        Object obj = null;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((StateFlowImpl) obj2).updateState(null, event.getTargetState());
                break;
            case 1:
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) ((ProducerScope) obj2);
                producerCoroutine.mo1159trySendJP2dKIU(event);
                if (event == Lifecycle.Event.ON_DESTROY) {
                    producerCoroutine.close(null);
                    break;
                }
                break;
            case 2:
                FragmentNavigator fragmentNavigator = (FragmentNavigator) obj2;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Fragment fragment = (Fragment) lifecycleOwner;
                    for (Object obj3 : (Iterable) fragmentNavigator.getState().transitionsInProgress.$$delegate_0.getValue()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj3).id, fragment.getTag())) {
                            obj = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    if (navBackStackEntry != null) {
                        if (FragmentNavigator.isLoggingEnabled()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " lifecycle reaching DESTROYED");
                        }
                        fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
                        break;
                    }
                }
                break;
            case 3:
                NavControllerImpl navControllerImpl = (NavControllerImpl) obj2;
                navControllerImpl.hostLifecycleState = event.getTargetState();
                if (navControllerImpl._graph != null) {
                    Iterator it = CollectionsKt.toMutableList((Collection) navControllerImpl.backQueue).iterator();
                    while (it.hasNext()) {
                        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
                        navBackStackEntry2.getClass();
                        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry2.impl;
                        navBackStackEntryImpl.getClass();
                        navBackStackEntryImpl.entry.hostLifecycleState = event.getTargetState();
                        navBackStackEntryImpl.hostLifecycleState = event.getTargetState();
                        navBackStackEntryImpl.updateState$navigation_common_release();
                    }
                    break;
                }
                break;
            case 4:
                TorchView torchView = (TorchView) obj2;
                int i2 = TorchView.$r8$clinit;
                if (event == Lifecycle.Event.ON_RESUME) {
                    String string2 = torchView.getResources().getString(torchView.h ? R.string.misnapWorkflowTorchViewAccessibilityTorchOn : R.string.misnapWorkflowTorchViewAccessibilityTorchOff);
                    string2.getClass();
                    WindowCompat$Api35Impl.announceStateOnScreenReader$workflow_release(torchView, string2);
                    break;
                }
                break;
            case 5:
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                int i3 = HypeWelcomeVideoKt$WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i3 == 1) {
                    ((ExoPlayerImpl) exoPlayer).setPlayWhenReady(false);
                    break;
                } else if (i3 == 2) {
                    ((ExoPlayerImpl) exoPlayer).setPlayWhenReady(true);
                    break;
                }
                break;
            default:
                MutableState mutableState = (MutableState) obj2;
                int i4 = BackstackSafeContentKt$WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i4 == 1) {
                    mutableState.setValue(Boolean.TRUE);
                    break;
                } else if (i4 == 2) {
                    mutableState.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
