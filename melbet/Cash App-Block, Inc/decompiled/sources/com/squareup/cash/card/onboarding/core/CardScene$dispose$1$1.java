package com.squareup.cash.card.onboarding.core;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardScene$dispose$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ CardAssetManager$AssetKey$CopyPan $it;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardScene$dispose$1$1(CardScene cardScene, CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = cardScene;
        this.$it = cardAssetManager$AssetKey$CopyPan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan = this.$it;
        CardScene cardScene = this.this$0;
        switch (i) {
            case 0:
                return new CardScene$dispose$1$1(cardScene, cardAssetManager$AssetKey$CopyPan, continuation, 0);
            case 1:
                return new CardScene$dispose$1$1(cardScene, cardAssetManager$AssetKey$CopyPan, continuation, 1);
            default:
                return new CardScene$dispose$1$1(cardScene, cardAssetManager$AssetKey$CopyPan, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardScene$dispose$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardAssetManager$AssetKey$CopyPan cardAssetManager$AssetKey$CopyPan = this.$it;
        CardScene cardScene = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.assetManager.release(cardAssetManager$AssetKey$CopyPan);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.assetManager.release(cardAssetManager$AssetKey$CopyPan);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardScene.assetManager.release(cardAssetManager$AssetKey$CopyPan);
                break;
        }
        return Unit.INSTANCE;
    }
}
