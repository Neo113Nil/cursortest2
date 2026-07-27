package android.content.Context;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterPackageManagerAuroraQuantumLegend5210 {
    public final /* synthetic */ ComponentActivity FrostHunterAlphaAnimationNeoCosmos5761;

    public /* synthetic */ FrostHunterPackageManagerAuroraQuantumLegend5210(ComponentActivity componentActivity) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = componentActivity;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        int i = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
        context.getClass();
        ComponentActivity componentActivity = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Bundle FrostHunterFlowMaxDragonHero5809 = ((FrostHunterKotlinQuantumRogue5892) componentActivity.FrostHunterKeyframeGammaGamma1197.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809("android:support:activity-result");
        if (FrostHunterFlowMaxDragonHero5809 != null) {
            FrostHunterChipNebulaCyberThunder6252 frostHunterChipNebulaCyberThunder6252 = componentActivity.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            LinkedHashMap linkedHashMap = frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            LinkedHashMap linkedHashMap2 = frostHunterChipNebulaCyberThunder6252.FrostHunterAlphaAnimationNeoCosmos5761;
            Bundle bundle = frostHunterChipNebulaCyberThunder6252.FrostHunterRemoteConfigSpeedSpeed8566;
            ArrayList<Integer> integerArrayList = FrostHunterFlowMaxDragonHero5809.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = FrostHunterFlowMaxDragonHero5809.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = FrostHunterFlowMaxDragonHero5809.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                frostHunterChipNebulaCyberThunder6252.FrostHunterServiceEliteCelestialThunder1757.addAll(stringArrayList2);
            }
            Bundle bundle2 = FrostHunterFlowMaxDragonHero5809.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        FrostHunterCanvasInfernoVortex4700.FrostHunterFragmentBetaMegaVortex6025(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
