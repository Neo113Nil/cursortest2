package com.squareup.cash.card.onboarding.core;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardScene$setIconIndicatorRadius$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float $radius;
    public final /* synthetic */ Scene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardScene$setIconIndicatorRadius$1(Scene scene, float f, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = scene;
        this.$radius = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        float f = this.$radius;
        Scene scene = this.this$0;
        switch (i) {
            case 0:
                return new CardScene$setIconIndicatorRadius$1((CardScene) scene, f, continuation, 0);
            default:
                return new CardScene$setIconIndicatorRadius$1((CardGridNuxScene) scene, f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardScene$setIconIndicatorRadius$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleCardMaterialPlugin singleCardMaterialPlugin;
        SingleCardMaterialPlugin singleCardMaterialPlugin2;
        int i = this.$r8$classId;
        float f = this.$radius;
        Scene scene = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardScene cardScene = (CardScene) scene;
                CardMaterial cardMaterial = cardScene.slotAMaterial;
                if (cardMaterial != null && (singleCardMaterialPlugin2 = cardMaterial.cardPlugin) != null) {
                    singleCardMaterialPlugin2.indicatorRadius = f;
                    singleCardMaterialPlugin2.onParametersChanged.invoke();
                }
                CardMaterial cardMaterial2 = cardScene.slotBMaterial;
                if (cardMaterial2 != null && (singleCardMaterialPlugin = cardMaterial2.cardPlugin) != null) {
                    singleCardMaterialPlugin.indicatorRadius = f;
                    singleCardMaterialPlugin.onParametersChanged.invoke();
                }
                cardScene.markDirty();
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) scene;
                Object maxOrNull = CollectionsKt.maxOrNull((Iterable) cardGridNuxScene.cardDelays);
                maxOrNull.getClass();
                float intValue = ((Number) maxOrNull).intValue() + 600;
                int i2 = 0;
                for (Object obj2 : cardGridNuxScene.cardDelays) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    float intValue2 = ((Number) obj2).intValue() / intValue;
                    float f2 = (r3 + 600) / intValue;
                    cardGridNuxScene.cardProgress[i2] = f <= intValue2 ? RecyclerView.DECELERATION_RATE : f >= f2 ? 1.0f : (f - intValue2) / (f2 - intValue2);
                    i2 = i3;
                }
                CardGridNuxScene.access$updateCardTransforms(cardGridNuxScene);
                cardGridNuxScene.markDirty();
                return Unit.INSTANCE;
        }
    }
}
