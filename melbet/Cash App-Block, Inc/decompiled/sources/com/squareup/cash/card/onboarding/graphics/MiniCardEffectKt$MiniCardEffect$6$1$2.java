package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.graphics.backend.math.Quat;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class MiniCardEffectKt$MiniCardEffect$6$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MiniCardScene $scene;

    public /* synthetic */ MiniCardEffectKt$MiniCardEffect$6$1$2(MiniCardScene miniCardScene, int i) {
        this.$r8$classId = i;
        this.$scene = miniCardScene;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MiniCardScene miniCardScene = this.$scene;
        switch (i) {
            case 0:
                MiniCardSceneState miniCardSceneState = (MiniCardSceneState) obj;
                miniCardScene.setScale(miniCardSceneState.scale);
                Quat quat = miniCardSceneState.rotation;
                quat.getClass();
                miniCardScene.cardTransform.setRotation(quat);
                miniCardScene.ringTransform.setRotation(MiniCardScene.RING_BASE_ROTATION.times(quat));
                miniCardScene.markDirty();
                miniCardScene.setPosition(miniCardSceneState.position);
                miniCardScene.setOpacity(miniCardSceneState.opacity);
                break;
            default:
                Triple triple = (Triple) obj;
                float floatValue = ((Number) triple.first).floatValue();
                float floatValue2 = ((Number) triple.second).floatValue();
                float floatValue3 = ((Number) triple.third).floatValue();
                for (SolidColorPBRMaterial solidColorPBRMaterial : miniCardScene.materials.values()) {
                    solidColorPBRMaterial.setDimmer(floatValue);
                    solidColorPBRMaterial.setLightIntensityMultiplier(floatValue2);
                    solidColorPBRMaterial.setSaturation(floatValue3);
                }
                miniCardScene.markDirty();
                break;
        }
        return Unit.INSTANCE;
    }
}
