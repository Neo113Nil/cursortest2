package com.squareup.cash.card.onboarding.core;

import android.graphics.Bitmap;
import com.squareup.cash.card.onboarding.CardsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardScene$setIcon$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardScene$setIcon$1(CardScene cardScene, Bitmap bitmap, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = cardScene;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Bitmap bitmap = this.$bitmap;
        CardScene cardScene = this.this$0;
        switch (i) {
            case 0:
                return new CardScene$setIcon$1(cardScene, bitmap, continuation, 0);
            default:
                return new CardScene$setIcon$1(cardScene, bitmap, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardScene$setIcon$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Bitmap bitmap = this.$bitmap;
        CardScene cardScene = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardMaterial cardMaterial = cardScene.slotAMaterial;
                if (cardMaterial != null) {
                    cardMaterial.setIcon(bitmap, CardsKt.ICON_TEXTURE_BOUNDS, cardScene.currentIndicatorRadius);
                }
                CardMaterial cardMaterial2 = cardScene.slotBMaterial;
                if (cardMaterial2 != null) {
                    cardMaterial2.setIcon(bitmap, CardsKt.ICON_TEXTURE_BOUNDS, cardScene.currentIndicatorRadius);
                }
                cardScene.markDirty();
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                bitmap.getClass();
                cardScene.currentIconBitmap = bitmap;
                cardScene.glLauncher.launch(new CardScene$setIcon$1(cardScene, bitmap, null, 0));
                break;
        }
        return Unit.INSTANCE;
    }
}
