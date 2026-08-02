package androidx.compose.material;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes3.dex */
public final class SnackbarHostState {
    public final ParcelableSnapshotMutableState currentSnackbarData$delegate;

    public SnackbarHostState() {
        MutexKt.Mutex$default();
        this.currentSnackbarData$delegate = Updater.mutableStateOf$default(null);
    }
}
