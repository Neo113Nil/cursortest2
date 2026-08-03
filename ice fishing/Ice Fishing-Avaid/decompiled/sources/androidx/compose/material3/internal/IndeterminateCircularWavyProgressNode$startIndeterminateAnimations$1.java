package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CircularWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1", f = "CircularWavyProgressModifiers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Continuation<? super IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1> continuation) {
        super(2, continuation);
        this.this$0 = indeterminateCircularWavyProgressNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1 indeterminateCircularWavyProgressNode$startIndeterminateAnimations$1 = new IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1(this.this$0, continuation);
        indeterminateCircularWavyProgressNode$startIndeterminateAnimations$1.L$0 = obj;
        return indeterminateCircularWavyProgressNode$startIndeterminateAnimations$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: CircularWavyProgressModifiers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(c = "androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$1", f = "CircularWavyProgressModifiers.kt", i = {}, l = {756}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = indeterminateCircularWavyProgressNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                animatable = this.this$0.globalRotationAnimatable;
                if (animatable == null) {
                    return Unit.INSTANCE;
                }
                Float boxFloat = Boxing.boxFloat(((Number) animatable.getValue()).floatValue() + 1080.0f);
                InfiniteRepeatableSpec<Float> circularIndeterminateGlobalRotationAnimationSpec = ProgressIndicatorKt.getCircularIndeterminateGlobalRotationAnimationSpec();
                final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode = this.this$0;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, boxFloat, circularIndeterminateGlobalRotationAnimationSpec, null, new Function1() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1.AnonymousClass1.invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode.this, (Animatable) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Animatable animatable) {
            CacheDrawModifierNode cacheDrawModifierNode;
            cacheDrawModifierNode = indeterminateCircularWavyProgressNode.cacheDrawNode;
            DrawModifierNodeKt.invalidateDraw(cacheDrawModifierNode);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CircularWavyProgressModifiers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(c = "androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$2", f = "CircularWavyProgressModifiers.kt", i = {}, l = {767}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = indeterminateCircularWavyProgressNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                animatable = this.this$0.additionalRotationAnimatable;
                if (animatable == null) {
                    return Unit.INSTANCE;
                }
                Float boxFloat = Boxing.boxFloat(((Number) animatable.getValue()).floatValue() + 360.0f);
                InfiniteRepeatableSpec<Float> circularIndeterminateRotationAnimationSpec = ProgressIndicatorKt.getCircularIndeterminateRotationAnimationSpec();
                final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode = this.this$0;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, boxFloat, circularIndeterminateRotationAnimationSpec, null, new Function1() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1.AnonymousClass2.invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode.this, (Animatable) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Animatable animatable) {
            CacheDrawModifierNode cacheDrawModifierNode;
            cacheDrawModifierNode = indeterminateCircularWavyProgressNode.cacheDrawNode;
            DrawModifierNodeKt.invalidateDraw(cacheDrawModifierNode);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CircularWavyProgressModifiers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(c = "androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$3", f = "CircularWavyProgressModifiers.kt", i = {}, l = {777}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ IndeterminateCircularWavyProgressNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = indeterminateCircularWavyProgressNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                animatable = this.this$0.progressSweepAnimatable;
                if (animatable == null) {
                    return Unit.INSTANCE;
                }
                Float boxFloat = Boxing.boxFloat(((Number) animatable.getValue()).floatValue() < 0.485f ? 0.87f : 0.1f);
                InfiniteRepeatableSpec<Float> circularIndeterminateProgressAnimationSpec = ProgressIndicatorKt.getCircularIndeterminateProgressAnimationSpec();
                final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode = this.this$0;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, boxFloat, circularIndeterminateProgressAnimationSpec, null, new Function1() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1.AnonymousClass3.invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode.this, (Animatable) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, Animatable animatable) {
            CacheDrawModifierNode cacheDrawModifierNode;
            cacheDrawModifierNode = indeterminateCircularWavyProgressNode.cacheDrawNode;
            DrawModifierNodeKt.invalidateDraw(cacheDrawModifierNode);
            return Unit.INSTANCE;
        }
    }
}
