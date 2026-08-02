package app.cash.broadway.presenter.molecule.viewmodels;

import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class UiCallbackModel {
    public final Object model;
    public final Function1 onEvent;

    public UiCallbackModel(Function1 function1, Object obj) {
        function1.getClass();
        this.model = obj;
        this.onEvent = function1;
    }

    public final void Show(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1432088032);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(this) : gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object obj = this.model;
            if (obj != null) {
                gapComposer.startReplaceGroup(1424516662);
                composableLambdaImpl.invoke(obj, this.onEvent, gapComposer, Integer.valueOf((i2 << 6) & 896));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1424558946);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(this, composableLambdaImpl, i, 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiCallbackModel)) {
            return false;
        }
        UiCallbackModel uiCallbackModel = (UiCallbackModel) obj;
        return Intrinsics.areEqual(this.model, uiCallbackModel.model) && Intrinsics.areEqual(this.onEvent, uiCallbackModel.onEvent);
    }

    public final Object getModel() {
        return this.model;
    }

    public final Function1 getOnEvent() {
        return this.onEvent;
    }

    public final int hashCode() {
        Object obj = this.model;
        return this.onEvent.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "UiCallbackModel(model=" + this.model + ", onEvent=" + this.onEvent + ")";
    }
}
