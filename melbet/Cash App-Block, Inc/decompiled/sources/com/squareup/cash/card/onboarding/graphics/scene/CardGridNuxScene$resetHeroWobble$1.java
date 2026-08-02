package com.squareup.cash.card.onboarding.graphics.scene;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardGridNuxScene$resetHeroWobble$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardGridNuxScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardGridNuxScene$resetHeroWobble$1(CardGridNuxScene cardGridNuxScene, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = cardGridNuxScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardGridNuxScene$resetHeroWobble$1(this.this$0, continuation, 0);
            default:
                return new CardGridNuxScene$resetHeroWobble$1(this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardGridNuxScene$resetHeroWobble$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardGridNuxScene cardGridNuxScene = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardGridNuxScene.heroAnimationComplete = false;
                cardGridNuxScene.heroWobbleRotation = new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
                cardGridNuxScene.heroWobbleTranslation = new Vector4();
                CardGridNuxScene.access$updateCardTransforms(cardGridNuxScene);
                cardGridNuxScene.markDirty();
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardGridNuxScene.heroAnimationComplete = true;
                break;
        }
        return Unit.INSTANCE;
    }
}
