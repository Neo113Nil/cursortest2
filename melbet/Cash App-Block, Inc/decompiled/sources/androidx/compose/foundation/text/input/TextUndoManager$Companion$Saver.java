package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.saveable.Saver;

/* loaded from: classes.dex */
public abstract class TextUndoManager$Companion$Saver implements Saver {
    public static final TextFieldState.Saver undoManagerSaver = new TextFieldState.Saver(1);
}
