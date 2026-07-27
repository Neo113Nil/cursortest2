package androidx.versionedparcelable;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class ObsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976 {
    public final /* synthetic */ ComponentActivity ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ ObsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976(ComponentActivity componentActivity) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = componentActivity;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context) {
        int i = ComponentActivity.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983;
        context.getClass();
        ComponentActivity componentActivity = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        Bundle BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = ((RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050) componentActivity.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818("android:support:activity-result");
        if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 != null) {
            SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766 solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766 = componentActivity.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
            LinkedHashMap linkedHashMap = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            LinkedHashMap linkedHashMap2 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            Bundle bundle = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
            ArrayList<Integer> integerArrayList = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.addAll(stringArrayList2);
            }
            Bundle bundle2 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
