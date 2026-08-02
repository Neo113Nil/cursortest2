package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction$Cancel;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.DragInteraction$Stop;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SliderDefaults$Thumb$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableInteractionSourceImpl $interactionSource;
    public final /* synthetic */ SnapshotStateList $interactions;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SliderDefaults$Thumb$1$1(MutableInteractionSourceImpl mutableInteractionSourceImpl, SnapshotStateList snapshotStateList, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$interactionSource = mutableInteractionSourceImpl;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, continuation, 0);
            case 1:
                return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, continuation, 1);
            case 2:
                return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, continuation, 2);
            default:
                return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SliderDefaults$Thumb$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final SnapshotStateList snapshotStateList = this.$interactions;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.$interactionSource;
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
                SharedFlowImpl sharedFlowImpl = mutableInteractionSourceImpl.interactions;
                final int i4 = 0;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material3.SliderDefaults$Thumb$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i5 = i4;
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        switch (i5) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction).press);
                                } else if (interaction instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction).press);
                                } else if (interaction instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction).start);
                                } else if (interaction instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction).start);
                                }
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction2).enter);
                                } else if (interaction2 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction2).focus);
                                } else if (interaction2 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                break;
                            case 2:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction3).press);
                                } else if (interaction3 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction3).press);
                                } else if (interaction3 instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction3).start);
                                } else if (interaction3 instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction3).start);
                                }
                                break;
                            default:
                                Interaction interaction4 = (Interaction) obj2;
                                if (interaction4 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction4).enter);
                                } else if (interaction4 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction4).focus);
                                } else if (interaction4 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction4).press);
                                } else if (interaction4 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction4).press);
                                }
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
                SharedFlowImpl sharedFlowImpl2 = mutableInteractionSourceImpl.interactions;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: androidx.compose.material3.SliderDefaults$Thumb$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i2;
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        switch (i52) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction).press);
                                } else if (interaction instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction).press);
                                } else if (interaction instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction).start);
                                } else if (interaction instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction).start);
                                }
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction2).enter);
                                } else if (interaction2 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction2).focus);
                                } else if (interaction2 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                break;
                            case 2:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction3).press);
                                } else if (interaction3 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction3).press);
                                } else if (interaction3 instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction3).start);
                                } else if (interaction3 instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction3).start);
                                }
                                break;
                            default:
                                Interaction interaction4 = (Interaction) obj2;
                                if (interaction4 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction4).enter);
                                } else if (interaction4 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction4).focus);
                                } else if (interaction4 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction4).press);
                                } else if (interaction4 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction4).press);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl2.collect(flowCollector2, this);
                return coroutineSingletons2;
            case 2:
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
                SharedFlowImpl sharedFlowImpl3 = mutableInteractionSourceImpl.interactions;
                final int i7 = 2;
                FlowCollector flowCollector3 = new FlowCollector() { // from class: androidx.compose.material3.SliderDefaults$Thumb$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i7;
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        switch (i52) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction).press);
                                } else if (interaction instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction).press);
                                } else if (interaction instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction).start);
                                } else if (interaction instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction).start);
                                }
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction2).enter);
                                } else if (interaction2 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction2).focus);
                                } else if (interaction2 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                break;
                            case 2:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction3).press);
                                } else if (interaction3 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction3).press);
                                } else if (interaction3 instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction3).start);
                                } else if (interaction3 instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction3).start);
                                }
                                break;
                            default:
                                Interaction interaction4 = (Interaction) obj2;
                                if (interaction4 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction4).enter);
                                } else if (interaction4 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction4).focus);
                                } else if (interaction4 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction4).press);
                                } else if (interaction4 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction4).press);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl3.collect(flowCollector3, this);
                return coroutineSingletons3;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl4 = mutableInteractionSourceImpl.interactions;
                final int i9 = 3;
                FlowCollector flowCollector4 = new FlowCollector() { // from class: androidx.compose.material3.SliderDefaults$Thumb$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i9;
                        SnapshotStateList snapshotStateList2 = snapshotStateList;
                        switch (i52) {
                            case 0:
                                Interaction interaction = (Interaction) obj2;
                                if (interaction instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction).press);
                                } else if (interaction instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction).press);
                                } else if (interaction instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction);
                                } else if (interaction instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction).start);
                                } else if (interaction instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction).start);
                                }
                                break;
                            case 1:
                                Interaction interaction2 = (Interaction) obj2;
                                if (interaction2 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction2).enter);
                                } else if (interaction2 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction2).focus);
                                } else if (interaction2 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction2);
                                } else if (interaction2 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction2).press);
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction2).press);
                                }
                                break;
                            case 2:
                                Interaction interaction3 = (Interaction) obj2;
                                if (interaction3 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction3).press);
                                } else if (interaction3 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction3).press);
                                } else if (interaction3 instanceof DragInteraction$Start) {
                                    snapshotStateList2.add(interaction3);
                                } else if (interaction3 instanceof DragInteraction$Stop) {
                                    snapshotStateList2.remove(((DragInteraction$Stop) interaction3).start);
                                } else if (interaction3 instanceof DragInteraction$Cancel) {
                                    snapshotStateList2.remove(((DragInteraction$Cancel) interaction3).start);
                                }
                                break;
                            default:
                                Interaction interaction4 = (Interaction) obj2;
                                if (interaction4 instanceof HoverInteraction$Enter) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof HoverInteraction$Exit) {
                                    snapshotStateList2.remove(((HoverInteraction$Exit) interaction4).enter);
                                } else if (interaction4 instanceof FocusInteraction$Focus) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof FocusInteraction$Unfocus) {
                                    snapshotStateList2.remove(((FocusInteraction$Unfocus) interaction4).focus);
                                } else if (interaction4 instanceof PressInteraction.Press) {
                                    snapshotStateList2.add(interaction4);
                                } else if (interaction4 instanceof PressInteraction.Release) {
                                    snapshotStateList2.remove(((PressInteraction.Release) interaction4).press);
                                } else if (interaction4 instanceof PressInteraction.Cancel) {
                                    snapshotStateList2.remove(((PressInteraction.Cancel) interaction4).press);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl4.collect(flowCollector4, this);
                return coroutineSingletons4;
        }
    }
}
