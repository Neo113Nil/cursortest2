package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Texture;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.protos.franklin.cards.CardTheme;
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
public final class CardModelView$cardNormal$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardTheme.BackgroundImage $backgroundImage;
    public /* synthetic */ Object L$0;
    public CardTheme.BackgroundImage L$1;
    public CardTheme.BackgroundImage L$2;
    public Texture L$3;
    public int label;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$cardNormal$2$1(CardModelView cardModelView, CardTheme.BackgroundImage backgroundImage, Continuation continuation) {
        super(2, continuation);
        this.$backgroundImage = backgroundImage;
        this.this$0 = cardModelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardModelView$cardNormal$2$1 cardModelView$cardNormal$2$1 = new CardModelView$cardNormal$2$1(this.this$0, this.$backgroundImage, continuation);
        cardModelView$cardNormal$2$1.L$0 = obj;
        return cardModelView$cardNormal$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardModelView$cardNormal$2$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardTheme.BackgroundImage backgroundImage;
        Texture texture;
        CardTheme.BackgroundImage backgroundImage2;
        CardTheme.BackgroundImage backgroundImage3;
        Texture texture2;
        Object withContext;
        Texture texture3;
        CardTheme.BackgroundImage backgroundImage4;
        CardTextureState cardTextureState;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CardTheme.BackgroundImage backgroundImage5 = this.$backgroundImage;
        CardModelView cardModelView = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CardTextureState cardTextureState2 = cardModelView.textureState;
            if (cardTextureState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState2.normalTexture);
            backgroundImage = (CardTheme.BackgroundImage) access$nullableItems.first;
            texture = (Texture) access$nullableItems.second;
            if (texture != null) {
                this.L$0 = flowCollector;
                this.L$1 = backgroundImage5;
                this.L$2 = backgroundImage;
                this.L$3 = texture;
                this.label = 1;
                if (flowCollector.emit(texture, this) != coroutineSingletons) {
                    backgroundImage3 = backgroundImage;
                    backgroundImage2 = backgroundImage5;
                    texture2 = texture;
                }
                return coroutineSingletons;
            }
            backgroundImage2 = backgroundImage5;
            if (backgroundImage == backgroundImage2 || texture == null) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                CardModelView$cardNormal$2$1$bitmap$1 cardModelView$cardNormal$2$1$bitmap$1 = new CardModelView$cardNormal$2$1$bitmap$1(cardModelView, backgroundImage5, null);
                this.L$0 = flowCollector;
                this.L$1 = backgroundImage2;
                this.L$2 = null;
                this.L$3 = texture;
                this.label = 2;
                withContext = JobKt.withContext(defaultIoScheduler, cardModelView$cardNormal$2$1$bitmap$1, this);
                if (withContext != coroutineSingletons) {
                    texture3 = texture;
                    obj = withContext;
                    backgroundImage4 = backgroundImage2;
                    Texture updateOrCreate$default = CardModelView.updateOrCreate$default(cardModelView, texture3, (Bitmap) obj, TextureType.NORMAL);
                    cardTextureState = cardModelView.textureState;
                    if (cardTextureState != null) {
                    }
                }
                return coroutineSingletons;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            texture2 = this.L$3;
            backgroundImage3 = this.L$2;
            backgroundImage2 = this.L$1;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            texture3 = this.L$3;
            backgroundImage4 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            Texture updateOrCreate$default2 = CardModelView.updateOrCreate$default(cardModelView, texture3, (Bitmap) obj, TextureType.NORMAL);
            cardTextureState = cardModelView.textureState;
            if (cardTextureState != null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            cardTextureState.normalTexture = new Pair(backgroundImage4, updateOrCreate$default2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        texture = texture2;
        backgroundImage = backgroundImage3;
        if (backgroundImage == backgroundImage2) {
        }
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
        CardModelView$cardNormal$2$1$bitmap$1 cardModelView$cardNormal$2$1$bitmap$12 = new CardModelView$cardNormal$2$1$bitmap$1(cardModelView, backgroundImage5, null);
        this.L$0 = flowCollector;
        this.L$1 = backgroundImage2;
        this.L$2 = null;
        this.L$3 = texture;
        this.label = 2;
        withContext = JobKt.withContext(defaultIoScheduler2, cardModelView$cardNormal$2$1$bitmap$12, this);
        if (withContext != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
