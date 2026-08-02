package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Texture;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Quadruple;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardAlbedo$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $backInkColor;
    public final /* synthetic */ CardTheme.BackgroundImage $background;
    public final /* synthetic */ CardModelView.CardBack $cardBack;
    public final /* synthetic */ int $color;
    public final /* synthetic */ CardTheme.Identifier $id;
    public final /* synthetic */ int $magStripColor;
    public final /* synthetic */ float $opacity;
    public /* synthetic */ Object L$0;
    public Quadruple L$1;
    public Quadruple L$2;
    public Texture L$3;
    public int label;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$cardAlbedo$2$1(float f, int i, int i2, int i3, CardModelView.CardBack cardBack, CardModelView cardModelView, CardTheme.BackgroundImage backgroundImage, CardTheme.Identifier identifier, Continuation continuation) {
        super(2, continuation);
        this.$id = identifier;
        this.$background = backgroundImage;
        this.$backInkColor = i;
        this.$opacity = f;
        this.this$0 = cardModelView;
        this.$color = i2;
        this.$cardBack = cardBack;
        this.$magStripColor = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardModelView.CardBack cardBack = this.$cardBack;
        CardModelView$cardAlbedo$2$1 cardModelView$cardAlbedo$2$1 = new CardModelView$cardAlbedo$2$1(this.$opacity, this.$backInkColor, this.$color, this.$magStripColor, cardBack, this.this$0, this.$background, this.$id, continuation);
        cardModelView$cardAlbedo$2$1.L$0 = obj;
        return cardModelView$cardAlbedo$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardModelView$cardAlbedo$2$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.filament.Texture, com.squareup.util.Quadruple, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Quadruple quadruple;
        Quadruple quadruple2;
        Texture texture;
        Quadruple quadruple3;
        Quadruple quadruple4;
        String str;
        Quadruple quadruple5;
        ?? r2;
        Object withContext;
        CoroutineSingletons coroutineSingletons;
        CardTextureState cardTextureState;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CardModelView cardModelView = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            quadruple = new Quadruple(this.$id, this.$background, new Integer(this.$backInkColor), new Float(this.$opacity));
            CardTextureState cardTextureState2 = cardModelView.textureState;
            if (cardTextureState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState2.albedoTexture);
            quadruple2 = (Quadruple) access$nullableItems.first;
            texture = (Texture) access$nullableItems.second;
            if (texture != null) {
                this.L$0 = flowCollector;
                this.L$1 = quadruple;
                this.L$2 = quadruple2;
                this.L$3 = texture;
                this.label = 1;
                if (flowCollector.emit(texture, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                quadruple3 = quadruple2;
            }
            quadruple4 = quadruple;
            if (Intrinsics.areEqual(quadruple2, quadruple4) || texture == null) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                str = "textureState";
                quadruple5 = quadruple4;
                r2 = 0;
                CardModelView$cardAlbedo$2$1$bitmap$1 cardModelView$cardAlbedo$2$1$bitmap$1 = new CardModelView$cardAlbedo$2$1$bitmap$1(this.$opacity, this.$color, this.$backInkColor, this.$magStripColor, this.$cardBack, cardModelView, this.$background, this.$id, null);
                this.L$0 = flowCollector;
                this.L$1 = quadruple5;
                this.L$2 = null;
                this.L$3 = texture;
                this.label = 2;
                withContext = JobKt.withContext(defaultIoScheduler, cardModelView$cardAlbedo$2$1$bitmap$1, this);
                coroutineSingletons = coroutineSingletons2;
                if (withContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Texture updateOrCreate$default = CardModelView.updateOrCreate$default(cardModelView, texture, (Bitmap) withContext, TextureType.COLOR);
                cardTextureState = cardModelView.textureState;
                if (cardTextureState == null) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            texture = this.L$3;
            Quadruple quadruple6 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            str = "textureState";
            quadruple5 = quadruple6;
            withContext = obj;
            coroutineSingletons = coroutineSingletons2;
            r2 = 0;
            Texture updateOrCreate$default2 = CardModelView.updateOrCreate$default(cardModelView, texture, (Bitmap) withContext, TextureType.COLOR);
            cardTextureState = cardModelView.textureState;
            if (cardTextureState == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw r2;
            }
            cardTextureState.albedoTexture = new Pair(quadruple5, updateOrCreate$default2);
            this.L$0 = r2;
            this.L$1 = r2;
            this.L$2 = r2;
            this.L$3 = r2;
            this.label = 3;
            if (flowCollector.emit(updateOrCreate$default2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return Unit.INSTANCE;
        }
        texture = this.L$3;
        quadruple3 = this.L$2;
        quadruple = this.L$1;
        SafeTrace.throwOnFailure(obj);
        quadruple2 = quadruple3;
        quadruple4 = quadruple;
        if (Intrinsics.areEqual(quadruple2, quadruple4)) {
        }
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
        str = "textureState";
        quadruple5 = quadruple4;
        r2 = 0;
        CardModelView$cardAlbedo$2$1$bitmap$1 cardModelView$cardAlbedo$2$1$bitmap$12 = new CardModelView$cardAlbedo$2$1$bitmap$1(this.$opacity, this.$color, this.$backInkColor, this.$magStripColor, this.$cardBack, cardModelView, this.$background, this.$id, null);
        this.L$0 = flowCollector;
        this.L$1 = quadruple5;
        this.L$2 = null;
        this.L$3 = texture;
        this.label = 2;
        withContext = JobKt.withContext(defaultIoScheduler2, cardModelView$cardAlbedo$2$1$bitmap$12, this);
        coroutineSingletons = coroutineSingletons2;
        if (withContext == coroutineSingletons) {
        }
        Texture updateOrCreate$default22 = CardModelView.updateOrCreate$default(cardModelView, texture, (Bitmap) withContext, TextureType.COLOR);
        cardTextureState = cardModelView.textureState;
        if (cardTextureState == null) {
        }
    }
}
