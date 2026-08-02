package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.EditCommand;
import androidx.media3.common.util.LongArrayQueue;

/* loaded from: classes3.dex */
public final class HandwritingGesture_androidKt$compoundEditCommand$1 implements EditCommand {
    public final /* synthetic */ EditCommand[] $editCommands;

    public HandwritingGesture_androidKt$compoundEditCommand$1(EditCommand[] editCommandArr) {
        this.$editCommands = editCommandArr;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        for (EditCommand editCommand : this.$editCommands) {
            editCommand.applyTo(longArrayQueue);
        }
    }
}
