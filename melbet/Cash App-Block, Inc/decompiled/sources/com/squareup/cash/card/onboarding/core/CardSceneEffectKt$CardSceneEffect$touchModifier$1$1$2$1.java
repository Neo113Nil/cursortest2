package com.squareup.cash.card.onboarding.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.RequestQueue;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahe;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardSceneEffectKt$CardSceneEffect$touchModifier$1$1$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PointerInputChange $change;
    public final /* synthetic */ float $density;
    public final /* synthetic */ Offset $dragAmount;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ CardScene $scene;
    public final /* synthetic */ PointerInputScope $this_pointerInput;
    public final /* synthetic */ MutableState $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSceneEffectKt$CardSceneEffect$touchModifier$1$1$2$1(MutableSharedFlow mutableSharedFlow, Offset offset, float f, MutableState mutableState, PointerInputChange pointerInputChange, CardScene cardScene, PointerInputScope pointerInputScope, Continuation continuation) {
        super(2, continuation);
        this.$dragOffsets = mutableSharedFlow;
        this.$dragAmount = offset;
        this.$density = f;
        this.$viewModel = mutableState;
        this.$change = pointerInputChange;
        this.$scene = cardScene;
        this.$this_pointerInput = pointerInputScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardSceneEffectKt$CardSceneEffect$touchModifier$1$1$2$1(this.$dragOffsets, this.$dragAmount, this.$density, this.$viewModel, this.$change, this.$scene, this.$this_pointerInput, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSceneEffectKt$CardSceneEffect$touchModifier$1$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Pair pair = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Offset offset = new Offset(Offset.m627timestuRUvjQ(Offset.m621divtuRUvjQ(this.$dragAmount.packedValue, this.$density), -0.8f));
            this.label = 1;
            if (this.$dragOffsets.emit(offset, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (((CardModelView.ViewModel) this.$viewModel.getValue()).backgroundImage == CardTheme.BackgroundImage.MOOD) {
            PointerInputChange pointerInputChange = this.$change;
            float intBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.position >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.position & BodyPartID.bodyIdMax));
            CardScene cardScene = this.$scene;
            Entity cardEntity$views = cardScene.getCardEntity$views();
            if (cardEntity$views != null) {
                RequestQueue requestQueue = cardScene.camera;
                PointerInputScope pointerInputScope = this.$this_pointerInput;
                pair = zzahe.touchToTextureUV(requestQueue, intBitsToFloat, intBitsToFloat2, (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize >> 32), (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize & BodyPartID.bodyIdMax), cardEntity$views);
            }
            if (pair != null) {
                cardScene.addHeat(((Number) pair.first).floatValue(), ((Number) pair.second).floatValue(), 0.15f);
            }
        }
        return Unit.INSTANCE;
    }
}
