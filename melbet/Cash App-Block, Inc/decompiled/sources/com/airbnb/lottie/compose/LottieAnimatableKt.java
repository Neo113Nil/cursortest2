package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"LottieAnimatable", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "defaultProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "rememberLottieAnimatable", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;", "resetToBeginning", "", "(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimatableKt {
    public static final LottieAnimatable LottieAnimatable() {
        return new LottieAnimatableImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float defaultProgress(LottieComposition lottieComposition, LottieClipSpec lottieClipSpec, float f) {
        if (f < RecyclerView.DECELERATION_RATE && lottieComposition == null) {
            return 1.0f;
        }
        if (lottieComposition == null) {
            return RecyclerView.DECELERATION_RATE;
        }
        if (f >= RecyclerView.DECELERATION_RATE) {
            return lottieClipSpec != null ? lottieClipSpec.getMinProgress$lottie_compose_release(lottieComposition) : RecyclerView.DECELERATION_RATE;
        }
        if (lottieClipSpec != null) {
            return lottieClipSpec.getMaxProgress$lottie_compose_release(lottieComposition);
        }
        return 1.0f;
    }

    public static final LottieAnimatable rememberLottieAnimatable(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(2024497114);
        gapComposer.startReplaceableGroup(-610207850);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = LottieAnimatable();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LottieAnimatable lottieAnimatable = (LottieAnimatable) rememberedValue;
        gapComposer.end(false);
        gapComposer.end(false);
        return lottieAnimatable;
    }

    public static final Object resetToBeginning(LottieAnimatable lottieAnimatable, Continuation<? super Unit> continuation) {
        Object snapTo$default = LottieAnimatable.DefaultImpls.snapTo$default(lottieAnimatable, null, defaultProgress(lottieAnimatable.getComposition(), lottieAnimatable.getClipSpec(), lottieAnimatable.getSpeed()), 1, false, continuation, 9, null);
        return snapTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? snapTo$default : Unit.INSTANCE;
    }
}
