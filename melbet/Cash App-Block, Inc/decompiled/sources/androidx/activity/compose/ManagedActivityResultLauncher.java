package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry$register$2;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ManagedActivityResultLauncher extends ActivityResultLauncher {
    public final MutableState currentContract;
    public final ActivityResultLauncherHolder launcher;

    public ManagedActivityResultLauncher(ActivityResultLauncherHolder activityResultLauncherHolder, MutableState mutableState) {
        this.launcher = activityResultLauncherHolder;
        this.currentContract = mutableState;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final ActivityResultContract getContract() {
        return (ActivityResultContract) this.currentContract.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void launch(Object obj) {
        ActivityResultRegistry$register$2 activityResultRegistry$register$2 = this.launcher.launcher;
        if (activityResultRegistry$register$2 != null) {
            activityResultRegistry$register$2.launch(obj);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Launcher has not been initialized");
        }
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
