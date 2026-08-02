package com.squareup.cash.card.onboarding.graphics;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class WandEffectKt$WandEffect$6$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WandScene $scene;

    public /* synthetic */ WandEffectKt$WandEffect$6$1$2(WandScene wandScene, int i) {
        this.$r8$classId = i;
        this.$scene = wandScene;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                WandSceneState wandSceneState = (WandSceneState) obj;
                WandScene wandScene = this.$scene;
                wandScene.requestedScale = wandSceneState.scale;
                wandScene.applyScale();
                wandScene.setRotation(wandSceneState.rotation);
                wandScene.setPosition(wandSceneState.position);
                wandScene.setOpacity(wandSceneState.opacity);
                break;
            default:
                Triple triple = (Triple) obj;
                float floatValue = ((Number) triple.first).floatValue();
                float floatValue2 = ((Number) triple.second).floatValue();
                float floatValue3 = ((Number) triple.third).floatValue();
                WandScene wandScene2 = this.$scene;
                new Float(floatValue);
                new Float(floatValue2);
                new Float(floatValue3);
                wandScene2.pendingDarkening = floatValue;
                wandScene2.pendingLightIntensity = floatValue2;
                wandScene2.pendingSaturation = floatValue3;
                for (SolidColorPBRMaterial solidColorPBRMaterial : wandScene2.materials.values()) {
                    solidColorPBRMaterial.setDimmer(floatValue);
                    solidColorPBRMaterial.setLightIntensityMultiplier(floatValue2);
                    solidColorPBRMaterial.setSaturation(floatValue3);
                }
                FresnelPBRMaterial fresnelPBRMaterial = wandScene2.bodyFresnel;
                if (fresnelPBRMaterial != null) {
                    fresnelPBRMaterial.setDimmer(floatValue);
                    fresnelPBRMaterial.setLightIntensityMultiplier(floatValue2);
                    fresnelPBRMaterial.setSaturation(floatValue3);
                }
                wandScene2.markDirty();
                break;
        }
        return Unit.INSTANCE;
    }
}
