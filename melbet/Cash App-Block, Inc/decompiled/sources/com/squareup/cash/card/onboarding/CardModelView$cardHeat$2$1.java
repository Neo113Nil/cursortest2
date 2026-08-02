package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Texture;
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
public final class CardModelView$cardHeat$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ EquatableBitmap $equatableBitmap;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public EquatableBitmap L$1;
    public Texture L$2;
    public int label;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardModelView$cardHeat$2$1(CardModelView cardModelView, EquatableBitmap equatableBitmap, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardModelView;
        this.$equatableBitmap = equatableBitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        EquatableBitmap equatableBitmap = this.$equatableBitmap;
        CardModelView cardModelView = this.this$0;
        switch (i) {
            case 0:
                CardModelView$cardHeat$2$1 cardModelView$cardHeat$2$1 = new CardModelView$cardHeat$2$1(cardModelView, equatableBitmap, continuation, 0);
                cardModelView$cardHeat$2$1.L$0 = obj;
                return cardModelView$cardHeat$2$1;
            default:
                CardModelView$cardHeat$2$1 cardModelView$cardHeat$2$12 = new CardModelView$cardHeat$2$1(cardModelView, equatableBitmap, continuation, 1);
                cardModelView$cardHeat$2$12.L$0 = obj;
                return cardModelView$cardHeat$2$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardModelView$cardHeat$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        if (r0.emit(r12, r11) == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r0.emit(r1, r11) == r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r0.emit(r12, r11) == r8) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EquatableBitmap equatableBitmap;
        Texture texture;
        EquatableBitmap equatableBitmap2;
        Texture texture2;
        CardTextureState cardTextureState;
        EquatableBitmap equatableBitmap3;
        Texture texture3;
        EquatableBitmap equatableBitmap4;
        CardTextureState cardTextureState2;
        int i = this.$r8$classId;
        CardModelView cardModelView = this.this$0;
        EquatableBitmap equatableBitmap5 = this.$equatableBitmap;
        Continuation continuation = null;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardTextureState cardTextureState3 = cardModelView.textureState;
                    if (cardTextureState3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState3.heatMaskTexture);
                    equatableBitmap = (EquatableBitmap) access$nullableItems.first;
                    texture = (Texture) access$nullableItems.second;
                    if (texture != null) {
                        this.L$0 = flowCollector;
                        this.L$1 = equatableBitmap;
                        this.L$2 = texture;
                        this.label = 1;
                        if (flowCollector.emit(texture, this) != coroutineSingletons) {
                            equatableBitmap2 = equatableBitmap;
                            texture2 = texture;
                        }
                        return coroutineSingletons;
                    }
                    if (Intrinsics.areEqual(equatableBitmap, equatableBitmap5) || texture == null) {
                        Texture access$updateOrCreate = CardModelView.access$updateOrCreate(cardModelView, equatableBitmap5, equatableBitmap, texture);
                        cardTextureState = cardModelView.textureState;
                        if (cardTextureState != null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textureState");
                            throw null;
                        }
                        cardTextureState.heatMaskTexture = new Pair(equatableBitmap5, access$updateOrCreate);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                texture2 = this.L$2;
                equatableBitmap2 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                texture = texture2;
                equatableBitmap = equatableBitmap2;
                if (Intrinsics.areEqual(equatableBitmap, equatableBitmap5)) {
                }
                Texture access$updateOrCreate2 = CardModelView.access$updateOrCreate(cardModelView, equatableBitmap5, equatableBitmap, texture);
                cardTextureState = cardModelView.textureState;
                if (cardTextureState != null) {
                }
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardTextureState cardTextureState4 = cardModelView.textureState;
                    if (cardTextureState4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    Pair access$nullableItems2 = CardModelView.access$nullableItems(cardModelView, cardTextureState4.iconTexture);
                    equatableBitmap3 = (EquatableBitmap) access$nullableItems2.first;
                    texture3 = (Texture) access$nullableItems2.second;
                    if (texture3 != null) {
                        this.L$0 = flowCollector2;
                        this.L$1 = equatableBitmap3;
                        this.L$2 = texture3;
                        this.label = 1;
                        break;
                    }
                } else if (i3 == 1) {
                    texture3 = this.L$2;
                    equatableBitmap3 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    texture3 = this.L$2;
                    equatableBitmap4 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    equatableBitmap5 = (EquatableBitmap) obj;
                    equatableBitmap3 = equatableBitmap4;
                    Texture access$updateOrCreate3 = CardModelView.access$updateOrCreate(cardModelView, equatableBitmap5, equatableBitmap3, texture3);
                    cardTextureState2 = cardModelView.textureState;
                    if (cardTextureState2 != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    cardTextureState2.iconTexture = new Pair(equatableBitmap5, access$updateOrCreate3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    break;
                }
                if (!Intrinsics.areEqual(equatableBitmap3, equatableBitmap5) || texture3 == null) {
                    if (equatableBitmap5 == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        this.L$0 = flowCollector2;
                        this.L$1 = equatableBitmap3;
                        this.L$2 = texture3;
                        this.label = 2;
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new EquatableBitmap$Companion$toEquatable$2(createBitmap, continuation, 0), this);
                        if (obj != coroutineSingletons2) {
                            equatableBitmap4 = equatableBitmap3;
                            equatableBitmap5 = (EquatableBitmap) obj;
                            equatableBitmap3 = equatableBitmap4;
                        }
                        return coroutineSingletons2;
                    }
                    Texture access$updateOrCreate32 = CardModelView.access$updateOrCreate(cardModelView, equatableBitmap5, equatableBitmap3, texture3);
                    cardTextureState2 = cardModelView.textureState;
                    if (cardTextureState2 != null) {
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
