package androidx.core.app;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.versionedparcelable.BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704;
import androidx.versionedparcelable.DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014;
import androidx.versionedparcelable.DeltaSignalStateDispatcherWPPKA8d86fC2ifemfZ11609986421791;
import androidx.versionedparcelable.FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432;
import androidx.versionedparcelable.ObsidianEngineRequestAggregationCJ9unXvWW6NxCxO6pK68779594472551;
import androidx.versionedparcelable.RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
import androidx.versionedparcelable.UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250;
import androidx.versionedparcelable.XenoGridProviderCryptographyM0EHxSxOzrfWz2EEdQ39231868148600;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 {
    public final UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250(this, true);

    public UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
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
        if (RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(decorView, keyEvent)) {
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
                if (!RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942) {
                    try {
                        RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942 = true;
                }
                Method method = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
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
        int i = ObsidianEngineRequestAggregationCJ9unXvWW6NxCxO6pK68779594472551.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432 frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432 = (FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432 == null) {
                frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432 = new FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432();
                frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = null;
                frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = null;
                frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == null) {
                                frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = FrostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
                        frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new SparseArray();
                    }
                    frostBridgeEventLoopDispatcherBWYlPUIs6ecXLYMvu944003048941432.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.put(keyCode, new WeakReference(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800));
                }
            }
            if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null) {
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
        if (RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = XenoGridProviderCryptographyM0EHxSxOzrfWz2EEdQ39231868148600.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        DeltaSignalStateDispatcherWPPKA8d86fC2ifemfZ11609986421791.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495("setCurrentState");
        ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        super.onSaveInstanceState(bundle);
    }
}
