package com.squareup.cash.card.onboarding.graphics;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.anim.CashAnimPlayer;
import com.squareup.cash.graphics.swampgl.anim.TransformFrame;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CashAnimPlayer $animPlayer;
    public final /* synthetic */ float $bobbleTime;
    public final /* synthetic */ ActivationSuccessConfig $config;
    public final /* synthetic */ float $fadeOpacity;
    public final /* synthetic */ WandScene $scene;
    public final /* synthetic */ TransformFrame $settledFrame;
    public final /* synthetic */ float $sweepProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1(CashAnimPlayer cashAnimPlayer, TransformFrame transformFrame, WandScene wandScene, float f, float f2, float f3, ActivationSuccessConfig activationSuccessConfig, Continuation continuation) {
        super(2, continuation);
        this.$animPlayer = cashAnimPlayer;
        this.$settledFrame = transformFrame;
        this.$scene = wandScene;
        this.$fadeOpacity = f;
        this.$sweepProgress = f2;
        this.$bobbleTime = f3;
        this.$config = activationSuccessConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1(this.$animPlayer, this.$settledFrame, this.$scene, this.$fadeOpacity, this.$sweepProgress, this.$bobbleTime, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WandActivationSuccessEffectKt$WandActivationSuccessEffect$7$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ActivationSuccessConfig activationSuccessConfig = this.$config;
        TransformFrame transformFrame = this.$settledFrame;
        WandScene wandScene = this.$scene;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CashAnimPlayer cashAnimPlayer = this.$animPlayer;
        if (cashAnimPlayer == null || transformFrame == null) {
            return Unit.INSTANCE;
        }
        wandScene.setOpacity(this.$fadeOpacity);
        float f = this.$sweepProgress;
        if (f >= 1.0f) {
            float f2 = (this.$bobbleTime / 3.4666667f) * 2.0f * 3.1415927f;
            activationSuccessConfig.getClass();
            wandScene.setPosition(new Vector3(RecyclerView.DECELERATION_RATE, (1.0f - ((float) Math.cos(f2))) * 0.2f, RecyclerView.DECELERATION_RATE));
            wandScene.setRotation(transformFrame.rotation);
            wandScene.requestedScale = 0.491f;
            wandScene.applyScale();
        } else {
            TransformFrame evaluate = cashAnimPlayer.evaluate(f * 2.6333334f);
            Vector3 vector3 = transformFrame.position;
            Vector3 vector32 = evaluate.position;
            float f3 = vector32.x - vector3.x;
            activationSuccessConfig.getClass();
            wandScene.setPosition(new Vector3(f3 * RecyclerView.DECELERATION_RATE * 0.2341f, (-(vector32.z - vector3.z)) * 3.5f * 0.2341f, (vector32.y - vector3.y) * 1.01f * 0.2341f));
            wandScene.setRotation(evaluate.rotation);
            wandScene.requestedScale = 0.491f;
            wandScene.applyScale();
        }
        return Unit.INSTANCE;
    }
}
