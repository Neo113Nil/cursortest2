package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.recipients.data.UtilsKt;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GlitterCardEffectKt$GlitterCardEffect$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $realCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlitterCardEffectKt$GlitterCardEffect$1$1$1(boolean z, Context context, Continuation continuation) {
        super(2, continuation);
        this.$realCard = z;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlitterCardEffectKt$GlitterCardEffect$1$1$1(this.$realCard, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GlitterCardEffectKt$GlitterCardEffect$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        boolean z = this.$realCard;
        Context context = this.$context;
        if (!z) {
            return UtilsKt.toBitmap$default(new GlitterDrawable(context, true), 4);
        }
        Rect rect = GlitterCardEffectKt.CARD_BOUNDS;
        CardModelView.CardBack cardBack = GlitterCardEffectKt.DEFAULT_CARD_BACK;
        int i = CardModelView.DEFAULT_MAG_BACK_COLOR;
        CardTheme.BackgroundImage backgroundImage = CardTheme.BackgroundImage.GLITTER;
        CardTheme.Identifier identifier = CardTheme.Identifier.GLITTER_ID;
        context.getClass();
        rect.getClass();
        identifier.getClass();
        cardBack.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int save = canvas.save();
        canvas.translate(RecyclerView.DECELERATION_RATE, 512.0f - (rect.height() / 2.0f));
        try {
            int save2 = canvas.save();
            canvas.translate(1024.0f, RecyclerView.DECELERATION_RATE);
            try {
                int save3 = canvas.save();
                canvas.scale(-1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                try {
                    if (cardBack.withRealCard) {
                        CardsKt.drawRealCardBack(canvas, context, rect, identifier, backgroundImage, cardBack, 125, -1, i, 0);
                    } else {
                        CardsKt.drawSlimCardBack(canvas, context, rect, identifier, backgroundImage, cardBack, 125, -1, i, 0);
                    }
                    canvas.restoreToCount(save3);
                    canvas.restoreToCount(save2);
                    CardsKt.drawCardFront(canvas, context, rect, backgroundImage, identifier, 0, 125, false);
                    canvas.restoreToCount(save);
                    return createBitmap;
                } catch (Throwable th) {
                    canvas.restoreToCount(save3);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save2);
                throw th2;
            }
        } catch (Throwable th3) {
            canvas.restoreToCount(save);
            throw th3;
        }
    }
}
