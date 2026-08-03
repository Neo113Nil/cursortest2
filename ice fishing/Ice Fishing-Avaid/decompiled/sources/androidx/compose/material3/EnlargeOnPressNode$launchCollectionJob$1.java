package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1", f = "ButtonGroup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class EnlargeOnPressNode$launchCollectionJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EnlargeOnPressNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnlargeOnPressNode$launchCollectionJob$1(EnlargeOnPressNode enlargeOnPressNode, Continuation<? super EnlargeOnPressNode$launchCollectionJob$1> continuation) {
        super(2, continuation);
        this.this$0 = enlargeOnPressNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EnlargeOnPressNode$launchCollectionJob$1 enlargeOnPressNode$launchCollectionJob$1 = new EnlargeOnPressNode$launchCollectionJob$1(this.this$0, continuation);
        enlargeOnPressNode$launchCollectionJob$1.L$0 = obj;
        return enlargeOnPressNode$launchCollectionJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnlargeOnPressNode$launchCollectionJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(this.this$0, new ArrayList(), null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: ButtonGroup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(c = "androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1", f = "ButtonGroup.kt", i = {}, l = {1129}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<PressInteraction.Press> $pressInteractions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EnlargeOnPressNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EnlargeOnPressNode enlargeOnPressNode, List<PressInteraction.Press> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = enlargeOnPressNode;
            this.$pressInteractions = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pressInteractions, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Flow<Interaction> interactions = this.this$0.getInteractionSource().getInteractions();
                final List<PressInteraction.Press> list = this.$pressInteractions;
                this.label = 1;
                if (FlowKt.collectLatest(FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, list), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                    /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ List $pressInteractions$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(c = "androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2", f = "ButtonGroup.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                        /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, List list) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$pressInteractions$inlined = list;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Interaction interaction = (Interaction) obj;
                                        if (interaction instanceof PressInteraction.Press) {
                                            this.$pressInteractions$inlined.add(interaction);
                                        } else if (interaction instanceof PressInteraction.Release) {
                                            this.$pressInteractions$inlined.remove(((PressInteraction.Release) interaction).getPress());
                                        } else if (interaction instanceof PressInteraction.Cancel) {
                                            this.$pressInteractions$inlined.remove(((PressInteraction.Cancel) interaction).getPress());
                                        }
                                        Boolean boxBoolean = Boxing.boxBoolean(!this.$pressInteractions$inlined.isEmpty());
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }), new AnonymousClass2(coroutineScope, this.this$0, null), this) == coroutine_suspended) {
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

        /* compiled from: ButtonGroup.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "pressed", ""}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(c = "androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2", f = "ButtonGroup.kt", i = {}, l = {1133, 1134}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EnlargeOnPressNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CoroutineScope coroutineScope, EnlargeOnPressNode enlargeOnPressNode, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$$this$launch = coroutineScope;
                this.this$0 = enlargeOnPressNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$launch, this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
            
                if (androidx.compose.animation.core.Animatable.animateTo$default(r3, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), r11.this$0.getAnimationSpec(), null, null, r11, 12, null) == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
            
                if (r12 == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object waitUntil;
                Animatable animatable;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        BuildersKt__Builders_commonKt.launch$default(this.$$this$launch, null, null, new C00171(this.this$0, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    final EnlargeOnPressNode enlargeOnPressNode = this.this$0;
                    this.label = 1;
                    waitUntil = ButtonGroupKt.waitUntil(new Function0() { // from class: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean invokeSuspend$lambda$0;
                            invokeSuspend$lambda$0 = EnlargeOnPressNode$launchCollectionJob$1.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(EnlargeOnPressNode.this);
                            return Boolean.valueOf(invokeSuspend$lambda$0);
                        }
                    }, this);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    animatable = this.this$0.pressedAnimatable;
                    this.label = 2;
                }
            }

            /* compiled from: ButtonGroup.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
            @DebugMetadata(c = "androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$1", f = "ButtonGroup.kt", i = {}, l = {1131}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: androidx.compose.material3.EnlargeOnPressNode$launchCollectionJob$1$1$2$1, reason: invalid class name and collision with other inner class name */
            static final class C00171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ EnlargeOnPressNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00171(EnlargeOnPressNode enlargeOnPressNode, Continuation<? super C00171> continuation) {
                    super(2, continuation);
                    this.this$0 = enlargeOnPressNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00171(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Animatable animatable;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        animatable = this.this$0.pressedAnimatable;
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, Boxing.boxFloat(1.0f), this.this$0.getAnimationSpec(), null, null, this, 12, null) == coroutine_suspended) {
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
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(EnlargeOnPressNode enlargeOnPressNode) {
                Animatable animatable;
                animatable = enlargeOnPressNode.pressedAnimatable;
                return ((Number) animatable.getValue()).floatValue() > 0.75f;
            }
        }
    }
}
