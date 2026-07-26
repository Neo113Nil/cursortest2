package android.content.Context;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterMotionSceneInfernoBlaze1856 {
    public static final SparseArray FrostHunterAlphaAnimationNeoCosmos5761 = new SparseArray();
    public static final HashMap FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        HashMap hashMap = new HashMap();
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = hashMap;
        hashMap.put(FrostHunterAnimatorPixelNovaSolar6777.FrostHunterCameraXPixelTurboCosmos9814, 0);
        hashMap.put(FrostHunterAnimatorPixelNovaSolar6777.FrostHunterFlowMaxDragonHero5809, 1);
        hashMap.put(FrostHunterAnimatorPixelNovaSolar6777.FrostHunterAlertDialogAuroraDelta3200, 2);
        for (FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777 : hashMap.keySet()) {
            FrostHunterAlphaAnimationNeoCosmos5761.append(((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterAnimatorPixelNovaSolar6777)).intValue(), frostHunterAnimatorPixelNovaSolar6777);
        }
    }

    public static int FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777) {
        Integer num = (Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterAnimatorPixelNovaSolar6777);
        if (num != null) {
            return num.intValue();
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterAnimatorPixelNovaSolar6777, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static FrostHunterAnimatorPixelNovaSolar6777 FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777 = (FrostHunterAnimatorPixelNovaSolar6777) FrostHunterAlphaAnimationNeoCosmos5761.get(i);
        if (frostHunterAnimatorPixelNovaSolar6777 != null) {
            return frostHunterAnimatorPixelNovaSolar6777;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Unknown Priority for value ", i));
        return null;
    }
}
