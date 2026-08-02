package com.squareup.cash.card.onboarding.core.instancing;

import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.ZoomLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardDesignLibraryState $state;
    public final /* synthetic */ State $zoomLevel$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1(State state, CardDesignLibraryState cardDesignLibraryState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$zoomLevel$delegate = state;
        this.$state = cardDesignLibraryState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1(this.$zoomLevel$delegate, this.$state, continuation, 0);
            default:
                return new CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1(this.$zoomLevel$delegate, this.$state, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final CardDesignLibraryState cardDesignLibraryState = this.$state;
        State state = this.$zoomLevel$delegate;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8(state, 19)), 1);
                    final int i4 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i5 = i4;
                            CardDesignLibraryState cardDesignLibraryState2 = cardDesignLibraryState;
                            switch (i5) {
                                case 0:
                                    ZoomLevel zoomLevel = (ZoomLevel) obj2;
                                    cardDesignLibraryState2.getClass();
                                    zoomLevel.getClass();
                                    cardDesignLibraryState2.zoomLevel$delegate.setValue(zoomLevel);
                                    break;
                                default:
                                    cardDesignLibraryState2.focusedCardIndex$delegate.setIntValue(((Number) obj2).intValue());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (drop.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop2 = FlowKt.drop(Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8(state, 20)), 1);
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$8$1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i52 = i2;
                            CardDesignLibraryState cardDesignLibraryState2 = cardDesignLibraryState;
                            switch (i52) {
                                case 0:
                                    ZoomLevel zoomLevel = (ZoomLevel) obj2;
                                    cardDesignLibraryState2.getClass();
                                    zoomLevel.getClass();
                                    cardDesignLibraryState2.zoomLevel$delegate.setValue(zoomLevel);
                                    break;
                                default:
                                    cardDesignLibraryState2.focusedCardIndex$delegate.setIntValue(((Number) obj2).intValue());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (drop2.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
