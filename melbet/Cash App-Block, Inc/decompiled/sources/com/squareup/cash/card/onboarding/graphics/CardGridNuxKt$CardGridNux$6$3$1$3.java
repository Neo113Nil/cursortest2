package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.card.onboarding.core.CardScene$applyIconToMaterial$1;
import com.squareup.cash.card.onboarding.core.CardScene$setIconIndicatorRadius$1;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class CardGridNuxKt$CardGridNux$6$3$1$3 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardGridNuxScene $scene;

    public /* synthetic */ CardGridNuxKt$CardGridNux$6$3$1$3(CardGridNuxScene cardGridNuxScene, int i) {
        this.$r8$classId = i;
        this.$scene = cardGridNuxScene;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Pair pair = (Pair) obj;
                Quat quat = (Quat) pair.first;
                Vector4 vector4 = (Vector4) pair.second;
                CardGridNuxScene cardGridNuxScene = this.$scene;
                cardGridNuxScene.getClass();
                quat.getClass();
                vector4.getClass();
                cardGridNuxScene.glLauncher.launch(new CardScene$applyIconToMaterial$1(cardGridNuxScene, quat, vector4, null, 2));
                break;
            default:
                float floatValue = ((Number) obj).floatValue();
                CardGridNuxScene cardGridNuxScene2 = this.$scene;
                if (((Boolean) cardGridNuxScene2._ready.getValue()).booleanValue()) {
                    cardGridNuxScene2.glLauncher.launch(new CardScene$setIconIndicatorRadius$1(cardGridNuxScene2, floatValue, null, 1));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
