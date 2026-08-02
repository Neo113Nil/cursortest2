package com.squareup.cash.arcade.components;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class RadioKt$Radio$2$1$1 implements FlowCollector {
    public final /* synthetic */ Function0 $pressHaptic;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RadioKt$Radio$2$1$1(int i, Function0 function0) {
        this.$r8$classId = i;
        this.$pressHaptic = function0;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                if (((Interaction) obj) instanceof PressInteraction.Press) {
                    this.$pressHaptic.invoke();
                }
                break;
            case 1:
                if (((Interaction) obj) instanceof PressInteraction.Press) {
                    this.$pressHaptic.invoke();
                }
                break;
            case 2:
                if (((Interaction) obj) instanceof PressInteraction.Press) {
                    this.$pressHaptic.invoke();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    this.$pressHaptic.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
