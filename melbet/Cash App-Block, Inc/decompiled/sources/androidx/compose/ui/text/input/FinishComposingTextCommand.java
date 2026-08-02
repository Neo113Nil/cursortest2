package androidx.compose.ui.text.input;

import androidx.media3.common.util.LongArrayQueue;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class FinishComposingTextCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        longArrayQueue.size = -1;
        longArrayQueue.wrapAroundMask = -1;
    }

    public final boolean equals(Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public final int hashCode() {
        return Reflection.factory.getOrCreateKotlinClass(FinishComposingTextCommand.class).hashCode();
    }

    public final String toString() {
        return "FinishComposingTextCommand()";
    }
}
