package com.squareup.cash.graphics.views.effect;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$complete$2;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SwampGLEffectKt$SwampGLEffect$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onFirstFrame;
    public final /* synthetic */ State $performance$delegate;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwampGLEffectKt$SwampGLEffect$6$1(State state, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$performance$delegate = state;
        this.$onFirstFrame = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onFirstFrame;
        State state = this.$performance$delegate;
        switch (i) {
            case 0:
                return new SwampGLEffectKt$SwampGLEffect$6$1(function1, state, continuation);
            default:
                return new SwampGLEffectKt$SwampGLEffect$6$1(state, function1, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SwampGLEffectKt$SwampGLEffect$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onFirstFrame;
        State state = this.$performance$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8(state, 28)), 13);
                    this.label = 1;
                    obj = FlowKt.first(swipeableState$special$$inlined$filter$1, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                function1.invoke(new Long(((Number) obj).longValue()));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1(state, 6)));
                    CardSchemePresenter$complete$2 cardSchemePresenter$complete$2 = new CardSchemePresenter$complete$2(function1, null, 4);
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, cardSchemePresenter$complete$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwampGLEffectKt$SwampGLEffect$6$1(Function1 function1, State state, Continuation continuation) {
        super(2, continuation);
        this.$onFirstFrame = function1;
        this.$performance$delegate = state;
    }
}
