package androidx.versionedparcelable;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseImmutableVariableTwKja7s4jHv2LKNggW44756713336498 implements ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845 {
    public final Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ BlazePulseImmutableVariableTwKja7s4jHv2LKNggW44756713336498(int i, Object obj) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
    }

    @Override // androidx.versionedparcelable.ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845
    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014, NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Object obj = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                YellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575 yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575 = (YellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575) obj;
                if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 != NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333().YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this);
                Bundle BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365().BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818("androidx.savedstate.Restarter");
                if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, BlazePulseImmutableVariableTwKja7s4jHv2LKNggW44756713336498.class.getClassLoader()).asSubclass(ArcticByteCompressionAttributeVKDYh4HafobjawFENU60989747704570.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575 instanceof CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575).toString());
                                }
                                BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = ((CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143) yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                                RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                                LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.getClass();
                                LinkedHashMap linkedHashMap = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    FrostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419 frostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419 = (FrostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419) linkedHashMap.get(str3);
                                    if (frostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419 != null) {
                                        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(frostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, yellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111();
                                }
                            } catch (Exception e) {
                                CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e3);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i3 = ComponentActivity.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
                if (componentActivity.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
                    BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 = (BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490) componentActivity.getLastNonConfigurationInstance();
                    if (blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 != null) {
                        componentActivity.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    }
                    if (componentActivity.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
                        componentActivity.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859(1);
                    }
                }
                componentActivity.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this);
                return;
            case 2:
                new HashMap();
                KryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544[] kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544Arr = (KryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544[]) obj;
                if (kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544Arr.length > 0) {
                    KryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544 kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544 = kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544Arr[0];
                    throw null;
                }
                if (kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544Arr.length <= 0) {
                    return;
                }
                KryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544 kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc498648814425442 = kryptonFlowMacroBinaryAK6cd0EHOYlWg65RUc49864881442544Arr[0];
                throw null;
            default:
                if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 == NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_CREATE) {
                    deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333().YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this);
                    ((NovaLayerPolymorphismHashmapW1se0Exo7FiXvayzwv67112151307195) obj).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073).toString());
                }
        }
    }
}
