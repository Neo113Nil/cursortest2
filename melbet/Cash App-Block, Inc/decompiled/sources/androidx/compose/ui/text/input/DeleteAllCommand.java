package androidx.compose.ui.text.input;

import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class DeleteAllCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        longArrayQueue.replace$ui_text(0, ((TimedValueQueue) longArrayQueue.data).getLength(), "");
    }

    public final boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public final int hashCode() {
        return Reflection.factory.getOrCreateKotlinClass(DeleteAllCommand.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
