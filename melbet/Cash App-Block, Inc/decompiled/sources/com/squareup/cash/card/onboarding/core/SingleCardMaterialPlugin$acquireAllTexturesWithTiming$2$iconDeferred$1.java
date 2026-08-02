package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardTextureKeys $keys;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkedHashMap $times;
    public int label;
    public final /* synthetic */ SingleCardMaterialPlugin this$0;

    /* renamed from: com.squareup.cash.card.onboarding.core.SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ CardTextureKeys $keys;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ SingleCardMaterialPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(SingleCardMaterialPlugin singleCardMaterialPlugin, CardTextureKeys cardTextureKeys, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = singleCardMaterialPlugin;
            this.$keys = cardTextureKeys;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            CardTextureKeys cardTextureKeys = this.$keys;
            SingleCardMaterialPlugin singleCardMaterialPlugin = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 0);
                case 1:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 1);
                case 2:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 2);
                case 3:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 3);
                case 4:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 4);
                case 5:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 5);
                case 6:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 6);
                case 7:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 7);
                case 8:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 8);
                default:
                    return new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 9);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            CardAssetManager$AssetKey$Placeholder cardAssetManager$AssetKey$Placeholder = CardAssetManager$AssetKey$Placeholder.INSTANCE;
            CardTextureKeys cardTextureKeys = this.$keys;
            SingleCardMaterialPlugin singleCardMaterialPlugin = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider = singleCardMaterialPlugin.assetManager;
                    cardTextureKeys.getClass();
                    this.label = 1;
                    Object acquire = ((CardAssetManager) cardAssetProvider).acquire(cardAssetManager$AssetKey$Placeholder, this);
                    return acquire == coroutineSingletons ? coroutineSingletons : acquire;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider2 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt = cardTextureKeys.albedo;
                    this.label = 1;
                    Object acquire2 = ((CardAssetManager) cardAssetProvider2).acquire(layoutCompat_androidKt, this);
                    return acquire2 == coroutineSingletons2 ? coroutineSingletons2 : acquire2;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider3 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt2 = cardTextureKeys.heatColors;
                    this.label = 1;
                    Object acquire3 = ((CardAssetManager) cardAssetProvider3).acquire(layoutCompat_androidKt2, this);
                    return acquire3 == coroutineSingletons3 ? coroutineSingletons3 : acquire3;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider4 = singleCardMaterialPlugin.assetManager;
                    cardTextureKeys.getClass();
                    this.label = 1;
                    Object acquire4 = ((CardAssetManager) cardAssetProvider4).acquire(cardAssetManager$AssetKey$Placeholder, this);
                    return acquire4 == coroutineSingletons4 ? coroutineSingletons4 : acquire4;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider5 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt3 = cardTextureKeys.holoBase;
                    this.label = 1;
                    Object acquire5 = ((CardAssetManager) cardAssetProvider5).acquire(layoutCompat_androidKt3, this);
                    return acquire5 == coroutineSingletons5 ? coroutineSingletons5 : acquire5;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 != 0) {
                        if (i7 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider6 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt4 = cardTextureKeys.holoReflect;
                    this.label = 1;
                    Object acquire6 = ((CardAssetManager) cardAssetProvider6).acquire(layoutCompat_androidKt4, this);
                    return acquire6 == coroutineSingletons6 ? coroutineSingletons6 : acquire6;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider7 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt5 = cardTextureKeys.inkMetalHeat;
                    this.label = 1;
                    Object acquire7 = ((CardAssetManager) cardAssetProvider7).acquire(layoutCompat_androidKt5, this);
                    return acquire7 == coroutineSingletons7 ? coroutineSingletons7 : acquire7;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider8 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt6 = cardTextureKeys.normal;
                    this.label = 1;
                    Object acquire8 = ((CardAssetManager) cardAssetProvider8).acquire(layoutCompat_androidKt6, this);
                    return acquire8 == coroutineSingletons8 ? coroutineSingletons8 : acquire8;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider9 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt7 = cardTextureKeys.shimmer;
                    this.label = 1;
                    Object acquire9 = ((CardAssetManager) cardAssetProvider9).acquire(layoutCompat_androidKt7, this);
                    return acquire9 == coroutineSingletons9 ? coroutineSingletons9 : acquire9;
                default:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    CardAssetProvider cardAssetProvider10 = singleCardMaterialPlugin.assetManager;
                    LayoutCompat_androidKt layoutCompat_androidKt8 = cardTextureKeys.snakeSkin;
                    this.label = 1;
                    Object acquire10 = ((CardAssetManager) cardAssetProvider10).acquire(layoutCompat_androidKt8, this);
                    return acquire10 == coroutineSingletons10 ? coroutineSingletons10 : acquire10;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(SingleCardMaterialPlugin singleCardMaterialPlugin, CardTextureKeys cardTextureKeys, LinkedHashMap linkedHashMap, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = singleCardMaterialPlugin;
        this.$keys = cardTextureKeys;
        this.$times = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 0);
            case 1:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 1);
            case 2:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 2);
            case 3:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 3);
            case 4:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 4);
            case 5:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 5);
            case 6:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 6);
            case 7:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 7);
            case 8:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 8);
            default:
                return new SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1(this.this$0, this.$keys, this.$times, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2$iconDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardTextureKeys cardTextureKeys = this.$keys;
        SingleCardMaterialPlugin singleCardMaterialPlugin = this.this$0;
        LinkedHashMap linkedHashMap = this.$times;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 0);
                this.label = 1;
                Object access$invokeSuspend$timed = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "icon", anonymousClass1, this);
                return access$invokeSuspend$timed == coroutineSingletons ? coroutineSingletons : access$invokeSuspend$timed;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, i2);
                this.label = 1;
                Object access$invokeSuspend$timed2 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "albedo", anonymousClass12, this);
                return access$invokeSuspend$timed2 == coroutineSingletons2 ? coroutineSingletons2 : access$invokeSuspend$timed2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass13 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 2);
                this.label = 1;
                Object access$invokeSuspend$timed3 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "heatColors", anonymousClass13, this);
                return access$invokeSuspend$timed3 == coroutineSingletons3 ? coroutineSingletons3 : access$invokeSuspend$timed3;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass14 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 3);
                this.label = 1;
                Object access$invokeSuspend$timed4 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "heatMask", anonymousClass14, this);
                return access$invokeSuspend$timed4 == coroutineSingletons4 ? coroutineSingletons4 : access$invokeSuspend$timed4;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass15 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 4);
                this.label = 1;
                Object access$invokeSuspend$timed5 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "holoBase", anonymousClass15, this);
                return access$invokeSuspend$timed5 == coroutineSingletons5 ? coroutineSingletons5 : access$invokeSuspend$timed5;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass16 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 5);
                this.label = 1;
                Object access$invokeSuspend$timed6 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "holoReflect", anonymousClass16, this);
                return access$invokeSuspend$timed6 == coroutineSingletons6 ? coroutineSingletons6 : access$invokeSuspend$timed6;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 != 0) {
                    if (i9 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass17 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 6);
                this.label = 1;
                Object access$invokeSuspend$timed7 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "inkMetalHeat", anonymousClass17, this);
                return access$invokeSuspend$timed7 == coroutineSingletons7 ? coroutineSingletons7 : access$invokeSuspend$timed7;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass18 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 7);
                this.label = 1;
                Object access$invokeSuspend$timed8 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "normal", anonymousClass18, this);
                return access$invokeSuspend$timed8 == coroutineSingletons8 ? coroutineSingletons8 : access$invokeSuspend$timed8;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass19 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 8);
                this.label = 1;
                Object access$invokeSuspend$timed9 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "shimmer", anonymousClass19, this);
                return access$invokeSuspend$timed9 == coroutineSingletons9 ? coroutineSingletons9 : access$invokeSuspend$timed9;
            default:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 != 0) {
                    if (i12 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AnonymousClass1 anonymousClass110 = new AnonymousClass1(singleCardMaterialPlugin, cardTextureKeys, continuation, 9);
                this.label = 1;
                Object access$invokeSuspend$timed10 = SingleCardMaterialPlugin$acquireAllTexturesWithTiming$2.access$invokeSuspend$timed(linkedHashMap, "snakeSkin", anonymousClass110, this);
                return access$invokeSuspend$timed10 == coroutineSingletons10 ? coroutineSingletons10 : access$invokeSuspend$timed10;
        }
    }
}
