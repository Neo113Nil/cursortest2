package androidx.navigation.compose;

import androidx.biometric.BiometricPrompt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    public final String id;
    public BiometricPrompt saveableStateHolderRef;

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        String str = (String) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            savedStateHandle.set(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.id = str;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        BiometricPrompt biometricPrompt = this.saveableStateHolderRef;
        if (biometricPrompt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
            throw null;
        }
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) ((WeakReference) biometricPrompt.mClientFragmentManager).get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        BiometricPrompt biometricPrompt2 = this.saveableStateHolderRef;
        if (biometricPrompt2 != null) {
            ((WeakReference) biometricPrompt2.mClientFragmentManager).clear();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
            throw null;
        }
    }
}
