package com.squareup.cash.card.onboarding.core.instancing;

import com.google.zxing.BinaryBitmap;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.Transform;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstancedCardBatch$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstancedCardBatch f$0;

    public /* synthetic */ InstancedCardBatch$$ExternalSyntheticLambda0(InstancedCardBatch instancedCardBatch, int i) {
        this.$r8$classId = i;
        this.f$0 = instancedCardBatch;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InstancedCardBatch instancedCardBatch = this.f$0;
        switch (i) {
            case 0:
                Entity entity = new Entity("instanced_card_batch", new BinaryBitmap(instancedCardBatch), new EglCore(instancedCardBatch), new Transform());
                entity.setNeedsDoubleSidedRendering(true);
                return entity;
            default:
                StateFlowImpl stateFlowImpl = instancedCardBatch._dirty;
                Unit unit = Unit.INSTANCE;
                stateFlowImpl.setValue(unit);
                return unit;
        }
    }
}
