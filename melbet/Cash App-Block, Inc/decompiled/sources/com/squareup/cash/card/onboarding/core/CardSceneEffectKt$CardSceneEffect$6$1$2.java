package com.squareup.cash.card.onboarding.core;

import android.graphics.Bitmap;
import com.squareup.cash.card.onboarding.CardModelView;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardSceneEffectKt$CardSceneEffect$6$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardScene $scene;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSceneEffectKt$CardSceneEffect$6$1$2(CardScene cardScene, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$scene = cardScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardScene cardScene = this.$scene;
        switch (i) {
            case 0:
                CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$2 = new CardSceneEffectKt$CardSceneEffect$6$1$2(cardScene, continuation, 0);
                cardSceneEffectKt$CardSceneEffect$6$1$2.L$0 = obj;
                return cardSceneEffectKt$CardSceneEffect$6$1$2;
            case 1:
                CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$22 = new CardSceneEffectKt$CardSceneEffect$6$1$2(cardScene, continuation, 1);
                cardSceneEffectKt$CardSceneEffect$6$1$22.L$0 = obj;
                return cardSceneEffectKt$CardSceneEffect$6$1$22;
            case 2:
                CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$23 = new CardSceneEffectKt$CardSceneEffect$6$1$2(cardScene, continuation, 2);
                cardSceneEffectKt$CardSceneEffect$6$1$23.L$0 = obj;
                return cardSceneEffectKt$CardSceneEffect$6$1$23;
            default:
                CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$24 = new CardSceneEffectKt$CardSceneEffect$6$1$2(cardScene, continuation, 3);
                cardSceneEffectKt$CardSceneEffect$6$1$24.L$0 = obj;
                return cardSceneEffectKt$CardSceneEffect$6$1$24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CardSceneEffectKt$CardSceneEffect$6$1$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((CardSceneEffectKt$CardSceneEffect$6$1$2) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((CardSceneEffectKt$CardSceneEffect$6$1$2) create((CardModelView.PanEntity) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CardSceneEffectKt$CardSceneEffect$6$1$2) create((Bitmap) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardScene cardScene = this.$scene;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.configureCamera(((Number) pair.first).floatValue(), ((Number) pair.second).floatValue());
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.setChildrenLocal((List) obj2);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.setChildrenLocal(CollectionsKt__CollectionsJVMKt.listOf((CardModelView.PanEntity) obj2));
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.engine.launch(new CardScene$setIcon$1(cardScene, (Bitmap) obj2, null, 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
