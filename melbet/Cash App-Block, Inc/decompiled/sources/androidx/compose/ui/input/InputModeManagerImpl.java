package androidx.compose.ui.input;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes.dex */
public final class InputModeManagerImpl {
    public final ParcelableSnapshotMutableState inputMode$delegate;

    public InputModeManagerImpl(int i) {
        this.inputMode$delegate = Updater.mutableStateOf$default(new InputMode(i));
    }
}
