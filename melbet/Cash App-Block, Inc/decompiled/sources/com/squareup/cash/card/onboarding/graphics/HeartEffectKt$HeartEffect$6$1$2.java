package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.components.Transform;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class HeartEffectKt$HeartEffect$6$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HeartScene $scene;

    public /* synthetic */ HeartEffectKt$HeartEffect$6$1$2(HeartScene heartScene, int i) {
        this.$r8$classId = i;
        this.$scene = heartScene;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                HeartSceneState heartSceneState = (HeartSceneState) obj;
                HeartScene heartScene = this.$scene;
                heartScene.setScale(heartSceneState.scale);
                Quat quat = heartSceneState.rotation;
                quat.getClass();
                Transform transform = heartScene.heartTransform;
                transform.setRotation(quat);
                Transform transform2 = heartScene.ringTransform;
                transform2.setRotation(quat);
                heartScene.markDirty();
                Vector3 vector3 = heartSceneState.position;
                vector3.getClass();
                transform.setPosition(vector3);
                transform2.setPosition(vector3);
                heartScene.markDirty();
                heartScene.setOpacity(heartSceneState.opacity);
                break;
            default:
                Triple triple = (Triple) obj;
                float floatValue = ((Number) triple.first).floatValue();
                float floatValue2 = ((Number) triple.second).floatValue();
                float floatValue3 = ((Number) triple.third).floatValue();
                HeartScene heartScene2 = this.$scene;
                heartScene2.pendingDarkening = floatValue;
                heartScene2.pendingLightIntensity = floatValue2;
                heartScene2.pendingSaturation = floatValue3;
                for (SolidColorPBRMaterial solidColorPBRMaterial : heartScene2.materials.values()) {
                    solidColorPBRMaterial.setDimmer(floatValue);
                    solidColorPBRMaterial.setLightIntensityMultiplier(floatValue2);
                    solidColorPBRMaterial.setSaturation(floatValue3);
                }
                heartScene2.markDirty();
                break;
        }
        return Unit.INSTANCE;
    }
}
