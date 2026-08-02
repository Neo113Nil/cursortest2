package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Object $interactionSource;
    public final /* synthetic */ Object $pressedInteraction;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object $scope;
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(Continuation continuation, long j, AndroidClock androidClock, CoroutineContext coroutineContext) {
        super(3, continuation);
        this.J$0 = j;
        this.$pressedInteraction = androidClock;
        this.$interactionSource = coroutineContext;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$interactionSource;
        Object obj5 = this.$pressedInteraction;
        switch (i) {
            case 0:
                long j = ((Offset) obj2).packedValue;
                TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1((CoroutineScope) this.$scope, (MutableState) obj5, (MutableInteractionSourceImpl) obj4, (Continuation) obj3);
                textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.L$0 = (PressGestureScope) obj;
                textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.J$0 = j;
                return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(Unit.INSTANCE);
            default:
                TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$12 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1((Continuation) obj3, this.J$0, (AndroidClock) obj5, (CoroutineContext) obj4);
                textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$12.L$0 = (FlowCollector) obj;
                textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$12.$scope = obj2;
                return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryAwaitRelease;
        Flow safeFlow;
        int i = this.$r8$classId;
        Object obj2 = this.$interactionSource;
        Object obj3 = this.$pressedInteraction;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.$scope;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    JobKt.launch$default(coroutineScope, null, null, new RepeatOnIntervalTaskRunner$repeatOn$2((MutableState) obj3, this.J$0, (MutableInteractionSourceImpl) obj2, (Continuation) null, 5), 3);
                    this.label = 1;
                    tryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
                    if (tryAwaitRelease == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    tryAwaitRelease = obj;
                }
                JobKt.launch$default(coroutineScope, null, null, new RoomDatabase$performClear$1.AnonymousClass1((MutableState) obj3, ((Boolean) tryAwaitRelease).booleanValue(), (MutableInteractionSourceImpl) obj2, (Continuation) null, 2), 3);
                break;
            default:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object obj4 = this.$scope;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NetworkStatus networkStatus = (NetworkStatus) obj4;
                    Continuation continuation = null;
                    if (networkStatus instanceof NetworkStatus.Unavailable) {
                        long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(this.J$0) - networkStatus.ageMillis((AndroidClock) obj3);
                        safeFlow = FlowKt.flowOn(new SafeFlow(new ToastKt$Toast$8$1(m4167getInWholeMillisecondsimpl < 0 ? 0L : m4167getInWholeMillisecondsimpl, networkStatus, (Continuation) null, 7)), (CoroutineContext) obj2);
                    } else {
                        safeFlow = new SafeFlow(new CheckStatusPresenter.AnonymousClass1(networkStatus, continuation, 8));
                    }
                    this.L$0 = null;
                    this.$scope = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, safeFlow, this) == coroutineSingletons2) {
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
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(CoroutineScope coroutineScope, MutableState mutableState, MutableInteractionSourceImpl mutableInteractionSourceImpl, Continuation continuation) {
        super(3, continuation);
        this.$scope = coroutineScope;
        this.$pressedInteraction = mutableState;
        this.$interactionSource = mutableInteractionSourceImpl;
    }
}
