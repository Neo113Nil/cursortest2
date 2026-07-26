package androidx.core.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context.FrostHunterAnimationSetSparkPhantomCelestial7545;
import android.content.Context.FrostHunterBroadcastPrimePixel6628;
import android.content.Context.FrostHunterCanvasInfernoVortex4700;
import android.content.Context.FrostHunterDrawerLayoutEpicFusionShadow4742;
import android.content.Context.FrostHunterLicensingBlazeNebula6214;
import android.content.Context.FrostHunterNotificationSpectraTurbo8770;
import android.content.Context.FrostHunterTextInputLayoutLegendBeta2184;
import android.content.Context.FrostHunterVectorDrawableCompatDragonThunderDelta5772;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements FrostHunterNotificationSpectraTurbo8770 {
    public final FrostHunterDrawerLayoutEpicFusionShadow4742 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterDrawerLayoutEpicFusionShadow4742(this);

    public FrostHunterDrawerLayoutEpicFusionShadow4742 FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (FrostHunterCanvasInfernoVortex4700.FrostHunterStateCelestialNovaPixel8414(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!FrostHunterCanvasInfernoVortex4700.FrostHunterCameraXPixelTurboCosmos9814) {
                    try {
                        FrostHunterCanvasInfernoVortex4700.FrostHunterFlowMaxDragonHero5809 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    FrostHunterCanvasInfernoVortex4700.FrostHunterCameraXPixelTurboCosmos9814 = true;
                }
                Method method = FrostHunterCanvasInfernoVortex4700.FrostHunterFlowMaxDragonHero5809;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, keyEvent);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i = FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterAlphaAnimationNeoCosmos5761;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = FrostHunterBroadcastPrimePixel6628.FrostHunterServiceEliteCelestialThunder1757;
            FrostHunterBroadcastPrimePixel6628 frostHunterBroadcastPrimePixel6628 = (FrostHunterBroadcastPrimePixel6628) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (frostHunterBroadcastPrimePixel6628 == null) {
                frostHunterBroadcastPrimePixel6628 = new FrostHunterBroadcastPrimePixel6628();
                frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761 = null;
                frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
                frostHunterBroadcastPrimePixel6628.FrostHunterBundlePulseFusionHero2475 = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, frostHunterBroadcastPrimePixel6628);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = FrostHunterBroadcastPrimePixel6628.FrostHunterServiceEliteCelestialThunder1757;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                                frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761 = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = FrostHunterBroadcastPrimePixel6628.FrostHunterServiceEliteCelestialThunder1757;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (FrostHunterAlphaAnimationNeoCosmos5761 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                        frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new SparseArray();
                    }
                    frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633.put(keyCode, new WeakReference(FrostHunterAlphaAnimationNeoCosmos5761));
                }
            }
            if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (FrostHunterCanvasInfernoVortex4700.FrostHunterStateCelestialNovaPixel8414(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FrostHunterTextInputLayoutLegendBeta2184.FrostHunterFlowMaxDragonHero5809;
        FrostHunterVectorDrawableCompatDragonThunderDelta5772.FrostHunterConstraintSetCloneMasterUltraRogue2633(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        FrostHunterDrawerLayoutEpicFusionShadow4742 frostHunterDrawerLayoutEpicFusionShadow4742 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterDrawerLayoutEpicFusionShadow4742.FrostHunterBundlePulseFusionHero2475("setCurrentState");
        frostHunterDrawerLayoutEpicFusionShadow4742.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterLicensingBlazeNebula6214.FrostHunterAlertDialogAuroraDelta3200);
        super.onSaveInstanceState(bundle);
    }
}
