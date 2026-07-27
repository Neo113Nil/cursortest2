package androidx.versionedparcelable;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class LunarNodeAdapterValidationTbyFSjPkKjA81AR27230405400088733 implements ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845 {
    public final /* synthetic */ Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ LunarNodeAdapterValidationTbyFSjPkKjA81AR27230405400088733(int i, Object obj) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
    }

    @Override // androidx.versionedparcelable.ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845
    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014, NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) {
        Window window;
        View peekDecorView;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Object obj = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
                if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 == NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity componentActivity2 = (ComponentActivity) obj;
                int i3 = ComponentActivity.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
                if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 == NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_DESTROY) {
                    componentActivity2.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = null;
                    if (!componentActivity2.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = componentActivity2.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119().ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((FrostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        }
                        linkedHashMap.clear();
                    }
                    BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552 blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552 = componentActivity2.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                    ComponentActivity componentActivity3 = blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                    componentActivity3.getWindow().getDecorView().removeCallbacks(blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552);
                    componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(blueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552);
                    break;
                }
                break;
            default:
                BlazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220 blazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220 = (BlazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220) obj;
                if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 != NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_START) {
                    if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 == NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_STOP) {
                        blazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = false;
                        break;
                    }
                } else {
                    blazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = true;
                    break;
                }
                break;
        }
    }
}
