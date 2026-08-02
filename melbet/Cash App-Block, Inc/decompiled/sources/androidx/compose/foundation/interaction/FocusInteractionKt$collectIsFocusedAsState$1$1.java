package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.input.internal.DragAndDropHoverInteraction$Enter;
import androidx.compose.foundation.text.input.internal.DragAndDropHoverInteraction$Exit;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isFocused;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableInteractionSourceImpl $this_collectIsFocusedAsState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusInteractionKt$collectIsFocusedAsState$1$1(MutableInteractionSourceImpl mutableInteractionSourceImpl, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_collectIsFocusedAsState = mutableInteractionSourceImpl;
        this.$isFocused = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.$this_collectIsFocusedAsState, this.$isFocused, continuation, 0);
            case 1:
                return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.$this_collectIsFocusedAsState, this.$isFocused, continuation, 1);
            default:
                return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.$this_collectIsFocusedAsState, this.$isFocused, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FocusInteractionKt$collectIsFocusedAsState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final MutableState mutableState = this.$isFocused;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.$this_collectIsFocusedAsState;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                final ArrayList arrayList = new ArrayList();
                SharedFlowImpl sharedFlowImpl = mutableInteractionSourceImpl.interactions;
                final int i4 = 0;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i5 = i4;
                        MutableState mutableState2 = mutableState;
                        ArrayList arrayList2 = arrayList;
                        switch (i5) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof FocusInteraction$Focus) {
                                    arrayList2.add(interaction);
                                } else if (interaction instanceof FocusInteraction$Unfocus) {
                                    arrayList2.remove(((FocusInteraction$Unfocus) interaction).getFocus());
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof PressInteraction.Press) {
                                    arrayList2.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    arrayList2.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    arrayList2.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                                break;
                            default:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof DragAndDropHoverInteraction$Enter) {
                                    arrayList2.add(interaction3);
                                } else if (interaction3 instanceof DragAndDropHoverInteraction$Exit) {
                                    arrayList2.remove(((DragAndDropHoverInteraction$Exit) interaction3).enter);
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl.collect(flowCollector, this);
                return coroutineSingletons;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                final ArrayList arrayList2 = new ArrayList();
                SharedFlowImpl sharedFlowImpl2 = mutableInteractionSourceImpl.interactions;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i2;
                        MutableState mutableState2 = mutableState;
                        ArrayList arrayList22 = arrayList2;
                        switch (i52) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof FocusInteraction$Focus) {
                                    arrayList22.add(interaction);
                                } else if (interaction instanceof FocusInteraction$Unfocus) {
                                    arrayList22.remove(((FocusInteraction$Unfocus) interaction).getFocus());
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList22.isEmpty()));
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof PressInteraction.Press) {
                                    arrayList22.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    arrayList22.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    arrayList22.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList22.isEmpty()));
                                break;
                            default:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof DragAndDropHoverInteraction$Enter) {
                                    arrayList22.add(interaction3);
                                } else if (interaction3 instanceof DragAndDropHoverInteraction$Exit) {
                                    arrayList22.remove(((DragAndDropHoverInteraction$Exit) interaction3).enter);
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList22.isEmpty()));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl2.collect(flowCollector2, this);
                return coroutineSingletons2;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                final ArrayList arrayList3 = new ArrayList();
                SharedFlowImpl sharedFlowImpl3 = mutableInteractionSourceImpl.interactions;
                final int i7 = 2;
                FlowCollector flowCollector3 = new FlowCollector() { // from class: androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i7;
                        MutableState mutableState2 = mutableState;
                        ArrayList arrayList22 = arrayList3;
                        switch (i52) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof FocusInteraction$Focus) {
                                    arrayList22.add(interaction);
                                } else if (interaction instanceof FocusInteraction$Unfocus) {
                                    arrayList22.remove(((FocusInteraction$Unfocus) interaction).getFocus());
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList22.isEmpty()));
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof PressInteraction.Press) {
                                    arrayList22.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    arrayList22.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    arrayList22.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList22.isEmpty()));
                                break;
                            default:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof DragAndDropHoverInteraction$Enter) {
                                    arrayList22.add(interaction3);
                                } else if (interaction3 instanceof DragAndDropHoverInteraction$Exit) {
                                    arrayList22.remove(((DragAndDropHoverInteraction$Exit) interaction3).enter);
                                }
                                mutableState2.setValue(Boolean.valueOf(!arrayList22.isEmpty()));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl3.collect(flowCollector3, this);
                return coroutineSingletons3;
        }
    }
}
