package androidx.core.view;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.DispatchQueue;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletMerchantSheetViewEvent;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.EngineSurfaceTarget;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.views.effect.SwampGLEffectKt$WhenMappings;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda1 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) obj2;
                MenuProvider menuProvider = (MenuProvider) obj;
                menuHostHelper.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.removeMenuProvider(menuProvider);
                    break;
                }
                break;
            case 1:
                LifecycleController lifecycleController = (LifecycleController) obj2;
                Job job = (Job) obj;
                if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    int compareTo = lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState);
                    DispatchQueue dispatchQueue = lifecycleController.dispatchQueue;
                    if (compareTo >= 0) {
                        if (dispatchQueue.paused) {
                            if (!dispatchQueue.finished) {
                                dispatchQueue.paused = false;
                                dispatchQueue.drainQueue();
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("Cannot resume a finished dispatcher");
                                break;
                            }
                        }
                    } else {
                        dispatchQueue.paused = true;
                        break;
                    }
                } else {
                    job.cancel(null);
                    lifecycleController.finish();
                    break;
                }
                break;
            case 2:
                FragmentNavigator fragmentNavigator = (FragmentNavigator) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (event == Lifecycle.Event.ON_RESUME && ((List) fragmentNavigator.getState().backStack.$$delegate_0.getValue()).contains(navBackStackEntry)) {
                    if (FragmentNavigator.isLoggingEnabled()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching RESUMED");
                    }
                    fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    if (FragmentNavigator.isLoggingEnabled()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching DESTROYED");
                    }
                    fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
                    break;
                }
                break;
            case 3:
                MutableState mutableState = (MutableState) obj2;
                Function1 function1 = (Function1) obj;
                if (event == Lifecycle.Event.ON_RESUME) {
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        function1.invoke(AfterpayAppletMerchantSheetViewEvent.SheetViewedFromForeground.INSTANCE);
                        break;
                    } else {
                        mutableState.setValue(Boolean.FALSE);
                        break;
                    }
                }
                break;
            case 4:
                Context context = (Context) obj2;
                Function1 function12 = (Function1) obj;
                if (event == Lifecycle.Event.ON_RESUME) {
                    NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
                    function12.invoke(new FidesmoProvisioningViewEvent.ActivityResumed(defaultAdapter != null && defaultAdapter.isEnabled()));
                    break;
                }
                break;
            default:
                EngineSurfaceTarget engineSurfaceTarget = (EngineSurfaceTarget) obj2;
                EngineSurfaceViewTarget engineSurfaceViewTarget = (EngineSurfaceViewTarget) obj;
                int i2 = SwampGLEffectKt$WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i2 == 1) {
                    if (engineSurfaceTarget != null) {
                        Engine engine = engineSurfaceTarget.engine;
                        BinaryBitmap binaryBitmap = engine.frameScheduler;
                        Scene scene = engineSurfaceTarget.scene;
                        binaryBitmap.setTargetPaused(scene, engineSurfaceTarget.targetId, false);
                        engine.frameScheduler.requestRender(scene);
                    }
                    if (engineSurfaceViewTarget != null) {
                        Engine engine2 = engineSurfaceViewTarget.engine;
                        BinaryBitmap binaryBitmap2 = engine2.frameScheduler;
                        Scene scene2 = engineSurfaceViewTarget.scene;
                        binaryBitmap2.setTargetPaused(scene2, engineSurfaceViewTarget.targetId, false);
                        engine2.frameScheduler.requestRender(scene2);
                        break;
                    }
                } else if (i2 == 2) {
                    if (engineSurfaceTarget != null) {
                        engineSurfaceTarget.engine.frameScheduler.setTargetPaused(engineSurfaceTarget.scene, engineSurfaceTarget.targetId, true);
                    }
                    if (engineSurfaceViewTarget != null) {
                        engineSurfaceViewTarget.engine.frameScheduler.setTargetPaused(engineSurfaceViewTarget.scene, engineSurfaceViewTarget.targetId, true);
                        break;
                    }
                }
                break;
        }
    }
}
