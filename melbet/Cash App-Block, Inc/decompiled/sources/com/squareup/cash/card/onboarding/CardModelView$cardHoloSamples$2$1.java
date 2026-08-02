package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Texture;
import com.squareup.cash.R;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$cardHoloSamples$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardTheme.Identifier $id;
    public /* synthetic */ Object L$0;
    public CardTheme.Identifier L$1;
    public CardTheme.Identifier L$2;
    public Pair L$3;
    public int label;
    public final /* synthetic */ CardModelView this$0;

    /* renamed from: com.squareup.cash.card.onboarding.CardModelView$cardHoloSamples$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CardTheme.Identifier $id;
        public final /* synthetic */ CardModelView this$0;

        /* renamed from: com.squareup.cash.card.onboarding.CardModelView$cardHoloSamples$2$1$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CardTheme.Identifier.values().length];
                try {
                    iArr[CardTheme.Identifier.HOLO_ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CardTheme.Identifier identifier, CardModelView cardModelView, Continuation continuation) {
            super(2, continuation);
            this.$id = identifier;
            this.this$0 = cardModelView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$id, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            CardTheme.Identifier identifier = this.$id;
            if ((identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$0[identifier.ordinal()]) == 1) {
                CardModelView cardModelView = this.this$0;
                return new Pair(BitmapFactory.decodeResource(cardModelView.getResources(), R.drawable.holo_base_gradient), BitmapFactory.decodeResource(cardModelView.getResources(), R.drawable.holo_reflect_env));
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            return new Pair(createBitmap, createBitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$cardHoloSamples$2$1(CardTheme.Identifier identifier, CardModelView cardModelView, Continuation continuation) {
        super(2, continuation);
        this.$id = identifier;
        this.this$0 = cardModelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardModelView$cardHoloSamples$2$1 cardModelView$cardHoloSamples$2$1 = new CardModelView$cardHoloSamples$2$1(this.$id, this.this$0, continuation);
        cardModelView$cardHoloSamples$2$1.L$0 = obj;
        return cardModelView$cardHoloSamples$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardModelView$cardHoloSamples$2$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        if (r0.emit(r7, r11) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardTheme.Identifier identifier;
        Pair pair;
        CardTheme.Identifier identifier2;
        CardTheme.Identifier identifier3;
        Pair pair2;
        Object withContext;
        Pair pair3;
        CardTheme.Identifier identifier4;
        Texture createTexture;
        Texture createTexture2;
        CardTextureState cardTextureState;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CardTheme.Identifier identifier5 = this.$id;
        CardModelView cardModelView = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CardTextureState cardTextureState2 = cardModelView.textureState;
            if (cardTextureState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState2.holoTextures);
            identifier = (CardTheme.Identifier) access$nullableItems.first;
            pair = (Pair) access$nullableItems.second;
            if (pair != null) {
                this.L$0 = flowCollector;
                this.L$1 = identifier5;
                this.L$2 = identifier;
                this.L$3 = pair;
                this.label = 1;
                if (flowCollector.emit(pair, this) != coroutineSingletons) {
                    identifier3 = identifier;
                    identifier2 = identifier5;
                    pair2 = pair;
                }
                return coroutineSingletons;
            }
            identifier2 = identifier5;
            if (identifier == identifier2 || pair == null) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(identifier5, cardModelView, null);
                this.L$0 = flowCollector;
                this.L$1 = identifier2;
                this.L$2 = null;
                this.L$3 = pair;
                this.label = 2;
                withContext = JobKt.withContext(defaultIoScheduler, anonymousClass2, this);
                if (withContext != coroutineSingletons) {
                    pair3 = pair;
                    obj = withContext;
                    identifier4 = identifier2;
                    Pair pair4 = (Pair) obj;
                    Bitmap bitmap = (Bitmap) pair4.first;
                    Bitmap bitmap2 = (Bitmap) pair4.second;
                    bitmap.getClass();
                    TextureType textureType = TextureType.COLOR;
                    createTexture = cardModelView.createTexture(255, bitmap, TextureType.COLOR);
                    bitmap2.getClass();
                    createTexture2 = cardModelView.createTexture(255, bitmap2, TextureType.COLOR);
                    Pair pair5 = new Pair(createTexture, createTexture2);
                    cardTextureState = cardModelView.textureState;
                    if (cardTextureState != null) {
                    }
                }
                return coroutineSingletons;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            pair2 = this.L$3;
            identifier3 = this.L$2;
            identifier2 = this.L$1;
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
            pair3 = this.L$3;
            identifier4 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            Pair pair42 = (Pair) obj;
            Bitmap bitmap3 = (Bitmap) pair42.first;
            Bitmap bitmap22 = (Bitmap) pair42.second;
            bitmap3.getClass();
            TextureType textureType2 = TextureType.COLOR;
            createTexture = cardModelView.createTexture(255, bitmap3, TextureType.COLOR);
            bitmap22.getClass();
            createTexture2 = cardModelView.createTexture(255, bitmap22, TextureType.COLOR);
            Pair pair52 = new Pair(createTexture, createTexture2);
            cardTextureState = cardModelView.textureState;
            if (cardTextureState != null) {
                Intrinsics.throwUninitializedPropertyAccessException("textureState");
                throw null;
            }
            cardTextureState.holoTextures = new Pair(identifier4, pair52);
            if (pair3 != null) {
                cardModelView.getEngine().destroyTexture((Texture) pair3.first);
                cardModelView.getEngine().destroyTexture((Texture) pair3.second);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        pair = pair2;
        identifier = identifier3;
        if (identifier == identifier2) {
        }
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
        AnonymousClass2 anonymousClass22 = new AnonymousClass2(identifier5, cardModelView, null);
        this.L$0 = flowCollector;
        this.L$1 = identifier2;
        this.L$2 = null;
        this.L$3 = pair;
        this.label = 2;
        withContext = JobKt.withContext(defaultIoScheduler2, anonymousClass22, this);
        if (withContext != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
