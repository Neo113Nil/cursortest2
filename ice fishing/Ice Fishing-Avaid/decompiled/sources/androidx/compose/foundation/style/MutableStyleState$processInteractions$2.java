package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: StyleState.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class MutableStyleState$processInteractions$2<T> implements FlowCollector {
    final /* synthetic */ InteractionSet<FocusInteraction.Focus> $focusedInteractions;
    final /* synthetic */ InteractionSet<HoverInteraction.Enter> $hoveredInteractions;
    final /* synthetic */ InteractionSet<PressInteraction.Press> $pressedInteractions;
    final /* synthetic */ MutableStyleState this$0;

    MutableStyleState$processInteractions$2(InteractionSet<PressInteraction.Press> interactionSet, MutableStyleState mutableStyleState, InteractionSet<HoverInteraction.Enter> interactionSet2, InteractionSet<FocusInteraction.Focus> interactionSet3) {
        this.$pressedInteractions = interactionSet;
        this.this$0 = mutableStyleState;
        this.$hoveredInteractions = interactionSet2;
        this.$focusedInteractions = interactionSet3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
        MutableStyleState$processInteractions$2$emit$1 mutableStyleState$processInteractions$2$emit$1;
        int i;
        MutableStyleState mutableStyleState;
        Interaction interaction2;
        Iterator<Map.Entry<StyleStateKey<?>, Object>> it;
        if (continuation instanceof MutableStyleState$processInteractions$2$emit$1) {
            mutableStyleState$processInteractions$2$emit$1 = (MutableStyleState$processInteractions$2$emit$1) continuation;
            if ((mutableStyleState$processInteractions$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                mutableStyleState$processInteractions$2$emit$1.label -= Integer.MIN_VALUE;
                Object obj = mutableStyleState$processInteractions$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mutableStyleState$processInteractions$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (interaction instanceof PressInteraction.Press) {
                        this.$pressedInteractions.add(interaction);
                        this.this$0.setPressed(true);
                    } else if (interaction instanceof PressInteraction.Release) {
                        this.$pressedInteractions.remove(((PressInteraction.Release) interaction).getPress());
                        this.this$0.setPressed(this.$pressedInteractions.isNotEmpty());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        this.$pressedInteractions.remove(((PressInteraction.Cancel) interaction).getPress());
                        this.this$0.setPressed(this.$pressedInteractions.isNotEmpty());
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        this.$hoveredInteractions.add(interaction);
                        this.this$0.setHovered(true);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        this.$hoveredInteractions.remove(((HoverInteraction.Exit) interaction).getEnter());
                        this.this$0.setHovered(this.$hoveredInteractions.isNotEmpty());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        this.$focusedInteractions.add(interaction);
                        this.this$0.setFocused(true);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        this.$focusedInteractions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                        this.this$0.setFocused(this.$focusedInteractions.isNotEmpty());
                    } else {
                        SnapshotStateMap<StyleStateKey<?>, Object> customStates$foundation = this.this$0.getCustomStates$foundation();
                        mutableStyleState = this.this$0;
                        Iterator<Map.Entry<StyleStateKey<?>, Object>> it2 = customStates$foundation.entrySet().iterator();
                        interaction2 = interaction;
                        it = it2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) mutableStyleState$processInteractions$2$emit$1.L$2;
                mutableStyleState = (MutableStyleState) mutableStyleState$processInteractions$2$emit$1.L$1;
                Interaction interaction3 = (Interaction) mutableStyleState$processInteractions$2$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
                interaction2 = interaction3;
                while (it.hasNext()) {
                    StyleStateKey<?> key = it.next().getKey();
                    mutableStyleState$processInteractions$2$emit$1.L$0 = interaction2;
                    mutableStyleState$processInteractions$2$emit$1.L$1 = mutableStyleState;
                    mutableStyleState$processInteractions$2$emit$1.L$2 = it;
                    mutableStyleState$processInteractions$2$emit$1.label = 1;
                    if (key.processInteractionAccess$foundation(interaction2, mutableStyleState, mutableStyleState$processInteractions$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        mutableStyleState$processInteractions$2$emit$1 = new MutableStyleState$processInteractions$2$emit$1(this, continuation);
        Object obj2 = mutableStyleState$processInteractions$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mutableStyleState$processInteractions$2$emit$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((Interaction) obj, (Continuation<? super Unit>) continuation);
    }
}
